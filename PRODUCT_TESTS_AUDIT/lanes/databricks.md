# Lane Audit: Databricks

## Lane Summary

- Audit status: `completed`
- Section start commit: `Add Databricks environment`
- Section end commit: `Remove legacy Databricks launcher suites`
- Introduced JUnit suites: `SuiteDeltaLakeDatabricks133`, `SuiteDeltaLakeDatabricks143`, `SuiteDeltaLakeDatabricks154`,
  `SuiteDeltaLakeDatabricks164`, `SuiteDeltaLakeDatabricks173`.
- Extended existing suites: none.
- Retired legacy suites: `Databricks launcher suites`.
- Environment classes introduced: `DeltaLakeDatabricksEnvironment`.
- Method status counts: verified `18`, intentional difference `0`, needs follow-up `0`.

## Lane-Level Open Questions / Intentional Differences

- Lane-wide approved difference set: `HDP to Hive 3.1 migration`.
- Needs-follow-up methods: none currently identified in this source/history pass.

## Ported Test Classes

### `TestDatabricksWithGlueMetastoreCleanUp`

- Owning migration commit: `Migrate TestDatabricksWithGlueMetastoreCleanUp to JUnit`
- Current class added in same migration commit:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/deltalake/TestDatabricksWithGlueMetastoreCleanUp.java`
- Legacy class removed in same migration commit:
  -
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/deltalake/TestDatabricksWithGlueMetastoreCleanUp.java`
- Class-level environment requirement: `DeltaLakeDatabricksEnvironment`.
- Class-level tags: `ConfiguredFeatures`, `DeltaLakeDatabricks`, `ProfileSpecificTests`.
- Method inventory complete: Yes. Legacy methods: `1`. Current methods: `1`.
- Legacy helper/resource dependencies accounted for: Legacy class source reviewed directly.
- Intentional differences summary: `HDP to Hive 3.1 migration`
- Method statuses present: `verified`.

#### Methods

##### `testCleanUpOldTablesUsingDelta`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/deltalake/TestDatabricksWithGlueMetastoreCleanUp.java` ->
  `testCleanUpOldTablesUsingDelta`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/deltalake/TestDatabricksWithGlueMetastoreCleanUp.java` ->
  `TestDatabricksWithGlueMetastoreCleanUp.testCleanUpOldTablesUsingDelta`
- Mapping type: `direct`
- Environment parity: Current class requires `DeltaLakeDatabricksEnvironment`. No suite run selects this method from the
  current suite definitions.
- Tag parity: Current tags: `ConfiguredFeatures`, `DeltaLakeDatabricks`, `ProfileSpecificTests`. Tag routing needs no
  suite-level product-test claim.
- Setup parity: Current setup operations: none. Legacy setup operations: none.
- Action parity: Current action verbs: `SELECT`. Legacy action verbs: `SELECT`.
- Assertion parity: Current assertion helpers: none. No legacy assertion method body was available.
- Cleanup parity: Current cleanup operations: none. No legacy cleanup method body was available.
- Any observed difference, however small: Current method uses parameter-injected environment helpers instead of Tempto
  query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`
- Reviewer note: Exact-name mapping with normalized body similarity `0.88`.
- Audit status: `verified`

### `TestDeltaLakeDatabricksCleanUpGlueMetastore`

- Owning migration commit: `Migrate TestDeltaLakeDatabricksCleanUpGlueMetastore to JUnit`
- Current class added in same migration commit:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/deltalake/TestDeltaLakeDatabricksCleanUpGlueMetastore.java`
- Legacy class removed in same migration commit:
  -
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/deltalake/TestDeltaLakeDatabricksCleanUpGlueMetastore.java`
- Class-level environment requirement: `DeltaLakeDatabricksEnvironment`.
- Class-level tags: `ConfiguredFeatures`, `DeltaLakeDatabricks`, `ProfileSpecificTests`.
- Method inventory complete: Yes. Legacy methods: `1`. Current methods: `1`.
- Legacy helper/resource dependencies accounted for: Legacy class source reviewed directly.
- Intentional differences summary: None identified at class scope.
- Method statuses present: `verified`.

#### Methods

