# Lane Audit: Ranger

## Lane Summary

- Audit status: `completed`
- Section start commit: `Add Ranger environment`
- Section end commit: `Remove legacy SuiteRanger`
- Introduced JUnit suites: `SuiteRanger`.
- Extended existing suites: none.
- Retired legacy suites: `SuiteRanger`.
- Environment classes introduced: `RangerEnvironment`.
- Method status counts: verified `1`, intentional difference `0`, needs follow-up `0`.

## Lane-Level Open Questions / Intentional Differences

- Lane-wide approved difference set: none beyond the framework baseline documented in the reviewer guide.
- Needs-follow-up methods: none currently identified in this source/history pass.

## Ported Test Classes

### `TestApacheRanger`

- Owning migration commit: `Migrate TestApacheRanger to JUnit`
- Current class added in same migration commit:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/ranger/TestApacheRanger.java`
- Legacy class removed in same migration commit:
    - `testing/trino-product-tests/src/main/java/io/trino/tests/product/ranger/TestApacheRanger.java`
- Class-level environment requirement: `RangerEnvironment`.
- Class-level tags: `ConfiguredFeatures`, `ProfileSpecificTests`, `Ranger`.
- Method inventory complete: Yes. Legacy methods: `1`. Current methods: `1`.
- Legacy helper/resource dependencies accounted for: Legacy class source reviewed directly.
- Intentional differences summary: None identified at class scope.
- Method statuses present: `verified`.

#### Methods

##### `testCreateTableAsSelect`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/ranger/TestApacheRanger.java` ->
  `testCreateTableAsSelect`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/ranger/TestApacheRanger.java` ->
  `TestApacheRanger.testCreateTableAsSelect`
- Mapping type: `direct`
- Environment parity: Current class requires `RangerEnvironment`. Routed by source review into `SuiteRanger` run 1.
- Tag parity: Current tags: `ConfiguredFeatures`, `ProfileSpecificTests`, `Ranger`. Tag routing matches the current
  suite selection.
- Setup parity: Current setup operations: `CREATE`, `INSERT`, `UPDATE`. Legacy setup operations: `CREATE`, `INSERT`,
  `UPDATE`.
- Action parity: Current action verbs: `SELECT`. Legacy action verbs: `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `assertThatThrownBy`, `containsOnly`, `isEqualTo`, `row`.
  Legacy assertion helpers: `assertThat`, `assertThatThrownBy`, `containsOnly`, `row`.
- Cleanup parity: Current cleanup operations: `DROP`, `DELETE`. Legacy cleanup operations: `DROP`, `DELETE`.
- Any observed difference, however small: Assertion helper names differ between legacy and current implementations.
  Current method uses parameter-injected environment helpers instead of Tempto query executors.
- Known intentional difference: None.
- Reviewer note: Matched by current suite selection: `SuiteRanger` run 1 Exact-name mapping with normalized body
  similarity `0.60`.
- Audit status: `verified`
