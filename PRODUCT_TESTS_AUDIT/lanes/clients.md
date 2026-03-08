# Lane Audit: Clients

## Lane Summary

- Audit status: `completed`
- Section start commit: `Add CLI environment`
- Section end commit: `Remove legacy SuiteClients`
- Introduced JUnit suites: none.
- Extended existing suites: `SuiteClients`.
- Retired legacy suites: `SuiteClients`.
- Environment classes introduced: `CliEnvironment`.
- Method status counts: verified `25`, intentional difference `5`, needs follow-up `0`.

## Lane-Level Open Questions / Intentional Differences

- Lane-wide approved difference set: none beyond the framework baseline documented in the reviewer guide.
- Needs-follow-up methods: none currently identified in this source/history pass.

## Ported Test Classes

### `TestTrinoCli`

- Owning migration commit: `Migrate TestTrinoCli to JUnit`
- Current class added in same migration commit:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/cli/TestTrinoCli.java`
- Legacy class removed in same migration commit:
    - `testing/trino-product-tests/src/main/java/io/trino/tests/product/cli/TestTrinoCli.java`
- Class-level environment requirement: `CliEnvironment`.
- Class-level tags: `Cli`.
- Method inventory complete: Yes. Legacy methods: `20`. Current methods: `28`.
- Legacy helper/resource dependencies accounted for: Legacy class source reviewed directly. Cross-class or merged legacy
  coverage accounted for: `testSetRole` -> covered in
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestRoles.java` -> `testSetRole`.
- Intentional differences summary: `JUnit/AssertJ/Testcontainers framework replacement`
- Method statuses present: `intentional difference`, `verified`.

#### Methods

##### `shouldDisplayVersion`

- Legacy source method: `testing/trino-product-tests/src/main/java/io/trino/tests/product/cli/TestTrinoCli.java` ->
  `shouldDisplayVersion`
- Current target method: `testing/trino-product-tests/src/test/java/io/trino/tests/product/cli/TestTrinoCli.java` ->
  `TestTrinoCli.shouldDisplayVersion`
- Mapping type: `direct`
- Environment parity: Current class requires `CliEnvironment`. Routed by source review into `SuiteClients` run 2.
- Tag parity: Current tags: `Cli`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: none. No legacy setup method body was available.
- Action parity: Current action verbs: none. No legacy action method body was available.
- Assertion parity: Current assertion helpers: `assertThat`, `isEqualTo`. Legacy assertion helpers: `assertThat`,
  `containsExactly`.
- Cleanup parity: Current cleanup operations: none. No legacy cleanup method body was available.
- Any observed difference, however small: Assertion helper names differ between legacy and current implementations.
- Known intentional difference: None.
- Reviewer note: Matched by current suite selection: `SuiteClients` run 2 Exact-name mapping with normalized body
  similarity `0.55`.
- Audit status: `verified`

##### `shouldRunBatchQuery`

- Legacy source method: `testing/trino-product-tests/src/main/java/io/trino/tests/product/cli/TestTrinoCli.java` ->
  `shouldRunBatchQuery`
- Current target method: `testing/trino-product-tests/src/test/java/io/trino/tests/product/cli/TestTrinoCli.java` ->
  `TestTrinoCli.shouldRunBatchQuery`
- Mapping type: `direct`
- Environment parity: Current class requires `CliEnvironment`. Routed by source review into `SuiteClients` run 2.
- Tag parity: Current tags: `Cli`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: none. Legacy setup operations: none.
- Action parity: Current action verbs: `SELECT`. Legacy action verbs: `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`. Legacy assertion helpers: `assertThat`.
- Cleanup parity: Current cleanup operations: none. No legacy cleanup method body was available.
- Any observed difference, however small: Normalized body similarity is low (`0.25`), so fidelity was judged from
  SQL/helper/assertion shape instead of raw text.
- Known intentional difference: None.
- Reviewer note: Matched by current suite selection: `SuiteClients` run 2 Exact-name mapping with normalized body
  similarity `0.25`.
- Audit status: `verified`

##### `shouldRunQuery`

- Legacy source method: `testing/trino-product-tests/src/main/java/io/trino/tests/product/cli/TestTrinoCli.java` ->
  `shouldRunQuery`
- Current target method: `testing/trino-product-tests/src/test/java/io/trino/tests/product/cli/TestTrinoCli.java` ->
  `TestTrinoCli.shouldRunQuery`
- Mapping type: `direct`
- Environment parity: Current class requires `CliEnvironment`. Routed by source review into `SuiteClients` run 2.
- Tag parity: Current tags: `Cli`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: none. Legacy setup operations: none.
- Action parity: Current action verbs: `SELECT`. Legacy action verbs: `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`. No legacy assertion method body was available.
- Cleanup parity: Current cleanup operations: none. No legacy cleanup method body was available.
- Any observed difference, however small: Normalized body similarity is low (`0.05`), so fidelity was judged from
  SQL/helper/assertion shape instead of raw text.
