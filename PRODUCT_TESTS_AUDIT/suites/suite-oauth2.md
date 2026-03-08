# Suite Audit: SuiteOauth2

## Suite Summary

- Purpose: JUnit suite for Oauth2 coverage.
- Owning lane: `jdbc-oauth2`
- Current suite class: `testing/trino-product-tests/src/test/java/io/trino/tests/product/suite/SuiteOauth2.java`
- CI bucket: `bucket-3`

## Environment Runs

### Run 1

- Run name: `default`
- Environment: `JdbcOAuth2BasicEnvironment`
- Include tags: `Oauth2`.
- Exclude tags: none.
- Expected mapped classes covered: `TestExternalAuthorizerOAuth2`.
- Expected mapped methods covered: `2` method(s).

### Run 2

- Run name: `default`
- Environment: `JdbcOAuth2RefreshEnvironment`
- Include tags: `Oauth2Refresh`.
- Exclude tags: none.
- Expected mapped classes covered: `TestExternalAuthorizerOAuth2RefreshToken`.
- Expected mapped methods covered: `3` method(s).

## CI Wiring

- `pt-junit` bucket in `.github/workflows/ci.yml`: `bucket-3`
- Special secret/credential gate: None.
- Legacy launcher suite removed: `Remove legacy SuiteOauth2`

## Parity Checklist

- Legacy suite or lane source: `jdbc-oauth2` lane and the corresponding legacy launcher coverage.
- Current suite class: `SuiteOauth2`
- Explicit runs and environments: verified from current suite source.
- Include tags: verified from current suite source.
- Exclude tags: verified from current suite source.
- Expected migrated class count: `2`
- Expected migrated method count: `5`
- Expected migrated classes covered: `TestExternalAuthorizerOAuth2`, `TestExternalAuthorizerOAuth2RefreshToken`.
- Expected migrated methods covered: `TestExternalAuthorizerOAuth2.shouldAuthenticateAfterTokenExpires`,
  `TestExternalAuthorizerOAuth2.shouldAuthenticateAndExecuteQuery`,
  `TestExternalAuthorizerOAuth2RefreshToken.shouldAuthenticateAfterIssuedTokenExpires`,
  `TestExternalAuthorizerOAuth2RefreshToken.shouldAuthenticateAfterRefreshTokenExpires`,
  `TestExternalAuthorizerOAuth2RefreshToken.shouldRefreshTokenAfterTokenExpire`.
- Parity status: `verified`
