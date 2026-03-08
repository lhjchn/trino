# Lane Audit: Clickhouse

## Lane Summary

- Audit status: `completed`
- Section start commit: `Add ClickHouse environment`
- Section end commit: `Remove legacy SuiteClickhouse`
- Introduced JUnit suites: `SuiteClickhouse`.
- Extended existing suites: none.
- Retired legacy suites: `SuiteClickhouse`.
- Environment classes introduced: `ClickHouseEnvironment`.
- Method status counts: verified `1`, intentional difference `0`, needs follow-up `0`.

## Lane-Level Open Questions / Intentional Differences

- Lane-wide approved difference set: none beyond the framework baseline documented in the reviewer guide.
- Needs-follow-up methods: none currently identified in this source/history pass.

## Ported Test Classes

### `TestClickHouse`

- Owning migration commit: `Migrate TestClickHouse to JUnit`
- Current class added in same migration commit:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/clickhouse/TestClickHouse.java`
- Legacy class removed in same migration commit:
    - `testing/trino-product-tests/src/main/java/io/trino/tests/product/clickhouse/TestClickHouse.java`
- Class-level environment requirement: `ClickHouseEnvironment`.
- Class-level tags: `Clickhouse`, `ProfileSpecificTests`.
- Method inventory complete: Yes. Legacy methods: `1`. Current methods: `1`.
- Legacy helper/resource dependencies accounted for: Legacy class source reviewed directly.
- Intentional differences summary: None identified at class scope.
- Method statuses present: `verified`.

#### Methods

##### `testCreateTableAsSelect`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/clickhouse/TestClickHouse.java` ->
  `testCreateTableAsSelect`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/clickhouse/TestClickHouse.java` ->
  `TestClickHouse.testCreateTableAsSelect`
- Mapping type: `direct`
- Environment parity: Current class requires `ClickHouseEnvironment`. Routed by source review into `SuiteClickhouse` run
    1.
- Tag parity: Current tags: `Clickhouse`, `ProfileSpecificTests`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`. Legacy setup operations: `CREATE`.
- Action parity: Current action verbs: `SELECT`. Legacy action verbs: `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `isEqualTo`. Legacy assertion helpers: `assertThat`,
  `containsOnly`, `row`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: Normalized body similarity is low (`0.42`), so fidelity was judged from
  SQL/helper/assertion shape instead of raw text. Assertion helper names differ between legacy and current
  implementations. Current method uses parameter-injected environment helpers instead of Tempto query executors.
- Known intentional difference: None.
- Reviewer note: Matched by current suite selection: `SuiteClickhouse` run 1 Exact-name mapping with normalized body
  similarity `0.42`.
- Audit status: `verified`
