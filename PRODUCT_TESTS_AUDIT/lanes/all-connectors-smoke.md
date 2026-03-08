# Lane Audit: All Connectors Smoke

## Lane Summary

- Audit status: `completed`
- Section start commit: `Add All Connectors Smoke environment`
- Section end commit: `Remove legacy SuiteAllConnectorsSmoke`
- Introduced JUnit suites: `SuiteAllConnectorsSmoke`.
- Extended existing suites: none.
- Retired legacy suites: `SuiteAllConnectorsSmoke`.
- Environment classes introduced: `AllConnectorsSmokeEnvironment`.
- Method status counts: verified `1`, intentional difference `0`, needs follow-up `0`.

## Lane-Level Open Questions / Intentional Differences

- Lane-wide approved difference set: none beyond the framework baseline documented in the reviewer guide.
- Needs-follow-up methods: none currently identified in this source/history pass.

## Ported Test Classes

### `TestConfiguredFeaturesJunit`

- Owning migration commit: `Migrate TestConfiguredFeatures to JUnit`
- Current class added in same migration commit:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/TestConfiguredFeaturesJunit.java`
- Legacy class removed in same migration commit:
    - `testing/trino-product-tests/src/main/java/io/trino/tests/product/TestConfiguredFeatures.java`
- Class-level environment requirement: `AllConnectorsSmokeEnvironment`.
- Class-level tags: `ConfiguredFeatures`.
- Method inventory complete: Yes. Legacy methods: `1`. Current methods: `1`.
- Legacy helper/resource dependencies accounted for: Legacy class source reviewed directly.
- Intentional differences summary: None identified at class scope.
- Method statuses present: `verified`.

#### Methods

##### `selectConfiguredConnectors`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/TestConfiguredFeatures.java` ->
  `selectConfiguredConnectors`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/TestConfiguredFeaturesJunit.java` ->
  `TestConfiguredFeaturesJunit.selectConfiguredConnectors`
- Mapping type: `direct`
- Environment parity: Current class requires `AllConnectorsSmokeEnvironment`. No suite run selects this method from the
  current suite definitions.
- Tag parity: Current tags: `ConfiguredFeatures`. Tag routing needs no suite-level product-test claim.
- Setup parity: Current setup operations: none. Legacy setup operations: none.
- Action parity: Current action verbs: `SELECT`. Legacy action verbs: `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `containsOnly`, `row`. Legacy assertion helpers:
  `assertThat`, `containsOnly`.
- Cleanup parity: Current cleanup operations: none. No legacy cleanup method body was available.
- Any observed difference, however small: Normalized body similarity is low (`0.18`), so fidelity was judged from
  SQL/helper/assertion shape instead of raw text. Assertion helper names differ between legacy and current
  implementations. Current method uses parameter-injected environment helpers instead of Tempto query executors.
- Known intentional difference: None.
- Reviewer note: Exact-name mapping with normalized body similarity `0.18`.
- Audit status: `verified`
