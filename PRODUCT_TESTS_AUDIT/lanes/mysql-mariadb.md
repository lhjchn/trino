# Lane Audit: Mysql Mariadb

## Lane Summary

- Audit status: `completed`
- Section start commit: `Add MySQL environment`
- Section end commit: `Remove legacy SuiteMysql`
- Introduced JUnit suites: `SuiteMysql`.
- Extended existing suites: none.
- Retired legacy suites: `SuiteMysql`.
- Environment classes introduced: `MariaDbEnvironment`, `MySqlEnvironment`.
- Method status counts: verified `3`, intentional difference `12`, needs follow-up `0`.

## Lane-Level Open Questions / Intentional Differences

- Lane-wide approved difference set: `MySQL upgrade`.
- Needs-follow-up methods: none currently identified in this source/history pass.

## Ported Test Classes

### `TestTrinoProductTestContainer`

- Owning migration commit: `Add MySQL environment`
- Current class added in same migration commit:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/TestTrinoProductTestContainer.java`
- Legacy class removed in same migration commit:
    - None. This commit added new JUnit-side verification coverage rather than removing a legacy class.
- Class-level environment requirement: none.
- Class-level tags: `smoke`.
- Method inventory complete: Not applicable. No legacy class or resource source exists for this new verification
  coverage.
- Legacy helper/resource dependencies accounted for: New JUnit-side verification coverage without a removed legacy
  counterpart.
- Intentional differences summary: `JUnit/AssertJ/Testcontainers framework replacement`
- Method statuses present: `intentional difference`.

#### Methods

##### `testSimpleQuery`

- Legacy source method: No legacy source method; this is new JUnit-side verification coverage.
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/TestTrinoProductTestContainer.java` ->
  `TestTrinoProductTestContainer.testSimpleQuery`
- Mapping type: `new coverage helper`
- Environment parity: Current class does not declare a concrete environment requirement. No suite run selects this
  method from the current suite definitions.
- Tag parity: Current tags: `smoke`. Tag routing needs no suite-level product-test claim.
- Setup parity: Current setup operations: none. No legacy setup method body was available.
- Action parity: Current action verbs: `SELECT`. No legacy action method body was available.
- Assertion parity: Current assertion helpers: `assertThat`, `isEqualTo`. No legacy assertion method body was available.
- Cleanup parity: Current cleanup operations: none. No legacy cleanup method body was available.
- Any observed difference, however small: No legacy method counterpart exists; this is new JUnit-side verification
  coverage.
- Known intentional difference: `JUnit/AssertJ/Testcontainers framework replacement`
- Reviewer note: Source/history review only.
- Audit status: `intentional difference`

##### `testJdbcUrlAvailable`

- Legacy source method: No legacy source method; this is new JUnit-side verification coverage.
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/TestTrinoProductTestContainer.java` ->
  `TestTrinoProductTestContainer.testJdbcUrlAvailable`
- Mapping type: `new coverage helper`
- Environment parity: Current class does not declare a concrete environment requirement. No suite run selects this
  method from the current suite definitions.
- Tag parity: Current tags: `smoke`. Tag routing needs no suite-level product-test claim.
- Setup parity: Current setup operations: none. No legacy setup method body was available.
- Action parity: Current action verbs: none. No legacy action method body was available.
- Assertion parity: Current assertion helpers: `assertThat`. No legacy assertion method body was available.
- Cleanup parity: Current cleanup operations: none. No legacy cleanup method body was available.
- Any observed difference, however small: No legacy method counterpart exists; this is new JUnit-side verification
  coverage.
- Known intentional difference: `JUnit/AssertJ/Testcontainers framework replacement`
- Reviewer note: Source/history review only.
- Audit status: `intentional difference`

##### `testBuilderCreatesConfiguredContainer`

- Legacy source method: No legacy source method; this is new JUnit-side verification coverage.
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/TestTrinoProductTestContainer.java` ->
  `TestTrinoProductTestContainer.testBuilderCreatesConfiguredContainer`
