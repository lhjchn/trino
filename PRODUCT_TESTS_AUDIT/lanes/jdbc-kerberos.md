# Lane Audit: Jdbc Kerberos

## Lane Summary

- Audit status: `completed`
- Section start commit: `Add JDBC Kerberos environment`
- Section end commit: `Migrate TestKerberosConstrainedDelegationJdbc to JUnit`
- Introduced JUnit suites: `SuiteJdbcKerberos`.
- Extended existing suites: none.
- Retired legacy suites: none.
- Environment classes introduced: `JdbcKerberosEnvironment`.
- Method status counts: verified `4`, intentional difference `0`, needs follow-up `0`.

## Lane-Level Open Questions / Intentional Differences

- Lane-wide approved difference set: `Kerberos deployment cleanup without intended coverage change`.
- Needs-follow-up methods: none currently identified in this source/history pass.

## Ported Test Classes

### `TestKerberosConstrainedDelegationJdbc`

- Owning migration commit: `Migrate TestKerberosConstrainedDelegationJdbc to JUnit`
- Current class added in same migration commit:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/jdbc/TestKerberosConstrainedDelegationJdbc.java`
- Legacy class removed in same migration commit:
    - `testing/trino-product-tests/src/main/java/io/trino/tests/product/jdbc/TestKerberosConstrainedDelegationJdbc.java`
- Class-level environment requirement: `JdbcKerberosEnvironment`.
- Class-level tags: `JdbcKerberosConstrainedDelegation`.
- Method inventory complete: Yes. Legacy methods: `4`. Current methods: `4`.
- Legacy helper/resource dependencies accounted for: Legacy class source reviewed directly.
- Intentional differences summary: `Kerberos deployment cleanup without intended coverage change`
- Method statuses present: `verified`.

#### Methods

##### `testSelectConstrainedDelegationKerberos`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/jdbc/TestKerberosConstrainedDelegationJdbc.java` ->
  `testSelectConstrainedDelegationKerberos`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/jdbc/TestKerberosConstrainedDelegationJdbc.java` ->
  `TestKerberosConstrainedDelegationJdbc.testSelectConstrainedDelegationKerberos`
- Mapping type: `direct`
- Environment parity: Current class requires `JdbcKerberosEnvironment`. Routed by source review into `SuiteJdbcKerberos`
  run 1.
- Tag parity: Current tags: `JdbcKerberosConstrainedDelegation`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: none. Legacy setup operations: none.
- Action parity: Current action verbs: `SELECT`. Legacy action verbs: `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `containsOnly`. Legacy assertion helpers: `assertThat`.
- Cleanup parity: Current cleanup operations: none. No legacy cleanup method body was available.
- Any observed difference, however small: Normalized body similarity is low (`0.48`), so fidelity was judged from
  SQL/helper/assertion shape instead of raw text. Assertion helper names differ between legacy and current
  implementations.
- Known intentional difference: `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Matched by current suite selection: `SuiteJdbcKerberos` run 1 Exact-name mapping with normalized body
  similarity `0.48`.
- Audit status: `verified`

##### `testCtasConstrainedDelegationKerberos`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/jdbc/TestKerberosConstrainedDelegationJdbc.java` ->
  `testCtasConstrainedDelegationKerberos`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/jdbc/TestKerberosConstrainedDelegationJdbc.java` ->
  `TestKerberosConstrainedDelegationJdbc.testCtasConstrainedDelegationKerberos`
- Mapping type: `direct`
- Environment parity: Current class requires `JdbcKerberosEnvironment`. Routed by source review into `SuiteJdbcKerberos`
  run 1.
- Tag parity: Current tags: `JdbcKerberosConstrainedDelegation`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`. Legacy setup operations: `CREATE`.
- Action parity: Current action verbs: none. Legacy action verbs: none.
- Assertion parity: Current assertion helpers: `assertThat`, `isEqualTo`. Legacy assertion helpers: `assertThat`,
  `isEqualTo`.
- Cleanup parity: Current cleanup operations: `DROP`. No legacy cleanup method body was available.
- Any observed difference, however small: Normalized body similarity is low (`0.14`), so fidelity was judged from
  SQL/helper/assertion shape instead of raw text. SQL verb set differs: legacy ['CREATE'] vs current ['CREATE', 'DROP'].
- Known intentional difference: `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Matched by current suite selection: `SuiteJdbcKerberos` run 1 Exact-name mapping with normalized body
  similarity `0.14`.
- Audit status: `verified`

##### `testQueryOnDisposedCredential`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/jdbc/TestKerberosConstrainedDelegationJdbc.java` ->
  `testQueryOnDisposedCredential`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/jdbc/TestKerberosConstrainedDelegationJdbc.java` ->
  `TestKerberosConstrainedDelegationJdbc.testQueryOnDisposedCredential`
- Mapping type: `direct`
- Environment parity: Current class requires `JdbcKerberosEnvironment`. Routed by source review into `SuiteJdbcKerberos`
  run 1.
- Tag parity: Current tags: `JdbcKerberosConstrainedDelegation`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: none. Legacy setup operations: none.
- Action parity: Current action verbs: `SELECT`. Legacy action verbs: `SELECT`.
- Assertion parity: Current assertion helpers: `assertThatThrownBy`, `hasMessageContaining`. Legacy assertion helpers:
  `assertThatThrownBy`, `hasMessageContaining`.
- Cleanup parity: Current cleanup operations: none. No legacy cleanup method body was available.
- Any observed difference, however small: No method-specific difference identified beyond the documented framework
  baseline.
- Known intentional difference: None.
- Reviewer note: Matched by current suite selection: `SuiteJdbcKerberos` run 1 Exact-name mapping with normalized body
  similarity `0.72`.
- Audit status: `verified`

##### `testQueryOnExpiredCredential`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/jdbc/TestKerberosConstrainedDelegationJdbc.java` ->
  `testQueryOnExpiredCredential`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/jdbc/TestKerberosConstrainedDelegationJdbc.java` ->
  `TestKerberosConstrainedDelegationJdbc.testQueryOnExpiredCredential`
- Mapping type: `direct`
- Environment parity: Current class requires `JdbcKerberosEnvironment`. Routed by source review into `SuiteJdbcKerberos`
  run 1.
- Tag parity: Current tags: `JdbcKerberosConstrainedDelegation`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: none. Legacy setup operations: none.
- Action parity: Current action verbs: `SELECT`. Legacy action verbs: `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `assertThatThrownBy`, `hasMessageContaining`. Legacy
  assertion helpers: `assertThat`, `assertThatThrownBy`, `hasMessageContaining`.
- Cleanup parity: Current cleanup operations: none. No legacy cleanup method body was available.
- Any observed difference, however small: No method-specific difference identified beyond the documented framework
  baseline.
- Known intentional difference: None.
- Reviewer note: Matched by current suite selection: `SuiteJdbcKerberos` run 1 Exact-name mapping with normalized body
  similarity `0.66`.
- Audit status: `verified`
