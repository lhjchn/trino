# Lane Audit: Azure

## Lane Summary

- Audit status: `completed`
- Section start commit: `Add Azure environment`
- Section end commit: `Remove legacy SuiteAzure`
- Introduced JUnit suites: `SuiteAzure`.
- Extended existing suites: none.
- Retired legacy suites: `SuiteAzure`.
- Environment classes introduced: `AzureEnvironment`.
- Method status counts: verified `20`, intentional difference `0`, needs follow-up `0`.

## Lane-Level Open Questions / Intentional Differences

- Lane-wide approved difference set: `HDP to Hive 3.1 migration`.
- Needs-follow-up methods: none currently identified in this source/history pass.

## Ported Test Classes

### `TestHiveAzure`

- Owning migration commit: `Migrate TestHiveAzure to JUnit`
- Current class added in same migration commit:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestHiveAzure.java`
- Legacy class removed in same migration commit:
    - `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestHiveAzure.java`
- Class-level environment requirement: `AzureEnvironment`.
- Class-level tags: `Azure`, `ConfiguredFeatures`, `ProfileSpecificTests`.
- Method inventory complete: Yes. Legacy methods: `3`. Current methods: `3`.
- Legacy helper/resource dependencies accounted for: Legacy class source reviewed directly.
- Intentional differences summary: None identified at class scope.
- Method statuses present: `verified`.

#### Methods

##### `testInsertTable`

- Legacy source method: `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestHiveAzure.java` ->
  `testInsertTable`
- Current target method: `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestHiveAzure.java` ->
  `TestHiveAzure.testInsertTable`
- Mapping type: `direct`
- Environment parity: Current class requires `AzureEnvironment`. Routed by source review into `SuiteAzure` run 1.
- Tag parity: Current tags: `Azure`, `ConfiguredFeatures`, `ProfileSpecificTests`. Tag routing matches the current suite
  selection.
- Setup parity: Current setup operations: none. No legacy setup method body was available.
- Action parity: Current action verbs: none. No legacy action method body was available.
- Assertion parity: Current assertion helpers: none. No legacy assertion method body was available.
- Cleanup parity: Current cleanup operations: none. No legacy cleanup method body was available.
- Any observed difference, however small: No method-specific difference identified beyond the documented framework
  baseline.
- Known intentional difference: None.
- Reviewer note: Matched by current suite selection: `SuiteAzure` run 1 Exact-name mapping with normalized body
  similarity `0.61`.
- Audit status: `verified`

##### `testPathContainsSpecialCharacter`

- Legacy source method: `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestHiveAzure.java` ->
  `testPathContainsSpecialCharacter`
- Current target method: `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestHiveAzure.java` ->
  `TestHiveAzure.testPathContainsSpecialCharacter`
- Mapping type: `direct`
- Environment parity: Current class requires `AzureEnvironment`. Routed by source review into `SuiteAzure` run 1.
- Tag parity: Current tags: `Azure`, `ConfiguredFeatures`, `ProfileSpecificTests`. Tag routing matches the current suite
  selection.
- Setup parity: Current setup operations: none. No legacy setup method body was available.
- Action parity: Current action verbs: none. No legacy action method body was available.
- Assertion parity: Current assertion helpers: none. No legacy assertion method body was available.
- Cleanup parity: Current cleanup operations: none. No legacy cleanup method body was available.
- Any observed difference, however small: No method-specific difference identified beyond the documented framework
  baseline.
- Known intentional difference: None.
- Reviewer note: Matched by current suite selection: `SuiteAzure` run 1 Exact-name mapping with normalized body
  similarity `0.68`.
- Audit status: `verified`

##### `testSparkReadingTrinoData`

- Legacy source method: `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestHiveAzure.java` ->
  `testSparkReadingTrinoData`
- Current target method: `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestHiveAzure.java` ->
  `TestHiveAzure.testSparkReadingTrinoData`
- Mapping type: `direct`
- Environment parity: Current class requires `AzureEnvironment`. Routed by source review into `SuiteAzure` run 1.
- Tag parity: Current tags: `Azure`, `ConfiguredFeatures`, `ProfileSpecificTests`. Tag routing matches the current suite
  selection.
- Setup parity: Current setup operations: none. No legacy setup method body was available.
- Action parity: Current action verbs: none. No legacy action method body was available.
- Assertion parity: Current assertion helpers: none. No legacy assertion method body was available.
- Cleanup parity: Current cleanup operations: none. No legacy cleanup method body was available.
- Any observed difference, however small: No method-specific difference identified beyond the documented framework
  baseline.
- Known intentional difference: None.
- Reviewer note: Matched by current suite selection: `SuiteAzure` run 1 Exact-name mapping with normalized body
  similarity `0.68`.
- Audit status: `verified`

### `TestAzureBlobFileSystem`

- Owning migration commit: `Migrate TestAzureBlobFileSystem to JUnit`
- Current class added in same migration commit:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestAzureBlobFileSystem.java`
- Legacy class removed in same migration commit:
    - `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestAzureBlobFileSystem.java`