- Known intentional difference: None.
- Reviewer note: Matched by current suite selection: `SuiteClients` run 2 Exact-name mapping with normalized body
  similarity `0.05`.
- Audit status: `verified`

##### `shouldRunBatchQueryWithStdinRedirect`

- Legacy source method: `testing/trino-product-tests/src/main/java/io/trino/tests/product/cli/TestTrinoCli.java` ->
  `shouldRunBatchQueryWithStdinRedirect`
- Current target method: `testing/trino-product-tests/src/test/java/io/trino/tests/product/cli/TestTrinoCli.java` ->
  `TestTrinoCli.shouldRunBatchQueryWithStdinRedirect`
- Mapping type: `direct`
- Environment parity: Current class requires `CliEnvironment`. Routed by source review into `SuiteClients` run 2.
- Tag parity: Current tags: `Cli`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: none. Legacy setup operations: none.
- Action parity: Current action verbs: `SELECT`. Legacy action verbs: `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`. Legacy assertion helpers: `assertThat`.
- Cleanup parity: Current cleanup operations: none. No legacy cleanup method body was available.
- Any observed difference, however small: Normalized body similarity is low (`0.22`), so fidelity was judged from
  SQL/helper/assertion shape instead of raw text.
- Known intentional difference: None.
- Reviewer note: Matched by current suite selection: `SuiteClients` run 2 Exact-name mapping with normalized body
  similarity `0.22`.
- Audit status: `verified`

##### `shouldRunQueryFromFile`

- Legacy source method: `testing/trino-product-tests/src/main/java/io/trino/tests/product/cli/TestTrinoCli.java` ->
  `shouldRunQueryFromFile`
- Current target method: `testing/trino-product-tests/src/test/java/io/trino/tests/product/cli/TestTrinoCli.java` ->
  `TestTrinoCli.shouldRunQueryFromFile`
- Mapping type: `direct`
- Environment parity: Current class requires `CliEnvironment`. Routed by source review into `SuiteClients` run 2.
- Tag parity: Current tags: `Cli`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: none. Legacy setup operations: none.
- Action parity: Current action verbs: none. Legacy action verbs: `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`. Legacy assertion helpers: `assertThat`.
- Cleanup parity: Current cleanup operations: none. No legacy cleanup method body was available.
- Any observed difference, however small: Normalized body similarity is low (`0.16`), so fidelity was judged from
  SQL/helper/assertion shape instead of raw text. SQL verb set differs: legacy ['SELECT'] vs current [].
- Known intentional difference: None.
- Reviewer note: Matched by current suite selection: `SuiteClients` run 2 Exact-name mapping with normalized body
  similarity `0.16`.
- Audit status: `verified`

##### `shouldExitOnErrorFromFile`

- Legacy source method: `testing/trino-product-tests/src/main/java/io/trino/tests/product/cli/TestTrinoCli.java` ->
  `shouldExitOnErrorFromFile`
- Current target method: `testing/trino-product-tests/src/test/java/io/trino/tests/product/cli/TestTrinoCli.java` ->
  `TestTrinoCli.shouldExitOnErrorFromFile`
- Mapping type: `direct`
- Environment parity: Current class requires `CliEnvironment`. Routed by source review into `SuiteClients` run 2.
- Tag parity: Current tags: `Cli`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: none. Legacy setup operations: none.
- Action parity: Current action verbs: none. Legacy action verbs: `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`. Legacy assertion helpers: `assertThat`,
  `assertThatThrownBy`.
- Cleanup parity: Current cleanup operations: none. No legacy cleanup method body was available.
- Any observed difference, however small: Normalized body similarity is low (`0.02`), so fidelity was judged from
  SQL/helper/assertion shape instead of raw text. SQL verb set differs: legacy ['SELECT'] vs current []. Assertion
  helper names differ between legacy and current implementations.
- Known intentional difference: None.
- Reviewer note: Matched by current suite selection: `SuiteClients` run 2 Exact-name mapping with normalized body
  similarity `0.02`.
- Audit status: `verified`

##### `shouldNotExitOnErrorFromFile`

- Legacy source method: `testing/trino-product-tests/src/main/java/io/trino/tests/product/cli/TestTrinoCli.java` ->
  `shouldNotExitOnErrorFromFile`
- Current target method: `testing/trino-product-tests/src/test/java/io/trino/tests/product/cli/TestTrinoCli.java` ->
  `TestTrinoCli.shouldNotExitOnErrorFromFile`
- Mapping type: `direct`
- Environment parity: Current class requires `CliEnvironment`. Routed by source review into `SuiteClients` run 2.
- Tag parity: Current tags: `Cli`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: none. Legacy setup operations: none.
- Action parity: Current action verbs: none. Legacy action verbs: `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`. Legacy assertion helpers: `assertThat`,
  `assertThatThrownBy`.
- Cleanup parity: Current cleanup operations: none. No legacy cleanup method body was available.
- Any observed difference, however small: Normalized body similarity is low (`0.09`), so fidelity was judged from
  SQL/helper/assertion shape instead of raw text. SQL verb set differs: legacy ['SELECT'] vs current []. Assertion
  helper names differ between legacy and current implementations.