- Mapping type: `new coverage helper`
- Environment parity: Current class does not declare a concrete environment requirement. No suite run selects this
  method from the current suite definitions.
- Tag parity: Current tags: `smoke`. Tag routing needs no suite-level product-test claim.
- Setup parity: Current setup operations: none. No legacy setup method body was available.
- Action parity: Current action verbs: none. No legacy action method body was available.
- Assertion parity: Current assertion helpers: `assertThat`. No legacy assertion method body was available.
- Cleanup parity: Current cleanup operations: none. No legacy cleanup method body was available.
- Any observed difference, however small: No legacy method counterpart exists; this is new JUnit-side verification
  coverage.
- Known intentional difference: `JUnit/AssertJ/Testcontainers framework replacement`
- Reviewer note: Source/history review only.
- Audit status: `intentional difference`

### `TestMySqlSqlTests`

- Owning migration commit: `Migrate TestMySqlSqlTests to JUnit`
- Current class added in same migration commit:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/mysql/TestMySqlSqlTests.java`
- Legacy class removed in same migration commit:
    - None. This commit added new JUnit-side verification coverage rather than removing a legacy class.
- Class-level environment requirement: `MySqlEnvironment`.
- Class-level tags: `Mysql`, `ProfileSpecificTests`.
- Method inventory complete: Yes. Current methods: `9`. Legacy source came from `9` deleted SQL/resource files in the
  same migration commit.
- Legacy helper/resource dependencies accounted for: Legacy helper/resource dependencies captured from deleted resource
  files.
- Intentional differences summary: `JUnit/AssertJ/Testcontainers framework replacement`, `MySQL upgrade`
- Method statuses present: `intentional difference`.

#### Methods

##### `testSelect`

- Legacy source method: `testing/trino-product-tests/src/main/resources/sql-tests/testcases/connectors/mysql/select.sql`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/mysql/TestMySqlSqlTests.java` ->
  `TestMySqlSqlTests.testSelect`
- Mapping type: `sql-file consolidation`
- Environment parity: Current class requires `MySqlEnvironment`. Routed by source review into `SuiteMysql` run 1.
- Tag parity: Current tags: `Mysql`, `ProfileSpecificTests`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: none. Legacy setup came from deleted SQL/dataset resources folded into this
  class.
- Action parity: Current action verbs: `SELECT`. Legacy action is represented by deleted SQL resource cases.
- Assertion parity: Current assertion helpers: `assertThat`, `containsOnly`. Legacy SQL-file cases were converted into
  inline JUnit assertions.
- Cleanup parity: Current cleanup operations: none. Cleanup is now inline in the JUnit method because the old case lived
  in resource files.
- Any observed difference, however small: Legacy SQL/resource cases were collapsed into inline JUnit code.
- Known intentional difference: `JUnit/AssertJ/Testcontainers framework replacement`, `MySQL upgrade`
- Reviewer note: Source/history review only.
- Audit status: `intentional difference`

##### `testDescribeTable`

- Legacy source method:
  `testing/trino-product-tests/src/main/resources/sql-tests/testcases/connectors/mysql/describe_table.sql`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/mysql/TestMySqlSqlTests.java` ->
  `TestMySqlSqlTests.testDescribeTable`
- Mapping type: `sql-file consolidation`
- Environment parity: Current class requires `MySqlEnvironment`. Routed by source review into `SuiteMysql` run 1.
- Tag parity: Current tags: `Mysql`, `ProfileSpecificTests`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: none. Legacy setup came from deleted SQL/dataset resources folded into this
  class.
- Action parity: Current action verbs: `DESCRIBE`. Legacy action is represented by deleted SQL resource cases.
- Assertion parity: Current assertion helpers: `assertThat`, `containsOnly`, `row`. Legacy SQL-file cases were converted
  into inline JUnit assertions.
- Cleanup parity: Current cleanup operations: none. Cleanup is now inline in the JUnit method because the old case lived
  in resource files.
- Any observed difference, however small: Legacy SQL/resource cases were collapsed into inline JUnit code.
- Known intentional difference: `JUnit/AssertJ/Testcontainers framework replacement`, `MySQL upgrade`
- Reviewer note: Source/history review only.
- Audit status: `intentional difference`

##### `testDescribeRealTable`

- Legacy source method:
  `testing/trino-product-tests/src/main/resources/sql-tests/testcases/connectors/mysql/describe_real_table.sql`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/mysql/TestMySqlSqlTests.java` ->
  `TestMySqlSqlTests.testDescribeRealTable`
