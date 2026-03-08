# Suite Audit: SuiteSnowflake

## Suite Summary

- Purpose: JUnit suite for Snowflake coverage.
- Owning lane: `snowflake`
- Current suite class: `testing/trino-product-tests/src/test/java/io/trino/tests/product/suite/SuiteSnowflake.java`
- CI bucket: `bucket-1`

## Environment Runs

### Run 1

- Run name: `default`
- Environment: `SnowflakeEnvironment`
- Include tags: `ConfiguredFeatures`, `Snowflake`.
- Exclude tags: none.
- Expected mapped classes covered: `TestSnowflake`.
- Expected mapped methods covered: `1` method(s).

## CI Wiring

- `pt-junit` bucket in `.github/workflows/ci.yml`: `bucket-1`
- Special secret/credential gate: `SNOWFLAKE_URL`, `SNOWFLAKE_USER`, `SNOWFLAKE_PASSWORD`, `SNOWFLAKE_DATABASE`,
  `SNOWFLAKE_ROLE`, `SNOWFLAKE_WAREHOUSE`
- Legacy launcher suite removed: `Remove legacy SuiteSnowflake`

## Parity Checklist

- Legacy suite or lane source: `snowflake` lane and the corresponding legacy launcher coverage.
- Current suite class: `SuiteSnowflake`
- Explicit runs and environments: verified from current suite source.
- Include tags: verified from current suite source.
- Exclude tags: verified from current suite source.
- Expected migrated class count: `1`
- Expected migrated method count: `1`
- Expected migrated classes covered: `TestSnowflake`.
- Expected migrated methods covered: `TestSnowflake.testCreateTableAsSelect`.
- Parity status: `verified`
