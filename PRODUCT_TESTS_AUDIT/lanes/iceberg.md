# Lane Audit: Iceberg

## Lane Summary

- Audit status: `completed`
- Section start commit: `Add Iceberg environment runtime support`
- Section end commit: `Remove legacy SuiteIceberg`
- Introduced JUnit suites: `SuiteIceberg`.
- Extended existing suites: none.
- Retired legacy suites: `SuiteIceberg`.
- Environment classes introduced: `MultiNodeIcebergMinioCachingEnvironment`, `SparkIcebergEnvironment`,
  `SparkIcebergJdbcCatalogEnvironment`, `SparkIcebergNessieEnvironment`, `SparkIcebergRestEnvironment`.
- Method status counts: verified `143`, intentional difference `0`, needs follow-up `0`.

## Lane-Level Open Questions / Intentional Differences

- Lane-wide approved difference set: `HDP to Hive 3.1 migration`.
- Needs-follow-up methods: none currently identified in this source/history pass.

## Ported Test Classes

### `TestCreateDropSchema`

- Owning migration commit: `Migrate TestCreateDropSchema to JUnit`
- Current class added in same migration commit:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/iceberg/TestCreateDropSchema.java`
- Legacy class removed in same migration commit:
    - `testing/trino-product-tests/src/main/java/io/trino/tests/product/iceberg/TestCreateDropSchema.java`
- Class-level environment requirement: `SparkIcebergEnvironment`.
- Class-level tags: `Iceberg`.
- Method inventory complete: Yes. Legacy methods: `4`. Current methods: `4`.
- Legacy helper/resource dependencies accounted for: Legacy class source reviewed directly.
- Intentional differences summary: `HDP to Hive 3.1 migration`
- Method statuses present: `verified`.

#### Methods

##### `testDropSchemaFiles`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/iceberg/TestCreateDropSchema.java` ->
  `testDropSchemaFiles`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/iceberg/TestCreateDropSchema.java` ->
  `TestCreateDropSchema.testDropSchemaFiles`
- Mapping type: `direct`
- Environment parity: Current class requires `SparkIcebergEnvironment`. Routed by source review into `SuiteIceberg` run
    1.
- Tag parity: Current tags: `Iceberg`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`. Legacy setup operations: `CREATE`.
- Action parity: Current action verbs: none. Legacy action verbs: none.
- Assertion parity: Current assertion helpers: `assertFileExistence`. Legacy assertion helpers: `assertFileExistence`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: Current method uses parameter-injected environment helpers instead of Tempto
  query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`
- Reviewer note: Matched by current suite selection: `SuiteIceberg` run 1 Exact-name mapping with normalized body
  similarity `0.74`.
- Audit status: `verified`

##### `testDropSchemaFilesWithLocation`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/iceberg/TestCreateDropSchema.java` ->
  `testDropSchemaFilesWithLocation`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/iceberg/TestCreateDropSchema.java` ->
  `TestCreateDropSchema.testDropSchemaFilesWithLocation`
- Mapping type: `direct`
- Environment parity: Current class requires `SparkIcebergEnvironment`. Routed by source review into `SuiteIceberg` run
    1.
- Tag parity: Current tags: `Iceberg`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`. Legacy setup operations: `CREATE`.
- Action parity: Current action verbs: none. Legacy action verbs: none.
- Assertion parity: Current assertion helpers: `assertFileExistence`. Legacy assertion helpers: `assertFileExistence`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: Normalized body similarity is low (`0.53`), so fidelity was judged from
  SQL/helper/assertion shape instead of raw text. Current method uses parameter-injected environment helpers instead of
  Tempto query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`
- Reviewer note: Matched by current suite selection: `SuiteIceberg` run 1 Exact-name mapping with normalized body
  similarity `0.53`.
- Audit status: `verified`

##### `testDropWithExternalFilesInSubdirectory`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/iceberg/TestCreateDropSchema.java` ->
  `testDropWithExternalFilesInSubdirectory`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/iceberg/TestCreateDropSchema.java` ->
  `TestCreateDropSchema.testDropWithExternalFilesInSubdirectory`
- Mapping type: `direct`
- Environment parity: Current class requires `SparkIcebergEnvironment`. Routed by source review into `SuiteIceberg` run
    1.
- Tag parity: Current tags: `Iceberg`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`. Legacy setup operations: `CREATE`.
- Action parity: Current action verbs: none. Legacy action verbs: none.
- Assertion parity: Current assertion helpers: `assertFileExistence`. Legacy assertion helpers: `assertFileExistence`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: Current method uses parameter-injected environment helpers instead of Tempto
  query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`
- Reviewer note: Matched by current suite selection: `SuiteIceberg` run 1 Exact-name mapping with normalized body
  similarity `0.71`.
- Audit status: `verified`

##### `testDropWithExternalFiles`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/iceberg/TestCreateDropSchema.java` ->
  `testDropWithExternalFiles`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/iceberg/TestCreateDropSchema.java` ->
  `TestCreateDropSchema.testDropWithExternalFiles`
- Mapping type: `direct`
- Environment parity: Current class requires `SparkIcebergEnvironment`. Routed by source review into `SuiteIceberg` run
    1.
- Tag parity: Current tags: `Iceberg`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`. Legacy setup operations: `CREATE`.
- Action parity: Current action verbs: none. Legacy action verbs: none.
- Assertion parity: Current assertion helpers: `assertFileExistence`. Legacy assertion helpers: `assertFileExistence`,
  `assertQuerySucceeds`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: Assertion helper names differ between legacy and current implementations.
  Current method uses parameter-injected environment helpers instead of Tempto query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`
- Reviewer note: Matched by current suite selection: `SuiteIceberg` run 1 Exact-name mapping with normalized body
  similarity `0.84`.
- Audit status: `verified`

### `TestIcebergAlluxioCaching`

- Owning migration commit: `Migrate TestIcebergAlluxioCaching to JUnit`
- Current class added in same migration commit:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/iceberg/TestIcebergAlluxioCaching.java`
- Legacy class removed in same migration commit:
    - `testing/trino-product-tests/src/main/java/io/trino/tests/product/iceberg/TestIcebergAlluxioCaching.java`
- Class-level environment requirement: `MultiNodeIcebergMinioCachingEnvironment`.
- Class-level tags: `IcebergAlluxioCaching`.
- Method inventory complete: Yes. Legacy methods: `1`. Current methods: `1`.
- Legacy helper/resource dependencies accounted for: Legacy class source reviewed directly.
- Intentional differences summary: None identified at class scope.
- Method statuses present: `verified`.

#### Methods

##### `testReadFromCache`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/iceberg/TestIcebergAlluxioCaching.java` ->
  `testReadFromCache`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/iceberg/TestIcebergAlluxioCaching.java` ->
  `TestIcebergAlluxioCaching.testReadFromCache`
- Mapping type: `direct`
- Environment parity: Current class requires `MultiNodeIcebergMinioCachingEnvironment`. Routed by source review into
  `SuiteIceberg` run 6.
- Tag parity: Current tags: `IcebergAlluxioCaching`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: none. No legacy setup method body was available.
- Action parity: Current action verbs: none. No legacy action method body was available.
- Assertion parity: Current assertion helpers: none. No legacy assertion method body was available.
- Cleanup parity: Current cleanup operations: none. No legacy cleanup method body was available.
- Any observed difference, however small: No method-specific difference identified beyond the documented framework
  baseline.
- Known intentional difference: None.
- Reviewer note: Matched by current suite selection: `SuiteIceberg` run 6 Exact-name mapping with normalized body
  similarity `0.58`.
- Audit status: `verified`

### `TestIcebergFormatVersionCompatibility`

- Owning migration commit: `Migrate TestIcebergFormatVersionCompatibility to JUnit`
- Current class added in same migration commit:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/iceberg/TestIcebergFormatVersionCompatibility.java`
- Legacy class removed in same migration commit:
  -
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/iceberg/TestIcebergFormatVersionCompatibility.java`
- Class-level environment requirement: `SparkIcebergCompatibilityEnvironment`.
- Class-level tags: `Iceberg`, `IcebergFormatVersionCompatibility`.
- Method inventory complete: Yes. Legacy methods: `1`. Current methods: `1`.
- Legacy helper/resource dependencies accounted for: Legacy class source reviewed directly.
- Intentional differences summary: `HDP to Hive 3.1 migration`
- Method statuses present: `verified`.

#### Methods

##### `testTrinoTimeTravelReadTableCreatedByEarlyVersionTrino`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/iceberg/TestIcebergFormatVersionCompatibility.java` ->
  `testTrinoTimeTravelReadTableCreatedByEarlyVersionTrino`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/iceberg/TestIcebergFormatVersionCompatibility.java` ->
  `TestIcebergFormatVersionCompatibility.testTrinoTimeTravelReadTableCreatedByEarlyVersionTrino`
- Mapping type: `direct`
- Environment parity: Current class requires `SparkIcebergCompatibilityEnvironment`. Routed by source review into
  `SuiteCompatibility` run 2.
- Tag parity: Current tags: `Iceberg`, `IcebergFormatVersionCompatibility`. Tag routing matches the current suite
  selection.
- Setup parity: Current setup operations: `CREATE`, `INSERT`. Legacy setup operations: `CREATE`, `INSERT`.
- Action parity: Current action verbs: `SELECT`. Legacy action verbs: `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `containsOnly`, `row`. Legacy assertion helpers:
  `assertThat`, `containsOnly`, `row`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: Normalized body similarity is low (`0.40`), so fidelity was judged from
  SQL/helper/assertion shape instead of raw text. Current method uses parameter-injected environment helpers instead of
  Tempto query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`
- Reviewer note: Matched by current suite selection: `SuiteCompatibility` run 2 Exact-name mapping with normalized body
  similarity `0.40`.
- Audit status: `verified`

### `TestIcebergHiveMetadataListing`

- Owning migration commit: `Migrate TestIcebergHiveMetadataListing to JUnit`
- Current class added in same migration commit:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/iceberg/TestIcebergHiveMetadataListing.java`
- Legacy class removed in same migration commit:
    - `testing/trino-product-tests/src/main/java/io/trino/tests/product/iceberg/TestIcebergHiveMetadataListing.java`
- Class-level environment requirement: `HiveIcebergRedirectionsEnvironment`.
- Class-level tags: `HiveIcebergRedirections`.
- Method inventory complete: Yes. Legacy methods: `2`. Current methods: `2`.
- Legacy helper/resource dependencies accounted for: Legacy class source reviewed directly.
- Intentional differences summary: `HDP to Hive 3.1 migration`
- Method statuses present: `verified`.

#### Methods

##### `testTableListing`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/iceberg/TestIcebergHiveMetadataListing.java` ->
  `testTableListing`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/iceberg/TestIcebergHiveMetadataListing.java` ->
  `TestIcebergHiveMetadataListing.testTableListing`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveIcebergRedirectionsEnvironment`. Routed by source review into
  `SuiteIceberg` run 2.
- Tag parity: Current tags: `HiveIcebergRedirections`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`. Legacy setup operations: none.
- Action parity: Current action verbs: `SHOW`, `SELECT`. Legacy action verbs: `SHOW`.
- Assertion parity: Current assertion helpers: `assertThat`, `containsOnly`, `row`. Legacy assertion helpers:
  `assertThat`, `containsOnly`, `row`.
- Cleanup parity: Current cleanup operations: none. No legacy cleanup method body was available.
- Any observed difference, however small: Normalized body similarity is low (`0.07`), so fidelity was judged from
  SQL/helper/assertion shape instead of raw text. SQL verb set differs: legacy ['SHOW'] vs
  current ['SHOW', 'CREATE', 'SELECT']. Current method uses parameter-injected environment helpers instead of Tempto
  query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`
- Reviewer note: Matched by current suite selection: `SuiteIceberg` run 2 Exact-name mapping with normalized body
  similarity `0.07`.
- Audit status: `verified`

##### `testColumnListing`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/iceberg/TestIcebergHiveMetadataListing.java` ->
  `testColumnListing`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/iceberg/TestIcebergHiveMetadataListing.java` ->
  `TestIcebergHiveMetadataListing.testColumnListing`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveIcebergRedirectionsEnvironment`. Routed by source review into
  `SuiteIceberg` run 2.
- Tag parity: Current tags: `HiveIcebergRedirections`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`. Legacy setup operations: none.
- Action parity: Current action verbs: `SELECT`. Legacy action verbs: `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `containsOnly`, `row`. Legacy assertion helpers:
  `assertThat`, `containsOnly`, `row`.
- Cleanup parity: Current cleanup operations: none. No legacy cleanup method body was available.
- Any observed difference, however small: Normalized body similarity is low (`0.17`), so fidelity was judged from
  SQL/helper/assertion shape instead of raw text. SQL verb set differs: legacy ['SELECT'] vs
  current ['SELECT', 'CREATE']. Current method uses parameter-injected environment helpers instead of Tempto query
  executors.
- Known intentional difference: `HDP to Hive 3.1 migration`
- Reviewer note: Matched by current suite selection: `SuiteIceberg` run 2 Exact-name mapping with normalized body
  similarity `0.17`.
- Audit status: `verified`

### `TestIcebergHiveViewsCompatibility`

- Owning migration commit: `Migrate TestIcebergHiveViewsCompatibility to JUnit`
- Current class added in same migration commit:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/iceberg/TestIcebergHiveViewsCompatibility.java`
- Legacy class removed in same migration commit:
    - `testing/trino-product-tests/src/main/java/io/trino/tests/product/iceberg/TestIcebergHiveViewsCompatibility.java`
- Class-level environment requirement: `HiveIcebergRedirectionsEnvironment`.
- Class-level tags: `HiveIcebergRedirections`.
- Method inventory complete: Yes. Legacy methods: `1`. Current methods: `1`.
- Legacy helper/resource dependencies accounted for: Legacy class source reviewed directly.
- Intentional differences summary: `HDP to Hive 3.1 migration`
- Method statuses present: `verified`.

#### Methods

##### `testIcebergHiveViewsCompatibility`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/iceberg/TestIcebergHiveViewsCompatibility.java` ->
  `testIcebergHiveViewsCompatibility`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/iceberg/TestIcebergHiveViewsCompatibility.java` ->
  `TestIcebergHiveViewsCompatibility.testIcebergHiveViewsCompatibility`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveIcebergRedirectionsEnvironment`. Routed by source review into
  `SuiteIceberg` run 2.
- Tag parity: Current tags: `HiveIcebergRedirections`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`. Legacy setup operations: `CREATE`.
- Action parity: Current action verbs: `SHOW`, `SELECT`. Legacy action verbs: `SHOW`, `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `containsOnly`, `row`. Legacy assertion helpers:
  `assertQueryFailure`, `assertThat`, `assertThatThrownBy`, `containsOnly`, `hasMessageContaining`, `row`.
- Cleanup parity: Current cleanup operations: none. No legacy cleanup method body was available.
- Any observed difference, however small: Normalized body similarity is low (`0.39`), so fidelity was judged from
  SQL/helper/assertion shape instead of raw text. Assertion helper names differ between legacy and current
  implementations. Current method uses parameter-injected environment helpers instead of Tempto query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`
- Reviewer note: Matched by current suite selection: `SuiteIceberg` run 2 Exact-name mapping with normalized body
  similarity `0.39`.
- Audit status: `verified`

### `TestIcebergInsert`

- Owning migration commit: `Migrate TestIcebergInsert to JUnit`
- Current class added in same migration commit:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/iceberg/TestIcebergInsert.java`
- Legacy class removed in same migration commit:
    - `testing/trino-product-tests/src/main/java/io/trino/tests/product/iceberg/TestIcebergInsert.java`
- Class-level environment requirement: `SparkIcebergEnvironment`.
- Class-level tags: `Iceberg`.
- Method inventory complete: Yes. Legacy methods: `1`. Current methods: `1`.
- Legacy helper/resource dependencies accounted for: Legacy class source reviewed directly.
- Intentional differences summary: `HDP to Hive 3.1 migration`
- Method statuses present: `verified`.

#### Methods

##### `testIcebergConcurrentInsert`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/iceberg/TestIcebergInsert.java` ->
  `testIcebergConcurrentInsert`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/iceberg/TestIcebergInsert.java` ->
  `TestIcebergInsert.testIcebergConcurrentInsert`
- Mapping type: `direct`
- Environment parity: Current class requires `SparkIcebergEnvironment`. Routed by source review into `SuiteIceberg` run
    1.
- Tag parity: Current tags: `Iceberg`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`, `INSERT`. Legacy setup operations: `CREATE`, `INSERT`.
- Action parity: Current action verbs: `SELECT`. Legacy action verbs: `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `containsOnly`, `row`. Legacy assertion helpers:
  `assertThat`, `containsOnly`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: Assertion helper names differ between legacy and current implementations.
  Current method uses parameter-injected environment helpers instead of Tempto query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`
- Reviewer note: Matched by current suite selection: `SuiteIceberg` run 1 Exact-name mapping with normalized body
  similarity `0.83`.
- Audit status: `verified`

### `TestIcebergOptimize`

- Owning migration commit: `Migrate TestIcebergOptimize to JUnit`
- Current class added in same migration commit:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/iceberg/TestIcebergOptimize.java`
- Legacy class removed in same migration commit:
    - `testing/trino-product-tests/src/main/java/io/trino/tests/product/iceberg/TestIcebergOptimize.java`
- Class-level environment requirement: `SparkIcebergEnvironment`.
- Class-level tags: `Iceberg`.
- Method inventory complete: Yes. Legacy methods: `1`. Current methods: `1`.
- Legacy helper/resource dependencies accounted for: Legacy class source reviewed directly.
- Intentional differences summary: `HDP to Hive 3.1 migration`
- Method statuses present: `verified`.

#### Methods

##### `testOptimizeTableAfterDelete`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/iceberg/TestIcebergOptimize.java` ->
  `testOptimizeTableAfterDelete`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/iceberg/TestIcebergOptimize.java` ->
  `TestIcebergOptimize.testOptimizeTableAfterDelete`
- Mapping type: `direct`
- Environment parity: Current class requires `SparkIcebergEnvironment`. Routed by source review into `SuiteIceberg` run
    1.
- Tag parity: Current tags: `Iceberg`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`, `INSERT`, `ALTER`. Legacy setup operations: `CREATE`, `INSERT`,
  `ALTER`.
- Action parity: Current action verbs: `SELECT`. Legacy action verbs: `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `containsOnly`, `row`. Legacy assertion helpers:
  `assertThat`, `containsOnly`, `row`.
- Cleanup parity: Current cleanup operations: `DROP`, `DELETE`. Legacy cleanup operations: `DROP`, `DELETE`.
- Any observed difference, however small: Current method uses parameter-injected environment helpers instead of Tempto
  query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`
- Reviewer note: Matched by current suite selection: `SuiteIceberg` run 1 Exact-name mapping with normalized body
  similarity `0.82`.
- Audit status: `verified`

### `TestIcebergPartitionEvolution`

- Owning migration commit: `Migrate TestIcebergPartitionEvolution to JUnit`
- Current class added in same migration commit:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/iceberg/TestIcebergPartitionEvolution.java`
- Legacy class removed in same migration commit:
    - `testing/trino-product-tests/src/main/java/io/trino/tests/product/iceberg/TestIcebergPartitionEvolution.java`
- Class-level environment requirement: `SparkIcebergEnvironment`.
- Class-level tags: `Iceberg`.
- Method inventory complete: Yes. Legacy methods: `1`. Current methods: `1`.
- Legacy helper/resource dependencies accounted for: Legacy class source reviewed directly.
- Intentional differences summary: `HDP to Hive 3.1 migration`
- Method statuses present: `verified`.

#### Methods

##### `testDroppedPartitionField`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/iceberg/TestIcebergPartitionEvolution.java` ->
  `testDroppedPartitionField`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/iceberg/TestIcebergPartitionEvolution.java` ->
  `TestIcebergPartitionEvolution.testDroppedPartitionField`
- Mapping type: `direct`
- Environment parity: Current class requires `SparkIcebergEnvironment`. Routed by source review into `SuiteIceberg` run
    1.
- Tag parity: Current tags: `Iceberg`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`, `INSERT`, `ALTER`. Legacy setup operations: `CREATE`, `INSERT`,
  `ALTER`.
- Action parity: Current action verbs: `SHOW`, `WITH`, `SELECT`. Legacy action verbs: `SHOW`, `WITH`, `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `containsOnly`, `row`. Legacy assertion helpers:
  `assertThat`, `containsOnly`, `row`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: SQL verb set differs:
  legacy ['DROP', 'CREATE', 'INSERT', 'ALTER', 'SHOW', 'WITH', 'SELECT'] vs
  current ['CREATE', 'INSERT', 'ALTER', 'DROP', 'SHOW', 'WITH', 'SELECT']. Current method uses parameter-injected
  environment helpers instead of Tempto query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`
