/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.trino.tests.product.hive;

import io.trino.testing.containers.environment.ProductTest;
import io.trino.testing.containers.environment.QueryResultAssert;
import io.trino.testing.containers.environment.RequiresEnvironment;
import io.trino.tests.product.TestGroup;
import org.junit.jupiter.api.Test;

import java.util.function.Consumer;

import static io.trino.testing.containers.environment.QueryResultAssert.assertThat;
import static io.trino.testing.containers.environment.Row.row;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

/**
 * JUnit 5 port of TestHiveViewCompatibility.
 * <p>
 * Tests Hive view compatibility between Trino and Hive.
 * <p>
 * Note: This test uses HiveSparkEnvironment which provides Hive for compatibility testing.
 * The original Tempto test used onCompatibilityTestServer() which could be either Hive or Spark.
 * In this port, we use Hive as the compatibility test server.
 */
@ProductTest
@RequiresEnvironment(HiveSparkEnvironment.class)
@TestGroup.HiveSpark
@TestGroup.HiveViewCompatibility
class TestHiveViewCompatibility
{
    @Test
    void testSelectOnView(HiveSparkEnvironment env)
    {
        env.executeHiveUpdate("DROP VIEW IF EXISTS hive_test_view");
        env.executeHiveUpdate("CREATE VIEW hive_test_view AS SELECT * FROM nation");

        assertViewQuery(env, "SELECT * FROM hive_test_view", queryAssert -> queryAssert.hasRowsCount(25));
        assertViewQuery(
                env,
                "SELECT n_nationkey, n_name, n_regionkey, n_comment FROM hive_test_view WHERE n_nationkey < 3",
                queryAssert -> queryAssert.containsOnly(
                        row(0, "ALGERIA", 0, " haggle. carefully final deposits detect slyly agai"),
                        row(1, "ARGENTINA", 1, "al foxes promise slyly according to the regular accounts. bold requests alon"),
                        row(2, "BRAZIL", 1, "y alongside of the pending deposits. carefully special packages are about the ironic forges. slyly special ")));
    }

    @Test
    void testSelectOnViewFromDifferentSchema(HiveSparkEnvironment env)
    {
        env.executeHiveUpdate("DROP DATABASE IF EXISTS test_schema CASCADE");
        env.executeHiveUpdate("CREATE DATABASE test_schema");
        env.executeHiveUpdate(
                "CREATE VIEW test_schema.hive_test_view_1 AS SELECT * FROM " +
                        // no schema is specified by purpose
                        "nation");

        assertViewQuery(env, "SELECT * FROM test_schema.hive_test_view_1", queryAssert -> queryAssert.hasRowsCount(25));
    }

    @Test
    void testExistingView(HiveSparkEnvironment env)
    {
        env.executeHiveUpdate("DROP VIEW IF EXISTS hive_duplicate_view");
        env.executeHiveUpdate("CREATE VIEW hive_duplicate_view AS SELECT * FROM nation");

        assertThatThrownBy(() -> env.executeTrinoUpdate("CREATE VIEW hive_duplicate_view AS SELECT * FROM nation"))
                .hasMessageContaining("View already exists");
    }

    @Test
    void testCommentOnViewColumn(HiveSparkEnvironment env)
    {
        env.executeTrinoUpdate("DROP VIEW IF EXISTS hive_test_view_comment_column");
        env.executeTrinoUpdate("CREATE VIEW hive_test_view_comment_column AS SELECT * FROM nation");
        env.executeHiveUpdate("DROP VIEW IF EXISTS hive_test_view_comment_column_compatibility");
        env.executeHiveUpdate("CREATE VIEW hive_test_view_comment_column_compatibility AS SELECT * FROM nation");

        assertViewQuery(env, "SELECT * FROM hive_test_view_comment_column", queryAssert -> queryAssert.hasRowsCount(25));
        assertThat(env.executeTrino("SELECT * FROM hive_test_view_comment_column_compatibility")).hasRowsCount(25);

        // Verify that the views are still readable after adding a comment on one of their columns
        env.executeTrinoUpdate("COMMENT ON COLUMN hive_test_view_comment_column.n_nationkey IS 'ID of the nation'");
        assertViewQuery(env, "SELECT * FROM hive_test_view_comment_column", queryAssert -> queryAssert.hasRowsCount(25));

        env.executeTrinoUpdate("COMMENT ON COLUMN hive_test_view_comment_column_compatibility.n_nationkey IS 'ID of the nation'");
        assertViewQuery(env, "SELECT * FROM hive_test_view_comment_column_compatibility", queryAssert -> queryAssert.hasRowsCount(25));
        assertThat(env.executeTrino("SELECT * FROM hive_test_view_comment_column_compatibility")).hasRowsCount(25);
    }

    /**
     * Assert that a query on a view returns the same result when executed via Trino and via Hive.
     */
    private static void assertViewQuery(HiveSparkEnvironment env, String query, Consumer<QueryResultAssert> assertion)
    {
        // Ensure view compatibility by comparing the results
        assertion.accept(assertThat(env.executeTrino(query)));
        assertion.accept(assertThat(env.executeHive(query)));
    }
}
