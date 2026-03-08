# Suite Audit: SuiteGcs

## Suite Summary

- Purpose: JUnit suite for Gcs coverage.
- Owning lane: `gcs`
- Current suite class: `testing/trino-product-tests/src/test/java/io/trino/tests/product/suite/SuiteGcs.java`
- CI bucket: `bucket-7`

## Environment Runs

### Run 1

- Run name: `default`
- Environment: `GcsEnvironment`
- Include tags: `ConfiguredFeatures`, `DeltaLakeGcs`.
- Exclude tags: none.
- Expected mapped classes covered: `TestDeltaLakeGcs`.
- Expected mapped methods covered: `4` method(s).

### Run 2

- Run name: `default`
- Environment: `GcsEnvironment`
- Include tags: `ConfiguredFeatures`, `IcebergGcs`.
- Exclude tags: none.
- Expected mapped classes covered: `TestIcebergGcs`.
- Expected mapped methods covered: `5` method(s).

### Run 3

- Run name: `default`
- Environment: `GcsEnvironment`
- Include tags: `ConfiguredFeatures`, `HiveGcs`.
- Exclude tags: none.
- Expected mapped classes covered: `TestHiveGcs`.
- Expected mapped methods covered: `4` method(s).

## CI Wiring

- `pt-junit` bucket in `.github/workflows/ci.yml`: `bucket-7`
- Special secret/credential gate: `GCP_CREDENTIALS_KEY`, `GCP_STORAGE_BUCKET`
- Legacy launcher suite removed: `Remove legacy SuiteGcs`

## Parity Checklist

- Legacy suite or lane source: `gcs` lane and the corresponding legacy launcher coverage.
- Current suite class: `SuiteGcs`
- Explicit runs and environments: verified from current suite source.
- Include tags: verified from current suite source.
- Exclude tags: verified from current suite source.
- Expected migrated class count: `3`
- Expected migrated method count: `13`
- Expected migrated classes covered: `TestDeltaLakeGcs`, `TestHiveGcs`, `TestIcebergGcs`.
- Expected migrated methods covered: `TestDeltaLakeGcs.testBasicWriteOperations`,
  `TestDeltaLakeGcs.testCreateAndSelectNationTable`, `TestDeltaLakeGcs.testLocationContainsDiscouragedCharacter`,
  `TestDeltaLakeGcs.testPathContainsSpecialCharacter`, `TestHiveGcs.testInsertTable`,
  `TestHiveGcs.testLocationContainsDiscouragedCharacter`, `TestHiveGcs.testPathContainsSpecialCharacter`,
  `TestHiveGcs.testSparkReadingTrinoData`, `TestIcebergGcs.testBasicWriteOperations`,
  `TestIcebergGcs.testCreateAndSelectNationTable`, `TestIcebergGcs.testLocationContainsDiscouragedCharacter`,
  `TestIcebergGcs.testPathContainsSpecialCharacter`, `TestIcebergGcs.testSparkReadingTrinoData`.
- Parity status: `verified`
