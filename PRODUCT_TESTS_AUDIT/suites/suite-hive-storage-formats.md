# Suite Audit: SuiteHiveStorageFormats

## Suite Summary

- Purpose: JUnit suite for HiveStorageFormats coverage.
- Owning lane: `hive`
- Current suite class:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/suite/SuiteHiveStorageFormats.java`
- CI bucket: `bucket-4`

## Environment Runs

### Run 1

- Run name: `default`
- Environment: `HiveStorageFormatsEnvironment`
- Include tags: `StorageFormats`.
- Exclude tags: `StorageFormatsDetailed`, `HiveCompression`, `HmsOnly`.
- Expected mapped classes covered: `TestAllDatatypesFromHiveConnector`, `TestAvroSchemaLiteral`,
  `TestAvroSchemaStrictness`, `TestAvroSchemaUrl`, `TestAvroSymlinkInputFormat`, `TestHiveCoercionOnPartitionedTable`,
  `TestHiveCoercionOnUnpartitionedTable`, `TestHiveCreateTable`, `TestHiveMaterializedView`,
  `TestParquetSymlinkInputFormat`, `TestTextfileSymlinkInputFormat`, `TestHiveDeltaLakeTable`.
- Expected mapped methods covered: `43` method(s).

## CI Wiring

- `pt-junit` bucket in `.github/workflows/ci.yml`: `bucket-4`
- Special secret/credential gate: None.
- Legacy launcher suite removed: `No dedicated legacy launcher suite identified`

## Parity Checklist

- Legacy suite or lane source: `hive` lane and the corresponding legacy launcher coverage.
- Current suite class: `SuiteHiveStorageFormats`
- Explicit runs and environments: verified from current suite source.
- Include tags: verified from current suite source.
- Exclude tags: verified from current suite source.
- Expected migrated class count: `12`
- Expected migrated method count: `43`
- Expected migrated classes covered: `TestAllDatatypesFromHiveConnector`, `TestAvroSchemaLiteral`,
  `TestAvroSchemaStrictness`, `TestAvroSchemaUrl`, `TestAvroSymlinkInputFormat`, `TestHiveCoercionOnPartitionedTable`,
  `TestHiveCoercionOnUnpartitionedTable`, `TestHiveCreateTable`, `TestHiveDeltaLakeTable`, `TestHiveMaterializedView`,
  `TestParquetSymlinkInputFormat`, `TestTextfileSymlinkInputFormat`.
- Expected migrated methods covered: `TestAllDatatypesFromHiveConnector.testSelectAllDatatypesAvro`,
  `TestAllDatatypesFromHiveConnector.testSelectAllDatatypesOrc`,
  `TestAllDatatypesFromHiveConnector.testSelectAllDatatypesParquetFile`,
  `TestAllDatatypesFromHiveConnector.testSelectAllDatatypesRcfile`,
  `TestAllDatatypesFromHiveConnector.testSelectAllDatatypesTextFile`, `TestAvroSchemaLiteral.testHiveCreatedTable`,
  `TestAvroSchemaLiteral.testTrinoCreatedTable`, `TestAvroSchemaStrictness.testInvalidUnionDefaults`,
  `TestAvroSchemaUrl.testAvroSchemaUrlInSerdeProperties`, `TestAvroSchemaUrl.testHiveCreatedTable`,
  `TestAvroSchemaUrl.testTableWithLongColumnType`, `TestAvroSchemaUrl.testTrinoCreatedTable`,
  `TestAvroSymlinkInputFormat.testSymlinkTable`,
  `TestAvroSymlinkInputFormat.testSymlinkTableWithMultipleParentDirectories`,
  `TestAvroSymlinkInputFormat.testSymlinkTableWithNestedDirectory`,
  `TestHiveCoercionOnPartitionedTable.testHiveCoercionAvro`, `TestHiveCoercionOnPartitionedTable.testHiveCoercionOrc`,
  `TestHiveCoercionOnPartitionedTable.testHiveCoercionParquet`,
  `TestHiveCoercionOnPartitionedTable.testHiveCoercionRcBinary`,
  `TestHiveCoercionOnPartitionedTable.testHiveCoercionRcText`,
  `TestHiveCoercionOnPartitionedTable.testHiveCoercionSequence`,
  `TestHiveCoercionOnPartitionedTable.testHiveCoercionTextFile`,
  `TestHiveCoercionOnPartitionedTable.testHiveCoercionWithDifferentTimestampPrecisionOrc`,
  `TestHiveCoercionOnPartitionedTable.testHiveCoercionWithDifferentTimestampPrecisionParquet`,
  `TestHiveCoercionOnPartitionedTable.testHiveCoercionWithDifferentTimestampPrecisionRcBinary`,
  `TestHiveCoercionOnPartitionedTable.testHiveCoercionWithDifferentTimestampPrecisionRcText`,
  `TestHiveCoercionOnPartitionedTable.testHiveCoercionWithDifferentTimestampPrecisionSequence`,
  `TestHiveCoercionOnPartitionedTable.testHiveCoercionWithDifferentTimestampPrecisionTextFile`,
  `TestHiveCoercionOnUnpartitionedTable.testHiveCoercionOrc`,
  `TestHiveCoercionOnUnpartitionedTable.testHiveCoercionParquet` ....
- Parity status: `verified`
