# Lane Audit: Parquet

## Lane Summary

- Audit status: `completed`
- Section start commit: `Add Parquet environment`
- Section end commit: `Reorganize Delta Databricks compatibility tests`
- Introduced JUnit suites: `SuiteParquet`.
- Extended existing suites: none.
- Retired legacy suites: `SuiteParquet`, `launcher and Tempto product-test framework`.
- Environment classes introduced: `ParquetEnvironment`.
- Method status counts: verified `2`, intentional difference `5`, needs follow-up `0`.

## Lane-Level Open Questions / Intentional Differences

- Lane-wide approved difference set: `HDP to Hive 3.1 migration`.
- Needs-follow-up methods: none currently identified in this source/history pass.

## Ported Test Classes

### `TestParquetJunit`

- Owning migration commit: `Migrate TestParquet to JUnit`
- Current class added in same migration commit:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/parquet/TestParquetJunit.java`
- Legacy class removed in same migration commit:
    - `testing/trino-product-tests/src/main/java/io/trino/tests/product/TestParquet.java`
- Class-level environment requirement: `ParquetEnvironment`.
- Class-level tags: `ConfiguredFeatures`, `Parquet`, `ProfileSpecificTests`.
- Method inventory complete: Yes. Legacy methods: `2`. Current methods: `2`.
- Legacy helper/resource dependencies accounted for: Legacy class source reviewed directly. Deleted query resources in
  the same migration commit: `src/main/resources/sql-tests/testcases/hive_tpch/q15.{sql,result}`,
  `src/main/resources/sql-tests/testcases/tpcds/q24_1.{sql,result}`,
  `src/main/resources/sql-tests/testcases/tpcds/q72.{sql,result}`.
- Intentional differences summary: `HDP to Hive 3.1 migration`
- Method statuses present: `verified`.

#### Methods

##### `testTpcds`

- Legacy source method: `testing/trino-product-tests/src/main/java/io/trino/tests/product/TestParquet.java` ->
  `testTpcds`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/parquet/TestParquetJunit.java` ->
  `TestParquetJunit.testTpcds`
- Mapping type: `direct`
- Environment parity: Current class requires `ParquetEnvironment`. Routed by source review into `SuiteParquet` run 1.
- Tag parity: Current tags: `ConfiguredFeatures`, `Parquet`, `ProfileSpecificTests`. Tag routing matches the current
  suite selection.
- Setup parity: Current setup operations: none. Legacy setup came from deleted SQL/dataset resources folded into this
  class.
- Action parity: Current action verbs: none. Legacy action is represented by deleted SQL resource cases.
- Assertion parity: Current assertion helpers: `assertResults`. Legacy assertion helpers: `assertResults`.
- Cleanup parity: Current cleanup operations: none. Cleanup is now inline in the JUnit method because the old case lived
  in resource files.
- Any observed difference, however small: Current method uses parameter-injected environment helpers instead of Tempto
  query executors and absorbs the legacy `q24_1` and `q72` TPCDS query resources that were deleted in the same migration
  commit.
- Known intentional difference: `HDP to Hive 3.1 migration`
- Reviewer note: Matched by current suite selection: `SuiteParquet` run 1. Resource-backed legacy coverage includes
  deleted `tpcds/q24_1.*` and `tpcds/q72.*`.
- Audit status: `verified`

##### `testTpch`