- Class-level environment requirement: `AzureEnvironment`.
- Class-level tags: `Azure`, `ConfiguredFeatures`.
- Method inventory complete: Yes. Legacy methods: `1`. Current methods: `1`.
- Legacy helper/resource dependencies accounted for: Legacy class source reviewed directly.
- Intentional differences summary: `HDP to Hive 3.1 migration`
- Method statuses present: `verified`.

#### Methods

##### `testPathContainsSpecialCharacter`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestAzureBlobFileSystem.java` ->
  `testPathContainsSpecialCharacter`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestAzureBlobFileSystem.java` ->
  `TestAzureBlobFileSystem.testPathContainsSpecialCharacter`
- Mapping type: `direct`
- Environment parity: Current class requires `AzureEnvironment`. Routed by source review into `SuiteAzure` run 1.
- Tag parity: Current tags: `Azure`, `ConfiguredFeatures`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`, `INSERT`. Legacy setup operations: `CREATE`, `INSERT`.
- Action parity: Current action verbs: `SELECT`. Legacy action verbs: `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `containsOnly`, `row`. Legacy assertion helpers:
  `assertThat`, `containsOnly`, `row`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: Current method uses parameter-injected environment helpers instead of Tempto
  query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`
- Reviewer note: Matched by current suite selection: `SuiteAzure` run 1 Exact-name mapping with normalized body
  similarity `0.82`.
- Audit status: `verified`

### `TestAbfsSyncPartitionMetadata`

- Owning migration commit: `Migrate TestAbfsSyncPartitionMetadata to JUnit`
- Current class added in same migration commit:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestAbfsSyncPartitionMetadata.java`
- Legacy class removed in same migration commit:
    - `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestAbfsSyncPartitionMetadata.java`
- Class-level environment requirement: `AzureEnvironment`.
- Class-level tags: `Azure`, `ConfiguredFeatures`.
- Method inventory complete: Yes. Legacy methods: `9`. Current methods: `9`.
- Legacy helper/resource dependencies accounted for: Legacy class source reviewed directly.
- Intentional differences summary: `HDP to Hive 3.1 migration`
- Method statuses present: `verified`.

#### Methods

##### `testAddPartition`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestAbfsSyncPartitionMetadata.java` ->
  `testAddPartition`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestAbfsSyncPartitionMetadata.java` ->
  `TestAbfsSyncPartitionMetadata.testAddPartition`
- Mapping type: `direct`
- Environment parity: Current class requires `AzureEnvironment`. Routed by source review into `SuiteAzure` run 1.
- Tag parity: Current tags: `Azure`, `ConfiguredFeatures`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: none. No legacy setup method body was available.
- Action parity: Current action verbs: `CALL`, `SELECT`. No legacy action method body was available.
- Assertion parity: Current assertion helpers: `assertPartitions`, `assertThatThrownBy`, `hasMessageContaining`, `row`.
  No legacy assertion method body was available.
- Cleanup parity: Current cleanup operations: none. No legacy cleanup method body was available.
- Any observed difference, however small: Normalized body similarity is low (`0.08`), so fidelity was judged from
  SQL/helper/assertion shape instead of raw text.
- Known intentional difference: `HDP to Hive 3.1 migration`
- Reviewer note: Matched by current suite selection: `SuiteAzure` run 1 Exact-name mapping with normalized body
  similarity `0.08`.
- Audit status: `verified`

##### `testAddPartitionContainingCharactersThatNeedUrlEncoding`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestAbfsSyncPartitionMetadata.java` ->
  `testAddPartitionContainingCharactersThatNeedUrlEncoding`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestAbfsSyncPartitionMetadata.java` ->
  `TestAbfsSyncPartitionMetadata.testAddPartitionContainingCharactersThatNeedUrlEncoding`
- Mapping type: `direct`
- Environment parity: Current class requires `AzureEnvironment`. Routed by source review into `SuiteAzure` run 1.
- Tag parity: Current tags: `Azure`, `ConfiguredFeatures`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`, `INSERT`. No legacy setup method body was available.
- Action parity: Current action verbs: `WITH`, `CALL`. No legacy action method body was available.
- Assertion parity: Current assertion helpers: `assertPartitions`, `row`. No legacy assertion method body was available.
- Cleanup parity: Current cleanup operations: `DROP`. No legacy cleanup method body was available.
- Any observed difference, however small: Normalized body similarity is low (`0.06`), so fidelity was judged from
  SQL/helper/assertion shape instead of raw text.