##### `testCleanupOrphanedDatabases`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/deltalake/TestDeltaLakeDatabricksCleanUpGlueMetastore.java` ->
  `testCleanupOrphanedDatabases`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/deltalake/TestDeltaLakeDatabricksCleanUpGlueMetastore.java` ->
  `TestDeltaLakeDatabricksCleanUpGlueMetastore.testCleanupOrphanedDatabases`
- Mapping type: `direct`
- Environment parity: Current class requires `DeltaLakeDatabricksEnvironment`. No suite run selects this method from the
  current suite definitions.
- Tag parity: Current tags: `ConfiguredFeatures`, `DeltaLakeDatabricks`, `ProfileSpecificTests`. Tag routing needs no
  suite-level product-test claim.
- Setup parity: Current setup operations: none. No legacy setup method body was available.
- Action parity: Current action verbs: none. No legacy action method body was available.
- Assertion parity: Current assertion helpers: none. No legacy assertion method body was available.
- Cleanup parity: Current cleanup operations: none. No legacy cleanup method body was available.
- Any observed difference, however small: No method-specific difference identified beyond the documented framework
  baseline.
- Known intentional difference: None.
- Reviewer note: High normalized body similarity `0.97`.
- Audit status: `verified`

### `TestDeltaLakeDatabricksCreateTableCompatibility`

- Owning migration commit: `Migrate TestDeltaLakeDatabricksCreateTableCompatibility to JUnit`
- Current class added in same migration commit:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/deltalake/TestDeltaLakeDatabricksCreateTableCompatibility.java`
- Legacy class removed in same migration commit:
  -
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/deltalake/TestDeltaLakeDatabricksCreateTableCompatibility.java`
- Class-level environment requirement: `DeltaLakeDatabricksEnvironment`.
- Class-level tags: `ConfiguredFeatures`, `DeltaLakeDatabricks`, `ProfileSpecificTests`.
- Method inventory complete: Yes. Legacy methods: `10`. Current methods: `10`.
- Legacy helper/resource dependencies accounted for: Legacy class source reviewed directly.
- Intentional differences summary: `HDP to Hive 3.1 migration`
- Method statuses present: `verified`.

#### Methods

##### `testDatabricksCanReadInitialCreateTable`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/deltalake/TestDeltaLakeDatabricksCreateTableCompatibility.java` ->
  `testDatabricksCanReadInitialCreateTable`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/deltalake/TestDeltaLakeDatabricksCreateTableCompatibility.java` ->
  `TestDeltaLakeDatabricksCreateTableCompatibility.testDatabricksCanReadInitialCreateTable`
- Mapping type: `direct`
- Environment parity: Current class requires `DeltaLakeDatabricksEnvironment`. No suite run selects this method from the
  current suite definitions.
- Tag parity: Current tags: `ConfiguredFeatures`, `DeltaLakeDatabricks`, `ProfileSpecificTests`. Tag routing needs no
  suite-level product-test claim.
- Setup parity: Current setup operations: `CREATE`. Legacy setup operations: `CREATE`.
- Action parity: Current action verbs: `SHOW`, `SELECT`. Legacy action verbs: `SHOW`, `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `contains`, `row`. Legacy assertion helpers: `assertThat`,
  `contains`, `row`.
- Cleanup parity: Current cleanup operations: none. No legacy cleanup method body was available.
- Any observed difference, however small: Current method uses parameter-injected environment helpers instead of Tempto
  query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`
- Reviewer note: Exact-name mapping with normalized body similarity `0.90`.
- Audit status: `verified`

##### `testDatabricksCanReadInitialCreatePartitionedTable`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/deltalake/TestDeltaLakeDatabricksCreateTableCompatibility.java` ->
  `testDatabricksCanReadInitialCreatePartitionedTable`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/deltalake/TestDeltaLakeDatabricksCreateTableCompatibility.java` ->
  `TestDeltaLakeDatabricksCreateTableCompatibility.testDatabricksCanReadInitialCreatePartitionedTable`
- Mapping type: `direct`
- Environment parity: Current class requires `DeltaLakeDatabricksEnvironment`. No suite run selects this method from the
  current suite definitions.
- Tag parity: Current tags: `ConfiguredFeatures`, `DeltaLakeDatabricks`, `ProfileSpecificTests`. Tag routing needs no
  suite-level product-test claim.
- Setup parity: Current setup operations: `CREATE`. Legacy setup operations: `CREATE`.
- Action parity: Current action verbs: `WITH`, `SHOW`, `SELECT`. Legacy action verbs: `WITH`, `SHOW`, `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `contains`, `row`. Legacy assertion helpers: `assertThat`,
  `contains`, `row`.
