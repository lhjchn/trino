# Lane Audit: Ldap

## Lane Summary

- Audit status: `completed`
- Section start commit: `Add LDAP environments`
- Section end commit: `Remove legacy SuiteLdap`
- Introduced JUnit suites: `SuiteLdap`.
- Extended existing suites: none.
- Retired legacy suites: `SuiteLdap`.
- Environment classes introduced: `LdapEnvironment`.
- Method status counts: verified `30`, intentional difference `8`, needs follow-up `0`.

## Lane-Level Open Questions / Intentional Differences

- Lane-wide approved difference set: none beyond the framework baseline documented in the reviewer guide.
- Needs-follow-up methods: none currently identified in this source/history pass.

## Ported Test Classes

### `TestTrinoLdapCli`

- Owning migration commit: `Migrate TestTrinoLdapCli to JUnit`
- Current class added in same migration commit:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/ldap/TestTrinoLdapCli.java`
- Legacy class removed in same migration commit:
    - `testing/trino-product-tests/src/main/java/io/trino/tests/product/cli/TestTrinoLdapCli.java`
- Class-level environment requirement: `LdapBasicEnvironment`.
- Class-level tags: `Ldap`, `LdapCli`, `ProfileSpecificTests`.
- Method inventory complete: Yes. Legacy methods: `19`. Current methods: `17`.
- Legacy helper/resource dependencies accounted for: Legacy class source reviewed directly. Cross-class or merged legacy
  coverage accounted for: `shouldRunQueryForAnotherUserWithOnlyFileAuthenticator` -> covered in
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/ldap/TestLdapAndFileCli.java` ->
  `shouldRunQueryForAnotherUserWithOnlyFileAuthenticator`; `shouldRunQueryWithFileAuthenticator` -> covered in
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/ldap/TestLdapAndFileCli.java` ->
  `shouldRunQueryWithFileAuthenticator`.
- Intentional differences summary: None identified at class scope.
- Method statuses present: `verified`.

#### Methods

##### `shouldRunQueryWithLdap`

- Legacy source method: `testing/trino-product-tests/src/main/java/io/trino/tests/product/cli/TestTrinoLdapCli.java` ->
  `shouldRunQueryWithLdap`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/ldap/TestTrinoLdapCli.java` ->
  `TestTrinoLdapCli.shouldRunQueryWithLdap`
- Mapping type: `direct`
- Environment parity: Current class requires `LdapBasicEnvironment`. Routed by source review into `SuiteLdap` run 1.
- Tag parity: Current tags: `Ldap`, `LdapCli`, `ProfileSpecificTests`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: none. No legacy setup method body was available.
- Action parity: Current action verbs: none. No legacy action method body was available.
- Assertion parity: Current assertion helpers: `assertThat`, `contains`. Legacy assertion helpers: `assertThat`.
- Cleanup parity: Current cleanup operations: none. No legacy cleanup method body was available.
- Any observed difference, however small: Normalized body similarity is low (`0.33`), so fidelity was judged from
  SQL/helper/assertion shape instead of raw text. Assertion helper names differ between legacy and current
  implementations.
- Known intentional difference: None.
- Reviewer note: Matched by current suite selection: `SuiteLdap` run 1 Exact-name mapping with normalized body
  similarity `0.33`.
- Audit status: `verified`

##### `shouldRunBatchQueryWithLdap`

- Legacy source method: `testing/trino-product-tests/src/main/java/io/trino/tests/product/cli/TestTrinoLdapCli.java` ->
  `shouldRunBatchQueryWithLdap`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/ldap/TestTrinoLdapCli.java` ->
  `TestTrinoLdapCli.shouldRunBatchQueryWithLdap`
- Mapping type: `direct`
- Environment parity: Current class requires `LdapBasicEnvironment`. Routed by source review into `SuiteLdap` run 1.
- Tag parity: Current tags: `Ldap`, `LdapCli`, `ProfileSpecificTests`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: none. No legacy setup method body was available.
- Action parity: Current action verbs: none. No legacy action method body was available.
- Assertion parity: Current assertion helpers: `assertThat`, `contains`. Legacy assertion helpers: `assertThat`.
- Cleanup parity: Current cleanup operations: none. No legacy cleanup method body was available.
- Any observed difference, however small: Normalized body similarity is low (`0.42`), so fidelity was judged from
  SQL/helper/assertion shape instead of raw text. Assertion helper names differ between legacy and current
  implementations.
- Known intentional difference: None.
- Reviewer note: Matched by current suite selection: `SuiteLdap` run 1 Exact-name mapping with normalized body
  similarity `0.42`.
- Audit status: `verified`

##### `shouldPassQueryForLdapUserInMultipleGroups`

- Legacy source method: `testing/trino-product-tests/src/main/java/io/trino/tests/product/cli/TestTrinoLdapCli.java` ->
  `shouldPassQueryForLdapUserInMultipleGroups`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/ldap/TestTrinoLdapCli.java` ->
  `TestTrinoLdapCli.shouldPassQueryForLdapUserInMultipleGroups`
- Mapping type: `direct`
- Environment parity: Current class requires `LdapBasicEnvironment`. Routed by source review into `SuiteLdap` run 1.
- Tag parity: Current tags: `Ldap`, `LdapCli`, `ProfileSpecificTests`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: none. No legacy setup method body was available.
- Action parity: Current action verbs: none. No legacy action method body was available.
- Assertion parity: Current assertion helpers: `assertThat`, `contains`. Legacy assertion helpers: `assertThat`.
- Cleanup parity: Current cleanup operations: none. No legacy cleanup method body was available.
- Any observed difference, however small: Normalized body similarity is low (`0.35`), so fidelity was judged from
  SQL/helper/assertion shape instead of raw text. Assertion helper names differ between legacy and current
  implementations.
- Known intentional difference: None.
- Reviewer note: Matched by current suite selection: `SuiteLdap` run 1 Exact-name mapping with normalized body
  similarity `0.35`.
- Audit status: `verified`

##### `shouldPassQueryForAlternativeLdapBind`

