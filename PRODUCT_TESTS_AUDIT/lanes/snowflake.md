# Lane Audit: Snowflake

## Lane Summary

- Audit status: `completed`
- Section start commit: `Add Snowflake environment`
- Section end commit: `Remove legacy SuiteSnowflake`
- Introduced JUnit suites: `SuiteSnowflake`.
- Extended existing suites: none.
- Retired legacy suites: `SuiteSnowflake`.
- Environment classes introduced: `SnowflakeEnvironment`.
- Method status counts: verified `1`, intentional difference `0`, needs follow-up `0`.

## Lane-Level Open Questions / Intentional Differences

- Lane-wide approved difference set: none beyond the framework baseline documented in the reviewer guide.
- Needs-follow-up methods: none currently identified in this source/history pass.

## Ported Test Classes

### `TestSnowflake`

- Owning migration commit: `Migrate TestSnowflake to JUnit`
- Current class added in same migration commit:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/snowflake/TestSnowflake.java`
- Legacy class removed in same migration commit:
    - `testing/trino-product-tests/src/main/java/io/trino/tests/product/snowflake/TestSnowflake.java`
- Class-level environment requirement: `SnowflakeEnvironment`.
- Class-level tags: `ConfiguredFeatures`, `ProfileSpecificTests`, `Snowflake`.
- Method inventory complete: Yes. Legacy methods: `1`. Current methods: `1`.
- Legacy helper/resource dependencies accounted for: Legacy class source reviewed directly.
- Intentional differences summary: None identified at class scope.
- Method statuses present: `verified`.

#### Methods

##### `testCreateTableAsSelect`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/snowflake/TestSnowflake.java` ->
  `testCreateTableAsSelect`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/snowflake/TestSnowflake.java` ->
  `TestSnowflake.testCreateTableAsSelect`
- Mapping type: `direct`
- Environment parity: Current class requires `SnowflakeEnvironment`. Routed by source review into `SuiteSnowflake` run
    1.
- Tag parity: Current tags: `ConfiguredFeatures`, `ProfileSpecificTests`, `Snowflake`. Tag routing matches the current
  suite selection.
- Setup parity: Current setup operations: `CREATE`. Legacy setup operations: `CREATE`.
- Action parity: Current action verbs: `SELECT`. Legacy action verbs: `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `containsOnly`, `isEqualTo`, `row`. Legacy assertion
  helpers: `assertThat`, `containsOnly`, `row`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: Normalized body similarity is low (`0.28`), so fidelity was judged from
  SQL/helper/assertion shape instead of raw text. Assertion helper names differ between legacy and current
  implementations. Current method uses parameter-injected environment helpers instead of Tempto query executors.
- Known intentional difference: None.
- Reviewer note: Matched by current suite selection: `SuiteSnowflake` run 1 Exact-name mapping with normalized body
  similarity `0.28`.
- Audit status: `verified`