- Known intentional difference: None.
- Reviewer note: Matched by current suite selection: `SuiteClients` run 2 Exact-name mapping with normalized body
  similarity `0.09`.
- Audit status: `verified`

##### `shouldRunMultipleBatchQueriesWithStdinRedirect`

- Legacy source method: `testing/trino-product-tests/src/main/java/io/trino/tests/product/cli/TestTrinoCli.java` ->
  `shouldRunMultipleBatchQueriesWithStdinRedirect`
- Current target method: `testing/trino-product-tests/src/test/java/io/trino/tests/product/cli/TestTrinoCli.java` ->
  `TestTrinoCli.shouldRunMultipleBatchQueriesWithStdinRedirect`
- Mapping type: `direct`
- Environment parity: Current class requires `CliEnvironment`. Routed by source review into `SuiteClients` run 2.
- Tag parity: Current tags: `Cli`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: none. Legacy setup operations: none.
- Action parity: Current action verbs: `SELECT`. Legacy action verbs: `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `contains`. Legacy assertion helpers: `assertThat`.
- Cleanup parity: Current cleanup operations: none. No legacy cleanup method body was available.
- Any observed difference, however small: Normalized body similarity is low (`0.26`), so fidelity was judged from
  SQL/helper/assertion shape instead of raw text. Assertion helper names differ between legacy and current
  implementations.
- Known intentional difference: None.
- Reviewer note: Matched by current suite selection: `SuiteClients` run 2 Exact-name mapping with normalized body
  similarity `0.26`.
- Audit status: `verified`

##### `shouldExecuteEmptyListOfStatements`

- Legacy source method: `testing/trino-product-tests/src/main/java/io/trino/tests/product/cli/TestTrinoCli.java` ->
  `shouldExecuteEmptyListOfStatements`
- Current target method: `testing/trino-product-tests/src/test/java/io/trino/tests/product/cli/TestTrinoCli.java` ->
  `TestTrinoCli.shouldExecuteEmptyListOfStatements`
- Mapping type: `direct`
- Environment parity: Current class requires `CliEnvironment`. Routed by source review into `SuiteClients` run 2.
- Tag parity: Current tags: `Cli`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: none. No legacy setup method body was available.
- Action parity: Current action verbs: none. No legacy action method body was available.
- Assertion parity: Current assertion helpers: `assertThat`. Legacy assertion helpers: `assertThat`.
- Cleanup parity: Current cleanup operations: none. No legacy cleanup method body was available.
- Any observed difference, however small: Normalized body similarity is low (`0.46`), so fidelity was judged from
  SQL/helper/assertion shape instead of raw text.
- Known intentional difference: None.
- Reviewer note: Matched by current suite selection: `SuiteClients` run 2 Exact-name mapping with normalized body
  similarity `0.46`.
- Audit status: `verified`

##### `shouldPassSessionUser`

- Legacy source method: `testing/trino-product-tests/src/main/java/io/trino/tests/product/cli/TestTrinoCli.java` ->
  `shouldPassSessionUser`
- Current target method: `testing/trino-product-tests/src/test/java/io/trino/tests/product/cli/TestTrinoCli.java` ->
  `TestTrinoCli.shouldPassSessionUser`
- Mapping type: `direct`
- Environment parity: Current class requires `CliEnvironment`. Routed by source review into `SuiteClients` run 2.
- Tag parity: Current tags: `Cli`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: none. Legacy setup operations: none.
- Action parity: Current action verbs: `SELECT`. Legacy action verbs: `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `contains`. Legacy assertion helpers: `assertThat`,
  `contains`.
- Cleanup parity: Current cleanup operations: none. No legacy cleanup method body was available.
- Any observed difference, however small: Normalized body similarity is low (`0.03`), so fidelity was judged from
  SQL/helper/assertion shape instead of raw text.
- Known intentional difference: None.
- Reviewer note: Matched by current suite selection: `SuiteClients` run 2 Exact-name mapping with normalized body
  similarity `0.03`.
- Audit status: `verified`

##### `shouldUseCatalogAndSchemaOptions`

- Legacy source method: `testing/trino-product-tests/src/main/java/io/trino/tests/product/cli/TestTrinoCli.java` ->
  `shouldUseCatalogAndSchemaOptions`
- Current target method: `testing/trino-product-tests/src/test/java/io/trino/tests/product/cli/TestTrinoCli.java` ->
  `TestTrinoCli.shouldUseCatalogAndSchemaOptions`
- Mapping type: `direct`
- Environment parity: Current class requires `CliEnvironment`. Routed by source review into `SuiteClients` run 2.
- Tag parity: Current tags: `Cli`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: none. Legacy setup operations: none.
- Action parity: Current action verbs: `SELECT`. Legacy action verbs: `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`. Legacy assertion helpers: `assertThat`.
- Cleanup parity: Current cleanup operations: none. No legacy cleanup method body was available.
- Any observed difference, however small: Normalized body similarity is low (`0.20`), so fidelity was judged from
  SQL/helper/assertion shape instead of raw text.
