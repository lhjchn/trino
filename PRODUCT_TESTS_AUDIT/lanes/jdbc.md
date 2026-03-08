# Lane Audit: Jdbc

## Lane Summary

- Audit status: `completed`
- Section start commit: `Add JDBC environment`
- Section end commit: `Migrate TestPreparedStatements to JUnit`
- Introduced JUnit suites: `SuiteClients`.
- Extended existing suites: none.
- Retired legacy suites: none.
- Environment classes introduced: `JdbcBasicEnvironment`.
- Method status counts: verified `20`, intentional difference `0`, needs follow-up `0`.

## Lane-Level Open Questions / Intentional Differences

- Lane-wide approved difference set: none beyond the framework baseline documented in the reviewer guide.
- Needs-follow-up methods: none currently identified in this source/history pass.

## Ported Test Classes

### `TestJdbc`

- Owning migration commit: `Migrate TestJdbc to JUnit`
- Current class added in same migration commit:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/jdbc/TestJdbc.java`
- Legacy class removed in same migration commit:
    - `testing/trino-product-tests/src/main/java/io/trino/tests/product/jdbc/TestJdbc.java`
- Class-level environment requirement: `JdbcBasicEnvironment`.
- Class-level tags: `Jdbc`.
- Method inventory complete: Yes. Legacy methods: `11`. Current methods: `11`.
- Legacy helper/resource dependencies accounted for: Legacy class source reviewed directly.
- Intentional differences summary: None identified at class scope.
- Method statuses present: `verified`.

#### Methods

##### `shouldExecuteQuery`

- Legacy source method: `testing/trino-product-tests/src/main/java/io/trino/tests/product/jdbc/TestJdbc.java` ->
  `shouldExecuteQuery`
- Current target method: `testing/trino-product-tests/src/test/java/io/trino/tests/product/jdbc/TestJdbc.java` ->
  `TestJdbc.shouldExecuteQuery`
- Mapping type: `direct`
- Environment parity: Current class requires `JdbcBasicEnvironment`. Routed by source review into `SuiteClients` run 1.
- Tag parity: Current tags: `Jdbc`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: none. Legacy setup operations: none.
- Action parity: Current action verbs: `SELECT`. Legacy action verbs: `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `containsOnly`. Legacy assertion helpers: `assertThat`.
- Cleanup parity: Current cleanup operations: none. No legacy cleanup method body was available.
- Any observed difference, however small: Normalized body similarity is low (`0.54`), so fidelity was judged from
  SQL/helper/assertion shape instead of raw text. Assertion helper names differ between legacy and current
  implementations.
- Known intentional difference: None.
- Reviewer note: Matched by current suite selection: `SuiteClients` run 1 Exact-name mapping with normalized body
  similarity `0.54`.
- Audit status: `verified`

##### `shouldInsertSelectQuery`

- Legacy source method: `testing/trino-product-tests/src/main/java/io/trino/tests/product/jdbc/TestJdbc.java` ->
  `shouldInsertSelectQuery`
- Current target method: `testing/trino-product-tests/src/test/java/io/trino/tests/product/jdbc/TestJdbc.java` ->
  `TestJdbc.shouldInsertSelectQuery`
- Mapping type: `direct`
- Environment parity: Current class requires `JdbcBasicEnvironment`. Routed by source review into `SuiteClients` run 1.
- Tag parity: Current tags: `Jdbc`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`. Legacy setup operations: `INSERT`.
- Action parity: Current action verbs: `SELECT`. Legacy action verbs: `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `containsOnly`, `isEqualTo`. Legacy assertion helpers:
  `assertThat`, `isEqualTo`.
- Cleanup parity: Current cleanup operations: `DROP`. No legacy cleanup method body was available.
- Any observed difference, however small: Normalized body similarity is low (`0.13`), so fidelity was judged from
  SQL/helper/assertion shape instead of raw text. SQL verb set differs: legacy ['SELECT', 'INSERT'] vs
  current ['CREATE', 'DROP', 'SELECT']. Assertion helper names differ between legacy and current implementations.
  Current method uses parameter-injected environment helpers instead of Tempto query executors.