- Reviewer note: Matched by current suite selection: `SuiteIceberg` run 1 Exact-name mapping with normalized body
  similarity `0.73`.
- Audit status: `verified`

### `TestIcebergProcedureCalls`

- Owning migration commit: `Migrate TestIcebergProcedureCalls to JUnit`
- Current class added in same migration commit:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/iceberg/TestIcebergProcedureCalls.java`
- Legacy class removed in same migration commit:
    - `testing/trino-product-tests/src/main/java/io/trino/tests/product/iceberg/TestIcebergProcedureCalls.java`
- Class-level environment requirement: `SparkIcebergEnvironment`.
- Class-level tags: `Iceberg`.
- Method inventory complete: Yes. Legacy methods: `13`. Current methods: `13`.
- Legacy helper/resource dependencies accounted for: Legacy class source reviewed directly.
- Intentional differences summary: `HDP to Hive 3.1 migration`
- Method statuses present: `verified`.

#### Methods

##### `testMigrateHiveTable`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/iceberg/TestIcebergProcedureCalls.java` ->
  `testMigrateHiveTable`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/iceberg/TestIcebergProcedureCalls.java` ->
  `TestIcebergProcedureCalls.testMigrateHiveTable`
- Mapping type: `direct`
- Environment parity: Current class requires `SparkIcebergEnvironment`. Routed by source review into `SuiteIceberg` run
    1.
- Tag parity: Current tags: `Iceberg`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`. Legacy setup operations: `CREATE`.
- Action parity: Current action verbs: `CALL`, `SELECT`. Legacy action verbs: `CALL`, `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `containsOnly`, `row`. Legacy assertion helpers:
  `assertThat`, `containsOnly`, `row`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: Current method uses parameter-injected environment helpers instead of Tempto
  query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`
- Reviewer note: Matched by current suite selection: `SuiteIceberg` run 1 Exact-name mapping with normalized body
  similarity `0.84`.
- Audit status: `verified`

##### `testMigrateTimestampHiveTableWithOrc`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/iceberg/TestIcebergProcedureCalls.java` ->
  `testMigrateTimestampHiveTableWithOrc`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/iceberg/TestIcebergProcedureCalls.java` ->
  `TestIcebergProcedureCalls.testMigrateTimestampHiveTableWithOrc`
- Mapping type: `direct`
- Environment parity: Current class requires `SparkIcebergEnvironment`. Routed by source review into `SuiteIceberg` run
    1.
- Tag parity: Current tags: `Iceberg`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: none. No legacy setup method body was available.
- Action parity: Current action verbs: none. No legacy action method body was available.
- Assertion parity: Current assertion helpers: none. No legacy assertion method body was available.
- Cleanup parity: Current cleanup operations: none. No legacy cleanup method body was available.
- Any observed difference, however small: No method-specific difference identified beyond the documented framework
  baseline.
- Known intentional difference: None.
- Reviewer note: Matched by current suite selection: `SuiteIceberg` run 1 High normalized body similarity `0.87`.
- Audit status: `verified`

##### `testMigrateTimestampHiveTableWithParquet`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/iceberg/TestIcebergProcedureCalls.java` ->
  `testMigrateTimestampHiveTableWithParquet`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/iceberg/TestIcebergProcedureCalls.java` ->
  `TestIcebergProcedureCalls.testMigrateTimestampHiveTableWithParquet`
- Mapping type: `direct`
- Environment parity: Current class requires `SparkIcebergEnvironment`. Routed by source review into `SuiteIceberg` run
    1.
- Tag parity: Current tags: `Iceberg`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: none. No legacy setup method body was available.
- Action parity: Current action verbs: none. No legacy action method body was available.
- Assertion parity: Current assertion helpers: none. No legacy assertion method body was available.
- Cleanup parity: Current cleanup operations: none. No legacy cleanup method body was available.
- Any observed difference, however small: No method-specific difference identified beyond the documented framework
  baseline.
- Known intentional difference: None.
- Reviewer note: Matched by current suite selection: `SuiteIceberg` run 1 High normalized body similarity `0.87`.
- Audit status: `verified`

##### `testMigrateHiveTableWithTinyintType`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/iceberg/TestIcebergProcedureCalls.java` ->
  `testMigrateHiveTableWithTinyintType`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/iceberg/TestIcebergProcedureCalls.java` ->
  `TestIcebergProcedureCalls.testMigrateHiveTableWithTinyintType`
- Mapping type: `direct`
- Environment parity: Current class requires `SparkIcebergEnvironment`. Routed by source review into `SuiteIceberg` run
    1.
- Tag parity: Current tags: `Iceberg`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`, `INSERT`. Legacy setup operations: `CREATE`, `INSERT`.
- Action parity: Current action verbs: `CALL`, `SELECT`. Legacy action verbs: `CALL`, `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `assertThatThrownBy`, `containsOnly`,
  `hasMessageContaining`, `row`. Legacy assertion helpers: `assertQueryFailure`, `assertThat`, `containsOnly`,
  `hasMessageContaining`, `row`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: Assertion helper names differ between legacy and current implementations.
  Current method uses parameter-injected environment helpers instead of Tempto query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`
- Reviewer note: Matched by current suite selection: `SuiteIceberg` run 1 Exact-name mapping with normalized body
  similarity `0.88`.
- Audit status: `verified`

##### `testMigrateHiveTableWithSmallintType`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/iceberg/TestIcebergProcedureCalls.java` ->
  `testMigrateHiveTableWithSmallintType`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/iceberg/TestIcebergProcedureCalls.java` ->
  `TestIcebergProcedureCalls.testMigrateHiveTableWithSmallintType`
- Mapping type: `direct`
- Environment parity: Current class requires `SparkIcebergEnvironment`. Routed by source review into `SuiteIceberg` run
    1.
- Tag parity: Current tags: `Iceberg`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`, `INSERT`. Legacy setup operations: `CREATE`, `INSERT`.
- Action parity: Current action verbs: `CALL`, `SELECT`. Legacy action verbs: `CALL`, `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `assertThatThrownBy`, `containsOnly`,
  `hasMessageContaining`, `row`. Legacy assertion helpers: `assertQueryFailure`, `assertThat`, `containsOnly`,
  `hasMessageContaining`, `row`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: Assertion helper names differ between legacy and current implementations.
  Current method uses parameter-injected environment helpers instead of Tempto query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`
- Reviewer note: Matched by current suite selection: `SuiteIceberg` run 1 Exact-name mapping with normalized body
  similarity `0.88`.
- Audit status: `verified`

##### `testMigrateHiveTableWithComplexType`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/iceberg/TestIcebergProcedureCalls.java` ->
  `testMigrateHiveTableWithComplexType`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/iceberg/TestIcebergProcedureCalls.java` ->
  `TestIcebergProcedureCalls.testMigrateHiveTableWithComplexType`
- Mapping type: `direct`
- Environment parity: Current class requires `SparkIcebergEnvironment`. Routed by source review into `SuiteIceberg` run
    1.
- Tag parity: Current tags: `Iceberg`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`. Legacy setup operations: `CREATE`.
- Action parity: Current action verbs: `WITH`, `SELECT`, `CALL`. Legacy action verbs: `WITH`, `SELECT`, `CALL`.
- Assertion parity: Current assertion helpers: `assertThat`, `containsOnly`, `row`. Legacy assertion helpers:
  `assertThat`, `containsOnly`, `row`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: Current method uses parameter-injected environment helpers instead of Tempto
  query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`
- Reviewer note: Matched by current suite selection: `SuiteIceberg` run 1 Exact-name mapping with normalized body
  similarity `0.87`.
- Audit status: `verified`

##### `testMigrateHivePartitionedTable`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/iceberg/TestIcebergProcedureCalls.java` ->
  `testMigrateHivePartitionedTable`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/iceberg/TestIcebergProcedureCalls.java` ->
  `TestIcebergProcedureCalls.testMigrateHivePartitionedTable`
- Mapping type: `direct`
- Environment parity: Current class requires `SparkIcebergEnvironment`. Routed by source review into `SuiteIceberg` run
    1.
- Tag parity: Current tags: `Iceberg`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`. Legacy setup operations: `CREATE`.
- Action parity: Current action verbs: `WITH`, `CALL`, `SELECT`, `SHOW`. Legacy action verbs: `WITH`, `CALL`, `SELECT`,
  `SHOW`.
- Assertion parity: Current assertion helpers: `assertThat`, `contains`, `containsOnly`, `row`. Legacy assertion
  helpers: `assertThat`, `contains`, `containsOnly`, `row`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: Current method uses parameter-injected environment helpers instead of Tempto
  query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`
- Reviewer note: Matched by current suite selection: `SuiteIceberg` run 1 Exact-name mapping with normalized body
  similarity `0.89`.
- Audit status: `verified`

##### `testMigrateHiveBucketedTable`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/iceberg/TestIcebergProcedureCalls.java` ->
  `testMigrateHiveBucketedTable`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/iceberg/TestIcebergProcedureCalls.java` ->
  `TestIcebergProcedureCalls.testMigrateHiveBucketedTable`
- Mapping type: `direct`
- Environment parity: Current class requires `SparkIcebergEnvironment`. Routed by source review into `SuiteIceberg` run
    1.
- Tag parity: Current tags: `Iceberg`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`. Legacy setup operations: `CREATE`.
- Action parity: Current action verbs: `WITH`, `CALL`, `SELECT`, `SHOW`. Legacy action verbs: `WITH`, `CALL`, `SELECT`,
  `SHOW`.
- Assertion parity: Current assertion helpers: `assertThat`, `contains`, `containsOnly`, `row`. Legacy assertion
  helpers: `assertThat`, `contains`, `containsOnly`, `row`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: Current method uses parameter-injected environment helpers instead of Tempto
  query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`
- Reviewer note: Matched by current suite selection: `SuiteIceberg` run 1 Exact-name mapping with normalized body
  similarity `0.90`.
- Audit status: `verified`

##### `testMigrateHiveBucketedOnMultipleColumns`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/iceberg/TestIcebergProcedureCalls.java` ->
  `testMigrateHiveBucketedOnMultipleColumns`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/iceberg/TestIcebergProcedureCalls.java` ->
  `TestIcebergProcedureCalls.testMigrateHiveBucketedOnMultipleColumns`
- Mapping type: `direct`
- Environment parity: Current class requires `SparkIcebergEnvironment`. Routed by source review into `SuiteIceberg` run
    1.
- Tag parity: Current tags: `Iceberg`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`. Legacy setup operations: `CREATE`.
- Action parity: Current action verbs: `WITH`, `CALL`, `SELECT`, `SHOW`. Legacy action verbs: `WITH`, `CALL`, `SELECT`,
  `SHOW`.
- Assertion parity: Current assertion helpers: `assertThat`, `contains`, `containsOnly`, `row`. Legacy assertion
  helpers: `assertThat`, `contains`, `containsOnly`, `row`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: Current method uses parameter-injected environment helpers instead of Tempto
  query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`
- Reviewer note: Matched by current suite selection: `SuiteIceberg` run 1 Exact-name mapping with normalized body
  similarity `0.90`.
- Audit status: `verified`

##### `testTrinoMigrateExternalTable`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/iceberg/TestIcebergProcedureCalls.java` ->
  `testTrinoMigrateExternalTable`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/iceberg/TestIcebergProcedureCalls.java` ->
  `TestIcebergProcedureCalls.testTrinoMigrateExternalTable`
- Mapping type: `direct`
- Environment parity: Current class requires `SparkIcebergEnvironment`. Routed by source review into `SuiteIceberg` run
    1.
- Tag parity: Current tags: `Iceberg`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: none. Legacy setup operations: none.
- Action parity: Current action verbs: `CALL`. Legacy action verbs: `CALL`.
- Assertion parity: Current assertion helpers: none. No legacy assertion method body was available.
- Cleanup parity: Current cleanup operations: none. No legacy cleanup method body was available.
- Any observed difference, however small: Current method uses parameter-injected environment helpers instead of Tempto
  query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`
- Reviewer note: Matched by current suite selection: `SuiteIceberg` run 1 Exact-name mapping with normalized body
  similarity `0.80`.
- Audit status: `verified`

##### `testSparkMigrateExternalTable`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/iceberg/TestIcebergProcedureCalls.java` ->
  `testSparkMigrateExternalTable`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/iceberg/TestIcebergProcedureCalls.java` ->
  `TestIcebergProcedureCalls.testSparkMigrateExternalTable`
- Mapping type: `direct`
- Environment parity: Current class requires `SparkIcebergEnvironment`. Routed by source review into `SuiteIceberg` run
    1.
- Tag parity: Current tags: `Iceberg`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: none. Legacy setup operations: none.
- Action parity: Current action verbs: `CALL`. Legacy action verbs: `CALL`.
- Assertion parity: Current assertion helpers: none. No legacy assertion method body was available.
- Cleanup parity: Current cleanup operations: none. No legacy cleanup method body was available.
- Any observed difference, however small: No method-specific difference identified beyond the documented framework
  baseline.
- Known intentional difference: None.
- Reviewer note: Matched by current suite selection: `SuiteIceberg` run 1 Exact-name mapping with normalized body
  similarity `0.73`.
- Audit status: `verified`

##### `testMigrateUnsupportedTransactionalTable`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/iceberg/TestIcebergProcedureCalls.java` ->
  `testMigrateUnsupportedTransactionalTable`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/iceberg/TestIcebergProcedureCalls.java` ->
  `TestIcebergProcedureCalls.testMigrateUnsupportedTransactionalTable`
- Mapping type: `direct`
- Environment parity: Current class requires `SparkIcebergEnvironment`. Routed by source review into `SuiteIceberg` run
    1.
- Tag parity: Current tags: `Iceberg`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`. Legacy setup operations: `CREATE`.
- Action parity: Current action verbs: `WITH`, `CALL`, `SELECT`. Legacy action verbs: `WITH`, `CALL`, `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `assertThatThrownBy`, `containsOnly`,
  `hasMessageContaining`, `row`. Legacy assertion helpers: `assertThat`, `assertThatThrownBy`, `containsOnly`,
  `hasMessageContaining`, `row`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: Current method uses parameter-injected environment helpers instead of Tempto
  query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`
- Reviewer note: Matched by current suite selection: `SuiteIceberg` run 1 Exact-name mapping with normalized body
  similarity `0.90`.
- Audit status: `verified`

##### `testRollbackToSnapshot`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/iceberg/TestIcebergProcedureCalls.java` ->
  `testRollbackToSnapshot`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/iceberg/TestIcebergProcedureCalls.java` ->
  `TestIcebergProcedureCalls.testRollbackToSnapshot`
- Mapping type: `direct`
- Environment parity: Current class requires `SparkIcebergEnvironment`. Routed by source review into `SuiteIceberg` run
    1.
- Tag parity: Current tags: `Iceberg`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`, `INSERT`, `ALTER`. Legacy setup operations: `CREATE`, `INSERT`,
  `ALTER`.
- Action parity: Current action verbs: `SELECT`. Legacy action verbs: `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `containsOnly`, `row`. Legacy assertion helpers:
  `assertThat`, `containsOnly`, `row`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: Current method uses parameter-injected environment helpers instead of Tempto
  query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`
- Reviewer note: Matched by current suite selection: `SuiteIceberg` run 1 Exact-name mapping with normalized body
  similarity `0.75`.
- Audit status: `verified`

### `TestIcebergRedirectionToHive`

- Owning migration commit: `Migrate TestIcebergRedirectionToHive to JUnit`
- Current class added in same migration commit:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/iceberg/TestIcebergRedirectionToHive.java`
- Legacy class removed in same migration commit:
    - `testing/trino-product-tests/src/main/java/io/trino/tests/product/iceberg/TestIcebergRedirectionToHive.java`
- Class-level environment requirement: `HiveIcebergRedirectionsEnvironment`.
- Class-level tags: `HiveIcebergRedirections`.
- Method inventory complete: Yes. Legacy methods: `27`. Current methods: `27`.
- Legacy helper/resource dependencies accounted for: Legacy class source reviewed directly.
- Intentional differences summary: `HDP to Hive 3.1 migration`
- Method statuses present: `verified`.

#### Methods

##### `testRedirect`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/iceberg/TestIcebergRedirectionToHive.java` ->
  `testRedirect`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/iceberg/TestIcebergRedirectionToHive.java` ->
  `TestIcebergRedirectionToHive.testRedirect`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveIcebergRedirectionsEnvironment`. Routed by source review into
  `SuiteIceberg` run 2.
- Tag parity: Current tags: `HiveIcebergRedirections`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: none. Legacy setup operations: none.
- Action parity: Current action verbs: none. Legacy action verbs: none.
- Assertion parity: Current assertion helpers: `assertResultsEqual`. Legacy assertion helpers: `assertResultsEqual`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: Current method uses parameter-injected environment helpers instead of Tempto
  query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`
- Reviewer note: Matched by current suite selection: `SuiteIceberg` run 2 Exact-name mapping with normalized body
  similarity `0.86`.
- Audit status: `verified`

##### `testRedirectWithNonDefaultSchema`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/iceberg/TestIcebergRedirectionToHive.java` ->
  `testRedirectWithNonDefaultSchema`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/iceberg/TestIcebergRedirectionToHive.java` ->
  `TestIcebergRedirectionToHive.testRedirectWithNonDefaultSchema`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveIcebergRedirectionsEnvironment`. Routed by source review into
  `SuiteIceberg` run 2.
- Tag parity: Current tags: `HiveIcebergRedirections`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: none. Legacy setup operations: none.
- Action parity: Current action verbs: none. Legacy action verbs: none.
- Assertion parity: Current assertion helpers: `assertResultsEqual`. Legacy assertion helpers: `assertResultsEqual`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: Current method uses parameter-injected environment helpers instead of Tempto
  query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`
- Reviewer note: Matched by current suite selection: `SuiteIceberg` run 2 Exact-name mapping with normalized body
  similarity `0.87`.
- Audit status: `verified`

##### `testRedirectToNonexistentCatalog`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/iceberg/TestIcebergRedirectionToHive.java` ->
  `testRedirectToNonexistentCatalog`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/iceberg/TestIcebergRedirectionToHive.java` ->
  `TestIcebergRedirectionToHive.testRedirectToNonexistentCatalog`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveIcebergRedirectionsEnvironment`. Routed by source review into
  `SuiteIceberg` run 2.
- Tag parity: Current tags: `HiveIcebergRedirections`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: none. Legacy setup operations: none.
- Action parity: Current action verbs: none. Legacy action verbs: none.
- Assertion parity: Current assertion helpers: `assertResultsEqual`, `assertThatThrownBy`. Legacy assertion helpers:
  `assertQueryFailure`, `assertResultsEqual`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: Assertion helper names differ between legacy and current implementations.
  Current method uses parameter-injected environment helpers instead of Tempto query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`
- Reviewer note: Matched by current suite selection: `SuiteIceberg` run 2 Exact-name mapping with normalized body
  similarity `0.78`.
- Audit status: `verified`

##### `testRedirectWithDefaultSchemaInSession`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/iceberg/TestIcebergRedirectionToHive.java` ->
  `testRedirectWithDefaultSchemaInSession`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/iceberg/TestIcebergRedirectionToHive.java` ->
  `TestIcebergRedirectionToHive.testRedirectWithDefaultSchemaInSession`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveIcebergRedirectionsEnvironment`. Routed by source review into
  `SuiteIceberg` run 2.
- Tag parity: Current tags: `HiveIcebergRedirections`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: none. Legacy setup operations: none.
- Action parity: Current action verbs: none. Legacy action verbs: none.
- Assertion parity: Current assertion helpers: `assertResultsEqual`. Legacy assertion helpers: `assertResultsEqual`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: Current method uses parameter-injected environment helpers instead of Tempto
  query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`
- Reviewer note: Matched by current suite selection: `SuiteIceberg` run 2 Exact-name mapping with normalized body
  similarity `0.64`.
- Audit status: `verified`

##### `testRedirectPartitionsToUnpartitioned`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/iceberg/TestIcebergRedirectionToHive.java` ->
  `testRedirectPartitionsToUnpartitioned`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/iceberg/TestIcebergRedirectionToHive.java` ->
  `TestIcebergRedirectionToHive.testRedirectPartitionsToUnpartitioned`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveIcebergRedirectionsEnvironment`. Routed by source review into
  `SuiteIceberg` run 2.
- Tag parity: Current tags: `HiveIcebergRedirections`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: none. Legacy setup operations: none.
- Action parity: Current action verbs: none. Legacy action verbs: none.
- Assertion parity: Current assertion helpers: `assertThatThrownBy`. Legacy assertion helpers: `assertQueryFailure`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: Assertion helper names differ between legacy and current implementations.
  Current method uses parameter-injected environment helpers instead of Tempto query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`
- Reviewer note: Matched by current suite selection: `SuiteIceberg` run 2 Exact-name mapping with normalized body
  similarity `0.61`.
- Audit status: `verified`

##### `testRedirectInvalidSystemTable`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/iceberg/TestIcebergRedirectionToHive.java` ->
  `testRedirectInvalidSystemTable`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/iceberg/TestIcebergRedirectionToHive.java` ->
  `TestIcebergRedirectionToHive.testRedirectInvalidSystemTable`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveIcebergRedirectionsEnvironment`. Routed by source review into
  `SuiteIceberg` run 2.