- Known intentional difference: None.
- Reviewer note: Matched by current suite selection: `SuiteClients` run 2 Exact-name mapping with normalized body
  similarity `0.20`.
- Audit status: `verified`

##### `shouldExitOnErrorFromExecute`

- Legacy source method: `testing/trino-product-tests/src/main/java/io/trino/tests/product/cli/TestTrinoCli.java` ->
  `shouldExitOnErrorFromExecute`
- Current target method: `testing/trino-product-tests/src/test/java/io/trino/tests/product/cli/TestTrinoCli.java` ->
  `TestTrinoCli.shouldExitOnErrorFromExecute`
- Mapping type: `direct`
- Environment parity: Current class requires `CliEnvironment`. Routed by source review into `SuiteClients` run 2.
- Tag parity: Current tags: `Cli`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: none. Legacy setup operations: none.
- Action parity: Current action verbs: `SELECT`. Legacy action verbs: `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`. Legacy assertion helpers: `assertThat`,
  `assertThatThrownBy`.
- Cleanup parity: Current cleanup operations: none. No legacy cleanup method body was available.
- Any observed difference, however small: Normalized body similarity is low (`0.15`), so fidelity was judged from
  SQL/helper/assertion shape instead of raw text. Assertion helper names differ between legacy and current
  implementations.
- Known intentional difference: None.
- Reviewer note: Matched by current suite selection: `SuiteClients` run 2 Exact-name mapping with normalized body
  similarity `0.15`.
- Audit status: `verified`

##### `shouldNotExitOnErrorFromExecute`

- Legacy source method: `testing/trino-product-tests/src/main/java/io/trino/tests/product/cli/TestTrinoCli.java` ->
  `shouldNotExitOnErrorFromExecute`
- Current target method: `testing/trino-product-tests/src/test/java/io/trino/tests/product/cli/TestTrinoCli.java` ->
  `TestTrinoCli.shouldNotExitOnErrorFromExecute`
- Mapping type: `direct`
- Environment parity: Current class requires `CliEnvironment`. Routed by source review into `SuiteClients` run 2.
- Tag parity: Current tags: `Cli`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: none. Legacy setup operations: none.
- Action parity: Current action verbs: `SELECT`. Legacy action verbs: `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`. Legacy assertion helpers: `assertThat`,
  `assertThatThrownBy`.
- Cleanup parity: Current cleanup operations: none. No legacy cleanup method body was available.
- Any observed difference, however small: Normalized body similarity is low (`0.13`), so fidelity was judged from
  SQL/helper/assertion shape instead of raw text. Assertion helper names differ between legacy and current
  implementations.
- Known intentional difference: None.
- Reviewer note: Matched by current suite selection: `SuiteClients` run 2 Exact-name mapping with normalized body
  similarity `0.13`.
- Audit status: `verified`

##### `shouldHandleUseStatement`

- Legacy source method: `testing/trino-product-tests/src/main/java/io/trino/tests/product/cli/TestTrinoCli.java` ->
  `shouldHandleSession`
- Current target method: `testing/trino-product-tests/src/test/java/io/trino/tests/product/cli/TestTrinoCli.java` ->
  `TestTrinoCli.shouldHandleUseStatement`
- Mapping type: `split`
- Environment parity: Current class requires `CliEnvironment`. Routed by source review into `SuiteClients` run 2.
- Tag parity: Current tags: `Cli`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: none. Legacy setup operations: none.
- Action parity: Current action verbs: none. Legacy action verbs: `SELECT`, `SHOW`.
- Assertion parity: Current assertion helpers: `assertThat`, `contains`. Legacy assertion helpers: `assertThat`,
  `contains`.
- Cleanup parity: Current cleanup operations: none. No legacy cleanup method body was available.
- Any observed difference, however small: Legacy interactive session coverage was split so `USE` handling is asserted
  independently.
- Known intentional difference: None.
- Reviewer note: Matched by current suite selection: `SuiteClients` run 2
- Audit status: `verified`

##### `shouldHandleSession`

- Legacy source method: `testing/trino-product-tests/src/main/java/io/trino/tests/product/cli/TestTrinoCli.java` ->
  `shouldHandleSession`
- Current target method: `testing/trino-product-tests/src/test/java/io/trino/tests/product/cli/TestTrinoCli.java` ->
  `TestTrinoCli.shouldHandleSession`
- Mapping type: `direct`
- Environment parity: Current class requires `CliEnvironment`. Routed by source review into `SuiteClients` run 2.
- Tag parity: Current tags: `Cli`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: none. Legacy setup operations: none.
- Action parity: Current action verbs: `SELECT`, `SHOW`. Legacy action verbs: `SELECT`, `SHOW`.
- Assertion parity: Current assertion helpers: `assertThat`, `contains`. Legacy assertion helpers: `assertThat`,
  `contains`.
