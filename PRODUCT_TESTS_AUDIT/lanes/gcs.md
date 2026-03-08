# Lane Audit: Gcs

## Lane Summary

- Audit status: `completed`
- Section start commit: `Add GCS environment`
- Section end commit: `Remove legacy SuiteGcs`
- Introduced JUnit suites: `SuiteGcs`.
- Extended existing suites: none.
- Retired legacy suites: `SuiteGcs`.
- Environment classes introduced: `GcsEnvironment`.
- Method status counts: verified `13`, intentional difference `0`, needs follow-up `0`.

## Lane-Level Open Questions / Intentional Differences

- Lane-wide approved difference set: `HDP to Hive 3.1 migration`.
- Needs-follow-up methods: none currently identified in this source/history pass.

## Ported Test Classes

### `TestHiveGcs`

- Owning migration commit: `Migrate TestHiveGcs to JUnit`
- Current class added in same migration commit:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestHiveGcs.java`
- Legacy class removed in same migration commit:
    - `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestHiveGcs.java`
- Class-level environment requirement: `GcsEnvironment`.
- Class-level tags: `ConfiguredFeatures`, `HiveGcs`, `ProfileSpecificTests`.
- Method inventory complete: Yes. Legacy methods: `4`. Current methods: `4`.
- Legacy helper/resource dependencies accounted for: Legacy class source reviewed directly.
- Intentional differences summary: None identified at class scope.
- Method statuses present: `verified`.

#### Methods

##### `testInsertTable`

- Legacy source method: `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestHiveGcs.java` ->
  `testInsertTable`
- Current target method: `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestHiveGcs.java` ->
  `TestHiveGcs.testInsertTable`
- Mapping type: `direct`
- Environment parity: Current class requires `GcsEnvironment`. Routed by source review into `SuiteGcs` run 3.
- Tag parity: Current tags: `ConfiguredFeatures`, `HiveGcs`, `ProfileSpecificTests`. Tag routing matches the current
  suite selection.
- Setup parity: Current setup operations: none. No legacy setup method body was available.
- Action parity: Current action verbs: none. No legacy action method body was available.
- Assertion parity: Current assertion helpers: none. No legacy assertion method body was available.
- Cleanup parity: Current cleanup operations: none. No legacy cleanup method body was available.
- Any observed difference, however small: No method-specific difference identified beyond the documented framework
  baseline.
- Known intentional difference: None.
- Reviewer note: Matched by current suite selection: `SuiteGcs` run 3 Exact-name mapping with normalized body similarity
  `0.63`.
- Audit status: `verified`

##### `testPathContainsSpecialCharacter`

- Legacy source method: `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestHiveGcs.java` ->
  `testPathContainsSpecialCharacter`
- Current target method: `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestHiveGcs.java` ->
  `TestHiveGcs.testPathContainsSpecialCharacter`
- Mapping type: `direct`
- Environment parity: Current class requires `GcsEnvironment`. Routed by source review into `SuiteGcs` run 3.
- Tag parity: Current tags: `ConfiguredFeatures`, `HiveGcs`, `ProfileSpecificTests`. Tag routing matches the current
  suite selection.
- Setup parity: Current setup operations: none. No legacy setup method body was available.
- Action parity: Current action verbs: none. No legacy action method body was available.
- Assertion parity: Current assertion helpers: none. No legacy assertion method body was available.
- Cleanup parity: Current cleanup operations: none. No legacy cleanup method body was available.
- Any observed difference, however small: No method-specific difference identified beyond the documented framework
  baseline.
- Known intentional difference: None.
- Reviewer note: Matched by current suite selection: `SuiteGcs` run 3 Exact-name mapping with normalized body similarity
  `0.69`.
- Audit status: `verified`

##### `testLocationContainsDiscouragedCharacter`

- Legacy source method: `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestHiveGcs.java` ->
  `testLocationContainsDiscouragedCharacter`
- Current target method: `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestHiveGcs.java` ->
  `TestHiveGcs.testLocationContainsDiscouragedCharacter`
- Mapping type: `direct`
- Environment parity: Current class requires `GcsEnvironment`. Routed by source review into `SuiteGcs` run 3.
- Tag parity: Current tags: `ConfiguredFeatures`, `HiveGcs`, `ProfileSpecificTests`. Tag routing matches the current
  suite selection.
- Setup parity: Current setup operations: none. No legacy setup method body was available.
- Action parity: Current action verbs: none. No legacy action method body was available.
- Assertion parity: Current assertion helpers: none. No legacy assertion method body was available.
- Cleanup parity: Current cleanup operations: none. No legacy cleanup method body was available.
- Any observed difference, however small: No method-specific difference identified beyond the documented framework
  baseline.
- Known intentional difference: None.
- Reviewer note: Matched by current suite selection: `SuiteGcs` run 3 Exact-name mapping with normalized body similarity
  `0.74`.
- Audit status: `verified`

##### `testSparkReadingTrinoData`

- Legacy source method: `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestHiveGcs.java` ->
  `testSparkReadingTrinoData`
- Current target method: `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestHiveGcs.java` ->
  `TestHiveGcs.testSparkReadingTrinoData`
- Mapping type: `direct`
- Environment parity: Current class requires `GcsEnvironment`. Routed by source review into `SuiteGcs` run 3.
- Tag parity: Current tags: `ConfiguredFeatures`, `HiveGcs`, `ProfileSpecificTests`. Tag routing matches the current
  suite selection.
- Setup parity: Current setup operations: none. No legacy setup method body was available.
- Action parity: Current action verbs: none. No legacy action method body was available.
- Assertion parity: Current assertion helpers: none. No legacy assertion method body was available.
- Cleanup parity: Current cleanup operations: none. No legacy cleanup method body was available.
- Any observed difference, however small: No method-specific difference identified beyond the documented framework
  baseline.
- Known intentional difference: None.
- Reviewer note: Matched by current suite selection: `SuiteGcs` run 3 Exact-name mapping with normalized body similarity
  `0.67`.
- Audit status: `verified`

### `TestIcebergGcs`

- Owning migration commit: `Migrate TestIcebergGcs to JUnit`
- Current class added in same migration commit:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/iceberg/TestIcebergGcs.java`
- Legacy class removed in same migration commit:
    - `testing/trino-product-tests/src/main/java/io/trino/tests/product/iceberg/TestIcebergGcs.java`
