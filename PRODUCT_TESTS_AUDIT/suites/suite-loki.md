# Suite Audit: SuiteLoki

## Suite Summary

- Purpose: JUnit suite for Loki coverage.
- Owning lane: `loki`
- Current suite class: `testing/trino-product-tests/src/test/java/io/trino/tests/product/suite/SuiteLoki.java`
- CI bucket: `bucket-3`

## Environment Runs

### Run 1

- Run name: `default`
- Environment: `LokiEnvironment`
- Include tags: `ConfiguredFeatures`, `Loki`.
- Exclude tags: none.
- Expected mapped classes covered: `TestLoki`.
- Expected mapped methods covered: `1` method(s).

## CI Wiring

- `pt-junit` bucket in `.github/workflows/ci.yml`: `bucket-3`
- Special secret/credential gate: None.
- Legacy launcher suite removed: `Remove legacy SuiteLoki`

## Parity Checklist

- Legacy suite or lane source: `loki` lane and the corresponding legacy launcher coverage.
- Current suite class: `SuiteLoki`
- Explicit runs and environments: verified from current suite source.
- Include tags: verified from current suite source.
- Exclude tags: verified from current suite source.
- Expected migrated class count: `1`
- Expected migrated method count: `1`
- Expected migrated classes covered: `TestLoki`.
- Expected migrated methods covered: `TestLoki.testQueryRange`.
- Parity status: `verified`