- Known intentional difference: None.
- Reviewer note: Matched by current suite selection: `SuiteClients` run 1 Exact-name mapping with normalized body
  similarity `0.13`.
- Audit status: `verified`

##### `shouldExecuteQueryWithSelectedCatalogAndSchema`

- Legacy source method: `testing/trino-product-tests/src/main/java/io/trino/tests/product/jdbc/TestJdbc.java` ->
  `shouldExecuteQueryWithSelectedCatalogAndSchema`
- Current target method: `testing/trino-product-tests/src/test/java/io/trino/tests/product/jdbc/TestJdbc.java` ->
  `TestJdbc.shouldExecuteQueryWithSelectedCatalogAndSchema`
- Mapping type: `direct`
- Environment parity: Current class requires `JdbcBasicEnvironment`. Routed by source review into `SuiteClients` run 1.
- Tag parity: Current tags: `Jdbc`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: none. Legacy setup operations: none.
- Action parity: Current action verbs: `SELECT`. Legacy action verbs: `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `containsOnly`. Legacy assertion helpers: `assertThat`.
- Cleanup parity: Current cleanup operations: none. No legacy cleanup method body was available.
- Any observed difference, however small: Normalized body similarity is low (`0.30`), so fidelity was judged from
  SQL/helper/assertion shape instead of raw text. Assertion helper names differ between legacy and current
  implementations.
- Known intentional difference: None.
- Reviewer note: Matched by current suite selection: `SuiteClients` run 1 Exact-name mapping with normalized body
  similarity `0.30`.
- Audit status: `verified`

##### `shouldSetTimezone`

- Legacy source method: `testing/trino-product-tests/src/main/java/io/trino/tests/product/jdbc/TestJdbc.java` ->
  `shouldSetTimezone`
- Current target method: `testing/trino-product-tests/src/test/java/io/trino/tests/product/jdbc/TestJdbc.java` ->
  `TestJdbc.shouldSetTimezone`
- Mapping type: `direct`
- Environment parity: Current class requires `JdbcBasicEnvironment`. Routed by source review into `SuiteClients` run 1.
- Tag parity: Current tags: `Jdbc`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: none. No legacy setup method body was available.
- Action parity: Current action verbs: `SELECT`. No legacy action method body was available.
- Assertion parity: Current assertion helpers: `assertThat`, `isEqualTo`. Legacy assertion helpers:
  `assertConnectionTimezone`.
- Cleanup parity: Current cleanup operations: none. No legacy cleanup method body was available.
- Any observed difference, however small: Normalized body similarity is low (`0.39`), so fidelity was judged from
  SQL/helper/assertion shape instead of raw text. Assertion helper names differ between legacy and current
  implementations.
- Known intentional difference: None.
- Reviewer note: Matched by current suite selection: `SuiteClients` run 1 Exact-name mapping with normalized body
  similarity `0.39`.
- Audit status: `verified`

##### `shouldSetLocale`

- Legacy source method: `testing/trino-product-tests/src/main/java/io/trino/tests/product/jdbc/TestJdbc.java` ->
  `shouldSetLocale`
- Current target method: `testing/trino-product-tests/src/test/java/io/trino/tests/product/jdbc/TestJdbc.java` ->
  `TestJdbc.shouldSetLocale`
- Mapping type: `direct`
- Environment parity: Current class requires `JdbcBasicEnvironment`. Routed by source review into `SuiteClients` run 1.
- Tag parity: Current tags: `Jdbc`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: none. Legacy setup operations: none.
- Action parity: Current action verbs: `SELECT`. Legacy action verbs: `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `isEqualTo`. Legacy assertion helpers: `assertThat`,
  `contains`, `row`.