- Tag parity: Current tags: `HiveIcebergRedirections`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: none. Legacy setup operations: none.
- Action parity: Current action verbs: none. Legacy action verbs: none.
- Assertion parity: Current assertion helpers: `assertThatThrownBy`. Legacy assertion helpers: `assertQueryFailure`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: Assertion helper names differ between legacy and current implementations.
  Current method uses parameter-injected environment helpers instead of Tempto query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`
- Reviewer note: Matched by current suite selection: `SuiteIceberg` run 2 Exact-name mapping with normalized body
  similarity `0.84`.
- Audit status: `verified`

##### `testRedirectPartitionsToPartitioned`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/iceberg/TestIcebergRedirectionToHive.java` ->
  `testRedirectPartitionsToPartitioned`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/iceberg/TestIcebergRedirectionToHive.java` ->
  `TestIcebergRedirectionToHive.testRedirectPartitionsToPartitioned`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveIcebergRedirectionsEnvironment`. Routed by source review into
  `SuiteIceberg` run 2.
- Tag parity: Current tags: `HiveIcebergRedirections`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: none. Legacy setup operations: none.
- Action parity: Current action verbs: none. Legacy action verbs: none.
- Assertion parity: Current assertion helpers: `assertThat`, `containsOnly`, `row`. Legacy assertion helpers:
  `assertThat`, `containsOnly`, `row`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: Current method uses parameter-injected environment helpers instead of Tempto
  query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`
- Reviewer note: Matched by current suite selection: `SuiteIceberg` run 2 Exact-name mapping with normalized body
  similarity `0.88`.
- Audit status: `verified`

##### `testInsert`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/iceberg/TestIcebergRedirectionToHive.java` ->
  `testInsert`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/iceberg/TestIcebergRedirectionToHive.java` ->
  `TestIcebergRedirectionToHive.testInsert`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveIcebergRedirectionsEnvironment`. Routed by source review into
  `SuiteIceberg` run 2.
- Tag parity: Current tags: `HiveIcebergRedirections`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `INSERT`. Legacy setup operations: `INSERT`.
- Action parity: Current action verbs: none. Legacy action verbs: none.
- Assertion parity: Current assertion helpers: `assertThat`, `containsOnly`, `row`. Legacy assertion helpers:
  `assertThat`, `containsOnly`, `row`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: Current method uses parameter-injected environment helpers instead of Tempto
  query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`
- Reviewer note: Matched by current suite selection: `SuiteIceberg` run 2 Exact-name mapping with normalized body
  similarity `0.83`.
- Audit status: `verified`

##### `testDelete`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/iceberg/TestIcebergRedirectionToHive.java` ->
  `testDelete`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/iceberg/TestIcebergRedirectionToHive.java` ->
  `TestIcebergRedirectionToHive.testDelete`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveIcebergRedirectionsEnvironment`. Routed by source review into
  `SuiteIceberg` run 2.
- Tag parity: Current tags: `HiveIcebergRedirections`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: none. Legacy setup operations: none.
- Action parity: Current action verbs: `SELECT`. Legacy action verbs: `SELECT`.
- Assertion parity: Current assertion helpers: `assertResultsEqual`. Legacy assertion helpers: `assertResultsEqual`.
- Cleanup parity: Current cleanup operations: `DELETE`, `DROP`. Legacy cleanup operations: `DELETE`, `DROP`.
- Any observed difference, however small: Current method uses parameter-injected environment helpers instead of Tempto
  query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`
- Reviewer note: Matched by current suite selection: `SuiteIceberg` run 2 Exact-name mapping with normalized body
  similarity `0.87`.
- Audit status: `verified`

##### `testUpdate`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/iceberg/TestIcebergRedirectionToHive.java` ->
  `testUpdate`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/iceberg/TestIcebergRedirectionToHive.java` ->
  `TestIcebergRedirectionToHive.testUpdate`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveIcebergRedirectionsEnvironment`. Routed by source review into
  `SuiteIceberg` run 2.
- Tag parity: Current tags: `HiveIcebergRedirections`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `UPDATE`. Legacy setup operations: `UPDATE`.
- Action parity: Current action verbs: none. Legacy action verbs: none.
- Assertion parity: Current assertion helpers: `assertThatThrownBy`, `hasMessageContaining`. Legacy assertion helpers:
  `assertQueryFailure`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: Assertion helper names differ between legacy and current implementations.
  Current method uses parameter-injected environment helpers instead of Tempto query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`
- Reviewer note: Matched by current suite selection: `SuiteIceberg` run 2 Exact-name mapping with normalized body
  similarity `0.79`.
- Audit status: `verified`

##### `testCreateOrReplaceTable`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/iceberg/TestIcebergRedirectionToHive.java` ->
  `testCreateOrReplaceTable`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/iceberg/TestIcebergRedirectionToHive.java` ->
  `TestIcebergRedirectionToHive.testCreateOrReplaceTable`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveIcebergRedirectionsEnvironment`. Routed by source review into
  `SuiteIceberg` run 2.
- Tag parity: Current tags: `HiveIcebergRedirections`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`. Legacy setup operations: `CREATE`.
- Action parity: Current action verbs: none. Legacy action verbs: none.
- Assertion parity: Current assertion helpers: `assertThatThrownBy`. Legacy assertion helpers: `assertQueryFailure`.
- Cleanup parity: Current cleanup operations: none. No legacy cleanup method body was available.
- Any observed difference, however small: Assertion helper names differ between legacy and current implementations.
  Current method uses parameter-injected environment helpers instead of Tempto query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`
- Reviewer note: Matched by current suite selection: `SuiteIceberg` run 2 Exact-name mapping with normalized body
  similarity `0.78`.
- Audit status: `verified`

##### `testDropTable`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/iceberg/TestIcebergRedirectionToHive.java` ->
  `testDropTable`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/iceberg/TestIcebergRedirectionToHive.java` ->
  `TestIcebergRedirectionToHive.testDropTable`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveIcebergRedirectionsEnvironment`. Routed by source review into
  `SuiteIceberg` run 2.
- Tag parity: Current tags: `HiveIcebergRedirections`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: none. Legacy setup operations: none.
- Action parity: Current action verbs: none. Legacy action verbs: none.
- Assertion parity: Current assertion helpers: `assertThatThrownBy`. Legacy assertion helpers: `assertQueryFailure`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: Assertion helper names differ between legacy and current implementations.
  Current method uses parameter-injected environment helpers instead of Tempto query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`
- Reviewer note: Matched by current suite selection: `SuiteIceberg` run 2 Exact-name mapping with normalized body
  similarity `0.76`.
- Audit status: `verified`

##### `testDescribe`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/iceberg/TestIcebergRedirectionToHive.java` ->
  `testDescribe`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/iceberg/TestIcebergRedirectionToHive.java` ->
  `TestIcebergRedirectionToHive.testDescribe`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveIcebergRedirectionsEnvironment`. Routed by source review into
  `SuiteIceberg` run 2.
- Tag parity: Current tags: `HiveIcebergRedirections`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: none. Legacy setup operations: none.
- Action parity: Current action verbs: `DESCRIBE`. Legacy action verbs: `DESCRIBE`.
- Assertion parity: Current assertion helpers: `assertResultsEqual`. Legacy assertion helpers: `assertResultsEqual`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: Current method uses parameter-injected environment helpers instead of Tempto
  query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`
- Reviewer note: Matched by current suite selection: `SuiteIceberg` run 2 Exact-name mapping with normalized body
  similarity `0.83`.
- Audit status: `verified`

##### `testShowCreateTable`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/iceberg/TestIcebergRedirectionToHive.java` ->
  `testShowCreateTable`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/iceberg/TestIcebergRedirectionToHive.java` ->
  `TestIcebergRedirectionToHive.testShowCreateTable`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveIcebergRedirectionsEnvironment`. Routed by source review into
  `SuiteIceberg` run 2.
- Tag parity: Current tags: `HiveIcebergRedirections`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`. Legacy setup operations: `CREATE`.
- Action parity: Current action verbs: `SHOW`, `WITH`. Legacy action verbs: `SHOW`, `WITH`.
- Assertion parity: Current assertion helpers: `assertThat`, `containsOnly`, `row`. Legacy assertion helpers:
  `assertThat`, `containsOnly`, `row`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: Current method uses parameter-injected environment helpers instead of Tempto
  query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`
- Reviewer note: Matched by current suite selection: `SuiteIceberg` run 2 Exact-name mapping with normalized body
  similarity `0.92`.
- Audit status: `verified`

##### `testShowStats`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/iceberg/TestIcebergRedirectionToHive.java` ->
  `testShowStats`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/iceberg/TestIcebergRedirectionToHive.java` ->
  `TestIcebergRedirectionToHive.testShowStats`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveIcebergRedirectionsEnvironment`. Routed by source review into
  `SuiteIceberg` run 2.
- Tag parity: Current tags: `HiveIcebergRedirections`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: none. Legacy setup operations: none.
- Action parity: Current action verbs: `SHOW`. Legacy action verbs: `SHOW`.
- Assertion parity: Current assertion helpers: `assertThat`, `containsOnly`, `row`. Legacy assertion helpers:
  `assertThat`, `containsOnly`, `row`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: Current method uses parameter-injected environment helpers instead of Tempto
  query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`
- Reviewer note: Matched by current suite selection: `SuiteIceberg` run 2 Exact-name mapping with normalized body
  similarity `0.91`.
- Audit status: `verified`

##### `testAlterTableRename`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/iceberg/TestIcebergRedirectionToHive.java` ->
  `testAlterTableRename`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/iceberg/TestIcebergRedirectionToHive.java` ->
  `TestIcebergRedirectionToHive.testAlterTableRename`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveIcebergRedirectionsEnvironment`. Routed by source review into
  `SuiteIceberg` run 2.
- Tag parity: Current tags: `HiveIcebergRedirections`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `ALTER`. Legacy setup operations: `ALTER`.
- Action parity: Current action verbs: none. Legacy action verbs: none.
- Assertion parity: Current assertion helpers: `assertResultsEqual`, `assertThatThrownBy`, `hasMessageContaining`.
  Legacy assertion helpers: `assertQueryFailure`, `assertResultsEqual`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: Assertion helper names differ between legacy and current implementations.
  Current method uses parameter-injected environment helpers instead of Tempto query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`
- Reviewer note: Matched by current suite selection: `SuiteIceberg` run 2 Exact-name mapping with normalized body
  similarity `0.63`.
- Audit status: `verified`

##### `testAlterTableAddColumn`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/iceberg/TestIcebergRedirectionToHive.java` ->
  `testAlterTableAddColumn`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/iceberg/TestIcebergRedirectionToHive.java` ->
  `TestIcebergRedirectionToHive.testAlterTableAddColumn`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveIcebergRedirectionsEnvironment`. Routed by source review into
  `SuiteIceberg` run 2.
- Tag parity: Current tags: `HiveIcebergRedirections`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `ALTER`. Legacy setup operations: `ALTER`.
- Action parity: Current action verbs: `DESCRIBE`, `SELECT`. Legacy action verbs: `DESCRIBE`, `SELECT`.
- Assertion parity: Current assertion helpers: `assertResultsEqual`, `assertThat`, `containsOnly`. Legacy assertion
  helpers: `assertResultsEqual`, `assertThat`, `containsOnly`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: Current method uses parameter-injected environment helpers instead of Tempto
  query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`
- Reviewer note: Matched by current suite selection: `SuiteIceberg` run 2 Exact-name mapping with normalized body
  similarity `0.85`.
- Audit status: `verified`

##### `testAlterTableRenameColumn`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/iceberg/TestIcebergRedirectionToHive.java` ->
  `testAlterTableRenameColumn`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/iceberg/TestIcebergRedirectionToHive.java` ->
  `TestIcebergRedirectionToHive.testAlterTableRenameColumn`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveIcebergRedirectionsEnvironment`. Routed by source review into
  `SuiteIceberg` run 2.
- Tag parity: Current tags: `HiveIcebergRedirections`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `ALTER`. Legacy setup operations: `ALTER`.
- Action parity: Current action verbs: `DESCRIBE`, `SELECT`. Legacy action verbs: `DESCRIBE`, `SELECT`.
- Assertion parity: Current assertion helpers: `assertResultsEqual`, `assertThat`, `containsOnly`. Legacy assertion
  helpers: `assertResultsEqual`, `assertThat`, `containsOnly`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: Current method uses parameter-injected environment helpers instead of Tempto
  query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`
- Reviewer note: Matched by current suite selection: `SuiteIceberg` run 2 Exact-name mapping with normalized body
  similarity `0.86`.
- Audit status: `verified`

##### `testAlterTableDropColumn`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/iceberg/TestIcebergRedirectionToHive.java` ->
  `testAlterTableDropColumn`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/iceberg/TestIcebergRedirectionToHive.java` ->
  `TestIcebergRedirectionToHive.testAlterTableDropColumn`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveIcebergRedirectionsEnvironment`. Routed by source review into
  `SuiteIceberg` run 2.
- Tag parity: Current tags: `HiveIcebergRedirections`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `ALTER`. Legacy setup operations: `ALTER`.
- Action parity: Current action verbs: `DESCRIBE`, `SELECT`. Legacy action verbs: `DESCRIBE`, `SELECT`.
- Assertion parity: Current assertion helpers: `assertResultsEqual`, `assertThat`, `containsOnly`. Legacy assertion
  helpers: `assertResultsEqual`, `assertThat`, `containsOnly`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: Current method uses parameter-injected environment helpers instead of Tempto
  query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`
- Reviewer note: Matched by current suite selection: `SuiteIceberg` run 2 Exact-name mapping with normalized body
  similarity `0.70`.
- Audit status: `verified`

##### `testCommentTable`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/iceberg/TestIcebergRedirectionToHive.java` ->
  `testCommentTable`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/iceberg/TestIcebergRedirectionToHive.java` ->
  `TestIcebergRedirectionToHive.testCommentTable`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveIcebergRedirectionsEnvironment`. Routed by source review into
  `SuiteIceberg` run 2.
- Tag parity: Current tags: `HiveIcebergRedirections`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: none. Legacy setup operations: none.
- Action parity: Current action verbs: none. Legacy action verbs: none.
- Assertion parity: Current assertion helpers: `assertTableComment`. Legacy assertion helpers: `assertTableComment`,
  `isEqualTo`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: Normalized body similarity is low (`0.18`), so fidelity was judged from
  SQL/helper/assertion shape instead of raw text. Assertion helper names differ between legacy and current
  implementations. Current method uses parameter-injected environment helpers instead of Tempto query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`
- Reviewer note: Matched by current suite selection: `SuiteIceberg` run 2 Exact-name mapping with normalized body
  similarity `0.18`.
- Audit status: `verified`

##### `testShowGrants`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/iceberg/TestIcebergRedirectionToHive.java` ->
  `testShowGrants`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/iceberg/TestIcebergRedirectionToHive.java` ->
  `TestIcebergRedirectionToHive.testShowGrants`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveIcebergRedirectionsEnvironment`. Routed by source review into
  `SuiteIceberg` run 2.
- Tag parity: Current tags: `HiveIcebergRedirections`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: none. Legacy setup operations: none.
- Action parity: Current action verbs: `SHOW`. Legacy action verbs: `SHOW`.
- Assertion parity: Current assertion helpers: `assertThatThrownBy`. Legacy assertion helpers: `assertQueryFailure`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: Assertion helper names differ between legacy and current implementations.
  Current method uses parameter-injected environment helpers instead of Tempto query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`
- Reviewer note: Matched by current suite selection: `SuiteIceberg` run 2 Exact-name mapping with normalized body
  similarity `0.82`.
- Audit status: `verified`

##### `testInformationSchemaColumns`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/iceberg/TestIcebergRedirectionToHive.java` ->
  `testInformationSchemaColumns`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/iceberg/TestIcebergRedirectionToHive.java` ->
  `TestIcebergRedirectionToHive.testInformationSchemaColumns`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveIcebergRedirectionsEnvironment`. Routed by source review into
  `SuiteIceberg` run 2.
- Tag parity: Current tags: `HiveIcebergRedirections`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`. Legacy setup operations: `CREATE`.
- Action parity: Current action verbs: `SELECT`. Legacy action verbs: `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `containsOnly`, `row`. Legacy assertion helpers:
  `assertThat`, `containsOnly`, `row`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: Current method uses parameter-injected environment helpers instead of Tempto
  query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`
- Reviewer note: Matched by current suite selection: `SuiteIceberg` run 2 Exact-name mapping with normalized body
  similarity `0.93`.
- Audit status: `verified`

##### `testSystemJdbcColumns`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/iceberg/TestIcebergRedirectionToHive.java` ->
  `testSystemJdbcColumns`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/iceberg/TestIcebergRedirectionToHive.java` ->
  `TestIcebergRedirectionToHive.testSystemJdbcColumns`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveIcebergRedirectionsEnvironment`. Routed by source review into
  `SuiteIceberg` run 2.
- Tag parity: Current tags: `HiveIcebergRedirections`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`. Legacy setup operations: `CREATE`.
- Action parity: Current action verbs: `SELECT`. Legacy action verbs: `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `containsOnly`, `row`. Legacy assertion helpers:
  `assertThat`, `containsOnly`, `row`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: Current method uses parameter-injected environment helpers instead of Tempto
  query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`
- Reviewer note: Matched by current suite selection: `SuiteIceberg` run 2 Exact-name mapping with normalized body
  similarity `0.93`.
- Audit status: `verified`

##### `testGrant`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/iceberg/TestIcebergRedirectionToHive.java` ->
  `testGrant`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/iceberg/TestIcebergRedirectionToHive.java` ->
  `TestIcebergRedirectionToHive.testGrant`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveIcebergRedirectionsEnvironment`. Routed by source review into
  `SuiteIceberg` run 2.
- Tag parity: Current tags: `HiveIcebergRedirections`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: none. Legacy setup operations: none.
- Action parity: Current action verbs: none. Legacy action verbs: none.
- Assertion parity: Current assertion helpers: `assertThatThrownBy`. Legacy assertion helpers: `assertQueryFailure`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: Assertion helper names differ between legacy and current implementations.
  Current method uses parameter-injected environment helpers instead of Tempto query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`
- Reviewer note: Matched by current suite selection: `SuiteIceberg` run 2 Exact-name mapping with normalized body
  similarity `0.82`.
- Audit status: `verified`

##### `testRevoke`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/iceberg/TestIcebergRedirectionToHive.java` ->
  `testRevoke`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/iceberg/TestIcebergRedirectionToHive.java` ->
  `TestIcebergRedirectionToHive.testRevoke`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveIcebergRedirectionsEnvironment`. Routed by source review into
  `SuiteIceberg` run 2.
- Tag parity: Current tags: `HiveIcebergRedirections`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: none. Legacy setup operations: none.
- Action parity: Current action verbs: none. Legacy action verbs: none.
- Assertion parity: Current assertion helpers: `assertThatThrownBy`. Legacy assertion helpers: `assertQueryFailure`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: Assertion helper names differ between legacy and current implementations.
  Current method uses parameter-injected environment helpers instead of Tempto query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`
- Reviewer note: Matched by current suite selection: `SuiteIceberg` run 2 Exact-name mapping with normalized body
  similarity `0.83`.
- Audit status: `verified`

##### `testSetTableAuthorization`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/iceberg/TestIcebergRedirectionToHive.java` ->
  `testSetTableAuthorization`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/iceberg/TestIcebergRedirectionToHive.java` ->
  `TestIcebergRedirectionToHive.testSetTableAuthorization`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveIcebergRedirectionsEnvironment`. Routed by source review into
  `SuiteIceberg` run 2.
- Tag parity: Current tags: `HiveIcebergRedirections`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `ALTER`. Legacy setup operations: `ALTER`.
- Action parity: Current action verbs: none. Legacy action verbs: none.
- Assertion parity: Current assertion helpers: `assertThatThrownBy`. Legacy assertion helpers: `assertQueryFailure`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: Assertion helper names differ between legacy and current implementations.
  Current method uses parameter-injected environment helpers instead of Tempto query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`
- Reviewer note: Matched by current suite selection: `SuiteIceberg` run 2 Exact-name mapping with normalized body
  similarity `0.82`.
- Audit status: `verified`

##### `testDeny`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/iceberg/TestIcebergRedirectionToHive.java` ->
  `testDeny`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/iceberg/TestIcebergRedirectionToHive.java` ->
  `TestIcebergRedirectionToHive.testDeny`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveIcebergRedirectionsEnvironment`. Routed by source review into
  `SuiteIceberg` run 2.