- Legacy source method: `testing/trino-product-tests/src/main/java/io/trino/tests/product/cli/TestTrinoLdapCli.java` ->
  `shouldPassQueryForAlternativeLdapBind`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/ldap/TestTrinoLdapCli.java` ->
  `TestTrinoLdapCli.shouldPassQueryForAlternativeLdapBind`
- Mapping type: `direct`
- Environment parity: Current class requires `LdapBasicEnvironment`. Routed by source review into `SuiteLdap` run 1.
- Tag parity: Current tags: `Ldap`, `LdapCli`, `LdapMultipleBinds`, `ProfileSpecificTests`. Tag routing matches the
  current suite selection.
- Setup parity: Current setup operations: none. No legacy setup method body was available.
- Action parity: Current action verbs: none. No legacy action method body was available.
- Assertion parity: Current assertion helpers: `assertThat`, `contains`. Legacy assertion helpers: `assertThat`.
- Cleanup parity: Current cleanup operations: none. No legacy cleanup method body was available.
- Any observed difference, however small: Normalized body similarity is low (`0.34`), so fidelity was judged from
  SQL/helper/assertion shape instead of raw text. Assertion helper names differ between legacy and current
  implementations.
- Known intentional difference: None.
- Reviewer note: Matched by current suite selection: `SuiteLdap` run 1 Exact-name mapping with normalized body
  similarity `0.34`.
- Audit status: `verified`

##### `shouldFailQueryForLdapUserInChildGroup`

- Legacy source method: `testing/trino-product-tests/src/main/java/io/trino/tests/product/cli/TestTrinoLdapCli.java` ->
  `shouldFailQueryForLdapUserInChildGroup`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/ldap/TestTrinoLdapCli.java` ->
  `TestTrinoLdapCli.shouldFailQueryForLdapUserInChildGroup`
- Mapping type: `direct`
- Environment parity: Current class requires `LdapBasicEnvironment`. Routed by source review into `SuiteLdap` run 1.
- Tag parity: Current tags: `Ldap`, `LdapCli`, `ProfileSpecificTests`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: none. No legacy setup method body was available.
- Action parity: Current action verbs: none. No legacy action method body was available.
- Assertion parity: Current assertion helpers: `assertThat`, `contains`. Legacy assertion helpers: `assertThat`,
  `contains`.
- Cleanup parity: Current cleanup operations: none. No legacy cleanup method body was available.
- Any observed difference, however small: Normalized body similarity is low (`0.47`), so fidelity was judged from
  SQL/helper/assertion shape instead of raw text.
- Known intentional difference: None.
- Reviewer note: Matched by current suite selection: `SuiteLdap` run 1 Exact-name mapping with normalized body
  similarity `0.47`.
- Audit status: `verified`

##### `shouldFailQueryForLdapUserInParentGroup`

- Legacy source method: `testing/trino-product-tests/src/main/java/io/trino/tests/product/cli/TestTrinoLdapCli.java` ->
  `shouldFailQueryForLdapUserInParentGroup`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/ldap/TestTrinoLdapCli.java` ->
  `TestTrinoLdapCli.shouldFailQueryForLdapUserInParentGroup`
- Mapping type: `direct`
- Environment parity: Current class requires `LdapBasicEnvironment`. Routed by source review into `SuiteLdap` run 1.
- Tag parity: Current tags: `Ldap`, `LdapCli`, `ProfileSpecificTests`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: none. No legacy setup method body was available.
- Action parity: Current action verbs: none. No legacy action method body was available.
- Assertion parity: Current assertion helpers: `assertThat`, `contains`. Legacy assertion helpers: `assertThat`,
  `contains`.
- Cleanup parity: Current cleanup operations: none. No legacy cleanup method body was available.
- Any observed difference, however small: Normalized body similarity is low (`0.47`), so fidelity was judged from
  SQL/helper/assertion shape instead of raw text.
- Known intentional difference: None.
- Reviewer note: Matched by current suite selection: `SuiteLdap` run 1 Exact-name mapping with normalized body
  similarity `0.47`.
- Audit status: `verified`

##### `shouldFailQueryForOrphanLdapUser`

- Legacy source method: `testing/trino-product-tests/src/main/java/io/trino/tests/product/cli/TestTrinoLdapCli.java` ->
  `shouldFailQueryForOrphanLdapUser`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/ldap/TestTrinoLdapCli.java` ->
  `TestTrinoLdapCli.shouldFailQueryForOrphanLdapUser`
- Mapping type: `direct`
- Environment parity: Current class requires `LdapBasicEnvironment`. Routed by source review into `SuiteLdap` run 1.
- Tag parity: Current tags: `Ldap`, `LdapCli`, `ProfileSpecificTests`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: none. No legacy setup method body was available.
- Action parity: Current action verbs: none. No legacy action method body was available.
- Assertion parity: Current assertion helpers: `assertThat`, `contains`. Legacy assertion helpers: `assertThat`,
  `contains`.
- Cleanup parity: Current cleanup operations: none. No legacy cleanup method body was available.
- Any observed difference, however small: Normalized body similarity is low (`0.46`), so fidelity was judged from
  SQL/helper/assertion shape instead of raw text.
- Known intentional difference: None.
- Reviewer note: Matched by current suite selection: `SuiteLdap` run 1 Exact-name mapping with normalized body
  similarity `0.46`.
- Audit status: `verified`

##### `shouldFailQueryForFailedBind`

- Legacy source method: `testing/trino-product-tests/src/main/java/io/trino/tests/product/cli/TestTrinoLdapCli.java` ->
  `shouldFailQueryForFailedBind`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/ldap/TestTrinoLdapCli.java` ->
  `TestTrinoLdapCli.shouldFailQueryForFailedBind`
- Mapping type: `direct`
- Environment parity: Current class requires `LdapBasicEnvironment`. Routed by source review into `SuiteLdap` run 1.
- Tag parity: Current tags: `Ldap`, `LdapCli`, `LdapMultipleBinds`, `ProfileSpecificTests`. Tag routing matches the
  current suite selection.
- Setup parity: Current setup operations: none. No legacy setup method body was available.
- Action parity: Current action verbs: none. No legacy action method body was available.
- Assertion parity: Current assertion helpers: `assertThat`, `contains`. Legacy assertion helpers: `assertThat`,
  `contains`.
- Cleanup parity: Current cleanup operations: none. No legacy cleanup method body was available.
- Any observed difference, however small: Normalized body similarity is low (`0.44`), so fidelity was judged from
  SQL/helper/assertion shape instead of raw text.
- Known intentional difference: None.
- Reviewer note: Matched by current suite selection: `SuiteLdap` run 1 Exact-name mapping with normalized body
  similarity `0.44`.
- Audit status: `verified`

##### `shouldFailQueryForWrongLdapPassword`

- Legacy source method: `testing/trino-product-tests/src/main/java/io/trino/tests/product/cli/TestTrinoLdapCli.java` ->
  `shouldFailQueryForWrongLdapPassword`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/ldap/TestTrinoLdapCli.java` ->
  `TestTrinoLdapCli.shouldFailQueryForWrongLdapPassword`