- Cleanup parity: Current cleanup operations: none. No legacy cleanup method body was available.
- Any observed difference, however small: Normalized body similarity is low (`0.54`), so fidelity was judged from
  SQL/helper/assertion shape instead of raw text. Assertion helper names differ between legacy and current
  implementations.
- Known intentional difference: None.
- Reviewer note: Matched by current suite selection: `SuiteClients` run 1 Exact-name mapping with normalized body
  similarity `0.54`.
- Audit status: `verified`

##### `shouldGetSchemas`

- Legacy source method: `testing/trino-product-tests/src/main/java/io/trino/tests/product/jdbc/TestJdbc.java` ->
  `shouldGetSchemas`
- Current target method: `testing/trino-product-tests/src/test/java/io/trino/tests/product/jdbc/TestJdbc.java` ->
  `TestJdbc.shouldGetSchemas`
- Mapping type: `direct`
- Environment parity: Current class requires `JdbcBasicEnvironment`. Routed by source review into `SuiteClients` run 1.
- Tag parity: Current tags: `Jdbc`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: none. No legacy setup method body was available.
- Action parity: Current action verbs: none. No legacy action method body was available.
- Assertion parity: Current assertion helpers: `assertThat`. Legacy assertion helpers: `assertThat`, `contains`, `row`.
- Cleanup parity: Current cleanup operations: none. No legacy cleanup method body was available.
- Any observed difference, however small: Normalized body similarity is low (`0.18`), so fidelity was judged from
  SQL/helper/assertion shape instead of raw text. Assertion helper names differ between legacy and current
  implementations.
- Known intentional difference: None.
- Reviewer note: Matched by current suite selection: `SuiteClients` run 1 Exact-name mapping with normalized body
  similarity `0.18`.
- Audit status: `verified`

##### `shouldGetTables`

- Legacy source method: `testing/trino-product-tests/src/main/java/io/trino/tests/product/jdbc/TestJdbc.java` ->
  `shouldGetTables`
- Current target method: `testing/trino-product-tests/src/test/java/io/trino/tests/product/jdbc/TestJdbc.java` ->
  `TestJdbc.shouldGetTables`
- Mapping type: `direct`
- Environment parity: Current class requires `JdbcBasicEnvironment`. Routed by source review into `SuiteClients` run 1.
- Tag parity: Current tags: `Jdbc`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: none. No legacy setup method body was available.
- Action parity: Current action verbs: none. No legacy action method body was available.
- Assertion parity: Current assertion helpers: `assertThat`, `isEqualTo`. Legacy assertion helpers: `assertThat`,
  `contains`, `row`.
- Cleanup parity: Current cleanup operations: none. No legacy cleanup method body was available.
- Any observed difference, however small: Normalized body similarity is low (`0.19`), so fidelity was judged from
  SQL/helper/assertion shape instead of raw text. Assertion helper names differ between legacy and current
  implementations.
- Known intentional difference: None.
- Reviewer note: Matched by current suite selection: `SuiteClients` run 1 Exact-name mapping with normalized body
  similarity `0.19`.
- Audit status: `verified`

##### `shouldGetColumns`

- Legacy source method: `testing/trino-product-tests/src/main/java/io/trino/tests/product/jdbc/TestJdbc.java` ->
  `shouldGetColumns`
- Current target method: `testing/trino-product-tests/src/test/java/io/trino/tests/product/jdbc/TestJdbc.java` ->
  `TestJdbc.shouldGetColumns`
- Mapping type: `direct`
- Environment parity: Current class requires `JdbcBasicEnvironment`. Routed by source review into `SuiteClients` run 1.
- Tag parity: Current tags: `Jdbc`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: none. No legacy setup method body was available.
- Action parity: Current action verbs: none. No legacy action method body was available.
- Assertion parity: Current assertion helpers: `assertThat`, `isEqualTo`. Legacy assertion helpers: `assertThat`.
- Cleanup parity: Current cleanup operations: none. No legacy cleanup method body was available.
- Any observed difference, however small: Normalized body similarity is low (`0.22`), so fidelity was judged from
  SQL/helper/assertion shape instead of raw text. Assertion helper names differ between legacy and current
  implementations.
