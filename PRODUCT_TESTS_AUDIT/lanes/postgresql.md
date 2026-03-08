# Lane Audit: Postgresql

## Lane Summary

- Audit status: `completed`
- Section start commit: `Add PostgreSQL environments`
- Section end commit: `Remove legacy SuitePostgresql`
- Introduced JUnit suites: `SuitePostgresql`.
- Extended existing suites: none.
- Retired legacy suites: `SuitePostgresql`.
- Environment classes introduced: `PostgresqlEnvironment`.
- Method status counts: verified `0`, intentional difference `8`, needs follow-up `0`.

## Lane-Level Open Questions / Intentional Differences

- Lane-wide approved difference set: none beyond the framework baseline documented in the reviewer guide.
- Needs-follow-up methods: none currently identified in this source/history pass.

## Ported Test Classes

### `TestPostgresqlSqlTests`

- Owning migration commit: `Migrate TestPostgresqlSqlTests to JUnit`
- Current class added in same migration commit:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/postgresql/TestPostgresqlSqlTests.java`
- Legacy class removed in same migration commit:
    - None. This commit added new JUnit-side verification coverage rather than removing a legacy class.
- Class-level environment requirement: `PostgresqlBasicEnvironment`.
- Class-level tags: `Postgresql`, `ProfileSpecificTests`.
- Method inventory complete: Yes. Current inherited methods: `8`. Legacy source came from `8` deleted SQL files and `6`
  supporting dataset files in the same migration commit.
- Legacy helper/resource dependencies accounted for: Legacy helper/resource dependencies captured from deleted resource
  files.
- Intentional differences summary: `JUnit/AssertJ/Testcontainers framework replacement`
- Method statuses present: `intentional difference`.

#### Methods

##### `testSelect`

- Legacy source method:
  `testing/trino-product-tests/src/main/resources/sql-tests/testcases/connectors/postgresql/select.sql`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/postgresql/BasePostgresqlSqlTests.java` ->
  `BasePostgresqlSqlTests.testSelect`
- Mapping type: `sql-file consolidation`
- Environment parity: Current class requires `PostgresqlBasicEnvironment`. Routed by source review into
  `SuitePostgresql` run 1.
- Tag parity: Current tags: `Postgresql`, `ProfileSpecificTests`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: none. Legacy setup came from deleted SQL/dataset resources folded into this
  inherited base method.
- Action parity: Current action verbs: `SELECT`. Legacy action is represented by deleted SQL resource cases.
- Assertion parity: Current assertion helpers: `assertThat`, `containsOnly`. Legacy SQL-file cases were converted into
  inline JUnit assertions.
- Cleanup parity: Current cleanup operations: none. Cleanup is now handled by the environment and inline assertions
  instead of Tempto SQL execution.
- Any observed difference, however small: Legacy SQL/resource case was collapsed into an inherited JUnit method shared
  across PostgreSQL environments.
- Known intentional difference: `JUnit/AssertJ/Testcontainers framework replacement`
- Reviewer note: Covers deleted supporting dataset files `datatype_psql.*`, `real_table_psql.*`, and `workers_psql.*`
  together with the deleted SQL case.
- Audit status: `intentional difference`

##### `testDescribeTable`

- Legacy source method:
  `testing/trino-product-tests/src/main/resources/sql-tests/testcases/connectors/postgresql/describe_table.sql`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/postgresql/BasePostgresqlSqlTests.java` ->
  `BasePostgresqlSqlTests.testDescribeTable`
- Mapping type: `sql-file consolidation`
- Environment parity: Current class requires `PostgresqlBasicEnvironment`. Routed by source review into
  `SuitePostgresql` run 1.
- Tag parity: Current tags: `Postgresql`, `ProfileSpecificTests`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: none. Legacy setup came from deleted SQL/dataset resources folded into this
  inherited base method.
- Action parity: Current action verbs: `DESCRIBE`. Legacy action is represented by deleted SQL resource cases.
- Assertion parity: Current assertion helpers: `assertThat`, `containsOnly`, `row`. Legacy SQL-file cases were converted
  into inline JUnit assertions.
- Cleanup parity: Current cleanup operations: none. Cleanup is now handled by the environment and inline assertions
  instead of Tempto SQL execution.
- Any observed difference, however small: Legacy SQL/resource case was collapsed into an inherited JUnit method shared
  across PostgreSQL environments.
- Known intentional difference: `JUnit/AssertJ/Testcontainers framework replacement`
- Reviewer note: Source/history review only.
- Audit status: `intentional difference`

##### `testDescribeRealTable`

- Legacy source method:
  `testing/trino-product-tests/src/main/resources/sql-tests/testcases/connectors/postgresql/describe_real_table.sql`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/postgresql/BasePostgresqlSqlTests.java` ->
  `BasePostgresqlSqlTests.testDescribeRealTable`