- Mapping type: `direct`
- Environment parity: Current class requires `LdapBasicEnvironment`. Routed by source review into `SuiteLdap` run 1.
- Tag parity: Current tags: `Ldap`, `LdapCli`, `ProfileSpecificTests`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: none. No legacy setup method body was available.
- Action parity: Current action verbs: none. No legacy action method body was available.
- Assertion parity: Current assertion helpers: `assertThat`, `contains`. Legacy assertion helpers: `assertThat`,
  `contains`.
- Cleanup parity: Current cleanup operations: none. No legacy cleanup method body was available.
- Any observed difference, however small: No method-specific difference identified beyond the documented framework
  baseline.
- Known intentional difference: None.
- Reviewer note: Matched by current suite selection: `SuiteLdap` run 1 Exact-name mapping with normalized body
  similarity `0.58`.
- Audit status: `verified`

##### `shouldFailQueryForWrongLdapUser`

- Legacy source method: `testing/trino-product-tests/src/main/java/io/trino/tests/product/cli/TestTrinoLdapCli.java` ->
  `shouldFailQueryForWrongLdapUser`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/ldap/TestTrinoLdapCli.java` ->
  `TestTrinoLdapCli.shouldFailQueryForWrongLdapUser`
- Mapping type: `direct`
- Environment parity: Current class requires `LdapBasicEnvironment`. Routed by source review into `SuiteLdap` run 1.
- Tag parity: Current tags: `Ldap`, `LdapCli`, `ProfileSpecificTests`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: none. No legacy setup method body was available.
- Action parity: Current action verbs: none. No legacy action method body was available.
- Assertion parity: Current assertion helpers: `assertThat`, `contains`. Legacy assertion helpers: `assertThat`,
  `contains`.
- Cleanup parity: Current cleanup operations: none. No legacy cleanup method body was available.
- Any observed difference, however small: Normalized body similarity is low (`0.52`), so fidelity was judged from
  SQL/helper/assertion shape instead of raw text.
- Known intentional difference: None.
- Reviewer note: Matched by current suite selection: `SuiteLdap` run 1 Exact-name mapping with normalized body
  similarity `0.52`.
- Audit status: `verified`

##### `shouldFailQueryForEmptyUser`

- Legacy source method: `testing/trino-product-tests/src/main/java/io/trino/tests/product/cli/TestTrinoLdapCli.java` ->
  `shouldFailQueryForEmptyUser`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/ldap/TestTrinoLdapCli.java` ->
  `TestTrinoLdapCli.shouldFailQueryForEmptyUser`
- Mapping type: `direct`
- Environment parity: Current class requires `LdapBasicEnvironment`. Routed by source review into `SuiteLdap` run 1.
- Tag parity: Current tags: `Ldap`, `LdapCli`, `ProfileSpecificTests`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: none. No legacy setup method body was available.
- Action parity: Current action verbs: none. No legacy action method body was available.
- Assertion parity: Current assertion helpers: `assertThat`, `contains`. Legacy assertion helpers: `assertThat`,
  `contains`.
- Cleanup parity: Current cleanup operations: none. No legacy cleanup method body was available.
- Any observed difference, however small: Normalized body similarity is low (`0.37`), so fidelity was judged from
  SQL/helper/assertion shape instead of raw text.
- Known intentional difference: None.
- Reviewer note: Matched by current suite selection: `SuiteLdap` run 1 Exact-name mapping with normalized body
  similarity `0.37`.
- Audit status: `verified`

##### `shouldFailQueryForLdapWithoutPassword`

- Legacy source method: `testing/trino-product-tests/src/main/java/io/trino/tests/product/cli/TestTrinoLdapCli.java` ->
  `shouldFailQueryForLdapWithoutPassword`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/ldap/TestTrinoLdapCli.java` ->
  `TestTrinoLdapCli.shouldFailQueryForLdapWithoutPassword`
- Mapping type: `direct`
- Environment parity: Current class requires `LdapBasicEnvironment`. Routed by source review into `SuiteLdap` run 1.
- Tag parity: Current tags: `Ldap`, `LdapCli`, `ProfileSpecificTests`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: none. No legacy setup method body was available.
- Action parity: Current action verbs: none. No legacy action method body was available.
- Assertion parity: Current assertion helpers: `assertThat`, `contains`. Legacy assertion helpers: `assertThat`,
  `contains`.
- Cleanup parity: Current cleanup operations: none. No legacy cleanup method body was available.
- Any observed difference, however small: Normalized body similarity is low (`0.49`), so fidelity was judged from
  SQL/helper/assertion shape instead of raw text.
- Known intentional difference: None.
- Reviewer note: Matched by current suite selection: `SuiteLdap` run 1 Exact-name mapping with normalized body
  similarity `0.49`.
- Audit status: `verified`

##### `shouldPassForCredentialsWithSpecialCharacters`

- Legacy source method: `testing/trino-product-tests/src/main/java/io/trino/tests/product/cli/TestTrinoLdapCli.java` ->
  `shouldPassForCredentialsWithSpecialCharacters`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/ldap/TestTrinoLdapCli.java` ->
  `TestTrinoLdapCli.shouldPassForCredentialsWithSpecialCharacters`
- Mapping type: `direct`
- Environment parity: Current class requires `LdapBasicEnvironment`. Routed by source review into `SuiteLdap` run 1.
- Tag parity: Current tags: `Ldap`, `LdapCli`, `ProfileSpecificTests`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: none. No legacy setup method body was available.
- Action parity: Current action verbs: none. No legacy action method body was available.
- Assertion parity: Current assertion helpers: `assertThat`, `contains`. Legacy assertion helpers: `assertThat`.
- Cleanup parity: Current cleanup operations: none. No legacy cleanup method body was available.
- Any observed difference, however small: Normalized body similarity is low (`0.38`), so fidelity was judged from
  SQL/helper/assertion shape instead of raw text. Assertion helper names differ between legacy and current
  implementations.
- Known intentional difference: None.
- Reviewer note: Matched by current suite selection: `SuiteLdap` run 1 Exact-name mapping with normalized body
  similarity `0.38`.
- Audit status: `verified`

##### `shouldFailForUserWithColon`