- Known intentional difference: None.
- Reviewer note: Matched by current suite selection: `SuiteClients` run 1 Exact-name mapping with normalized body
  similarity `0.22`.
- Audit status: `verified`

##### `shouldGetTableTypes`

- Legacy source method: `testing/trino-product-tests/src/main/java/io/trino/tests/product/jdbc/TestJdbc.java` ->
  `shouldGetTableTypes`
- Current target method: `testing/trino-product-tests/src/test/java/io/trino/tests/product/jdbc/TestJdbc.java` ->
  `TestJdbc.shouldGetTableTypes`
- Mapping type: `direct`
- Environment parity: Current class requires `JdbcBasicEnvironment`. Routed by source review into `SuiteClients` run 1.
- Tag parity: Current tags: `Jdbc`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: none. No legacy setup method body was available.
- Action parity: Current action verbs: none. No legacy action method body was available.
- Assertion parity: Current assertion helpers: `assertThat`. Legacy assertion helpers: `assertThat`, `contains`, `row`.
- Cleanup parity: Current cleanup operations: none. No legacy cleanup method body was available.
- Any observed difference, however small: Normalized body similarity is low (`0.24`), so fidelity was judged from
  SQL/helper/assertion shape instead of raw text. Assertion helper names differ between legacy and current
  implementations.
- Known intentional difference: None.
- Reviewer note: Matched by current suite selection: `SuiteClients` run 1 Exact-name mapping with normalized body
  similarity `0.24`.
- Audit status: `verified`

##### `testSessionProperties`

- Legacy source method: `testing/trino-product-tests/src/main/java/io/trino/tests/product/jdbc/TestJdbc.java` ->
  `testSessionProperties`
- Current target method: `testing/trino-product-tests/src/test/java/io/trino/tests/product/jdbc/TestJdbc.java` ->
  `TestJdbc.testSessionProperties`
- Mapping type: `direct`
- Environment parity: Current class requires `JdbcBasicEnvironment`. Routed by source review into `SuiteClients` run 1.
- Tag parity: Current tags: `Jdbc`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: none. No legacy setup method body was available.
- Action parity: Current action verbs: none. No legacy action method body was available.
- Assertion parity: Current assertion helpers: `assertThat`, `isEqualTo`. Legacy assertion helpers: `assertThat`,
  `isEqualTo`.
- Cleanup parity: Current cleanup operations: none. No legacy cleanup method body was available.
- Any observed difference, however small: No method-specific difference identified beyond the documented framework
  baseline.
- Known intentional difference: None.
- Reviewer note: Matched by current suite selection: `SuiteClients` run 1 High normalized body similarity `0.91`.
- Audit status: `verified`

##### `testDeallocate`

- Legacy source method: `testing/trino-product-tests/src/main/java/io/trino/tests/product/jdbc/TestJdbc.java` ->
  `testDeallocate`
- Current target method: `testing/trino-product-tests/src/test/java/io/trino/tests/product/jdbc/TestJdbc.java` ->
  `TestJdbc.testDeallocate`
- Mapping type: `direct`
- Environment parity: Current class requires `JdbcBasicEnvironment`. Routed by source review into `SuiteClients` run 1.
- Tag parity: Current tags: `Jdbc`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: none. Legacy setup operations: none.
- Action parity: Current action verbs: `SELECT`. Legacy action verbs: `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`. No legacy assertion method body was available.
- Cleanup parity: Current cleanup operations: none. No legacy cleanup method body was available.
- Any observed difference, however small: No method-specific difference identified beyond the documented framework
  baseline.