- Legacy source method: `testing/trino-product-tests/src/main/java/io/trino/tests/product/TestParquet.java` ->
  `testTpch`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/parquet/TestParquetJunit.java` ->
  `TestParquetJunit.testTpch`
- Mapping type: `direct`
- Environment parity: Current class requires `ParquetEnvironment`. Routed by source review into `SuiteParquet` run 1.
- Tag parity: Current tags: `ConfiguredFeatures`, `Parquet`, `ProfileSpecificTests`. Tag routing matches the current
  suite selection.
- Setup parity: Current setup operations: none. Legacy setup came from deleted SQL/dataset resources folded into this
  class.
- Action parity: Current action verbs: none. Legacy action is represented by deleted SQL resource cases.
- Assertion parity: Current assertion helpers: `assertResults`. Legacy assertion helpers: `assertResults`.
- Cleanup parity: Current cleanup operations: none. Cleanup is now inline in the JUnit method because the old case lived
  in resource files.
- Any observed difference, however small: Current method uses parameter-injected environment helpers instead of Tempto
  query executors and absorbs the legacy `q15` Hive TPC-H query resource that was deleted in the same migration commit.
- Known intentional difference: `HDP to Hive 3.1 migration`
- Reviewer note: Matched by current suite selection: `SuiteParquet` run 1. Resource-backed legacy coverage includes
  deleted `hive_tpch/q15.*`.
- Audit status: `verified`

### `TestDeltaLakeAlterTableCompatibilityDatabricks`

- Owning migration commit: `Reorganize Delta Databricks compatibility tests`
- Current class added in same migration commit:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/deltalake/TestDeltaLakeAlterTableCompatibilityDatabricks.java`
- Legacy class removed in same migration commit:
    - None. This commit added new JUnit-side verification coverage rather than removing a legacy class.
- Class-level environment requirement: `DeltaLakeDatabricksEnvironment`.
- Class-level tags: `ConfiguredFeatures`, `DeltaLakeDatabricks`, `ProfileSpecificTests`.
- Method inventory complete: Not applicable. No legacy class or resource source exists for this new verification
  coverage.
- Legacy helper/resource dependencies accounted for: New JUnit-side verification coverage without a removed legacy
  counterpart.
- Intentional differences summary: `HDP to Hive 3.1 migration`, `JUnit/AssertJ/Testcontainers framework replacement`
- Method statuses present: `intentional difference`.

#### Methods

##### `testTrinoAlterTablePreservesGeneratedColumn`

- Legacy source method: No legacy source method; this is new JUnit-side verification coverage.
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/deltalake/TestDeltaLakeAlterTableCompatibilityDatabricks.java` ->
  `TestDeltaLakeAlterTableCompatibilityDatabricks.testTrinoAlterTablePreservesGeneratedColumn`
- Mapping type: `new coverage helper`
- Environment parity: Current class requires `DeltaLakeDatabricksEnvironment`. No suite run selects this method from the
  current suite definitions.
- Tag parity: Current tags: `ConfiguredFeatures`, `DeltaLakeDatabricks`, `ProfileSpecificTests`. Tag routing needs no
  suite-level product-test claim.
- Setup parity: Current setup operations: `CREATE`, `ALTER`, `INSERT`. No legacy setup method body was available.
- Action parity: Current action verbs: `SHOW`, `SELECT`, `DESCRIBE`. No legacy action method body was available.
- Assertion parity: Current assertion helpers: `assertThat`, `contains`, `containsOnly`, `row`. No legacy assertion
  method body was available.
- Cleanup parity: Current cleanup operations: none. No legacy cleanup method body was available.
- Any observed difference, however small: No legacy method counterpart exists; this is new JUnit-side verification
  coverage.
- Known intentional difference: `HDP to Hive 3.1 migration`, `JUnit/AssertJ/Testcontainers framework replacement`
- Reviewer note: Source/history review only.
- Audit status: `intentional difference`

### `TestDeltaLakeCaseInsensitiveMappingDatabricks`

- Owning migration commit: `Reorganize Delta Databricks compatibility tests`
- Current class added in same migration commit:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/deltalake/TestDeltaLakeCaseInsensitiveMappingDatabricks.java`
- Legacy class removed in same migration commit:
    - None. This commit added new JUnit-side verification coverage rather than removing a legacy class.
- Class-level environment requirement: `DeltaLakeDatabricksEnvironment`.
- Class-level tags: `ConfiguredFeatures`, `DeltaLakeDatabricks`, `ProfileSpecificTests`.
- Method inventory complete: Not applicable. No legacy class or resource source exists for this new verification
  coverage.