- Mapping type: `sql-file consolidation`
- Environment parity: Current class requires `PostgresqlBasicEnvironment`. Routed by source review into
  `SuitePostgresql` run 1.
- Tag parity: Current tags: `Postgresql`, `ProfileSpecificTests`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: none. Legacy setup came from deleted SQL/dataset resources folded into this
  inherited base method.
- Action parity: Current action verbs: `DESCRIBE`. Legacy action is represented by deleted SQL resource cases.
- Assertion parity: Current assertion helpers: `assertThat`, `containsOnly`, `row`. Legacy SQL-file cases were converted
  into inline JUnit assertions.
- Cleanup parity: Current cleanup operations: none. Cleanup is now handled by the environment and inline assertions
  instead of Tempto SQL execution.
- Any observed difference, however small: Legacy SQL/resource case was collapsed into an inherited JUnit method shared
  across PostgreSQL environments.
- Known intentional difference: `JUnit/AssertJ/Testcontainers framework replacement`
- Reviewer note: Source/history review only.
- Audit status: `intentional difference`

##### `testJoinPostgresqlToPostgresql`

- Legacy source method:
  `testing/trino-product-tests/src/main/resources/sql-tests/testcases/connectors/postgresql/join_postgres_to_postgres.sql`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/postgresql/BasePostgresqlSqlTests.java` ->
  `BasePostgresqlSqlTests.testJoinPostgresqlToPostgresql`
- Mapping type: `sql-file consolidation`
- Environment parity: Current class requires `PostgresqlBasicEnvironment`. Routed by source review into
  `SuitePostgresql` run 1.
- Tag parity: Current tags: `Postgresql`, `ProfileSpecificTests`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: none. Legacy setup came from deleted SQL/dataset resources folded into this
  inherited base method.
- Action parity: Current action verbs: `SELECT`. Legacy action is represented by deleted SQL resource cases.
- Assertion parity: Current assertion helpers: `assertThat`, `containsOnly`, `row`. Legacy SQL-file cases were converted
  into inline JUnit assertions.
- Cleanup parity: Current cleanup operations: none. Cleanup is now handled by the environment and inline assertions
  instead of Tempto SQL execution.
- Any observed difference, however small: Legacy SQL/resource case was collapsed into an inherited JUnit method shared
  across PostgreSQL environments.
- Known intentional difference: `JUnit/AssertJ/Testcontainers framework replacement`
- Reviewer note: Source/history review only.
- Audit status: `intentional difference`

##### `testJoinPostgresqlToTpch`

- Legacy source method:
  `testing/trino-product-tests/src/main/resources/sql-tests/testcases/connectors/postgresql/join_postgres_to_tpch.sql`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/postgresql/BasePostgresqlSqlTests.java` ->
  `BasePostgresqlSqlTests.testJoinPostgresqlToTpch`
- Mapping type: `sql-file consolidation`
- Environment parity: Current class requires `PostgresqlBasicEnvironment`. Routed by source review into
  `SuitePostgresql` run 1.
- Tag parity: Current tags: `Postgresql`, `ProfileSpecificTests`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: none. Legacy setup came from deleted SQL/dataset resources folded into this
  inherited base method.
- Action parity: Current action verbs: `SELECT`. Legacy action is represented by deleted SQL resource cases.
- Assertion parity: Current assertion helpers: `assertThat`, `containsOnly`, `row`. Legacy SQL-file cases were converted
  into inline JUnit assertions.
- Cleanup parity: Current cleanup operations: none. Cleanup is now handled by the environment and inline assertions
  instead of Tempto SQL execution.
- Any observed difference, however small: Legacy SQL/resource case was collapsed into an inherited JUnit method shared
  across PostgreSQL environments.
- Known intentional difference: `JUnit/AssertJ/Testcontainers framework replacement`
- Reviewer note: Source/history review only.
- Audit status: `intentional difference`

##### `testSelectReal`