- Tag parity: Current tags: `HiveIcebergRedirections`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: none. Legacy setup operations: none.
- Action parity: Current action verbs: none. Legacy action verbs: none.
- Assertion parity: Current assertion helpers: `assertThatThrownBy`. Legacy assertion helpers: `assertQueryFailure`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: Assertion helper names differ between legacy and current implementations.
  Current method uses parameter-injected environment helpers instead of Tempto query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`
- Reviewer note: Matched by current suite selection: `SuiteIceberg` run 2 Exact-name mapping with normalized body
  similarity `0.82`.
- Audit status: `verified`

### `TestIcebergSparkCompatibility`

- Owning migration commit: `Migrate TestIcebergSparkCompatibility to JUnit`
- Current class added in same migration commit:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/iceberg/TestIcebergSparkCompatibility.java`
- Legacy class removed in same migration commit:
    - `testing/trino-product-tests/src/main/java/io/trino/tests/product/iceberg/TestIcebergSparkCompatibility.java`
- Class-level environment requirement: `SparkIcebergEnvironment`.
- Class-level tags: `Iceberg`.
- Method inventory complete: Yes. Legacy methods: `90`. Current methods: `90`.
- Legacy helper/resource dependencies accounted for: Legacy class source reviewed directly.
- Intentional differences summary: `HDP to Hive 3.1 migration`
- Method statuses present: `verified`.

#### Methods

##### `testTrinoReadingSparkData`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/iceberg/TestIcebergSparkCompatibility.java` ->
  `testTrinoReadingSparkData`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/iceberg/TestIcebergSparkCompatibility.java` ->
  `TestIcebergSparkCompatibility.testTrinoReadingSparkData`
- Mapping type: `direct`
- Environment parity: Current class requires `SparkIcebergEnvironment`. Routed by source review into `SuiteIceberg` run
    1.
- Tag parity: Current tags: `Iceberg`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`, `INSERT`. Legacy setup operations: `CREATE`, `INSERT`.
- Action parity: Current action verbs: `SELECT`. Legacy action verbs: `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `containsOnly`, `row`. Legacy assertion helpers:
  `assertThat`, `containsOnly`, `row`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: Current method uses parameter-injected environment helpers instead of Tempto
  query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`
- Reviewer note: Matched by current suite selection: `SuiteIceberg` run 1 Exact-name mapping with normalized body
  similarity `0.93`.
- Audit status: `verified`

##### `testSparkReadingTrinoData`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/iceberg/TestIcebergSparkCompatibility.java` ->
  `testSparkReadingTrinoData`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/iceberg/TestIcebergSparkCompatibility.java` ->
  `TestIcebergSparkCompatibility.testSparkReadingTrinoData`
- Mapping type: `direct`
- Environment parity: Current class requires `SparkIcebergEnvironment`. Routed by source review into `SuiteIceberg` run
    1.
- Tag parity: Current tags: `Iceberg`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`, `INSERT`. Legacy setup operations: `CREATE`, `INSERT`.
- Action parity: Current action verbs: `SELECT`. Legacy action verbs: `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `containsOnly`, `row`. Legacy assertion helpers:
  `assertThat`, `containsOnly`, `row`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: Current method uses parameter-injected environment helpers instead of Tempto
  query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`
- Reviewer note: Matched by current suite selection: `SuiteIceberg` run 1 Exact-name mapping with normalized body
  similarity `0.94`.
- Audit status: `verified`

##### `testSparkReadingTrinoDataWithVersions`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/iceberg/TestIcebergSparkCompatibility.java` ->
  `testSparkReadingTrinoDataWithVersions`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/iceberg/TestIcebergSparkCompatibility.java` ->
  `TestIcebergSparkCompatibility.testSparkReadingTrinoDataWithVersions`
- Mapping type: `direct`
- Environment parity: Current class requires `SparkIcebergEnvironment`. Routed by source review into `SuiteIceberg` run
    1.
- Tag parity: Current tags: `Iceberg`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`, `INSERT`. Legacy setup operations: `CREATE`, `INSERT`.
- Action parity: Current action verbs: `SELECT`. Legacy action verbs: `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `containsOnly`, `row`. Legacy assertion helpers:
  `assertThat`, `containsOnly`, `row`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: Current method uses parameter-injected environment helpers instead of Tempto
  query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`
- Reviewer note: Matched by current suite selection: `SuiteIceberg` run 1 Exact-name mapping with normalized body
  similarity `0.94`.
- Audit status: `verified`

##### `testSparkCreatesTrinoDrops`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/iceberg/TestIcebergSparkCompatibility.java` ->
  `testSparkCreatesTrinoDrops`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/iceberg/TestIcebergSparkCompatibility.java` ->
  `TestIcebergSparkCompatibility.testSparkCreatesTrinoDrops`
- Mapping type: `direct`
- Environment parity: Current class requires `SparkIcebergEnvironment`. Routed by source review into `SuiteIceberg` run
    1.
- Tag parity: Current tags: `Iceberg`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`. Legacy setup operations: `CREATE`.
- Action parity: Current action verbs: none. Legacy action verbs: none.
- Assertion parity: Current assertion helpers: none. No legacy assertion method body was available.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: Current method uses parameter-injected environment helpers instead of Tempto
  query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`
- Reviewer note: Matched by current suite selection: `SuiteIceberg` run 1 Exact-name mapping with normalized body
  similarity `0.58`.
- Audit status: `verified`

##### `testTrinoCreatesSparkDrops`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/iceberg/TestIcebergSparkCompatibility.java` ->
  `testTrinoCreatesSparkDrops`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/iceberg/TestIcebergSparkCompatibility.java` ->
  `TestIcebergSparkCompatibility.testTrinoCreatesSparkDrops`
- Mapping type: `direct`
- Environment parity: Current class requires `SparkIcebergEnvironment`. Routed by source review into `SuiteIceberg` run
    1.
- Tag parity: Current tags: `Iceberg`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`. Legacy setup operations: `CREATE`.
- Action parity: Current action verbs: none. Legacy action verbs: none.
- Assertion parity: Current assertion helpers: none. No legacy assertion method body was available.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: Current method uses parameter-injected environment helpers instead of Tempto
  query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`
- Reviewer note: Matched by current suite selection: `SuiteIceberg` run 1 Exact-name mapping with normalized body
  similarity `0.57`.
- Audit status: `verified`

##### `testSparkReadsTrinoPartitionedTable`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/iceberg/TestIcebergSparkCompatibility.java` ->
  `testSparkReadsTrinoPartitionedTable`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/iceberg/TestIcebergSparkCompatibility.java` ->
  `TestIcebergSparkCompatibility.testSparkReadsTrinoPartitionedTable`
- Mapping type: `direct`
- Environment parity: Current class requires `SparkIcebergEnvironment`. Routed by source review into `SuiteIceberg` run
    1.
- Tag parity: Current tags: `Iceberg`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`, `INSERT`. Legacy setup operations: `CREATE`, `INSERT`.
- Action parity: Current action verbs: `SELECT`. Legacy action verbs: `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `containsOnly`, `row`. Legacy assertion helpers:
  `assertThat`, `containsOnly`, `row`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: Current method uses parameter-injected environment helpers instead of Tempto
  query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`
- Reviewer note: Matched by current suite selection: `SuiteIceberg` run 1 Exact-name mapping with normalized body
  similarity `0.79`.
- Audit status: `verified`

##### `testTrinoReadsSparkPartitionedTable`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/iceberg/TestIcebergSparkCompatibility.java` ->
  `testTrinoReadsSparkPartitionedTable`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/iceberg/TestIcebergSparkCompatibility.java` ->
  `TestIcebergSparkCompatibility.testTrinoReadsSparkPartitionedTable`
- Mapping type: `direct`
- Environment parity: Current class requires `SparkIcebergEnvironment`. Routed by source review into `SuiteIceberg` run
    1.
- Tag parity: Current tags: `Iceberg`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`, `INSERT`. Legacy setup operations: `CREATE`, `INSERT`.
- Action parity: Current action verbs: `SELECT`. Legacy action verbs: `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `containsOnly`, `row`. Legacy assertion helpers:
  `assertThat`, `containsOnly`, `row`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: Current method uses parameter-injected environment helpers instead of Tempto
  query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`
- Reviewer note: Matched by current suite selection: `SuiteIceberg` run 1 Exact-name mapping with normalized body
  similarity `0.82`.
- Audit status: `verified`

##### `testSparkReadsTrinoNestedPartitionedTable`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/iceberg/TestIcebergSparkCompatibility.java` ->
  `testSparkReadsTrinoNestedPartitionedTable`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/iceberg/TestIcebergSparkCompatibility.java` ->
  `TestIcebergSparkCompatibility.testSparkReadsTrinoNestedPartitionedTable`
- Mapping type: `direct`
- Environment parity: Current class requires `SparkIcebergEnvironment`. Routed by source review into `SuiteIceberg` run
    1.
- Tag parity: Current tags: `Iceberg`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`, `INSERT`, `UPDATE`, `ALTER`. Legacy setup operations: `CREATE`,
  `INSERT`, `UPDATE`, `ALTER`.
- Action parity: Current action verbs: `WITH`, `SELECT`. Legacy action verbs: `WITH`, `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `assertThatThrownBy`, `containsOnly`,
  `hasMessageContaining`, `row`. Legacy assertion helpers: `assertQueryFailure`, `assertThat`, `containsOnly`,
  `hasMessageContaining`, `row`.
- Cleanup parity: Current cleanup operations: `DELETE`, `DROP`. Legacy cleanup operations: `DELETE`, `DROP`.
- Any observed difference, however small: Assertion helper names differ between legacy and current implementations.
  Current method uses parameter-injected environment helpers instead of Tempto query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`
- Reviewer note: Matched by current suite selection: `SuiteIceberg` run 1 Exact-name mapping with normalized body
  similarity `0.84`.
- Audit status: `verified`

##### `testTrinoReadsSparkNestedPartitionedTable`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/iceberg/TestIcebergSparkCompatibility.java` ->
  `testTrinoReadsSparkNestedPartitionedTable`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/iceberg/TestIcebergSparkCompatibility.java` ->
  `TestIcebergSparkCompatibility.testTrinoReadsSparkNestedPartitionedTable`
- Mapping type: `direct`
- Environment parity: Current class requires `SparkIcebergEnvironment`. Routed by source review into `SuiteIceberg` run
    1.
- Tag parity: Current tags: `Iceberg`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`, `INSERT`, `UPDATE`, `ALTER`. Legacy setup operations: `CREATE`,
  `INSERT`, `UPDATE`, `ALTER`.
- Action parity: Current action verbs: `SELECT`. Legacy action verbs: `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `assertThatThrownBy`, `containsOnly`, `row`. Legacy
  assertion helpers: `assertQueryFailure`, `assertThat`, `containsOnly`, `hasMessageContaining`, `row`.
- Cleanup parity: Current cleanup operations: `DELETE`, `DROP`. Legacy cleanup operations: `DELETE`, `DROP`.
- Any observed difference, however small: Assertion helper names differ between legacy and current implementations.
  Current method uses parameter-injected environment helpers instead of Tempto query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`
- Reviewer note: Matched by current suite selection: `SuiteIceberg` run 1 Exact-name mapping with normalized body
  similarity `0.82`.
- Audit status: `verified`

##### `testSparkReadsTrinoNestedPartitionedTableWithOneFieldStruct`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/iceberg/TestIcebergSparkCompatibility.java` ->
  `testSparkReadsTrinoNestedPartitionedTableWithOneFieldStruct`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/iceberg/TestIcebergSparkCompatibility.java` ->
  `TestIcebergSparkCompatibility.testSparkReadsTrinoNestedPartitionedTableWithOneFieldStruct`
- Mapping type: `direct`
- Environment parity: Current class requires `SparkIcebergEnvironment`. Routed by source review into `SuiteIceberg` run
    1.
- Tag parity: Current tags: `Iceberg`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`, `INSERT`. Legacy setup operations: `CREATE`, `INSERT`.
- Action parity: Current action verbs: `WITH`, `SELECT`. Legacy action verbs: `WITH`, `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `assertThatThrownBy`, `containsOnly`, `row`. Legacy
  assertion helpers: `assertThat`, `assertThatThrownBy`, `containsOnly`, `hasMessageContaining`, `row`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: Assertion helper names differ between legacy and current implementations.
  Current method uses parameter-injected environment helpers instead of Tempto query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`
- Reviewer note: Matched by current suite selection: `SuiteIceberg` run 1 Exact-name mapping with normalized body
  similarity `0.86`.
- Audit status: `verified`

##### `testTrinoReadsSparkNestedPartitionedTableWithOneFieldStruct`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/iceberg/TestIcebergSparkCompatibility.java` ->
  `testTrinoReadsSparkNestedPartitionedTableWithOneFieldStruct`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/iceberg/TestIcebergSparkCompatibility.java` ->
  `TestIcebergSparkCompatibility.testTrinoReadsSparkNestedPartitionedTableWithOneFieldStruct`
- Mapping type: `direct`
- Environment parity: Current class requires `SparkIcebergEnvironment`. Routed by source review into `SuiteIceberg` run
    1.
- Tag parity: Current tags: `Iceberg`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`, `INSERT`. Legacy setup operations: `CREATE`, `INSERT`.
- Action parity: Current action verbs: `SELECT`. Legacy action verbs: `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `assertThatThrownBy`, `containsOnly`, `row`. Legacy
  assertion helpers: `assertThat`, `assertThatThrownBy`, `containsOnly`, `hasMessageContaining`, `row`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: Assertion helper names differ between legacy and current implementations.
  Current method uses parameter-injected environment helpers instead of Tempto query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`
- Reviewer note: Matched by current suite selection: `SuiteIceberg` run 1 Exact-name mapping with normalized body
  similarity `0.87`.
- Audit status: `verified`

##### `testTrinoPartitionedByRealWithNaN`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/iceberg/TestIcebergSparkCompatibility.java` ->
  `testTrinoPartitionedByRealWithNaN`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/iceberg/TestIcebergSparkCompatibility.java` ->
  `TestIcebergSparkCompatibility.testTrinoPartitionedByRealWithNaN`
- Mapping type: `direct`
- Environment parity: Current class requires `SparkIcebergEnvironment`. Routed by source review into `SuiteIceberg` run
    1.
- Tag parity: Current tags: `Iceberg`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: none. No legacy setup method body was available.
- Action parity: Current action verbs: none. No legacy action method body was available.
- Assertion parity: Current assertion helpers: none. No legacy assertion method body was available.
- Cleanup parity: Current cleanup operations: none. No legacy cleanup method body was available.
- Any observed difference, however small: No method-specific difference identified beyond the documented framework
  baseline.
- Known intentional difference: None.
- Reviewer note: Matched by current suite selection: `SuiteIceberg` run 1 High normalized body similarity `0.87`.
- Audit status: `verified`

##### `testTrinoPartitionedByDoubleWithNaN`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/iceberg/TestIcebergSparkCompatibility.java` ->
  `testTrinoPartitionedByDoubleWithNaN`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/iceberg/TestIcebergSparkCompatibility.java` ->
  `TestIcebergSparkCompatibility.testTrinoPartitionedByDoubleWithNaN`
- Mapping type: `direct`
- Environment parity: Current class requires `SparkIcebergEnvironment`. Routed by source review into `SuiteIceberg` run
    1.
- Tag parity: Current tags: `Iceberg`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: none. No legacy setup method body was available.
- Action parity: Current action verbs: none. No legacy action method body was available.
- Assertion parity: Current assertion helpers: none. No legacy assertion method body was available.
- Cleanup parity: Current cleanup operations: none. No legacy cleanup method body was available.
- Any observed difference, however small: No method-specific difference identified beyond the documented framework
  baseline.
- Known intentional difference: None.
- Reviewer note: Matched by current suite selection: `SuiteIceberg` run 1 High normalized body similarity `0.87`.
- Audit status: `verified`

##### `testSparkPartitionedByRealWithNaN`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/iceberg/TestIcebergSparkCompatibility.java` ->
  `testSparkPartitionedByRealWithNaN`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/iceberg/TestIcebergSparkCompatibility.java` ->
  `TestIcebergSparkCompatibility.testSparkPartitionedByRealWithNaN`
- Mapping type: `direct`
- Environment parity: Current class requires `SparkIcebergEnvironment`. Routed by source review into `SuiteIceberg` run
    1.
- Tag parity: Current tags: `Iceberg`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: none. No legacy setup method body was available.
- Action parity: Current action verbs: none. No legacy action method body was available.
- Assertion parity: Current assertion helpers: none. No legacy assertion method body was available.
- Cleanup parity: Current cleanup operations: none. No legacy cleanup method body was available.
- Any observed difference, however small: No method-specific difference identified beyond the documented framework
  baseline.
- Known intentional difference: None.
- Reviewer note: Matched by current suite selection: `SuiteIceberg` run 1 High normalized body similarity `0.87`.
- Audit status: `verified`

##### `testSparkPartitionedByDoubleWithNaN`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/iceberg/TestIcebergSparkCompatibility.java` ->
  `testSparkPartitionedByDoubleWithNaN`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/iceberg/TestIcebergSparkCompatibility.java` ->
  `TestIcebergSparkCompatibility.testSparkPartitionedByDoubleWithNaN`
- Mapping type: `direct`
- Environment parity: Current class requires `SparkIcebergEnvironment`. Routed by source review into `SuiteIceberg` run
    1.
- Tag parity: Current tags: `Iceberg`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: none. No legacy setup method body was available.
- Action parity: Current action verbs: none. No legacy action method body was available.
- Assertion parity: Current assertion helpers: none. No legacy assertion method body was available.
- Cleanup parity: Current cleanup operations: none. No legacy cleanup method body was available.
- Any observed difference, however small: No method-specific difference identified beyond the documented framework
  baseline.
- Known intentional difference: None.
- Reviewer note: Matched by current suite selection: `SuiteIceberg` run 1 High normalized body similarity `0.87`.
- Audit status: `verified`

##### `testTrinoReadingCompositeSparkData`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/iceberg/TestIcebergSparkCompatibility.java` ->
  `testTrinoReadingCompositeSparkData`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/iceberg/TestIcebergSparkCompatibility.java` ->
  `TestIcebergSparkCompatibility.testTrinoReadingCompositeSparkData`
- Mapping type: `direct`
- Environment parity: Current class requires `SparkIcebergEnvironment`. Routed by source review into `SuiteIceberg` run
    1.
- Tag parity: Current tags: `Iceberg`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`, `INSERT`. Legacy setup operations: `CREATE`, `INSERT`.
- Action parity: Current action verbs: `SELECT`. Legacy action verbs: `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `containsOnly`, `row`. Legacy assertion helpers:
  `assertThat`, `containsOnly`, `row`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: Current method uses parameter-injected environment helpers instead of Tempto
  query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`
- Reviewer note: Matched by current suite selection: `SuiteIceberg` run 1 Exact-name mapping with normalized body
  similarity `0.93`.
- Audit status: `verified`

##### `testSparkReadingCompositeTrinoData`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/iceberg/TestIcebergSparkCompatibility.java` ->
  `testSparkReadingCompositeTrinoData`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/iceberg/TestIcebergSparkCompatibility.java` ->
  `TestIcebergSparkCompatibility.testSparkReadingCompositeTrinoData`
- Mapping type: `direct`
- Environment parity: Current class requires `SparkIcebergEnvironment`. Routed by source review into `SuiteIceberg` run
    1.
- Tag parity: Current tags: `Iceberg`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`, `INSERT`. Legacy setup operations: `CREATE`, `INSERT`.
- Action parity: Current action verbs: `WITH`, `SELECT`. Legacy action verbs: `WITH`, `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `containsOnly`, `row`. Legacy assertion helpers:
  `assertThat`, `containsOnly`, `row`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: Current method uses parameter-injected environment helpers instead of Tempto
  query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`
- Reviewer note: Matched by current suite selection: `SuiteIceberg` run 1 Exact-name mapping with normalized body
  similarity `0.92`.
- Audit status: `verified`

##### `testTrinoReadingSparkIcebergTablePropertiesData`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/iceberg/TestIcebergSparkCompatibility.java` ->
  `testTrinoReadingSparkIcebergTablePropertiesData`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/iceberg/TestIcebergSparkCompatibility.java` ->
  `TestIcebergSparkCompatibility.testTrinoReadingSparkIcebergTablePropertiesData`
- Mapping type: `direct`
- Environment parity: Current class requires `SparkIcebergEnvironment`. Routed by source review into `SuiteIceberg` run
    1.
- Tag parity: Current tags: `Iceberg`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`. Legacy setup operations: `CREATE`.
- Action parity: Current action verbs: `SELECT`. Legacy action verbs: `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `contains`, `row`. Legacy assertion helpers: `assertThat`,
  `contains`, `row`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: Current method uses parameter-injected environment helpers instead of Tempto
  query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`
