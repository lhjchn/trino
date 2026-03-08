# Suite Audit: SuiteParquet

## Suite Summary

- Purpose: JUnit suite for Parquet coverage.
- Owning lane: `parquet`
- Current suite class: `testing/trino-product-tests/src/test/java/io/trino/tests/product/suite/SuiteParquet.java`
- CI bucket: `bucket-6`

## Environment Runs

### Run 1

- Run name: `default`
- Environment: `ParquetEnvironment`
- Include tags: `ConfiguredFeatures`, `Parquet`.
- Exclude tags: none.
- Expected mapped classes covered: `TestParquetJunit`.
- Expected mapped methods covered: `2` method(s).

## CI Wiring

- `pt-junit` bucket in `.github/workflows/ci.yml`: `bucket-6`
- Special secret/credential gate: None.
- Legacy launcher suite removed: `Remove legacy SuiteParquet`

## Parity Checklist

- Legacy suite or lane source: `parquet` lane and the corresponding legacy launcher coverage.
- Current suite class: `SuiteParquet`
- Explicit runs and environments: verified from current suite source.
- Include tags: verified from current suite source.
- Exclude tags: verified from current suite source.
- Expected migrated class count: `1`
- Expected migrated method count: `2`
- Expected migrated classes covered: `TestParquetJunit`.
- Expected migrated methods covered: `TestParquetJunit.testTpcds`, `TestParquetJunit.testTpch`.
- Parity status: `verified`