- Legacy helper/resource dependencies accounted for: New JUnit-side verification coverage without a removed legacy
  counterpart.
- Intentional differences summary: `HDP to Hive 3.1 migration`, `JUnit/AssertJ/Testcontainers framework replacement`
- Method statuses present: `intentional difference`.

#### Methods

##### `testGeneratedColumnWithNonLowerCaseColumnName`

- Legacy source method: No legacy source method; this is new JUnit-side verification coverage.
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/deltalake/TestDeltaLakeCaseInsensitiveMappingDatabricks.java` ->
  `TestDeltaLakeCaseInsensitiveMappingDatabricks.testGeneratedColumnWithNonLowerCaseColumnName`
- Mapping type: `new coverage helper`
- Environment parity: Current class requires `DeltaLakeDatabricksEnvironment`. No suite run selects this method from the
  current suite definitions.
- Tag parity: Current tags: `ConfiguredFeatures`, `DeltaLakeDatabricks`, `ProfileSpecificTests`. Tag routing needs no
  suite-level product-test claim.
- Setup parity: Current setup operations: `CREATE`, `INSERT`. No legacy setup method body was available.
- Action parity: Current action verbs: none. No legacy action method body was available.
- Assertion parity: Current assertion helpers: `assertThatThrownBy`, `hasMessageContaining`. No legacy assertion method
  body was available.
- Cleanup parity: Current cleanup operations: none. No legacy cleanup method body was available.
- Any observed difference, however small: No legacy method counterpart exists; this is new JUnit-side verification
  coverage.
- Known intentional difference: `HDP to Hive 3.1 migration`, `JUnit/AssertJ/Testcontainers framework replacement`
- Reviewer note: Source/history review only.
- Audit status: `intentional difference`

##### `testIdentityColumnWithNonLowerCaseColumnName`

- Legacy source method: No legacy source method; this is new JUnit-side verification coverage.
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/deltalake/TestDeltaLakeCaseInsensitiveMappingDatabricks.java` ->
  `TestDeltaLakeCaseInsensitiveMappingDatabricks.testIdentityColumnWithNonLowerCaseColumnName`
- Mapping type: `new coverage helper`
- Environment parity: Current class requires `DeltaLakeDatabricksEnvironment`. No suite run selects this method from the
  current suite definitions.
- Tag parity: Current tags: `ConfiguredFeatures`, `DeltaLakeDatabricks`, `ProfileSpecificTests`. Tag routing needs no
  suite-level product-test claim.
- Setup parity: Current setup operations: `CREATE`, `INSERT`, `UPDATE`, `ALTER`. No legacy setup method body was
  available.
- Action parity: Current action verbs: `SELECT`, `MERGE`, `SHOW`. No legacy action method body was available.
- Assertion parity: Current assertion helpers: `assertThat`, `assertThatThrownBy`, `contains`, `containsOnly`,
  `hasMessageContaining`, `row`. No legacy assertion method body was available.
- Cleanup parity: Current cleanup operations: `DELETE`, `DROP`. No legacy cleanup method body was available.
- Any observed difference, however small: No legacy method counterpart exists; this is new JUnit-side verification
  coverage.
- Known intentional difference: `HDP to Hive 3.1 migration`, `JUnit/AssertJ/Testcontainers framework replacement`
- Reviewer note: Source/history review only.
- Audit status: `intentional difference`

### `TestDeltaLakeCloneTableCompatibilityDatabricks`

