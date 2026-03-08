# Suite Audit: SuiteTls

## Suite Summary

- Purpose: JUnit suite for Tls coverage.
- Owning lane: `tls`
- Current suite class: `testing/trino-product-tests/src/test/java/io/trino/tests/product/suite/SuiteTls.java`
- CI bucket: `bucket-3`

## Environment Runs

### Run 1

- Run name: `default`
- Environment: `TlsEnvironment`
- Include tags: `ConfiguredFeatures`, `Tls`.
- Exclude tags: none.
- Expected mapped classes covered: `TestTlsJunit`.
- Expected mapped methods covered: `1` method(s).

## CI Wiring

- `pt-junit` bucket in `.github/workflows/ci.yml`: `bucket-3`
- Special secret/credential gate: None.
- Legacy launcher suite removed: `No dedicated legacy launcher suite identified`

## Parity Checklist

- Legacy suite or lane source: `tls` lane and the corresponding legacy launcher coverage.
- Current suite class: `SuiteTls`
- Explicit runs and environments: verified from current suite source.
- Include tags: verified from current suite source.
- Exclude tags: verified from current suite source.
- Expected migrated class count: `1`
- Expected migrated method count: `1`
- Expected migrated classes covered: `TestTlsJunit`.
- Expected migrated methods covered: `TestTlsJunit.testHttpPortIsClosed`.
- Parity status: `verified`
