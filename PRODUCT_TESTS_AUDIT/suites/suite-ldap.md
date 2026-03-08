# Suite Audit: SuiteLdap

## Suite Summary

- Purpose: JUnit suite for Ldap coverage.
- Owning lane: `ldap`
- Current suite class: `testing/trino-product-tests/src/test/java/io/trino/tests/product/suite/SuiteLdap.java`
- CI bucket: `bucket-3`

## Environment Runs

### Run 1

- Run name: `default`
- Environment: `LdapBasicEnvironment`
- Include tags: `Ldap`.
- Exclude tags: none.
- Expected mapped classes covered: `TestTrinoLdapCli`, `TestLdapTrinoJdbc`.
- Expected mapped methods covered: `30` method(s).

### Run 2

- Run name: `default`
- Environment: `LdapAndFileEnvironment`
- Include tags: `LdapAndFile`.
- Exclude tags: none.
- Expected mapped classes covered: `TestLdapAndFileCli`, `TestLdapAndFileTrinoJdbc`.
- Expected mapped methods covered: `8` method(s).

## CI Wiring

- `pt-junit` bucket in `.github/workflows/ci.yml`: `bucket-3`
- Special secret/credential gate: None.
- Legacy launcher suite removed: `Remove legacy SuiteLdap`

## Parity Checklist

- Legacy suite or lane source: `ldap` lane and the corresponding legacy launcher coverage.
- Current suite class: `SuiteLdap`
- Explicit runs and environments: verified from current suite source.
- Include tags: verified from current suite source.
- Exclude tags: verified from current suite source.
- Expected migrated class count: `4`
- Expected migrated method count: `38`
- Expected migrated classes covered: `TestLdapAndFileCli`, `TestLdapAndFileTrinoJdbc`, `TestLdapTrinoJdbc`,
  `TestTrinoLdapCli`.
- Expected migrated methods covered: `TestLdapAndFileCli.shouldRunQueryForAnotherUserWithOnlyFileAuthenticator`,
  `TestLdapAndFileCli.shouldRunQueryForFileOnlyUser`, `TestLdapAndFileCli.shouldRunQueryWithFileAuthenticator`,
  `TestLdapAndFileCli.shouldRunQueryWithLdapAuthenticator`,
  `TestLdapAndFileTrinoJdbc.shouldRunQueryForAnotherUserWithOnlyFileAuthenticator`,
  `TestLdapAndFileTrinoJdbc.shouldRunQueryForFileOnlyUser`,
  `TestLdapAndFileTrinoJdbc.shouldRunQueryWithFileAuthenticator`,
  `TestLdapAndFileTrinoJdbc.shouldRunQueryWithLdapAuthenticator`, `TestLdapTrinoJdbc.shouldFailForIncorrectTrustStore`,
  `TestLdapTrinoJdbc.shouldFailForUserWithColon`, `TestLdapTrinoJdbc.shouldFailQueryForEmptyUser`,
  `TestLdapTrinoJdbc.shouldFailQueryForFailedBind`, `TestLdapTrinoJdbc.shouldFailQueryForLdapUserInChildGroup`,
  `TestLdapTrinoJdbc.shouldFailQueryForLdapUserInParentGroup`,
  `TestLdapTrinoJdbc.shouldFailQueryForLdapWithoutPassword`, `TestLdapTrinoJdbc.shouldFailQueryForLdapWithoutSsl`,
  `TestLdapTrinoJdbc.shouldFailQueryForOrphanLdapUser`, `TestLdapTrinoJdbc.shouldFailQueryForWrongLdapPassword`,
  `TestLdapTrinoJdbc.shouldFailQueryForWrongLdapUser`, `TestLdapTrinoJdbc.shouldRunQueryWithAlternativeBind`,
  `TestLdapTrinoJdbc.shouldRunQueryWithLdap`, `TestTrinoLdapCli.shouldFailForIncorrectTrustStore`,
  `TestTrinoLdapCli.shouldFailForUserWithColon`, `TestTrinoLdapCli.shouldFailQueryForEmptyUser`,
  `TestTrinoLdapCli.shouldFailQueryForFailedBind`, `TestTrinoLdapCli.shouldFailQueryForLdapUserInChildGroup`,
  `TestTrinoLdapCli.shouldFailQueryForLdapUserInParentGroup`, `TestTrinoLdapCli.shouldFailQueryForLdapWithoutHttps`,
  `TestTrinoLdapCli.shouldFailQueryForLdapWithoutPassword`, `TestTrinoLdapCli.shouldFailQueryForOrphanLdapUser` ....
- Parity status: `verified`