- Known intentional difference: `HDP to Hive 3.1 migration`
- Reviewer note: Matched by current suite selection: `SuiteAzure` run 1 Exact-name mapping with normalized body
  similarity `0.06`.
- Audit status: `verified`

##### `testDropPartition`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestAbfsSyncPartitionMetadata.java` ->
  `testDropPartition`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestAbfsSyncPartitionMetadata.java` ->
  `TestAbfsSyncPartitionMetadata.testDropPartition`
- Mapping type: `direct`
- Environment parity: Current class requires `AzureEnvironment`. Routed by source review into `SuiteAzure` run 1.
- Tag parity: Current tags: `Azure`, `ConfiguredFeatures`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: none. No legacy setup method body was available.
- Action parity: Current action verbs: `CALL`. No legacy action method body was available.
- Assertion parity: Current assertion helpers: `assertData`, `assertPartitions`, `row`. No legacy assertion method body
  was available.
- Cleanup parity: Current cleanup operations: none. No legacy cleanup method body was available.
- Any observed difference, however small: Normalized body similarity is low (`0.04`), so fidelity was judged from
  SQL/helper/assertion shape instead of raw text.
- Known intentional difference: `HDP to Hive 3.1 migration`
- Reviewer note: Matched by current suite selection: `SuiteAzure` run 1 Exact-name mapping with normalized body
  similarity `0.04`.
- Audit status: `verified`

##### `testDropPartitionContainingCharactersThatNeedUrlEncoding`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestAbfsSyncPartitionMetadata.java` ->
  `testDropPartitionContainingCharactersThatNeedUrlEncoding`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestAbfsSyncPartitionMetadata.java` ->
  `TestAbfsSyncPartitionMetadata.testDropPartitionContainingCharactersThatNeedUrlEncoding`
- Mapping type: `direct`
- Environment parity: Current class requires `AzureEnvironment`. Routed by source review into `SuiteAzure` run 1.
- Tag parity: Current tags: `Azure`, `ConfiguredFeatures`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`, `INSERT`. No legacy setup method body was available.
- Action parity: Current action verbs: `WITH`, `CALL`. No legacy action method body was available.
- Assertion parity: Current assertion helpers: `assertPartitions`, `row`. No legacy assertion method body was available.
- Cleanup parity: Current cleanup operations: `DROP`, `DELETE`. No legacy cleanup method body was available.
- Any observed difference, however small: Normalized body similarity is low (`0.08`), so fidelity was judged from
  SQL/helper/assertion shape instead of raw text.
