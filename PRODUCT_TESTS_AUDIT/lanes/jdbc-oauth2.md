# Lane Audit: Jdbc Oauth2

## Lane Summary

- Audit status: `completed`
- Section start commit: `Add JDBC OAuth2 environments`
- Section end commit: `Remove legacy SuiteOauth2`
- Introduced JUnit suites: `SuiteOauth2`.
- Extended existing suites: none.
- Retired legacy suites: `SuiteOauth2`.
- Environment classes introduced: `JdbcOAuth2Environment`.
- Method status counts: verified `5`, intentional difference `0`, needs follow-up `0`.

## Lane-Level Open Questions / Intentional Differences

- Lane-wide approved difference set: none beyond the framework baseline documented in the reviewer guide.
- Needs-follow-up methods: none currently identified in this source/history pass.

## Ported Test Classes

### `TestExternalAuthorizerOAuth2`

- Owning migration commit: `Migrate TestExternalAuthorizerOAuth2 to JUnit`
- Current class added in same migration commit:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/jdbc/TestExternalAuthorizerOAuth2.java`
- Legacy class removed in same migration commit:
    - `testing/trino-product-tests/src/main/java/io/trino/tests/product/jdbc/TestExternalAuthorizerOAuth2.java`
- Class-level environment requirement: `JdbcOAuth2BasicEnvironment`.
- Class-level tags: `Oauth2`, `ProfileSpecificTests`.
- Method inventory complete: Yes. Legacy methods: `2`. Current methods: `2`.
- Legacy helper/resource dependencies accounted for: Legacy class source reviewed directly.
- Intentional differences summary: None identified at class scope.
- Method statuses present: `verified`.

#### Methods

##### `shouldAuthenticateAndExecuteQuery`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/jdbc/TestExternalAuthorizerOAuth2.java` ->
  `shouldAuthenticateAndExecuteQuery`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/jdbc/TestExternalAuthorizerOAuth2.java` ->
  `TestExternalAuthorizerOAuth2.shouldAuthenticateAndExecuteQuery`
- Mapping type: `direct`
- Environment parity: Current class requires `JdbcOAuth2BasicEnvironment`. Routed by source review into `SuiteOauth2`
  run 1.
- Tag parity: Current tags: `Oauth2`, `ProfileSpecificTests`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: none. Legacy setup operations: none.
- Action parity: Current action verbs: `SELECT`. Legacy action verbs: `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `containsOnly`. Legacy assertion helpers: `assertThat`.
- Cleanup parity: Current cleanup operations: none. No legacy cleanup method body was available.
- Any observed difference, however small: Assertion helper names differ between legacy and current implementations.
- Known intentional difference: None.
- Reviewer note: Matched by current suite selection: `SuiteOauth2` run 1 Exact-name mapping with normalized body
  similarity `0.71`.
- Audit status: `verified`

##### `shouldAuthenticateAfterTokenExpires`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/jdbc/TestExternalAuthorizerOAuth2.java` ->
  `shouldAuthenticateAfterTokenExpires`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/jdbc/TestExternalAuthorizerOAuth2.java` ->
  `TestExternalAuthorizerOAuth2.shouldAuthenticateAfterTokenExpires`
- Mapping type: `direct`
- Environment parity: Current class requires `JdbcOAuth2BasicEnvironment`. Routed by source review into `SuiteOauth2`
  run 1.
- Tag parity: Current tags: `Oauth2`, `ProfileSpecificTests`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: none. Legacy setup operations: none.
- Action parity: Current action verbs: `SELECT`. Legacy action verbs: `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `containsOnly`. Legacy assertion helpers: `assertThat`.
- Cleanup parity: Current cleanup operations: none. No legacy cleanup method body was available.
- Any observed difference, however small: Assertion helper names differ between legacy and current implementations.
- Known intentional difference: None.
- Reviewer note: Matched by current suite selection: `SuiteOauth2` run 1 Exact-name mapping with normalized body
  similarity `0.74`.
- Audit status: `verified`

### `TestExternalAuthorizerOAuth2RefreshToken`