- Reviewer note: Matched by current suite selection: `SuiteIceberg` run 1 Exact-name mapping with normalized body
  similarity `0.93`.
- Audit status: `verified`

##### `testSparkReadingTrinoIcebergTablePropertiesData`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/iceberg/TestIcebergSparkCompatibility.java` ->
  `testSparkReadingTrinoIcebergTablePropertiesData`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/iceberg/TestIcebergSparkCompatibility.java` ->
  `TestIcebergSparkCompatibility.testSparkReadingTrinoIcebergTablePropertiesData`
- Mapping type: `direct`
- Environment parity: Current class requires `SparkIcebergEnvironment`. Routed by source review into `SuiteIceberg` run
    1.
- Tag parity: Current tags: `Iceberg`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`. Legacy setup operations: `CREATE`.
- Action parity: Current action verbs: `WITH`, `SHOW`. Legacy action verbs: `WITH`, `SHOW`.
- Assertion parity: Current assertion helpers: `assertThat`, `contains`, `row`. Legacy assertion helpers: `assertThat`,
  `contains`, `row`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: Current method uses parameter-injected environment helpers instead of Tempto
  query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`
- Reviewer note: Matched by current suite selection: `SuiteIceberg` run 1 Exact-name mapping with normalized body
  similarity `0.93`.
- Audit status: `verified`

##### `testTrinoReadingNestedSparkData`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/iceberg/TestIcebergSparkCompatibility.java` ->
  `testTrinoReadingNestedSparkData`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/iceberg/TestIcebergSparkCompatibility.java` ->
  `TestIcebergSparkCompatibility.testTrinoReadingNestedSparkData`
- Mapping type: `direct`
- Environment parity: Current class requires `SparkIcebergEnvironment`. Routed by source review into `SuiteIceberg` run
    1.
- Tag parity: Current tags: `Iceberg`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`, `INSERT`. Legacy setup operations: `CREATE`, `INSERT`.
- Action parity: Current action verbs: `SELECT`. Legacy action verbs: `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `containsOnly`, `row`. Legacy assertion helpers:
  `assertThat`, `containsOnly`, `row`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: Current method uses parameter-injected environment helpers instead of Tempto
  query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`
- Reviewer note: Matched by current suite selection: `SuiteIceberg` run 1 Exact-name mapping with normalized body
  similarity `0.95`.
- Audit status: `verified`

##### `testSparkReadingNestedTrinoData`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/iceberg/TestIcebergSparkCompatibility.java` ->
  `testSparkReadingNestedTrinoData`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/iceberg/TestIcebergSparkCompatibility.java` ->
  `TestIcebergSparkCompatibility.testSparkReadingNestedTrinoData`
- Mapping type: `direct`
- Environment parity: Current class requires `SparkIcebergEnvironment`. Routed by source review into `SuiteIceberg` run
    1.
- Tag parity: Current tags: `Iceberg`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`, `INSERT`. Legacy setup operations: `CREATE`, `INSERT`.
- Action parity: Current action verbs: `WITH`, `SELECT`. Legacy action verbs: `WITH`, `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `containsOnly`, `row`. Legacy assertion helpers:
  `assertThat`, `containsOnly`, `row`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: Current method uses parameter-injected environment helpers instead of Tempto
  query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`
- Reviewer note: Matched by current suite selection: `SuiteIceberg` run 1 Exact-name mapping with normalized body
  similarity `0.82`.
- Audit status: `verified`

##### `testTrinoWritingDataAfterSpark`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/iceberg/TestIcebergSparkCompatibility.java` ->
  `testTrinoWritingDataAfterSpark`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/iceberg/TestIcebergSparkCompatibility.java` ->
  `TestIcebergSparkCompatibility.testTrinoWritingDataAfterSpark`
- Mapping type: `direct`
- Environment parity: Current class requires `SparkIcebergEnvironment`. Routed by source review into `SuiteIceberg` run
    1.
- Tag parity: Current tags: `Iceberg`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`, `INSERT`. Legacy setup operations: `CREATE`, `INSERT`.
- Action parity: Current action verbs: `SELECT`. Legacy action verbs: `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `containsOnly`, `row`. Legacy assertion helpers:
  `assertThat`, `containsOnly`, `row`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: Current method uses parameter-injected environment helpers instead of Tempto
  query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`
- Reviewer note: Matched by current suite selection: `SuiteIceberg` run 1 Exact-name mapping with normalized body
  similarity `0.85`.
- Audit status: `verified`

##### `testTrinoSparkConcurrentInsert`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/iceberg/TestIcebergSparkCompatibility.java` ->
  `testTrinoSparkConcurrentInsert`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/iceberg/TestIcebergSparkCompatibility.java` ->
  `TestIcebergSparkCompatibility.testTrinoSparkConcurrentInsert`
- Mapping type: `direct`
- Environment parity: Current class requires `SparkIcebergEnvironment`. Routed by source review into `SuiteIceberg` run
    1.
- Tag parity: Current tags: `Iceberg`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`, `INSERT`. Legacy setup operations: `CREATE`, `INSERT`.
- Action parity: Current action verbs: `SELECT`. Legacy action verbs: `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `containsOnly`, `row`. Legacy assertion helpers:
  `assertThat`, `containsOnly`, `row`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: Current method uses parameter-injected environment helpers instead of Tempto
  query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`
- Reviewer note: Matched by current suite selection: `SuiteIceberg` run 1 Exact-name mapping with normalized body
  similarity `0.88`.
- Audit status: `verified`

##### `testTrinoShowingSparkCreatedTables`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/iceberg/TestIcebergSparkCompatibility.java` ->
  `testTrinoShowingSparkCreatedTables`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/iceberg/TestIcebergSparkCompatibility.java` ->
  `TestIcebergSparkCompatibility.testTrinoShowingSparkCreatedTables`
- Mapping type: `direct`
- Environment parity: Current class requires `SparkIcebergEnvironment`. Routed by source review into `SuiteIceberg` run
    1.
- Tag parity: Current tags: `Iceberg`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`. Legacy setup operations: `CREATE`.
- Action parity: Current action verbs: `SHOW`. Legacy action verbs: `SHOW`.
- Assertion parity: Current assertion helpers: `assertThat`, `containsOnly`, `row`. Legacy assertion helpers:
  `assertThat`, `containsOnly`, `row`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: Current method uses parameter-injected environment helpers instead of Tempto
  query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`
- Reviewer note: Matched by current suite selection: `SuiteIceberg` run 1 Exact-name mapping with normalized body
  similarity `0.67`.
- Audit status: `verified`

##### `testSparkReadingTrinoParquetBloomFilters`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/iceberg/TestIcebergSparkCompatibility.java` ->
  `testSparkReadingTrinoParquetBloomFilters`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/iceberg/TestIcebergSparkCompatibility.java` ->
  `TestIcebergSparkCompatibility.testSparkReadingTrinoParquetBloomFilters`
- Mapping type: `direct`
- Environment parity: Current class requires `SparkIcebergEnvironment`. Routed by source review into `SuiteIceberg` run
    1.
- Tag parity: Current tags: `Iceberg`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`, `INSERT`. Legacy setup operations: `CREATE`, `INSERT`.
- Action parity: Current action verbs: `WITH`, `SELECT`. Legacy action verbs: `WITH`, `SELECT`.
- Assertion parity: Current assertion helpers: `assertSparkBloomFilterTableSelectResult`,
  `assertTrinoBloomFilterTableSelectResult`. Legacy assertion helpers: `assertSparkBloomFilterTableSelectResult`,
  `assertTrinoBloomFilterTableSelectResult`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: Current method uses parameter-injected environment helpers instead of Tempto
  query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`
- Reviewer note: Matched by current suite selection: `SuiteIceberg` run 1 Exact-name mapping with normalized body
  similarity `0.96`.
- Audit status: `verified`

##### `testTrinoReadingSparkParquetBloomFilters`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/iceberg/TestIcebergSparkCompatibility.java` ->
  `testTrinoReadingSparkParquetBloomFilters`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/iceberg/TestIcebergSparkCompatibility.java` ->
  `TestIcebergSparkCompatibility.testTrinoReadingSparkParquetBloomFilters`
- Mapping type: `direct`
- Environment parity: Current class requires `SparkIcebergEnvironment`. Routed by source review into `SuiteIceberg` run
    1.
- Tag parity: Current tags: `Iceberg`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`, `INSERT`. Legacy setup operations: `CREATE`, `INSERT`.
- Action parity: Current action verbs: `SELECT`. Legacy action verbs: `SELECT`.
- Assertion parity: Current assertion helpers: `assertSparkBloomFilterTableSelectResult`,
  `assertTrinoBloomFilterTableSelectResult`. Legacy assertion helpers: `assertSparkBloomFilterTableSelectResult`,
  `assertTrinoBloomFilterTableSelectResult`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: Current method uses parameter-injected environment helpers instead of Tempto
  query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`
- Reviewer note: Matched by current suite selection: `SuiteIceberg` run 1 Exact-name mapping with normalized body
  similarity `0.96`.
- Audit status: `verified`

##### `testTrinoAnalyze`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/iceberg/TestIcebergSparkCompatibility.java` ->
  `testTrinoAnalyze`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/iceberg/TestIcebergSparkCompatibility.java` ->
  `TestIcebergSparkCompatibility.testTrinoAnalyze`
- Mapping type: `direct`
- Environment parity: Current class requires `SparkIcebergEnvironment`. Routed by source review into `SuiteIceberg` run
    1.
- Tag parity: Current tags: `Iceberg`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`. Legacy setup operations: `CREATE`.
- Action parity: Current action verbs: `ANALYZE`, `SELECT`. Legacy action verbs: `ANALYZE`, `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `containsOnly`, `row`. Legacy assertion helpers:
  `assertThat`, `containsOnly`, `row`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: Current method uses parameter-injected environment helpers instead of Tempto
  query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`
- Reviewer note: Matched by current suite selection: `SuiteIceberg` run 1 Exact-name mapping with normalized body
  similarity `0.86`.
- Audit status: `verified`

##### `testOptimizeManifests`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/iceberg/TestIcebergSparkCompatibility.java` ->
  `testOptimizeManifests`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/iceberg/TestIcebergSparkCompatibility.java` ->
  `TestIcebergSparkCompatibility.testOptimizeManifests`
- Mapping type: `direct`
- Environment parity: Current class requires `SparkIcebergEnvironment`. Routed by source review into `SuiteIceberg` run
    1.
- Tag parity: Current tags: `Iceberg`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`, `INSERT`, `ALTER`. Legacy setup operations: `CREATE`, `INSERT`,
  `ALTER`.
- Action parity: Current action verbs: `SELECT`. Legacy action verbs: `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `containsOnly`, `row`. Legacy assertion helpers:
  `assertThat`, `containsOnly`, `row`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: Current method uses parameter-injected environment helpers instead of Tempto
  query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`
- Reviewer note: Matched by current suite selection: `SuiteIceberg` run 1 Exact-name mapping with normalized body
  similarity `0.86`.
- Audit status: `verified`

##### `testAlterTableExecuteProceduresOnEmptyTable`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/iceberg/TestIcebergSparkCompatibility.java` ->
  `testAlterTableExecuteProceduresOnEmptyTable`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/iceberg/TestIcebergSparkCompatibility.java` ->
  `TestIcebergSparkCompatibility.testAlterTableExecuteProceduresOnEmptyTable`
- Mapping type: `direct`
- Environment parity: Current class requires `SparkIcebergEnvironment`. Routed by source review into `SuiteIceberg` run
    1.
- Tag parity: Current tags: `Iceberg`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`, `ALTER`. Legacy setup operations: `CREATE`, `ALTER`.
- Action parity: Current action verbs: `SELECT`. Legacy action verbs: `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`. Legacy assertion helpers: `assertThat`.
- Cleanup parity: Current cleanup operations: none. No legacy cleanup method body was available.
- Any observed difference, however small: Current method uses parameter-injected environment helpers instead of Tempto
  query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`
- Reviewer note: Matched by current suite selection: `SuiteIceberg` run 1 Exact-name mapping with normalized body
  similarity `0.89`.
- Audit status: `verified`

##### `testAddNotNullColumn`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/iceberg/TestIcebergSparkCompatibility.java` ->
  `testAddNotNullColumn`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/iceberg/TestIcebergSparkCompatibility.java` ->
  `TestIcebergSparkCompatibility.testAddNotNullColumn`
- Mapping type: `direct`
- Environment parity: Current class requires `SparkIcebergEnvironment`. Routed by source review into `SuiteIceberg` run
    1.
- Tag parity: Current tags: `Iceberg`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`, `ALTER`. Legacy setup operations: `CREATE`, `ALTER`.
- Action parity: Current action verbs: `SELECT`. Legacy action verbs: `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `assertThatThrownBy`, `containsOnly`,
  `hasMessageContaining`, `row`. Legacy assertion helpers: `assertQueryFailure`, `assertThat`, `containsOnly`, `row`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: Assertion helper names differ between legacy and current implementations.
  Current method uses parameter-injected environment helpers instead of Tempto query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`
- Reviewer note: Matched by current suite selection: `SuiteIceberg` run 1 Exact-name mapping with normalized body
  similarity `0.76`.
- Audit status: `verified`

##### `testAddNestedField`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/iceberg/TestIcebergSparkCompatibility.java` ->
  `testAddNestedField`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/iceberg/TestIcebergSparkCompatibility.java` ->
  `TestIcebergSparkCompatibility.testAddNestedField`
- Mapping type: `direct`
- Environment parity: Current class requires `SparkIcebergEnvironment`. Routed by source review into `SuiteIceberg` run
    1.
- Tag parity: Current tags: `Iceberg`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`, `ALTER`. Legacy setup operations: `CREATE`, `ALTER`.
- Action parity: Current action verbs: `SELECT`. Legacy action verbs: `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `containsOnly`, `row`. Legacy assertion helpers:
  `assertThat`, `containsOnly`, `row`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: Current method uses parameter-injected environment helpers instead of Tempto
  query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`
- Reviewer note: Matched by current suite selection: `SuiteIceberg` run 1 Exact-name mapping with normalized body
  similarity `0.82`.
- Audit status: `verified`

##### `testDropNestedField`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/iceberg/TestIcebergSparkCompatibility.java` ->
  `testDropNestedField`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/iceberg/TestIcebergSparkCompatibility.java` ->
  `TestIcebergSparkCompatibility.testDropNestedField`
- Mapping type: `direct`
- Environment parity: Current class requires `SparkIcebergEnvironment`. Routed by source review into `SuiteIceberg` run
    1.
- Tag parity: Current tags: `Iceberg`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`, `ALTER`. Legacy setup operations: `CREATE`, `ALTER`.
- Action parity: Current action verbs: `SELECT`. Legacy action verbs: `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `containsOnly`, `row`. Legacy assertion helpers:
  `assertThat`, `containsOnly`, `row`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: Current method uses parameter-injected environment helpers instead of Tempto
  query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`
- Reviewer note: Matched by current suite selection: `SuiteIceberg` run 1 Exact-name mapping with normalized body
  similarity `0.88`.
- Audit status: `verified`

##### `testTrinoReadsSparkRowLevelDeletes`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/iceberg/TestIcebergSparkCompatibility.java` ->
  `testTrinoReadsSparkRowLevelDeletes`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/iceberg/TestIcebergSparkCompatibility.java` ->
  `TestIcebergSparkCompatibility.testTrinoReadsSparkRowLevelDeletes`
- Mapping type: `direct`
- Environment parity: Current class requires `SparkIcebergEnvironment`. Routed by source review into `SuiteIceberg` run
    1.
- Tag parity: Current tags: `Iceberg`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`, `INSERT`. Legacy setup operations: `CREATE`, `INSERT`.
- Action parity: Current action verbs: `CALL`, `SELECT`. Legacy action verbs: `CALL`, `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `containsOnly`, `row`. Legacy assertion helpers:
  `assertThat`, `containsOnly`, `row`.
- Cleanup parity: Current cleanup operations: `DELETE`, `DROP`. Legacy cleanup operations: `DELETE`, `DROP`.
- Any observed difference, however small: Current method uses parameter-injected environment helpers instead of Tempto
  query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`
- Reviewer note: Matched by current suite selection: `SuiteIceberg` run 1 Exact-name mapping with normalized body
  similarity `0.90`.
- Audit status: `verified`

##### `testSparkReadsTrinoRowLevelDeletes`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/iceberg/TestIcebergSparkCompatibility.java` ->
  `testSparkReadsTrinoRowLevelDeletes`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/iceberg/TestIcebergSparkCompatibility.java` ->
  `TestIcebergSparkCompatibility.testSparkReadsTrinoRowLevelDeletes`
- Mapping type: `direct`
- Environment parity: Current class requires `SparkIcebergEnvironment`. Routed by source review into `SuiteIceberg` run
    1.
- Tag parity: Current tags: `Iceberg`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`, `INSERT`. Legacy setup operations: `CREATE`, `INSERT`.
- Action parity: Current action verbs: `SELECT`. Legacy action verbs: `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `containsOnly`, `row`. Legacy assertion helpers:
  `assertThat`, `containsOnly`, `row`.
- Cleanup parity: Current cleanup operations: `DELETE`, `DROP`. Legacy cleanup operations: `DELETE`, `DROP`.
- Any observed difference, however small: Current method uses parameter-injected environment helpers instead of Tempto
  query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`
- Reviewer note: Matched by current suite selection: `SuiteIceberg` run 1 Exact-name mapping with normalized body
  similarity `0.87`.
- Audit status: `verified`

##### `testSparkReadsTrinoV3DeletionVectors`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/iceberg/TestIcebergSparkCompatibility.java` ->
  `testSparkReadsTrinoV3DeletionVectors`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/iceberg/TestIcebergSparkCompatibility.java` ->
  `TestIcebergSparkCompatibility.testSparkReadsTrinoV3DeletionVectors`
- Mapping type: `direct`
- Environment parity: Current class requires `SparkIcebergEnvironment`. Routed by source review into `SuiteIceberg` run
    1.
- Tag parity: Current tags: `Iceberg`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`, `INSERT`. Legacy setup operations: `CREATE`, `INSERT`.
- Action parity: Current action verbs: `SELECT`. Legacy action verbs: `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `containsOnly`, `row`. Legacy assertion helpers:
  `assertThat`, `containsOnly`, `row`.
- Cleanup parity: Current cleanup operations: `DELETE`, `DROP`. Legacy cleanup operations: `DELETE`, `DROP`.
- Any observed difference, however small: Current method uses parameter-injected environment helpers instead of Tempto
  query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`
- Reviewer note: Matched by current suite selection: `SuiteIceberg` run 1 Exact-name mapping with normalized body
  similarity `0.83`.
- Audit status: `verified`

##### `testTrinoReadsSparkV3DeletionVectors`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/iceberg/TestIcebergSparkCompatibility.java` ->
  `testTrinoReadsSparkV3DeletionVectors`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/iceberg/TestIcebergSparkCompatibility.java` ->
  `TestIcebergSparkCompatibility.testTrinoReadsSparkV3DeletionVectors`
- Mapping type: `direct`
- Environment parity: Current class requires `SparkIcebergEnvironment`. Routed by source review into `SuiteIceberg` run
    1.
- Tag parity: Current tags: `Iceberg`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`, `INSERT`. Legacy setup operations: `CREATE`, `INSERT`.
- Action parity: Current action verbs: `SELECT`. Legacy action verbs: `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `containsOnly`, `row`. Legacy assertion helpers:
  `assertThat`, `containsOnly`, `row`.
- Cleanup parity: Current cleanup operations: `DELETE`, `DROP`. Legacy cleanup operations: `DELETE`, `DROP`.
- Any observed difference, however small: Current method uses parameter-injected environment helpers instead of Tempto
  query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`
- Reviewer note: Matched by current suite selection: `SuiteIceberg` run 1 Exact-name mapping with normalized body
  similarity `0.87`.
- Audit status: `verified`

##### `testIdBasedFieldMapping`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/iceberg/TestIcebergSparkCompatibility.java` ->
  `testIdBasedFieldMapping`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/iceberg/TestIcebergSparkCompatibility.java` ->
  `TestIcebergSparkCompatibility.testIdBasedFieldMapping`
- Mapping type: `direct`
- Environment parity: Current class requires `SparkIcebergEnvironment`. Routed by source review into `SuiteIceberg` run
    1.
- Tag parity: Current tags: `Iceberg`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`, `INSERT`, `ALTER`. Legacy setup operations: `CREATE`, `INSERT`,
  `ALTER`.
- Action parity: Current action verbs: `DESCRIBE`, `SELECT`. Legacy action verbs: `DESCRIBE`, `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `containsOnly`, `row`. Legacy assertion helpers:
  `assertThat`, `containsOnly`, `row`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: Current method uses parameter-injected environment helpers instead of Tempto
  query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`
- Reviewer note: Matched by current suite selection: `SuiteIceberg` run 1 Exact-name mapping with normalized body
  similarity `0.91`.