- Known intentional difference: `HDP to Hive 3.1 migration`
- Reviewer note: Matched by current suite selection: `SuiteAzure` run 1 Exact-name mapping with normalized body
  similarity `0.08`.
- Audit status: `verified`

##### `testFullSyncPartition`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestAbfsSyncPartitionMetadata.java` ->
  `testFullSyncPartition`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestAbfsSyncPartitionMetadata.java` ->
  `TestAbfsSyncPartitionMetadata.testFullSyncPartition`
- Mapping type: `direct`
- Environment parity: Current class requires `AzureEnvironment`. Routed by source review into `SuiteAzure` run 1.
- Tag parity: Current tags: `Azure`, `ConfiguredFeatures`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: none. No legacy setup method body was available.
- Action parity: Current action verbs: `CALL`. No legacy action method body was available.
- Assertion parity: Current assertion helpers: `assertData`, `assertPartitions`, `row`. No legacy assertion method body
  was available.
- Cleanup parity: Current cleanup operations: none. No legacy cleanup method body was available.
- Any observed difference, however small: Normalized body similarity is low (`0.16`), so fidelity was judged from
  SQL/helper/assertion shape instead of raw text.
- Known intentional difference: `HDP to Hive 3.1 migration`
- Reviewer note: Matched by current suite selection: `SuiteAzure` run 1 Exact-name mapping with normalized body
  similarity `0.16`.
- Audit status: `verified`

##### `testInvalidSyncMode`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestAbfsSyncPartitionMetadata.java` ->
  `testInvalidSyncMode`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestAbfsSyncPartitionMetadata.java` ->
  `TestAbfsSyncPartitionMetadata.testInvalidSyncMode`
- Mapping type: `direct`
- Environment parity: Current class requires `AzureEnvironment`. Routed by source review into `SuiteAzure` run 1.
- Tag parity: Current tags: `Azure`, `ConfiguredFeatures`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: none. No legacy setup method body was available.
- Action parity: Current action verbs: `CALL`. No legacy action method body was available.
- Assertion parity: Current assertion helpers: `assertThatThrownBy`, `hasMessageContaining`. No legacy assertion method
  body was available.
- Cleanup parity: Current cleanup operations: none. No legacy cleanup method body was available.
- Any observed difference, however small: Normalized body similarity is low (`0.05`), so fidelity was judged from
  SQL/helper/assertion shape instead of raw text.
- Known intentional difference: `HDP to Hive 3.1 migration`
- Reviewer note: Matched by current suite selection: `SuiteAzure` run 1 Exact-name mapping with normalized body
  similarity `0.05`.
- Audit status: `verified`

##### `testMixedCasePartitionNames`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestAbfsSyncPartitionMetadata.java` ->
  `testMixedCasePartitionNames`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestAbfsSyncPartitionMetadata.java` ->
  `TestAbfsSyncPartitionMetadata.testMixedCasePartitionNames`
- Mapping type: `direct`
- Environment parity: Current class requires `AzureEnvironment`. Routed by source review into `SuiteAzure` run 1.
- Tag parity: Current tags: `Azure`, `ConfiguredFeatures`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: none. No legacy setup method body was available.
- Action parity: Current action verbs: `CALL`. No legacy action method body was available.
- Assertion parity: Current assertion helpers: `assertData`, `assertPartitions`, `row`. No legacy assertion method body
  was available.
- Cleanup parity: Current cleanup operations: none. No legacy cleanup method body was available.
- Any observed difference, however small: Normalized body similarity is low (`0.10`), so fidelity was judged from
  SQL/helper/assertion shape instead of raw text.
- Known intentional difference: `HDP to Hive 3.1 migration`
- Reviewer note: Matched by current suite selection: `SuiteAzure` run 1 Exact-name mapping with normalized body
  similarity `0.10`.
- Audit status: `verified`

##### `testConflictingMixedCasePartitionNames`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestAbfsSyncPartitionMetadata.java` ->
  `testConflictingMixedCasePartitionNames`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestAbfsSyncPartitionMetadata.java` ->
  `TestAbfsSyncPartitionMetadata.testConflictingMixedCasePartitionNames`
- Mapping type: `direct`
- Environment parity: Current class requires `AzureEnvironment`. Routed by source review into `SuiteAzure` run 1.
- Tag parity: Current tags: `Azure`, `ConfiguredFeatures`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: none. No legacy setup method body was available.
- Action parity: Current action verbs: `CALL`. No legacy action method body was available.
- Assertion parity: Current assertion helpers: `assertPartitions`, `assertThatThrownBy`, `hasMessageContaining`, `row`.
  No legacy assertion method body was available.
- Cleanup parity: Current cleanup operations: none. No legacy cleanup method body was available.
- Any observed difference, however small: Normalized body similarity is low (`0.18`), so fidelity was judged from
  SQL/helper/assertion shape instead of raw text.
- Known intentional difference: `HDP to Hive 3.1 migration`
- Reviewer note: Matched by current suite selection: `SuiteAzure` run 1 Exact-name mapping with normalized body
  similarity `0.18`.
- Audit status: `verified`

##### `testSyncPartitionMetadataWithNullArgument`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestAbfsSyncPartitionMetadata.java` ->
  `testSyncPartitionMetadataWithNullArgument`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestAbfsSyncPartitionMetadata.java` ->
  `TestAbfsSyncPartitionMetadata.testSyncPartitionMetadataWithNullArgument`
- Mapping type: `direct`
- Environment parity: Current class requires `AzureEnvironment`. Routed by source review into `SuiteAzure` run 1.
- Tag parity: Current tags: `Azure`, `ConfiguredFeatures`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: none. No legacy setup method body was available.
- Action parity: Current action verbs: `CALL`. No legacy action method body was available.
- Assertion parity: Current assertion helpers: `assertThatThrownBy`. No legacy assertion method body was available.
- Cleanup parity: Current cleanup operations: none. No legacy cleanup method body was available.
- Any observed difference, however small: Normalized body similarity is low (`0.05`), so fidelity was judged from
  SQL/helper/assertion shape instead of raw text.
- Known intentional difference: `HDP to Hive 3.1 migration`
- Reviewer note: Matched by current suite selection: `SuiteAzure` run 1 Exact-name mapping with normalized body
  similarity `0.05`.
- Audit status: `verified`

### `TestIcebergAzure`

- Owning migration commit: `Migrate TestIcebergAzure to JUnit`
- Current class added in same migration commit:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/iceberg/TestIcebergAzure.java`
- Legacy class removed in same migration commit:
    - `testing/trino-product-tests/src/main/java/io/trino/tests/product/iceberg/TestIcebergAzure.java`