- Mapping type: `sql-file consolidation`
- Environment parity: Current class requires `MySqlEnvironment`. Routed by source review into `SuiteMysql` run 1.
- Tag parity: Current tags: `Mysql`, `ProfileSpecificTests`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: none. Legacy setup came from deleted SQL/dataset resources folded into this
  class.
- Action parity: Current action verbs: `DESCRIBE`. Legacy action is represented by deleted SQL resource cases.
- Assertion parity: Current assertion helpers: `assertThat`, `containsOnly`, `row`. Legacy SQL-file cases were converted
  into inline JUnit assertions.
- Cleanup parity: Current cleanup operations: none. Cleanup is now inline in the JUnit method because the old case lived
  in resource files.
- Any observed difference, however small: Legacy SQL/resource cases were collapsed into inline JUnit code.
- Known intentional difference: `JUnit/AssertJ/Testcontainers framework replacement`, `MySQL upgrade`
- Reviewer note: Source/history review only.
- Audit status: `intentional difference`

##### `testJoinMysqlToMysql`

- Legacy source method:
  `testing/trino-product-tests/src/main/resources/sql-tests/testcases/connectors/mysql/join_mysql_to_mysql.sql`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/mysql/TestMySqlSqlTests.java` ->
  `TestMySqlSqlTests.testJoinMysqlToMysql`
- Mapping type: `sql-file consolidation`
- Environment parity: Current class requires `MySqlEnvironment`. Routed by source review into `SuiteMysql` run 1.
- Tag parity: Current tags: `Mysql`, `ProfileSpecificTests`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: none. Legacy setup came from deleted SQL/dataset resources folded into this
  class.
- Action parity: Current action verbs: `SELECT`. Legacy action is represented by deleted SQL resource cases.
- Assertion parity: Current assertion helpers: `assertThat`, `containsOnly`, `row`. Legacy SQL-file cases were converted
  into inline JUnit assertions.
- Cleanup parity: Current cleanup operations: none. Cleanup is now inline in the JUnit method because the old case lived
  in resource files.
- Any observed difference, however small: Legacy SQL/resource cases were collapsed into inline JUnit code.
- Known intentional difference: `JUnit/AssertJ/Testcontainers framework replacement`, `MySQL upgrade`
- Reviewer note: Source/history review only.
- Audit status: `intentional difference`

##### `testJoinMysqlToTpch`

- Legacy source method:
  `testing/trino-product-tests/src/main/resources/sql-tests/testcases/connectors/mysql/join_mysql_to_tpch.sql`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/mysql/TestMySqlSqlTests.java` ->
  `TestMySqlSqlTests.testJoinMysqlToTpch`
- Mapping type: `sql-file consolidation`
- Environment parity: Current class requires `MySqlEnvironment`. Routed by source review into `SuiteMysql` run 1.
- Tag parity: Current tags: `Mysql`, `ProfileSpecificTests`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: none. Legacy setup came from deleted SQL/dataset resources folded into this
  class.
- Action parity: Current action verbs: `SELECT`. Legacy action is represented by deleted SQL resource cases.
- Assertion parity: Current assertion helpers: `assertThat`, `containsOnly`, `row`. Legacy SQL-file cases were converted
  into inline JUnit assertions.
- Cleanup parity: Current cleanup operations: none. Cleanup is now inline in the JUnit method because the old case lived
  in resource files.