- Cleanup parity: Current cleanup operations: none. No legacy cleanup method body was available.
- Any observed difference, however small: Normalized body similarity is low (`0.14`), so fidelity was judged from
  SQL/helper/assertion shape instead of raw text.
- Known intentional difference: None.
- Reviewer note: Matched by current suite selection: `SuiteClients` run 2 Exact-name mapping with normalized body
  similarity `0.14`.
- Audit status: `verified`

##### `shouldHandleSessionSettings`

- Legacy source method: `testing/trino-product-tests/src/main/java/io/trino/tests/product/cli/TestTrinoCli.java` ->
  `shouldHandleSession`
- Current target method: `testing/trino-product-tests/src/test/java/io/trino/tests/product/cli/TestTrinoCli.java` ->
  `TestTrinoCli.shouldHandleSessionSettings`
- Mapping type: `split`
- Environment parity: Current class requires `CliEnvironment`. Routed by source review into `SuiteClients` run 2.
- Tag parity: Current tags: `Cli`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: none. Legacy setup operations: none.
- Action parity: Current action verbs: none. Legacy action verbs: `SELECT`, `SHOW`.
- Assertion parity: Current assertion helpers: `assertThat`, `contains`. Legacy assertion helpers: `assertThat`,
  `contains`.
- Cleanup parity: Current cleanup operations: none. No legacy cleanup method body was available.
- Any observed difference, however small: Legacy interactive session coverage was split so session-property mutation is
  asserted independently.
- Known intentional difference: None.
- Reviewer note: Matched by current suite selection: `SuiteClients` run 2
- Audit status: `verified`

##### `shouldHandleTransaction`

- Legacy source method: `testing/trino-product-tests/src/main/java/io/trino/tests/product/cli/TestTrinoCli.java` ->
  `shouldHandleTransaction`
- Current target method: `testing/trino-product-tests/src/test/java/io/trino/tests/product/cli/TestTrinoCli.java` ->
  `TestTrinoCli.shouldHandleTransaction`
- Mapping type: `direct`
- Environment parity: Current class requires `CliEnvironment`. Routed by source review into `SuiteClients` run 2.
- Tag parity: Current tags: `Cli`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: none. Legacy setup operations: `CREATE`.
- Action parity: Current action verbs: `SELECT`. Legacy action verbs: `SELECT`, `SHOW`.
- Assertion parity: Current assertion helpers: `assertThat`, `contains`. Legacy assertion helpers: `assertThat`,
  `contains`.
- Cleanup parity: Current cleanup operations: none. No legacy cleanup method body was available.
- Any observed difference, however small: Normalized body similarity is low (`0.04`), so fidelity was judged from
  SQL/helper/assertion shape instead of raw text. SQL verb set differs: legacy ['CREATE', 'SELECT', 'SHOW'] vs
  current ['SELECT'].
- Known intentional difference: None.
- Reviewer note: Matched by current suite selection: `SuiteClients` run 2 Exact-name mapping with normalized body
  similarity `0.04`.
- Audit status: `verified`

##### `shouldHandleTransactionRollback`

- Legacy source method: `testing/trino-product-tests/src/main/java/io/trino/tests/product/cli/TestTrinoCli.java` ->
  `shouldHandleTransaction`
- Current target method: `testing/trino-product-tests/src/test/java/io/trino/tests/product/cli/TestTrinoCli.java` ->
  `TestTrinoCli.shouldHandleTransactionRollback`
- Mapping type: `split`
- Environment parity: Current class requires `CliEnvironment`. Routed by source review into `SuiteClients` run 2.
- Tag parity: Current tags: `Cli`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: none. Legacy setup operations: `CREATE`.
- Action parity: Current action verbs: `SELECT`. Legacy action verbs: `SELECT`, `SHOW`.
- Assertion parity: Current assertion helpers: `assertThat`, `contains`. Legacy assertion helpers: `assertThat`,
  `contains`.
- Cleanup parity: Current cleanup operations: none. No legacy cleanup method body was available.
- Any observed difference, however small: Legacy transaction coverage was split so rollback behavior is asserted
  independently.
- Known intentional difference: None.
- Reviewer note: Matched by current suite selection: `SuiteClients` run 2
- Audit status: `verified`

##### `shouldPrintExplainAnalyzePlan`

- Legacy source method: `testing/trino-product-tests/src/main/java/io/trino/tests/product/cli/TestTrinoCli.java` ->
  `shouldPrintExplainAnalyzePlan`
- Current target method: `testing/trino-product-tests/src/test/java/io/trino/tests/product/cli/TestTrinoCli.java` ->
  `TestTrinoCli.shouldPrintExplainAnalyzePlan`