- Cleanup parity: Current cleanup operations: none. No legacy cleanup method body was available.
- Any observed difference, however small: Current method uses parameter-injected environment helpers instead of Tempto
  query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`
- Reviewer note: Exact-name mapping with normalized body similarity `0.92`.
- Audit status: `verified`

##### `testDatabricksCanReadInitialCreateTableAs`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/deltalake/TestDeltaLakeDatabricksCreateTableCompatibility.java` ->
  `testDatabricksCanReadInitialCreateTableAs`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/deltalake/TestDeltaLakeDatabricksCreateTableCompatibility.java` ->
  `TestDeltaLakeDatabricksCreateTableCompatibility.testDatabricksCanReadInitialCreateTableAs`
- Mapping type: `direct`
- Environment parity: Current class requires `DeltaLakeDatabricksEnvironment`. No suite run selects this method from the
  current suite definitions.
- Tag parity: Current tags: `ConfiguredFeatures`, `DeltaLakeDatabricks`, `ProfileSpecificTests`. Tag routing needs no
  suite-level product-test claim.
- Setup parity: Current setup operations: `CREATE`. Legacy setup operations: `CREATE`.
- Action parity: Current action verbs: `SHOW`, `SELECT`. Legacy action verbs: `SHOW`, `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `contains`, `row`. Legacy assertion helpers: `assertThat`,
  `contains`, `row`.
- Cleanup parity: Current cleanup operations: none. No legacy cleanup method body was available.
- Any observed difference, however small: Current method uses parameter-injected environment helpers instead of Tempto
  query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`
- Reviewer note: Exact-name mapping with normalized body similarity `0.92`.
- Audit status: `verified`

##### `testDatabricksCanReadInitialCreatePartitionedTableAs`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/deltalake/TestDeltaLakeDatabricksCreateTableCompatibility.java` ->
  `testDatabricksCanReadInitialCreatePartitionedTableAs`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/deltalake/TestDeltaLakeDatabricksCreateTableCompatibility.java` ->
  `TestDeltaLakeDatabricksCreateTableCompatibility.testDatabricksCanReadInitialCreatePartitionedTableAs`
- Mapping type: `direct`
- Environment parity: Current class requires `DeltaLakeDatabricksEnvironment`. No suite run selects this method from the
  current suite definitions.
- Tag parity: Current tags: `ConfiguredFeatures`, `DeltaLakeDatabricks`, `ProfileSpecificTests`. Tag routing needs no
  suite-level product-test claim.
- Setup parity: Current setup operations: `CREATE`. Legacy setup operations: `CREATE`.
- Action parity: Current action verbs: `SHOW`, `SELECT`. Legacy action verbs: `SHOW`, `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `contains`, `row`. Legacy assertion helpers: `assertThat`,
  `contains`, `row`.
- Cleanup parity: Current cleanup operations: none. No legacy cleanup method body was available.
- Any observed difference, however small: Current method uses parameter-injected environment helpers instead of Tempto
  query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`
- Reviewer note: Exact-name mapping with normalized body similarity `0.92`.
- Audit status: `verified`

##### `testCreateTableWithTableComment`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/deltalake/TestDeltaLakeDatabricksCreateTableCompatibility.java` ->
  `testCreateTableWithTableComment`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/deltalake/TestDeltaLakeDatabricksCreateTableCompatibility.java` ->
  `TestDeltaLakeDatabricksCreateTableCompatibility.testCreateTableWithTableComment`
- Mapping type: `direct`
- Environment parity: Current class requires `DeltaLakeDatabricksEnvironment`. No suite run selects this method from the
  current suite definitions.
- Tag parity: Current tags: `ConfiguredFeatures`, `DeltaLakeDatabricks`, `ProfileSpecificTests`. Tag routing needs no
  suite-level product-test claim.
- Setup parity: Current setup operations: `CREATE`. Legacy setup operations: `CREATE`.
- Action parity: Current action verbs: none. Legacy action verbs: none.
- Assertion parity: Current assertion helpers: `assertThat`, `isEqualTo`. Legacy assertion helpers: `assertThat`,
  `isEqualTo`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: Current method uses parameter-injected environment helpers instead of Tempto
  query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`
- Reviewer note: Exact-name mapping with normalized body similarity `0.86`.
- Audit status: `verified`

