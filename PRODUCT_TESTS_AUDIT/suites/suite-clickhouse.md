# Suite Audit: SuiteClickhouse

## Suite Summary

- Purpose: JUnit 5 test suite for ClickHouse connector tests.
- Owning lane: `clickhouse`
- Current suite class: `testing/trino-product-tests/src/test/java/io/trino/tests/product/suite/SuiteClickhouse.java`
- CI bucket: `bucket-2`

## Environment Runs

### Run 1

- Run name: `default`
- Environment: `ClickHouseEnvironment`
- Include tags: `Clickhouse`.
- Exclude tags: none.
- Expected mapped classes covered: `TestClickHouse`.
- Expected mapped methods covered: `1` method(s).

## CI Wiring

- `pt-junit` bucket in `.github/workflows/ci.yml`: `bucket-2`
- Special secret/credential gate: None.
- Legacy launcher suite removed: `Remove legacy SuiteClickhouse`

## Parity Checklist

- Legacy suite or lane source: `clickhouse` lane and the corresponding legacy launcher coverage.
- Current suite class: `SuiteClickhouse`
- Explicit runs and environments: verified from current suite source.
- Include tags: verified from current suite source.
- Exclude tags: verified from current suite source.
- Expected migrated class count: `1`
- Expected migrated method count: `1`
- Expected migrated classes covered: `TestClickHouse`.
- Expected migrated methods covered: `TestClickHouse.testCreateTableAsSelect`.
- Parity status: `verified`
