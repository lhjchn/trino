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
package io.trino.tests.product.iceberg;

import io.trino.testing.containers.environment.ProductTest;
import io.trino.testing.containers.environment.RequiresEnvironment;
import io.trino.testing.containers.environment.Row;
import io.trino.tests.product.TestGroup;
import io.trino.tests.product.hive.HiveIcebergRedirectionsEnvironment;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static io.trino.testing.containers.environment.QueryResultAssert.assertThat;
import static io.trino.testing.containers.environment.Row.row;

/**
 * Tests interactions between Iceberg and Hive connectors, when one tries to read a view created by the other.
 * <p>
 * Ported from the Tempto-based TestIcebergHiveViewsCompatibility.
 */
@ProductTest
@RequiresEnvironment(HiveIcebergRedirectionsEnvironment.class)
@TestGroup.HiveIcebergRedirections
class TestIcebergHiveViewsCompatibility
{
    @Test
    void testIcebergHiveViewsCompatibility(HiveIcebergRedirectionsEnvironment env)
            throws Exception
    {
        try {
            // ensure clean env
            cleanup(env);

            List<Row> hivePreexistingTables = env.executeTrino("SHOW TABLES FROM hive.default").getRows();
            List<Row> icebergPreexistingTables = env.executeTrino("SHOW TABLES FROM iceberg.default").getRows();

            env.executeTrinoUpdate("CREATE TABLE hive.default.hive_table AS SELECT 1 bee");
            env.executeTrinoUpdate("CREATE TABLE iceberg.default.iceberg_table AS SELECT 2 snow");

            // Create views using session context for USE statements
            // Note: With bi-directional redirections enabled (hive.iceberg-catalog-name=iceberg and
            // iceberg.hive-catalog-name=hive), unqualified table references work across catalog boundaries
            // because the catalogs redirect to each other automatically.
            env.executeTrinoInSession(session -> {
                session.executeUpdate("USE hive.default"); // for sake of unqualified table references
                session.executeUpdate("CREATE VIEW hive.default.hive_view_qualified_hive AS SELECT * FROM hive.default.hive_table");
                session.executeUpdate("CREATE VIEW hive.default.hive_view_unqualified_hive AS SELECT * FROM hive_table");
                session.executeUpdate("CREATE VIEW hive.default.hive_view_qualified_iceberg AS SELECT * FROM iceberg.default.iceberg_table");
                // With redirections enabled, this now succeeds (iceberg_table is redirected to iceberg catalog)
                session.executeUpdate("CREATE VIEW hive.default.hive_view_unqualified_iceberg AS SELECT * FROM iceberg_table");
            });

            env.executeTrinoInSession(session -> {
                session.executeUpdate("USE iceberg.default"); // for sake of unqualified table references
                session.executeUpdate("CREATE VIEW iceberg.default.iceberg_view_qualified_hive AS SELECT * FROM hive.default.hive_table");
                // With redirections enabled, this now succeeds (hive_table is redirected to hive catalog)
                session.executeUpdate("CREATE VIEW iceberg.default.iceberg_view_unqualified_hive AS SELECT * FROM hive_table");
                session.executeUpdate("CREATE VIEW iceberg.default.iceberg_view_qualified_iceberg AS SELECT * FROM iceberg.default.iceberg_table");
                session.executeUpdate("CREATE VIEW iceberg.default.iceberg_view_unqualified_iceberg AS SELECT * FROM iceberg_table");
            });

            // both hive and iceberg catalogs should list all the tables and views.
            // With bi-directional redirections, both unqualified views are now created successfully
            List<Row> newlyCreated = List.of(
                    row("hive_table"),
                    row("iceberg_table"),
                    row("hive_view_qualified_hive"),
                    row("hive_view_unqualified_hive"),
                    row("hive_view_qualified_iceberg"),
                    row("hive_view_unqualified_iceberg"),
                    row("iceberg_view_qualified_hive"),
                    row("iceberg_view_unqualified_hive"),
                    row("iceberg_view_qualified_iceberg"),
                    row("iceberg_view_unqualified_iceberg"));

            List<Row> expectedHiveTables = new ArrayList<>(hivePreexistingTables);
            expectedHiveTables.addAll(newlyCreated);
            assertThat(env.executeTrino("SHOW TABLES FROM hive.default"))
                    .containsOnly(expectedHiveTables);

            List<Row> expectedIcebergTables = new ArrayList<>(icebergPreexistingTables);
            expectedIcebergTables.addAll(newlyCreated);
            assertThat(env.executeTrino("SHOW TABLES FROM iceberg.default"))
                    .containsOnly(expectedIcebergTables);

            // try to access all views via hive catalog
            assertThat(env.executeTrino("SELECT * FROM hive.default.hive_view_qualified_hive")).containsOnly(row(1));
            assertThat(env.executeTrino("SELECT * FROM hive.default.hive_view_unqualified_hive")).containsOnly(row(1));
            assertThat(env.executeTrino("SELECT * FROM hive.default.hive_view_qualified_iceberg")).containsOnly(row(2));
            assertThat(env.executeTrino("SELECT * FROM hive.default.hive_view_unqualified_iceberg")).containsOnly(row(2));
            assertThat(env.executeTrino("SELECT * FROM hive.default.iceberg_view_qualified_hive")).containsOnly(row(1));
            assertThat(env.executeTrino("SELECT * FROM hive.default.iceberg_view_unqualified_hive")).containsOnly(row(1));
            assertThat(env.executeTrino("SELECT * FROM hive.default.iceberg_view_qualified_iceberg")).containsOnly(row(2));
            assertThat(env.executeTrino("SELECT * FROM hive.default.iceberg_view_unqualified_iceberg")).containsOnly(row(2));

            // try to access all views via iceberg catalog
            assertThat(env.executeTrino("SELECT * FROM iceberg.default.hive_view_qualified_hive")).containsOnly(row(1));
            assertThat(env.executeTrino("SELECT * FROM iceberg.default.hive_view_unqualified_hive")).containsOnly(row(1));
            assertThat(env.executeTrino("SELECT * FROM iceberg.default.hive_view_qualified_iceberg")).containsOnly(row(2));
            assertThat(env.executeTrino("SELECT * FROM iceberg.default.hive_view_unqualified_iceberg")).containsOnly(row(2));
            assertThat(env.executeTrino("SELECT * FROM iceberg.default.iceberg_view_qualified_hive")).containsOnly(row(1));
            assertThat(env.executeTrino("SELECT * FROM iceberg.default.iceberg_view_unqualified_hive")).containsOnly(row(1));
            assertThat(env.executeTrino("SELECT * FROM iceberg.default.iceberg_view_qualified_iceberg")).containsOnly(row(2));
            assertThat(env.executeTrino("SELECT * FROM iceberg.default.iceberg_view_unqualified_iceberg")).containsOnly(row(2));
        }
        finally {
            cleanup(env);
        }
    }

