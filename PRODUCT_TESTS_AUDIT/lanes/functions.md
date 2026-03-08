# Lane Audit: Functions

## Lane Summary

- Audit status: `completed`
- Section start commit: `Add Functions environment`
- Section end commit: `Remove legacy SuiteFunctions`
- Introduced JUnit suites: `SuiteFunctions`.
- Extended existing suites: none.
- Retired legacy suites: `SuiteFunctions`.
- Environment classes introduced: `FunctionsEnvironment`.
- Method status counts: verified `5`, intentional difference `0`, needs follow-up `0`.

## Lane-Level Open Questions / Intentional Differences

- Lane-wide approved difference set: none beyond the framework baseline documented in the reviewer guide.
- Needs-follow-up methods: none currently identified in this source/history pass.

## Ported Test Classes

### `TestTeradataFunctions`

- Owning migration commit: `Migrate TestTeradataFunctions to JUnit`
- Current class added in same migration commit:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/teradata/TestTeradataFunctions.java`
- Legacy class removed in same migration commit:
    - `testing/trino-product-tests/src/main/java/io/trino/tests/product/teradata/TestTeradataFunctions.java`
- Class-level environment requirement: `FunctionsEnvironment`.
- Class-level tags: `ConfiguredFeatures`, `Functions`.
- Method inventory complete: Yes. Legacy methods: `5`. Current methods: `5`.
- Legacy helper/resource dependencies accounted for: Legacy class source reviewed directly.
- Intentional differences summary: None identified at class scope.
- Method statuses present: `verified`.

#### Methods

##### `testIndex`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/teradata/TestTeradataFunctions.java` -> `testIndex`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/teradata/TestTeradataFunctions.java` ->
  `TestTeradataFunctions.testIndex`
- Mapping type: `direct`
- Environment parity: Current class requires `FunctionsEnvironment`. Routed by source review into `SuiteFunctions` run
    1.
- Tag parity: Current tags: `ConfiguredFeatures`, `Functions`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: none. Legacy setup operations: none.
- Action parity: Current action verbs: `SELECT`. Legacy action verbs: `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `contains`, `row`. Legacy assertion helpers: `assertThat`,
  `contains`, `row`.
- Cleanup parity: Current cleanup operations: none. No legacy cleanup method body was available.
- Any observed difference, however small: Current method uses parameter-injected environment helpers instead of Tempto
  query executors.
- Known intentional difference: None.
- Reviewer note: Matched by current suite selection: `SuiteFunctions` run 1 Exact-name mapping with normalized body
  similarity `0.78`.
- Audit status: `verified`

##### `testChar2HexInt`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/teradata/TestTeradataFunctions.java` ->
  `testChar2HexInt`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/teradata/TestTeradataFunctions.java` ->
  `TestTeradataFunctions.testChar2HexInt`
- Mapping type: `direct`
- Environment parity: Current class requires `FunctionsEnvironment`. Routed by source review into `SuiteFunctions` run
    1.
- Tag parity: Current tags: `ConfiguredFeatures`, `Functions`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: none. Legacy setup operations: none.
- Action parity: Current action verbs: `SELECT`. Legacy action verbs: `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `contains`, `row`. Legacy assertion helpers: `assertThat`,
  `contains`, `row`.
- Cleanup parity: Current cleanup operations: none. No legacy cleanup method body was available.
- Any observed difference, however small: Current method uses parameter-injected environment helpers instead of Tempto
  query executors.
- Known intentional difference: None.
- Reviewer note: Matched by current suite selection: `SuiteFunctions` run 1 Exact-name mapping with normalized body
  similarity `0.81`.
- Audit status: `verified`

##### `testToDate`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/teradata/TestTeradataFunctions.java` -> `testToDate`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/teradata/TestTeradataFunctions.java` ->
  `TestTeradataFunctions.testToDate`
- Mapping type: `direct`
- Environment parity: Current class requires `FunctionsEnvironment`. Routed by source review into `SuiteFunctions` run
    1.
- Tag parity: Current tags: `ConfiguredFeatures`, `Functions`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: none. Legacy setup operations: none.
- Action parity: Current action verbs: `SELECT`. Legacy action verbs: `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `contains`, `row`. Legacy assertion helpers: `assertThat`,
  `contains`, `row`.
- Cleanup parity: Current cleanup operations: none. No legacy cleanup method body was available.
- Any observed difference, however small: Current method uses parameter-injected environment helpers instead of Tempto
  query executors.
- Known intentional difference: None.
- Reviewer note: Matched by current suite selection: `SuiteFunctions` run 1 Exact-name mapping with normalized body
  similarity `0.87`.
- Audit status: `verified`

##### `testToTimestamp`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/teradata/TestTeradataFunctions.java` ->
  `testToTimestamp`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/teradata/TestTeradataFunctions.java` ->
  `TestTeradataFunctions.testToTimestamp`
- Mapping type: `direct`
- Environment parity: Current class requires `FunctionsEnvironment`. Routed by source review into `SuiteFunctions` run
    1.
- Tag parity: Current tags: `ConfiguredFeatures`, `Functions`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: none. Legacy setup operations: none.
- Action parity: Current action verbs: `SELECT`. Legacy action verbs: `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `contains`, `row`. Legacy assertion helpers: `assertThat`,
  `contains`, `row`.
- Cleanup parity: Current cleanup operations: none. No legacy cleanup method body was available.
- Any observed difference, however small: Current method uses parameter-injected environment helpers instead of Tempto
  query executors.
- Known intentional difference: None.
- Reviewer note: Matched by current suite selection: `SuiteFunctions` run 1 Exact-name mapping with normalized body
  similarity `0.79`.
- Audit status: `verified`

##### `testToChar`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/teradata/TestTeradataFunctions.java` -> `testToChar`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/teradata/TestTeradataFunctions.java` ->
  `TestTeradataFunctions.testToChar`
- Mapping type: `direct`
- Environment parity: Current class requires `FunctionsEnvironment`. Routed by source review into `SuiteFunctions` run
    1.
- Tag parity: Current tags: `ConfiguredFeatures`, `Functions`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: none. Legacy setup operations: none.
- Action parity: Current action verbs: `SELECT`. Legacy action verbs: `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `contains`, `row`. Legacy assertion helpers: `assertThat`,
  `contains`, `row`.
- Cleanup parity: Current cleanup operations: none. No legacy cleanup method body was available.
- Any observed difference, however small: Current method uses parameter-injected environment helpers instead of Tempto
  query executors.
- Known intentional difference: None.
- Reviewer note: Matched by current suite selection: `SuiteFunctions` run 1 Exact-name mapping with normalized body
  similarity `0.87`.
- Audit status: `verified`