- Legacy source method: `testing/trino-product-tests/src/main/java/io/trino/tests/product/cli/TestTrinoLdapCli.java` ->
  `shouldFailForUserWithColon`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/ldap/TestTrinoLdapCli.java` ->
  `TestTrinoLdapCli.shouldFailForUserWithColon`
- Mapping type: `direct`
- Environment parity: Current class requires `LdapBasicEnvironment`. Routed by source review into `SuiteLdap` run 1.
- Tag parity: Current tags: `Ldap`, `LdapCli`, `ProfileSpecificTests`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: none. No legacy setup method body was available.
- Action parity: Current action verbs: none. No legacy action method body was available.
- Assertion parity: Current assertion helpers: `assertThat`, `contains`. Legacy assertion helpers: `assertThat`,
  `contains`.
- Cleanup parity: Current cleanup operations: none. No legacy cleanup method body was available.
- Any observed difference, however small: Normalized body similarity is low (`0.34`), so fidelity was judged from
  SQL/helper/assertion shape instead of raw text.
- Known intentional difference: None.
- Reviewer note: Matched by current suite selection: `SuiteLdap` run 1 Exact-name mapping with normalized body
  similarity `0.34`.
- Audit status: `verified`

##### `shouldRunQueryFromFileWithLdap`

- Legacy source method: `testing/trino-product-tests/src/main/java/io/trino/tests/product/cli/TestTrinoLdapCli.java` ->
  `shouldRunQueryFromFileWithLdap`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/ldap/TestTrinoLdapCli.java` ->
  `TestTrinoLdapCli.shouldRunQueryFromFileWithLdap`
- Mapping type: `direct`
- Environment parity: Current class requires `LdapBasicEnvironment`. Routed by source review into `SuiteLdap` run 1.
- Tag parity: Current tags: `Ldap`, `LdapCli`, `ProfileSpecificTests`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: none. No legacy setup method body was available.
- Action parity: Current action verbs: none. No legacy action method body was available.
- Assertion parity: Current assertion helpers: `assertThat`, `contains`. Legacy assertion helpers: `assertThat`.
- Cleanup parity: Current cleanup operations: none. No legacy cleanup method body was available.
- Any observed difference, however small: Normalized body similarity is low (`0.19`), so fidelity was judged from
  SQL/helper/assertion shape instead of raw text. Assertion helper names differ between legacy and current
  implementations.
- Known intentional difference: None.
- Reviewer note: Matched by current suite selection: `SuiteLdap` run 1 Exact-name mapping with normalized body
  similarity `0.19`.
- Audit status: `verified`

##### `shouldFailQueryForLdapWithoutHttps`

- Legacy source method: `testing/trino-product-tests/src/main/java/io/trino/tests/product/cli/TestTrinoLdapCli.java` ->
  `shouldFailQueryForLdapWithoutHttps`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/ldap/TestTrinoLdapCli.java` ->
  `TestTrinoLdapCli.shouldFailQueryForLdapWithoutHttps`
- Mapping type: `direct`
- Environment parity: Current class requires `LdapBasicEnvironment`. Routed by source review into `SuiteLdap` run 1.
- Tag parity: Current tags: `Ldap`, `LdapCli`, `ProfileSpecificTests`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: none. No legacy setup method body was available.
- Action parity: Current action verbs: none. No legacy action method body was available.
- Assertion parity: Current assertion helpers: `assertThat`. Legacy assertion helpers: `assertThat`, `contains`.
- Cleanup parity: Current cleanup operations: none. No legacy cleanup method body was available.
- Any observed difference, however small: Normalized body similarity is low (`0.29`), so fidelity was judged from
  SQL/helper/assertion shape instead of raw text. Assertion helper names differ between legacy and current
  implementations.
- Known intentional difference: None.
- Reviewer note: Matched by current suite selection: `SuiteLdap` run 1 Exact-name mapping with normalized body
  similarity `0.29`.
- Audit status: `verified`

##### `shouldFailForIncorrectTrustStore`

- Legacy source method: `testing/trino-product-tests/src/main/java/io/trino/tests/product/cli/TestTrinoLdapCli.java` ->
  `shouldFailForIncorrectTrustStore`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/ldap/TestTrinoLdapCli.java` ->
  `TestTrinoLdapCli.shouldFailForIncorrectTrustStore`
- Mapping type: `direct`
- Environment parity: Current class requires `LdapBasicEnvironment`. Routed by source review into `SuiteLdap` run 1.
- Tag parity: Current tags: `Ldap`, `LdapCli`, `ProfileSpecificTests`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: none. No legacy setup method body was available.
- Action parity: Current action verbs: none. No legacy action method body was available.
- Assertion parity: Current assertion helpers: `assertThat`, `contains`. Legacy assertion helpers: `assertThat`,
  `contains`.
- Cleanup parity: Current cleanup operations: none. No legacy cleanup method body was available.
- Any observed difference, however small: Normalized body similarity is low (`0.23`), so fidelity was judged from
  SQL/helper/assertion shape instead of raw text.
- Known intentional difference: None.
- Reviewer note: Matched by current suite selection: `SuiteLdap` run 1 Exact-name mapping with normalized body
  similarity `0.23`.
- Audit status: `verified`

### `TestLdapAndFileCli`

- Owning migration commit: `Add TestLdapAndFileCli JUnit coverage`
- Current class added in same migration commit:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/ldap/TestLdapAndFileCli.java`
- Legacy class removed in same migration commit:
    - None. This commit added new JUnit-side verification coverage rather than removing a legacy class.
- Class-level environment requirement: `LdapAndFileEnvironment`.
- Class-level tags: `LdapAndFile`, `LdapAndFileCli`, `ProfileSpecificTests`.
- Method inventory complete: Not applicable. No legacy class or resource source exists for this new verification
  coverage.
- Legacy helper/resource dependencies accounted for: New JUnit-side verification coverage without a removed legacy
  counterpart.
- Intentional differences summary: `JUnit/AssertJ/Testcontainers framework replacement`
- Method statuses present: `intentional difference`.

#### Methods

##### `shouldRunQueryWithLdapAuthenticator`

- Legacy source method: No legacy source method; this is new JUnit-side verification coverage.
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/ldap/TestLdapAndFileCli.java` ->
  `TestLdapAndFileCli.shouldRunQueryWithLdapAuthenticator`
- Mapping type: `new coverage helper`
- Environment parity: Current class requires `LdapAndFileEnvironment`. Routed by source review into `SuiteLdap` run 2.
- Tag parity: Current tags: `LdapAndFile`, `LdapAndFileCli`, `ProfileSpecificTests`. Tag routing matches the current
  suite selection.
- Setup parity: Current setup operations: none. No legacy setup method body was available.
- Action parity: Current action verbs: none. No legacy action method body was available.
- Assertion parity: Current assertion helpers: `assertThat`, `contains`. No legacy assertion method body was available.
- Cleanup parity: Current cleanup operations: none. No legacy cleanup method body was available.
- Any observed difference, however small: No legacy method counterpart exists; this is new JUnit-side verification
  coverage.
- Known intentional difference: `JUnit/AssertJ/Testcontainers framework replacement`
- Reviewer note: Source/history review only.
- Audit status: `intentional difference`

##### `shouldRunQueryWithFileAuthenticator`

