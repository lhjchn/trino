# Suite Audit: SuiteHiveBasic

## Suite Summary

- Purpose: JUnit suite for HiveBasic coverage.
- Owning lane: `hive`
- Current suite class: `testing/trino-product-tests/src/test/java/io/trino/tests/product/suite/SuiteHiveBasic.java`
- CI bucket: `bucket-4`

## Environment Runs

### Run 1

- Run name: `default`
- Environment: `HiveBasicEnvironment`
- Include tags: `HdfsNoImpersonation`.
- Exclude tags: none.
- Expected mapped classes covered: `TestImpersonationNoImpersonationJunit`, `TestCreateDropSchema`,
  `TestCsvFileHiveTable`, `TestExternalHiveTable`, `TestHdfsSyncPartitionMetadata`, `TestHiveBasicTableStatistics`,
  `TestHiveBucketedTables`, `TestHiveHiddenFiles`, `TestHiveIgnoreAbsentPartitions`, `TestHivePartitionSchemaEvolution`,
  `TestHivePartitionsTable`, `TestHivePropertiesTable`, `TestHiveRequireQueryPartitionsFilter`, `TestHiveSchema`,
  `TestHiveViews`, `TestHiveViewsLegacy`, `TestInsertIntoHiveTable`, `TestTablePartitioningSelect`,
  `TestTablePartitioningWithSpecialChars`, `TestTextFileHiveTable`.
- Expected mapped methods covered: `153` method(s).

## CI Wiring

- `pt-junit` bucket in `.github/workflows/ci.yml`: `bucket-4`
- Special secret/credential gate: None.
- Legacy launcher suite removed: `No dedicated legacy launcher suite identified`

## Parity Checklist

- Legacy suite or lane source: `hive` lane and the corresponding legacy launcher coverage.
- Current suite class: `SuiteHiveBasic`
- Explicit runs and environments: verified from current suite source.
- Include tags: verified from current suite source.
- Exclude tags: verified from current suite source.
- Expected migrated class count: `20`
- Expected migrated method count: `153`
- Expected migrated classes covered: `TestCreateDropSchema`, `TestCsvFileHiveTable`, `TestExternalHiveTable`,
  `TestHdfsSyncPartitionMetadata`, `TestHiveBasicTableStatistics`, `TestHiveBucketedTables`, `TestHiveHiddenFiles`,
  `TestHiveIgnoreAbsentPartitions`, `TestHivePartitionSchemaEvolution`, `TestHivePartitionsTable`,
  `TestHivePropertiesTable`, `TestHiveRequireQueryPartitionsFilter`, `TestHiveSchema`, `TestHiveViews`,
  `TestHiveViewsLegacy`, `TestImpersonationNoImpersonationJunit`, `TestInsertIntoHiveTable`,
  `TestTablePartitioningSelect`, `TestTablePartitioningWithSpecialChars`, `TestTextFileHiveTable`.
- Expected migrated methods covered: `TestCreateDropSchema.testCreateDropSchema`,
  `TestCreateDropSchema.testDropSchemaFiles`, `TestCreateDropSchema.testDropSchemaFilesTransactions`,
  `TestCreateDropSchema.testDropSchemaFilesWithEmptyExternalSubdir`,
  `TestCreateDropSchema.testDropSchemaFilesWithLocation`, `TestCreateDropSchema.testDropTransactionsWithExternalFiles`,
  `TestCreateDropSchema.testDropWithExternalFilesInSubdirectory`,
  `TestCsvFileHiveTable.testCreateCsvFileTableAsSelectSkipHeaderFooter`,
  `TestExternalHiveTable.testAnalyzeExternalTable`,
  `TestExternalHiveTable.testCreateExternalTableWithInaccessibleSchemaLocation`,
  `TestExternalHiveTable.testDeleteFromExternalPartitionedTableTable`,
  `TestExternalHiveTable.testDeleteFromExternalTable`, `TestExternalHiveTable.testInsertIntoExternalTable`,
  `TestExternalHiveTable.testShowStatisticsForExternalTable`,
  `TestHdfsSyncPartitionMetadata.testAddNonConventionalHivePartition`, `TestHdfsSyncPartitionMetadata.testAddPartition`,
  `TestHdfsSyncPartitionMetadata.testAddPartitionContainingCharactersThatNeedUrlEncoding`,
  `TestHdfsSyncPartitionMetadata.testConflictingMixedCasePartitionNames`,
  `TestHdfsSyncPartitionMetadata.testDropPartition`,
  `TestHdfsSyncPartitionMetadata.testDropPartitionContainingCharactersThatNeedUrlEncoding`,
  `TestHdfsSyncPartitionMetadata.testFullSyncPartition`, `TestHdfsSyncPartitionMetadata.testInvalidSyncMode`,
  `TestHdfsSyncPartitionMetadata.testMixedCasePartitionNames`,
  `TestHdfsSyncPartitionMetadata.testSyncPartitionMetadataWithNullArgument`,
  `TestHiveBasicTableStatistics.testAnalyzePartitioned`, `TestHiveBasicTableStatistics.testAnalyzeUnpartitioned`,
  `TestHiveBasicTableStatistics.testCreateExternalUnpartitioned`, `TestHiveBasicTableStatistics.testCreatePartitioned`,
  `TestHiveBasicTableStatistics.testCreateTableWithNoData`, `TestHiveBasicTableStatistics.testCreateUnpartitioned` ....
- Parity status: `verified`
