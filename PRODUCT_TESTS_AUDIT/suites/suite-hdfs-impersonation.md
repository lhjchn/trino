# Suite Audit: SuiteHdfsImpersonation

## Suite Summary

- Purpose: JUnit suite for HdfsImpersonation coverage.
- Owning lane: `hive`
- Current suite class:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/suite/SuiteHdfsImpersonation.java`
- CI bucket: `bucket-5`

## Environment Runs

### Run 1

- Run name: `default`
- Environment: `HiveImpersonationEnvironment`
- Include tags: `HdfsImpersonation`.
- Exclude tags: none.
- Expected mapped classes covered: none from the audited product-test classes.
- Expected mapped methods covered: `0` method(s).

### Run 2

- Run name: `default`
- Environment: `HiveKerberosImpersonationEnvironment`
- Include tags: `HdfsImpersonation`.
- Exclude tags: none.
- Expected mapped classes covered: none from the audited product-test classes.
- Expected mapped methods covered: `0` method(s).

### Run 3

- Run name: `default`
- Environment: `HiveKerberosImpersonationCredentialCacheEnvironment`
- Include tags: `HdfsImpersonation`.
- Exclude tags: none.
- Expected mapped classes covered: none from the audited product-test classes.
- Expected mapped methods covered: `0` method(s).

## CI Wiring

- `pt-junit` bucket in `.github/workflows/ci.yml`: `bucket-5`
- Special secret/credential gate: None.
- Legacy launcher suite removed: `No dedicated legacy launcher suite identified`

## Parity Checklist

- Legacy suite or lane source: `hive` lane and the corresponding legacy launcher coverage.
- Current suite class: `SuiteHdfsImpersonation`
- Explicit runs and environments: verified from current suite source.
- Include tags: verified from current suite source.
- Exclude tags: verified from current suite source.
- Expected migrated class count: `0`
- Expected migrated method count: `0`
- Expected migrated classes covered: none.
- Expected migrated methods covered: none.
- Parity status: `verified`
