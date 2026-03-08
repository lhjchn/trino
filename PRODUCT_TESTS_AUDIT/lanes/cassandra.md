# Lane Audit: Cassandra

## Lane Summary

- Audit status: `completed`
- Section start commit: `Add Cassandra environment`
- Section end commit: `Remove legacy SuiteCassandra`
- Introduced JUnit suites: `SuiteCassandra`.
- Extended existing suites: none.
- Retired legacy suites: `SuiteCassandra`.
- Environment classes introduced: `CassandraEnvironment`.
- Method status counts: verified `1`, intentional difference `0`, needs follow-up `0`.

## Lane-Level Open Questions / Intentional Differences

- Lane-wide approved difference set: none beyond the framework baseline documented in the reviewer guide.
- Needs-follow-up methods: none currently identified in this source/history pass.

## Ported Test Classes

### `TestCassandra`

- Owning migration commit: `Migrate TestCassandra to JUnit`
- Current class added in same migration commit:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/cassandra/TestCassandra.java`
- Legacy class removed in same migration commit:
    - `testing/trino-product-tests/src/main/java/io/trino/tests/product/cassandra/TestCassandra.java`
- Class-level environment requirement: `CassandraEnvironment`.
- Class-level tags: `Cassandra`, `ProfileSpecificTests`.
- Method inventory complete: Yes. Legacy methods: `1`. Current methods: `1`.
- Legacy helper/resource dependencies accounted for: Legacy class source reviewed directly.
- Intentional differences summary: None identified at class scope.
- Method statuses present: `verified`.

#### Methods

##### `testCreateTableAsSelect`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/cassandra/TestCassandra.java` ->
  `testCreateTableAsSelect`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/cassandra/TestCassandra.java` ->
  `TestCassandra.testCreateTableAsSelect`
- Mapping type: `direct`
- Environment parity: Current class requires `CassandraEnvironment`. Routed by source review into `SuiteCassandra` run
    1.
- Tag parity: Current tags: `Cassandra`, `ProfileSpecificTests`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`. Legacy setup operations: `CREATE`.
- Action parity: Current action verbs: `SELECT`. Legacy action verbs: `CALL`, `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `containsOnly`, `isEqualTo`. Legacy assertion helpers:
  `assertThat`, `containsOnly`, `row`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: Normalized body similarity is low (`0.34`), so fidelity was judged from
  SQL/helper/assertion shape instead of raw text. SQL verb set differs: legacy ['CALL', 'CREATE', 'SELECT', 'DROP'] vs
  current ['CREATE', 'SELECT', 'DROP']. Assertion helper names differ between legacy and current implementations.
  Current method uses parameter-injected environment helpers instead of Tempto query executors.
- Known intentional difference: None.
- Reviewer note: Matched by current suite selection: `SuiteCassandra` run 1 Exact-name mapping with normalized body
  similarity `0.34`.
- Audit status: `verified`
