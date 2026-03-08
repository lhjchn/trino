# Suite Audit: SuiteBlackHole

## Suite Summary

- Purpose: JUnit 5 test suite for BlackHole connector tests.
- Owning lane: `blackhole`
- Current suite class: `testing/trino-product-tests/src/test/java/io/trino/tests/product/suite/SuiteBlackHole.java`
- CI bucket: `bucket-2`

## Environment Runs

### Run 1

- Run name: `default`
- Environment: `BlackHoleEnvironment`
- Include tags: `Blackhole`.
- Exclude tags: none.
- Expected mapped classes covered: `TestBlackHoleConnector`.
- Expected mapped methods covered: `1` method(s).

## CI Wiring

- `pt-junit` bucket in `.github/workflows/ci.yml`: `bucket-2`
- Special secret/credential gate: None.
- Legacy launcher suite removed: `No dedicated legacy launcher suite identified`

## Parity Checklist

- Legacy suite or lane source: `blackhole` lane and the corresponding legacy launcher coverage.
- Current suite class: `SuiteBlackHole`
- Explicit runs and environments: verified from current suite source.
- Include tags: verified from current suite source.
- Exclude tags: verified from current suite source.
- Expected migrated class count: `1`
- Expected migrated method count: `1`
- Expected migrated classes covered: `TestBlackHoleConnector`.
- Expected migrated methods covered: `TestBlackHoleConnector.testBlackHoleConnector`.
- Parity status: `verified`
