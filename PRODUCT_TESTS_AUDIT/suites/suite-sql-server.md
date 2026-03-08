# Suite Audit: SuiteSqlServer

## Suite Summary

- Purpose: JUnit 5 test suite for SQL Server connector tests.
- Owning lane: `sql-server`
- Current suite class: `testing/trino-product-tests/src/test/java/io/trino/tests/product/suite/SuiteSqlServer.java`
- CI bucket: `bucket-1`

## Environment Runs

### Run 1

- Run name: `default`
- Environment: `SqlServerEnvironment`
- Include tags: `Sqlserver`.
- Exclude tags: none.
- Expected mapped classes covered: `TestSqlServer`.
- Expected mapped methods covered: `1` method(s).

## CI Wiring

- `pt-junit` bucket in `.github/workflows/ci.yml`: `bucket-1`
- Special secret/credential gate: None.
- Legacy launcher suite removed: `Remove legacy SuiteSqlServer`

## Parity Checklist

- Legacy suite or lane source: `sql-server` lane and the corresponding legacy launcher coverage.
- Current suite class: `SuiteSqlServer`
- Explicit runs and environments: verified from current suite source.
- Include tags: verified from current suite source.
- Exclude tags: verified from current suite source.
- Expected migrated class count: `1`
- Expected migrated method count: `1`
- Expected migrated classes covered: `TestSqlServer`.
- Expected migrated methods covered: `TestSqlServer.testCreateTableAsSelect`.
- Parity status: `verified`
