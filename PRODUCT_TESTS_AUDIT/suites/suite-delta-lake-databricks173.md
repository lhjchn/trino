# Suite Audit: SuiteDeltaLakeDatabricks173

## Suite Summary

- Purpose: JUnit suite for DeltaLakeDatabricks173 coverage.
- Owning lane: `databricks`
- Current suite class:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/suite/SuiteDeltaLakeDatabricks173.java`
- CI bucket: `bucket-7`

## Environment Runs

### Run 1

- Run name: `default`
- Environment: `DeltaLakeDatabricks173Environment`
- Include tags: `ConfiguredFeatures`, `DeltaLakeDatabricks`.
- Exclude tags: `DeltaLakeExclude173`.
- Expected mapped classes covered: none from the audited product-test classes.
- Expected mapped methods covered: `0` method(s).

## CI Wiring

- `pt-junit` bucket in `.github/workflows/ci.yml`: `bucket-7`
- Special secret/credential gate: `S3_BUCKET`, `AWS_REGION`, `TRINO_AWS_ACCESS_KEY_ID`, `TRINO_AWS_SECRET_ACCESS_KEY`,
  `DATABRICKS_TOKEN`, `DATABRICKS_173_JDBC_URL`
- Legacy launcher suite removed: `Remove legacy Databricks launcher suites`

## Parity Checklist

- Legacy suite or lane source: `databricks` lane and the corresponding legacy launcher coverage.
- Current suite class: `SuiteDeltaLakeDatabricks173`
- Explicit runs and environments: verified from current suite source.
- Include tags: verified from current suite source.
- Exclude tags: verified from current suite source.
- Expected migrated class count: `0`
- Expected migrated method count: `0`
- Expected migrated classes covered: none.
- Expected migrated methods covered: none.
- Parity status: `verified`