- Class-level environment requirement: `GcsEnvironment`.
- Class-level tags: `ConfiguredFeatures`, `IcebergGcs`, `ProfileSpecificTests`.
- Method inventory complete: Yes. Legacy methods: `5`. Current methods: `5`.
- Legacy helper/resource dependencies accounted for: Legacy class source reviewed directly.
- Intentional differences summary: None identified at class scope.
- Method statuses present: `verified`.

#### Methods

##### `testCreateAndSelectNationTable`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/iceberg/TestIcebergGcs.java` ->
  `testCreateAndSelectNationTable`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/iceberg/TestIcebergGcs.java` ->
  `TestIcebergGcs.testCreateAndSelectNationTable`
- Mapping type: `direct`
- Environment parity: Current class requires `GcsEnvironment`. Routed by source review into `SuiteGcs` run 2.
- Tag parity: Current tags: `ConfiguredFeatures`, `IcebergGcs`, `ProfileSpecificTests`. Tag routing matches the current
  suite selection.
- Setup parity: Current setup operations: none. No legacy setup method body was available.
- Action parity: Current action verbs: none. No legacy action method body was available.
- Assertion parity: Current assertion helpers: none. No legacy assertion method body was available.
- Cleanup parity: Current cleanup operations: none. No legacy cleanup method body was available.
- Any observed difference, however small: No method-specific difference identified beyond the documented framework
  baseline.
- Known intentional difference: None.
- Reviewer note: Matched by current suite selection: `SuiteGcs` run 2 Exact-name mapping with normalized body similarity
  `0.67`.
- Audit status: `verified`

##### `testBasicWriteOperations`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/iceberg/TestIcebergGcs.java` ->
  `testBasicWriteOperations`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/iceberg/TestIcebergGcs.java` ->
  `TestIcebergGcs.testBasicWriteOperations`
- Mapping type: `direct`
- Environment parity: Current class requires `GcsEnvironment`. Routed by source review into `SuiteGcs` run 2.
- Tag parity: Current tags: `ConfiguredFeatures`, `IcebergGcs`, `ProfileSpecificTests`. Tag routing matches the current
  suite selection.
- Setup parity: Current setup operations: none. No legacy setup method body was available.
- Action parity: Current action verbs: none. No legacy action method body was available.
- Assertion parity: Current assertion helpers: none. No legacy assertion method body was available.
- Cleanup parity: Current cleanup operations: none. No legacy cleanup method body was available.
- Any observed difference, however small: No method-specific difference identified beyond the documented framework
  baseline.
- Known intentional difference: None.
- Reviewer note: Matched by current suite selection: `SuiteGcs` run 2 Exact-name mapping with normalized body similarity
  `0.64`.
- Audit status: `verified`

##### `testPathContainsSpecialCharacter`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/iceberg/TestIcebergGcs.java` ->
  `testPathContainsSpecialCharacter`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/iceberg/TestIcebergGcs.java` ->
  `TestIcebergGcs.testPathContainsSpecialCharacter`
- Mapping type: `direct`
- Environment parity: Current class requires `GcsEnvironment`. Routed by source review into `SuiteGcs` run 2.
- Tag parity: Current tags: `ConfiguredFeatures`, `IcebergGcs`, `ProfileSpecificTests`. Tag routing matches the current
  suite selection.
- Setup parity: Current setup operations: none. No legacy setup method body was available.
- Action parity: Current action verbs: none. No legacy action method body was available.
- Assertion parity: Current assertion helpers: none. No legacy assertion method body was available.
- Cleanup parity: Current cleanup operations: none. No legacy cleanup method body was available.
- Any observed difference, however small: No method-specific difference identified beyond the documented framework
  baseline.
- Known intentional difference: None.
- Reviewer note: Matched by current suite selection: `SuiteGcs` run 2 Exact-name mapping with normalized body similarity
  `0.67`.
- Audit status: `verified`

##### `testLocationContainsDiscouragedCharacter`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/iceberg/TestIcebergGcs.java` ->
  `testLocationContainsDiscouragedCharacter`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/iceberg/TestIcebergGcs.java` ->
  `TestIcebergGcs.testLocationContainsDiscouragedCharacter`
- Mapping type: `direct`
- Environment parity: Current class requires `GcsEnvironment`. Routed by source review into `SuiteGcs` run 2.
- Tag parity: Current tags: `ConfiguredFeatures`, `IcebergGcs`, `ProfileSpecificTests`. Tag routing matches the current
  suite selection.
- Setup parity: Current setup operations: none. No legacy setup method body was available.
- Action parity: Current action verbs: none. No legacy action method body was available.
- Assertion parity: Current assertion helpers: none. No legacy assertion method body was available.
- Cleanup parity: Current cleanup operations: none. No legacy cleanup method body was available.
- Any observed difference, however small: No method-specific difference identified beyond the documented framework
  baseline.
- Known intentional difference: None.
- Reviewer note: Matched by current suite selection: `SuiteGcs` run 2 Exact-name mapping with normalized body similarity
  `0.72`.
- Audit status: `verified`

##### `testSparkReadingTrinoData`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/iceberg/TestIcebergGcs.java` ->
  `testSparkReadingTrinoData`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/iceberg/TestIcebergGcs.java` ->
  `TestIcebergGcs.testSparkReadingTrinoData`
- Mapping type: `direct`
- Environment parity: Current class requires `GcsEnvironment`. Routed by source review into `SuiteGcs` run 2.
- Tag parity: Current tags: `ConfiguredFeatures`, `IcebergGcs`, `ProfileSpecificTests`. Tag routing matches the current
  suite selection.
- Setup parity: Current setup operations: none. No legacy setup method body was available.
- Action parity: Current action verbs: none. No legacy action method body was available.
- Assertion parity: Current assertion helpers: none. No legacy assertion method body was available.
- Cleanup parity: Current cleanup operations: none. No legacy cleanup method body was available.
- Any observed difference, however small: No method-specific difference identified beyond the documented framework
  baseline.
- Known intentional difference: None.
- Reviewer note: Matched by current suite selection: `SuiteGcs` run 2 Exact-name mapping with normalized body similarity
  `0.67`.
- Audit status: `verified`

### `TestDeltaLakeGcs`

- Owning migration commit: `Migrate TestDeltaLakeGcs to JUnit`
- Current class added in same migration commit:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/deltalake/TestDeltaLakeGcs.java`
- Legacy class removed in same migration commit:
    - `testing/trino-product-tests/src/main/java/io/trino/tests/product/deltalake/TestDeltaLakeGcs.java`
