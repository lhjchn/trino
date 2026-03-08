# Suite Audit: SuitePostgresql

## Suite Summary

- Purpose: JUnit 5 test suite for PostgreSQL connector tests.
- Owning lane: `postgresql`
- Current suite class: `testing/trino-product-tests/src/test/java/io/trino/tests/product/suite/SuitePostgresql.java`
- CI bucket: `bucket-1`

## Environment Runs

### Run 1

- Run name: `default`
- Environment: `PostgresqlBasicEnvironment`
- Include tags: `Postgresql`.
- Exclude tags: `PostgresqlSpooling`.
- Expected mapped classes covered: none from the audited product-test classes.
- Expected mapped methods covered: `0` method(s).

### Run 2

- Run name: `default`
- Environment: `PostgresqlSpoolingEnvironment`
- Include tags: `PostgresqlSpooling`.
- Exclude tags: none.
- Expected mapped classes covered: none from the audited product-test classes.
- Expected mapped methods covered: `0` method(s).

## CI Wiring

- `pt-junit` bucket in `.github/workflows/ci.yml`: `bucket-1`
- Special secret/credential gate: None.
- Legacy launcher suite removed: `Remove legacy SuitePostgresql`

## Parity Checklist

- Legacy suite or lane source: `postgresql` lane and the corresponding legacy launcher coverage.
- Current suite class: `SuitePostgresql`
- Explicit runs and environments: verified from current suite source.
- Include tags: verified from current suite source.
- Exclude tags: verified from current suite source.
- Expected migrated class count: `0`
- Expected migrated method count: `0`
- Expected migrated classes covered: none.
- Expected migrated methods covered: none.
- Parity status: `verified`