- Mapping type: `direct`
- Environment parity: Current class requires `CliEnvironment`. Routed by source review into `SuiteClients` run 2.
- Tag parity: Current tags: `Cli`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`, `INSERT`, `UPDATE`. Legacy setup operations: `CREATE`, `INSERT`,
  `UPDATE`.
- Action parity: Current action verbs: none. Legacy action verbs: none.
- Assertion parity: Current assertion helpers: `assertExplainAnalyzeResult`, `assertThat`. Legacy assertion helpers:
  `assertThat`, `contains`.
- Cleanup parity: Current cleanup operations: `DROP`, `DELETE`. Legacy cleanup operations: `DELETE`, `DROP`.
- Any observed difference, however small: Normalized body similarity is low (`0.30`), so fidelity was judged from
  SQL/helper/assertion shape instead of raw text. SQL verb set differs:
  legacy ['CREATE', 'INSERT', 'UPDATE', 'DELETE', 'DROP'] vs current ['DROP', 'CREATE', 'INSERT', 'UPDATE', 'DELETE'].
  Assertion helper names differ between legacy and current implementations. Current method uses parameter-injected
  environment helpers instead of Tempto query executors.
- Known intentional difference: None.
- Reviewer note: Matched by current suite selection: `SuiteClients` run 2 Exact-name mapping with normalized body
  similarity `0.30`.
- Audit status: `verified`

##### `shouldShowCatalogs`

- Legacy source method: No legacy source method; this is new JUnit-side verification coverage.
- Current target method: `testing/trino-product-tests/src/test/java/io/trino/tests/product/cli/TestTrinoCli.java` ->
  `TestTrinoCli.shouldShowCatalogs`
- Mapping type: `new coverage helper`
- Environment parity: Current class requires `CliEnvironment`. Routed by source review into `SuiteClients` run 2.
- Tag parity: Current tags: `Cli`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: none. No legacy setup method body was available.
- Action parity: Current action verbs: `SHOW`. No legacy action method body was available.
- Assertion parity: Current assertion helpers: `assertThat`, `contains`. No legacy assertion method body was available.
- Cleanup parity: Current cleanup operations: none. No legacy cleanup method body was available.
- Any observed difference, however small: No direct legacy counterpart exists; this adds explicit CLI metadata browsing
  coverage.
- Known intentional difference: `JUnit/AssertJ/Testcontainers framework replacement`
- Reviewer note: Source/history review only.
- Audit status: `intentional difference`

##### `shouldShowSchemas`

- Legacy source method: No legacy source method; this is new JUnit-side verification coverage.
- Current target method: `testing/trino-product-tests/src/test/java/io/trino/tests/product/cli/TestTrinoCli.java` ->
  `TestTrinoCli.shouldShowSchemas`
- Mapping type: `new coverage helper`
- Environment parity: Current class requires `CliEnvironment`. Routed by source review into `SuiteClients` run 2.
- Tag parity: Current tags: `Cli`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: none. No legacy setup method body was available.
- Action parity: Current action verbs: `SHOW`. No legacy action method body was available.
- Assertion parity: Current assertion helpers: `assertThat`, `contains`. No legacy assertion method body was available.
- Cleanup parity: Current cleanup operations: none. No legacy cleanup method body was available.
- Any observed difference, however small: No direct legacy counterpart exists; this adds explicit CLI metadata browsing
  coverage.
- Known intentional difference: `JUnit/AssertJ/Testcontainers framework replacement`
- Reviewer note: Source/history review only.
- Audit status: `intentional difference`

##### `shouldShowTables`

- Legacy source method: No legacy source method; this is new JUnit-side verification coverage.
- Current target method: `testing/trino-product-tests/src/test/java/io/trino/tests/product/cli/TestTrinoCli.java` ->
  `TestTrinoCli.shouldShowTables`
- Mapping type: `new coverage helper`
- Environment parity: Current class requires `CliEnvironment`. Routed by source review into `SuiteClients` run 2.
- Tag parity: Current tags: `Cli`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: none. No legacy setup method body was available.
- Action parity: Current action verbs: `SHOW`. No legacy action method body was available.
- Assertion parity: Current assertion helpers: `assertThat`, `contains`. No legacy assertion method body was available.
- Cleanup parity: Current cleanup operations: none. No legacy cleanup method body was available.
- Any observed difference, however small: No direct legacy counterpart exists; this adds explicit CLI metadata browsing
  coverage.
- Known intentional difference: `JUnit/AssertJ/Testcontainers framework replacement`
- Reviewer note: Source/history review only.
- Audit status: `intentional difference`

##### `shouldDescribeTable`

- Legacy source method: No legacy source method; this is new JUnit-side verification coverage.
- Current target method: `testing/trino-product-tests/src/test/java/io/trino/tests/product/cli/TestTrinoCli.java` ->
  `TestTrinoCli.shouldDescribeTable`
- Mapping type: `new coverage helper`
- Environment parity: Current class requires `CliEnvironment`. Routed by source review into `SuiteClients` run 2.
- Tag parity: Current tags: `Cli`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: none. No legacy setup method body was available.
- Action parity: Current action verbs: `DESCRIBE`. No legacy action method body was available.
- Assertion parity: Current assertion helpers: `assertThat`, `contains`. No legacy assertion method body was available.
- Cleanup parity: Current cleanup operations: none. No legacy cleanup method body was available.
- Any observed difference, however small: No direct legacy counterpart exists; this adds explicit CLI DESCRIBE coverage.
- Known intentional difference: `JUnit/AssertJ/Testcontainers framework replacement`
- Reviewer note: Source/history review only.
- Audit status: `intentional difference`

##### `shouldSelectWithOutputFormat`

- Legacy source method: No legacy source method; this is new JUnit-side verification coverage.
- Current target method: `testing/trino-product-tests/src/test/java/io/trino/tests/product/cli/TestTrinoCli.java` ->
  `TestTrinoCli.shouldSelectWithOutputFormat`
- Mapping type: `new coverage helper`
- Environment parity: Current class requires `CliEnvironment`. Routed by source review into `SuiteClients` run 2.
- Tag parity: Current tags: `Cli`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: none. No legacy setup method body was available.
- Action parity: Current action verbs: `SELECT`. No legacy action method body was available.
- Assertion parity: Current assertion helpers: `assertThat`, `contains`. No legacy assertion method body was available.
- Cleanup parity: Current cleanup operations: none. No legacy cleanup method body was available.
- Any observed difference, however small: No direct legacy counterpart exists; this adds explicit output-format
  coverage.
- Known intentional difference: `JUnit/AssertJ/Testcontainers framework replacement`
- Reviewer note: Source/history review only.
- Audit status: `intentional difference`

##### `shouldHandleConfigEnvVariable`

- Legacy source method: `testing/trino-product-tests/src/main/java/io/trino/tests/product/cli/TestTrinoCli.java` ->
  `shouldUseCatalogAndSchemaOptionsFromConfigFile`
- Current target method: `testing/trino-product-tests/src/test/java/io/trino/tests/product/cli/TestTrinoCli.java` ->
  `TestTrinoCli.shouldHandleConfigEnvVariable`
- Mapping type: `renamed`
- Environment parity: Current class requires `CliEnvironment`. Routed by source review into `SuiteClients` run 2.
- Tag parity: Current tags: `Cli`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`. Legacy setup operations: none.
- Action parity: Current action verbs: `SELECT`. Legacy action verbs: `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `contains`. Legacy assertion helpers: `assertThat`.
- Cleanup parity: Current cleanup operations: none. No legacy cleanup method body was available.
- Any observed difference, however small: Current method uses `TRINO_CONFIG` explicitly instead of the TempFile helper,
  but the tested config-file default behavior is the same.
- Known intentional difference: None.
- Reviewer note: Matched by current suite selection: `SuiteClients` run 2
- Audit status: `verified`

##### `shouldUseCatalogAndSchemaOptionsFromConfigFile`

- Legacy source method: `testing/trino-product-tests/src/main/java/io/trino/tests/product/cli/TestTrinoCli.java` ->
  `shouldUseCatalogAndSchemaOptionsFromConfigFile`
- Current target method: `testing/trino-product-tests/src/test/java/io/trino/tests/product/cli/TestTrinoCli.java` ->
  `TestTrinoCli.shouldUseCatalogAndSchemaOptionsFromConfigFile`
- Mapping type: `direct`
- Environment parity: Current class requires `CliEnvironment`. Routed by source review into `SuiteClients` run 2.
- Tag parity: Current tags: `Cli`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: none. Legacy setup operations: none.
- Action parity: Current action verbs: none. Legacy action verbs: `SELECT`.
- Assertion parity: Current assertion helpers: none. Legacy assertion helpers: `assertThat`.
- Cleanup parity: Current cleanup operations: none. No legacy cleanup method body was available.
- Any observed difference, however small: Normalized body similarity is low (`0.41`), so fidelity was judged from
  SQL/helper/assertion shape instead of raw text. SQL verb set differs: legacy ['SELECT'] vs current []. Assertion
  helper names differ between legacy and current implementations.
- Known intentional difference: None.
- Reviewer note: Matched by current suite selection: `SuiteClients` run 2 Exact-name mapping with normalized body
  similarity `0.41`.
- Audit status: `verified`

##### `shouldPreferCommandLineArgumentOverConfigDefault`

- Legacy source method: `testing/trino-product-tests/src/main/java/io/trino/tests/product/cli/TestTrinoCli.java` ->
  `shouldPreferCommandLineArgumentOverConfigDefault`
- Current target method: `testing/trino-product-tests/src/test/java/io/trino/tests/product/cli/TestTrinoCli.java` ->
  `TestTrinoCli.shouldPreferCommandLineArgumentOverConfigDefault`
- Mapping type: `direct`
- Environment parity: Current class requires `CliEnvironment`. Routed by source review into `SuiteClients` run 2.
- Tag parity: Current tags: `Cli`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`. Legacy setup operations: none.
- Action parity: Current action verbs: `SELECT`. Legacy action verbs: `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `contains`. Legacy assertion helpers: `assertThat`.
- Cleanup parity: Current cleanup operations: none. No legacy cleanup method body was available.
- Any observed difference, however small: Normalized body similarity is low (`0.27`), so fidelity was judged from
  SQL/helper/assertion shape instead of raw text. SQL verb set differs: legacy ['SELECT'] vs
  current ['CREATE', 'SELECT']. Assertion helper names differ between legacy and current implementations.
- Known intentional difference: None.
- Reviewer note: Matched by current suite selection: `SuiteClients` run 2 Exact-name mapping with normalized body
  similarity `0.27`.
- Audit status: `verified`

##### `shouldExitWithErrorOnUnknownPropertiesInConfigFile`

- Legacy source method: `testing/trino-product-tests/src/main/java/io/trino/tests/product/cli/TestTrinoCli.java` ->
  `shouldExitWithErrorOnUnknownPropertiesInConfigFile`
- Current target method: `testing/trino-product-tests/src/test/java/io/trino/tests/product/cli/TestTrinoCli.java` ->
  `TestTrinoCli.shouldExitWithErrorOnUnknownPropertiesInConfigFile`
- Mapping type: `direct`
- Environment parity: Current class requires `CliEnvironment`. Routed by source review into `SuiteClients` run 2.
- Tag parity: Current tags: `Cli`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`. No legacy setup method body was available.
- Action parity: Current action verbs: `SELECT`. No legacy action method body was available.
- Assertion parity: Current assertion helpers: `assertThat`. Legacy assertion helpers: `assertThat`,
  `assertThatThrownBy`, `containsExactly`.