##### `testCreateTableWithColumnCommentOnTrino`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/deltalake/TestDeltaLakeDatabricksCreateTableCompatibility.java` ->
  `testCreateTableWithColumnCommentOnTrino`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/deltalake/TestDeltaLakeDatabricksCreateTableCompatibility.java` ->
  `TestDeltaLakeDatabricksCreateTableCompatibility.testCreateTableWithColumnCommentOnTrino`
- Mapping type: `direct`
- Environment parity: Current class requires `DeltaLakeDatabricksEnvironment`. No suite run selects this method from the
  current suite definitions.
- Tag parity: Current tags: `ConfiguredFeatures`, `DeltaLakeDatabricks`, `ProfileSpecificTests`. Tag routing needs no
  suite-level product-test claim.
- Setup parity: Current setup operations: `CREATE`, `ALTER`. Legacy setup operations: `CREATE`, `ALTER`.
- Action parity: Current action verbs: none. Legacy action verbs: none.
- Assertion parity: Current assertion helpers: `assertThat`, `isEqualTo`. Legacy assertion helpers: `assertThat`,
  `isEqualTo`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: Current method uses parameter-injected environment helpers instead of Tempto
  query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`
- Reviewer note: Exact-name mapping with normalized body similarity `0.85`.
- Audit status: `verified`

##### `testCreateTableWithColumnCommentOnDelta`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/deltalake/TestDeltaLakeDatabricksCreateTableCompatibility.java` ->
  `testCreateTableWithColumnCommentOnDelta`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/deltalake/TestDeltaLakeDatabricksCreateTableCompatibility.java` ->
  `TestDeltaLakeDatabricksCreateTableCompatibility.testCreateTableWithColumnCommentOnDelta`
- Mapping type: `direct`
- Environment parity: Current class requires `DeltaLakeDatabricksEnvironment`. No suite run selects this method from the
  current suite definitions.
- Tag parity: Current tags: `ConfiguredFeatures`, `DeltaLakeDatabricks`, `ProfileSpecificTests`. Tag routing needs no
  suite-level product-test claim.
- Setup parity: Current setup operations: `CREATE`. Legacy setup operations: `CREATE`.
- Action parity: Current action verbs: none. Legacy action verbs: none.
- Assertion parity: Current assertion helpers: `assertThat`, `isEqualTo`. Legacy assertion helpers: `assertThat`,
  `isEqualTo`.
- Cleanup parity: Current cleanup operations: none. No legacy cleanup method body was available.
- Any observed difference, however small: No method-specific difference identified beyond the documented framework
  baseline.
- Known intentional difference: None.
- Reviewer note: High normalized body similarity `0.90`.
- Audit status: `verified`

##### `testCreateTableWithDuplicatedColumnNames`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/deltalake/TestDeltaLakeDatabricksCreateTableCompatibility.java` ->
  `testCreateTableWithDuplicatedColumnNames`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/deltalake/TestDeltaLakeDatabricksCreateTableCompatibility.java` ->
  `TestDeltaLakeDatabricksCreateTableCompatibility.testCreateTableWithDuplicatedColumnNames`
- Mapping type: `direct`
- Environment parity: Current class requires `DeltaLakeDatabricksEnvironment`. No suite run selects this method from the
  current suite definitions.
- Tag parity: Current tags: `ConfiguredFeatures`, `DeltaLakeDatabricks`, `ProfileSpecificTests`. Tag routing needs no
  suite-level product-test claim.
- Setup parity: Current setup operations: `CREATE`. Legacy setup operations: `CREATE`.
- Action parity: Current action verbs: none. Legacy action verbs: none.
- Assertion parity: Current assertion helpers: `assertThatThrownBy`. Legacy assertion helpers: `assertThatThrownBy`.
- Cleanup parity: Current cleanup operations: none. No legacy cleanup method body was available.
- Any observed difference, however small: No method-specific difference identified beyond the documented framework
  baseline.
- Known intentional difference: None.
- Reviewer note: High normalized body similarity `0.94`.
- Audit status: `verified`

##### `testCreateTableWithUnsupportedPartitionType`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/deltalake/TestDeltaLakeDatabricksCreateTableCompatibility.java` ->
  `testCreateTableWithUnsupportedPartitionType`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/deltalake/TestDeltaLakeDatabricksCreateTableCompatibility.java` ->
  `TestDeltaLakeDatabricksCreateTableCompatibility.testCreateTableWithUnsupportedPartitionType`
- Mapping type: `direct`
- Environment parity: Current class requires `DeltaLakeDatabricksEnvironment`. No suite run selects this method from the
  current suite definitions.
- Tag parity: Current tags: `ConfiguredFeatures`, `DeltaLakeDatabricks`, `ProfileSpecificTests`. Tag routing needs no
  suite-level product-test claim.
- Setup parity: Current setup operations: `CREATE`. Legacy setup operations: `CREATE`.
- Action parity: Current action verbs: none. Legacy action verbs: none.
- Assertion parity: Current assertion helpers: `assertThatThrownBy`, `hasMessageContaining`. Legacy assertion helpers:
  `assertThatThrownBy`, `hasMessageContaining`.
- Cleanup parity: Current cleanup operations: none. No legacy cleanup method body was available.
- Any observed difference, however small: Current method uses parameter-injected environment helpers instead of Tempto
  query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`