- Owning migration commit: `Migrate TestExternalAuthorizerOAuth2RefreshToken to JUnit`
- Current class added in same migration commit:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/jdbc/TestExternalAuthorizerOAuth2RefreshToken.java`
- Legacy class removed in same migration commit:
  -
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/jdbc/TestExternalAuthorizerOAuth2RefreshToken.java`
- Class-level environment requirement: `JdbcOAuth2RefreshEnvironment`.
- Class-level tags: `Oauth2Refresh`, `ProfileSpecificTests`.
- Method inventory complete: Yes. Legacy methods: `3`. Current methods: `3`.
- Legacy helper/resource dependencies accounted for: Legacy class source reviewed directly.
- Intentional differences summary: None identified at class scope.
- Method statuses present: `verified`.

#### Methods

##### `shouldRefreshTokenAfterTokenExpire`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/jdbc/TestExternalAuthorizerOAuth2RefreshToken.java` ->
  `shouldRefreshTokenAfterTokenExpire`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/jdbc/TestExternalAuthorizerOAuth2RefreshToken.java` ->
  `TestExternalAuthorizerOAuth2RefreshToken.shouldRefreshTokenAfterTokenExpire`
- Mapping type: `direct`
- Environment parity: Current class requires `JdbcOAuth2RefreshEnvironment`. Routed by source review into `SuiteOauth2`
  run 2.
- Tag parity: Current tags: `Oauth2Refresh`, `ProfileSpecificTests`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: none. Legacy setup operations: none.
- Action parity: Current action verbs: `SELECT`. Legacy action verbs: `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `containsOnly`, `isEqualTo`. Legacy assertion helpers:
  `assertThat`, `isEqualTo`.
- Cleanup parity: Current cleanup operations: none. No legacy cleanup method body was available.
- Any observed difference, however small: Assertion helper names differ between legacy and current implementations.
- Known intentional difference: None.
- Reviewer note: Matched by current suite selection: `SuiteOauth2` run 2 Exact-name mapping with normalized body
  similarity `0.81`.
- Audit status: `verified`

##### `shouldAuthenticateAfterRefreshTokenExpires`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/jdbc/TestExternalAuthorizerOAuth2RefreshToken.java` ->
  `shouldAuthenticateAfterRefreshTokenExpires`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/jdbc/TestExternalAuthorizerOAuth2RefreshToken.java` ->
  `TestExternalAuthorizerOAuth2RefreshToken.shouldAuthenticateAfterRefreshTokenExpires`
- Mapping type: `direct`
- Environment parity: Current class requires `JdbcOAuth2RefreshEnvironment`. Routed by source review into `SuiteOauth2`
  run 2.
- Tag parity: Current tags: `Oauth2Refresh`, `ProfileSpecificTests`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: none. Legacy setup operations: none.
- Action parity: Current action verbs: `SELECT`. Legacy action verbs: `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `containsOnly`, `isEqualTo`. Legacy assertion helpers:
  `assertThat`, `isEqualTo`.
- Cleanup parity: Current cleanup operations: none. No legacy cleanup method body was available.
- Any observed difference, however small: Assertion helper names differ between legacy and current implementations.
- Known intentional difference: None.
- Reviewer note: Matched by current suite selection: `SuiteOauth2` run 2 Exact-name mapping with normalized body
  similarity `0.81`.
- Audit status: `verified`

##### `shouldAuthenticateAfterIssuedTokenExpires`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/jdbc/TestExternalAuthorizerOAuth2RefreshToken.java` ->
  `shouldAuthenticateAfterIssuedTokenExpires`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/jdbc/TestExternalAuthorizerOAuth2RefreshToken.java` ->
  `TestExternalAuthorizerOAuth2RefreshToken.shouldAuthenticateAfterIssuedTokenExpires`
- Mapping type: `direct`
- Environment parity: Current class requires `JdbcOAuth2RefreshEnvironment`. Routed by source review into `SuiteOauth2`
  run 2.
- Tag parity: Current tags: `Oauth2Refresh`, `ProfileSpecificTests`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: none. Legacy setup operations: none.
- Action parity: Current action verbs: `SELECT`. Legacy action verbs: `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `containsOnly`, `isEqualTo`. Legacy assertion helpers:
  `assertThat`, `isEqualTo`.
- Cleanup parity: Current cleanup operations: none. No legacy cleanup method body was available.
- Any observed difference, however small: Assertion helper names differ between legacy and current implementations.
- Known intentional difference: None.
- Reviewer note: Matched by current suite selection: `SuiteOauth2` run 2 Exact-name mapping with normalized body
  similarity `0.81`.
- Audit status: `verified`