- Any observed difference, however small: Legacy SQL/resource cases were collapsed into inline JUnit code.
- Known intentional difference: `JUnit/AssertJ/Testcontainers framework replacement`, `MySQL upgrade`
- Reviewer note: Source/history review only.
- Audit status: `intentional difference`

##### `testSelectReal`

- Legacy source method:
  `testing/trino-product-tests/src/main/resources/sql-tests/testcases/connectors/mysql/select_real.sql`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/mysql/TestMySqlSqlTests.java` ->
  `TestMySqlSqlTests.testSelectReal`
- Mapping type: `sql-file consolidation`
- Environment parity: Current class requires `MySqlEnvironment`. Routed by source review into `SuiteMysql` run 1.
- Tag parity: Current tags: `Mysql`, `ProfileSpecificTests`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: none. Legacy setup came from deleted SQL/dataset resources folded into this
  class.
- Action parity: Current action verbs: `SELECT`. Legacy action is represented by deleted SQL resource cases.
- Assertion parity: Current assertion helpers: `assertThat`, `containsOnly`. Legacy SQL-file cases were converted into
  inline JUnit assertions.
- Cleanup parity: Current cleanup operations: none. Cleanup is now inline in the JUnit method because the old case lived
  in resource files.
- Any observed difference, however small: Legacy SQL/resource cases were collapsed into inline JUnit code.
- Known intentional difference: `JUnit/AssertJ/Testcontainers framework replacement`, `MySQL upgrade`
- Reviewer note: Source/history review only.
- Audit status: `intentional difference`

##### `testShowSchemas`

- Legacy source method:
  `testing/trino-product-tests/src/main/resources/sql-tests/testcases/connectors/mysql/show_schemas.sql`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/mysql/TestMySqlSqlTests.java` ->
  `TestMySqlSqlTests.testShowSchemas`
- Mapping type: `sql-file consolidation`
- Environment parity: Current class requires `MySqlEnvironment`. Routed by source review into `SuiteMysql` run 1.
- Tag parity: Current tags: `Mysql`, `ProfileSpecificTests`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: none. Legacy setup came from deleted SQL/dataset resources folded into this
  class.
- Action parity: Current action verbs: `SHOW`. Legacy action is represented by deleted SQL resource cases.
- Assertion parity: Current assertion helpers: `assertThat`, `contains`. Legacy SQL-file cases were converted into
  inline JUnit assertions.
- Cleanup parity: Current cleanup operations: none. Cleanup is now inline in the JUnit method because the old case lived
  in resource files.
- Any observed difference, however small: Legacy SQL/resource cases were collapsed into inline JUnit code.
- Known intentional difference: `JUnit/AssertJ/Testcontainers framework replacement`, `MySQL upgrade`
- Reviewer note: Source/history review only.
- Audit status: `intentional difference`

##### `testShowTables`

- Legacy source method:
  `testing/trino-product-tests/src/main/resources/sql-tests/testcases/connectors/mysql/show_tables.sql`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/mysql/TestMySqlSqlTests.java` ->
  `TestMySqlSqlTests.testShowTables`
- Mapping type: `sql-file consolidation`
- Environment parity: Current class requires `MySqlEnvironment`. Routed by source review into `SuiteMysql` run 1.
- Tag parity: Current tags: `Mysql`, `ProfileSpecificTests`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: none. Legacy setup came from deleted SQL/dataset resources folded into this
  class.
- Action parity: Current action verbs: `SHOW`. Legacy action is represented by deleted SQL resource cases.
- Assertion parity: Current assertion helpers: `assertThat`. Legacy SQL-file cases were converted into inline JUnit
  assertions.
- Cleanup parity: Current cleanup operations: none. Cleanup is now inline in the JUnit method because the old case lived
  in resource files.
- Any observed difference, however small: Legacy SQL/resource cases were collapsed into inline JUnit code.
- Known intentional difference: `JUnit/AssertJ/Testcontainers framework replacement`, `MySQL upgrade`
- Reviewer note: Source/history review only.
- Audit status: `intentional difference`

##### `testTinyintFilter`

- Legacy source method:
  `testing/trino-product-tests/src/main/resources/sql-tests/testcases/connectors/mysql/tinyint1_as_tinyint.sql`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/mysql/TestMySqlSqlTests.java` ->
  `TestMySqlSqlTests.testTinyintFilter`