- Owning migration commit: `Reorganize Delta Databricks compatibility tests`
- Current class added in same migration commit:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/deltalake/TestDeltaLakeCloneTableCompatibilityDatabricks.java`
- Legacy class removed in same migration commit:
    - None. This commit added new JUnit-side verification coverage rather than removing a legacy class.
- Class-level environment requirement: `DeltaLakeDatabricksEnvironment`.
- Class-level tags: `ConfiguredFeatures`, `DeltaLakeDatabricks`, `ProfileSpecificTests`.
- Method inventory complete: Not applicable. No legacy class or resource source exists for this new verification
  coverage.
- Legacy helper/resource dependencies accounted for: New JUnit-side verification coverage without a removed legacy
  counterpart.
- Intentional differences summary: `HDP to Hive 3.1 migration`, `JUnit/AssertJ/Testcontainers framework replacement`
- Method statuses present: `intentional difference`.

#### Methods

##### `testReadFromSchemaChangedDeepCloneTable`

- Legacy source method: No legacy source method; this is new JUnit-side verification coverage.
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/deltalake/TestDeltaLakeCloneTableCompatibilityDatabricks.java` ->
  `TestDeltaLakeCloneTableCompatibilityDatabricks.testReadFromSchemaChangedDeepCloneTable`
- Mapping type: `new coverage helper`
- Environment parity: Current class requires `DeltaLakeDatabricksEnvironment`. No suite run selects this method from the
  current suite definitions.
- Tag parity: Current tags: `ConfiguredFeatures`, `DeltaLakeDatabricks`, `ProfileSpecificTests`. Tag routing needs no
  suite-level product-test claim.
- Setup parity: Current setup operations: none. No legacy setup method body was available.
- Action parity: Current action verbs: none. No legacy action method body was available.
- Assertion parity: Current assertion helpers: none. No legacy assertion method body was available.
- Cleanup parity: Current cleanup operations: none. No legacy cleanup method body was available.
- Any observed difference, however small: No legacy method counterpart exists; this is new JUnit-side verification
  coverage.
- Known intentional difference: `HDP to Hive 3.1 migration`, `JUnit/AssertJ/Testcontainers framework replacement`
- Reviewer note: Source/history review only.
- Audit status: `intentional difference`

### `TestDeltaLakeJmxDatabricks`

- Owning migration commit: `Reorganize Delta Databricks compatibility tests`
- Current class added in same migration commit:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/deltalake/TestDeltaLakeJmxDatabricks.java`
- Legacy class removed in same migration commit:
    - None. This commit added new JUnit-side verification coverage rather than removing a legacy class.
- Class-level environment requirement: `DeltaLakeDatabricksEnvironment`.
- Class-level tags: `ConfiguredFeatures`, `DeltaLakeDatabricks`, `ProfileSpecificTests`.
- Method inventory complete: Not applicable. No legacy class or resource source exists for this new verification
  coverage.
- Legacy helper/resource dependencies accounted for: New JUnit-side verification coverage without a removed legacy
  counterpart.
- Intentional differences summary: `HDP to Hive 3.1 migration`, `JUnit/AssertJ/Testcontainers framework replacement`
- Method statuses present: `intentional difference`.

#### Methods

##### `testJmxTablesExposedByDeltaLakeConnectorBackedByGlueMetastore`

- Legacy source method: No legacy source method; this is new JUnit-side verification coverage.
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/deltalake/TestDeltaLakeJmxDatabricks.java` ->
  `TestDeltaLakeJmxDatabricks.testJmxTablesExposedByDeltaLakeConnectorBackedByGlueMetastore`
- Mapping type: `new coverage helper`
- Environment parity: Current class requires `DeltaLakeDatabricksEnvironment`. No suite run selects this method from the
  current suite definitions.
- Tag parity: Current tags: `ConfiguredFeatures`, `DeltaLakeDatabricks`, `ProfileSpecificTests`. Tag routing needs no
  suite-level product-test claim.
- Setup parity: Current setup operations: none. No legacy setup method body was available.
- Action parity: Current action verbs: `SHOW`. No legacy action method body was available.
- Assertion parity: Current assertion helpers: `assertThat`, `containsOnly`, `row`. No legacy assertion method body was
  available.
- Cleanup parity: Current cleanup operations: none. No legacy cleanup method body was available.
- Any observed difference, however small: No legacy method counterpart exists; this is new JUnit-side verification
  coverage.
- Known intentional difference: `HDP to Hive 3.1 migration`, `JUnit/AssertJ/Testcontainers framework replacement`
- Reviewer note: Source/history review only.
- Audit status: `intentional difference`
