# Suite Audit: SuiteCompatibility

## Suite Summary

- Purpose: JUnit suite for Compatibility coverage.
- Owning lane: `compatibility`
- Current suite class: `testing/trino-product-tests/src/test/java/io/trino/tests/product/suite/SuiteCompatibility.java`
- CI bucket: `bucket-7`

## Environment Runs

### Run 1

- Run name: `default`
- Environment: `HiveSparkEnvironment`
- Include tags: `HiveViewCompatibility`.
- Exclude tags: none.
- Expected mapped classes covered: `TestHiveViewCompatibility`.
- Expected mapped methods covered: `4` method(s).

### Run 2

- Run name: `default`
- Environment: `SparkIcebergCompatibilityEnvironment`
- Include tags: `IcebergFormatVersionCompatibility`.
- Exclude tags: none.
- Expected mapped classes covered: `TestIcebergFormatVersionCompatibility`.
- Expected mapped methods covered: `1` method(s).

## CI Wiring

- `pt-junit` bucket in `.github/workflows/ci.yml`: `bucket-7`
- Special secret/credential gate: None.
- Legacy launcher suite removed: `Remove legacy SuiteCompatibility`

## Parity Checklist

- Legacy suite or lane source: `compatibility` lane and the corresponding legacy launcher coverage.
- Current suite class: `SuiteCompatibility`
- Explicit runs and environments: verified from current suite source.
- Include tags: verified from current suite source.
- Exclude tags: verified from current suite source.
- Expected migrated class count: `2`
- Expected migrated method count: `5`
- Expected migrated classes covered: `TestHiveViewCompatibility`, `TestIcebergFormatVersionCompatibility`.
- Expected migrated methods covered: `TestHiveViewCompatibility.testCommentOnViewColumn`,
  `TestHiveViewCompatibility.testExistingView`, `TestHiveViewCompatibility.testSelectOnView`,
  `TestHiveViewCompatibility.testSelectOnViewFromDifferentSchema`,
  `TestIcebergFormatVersionCompatibility.testTrinoTimeTravelReadTableCreatedByEarlyVersionTrino`.
- Parity status: `verified`