- Legacy source method: No legacy source method; this is new JUnit-side verification coverage.
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/ldap/TestLdapAndFileCli.java` ->
  `TestLdapAndFileCli.shouldRunQueryWithFileAuthenticator`
- Mapping type: `new coverage helper`
- Environment parity: Current class requires `LdapAndFileEnvironment`. Routed by source review into `SuiteLdap` run 2.
- Tag parity: Current tags: `LdapAndFile`, `LdapAndFileCli`, `ProfileSpecificTests`. Tag routing matches the current
  suite selection.
- Setup parity: Current setup operations: none. No legacy setup method body was available.
- Action parity: Current action verbs: none. No legacy action method body was available.
- Assertion parity: Current assertion helpers: `assertThat`, `contains`. No legacy assertion method body was available.
- Cleanup parity: Current cleanup operations: none. No legacy cleanup method body was available.
- Any observed difference, however small: No legacy method counterpart exists; this is new JUnit-side verification
  coverage.
- Known intentional difference: `JUnit/AssertJ/Testcontainers framework replacement`
- Reviewer note: Source/history review only.
- Audit status: `intentional difference`

##### `shouldRunQueryForFileOnlyUser`

- Legacy source method: No legacy source method; this is new JUnit-side verification coverage.
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/ldap/TestLdapAndFileCli.java` ->
  `TestLdapAndFileCli.shouldRunQueryForFileOnlyUser`
- Mapping type: `new coverage helper`
- Environment parity: Current class requires `LdapAndFileEnvironment`. Routed by source review into `SuiteLdap` run 2.
- Tag parity: Current tags: `LdapAndFile`, `LdapAndFileCli`, `ProfileSpecificTests`. Tag routing matches the current
  suite selection.
- Setup parity: Current setup operations: none. No legacy setup method body was available.
- Action parity: Current action verbs: none. No legacy action method body was available.
- Assertion parity: Current assertion helpers: `assertThat`, `contains`. No legacy assertion method body was available.
- Cleanup parity: Current cleanup operations: none. No legacy cleanup method body was available.
- Any observed difference, however small: No legacy method counterpart exists; this is new JUnit-side verification
  coverage.
- Known intentional difference: `JUnit/AssertJ/Testcontainers framework replacement`
- Reviewer note: Source/history review only.
- Audit status: `intentional difference`

##### `shouldRunQueryForAnotherUserWithOnlyFileAuthenticator`

- Legacy source method: No legacy source method; this is new JUnit-side verification coverage.
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/ldap/TestLdapAndFileCli.java` ->
  `TestLdapAndFileCli.shouldRunQueryForAnotherUserWithOnlyFileAuthenticator`
- Mapping type: `new coverage helper`
- Environment parity: Current class requires `LdapAndFileEnvironment`. Routed by source review into `SuiteLdap` run 2.
- Tag parity: Current tags: `LdapAndFile`, `LdapAndFileCli`, `ProfileSpecificTests`. Tag routing matches the current
  suite selection.
- Setup parity: Current setup operations: none. No legacy setup method body was available.
- Action parity: Current action verbs: none. No legacy action method body was available.
- Assertion parity: Current assertion helpers: none. No legacy assertion method body was available.
- Cleanup parity: Current cleanup operations: none. No legacy cleanup method body was available.
- Any observed difference, however small: No legacy method counterpart exists; this is new JUnit-side verification
  coverage.
- Known intentional difference: `JUnit/AssertJ/Testcontainers framework replacement`
- Reviewer note: Source/history review only.
- Audit status: `intentional difference`

### `TestLdapAndFileTrinoJdbc`

- Owning migration commit: `Add TestLdapAndFileTrinoJdbc JUnit coverage`
- Current class added in same migration commit:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/ldap/TestLdapAndFileTrinoJdbc.java`
- Legacy class removed in same migration commit:
    - None. This commit added new JUnit-side verification coverage rather than removing a legacy class.
- Class-level environment requirement: `LdapAndFileEnvironment`.
- Class-level tags: `LdapAndFile`, `ProfileSpecificTests`, `TrinoJdbc`.
- Method inventory complete: Not applicable. No legacy class or resource source exists for this new verification
  coverage.
- Legacy helper/resource dependencies accounted for: New JUnit-side verification coverage without a removed legacy
  counterpart.
- Intentional differences summary: `JUnit/AssertJ/Testcontainers framework replacement`
- Method statuses present: `intentional difference`.

#### Methods

##### `shouldRunQueryWithLdapAuthenticator`

- Legacy source method: No legacy source method; this is new JUnit-side verification coverage.
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/ldap/TestLdapAndFileTrinoJdbc.java` ->
  `TestLdapAndFileTrinoJdbc.shouldRunQueryWithLdapAuthenticator`
- Mapping type: `new coverage helper`
- Environment parity: Current class requires `LdapAndFileEnvironment`. Routed by source review into `SuiteLdap` run 2.
- Tag parity: Current tags: `LdapAndFile`, `ProfileSpecificTests`, `TrinoJdbc`. Tag routing matches the current suite
  selection.
- Setup parity: Current setup operations: none. No legacy setup method body was available.
- Action parity: Current action verbs: none. No legacy action method body was available.
- Assertion parity: Current assertion helpers: `assertThat`, `containsOnly`. No legacy assertion method body was
  available.
- Cleanup parity: Current cleanup operations: none. No legacy cleanup method body was available.
- Any observed difference, however small: No legacy method counterpart exists; this is new JUnit-side verification
  coverage.
- Known intentional difference: `JUnit/AssertJ/Testcontainers framework replacement`
- Reviewer note: Source/history review only.
- Audit status: `intentional difference`

##### `shouldRunQueryWithFileAuthenticator`

- Legacy source method: No legacy source method; this is new JUnit-side verification coverage.
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/ldap/TestLdapAndFileTrinoJdbc.java` ->
  `TestLdapAndFileTrinoJdbc.shouldRunQueryWithFileAuthenticator`
- Mapping type: `new coverage helper`
- Environment parity: Current class requires `LdapAndFileEnvironment`. Routed by source review into `SuiteLdap` run 2.
- Tag parity: Current tags: `LdapAndFile`, `ProfileSpecificTests`, `TrinoJdbc`. Tag routing matches the current suite
  selection.
- Setup parity: Current setup operations: none. No legacy setup method body was available.
- Action parity: Current action verbs: none. No legacy action method body was available.
- Assertion parity: Current assertion helpers: `assertThat`, `containsOnly`. No legacy assertion method body was
  available.
- Cleanup parity: Current cleanup operations: none. No legacy cleanup method body was available.
- Any observed difference, however small: No legacy method counterpart exists; this is new JUnit-side verification
  coverage.
