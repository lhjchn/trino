# Suite Audit: SuiteRanger

## Suite Summary

- Purpose: JUnit suite for Ranger coverage.
- Owning lane: `ranger`
- Current suite class: `testing/trino-product-tests/src/test/java/io/trino/tests/product/suite/SuiteRanger.java`
- CI bucket: `bucket-3`

## Environment Runs

### Run 1

- Run name: `default`
- Environment: `RangerEnvironment`
- Include tags: `ConfiguredFeatures`, `Ranger`.
- Exclude tags: none.
- Expected mapped classes covered: `TestApacheRanger`.
- Expected mapped methods covered: `1` method(s).

## CI Wiring

- `pt-junit` bucket in `.github/workflows/ci.yml`: `bucket-3`
- Special secret/credential gate: None.
- Legacy launcher suite removed: `Remove legacy SuiteRanger`

## Parity Checklist

- Legacy suite or lane source: `ranger` lane and the corresponding legacy launcher coverage.
- Current suite class: `SuiteRanger`
- Explicit runs and environments: verified from current suite source.
- Include tags: verified from current suite source.
- Exclude tags: verified from current suite source.
- Expected migrated class count: `1`
- Expected migrated method count: `1`
- Expected migrated classes covered: `TestApacheRanger`.
- Expected migrated methods covered: `TestApacheRanger.testCreateTableAsSelect`.
- Parity status: `verified`