- Class-level environment requirement: `AzureEnvironment`.
- Class-level tags: `ConfiguredFeatures`, `IcebergAzure`, `ProfileSpecificTests`.
- Method inventory complete: Yes. Legacy methods: `4`. Current methods: `4`.
- Legacy helper/resource dependencies accounted for: Legacy class source reviewed directly.
- Intentional differences summary: None identified at class scope.
- Method statuses present: `verified`.

#### Methods

##### `testCreateAndSelectNationTable`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/iceberg/TestIcebergAzure.java` ->
  `testCreateAndSelectNationTable`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/iceberg/TestIcebergAzure.java` ->
  `TestIcebergAzure.testCreateAndSelectNationTable`
- Mapping type: `direct`
- Environment parity: Current class requires `AzureEnvironment`. Routed by source review into `SuiteAzure` run 3.
- Tag parity: Current tags: `ConfiguredFeatures`, `IcebergAzure`, `ProfileSpecificTests`. Tag routing matches the
  current suite selection.
- Setup parity: Current setup operations: none. No legacy setup method body was available.
- Action parity: Current action verbs: none. No legacy action method body was available.
- Assertion parity: Current assertion helpers: none. No legacy assertion method body was available.
- Cleanup parity: Current cleanup operations: none. No legacy cleanup method body was available.
- Any observed difference, however small: No method-specific difference identified beyond the documented framework
  baseline.
- Known intentional difference: None.
- Reviewer note: Matched by current suite selection: `SuiteAzure` run 3 Exact-name mapping with normalized body
  similarity `0.67`.
- Audit status: `verified`

##### `testBasicWriteOperations`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/iceberg/TestIcebergAzure.java` ->
  `testBasicWriteOperations`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/iceberg/TestIcebergAzure.java` ->
  `TestIcebergAzure.testBasicWriteOperations`
- Mapping type: `direct`
- Environment parity: Current class requires `AzureEnvironment`. Routed by source review into `SuiteAzure` run 3.
- Tag parity: Current tags: `ConfiguredFeatures`, `IcebergAzure`, `ProfileSpecificTests`. Tag routing matches the
  current suite selection.
- Setup parity: Current setup operations: none. No legacy setup method body was available.
- Action parity: Current action verbs: none. No legacy action method body was available.
- Assertion parity: Current assertion helpers: none. No legacy assertion method body was available.
- Cleanup parity: Current cleanup operations: none. No legacy cleanup method body was available.
- Any observed difference, however small: No method-specific difference identified beyond the documented framework
  baseline.
- Known intentional difference: None.
- Reviewer note: Matched by current suite selection: `SuiteAzure` run 3 Exact-name mapping with normalized body
  similarity `0.64`.
- Audit status: `verified`

##### `testPathContainsSpecialCharacter`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/iceberg/TestIcebergAzure.java` ->
  `testPathContainsSpecialCharacter`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/iceberg/TestIcebergAzure.java` ->
  `TestIcebergAzure.testPathContainsSpecialCharacter`
- Mapping type: `direct`
- Environment parity: Current class requires `AzureEnvironment`. Routed by source review into `SuiteAzure` run 3.
- Tag parity: Current tags: `ConfiguredFeatures`, `IcebergAzure`, `ProfileSpecificTests`. Tag routing matches the
  current suite selection.
- Setup parity: Current setup operations: none. No legacy setup method body was available.
- Action parity: Current action verbs: none. No legacy action method body was available.
- Assertion parity: Current assertion helpers: none. No legacy assertion method body was available.
- Cleanup parity: Current cleanup operations: none. No legacy cleanup method body was available.
- Any observed difference, however small: No method-specific difference identified beyond the documented framework
  baseline.
- Known intentional difference: None.
- Reviewer note: Matched by current suite selection: `SuiteAzure` run 3 Exact-name mapping with normalized body
  similarity `0.67`.
- Audit status: `verified`

##### `testSparkReadingTrinoData`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/iceberg/TestIcebergAzure.java` ->
  `testSparkReadingTrinoData`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/iceberg/TestIcebergAzure.java` ->
  `TestIcebergAzure.testSparkReadingTrinoData`
- Mapping type: `direct`
- Environment parity: Current class requires `AzureEnvironment`. Routed by source review into `SuiteAzure` run 3.
- Tag parity: Current tags: `ConfiguredFeatures`, `IcebergAzure`, `ProfileSpecificTests`. Tag routing matches the
  current suite selection.
- Setup parity: Current setup operations: none. No legacy setup method body was available.
- Action parity: Current action verbs: none. No legacy action method body was available.
- Assertion parity: Current assertion helpers: none. No legacy assertion method body was available.
- Cleanup parity: Current cleanup operations: none. No legacy cleanup method body was available.
- Any observed difference, however small: No method-specific difference identified beyond the documented framework
  baseline.
- Known intentional difference: None.
- Reviewer note: Matched by current suite selection: `SuiteAzure` run 3 Exact-name mapping with normalized body
  similarity `0.65`.
- Audit status: `verified`

### `TestDeltaLakeAzure`

- Owning migration commit: `Migrate TestDeltaLakeAzure to JUnit`
- Current class added in same migration commit:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/deltalake/TestDeltaLakeAzure.java`
- Legacy class removed in same migration commit:
    - `testing/trino-product-tests/src/main/java/io/trino/tests/product/deltalake/TestDeltaLakeAzure.java`