    private void cleanup(HiveIcebergRedirectionsEnvironment env)
    {
        // Drop views first (they depend on tables)
        env.executeTrinoUpdate("DROP VIEW IF EXISTS hive.default.hive_view_qualified_hive");
        env.executeTrinoUpdate("DROP VIEW IF EXISTS hive.default.hive_view_unqualified_hive");
        env.executeTrinoUpdate("DROP VIEW IF EXISTS hive.default.hive_view_qualified_iceberg");
        env.executeTrinoUpdate("DROP VIEW IF EXISTS hive.default.hive_view_unqualified_iceberg");

        env.executeTrinoUpdate("DROP VIEW IF EXISTS iceberg.default.iceberg_view_qualified_hive");
        env.executeTrinoUpdate("DROP VIEW IF EXISTS iceberg.default.iceberg_view_unqualified_hive");
        env.executeTrinoUpdate("DROP VIEW IF EXISTS iceberg.default.iceberg_view_qualified_iceberg");
        env.executeTrinoUpdate("DROP VIEW IF EXISTS iceberg.default.iceberg_view_unqualified_iceberg");

        // Drop tables
        env.executeTrinoUpdate("DROP TABLE IF EXISTS hive.default.hive_table");
        env.executeTrinoUpdate("DROP TABLE IF EXISTS iceberg.default.iceberg_table");
    }
}