- Legacy source method:
  `testing/trino-product-tests/src/main/resources/sql-tests/testcases/connectors/postgresql/select_real.sql`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/postgresql/BasePostgresqlSqlTests.java` ->
  `BasePostgresqlSqlTests.testSelectReal`
- Mapping type: `sql-file consolidation`
- Environment parity: Current class requires `PostgresqlBasicEnvironment`. Routed by source review into
  `SuitePostgresql` run 1.
- Tag parity: Current tags: `Postgresql`, `ProfileSpecificTests`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: none. Legacy setup came from deleted SQL/dataset resources folded into this
  inherited base method.
- Action parity: Current action verbs: `SELECT`. Legacy action is represented by deleted SQL resource cases.
- Assertion parity: Current assertion helpers: `assertThat`, `containsOnly`. Legacy SQL-file cases were converted into
  inline JUnit assertions.
- Cleanup parity: Current cleanup operations: none. Cleanup is now handled by the environment and inline assertions
  instead of Tempto SQL execution.
- Any observed difference, however small: Legacy SQL/resource case was collapsed into an inherited JUnit method shared
  across PostgreSQL environments.
- Known intentional difference: `JUnit/AssertJ/Testcontainers framework replacement`
- Reviewer note: Source/history review only.
- Audit status: `intentional difference`

##### `testShowSchemas`

- Legacy source method:
  `testing/trino-product-tests/src/main/resources/sql-tests/testcases/connectors/postgresql/show_schemas.sql`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/postgresql/BasePostgresqlSqlTests.java` ->
  `BasePostgresqlSqlTests.testShowSchemas`
- Mapping type: `sql-file consolidation`
- Environment parity: Current class requires `PostgresqlBasicEnvironment`. Routed by source review into
  `SuitePostgresql` run 1.
- Tag parity: Current tags: `Postgresql`, `ProfileSpecificTests`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: none. Legacy setup came from deleted SQL/dataset resources folded into this
  inherited base method.
- Action parity: Current action verbs: `SHOW`. Legacy action is represented by deleted SQL resource cases.
- Assertion parity: Current assertion helpers: `assertThat`, `contains`. Legacy SQL-file cases were converted into
  inline JUnit assertions.
- Cleanup parity: Current cleanup operations: none. Cleanup is now handled by the environment and inline assertions
  instead of Tempto SQL execution.
- Any observed difference, however small: Legacy SQL/resource case was collapsed into an inherited JUnit method shared
  across PostgreSQL environments.
- Known intentional difference: `JUnit/AssertJ/Testcontainers framework replacement`
- Reviewer note: Source/history review only.
- Audit status: `intentional difference`

##### `testShowTables`

- Legacy source method:
  `testing/trino-product-tests/src/main/resources/sql-tests/testcases/connectors/postgresql/show_tables.sql`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/postgresql/BasePostgresqlSqlTests.java` ->
  `BasePostgresqlSqlTests.testShowTables`
- Mapping type: `sql-file consolidation`
- Environment parity: Current class requires `PostgresqlBasicEnvironment`. Routed by source review into
  `SuitePostgresql` run 1.
- Tag parity: Current tags: `Postgresql`, `ProfileSpecificTests`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: none. Legacy setup came from deleted SQL/dataset resources folded into this
  inherited base method.
- Action parity: Current action verbs: `SHOW`. Legacy action is represented by deleted SQL resource cases.
- Assertion parity: Current assertion helpers: `assertThat`, `containsExactlyInAnyOrder`. Legacy SQL-file cases were
  converted into inline JUnit assertions.
- Cleanup parity: Current cleanup operations: none. Cleanup is now handled by the environment and inline assertions
  instead of Tempto SQL execution.
- Any observed difference, however small: Legacy SQL/resource case was collapsed into an inherited JUnit method shared
  across PostgreSQL environments.
- Known intentional difference: `JUnit/AssertJ/Testcontainers framework replacement`
- Reviewer note: Source/history review only.
- Audit status: `intentional difference`

### `TestPostgresqlSpoolingSqlTests`

- Owning migration commit: `Add TestPostgresqlSpoolingSqlTests JUnit coverage`
- Current class added in same migration commit:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/postgresql/TestPostgresqlSpoolingSqlTests.java`
- Legacy class removed in same migration commit:
    - None. This commit added new JUnit-side verification coverage rather than removing a legacy class.
- Class-level environment requirement: `PostgresqlSpoolingEnvironment`.
- Class-level tags: `Postgresql`, `PostgresqlSpooling`, `ProfileSpecificTests`.
- Method inventory complete: Not applicable. This class contributes additional environment coverage by inheriting the
  `8` audited methods from `BasePostgresqlSqlTests`.
- Legacy helper/resource dependencies accounted for: Reuses the same SQL/resource-backed mappings audited above, but
  exercises them in the spooling environment.
- Intentional differences summary: `JUnit/AssertJ/Testcontainers framework replacement`
- Method statuses present: `intentional difference`.

#### Methods