- Audit status: `verified`

##### `testReadAfterPartitionEvolution`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/iceberg/TestIcebergSparkCompatibility.java` ->
  `testReadAfterPartitionEvolution`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/iceberg/TestIcebergSparkCompatibility.java` ->
  `TestIcebergSparkCompatibility.testReadAfterPartitionEvolution`
- Mapping type: `direct`
- Environment parity: Current class requires `SparkIcebergEnvironment`. Routed by source review into `SuiteIceberg` run
    1.
- Tag parity: Current tags: `Iceberg`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`, `INSERT`, `ALTER`. Legacy setup operations: `CREATE`, `INSERT`,
  `ALTER`.
- Action parity: Current action verbs: `SELECT`. Legacy action verbs: `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `containsOnly`, `row`. Legacy assertion helpers:
  `assertThat`, `containsOnly`, `row`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: Current method uses parameter-injected environment helpers instead of Tempto
  query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`
- Reviewer note: Matched by current suite selection: `SuiteIceberg` run 1 Exact-name mapping with normalized body
  similarity `0.66`.
- Audit status: `verified`

##### `testUpdateAfterSchemaEvolution`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/iceberg/TestIcebergSparkCompatibility.java` ->
  `testUpdateAfterSchemaEvolution`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/iceberg/TestIcebergSparkCompatibility.java` ->
  `TestIcebergSparkCompatibility.testUpdateAfterSchemaEvolution`
- Mapping type: `direct`
- Environment parity: Current class requires `SparkIcebergEnvironment`. Routed by source review into `SuiteIceberg` run
    1.
- Tag parity: Current tags: `Iceberg`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`, `INSERT`, `ALTER`, `UPDATE`. Legacy setup operations: `CREATE`,
  `INSERT`, `ALTER`, `UPDATE`.
- Action parity: Current action verbs: `SELECT`. Legacy action verbs: `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `contains`, `containsOnly`, `isEqualTo`, `row`. Legacy
  assertion helpers: `assertThat`, `contains`, `containsOnly`, `isEqualTo`, `row`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: Current method uses parameter-injected environment helpers instead of Tempto
  query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`
- Reviewer note: Matched by current suite selection: `SuiteIceberg` run 1 Exact-name mapping with normalized body
  similarity `0.70`.
- Audit status: `verified`

##### `testUpdateOnPartitionColumn`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/iceberg/TestIcebergSparkCompatibility.java` ->
  `testUpdateOnPartitionColumn`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/iceberg/TestIcebergSparkCompatibility.java` ->
  `TestIcebergSparkCompatibility.testUpdateOnPartitionColumn`
- Mapping type: `direct`
- Environment parity: Current class requires `SparkIcebergEnvironment`. Routed by source review into `SuiteIceberg` run
    1.
- Tag parity: Current tags: `Iceberg`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`, `INSERT`, `UPDATE`. Legacy setup operations: `CREATE`, `INSERT`,
  `UPDATE`.
- Action parity: Current action verbs: `SELECT`, `CALL`. Legacy action verbs: `SELECT`, `CALL`.
- Assertion parity: Current assertion helpers: `assertThat`, `containsOnly`, `row`. Legacy assertion helpers:
  `assertThat`, `containsOnly`, `row`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: Current method uses parameter-injected environment helpers instead of Tempto
  query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`
- Reviewer note: Matched by current suite selection: `SuiteIceberg` run 1 Exact-name mapping with normalized body
  similarity `0.87`.
- Audit status: `verified`

##### `testPartitionColumnNameConflict`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/iceberg/TestIcebergSparkCompatibility.java` ->
  `testPartitionColumnNameConflict`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/iceberg/TestIcebergSparkCompatibility.java` ->
  `TestIcebergSparkCompatibility.testPartitionColumnNameConflict`
- Mapping type: `direct`
- Environment parity: Current class requires `SparkIcebergEnvironment`. Routed by source review into `SuiteIceberg` run
    1.
- Tag parity: Current tags: `Iceberg`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`, `INSERT`. Legacy setup operations: `CREATE`, `INSERT`.
- Action parity: Current action verbs: `SELECT`. Legacy action verbs: `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `containsOnly`, `row`. Legacy assertion helpers:
  `assertThat`, `containsOnly`, `row`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: Current method uses parameter-injected environment helpers instead of Tempto
  query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`
- Reviewer note: Matched by current suite selection: `SuiteIceberg` run 1 Exact-name mapping with normalized body
  similarity `0.86`.
- Audit status: `verified`

##### `testTrinoReadsSparkSortOrder`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/iceberg/TestIcebergSparkCompatibility.java` ->
  `testTrinoReadsSparkSortOrder`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/iceberg/TestIcebergSparkCompatibility.java` ->
  `TestIcebergSparkCompatibility.testTrinoReadsSparkSortOrder`
- Mapping type: `direct`
- Environment parity: Current class requires `SparkIcebergEnvironment`. Routed by source review into `SuiteIceberg` run
    1.
- Tag parity: Current tags: `Iceberg`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`, `ALTER`, `INSERT`. Legacy setup operations: `CREATE`, `ALTER`,
  `INSERT`.
- Action parity: Current action verbs: `SHOW`, `SELECT`. Legacy action verbs: `SHOW`, `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `contains`, `row`. Legacy assertion helpers: `assertThat`,
  `contains`, `row`.
- Cleanup parity: Current cleanup operations: `DROP`. No legacy cleanup method body was available.
- Any observed difference, however small: SQL verb set differs: legacy ['CREATE', 'ALTER', 'SHOW', 'INSERT', 'SELECT']
  vs current ['CREATE', 'ALTER', 'SHOW', 'INSERT', 'SELECT', 'DROP']. Current method uses parameter-injected environment
  helpers instead of Tempto query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`
- Reviewer note: Matched by current suite selection: `SuiteIceberg` run 1 Exact-name mapping with normalized body
  similarity `0.88`.
- Audit status: `verified`

##### `testMetadataCompressionCodecGzip`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/iceberg/TestIcebergSparkCompatibility.java` ->
  `testMetadataCompressionCodecGzip`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/iceberg/TestIcebergSparkCompatibility.java` ->
  `TestIcebergSparkCompatibility.testMetadataCompressionCodecGzip`
- Mapping type: `direct`
- Environment parity: Current class requires `SparkIcebergEnvironment`. Routed by source review into `SuiteIceberg` run
    1.
- Tag parity: Current tags: `Iceberg`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`, `INSERT`, `ALTER`. Legacy setup operations: `CREATE`, `INSERT`,
  `ALTER`.
- Action parity: Current action verbs: `SELECT`. Legacy action verbs: `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `containsOnly`, `isEqualTo`, `row`. Legacy assertion
  helpers: `assertThat`, `containsOnly`, `isEqualTo`, `row`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: Current method uses parameter-injected environment helpers instead of Tempto
  query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`
- Reviewer note: Matched by current suite selection: `SuiteIceberg` run 1 Exact-name mapping with normalized body
  similarity `0.87`.
- Audit status: `verified`

##### `testCreateAndDropTableWithSameLocationWorksOnSpark`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/iceberg/TestIcebergSparkCompatibility.java` ->
  `testCreateAndDropTableWithSameLocationWorksOnSpark`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/iceberg/TestIcebergSparkCompatibility.java` ->
  `TestIcebergSparkCompatibility.testCreateAndDropTableWithSameLocationWorksOnSpark`
- Mapping type: `direct`
- Environment parity: Current class requires `SparkIcebergEnvironment`. Routed by source review into `SuiteIceberg` run
    1.
- Tag parity: Current tags: `Iceberg`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`. Legacy setup operations: `CREATE`.
- Action parity: Current action verbs: `SELECT`. Legacy action verbs: `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`. Legacy assertion helpers: `assertThat`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: Current method uses parameter-injected environment helpers instead of Tempto
  query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`
- Reviewer note: Matched by current suite selection: `SuiteIceberg` run 1 Exact-name mapping with normalized body
  similarity `0.63`.
- Audit status: `verified`

##### `testCreateAndDropTableWithSameLocationFailsOnTrino`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/iceberg/TestIcebergSparkCompatibility.java` ->
  `testCreateAndDropTableWithSameLocationFailsOnTrino`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/iceberg/TestIcebergSparkCompatibility.java` ->
  `TestIcebergSparkCompatibility.testCreateAndDropTableWithSameLocationFailsOnTrino`
- Mapping type: `direct`
- Environment parity: Current class requires `SparkIcebergEnvironment`. Routed by source review into `SuiteIceberg` run
    1.
- Tag parity: Current tags: `Iceberg`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`. Legacy setup operations: `CREATE`.
- Action parity: Current action verbs: `SELECT`. Legacy action verbs: `SELECT`.
- Assertion parity: Current assertion helpers: `assertThatThrownBy`, `hasMessageContaining`. Legacy assertion helpers:
  `assertQueryFailure`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: Assertion helper names differ between legacy and current implementations.
  Current method uses parameter-injected environment helpers instead of Tempto query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`
- Reviewer note: Matched by current suite selection: `SuiteIceberg` run 1 Exact-name mapping with normalized body
  similarity `0.56`.
- Audit status: `verified`

##### `testTrinoWritingDataWithObjectStorageLocationProvider`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/iceberg/TestIcebergSparkCompatibility.java` ->
  `testTrinoWritingDataWithObjectStorageLocationProvider`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/iceberg/TestIcebergSparkCompatibility.java` ->
  `TestIcebergSparkCompatibility.testTrinoWritingDataWithObjectStorageLocationProvider`
- Mapping type: `direct`
- Environment parity: Current class requires `SparkIcebergEnvironment`. Routed by source review into `SuiteIceberg` run
    1.
- Tag parity: Current tags: `Iceberg`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`, `INSERT`. Legacy setup operations: `CREATE`, `INSERT`.
- Action parity: Current action verbs: `SELECT`. Legacy action verbs: `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `contains`, `containsOnly`, `isEqualTo`, `row`. Legacy
  assertion helpers: `assertThat`, `contains`, `containsOnly`, `row`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: Assertion helper names differ between legacy and current implementations.
  Current method uses parameter-injected environment helpers instead of Tempto query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`
- Reviewer note: Matched by current suite selection: `SuiteIceberg` run 1 Exact-name mapping with normalized body
  similarity `0.88`.
- Audit status: `verified`

##### `testSparkReadingTrinoObjectStorage`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/iceberg/TestIcebergSparkCompatibility.java` ->
  `testSparkReadingTrinoObjectStorage`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/iceberg/TestIcebergSparkCompatibility.java` ->
  `TestIcebergSparkCompatibility.testSparkReadingTrinoObjectStorage`
- Mapping type: `direct`
- Environment parity: Current class requires `SparkIcebergEnvironment`. Routed by source review into `SuiteIceberg` run
    1.
- Tag parity: Current tags: `Iceberg`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`, `INSERT`. Legacy setup operations: `CREATE`, `INSERT`.
- Action parity: Current action verbs: `SELECT`. Legacy action verbs: `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `contains`, `containsOnly`, `isEqualTo`, `row`. Legacy
  assertion helpers: `assertThat`, `contains`, `containsOnly`, `row`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: Assertion helper names differ between legacy and current implementations.
  Current method uses parameter-injected environment helpers instead of Tempto query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`
- Reviewer note: Matched by current suite selection: `SuiteIceberg` run 1 Exact-name mapping with normalized body
  similarity `0.81`.
- Audit status: `verified`

##### `testOptimizeOnV2IcebergTable`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/iceberg/TestIcebergSparkCompatibility.java` ->
  `testOptimizeOnV2IcebergTable`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/iceberg/TestIcebergSparkCompatibility.java` ->
  `TestIcebergSparkCompatibility.testOptimizeOnV2IcebergTable`
- Mapping type: `direct`
- Environment parity: Current class requires `SparkIcebergEnvironment`. Routed by source review into `SuiteIceberg` run
    1.
- Tag parity: Current tags: `Iceberg`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`, `INSERT`, `ALTER`. Legacy setup operations: `CREATE`, `INSERT`,
  `ALTER`.
- Action parity: Current action verbs: `SELECT`. Legacy action verbs: `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `containsOnly`, `row`. Legacy assertion helpers:
  `assertThat`, `containsOnly`, `row`.
- Cleanup parity: Current cleanup operations: none. No legacy cleanup method body was available.
- Any observed difference, however small: Current method uses parameter-injected environment helpers instead of Tempto
  query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`
- Reviewer note: Matched by current suite selection: `SuiteIceberg` run 1 Exact-name mapping with normalized body
  similarity `0.87`.
- Audit status: `verified`

##### `testPartialStats`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/iceberg/TestIcebergSparkCompatibility.java` ->
  `testPartialStats`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/iceberg/TestIcebergSparkCompatibility.java` ->
  `TestIcebergSparkCompatibility.testPartialStats`
- Mapping type: `direct`
- Environment parity: Current class requires `SparkIcebergEnvironment`. Routed by source review into `SuiteIceberg` run
    1.
- Tag parity: Current tags: `Iceberg`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`, `INSERT`, `ALTER`. Legacy setup operations: `CREATE`, `INSERT`,
  `ALTER`.
- Action parity: Current action verbs: `SHOW`. Legacy action verbs: `SHOW`.
- Assertion parity: Current assertion helpers: `assertThat`, `containsOnly`, `row`. Legacy assertion helpers:
  `assertThat`, `containsOnly`, `row`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: Current method uses parameter-injected environment helpers instead of Tempto
  query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`
- Reviewer note: Matched by current suite selection: `SuiteIceberg` run 1 Exact-name mapping with normalized body
  similarity `0.91`.
- Audit status: `verified`

##### `testStatsAfterAddingPartitionField`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/iceberg/TestIcebergSparkCompatibility.java` ->
  `testStatsAfterAddingPartitionField`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/iceberg/TestIcebergSparkCompatibility.java` ->
  `TestIcebergSparkCompatibility.testStatsAfterAddingPartitionField`
- Mapping type: `direct`
- Environment parity: Current class requires `SparkIcebergEnvironment`. Routed by source review into `SuiteIceberg` run
    1.
- Tag parity: Current tags: `Iceberg`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`, `INSERT`, `ALTER`. Legacy setup operations: `CREATE`, `INSERT`,
  `ALTER`.
- Action parity: Current action verbs: `SHOW`. Legacy action verbs: `SHOW`.
- Assertion parity: Current assertion helpers: `assertThat`, `containsOnly`, `row`. Legacy assertion helpers:
  `assertThat`, `containsOnly`, `row`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: Current method uses parameter-injected environment helpers instead of Tempto
  query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`
- Reviewer note: Matched by current suite selection: `SuiteIceberg` run 1 Exact-name mapping with normalized body
  similarity `0.80`.
- Audit status: `verified`

##### `testMissingMetrics`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/iceberg/TestIcebergSparkCompatibility.java` ->
  `testMissingMetrics`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/iceberg/TestIcebergSparkCompatibility.java` ->
  `TestIcebergSparkCompatibility.testMissingMetrics`
- Mapping type: `direct`
- Environment parity: Current class requires `SparkIcebergEnvironment`. Routed by source review into `SuiteIceberg` run
    1.
- Tag parity: Current tags: `Iceberg`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`, `INSERT`. Legacy setup operations: `CREATE`, `INSERT`.
- Action parity: Current action verbs: `SELECT`. Legacy action verbs: `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `containsOnly`, `row`. Legacy assertion helpers:
  `assertThat`, `containsOnly`, `row`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: Current method uses parameter-injected environment helpers instead of Tempto
  query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`
- Reviewer note: Matched by current suite selection: `SuiteIceberg` run 1 Exact-name mapping with normalized body
  similarity `0.90`.
- Audit status: `verified`

##### `testTrinoAnalyzeWithNonLowercaseColumnName`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/iceberg/TestIcebergSparkCompatibility.java` ->
  `testTrinoAnalyzeWithNonLowercaseColumnName`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/iceberg/TestIcebergSparkCompatibility.java` ->
  `TestIcebergSparkCompatibility.testTrinoAnalyzeWithNonLowercaseColumnName`
- Mapping type: `direct`
- Environment parity: Current class requires `SparkIcebergEnvironment`. Routed by source review into `SuiteIceberg` run
    1.
- Tag parity: Current tags: `Iceberg`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`, `INSERT`. Legacy setup operations: `CREATE`, `INSERT`.
- Action parity: Current action verbs: `ANALYZE`, `SELECT`. Legacy action verbs: `ANALYZE`, `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `containsOnly`, `row`. Legacy assertion helpers:
  `assertThat`, `containsOnly`, `row`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: Current method uses parameter-injected environment helpers instead of Tempto
  query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`
- Reviewer note: Matched by current suite selection: `SuiteIceberg` run 1 Exact-name mapping with normalized body
  similarity `0.87`.
- Audit status: `verified`

##### `testSparkReadsTrinoTableAfterCleaningUp`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/iceberg/TestIcebergSparkCompatibility.java` ->
  `testSparkReadsTrinoTableAfterCleaningUp`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/iceberg/TestIcebergSparkCompatibility.java` ->
  `TestIcebergSparkCompatibility.testSparkReadsTrinoTableAfterCleaningUp`
- Mapping type: `direct`
- Environment parity: Current class requires `SparkIcebergEnvironment`. Routed by source review into `SuiteIceberg` run
    1.
- Tag parity: Current tags: `Iceberg`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`, `INSERT`, `ALTER`. Legacy setup operations: `CREATE`, `INSERT`,
  `ALTER`.
- Action parity: Current action verbs: `SELECT`. Legacy action verbs: `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `containsOnly`, `row`. Legacy assertion helpers:
  `assertThat`, `containsOnly`, `row`.
- Cleanup parity: Current cleanup operations: `DROP`, `DELETE`. Legacy cleanup operations: `DROP`, `DELETE`.
- Any observed difference, however small: Normalized body similarity is low (`0.42`), so fidelity was judged from
  SQL/helper/assertion shape instead of raw text. Current method uses parameter-injected environment helpers instead of
  Tempto query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`
- Reviewer note: Matched by current suite selection: `SuiteIceberg` run 1 Exact-name mapping with normalized body
  similarity `0.42`.
- Audit status: `verified`

##### `testDeleteAfterPartitionEvolution`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/iceberg/TestIcebergSparkCompatibility.java` ->
  `testDeleteAfterPartitionEvolution`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/iceberg/TestIcebergSparkCompatibility.java` ->
  `TestIcebergSparkCompatibility.testDeleteAfterPartitionEvolution`
- Mapping type: `direct`
- Environment parity: Current class requires `SparkIcebergEnvironment`. Routed by source review into `SuiteIceberg` run
    1.
- Tag parity: Current tags: `Iceberg`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`, `INSERT`, `ALTER`. Legacy setup operations: `CREATE`, `INSERT`,
  `ALTER`.
- Action parity: Current action verbs: `SELECT`. Legacy action verbs: `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `containsOnly`, `row`. Legacy assertion helpers:
  `assertThat`, `containsOnly`, `row`.
- Cleanup parity: Current cleanup operations: `DROP`, `DELETE`. Legacy cleanup operations: `DROP`, `DELETE`.
- Any observed difference, however small: Current method uses parameter-injected environment helpers instead of Tempto
  query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`
- Reviewer note: Matched by current suite selection: `SuiteIceberg` run 1 Exact-name mapping with normalized body
  similarity `0.81`.
- Audit status: `verified`

##### `testTrinoAlterStructColumnType`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/iceberg/TestIcebergSparkCompatibility.java` ->
  `testTrinoAlterStructColumnType`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/iceberg/TestIcebergSparkCompatibility.java` ->
  `TestIcebergSparkCompatibility.testTrinoAlterStructColumnType`
- Mapping type: `direct`
- Environment parity: Current class requires `SparkIcebergEnvironment`. Routed by source review into `SuiteIceberg` run
    1.
- Tag parity: Current tags: `Iceberg`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`, `ALTER`. Legacy setup operations: `CREATE`, `ALTER`.
- Action parity: Current action verbs: `WITH`, `SELECT`. Legacy action verbs: `WITH`, `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `containsOnly`, `isEqualTo`, `row`. Legacy assertion
  helpers: `assertThat`, `containsOnly`, `isEqualTo`, `row`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: Current method uses parameter-injected environment helpers instead of Tempto
  query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`
- Reviewer note: Matched by current suite selection: `SuiteIceberg` run 1 Exact-name mapping with normalized body
  similarity `0.91`.
- Audit status: `verified`

