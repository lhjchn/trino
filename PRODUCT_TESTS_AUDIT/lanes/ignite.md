# Lane Audit: Ignite

## Lane Summary

- Audit status: `completed`
- Section start commit: `Add Ignite environment`
- Section end commit: `Remove legacy SuiteIgnite`
- Introduced JUnit suites: `SuiteIgnite`.
- Extended existing suites: none.
- Retired legacy suites: `SuiteIgnite`.
- Environment classes introduced: `IgniteEnvironment`.
- Method status counts: verified `1`, intentional difference `0`, needs follow-up `0`.

## Lane-Level Open Questions / Intentional Differences

- Lane-wide approved difference set: `Ignite upgrade`.
- Needs-follow-up methods: none currently identified in this source/history pass.

## Ported Test Classes

### `TestIgnite`

- Owning migration commit: `Migrate TestIgnite to JUnit`
- Current class added in same migration commit:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/ignite/TestIgnite.java`
- Legacy class removed in same migration commit:
    - `testing/trino-product-tests/src/main/java/io/trino/tests/product/ignite/TestIgnite.java`
- Class-level environment requirement: `IgniteEnvironment`.
- Class-level tags: `ConfiguredFeatures`, `Ignite`, `ProfileSpecificTests`.
- Method inventory complete: Yes. Legacy methods: `1`. Current methods: `1`.
- Legacy helper/resource dependencies accounted for: Legacy class source reviewed directly.
- Intentional differences summary: `Ignite upgrade`
- Method statuses present: `verified`.

#### Methods

##### `testCreateTableAsSelect`

- Legacy source method: `testing/trino-product-tests/src/main/java/io/trino/tests/product/ignite/TestIgnite.java` ->
  `testCreateTableAsSelect`
- Current target method: `testing/trino-product-tests/src/test/java/io/trino/tests/product/ignite/TestIgnite.java` ->
  `TestIgnite.testCreateTableAsSelect`
- Mapping type: `direct`
- Environment parity: Current class requires `IgniteEnvironment`. Routed by source review into `SuiteIgnite` run 1.
- Tag parity: Current tags: `ConfiguredFeatures`, `Ignite`, `ProfileSpecificTests`. Tag routing matches the current
  suite selection.
- Setup parity: Current setup operations: `CREATE`. Legacy setup operations: `CREATE`.
- Action parity: Current action verbs: `SELECT`. Legacy action verbs: `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `containsOnly`, `isEqualTo`, `row`. Legacy assertion
  helpers: `assertThat`, `containsOnly`, `row`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: Normalized body similarity is low (`0.31`), so fidelity was judged from
  SQL/helper/assertion shape instead of raw text. Assertion helper names differ between legacy and current
  implementations. Current method uses parameter-injected environment helpers instead of Tempto query executors.
- Known intentional difference: `Ignite upgrade`
- Reviewer note: Matched by current suite selection: `SuiteIgnite` run 1 Exact-name mapping with normalized body
  similarity `0.31`.
- Audit status: `verified`