- Reviewer note: Exact-name mapping with normalized body similarity `0.94`.
- Audit status: `verified`

##### `testCreateTableWithAllPartitionColumns`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/deltalake/TestDeltaLakeDatabricksCreateTableCompatibility.java` ->
  `testCreateTableWithAllPartitionColumns`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/deltalake/TestDeltaLakeDatabricksCreateTableCompatibility.java` ->
  `TestDeltaLakeDatabricksCreateTableCompatibility.testCreateTableWithAllPartitionColumns`
- Mapping type: `direct`
- Environment parity: Current class requires `DeltaLakeDatabricksEnvironment`. No suite run selects this method from the
  current suite definitions.
- Tag parity: Current tags: `ConfiguredFeatures`, `DeltaLakeDatabricks`, `ProfileSpecificTests`. Tag routing needs no
  suite-level product-test claim.
- Setup parity: Current setup operations: `CREATE`. Legacy setup operations: `CREATE`.
- Action parity: Current action verbs: `WITH`. Legacy action verbs: `WITH`.
- Assertion parity: Current assertion helpers: `assertThatThrownBy`, `hasMessageContaining`. Legacy assertion helpers:
  `assertThatThrownBy`, `hasMessageContaining`.
- Cleanup parity: Current cleanup operations: none. No legacy cleanup method body was available.
- Any observed difference, however small: Current method uses parameter-injected environment helpers instead of Tempto
  query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`
- Reviewer note: Exact-name mapping with normalized body similarity `0.93`.
- Audit status: `verified`

### `TestDeltaLakeIdentityColumnCompatibility`

- Owning migration commit: `Migrate TestDeltaLakeIdentityColumnCompatibility to JUnit`
- Current class added in same migration commit:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/deltalake/TestDeltaLakeIdentityColumnCompatibility.java`
- Legacy class removed in same migration commit:
  -
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/deltalake/TestDeltaLakeIdentityColumnCompatibility.java`
- Class-level environment requirement: `DeltaLakeDatabricksEnvironment`.
- Class-level tags: `ConfiguredFeatures`, `DeltaLakeDatabricks`, `DeltaLakeExclude173`, `ProfileSpecificTests`.
- Method inventory complete: Yes. Legacy methods: `5`. Current methods: `5`.
- Legacy helper/resource dependencies accounted for: Legacy class source reviewed directly.
- Intentional differences summary: `HDP to Hive 3.1 migration`
- Method statuses present: `verified`.

#### Methods

##### `testIdentityColumn`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/deltalake/TestDeltaLakeIdentityColumnCompatibility.java` ->
  `testIdentityColumn`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/deltalake/TestDeltaLakeIdentityColumnCompatibility.java` ->
  `TestDeltaLakeIdentityColumnCompatibility.testIdentityColumn`
- Mapping type: `direct`
- Environment parity: Current class requires `DeltaLakeDatabricksEnvironment`. No suite run selects this method from the
  current suite definitions.
- Tag parity: Current tags: `ConfiguredFeatures`, `DeltaLakeDatabricks`, `DeltaLakeExclude173`, `ProfileSpecificTests`.
  Tag routing needs no suite-level product-test claim.
- Setup parity: Current setup operations: `CREATE`, `ALTER`, `INSERT`. Legacy setup operations: `CREATE`, `ALTER`,
  `INSERT`.
- Action parity: Current action verbs: `SHOW`, `SELECT`. Legacy action verbs: `SHOW`, `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `contains`, `containsExactly`, `containsOnly`, `isEqualTo`,
  `row`. Legacy assertion helpers: `assertThat`, `contains`, `containsExactly`, `containsOnly`, `isEqualTo`, `row`.