##### `testTrinoSetColumnType`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/iceberg/TestIcebergSparkCompatibility.java` ->
  `testTrinoSetColumnType`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/iceberg/TestIcebergSparkCompatibility.java` ->
  `TestIcebergSparkCompatibility.testTrinoSetColumnType`
- Mapping type: `direct`
- Environment parity: Current class requires `SparkIcebergEnvironment`. Routed by source review into `SuiteIceberg` run
    1.
- Tag parity: Current tags: `Iceberg`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: none. No legacy setup method body was available.
- Action parity: Current action verbs: none. No legacy action method body was available.
- Assertion parity: Current assertion helpers: none. No legacy assertion method body was available.
- Cleanup parity: Current cleanup operations: none. No legacy cleanup method body was available.
- Any observed difference, however small: No method-specific difference identified beyond the documented framework
  baseline.
- Known intentional difference: None.
- Reviewer note: Matched by current suite selection: `SuiteIceberg` run 1 High normalized body similarity `0.93`.
- Audit status: `verified`

##### `testTrinoSetPartitionedColumnType`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/iceberg/TestIcebergSparkCompatibility.java` ->
  `testTrinoSetPartitionedColumnType`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/iceberg/TestIcebergSparkCompatibility.java` ->
  `TestIcebergSparkCompatibility.testTrinoSetPartitionedColumnType`
- Mapping type: `direct`
- Environment parity: Current class requires `SparkIcebergEnvironment`. Routed by source review into `SuiteIceberg` run
    1.
- Tag parity: Current tags: `Iceberg`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: none. No legacy setup method body was available.
- Action parity: Current action verbs: none. No legacy action method body was available.
- Assertion parity: Current assertion helpers: none. No legacy assertion method body was available.
- Cleanup parity: Current cleanup operations: none. No legacy cleanup method body was available.
- Any observed difference, however small: No method-specific difference identified beyond the documented framework
  baseline.
- Known intentional difference: None.
- Reviewer note: Matched by current suite selection: `SuiteIceberg` run 1 High normalized body similarity `0.93`.
- Audit status: `verified`

##### `testTrinoSetFieldType`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/iceberg/TestIcebergSparkCompatibility.java` ->
  `testTrinoSetFieldType`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/iceberg/TestIcebergSparkCompatibility.java` ->
  `TestIcebergSparkCompatibility.testTrinoSetFieldType`
- Mapping type: `direct`
- Environment parity: Current class requires `SparkIcebergEnvironment`. Routed by source review into `SuiteIceberg` run
    1.
- Tag parity: Current tags: `Iceberg`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`, `ALTER`. Legacy setup operations: `CREATE`, `ALTER`.
- Action parity: Current action verbs: `WITH`, `SELECT`. Legacy action verbs: `WITH`, `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `containsOnly`, `isEqualTo`, `row`. Legacy assertion
  helpers: `assertThat`, `containsOnly`, `isEqualTo`, `row`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: Current method uses parameter-injected environment helpers instead of Tempto
  query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`
- Reviewer note: Matched by current suite selection: `SuiteIceberg` run 1 Exact-name mapping with normalized body
  similarity `0.91`.
- Audit status: `verified`

##### `testSparkAlterColumnType`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/iceberg/TestIcebergSparkCompatibility.java` ->
  `testSparkAlterColumnType`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/iceberg/TestIcebergSparkCompatibility.java` ->
  `TestIcebergSparkCompatibility.testSparkAlterColumnType`
- Mapping type: `direct`
- Environment parity: Current class requires `SparkIcebergEnvironment`. Routed by source review into `SuiteIceberg` run
    1.
- Tag parity: Current tags: `Iceberg`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: none. No legacy setup method body was available.
- Action parity: Current action verbs: none. No legacy action method body was available.
- Assertion parity: Current assertion helpers: none. No legacy assertion method body was available.
- Cleanup parity: Current cleanup operations: none. No legacy cleanup method body was available.
- Any observed difference, however small: No method-specific difference identified beyond the documented framework
  baseline.
- Known intentional difference: None.
- Reviewer note: Matched by current suite selection: `SuiteIceberg` run 1 High normalized body similarity `0.93`.
- Audit status: `verified`

##### `testSparkAlterPartitionedColumnType`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/iceberg/TestIcebergSparkCompatibility.java` ->
  `testSparkAlterPartitionedColumnType`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/iceberg/TestIcebergSparkCompatibility.java` ->
  `TestIcebergSparkCompatibility.testSparkAlterPartitionedColumnType`
- Mapping type: `direct`
- Environment parity: Current class requires `SparkIcebergEnvironment`. Routed by source review into `SuiteIceberg` run
    1.
- Tag parity: Current tags: `Iceberg`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: none. No legacy setup method body was available.
- Action parity: Current action verbs: none. No legacy action method body was available.
- Assertion parity: Current assertion helpers: none. No legacy assertion method body was available.
- Cleanup parity: Current cleanup operations: none. No legacy cleanup method body was available.
- Any observed difference, however small: No method-specific difference identified beyond the documented framework
  baseline.
- Known intentional difference: None.
- Reviewer note: Matched by current suite selection: `SuiteIceberg` run 1 High normalized body similarity `0.93`.
- Audit status: `verified`

##### `testSparkAlterStructColumnType`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/iceberg/TestIcebergSparkCompatibility.java` ->
  `testSparkAlterStructColumnType`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/iceberg/TestIcebergSparkCompatibility.java` ->
  `TestIcebergSparkCompatibility.testSparkAlterStructColumnType`
- Mapping type: `direct`
- Environment parity: Current class requires `SparkIcebergEnvironment`. Routed by source review into `SuiteIceberg` run
    1.
- Tag parity: Current tags: `Iceberg`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`, `ALTER`. Legacy setup operations: `CREATE`, `ALTER`.
- Action parity: Current action verbs: `SELECT`. Legacy action verbs: `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `containsOnly`, `isEqualTo`, `row`. Legacy assertion
  helpers: `assertThat`, `containsOnly`, `isEqualTo`, `row`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: Current method uses parameter-injected environment helpers instead of Tempto
  query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`
- Reviewer note: Matched by current suite selection: `SuiteIceberg` run 1 Exact-name mapping with normalized body
  similarity `0.91`.
- Audit status: `verified`

##### `testTrinoReadingSparkCompressedData`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/iceberg/TestIcebergSparkCompatibility.java` ->
  `testSparkConfiguredCompressionCodecOnSparkAndTrino`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/iceberg/TestIcebergSparkCompatibility.java` ->
  `TestIcebergSparkCompatibility.testTrinoReadingSparkCompressedData`
- Mapping type: `renamed`
- Environment parity: Current class requires `SparkIcebergEnvironment`. Routed by source review into `SuiteIceberg` run
    1.
- Tag parity: Current tags: `Iceberg`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`, `INSERT`. Legacy setup operations: `CREATE`, `INSERT`.
- Action parity: Current action verbs: `SELECT`. Legacy action verbs: `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `assertThatThrownBy`, `containsOnly`, `row`. Legacy
  assertion helpers: `assertQueryFailure`, `assertThat`, `containsOnly`, `row`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: Current method name was normalized to describe the direction under test;
  compression-codec coverage remains the same.
- Known intentional difference: `HDP to Hive 3.1 migration`
- Reviewer note: Matched by current suite selection: `SuiteIceberg` run 1
- Audit status: `verified`

##### `testSparkReadingTrinoCompressedData`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/iceberg/TestIcebergSparkCompatibility.java` ->
  `testTrinoConfiguredCompressionCodecOnSparkAndTrino`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/iceberg/TestIcebergSparkCompatibility.java` ->
  `TestIcebergSparkCompatibility.testSparkReadingTrinoCompressedData`
- Mapping type: `renamed`
- Environment parity: Current class requires `SparkIcebergEnvironment`. Routed by source review into `SuiteIceberg` run
    1.
- Tag parity: Current tags: `Iceberg`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`. Legacy setup operations: `CREATE`, `INSERT`.
- Action parity: Current action verbs: `WITH`, `SELECT`. Legacy action verbs: `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `assertThatThrownBy`, `containsOnly`,
  `hasMessageContaining`, `row`. Legacy assertion helpers: `assertQueryFailure`, `assertThat`, `containsOnly`, `row`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: Current method name was normalized to describe the direction under test;
  compression-codec coverage remains the same.
- Known intentional difference: `HDP to Hive 3.1 migration`
- Reviewer note: Matched by current suite selection: `SuiteIceberg` run 1
- Audit status: `verified`

##### `testTrinoWritingDataWithWriterDataPathSet`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/iceberg/TestIcebergSparkCompatibility.java` ->
  `testTrinoWritingDataWithWriterDataPathSet`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/iceberg/TestIcebergSparkCompatibility.java` ->
  `TestIcebergSparkCompatibility.testTrinoWritingDataWithWriterDataPathSet`
- Mapping type: `direct`
- Environment parity: Current class requires `SparkIcebergEnvironment`. Routed by source review into `SuiteIceberg` run
    1.
- Tag parity: Current tags: `Iceberg`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`, `INSERT`. Legacy setup operations: `CREATE`, `INSERT`.
- Action parity: Current action verbs: `SELECT`. Legacy action verbs: `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `contains`, `containsOnly`, `isEqualTo`, `row`. Legacy
  assertion helpers: `assertThat`, `contains`, `containsOnly`, `row`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: Assertion helper names differ between legacy and current implementations.
  Current method uses parameter-injected environment helpers instead of Tempto query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`
- Reviewer note: Matched by current suite selection: `SuiteIceberg` run 1 Exact-name mapping with normalized body
  similarity `0.87`.
- Audit status: `verified`

##### `testTrinoIgnoresUnsupportedSparkSortOrder`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/iceberg/TestIcebergSparkCompatibility.java` ->
  `testTrinoIgnoresUnsupportedSparkSortOrder`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/iceberg/TestIcebergSparkCompatibility.java` ->
  `TestIcebergSparkCompatibility.testTrinoIgnoresUnsupportedSparkSortOrder`
- Mapping type: `direct`
- Environment parity: Current class requires `SparkIcebergEnvironment`. Routed by source review into `SuiteIceberg` run
    1.
- Tag parity: Current tags: `Iceberg`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`, `ALTER`, `INSERT`. Legacy setup operations: `CREATE`, `ALTER`,
  `INSERT`.
- Action parity: Current action verbs: `SHOW`, `SELECT`. Legacy action verbs: `SHOW`, `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `contains`, `row`. Legacy assertion helpers: `assertThat`,
  `contains`, `row`.
- Cleanup parity: Current cleanup operations: `DROP`. No legacy cleanup method body was available.
- Any observed difference, however small: SQL verb set differs: legacy ['CREATE', 'ALTER', 'SHOW', 'INSERT', 'SELECT']
  vs current ['CREATE', 'ALTER', 'SHOW', 'INSERT', 'SELECT', 'DROP']. Current method uses parameter-injected environment
  helpers instead of Tempto query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`
- Reviewer note: Matched by current suite selection: `SuiteIceberg` run 1 Exact-name mapping with normalized body
  similarity `0.88`.
- Audit status: `verified`

##### `testRenameNestedField`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/iceberg/TestIcebergSparkCompatibility.java` ->
  `testRenameNestedField`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/iceberg/TestIcebergSparkCompatibility.java` ->
  `TestIcebergSparkCompatibility.testRenameNestedField`
- Mapping type: `direct`
- Environment parity: Current class requires `SparkIcebergEnvironment`. Routed by source review into `SuiteIceberg` run
    1.
- Tag parity: Current tags: `Iceberg`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`, `ALTER`. Legacy setup operations: `CREATE`, `ALTER`.
- Action parity: Current action verbs: `SELECT`. Legacy action verbs: `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `containsOnly`, `row`. Legacy assertion helpers:
  `assertThat`, `containsOnly`, `row`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: Current method uses parameter-injected environment helpers instead of Tempto
  query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`
- Reviewer note: Matched by current suite selection: `SuiteIceberg` run 1 Exact-name mapping with normalized body
  similarity `0.85`.
- Audit status: `verified`

##### `testDropPastPartitionedField`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/iceberg/TestIcebergSparkCompatibility.java` ->
  `testDropPastPartitionedField`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/iceberg/TestIcebergSparkCompatibility.java` ->
  `TestIcebergSparkCompatibility.testDropPastPartitionedField`
- Mapping type: `direct`
- Environment parity: Current class requires `SparkIcebergEnvironment`. Routed by source review into `SuiteIceberg` run
    1.
- Tag parity: Current tags: `Iceberg`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`, `ALTER`. Legacy setup operations: `CREATE`, `ALTER`.
- Action parity: Current action verbs: none. Legacy action verbs: none.
- Assertion parity: Current assertion helpers: `assertThatThrownBy`, `hasMessageContaining`. Legacy assertion helpers:
  `assertQueryFailure`, `hasMessageContaining`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: Assertion helper names differ between legacy and current implementations.
  Current method uses parameter-injected environment helpers instead of Tempto query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`
- Reviewer note: Matched by current suite selection: `SuiteIceberg` run 1 Exact-name mapping with normalized body
  similarity `0.84`.
- Audit status: `verified`

##### `testTrinoReadsSparkRowLevelDeletesWithRowTypes`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/iceberg/TestIcebergSparkCompatibility.java` ->
  `testTrinoReadsSparkRowLevelDeletesWithRowTypes`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/iceberg/TestIcebergSparkCompatibility.java` ->
  `TestIcebergSparkCompatibility.testTrinoReadsSparkRowLevelDeletesWithRowTypes`
- Mapping type: `direct`
- Environment parity: Current class requires `SparkIcebergEnvironment`. Routed by source review into `SuiteIceberg` run
    1.
- Tag parity: Current tags: `Iceberg`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`, `INSERT`. Legacy setup operations: `CREATE`, `INSERT`.
- Action parity: Current action verbs: `CALL`, `SELECT`. Legacy action verbs: `CALL`, `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `containsOnly`, `row`. Legacy assertion helpers:
  `assertThat`, `containsOnly`, `row`.
- Cleanup parity: Current cleanup operations: `DELETE`, `DROP`. Legacy cleanup operations: `DELETE`, `DROP`.
- Any observed difference, however small: Current method uses parameter-injected environment helpers instead of Tempto
  query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`
- Reviewer note: Matched by current suite selection: `SuiteIceberg` run 1 Exact-name mapping with normalized body
  similarity `0.92`.
- Audit status: `verified`

##### `testSparkReadsTrinoRowLevelDeletesWithRowTypes`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/iceberg/TestIcebergSparkCompatibility.java` ->
  `testSparkReadsTrinoRowLevelDeletesWithRowTypes`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/iceberg/TestIcebergSparkCompatibility.java` ->
  `TestIcebergSparkCompatibility.testSparkReadsTrinoRowLevelDeletesWithRowTypes`
- Mapping type: `direct`
- Environment parity: Current class requires `SparkIcebergEnvironment`. Routed by source review into `SuiteIceberg` run
    1.
- Tag parity: Current tags: `Iceberg`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`, `INSERT`. Legacy setup operations: `CREATE`, `INSERT`.
- Action parity: Current action verbs: `WITH`, `SELECT`. Legacy action verbs: `WITH`, `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `containsOnly`, `row`. Legacy assertion helpers:
  `assertThat`, `containsOnly`, `row`.
- Cleanup parity: Current cleanup operations: `DELETE`, `DROP`. Legacy cleanup operations: `DELETE`, `DROP`.
- Any observed difference, however small: Current method uses parameter-injected environment helpers instead of Tempto
  query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`
- Reviewer note: Matched by current suite selection: `SuiteIceberg` run 1 Exact-name mapping with normalized body
  similarity `0.90`.
- Audit status: `verified`

##### `testSparkReadsTrinoTableAfterOptimizeAndCleaningUp`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/iceberg/TestIcebergSparkCompatibility.java` ->
  `testSparkReadsTrinoTableAfterOptimizeAndCleaningUp`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/iceberg/TestIcebergSparkCompatibility.java` ->
  `TestIcebergSparkCompatibility.testSparkReadsTrinoTableAfterOptimizeAndCleaningUp`
- Mapping type: `direct`
- Environment parity: Current class requires `SparkIcebergEnvironment`. Routed by source review into `SuiteIceberg` run
    1.
- Tag parity: Current tags: `Iceberg`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`, `INSERT`, `ALTER`. Legacy setup operations: `CREATE`, `INSERT`,
  `ALTER`.
- Action parity: Current action verbs: `SELECT`. Legacy action verbs: `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `containsOnly`, `row`. Legacy assertion helpers:
  `assertThat`, `containsOnly`, `row`.
- Cleanup parity: Current cleanup operations: `DROP`, `DELETE`. Legacy cleanup operations: `DROP`, `DELETE`.
- Any observed difference, however small: SQL verb set differs:
  legacy ['DROP', 'CREATE', 'INSERT', 'DELETE', 'SELECT', 'ALTER'] vs
  current ['DROP', 'CREATE', 'INSERT', 'DELETE', 'ALTER', 'SELECT']. Current method uses parameter-injected environment
  helpers instead of Tempto query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`
- Reviewer note: Matched by current suite selection: `SuiteIceberg` run 1 Exact-name mapping with normalized body
  similarity `0.60`.
- Audit status: `verified`

##### `testTrinoReadsTrinoTableWithSparkDeletesAfterOptimizeAndCleanUp`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/iceberg/TestIcebergSparkCompatibility.java` ->
  `testTrinoReadsTrinoTableWithSparkDeletesAfterOptimizeAndCleanUp`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/iceberg/TestIcebergSparkCompatibility.java` ->
  `TestIcebergSparkCompatibility.testTrinoReadsTrinoTableWithSparkDeletesAfterOptimizeAndCleanUp`
- Mapping type: `direct`
- Environment parity: Current class requires `SparkIcebergEnvironment`. Routed by source review into `SuiteIceberg` run
    1.
- Tag parity: Current tags: `Iceberg`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`, `INSERT`, `ALTER`. Legacy setup operations: `CREATE`, `INSERT`,
  `ALTER`.
- Action parity: Current action verbs: `SELECT`. Legacy action verbs: `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `containsOnly`, `row`. Legacy assertion helpers:
  `assertThat`, `containsOnly`, `row`.
- Cleanup parity: Current cleanup operations: `DROP`, `DELETE`. Legacy cleanup operations: `DROP`, `DELETE`.
- Any observed difference, however small: Current method uses parameter-injected environment helpers instead of Tempto
  query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`
- Reviewer note: Matched by current suite selection: `SuiteIceberg` run 1 Exact-name mapping with normalized body
  similarity `0.86`.
- Audit status: `verified`

##### `testCleaningUpIcebergTableWithRowLevelDeletes`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/iceberg/TestIcebergSparkCompatibility.java` ->
  `testCleaningUpIcebergTableWithRowLevelDeletes`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/iceberg/TestIcebergSparkCompatibility.java` ->
  `TestIcebergSparkCompatibility.testCleaningUpIcebergTableWithRowLevelDeletes`
- Mapping type: `direct`
- Environment parity: Current class requires `SparkIcebergEnvironment`. Routed by source review into `SuiteIceberg` run
    1.
- Tag parity: Current tags: `Iceberg`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`, `INSERT`, `ALTER`. Legacy setup operations: `CREATE`, `INSERT`,
  `ALTER`.
- Action parity: Current action verbs: `CALL`, `SELECT`. Legacy action verbs: `CALL`, `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `containsOnly`, `row`. Legacy assertion helpers:
  `assertThat`, `containsOnly`, `row`.
- Cleanup parity: Current cleanup operations: `DROP`, `DELETE`. Legacy cleanup operations: `DROP`, `DELETE`.
- Any observed difference, however small: Current method uses parameter-injected environment helpers instead of Tempto
  query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`
- Reviewer note: Matched by current suite selection: `SuiteIceberg` run 1 Exact-name mapping with normalized body
  similarity `0.88`.
- Audit status: `verified`

##### `testRegisterTableWithTableLocation`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/iceberg/TestIcebergSparkCompatibility.java` ->
  `testRegisterTableWithTableLocation`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/iceberg/TestIcebergSparkCompatibility.java` ->
  `TestIcebergSparkCompatibility.testRegisterTableWithTableLocation`
- Mapping type: `direct`
- Environment parity: Current class requires `SparkIcebergEnvironment`. Routed by source review into `SuiteIceberg` run
    1.
- Tag parity: Current tags: `Iceberg`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`, `INSERT`. Legacy setup operations: `CREATE`, `INSERT`.
- Action parity: Current action verbs: `CALL`, `SELECT`. Legacy action verbs: `CALL`, `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `containsOnly`, `row`. Legacy assertion helpers:
  `assertThat`, `containsOnly`, `row`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: Current method uses parameter-injected environment helpers instead of Tempto
  query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`
- Reviewer note: Matched by current suite selection: `SuiteIceberg` run 1 Exact-name mapping with normalized body
  similarity `0.80`.
- Audit status: `verified`