- Known intentional difference: `JUnit/AssertJ/Testcontainers framework replacement`
- Reviewer note: Source/history review only.
- Audit status: `intentional difference`

##### `shouldRunQueryForFileOnlyUser`

- Legacy source method: No legacy source method; this is new JUnit-side verification coverage.
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/ldap/TestLdapAndFileTrinoJdbc.java` ->
  `TestLdapAndFileTrinoJdbc.shouldRunQueryForFileOnlyUser`
- Mapping type: `new coverage helper`
- Environment parity: Current class requires `LdapAndFileEnvironment`. Routed by source review into `SuiteLdap` run 2.
- Tag parity: Current tags: `LdapAndFile`, `ProfileSpecificTests`, `TrinoJdbc`. Tag routing matches the current suite
  selection.
- Setup parity: Current setup operations: none. No legacy setup method body was available.
- Action parity: Current action verbs: none. No legacy action method body was available.
- Assertion parity: Current assertion helpers: `assertThat`, `containsOnly`. No legacy assertion method body was
  available.
- Cleanup parity: Current cleanup operations: none. No legacy cleanup method body was available.
- Any observed difference, however small: No legacy method counterpart exists; this is new JUnit-side verification
  coverage.
- Known intentional difference: `JUnit/AssertJ/Testcontainers framework replacement`
- Reviewer note: Source/history review only.
- Audit status: `intentional difference`

##### `shouldRunQueryForAnotherUserWithOnlyFileAuthenticator`

- Legacy source method: No legacy source method; this is new JUnit-side verification coverage.
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/ldap/TestLdapAndFileTrinoJdbc.java` ->
  `TestLdapAndFileTrinoJdbc.shouldRunQueryForAnotherUserWithOnlyFileAuthenticator`
- Mapping type: `new coverage helper`
- Environment parity: Current class requires `LdapAndFileEnvironment`. Routed by source review into `SuiteLdap` run 2.
- Tag parity: Current tags: `LdapAndFile`, `ProfileSpecificTests`, `TrinoJdbc`. Tag routing matches the current suite
  selection.
- Setup parity: Current setup operations: none. No legacy setup method body was available.
- Action parity: Current action verbs: none. No legacy action method body was available.
- Assertion parity: Current assertion helpers: none. No legacy assertion method body was available.
- Cleanup parity: Current cleanup operations: none. No legacy cleanup method body was available.
- Any observed difference, however small: No legacy method counterpart exists; this is new JUnit-side verification
  coverage.
- Known intentional difference: `JUnit/AssertJ/Testcontainers framework replacement`
- Reviewer note: Source/history review only.
- Audit status: `intentional difference`

### `TestLdapTrinoJdbc`

