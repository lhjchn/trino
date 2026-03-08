# Lane Audit: Hudi

## Lane Summary

- Audit status: `completed`
- Section start commit: `Add Hudi environment`
- Section end commit: `Remove legacy SuiteHudi`
- Introduced JUnit suites: `SuiteHudi`.
- Extended existing suites: none.
- Retired legacy suites: `SuiteHudi`.
- Environment classes introduced: none.
- Method status counts: verified `11`, intentional difference `0`, needs follow-up `0`.

## Lane-Level Open Questions / Intentional Differences

- Lane-wide approved difference set: `HDP to Hive 3.1 migration`.
- Needs-follow-up methods: none currently identified in this source/history pass.

## Ported Test Classes

### `TestHudiSparkCompatibility`

- Owning migration commit: `Migrate TestHudiSparkCompatibility to JUnit`
- Current class added in same migration commit:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hudi/TestHudiSparkCompatibility.java`
- Legacy class removed in same migration commit:
    - `testing/trino-product-tests/src/main/java/io/trino/tests/product/hudi/TestHudiSparkCompatibility.java`
- Class-level environment requirement: `HudiEnvironment`.
- Class-level tags: `Hudi`.
- Method inventory complete: Yes. Legacy methods: `11`. Current methods: `11`.
- Legacy helper/resource dependencies accounted for: Legacy class source reviewed directly.
- Intentional differences summary: `HDP to Hive 3.1 migration`
- Method statuses present: `verified`.

#### Methods

##### `testCopyOnWriteShowCreateTable`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hudi/TestHudiSparkCompatibility.java` ->
  `testCopyOnWriteShowCreateTable`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hudi/TestHudiSparkCompatibility.java` ->
  `TestHudiSparkCompatibility.testCopyOnWriteShowCreateTable`
- Mapping type: `direct`
- Environment parity: Current class requires `HudiEnvironment`. Routed by source review into `SuiteHudi` run 1.
- Tag parity: Current tags: `Hudi`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`. Legacy setup operations: `CREATE`.
- Action parity: Current action verbs: `SHOW`. Legacy action verbs: `SHOW`, `WITH`.
- Assertion parity: Current assertion helpers: `assertThat`, `contains`. Legacy assertion helpers: `assertThat`,
  `isEqualTo`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: Normalized body similarity is low (`0.46`), so fidelity was judged from
  SQL/helper/assertion shape instead of raw text. SQL verb set differs: legacy ['SHOW', 'CREATE', 'WITH', 'DROP'] vs
  current ['SHOW', 'CREATE', 'DROP']. Assertion helper names differ between legacy and current implementations. Current
  method uses parameter-injected environment helpers instead of Tempto query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`
- Reviewer note: Matched by current suite selection: `SuiteHudi` run 1 Exact-name mapping with normalized body
  similarity `0.46`.
- Audit status: `verified`

##### `testCopyOnWriteTableSelect`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hudi/TestHudiSparkCompatibility.java` ->
  `testCopyOnWriteTableSelect`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hudi/TestHudiSparkCompatibility.java` ->
  `TestHudiSparkCompatibility.testCopyOnWriteTableSelect`
- Mapping type: `direct`
- Environment parity: Current class requires `HudiEnvironment`. Routed by source review into `SuiteHudi` run 1.
- Tag parity: Current tags: `Hudi`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: none. Legacy setup operations: none.
- Action parity: Current action verbs: `SELECT`. Legacy action verbs: `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `containsOnly`, `row`. Legacy assertion helpers:
  `assertThat`, `containsOnly`, `row`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: Normalized body similarity is low (`0.39`), so fidelity was judged from
  SQL/helper/assertion shape instead of raw text. Current method uses parameter-injected environment helpers instead of
  Tempto query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`
- Reviewer note: Matched by current suite selection: `SuiteHudi` run 1 Exact-name mapping with normalized body
  similarity `0.39`.
- Audit status: `verified`

##### `testCopyOnWritePartitionedTableSelect`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hudi/TestHudiSparkCompatibility.java` ->
  `testCopyOnWritePartitionedTableSelect`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hudi/TestHudiSparkCompatibility.java` ->
  `TestHudiSparkCompatibility.testCopyOnWritePartitionedTableSelect`
- Mapping type: `direct`
- Environment parity: Current class requires `HudiEnvironment`. Routed by source review into `SuiteHudi` run 1.
- Tag parity: Current tags: `Hudi`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: none. Legacy setup operations: none.
- Action parity: Current action verbs: `SELECT`. Legacy action verbs: `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `containsOnly`, `row`. Legacy assertion helpers:
  `assertThat`, `containsOnly`, `row`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: Current method uses parameter-injected environment helpers instead of Tempto
  query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`
- Reviewer note: Matched by current suite selection: `SuiteHudi` run 1 Exact-name mapping with normalized body
  similarity `0.75`.
- Audit status: `verified`

##### `testCopyOnWriteTableSelectAfterUpdate`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hudi/TestHudiSparkCompatibility.java` ->
  `testCopyOnWriteTableSelectAfterUpdate`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hudi/TestHudiSparkCompatibility.java` ->
  `TestHudiSparkCompatibility.testCopyOnWriteTableSelectAfterUpdate`
- Mapping type: `direct`
- Environment parity: Current class requires `HudiEnvironment`. Routed by source review into `SuiteHudi` run 1.
- Tag parity: Current tags: `Hudi`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `UPDATE`. Legacy setup operations: `UPDATE`.
- Action parity: Current action verbs: `SELECT`. Legacy action verbs: `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `containsOnly`, `row`. Legacy assertion helpers:
  `assertThat`, `containsOnly`, `row`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: Normalized body similarity is low (`0.43`), so fidelity was judged from
  SQL/helper/assertion shape instead of raw text. Current method uses parameter-injected environment helpers instead of
  Tempto query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`
- Reviewer note: Matched by current suite selection: `SuiteHudi` run 1 Exact-name mapping with normalized body
  similarity `0.43`.
- Audit status: `verified`

##### `testMergeOnReadTableSelect`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hudi/TestHudiSparkCompatibility.java` ->
  `testMergeOnReadTableSelect`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hudi/TestHudiSparkCompatibility.java` ->
  `TestHudiSparkCompatibility.testMergeOnReadTableSelect`
- Mapping type: `direct`
- Environment parity: Current class requires `HudiEnvironment`. Routed by source review into `SuiteHudi` run 1.
- Tag parity: Current tags: `Hudi`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: none. Legacy setup operations: none.
- Action parity: Current action verbs: `SELECT`. Legacy action verbs: `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `containsOnly`, `row`. Legacy assertion helpers:
  `assertThat`, `containsOnly`, `row`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: Current method uses parameter-injected environment helpers instead of Tempto
  query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`
- Reviewer note: Matched by current suite selection: `SuiteHudi` run 1 Exact-name mapping with normalized body
  similarity `0.66`.
- Audit status: `verified`

##### `testMergeOnReadTableSelectAfterUpdate`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hudi/TestHudiSparkCompatibility.java` ->
  `testMergeOnReadTableSelectAfterUpdate`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hudi/TestHudiSparkCompatibility.java` ->
  `TestHudiSparkCompatibility.testMergeOnReadTableSelectAfterUpdate`
- Mapping type: `direct`
- Environment parity: Current class requires `HudiEnvironment`. Routed by source review into `SuiteHudi` run 1.
- Tag parity: Current tags: `Hudi`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `UPDATE`. Legacy setup operations: `UPDATE`.
- Action parity: Current action verbs: `SELECT`. Legacy action verbs: `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `containsOnly`, `row`. Legacy assertion helpers:
  `assertThat`, `containsOnly`, `row`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: Current method uses parameter-injected environment helpers instead of Tempto
  query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`
- Reviewer note: Matched by current suite selection: `SuiteHudi` run 1 Exact-name mapping with normalized body
  similarity `0.71`.
- Audit status: `verified`

##### `testMergeOnReadPartitionedTableSelect`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hudi/TestHudiSparkCompatibility.java` ->
  `testMergeOnReadPartitionedTableSelect`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hudi/TestHudiSparkCompatibility.java` ->
  `TestHudiSparkCompatibility.testMergeOnReadPartitionedTableSelect`
- Mapping type: `direct`
- Environment parity: Current class requires `HudiEnvironment`. Routed by source review into `SuiteHudi` run 1.
- Tag parity: Current tags: `Hudi`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: none. Legacy setup operations: none.
- Action parity: Current action verbs: `SELECT`. Legacy action verbs: `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `containsOnly`, `row`. Legacy assertion helpers:
  `assertThat`, `containsOnly`, `row`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: Current method uses parameter-injected environment helpers instead of Tempto
  query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`
- Reviewer note: Matched by current suite selection: `SuiteHudi` run 1 Exact-name mapping with normalized body
  similarity `0.70`.
- Audit status: `verified`

##### `testCopyOnWriteTableSelectWithSessionProperties`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hudi/TestHudiSparkCompatibility.java` ->
  `testCopyOnWriteTableSelectWithSessionProperties`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hudi/TestHudiSparkCompatibility.java` ->
  `TestHudiSparkCompatibility.testCopyOnWriteTableSelectWithSessionProperties`
- Mapping type: `direct`
- Environment parity: Current class requires `HudiEnvironment`. Routed by source review into `SuiteHudi` run 1.
- Tag parity: Current tags: `Hudi`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: none. Legacy setup operations: none.
- Action parity: Current action verbs: `SELECT`. Legacy action verbs: `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `containsOnly`, `row`. Legacy assertion helpers:
  `assertThat`, `containsOnly`, `row`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: Current method uses parameter-injected environment helpers instead of Tempto
  query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`
- Reviewer note: Matched by current suite selection: `SuiteHudi` run 1 Exact-name mapping with normalized body
  similarity `0.75`.
- Audit status: `verified`

##### `testTimelineTable`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hudi/TestHudiSparkCompatibility.java` ->
  `testTimelineTable`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hudi/TestHudiSparkCompatibility.java` ->
  `TestHudiSparkCompatibility.testTimelineTable`
- Mapping type: `direct`
- Environment parity: Current class requires `HudiEnvironment`. Routed by source review into `SuiteHudi` run 1.
- Tag parity: Current tags: `Hudi`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: none. Legacy setup operations: none.
- Action parity: Current action verbs: `SELECT`. Legacy action verbs: `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `containsOnly`, `row`. Legacy assertion helpers:
  `assertThat`, `containsOnly`, `row`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: Current method uses parameter-injected environment helpers instead of Tempto
  query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`
- Reviewer note: Matched by current suite selection: `SuiteHudi` run 1 Exact-name mapping with normalized body
  similarity `0.79`.
- Audit status: `verified`

##### `testTimelineTableRedirect`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hudi/TestHudiSparkCompatibility.java` ->
  `testTimelineTableRedirect`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hudi/TestHudiSparkCompatibility.java` ->
  `TestHudiSparkCompatibility.testTimelineTableRedirect`
- Mapping type: `direct`
- Environment parity: Current class requires `HudiEnvironment`. Routed by source review into `SuiteHudi` run 1.
- Tag parity: Current tags: `Hudi`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: none. Legacy setup operations: none.
- Action parity: Current action verbs: `SELECT`. Legacy action verbs: `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `assertThatThrownBy`, `containsOnly`,
  `hasMessageContaining`, `row`. Legacy assertion helpers: `assertQueryFailure`, `assertThat`, `containsOnly`, `row`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: Assertion helper names differ between legacy and current implementations.
  Current method uses parameter-injected environment helpers instead of Tempto query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`
- Reviewer note: Matched by current suite selection: `SuiteHudi` run 1 Exact-name mapping with normalized body
  similarity `0.65`.
- Audit status: `verified`

##### `testReadCopyOnWriteTableWithReplaceCommits`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hudi/TestHudiSparkCompatibility.java` ->
  `testReadCopyOnWriteTableWithReplaceCommits`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hudi/TestHudiSparkCompatibility.java` ->
  `TestHudiSparkCompatibility.testReadCopyOnWriteTableWithReplaceCommits`
- Mapping type: `direct`
- Environment parity: Current class requires `HudiEnvironment`. Routed by source review into `SuiteHudi` run 1.
- Tag parity: Current tags: `Hudi`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`, `INSERT`. Legacy setup operations: `CREATE`, `INSERT`.
- Action parity: Current action verbs: `SELECT`. Legacy action verbs: `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `containsOnly`, `row`. Legacy assertion helpers:
  `assertThat`, `containsOnly`, `row`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: Current method uses parameter-injected environment helpers instead of Tempto
  query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`
- Reviewer note: Matched by current suite selection: `SuiteHudi` run 1 Exact-name mapping with normalized body
  similarity `0.88`.
- Audit status: `verified`
