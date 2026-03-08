# Lane Audit: Sql Server

## Lane Summary

- Audit status: `completed`
- Section start commit: `Add SQL Server environment`
- Section end commit: `Remove legacy SuiteSqlServer`
- Introduced JUnit suites: `SuiteSqlServer`.
- Extended existing suites: none.
- Retired legacy suites: `SuiteSqlServer`.
- Environment classes introduced: `SqlServerEnvironment`.
- Method status counts: verified `1`, intentional difference `0`, needs follow-up `0`.

## Lane-Level Open Questions / Intentional Differences

- Lane-wide approved difference set: none beyond the framework baseline documented in the reviewer guide.
- Needs-follow-up methods: none currently identified in this source/history pass.

## Ported Test Classes

### `TestSqlServer`

- Owning migration commit: `Migrate TestSqlServer to JUnit`
- Current class added in same migration commit:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/sqlserver/TestSqlServer.java`
- Legacy class removed in same migration commit:
    - `testing/trino-product-tests/src/main/java/io/trino/tests/product/sqlserver/TestSqlServer.java`
- Class-level environment requirement: `SqlServerEnvironment`.
- Class-level tags: `ProfileSpecificTests`, `Sqlserver`.
- Method inventory complete: Yes. Legacy methods: `1`. Current methods: `1`.
- Legacy helper/resource dependencies accounted for: Legacy class source reviewed directly.
- Intentional differences summary: None identified at class scope.
- Method statuses present: `verified`.

#### Methods

##### `testCreateTableAsSelect`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/sqlserver/TestSqlServer.java` ->
  `testCreateTableAsSelect`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/sqlserver/TestSqlServer.java` ->
  `TestSqlServer.testCreateTableAsSelect`
- Mapping type: `direct`
- Environment parity: Current class requires `SqlServerEnvironment`. Routed by source review into `SuiteSqlServer` run
    1.
- Tag parity: Current tags: `ProfileSpecificTests`, `Sqlserver`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`. Legacy setup operations: `CREATE`.
- Action parity: Current action verbs: `SELECT`. Legacy action verbs: `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `isEqualTo`. Legacy assertion helpers: `assertThat`,
  `containsOnly`, `row`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: Assertion helper names differ between legacy and current implementations.
  Current method uses parameter-injected environment helpers instead of Tempto query executors.
- Known intentional difference: None.
- Reviewer note: Matched by current suite selection: `SuiteSqlServer` run 1 Exact-name mapping with normalized body
  similarity `0.57`.
- Audit status: `verified`
