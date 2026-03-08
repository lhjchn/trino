# Suite Audit: SuiteHiveKerberos

## Suite Summary

- Purpose: JUnit suite for HiveKerberos coverage.
- Owning lane: `hive`
- Current suite class: `testing/trino-product-tests/src/test/java/io/trino/tests/product/suite/SuiteHiveKerberos.java`
- CI bucket: `bucket-5`

## Environment Runs

### Run 1

- Run name: `default`
- Environment: `HiveKerberosEnvironment`
- Include tags: `HiveKerberos`.
- Exclude tags: none.
- Expected mapped classes covered: `TestHiveConnectorKerberosSmokeTest`.
- Expected mapped methods covered: `1` method(s).

## CI Wiring

- `pt-junit` bucket in `.github/workflows/ci.yml`: `bucket-5`
- Special secret/credential gate: None.
- Legacy launcher suite removed: `No dedicated legacy launcher suite identified`

## Parity Checklist

- Legacy suite or lane source: `hive` lane and the corresponding legacy launcher coverage.
- Current suite class: `SuiteHiveKerberos`
- Explicit runs and environments: verified from current suite source.
- Include tags: verified from current suite source.
- Exclude tags: verified from current suite source.
- Expected migrated class count: `1`
- Expected migrated method count: `1`
- Expected migrated classes covered: `TestHiveConnectorKerberosSmokeTest`.
- Expected migrated methods covered: `TestHiveConnectorKerberosSmokeTest.kerberosTicketExpiryTest`.
- Parity status: `verified`