- Known intentional difference: None.
- Reviewer note: Matched by current suite selection: `SuiteClients` run 1 Exact-name mapping with normalized body
  similarity `0.74`.
- Audit status: `verified`

### `TestPreparedStatements`

- Owning migration commit: `Migrate TestPreparedStatements to JUnit`
- Current class added in same migration commit:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/jdbc/TestPreparedStatements.java`
- Legacy class removed in same migration commit:
    - `testing/trino-product-tests/src/main/java/io/trino/tests/product/jdbc/TestPreparedStatements.java`
- Class-level environment requirement: `JdbcBasicEnvironment`.
- Class-level tags: `Jdbc`.
- Method inventory complete: Yes. Legacy methods: `9`. Current methods: `9`.
- Legacy helper/resource dependencies accounted for: Legacy class source reviewed directly.
- Intentional differences summary: None identified at class scope.
- Method statuses present: `verified`.

#### Methods

##### `preparedSelectApi`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/jdbc/TestPreparedStatements.java` ->
  `preparedSelectApi`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/jdbc/TestPreparedStatements.java` ->
  `TestPreparedStatements.preparedSelectApi`
- Mapping type: `direct`
- Environment parity: Current class requires `JdbcBasicEnvironment`. Routed by source review into `SuiteClients` run 1.
- Tag parity: Current tags: `Jdbc`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: none. Legacy setup operations: none.
- Action parity: Current action verbs: `SELECT`. Legacy action verbs: `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `isEqualTo`. Legacy assertion helpers: `assertThat`,
  `containsOnly`, `row`.
- Cleanup parity: Current cleanup operations: none. No legacy cleanup method body was available.
- Any observed difference, however small: Normalized body similarity is low (`0.14`), so fidelity was judged from
  SQL/helper/assertion shape instead of raw text. Assertion helper names differ between legacy and current
  implementations. Current method uses parameter-injected environment helpers instead of Tempto query executors.
- Known intentional difference: None.
- Reviewer note: Matched by current suite selection: `SuiteClients` run 1 Exact-name mapping with normalized body
  similarity `0.14`.
- Audit status: `verified`

##### `preparedSelectSql`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/jdbc/TestPreparedStatements.java` ->
  `preparedSelectSql`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/jdbc/TestPreparedStatements.java` ->
  `TestPreparedStatements.preparedSelectSql`
- Mapping type: `direct`
- Environment parity: Current class requires `JdbcBasicEnvironment`. Routed by source review into `SuiteClients` run 1.
- Tag parity: Current tags: `Jdbc`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: none. No legacy setup method body was available.
- Action parity: Current action verbs: none. No legacy action method body was available.
- Assertion parity: Current assertion helpers: `assertThat`, `isEqualTo`. Legacy assertion helpers: `assertThat`,
  `containsOnly`, `row`.
- Cleanup parity: Current cleanup operations: none. No legacy cleanup method body was available.
- Any observed difference, however small: Normalized body similarity is low (`0.17`), so fidelity was judged from
  SQL/helper/assertion shape instead of raw text. Assertion helper names differ between legacy and current
  implementations.
- Known intentional difference: None.
- Reviewer note: Matched by current suite selection: `SuiteClients` run 1 Exact-name mapping with normalized body
  similarity `0.17`.
- Audit status: `verified`

##### `executeImmediateSelectSql`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/jdbc/TestPreparedStatements.java` ->
  `executeImmediateSelectSql`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/jdbc/TestPreparedStatements.java` ->
  `TestPreparedStatements.executeImmediateSelectSql`
- Mapping type: `direct`
- Environment parity: Current class requires `JdbcBasicEnvironment`. Routed by source review into `SuiteClients` run 1.
- Tag parity: Current tags: `Jdbc`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: none. No legacy setup method body was available.
- Action parity: Current action verbs: none. No legacy action method body was available.
- Assertion parity: Current assertion helpers: `assertThat`, `isEqualTo`. Legacy assertion helpers: `assertThat`,
  `containsOnly`, `row`.
- Cleanup parity: Current cleanup operations: none. No legacy cleanup method body was available.
- Any observed difference, however small: Normalized body similarity is low (`0.16`), so fidelity was judged from
  SQL/helper/assertion shape instead of raw text. Assertion helper names differ between legacy and current
  implementations.
- Known intentional difference: None.
- Reviewer note: Matched by current suite selection: `SuiteClients` run 1 Exact-name mapping with normalized body
  similarity `0.16`.
- Audit status: `verified`

##### `preparedInsertVarbinaryApi`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/jdbc/TestPreparedStatements.java` ->
  `preparedInsertVarbinaryApi`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/jdbc/TestPreparedStatements.java` ->
  `TestPreparedStatements.preparedInsertVarbinaryApi`
- Mapping type: `direct`
- Environment parity: Current class requires `JdbcBasicEnvironment`. Routed by source review into `SuiteClients` run 1.
- Tag parity: Current tags: `Jdbc`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`, `INSERT`. No legacy setup method body was available.
- Action parity: Current action verbs: `SELECT`. No legacy action method body was available.
- Assertion parity: Current assertion helpers: `assertThat`, `isEqualTo`. Legacy assertion helpers: `assertColumnTypes`,
  `assertThat`, `containsOnly`, `row`.