- Cleanup parity: Current cleanup operations: none. No legacy cleanup method body was available.
- Any observed difference, however small: Current method uses parameter-injected environment helpers instead of Tempto
  query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`
- Reviewer note: Exact-name mapping with normalized body similarity `0.80`.
- Audit status: `verified`

##### `testRenameIdentityColumn`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/deltalake/TestDeltaLakeIdentityColumnCompatibility.java` ->
  `testRenameIdentityColumn`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/deltalake/TestDeltaLakeIdentityColumnCompatibility.java` ->
  `TestDeltaLakeIdentityColumnCompatibility.testRenameIdentityColumn`
- Mapping type: `direct`
- Environment parity: Current class requires `DeltaLakeDatabricksEnvironment`. No suite run selects this method from the
  current suite definitions.
- Tag parity: Current tags: `ConfiguredFeatures`, `DeltaLakeDatabricks`, `DeltaLakeExclude173`, `ProfileSpecificTests`.
  Tag routing needs no suite-level product-test claim.
- Setup parity: Current setup operations: `CREATE`, `ALTER`, `INSERT`. Legacy setup operations: `CREATE`, `ALTER`,
  `INSERT`.
- Action parity: Current action verbs: `SHOW`, `SELECT`. Legacy action verbs: `SHOW`, `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `assertThatThrownBy`, `contains`, `containsOnly`,
  `hasMessageContaining`, `row`. Legacy assertion helpers: `assertQueryFailure`, `assertThat`, `contains`,
  `containsOnly`, `hasMessageContaining`, `row`.
- Cleanup parity: Current cleanup operations: none. No legacy cleanup method body was available.
- Any observed difference, however small: Assertion helper names differ between legacy and current implementations.
  Current method uses parameter-injected environment helpers instead of Tempto query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`
- Reviewer note: Exact-name mapping with normalized body similarity `0.78`.
- Audit status: `verified`

##### `testDropIdentityColumn`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/deltalake/TestDeltaLakeIdentityColumnCompatibility.java` ->
  `testDropIdentityColumn`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/deltalake/TestDeltaLakeIdentityColumnCompatibility.java` ->
  `TestDeltaLakeIdentityColumnCompatibility.testDropIdentityColumn`
- Mapping type: `direct`
- Environment parity: Current class requires `DeltaLakeDatabricksEnvironment`. No suite run selects this method from the
  current suite definitions.
- Tag parity: Current tags: `ConfiguredFeatures`, `DeltaLakeDatabricks`, `DeltaLakeExclude173`, `ProfileSpecificTests`.
  Tag routing needs no suite-level product-test claim.
- Setup parity: Current setup operations: `CREATE`, `INSERT`, `ALTER`. Legacy setup operations: `CREATE`, `INSERT`,
  `ALTER`.
- Action parity: Current action verbs: `SELECT`. Legacy action verbs: `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `assertThatThrownBy`, `containsExactly`, `containsOnly`,
  `hasMessageContaining`, `row`. Legacy assertion helpers: `assertQueryFailure`, `assertThat`, `containsExactly`,
  `containsOnly`, `hasMessageContaining`, `row`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: Assertion helper names differ between legacy and current implementations.
  Current method uses parameter-injected environment helpers instead of Tempto query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`
- Reviewer note: Exact-name mapping with normalized body similarity `0.85`.
- Audit status: `verified`

##### `testVacuumProcedureWithIdentityColumn`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/deltalake/TestDeltaLakeIdentityColumnCompatibility.java` ->
  `testVacuumProcedureWithIdentityColumn`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/deltalake/TestDeltaLakeIdentityColumnCompatibility.java` ->
  `TestDeltaLakeIdentityColumnCompatibility.testVacuumProcedureWithIdentityColumn`
- Mapping type: `direct`
- Environment parity: Current class requires `DeltaLakeDatabricksEnvironment`. No suite run selects this method from the
  current suite definitions.
- Tag parity: Current tags: `ConfiguredFeatures`, `DeltaLakeDatabricks`, `DeltaLakeExclude173`, `ProfileSpecificTests`.
  Tag routing needs no suite-level product-test claim.
- Setup parity: Current setup operations: `CREATE`, `INSERT`. Legacy setup operations: `CREATE`, `INSERT`.
- Action parity: Current action verbs: `SHOW`, `SELECT`. Legacy action verbs: `CALL`, `SHOW`, `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `contains`, `containsOnly`, `row`. Legacy assertion
  helpers: `assertThat`, `contains`, `containsOnly`, `row`.