- Mapping type: `sql-file consolidation`
- Environment parity: Current class requires `MySqlEnvironment`. Routed by source review into `SuiteMysql` run 1.
- Tag parity: Current tags: `Mysql`, `ProfileSpecificTests`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: none. Legacy setup came from deleted SQL/dataset resources folded into this
  class.
- Action parity: Current action verbs: `SELECT`. Legacy action is represented by deleted SQL resource cases.
- Assertion parity: Current assertion helpers: `assertThat`, `containsOnly`, `row`. Legacy SQL-file cases were converted
  into inline JUnit assertions.
- Cleanup parity: Current cleanup operations: none. Cleanup is now inline in the JUnit method because the old case lived
  in resource files.
- Any observed difference, however small: Legacy SQL/resource cases were collapsed into inline JUnit code.
- Known intentional difference: `JUnit/AssertJ/Testcontainers framework replacement`, `MySQL upgrade`
- Reviewer note: Source/history review only.
- Audit status: `intentional difference`

### `TestCreateTableAsSelect`

- Owning migration commit: `Migrate TestCreateTableAsSelect to JUnit`
- Current class added in same migration commit:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/mysql/TestCreateTableAsSelect.java`
- Legacy class removed in same migration commit:
    - `testing/trino-product-tests/src/main/java/io/trino/tests/product/mysql/TestCreateTableAsSelect.java`
- Class-level environment requirement: `MySqlEnvironment`.
- Class-level tags: `Mysql`, `ProfileSpecificTests`.
- Method inventory complete: Yes. Legacy methods: `1`. Current methods: `1`.
- Legacy helper/resource dependencies accounted for: Legacy class source reviewed directly.
- Intentional differences summary: `MySQL upgrade`
- Method statuses present: `verified`.

#### Methods

##### `testCreateTableAsSelect`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/mysql/TestCreateTableAsSelect.java` ->
  `testCreateTableAsSelect`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/mysql/TestCreateTableAsSelect.java` ->
  `TestCreateTableAsSelect.testCreateTableAsSelect`
- Mapping type: `direct`
- Environment parity: Current class requires `MySqlEnvironment`. Routed by source review into `SuiteMysql` run 1.
- Tag parity: Current tags: `Mysql`, `ProfileSpecificTests`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`. Legacy setup operations: `CREATE`.
- Action parity: Current action verbs: none. Legacy action verbs: none.
- Assertion parity: Current assertion helpers: `assertThat`, `isEqualTo`. Legacy assertion helpers: `assertThat`,
  `containsOnly`, `row`.
- Cleanup parity: Current cleanup operations: `DROP`. No legacy cleanup method body was available.
- Any observed difference, however small: Normalized body similarity is low (`0.23`), so fidelity was judged from
  SQL/helper/assertion shape instead of raw text. SQL verb set differs: legacy ['CREATE'] vs current ['DROP', 'CREATE'].
  Assertion helper names differ between legacy and current implementations. Current method uses parameter-injected
  environment helpers instead of Tempto query executors.
- Known intentional difference: `MySQL upgrade`
- Reviewer note: Matched by current suite selection: `SuiteMysql` run 1 Exact-name mapping with normalized body
  similarity `0.23`.
- Audit status: `verified`

### `TestJdbcDynamicFilteringJmx`