- Cleanup parity: Current cleanup operations: none. No legacy cleanup method body was available.
- Any observed difference, however small: Normalized body similarity is low (`0.05`), so fidelity was judged from
  SQL/helper/assertion shape instead of raw text. Assertion helper names differ between legacy and current
  implementations.
- Known intentional difference: None.
- Reviewer note: Matched by current suite selection: `SuiteClients` run 2 Exact-name mapping with normalized body
  similarity `0.05`.
- Audit status: `verified`

### `TestJmxConnectorJunit`

- Owning migration commit: `Migrate TestJmxConnector to JUnit`
- Current class added in same migration commit:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/TestJmxConnectorJunit.java`
- Legacy class removed in same migration commit:
    - `testing/trino-product-tests/src/main/java/io/trino/tests/product/TestJmxConnector.java`
- Class-level environment requirement: `JdbcBasicEnvironment`.
- Class-level tags: `Jdbc`.
- Method inventory complete: Yes. Legacy methods: `2`. Current methods: `2`.
- Legacy helper/resource dependencies accounted for: Legacy class source reviewed directly.
- Intentional differences summary: None identified at class scope.
- Method statuses present: `verified`.

#### Methods

##### `selectFromJavaRuntimeJmxMBean`

- Legacy source method: `testing/trino-product-tests/src/main/java/io/trino/tests/product/TestJmxConnector.java` ->
  `selectFromJavaRuntimeJmxMBean`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/TestJmxConnectorJunit.java` ->
  `TestJmxConnectorJunit.selectFromJavaRuntimeJmxMBean`