- Cleanup parity: Current cleanup operations: `DROP`. No legacy cleanup method body was available.
- Any observed difference, however small: Normalized body similarity is low (`0.07`), so fidelity was judged from
  SQL/helper/assertion shape instead of raw text. Assertion helper names differ between legacy and current
  implementations. Current method uses parameter-injected environment helpers instead of Tempto query executors.
- Known intentional difference: None.
- Reviewer note: Matched by current suite selection: `SuiteClients` run 1 Exact-name mapping with normalized body
  similarity `0.07`.
- Audit status: `verified`

##### `preparedInsertApi`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/jdbc/TestPreparedStatements.java` ->
  `preparedInsertApi`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/jdbc/TestPreparedStatements.java` ->
  `TestPreparedStatements.preparedInsertApi`
- Mapping type: `direct`
- Environment parity: Current class requires `JdbcBasicEnvironment`. Routed by source review into `SuiteClients` run 1.
- Tag parity: Current tags: `Jdbc`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`, `INSERT`. No legacy setup method body was available.
- Action parity: Current action verbs: `SELECT`. No legacy action method body was available.
- Assertion parity: Current assertion helpers: `assertThat`, `isEqualTo`. Legacy assertion helpers: `assertColumnTypes`,
  `assertThat`, `containsOnly`, `row`.
- Cleanup parity: Current cleanup operations: `DROP`. No legacy cleanup method body was available.
- Any observed difference, however small: Normalized body similarity is low (`0.18`), so fidelity was judged from
  SQL/helper/assertion shape instead of raw text. Assertion helper names differ between legacy and current
  implementations. Current method uses parameter-injected environment helpers instead of Tempto query executors.
- Known intentional difference: None.
- Reviewer note: Matched by current suite selection: `SuiteClients` run 1 Exact-name mapping with normalized body
  similarity `0.18`.
- Audit status: `verified`

##### `preparedInsertSql`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/jdbc/TestPreparedStatements.java` ->
  `preparedInsertSql`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/jdbc/TestPreparedStatements.java` ->
  `TestPreparedStatements.preparedInsertSql`
- Mapping type: `direct`
- Environment parity: Current class requires `JdbcBasicEnvironment`. Routed by source review into `SuiteClients` run 1.
- Tag parity: Current tags: `Jdbc`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`. No legacy setup method body was available.
- Action parity: Current action verbs: `SELECT`. No legacy action method body was available.
- Assertion parity: Current assertion helpers: `assertThat`, `isEqualTo`. No legacy assertion method body was available.
- Cleanup parity: Current cleanup operations: `DROP`. No legacy cleanup method body was available.
- Any observed difference, however small: Normalized body similarity is low (`0.03`), so fidelity was judged from
  SQL/helper/assertion shape instead of raw text.