- Class-level environment requirement: `AzureEnvironment`.
- Class-level tags: `ConfiguredFeatures`, `DeltaLakeAzure`, `ProfileSpecificTests`.
- Method inventory complete: Yes. Legacy methods: `3`. Current methods: `3`.
- Legacy helper/resource dependencies accounted for: Legacy class source reviewed directly.
- Intentional differences summary: None identified at class scope.
- Method statuses present: `verified`.

#### Methods

##### `testCreateAndSelectNationTable`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/deltalake/TestDeltaLakeAzure.java` ->
  `testCreateAndSelectNationTable`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/deltalake/TestDeltaLakeAzure.java` ->
  `TestDeltaLakeAzure.testCreateAndSelectNationTable`
- Mapping type: `direct`
- Environment parity: Current class requires `AzureEnvironment`. Routed by source review into `SuiteAzure` run 2.
- Tag parity: Current tags: `ConfiguredFeatures`, `DeltaLakeAzure`, `ProfileSpecificTests`. Tag routing matches the
  current suite selection.
- Setup parity: Current setup operations: none. No legacy setup method body was available.
- Action parity: Current action verbs: none. No legacy action method body was available.
- Assertion parity: Current assertion helpers: none. No legacy assertion method body was available.
- Cleanup parity: Current cleanup operations: none. No legacy cleanup method body was available.
- Any observed difference, however small: No method-specific difference identified beyond the documented framework
  baseline.
- Known intentional difference: None.
- Reviewer note: Matched by current suite selection: `SuiteAzure` run 2 Exact-name mapping with normalized body
  similarity `0.68`.
- Audit status: `verified`

##### `testBasicWriteOperations`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/deltalake/TestDeltaLakeAzure.java` ->
  `testBasicWriteOperations`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/deltalake/TestDeltaLakeAzure.java` ->
  `TestDeltaLakeAzure.testBasicWriteOperations`
- Mapping type: `direct`
- Environment parity: Current class requires `AzureEnvironment`. Routed by source review into `SuiteAzure` run 2.
- Tag parity: Current tags: `ConfiguredFeatures`, `DeltaLakeAzure`, `ProfileSpecificTests`. Tag routing matches the
  current suite selection.
- Setup parity: Current setup operations: none. No legacy setup method body was available.
- Action parity: Current action verbs: none. No legacy action method body was available.
- Assertion parity: Current assertion helpers: none. No legacy assertion method body was available.
- Cleanup parity: Current cleanup operations: none. No legacy cleanup method body was available.
- Any observed difference, however small: No method-specific difference identified beyond the documented framework
  baseline.
- Known intentional difference: None.
- Reviewer note: Matched by current suite selection: `SuiteAzure` run 2 Exact-name mapping with normalized body
  similarity `0.64`.
- Audit status: `verified`

##### `testPathContainsSpecialCharacter`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/deltalake/TestDeltaLakeAzure.java` ->
  `testPathContainsSpecialCharacter`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/deltalake/TestDeltaLakeAzure.java` ->
  `TestDeltaLakeAzure.testPathContainsSpecialCharacter`
- Mapping type: `direct`
- Environment parity: Current class requires `AzureEnvironment`. Routed by source review into `SuiteAzure` run 2.
- Tag parity: Current tags: `ConfiguredFeatures`, `DeltaLakeAzure`, `ProfileSpecificTests`. Tag routing matches the
  current suite selection.
- Setup parity: Current setup operations: none. No legacy setup method body was available.
- Action parity: Current action verbs: none. No legacy action method body was available.
- Assertion parity: Current assertion helpers: none. No legacy assertion method body was available.
- Cleanup parity: Current cleanup operations: none. No legacy cleanup method body was available.
- Any observed difference, however small: No method-specific difference identified beyond the documented framework
  baseline.
- Known intentional difference: None.
- Reviewer note: Matched by current suite selection: `SuiteAzure` run 2 Exact-name mapping with normalized body
  similarity `0.67`.
- Audit status: `verified`
