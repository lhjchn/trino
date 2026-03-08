# Suite Audit: SuiteJdbcKerberos

## Suite Summary

- Purpose: JUnit suite for JdbcKerberos coverage.
- Owning lane: `jdbc-kerberos`
- Current suite class: `testing/trino-product-tests/src/test/java/io/trino/tests/product/suite/SuiteJdbcKerberos.java`
- CI bucket: `bucket-3`

## Environment Runs

### Run 1

- Run name: `default`
- Environment: `JdbcKerberosEnvironment`
- Include tags: `JdbcKerberosConstrainedDelegation`.
- Exclude tags: none.
- Expected mapped classes covered: `TestKerberosConstrainedDelegationJdbc`.
- Expected mapped methods covered: `4` method(s).

## CI Wiring

- `pt-junit` bucket in `.github/workflows/ci.yml`: `bucket-3`
- Special secret/credential gate: None.
- Legacy launcher suite removed: `No dedicated legacy launcher suite identified`

## Parity Checklist

- Legacy suite or lane source: `jdbc-kerberos` lane and the corresponding legacy launcher coverage.
- Current suite class: `SuiteJdbcKerberos`
- Explicit runs and environments: verified from current suite source.
- Include tags: verified from current suite source.
- Exclude tags: verified from current suite source.
- Expected migrated class count: `1`
- Expected migrated method count: `4`
- Expected migrated classes covered: `TestKerberosConstrainedDelegationJdbc`.
- Expected migrated methods covered: `TestKerberosConstrainedDelegationJdbc.testCtasConstrainedDelegationKerberos`,
  `TestKerberosConstrainedDelegationJdbc.testQueryOnDisposedCredential`,
  `TestKerberosConstrainedDelegationJdbc.testQueryOnExpiredCredential`,
  `TestKerberosConstrainedDelegationJdbc.testSelectConstrainedDelegationKerberos`.
- Parity status: `verified`