##### `testRegisterTableWithComments`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/iceberg/TestIcebergSparkCompatibility.java` ->
  `testRegisterTableWithComments`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/iceberg/TestIcebergSparkCompatibility.java` ->
  `TestIcebergSparkCompatibility.testRegisterTableWithComments`
- Mapping type: `direct`
- Environment parity: Current class requires `SparkIcebergEnvironment`. Routed by source review into `SuiteIceberg` run
    1.
- Tag parity: Current tags: `Iceberg`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`, `INSERT`. Legacy setup operations: `CREATE`, `INSERT`.
- Action parity: Current action verbs: `CALL`. Legacy action verbs: `CALL`.
- Assertion parity: Current assertion helpers: `assertThat`, `isEqualTo`. Legacy assertion helpers: `assertThat`,
  `isEqualTo`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: Current method uses parameter-injected environment helpers instead of Tempto
  query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`
- Reviewer note: Matched by current suite selection: `SuiteIceberg` run 1 Exact-name mapping with normalized body
  similarity `0.86`.
- Audit status: `verified`

##### `testRegisterTableWithShowCreateTable`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/iceberg/TestIcebergSparkCompatibility.java` ->
  `testRegisterTableWithShowCreateTable`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/iceberg/TestIcebergSparkCompatibility.java` ->
  `TestIcebergSparkCompatibility.testRegisterTableWithShowCreateTable`
- Mapping type: `direct`
- Environment parity: Current class requires `SparkIcebergEnvironment`. Routed by source review into `SuiteIceberg` run
    1.
- Tag parity: Current tags: `Iceberg`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`, `INSERT`. Legacy setup operations: `CREATE`, `INSERT`.
- Action parity: Current action verbs: `DESCRIBE`, `SHOW`, `CALL`. Legacy action verbs: `DESCRIBE`, `SHOW`, `CALL`.
- Assertion parity: Current assertion helpers: `assertThat`, `row`. Legacy assertion helpers: `assertThat`, `row`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: Current method uses parameter-injected environment helpers instead of Tempto
  query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`
- Reviewer note: Matched by current suite selection: `SuiteIceberg` run 1 Exact-name mapping with normalized body
  similarity `0.91`.
- Audit status: `verified`

##### `testRegisterTableWithReInsert`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/iceberg/TestIcebergSparkCompatibility.java` ->
  `testRegisterTableWithReInsert`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/iceberg/TestIcebergSparkCompatibility.java` ->
  `TestIcebergSparkCompatibility.testRegisterTableWithReInsert`
- Mapping type: `direct`
- Environment parity: Current class requires `SparkIcebergEnvironment`. Routed by source review into `SuiteIceberg` run
    1.
- Tag parity: Current tags: `Iceberg`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`, `INSERT`. Legacy setup operations: `CREATE`, `INSERT`.
- Action parity: Current action verbs: `CALL`, `SELECT`. Legacy action verbs: `CALL`, `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `containsOnly`, `row`. Legacy assertion helpers:
  `assertThat`, `containsOnly`, `row`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: Current method uses parameter-injected environment helpers instead of Tempto
  query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`
- Reviewer note: Matched by current suite selection: `SuiteIceberg` run 1 Exact-name mapping with normalized body
  similarity `0.89`.
- Audit status: `verified`

##### `testRegisterTableWithDroppedTable`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/iceberg/TestIcebergSparkCompatibility.java` ->
  `testRegisterTableWithDroppedTable`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/iceberg/TestIcebergSparkCompatibility.java` ->
  `TestIcebergSparkCompatibility.testRegisterTableWithDroppedTable`
- Mapping type: `direct`
- Environment parity: Current class requires `SparkIcebergEnvironment`. Routed by source review into `SuiteIceberg` run
    1.
- Tag parity: Current tags: `Iceberg`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`, `INSERT`. Legacy setup operations: `CREATE`, `INSERT`.
- Action parity: Current action verbs: `CALL`. Legacy action verbs: `CALL`.
- Assertion parity: Current assertion helpers: `assertThatThrownBy`. Legacy assertion helpers: `assertQueryFailure`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: Assertion helper names differ between legacy and current implementations.
  Current method uses parameter-injected environment helpers instead of Tempto query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`
- Reviewer note: Matched by current suite selection: `SuiteIceberg` run 1 Exact-name mapping with normalized body
  similarity `0.66`.
- Audit status: `verified`

##### `testRegisterTableWithDifferentTableName`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/iceberg/TestIcebergSparkCompatibility.java` ->
  `testRegisterTableWithDifferentTableName`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/iceberg/TestIcebergSparkCompatibility.java` ->
  `TestIcebergSparkCompatibility.testRegisterTableWithDifferentTableName`
- Mapping type: `direct`
- Environment parity: Current class requires `SparkIcebergEnvironment`. Routed by source review into `SuiteIceberg` run
    1.
- Tag parity: Current tags: `Iceberg`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`, `INSERT`. Legacy setup operations: `CREATE`, `INSERT`.
- Action parity: Current action verbs: `CALL`, `SELECT`. Legacy action verbs: `CALL`, `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `containsOnly`, `row`. Legacy assertion helpers:
  `assertThat`, `containsOnly`, `row`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: Current method uses parameter-injected environment helpers instead of Tempto
  query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`
- Reviewer note: Matched by current suite selection: `SuiteIceberg` run 1 Exact-name mapping with normalized body
  similarity `0.90`.
- Audit status: `verified`

##### `testRegisterTableWithMetadataFile`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/iceberg/TestIcebergSparkCompatibility.java` ->
  `testRegisterTableWithMetadataFile`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/iceberg/TestIcebergSparkCompatibility.java` ->
  `TestIcebergSparkCompatibility.testRegisterTableWithMetadataFile`
- Mapping type: `direct`
- Environment parity: Current class requires `SparkIcebergEnvironment`. Routed by source review into `SuiteIceberg` run
    1.
- Tag parity: Current tags: `Iceberg`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`, `INSERT`. Legacy setup operations: `CREATE`, `INSERT`.
- Action parity: Current action verbs: `CALL`, `SELECT`. Legacy action verbs: `CALL`, `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `containsOnly`, `row`. Legacy assertion helpers:
  `assertThat`, `containsOnly`, `row`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: Current method uses parameter-injected environment helpers instead of Tempto
  query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`
- Reviewer note: Matched by current suite selection: `SuiteIceberg` run 1 Exact-name mapping with normalized body
  similarity `0.66`.
- Audit status: `verified`

##### `testUnregisterNotIcebergTable`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/iceberg/TestIcebergSparkCompatibility.java` ->
  `testUnregisterNotIcebergTable`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/iceberg/TestIcebergSparkCompatibility.java` ->
  `TestIcebergSparkCompatibility.testUnregisterNotIcebergTable`
- Mapping type: `direct`
- Environment parity: Current class requires `SparkIcebergEnvironment`. Routed by source review into `SuiteIceberg` run
    1.
- Tag parity: Current tags: `Iceberg`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`. Legacy setup operations: `CREATE`.
- Action parity: Current action verbs: `CALL`, `SELECT`. Legacy action verbs: `CALL`, `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `assertThatThrownBy`, `containsOnly`, `row`. Legacy
  assertion helpers: `assertThat`, `assertThatThrownBy`, `containsOnly`, `hasMessageContaining`, `row`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: Assertion helper names differ between legacy and current implementations.
  Current method uses parameter-injected environment helpers instead of Tempto query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`
- Reviewer note: Matched by current suite selection: `SuiteIceberg` run 1 Exact-name mapping with normalized body
  similarity `0.84`.
- Audit status: `verified`

##### `testPartitionedByNonLowercaseColumn`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/iceberg/TestIcebergSparkCompatibility.java` ->
  `testPartitionedByNonLowercaseColumn`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/iceberg/TestIcebergSparkCompatibility.java` ->
  `TestIcebergSparkCompatibility.testPartitionedByNonLowercaseColumn`
- Mapping type: `direct`
- Environment parity: Current class requires `SparkIcebergEnvironment`. Routed by source review into `SuiteIceberg` run
    1.
- Tag parity: Current tags: `Iceberg`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`, `INSERT`, `UPDATE`. Legacy setup operations: `CREATE`, `INSERT`,
  `UPDATE`.
- Action parity: Current action verbs: `SELECT`, `MERGE`. Legacy action verbs: `SELECT`, `MERGE`.
- Assertion parity: Current assertion helpers: `assertThat`, `contains`, `row`. Legacy assertion helpers: `assertThat`,
  `contains`, `row`.
- Cleanup parity: Current cleanup operations: `DELETE`, `DROP`. Legacy cleanup operations: `DELETE`, `DROP`.
- Any observed difference, however small: Current method uses parameter-injected environment helpers instead of Tempto
  query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`
- Reviewer note: Matched by current suite selection: `SuiteIceberg` run 1 Exact-name mapping with normalized body
  similarity `0.87`.
- Audit status: `verified`

##### `testPartitioningWithMixedCaseColumnInTrino`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/iceberg/TestIcebergSparkCompatibility.java` ->
  `testPartitioningWithMixedCaseColumnInTrino`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/iceberg/TestIcebergSparkCompatibility.java` ->
  `TestIcebergSparkCompatibility.testPartitioningWithMixedCaseColumnInTrino`
- Mapping type: `direct`
- Environment parity: Current class requires `SparkIcebergEnvironment`. Routed by source review into `SuiteIceberg` run
    1.
- Tag parity: Current tags: `Iceberg`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`, `ALTER`, `INSERT`. Legacy setup operations: `CREATE`, `ALTER`,
  `INSERT`.
- Action parity: Current action verbs: `SELECT`, `SHOW`. Legacy action verbs: `SELECT`, `SHOW`.
- Assertion parity: Current assertion helpers: `assertThat`, `assertThatThrownBy`, `contains`, `row`. Legacy assertion
  helpers: `assertQueryFailure`, `assertThat`, `contains`, `hasMessageContaining`, `row`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: Assertion helper names differ between legacy and current implementations.
  Current method uses parameter-injected environment helpers instead of Tempto query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`
- Reviewer note: Matched by current suite selection: `SuiteIceberg` run 1 Exact-name mapping with normalized body
  similarity `0.78`.
- Audit status: `verified`

##### `testStringPartitioningWithSpecialCharactersCtasInTrino`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/iceberg/TestIcebergSparkCompatibility.java` ->
  `testStringPartitioningWithSpecialCharactersCtasInTrino`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/iceberg/TestIcebergSparkCompatibility.java` ->
  `TestIcebergSparkCompatibility.testStringPartitioningWithSpecialCharactersCtasInTrino`
- Mapping type: `direct`
- Environment parity: Current class requires `SparkIcebergEnvironment`. Routed by source review into `SuiteIceberg` run
    1.
- Tag parity: Current tags: `Iceberg`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`. Legacy setup operations: `CREATE`.
- Action parity: Current action verbs: `WITH`. Legacy action verbs: `WITH`.
- Assertion parity: Current assertion helpers: `assertSelectsOnSpecialCharacters`. Legacy assertion helpers:
  `assertSelectsOnSpecialCharacters`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: Current method uses parameter-injected environment helpers instead of Tempto
  query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`
- Reviewer note: Matched by current suite selection: `SuiteIceberg` run 1 Exact-name mapping with normalized body
  similarity `0.90`.
- Audit status: `verified`

##### `testStringPartitioningWithSpecialCharactersInsertInTrino`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/iceberg/TestIcebergSparkCompatibility.java` ->
  `testStringPartitioningWithSpecialCharactersInsertInTrino`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/iceberg/TestIcebergSparkCompatibility.java` ->
  `TestIcebergSparkCompatibility.testStringPartitioningWithSpecialCharactersInsertInTrino`
- Mapping type: `direct`
- Environment parity: Current class requires `SparkIcebergEnvironment`. Routed by source review into `SuiteIceberg` run
    1.
- Tag parity: Current tags: `Iceberg`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`, `INSERT`. Legacy setup operations: `CREATE`, `INSERT`.
- Action parity: Current action verbs: none. Legacy action verbs: none.
- Assertion parity: Current assertion helpers: `assertSelectsOnSpecialCharacters`. Legacy assertion helpers:
  `assertSelectsOnSpecialCharacters`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: Current method uses parameter-injected environment helpers instead of Tempto
  query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`
- Reviewer note: Matched by current suite selection: `SuiteIceberg` run 1 Exact-name mapping with normalized body
  similarity `0.89`.
- Audit status: `verified`

##### `testStringPartitioningWithSpecialCharactersInsertInSpark`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/iceberg/TestIcebergSparkCompatibility.java` ->
  `testStringPartitioningWithSpecialCharactersInsertInSpark`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/iceberg/TestIcebergSparkCompatibility.java` ->
  `TestIcebergSparkCompatibility.testStringPartitioningWithSpecialCharactersInsertInSpark`
- Mapping type: `direct`
- Environment parity: Current class requires `SparkIcebergEnvironment`. Routed by source review into `SuiteIceberg` run
    1.
- Tag parity: Current tags: `Iceberg`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`, `INSERT`. Legacy setup operations: `CREATE`, `INSERT`.
- Action parity: Current action verbs: none. Legacy action verbs: none.
- Assertion parity: Current assertion helpers: `assertSelectsOnSpecialCharacters`. Legacy assertion helpers:
  `assertSelectsOnSpecialCharacters`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: Current method uses parameter-injected environment helpers instead of Tempto
  query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`
- Reviewer note: Matched by current suite selection: `SuiteIceberg` run 1 Exact-name mapping with normalized body
  similarity `0.89`.
- Audit status: `verified`

##### `testTrinoReadingMigratedNestedData`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/iceberg/TestIcebergSparkCompatibility.java` ->
  `testTrinoReadingMigratedNestedData`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/iceberg/TestIcebergSparkCompatibility.java` ->
  `TestIcebergSparkCompatibility.testTrinoReadingMigratedNestedData`
- Mapping type: `direct`
- Environment parity: Current class requires `SparkIcebergEnvironment`. Routed by source review into `SuiteIceberg` run
    1.
- Tag parity: Current tags: `Iceberg`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`, `INSERT`, `ALTER`. Legacy setup operations: `CREATE`, `INSERT`,
  `ALTER`.
- Action parity: Current action verbs: `CALL`, `SELECT`. Legacy action verbs: `CALL`, `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `contains`, `containsOnly`, `row`. Legacy assertion
  helpers: `assertThat`, `contains`, `containsOnly`, `row`.
- Cleanup parity: Current cleanup operations: none. No legacy cleanup method body was available.
- Any observed difference, however small: Current method uses parameter-injected environment helpers instead of Tempto
  query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`
- Reviewer note: Matched by current suite selection: `SuiteIceberg` run 1 Exact-name mapping with normalized body
  similarity `0.85`.
- Audit status: `verified`

##### `testMigratedDataWithAlteredSchema`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/iceberg/TestIcebergSparkCompatibility.java` ->
  `testMigratedDataWithAlteredSchema`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/iceberg/TestIcebergSparkCompatibility.java` ->
  `TestIcebergSparkCompatibility.testMigratedDataWithAlteredSchema`
- Mapping type: `direct`
- Environment parity: Current class requires `SparkIcebergEnvironment`. Routed by source review into `SuiteIceberg` run
    1.
- Tag parity: Current tags: `Iceberg`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`, `INSERT`, `ALTER`. Legacy setup operations: `CREATE`, `INSERT`,
  `ALTER`.
- Action parity: Current action verbs: `CALL`, `SELECT`. Legacy action verbs: `CALL`, `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `contains`, `containsOnly`, `row`. Legacy assertion
  helpers: `assertThat`, `contains`, `containsOnly`, `row`.
- Cleanup parity: Current cleanup operations: none. No legacy cleanup method body was available.
- Any observed difference, however small: Current method uses parameter-injected environment helpers instead of Tempto
  query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`
- Reviewer note: Matched by current suite selection: `SuiteIceberg` run 1 Exact-name mapping with normalized body
  similarity `0.77`.
- Audit status: `verified`

##### `testMigratedDataWithPartialNameMapping`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/iceberg/TestIcebergSparkCompatibility.java` ->
  `testMigratedDataWithPartialNameMapping`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/iceberg/TestIcebergSparkCompatibility.java` ->
  `TestIcebergSparkCompatibility.testMigratedDataWithPartialNameMapping`
- Mapping type: `direct`
- Environment parity: Current class requires `SparkIcebergEnvironment`. Routed by source review into `SuiteIceberg` run
    1.
- Tag parity: Current tags: `Iceberg`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`, `INSERT`, `ALTER`. Legacy setup operations: `CREATE`, `INSERT`,
  `ALTER`.
- Action parity: Current action verbs: `CALL`, `SELECT`. Legacy action verbs: `CALL`, `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `contains`, `containsOnly`, `row`. Legacy assertion
  helpers: `assertThat`, `contains`, `containsOnly`, `row`.
- Cleanup parity: Current cleanup operations: none. No legacy cleanup method body was available.
- Any observed difference, however small: Current method uses parameter-injected environment helpers instead of Tempto
  query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`
- Reviewer note: Matched by current suite selection: `SuiteIceberg` run 1 Exact-name mapping with normalized body
  similarity `0.72`.
- Audit status: `verified`

##### `testHandlingPartitionSchemaEvolutionInPartitionMetadata`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/iceberg/TestIcebergSparkCompatibility.java` ->
  `testHandlingPartitionSchemaEvolutionInPartitionMetadata`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/iceberg/TestIcebergSparkCompatibility.java` ->
  `TestIcebergSparkCompatibility.testHandlingPartitionSchemaEvolutionInPartitionMetadata`
- Mapping type: `direct`
- Environment parity: Current class requires `SparkIcebergEnvironment`. Routed by source review into `SuiteIceberg` run
    1.
- Tag parity: Current tags: `Iceberg`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`, `INSERT`, `ALTER`. Legacy setup operations: `CREATE`, `INSERT`,
  `ALTER`.
- Action parity: Current action verbs: none. Legacy action verbs: none.
- Assertion parity: Current assertion helpers: none. No legacy assertion method body was available.
- Cleanup parity: Current cleanup operations: none. No legacy cleanup method body was available.
- Any observed difference, however small: Current method uses parameter-injected environment helpers instead of Tempto
  query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`
- Reviewer note: Matched by current suite selection: `SuiteIceberg` run 1 Exact-name mapping with normalized body
  similarity `0.96`.
- Audit status: `verified`

##### `testInsertReadingFromParquetTableWithNestedRowFieldNotPresentInDataFile`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/iceberg/TestIcebergSparkCompatibility.java` ->
  `testInsertReadingFromParquetTableWithNestedRowFieldNotPresentInDataFile`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/iceberg/TestIcebergSparkCompatibility.java` ->
  `TestIcebergSparkCompatibility.testInsertReadingFromParquetTableWithNestedRowFieldNotPresentInDataFile`
- Mapping type: `direct`
- Environment parity: Current class requires `SparkIcebergEnvironment`. Routed by source review into `SuiteIceberg` run
    1.
- Tag parity: Current tags: `Iceberg`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`, `ALTER`, `INSERT`. Legacy setup operations: `CREATE`, `ALTER`,
  `INSERT`.
- Action parity: Current action verbs: `WITH`, `SELECT`. Legacy action verbs: `WITH`, `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `containsOnly`, `row`. Legacy assertion helpers:
  `assertThat`, `containsOnly`, `row`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: Current method uses parameter-injected environment helpers instead of Tempto
  query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`
- Reviewer note: Matched by current suite selection: `SuiteIceberg` run 1 Exact-name mapping with normalized body
  similarity `0.93`.
- Audit status: `verified`

### `TestIcebergSparkDropTableCompatibility`

- Owning migration commit: `Migrate TestIcebergSparkDropTableCompatibility to JUnit`
- Current class added in same migration commit:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/iceberg/TestIcebergSparkDropTableCompatibility.java`
- Legacy class removed in same migration commit:
  -
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/iceberg/TestIcebergSparkDropTableCompatibility.java`
- Class-level environment requirement: `SparkIcebergEnvironment`.
- Class-level tags: `Iceberg`.
- Method inventory complete: Yes. Legacy methods: `1`. Current methods: `1`.
- Legacy helper/resource dependencies accounted for: Legacy class source reviewed directly.
- Intentional differences summary: `HDP to Hive 3.1 migration`
- Method statuses present: `verified`.

#### Methods

##### `testCleanupOnDropTable`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/iceberg/TestIcebergSparkDropTableCompatibility.java` ->
  `testCleanupOnDropTable`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/iceberg/TestIcebergSparkDropTableCompatibility.java` ->
  `TestIcebergSparkDropTableCompatibility.testCleanupOnDropTable`
- Mapping type: `direct`
- Environment parity: Current class requires `SparkIcebergEnvironment`. Routed by source review into `SuiteIceberg` run
    1.
- Tag parity: Current tags: `Iceberg`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`, `INSERT`. Legacy setup operations: `CREATE`, `INSERT`.
- Action parity: Current action verbs: none. Legacy action verbs: none.
- Assertion parity: Current assertion helpers: `assertFileExistence`. Legacy assertion helpers: `assertFileExistence`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: Current method uses parameter-injected environment helpers instead of Tempto
  query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`
- Reviewer note: Matched by current suite selection: `SuiteIceberg` run 1 Exact-name mapping with normalized body
  similarity `0.60`.
- Audit status: `verified`