- Owning migration commit: `Migrate TestLdapTrinoJdbc to JUnit`
- Current class added in same migration commit:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/ldap/TestLdapTrinoJdbc.java`
- Legacy class removed in same migration commit:
    - `testing/trino-product-tests/src/main/java/io/trino/tests/product/jdbc/TestLdapTrinoJdbc.java`
- Class-level environment requirement: `LdapBasicEnvironment`.
- Class-level tags: `Ldap`, `ProfileSpecificTests`, `TrinoJdbc`.
- Method inventory complete: Yes. Legacy methods: `15`. Current methods: `13`.
- Legacy helper/resource dependencies accounted for: Legacy class source reviewed directly. Cross-class or merged legacy
  coverage accounted for: `shouldRunQueryForAnotherUserWithOnlyFileAuthenticator` -> covered in
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/ldap/TestLdapAndFileTrinoJdbc.java` ->
  `shouldRunQueryForAnotherUserWithOnlyFileAuthenticator`; `shouldRunQueryWithFileAuthenticator` -> covered in
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/ldap/TestLdapAndFileTrinoJdbc.java` ->
  `shouldRunQueryWithFileAuthenticator`.
- Intentional differences summary: None identified at class scope.
- Method statuses present: `verified`.

#### Methods

##### `shouldRunQueryWithLdap`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/jdbc/TestLdapTrinoJdbc.java` ->
  `shouldRunQueryWithLdap`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/ldap/TestLdapTrinoJdbc.java` ->
  `TestLdapTrinoJdbc.shouldRunQueryWithLdap`
- Mapping type: `direct`
- Environment parity: Current class requires `LdapBasicEnvironment`. Routed by source review into `SuiteLdap` run 1.
- Tag parity: Current tags: `Ldap`, `ProfileSpecificTests`, `TrinoJdbc`. Tag routing matches the current suite
  selection.
- Setup parity: Current setup operations: none. No legacy setup method body was available.
- Action parity: Current action verbs: none. No legacy action method body was available.
- Assertion parity: Current assertion helpers: `assertThat`, `containsOnly`. Legacy assertion helpers: `assertThat`.
- Cleanup parity: Current cleanup operations: none. No legacy cleanup method body was available.
- Any observed difference, however small: Normalized body similarity is low (`0.18`), so fidelity was judged from
  SQL/helper/assertion shape instead of raw text. Assertion helper names differ between legacy and current
  implementations.
- Known intentional difference: None.
- Reviewer note: Matched by current suite selection: `SuiteLdap` run 1 Exact-name mapping with normalized body
  similarity `0.18`.
- Audit status: `verified`

##### `shouldRunQueryWithAlternativeBind`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/jdbc/TestLdapTrinoJdbc.java` ->
  `shouldRunQueryWithAlternativeBind`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/ldap/TestLdapTrinoJdbc.java` ->
  `TestLdapTrinoJdbc.shouldRunQueryWithAlternativeBind`
- Mapping type: `direct`
- Environment parity: Current class requires `LdapBasicEnvironment`. Routed by source review into `SuiteLdap` run 1.
- Tag parity: Current tags: `Ldap`, `LdapMultipleBinds`, `ProfileSpecificTests`, `TrinoJdbc`. Tag routing matches the
  current suite selection.
- Setup parity: Current setup operations: none. No legacy setup method body was available.
- Action parity: Current action verbs: none. No legacy action method body was available.
- Assertion parity: Current assertion helpers: `assertThat`, `containsOnly`. Legacy assertion helpers: `assertThat`.
- Cleanup parity: Current cleanup operations: none. No legacy cleanup method body was available.
- Any observed difference, however small: Normalized body similarity is low (`0.37`), so fidelity was judged from
  SQL/helper/assertion shape instead of raw text. Assertion helper names differ between legacy and current
  implementations.
- Known intentional difference: None.
- Reviewer note: Matched by current suite selection: `SuiteLdap` run 1 Exact-name mapping with normalized body
  similarity `0.37`.
- Audit status: `verified`

##### `shouldFailQueryForLdapUserInChildGroup`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/jdbc/TestLdapTrinoJdbc.java` ->
  `shouldFailQueryForLdapUserInChildGroup`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/ldap/TestLdapTrinoJdbc.java` ->
  `TestLdapTrinoJdbc.shouldFailQueryForLdapUserInChildGroup`
- Mapping type: `direct`
- Environment parity: Current class requires `LdapBasicEnvironment`. Routed by source review into `SuiteLdap` run 1.
- Tag parity: Current tags: `Ldap`, `ProfileSpecificTests`, `TrinoJdbc`. Tag routing matches the current suite
  selection.
- Setup parity: Current setup operations: none. No legacy setup method body was available.
- Action parity: Current action verbs: none. No legacy action method body was available.
- Assertion parity: Current assertion helpers: none. No legacy assertion method body was available.
- Cleanup parity: Current cleanup operations: none. No legacy cleanup method body was available.
- Any observed difference, however small: No method-specific difference identified beyond the documented framework
  baseline.
- Known intentional difference: None.
- Reviewer note: Matched by current suite selection: `SuiteLdap` run 1 Exact-name mapping with normalized body
  similarity `0.60`.
- Audit status: `verified`

##### `shouldFailQueryForLdapUserInParentGroup`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/jdbc/TestLdapTrinoJdbc.java` ->
  `shouldFailQueryForLdapUserInParentGroup`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/ldap/TestLdapTrinoJdbc.java` ->
  `TestLdapTrinoJdbc.shouldFailQueryForLdapUserInParentGroup`
- Mapping type: `direct`
- Environment parity: Current class requires `LdapBasicEnvironment`. Routed by source review into `SuiteLdap` run 1.
- Tag parity: Current tags: `Ldap`, `ProfileSpecificTests`, `TrinoJdbc`. Tag routing matches the current suite
  selection.
- Setup parity: Current setup operations: none. No legacy setup method body was available.
- Action parity: Current action verbs: none. No legacy action method body was available.
- Assertion parity: Current assertion helpers: none. No legacy assertion method body was available.
- Cleanup parity: Current cleanup operations: none. No legacy cleanup method body was available.
- Any observed difference, however small: No method-specific difference identified beyond the documented framework
  baseline.
- Known intentional difference: None.
- Reviewer note: Matched by current suite selection: `SuiteLdap` run 1 Exact-name mapping with normalized body
  similarity `0.61`.
- Audit status: `verified`

##### `shouldFailQueryForOrphanLdapUser`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/jdbc/TestLdapTrinoJdbc.java` ->
  `shouldFailQueryForOrphanLdapUser`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/ldap/TestLdapTrinoJdbc.java` ->
  `TestLdapTrinoJdbc.shouldFailQueryForOrphanLdapUser`
- Mapping type: `direct`
- Environment parity: Current class requires `LdapBasicEnvironment`. Routed by source review into `SuiteLdap` run 1.
- Tag parity: Current tags: `Ldap`, `ProfileSpecificTests`, `TrinoJdbc`. Tag routing matches the current suite
  selection.
- Setup parity: Current setup operations: none. No legacy setup method body was available.
- Action parity: Current action verbs: none. No legacy action method body was available.
- Assertion parity: Current assertion helpers: none. No legacy assertion method body was available.
- Cleanup parity: Current cleanup operations: none. No legacy cleanup method body was available.
- Any observed difference, however small: No method-specific difference identified beyond the documented framework
  baseline.
- Known intentional difference: None.
- Reviewer note: Matched by current suite selection: `SuiteLdap` run 1 Exact-name mapping with normalized body
  similarity `0.61`.
- Audit status: `verified`

##### `shouldFailQueryForFailedBind`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/jdbc/TestLdapTrinoJdbc.java` ->
  `shouldFailQueryForFailedBind`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/ldap/TestLdapTrinoJdbc.java` ->
  `TestLdapTrinoJdbc.shouldFailQueryForFailedBind`
- Mapping type: `direct`
- Environment parity: Current class requires `LdapBasicEnvironment`. Routed by source review into `SuiteLdap` run 1.
- Tag parity: Current tags: `Ldap`, `LdapMultipleBinds`, `ProfileSpecificTests`, `TrinoJdbc`. Tag routing matches the
  current suite selection.
- Setup parity: Current setup operations: none. No legacy setup method body was available.
- Action parity: Current action verbs: none. No legacy action method body was available.
- Assertion parity: Current assertion helpers: none. No legacy assertion method body was available.
- Cleanup parity: Current cleanup operations: none. No legacy cleanup method body was available.
- Any observed difference, however small: No method-specific difference identified beyond the documented framework
  baseline.
- Known intentional difference: None.
- Reviewer note: Matched by current suite selection: `SuiteLdap` run 1 Exact-name mapping with normalized body
  similarity `0.68`.
- Audit status: `verified`

##### `shouldFailQueryForWrongLdapPassword`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/jdbc/TestLdapTrinoJdbc.java` ->
  `shouldFailQueryForWrongLdapPassword`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/ldap/TestLdapTrinoJdbc.java` ->
  `TestLdapTrinoJdbc.shouldFailQueryForWrongLdapPassword`
- Mapping type: `direct`
- Environment parity: Current class requires `LdapBasicEnvironment`. Routed by source review into `SuiteLdap` run 1.
- Tag parity: Current tags: `Ldap`, `ProfileSpecificTests`, `TrinoJdbc`. Tag routing matches the current suite
  selection.
- Setup parity: Current setup operations: none. No legacy setup method body was available.
- Action parity: Current action verbs: none. No legacy action method body was available.
- Assertion parity: Current assertion helpers: none. No legacy assertion method body was available.
- Cleanup parity: Current cleanup operations: none. No legacy cleanup method body was available.
- Any observed difference, however small: No method-specific difference identified beyond the documented framework
  baseline.
- Known intentional difference: None.
- Reviewer note: Matched by current suite selection: `SuiteLdap` run 1 High normalized body similarity `0.84`.
- Audit status: `verified`

##### `shouldFailQueryForWrongLdapUser`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/jdbc/TestLdapTrinoJdbc.java` ->
  `shouldFailQueryForWrongLdapUser`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/ldap/TestLdapTrinoJdbc.java` ->
  `TestLdapTrinoJdbc.shouldFailQueryForWrongLdapUser`
- Mapping type: `direct`
- Environment parity: Current class requires `LdapBasicEnvironment`. Routed by source review into `SuiteLdap` run 1.
- Tag parity: Current tags: `Ldap`, `ProfileSpecificTests`, `TrinoJdbc`. Tag routing matches the current suite
  selection.
- Setup parity: Current setup operations: none. No legacy setup method body was available.
- Action parity: Current action verbs: none. No legacy action method body was available.
- Assertion parity: Current assertion helpers: `assertThatThrownBy`. Legacy assertion helpers: `assertThatThrownBy`.
- Cleanup parity: Current cleanup operations: none. No legacy cleanup method body was available.
- Any observed difference, however small: No method-specific difference identified beyond the documented framework
  baseline.
- Known intentional difference: None.
- Reviewer note: Matched by current suite selection: `SuiteLdap` run 1 High normalized body similarity `0.89`.
- Audit status: `verified`

##### `shouldFailQueryForEmptyUser`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/jdbc/TestLdapTrinoJdbc.java` ->
  `shouldFailQueryForEmptyUser`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/ldap/TestLdapTrinoJdbc.java` ->
  `TestLdapTrinoJdbc.shouldFailQueryForEmptyUser`
- Mapping type: `direct`
- Environment parity: Current class requires `LdapBasicEnvironment`. Routed by source review into `SuiteLdap` run 1.
- Tag parity: Current tags: `Ldap`, `ProfileSpecificTests`, `TrinoJdbc`. Tag routing matches the current suite
  selection.
- Setup parity: Current setup operations: none. No legacy setup method body was available.
- Action parity: Current action verbs: none. No legacy action method body was available.
- Assertion parity: Current assertion helpers: none. No legacy assertion method body was available.
- Cleanup parity: Current cleanup operations: none. No legacy cleanup method body was available.
- Any observed difference, however small: No method-specific difference identified beyond the documented framework
  baseline.
- Known intentional difference: None.
- Reviewer note: Matched by current suite selection: `SuiteLdap` run 1 High normalized body similarity `0.82`.
- Audit status: `verified`

##### `shouldFailQueryForLdapWithoutPassword`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/jdbc/TestLdapTrinoJdbc.java` ->
  `shouldFailQueryForLdapWithoutPassword`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/ldap/TestLdapTrinoJdbc.java` ->
  `TestLdapTrinoJdbc.shouldFailQueryForLdapWithoutPassword`
- Mapping type: `direct`
- Environment parity: Current class requires `LdapBasicEnvironment`. Routed by source review into `SuiteLdap` run 1.
- Tag parity: Current tags: `Ldap`, `ProfileSpecificTests`, `TrinoJdbc`. Tag routing matches the current suite
  selection.
- Setup parity: Current setup operations: none. No legacy setup method body was available.
- Action parity: Current action verbs: none. No legacy action method body was available.
- Assertion parity: Current assertion helpers: none. No legacy assertion method body was available.
- Cleanup parity: Current cleanup operations: none. No legacy cleanup method body was available.
- Any observed difference, however small: No method-specific difference identified beyond the documented framework
  baseline.
- Known intentional difference: None.
- Reviewer note: Matched by current suite selection: `SuiteLdap` run 1 High normalized body similarity `0.80`.
- Audit status: `verified`

##### `shouldFailQueryForLdapWithoutSsl`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/jdbc/TestLdapTrinoJdbc.java` ->
  `shouldFailQueryForLdapWithoutSsl`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/ldap/TestLdapTrinoJdbc.java` ->
  `TestLdapTrinoJdbc.shouldFailQueryForLdapWithoutSsl`
- Mapping type: `direct`
- Environment parity: Current class requires `LdapBasicEnvironment`. Routed by source review into `SuiteLdap` run 1.
- Tag parity: Current tags: `Ldap`, `ProfileSpecificTests`, `TrinoJdbc`. Tag routing matches the current suite
  selection.
- Setup parity: Current setup operations: none. No legacy setup method body was available.
- Action parity: Current action verbs: none. No legacy action method body was available.
- Assertion parity: Current assertion helpers: `assertThatThrownBy`, `hasMessageContaining`. Legacy assertion helpers:
  `assertThatThrownBy`, `hasMessageContaining`.
- Cleanup parity: Current cleanup operations: none. No legacy cleanup method body was available.
- Any observed difference, however small: No method-specific difference identified beyond the documented framework
  baseline.
- Known intentional difference: None.
- Reviewer note: Matched by current suite selection: `SuiteLdap` run 1 Exact-name mapping with normalized body
  similarity `0.78`.
- Audit status: `verified`

##### `shouldFailForIncorrectTrustStore`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/jdbc/TestLdapTrinoJdbc.java` ->
  `shouldFailForIncorrectTrustStore`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/ldap/TestLdapTrinoJdbc.java` ->
  `TestLdapTrinoJdbc.shouldFailForIncorrectTrustStore`
- Mapping type: `direct`
- Environment parity: Current class requires `LdapBasicEnvironment`. Routed by source review into `SuiteLdap` run 1.
- Tag parity: Current tags: `Ldap`, `ProfileSpecificTests`, `TrinoJdbc`. Tag routing matches the current suite
  selection.
- Setup parity: Current setup operations: none. No legacy setup method body was available.
- Action parity: Current action verbs: none. No legacy action method body was available.
- Assertion parity: Current assertion helpers: `assertThatThrownBy`, `hasMessageContaining`. Legacy assertion helpers:
  `assertThatThrownBy`, `hasMessageContaining`.
- Cleanup parity: Current cleanup operations: none. No legacy cleanup method body was available.
- Any observed difference, however small: No method-specific difference identified beyond the documented framework
  baseline.
- Known intentional difference: None.
- Reviewer note: Matched by current suite selection: `SuiteLdap` run 1 Exact-name mapping with normalized body
  similarity `0.77`.
- Audit status: `verified`

##### `shouldFailForUserWithColon`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/jdbc/TestLdapTrinoJdbc.java` ->
  `shouldFailForUserWithColon`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/ldap/TestLdapTrinoJdbc.java` ->
  `TestLdapTrinoJdbc.shouldFailForUserWithColon`
- Mapping type: `direct`
- Environment parity: Current class requires `LdapBasicEnvironment`. Routed by source review into `SuiteLdap` run 1.
- Tag parity: Current tags: `Ldap`, `ProfileSpecificTests`, `TrinoJdbc`. Tag routing matches the current suite
  selection.
- Setup parity: Current setup operations: none. No legacy setup method body was available.
- Action parity: Current action verbs: none. No legacy action method body was available.
- Assertion parity: Current assertion helpers: none. No legacy assertion method body was available.
- Cleanup parity: Current cleanup operations: none. No legacy cleanup method body was available.
- Any observed difference, however small: No method-specific difference identified beyond the documented framework
  baseline.
- Known intentional difference: None.
- Reviewer note: Matched by current suite selection: `SuiteLdap` run 1 High normalized body similarity `0.84`.
- Audit status: `verified`