- Cleanup parity: Current cleanup operations: `DELETE`. Legacy cleanup operations: `DELETE`.
- Any observed difference, however small: SQL verb set differs:
  legacy ['CREATE', 'INSERT', 'DELETE', 'CALL', 'SHOW', 'SELECT'] vs
  current ['CREATE', 'INSERT', 'DELETE', 'SHOW', 'SELECT']. Current method uses parameter-injected environment helpers
  instead of Tempto query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`
- Reviewer note: Exact-name mapping with normalized body similarity `0.77`.
- Audit status: `verified`

##### `testIdentityColumnCheckpointInterval`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/deltalake/TestDeltaLakeIdentityColumnCompatibility.java` ->
  `testIdentityColumnCheckpointInterval`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/deltalake/TestDeltaLakeIdentityColumnCompatibility.java` ->
  `TestDeltaLakeIdentityColumnCompatibility.testIdentityColumnCheckpointInterval`
- Mapping type: `direct`
- Environment parity: Current class requires `DeltaLakeDatabricksEnvironment`. No suite run selects this method from the
  current suite definitions.
- Tag parity: Current tags: `ConfiguredFeatures`, `DeltaLakeDatabricks`, `DeltaLakeExclude173`, `ProfileSpecificTests`.
  Tag routing needs no suite-level product-test claim.
- Setup parity: Current setup operations: `CREATE`. Legacy setup operations: `CREATE`.
- Action parity: Current action verbs: `SHOW`. Legacy action verbs: `SHOW`.
- Assertion parity: Current assertion helpers: `assertThat`, `contains`. Legacy assertion helpers: `assertThat`,
  `contains`.
- Cleanup parity: Current cleanup operations: none. No legacy cleanup method body was available.
- Any observed difference, however small: Current method uses parameter-injected environment helpers instead of Tempto
  query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`
- Reviewer note: Exact-name mapping with normalized body similarity `0.89`.
- Audit status: `verified`

### `TestDeltaLakeUpdateCompatibility`

- Owning migration commit: `Migrate TestDeltaLakeUpdateCompatibility to JUnit`
- Current class added in same migration commit:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/deltalake/TestDeltaLakeUpdateCompatibility.java`
- Legacy class removed in same migration commit:
    - `testing/trino-product-tests/src/main/java/io/trino/tests/product/deltalake/TestDeltaLakeUpdateCompatibility.java`
- Class-level environment requirement: `DeltaLakeDatabricksEnvironment`.
- Class-level tags: `ConfiguredFeatures`, `DeltaLakeDatabricks`, `ProfileSpecificTests`.
- Method inventory complete: Yes. Legacy methods: `1`. Current methods: `1`.
- Legacy helper/resource dependencies accounted for: Legacy class source reviewed directly.
- Intentional differences summary: `HDP to Hive 3.1 migration`
- Method statuses present: `verified`.

#### Methods

##### `testUpdatesFromDatabricks`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/deltalake/TestDeltaLakeUpdateCompatibility.java` ->
  `testUpdatesFromDatabricks`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/deltalake/TestDeltaLakeUpdateCompatibility.java` ->
  `TestDeltaLakeUpdateCompatibility.testUpdatesFromDatabricks`
- Mapping type: `direct`
- Environment parity: Current class requires `DeltaLakeDatabricksEnvironment`. No suite run selects this method from the
  current suite definitions.
- Tag parity: Current tags: `ConfiguredFeatures`, `DeltaLakeDatabricks`, `ProfileSpecificTests`. Tag routing needs no
  suite-level product-test claim.
- Setup parity: Current setup operations: `CREATE`, `UPDATE`. Legacy setup operations: `CREATE`, `UPDATE`.
- Action parity: Current action verbs: `WITH`, `SELECT`. Legacy action verbs: `WITH`, `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `containsOnly`, `row`. Legacy assertion helpers:
  `assertThat`, `containsOnly`, `row`.
- Cleanup parity: Current cleanup operations: none. No legacy cleanup method body was available.
- Any observed difference, however small: Current method uses parameter-injected environment helpers instead of Tempto
  query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`
- Reviewer note: Exact-name mapping with normalized body similarity `0.90`.
- Audit status: `verified`