- Class-level environment requirement: `GcsEnvironment`.
- Class-level tags: `ConfiguredFeatures`, `DeltaLakeGcs`, `ProfileSpecificTests`.
- Method inventory complete: Yes. Legacy methods: `4`. Current methods: `4`.
- Legacy helper/resource dependencies accounted for: Legacy class source reviewed directly.
- Intentional differences summary: None identified at class scope.
- Method statuses present: `verified`.

#### Methods

##### `testCreateAndSelectNationTable`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/deltalake/TestDeltaLakeGcs.java` ->
  `testCreateAndSelectNationTable`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/deltalake/TestDeltaLakeGcs.java` ->
  `TestDeltaLakeGcs.testCreateAndSelectNationTable`
- Mapping type: `direct`
- Environment parity: Current class requires `GcsEnvironment`. Routed by source review into `SuiteGcs` run 1.
- Tag parity: Current tags: `ConfiguredFeatures`, `DeltaLakeGcs`, `ProfileSpecificTests`. Tag routing matches the
  current suite selection.
- Setup parity: Current setup operations: none. No legacy setup method body was available.
- Action parity: Current action verbs: none. No legacy action method body was available.
- Assertion parity: Current assertion helpers: none. No legacy assertion method body was available.
- Cleanup parity: Current cleanup operations: none. No legacy cleanup method body was available.
- Any observed difference, however small: No method-specific difference identified beyond the documented framework
  baseline.
- Known intentional difference: None.
- Reviewer note: Matched by current suite selection: `SuiteGcs` run 1 Exact-name mapping with normalized body similarity
  `0.68`.
- Audit status: `verified`

##### `testBasicWriteOperations`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/deltalake/TestDeltaLakeGcs.java` ->
  `testBasicWriteOperations`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/deltalake/TestDeltaLakeGcs.java` ->
  `TestDeltaLakeGcs.testBasicWriteOperations`
- Mapping type: `direct`
- Environment parity: Current class requires `GcsEnvironment`. Routed by source review into `SuiteGcs` run 1.
- Tag parity: Current tags: `ConfiguredFeatures`, `DeltaLakeGcs`, `ProfileSpecificTests`. Tag routing matches the
  current suite selection.
- Setup parity: Current setup operations: none. No legacy setup method body was available.
- Action parity: Current action verbs: none. No legacy action method body was available.
- Assertion parity: Current assertion helpers: none. No legacy assertion method body was available.
- Cleanup parity: Current cleanup operations: none. No legacy cleanup method body was available.
- Any observed difference, however small: No method-specific difference identified beyond the documented framework
  baseline.
- Known intentional difference: None.
- Reviewer note: Matched by current suite selection: `SuiteGcs` run 1 Exact-name mapping with normalized body similarity
  `0.64`.
- Audit status: `verified`

##### `testPathContainsSpecialCharacter`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/deltalake/TestDeltaLakeGcs.java` ->
  `testPathContainsSpecialCharacter`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/deltalake/TestDeltaLakeGcs.java` ->
  `TestDeltaLakeGcs.testPathContainsSpecialCharacter`
- Mapping type: `direct`
- Environment parity: Current class requires `GcsEnvironment`. Routed by source review into `SuiteGcs` run 1.
- Tag parity: Current tags: `ConfiguredFeatures`, `DeltaLakeGcs`, `ProfileSpecificTests`. Tag routing matches the
  current suite selection.
- Setup parity: Current setup operations: none. No legacy setup method body was available.
- Action parity: Current action verbs: none. No legacy action method body was available.
- Assertion parity: Current assertion helpers: none. No legacy assertion method body was available.
- Cleanup parity: Current cleanup operations: none. No legacy cleanup method body was available.
- Any observed difference, however small: No method-specific difference identified beyond the documented framework
  baseline.
- Known intentional difference: None.
- Reviewer note: Matched by current suite selection: `SuiteGcs` run 1 Exact-name mapping with normalized body similarity
  `0.67`.
- Audit status: `verified`

##### `testLocationContainsDiscouragedCharacter`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/deltalake/TestDeltaLakeGcs.java` ->
  `testLocationContainsDiscouragedCharacter`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/deltalake/TestDeltaLakeGcs.java` ->
  `TestDeltaLakeGcs.testLocationContainsDiscouragedCharacter`
- Mapping type: `direct`
- Environment parity: Current class requires `GcsEnvironment`. Routed by source review into `SuiteGcs` run 1.
- Tag parity: Current tags: `ConfiguredFeatures`, `DeltaLakeGcs`, `ProfileSpecificTests`. Tag routing matches the
  current suite selection.
- Setup parity: Current setup operations: none. No legacy setup method body was available.
- Action parity: Current action verbs: none. No legacy action method body was available.
- Assertion parity: Current assertion helpers: none. No legacy assertion method body was available.
- Cleanup parity: Current cleanup operations: none. No legacy cleanup method body was available.
- Any observed difference, however small: No method-specific difference identified beyond the documented framework
  baseline.
- Known intentional difference: None.
- Reviewer note: Matched by current suite selection: `SuiteGcs` run 1 Exact-name mapping with normalized body similarity
  `0.72`.
- Audit status: `verified`