- Known intentional difference: None.
- Reviewer note: Matched by current suite selection: `SuiteClients` run 1 Exact-name mapping with normalized body
  similarity `0.03`.
- Audit status: `verified`

##### `executeImmediateInsertSql`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/jdbc/TestPreparedStatements.java` ->
  `executeImmediateInsertSql`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/jdbc/TestPreparedStatements.java` ->
  `TestPreparedStatements.executeImmediateInsertSql`
- Mapping type: `direct`
- Environment parity: Current class requires `JdbcBasicEnvironment`. Routed by source review into `SuiteClients` run 1.
- Tag parity: Current tags: `Jdbc`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`. No legacy setup method body was available.
- Action parity: Current action verbs: `SELECT`. No legacy action method body was available.
- Assertion parity: Current assertion helpers: `assertThat`, `isEqualTo`. No legacy assertion method body was available.
- Cleanup parity: Current cleanup operations: `DROP`. No legacy cleanup method body was available.
- Any observed difference, however small: Normalized body similarity is low (`0.04`), so fidelity was judged from
  SQL/helper/assertion shape instead of raw text.
- Known intentional difference: None.
- Reviewer note: Matched by current suite selection: `SuiteClients` run 1 Exact-name mapping with normalized body
  similarity `0.04`.
- Audit status: `verified`

##### `preparedInsertVarbinarySql`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/jdbc/TestPreparedStatements.java` ->
  `preparedInsertVarbinarySql`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/jdbc/TestPreparedStatements.java` ->
  `TestPreparedStatements.preparedInsertVarbinarySql`
- Mapping type: `direct`
- Environment parity: Current class requires `JdbcBasicEnvironment`. Routed by source review into `SuiteClients` run 1.
- Tag parity: Current tags: `Jdbc`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`. No legacy setup method body was available.
- Action parity: Current action verbs: `SELECT`. No legacy action method body was available.
- Assertion parity: Current assertion helpers: `assertThat`, `isEqualTo`. No legacy assertion method body was available.
- Cleanup parity: Current cleanup operations: `DROP`. No legacy cleanup method body was available.
- Any observed difference, however small: Normalized body similarity is low (`0.06`), so fidelity was judged from
  SQL/helper/assertion shape instead of raw text.
- Known intentional difference: None.
- Reviewer note: Matched by current suite selection: `SuiteClients` run 1 Exact-name mapping with normalized body
  similarity `0.06`.
- Audit status: `verified`

##### `executeImmediateVarbinarySql`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/jdbc/TestPreparedStatements.java` ->
  `executeImmediateVarbinarySql`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/jdbc/TestPreparedStatements.java` ->
  `TestPreparedStatements.executeImmediateVarbinarySql`
- Mapping type: `direct`
- Environment parity: Current class requires `JdbcBasicEnvironment`. Routed by source review into `SuiteClients` run 1.
- Tag parity: Current tags: `Jdbc`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`. No legacy setup method body was available.
- Action parity: Current action verbs: `SELECT`. No legacy action method body was available.
- Assertion parity: Current assertion helpers: `assertThat`, `isEqualTo`. No legacy assertion method body was available.
- Cleanup parity: Current cleanup operations: `DROP`. No legacy cleanup method body was available.
- Any observed difference, however small: Normalized body similarity is low (`0.04`), so fidelity was judged from
  SQL/helper/assertion shape instead of raw text.
- Known intentional difference: None.
- Reviewer note: Matched by current suite selection: `SuiteClients` run 1 Exact-name mapping with normalized body
  similarity `0.04`.
- Audit status: `verified`