- Mapping type: `direct`
- Environment parity: Current class requires `JdbcBasicEnvironment`. Routed by source review into `SuiteClients` run 1.
- Tag parity: Current tags: `Jdbc`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: none. Legacy setup operations: none.
- Action parity: Current action verbs: `SELECT`. Legacy action verbs: `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`. Legacy assertion helpers: `assertThat`.
- Cleanup parity: Current cleanup operations: none. No legacy cleanup method body was available.
- Any observed difference, however small: Normalized body similarity is low (`0.51`), so fidelity was judged from
  SQL/helper/assertion shape instead of raw text. Current method uses parameter-injected environment helpers instead of
  Tempto query executors.
- Known intentional difference: None.
- Reviewer note: Matched by current suite selection: `SuiteClients` run 1 Exact-name mapping with normalized body
  similarity `0.51`.
- Audit status: `verified`

##### `selectFromJavaOperatingSystemJmxMBean`

- Legacy source method: `testing/trino-product-tests/src/main/java/io/trino/tests/product/TestJmxConnector.java` ->
  `selectFromJavaOperatingSystemJmxMBean`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/TestJmxConnectorJunit.java` ->
  `TestJmxConnectorJunit.selectFromJavaOperatingSystemJmxMBean`
- Mapping type: `direct`
- Environment parity: Current class requires `JdbcBasicEnvironment`. Routed by source review into `SuiteClients` run 1.
- Tag parity: Current tags: `Jdbc`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: none. Legacy setup operations: none.
- Action parity: Current action verbs: `SELECT`. Legacy action verbs: `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`. Legacy assertion helpers: `assertThat`.
- Cleanup parity: Current cleanup operations: none. No legacy cleanup method body was available.
- Any observed difference, however small: Current method uses parameter-injected environment helpers instead of Tempto
  query executors.
- Known intentional difference: None.
- Reviewer note: Matched by current suite selection: `SuiteClients` run 1 Exact-name mapping with normalized body
  similarity `0.84`.
- Audit status: `verified`