- Owning migration commit: `Migrate TestJdbcDynamicFilteringJmx to JUnit`
- Current class added in same migration commit:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/mysql/TestJdbcDynamicFilteringJmx.java`
- Legacy class removed in same migration commit:
    - `testing/trino-product-tests/src/main/java/io/trino/tests/product/mysql/TestJdbcDynamicFilteringJmx.java`
- Class-level environment requirement: `MySqlEnvironment`.
- Class-level tags: `Mysql`, `ProfileSpecificTests`.
- Method inventory complete: Yes. Legacy methods: `1`. Current methods: `1`.
- Legacy helper/resource dependencies accounted for: Legacy class source reviewed directly.
- Intentional differences summary: `MySQL upgrade`
- Method statuses present: `verified`.

#### Methods

##### `testDynamicFilteringStats`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/mysql/TestJdbcDynamicFilteringJmx.java` ->
  `testDynamicFilteringStats`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/mysql/TestJdbcDynamicFilteringJmx.java` ->
  `TestJdbcDynamicFilteringJmx.testDynamicFilteringStats`
- Mapping type: `direct`
- Environment parity: Current class requires `MySqlEnvironment`. Routed by source review into `SuiteMysql` run 1.
- Tag parity: Current tags: `Mysql`, `ProfileSpecificTests`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`. Legacy setup operations: `CREATE`.
- Action parity: Current action verbs: `SELECT`. Legacy action verbs: `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `isEqualTo`. Legacy assertion helpers: `assertThat`,
  `containsOnly`, `row`.
- Cleanup parity: Current cleanup operations: `DROP`. No legacy cleanup method body was available.
- Any observed difference, however small: Normalized body similarity is low (`0.39`), so fidelity was judged from
  SQL/helper/assertion shape instead of raw text. SQL verb set differs: legacy ['CREATE', 'SELECT'] vs
  current ['DROP', 'CREATE', 'SELECT']. Assertion helper names differ between legacy and current implementations.
  Current method uses parameter-injected environment helpers instead of Tempto query executors.
- Known intentional difference: `MySQL upgrade`
- Reviewer note: Matched by current suite selection: `SuiteMysql` run 1 Exact-name mapping with normalized body
  similarity `0.39`.
- Audit status: `verified`

### `TestMariaDb`

- Owning migration commit: `Migrate TestMariaDb to JUnit`
- Current class added in same migration commit:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/mariadb/TestMariaDb.java`
- Legacy class removed in same migration commit:
    - `testing/trino-product-tests/src/main/java/io/trino/tests/product/mariadb/TestMariaDb.java`
- Class-level environment requirement: `MariaDbEnvironment`.
- Class-level tags: `Mariadb`, `ProfileSpecificTests`.
- Method inventory complete: Yes. Legacy methods: `1`. Current methods: `1`.
- Legacy helper/resource dependencies accounted for: Legacy class source reviewed directly.
- Intentional differences summary: `MySQL upgrade`
- Method statuses present: `verified`.

#### Methods

##### `testCreateTableAsSelect`

- Legacy source method: `testing/trino-product-tests/src/main/java/io/trino/tests/product/mariadb/TestMariaDb.java` ->
  `testCreateTableAsSelect`
- Current target method: `testing/trino-product-tests/src/test/java/io/trino/tests/product/mariadb/TestMariaDb.java` ->
  `TestMariaDb.testCreateTableAsSelect`
- Mapping type: `direct`
- Environment parity: Current class requires `MariaDbEnvironment`. Routed by source review into `SuiteMysql` run 2.
- Tag parity: Current tags: `Mariadb`, `ProfileSpecificTests`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`. Legacy setup operations: `CREATE`.
- Action parity: Current action verbs: `SELECT`. Legacy action verbs: `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `containsOnly`, `isEqualTo`. Legacy assertion helpers:
  `assertThat`, `containsOnly`, `row`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: Normalized body similarity is low (`0.32`), so fidelity was judged from
  SQL/helper/assertion shape instead of raw text. Assertion helper names differ between legacy and current
  implementations. Current method uses parameter-injected environment helpers instead of Tempto query executors.
- Known intentional difference: `MySQL upgrade`
- Reviewer note: Matched by current suite selection: `SuiteMysql` run 2 Exact-name mapping with normalized body
  similarity `0.32`.
- Audit status: `verified`
