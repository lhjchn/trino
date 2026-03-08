# Lane Audit: Exasol

## Lane Summary

- Audit status: `completed`
- Section start commit: `Add Exasol environment`
- Section end commit: `Remove legacy SuiteExasol`
- Introduced JUnit suites: `SuiteExasol`.
- Extended existing suites: none.
- Retired legacy suites: `SuiteExasol`.
- Environment classes introduced: `ExasolEnvironment`.
- Method status counts: verified `1`, intentional difference `0`, needs follow-up `0`.

## Lane-Level Open Questions / Intentional Differences

- Lane-wide approved difference set: none beyond the framework baseline documented in the reviewer guide.
- Needs-follow-up methods: none currently identified in this source/history pass.

## Ported Test Classes

### `TestExasol`

- Owning migration commit: `Migrate TestExasol to JUnit`
- Current class added in same migration commit:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/exasol/TestExasol.java`
- Legacy class removed in same migration commit:
    - `testing/trino-product-tests/src/main/java/io/trino/tests/product/exasol/TestExasol.java`
- Class-level environment requirement: `ExasolEnvironment`.
- Class-level tags: `ConfiguredFeatures`, `Exasol`, `ProfileSpecificTests`.
- Method inventory complete: Yes. Legacy methods: `1`. Current methods: `1`.
- Legacy helper/resource dependencies accounted for: Legacy class source reviewed directly.
- Intentional differences summary: None identified at class scope.
- Method statuses present: `verified`.

#### Methods

##### `testSelect`

- Legacy source method: `testing/trino-product-tests/src/main/java/io/trino/tests/product/exasol/TestExasol.java` ->
  `testSelect`
- Current target method: `testing/trino-product-tests/src/test/java/io/trino/tests/product/exasol/TestExasol.java` ->
  `TestExasol.testSelect`
- Mapping type: `direct`
- Environment parity: Current class requires `ExasolEnvironment`. Routed by source review into `SuiteExasol` run 1.
- Tag parity: Current tags: `ConfiguredFeatures`, `Exasol`, `ProfileSpecificTests`. Tag routing matches the current
  suite selection.
- Setup parity: Current setup operations: `CREATE`, `INSERT`. Legacy setup operations: `CREATE`, `INSERT`.
- Action parity: Current action verbs: `SELECT`. Legacy action verbs: `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `containsOnly`, `row`. Legacy assertion helpers:
  `assertThat`, `containsOnly`, `row`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: Current method uses parameter-injected environment helpers instead of Tempto
  query executors.
- Known intentional difference: None.
- Reviewer note: Matched by current suite selection: `SuiteExasol` run 1 Exact-name mapping with normalized body
  similarity `0.72`.
- Audit status: `verified`
