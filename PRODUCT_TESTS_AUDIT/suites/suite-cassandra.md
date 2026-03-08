# Suite Audit: SuiteCassandra

## Suite Summary

- Purpose: JUnit 5 test suite for Cassandra connector tests.
- Owning lane: `cassandra`
- Current suite class: `testing/trino-product-tests/src/test/java/io/trino/tests/product/suite/SuiteCassandra.java`
- CI bucket: `bucket-2`

## Environment Runs

### Run 1

- Run name: `default`
- Environment: `CassandraEnvironment`
- Include tags: `Cassandra`.
- Exclude tags: none.
- Expected mapped classes covered: `TestCassandra`.
- Expected mapped methods covered: `1` method(s).

## CI Wiring

- `pt-junit` bucket in `.github/workflows/ci.yml`: `bucket-2`
- Special secret/credential gate: None.
- Legacy launcher suite removed: `Remove legacy SuiteCassandra`

## Parity Checklist

- Legacy suite or lane source: `cassandra` lane and the corresponding legacy launcher coverage.
- Current suite class: `SuiteCassandra`
- Explicit runs and environments: verified from current suite source.
- Include tags: verified from current suite source.
- Exclude tags: verified from current suite source.
- Expected migrated class count: `1`
- Expected migrated method count: `1`
- Expected migrated classes covered: `TestCassandra`.
- Expected migrated methods covered: `TestCassandra.testCreateTableAsSelect`.
- Parity status: `verified`
