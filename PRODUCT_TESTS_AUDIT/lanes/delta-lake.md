# Lane Audit: Delta Lake

## Lane Summary

- Audit status: `completed`
- Section start commit: `Add Delta Lake environments`
- Section end commit: `Remove legacy SuiteDeltaLakeOss`
- Introduced JUnit suites: `SuiteDeltaLakeOss`.
- Extended existing suites: `SuiteDeltaLakeOss`.
- Retired legacy suites: `SuiteDeltaLakeOss`.
- Environment classes introduced: `DeltaLakeMinioCachingEnvironment`, `HiveDeltaLakeMinioEnvironment`.
- Method status counts: verified `191`, intentional difference `7`, needs follow-up `0`.

## Lane-Level Open Questions / Intentional Differences

- Lane-wide approved difference set: `HDP to Hive 3.1 migration`.
- Needs-follow-up methods: none currently identified in this source/history pass.

## Ported Test Classes

### `TestDeltaLakeActiveFilesCache`

- Owning migration commit: `Migrate TestDeltaLakeActiveFilesCache to JUnit`
- Current class added in same migration commit:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/deltalake/TestDeltaLakeActiveFilesCache.java`
- Legacy class removed in same migration commit:
    - `testing/trino-product-tests/src/main/java/io/trino/tests/product/deltalake/TestDeltaLakeActiveFilesCache.java`
- Class-level environment requirement: `DeltaLakeMinioEnvironment`.
- Class-level tags: `DeltaLakeMinio`.
- Method inventory complete: Yes. Legacy methods: `1`. Current methods: `1`.
- Legacy helper/resource dependencies accounted for: Legacy class source reviewed directly.
- Intentional differences summary: `HDP to Hive 3.1 migration`
- Method statuses present: `verified`.

#### Methods

##### `testRefreshTheFilesCacheWhenTableIsRecreated`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/deltalake/TestDeltaLakeActiveFilesCache.java` ->
  `testRefreshTheFilesCacheWhenTableIsRecreated`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/deltalake/TestDeltaLakeActiveFilesCache.java` ->
  `TestDeltaLakeActiveFilesCache.testRefreshTheFilesCacheWhenTableIsRecreated`
- Mapping type: `direct`
- Environment parity: Current class requires `DeltaLakeMinioEnvironment`. Routed by source review into
  `SuiteDeltaLakeOss` run 1.
- Tag parity: Current tags: `DeltaLakeMinio`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`, `INSERT`. Legacy setup operations: `CREATE`, `INSERT`.
- Action parity: Current action verbs: `SELECT`, `CALL`. Legacy action verbs: `SELECT`, `CALL`.
- Assertion parity: Current assertion helpers: `assertThat`, `assertThatThrownBy`, `containsOnly`,
  `hasMessageContaining`, `row`. Legacy assertion helpers: `assertQueryFailure`, `assertThat`, `containsOnly`,
  `hasMessageContaining`, `row`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: SQL verb set differs: legacy ['CREATE', 'INSERT', 'SELECT', 'CALL', 'DROP'] vs
  current ['CREATE', 'INSERT', 'SELECT', 'DROP', 'CALL']. Assertion helper names differ between legacy and current
  implementations. Current method uses parameter-injected environment helpers instead of Tempto query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`
- Reviewer note: Matched by current suite selection: `SuiteDeltaLakeOss` run 1 Exact-name mapping with normalized body
  similarity `0.85`.
- Audit status: `verified`

### `TestDeltaLakeAlterTableCompatibility`

- Owning migration commit: `Migrate TestDeltaLakeAlterTableCompatibility to JUnit`
- Current class added in same migration commit:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/deltalake/TestDeltaLakeAlterTableCompatibility.java`
- Legacy class removed in same migration commit:
  -
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/deltalake/TestDeltaLakeAlterTableCompatibility.java`
- Class-level environment requirement: `DeltaLakeMinioEnvironment`.
- Class-level tags: `DeltaLakeMinio`.
- Method inventory complete: Yes. Legacy methods: `10`. Current methods: `9`.
- Legacy helper/resource dependencies accounted for: Legacy class source reviewed directly. Cross-class or merged legacy
  coverage accounted for: `testTrinoAlterTablePreservesGeneratedColumn` -> covered in
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/deltalake/TestDeltaLakeAlterTableCompatibilityDatabricks.java` ->
  `testTrinoAlterTablePreservesGeneratedColumn`.
- Intentional differences summary: `HDP to Hive 3.1 migration`
- Method statuses present: `verified`.

#### Methods

##### `testAddColumnWithCommentOnTrino`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/deltalake/TestDeltaLakeAlterTableCompatibility.java` ->
  `testAddColumnWithCommentOnTrino`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/deltalake/TestDeltaLakeAlterTableCompatibility.java` ->
  `TestDeltaLakeAlterTableCompatibility.testAddColumnWithCommentOnTrino`
- Mapping type: `direct`
- Environment parity: Current class requires `DeltaLakeMinioEnvironment`. Routed by source review into
  `SuiteDeltaLakeOss` run 1.
- Tag parity: Current tags: `DeltaLakeMinio`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`, `ALTER`. Legacy setup operations: `CREATE`, `ALTER`.
- Action parity: Current action verbs: none. Legacy action verbs: none.
- Assertion parity: Current assertion helpers: `assertThat`, `isEqualTo`. Legacy assertion helpers: `assertThat`,
  `isEqualTo`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: Current method uses parameter-injected environment helpers instead of Tempto
  query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`
- Reviewer note: Matched by current suite selection: `SuiteDeltaLakeOss` run 1 Exact-name mapping with normalized body
  similarity `0.86`.
- Audit status: `verified`

##### `testRenameColumn`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/deltalake/TestDeltaLakeAlterTableCompatibility.java` ->
  `testRenameColumn`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/deltalake/TestDeltaLakeAlterTableCompatibility.java` ->
  `TestDeltaLakeAlterTableCompatibility.testRenameColumn`
- Mapping type: `direct`
- Environment parity: Current class requires `DeltaLakeMinioEnvironment`. Routed by source review into
  `SuiteDeltaLakeOss` run 1.
- Tag parity: Current tags: `DeltaLakeMinio`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`, `INSERT`, `ALTER`. Legacy setup operations: `CREATE`, `INSERT`,
  `ALTER`.
- Action parity: Current action verbs: `SELECT`. Legacy action verbs: `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `containsOnly`, `row`. Legacy assertion helpers:
  `assertThat`, `containsOnly`, `row`.
- Cleanup parity: Current cleanup operations: `DROP`. No legacy cleanup method body was available.
- Any observed difference, however small: SQL verb set differs: legacy ['CREATE', 'INSERT', 'SELECT', 'ALTER'] vs
  current ['CREATE', 'INSERT', 'SELECT', 'ALTER', 'DROP']. Current method uses parameter-injected environment helpers
  instead of Tempto query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`
- Reviewer note: Matched by current suite selection: `SuiteDeltaLakeOss` run 1 Exact-name mapping with normalized body
  similarity `0.80`.
- Audit status: `verified`

##### `testRenamePartitionedColumn`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/deltalake/TestDeltaLakeAlterTableCompatibility.java` ->
  `testRenamePartitionedColumn`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/deltalake/TestDeltaLakeAlterTableCompatibility.java` ->
  `TestDeltaLakeAlterTableCompatibility.testRenamePartitionedColumn`
- Mapping type: `direct`
- Environment parity: Current class requires `DeltaLakeMinioEnvironment`. Routed by source review into
  `SuiteDeltaLakeOss` run 1.
- Tag parity: Current tags: `DeltaLakeMinio`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`, `INSERT`, `ALTER`. Legacy setup operations: `CREATE`, `INSERT`,
  `ALTER`.
- Action parity: Current action verbs: `SELECT`. Legacy action verbs: `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `containsOnly`, `row`. Legacy assertion helpers:
  `assertThat`, `containsOnly`, `row`.
- Cleanup parity: Current cleanup operations: `DROP`. No legacy cleanup method body was available.
- Any observed difference, however small: SQL verb set differs: legacy ['CREATE', 'INSERT', 'SELECT', 'ALTER'] vs
  current ['CREATE', 'INSERT', 'SELECT', 'ALTER', 'DROP']. Current method uses parameter-injected environment helpers
  instead of Tempto query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`
- Reviewer note: Matched by current suite selection: `SuiteDeltaLakeOss` run 1 Exact-name mapping with normalized body
  similarity `0.82`.
- Audit status: `verified`

##### `testDropNotNullConstraint`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/deltalake/TestDeltaLakeAlterTableCompatibility.java` ->
  `testDropNotNullConstraint`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/deltalake/TestDeltaLakeAlterTableCompatibility.java` ->
  `TestDeltaLakeAlterTableCompatibility.testDropNotNullConstraint`
- Mapping type: `direct`
- Environment parity: Current class requires `DeltaLakeMinioEnvironment`. Routed by source review into
  `SuiteDeltaLakeOss` run 1.
- Tag parity: Current tags: `DeltaLakeMinio`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: none. No legacy setup method body was available.
- Action parity: Current action verbs: none. No legacy action method body was available.
- Assertion parity: Current assertion helpers: none. No legacy assertion method body was available.
- Cleanup parity: Current cleanup operations: none. No legacy cleanup method body was available.
- Any observed difference, however small: No method-specific difference identified beyond the documented framework
  baseline.
- Known intentional difference: None.
- Reviewer note: Matched by current suite selection: `SuiteDeltaLakeOss` run 1 High normalized body similarity `0.84`.
- Audit status: `verified`

##### `testCommentOnTable`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/deltalake/TestDeltaLakeAlterTableCompatibility.java` ->
  `testCommentOnTable`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/deltalake/TestDeltaLakeAlterTableCompatibility.java` ->
  `TestDeltaLakeAlterTableCompatibility.testCommentOnTable`
- Mapping type: `direct`
- Environment parity: Current class requires `DeltaLakeMinioEnvironment`. Routed by source review into
  `SuiteDeltaLakeOss` run 1.
- Tag parity: Current tags: `DeltaLakeMinio`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`. Legacy setup operations: `CREATE`.
- Action parity: Current action verbs: none. Legacy action verbs: none.
- Assertion parity: Current assertion helpers: `assertThat`, `isEqualTo`. Legacy assertion helpers: `assertThat`,
  `isEqualTo`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: Current method uses parameter-injected environment helpers instead of Tempto
  query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`
- Reviewer note: Matched by current suite selection: `SuiteDeltaLakeOss` run 1 Exact-name mapping with normalized body
  similarity `0.82`.
- Audit status: `verified`

##### `testCommentOnColumn`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/deltalake/TestDeltaLakeAlterTableCompatibility.java` ->
  `testCommentOnColumn`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/deltalake/TestDeltaLakeAlterTableCompatibility.java` ->
  `TestDeltaLakeAlterTableCompatibility.testCommentOnColumn`
- Mapping type: `direct`
- Environment parity: Current class requires `DeltaLakeMinioEnvironment`. Routed by source review into
  `SuiteDeltaLakeOss` run 1.
- Tag parity: Current tags: `DeltaLakeMinio`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`. Legacy setup operations: `CREATE`.
- Action parity: Current action verbs: none. Legacy action verbs: none.
- Assertion parity: Current assertion helpers: `assertThat`, `isEqualTo`. Legacy assertion helpers: `assertThat`,
  `isEqualTo`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: Current method uses parameter-injected environment helpers instead of Tempto
  query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`
- Reviewer note: Matched by current suite selection: `SuiteDeltaLakeOss` run 1 Exact-name mapping with normalized body
  similarity `0.86`.
- Audit status: `verified`

##### `testTrinoPreservesReaderAndWriterVersions`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/deltalake/TestDeltaLakeAlterTableCompatibility.java` ->
  `testTrinoPreservesReaderAndWriterVersions`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/deltalake/TestDeltaLakeAlterTableCompatibility.java` ->
  `TestDeltaLakeAlterTableCompatibility.testTrinoPreservesReaderAndWriterVersions`
- Mapping type: `direct`
- Environment parity: Current class requires `DeltaLakeMinioEnvironment`. Routed by source review into
  `SuiteDeltaLakeOss` run 1.
- Tag parity: Current tags: `DeltaLakeMinio`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`, `ALTER`, `INSERT`, `UPDATE`. Legacy setup operations: `CREATE`,
  `ALTER`, `INSERT`, `UPDATE`.
- Action parity: Current action verbs: `MERGE`, `SHOW`. Legacy action verbs: `MERGE`, `SHOW`.
- Assertion parity: Current assertion helpers: `assertThat`, `isEqualTo`. Legacy assertion helpers: `assertThat`,
  `isEqualTo`.
- Cleanup parity: Current cleanup operations: `DELETE`, `DROP`. Legacy cleanup operations: `DELETE`, `DROP`.
- Any observed difference, however small: Current method uses parameter-injected environment helpers instead of Tempto
  query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`
- Reviewer note: Matched by current suite selection: `SuiteDeltaLakeOss` run 1 Exact-name mapping with normalized body
  similarity `0.88`.
- Audit status: `verified`

##### `testTrinoPreservesTableFeature`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/deltalake/TestDeltaLakeAlterTableCompatibility.java` ->
  `testTrinoPreservesTableFeature`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/deltalake/TestDeltaLakeAlterTableCompatibility.java` ->
  `TestDeltaLakeAlterTableCompatibility.testTrinoPreservesTableFeature`
- Mapping type: `direct`
- Environment parity: Current class requires `DeltaLakeMinioEnvironment`. Routed by source review into
  `SuiteDeltaLakeOss` run 1.
- Tag parity: Current tags: `DeltaLakeMinio`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`, `ALTER`, `INSERT`, `UPDATE`. Legacy setup operations: `CREATE`,
  `ALTER`, `INSERT`, `UPDATE`.
- Action parity: Current action verbs: `MERGE`. Legacy action verbs: `MERGE`.
- Assertion parity: Current assertion helpers: `assertThat`, `isEqualTo`. Legacy assertion helpers: `assertThat`,
  `isEqualTo`.
- Cleanup parity: Current cleanup operations: `DELETE`, `DROP`. Legacy cleanup operations: `DELETE`.
- Any observed difference, however small: SQL verb set differs:
  legacy ['CREATE', 'ALTER', 'INSERT', 'UPDATE', 'DELETE', 'MERGE'] vs
  current ['CREATE', 'ALTER', 'INSERT', 'UPDATE', 'DELETE', 'MERGE', 'DROP']. Current method uses parameter-injected
  environment helpers instead of Tempto query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`
- Reviewer note: Matched by current suite selection: `SuiteDeltaLakeOss` run 1 Exact-name mapping with normalized body
  similarity `0.76`.
- Audit status: `verified`

##### `testTypeWideningInteger`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/deltalake/TestDeltaLakeAlterTableCompatibility.java` ->
  `testTypeWideningInteger`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/deltalake/TestDeltaLakeAlterTableCompatibility.java` ->
  `TestDeltaLakeAlterTableCompatibility.testTypeWideningInteger`
- Mapping type: `direct`
- Environment parity: Current class requires `DeltaLakeMinioEnvironment`. Routed by source review into
  `SuiteDeltaLakeOss` run 1.
- Tag parity: Current tags: `DeltaLakeMinio`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`, `INSERT`, `ALTER`, `UPDATE`. Legacy setup operations: `CREATE`,
  `INSERT`, `ALTER`, `UPDATE`.
- Action parity: Current action verbs: `SELECT`. Legacy action verbs: `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `containsOnly`, `row`. Legacy assertion helpers:
  `assertThat`, `containsOnly`, `row`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: Current method uses parameter-injected environment helpers instead of Tempto
  query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`
- Reviewer note: Matched by current suite selection: `SuiteDeltaLakeOss` run 1 Exact-name mapping with normalized body
  similarity `0.88`.
- Audit status: `verified`

### `TestDeltaLakeCaseInsensitiveMapping`

- Owning migration commit: `Migrate TestDeltaLakeCaseInsensitiveMapping to JUnit`
- Current class added in same migration commit:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/deltalake/TestDeltaLakeCaseInsensitiveMapping.java`
- Legacy class removed in same migration commit:
  -
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/deltalake/TestDeltaLakeCaseInsensitiveMapping.java`
- Class-level environment requirement: `DeltaLakeMinioEnvironment`.
- Class-level tags: `DeltaLakeMinio`.
- Method inventory complete: Yes. Legacy methods: `6`. Current methods: `4`.
- Legacy helper/resource dependencies accounted for: Legacy class source reviewed directly. Cross-class or merged legacy
  coverage accounted for: `testGeneratedColumnWithNonLowerCaseColumnName` -> covered in
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/deltalake/TestDeltaLakeCaseInsensitiveMappingDatabricks.java` ->
  `testGeneratedColumnWithNonLowerCaseColumnName`; `testIdentityColumnWithNonLowerCaseColumnName` -> covered in
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/deltalake/TestDeltaLakeCaseInsensitiveMappingDatabricks.java` ->
  `testIdentityColumnWithNonLowerCaseColumnName`.
- Intentional differences summary: `HDP to Hive 3.1 migration`
- Method statuses present: `verified`.

#### Methods

##### `testNonLowercaseColumnNames`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/deltalake/TestDeltaLakeCaseInsensitiveMapping.java` ->
  `testNonLowercaseColumnNames`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/deltalake/TestDeltaLakeCaseInsensitiveMapping.java` ->
  `TestDeltaLakeCaseInsensitiveMapping.testNonLowercaseColumnNames`
- Mapping type: `direct`
- Environment parity: Current class requires `DeltaLakeMinioEnvironment`. Routed by source review into
  `SuiteDeltaLakeOss` run 1.
- Tag parity: Current tags: `DeltaLakeMinio`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`, `INSERT`. Legacy setup operations: `CREATE`, `INSERT`.
- Action parity: Current action verbs: `SHOW`. Legacy action verbs: `SHOW`.
- Assertion parity: Current assertion helpers: `assertThat`, `containsOnly`, `row`. Legacy assertion helpers:
  `assertThat`, `containsOnly`, `row`.
- Cleanup parity: Current cleanup operations: `DROP`. No legacy cleanup method body was available.
- Any observed difference, however small: SQL verb set differs: legacy ['CREATE', 'INSERT', 'SHOW'] vs
  current ['CREATE', 'INSERT', 'SHOW', 'DROP']. Current method uses parameter-injected environment helpers instead of
  Tempto query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`
- Reviewer note: Matched by current suite selection: `SuiteDeltaLakeOss` run 1 Exact-name mapping with normalized body
  similarity `0.65`.
- Audit status: `verified`

##### `testNonLowercaseFieldNames`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/deltalake/TestDeltaLakeCaseInsensitiveMapping.java` ->
  `testNonLowercaseFieldNames`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/deltalake/TestDeltaLakeCaseInsensitiveMapping.java` ->
  `TestDeltaLakeCaseInsensitiveMapping.testNonLowercaseFieldNames`
- Mapping type: `direct`
- Environment parity: Current class requires `DeltaLakeMinioEnvironment`. Routed by source review into
  `SuiteDeltaLakeOss` run 1.
- Tag parity: Current tags: `DeltaLakeMinio`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`, `INSERT`. Legacy setup operations: `CREATE`, `INSERT`.
- Action parity: Current action verbs: `SELECT`, `SHOW`. Legacy action verbs: `SELECT`, `SHOW`.
- Assertion parity: Current assertion helpers: `assertThat`, `containsOnly`, `row`. Legacy assertion helpers:
  `assertThat`, `containsOnly`, `row`.
- Cleanup parity: Current cleanup operations: `DROP`. No legacy cleanup method body was available.
- Any observed difference, however small: SQL verb set differs: legacy ['CREATE', 'INSERT', 'SELECT', 'SHOW'] vs
  current ['CREATE', 'INSERT', 'SELECT', 'SHOW', 'DROP']. Current method uses parameter-injected environment helpers
  instead of Tempto query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`
- Reviewer note: Matched by current suite selection: `SuiteDeltaLakeOss` run 1 Exact-name mapping with normalized body
  similarity `0.80`.
- Audit status: `verified`

##### `testColumnCommentWithNonLowerCaseColumnName`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/deltalake/TestDeltaLakeCaseInsensitiveMapping.java` ->
  `testColumnCommentWithNonLowerCaseColumnName`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/deltalake/TestDeltaLakeCaseInsensitiveMapping.java` ->
  `TestDeltaLakeCaseInsensitiveMapping.testColumnCommentWithNonLowerCaseColumnName`
- Mapping type: `direct`
- Environment parity: Current class requires `DeltaLakeMinioEnvironment`. Routed by source review into
  `SuiteDeltaLakeOss` run 1.
- Tag parity: Current tags: `DeltaLakeMinio`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`. Legacy setup operations: `CREATE`.
- Action parity: Current action verbs: none. Legacy action verbs: none.
- Assertion parity: Current assertion helpers: `assertThat`, `isEqualTo`. Legacy assertion helpers: `assertThat`,
  `isEqualTo`.
- Cleanup parity: Current cleanup operations: `DROP`. No legacy cleanup method body was available.
- Any observed difference, however small: SQL verb set differs: legacy ['CREATE'] vs current ['CREATE', 'DROP']. Current
  method uses parameter-injected environment helpers instead of Tempto query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`
- Reviewer note: Matched by current suite selection: `SuiteDeltaLakeOss` run 1 Exact-name mapping with normalized body
  similarity `0.82`.
- Audit status: `verified`

##### `testNotNullColumnWithNonLowerCaseColumnName`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/deltalake/TestDeltaLakeCaseInsensitiveMapping.java` ->
  `testNotNullColumnWithNonLowerCaseColumnName`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/deltalake/TestDeltaLakeCaseInsensitiveMapping.java` ->
  `TestDeltaLakeCaseInsensitiveMapping.testNotNullColumnWithNonLowerCaseColumnName`
- Mapping type: `direct`
- Environment parity: Current class requires `DeltaLakeMinioEnvironment`. Routed by source review into
  `SuiteDeltaLakeOss` run 1.
- Tag parity: Current tags: `DeltaLakeMinio`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`, `INSERT`. Legacy setup operations: `CREATE`, `INSERT`.
- Action parity: Current action verbs: none. Legacy action verbs: none.
- Assertion parity: Current assertion helpers: `assertThatThrownBy`, `hasMessageContaining`. Legacy assertion helpers:
  `assertThatThrownBy`, `hasMessageContaining`.
- Cleanup parity: Current cleanup operations: `DROP`. No legacy cleanup method body was available.
- Any observed difference, however small: SQL verb set differs: legacy ['CREATE', 'INSERT'] vs
  current ['CREATE', 'INSERT', 'DROP']. Current method uses parameter-injected environment helpers instead of Tempto
  query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`
- Reviewer note: Matched by current suite selection: `SuiteDeltaLakeOss` run 1 Exact-name mapping with normalized body
  similarity `0.74`.
- Audit status: `verified`

### `TestDeltaLakeChangeDataFeedCompatibility`

- Owning migration commit: `Migrate TestDeltaLakeChangeDataFeedCompatibility to JUnit`
- Current class added in same migration commit:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/deltalake/TestDeltaLakeChangeDataFeedCompatibility.java`
- Legacy class removed in same migration commit:
  -
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/deltalake/TestDeltaLakeChangeDataFeedCompatibility.java`
- Class-level environment requirement: `DeltaLakeMinioEnvironment`.
- Class-level tags: `DeltaLakeMinio`.
- Method inventory complete: Yes. Legacy methods: `17`. Current methods: `17`.
- Legacy helper/resource dependencies accounted for: Legacy class source reviewed directly.
- Intentional differences summary: `HDP to Hive 3.1 migration`
- Method statuses present: `verified`.

#### Methods

##### `testUpdateTableWithCdf`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/deltalake/TestDeltaLakeChangeDataFeedCompatibility.java` ->
  `testUpdateTableWithCdf`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/deltalake/TestDeltaLakeChangeDataFeedCompatibility.java` ->
  `TestDeltaLakeChangeDataFeedCompatibility.testUpdateTableWithCdf`
- Mapping type: `direct`
- Environment parity: Current class requires `DeltaLakeMinioEnvironment`. Routed by source review into
  `SuiteDeltaLakeOss` run 1.
- Tag parity: Current tags: `DeltaLakeMinio`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`, `INSERT`, `UPDATE`. Legacy setup operations: `CREATE`, `INSERT`,
  `UPDATE`.
- Action parity: Current action verbs: `WITH`, `SHOW`, `SELECT`. Legacy action verbs: `WITH`, `SHOW`, `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `contains`, `containsOnly`, `row`. Legacy assertion
  helpers: `assertThat`, `contains`, `containsOnly`, `row`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: Current method uses parameter-injected environment helpers instead of Tempto
  query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`
- Reviewer note: Matched by current suite selection: `SuiteDeltaLakeOss` run 1 Exact-name mapping with normalized body
  similarity `0.90`.
- Audit status: `verified`

##### `testUpdateTableWithChangeDataFeedWriterFeature`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/deltalake/TestDeltaLakeChangeDataFeedCompatibility.java` ->
  `testUpdateTableWithChangeDataFeedWriterFeature`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/deltalake/TestDeltaLakeChangeDataFeedCompatibility.java` ->
  `TestDeltaLakeChangeDataFeedCompatibility.testUpdateTableWithChangeDataFeedWriterFeature`
- Mapping type: `direct`
- Environment parity: Current class requires `DeltaLakeMinioEnvironment`. Routed by source review into
  `SuiteDeltaLakeOss` run 1.
- Tag parity: Current tags: `DeltaLakeMinio`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`, `INSERT`, `UPDATE`, `ALTER`. Legacy setup operations: `CREATE`,
  `INSERT`, `UPDATE`, `ALTER`.
- Action parity: Current action verbs: `SHOW`, `SELECT`. Legacy action verbs: `SHOW`, `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `assertThatThrownBy`, `contains`, `containsOnly`, `row`.
  Legacy assertion helpers: `assertQueryFailure`, `assertThat`, `contains`, `containsOnly`, `row`.
- Cleanup parity: Current cleanup operations: `DROP`. No legacy cleanup method body was available.
- Any observed difference, however small: SQL verb set differs:
  legacy ['CREATE', 'SHOW', 'INSERT', 'UPDATE', 'SELECT', 'ALTER'] vs
  current ['CREATE', 'SHOW', 'INSERT', 'UPDATE', 'SELECT', 'ALTER', 'DROP']. Assertion helper names differ between
  legacy and current implementations. Current method uses parameter-injected environment helpers instead of Tempto query
  executors.
- Known intentional difference: `HDP to Hive 3.1 migration`
- Reviewer note: Matched by current suite selection: `SuiteDeltaLakeOss` run 1 Exact-name mapping with normalized body
  similarity `0.74`.
- Audit status: `verified`

##### `testUpdateCdfTableWithNonLowercaseColumn`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/deltalake/TestDeltaLakeChangeDataFeedCompatibility.java` ->
  `testUpdateCdfTableWithNonLowercaseColumn`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/deltalake/TestDeltaLakeChangeDataFeedCompatibility.java` ->
  `TestDeltaLakeChangeDataFeedCompatibility.testUpdateCdfTableWithNonLowercaseColumn`
- Mapping type: `direct`
- Environment parity: Current class requires `DeltaLakeMinioEnvironment`. Routed by source review into
  `SuiteDeltaLakeOss` run 1.
- Tag parity: Current tags: `DeltaLakeMinio`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`, `INSERT`, `UPDATE`. Legacy setup operations: `CREATE`, `INSERT`,
  `UPDATE`.
- Action parity: Current action verbs: `SELECT`. Legacy action verbs: `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `containsOnly`, `row`. Legacy assertion helpers:
  `assertThat`, `containsOnly`, `row`.
- Cleanup parity: Current cleanup operations: `DROP`. No legacy cleanup method body was available.
- Any observed difference, however small: SQL verb set differs: legacy ['CREATE', 'INSERT', 'UPDATE', 'SELECT'] vs
  current ['CREATE', 'INSERT', 'UPDATE', 'SELECT', 'DROP']. Current method uses parameter-injected environment helpers
  instead of Tempto query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`
- Reviewer note: Matched by current suite selection: `SuiteDeltaLakeOss` run 1 Exact-name mapping with normalized body
  similarity `0.91`.
- Audit status: `verified`

##### `testUpdatePartitionedTableWithCdf`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/deltalake/TestDeltaLakeChangeDataFeedCompatibility.java` ->
  `testUpdatePartitionedTableWithCdf`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/deltalake/TestDeltaLakeChangeDataFeedCompatibility.java` ->
  `TestDeltaLakeChangeDataFeedCompatibility.testUpdatePartitionedTableWithCdf`
- Mapping type: `direct`
- Environment parity: Current class requires `DeltaLakeMinioEnvironment`. Routed by source review into
  `SuiteDeltaLakeOss` run 1.
- Tag parity: Current tags: `DeltaLakeMinio`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`, `INSERT`, `UPDATE`. Legacy setup operations: `CREATE`, `INSERT`,
  `UPDATE`.
- Action parity: Current action verbs: `SELECT`. Legacy action verbs: `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `containsOnly`, `row`. Legacy assertion helpers:
  `assertThat`, `containsOnly`, `row`.
- Cleanup parity: Current cleanup operations: `DROP`. No legacy cleanup method body was available.
- Any observed difference, however small: SQL verb set differs: legacy ['CREATE', 'INSERT', 'UPDATE', 'SELECT'] vs
  current ['CREATE', 'INSERT', 'UPDATE', 'SELECT', 'DROP']. Current method uses parameter-injected environment helpers
  instead of Tempto query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`
- Reviewer note: Matched by current suite selection: `SuiteDeltaLakeOss` run 1 Exact-name mapping with normalized body
  similarity `0.91`.
- Audit status: `verified`

##### `testUpdateTableWithManyRowsInsertedInTheSameQueryAndCdfEnabled`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/deltalake/TestDeltaLakeChangeDataFeedCompatibility.java` ->
  `testUpdateTableWithManyRowsInsertedInTheSameQueryAndCdfEnabled`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/deltalake/TestDeltaLakeChangeDataFeedCompatibility.java` ->
  `TestDeltaLakeChangeDataFeedCompatibility.testUpdateTableWithManyRowsInsertedInTheSameQueryAndCdfEnabled`
- Mapping type: `direct`
- Environment parity: Current class requires `DeltaLakeMinioEnvironment`. Routed by source review into
  `SuiteDeltaLakeOss` run 1.
- Tag parity: Current tags: `DeltaLakeMinio`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`, `INSERT`, `UPDATE`. Legacy setup operations: `CREATE`, `INSERT`,
  `UPDATE`.
- Action parity: Current action verbs: `SELECT`. Legacy action verbs: `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `containsOnly`, `row`. Legacy assertion helpers:
  `assertThat`, `containsOnly`, `row`.
- Cleanup parity: Current cleanup operations: `DROP`. No legacy cleanup method body was available.
- Any observed difference, however small: SQL verb set differs: legacy ['CREATE', 'INSERT', 'UPDATE', 'SELECT'] vs
  current ['CREATE', 'INSERT', 'UPDATE', 'SELECT', 'DROP']. Current method uses parameter-injected environment helpers
  instead of Tempto query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`
- Reviewer note: Matched by current suite selection: `SuiteDeltaLakeOss` run 1 Exact-name mapping with normalized body
  similarity `0.89`.
- Audit status: `verified`

##### `testUpdatePartitionedTableWithManyRowsInsertedInTheSameRequestAndCdfEnabled`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/deltalake/TestDeltaLakeChangeDataFeedCompatibility.java` ->
  `testUpdatePartitionedTableWithManyRowsInsertedInTheSameRequestAndCdfEnabled`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/deltalake/TestDeltaLakeChangeDataFeedCompatibility.java` ->
  `TestDeltaLakeChangeDataFeedCompatibility.testUpdatePartitionedTableWithManyRowsInsertedInTheSameRequestAndCdfEnabled`
- Mapping type: `direct`
- Environment parity: Current class requires `DeltaLakeMinioEnvironment`. Routed by source review into
  `SuiteDeltaLakeOss` run 1.
- Tag parity: Current tags: `DeltaLakeMinio`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`, `INSERT`, `UPDATE`. Legacy setup operations: `CREATE`, `INSERT`,
  `UPDATE`.
- Action parity: Current action verbs: `SELECT`. Legacy action verbs: `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `containsOnly`, `row`. Legacy assertion helpers:
  `assertThat`, `containsOnly`, `row`.
- Cleanup parity: Current cleanup operations: `DROP`. No legacy cleanup method body was available.
- Any observed difference, however small: SQL verb set differs: legacy ['CREATE', 'INSERT', 'UPDATE', 'SELECT'] vs
  current ['CREATE', 'INSERT', 'UPDATE', 'SELECT', 'DROP']. Current method uses parameter-injected environment helpers
  instead of Tempto query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`
- Reviewer note: Matched by current suite selection: `SuiteDeltaLakeOss` run 1 Exact-name mapping with normalized body
  similarity `0.92`.
- Audit status: `verified`

##### `testUpdatePartitionedTableCdfEnabledAndPartitioningColumnUpdated`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/deltalake/TestDeltaLakeChangeDataFeedCompatibility.java` ->
  `testUpdatePartitionedTableCdfEnabledAndPartitioningColumnUpdated`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/deltalake/TestDeltaLakeChangeDataFeedCompatibility.java` ->
  `TestDeltaLakeChangeDataFeedCompatibility.testUpdatePartitionedTableCdfEnabledAndPartitioningColumnUpdated`
- Mapping type: `direct`
- Environment parity: Current class requires `DeltaLakeMinioEnvironment`. Routed by source review into
  `SuiteDeltaLakeOss` run 1.
- Tag parity: Current tags: `DeltaLakeMinio`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`, `INSERT`, `UPDATE`. Legacy setup operations: `CREATE`, `INSERT`,
  `UPDATE`.
- Action parity: Current action verbs: `SELECT`. Legacy action verbs: `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `containsOnly`, `row`. Legacy assertion helpers:
  `assertThat`, `containsOnly`, `row`.
- Cleanup parity: Current cleanup operations: `DROP`. No legacy cleanup method body was available.
- Any observed difference, however small: SQL verb set differs: legacy ['CREATE', 'INSERT', 'UPDATE', 'SELECT'] vs
  current ['CREATE', 'INSERT', 'UPDATE', 'SELECT', 'DROP']. Current method uses parameter-injected environment helpers
  instead of Tempto query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`
- Reviewer note: Matched by current suite selection: `SuiteDeltaLakeOss` run 1 Exact-name mapping with normalized body
  similarity `0.88`.
- Audit status: `verified`

##### `testUpdateTableWithCdfEnabledAfterTableIsAlreadyCreated`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/deltalake/TestDeltaLakeChangeDataFeedCompatibility.java` ->
  `testUpdateTableWithCdfEnabledAfterTableIsAlreadyCreated`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/deltalake/TestDeltaLakeChangeDataFeedCompatibility.java` ->
  `TestDeltaLakeChangeDataFeedCompatibility.testUpdateTableWithCdfEnabledAfterTableIsAlreadyCreated`
- Mapping type: `direct`
- Environment parity: Current class requires `DeltaLakeMinioEnvironment`. Routed by source review into
  `SuiteDeltaLakeOss` run 1.
- Tag parity: Current tags: `DeltaLakeMinio`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`, `INSERT`, `UPDATE`, `ALTER`. Legacy setup operations: `CREATE`,
  `INSERT`, `UPDATE`, `ALTER`.
- Action parity: Current action verbs: `DESCRIBE`, `SELECT`. Legacy action verbs: `DESCRIBE`, `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `assertThatThrownBy`, `containsOnly`, `row`. Legacy
  assertion helpers: `assertQueryFailure`, `assertThat`, `containsOnly`, `row`.
- Cleanup parity: Current cleanup operations: `DROP`. No legacy cleanup method body was available.
- Any observed difference, however small: SQL verb set differs:
  legacy ['CREATE', 'INSERT', 'UPDATE', 'ALTER', 'DESCRIBE', 'SELECT'] vs
  current ['CREATE', 'INSERT', 'UPDATE', 'ALTER', 'DESCRIBE', 'SELECT', 'DROP']. Assertion helper names differ between
  legacy and current implementations. Current method uses parameter-injected environment helpers instead of Tempto query
  executors.
- Known intentional difference: `HDP to Hive 3.1 migration`
- Reviewer note: Matched by current suite selection: `SuiteDeltaLakeOss` run 1 Exact-name mapping with normalized body
  similarity `0.86`.
- Audit status: `verified`

##### `testDeleteFromTableWithCdf`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/deltalake/TestDeltaLakeChangeDataFeedCompatibility.java` ->
  `testDeleteFromTableWithCdf`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/deltalake/TestDeltaLakeChangeDataFeedCompatibility.java` ->
  `TestDeltaLakeChangeDataFeedCompatibility.testDeleteFromTableWithCdf`
- Mapping type: `direct`
- Environment parity: Current class requires `DeltaLakeMinioEnvironment`. Routed by source review into
  `SuiteDeltaLakeOss` run 1.
- Tag parity: Current tags: `DeltaLakeMinio`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`, `INSERT`. Legacy setup operations: `CREATE`, `INSERT`.
- Action parity: Current action verbs: `SELECT`. Legacy action verbs: `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `containsOnly`, `row`. Legacy assertion helpers:
  `assertThat`, `containsOnly`, `row`.
- Cleanup parity: Current cleanup operations: `DELETE`, `DROP`. Legacy cleanup operations: `DELETE`.
- Any observed difference, however small: SQL verb set differs: legacy ['CREATE', 'INSERT', 'DELETE', 'SELECT'] vs
  current ['CREATE', 'INSERT', 'DELETE', 'SELECT', 'DROP']. Current method uses parameter-injected environment helpers
  instead of Tempto query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`
- Reviewer note: Matched by current suite selection: `SuiteDeltaLakeOss` run 1 Exact-name mapping with normalized body
  similarity `0.90`.
- Audit status: `verified`

##### `testMergeUpdateIntoTableWithCdfEnabled`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/deltalake/TestDeltaLakeChangeDataFeedCompatibility.java` ->
  `testMergeUpdateIntoTableWithCdfEnabled`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/deltalake/TestDeltaLakeChangeDataFeedCompatibility.java` ->
  `TestDeltaLakeChangeDataFeedCompatibility.testMergeUpdateIntoTableWithCdfEnabled`
- Mapping type: `direct`
- Environment parity: Current class requires `DeltaLakeMinioEnvironment`. Routed by source review into
  `SuiteDeltaLakeOss` run 1.
- Tag parity: Current tags: `DeltaLakeMinio`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`, `INSERT`. Legacy setup operations: `CREATE`, `INSERT`.
- Action parity: Current action verbs: `MERGE`, `SELECT`. Legacy action verbs: `MERGE`, `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `containsOnly`, `row`. Legacy assertion helpers:
  `assertThat`, `containsOnly`, `row`.
- Cleanup parity: Current cleanup operations: `DROP`. No legacy cleanup method body was available.
- Any observed difference, however small: SQL verb set differs: legacy ['CREATE', 'INSERT', 'MERGE', 'SELECT'] vs
  current ['CREATE', 'INSERT', 'MERGE', 'SELECT', 'DROP']. Current method uses parameter-injected environment helpers
  instead of Tempto query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`
- Reviewer note: Matched by current suite selection: `SuiteDeltaLakeOss` run 1 Exact-name mapping with normalized body
  similarity `0.90`.
- Audit status: `verified`

##### `testMergeDeleteIntoTableWithCdfEnabled`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/deltalake/TestDeltaLakeChangeDataFeedCompatibility.java` ->
  `testMergeDeleteIntoTableWithCdfEnabled`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/deltalake/TestDeltaLakeChangeDataFeedCompatibility.java` ->
  `TestDeltaLakeChangeDataFeedCompatibility.testMergeDeleteIntoTableWithCdfEnabled`
- Mapping type: `direct`
- Environment parity: Current class requires `DeltaLakeMinioEnvironment`. Routed by source review into
  `SuiteDeltaLakeOss` run 1.
- Tag parity: Current tags: `DeltaLakeMinio`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`, `INSERT`. Legacy setup operations: `CREATE`, `INSERT`.
- Action parity: Current action verbs: `MERGE`, `SELECT`. Legacy action verbs: `MERGE`, `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `containsOnly`, `row`. Legacy assertion helpers:
  `assertThat`, `containsOnly`, `row`.
- Cleanup parity: Current cleanup operations: `DELETE`, `DROP`. Legacy cleanup operations: `DELETE`.
- Any observed difference, however small: SQL verb set differs: legacy ['CREATE', 'INSERT', 'MERGE', 'SELECT', 'DELETE']
  vs current ['CREATE', 'INSERT', 'MERGE', 'SELECT', 'DELETE', 'DROP']. Current method uses parameter-injected
  environment helpers instead of Tempto query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`
- Reviewer note: Matched by current suite selection: `SuiteDeltaLakeOss` run 1 Exact-name mapping with normalized body
  similarity `0.89`.
- Audit status: `verified`

##### `testMergeMixedDeleteAndUpdateIntoTableWithCdfEnabled`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/deltalake/TestDeltaLakeChangeDataFeedCompatibility.java` ->
  `testMergeMixedDeleteAndUpdateIntoTableWithCdfEnabled`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/deltalake/TestDeltaLakeChangeDataFeedCompatibility.java` ->
  `TestDeltaLakeChangeDataFeedCompatibility.testMergeMixedDeleteAndUpdateIntoTableWithCdfEnabled`
- Mapping type: `direct`
- Environment parity: Current class requires `DeltaLakeMinioEnvironment`. Routed by source review into
  `SuiteDeltaLakeOss` run 1.
- Tag parity: Current tags: `DeltaLakeMinio`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`, `INSERT`. Legacy setup operations: `CREATE`, `INSERT`.
- Action parity: Current action verbs: `MERGE`, `SELECT`. Legacy action verbs: `MERGE`, `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `containsOnly`, `row`. Legacy assertion helpers:
  `assertThat`, `containsOnly`, `row`.
- Cleanup parity: Current cleanup operations: `DELETE`, `DROP`. Legacy cleanup operations: `DELETE`.
- Any observed difference, however small: SQL verb set differs: legacy ['CREATE', 'INSERT', 'MERGE', 'SELECT', 'DELETE']
  vs current ['CREATE', 'INSERT', 'MERGE', 'SELECT', 'DELETE', 'DROP']. Current method uses parameter-injected
  environment helpers instead of Tempto query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`
- Reviewer note: Matched by current suite selection: `SuiteDeltaLakeOss` run 1 Exact-name mapping with normalized body
  similarity `0.92`.
- Audit status: `verified`

##### `testDeleteFromNullPartitionWithCdfEnabled`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/deltalake/TestDeltaLakeChangeDataFeedCompatibility.java` ->
  `testDeleteFromNullPartitionWithCdfEnabled`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/deltalake/TestDeltaLakeChangeDataFeedCompatibility.java` ->
  `TestDeltaLakeChangeDataFeedCompatibility.testDeleteFromNullPartitionWithCdfEnabled`
- Mapping type: `direct`
- Environment parity: Current class requires `DeltaLakeMinioEnvironment`. Routed by source review into
  `SuiteDeltaLakeOss` run 1.
- Tag parity: Current tags: `DeltaLakeMinio`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`, `INSERT`. Legacy setup operations: `CREATE`, `INSERT`.
- Action parity: Current action verbs: `SELECT`. Legacy action verbs: `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `containsOnly`, `row`. Legacy assertion helpers:
  `assertThat`, `containsOnly`, `row`.
- Cleanup parity: Current cleanup operations: `DELETE`, `DROP`. Legacy cleanup operations: `DELETE`.
- Any observed difference, however small: SQL verb set differs: legacy ['CREATE', 'INSERT', 'DELETE', 'SELECT'] vs
  current ['CREATE', 'INSERT', 'DELETE', 'SELECT', 'DROP']. Current method uses parameter-injected environment helpers
  instead of Tempto query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`
- Reviewer note: Matched by current suite selection: `SuiteDeltaLakeOss` run 1 Exact-name mapping with normalized body
  similarity `0.91`.
- Audit status: `verified`

##### `testTurningOnAndOffCdfFromTrino`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/deltalake/TestDeltaLakeChangeDataFeedCompatibility.java` ->
  `testTurningOnAndOffCdfFromTrino`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/deltalake/TestDeltaLakeChangeDataFeedCompatibility.java` ->
  `TestDeltaLakeChangeDataFeedCompatibility.testTurningOnAndOffCdfFromTrino`
- Mapping type: `direct`
- Environment parity: Current class requires `DeltaLakeMinioEnvironment`. Routed by source review into
  `SuiteDeltaLakeOss` run 1.
- Tag parity: Current tags: `DeltaLakeMinio`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`, `INSERT`, `UPDATE`, `ALTER`. Legacy setup operations: `CREATE`,
  `INSERT`, `UPDATE`, `ALTER`.
- Action parity: Current action verbs: `WITH`, `SHOW`, `SELECT`. Legacy action verbs: `WITH`, `SHOW`, `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `assertThatThrownBy`, `contains`, `containsOnly`, `row`.
  Legacy assertion helpers: `assertQueryFailure`, `assertThat`, `contains`, `containsOnly`, `row`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: Assertion helper names differ between legacy and current implementations.
  Current method uses parameter-injected environment helpers instead of Tempto query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`
- Reviewer note: Matched by current suite selection: `SuiteDeltaLakeOss` run 1 Exact-name mapping with normalized body
  similarity `0.82`.
- Audit status: `verified`

##### `testThatCdfDoesntWorkWhenPropertyIsNotSet`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/deltalake/TestDeltaLakeChangeDataFeedCompatibility.java` ->
  `testThatCdfDoesntWorkWhenPropertyIsNotSet`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/deltalake/TestDeltaLakeChangeDataFeedCompatibility.java` ->
  `TestDeltaLakeChangeDataFeedCompatibility.testThatCdfDoesntWorkWhenPropertyIsNotSet`
- Mapping type: `direct`
- Environment parity: Current class requires `DeltaLakeMinioEnvironment`. Routed by source review into
  `SuiteDeltaLakeOss` run 1.
- Tag parity: Current tags: `DeltaLakeMinio`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: none. No legacy setup method body was available.
- Action parity: Current action verbs: none. No legacy action method body was available.
- Assertion parity: Current assertion helpers: `assertThereIsNoCdfFileGenerated`. Legacy assertion helpers:
  `assertThereIsNoCdfFileGenerated`.
- Cleanup parity: Current cleanup operations: none. No legacy cleanup method body was available.
- Any observed difference, however small: No method-specific difference identified beyond the documented framework
  baseline.
- Known intentional difference: None.
- Reviewer note: Matched by current suite selection: `SuiteDeltaLakeOss` run 1 High normalized body similarity `0.94`.
- Audit status: `verified`

##### `testTrinoCanReadCdfEntriesGeneratedByDelta`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/deltalake/TestDeltaLakeChangeDataFeedCompatibility.java` ->
  `testTrinoCanReadCdfEntriesGeneratedByDelta`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/deltalake/TestDeltaLakeChangeDataFeedCompatibility.java` ->
  `TestDeltaLakeChangeDataFeedCompatibility.testTrinoCanReadCdfEntriesGeneratedByDelta`
- Mapping type: `direct`
- Environment parity: Current class requires `DeltaLakeMinioEnvironment`. Routed by source review into
  `SuiteDeltaLakeOss` run 1.
- Tag parity: Current tags: `DeltaLakeMinio`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`, `INSERT`, `UPDATE`. Legacy setup operations: `CREATE`, `INSERT`,
  `UPDATE`.
- Action parity: Current action verbs: `MERGE`, `SELECT`. Legacy action verbs: `MERGE`, `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `containsOnly`, `row`. Legacy assertion helpers:
  `assertThat`, `containsOnly`, `row`.
- Cleanup parity: Current cleanup operations: `DELETE`, `DROP`. Legacy cleanup operations: `DELETE`.
- Any observed difference, however small: SQL verb set differs:
  legacy ['CREATE', 'INSERT', 'MERGE', 'UPDATE', 'DELETE', 'SELECT'] vs
  current ['CREATE', 'INSERT', 'MERGE', 'UPDATE', 'DELETE', 'SELECT', 'DROP']. Current method uses parameter-injected
  environment helpers instead of Tempto query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`
- Reviewer note: Matched by current suite selection: `SuiteDeltaLakeOss` run 1 Exact-name mapping with normalized body
  similarity `0.90`.
- Audit status: `verified`

##### `testDeltaCanReadCdfEntriesGeneratedByTrino`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/deltalake/TestDeltaLakeChangeDataFeedCompatibility.java` ->
  `testDeltaCanReadCdfEntriesGeneratedByTrino`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/deltalake/TestDeltaLakeChangeDataFeedCompatibility.java` ->
  `TestDeltaLakeChangeDataFeedCompatibility.testDeltaCanReadCdfEntriesGeneratedByTrino`
- Mapping type: `direct`
- Environment parity: Current class requires `DeltaLakeMinioEnvironment`. Routed by source review into
  `SuiteDeltaLakeOss` run 1.
- Tag parity: Current tags: `DeltaLakeMinio`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`, `INSERT`, `UPDATE`. Legacy setup operations: `CREATE`, `INSERT`,
  `UPDATE`.
- Action parity: Current action verbs: `WITH`, `MERGE`, `SELECT`. Legacy action verbs: `WITH`, `MERGE`, `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `containsOnly`, `row`. Legacy assertion helpers:
  `assertThat`, `containsOnly`, `row`.
- Cleanup parity: Current cleanup operations: `DELETE`, `DROP`. Legacy cleanup operations: `DELETE`.
- Any observed difference, however small: SQL verb set differs:
  legacy ['CREATE', 'WITH', 'INSERT', 'MERGE', 'UPDATE', 'DELETE', 'SELECT'] vs
  current ['CREATE', 'WITH', 'INSERT', 'MERGE', 'UPDATE', 'DELETE', 'SELECT', 'DROP']. Current method uses
  parameter-injected environment helpers instead of Tempto query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`
- Reviewer note: Matched by current suite selection: `SuiteDeltaLakeOss` run 1 Exact-name mapping with normalized body
  similarity `0.93`.
- Audit status: `verified`

### `TestDeltaLakeCheckConstraintCompatibility`

- Owning migration commit: `Migrate TestDeltaLakeCheckConstraintCompatibility to JUnit`
- Current class added in same migration commit:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/deltalake/TestDeltaLakeCheckConstraintCompatibility.java`
- Legacy class removed in same migration commit:
  -
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/deltalake/TestDeltaLakeCheckConstraintCompatibility.java`
- Class-level environment requirement: `DeltaLakeMinioEnvironment`.
- Class-level tags: `DeltaLakeMinio`.
- Method inventory complete: Yes. Legacy methods: `8`. Current methods: `8`.
- Legacy helper/resource dependencies accounted for: Legacy class source reviewed directly.
- Intentional differences summary: `HDP to Hive 3.1 migration`
- Method statuses present: `verified`.

#### Methods

##### `testCheckConstraintInsertCompatibility`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/deltalake/TestDeltaLakeCheckConstraintCompatibility.java` ->
  `testCheckConstraintInsertCompatibility`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/deltalake/TestDeltaLakeCheckConstraintCompatibility.java` ->
  `TestDeltaLakeCheckConstraintCompatibility.testCheckConstraintInsertCompatibility`
- Mapping type: `direct`
- Environment parity: Current class requires `DeltaLakeMinioEnvironment`. Routed by source review into
  `SuiteDeltaLakeOss` run 1.
- Tag parity: Current tags: `DeltaLakeMinio`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`, `ALTER`, `INSERT`. Legacy setup operations: `CREATE`, `ALTER`,
  `INSERT`.
- Action parity: Current action verbs: `SELECT`. Legacy action verbs: `SELECT`.
- Assertion parity: Current assertion helpers: `assertSparkCheckConstraintViolation`, `assertThat`,
  `assertThatThrownBy`, `containsOnly`, `hasMessageContaining`. Legacy assertion helpers: `assertThat`,
  `assertThatThrownBy`, `containsOnly`, `hasMessageContaining`.
- Cleanup parity: Current cleanup operations: `DROP`. No legacy cleanup method body was available.
- Any observed difference, however small: SQL verb set differs: legacy ['CREATE', 'ALTER', 'INSERT', 'SELECT'] vs
  current ['CREATE', 'ALTER', 'INSERT', 'SELECT', 'DROP']. Assertion helper names differ between legacy and current
  implementations. Current method uses parameter-injected environment helpers instead of Tempto query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`
- Reviewer note: Matched by current suite selection: `SuiteDeltaLakeOss` run 1 Exact-name mapping with normalized body
  similarity `0.75`.
- Audit status: `verified`

##### `testCheckConstraintUpdateCompatibility`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/deltalake/TestDeltaLakeCheckConstraintCompatibility.java` ->
  `testCheckConstraintUpdateCompatibility`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/deltalake/TestDeltaLakeCheckConstraintCompatibility.java` ->
  `TestDeltaLakeCheckConstraintCompatibility.testCheckConstraintUpdateCompatibility`
- Mapping type: `direct`
- Environment parity: Current class requires `DeltaLakeMinioEnvironment`. Routed by source review into
  `SuiteDeltaLakeOss` run 1.
- Tag parity: Current tags: `DeltaLakeMinio`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`, `ALTER`, `INSERT`, `UPDATE`. Legacy setup operations: `CREATE`,
  `ALTER`, `INSERT`, `UPDATE`.
- Action parity: Current action verbs: `SELECT`. Legacy action verbs: `SELECT`.
- Assertion parity: Current assertion helpers: `assertSparkCheckConstraintViolation`, `assertThat`,
  `assertThatThrownBy`, `containsOnly`, `hasMessageContaining`, `row`. Legacy assertion helpers: `assertThat`,
  `assertThatThrownBy`, `containsOnly`, `hasMessageContaining`, `row`.
- Cleanup parity: Current cleanup operations: `DROP`. No legacy cleanup method body was available.
- Any observed difference, however small: SQL verb set differs: legacy ['CREATE', 'ALTER', 'INSERT', 'SELECT', 'UPDATE']
  vs current ['CREATE', 'ALTER', 'INSERT', 'SELECT', 'UPDATE', 'DROP']. Assertion helper names differ between legacy and
  current implementations. Current method uses parameter-injected environment helpers instead of Tempto query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`
- Reviewer note: Matched by current suite selection: `SuiteDeltaLakeOss` run 1 Exact-name mapping with normalized body
  similarity `0.65`.
- Audit status: `verified`

##### `testCheckConstraintMergeCompatibility`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/deltalake/TestDeltaLakeCheckConstraintCompatibility.java` ->
  `testCheckConstraintMergeCompatibility`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/deltalake/TestDeltaLakeCheckConstraintCompatibility.java` ->
  `TestDeltaLakeCheckConstraintCompatibility.testCheckConstraintMergeCompatibility`
- Mapping type: `direct`
- Environment parity: Current class requires `DeltaLakeMinioEnvironment`. Routed by source review into
  `SuiteDeltaLakeOss` run 1.
- Tag parity: Current tags: `DeltaLakeMinio`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`, `ALTER`, `INSERT`. Legacy setup operations: `CREATE`, `ALTER`,
  `INSERT`.
- Action parity: Current action verbs: `SELECT`, `MERGE`. Legacy action verbs: `SELECT`, `MERGE`.
- Assertion parity: Current assertion helpers: `assertSparkCheckConstraintViolation`, `assertThat`,
  `assertThatThrownBy`, `containsOnly`, `hasMessageContaining`, `row`. Legacy assertion helpers: `assertThat`,
  `assertThatThrownBy`, `containsOnly`, `hasMessageContaining`, `row`.
- Cleanup parity: Current cleanup operations: `DROP`. No legacy cleanup method body was available.
- Any observed difference, however small: SQL verb set differs: legacy ['CREATE', 'ALTER', 'INSERT', 'SELECT', 'MERGE']
  vs current ['CREATE', 'ALTER', 'INSERT', 'SELECT', 'MERGE', 'DROP']. Assertion helper names differ between legacy and
  current implementations. Current method uses parameter-injected environment helpers instead of Tempto query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`
- Reviewer note: Matched by current suite selection: `SuiteDeltaLakeOss` run 1 Exact-name mapping with normalized body
  similarity `0.69`.
- Audit status: `verified`

##### `testCheckConstraintWriterFeature`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/deltalake/TestDeltaLakeCheckConstraintCompatibility.java` ->
  `testCheckConstraintWriterFeature`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/deltalake/TestDeltaLakeCheckConstraintCompatibility.java` ->
  `TestDeltaLakeCheckConstraintCompatibility.testCheckConstraintWriterFeature`
- Mapping type: `direct`
- Environment parity: Current class requires `DeltaLakeMinioEnvironment`. Routed by source review into
  `SuiteDeltaLakeOss` run 1.
- Tag parity: Current tags: `DeltaLakeMinio`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`, `ALTER`, `INSERT`. Legacy setup operations: `CREATE`, `ALTER`,
  `INSERT`.
- Action parity: Current action verbs: `SELECT`. Legacy action verbs: `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `assertThatThrownBy`, `contains`, `containsOnly`,
  `hasMessageContaining`, `row`. Legacy assertion helpers: `assertQueryFailure`, `assertThat`, `contains`,
  `containsOnly`, `hasMessageContaining`, `row`.
- Cleanup parity: Current cleanup operations: `DROP`. No legacy cleanup method body was available.
- Any observed difference, however small: SQL verb set differs: legacy ['CREATE', 'ALTER', 'INSERT', 'SELECT'] vs
  current ['CREATE', 'ALTER', 'INSERT', 'SELECT', 'DROP']. Assertion helper names differ between legacy and current
  implementations. Current method uses parameter-injected environment helpers instead of Tempto query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`
- Reviewer note: Matched by current suite selection: `SuiteDeltaLakeOss` run 1 Exact-name mapping with normalized body
  similarity `0.81`.
- Audit status: `verified`

##### `testCheckConstraintUnknownCondition`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/deltalake/TestDeltaLakeCheckConstraintCompatibility.java` ->
  `testCheckConstraintUnknownCondition`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/deltalake/TestDeltaLakeCheckConstraintCompatibility.java` ->
  `TestDeltaLakeCheckConstraintCompatibility.testCheckConstraintUnknownCondition`
- Mapping type: `direct`
- Environment parity: Current class requires `DeltaLakeMinioEnvironment`. Routed by source review into
  `SuiteDeltaLakeOss` run 1.
- Tag parity: Current tags: `DeltaLakeMinio`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`, `ALTER`, `INSERT`. Legacy setup operations: `CREATE`, `ALTER`,
  `INSERT`.
- Action parity: Current action verbs: `SELECT`. Legacy action verbs: `SELECT`.
- Assertion parity: Current assertion helpers: `assertSparkCheckConstraintViolation`, `assertThat`, `containsOnly`,
  `row`. Legacy assertion helpers: `assertThat`, `assertThatThrownBy`, `containsOnly`, `row`.
- Cleanup parity: Current cleanup operations: `DROP`. No legacy cleanup method body was available.
- Any observed difference, however small: Normalized body similarity is low (`0.54`), so fidelity was judged from
  SQL/helper/assertion shape instead of raw text. SQL verb set differs: legacy ['CREATE', 'ALTER', 'INSERT', 'SELECT']
  vs current ['CREATE', 'ALTER', 'INSERT', 'SELECT', 'DROP']. Assertion helper names differ between legacy and current
  implementations. Current method uses parameter-injected environment helpers instead of Tempto query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`
- Reviewer note: Matched by current suite selection: `SuiteDeltaLakeOss` run 1 Exact-name mapping with normalized body
  similarity `0.54`.
- Audit status: `verified`

##### `testCheckConstraintAcrossColumns`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/deltalake/TestDeltaLakeCheckConstraintCompatibility.java` ->
  `testCheckConstraintAcrossColumns`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/deltalake/TestDeltaLakeCheckConstraintCompatibility.java` ->
  `TestDeltaLakeCheckConstraintCompatibility.testCheckConstraintAcrossColumns`
- Mapping type: `direct`
- Environment parity: Current class requires `DeltaLakeMinioEnvironment`. Routed by source review into
  `SuiteDeltaLakeOss` run 1.
- Tag parity: Current tags: `DeltaLakeMinio`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`, `ALTER`, `INSERT`. Legacy setup operations: `CREATE`, `ALTER`,
  `INSERT`.
- Action parity: Current action verbs: `SELECT`. Legacy action verbs: `SELECT`.
- Assertion parity: Current assertion helpers: `assertSparkCheckConstraintViolation`, `assertThat`,
  `assertThatThrownBy`, `containsOnly`, `hasMessageContaining`, `row`. Legacy assertion helpers: `assertThat`,
  `assertThatThrownBy`, `containsOnly`, `hasMessageContaining`, `row`.
- Cleanup parity: Current cleanup operations: `DROP`. No legacy cleanup method body was available.
- Any observed difference, however small: SQL verb set differs: legacy ['CREATE', 'ALTER', 'INSERT', 'SELECT'] vs
  current ['CREATE', 'ALTER', 'INSERT', 'SELECT', 'DROP']. Assertion helper names differ between legacy and current
  implementations. Current method uses parameter-injected environment helpers instead of Tempto query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`
- Reviewer note: Matched by current suite selection: `SuiteDeltaLakeOss` run 1 Exact-name mapping with normalized body
  similarity `0.66`.
- Audit status: `verified`

##### `testMetadataOperationsRetainCheckConstraint`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/deltalake/TestDeltaLakeCheckConstraintCompatibility.java` ->
  `testMetadataOperationsRetainCheckConstraint`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/deltalake/TestDeltaLakeCheckConstraintCompatibility.java` ->
  `TestDeltaLakeCheckConstraintCompatibility.testMetadataOperationsRetainCheckConstraint`
- Mapping type: `direct`
- Environment parity: Current class requires `DeltaLakeMinioEnvironment`. Routed by source review into
  `SuiteDeltaLakeOss` run 1.
- Tag parity: Current tags: `DeltaLakeMinio`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`, `ALTER`. Legacy setup operations: `CREATE`, `ALTER`.
- Action parity: Current action verbs: none. Legacy action verbs: none.
- Assertion parity: Current assertion helpers: none. No legacy assertion method body was available.
- Cleanup parity: Current cleanup operations: `DROP`. No legacy cleanup method body was available.
- Any observed difference, however small: SQL verb set differs: legacy ['CREATE', 'ALTER'] vs
  current ['CREATE', 'ALTER', 'DROP']. Current method uses parameter-injected environment helpers instead of Tempto
  query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`
- Reviewer note: Matched by current suite selection: `SuiteDeltaLakeOss` run 1 Exact-name mapping with normalized body
  similarity `0.79`.
- Audit status: `verified`

##### `testUnsupportedCheckConstraintExpression`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/deltalake/TestDeltaLakeCheckConstraintCompatibility.java` ->
  `testUnsupportedCheckConstraintExpression`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/deltalake/TestDeltaLakeCheckConstraintCompatibility.java` ->
  `TestDeltaLakeCheckConstraintCompatibility.testUnsupportedCheckConstraintExpression`
- Mapping type: `direct`
- Environment parity: Current class requires `DeltaLakeMinioEnvironment`. Routed by source review into
  `SuiteDeltaLakeOss` run 1.
- Tag parity: Current tags: `DeltaLakeMinio`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`, `ALTER`, `INSERT`, `UPDATE`. Legacy setup operations: `CREATE`,
  `ALTER`, `INSERT`, `UPDATE`.
- Action parity: Current action verbs: `MERGE`, `SELECT`. Legacy action verbs: `MERGE`, `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `assertThatThrownBy`, `containsOnly`,
  `hasMessageContaining`, `row`. Legacy assertion helpers: `assertQueryFailure`, `assertThat`, `containsOnly`,
  `hasMessageContaining`, `row`.
- Cleanup parity: Current cleanup operations: `DELETE`, `DROP`. Legacy cleanup operations: `DELETE`.
- Any observed difference, however small: SQL verb set differs:
  legacy ['CREATE', 'ALTER', 'INSERT', 'UPDATE', 'DELETE', 'MERGE', 'SELECT'] vs
  current ['CREATE', 'ALTER', 'INSERT', 'UPDATE', 'DELETE', 'MERGE', 'SELECT', 'DROP']. Assertion helper names differ
  between legacy and current implementations. Current method uses parameter-injected environment helpers instead of
  Tempto query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`
- Reviewer note: Matched by current suite selection: `SuiteDeltaLakeOss` run 1 Exact-name mapping with normalized body
  similarity `0.81`.
- Audit status: `verified`

### `TestDeltaLakeCheckpointsCompatibility`

- Owning migration commit: `Migrate TestDeltaLakeCheckpointsCompatibility to JUnit`
- Current class added in same migration commit:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/deltalake/TestDeltaLakeCheckpointsCompatibility.java`
- Legacy class removed in same migration commit:
  -
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/deltalake/TestDeltaLakeCheckpointsCompatibility.java`
- Class-level environment requirement: `DeltaLakeMinioEnvironment`.
- Class-level tags: `DeltaLakeMinio`.
- Method inventory complete: Yes. Legacy methods: `18`. Current methods: `11`.
- Legacy helper/resource dependencies accounted for: Legacy class source reviewed directly. Cross-class or merged legacy
  coverage accounted for: `testDatabricksCheckpointMinMaxStatisticsForRowType` -> covered in
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/deltalake/TestDeltaLakeCheckpointsDatabricksCompatibility.java` ->
  `testDatabricksCheckpointMinMaxStatisticsForRowType`; `testDatabricksCheckpointNullStatisticsForRowType` -> covered in
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/deltalake/TestDeltaLakeCheckpointsDatabricksCompatibility.java` ->
  `testDatabricksCheckpointNullStatisticsForRowType`; `testDatabricksUsesCheckpointInterval` -> covered in
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/deltalake/TestDeltaLakeCheckpointsDatabricksCompatibility.java` ->
  `testDatabricksUsesCheckpointInterval`; `testDatabricksWriteStatsAsJsonEnabled` -> covered in
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/deltalake/TestDeltaLakeCheckpointsDatabricksCompatibility.java` ->
  `testDatabricksWriteStatsAsJsonEnabled`; `testDatabricksWriteStatsAsStructEnabled` -> covered in
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/deltalake/TestDeltaLakeCheckpointsDatabricksCompatibility.java` ->
  `testDatabricksWriteStatsAsStructEnabled`; `testTrinoCheckpointMinMaxStatisticsForRowType` -> covered in
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/deltalake/TestDeltaLakeCheckpointsDatabricksCompatibility.java` ->
  `testTrinoCheckpointMinMaxStatisticsForRowType`; `testTrinoCheckpointNullStatisticsForRowType` -> covered in
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/deltalake/TestDeltaLakeCheckpointsDatabricksCompatibility.java` ->
  `testTrinoCheckpointNullStatisticsForRowType`.
- Intentional differences summary: `HDP to Hive 3.1 migration`
- Method statuses present: `verified`.

#### Methods

##### `testSparkCanReadTrinoCheckpoint`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/deltalake/TestDeltaLakeCheckpointsCompatibility.java` ->
  `testSparkCanReadTrinoCheckpoint`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/deltalake/TestDeltaLakeCheckpointsCompatibility.java` ->
  `TestDeltaLakeCheckpointsCompatibility.testSparkCanReadTrinoCheckpoint`
- Mapping type: `direct`
- Environment parity: Current class requires `DeltaLakeMinioEnvironment`. Routed by source review into
  `SuiteDeltaLakeOss` run 1.
- Tag parity: Current tags: `DeltaLakeMinio`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`, `INSERT`. Legacy setup operations: `CREATE`, `INSERT`.
- Action parity: Current action verbs: `SELECT`. Legacy action verbs: `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `containsOnly`, `row`. Legacy assertion helpers:
  `assertThat`, `containsOnly`, `row`.
- Cleanup parity: Current cleanup operations: `DELETE`, `DROP`. Legacy cleanup operations: `DELETE`.
- Any observed difference, however small: SQL verb set differs: legacy ['CREATE', 'INSERT', 'DELETE', 'SELECT'] vs
  current ['CREATE', 'INSERT', 'DELETE', 'SELECT', 'DROP']. Current method uses parameter-injected environment helpers
  instead of Tempto query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`
- Reviewer note: Matched by current suite selection: `SuiteDeltaLakeOss` run 1 Exact-name mapping with normalized body
  similarity `0.72`.
- Audit status: `verified`

##### `testSparkCanReadTrinoCheckpointWithMultiplePartitionColumns`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/deltalake/TestDeltaLakeCheckpointsCompatibility.java` ->
  `testSparkCanReadTrinoCheckpointWithMultiplePartitionColumns`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/deltalake/TestDeltaLakeCheckpointsCompatibility.java` ->
  `TestDeltaLakeCheckpointsCompatibility.testSparkCanReadTrinoCheckpointWithMultiplePartitionColumns`
- Mapping type: `direct`
- Environment parity: Current class requires `DeltaLakeMinioEnvironment`. Routed by source review into
  `SuiteDeltaLakeOss` run 1.
- Tag parity: Current tags: `DeltaLakeMinio`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`, `INSERT`. Legacy setup operations: `CREATE`, `INSERT`.
- Action parity: Current action verbs: `WITH`, `SELECT`, `CALL`. Legacy action verbs: `WITH`, `SELECT`, `CALL`.
- Assertion parity: Current assertion helpers: `assertThat`, `containsOnly`, `row`. Legacy assertion helpers:
  `assertThat`, `containsOnly`, `row`.
- Cleanup parity: Current cleanup operations: `DROP`. No legacy cleanup method body was available.
- Any observed difference, however small: SQL verb set differs: legacy ['CREATE', 'WITH', 'INSERT', 'SELECT', 'CALL'] vs
  current ['CREATE', 'WITH', 'INSERT', 'SELECT', 'CALL', 'DROP']. Current method uses parameter-injected environment
  helpers instead of Tempto query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`
- Reviewer note: Matched by current suite selection: `SuiteDeltaLakeOss` run 1 Exact-name mapping with normalized body
  similarity `0.91`.
- Audit status: `verified`

##### `testTrinoUsesCheckpointInterval`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/deltalake/TestDeltaLakeCheckpointsCompatibility.java` ->
  `testTrinoUsesCheckpointInterval`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/deltalake/TestDeltaLakeCheckpointsCompatibility.java` ->
  `TestDeltaLakeCheckpointsCompatibility.testTrinoUsesCheckpointInterval`
- Mapping type: `direct`
- Environment parity: Current class requires `DeltaLakeMinioEnvironment`. Routed by source review into
  `SuiteDeltaLakeOss` run 1.
- Tag parity: Current tags: `DeltaLakeMinio`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: none. No legacy setup method body was available.
- Action parity: Current action verbs: none. No legacy action method body was available.
- Assertion parity: Current assertion helpers: none. No legacy assertion method body was available.
- Cleanup parity: Current cleanup operations: none. No legacy cleanup method body was available.
- Any observed difference, however small: No method-specific difference identified beyond the documented framework
  baseline.
- Known intentional difference: None.
- Reviewer note: Matched by current suite selection: `SuiteDeltaLakeOss` run 1 High normalized body similarity `0.84`.
- Audit status: `verified`

##### `testTrinoUsesCheckpointIntervalWithTableFeature`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/deltalake/TestDeltaLakeCheckpointsCompatibility.java` ->
  `testTrinoUsesCheckpointIntervalWithTableFeature`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/deltalake/TestDeltaLakeCheckpointsCompatibility.java` ->
  `TestDeltaLakeCheckpointsCompatibility.testTrinoUsesCheckpointIntervalWithTableFeature`
- Mapping type: `direct`
- Environment parity: Current class requires `DeltaLakeMinioEnvironment`. Routed by source review into
  `SuiteDeltaLakeOss` run 1.
- Tag parity: Current tags: `DeltaLakeMinio`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: none. No legacy setup method body was available.
- Action parity: Current action verbs: none. No legacy action method body was available.
- Assertion parity: Current assertion helpers: none. No legacy assertion method body was available.
- Cleanup parity: Current cleanup operations: none. No legacy cleanup method body was available.
- Any observed difference, however small: No method-specific difference identified beyond the documented framework
  baseline.
- Known intentional difference: None.
- Reviewer note: Matched by current suite selection: `SuiteDeltaLakeOss` run 1 Exact-name mapping with normalized body
  similarity `0.59`.
- Audit status: `verified`

##### `testTrinoWriteStatsAsJsonDisabled`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/deltalake/TestDeltaLakeCheckpointsCompatibility.java` ->
  `testTrinoWriteStatsAsJsonDisabled`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/deltalake/TestDeltaLakeCheckpointsCompatibility.java` ->
  `TestDeltaLakeCheckpointsCompatibility.testTrinoWriteStatsAsJsonDisabled`
- Mapping type: `direct`
- Environment parity: Current class requires `DeltaLakeMinioEnvironment`. Routed by source review into
  `SuiteDeltaLakeOss` run 1.
- Tag parity: Current tags: `DeltaLakeMinio`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: none. No legacy setup method body was available.
- Action parity: Current action verbs: none. No legacy action method body was available.
- Assertion parity: Current assertion helpers: none. No legacy assertion method body was available.
- Cleanup parity: Current cleanup operations: none. No legacy cleanup method body was available.
- Any observed difference, however small: Current method uses parameter-injected environment helpers instead of Tempto
  query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`
- Reviewer note: Matched by current suite selection: `SuiteDeltaLakeOss` run 1 Exact-name mapping with normalized body
  similarity `0.77`.
- Audit status: `verified`

##### `testSparkWriteStatsAsJsonDisabled`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/deltalake/TestDeltaLakeCheckpointsCompatibility.java` ->
  `testSparkWriteStatsAsJsonDisabled`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/deltalake/TestDeltaLakeCheckpointsCompatibility.java` ->
  `TestDeltaLakeCheckpointsCompatibility.testSparkWriteStatsAsJsonDisabled`
- Mapping type: `direct`
- Environment parity: Current class requires `DeltaLakeMinioEnvironment`. Routed by source review into
  `SuiteDeltaLakeOss` run 1.
- Tag parity: Current tags: `DeltaLakeMinio`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: none. No legacy setup method body was available.
- Action parity: Current action verbs: none. No legacy action method body was available.
- Assertion parity: Current assertion helpers: none. No legacy assertion method body was available.
- Cleanup parity: Current cleanup operations: none. No legacy cleanup method body was available.
- Any observed difference, however small: No method-specific difference identified beyond the documented framework
  baseline.
- Known intentional difference: None.
- Reviewer note: Matched by current suite selection: `SuiteDeltaLakeOss` run 1 High normalized body similarity `0.88`.
- Audit status: `verified`

##### `testTrinoWriteStatsAsStructDisabled`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/deltalake/TestDeltaLakeCheckpointsCompatibility.java` ->
  `testTrinoWriteStatsAsStructDisabled`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/deltalake/TestDeltaLakeCheckpointsCompatibility.java` ->
  `TestDeltaLakeCheckpointsCompatibility.testTrinoWriteStatsAsStructDisabled`
- Mapping type: `direct`
- Environment parity: Current class requires `DeltaLakeMinioEnvironment`. Routed by source review into
  `SuiteDeltaLakeOss` run 1.
- Tag parity: Current tags: `DeltaLakeMinio`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: none. No legacy setup method body was available.
- Action parity: Current action verbs: none. No legacy action method body was available.
- Assertion parity: Current assertion helpers: none. No legacy assertion method body was available.
- Cleanup parity: Current cleanup operations: none. No legacy cleanup method body was available.
- Any observed difference, however small: Current method uses parameter-injected environment helpers instead of Tempto
  query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`
- Reviewer note: Matched by current suite selection: `SuiteDeltaLakeOss` run 1 Exact-name mapping with normalized body
  similarity `0.75`.
- Audit status: `verified`

##### `testSparkWriteStatsAsStructDisabled`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/deltalake/TestDeltaLakeCheckpointsCompatibility.java` ->
  `testSparkWriteStatsAsStructDisabled`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/deltalake/TestDeltaLakeCheckpointsCompatibility.java` ->
  `TestDeltaLakeCheckpointsCompatibility.testSparkWriteStatsAsStructDisabled`
- Mapping type: `direct`
- Environment parity: Current class requires `DeltaLakeMinioEnvironment`. Routed by source review into
  `SuiteDeltaLakeOss` run 1.
- Tag parity: Current tags: `DeltaLakeMinio`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: none. No legacy setup method body was available.
- Action parity: Current action verbs: none. No legacy action method body was available.
- Assertion parity: Current assertion helpers: none. No legacy assertion method body was available.
- Cleanup parity: Current cleanup operations: none. No legacy cleanup method body was available.
- Any observed difference, however small: No method-specific difference identified beyond the documented framework
  baseline.
- Known intentional difference: None.
- Reviewer note: Matched by current suite selection: `SuiteDeltaLakeOss` run 1 High normalized body similarity `0.87`.
- Audit status: `verified`

##### `testTrinoWriteStatsAsJsonEnabled`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/deltalake/TestDeltaLakeCheckpointsCompatibility.java` ->
  `testTrinoWriteStatsAsJsonEnabled`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/deltalake/TestDeltaLakeCheckpointsCompatibility.java` ->
  `TestDeltaLakeCheckpointsCompatibility.testTrinoWriteStatsAsJsonEnabled`
- Mapping type: `direct`
- Environment parity: Current class requires `DeltaLakeMinioEnvironment`. Routed by source review into
  `SuiteDeltaLakeOss` run 1.
- Tag parity: Current tags: `DeltaLakeMinio`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: none. No legacy setup method body was available.
- Action parity: Current action verbs: none. No legacy action method body was available.
- Assertion parity: Current assertion helpers: none. No legacy assertion method body was available.
- Cleanup parity: Current cleanup operations: none. No legacy cleanup method body was available.
- Any observed difference, however small: Current method uses parameter-injected environment helpers instead of Tempto
  query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`
- Reviewer note: Matched by current suite selection: `SuiteDeltaLakeOss` run 1 Exact-name mapping with normalized body
  similarity `0.91`.
- Audit status: `verified`

##### `testTrinoWriteStatsAsStructEnabled`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/deltalake/TestDeltaLakeCheckpointsCompatibility.java` ->
  `testTrinoWriteStatsAsStructEnabled`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/deltalake/TestDeltaLakeCheckpointsCompatibility.java` ->
  `TestDeltaLakeCheckpointsCompatibility.testTrinoWriteStatsAsStructEnabled`
- Mapping type: `direct`
- Environment parity: Current class requires `DeltaLakeMinioEnvironment`. Routed by source review into
  `SuiteDeltaLakeOss` run 1.
- Tag parity: Current tags: `DeltaLakeMinio`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: none. No legacy setup method body was available.
- Action parity: Current action verbs: none. No legacy action method body was available.
- Assertion parity: Current assertion helpers: none. No legacy assertion method body was available.
- Cleanup parity: Current cleanup operations: none. No legacy cleanup method body was available.
- Any observed difference, however small: Current method uses parameter-injected environment helpers instead of Tempto
  query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`
- Reviewer note: Matched by current suite selection: `SuiteDeltaLakeOss` run 1 Exact-name mapping with normalized body
  similarity `0.87`.
- Audit status: `verified`

##### `testV2CheckpointMultipleSidecars`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/deltalake/TestDeltaLakeCheckpointsCompatibility.java` ->
  `testV2CheckpointMultipleSidecars`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/deltalake/TestDeltaLakeCheckpointsCompatibility.java` ->
  `TestDeltaLakeCheckpointsCompatibility.testV2CheckpointMultipleSidecars`
- Mapping type: `direct`
- Environment parity: Current class requires `DeltaLakeMinioEnvironment`. Routed by source review into
  `SuiteDeltaLakeOss` run 1.
- Tag parity: Current tags: `DeltaLakeMinio`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`, `INSERT`. No legacy setup method body was available.
- Action parity: Current action verbs: `SELECT`. No legacy action method body was available.
- Assertion parity: Current assertion helpers: `assertThat`, `containsOnly`, `row`. No legacy assertion method body was
  available.
- Cleanup parity: Current cleanup operations: `DROP`. No legacy cleanup method body was available.
- Any observed difference, however small: Normalized body similarity is low (`0.10`), so fidelity was judged from
  SQL/helper/assertion shape instead of raw text.
- Known intentional difference: `HDP to Hive 3.1 migration`
- Reviewer note: Matched by current suite selection: `SuiteDeltaLakeOss` run 1 Exact-name mapping with normalized body
  similarity `0.10`.
- Audit status: `verified`

### `TestDeltaLakeCheckpointsDatabricksCompatibility`

- Owning migration commit: `Migrate TestDeltaLakeCheckpointsCompatibility to JUnit`
- Current class added in same migration commit:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/deltalake/TestDeltaLakeCheckpointsDatabricksCompatibility.java`
- Legacy class removed in same migration commit:
    - None. This commit added new JUnit-side verification coverage rather than removing a legacy class.
- Class-level environment requirement: `DeltaLakeDatabricksEnvironment`.
- Class-level tags: `ConfiguredFeatures`, `DeltaLakeDatabricks`, `ProfileSpecificTests`.
- Method inventory complete: Not applicable. No legacy class or resource source exists for this new verification
  coverage.
- Legacy helper/resource dependencies accounted for: New JUnit-side verification coverage without a removed legacy
  counterpart.
- Intentional differences summary: `HDP to Hive 3.1 migration`, `JUnit/AssertJ/Testcontainers framework replacement`
- Method statuses present: `intentional difference`.

#### Methods

##### `testDatabricksUsesCheckpointInterval`

- Legacy source method: No legacy source method; this is new JUnit-side verification coverage.
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/deltalake/TestDeltaLakeCheckpointsDatabricksCompatibility.java` ->
  `TestDeltaLakeCheckpointsDatabricksCompatibility.testDatabricksUsesCheckpointInterval`
- Mapping type: `new coverage helper`
- Environment parity: Current class requires `DeltaLakeDatabricksEnvironment`. No suite run selects this method from the
  current suite definitions.
- Tag parity: Current tags: `ConfiguredFeatures`, `DeltaLakeDatabricks`, `DeltaLakeDatabricks143`,
  `DeltaLakeDatabricks154`, `DeltaLakeDatabricks164`, `ProfileSpecificTests`. Tag routing needs no suite-level
  product-test claim.
- Setup parity: Current setup operations: `CREATE`, `INSERT`. No legacy setup method body was available.
- Action parity: Current action verbs: `WITH`, `SHOW`, `SELECT`. No legacy action method body was available.
- Assertion parity: Current assertion helpers: `assertThat`, `contains`. No legacy assertion method body was available.
- Cleanup parity: Current cleanup operations: none. No legacy cleanup method body was available.
- Any observed difference, however small: No legacy method counterpart exists; this is new JUnit-side verification
  coverage.
- Known intentional difference: `HDP to Hive 3.1 migration`, `JUnit/AssertJ/Testcontainers framework replacement`
- Reviewer note: Source/history review only.
- Audit status: `intentional difference`

##### `testTrinoCheckpointMinMaxStatisticsForRowType`

- Legacy source method: No legacy source method; this is new JUnit-side verification coverage.
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/deltalake/TestDeltaLakeCheckpointsDatabricksCompatibility.java` ->
  `TestDeltaLakeCheckpointsDatabricksCompatibility.testTrinoCheckpointMinMaxStatisticsForRowType`
- Mapping type: `new coverage helper`
- Environment parity: Current class requires `DeltaLakeDatabricksEnvironment`. No suite run selects this method from the
  current suite definitions.
- Tag parity: Current tags: `ConfiguredFeatures`, `DeltaLakeDatabricks`, `ProfileSpecificTests`. Tag routing needs no
  suite-level product-test claim.
- Setup parity: Current setup operations: none. No legacy setup method body was available.
- Action parity: Current action verbs: none. No legacy action method body was available.
- Assertion parity: Current assertion helpers: none. No legacy assertion method body was available.
- Cleanup parity: Current cleanup operations: none. No legacy cleanup method body was available.
- Any observed difference, however small: No legacy method counterpart exists; this is new JUnit-side verification
  coverage.
- Known intentional difference: `HDP to Hive 3.1 migration`, `JUnit/AssertJ/Testcontainers framework replacement`
- Reviewer note: Source/history review only.
- Audit status: `intentional difference`

##### `testDatabricksCheckpointMinMaxStatisticsForRowType`

- Legacy source method: No legacy source method; this is new JUnit-side verification coverage.
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/deltalake/TestDeltaLakeCheckpointsDatabricksCompatibility.java` ->
  `TestDeltaLakeCheckpointsDatabricksCompatibility.testDatabricksCheckpointMinMaxStatisticsForRowType`
- Mapping type: `new coverage helper`
- Environment parity: Current class requires `DeltaLakeDatabricksEnvironment`. No suite run selects this method from the
  current suite definitions.
- Tag parity: Current tags: `ConfiguredFeatures`, `DeltaLakeDatabricks`, `ProfileSpecificTests`. Tag routing needs no
  suite-level product-test claim.
- Setup parity: Current setup operations: none. No legacy setup method body was available.
- Action parity: Current action verbs: none. No legacy action method body was available.
- Assertion parity: Current assertion helpers: none. No legacy assertion method body was available.
- Cleanup parity: Current cleanup operations: none. No legacy cleanup method body was available.
- Any observed difference, however small: No legacy method counterpart exists; this is new JUnit-side verification
  coverage.
- Known intentional difference: `HDP to Hive 3.1 migration`, `JUnit/AssertJ/Testcontainers framework replacement`
- Reviewer note: Source/history review only.
- Audit status: `intentional difference`

##### `testTrinoCheckpointNullStatisticsForRowType`

- Legacy source method: No legacy source method; this is new JUnit-side verification coverage.
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/deltalake/TestDeltaLakeCheckpointsDatabricksCompatibility.java` ->
  `TestDeltaLakeCheckpointsDatabricksCompatibility.testTrinoCheckpointNullStatisticsForRowType`
- Mapping type: `new coverage helper`
- Environment parity: Current class requires `DeltaLakeDatabricksEnvironment`. No suite run selects this method from the
  current suite definitions.
- Tag parity: Current tags: `ConfiguredFeatures`, `DeltaLakeDatabricks`, `ProfileSpecificTests`. Tag routing needs no
  suite-level product-test claim.
- Setup parity: Current setup operations: none. No legacy setup method body was available.
- Action parity: Current action verbs: none. No legacy action method body was available.
- Assertion parity: Current assertion helpers: none. No legacy assertion method body was available.
- Cleanup parity: Current cleanup operations: none. No legacy cleanup method body was available.
- Any observed difference, however small: No legacy method counterpart exists; this is new JUnit-side verification
  coverage.
- Known intentional difference: `HDP to Hive 3.1 migration`, `JUnit/AssertJ/Testcontainers framework replacement`
- Reviewer note: Source/history review only.
- Audit status: `intentional difference`

##### `testDatabricksCheckpointNullStatisticsForRowType`

- Legacy source method: No legacy source method; this is new JUnit-side verification coverage.
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/deltalake/TestDeltaLakeCheckpointsDatabricksCompatibility.java` ->
  `TestDeltaLakeCheckpointsDatabricksCompatibility.testDatabricksCheckpointNullStatisticsForRowType`
- Mapping type: `new coverage helper`
- Environment parity: Current class requires `DeltaLakeDatabricksEnvironment`. No suite run selects this method from the
  current suite definitions.
- Tag parity: Current tags: `ConfiguredFeatures`, `DeltaLakeDatabricks`, `ProfileSpecificTests`. Tag routing needs no
  suite-level product-test claim.
- Setup parity: Current setup operations: none. No legacy setup method body was available.
- Action parity: Current action verbs: none. No legacy action method body was available.
- Assertion parity: Current assertion helpers: none. No legacy assertion method body was available.
- Cleanup parity: Current cleanup operations: none. No legacy cleanup method body was available.
- Any observed difference, however small: No legacy method counterpart exists; this is new JUnit-side verification
  coverage.
- Known intentional difference: `HDP to Hive 3.1 migration`, `JUnit/AssertJ/Testcontainers framework replacement`
- Reviewer note: Source/history review only.
- Audit status: `intentional difference`

##### `testDatabricksWriteStatsAsJsonEnabled`

- Legacy source method: No legacy source method; this is new JUnit-side verification coverage.
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/deltalake/TestDeltaLakeCheckpointsDatabricksCompatibility.java` ->
  `TestDeltaLakeCheckpointsDatabricksCompatibility.testDatabricksWriteStatsAsJsonEnabled`
- Mapping type: `new coverage helper`
- Environment parity: Current class requires `DeltaLakeDatabricksEnvironment`. No suite run selects this method from the
  current suite definitions.
- Tag parity: Current tags: `ConfiguredFeatures`, `DeltaLakeDatabricks`, `ProfileSpecificTests`. Tag routing needs no
  suite-level product-test claim.
- Setup parity: Current setup operations: none. No legacy setup method body was available.
- Action parity: Current action verbs: none. No legacy action method body was available.
- Assertion parity: Current assertion helpers: none. No legacy assertion method body was available.
- Cleanup parity: Current cleanup operations: none. No legacy cleanup method body was available.
- Any observed difference, however small: No legacy method counterpart exists; this is new JUnit-side verification
  coverage.
- Known intentional difference: `HDP to Hive 3.1 migration`, `JUnit/AssertJ/Testcontainers framework replacement`
- Reviewer note: Source/history review only.
- Audit status: `intentional difference`

##### `testDatabricksWriteStatsAsStructEnabled`

- Legacy source method: No legacy source method; this is new JUnit-side verification coverage.
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/deltalake/TestDeltaLakeCheckpointsDatabricksCompatibility.java` ->
  `TestDeltaLakeCheckpointsDatabricksCompatibility.testDatabricksWriteStatsAsStructEnabled`
- Mapping type: `new coverage helper`
- Environment parity: Current class requires `DeltaLakeDatabricksEnvironment`. No suite run selects this method from the
  current suite definitions.
- Tag parity: Current tags: `ConfiguredFeatures`, `DeltaLakeDatabricks`, `ProfileSpecificTests`. Tag routing needs no
  suite-level product-test claim.
- Setup parity: Current setup operations: none. No legacy setup method body was available.
- Action parity: Current action verbs: none. No legacy action method body was available.
- Assertion parity: Current assertion helpers: none. No legacy assertion method body was available.
- Cleanup parity: Current cleanup operations: none. No legacy cleanup method body was available.
- Any observed difference, however small: No legacy method counterpart exists; this is new JUnit-side verification
  coverage.
- Known intentional difference: `HDP to Hive 3.1 migration`, `JUnit/AssertJ/Testcontainers framework replacement`
- Reviewer note: Source/history review only.
- Audit status: `intentional difference`

### `TestDeltaLakeCloneTableCompatibility`

- Owning migration commit: `Migrate TestDeltaLakeCloneTableCompatibility to JUnit`
- Current class added in same migration commit:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/deltalake/TestDeltaLakeCloneTableCompatibility.java`
- Legacy class removed in same migration commit:
  -
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/deltalake/TestDeltaLakeCloneTableCompatibility.java`
- Class-level environment requirement: `DeltaLakeMinioEnvironment`.
- Class-level tags: `DeltaLakeMinio`.
- Method inventory complete: Yes. Legacy methods: `7`. Current methods: `9`.
- Legacy helper/resource dependencies accounted for: Legacy class source reviewed directly.
- Intentional differences summary: `HDP to Hive 3.1 migration`
- Method statuses present: `verified`.

#### Methods

##### `testTableChangesOnShallowCloneTable`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/deltalake/TestDeltaLakeCloneTableCompatibility.java` ->
  `testTableChangesOnShallowCloneTable`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/deltalake/TestDeltaLakeCloneTableCompatibility.java` ->
  `TestDeltaLakeCloneTableCompatibility.testTableChangesOnShallowCloneTable`
- Mapping type: `direct`
- Environment parity: Current class requires `DeltaLakeMinioEnvironment`. Routed by source review into
  `SuiteDeltaLakeOss` run 1.
- Tag parity: Current tags: `DeltaLakeMinio`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`, `INSERT`, `UPDATE`. Legacy setup operations: `CREATE`, `INSERT`,
  `UPDATE`.
- Action parity: Current action verbs: `SELECT`. Legacy action verbs: `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `containsOnly`, `row`. Legacy assertion helpers:
  `assertThat`, `containsOnly`, `row`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: Current method uses parameter-injected environment helpers instead of Tempto
  query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`
- Reviewer note: Matched by current suite selection: `SuiteDeltaLakeOss` run 1 Exact-name mapping with normalized body
  similarity `0.91`.
- Audit status: `verified`

##### `testShallowCloneTableDrop`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/deltalake/TestDeltaLakeCloneTableCompatibility.java` ->
  `testShallowCloneTableDrop`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/deltalake/TestDeltaLakeCloneTableCompatibility.java` ->
  `TestDeltaLakeCloneTableCompatibility.testShallowCloneTableDrop`
- Mapping type: `direct`
- Environment parity: Current class requires `DeltaLakeMinioEnvironment`. Routed by source review into
  `SuiteDeltaLakeOss` run 1.
- Tag parity: Current tags: `DeltaLakeMinio`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`, `INSERT`. Legacy setup operations: `CREATE`, `INSERT`.
- Action parity: Current action verbs: `SELECT`. Legacy action verbs: `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `containsOnly`, `row`. Legacy assertion helpers:
  `assertThat`, `containsOnly`, `row`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: Current method uses parameter-injected environment helpers instead of Tempto
  query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`
- Reviewer note: Matched by current suite selection: `SuiteDeltaLakeOss` run 1 Exact-name mapping with normalized body
  similarity `0.63`.
- Audit status: `verified`

##### `testVacuumOnShallowCloneTable`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/deltalake/TestDeltaLakeCloneTableCompatibility.java` ->
  `testVacuumOnShallowCloneTable`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/deltalake/TestDeltaLakeCloneTableCompatibility.java` ->
  `TestDeltaLakeCloneTableCompatibility.testVacuumOnShallowCloneTable`
- Mapping type: `direct`
- Environment parity: Current class requires `DeltaLakeMinioEnvironment`. Routed by source review into
  `SuiteDeltaLakeOss` run 1.
- Tag parity: Current tags: `DeltaLakeMinio`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`, `INSERT`, `UPDATE`. Legacy setup operations: `CREATE`, `INSERT`,
  `UPDATE`.
- Action parity: Current action verbs: `SELECT`. Legacy action verbs: `CALL`, `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `containsOnly`, `isEqualTo`, `row`. Legacy assertion
  helpers: `assertThat`, `containsOnly`, `isEqualTo`, `row`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: SQL verb set differs:
  legacy ['CREATE', 'INSERT', 'UPDATE', 'CALL', 'SELECT', 'DROP'] vs
  current ['CREATE', 'INSERT', 'UPDATE', 'SELECT', 'DROP']. Current method uses parameter-injected environment helpers
  instead of Tempto query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`
- Reviewer note: Matched by current suite selection: `SuiteDeltaLakeOss` run 1 Exact-name mapping with normalized body
  similarity `0.86`.
- Audit status: `verified`

##### `testReadFromSchemaChangedShallowCloneTablePartitioned`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/deltalake/TestDeltaLakeCloneTableCompatibility.java` ->
  `testReadFromSchemaChangedShallowCloneTable`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/deltalake/TestDeltaLakeCloneTableCompatibility.java` ->
  `TestDeltaLakeCloneTableCompatibility.testReadFromSchemaChangedShallowCloneTablePartitioned`
- Mapping type: `renamed`
- Environment parity: Current class requires `DeltaLakeMinioEnvironment`. Routed by source review into
  `SuiteDeltaLakeOss` run 1.
- Tag parity: Current tags: `DeltaLakeMinio`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: none. No legacy setup method body was available.
- Action parity: Current action verbs: none. No legacy action method body was available.
- Assertion parity: Current assertion helpers: none. No legacy assertion method body was available.
- Cleanup parity: Current cleanup operations: none. No legacy cleanup method body was available.
- Any observed difference, however small: Current method maps to legacy `testReadFromSchemaChangedShallowCloneTable`
  rather than the same method name.
- Known intentional difference: `HDP to Hive 3.1 migration`
- Reviewer note: Matched by current suite selection: `SuiteDeltaLakeOss` run 1
- Audit status: `verified`

##### `testReadFromSchemaChangedShallowCloneTableNonPartitioned`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/deltalake/TestDeltaLakeCloneTableCompatibility.java` ->
  `testReadFromSchemaChangedDeepCloneTable`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/deltalake/TestDeltaLakeCloneTableCompatibility.java` ->
  `TestDeltaLakeCloneTableCompatibility.testReadFromSchemaChangedShallowCloneTableNonPartitioned`
- Mapping type: `renamed`
- Environment parity: Current class requires `DeltaLakeMinioEnvironment`. Routed by source review into
  `SuiteDeltaLakeOss` run 1.
- Tag parity: Current tags: `DeltaLakeMinio`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: none. No legacy setup method body was available.
- Action parity: Current action verbs: none. No legacy action method body was available.
- Assertion parity: Current assertion helpers: none. No legacy assertion method body was available.
- Cleanup parity: Current cleanup operations: none. No legacy cleanup method body was available.
- Any observed difference, however small: Current method maps to legacy `testReadFromSchemaChangedDeepCloneTable` rather
  than the same method name.
- Known intentional difference: `HDP to Hive 3.1 migration`
- Reviewer note: Matched by current suite selection: `SuiteDeltaLakeOss` run 1
- Audit status: `verified`

##### `testShallowCloneTableMergeNonPartitioned`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/deltalake/TestDeltaLakeCloneTableCompatibility.java` ->
  `testShallowCloneTableMerge`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/deltalake/TestDeltaLakeCloneTableCompatibility.java` ->
  `TestDeltaLakeCloneTableCompatibility.testShallowCloneTableMergeNonPartitioned`
- Mapping type: `split`
- Environment parity: Current class requires `DeltaLakeMinioEnvironment`. Routed by source review into
  `SuiteDeltaLakeOss` run 1.
- Tag parity: Current tags: `DeltaLakeMinio`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: none. No legacy setup method body was available.
- Action parity: Current action verbs: none. No legacy action method body was available.
- Assertion parity: Current assertion helpers: none. No legacy assertion method body was available.
- Cleanup parity: Current cleanup operations: none. No legacy cleanup method body was available.
- Any observed difference, however small: Legacy shallow-clone merge coverage was split into explicit partitioned and
  non-partitioned cases.
- Known intentional difference: `HDP to Hive 3.1 migration`
- Reviewer note: Matched by current suite selection: `SuiteDeltaLakeOss` run 1
- Audit status: `verified`

##### `testShallowCloneTableMergePartitioned`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/deltalake/TestDeltaLakeCloneTableCompatibility.java` ->
  `testShallowCloneTableMerge`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/deltalake/TestDeltaLakeCloneTableCompatibility.java` ->
  `TestDeltaLakeCloneTableCompatibility.testShallowCloneTableMergePartitioned`
- Mapping type: `split`
- Environment parity: Current class requires `DeltaLakeMinioEnvironment`. Routed by source review into
  `SuiteDeltaLakeOss` run 1.
- Tag parity: Current tags: `DeltaLakeMinio`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: none. No legacy setup method body was available.
- Action parity: Current action verbs: none. No legacy action method body was available.
- Assertion parity: Current assertion helpers: none. No legacy assertion method body was available.
- Cleanup parity: Current cleanup operations: none. No legacy cleanup method body was available.
- Any observed difference, however small: Legacy shallow-clone merge coverage was split into explicit partitioned and
  non-partitioned cases.
- Known intentional difference: `HDP to Hive 3.1 migration`
- Reviewer note: Matched by current suite selection: `SuiteDeltaLakeOss` run 1
- Audit status: `verified`

##### `testReadShallowCloneTableWithSourceDeletionVectorPartitioned`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/deltalake/TestDeltaLakeCloneTableCompatibility.java` ->
  `testReadShallowCloneTableWithSourceDeletionVector`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/deltalake/TestDeltaLakeCloneTableCompatibility.java` ->
  `TestDeltaLakeCloneTableCompatibility.testReadShallowCloneTableWithSourceDeletionVectorPartitioned`
- Mapping type: `split`
- Environment parity: Current class requires `DeltaLakeMinioEnvironment`. Routed by source review into
  `SuiteDeltaLakeOss` run 1.
- Tag parity: Current tags: `DeltaLakeMinio`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: none. No legacy setup method body was available.
- Action parity: Current action verbs: none. No legacy action method body was available.
- Assertion parity: Current assertion helpers: none. No legacy assertion method body was available.
- Cleanup parity: Current cleanup operations: none. No legacy cleanup method body was available.
- Any observed difference, however small: Legacy deletion-vector shallow-clone coverage was split into explicit
  partitioned and non-partitioned cases.
- Known intentional difference: `HDP to Hive 3.1 migration`
- Reviewer note: Matched by current suite selection: `SuiteDeltaLakeOss` run 1
- Audit status: `verified`

##### `testReadShallowCloneTableWithSourceDeletionVectorNonPartitioned`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/deltalake/TestDeltaLakeCloneTableCompatibility.java` ->
  `testReadShallowCloneTableWithSourceDeletionVector`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/deltalake/TestDeltaLakeCloneTableCompatibility.java` ->
  `TestDeltaLakeCloneTableCompatibility.testReadShallowCloneTableWithSourceDeletionVectorNonPartitioned`
- Mapping type: `split`
- Environment parity: Current class requires `DeltaLakeMinioEnvironment`. Routed by source review into
  `SuiteDeltaLakeOss` run 1.
- Tag parity: Current tags: `DeltaLakeMinio`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: none. No legacy setup method body was available.
- Action parity: Current action verbs: none. No legacy action method body was available.
- Assertion parity: Current assertion helpers: none. No legacy assertion method body was available.
- Cleanup parity: Current cleanup operations: none. No legacy cleanup method body was available.
- Any observed difference, however small: Legacy deletion-vector shallow-clone coverage was split into explicit
  partitioned and non-partitioned cases.
- Known intentional difference: `HDP to Hive 3.1 migration`
- Reviewer note: Matched by current suite selection: `SuiteDeltaLakeOss` run 1
- Audit status: `verified`

### `TestDeltaLakeColumnMappingMode`

- Owning migration commit: `Migrate TestDeltaLakeColumnMappingMode to JUnit`
- Current class added in same migration commit:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/deltalake/TestDeltaLakeColumnMappingMode.java`
- Legacy class removed in same migration commit:
    - `testing/trino-product-tests/src/main/java/io/trino/tests/product/deltalake/TestDeltaLakeColumnMappingMode.java`
- Class-level environment requirement: `DeltaLakeMinioEnvironment`.
- Class-level tags: `DeltaLakeMinio`.
- Method inventory complete: Yes. Legacy methods: `31`. Current methods: `31`.
- Legacy helper/resource dependencies accounted for: Legacy class source reviewed directly.
- Intentional differences summary: `HDP to Hive 3.1 migration`
- Method statuses present: `verified`.

#### Methods

##### `testColumnMappingModeNone`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/deltalake/TestDeltaLakeColumnMappingMode.java` ->
  `testColumnMappingModeNone`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/deltalake/TestDeltaLakeColumnMappingMode.java` ->
  `TestDeltaLakeColumnMappingMode.testColumnMappingModeNone`
- Mapping type: `direct`
- Environment parity: Current class requires `DeltaLakeMinioEnvironment`. Routed by source review into
  `SuiteDeltaLakeOss` run 1.
- Tag parity: Current tags: `DeltaLakeMinio`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`, `INSERT`. Legacy setup operations: `CREATE`, `INSERT`.
- Action parity: Current action verbs: `SELECT`. Legacy action verbs: `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `containsOnly`, `row`. Legacy assertion helpers:
  `assertThat`, `containsOnly`, `row`.
- Cleanup parity: Current cleanup operations: `DROP`. No legacy cleanup method body was available.
- Any observed difference, however small: SQL verb set differs: legacy ['CREATE', 'INSERT', 'SELECT'] vs
  current ['CREATE', 'INSERT', 'SELECT', 'DROP']. Current method uses parameter-injected environment helpers instead of
  Tempto query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`
- Reviewer note: Matched by current suite selection: `SuiteDeltaLakeOss` run 1 Exact-name mapping with normalized body
  similarity `0.88`.
- Audit status: `verified`

##### `testColumnMappingModeTableFeature`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/deltalake/TestDeltaLakeColumnMappingMode.java` ->
  `testColumnMappingModeTableFeature`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/deltalake/TestDeltaLakeColumnMappingMode.java` ->
  `TestDeltaLakeColumnMappingMode.testColumnMappingModeTableFeature`
- Mapping type: `direct`
- Environment parity: Current class requires `DeltaLakeMinioEnvironment`. Routed by source review into
  `SuiteDeltaLakeOss` run 1.
- Tag parity: Current tags: `DeltaLakeMinio`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`, `INSERT`, `ALTER`. Legacy setup operations: `CREATE`, `INSERT`,
  `ALTER`.
- Action parity: Current action verbs: `SHOW`. Legacy action verbs: `SHOW`.
- Assertion parity: Current assertion helpers: `assertThat`, `contains`. Legacy assertion helpers: `assertThat`,
  `contains`.
- Cleanup parity: Current cleanup operations: `DROP`. No legacy cleanup method body was available.
- Any observed difference, however small: SQL verb set differs: legacy ['CREATE', 'INSERT', 'ALTER', 'SHOW'] vs
  current ['CREATE', 'INSERT', 'ALTER', 'SHOW', 'DROP']. Current method uses parameter-injected environment helpers
  instead of Tempto query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`
- Reviewer note: Matched by current suite selection: `SuiteDeltaLakeOss` run 1 Exact-name mapping with normalized body
  similarity `0.76`.
- Audit status: `verified`

##### `testTrinoColumnMappingModeReaderAndWriterVersion`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/deltalake/TestDeltaLakeColumnMappingMode.java` ->
  `testTrinoColumnMappingModeReaderAndWriterVersion`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/deltalake/TestDeltaLakeColumnMappingMode.java` ->
  `TestDeltaLakeColumnMappingMode.testTrinoColumnMappingModeReaderAndWriterVersion`
- Mapping type: `direct`
- Environment parity: Current class requires `DeltaLakeMinioEnvironment`. Routed by source review into
  `SuiteDeltaLakeOss` run 1.
- Tag parity: Current tags: `DeltaLakeMinio`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`. Legacy setup operations: `CREATE`.
- Action parity: Current action verbs: `WITH`. Legacy action verbs: `WITH`.
- Assertion parity: Current assertion helpers: none. No legacy assertion method body was available.
- Cleanup parity: Current cleanup operations: none. No legacy cleanup method body was available.
- Any observed difference, however small: Current method uses parameter-injected environment helpers instead of Tempto
  query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`
- Reviewer note: Matched by current suite selection: `SuiteDeltaLakeOss` run 1 Exact-name mapping with normalized body
  similarity `0.89`.
- Audit status: `verified`

##### `testChangingColumnMappingModeViaCreateOrReplaceTableOnTrino`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/deltalake/TestDeltaLakeColumnMappingMode.java` ->
  `testChangingColumnMappingModeViaCreateOrReplaceTableOnTrino`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/deltalake/TestDeltaLakeColumnMappingMode.java` ->
  `TestDeltaLakeColumnMappingMode.testChangingColumnMappingModeViaCreateOrReplaceTableOnTrino`
- Mapping type: `direct`
- Environment parity: Current class requires `DeltaLakeMinioEnvironment`. Routed by source review into
  `SuiteDeltaLakeOss` run 1.
- Tag parity: Current tags: `DeltaLakeMinio`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`. Legacy setup operations: `CREATE`.
- Action parity: Current action verbs: `WITH`. Legacy action verbs: `WITH`.
- Assertion parity: Current assertion helpers: `assertTableReaderAndWriterVersion`. Legacy assertion helpers:
  `assertTableReaderAndWriterVersion`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: Current method uses parameter-injected environment helpers instead of Tempto
  query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`
- Reviewer note: Matched by current suite selection: `SuiteDeltaLakeOss` run 1 Exact-name mapping with normalized body
  similarity `0.91`.
- Audit status: `verified`

##### `testChangingColumnMappingModeViaCreateOrReplaceTableOnDelta`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/deltalake/TestDeltaLakeColumnMappingMode.java` ->
  `testChangingColumnMappingModeViaCreateOrReplaceTableOnDelta`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/deltalake/TestDeltaLakeColumnMappingMode.java` ->
  `TestDeltaLakeColumnMappingMode.testChangingColumnMappingModeViaCreateOrReplaceTableOnDelta`
- Mapping type: `direct`
- Environment parity: Current class requires `DeltaLakeMinioEnvironment`. Routed by source review into
  `SuiteDeltaLakeOss` run 1.
- Tag parity: Current tags: `DeltaLakeMinio`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`. Legacy setup operations: `CREATE`.
- Action parity: Current action verbs: none. Legacy action verbs: none.
- Assertion parity: Current assertion helpers: `assertTableReaderAndWriterVersion`. Legacy assertion helpers:
  `assertTableReaderAndWriterVersion`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: Current method uses parameter-injected environment helpers instead of Tempto
  query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`
- Reviewer note: Matched by current suite selection: `SuiteDeltaLakeOss` run 1 Exact-name mapping with normalized body
  similarity `0.91`.
- Audit status: `verified`

##### `testDeltaColumnMappingModeReaderAndWriterVersion`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/deltalake/TestDeltaLakeColumnMappingMode.java` ->
  `testDeltaColumnMappingModeReaderAndWriterVersion`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/deltalake/TestDeltaLakeColumnMappingMode.java` ->
  `TestDeltaLakeColumnMappingMode.testDeltaColumnMappingModeReaderAndWriterVersion`
- Mapping type: `direct`
- Environment parity: Current class requires `DeltaLakeMinioEnvironment`. Routed by source review into
  `SuiteDeltaLakeOss` run 1.
- Tag parity: Current tags: `DeltaLakeMinio`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`. Legacy setup operations: `CREATE`.
- Action parity: Current action verbs: none. Legacy action verbs: none.
- Assertion parity: Current assertion helpers: none. No legacy assertion method body was available.
- Cleanup parity: Current cleanup operations: none. No legacy cleanup method body was available.
- Any observed difference, however small: No method-specific difference identified beyond the documented framework
  baseline.
- Known intentional difference: None.
- Reviewer note: Matched by current suite selection: `SuiteDeltaLakeOss` run 1 High normalized body similarity `0.89`.
- Audit status: `verified`

##### `testTrinoColumnMappingMode`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/deltalake/TestDeltaLakeColumnMappingMode.java` ->
  `testTrinoColumnMappingMode`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/deltalake/TestDeltaLakeColumnMappingMode.java` ->
  `TestDeltaLakeColumnMappingMode.testTrinoColumnMappingMode`
- Mapping type: `direct`
- Environment parity: Current class requires `DeltaLakeMinioEnvironment`. Routed by source review into
  `SuiteDeltaLakeOss` run 1.
- Tag parity: Current tags: `DeltaLakeMinio`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`. Legacy setup operations: `CREATE`.
- Action parity: Current action verbs: `WITH`. Legacy action verbs: `WITH`.
- Assertion parity: Current assertion helpers: none. No legacy assertion method body was available.
- Cleanup parity: Current cleanup operations: none. No legacy cleanup method body was available.
- Any observed difference, however small: Current method uses parameter-injected environment helpers instead of Tempto
  query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`
- Reviewer note: Matched by current suite selection: `SuiteDeltaLakeOss` run 1 Exact-name mapping with normalized body
  similarity `0.92`.
- Audit status: `verified`

##### `testDeltaColumnMappingMode`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/deltalake/TestDeltaLakeColumnMappingMode.java` ->
  `testDeltaColumnMappingMode`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/deltalake/TestDeltaLakeColumnMappingMode.java` ->
  `TestDeltaLakeColumnMappingMode.testDeltaColumnMappingMode`
- Mapping type: `direct`
- Environment parity: Current class requires `DeltaLakeMinioEnvironment`. Routed by source review into
  `SuiteDeltaLakeOss` run 1.
- Tag parity: Current tags: `DeltaLakeMinio`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`. Legacy setup operations: `CREATE`.
- Action parity: Current action verbs: none. Legacy action verbs: none.
- Assertion parity: Current assertion helpers: none. No legacy assertion method body was available.
- Cleanup parity: Current cleanup operations: none. No legacy cleanup method body was available.
- Any observed difference, however small: No method-specific difference identified beyond the documented framework
  baseline.
- Known intentional difference: None.
- Reviewer note: Matched by current suite selection: `SuiteDeltaLakeOss` run 1 High normalized body similarity `0.93`.
- Audit status: `verified`

##### `testColumnMappingModeNameWithNonLowerCaseColumn`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/deltalake/TestDeltaLakeColumnMappingMode.java` ->
  `testColumnMappingModeNameWithNonLowerCaseColumn`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/deltalake/TestDeltaLakeColumnMappingMode.java` ->
  `TestDeltaLakeColumnMappingMode.testColumnMappingModeNameWithNonLowerCaseColumn`
- Mapping type: `direct`
- Environment parity: Current class requires `DeltaLakeMinioEnvironment`. Routed by source review into
  `SuiteDeltaLakeOss` run 1.
- Tag parity: Current tags: `DeltaLakeMinio`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`, `INSERT`. Legacy setup operations: `CREATE`, `INSERT`.
- Action parity: Current action verbs: `SELECT`, `SHOW`. Legacy action verbs: `SELECT`, `SHOW`.
- Assertion parity: Current assertion helpers: `assertThat`, `containsOnly`, `isEqualTo`, `row`. Legacy assertion
  helpers: `assertThat`, `containsOnly`, `isEqualTo`, `row`.
- Cleanup parity: Current cleanup operations: `DROP`. No legacy cleanup method body was available.
- Any observed difference, however small: SQL verb set differs: legacy ['CREATE', 'INSERT', 'SELECT', 'SHOW'] vs
  current ['CREATE', 'INSERT', 'SELECT', 'SHOW', 'DROP']. Current method uses parameter-injected environment helpers
  instead of Tempto query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`
- Reviewer note: Matched by current suite selection: `SuiteDeltaLakeOss` run 1 Exact-name mapping with normalized body
  similarity `0.73`.
- Audit status: `verified`

##### `testColumnMappingModeNameCreatePartitionTableAsSelect`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/deltalake/TestDeltaLakeColumnMappingMode.java` ->
  `testColumnMappingModeNameCreatePartitionTableAsSelect`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/deltalake/TestDeltaLakeColumnMappingMode.java` ->
  `TestDeltaLakeColumnMappingMode.testColumnMappingModeNameCreatePartitionTableAsSelect`
- Mapping type: `direct`
- Environment parity: Current class requires `DeltaLakeMinioEnvironment`. Routed by source review into
  `SuiteDeltaLakeOss` run 1.
- Tag parity: Current tags: `DeltaLakeMinio`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`. Legacy setup operations: `CREATE`.
- Action parity: Current action verbs: `WITH`, `SELECT`. Legacy action verbs: `WITH`, `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `containsOnly`, `row`. Legacy assertion helpers:
  `assertThat`, `containsOnly`, `row`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: Current method uses parameter-injected environment helpers instead of Tempto
  query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`
- Reviewer note: Matched by current suite selection: `SuiteDeltaLakeOss` run 1 Exact-name mapping with normalized body
  similarity `0.85`.
- Audit status: `verified`

##### `testCreateTableWithCommentsColumnMappingModeName`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/deltalake/TestDeltaLakeColumnMappingMode.java` ->
  `testCreateTableWithCommentsColumnMappingModeName`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/deltalake/TestDeltaLakeColumnMappingMode.java` ->
  `TestDeltaLakeColumnMappingMode.testCreateTableWithCommentsColumnMappingModeName`
- Mapping type: `direct`
- Environment parity: Current class requires `DeltaLakeMinioEnvironment`. Routed by source review into
  `SuiteDeltaLakeOss` run 1.
- Tag parity: Current tags: `DeltaLakeMinio`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`. Legacy setup operations: `CREATE`.
- Action parity: Current action verbs: `WITH`. Legacy action verbs: `WITH`.
- Assertion parity: Current assertion helpers: `assertThat`, `isEqualTo`. Legacy assertion helpers: `assertThat`,
  `isEqualTo`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: Current method uses parameter-injected environment helpers instead of Tempto
  query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`
- Reviewer note: Matched by current suite selection: `SuiteDeltaLakeOss` run 1 Exact-name mapping with normalized body
  similarity `0.86`.
- Audit status: `verified`

##### `testColumnMappingModeNameCommentOnTable`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/deltalake/TestDeltaLakeColumnMappingMode.java` ->
  `testColumnMappingModeNameCommentOnTable`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/deltalake/TestDeltaLakeColumnMappingMode.java` ->
  `TestDeltaLakeColumnMappingMode.testColumnMappingModeNameCommentOnTable`
- Mapping type: `direct`
- Environment parity: Current class requires `DeltaLakeMinioEnvironment`. Routed by source review into
  `SuiteDeltaLakeOss` run 1.
- Tag parity: Current tags: `DeltaLakeMinio`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`. Legacy setup operations: `CREATE`.
- Action parity: Current action verbs: none. Legacy action verbs: none.
- Assertion parity: Current assertion helpers: `assertThat`, `isEqualTo`. Legacy assertion helpers: `assertThat`,
  `isEqualTo`.
- Cleanup parity: Current cleanup operations: `DROP`. No legacy cleanup method body was available.
- Any observed difference, however small: SQL verb set differs: legacy ['CREATE'] vs current ['CREATE', 'DROP']. Current
  method uses parameter-injected environment helpers instead of Tempto query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`
- Reviewer note: Matched by current suite selection: `SuiteDeltaLakeOss` run 1 Exact-name mapping with normalized body
  similarity `0.75`.
- Audit status: `verified`

##### `testColumnMappingModeNameCommentOnColumn`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/deltalake/TestDeltaLakeColumnMappingMode.java` ->
  `testColumnMappingModeNameCommentOnColumn`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/deltalake/TestDeltaLakeColumnMappingMode.java` ->
  `TestDeltaLakeColumnMappingMode.testColumnMappingModeNameCommentOnColumn`
- Mapping type: `direct`
- Environment parity: Current class requires `DeltaLakeMinioEnvironment`. Routed by source review into
  `SuiteDeltaLakeOss` run 1.
- Tag parity: Current tags: `DeltaLakeMinio`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`, `ALTER`. Legacy setup operations: `CREATE`, `ALTER`.
- Action parity: Current action verbs: `WITH`. Legacy action verbs: `WITH`.
- Assertion parity: Current assertion helpers: `assertThat`, `isEqualTo`. Legacy assertion helpers: `assertThat`,
  `isEqualTo`.
- Cleanup parity: Current cleanup operations: `DROP`. No legacy cleanup method body was available.
- Any observed difference, however small: SQL verb set differs: legacy ['CREATE', 'WITH', 'ALTER'] vs
  current ['CREATE', 'WITH', 'ALTER', 'DROP']. Current method uses parameter-injected environment helpers instead of
  Tempto query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`
- Reviewer note: Matched by current suite selection: `SuiteDeltaLakeOss` run 1 Exact-name mapping with normalized body
  similarity `0.75`.
- Audit status: `verified`

##### `testColumnMappingModeNameAddColumn`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/deltalake/TestDeltaLakeColumnMappingMode.java` ->
  `testColumnMappingModeNameAddColumn`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/deltalake/TestDeltaLakeColumnMappingMode.java` ->
  `TestDeltaLakeColumnMappingMode.testColumnMappingModeNameAddColumn`
- Mapping type: `direct`
- Environment parity: Current class requires `DeltaLakeMinioEnvironment`. Routed by source review into
  `SuiteDeltaLakeOss` run 1.
- Tag parity: Current tags: `DeltaLakeMinio`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `ALTER`. Legacy setup operations: `ALTER`.
- Action parity: Current action verbs: none. Legacy action verbs: none.
- Assertion parity: Current assertion helpers: none. No legacy assertion method body was available.
- Cleanup parity: Current cleanup operations: none. No legacy cleanup method body was available.
- Any observed difference, however small: Current method uses parameter-injected environment helpers instead of Tempto
  query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`
- Reviewer note: Matched by current suite selection: `SuiteDeltaLakeOss` run 1 Exact-name mapping with normalized body
  similarity `0.86`.
- Audit status: `verified`

##### `testColumnMappingModeIdAddColumn`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/deltalake/TestDeltaLakeColumnMappingMode.java` ->
  `testColumnMappingModeIdAddColumn`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/deltalake/TestDeltaLakeColumnMappingMode.java` ->
  `TestDeltaLakeColumnMappingMode.testColumnMappingModeIdAddColumn`
- Mapping type: `direct`
- Environment parity: Current class requires `DeltaLakeMinioEnvironment`. Routed by source review into
  `SuiteDeltaLakeOss` run 1.
- Tag parity: Current tags: `DeltaLakeMinio`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `ALTER`. Legacy setup operations: `ALTER`.
- Action parity: Current action verbs: none. Legacy action verbs: none.
- Assertion parity: Current assertion helpers: `row`. Legacy assertion helpers: `row`.
- Cleanup parity: Current cleanup operations: none. No legacy cleanup method body was available.
- Any observed difference, however small: Current method uses parameter-injected environment helpers instead of Tempto
  query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`
- Reviewer note: Matched by current suite selection: `SuiteDeltaLakeOss` run 1 Exact-name mapping with normalized body
  similarity `0.74`.
- Audit status: `verified`

##### `testTrinoColumnMappingModeNameAddColumnWithExistingNonLowerCaseColumn`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/deltalake/TestDeltaLakeColumnMappingMode.java` ->
  `testTrinoColumnMappingModeNameAddColumnWithExistingNonLowerCaseColumn`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/deltalake/TestDeltaLakeColumnMappingMode.java` ->
  `TestDeltaLakeColumnMappingMode.testTrinoColumnMappingModeNameAddColumnWithExistingNonLowerCaseColumn`
- Mapping type: `direct`
- Environment parity: Current class requires `DeltaLakeMinioEnvironment`. Routed by source review into
  `SuiteDeltaLakeOss` run 1.
- Tag parity: Current tags: `DeltaLakeMinio`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`, `INSERT`, `ALTER`. Legacy setup operations: `CREATE`, `INSERT`,
  `ALTER`.
- Action parity: Current action verbs: `SELECT`. Legacy action verbs: `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `containsExactly`, `containsOnly`, `row`. Legacy assertion
  helpers: `assertThat`, `containsExactly`, `containsOnly`, `row`.
- Cleanup parity: Current cleanup operations: `DROP`. No legacy cleanup method body was available.
- Any observed difference, however small: SQL verb set differs: legacy ['CREATE', 'INSERT', 'ALTER', 'SELECT'] vs
  current ['CREATE', 'INSERT', 'ALTER', 'SELECT', 'DROP']. Current method uses parameter-injected environment helpers
  instead of Tempto query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`
- Reviewer note: Matched by current suite selection: `SuiteDeltaLakeOss` run 1 Exact-name mapping with normalized body
  similarity `0.84`.
- Audit status: `verified`

##### `testShowStatsFromJsonForColumnMappingMode`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/deltalake/TestDeltaLakeColumnMappingMode.java` ->
  `testShowStatsFromJsonForColumnMappingMode`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/deltalake/TestDeltaLakeColumnMappingMode.java` ->
  `TestDeltaLakeColumnMappingMode.testShowStatsFromJsonForColumnMappingMode`
- Mapping type: `direct`
- Environment parity: Current class requires `DeltaLakeMinioEnvironment`. Routed by source review into
  `SuiteDeltaLakeOss` run 1.
- Tag parity: Current tags: `DeltaLakeMinio`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`, `INSERT`. Legacy setup operations: `CREATE`, `INSERT`.
- Action parity: Current action verbs: `SHOW`, `ANALYZE`. Legacy action verbs: `SHOW`, `ANALYZE`.
- Assertion parity: Current assertion helpers: `assertThat`, `containsOnly`, `row`. Legacy assertion helpers:
  `assertThat`, `containsOnly`, `row`.
- Cleanup parity: Current cleanup operations: `DROP`. No legacy cleanup method body was available.
- Any observed difference, however small: Normalized body similarity is low (`0.49`), so fidelity was judged from
  SQL/helper/assertion shape instead of raw text. SQL verb set differs: legacy ['CREATE', 'INSERT', 'SHOW', 'ANALYZE']
  vs current ['CREATE', 'INSERT', 'SHOW', 'ANALYZE', 'DROP']. Current method uses parameter-injected environment helpers
  instead of Tempto query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`
- Reviewer note: Matched by current suite selection: `SuiteDeltaLakeOss` run 1 Exact-name mapping with normalized body
  similarity `0.49`.
- Audit status: `verified`

##### `testShowStatsFromParquetForColumnMappingModeName`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/deltalake/TestDeltaLakeColumnMappingMode.java` ->
  `testShowStatsFromParquetForColumnMappingModeName`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/deltalake/TestDeltaLakeColumnMappingMode.java` ->
  `TestDeltaLakeColumnMappingMode.testShowStatsFromParquetForColumnMappingModeName`
- Mapping type: `direct`
- Environment parity: Current class requires `DeltaLakeMinioEnvironment`. Routed by source review into
  `SuiteDeltaLakeOss` run 1.
- Tag parity: Current tags: `DeltaLakeMinio`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`, `INSERT`. Legacy setup operations: `CREATE`, `INSERT`.
- Action parity: Current action verbs: `SHOW`, `ANALYZE`. Legacy action verbs: `SHOW`, `ANALYZE`.
- Assertion parity: Current assertion helpers: `assertThat`, `containsOnly`, `row`. Legacy assertion helpers:
  `assertThat`, `containsOnly`, `row`.
- Cleanup parity: Current cleanup operations: `DROP`. No legacy cleanup method body was available.
- Any observed difference, however small: SQL verb set differs: legacy ['CREATE', 'INSERT', 'SHOW', 'ANALYZE'] vs
  current ['CREATE', 'INSERT', 'SHOW', 'ANALYZE', 'DROP']. Current method uses parameter-injected environment helpers
  instead of Tempto query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`
- Reviewer note: Matched by current suite selection: `SuiteDeltaLakeOss` run 1 Exact-name mapping with normalized body
  similarity `0.57`.
- Audit status: `verified`

##### `testShowStatsOnPartitionedForColumnMappingModeId`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/deltalake/TestDeltaLakeColumnMappingMode.java` ->
  `testShowStatsOnPartitionedForColumnMappingModeId`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/deltalake/TestDeltaLakeColumnMappingMode.java` ->
  `TestDeltaLakeColumnMappingMode.testShowStatsOnPartitionedForColumnMappingModeId`
- Mapping type: `direct`
- Environment parity: Current class requires `DeltaLakeMinioEnvironment`. Routed by source review into
  `SuiteDeltaLakeOss` run 1.
- Tag parity: Current tags: `DeltaLakeMinio`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`, `INSERT`. Legacy setup operations: `CREATE`, `INSERT`.
- Action parity: Current action verbs: `SHOW`. Legacy action verbs: `SHOW`.
- Assertion parity: Current assertion helpers: `assertThat`, `containsOnly`, `row`. Legacy assertion helpers:
  `assertThat`, `containsOnly`, `row`.
- Cleanup parity: Current cleanup operations: `DROP`. No legacy cleanup method body was available.
- Any observed difference, however small: SQL verb set differs: legacy ['CREATE', 'INSERT', 'SHOW'] vs
  current ['CREATE', 'INSERT', 'SHOW', 'DROP']. Current method uses parameter-injected environment helpers instead of
  Tempto query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`
- Reviewer note: Matched by current suite selection: `SuiteDeltaLakeOss` run 1 Exact-name mapping with normalized body
  similarity `0.64`.
- Audit status: `verified`

##### `testProjectionPushdownDmlWithColumnMappingMode`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/deltalake/TestDeltaLakeColumnMappingMode.java` ->
  `testProjectionPushdownDmlWithColumnMappingMode`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/deltalake/TestDeltaLakeColumnMappingMode.java` ->
  `TestDeltaLakeColumnMappingMode.testProjectionPushdownDmlWithColumnMappingMode`
- Mapping type: `direct`
- Environment parity: Current class requires `DeltaLakeMinioEnvironment`. Routed by source review into
  `SuiteDeltaLakeOss` run 1.
- Tag parity: Current tags: `DeltaLakeMinio`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`, `INSERT`, `UPDATE`. Legacy setup operations: `CREATE`, `INSERT`,
  `UPDATE`.
- Action parity: Current action verbs: `MERGE`, `SELECT`. Legacy action verbs: `MERGE`, `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `containsOnly`, `row`. Legacy assertion helpers:
  `assertThat`, `containsOnly`, `row`.
- Cleanup parity: Current cleanup operations: `DELETE`, `DROP`. Legacy cleanup operations: `DELETE`.
- Any observed difference, however small: SQL verb set differs:
  legacy ['CREATE', 'INSERT', 'MERGE', 'SELECT', 'DELETE', 'UPDATE'] vs
  current ['CREATE', 'INSERT', 'MERGE', 'SELECT', 'DELETE', 'UPDATE', 'DROP']. Current method uses parameter-injected
  environment helpers instead of Tempto query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`
- Reviewer note: Matched by current suite selection: `SuiteDeltaLakeOss` run 1 Exact-name mapping with normalized body
  similarity `0.89`.
- Audit status: `verified`

##### `testChangeColumnMappingAndShowStatsForColumnMappingMode`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/deltalake/TestDeltaLakeColumnMappingMode.java` ->
  `testChangeColumnMappingAndShowStatsForColumnMappingMode`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/deltalake/TestDeltaLakeColumnMappingMode.java` ->
  `TestDeltaLakeColumnMappingMode.testChangeColumnMappingAndShowStatsForColumnMappingMode`
- Mapping type: `direct`
- Environment parity: Current class requires `DeltaLakeMinioEnvironment`. Routed by source review into
  `SuiteDeltaLakeOss` run 1.
- Tag parity: Current tags: `DeltaLakeMinio`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`, `INSERT`, `ALTER`. Legacy setup operations: `CREATE`, `INSERT`,
  `ALTER`.
- Action parity: Current action verbs: `ANALYZE`, `SHOW`. Legacy action verbs: `ANALYZE`, `SHOW`.
- Assertion parity: Current assertion helpers: `assertThat`, `containsOnly`, `row`. Legacy assertion helpers:
  `assertThat`, `containsOnly`, `row`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: Current method uses parameter-injected environment helpers instead of Tempto
  query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`
- Reviewer note: Matched by current suite selection: `SuiteDeltaLakeOss` run 1 Exact-name mapping with normalized body
  similarity `0.58`.
- Audit status: `verified`

##### `testChangeColumnMappingMode`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/deltalake/TestDeltaLakeColumnMappingMode.java` ->
  `testChangeColumnMappingMode`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/deltalake/TestDeltaLakeColumnMappingMode.java` ->
  `TestDeltaLakeColumnMappingMode.testChangeColumnMappingMode`
- Mapping type: `direct`
- Environment parity: Current class requires `DeltaLakeMinioEnvironment`. Routed by source review into
  `SuiteDeltaLakeOss` run 1.
- Tag parity: Current tags: `DeltaLakeMinio`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`, `ALTER`. Legacy setup operations: `CREATE`, `ALTER`.
- Action parity: Current action verbs: none. Legacy action verbs: none.
- Assertion parity: Current assertion helpers: `assertThatThrownBy`. Legacy assertion helpers: `assertQueryFailure`,
  `hasMessageContaining`.
- Cleanup parity: Current cleanup operations: `DROP`. No legacy cleanup method body was available.
- Any observed difference, however small: SQL verb set differs: legacy ['CREATE', 'ALTER'] vs
  current ['CREATE', 'ALTER', 'DROP']. Assertion helper names differ between legacy and current implementations.
- Known intentional difference: `HDP to Hive 3.1 migration`
- Reviewer note: Matched by current suite selection: `SuiteDeltaLakeOss` run 1 Exact-name mapping with normalized body
  similarity `0.88`.
- Audit status: `verified`

##### `testRecalculateStatsForColumnMappingModeIdAndNoInitialStatistics`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/deltalake/TestDeltaLakeColumnMappingMode.java` ->
  `testRecalculateStatsForColumnMappingModeIdAndNoInitialStatistics`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/deltalake/TestDeltaLakeColumnMappingMode.java` ->
  `TestDeltaLakeColumnMappingMode.testRecalculateStatsForColumnMappingModeIdAndNoInitialStatistics`
- Mapping type: `direct`
- Environment parity: Current class requires `DeltaLakeMinioEnvironment`. Routed by source review into
  `SuiteDeltaLakeOss` run 1.
- Tag parity: Current tags: `DeltaLakeMinio`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`, `INSERT`. Legacy setup operations: `CREATE`, `INSERT`.
- Action parity: Current action verbs: `SELECT`, `SHOW`, `ANALYZE`. Legacy action verbs: `SELECT`, `SHOW`, `ANALYZE`.
- Assertion parity: Current assertion helpers: `assertThat`, `containsOnly`, `row`. Legacy assertion helpers:
  `assertThat`, `containsOnly`, `row`.
- Cleanup parity: Current cleanup operations: `DROP`. No legacy cleanup method body was available.
- Any observed difference, however small: Normalized body similarity is low (`0.47`), so fidelity was judged from
  SQL/helper/assertion shape instead of raw text. SQL verb set differs:
  legacy ['CREATE', 'INSERT', 'SELECT', 'SHOW', 'ANALYZE'] vs
  current ['CREATE', 'INSERT', 'SELECT', 'SHOW', 'ANALYZE', 'DROP']. Current method uses parameter-injected environment
  helpers instead of Tempto query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`
- Reviewer note: Matched by current suite selection: `SuiteDeltaLakeOss` run 1 Exact-name mapping with normalized body
  similarity `0.47`.
- Audit status: `verified`

##### `testMergeUpdateWithColumnMapping`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/deltalake/TestDeltaLakeColumnMappingMode.java` ->
  `testMergeUpdateWithColumnMapping`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/deltalake/TestDeltaLakeColumnMappingMode.java` ->
  `TestDeltaLakeColumnMappingMode.testMergeUpdateWithColumnMapping`
- Mapping type: `direct`
- Environment parity: Current class requires `DeltaLakeMinioEnvironment`. Routed by source review into
  `SuiteDeltaLakeOss` run 1.
- Tag parity: Current tags: `DeltaLakeMinio`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`, `INSERT`. Legacy setup operations: `CREATE`, `INSERT`.
- Action parity: Current action verbs: `MERGE`, `SELECT`. Legacy action verbs: `MERGE`, `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `containsOnly`, `row`. Legacy assertion helpers:
  `assertThat`, `containsOnly`, `row`.
- Cleanup parity: Current cleanup operations: `DROP`. No legacy cleanup method body was available.
- Any observed difference, however small: SQL verb set differs: legacy ['CREATE', 'INSERT', 'MERGE', 'SELECT'] vs
  current ['CREATE', 'INSERT', 'MERGE', 'SELECT', 'DROP']. Current method uses parameter-injected environment helpers
  instead of Tempto query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`
- Reviewer note: Matched by current suite selection: `SuiteDeltaLakeOss` run 1 Exact-name mapping with normalized body
  similarity `0.88`.
- Audit status: `verified`

##### `testMergeDeleteWithColumnMapping`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/deltalake/TestDeltaLakeColumnMappingMode.java` ->
  `testMergeDeleteWithColumnMapping`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/deltalake/TestDeltaLakeColumnMappingMode.java` ->
  `TestDeltaLakeColumnMappingMode.testMergeDeleteWithColumnMapping`
- Mapping type: `direct`
- Environment parity: Current class requires `DeltaLakeMinioEnvironment`. Routed by source review into
  `SuiteDeltaLakeOss` run 1.
- Tag parity: Current tags: `DeltaLakeMinio`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`, `INSERT`. Legacy setup operations: `CREATE`, `INSERT`.
- Action parity: Current action verbs: `MERGE`. Legacy action verbs: `MERGE`.
- Assertion parity: Current assertion helpers: `assertDeltaTrinoTableEquals`, `row`. Legacy assertion helpers:
  `assertDeltaTrinoTableEquals`, `row`.
- Cleanup parity: Current cleanup operations: `DROP`. No legacy cleanup method body was available.
- Any observed difference, however small: SQL verb set differs: legacy ['CREATE', 'INSERT', 'MERGE'] vs
  current ['CREATE', 'INSERT', 'MERGE', 'DROP']. Current method uses parameter-injected environment helpers instead of
  Tempto query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`
- Reviewer note: Matched by current suite selection: `SuiteDeltaLakeOss` run 1 Exact-name mapping with normalized body
  similarity `0.95`.
- Audit status: `verified`

##### `testDropLastNonPartitionColumnWithColumnMappingMode`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/deltalake/TestDeltaLakeColumnMappingMode.java` ->
  `testDropLastNonPartitionColumnWithColumnMappingMode`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/deltalake/TestDeltaLakeColumnMappingMode.java` ->
  `TestDeltaLakeColumnMappingMode.testDropLastNonPartitionColumnWithColumnMappingMode`
- Mapping type: `direct`
- Environment parity: Current class requires `DeltaLakeMinioEnvironment`. Routed by source review into
  `SuiteDeltaLakeOss` run 1.
- Tag parity: Current tags: `DeltaLakeMinio`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`, `ALTER`. Legacy setup operations: `CREATE`, `ALTER`.
- Action parity: Current action verbs: `WITH`, `SELECT`. Legacy action verbs: `WITH`, `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `assertThatThrownBy`, `containsOnly`,
  `hasMessageContaining`, `row`. Legacy assertion helpers: `assertThat`, `assertThatThrownBy`, `containsOnly`,
  `hasMessageContaining`, `row`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: Current method uses parameter-injected environment helpers instead of Tempto
  query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`
- Reviewer note: Matched by current suite selection: `SuiteDeltaLakeOss` run 1 Exact-name mapping with normalized body
  similarity `0.90`.
- Audit status: `verified`

##### `testTrinoExtendedStatisticsDropAndAddColumnWithColumnMappingMode`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/deltalake/TestDeltaLakeColumnMappingMode.java` ->
  `testTrinoExtendedStatisticsDropAndAddColumnWithColumnMappingMode`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/deltalake/TestDeltaLakeColumnMappingMode.java` ->
  `TestDeltaLakeColumnMappingMode.testTrinoExtendedStatisticsDropAndAddColumnWithColumnMappingMode`
- Mapping type: `direct`
- Environment parity: Current class requires `DeltaLakeMinioEnvironment`. Routed by source review into
  `SuiteDeltaLakeOss` run 1.
- Tag parity: Current tags: `DeltaLakeMinio`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`, `INSERT`, `ALTER`. Legacy setup operations: `CREATE`, `INSERT`,
  `ALTER`.
- Action parity: Current action verbs: `ANALYZE`, `SHOW`. Legacy action verbs: `ANALYZE`, `SHOW`.
- Assertion parity: Current assertion helpers: `assertThat`, `containsOnly`, `row`. Legacy assertion helpers:
  `assertThat`, `containsOnly`, `row`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: Current method uses parameter-injected environment helpers instead of Tempto
  query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`
- Reviewer note: Matched by current suite selection: `SuiteDeltaLakeOss` run 1 Exact-name mapping with normalized body
  similarity `0.66`.
- Audit status: `verified`

##### `testDropNonLowercaseColumnWithColumnMappingMode`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/deltalake/TestDeltaLakeColumnMappingMode.java` ->
  `testDropNonLowercaseColumnWithColumnMappingMode`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/deltalake/TestDeltaLakeColumnMappingMode.java` ->
  `TestDeltaLakeColumnMappingMode.testDropNonLowercaseColumnWithColumnMappingMode`
- Mapping type: `direct`
- Environment parity: Current class requires `DeltaLakeMinioEnvironment`. Routed by source review into
  `SuiteDeltaLakeOss` run 1.
- Tag parity: Current tags: `DeltaLakeMinio`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`, `INSERT`, `ALTER`. Legacy setup operations: `CREATE`, `INSERT`,
  `ALTER`.
- Action parity: Current action verbs: `SHOW`, `SELECT`. Legacy action verbs: `SHOW`, `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `assertThatThrownBy`, `containsExactly`, `containsOnly`,
  `hasMessageContaining`, `row`. Legacy assertion helpers: `assertThat`, `assertThatThrownBy`, `containsExactly`,
  `containsOnly`, `hasMessageContaining`, `row`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: Current method uses parameter-injected environment helpers instead of Tempto
  query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`
- Reviewer note: Matched by current suite selection: `SuiteDeltaLakeOss` run 1 Exact-name mapping with normalized body
  similarity `0.73`.
- Audit status: `verified`

##### `testTrinoRenameColumnWithColumnMappingModeName`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/deltalake/TestDeltaLakeColumnMappingMode.java` ->
  `testTrinoRenameColumnWithColumnMappingModeName`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/deltalake/TestDeltaLakeColumnMappingMode.java` ->
  `TestDeltaLakeColumnMappingMode.testTrinoRenameColumnWithColumnMappingModeName`
- Mapping type: `direct`
- Environment parity: Current class requires `DeltaLakeMinioEnvironment`. Routed by source review into
  `SuiteDeltaLakeOss` run 1.
- Tag parity: Current tags: `DeltaLakeMinio`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `ALTER`. Legacy setup operations: `ALTER`.
- Action parity: Current action verbs: none. Legacy action verbs: none.
- Assertion parity: Current assertion helpers: none. No legacy assertion method body was available.
- Cleanup parity: Current cleanup operations: none. No legacy cleanup method body was available.
- Any observed difference, however small: Current method uses parameter-injected environment helpers instead of Tempto
  query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`
- Reviewer note: Matched by current suite selection: `SuiteDeltaLakeOss` run 1 Exact-name mapping with normalized body
  similarity `0.88`.
- Audit status: `verified`

##### `testSparkRenameColumnWithColumnMappingModeId`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/deltalake/TestDeltaLakeColumnMappingMode.java` ->
  `testSparkRenameColumnWithColumnMappingModeId`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/deltalake/TestDeltaLakeColumnMappingMode.java` ->
  `TestDeltaLakeColumnMappingMode.testSparkRenameColumnWithColumnMappingModeId`
- Mapping type: `direct`
- Environment parity: Current class requires `DeltaLakeMinioEnvironment`. Routed by source review into
  `SuiteDeltaLakeOss` run 1.
- Tag parity: Current tags: `DeltaLakeMinio`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `ALTER`. Legacy setup operations: `ALTER`.
- Action parity: Current action verbs: none. Legacy action verbs: none.
- Assertion parity: Current assertion helpers: none. No legacy assertion method body was available.
- Cleanup parity: Current cleanup operations: none. No legacy cleanup method body was available.
- Any observed difference, however small: No method-specific difference identified beyond the documented framework
  baseline.
- Known intentional difference: None.
- Reviewer note: Matched by current suite selection: `SuiteDeltaLakeOss` run 1 High normalized body similarity `0.87`.
- Audit status: `verified`

##### `testRenameNonLowercaseColumn`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/deltalake/TestDeltaLakeColumnMappingMode.java` ->
  `testRenameNonLowercaseColumn`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/deltalake/TestDeltaLakeColumnMappingMode.java` ->
  `TestDeltaLakeColumnMappingMode.testRenameNonLowercaseColumn`
- Mapping type: `direct`
- Environment parity: Current class requires `DeltaLakeMinioEnvironment`. Routed by source review into
  `SuiteDeltaLakeOss` run 1.
- Tag parity: Current tags: `DeltaLakeMinio`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`, `INSERT`, `ALTER`. Legacy setup operations: `CREATE`, `INSERT`,
  `ALTER`.
- Action parity: Current action verbs: `SHOW`, `SELECT`. Legacy action verbs: `SHOW`, `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `assertThatThrownBy`, `containsExactly`, `containsOnly`,
  `hasMessageContaining`, `isEqualTo`. Legacy assertion helpers: `assertQueryFailure`, `assertThat`, `containsExactly`,
  `containsOnly`, `hasMessageContaining`, `isEqualTo`.
- Cleanup parity: Current cleanup operations: `DROP`. No legacy cleanup method body was available.
- Any observed difference, however small: Normalized body similarity is low (`0.53`), so fidelity was judged from
  SQL/helper/assertion shape instead of raw text. SQL verb set differs:
  legacy ['CREATE', 'INSERT', 'SHOW', 'ALTER', 'SELECT'] vs
  current ['CREATE', 'INSERT', 'SHOW', 'ALTER', 'SELECT', 'DROP']. Assertion helper names differ between legacy and
  current implementations. Current method uses parameter-injected environment helpers instead of Tempto query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`
- Reviewer note: Matched by current suite selection: `SuiteDeltaLakeOss` run 1 Exact-name mapping with normalized body
  similarity `0.53`.
- Audit status: `verified`

### `TestDeltaLakeCreateOrReplaceTableAsSelectCompatibility`

- Owning migration commit: `Migrate TestDeltaLakeCreateOrReplaceTableAsSelectCompatibility to JUnit`
- Current class added in same migration commit:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/deltalake/TestDeltaLakeCreateOrReplaceTableAsSelectCompatibility.java`
- Legacy class removed in same migration commit:
  -
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/deltalake/TestDeltaLakeCreateOrReplaceTableAsSelectCompatibility.java`
- Class-level environment requirement: `DeltaLakeMinioEnvironment`.
- Class-level tags: `DeltaLakeMinio`.
- Method inventory complete: Yes. Legacy methods: `5`. Current methods: `5`.
- Legacy helper/resource dependencies accounted for: Legacy class source reviewed directly.
- Intentional differences summary: `HDP to Hive 3.1 migration`
- Method statuses present: `verified`.

#### Methods

##### `testCreateOrReplaceTableOnDeltaWithSchemaChange`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/deltalake/TestDeltaLakeCreateOrReplaceTableAsSelectCompatibility.java` ->
  `testCreateOrReplaceTableOnDeltaWithSchemaChange`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/deltalake/TestDeltaLakeCreateOrReplaceTableAsSelectCompatibility.java` ->
  `TestDeltaLakeCreateOrReplaceTableAsSelectCompatibility.testCreateOrReplaceTableOnDeltaWithSchemaChange`
- Mapping type: `direct`
- Environment parity: Current class requires `DeltaLakeMinioEnvironment`. Routed by source review into
  `SuiteDeltaLakeOss` run 1.
- Tag parity: Current tags: `DeltaLakeMinio`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`. Legacy setup operations: `CREATE`.
- Action parity: Current action verbs: `WITH`, `SELECT`. Legacy action verbs: `WITH`, `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `assertTransactionLogVersion`, `containsOnly`. Legacy
  assertion helpers: `assertThat`, `assertTransactionLogVersion`, `containsOnly`.
- Cleanup parity: Current cleanup operations: `DROP`. No legacy cleanup method body was available.
- Any observed difference, however small: SQL verb set differs: legacy ['CREATE', 'WITH', 'SELECT'] vs
  current ['CREATE', 'WITH', 'SELECT', 'DROP']. Current method uses parameter-injected environment helpers instead of
  Tempto query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`
- Reviewer note: Matched by current suite selection: `SuiteDeltaLakeOss` run 1 Exact-name mapping with normalized body
  similarity `0.84`.
- Audit status: `verified`

##### `testCreateOrReplaceTableOnTrinoWithSchemaChange`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/deltalake/TestDeltaLakeCreateOrReplaceTableAsSelectCompatibility.java` ->
  `testCreateOrReplaceTableOnTrinoWithSchemaChange`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/deltalake/TestDeltaLakeCreateOrReplaceTableAsSelectCompatibility.java` ->
  `TestDeltaLakeCreateOrReplaceTableAsSelectCompatibility.testCreateOrReplaceTableOnTrinoWithSchemaChange`
- Mapping type: `direct`
- Environment parity: Current class requires `DeltaLakeMinioEnvironment`. Routed by source review into
  `SuiteDeltaLakeOss` run 1.
- Tag parity: Current tags: `DeltaLakeMinio`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`. Legacy setup operations: `CREATE`.
- Action parity: Current action verbs: `WITH`, `SELECT`. Legacy action verbs: `WITH`, `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `assertTransactionLogVersion`, `containsOnly`. Legacy
  assertion helpers: `assertThat`, `assertTransactionLogVersion`, `containsOnly`.
- Cleanup parity: Current cleanup operations: `DROP`. No legacy cleanup method body was available.
- Any observed difference, however small: SQL verb set differs: legacy ['CREATE', 'WITH', 'SELECT'] vs
  current ['CREATE', 'WITH', 'SELECT', 'DROP']. Current method uses parameter-injected environment helpers instead of
  Tempto query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`
- Reviewer note: Matched by current suite selection: `SuiteDeltaLakeOss` run 1 Exact-name mapping with normalized body
  similarity `0.84`.
- Audit status: `verified`

##### `testCreateOrReplaceTableAndInsertOnTrinoWithSchemaChange`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/deltalake/TestDeltaLakeCreateOrReplaceTableAsSelectCompatibility.java` ->
  `testCreateOrReplaceTableAndInsertOnTrinoWithSchemaChange`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/deltalake/TestDeltaLakeCreateOrReplaceTableAsSelectCompatibility.java` ->
  `TestDeltaLakeCreateOrReplaceTableAsSelectCompatibility.testCreateOrReplaceTableAndInsertOnTrinoWithSchemaChange`
- Mapping type: `direct`
- Environment parity: Current class requires `DeltaLakeMinioEnvironment`. Routed by source review into
  `SuiteDeltaLakeOss` run 1.
- Tag parity: Current tags: `DeltaLakeMinio`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`. Legacy setup operations: `CREATE`.
- Action parity: Current action verbs: `WITH`, `SELECT`. Legacy action verbs: `WITH`, `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `containsOnly`. Legacy assertion helpers: `assertThat`,
  `containsOnly`.
- Cleanup parity: Current cleanup operations: `DROP`. No legacy cleanup method body was available.
- Any observed difference, however small: SQL verb set differs: legacy ['CREATE', 'WITH', 'SELECT'] vs
  current ['CREATE', 'WITH', 'SELECT', 'DROP']. Current method uses parameter-injected environment helpers instead of
  Tempto query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`
- Reviewer note: Matched by current suite selection: `SuiteDeltaLakeOss` run 1 Exact-name mapping with normalized body
  similarity `0.83`.
- Audit status: `verified`

##### `testCreateOrReplaceTableWithSchemaChangeOnCheckpoint`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/deltalake/TestDeltaLakeCreateOrReplaceTableAsSelectCompatibility.java` ->
  `testCreateOrReplaceTableWithSchemaChangeOnCheckpoint`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/deltalake/TestDeltaLakeCreateOrReplaceTableAsSelectCompatibility.java` ->
  `TestDeltaLakeCreateOrReplaceTableAsSelectCompatibility.testCreateOrReplaceTableWithSchemaChangeOnCheckpoint`
- Mapping type: `direct`
- Environment parity: Current class requires `DeltaLakeMinioEnvironment`. Routed by source review into
  `SuiteDeltaLakeOss` run 1.
- Tag parity: Current tags: `DeltaLakeMinio`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`, `INSERT`. Legacy setup operations: `CREATE`, `INSERT`.
- Action parity: Current action verbs: `WITH`, `SELECT`. Legacy action verbs: `WITH`, `SELECT`.
- Assertion parity: Current assertion helpers: `assertLastEntryIsCheckpointed`, `assertThat`,
  `assertTransactionLogVersion`, `containsOnly`, `row`. Legacy assertion helpers: `assertLastEntryIsCheckpointed`,
  `assertThat`, `assertTransactionLogVersion`, `containsOnly`, `row`.
- Cleanup parity: Current cleanup operations: `DROP`. No legacy cleanup method body was available.
- Any observed difference, however small: SQL verb set differs: legacy ['CREATE', 'WITH', 'INSERT', 'SELECT'] vs
  current ['CREATE', 'WITH', 'INSERT', 'SELECT', 'DROP']. Current method uses parameter-injected environment helpers
  instead of Tempto query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`
- Reviewer note: Matched by current suite selection: `SuiteDeltaLakeOss` run 1 Exact-name mapping with normalized body
  similarity `0.85`.
- Audit status: `verified`

##### `testCreateOrReplaceTableWithOnlyFeaturesChangedOnTrino`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/deltalake/TestDeltaLakeCreateOrReplaceTableAsSelectCompatibility.java` ->
  `testCreateOrReplaceTableWithOnlyFeaturesChangedOnTrino`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/deltalake/TestDeltaLakeCreateOrReplaceTableAsSelectCompatibility.java` ->
  `TestDeltaLakeCreateOrReplaceTableAsSelectCompatibility.testCreateOrReplaceTableWithOnlyFeaturesChangedOnTrino`
- Mapping type: `direct`
- Environment parity: Current class requires `DeltaLakeMinioEnvironment`. Routed by source review into
  `SuiteDeltaLakeOss` run 1.
- Tag parity: Current tags: `DeltaLakeMinio`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`, `INSERT`. Legacy setup operations: `CREATE`, `INSERT`.
- Action parity: Current action verbs: `WITH`, `SELECT`. Legacy action verbs: `WITH`, `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`. Legacy assertion helpers: `assertThat`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: Current method uses parameter-injected environment helpers instead of Tempto
  query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`
- Reviewer note: Matched by current suite selection: `SuiteDeltaLakeOss` run 1 Exact-name mapping with normalized body
  similarity `0.79`.
- Audit status: `verified`

### `TestDeltaLakeCreateTableAsSelectCompatibility`

- Owning migration commit: `Migrate TestDeltaLakeCreateTableAsSelectCompatibility to JUnit`
- Current class added in same migration commit:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/deltalake/TestDeltaLakeCreateTableAsSelectCompatibility.java`
- Legacy class removed in same migration commit:
  -
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/deltalake/TestDeltaLakeCreateTableAsSelectCompatibility.java`
- Class-level environment requirement: `DeltaLakeMinioEnvironment`.
- Class-level tags: `DeltaLakeMinio`.
- Method inventory complete: Yes. Legacy methods: `5`. Current methods: `3`.
- Legacy helper/resource dependencies accounted for: Legacy class source reviewed directly. Cross-class or merged legacy
  coverage accounted for: `testTrinoTimestampsWithDatabricks` -> covered in
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/deltalake/TestDeltaLakeDatabricksCreateTableCompatibility.java` ->
  `testTrinoTimestampsWithDatabricks`; `testTrinoTypesWithDatabricks` -> covered in
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/deltalake/TestDeltaLakeDatabricksCreateTableCompatibility.java` ->
  `testTrinoTypesWithDatabricks`.
- Intentional differences summary: `HDP to Hive 3.1 migration`
- Method statuses present: `verified`.

#### Methods

##### `testCreateFromTrinoWithDefaultPartitionValues`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/deltalake/TestDeltaLakeCreateTableAsSelectCompatibility.java` ->
  `testCreateFromTrinoWithDefaultPartitionValues`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/deltalake/TestDeltaLakeCreateTableAsSelectCompatibility.java` ->
  `TestDeltaLakeCreateTableAsSelectCompatibility.testCreateFromTrinoWithDefaultPartitionValues`
- Mapping type: `direct`
- Environment parity: Current class requires `DeltaLakeMinioEnvironment`. Routed by source review into
  `SuiteDeltaLakeOss` run 1.
- Tag parity: Current tags: `DeltaLakeMinio`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`. Legacy setup operations: `CREATE`.
- Action parity: Current action verbs: `WITH`, `SELECT`. Legacy action verbs: `WITH`, `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `containsOnly`, `isEqualTo`, `row`. Legacy assertion
  helpers: `assertThat`, `containsOnly`, `row`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: Assertion helper names differ between legacy and current implementations.
  Current method uses parameter-injected environment helpers instead of Tempto query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`
- Reviewer note: Matched by current suite selection: `SuiteDeltaLakeOss` run 1 Exact-name mapping with normalized body
  similarity `0.89`.
- Audit status: `verified`

##### `testCreateTableWithUnsupportedPartitionType`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/deltalake/TestDeltaLakeCreateTableAsSelectCompatibility.java` ->
  `testCreateTableWithUnsupportedPartitionType`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/deltalake/TestDeltaLakeCreateTableAsSelectCompatibility.java` ->
  `TestDeltaLakeCreateTableAsSelectCompatibility.testCreateTableWithUnsupportedPartitionType`
- Mapping type: `direct`
- Environment parity: Current class requires `DeltaLakeMinioEnvironment`. Routed by source review into
  `SuiteDeltaLakeOss` run 1.
- Tag parity: Current tags: `DeltaLakeMinio`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`. Legacy setup operations: `CREATE`.
- Action parity: Current action verbs: `WITH`. Legacy action verbs: `WITH`.
- Assertion parity: Current assertion helpers: `assertThatThrownBy`, `hasMessageContaining`, `row`. Legacy assertion
  helpers: `assertThatThrownBy`, `hasMessageContaining`, `row`.
- Cleanup parity: Current cleanup operations: `DROP`. No legacy cleanup method body was available.
- Any observed difference, however small: SQL verb set differs: legacy ['CREATE', 'WITH'] vs
  current ['CREATE', 'WITH', 'DROP']. Current method uses parameter-injected environment helpers instead of Tempto query
  executors.
- Known intentional difference: `HDP to Hive 3.1 migration`
- Reviewer note: Matched by current suite selection: `SuiteDeltaLakeOss` run 1 Exact-name mapping with normalized body
  similarity `0.79`.
- Audit status: `verified`

##### `testCreateTableAsSelectWithAllPartitionColumns`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/deltalake/TestDeltaLakeCreateTableAsSelectCompatibility.java` ->
  `testCreateTableAsSelectWithAllPartitionColumns`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/deltalake/TestDeltaLakeCreateTableAsSelectCompatibility.java` ->
  `TestDeltaLakeCreateTableAsSelectCompatibility.testCreateTableAsSelectWithAllPartitionColumns`
- Mapping type: `direct`
- Environment parity: Current class requires `DeltaLakeMinioEnvironment`. Routed by source review into
  `SuiteDeltaLakeOss` run 1.
- Tag parity: Current tags: `DeltaLakeMinio`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`. Legacy setup operations: `CREATE`.
- Action parity: Current action verbs: `WITH`, `SELECT`. Legacy action verbs: `WITH`, `SELECT`.
- Assertion parity: Current assertion helpers: `assertThatThrownBy`, `hasMessageContaining`. Legacy assertion helpers:
  `assertThatThrownBy`, `hasMessageContaining`.
- Cleanup parity: Current cleanup operations: `DROP`. No legacy cleanup method body was available.
- Any observed difference, however small: SQL verb set differs: legacy ['CREATE', 'WITH', 'SELECT'] vs
  current ['CREATE', 'WITH', 'SELECT', 'DROP']. Current method uses parameter-injected environment helpers instead of
  Tempto query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`
- Reviewer note: Matched by current suite selection: `SuiteDeltaLakeOss` run 1 Exact-name mapping with normalized body
  similarity `0.86`.
- Audit status: `verified`

### `TestDeltaLakeDeleteCompatibility`

- Owning migration commit: `Migrate TestDeltaLakeDeleteCompatibility to JUnit`
- Current class added in same migration commit:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/deltalake/TestDeltaLakeDeleteCompatibility.java`
- Legacy class removed in same migration commit:
    - `testing/trino-product-tests/src/main/java/io/trino/tests/product/deltalake/TestDeltaLakeDeleteCompatibility.java`
- Class-level environment requirement: `DeltaLakeMinioEnvironment`.
- Class-level tags: `DeltaLakeMinio`.
- Method inventory complete: Yes. Legacy methods: `19`. Current methods: `16`.
- Legacy helper/resource dependencies accounted for: Legacy class source reviewed directly. Cross-class or merged legacy
  coverage accounted for: `testDeleteCompatibility` -> covered in
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/deltalake/TestDeltaLakeWriteDatabricksCompatibilityDatabricks.java` ->
  `testDeleteCompatibility` and in Databricks lane
  `TestDeltaLakeWriteDatabricksCompatibilityDatabricks.testDeleteCompatibility`; `testDeletionVectorsTruncateTable` ->
  covered in
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/deltalake/TestDeltaLakeWriteDatabricksCompatibilityDatabricks.java` ->
  `testDeletionVectorsTruncateTable`; `testTruncateTable` -> covered in
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/deltalake/TestDeltaLakeWriteDatabricksCompatibilityDatabricks.java` ->
  `testTruncateTable`.
- Intentional differences summary: `HDP to Hive 3.1 migration`
- Method statuses present: `verified`.

#### Methods

##### `testDeleteOnEnforcedConstraintsReturnsRowsCount`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/deltalake/TestDeltaLakeDeleteCompatibility.java` ->
  `testDeleteOnEnforcedConstraintsReturnsRowsCount`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/deltalake/TestDeltaLakeDeleteCompatibility.java` ->
  `TestDeltaLakeDeleteCompatibility.testDeleteOnEnforcedConstraintsReturnsRowsCount`
- Mapping type: `direct`
- Environment parity: Current class requires `DeltaLakeMinioEnvironment`. Routed by source review into
  `SuiteDeltaLakeOss` run 1.
- Tag parity: Current tags: `DeltaLakeMinio`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`, `INSERT`. Legacy setup operations: `CREATE`, `INSERT`.
- Action parity: Current action verbs: `SELECT`. Legacy action verbs: `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `isEqualTo`. Legacy assertion helpers: `assertThat`,
  `containsOnly`, `row`.
- Cleanup parity: Current cleanup operations: `DELETE`, `DROP`. Legacy cleanup operations: `DELETE`.
- Any observed difference, however small: SQL verb set differs: legacy ['CREATE', 'INSERT', 'DELETE', 'SELECT'] vs
  current ['CREATE', 'INSERT', 'DELETE', 'SELECT', 'DROP']. Assertion helper names differ between legacy and current
  implementations. Current method uses parameter-injected environment helpers instead of Tempto query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`
- Reviewer note: Matched by current suite selection: `SuiteDeltaLakeOss` run 1 Exact-name mapping with normalized body
  similarity `0.66`.
- Audit status: `verified`

##### `testDeleteOnAppendOnlyWriterFeature`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/deltalake/TestDeltaLakeDeleteCompatibility.java` ->
  `testDeleteOnAppendOnlyWriterFeature`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/deltalake/TestDeltaLakeDeleteCompatibility.java` ->
  `TestDeltaLakeDeleteCompatibility.testDeleteOnAppendOnlyWriterFeature`
- Mapping type: `direct`
- Environment parity: Current class requires `DeltaLakeMinioEnvironment`. Routed by source review into
  `SuiteDeltaLakeOss` run 1.
- Tag parity: Current tags: `DeltaLakeMinio`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`, `INSERT`, `ALTER`. Legacy setup operations: `CREATE`, `INSERT`,
  `ALTER`.
- Action parity: Current action verbs: `SELECT`. Legacy action verbs: `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `assertThatThrownBy`, `contains`, `containsOnly`,
  `hasMessageContaining`, `row`. Legacy assertion helpers: `assertQueryFailure`, `assertThat`, `contains`,
  `containsOnly`, `hasMessageContaining`, `row`.
- Cleanup parity: Current cleanup operations: `DELETE`, `DROP`. Legacy cleanup operations: `DELETE`.
- Any observed difference, however small: SQL verb set differs: legacy ['CREATE', 'INSERT', 'DELETE', 'SELECT', 'ALTER']
  vs current ['CREATE', 'INSERT', 'DELETE', 'SELECT', 'ALTER', 'DROP']. Assertion helper names differ between legacy and
  current implementations. Current method uses parameter-injected environment helpers instead of Tempto query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`
- Reviewer note: Matched by current suite selection: `SuiteDeltaLakeOss` run 1 Exact-name mapping with normalized body
  similarity `0.74`.
- Audit status: `verified`

##### `testTrinoDeletionVectors`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/deltalake/TestDeltaLakeDeleteCompatibility.java` ->
  `testTrinoDeletionVectors`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/deltalake/TestDeltaLakeDeleteCompatibility.java` ->
  `TestDeltaLakeDeleteCompatibility.testTrinoDeletionVectors`
- Mapping type: `direct`
- Environment parity: Current class requires `DeltaLakeMinioEnvironment`. Routed by source review into
  `SuiteDeltaLakeOss` run 1.
- Tag parity: Current tags: `DeltaLakeMinio`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`, `INSERT`. Legacy setup operations: `CREATE`, `INSERT`.
- Action parity: Current action verbs: `WITH`, `SELECT`. Legacy action verbs: `WITH`, `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `containsOnly`, `isEqualTo`, `row`. Legacy assertion
  helpers: `assertThat`, `containsOnly`, `isEqualTo`, `row`.
- Cleanup parity: Current cleanup operations: `DELETE`, `DROP`. Legacy cleanup operations: `DELETE`, `DROP`.
- Any observed difference, however small: Current method uses parameter-injected environment helpers instead of Tempto
  query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`
- Reviewer note: Matched by current suite selection: `SuiteDeltaLakeOss` run 1 Exact-name mapping with normalized body
  similarity `0.68`.
- Audit status: `verified`

##### `testDeletionVectors`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/deltalake/TestDeltaLakeDeleteCompatibility.java` ->
  `testDeletionVectors`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/deltalake/TestDeltaLakeDeleteCompatibility.java` ->
  `TestDeltaLakeDeleteCompatibility.testDeletionVectors`
- Mapping type: `direct`
- Environment parity: Current class requires `DeltaLakeMinioEnvironment`. Routed by source review into
  `SuiteDeltaLakeOss` run 1.
- Tag parity: Current tags: `DeltaLakeMinio`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`, `INSERT`, `UPDATE`. Legacy setup operations: `CREATE`, `INSERT`,
  `UPDATE`.
- Action parity: Current action verbs: `SELECT`, `SHOW`, `DESCRIBE`, `MERGE`. Legacy action verbs: `SELECT`, `SHOW`,
  `DESCRIBE`, `MERGE`.
- Assertion parity: Current assertion helpers: `assertThat`, `contains`, `containsOnly`, `row`. Legacy assertion
  helpers: `assertThat`, `contains`, `containsOnly`, `row`.
- Cleanup parity: Current cleanup operations: `DELETE`, `DROP`. Legacy cleanup operations: `DELETE`.
- Any observed difference, however small: SQL verb set differs:
  legacy ['CREATE', 'INSERT', 'DELETE', 'SELECT', 'SHOW', 'DESCRIBE', 'UPDATE', 'MERGE'] vs
  current ['CREATE', 'INSERT', 'DELETE', 'SELECT', 'SHOW', 'DESCRIBE', 'UPDATE', 'MERGE', 'DROP']. Current method uses
  parameter-injected environment helpers instead of Tempto query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`
- Reviewer note: Matched by current suite selection: `SuiteDeltaLakeOss` run 1 Exact-name mapping with normalized body
  similarity `0.85`.
- Audit status: `verified`

##### `testDeletionVectorsWithPartitionedTable`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/deltalake/TestDeltaLakeDeleteCompatibility.java` ->
  `testDeletionVectorsWithPartitionedTable`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/deltalake/TestDeltaLakeDeleteCompatibility.java` ->
  `TestDeltaLakeDeleteCompatibility.testDeletionVectorsWithPartitionedTable`
- Mapping type: `direct`
- Environment parity: Current class requires `DeltaLakeMinioEnvironment`. Routed by source review into
  `SuiteDeltaLakeOss` run 1.
- Tag parity: Current tags: `DeltaLakeMinio`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`, `INSERT`. Legacy setup operations: `CREATE`, `INSERT`.
- Action parity: Current action verbs: `SELECT`. Legacy action verbs: `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `containsOnly`, `row`. Legacy assertion helpers:
  `assertThat`, `containsOnly`, `row`.
- Cleanup parity: Current cleanup operations: `DELETE`, `DROP`. Legacy cleanup operations: `DELETE`, `DROP`.
- Any observed difference, however small: Current method uses parameter-injected environment helpers instead of Tempto
  query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`
- Reviewer note: Matched by current suite selection: `SuiteDeltaLakeOss` run 1 Exact-name mapping with normalized body
  similarity `0.88`.
- Audit status: `verified`

##### `testDeletionVectorsWithRandomPrefix`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/deltalake/TestDeltaLakeDeleteCompatibility.java` ->
  `testDeletionVectorsWithRandomPrefix`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/deltalake/TestDeltaLakeDeleteCompatibility.java` ->
  `TestDeltaLakeDeleteCompatibility.testDeletionVectorsWithRandomPrefix`
- Mapping type: `direct`
- Environment parity: Current class requires `DeltaLakeMinioEnvironment`. Routed by source review into
  `SuiteDeltaLakeOss` run 1.
- Tag parity: Current tags: `DeltaLakeMinio`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`, `INSERT`. Legacy setup operations: `CREATE`, `INSERT`.
- Action parity: Current action verbs: `SELECT`. Legacy action verbs: `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `containsOnly`, `row`. Legacy assertion helpers:
  `assertThat`, `containsOnly`, `row`.
- Cleanup parity: Current cleanup operations: `DELETE`, `DROP`. Legacy cleanup operations: `DELETE`.
- Any observed difference, however small: SQL verb set differs: legacy ['CREATE', 'INSERT', 'DELETE', 'SELECT'] vs
  current ['CREATE', 'INSERT', 'DELETE', 'SELECT', 'DROP']. Current method uses parameter-injected environment helpers
  instead of Tempto query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`
- Reviewer note: Matched by current suite selection: `SuiteDeltaLakeOss` run 1 Exact-name mapping with normalized body
  similarity `0.66`.
- Audit status: `verified`

##### `testDisableDeletionVectors`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/deltalake/TestDeltaLakeDeleteCompatibility.java` ->
  `testDisableDeletionVectors`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/deltalake/TestDeltaLakeDeleteCompatibility.java` ->
  `TestDeltaLakeDeleteCompatibility.testDisableDeletionVectors`
- Mapping type: `direct`
- Environment parity: Current class requires `DeltaLakeMinioEnvironment`. Routed by source review into
  `SuiteDeltaLakeOss` run 1.
- Tag parity: Current tags: `DeltaLakeMinio`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`, `INSERT`, `ALTER`. Legacy setup operations: `CREATE`, `INSERT`,
  `ALTER`.
- Action parity: Current action verbs: `SELECT`. Legacy action verbs: `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `containsOnly`, `row`. Legacy assertion helpers:
  `assertThat`, `containsOnly`, `row`.
- Cleanup parity: Current cleanup operations: `DELETE`, `DROP`. Legacy cleanup operations: `DELETE`.
- Any observed difference, however small: SQL verb set differs: legacy ['CREATE', 'INSERT', 'DELETE', 'ALTER', 'SELECT']
  vs current ['CREATE', 'INSERT', 'DELETE', 'ALTER', 'SELECT', 'DROP']. Current method uses parameter-injected
  environment helpers instead of Tempto query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`
- Reviewer note: Matched by current suite selection: `SuiteDeltaLakeOss` run 1 Exact-name mapping with normalized body
  similarity `0.80`.
- Audit status: `verified`

##### `testDeletionVectorsWithCheckpointInterval`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/deltalake/TestDeltaLakeDeleteCompatibility.java` ->
  `testDeletionVectorsWithCheckpointInterval`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/deltalake/TestDeltaLakeDeleteCompatibility.java` ->
  `TestDeltaLakeDeleteCompatibility.testDeletionVectorsWithCheckpointInterval`
- Mapping type: `direct`
- Environment parity: Current class requires `DeltaLakeMinioEnvironment`. Routed by source review into
  `SuiteDeltaLakeOss` run 1.
- Tag parity: Current tags: `DeltaLakeMinio`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`, `INSERT`. Legacy setup operations: `CREATE`, `INSERT`.
- Action parity: Current action verbs: `SELECT`. Legacy action verbs: `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `containsOnly`, `row`. Legacy assertion helpers:
  `assertThat`, `containsOnly`, `row`.
- Cleanup parity: Current cleanup operations: `DELETE`, `DROP`. Legacy cleanup operations: `DELETE`.
- Any observed difference, however small: SQL verb set differs: legacy ['CREATE', 'INSERT', 'DELETE', 'SELECT'] vs
  current ['CREATE', 'INSERT', 'DELETE', 'SELECT', 'DROP']. Current method uses parameter-injected environment helpers
  instead of Tempto query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`
- Reviewer note: Matched by current suite selection: `SuiteDeltaLakeOss` run 1 Exact-name mapping with normalized body
  similarity `0.84`.
- Audit status: `verified`

##### `testDeletionVectorsMergeDelete`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/deltalake/TestDeltaLakeDeleteCompatibility.java` ->
  `testDeletionVectorsMergeDelete`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/deltalake/TestDeltaLakeDeleteCompatibility.java` ->
  `TestDeltaLakeDeleteCompatibility.testDeletionVectorsMergeDelete`
- Mapping type: `direct`
- Environment parity: Current class requires `DeltaLakeMinioEnvironment`. Routed by source review into
  `SuiteDeltaLakeOss` run 1.
- Tag parity: Current tags: `DeltaLakeMinio`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`, `INSERT`. Legacy setup operations: `CREATE`, `INSERT`.
- Action parity: Current action verbs: `SELECT`, `MERGE`. Legacy action verbs: `SELECT`, `MERGE`.
- Assertion parity: Current assertion helpers: `assertThat`, `contains`, `row`. Legacy assertion helpers: `assertThat`,
  `contains`, `row`.
- Cleanup parity: Current cleanup operations: `DROP`. No legacy cleanup method body was available.
- Any observed difference, however small: SQL verb set differs: legacy ['CREATE', 'INSERT', 'SELECT', 'MERGE'] vs
  current ['CREATE', 'INSERT', 'SELECT', 'MERGE', 'DROP']. Current method uses parameter-injected environment helpers
  instead of Tempto query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`
- Reviewer note: Matched by current suite selection: `SuiteDeltaLakeOss` run 1 Exact-name mapping with normalized body
  similarity `0.81`.
- Audit status: `verified`

##### `testDeletionVectorsLargeNumbers`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/deltalake/TestDeltaLakeDeleteCompatibility.java` ->
  `testDeletionVectorsLargeNumbers`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/deltalake/TestDeltaLakeDeleteCompatibility.java` ->
  `TestDeltaLakeDeleteCompatibility.testDeletionVectorsLargeNumbers`
- Mapping type: `direct`
- Environment parity: Current class requires `DeltaLakeMinioEnvironment`. Routed by source review into
  `SuiteDeltaLakeOss` run 1.
- Tag parity: Current tags: `DeltaLakeMinio`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`, `INSERT`. Legacy setup operations: `CREATE`, `INSERT`.
- Action parity: Current action verbs: `SELECT`. Legacy action verbs: `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `contains`, `row`. Legacy assertion helpers: `assertThat`,
  `contains`, `row`.
- Cleanup parity: Current cleanup operations: `DELETE`, `DROP`. Legacy cleanup operations: `DELETE`.
- Any observed difference, however small: SQL verb set differs: legacy ['CREATE', 'INSERT', 'SELECT', 'DELETE'] vs
  current ['CREATE', 'INSERT', 'SELECT', 'DELETE', 'DROP']. Current method uses parameter-injected environment helpers
  instead of Tempto query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`
- Reviewer note: Matched by current suite selection: `SuiteDeltaLakeOss` run 1 Exact-name mapping with normalized body
  similarity `0.80`.
- Audit status: `verified`

##### `testChangeDataFeedWithDeletionVectors`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/deltalake/TestDeltaLakeDeleteCompatibility.java` ->
  `testChangeDataFeedWithDeletionVectors`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/deltalake/TestDeltaLakeDeleteCompatibility.java` ->
  `TestDeltaLakeDeleteCompatibility.testChangeDataFeedWithDeletionVectors`
- Mapping type: `direct`
- Environment parity: Current class requires `DeltaLakeMinioEnvironment`. Routed by source review into
  `SuiteDeltaLakeOss` run 1.
- Tag parity: Current tags: `DeltaLakeMinio`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`, `INSERT`, `UPDATE`. Legacy setup operations: `CREATE`, `INSERT`,
  `UPDATE`.
- Action parity: Current action verbs: `SELECT`. Legacy action verbs: `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `containsOnly`, `row`. Legacy assertion helpers:
  `assertThat`, `containsOnly`, `row`.
- Cleanup parity: Current cleanup operations: none. No legacy cleanup method body was available.
- Any observed difference, however small: Current method uses parameter-injected environment helpers instead of Tempto
  query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`
- Reviewer note: Matched by current suite selection: `SuiteDeltaLakeOss` run 1 Exact-name mapping with normalized body
  similarity `0.94`.
- Audit status: `verified`

##### `testDeletionVectorsAcrossAddFile`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/deltalake/TestDeltaLakeDeleteCompatibility.java` ->
  `testDeletionVectorsAcrossAddFile`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/deltalake/TestDeltaLakeDeleteCompatibility.java` ->
  `TestDeltaLakeDeleteCompatibility.testDeletionVectorsAcrossAddFile`
- Mapping type: `direct`
- Environment parity: Current class requires `DeltaLakeMinioEnvironment`. Routed by source review into
  `SuiteDeltaLakeOss` run 1.
- Tag parity: Current tags: `DeltaLakeMinio`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`, `INSERT`. Legacy setup operations: `CREATE`, `INSERT`.
- Action parity: Current action verbs: `SELECT`. Legacy action verbs: `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `containsOnly`, `row`. Legacy assertion helpers:
  `assertThat`, `containsOnly`, `row`.
- Cleanup parity: Current cleanup operations: `DELETE`, `DROP`. Legacy cleanup operations: `DELETE`.
- Any observed difference, however small: Normalized body similarity is low (`0.49`), so fidelity was judged from
  SQL/helper/assertion shape instead of raw text. SQL verb set differs: legacy ['CREATE', 'INSERT', 'DELETE', 'SELECT']
  vs current ['CREATE', 'INSERT', 'DELETE', 'SELECT', 'DROP']. Current method uses parameter-injected environment
  helpers instead of Tempto query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`
- Reviewer note: Matched by current suite selection: `SuiteDeltaLakeOss` run 1 Exact-name mapping with normalized body
  similarity `0.49`.
- Audit status: `verified`

##### `testDeletionVectorsDeleteFrom`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/deltalake/TestDeltaLakeDeleteCompatibility.java` ->
  `testDeletionVectorsDeleteFrom`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/deltalake/TestDeltaLakeDeleteCompatibility.java` ->
  `TestDeltaLakeDeleteCompatibility.testDeletionVectorsDeleteFrom`
- Mapping type: `direct`
- Environment parity: Current class requires `DeltaLakeMinioEnvironment`. Routed by source review into
  `SuiteDeltaLakeOss` run 1.
- Tag parity: Current tags: `DeltaLakeMinio`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: none. Legacy setup operations: none.
- Action parity: Current action verbs: none. Legacy action verbs: none.
- Assertion parity: Current assertion helpers: none. No legacy assertion method body was available.
- Cleanup parity: Current cleanup operations: `DELETE`. Legacy cleanup operations: `DELETE`.
- Any observed difference, however small: No method-specific difference identified beyond the documented framework
  baseline.
- Known intentional difference: None.
- Reviewer note: Matched by current suite selection: `SuiteDeltaLakeOss` run 1 High normalized body similarity `0.80`.
- Audit status: `verified`

##### `testDeletionVectorsOptimize`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/deltalake/TestDeltaLakeDeleteCompatibility.java` ->
  `testDeletionVectorsOptimize`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/deltalake/TestDeltaLakeDeleteCompatibility.java` ->
  `TestDeltaLakeDeleteCompatibility.testDeletionVectorsOptimize`
- Mapping type: `direct`
- Environment parity: Current class requires `DeltaLakeMinioEnvironment`. Routed by source review into
  `SuiteDeltaLakeOss` run 1.
- Tag parity: Current tags: `DeltaLakeMinio`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`, `INSERT`. Legacy setup operations: `CREATE`, `INSERT`.
- Action parity: Current action verbs: `SELECT`. Legacy action verbs: `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `contains`, `row`. Legacy assertion helpers: `assertThat`,
  `contains`, `row`.
- Cleanup parity: Current cleanup operations: `DELETE`, `DROP`. Legacy cleanup operations: `DELETE`.
- Any observed difference, however small: Normalized body similarity is low (`0.52`), so fidelity was judged from
  SQL/helper/assertion shape instead of raw text. SQL verb set differs: legacy ['CREATE', 'INSERT', 'DELETE', 'SELECT']
  vs current ['CREATE', 'INSERT', 'DELETE', 'SELECT', 'DROP']. Current method uses parameter-injected environment
  helpers instead of Tempto query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`
- Reviewer note: Matched by current suite selection: `SuiteDeltaLakeOss` run 1 Exact-name mapping with normalized body
  similarity `0.52`.
- Audit status: `verified`

##### `testDeletionVectorsAbsolutePath`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/deltalake/TestDeltaLakeDeleteCompatibility.java` ->
  `testDeletionVectorsAbsolutePath`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/deltalake/TestDeltaLakeDeleteCompatibility.java` ->
  `TestDeltaLakeDeleteCompatibility.testDeletionVectorsAbsolutePath`
- Mapping type: `direct`
- Environment parity: Current class requires `DeltaLakeMinioEnvironment`. Routed by source review into
  `SuiteDeltaLakeOss` run 1.
- Tag parity: Current tags: `DeltaLakeMinio`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`, `INSERT`. Legacy setup operations: `CREATE`, `INSERT`.
- Action parity: Current action verbs: `SELECT`. Legacy action verbs: `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `contains`, `row`. Legacy assertion helpers: `assertThat`,
  `contains`, `row`.
- Cleanup parity: Current cleanup operations: `DELETE`, `DROP`. Legacy cleanup operations: `DELETE`.
- Any observed difference, however small: SQL verb set differs: legacy ['CREATE', 'INSERT', 'DELETE', 'SELECT'] vs
  current ['CREATE', 'INSERT', 'DELETE', 'SELECT', 'DROP']. Current method uses parameter-injected environment helpers
  instead of Tempto query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`
- Reviewer note: Matched by current suite selection: `SuiteDeltaLakeOss` run 1 Exact-name mapping with normalized body
  similarity `0.66`.
- Audit status: `verified`

##### `testDeletionVectorsWithChangeDataFeed`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/deltalake/TestDeltaLakeDeleteCompatibility.java` ->
  `testDeletionVectorsWithChangeDataFeed`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/deltalake/TestDeltaLakeDeleteCompatibility.java` ->
  `TestDeltaLakeDeleteCompatibility.testDeletionVectorsWithChangeDataFeed`
- Mapping type: `direct`
- Environment parity: Current class requires `DeltaLakeMinioEnvironment`. Routed by source review into
  `SuiteDeltaLakeOss` run 1.
- Tag parity: Current tags: `DeltaLakeMinio`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`, `INSERT`. Legacy setup operations: `CREATE`, `INSERT`.
- Action parity: Current action verbs: `SELECT`. Legacy action verbs: `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `assertThatThrownBy`, `containsOnly`,
  `hasMessageContaining`, `row`. Legacy assertion helpers: `assertQueryFailure`, `assertThat`, `containsOnly`,
  `hasMessageContaining`, `row`.
- Cleanup parity: Current cleanup operations: `DELETE`, `DROP`. Legacy cleanup operations: `DELETE`.
- Any observed difference, however small: SQL verb set differs: legacy ['CREATE', 'INSERT', 'DELETE', 'SELECT'] vs
  current ['CREATE', 'INSERT', 'DELETE', 'SELECT', 'DROP']. Assertion helper names differ between legacy and current
  implementations. Current method uses parameter-injected environment helpers instead of Tempto query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`
- Reviewer note: Matched by current suite selection: `SuiteDeltaLakeOss` run 1 Exact-name mapping with normalized body
  similarity `0.90`.
- Audit status: `verified`

### `TestDeltaLakeDropTableCompatibility`

- Owning migration commit: `Migrate TestDeltaLakeDropTableCompatibility to JUnit`
- Current class added in same migration commit:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/deltalake/TestDeltaLakeDropTableCompatibility.java`
- Legacy class removed in same migration commit:
  -
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/deltalake/TestDeltaLakeDropTableCompatibility.java`
- Class-level environment requirement: `DeltaLakeMinioEnvironment`.
- Class-level tags: `DeltaLakeMinio`.
- Method inventory complete: Yes. Legacy methods: `1`. Current methods: `1`.
- Legacy helper/resource dependencies accounted for: Legacy class source reviewed directly.
- Intentional differences summary: `HDP to Hive 3.1 migration`
- Method statuses present: `verified`.

#### Methods

##### `testDropTable`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/deltalake/TestDeltaLakeDropTableCompatibility.java` ->
  `testDropTable`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/deltalake/TestDeltaLakeDropTableCompatibility.java` ->
  `TestDeltaLakeDropTableCompatibility.testDropTable`
- Mapping type: `direct`
- Environment parity: Current class requires `DeltaLakeMinioEnvironment`. Routed by source review into
  `SuiteDeltaLakeOss` run 1.
- Tag parity: Current tags: `DeltaLakeMinio`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`. No legacy setup method body was available.
- Action parity: Current action verbs: `WITH`. No legacy action method body was available.
- Assertion parity: Current assertion helpers: `assertThat`. No legacy assertion method body was available.
- Cleanup parity: Current cleanup operations: `DROP`. No legacy cleanup method body was available.
- Any observed difference, however small: Normalized body similarity is low (`0.02`), so fidelity was judged from
  SQL/helper/assertion shape instead of raw text.
- Known intentional difference: `HDP to Hive 3.1 migration`
- Reviewer note: Matched by current suite selection: `SuiteDeltaLakeOss` run 1 Exact-name mapping with normalized body
  similarity `0.02`.
- Audit status: `verified`

### `TestDeltaLakeInsertCompatibility`

- Owning migration commit: `Migrate TestDeltaLakeInsertCompatibility to JUnit`
- Current class added in same migration commit:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/deltalake/TestDeltaLakeInsertCompatibility.java`
- Legacy class removed in same migration commit:
    - `testing/trino-product-tests/src/main/java/io/trino/tests/product/deltalake/TestDeltaLakeInsertCompatibility.java`
- Class-level environment requirement: `DeltaLakeMinioEnvironment`.
- Class-level tags: `DeltaLakeMinio`.
- Method inventory complete: Yes. Legacy methods: `12`. Current methods: `9`.
- Legacy helper/resource dependencies accounted for: Legacy class source reviewed directly. Cross-class or merged legacy
  coverage accounted for: `testCompression` -> covered in
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/deltalake/TestDeltaLakeWriteDatabricksCompatibilityDatabricks.java` ->
  `testCompression`; `testPartitionedInsertCompatibility` -> covered in
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/deltalake/TestDeltaLakeWriteDatabricksCompatibilityDatabricks.java` ->
  `testPartitionedInsertCompatibility`; `testWritesToTableWithGeneratedColumnFails` -> covered in
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/deltalake/TestDeltaLakeWriteDatabricksCompatibilityDatabricks.java` ->
  `testWritesToTableWithGeneratedColumnFails`.
- Intentional differences summary: `HDP to Hive 3.1 migration`
- Method statuses present: `verified`.

#### Methods

##### `testInsertCompatibility`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/deltalake/TestDeltaLakeInsertCompatibility.java` ->
  `testInsertCompatibility`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/deltalake/TestDeltaLakeInsertCompatibility.java` ->
  `TestDeltaLakeInsertCompatibility.testInsertCompatibility`
- Mapping type: `direct`
- Environment parity: Current class requires `DeltaLakeMinioEnvironment`. Routed by source review into
  `SuiteDeltaLakeOss` run 1.
- Tag parity: Current tags: `DeltaLakeMinio`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`, `INSERT`. Legacy setup operations: `CREATE`, `INSERT`.
- Action parity: Current action verbs: `SELECT`. Legacy action verbs: `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `containsOnly`, `row`. Legacy assertion helpers:
  `assertThat`, `containsOnly`, `row`.
- Cleanup parity: Current cleanup operations: `DROP`. No legacy cleanup method body was available.
- Any observed difference, however small: SQL verb set differs: legacy ['CREATE', 'INSERT', 'SELECT'] vs
  current ['CREATE', 'INSERT', 'SELECT', 'DROP']. Current method uses parameter-injected environment helpers instead of
  Tempto query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`
- Reviewer note: Matched by current suite selection: `SuiteDeltaLakeOss` run 1 Exact-name mapping with normalized body
  similarity `0.81`.
- Audit status: `verified`

##### `testTimestampInsertCompatibility`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/deltalake/TestDeltaLakeInsertCompatibility.java` ->
  `testTimestampInsertCompatibility`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/deltalake/TestDeltaLakeInsertCompatibility.java` ->
  `TestDeltaLakeInsertCompatibility.testTimestampInsertCompatibility`
- Mapping type: `direct`
- Environment parity: Current class requires `DeltaLakeMinioEnvironment`. Routed by source review into
  `SuiteDeltaLakeOss` run 1.
- Tag parity: Current tags: `DeltaLakeMinio`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`, `INSERT`. Legacy setup operations: `CREATE`, `INSERT`.
- Action parity: Current action verbs: `WITH`, `SELECT`. Legacy action verbs: `WITH`, `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `containsOnly`, `row`. Legacy assertion helpers:
  `assertThat`, `containsOnly`, `row`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: Current method uses parameter-injected environment helpers instead of Tempto
  query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`
- Reviewer note: Matched by current suite selection: `SuiteDeltaLakeOss` run 1 Exact-name mapping with normalized body
  similarity `0.89`.
- Audit status: `verified`

##### `testTimestampWithTimeZonePartitionedInsertCompatibility`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/deltalake/TestDeltaLakeInsertCompatibility.java` ->
  `testTimestampWithTimeZonePartitionedInsertCompatibility`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/deltalake/TestDeltaLakeInsertCompatibility.java` ->
  `TestDeltaLakeInsertCompatibility.testTimestampWithTimeZonePartitionedInsertCompatibility`
- Mapping type: `direct`
- Environment parity: Current class requires `DeltaLakeMinioEnvironment`. Routed by source review into
  `SuiteDeltaLakeOss` run 1.
- Tag parity: Current tags: `DeltaLakeMinio`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`, `INSERT`. Legacy setup operations: `CREATE`, `INSERT`.
- Action parity: Current action verbs: `WITH`, `SELECT`. Legacy action verbs: `WITH`, `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `contains`, `containsOnly`, `row`. Legacy assertion
  helpers: `assertThat`, `contains`, `containsOnly`, `row`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: Current method uses parameter-injected environment helpers instead of Tempto
  query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`
- Reviewer note: Matched by current suite selection: `SuiteDeltaLakeOss` run 1 Exact-name mapping with normalized body
  similarity `0.87`.
- Audit status: `verified`

##### `testTrinoPartitionedDifferentOrderInsertCompatibility`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/deltalake/TestDeltaLakeInsertCompatibility.java` ->
  `testTrinoPartitionedDifferentOrderInsertCompatibility`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/deltalake/TestDeltaLakeInsertCompatibility.java` ->
  `TestDeltaLakeInsertCompatibility.testTrinoPartitionedDifferentOrderInsertCompatibility`
- Mapping type: `direct`
- Environment parity: Current class requires `DeltaLakeMinioEnvironment`. Routed by source review into
  `SuiteDeltaLakeOss` run 1.
- Tag parity: Current tags: `DeltaLakeMinio`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`, `INSERT`. Legacy setup operations: `CREATE`, `INSERT`.
- Action parity: Current action verbs: `WITH`, `SELECT`. Legacy action verbs: `WITH`, `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `containsOnly`, `row`. Legacy assertion helpers:
  `assertThat`, `containsOnly`, `row`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: Current method uses parameter-injected environment helpers instead of Tempto
  query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`
- Reviewer note: Matched by current suite selection: `SuiteDeltaLakeOss` run 1 Exact-name mapping with normalized body
  similarity `0.90`.
- Audit status: `verified`

##### `testDeltaPartitionedDifferentOrderInsertCompatibility`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/deltalake/TestDeltaLakeInsertCompatibility.java` ->
  `testDeltaPartitionedDifferentOrderInsertCompatibility`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/deltalake/TestDeltaLakeInsertCompatibility.java` ->
  `TestDeltaLakeInsertCompatibility.testDeltaPartitionedDifferentOrderInsertCompatibility`
- Mapping type: `direct`
- Environment parity: Current class requires `DeltaLakeMinioEnvironment`. Routed by source review into
  `SuiteDeltaLakeOss` run 1.
- Tag parity: Current tags: `DeltaLakeMinio`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`, `INSERT`. Legacy setup operations: `CREATE`, `INSERT`.
- Action parity: Current action verbs: `SELECT`. Legacy action verbs: `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `containsOnly`, `row`. Legacy assertion helpers:
  `assertThat`, `containsOnly`, `row`.
- Cleanup parity: Current cleanup operations: `DROP`. No legacy cleanup method body was available.
- Any observed difference, however small: SQL verb set differs: legacy ['CREATE', 'INSERT', 'SELECT'] vs
  current ['CREATE', 'INSERT', 'SELECT', 'DROP']. Current method uses parameter-injected environment helpers instead of
  Tempto query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`
- Reviewer note: Matched by current suite selection: `SuiteDeltaLakeOss` run 1 Exact-name mapping with normalized body
  similarity `0.57`.
- Audit status: `verified`

##### `testInsertNonLowercaseColumnsCompatibility`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/deltalake/TestDeltaLakeInsertCompatibility.java` ->
  `testInsertNonLowercaseColumnsCompatibility`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/deltalake/TestDeltaLakeInsertCompatibility.java` ->
  `TestDeltaLakeInsertCompatibility.testInsertNonLowercaseColumnsCompatibility`
- Mapping type: `direct`
- Environment parity: Current class requires `DeltaLakeMinioEnvironment`. Routed by source review into
  `SuiteDeltaLakeOss` run 1.
- Tag parity: Current tags: `DeltaLakeMinio`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`, `INSERT`. Legacy setup operations: `CREATE`, `INSERT`.
- Action parity: Current action verbs: `SELECT`. Legacy action verbs: `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `containsOnly`, `row`. Legacy assertion helpers:
  `assertThat`, `containsOnly`, `row`.
- Cleanup parity: Current cleanup operations: `DROP`. No legacy cleanup method body was available.
- Any observed difference, however small: SQL verb set differs: legacy ['CREATE', 'INSERT', 'SELECT'] vs
  current ['CREATE', 'INSERT', 'SELECT', 'DROP']. Current method uses parameter-injected environment helpers instead of
  Tempto query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`
- Reviewer note: Matched by current suite selection: `SuiteDeltaLakeOss` run 1 Exact-name mapping with normalized body
  similarity `0.74`.
- Audit status: `verified`

##### `testInsertNestedNonLowercaseColumnsCompatibility`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/deltalake/TestDeltaLakeInsertCompatibility.java` ->
  `testInsertNestedNonLowercaseColumnsCompatibility`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/deltalake/TestDeltaLakeInsertCompatibility.java` ->
  `TestDeltaLakeInsertCompatibility.testInsertNestedNonLowercaseColumnsCompatibility`
- Mapping type: `direct`
- Environment parity: Current class requires `DeltaLakeMinioEnvironment`. Routed by source review into
  `SuiteDeltaLakeOss` run 1.
- Tag parity: Current tags: `DeltaLakeMinio`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`, `INSERT`. Legacy setup operations: `CREATE`, `INSERT`.
- Action parity: Current action verbs: `SELECT`. Legacy action verbs: `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `containsOnly`, `row`. Legacy assertion helpers:
  `assertThat`, `containsOnly`, `row`.
- Cleanup parity: Current cleanup operations: `DROP`. No legacy cleanup method body was available.
- Any observed difference, however small: SQL verb set differs: legacy ['CREATE', 'INSERT', 'SELECT'] vs
  current ['CREATE', 'INSERT', 'SELECT', 'DROP']. Current method uses parameter-injected environment helpers instead of
  Tempto query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`
- Reviewer note: Matched by current suite selection: `SuiteDeltaLakeOss` run 1 Exact-name mapping with normalized body
  similarity `0.83`.
- Audit status: `verified`

##### `testPartitionedInsertNonLowercaseColumnsCompatibility`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/deltalake/TestDeltaLakeInsertCompatibility.java` ->
  `testPartitionedInsertNonLowercaseColumnsCompatibility`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/deltalake/TestDeltaLakeInsertCompatibility.java` ->
  `TestDeltaLakeInsertCompatibility.testPartitionedInsertNonLowercaseColumnsCompatibility`
- Mapping type: `direct`
- Environment parity: Current class requires `DeltaLakeMinioEnvironment`. Routed by source review into
  `SuiteDeltaLakeOss` run 1.
- Tag parity: Current tags: `DeltaLakeMinio`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`, `INSERT`. Legacy setup operations: `CREATE`, `INSERT`.
- Action parity: Current action verbs: `SELECT`. Legacy action verbs: `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `containsOnly`, `row`. Legacy assertion helpers:
  `assertThat`, `containsOnly`, `row`.
- Cleanup parity: Current cleanup operations: `DROP`. No legacy cleanup method body was available.
- Any observed difference, however small: SQL verb set differs: legacy ['CREATE', 'INSERT', 'SELECT'] vs
  current ['CREATE', 'INSERT', 'SELECT', 'DROP']. Current method uses parameter-injected environment helpers instead of
  Tempto query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`
- Reviewer note: Matched by current suite selection: `SuiteDeltaLakeOss` run 1 Exact-name mapping with normalized body
  similarity `0.75`.
- Audit status: `verified`

##### `verifyCompressionCodecsDataProvider`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/deltalake/TestDeltaLakeInsertCompatibility.java` ->
  `verifyCompressionCodecsDataProvider`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/deltalake/TestDeltaLakeInsertCompatibility.java` ->
  `TestDeltaLakeInsertCompatibility.verifyCompressionCodecsDataProvider`
- Mapping type: `direct`
- Environment parity: Current class requires `DeltaLakeMinioEnvironment`. Routed by source review into
  `SuiteDeltaLakeOss` run 1.
- Tag parity: Current tags: `DeltaLakeMinio`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: none. Legacy setup operations: none.
- Action parity: Current action verbs: `SHOW`. Legacy action verbs: `SHOW`.
- Assertion parity: Current assertion helpers: `assertThat`, `containsOnly`, `row`. Legacy assertion helpers:
  `assertThat`, `containsOnly`, `row`.
- Cleanup parity: Current cleanup operations: none. No legacy cleanup method body was available.
- Any observed difference, however small: Current method uses parameter-injected environment helpers instead of Tempto
  query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`
- Reviewer note: Matched by current suite selection: `SuiteDeltaLakeOss` run 1 Exact-name mapping with normalized body
  similarity `0.92`.
- Audit status: `verified`

### `TestDeltaLakeJmx`

- Owning migration commit: `Migrate TestDeltaLakeJmx to JUnit`
- Current class added in same migration commit:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/deltalake/TestDeltaLakeJmx.java`
- Legacy class removed in same migration commit:
    - `testing/trino-product-tests/src/main/java/io/trino/tests/product/deltalake/TestDeltaLakeJmx.java`
- Class-level environment requirement: `DeltaLakeMinioEnvironment`.
- Class-level tags: `DeltaLakeMinio`.
- Method inventory complete: Yes. Legacy methods: `2`. Current methods: `1`.
- Legacy helper/resource dependencies accounted for: Legacy class source reviewed directly. Cross-class or merged legacy
  coverage accounted for: `testJmxTablesExposedByDeltaLakeConnectorBackedByGlueMetastore` -> covered in
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/deltalake/TestDeltaLakeJmxDatabricks.java` ->
  `testJmxTablesExposedByDeltaLakeConnectorBackedByGlueMetastore`.
- Intentional differences summary: `HDP to Hive 3.1 migration`
- Method statuses present: `verified`.

#### Methods

##### `testJmxTablesExposedByDeltaLakeConnectorBackedByThriftMetastore`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/deltalake/TestDeltaLakeJmx.java` ->
  `testJmxTablesExposedByDeltaLakeConnectorBackedByThriftMetastore`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/deltalake/TestDeltaLakeJmx.java` ->
  `TestDeltaLakeJmx.testJmxTablesExposedByDeltaLakeConnectorBackedByThriftMetastore`
- Mapping type: `direct`
- Environment parity: Current class requires `DeltaLakeMinioEnvironment`. Routed by source review into
  `SuiteDeltaLakeOss` run 1.
- Tag parity: Current tags: `DeltaLakeMinio`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: none. Legacy setup operations: none.
- Action parity: Current action verbs: `SHOW`. Legacy action verbs: `SHOW`.
- Assertion parity: Current assertion helpers: `assertThat`, `containsOnly`, `row`. Legacy assertion helpers:
  `assertThat`, `containsOnly`, `row`.
- Cleanup parity: Current cleanup operations: none. No legacy cleanup method body was available.
- Any observed difference, however small: Current method uses parameter-injected environment helpers instead of Tempto
  query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`
- Reviewer note: Matched by current suite selection: `SuiteDeltaLakeOss` run 1 Exact-name mapping with normalized body
  similarity `0.96`.
- Audit status: `verified`

### `TestDeltaLakePartitioningCompatibility`

- Owning migration commit: `Migrate TestDeltaLakePartitioningCompatibility to JUnit`
- Current class added in same migration commit:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/deltalake/TestDeltaLakePartitioningCompatibility.java`
- Legacy class removed in same migration commit:
  -
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/deltalake/TestDeltaLakePartitioningCompatibility.java`
- Class-level environment requirement: `DeltaLakeMinioEnvironment`.
- Class-level tags: `DeltaLakeMinio`.
- Method inventory complete: Yes. Legacy methods: `8`. Current methods: `8`.
- Legacy helper/resource dependencies accounted for: Legacy class source reviewed directly.
- Intentional differences summary: `HDP to Hive 3.1 migration`
- Method statuses present: `verified`.

#### Methods

##### `testSparkCanReadFromCtasTableCreatedByTrinoWithSpecialCharactersInPartitioningColumn`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/deltalake/TestDeltaLakePartitioningCompatibility.java` ->
  `testSparkCanReadFromCtasTableCreatedByTrinoWithSpecialCharactersInPartitioningColumn`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/deltalake/TestDeltaLakePartitioningCompatibility.java` ->
  `TestDeltaLakePartitioningCompatibility.testSparkCanReadFromCtasTableCreatedByTrinoWithSpecialCharactersInPartitioningColumn`
- Mapping type: `direct`
- Environment parity: Current class requires `DeltaLakeMinioEnvironment`. Routed by source review into
  `SuiteDeltaLakeOss` run 1.
- Tag parity: Current tags: `DeltaLakeMinio`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: none. No legacy setup method body was available.
- Action parity: Current action verbs: none. No legacy action method body was available.
- Assertion parity: Current assertion helpers: none. No legacy assertion method body was available.
- Cleanup parity: Current cleanup operations: none. No legacy cleanup method body was available.
- Any observed difference, however small: No method-specific difference identified beyond the documented framework
  baseline.
- Known intentional difference: None.
- Reviewer note: Matched by current suite selection: `SuiteDeltaLakeOss` run 1 High normalized body similarity `0.93`.
- Audit status: `verified`

##### `testTrinoCanReadFromCtasTableCreatedBySparkWithSpecialCharactersInPartitioningColumn`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/deltalake/TestDeltaLakePartitioningCompatibility.java` ->
  `testTrinoCanReadFromCtasTableCreatedBySparkWithSpecialCharactersInPartitioningColumn`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/deltalake/TestDeltaLakePartitioningCompatibility.java` ->
  `TestDeltaLakePartitioningCompatibility.testTrinoCanReadFromCtasTableCreatedBySparkWithSpecialCharactersInPartitioningColumn`
- Mapping type: `direct`
- Environment parity: Current class requires `DeltaLakeMinioEnvironment`. Routed by source review into
  `SuiteDeltaLakeOss` run 1.
- Tag parity: Current tags: `DeltaLakeMinio`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: none. No legacy setup method body was available.
- Action parity: Current action verbs: none. No legacy action method body was available.
- Assertion parity: Current assertion helpers: none. No legacy assertion method body was available.
- Cleanup parity: Current cleanup operations: none. No legacy cleanup method body was available.
- Any observed difference, however small: No method-specific difference identified beyond the documented framework
  baseline.
- Known intentional difference: None.
- Reviewer note: Matched by current suite selection: `SuiteDeltaLakeOss` run 1 High normalized body similarity `0.93`.
- Audit status: `verified`

##### `testSparkCanReadTableCreatedByTrinoWithSpecialCharactersInPartitioningColumn`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/deltalake/TestDeltaLakePartitioningCompatibility.java` ->
  `testSparkCanReadTableCreatedByTrinoWithSpecialCharactersInPartitioningColumn`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/deltalake/TestDeltaLakePartitioningCompatibility.java` ->
  `TestDeltaLakePartitioningCompatibility.testSparkCanReadTableCreatedByTrinoWithSpecialCharactersInPartitioningColumn`
- Mapping type: `direct`
- Environment parity: Current class requires `DeltaLakeMinioEnvironment`. Routed by source review into
  `SuiteDeltaLakeOss` run 1.
- Tag parity: Current tags: `DeltaLakeMinio`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: none. No legacy setup method body was available.
- Action parity: Current action verbs: none. No legacy action method body was available.
- Assertion parity: Current assertion helpers: none. No legacy assertion method body was available.
- Cleanup parity: Current cleanup operations: none. No legacy cleanup method body was available.
- Any observed difference, however small: No method-specific difference identified beyond the documented framework
  baseline.
- Known intentional difference: None.
- Reviewer note: Matched by current suite selection: `SuiteDeltaLakeOss` run 1 High normalized body similarity `0.93`.
- Audit status: `verified`

##### `testTrinoCanReadTableCreatedBySparkWithSpecialCharactersInPartitioningColumn`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/deltalake/TestDeltaLakePartitioningCompatibility.java` ->
  `testTrinoCanReadTableCreatedBySaprkWithSpecialCharactersInPartitioningColumn`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/deltalake/TestDeltaLakePartitioningCompatibility.java` ->
  `TestDeltaLakePartitioningCompatibility.testTrinoCanReadTableCreatedBySparkWithSpecialCharactersInPartitioningColumn`
- Mapping type: `renamed`
- Environment parity: Current class requires `DeltaLakeMinioEnvironment`. Routed by source review into
  `SuiteDeltaLakeOss` run 1.
- Tag parity: Current tags: `DeltaLakeMinio`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: none. No legacy setup method body was available.
- Action parity: Current action verbs: none. No legacy action method body was available.
- Assertion parity: Current assertion helpers: none. No legacy assertion method body was available.
- Cleanup parity: Current cleanup operations: none. No legacy cleanup method body was available.
- Any observed difference, however small: Current method maps to legacy
  `testTrinoCanReadTableCreatedBySaprkWithSpecialCharactersInPartitioningColumn` rather than the same method name.
- Known intentional difference: `HDP to Hive 3.1 migration`
- Reviewer note: Matched by current suite selection: `SuiteDeltaLakeOss` run 1
- Audit status: `verified`

##### `testSparkCanReadFromTableUpdatedByTrino`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/deltalake/TestDeltaLakePartitioningCompatibility.java` ->
  `testSparkCanReadFromTableUpdatedByTrino`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/deltalake/TestDeltaLakePartitioningCompatibility.java` ->
  `TestDeltaLakePartitioningCompatibility.testSparkCanReadFromTableUpdatedByTrino`
- Mapping type: `direct`
- Environment parity: Current class requires `DeltaLakeMinioEnvironment`. Routed by source review into
  `SuiteDeltaLakeOss` run 1.
- Tag parity: Current tags: `DeltaLakeMinio`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: none. No legacy setup method body was available.
- Action parity: Current action verbs: none. No legacy action method body was available.
- Assertion parity: Current assertion helpers: none. No legacy assertion method body was available.
- Cleanup parity: Current cleanup operations: none. No legacy cleanup method body was available.
- Any observed difference, however small: No method-specific difference identified beyond the documented framework
  baseline.
- Known intentional difference: None.
- Reviewer note: Matched by current suite selection: `SuiteDeltaLakeOss` run 1 High normalized body similarity `0.88`.
- Audit status: `verified`

##### `testTrinoCanReadFromTableUpdatedBySpark`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/deltalake/TestDeltaLakePartitioningCompatibility.java` ->
  `testTrinoCanReadFromTableUpdatedBySpark`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/deltalake/TestDeltaLakePartitioningCompatibility.java` ->
  `TestDeltaLakePartitioningCompatibility.testTrinoCanReadFromTableUpdatedBySpark`
- Mapping type: `direct`
- Environment parity: Current class requires `DeltaLakeMinioEnvironment`. Routed by source review into
  `SuiteDeltaLakeOss` run 1.
- Tag parity: Current tags: `DeltaLakeMinio`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: none. No legacy setup method body was available.
- Action parity: Current action verbs: none. No legacy action method body was available.
- Assertion parity: Current assertion helpers: none. No legacy assertion method body was available.
- Cleanup parity: Current cleanup operations: none. No legacy cleanup method body was available.
- Any observed difference, however small: No method-specific difference identified beyond the documented framework
  baseline.
- Known intentional difference: None.
- Reviewer note: Matched by current suite selection: `SuiteDeltaLakeOss` run 1 High normalized body similarity `0.88`.
- Audit status: `verified`

##### `testTrinoCanReadFromTablePartitionChangedBySpark`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/deltalake/TestDeltaLakePartitioningCompatibility.java` ->
  `testTrinoCanReadFromTablePartitionChangedBySpark`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/deltalake/TestDeltaLakePartitioningCompatibility.java` ->
  `TestDeltaLakePartitioningCompatibility.testTrinoCanReadFromTablePartitionChangedBySpark`
- Mapping type: `direct`
- Environment parity: Current class requires `DeltaLakeMinioEnvironment`. Routed by source review into
  `SuiteDeltaLakeOss` run 1.
- Tag parity: Current tags: `DeltaLakeMinio`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`. Legacy setup operations: `CREATE`.
- Action parity: Current action verbs: `SELECT`. Legacy action verbs: `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `containsOnly`, `row`. Legacy assertion helpers:
  `assertThat`, `contains`, `row`.
- Cleanup parity: Current cleanup operations: `DROP`. No legacy cleanup method body was available.
- Any observed difference, however small: SQL verb set differs: legacy ['CREATE', 'SELECT'] vs
  current ['CREATE', 'SELECT', 'DROP']. Assertion helper names differ between legacy and current implementations.
  Current method uses parameter-injected environment helpers instead of Tempto query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`
- Reviewer note: Matched by current suite selection: `SuiteDeltaLakeOss` run 1 Exact-name mapping with normalized body
  similarity `0.88`.
- Audit status: `verified`

##### `testPartitionedByNonLowercaseColumn`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/deltalake/TestDeltaLakePartitioningCompatibility.java` ->
  `testPartitionedByNonLowercaseColumn`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/deltalake/TestDeltaLakePartitioningCompatibility.java` ->
  `TestDeltaLakePartitioningCompatibility.testPartitionedByNonLowercaseColumn`
- Mapping type: `direct`
- Environment parity: Current class requires `DeltaLakeMinioEnvironment`. Routed by source review into
  `SuiteDeltaLakeOss` run 1.
- Tag parity: Current tags: `DeltaLakeMinio`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`, `INSERT`, `UPDATE`. Legacy setup operations: `CREATE`, `INSERT`,
  `UPDATE`.
- Action parity: Current action verbs: `SELECT`, `MERGE`. Legacy action verbs: `SELECT`, `MERGE`.
- Assertion parity: Current assertion helpers: `assertThat`, `containsOnly`, `row`. Legacy assertion helpers:
  `assertThat`, `contains`, `row`.
- Cleanup parity: Current cleanup operations: `DELETE`, `DROP`. Legacy cleanup operations: `DELETE`.
- Any observed difference, however small: SQL verb set differs:
  legacy ['CREATE', 'SELECT', 'INSERT', 'DELETE', 'UPDATE', 'MERGE'] vs
  current ['CREATE', 'SELECT', 'INSERT', 'DELETE', 'UPDATE', 'MERGE', 'DROP']. Assertion helper names differ between
  legacy and current implementations. Current method uses parameter-injected environment helpers instead of Tempto query
  executors.
- Known intentional difference: `HDP to Hive 3.1 migration`
- Reviewer note: Matched by current suite selection: `SuiteDeltaLakeOss` run 1 Exact-name mapping with normalized body
  similarity `0.64`.
- Audit status: `verified`

### `TestDeltaLakeProceduresCompatibility`

- Owning migration commit: `Migrate TestDeltaLakeProceduresCompatibility to JUnit`
- Current class added in same migration commit:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/deltalake/TestDeltaLakeProceduresCompatibility.java`
- Legacy class removed in same migration commit:
  -
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/deltalake/TestDeltaLakeProceduresCompatibility.java`
- Class-level environment requirement: `DeltaLakeMinioEnvironment`.
- Class-level tags: `DeltaLakeMinio`.
- Method inventory complete: Yes. Legacy methods: `1`. Current methods: `1`.
- Legacy helper/resource dependencies accounted for: Legacy class source reviewed directly.
- Intentional differences summary: `HDP to Hive 3.1 migration`
- Method statuses present: `verified`.

#### Methods

##### `testUnregisterTable`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/deltalake/TestDeltaLakeProceduresCompatibility.java` ->
  `testUnregisterTable`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/deltalake/TestDeltaLakeProceduresCompatibility.java` ->
  `TestDeltaLakeProceduresCompatibility.testUnregisterTable`
- Mapping type: `direct`
- Environment parity: Current class requires `DeltaLakeMinioEnvironment`. Routed by source review into
  `SuiteDeltaLakeOss` run 1.
- Tag parity: Current tags: `DeltaLakeMinio`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`. Legacy setup operations: `CREATE`.
- Action parity: Current action verbs: `SELECT`, `CALL`. Legacy action verbs: `SELECT`, `CALL`.
- Assertion parity: Current assertion helpers: `assertThat`, `assertThatThrownBy`, `containsOnly`,
  `hasMessageContaining`, `row`. Legacy assertion helpers: `assertQueryFailure`, `assertThat`, `containsOnly`, `row`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: Assertion helper names differ between legacy and current implementations.
  Current method uses parameter-injected environment helpers instead of Tempto query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`
- Reviewer note: Matched by current suite selection: `SuiteDeltaLakeOss` run 1 Exact-name mapping with normalized body
  similarity `0.75`.
- Audit status: `verified`

### `TestDeltaLakeSelectCompatibility`

- Owning migration commit: `Migrate TestDeltaLakeSelectCompatibility to JUnit`
- Current class added in same migration commit:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/deltalake/TestDeltaLakeSelectCompatibility.java`
- Legacy class removed in same migration commit:
    - `testing/trino-product-tests/src/main/java/io/trino/tests/product/deltalake/TestDeltaLakeSelectCompatibility.java`
- Class-level environment requirement: `DeltaLakeMinioEnvironment`.
- Class-level tags: `DeltaLakeMinio`.
- Method inventory complete: Yes. Legacy methods: `1`. Current methods: `1`.
- Legacy helper/resource dependencies accounted for: Legacy class source reviewed directly.
- Intentional differences summary: `HDP to Hive 3.1 migration`
- Method statuses present: `verified`.

#### Methods

##### `testPartitionedSelectSpecialCharacters`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/deltalake/TestDeltaLakeSelectCompatibility.java` ->
  `testPartitionedSelectSpecialCharacters`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/deltalake/TestDeltaLakeSelectCompatibility.java` ->
  `TestDeltaLakeSelectCompatibility.testPartitionedSelectSpecialCharacters`
- Mapping type: `direct`
- Environment parity: Current class requires `DeltaLakeMinioEnvironment`. Routed by source review into
  `SuiteDeltaLakeOss` run 1.
- Tag parity: Current tags: `DeltaLakeMinio`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`, `INSERT`. Legacy setup operations: `CREATE`, `INSERT`.
- Action parity: Current action verbs: `SELECT`. Legacy action verbs: `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `containsOnly`, `isEqualTo`, `row`. Legacy assertion
  helpers: `assertThat`, `containsOnly`, `isEqualTo`, `row`.
- Cleanup parity: Current cleanup operations: `DROP`. No legacy cleanup method body was available.
- Any observed difference, however small: SQL verb set differs: legacy ['CREATE', 'INSERT', 'SELECT'] vs
  current ['CREATE', 'INSERT', 'SELECT', 'DROP']. Current method uses parameter-injected environment helpers instead of
  Tempto query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`
- Reviewer note: Matched by current suite selection: `SuiteDeltaLakeOss` run 1 Exact-name mapping with normalized body
  similarity `0.90`.
- Audit status: `verified`

### `TestDeltaLakeSystemTableCompatibility`

- Owning migration commit: `Migrate TestDeltaLakeSystemTableCompatibility to JUnit`
- Current class added in same migration commit:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/deltalake/TestDeltaLakeSystemTableCompatibility.java`
- Legacy class removed in same migration commit:
  -
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/deltalake/TestDeltaLakeSystemTableCompatibility.java`
- Class-level environment requirement: `DeltaLakeMinioEnvironment`.
- Class-level tags: `DeltaLakeMinio`.
- Method inventory complete: Yes. Legacy methods: `4`. Current methods: `4`.
- Legacy helper/resource dependencies accounted for: Legacy class source reviewed directly.
- Intentional differences summary: `HDP to Hive 3.1 migration`
- Method statuses present: `verified`.

#### Methods

##### `testTablePropertiesCaseSensitivity`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/deltalake/TestDeltaLakeSystemTableCompatibility.java` ->
  `testTablePropertiesCaseSensitivity`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/deltalake/TestDeltaLakeSystemTableCompatibility.java` ->
  `TestDeltaLakeSystemTableCompatibility.testTablePropertiesCaseSensitivity`
- Mapping type: `direct`
- Environment parity: Current class requires `DeltaLakeMinioEnvironment`. Routed by source review into
  `SuiteDeltaLakeOss` run 1.
- Tag parity: Current tags: `DeltaLakeMinio`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`. Legacy setup operations: `CREATE`.
- Action parity: Current action verbs: `SHOW`, `SELECT`. Legacy action verbs: `SHOW`, `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `contains`, `row`. Legacy assertion helpers: `assertThat`,
  `contains`, `row`.
- Cleanup parity: Current cleanup operations: `DROP`. No legacy cleanup method body was available.
- Any observed difference, however small: SQL verb set differs: legacy ['CREATE', 'SHOW', 'SELECT'] vs
  current ['CREATE', 'SHOW', 'SELECT', 'DROP']. Current method uses parameter-injected environment helpers instead of
  Tempto query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`
- Reviewer note: Matched by current suite selection: `SuiteDeltaLakeOss` run 1 Exact-name mapping with normalized body
  similarity `0.88`.
- Audit status: `verified`

##### `testTablePropertiesWithTableFeatures`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/deltalake/TestDeltaLakeSystemTableCompatibility.java` ->
  `testTablePropertiesWithTableFeatures`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/deltalake/TestDeltaLakeSystemTableCompatibility.java` ->
  `TestDeltaLakeSystemTableCompatibility.testTablePropertiesWithTableFeatures`
- Mapping type: `direct`
- Environment parity: Current class requires `DeltaLakeMinioEnvironment`. Routed by source review into
  `SuiteDeltaLakeOss` run 1.
- Tag parity: Current tags: `DeltaLakeMinio`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`. Legacy setup operations: `CREATE`.
- Action parity: Current action verbs: `SHOW`, `SELECT`. Legacy action verbs: `SHOW`, `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `contains`, `row`. Legacy assertion helpers: `assertThat`,
  `contains`, `row`.
- Cleanup parity: Current cleanup operations: `DROP`. No legacy cleanup method body was available.
- Any observed difference, however small: SQL verb set differs: legacy ['CREATE', 'SHOW', 'SELECT'] vs
  current ['CREATE', 'SHOW', 'SELECT', 'DROP']. Current method uses parameter-injected environment helpers instead of
  Tempto query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`
- Reviewer note: Matched by current suite selection: `SuiteDeltaLakeOss` run 1 Exact-name mapping with normalized body
  similarity `0.90`.
- Audit status: `verified`

##### `testTablePartitionsWithDeletionVectors`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/deltalake/TestDeltaLakeSystemTableCompatibility.java` ->
  `testTablePartitionsWithDeletionVectors`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/deltalake/TestDeltaLakeSystemTableCompatibility.java` ->
  `TestDeltaLakeSystemTableCompatibility.testTablePartitionsWithDeletionVectors`
- Mapping type: `direct`
- Environment parity: Current class requires `DeltaLakeMinioEnvironment`. Routed by source review into
  `SuiteDeltaLakeOss` run 1.
- Tag parity: Current tags: `DeltaLakeMinio`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`, `INSERT`. Legacy setup operations: `CREATE`, `INSERT`.
- Action parity: Current action verbs: `SELECT`. Legacy action verbs: `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `containsOnly`, `row`. Legacy assertion helpers:
  `assertThat`, `containsOnly`, `row`.
- Cleanup parity: Current cleanup operations: `DELETE`, `DROP`. Legacy cleanup operations: `DELETE`, `DROP`.
- Any observed difference, however small: Current method uses parameter-injected environment helpers instead of Tempto
  query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`
- Reviewer note: Matched by current suite selection: `SuiteDeltaLakeOss` run 1 Exact-name mapping with normalized body
  similarity `0.93`.
- Audit status: `verified`

##### `testTablePartitionsWithNoColumnStats`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/deltalake/TestDeltaLakeSystemTableCompatibility.java` ->
  `testTablePartitionsWithNoColumnStats`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/deltalake/TestDeltaLakeSystemTableCompatibility.java` ->
  `TestDeltaLakeSystemTableCompatibility.testTablePartitionsWithNoColumnStats`
- Mapping type: `direct`
- Environment parity: Current class requires `DeltaLakeMinioEnvironment`. Routed by source review into
  `SuiteDeltaLakeOss` run 1.
- Tag parity: Current tags: `DeltaLakeMinio`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`, `INSERT`. Legacy setup operations: `CREATE`, `INSERT`.
- Action parity: Current action verbs: `SELECT`. Legacy action verbs: `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `containsOnly`, `row`. Legacy assertion helpers:
  `assertThat`, `containsOnly`, `row`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: Current method uses parameter-injected environment helpers instead of Tempto
  query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`
- Reviewer note: Matched by current suite selection: `SuiteDeltaLakeOss` run 1 Exact-name mapping with normalized body
  similarity `0.93`.
- Audit status: `verified`

### `TestDeltaLakeTimeTravelCompatibility`

- Owning migration commit: `Migrate TestDeltaLakeTimeTravelCompatibility to JUnit`
- Current class added in same migration commit:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/deltalake/TestDeltaLakeTimeTravelCompatibility.java`
- Legacy class removed in same migration commit:
  -
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/deltalake/TestDeltaLakeTimeTravelCompatibility.java`
- Class-level environment requirement: `DeltaLakeMinioEnvironment`.
- Class-level tags: `DeltaLakeMinio`.
- Method inventory complete: Yes. Legacy methods: `3`. Current methods: `3`.
- Legacy helper/resource dependencies accounted for: Legacy class source reviewed directly.
- Intentional differences summary: `HDP to Hive 3.1 migration`
- Method statuses present: `verified`.

#### Methods

##### `testReadFromTableRestoredToPreviousVersion`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/deltalake/TestDeltaLakeTimeTravelCompatibility.java` ->
  `testReadFromTableRestoredToPreviousVersion`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/deltalake/TestDeltaLakeTimeTravelCompatibility.java` ->
  `TestDeltaLakeTimeTravelCompatibility.testReadFromTableRestoredToPreviousVersion`
- Mapping type: `direct`
- Environment parity: Current class requires `DeltaLakeMinioEnvironment`. Routed by source review into
  `SuiteDeltaLakeOss` run 1.
- Tag parity: Current tags: `DeltaLakeMinio`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`, `INSERT`, `UPDATE`, `ALTER`. Legacy setup operations: `CREATE`,
  `INSERT`, `UPDATE`, `ALTER`.
- Action parity: Current action verbs: `SELECT`. Legacy action verbs: `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `containsOnly`, `row`. Legacy assertion helpers:
  `assertThat`, `containsOnly`, `row`.
- Cleanup parity: Current cleanup operations: `DELETE`, `DROP`. Legacy cleanup operations: `DELETE`.
- Any observed difference, however small: SQL verb set differs:
  legacy ['CREATE', 'INSERT', 'UPDATE', 'DELETE', 'ALTER', 'SELECT'] vs
  current ['CREATE', 'INSERT', 'UPDATE', 'DELETE', 'ALTER', 'SELECT', 'DROP']. Current method uses parameter-injected
  environment helpers instead of Tempto query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`
- Reviewer note: Matched by current suite selection: `SuiteDeltaLakeOss` run 1 Exact-name mapping with normalized body
  similarity `0.60`.
- Audit status: `verified`

##### `testSelectForVersionAsOf`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/deltalake/TestDeltaLakeTimeTravelCompatibility.java` ->
  `testSelectForVersionAsOf`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/deltalake/TestDeltaLakeTimeTravelCompatibility.java` ->
  `TestDeltaLakeTimeTravelCompatibility.testSelectForVersionAsOf`
- Mapping type: `direct`
- Environment parity: Current class requires `DeltaLakeMinioEnvironment`. Routed by source review into
  `SuiteDeltaLakeOss` run 1.
- Tag parity: Current tags: `DeltaLakeMinio`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`, `INSERT`, `ALTER`. Legacy setup operations: `CREATE`, `INSERT`,
  `ALTER`.
- Action parity: Current action verbs: `SELECT`. Legacy action verbs: `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `containsOnly`, `row`. Legacy assertion helpers:
  `assertThat`, `containsOnly`, `row`.
- Cleanup parity: Current cleanup operations: `DROP`. No legacy cleanup method body was available.
- Any observed difference, however small: SQL verb set differs: legacy ['CREATE', 'INSERT', 'ALTER', 'SELECT'] vs
  current ['CREATE', 'INSERT', 'ALTER', 'SELECT', 'DROP']. Current method uses parameter-injected environment helpers
  instead of Tempto query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`
- Reviewer note: Matched by current suite selection: `SuiteDeltaLakeOss` run 1 Exact-name mapping with normalized body
  similarity `0.55`.
- Audit status: `verified`

##### `testSelectForTemporalAsOf`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/deltalake/TestDeltaLakeTimeTravelCompatibility.java` ->
  `testSelectForTemporalAsOf`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/deltalake/TestDeltaLakeTimeTravelCompatibility.java` ->
  `TestDeltaLakeTimeTravelCompatibility.testSelectForTemporalAsOf`
- Mapping type: `direct`
- Environment parity: Current class requires `DeltaLakeMinioEnvironment`. Routed by source review into
  `SuiteDeltaLakeOss` run 1.
- Tag parity: Current tags: `DeltaLakeMinio`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`, `INSERT`, `ALTER`. Legacy setup operations: `CREATE`, `INSERT`,
  `ALTER`.
- Action parity: Current action verbs: `SELECT`. Legacy action verbs: `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `containsOnly`, `row`. Legacy assertion helpers:
  `assertThat`, `containsOnly`, `row`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: Current method uses parameter-injected environment helpers instead of Tempto
  query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`
- Reviewer note: Matched by current suite selection: `SuiteDeltaLakeOss` run 1 Exact-name mapping with normalized body
  similarity `0.69`.
- Audit status: `verified`

### `TestDeltaLakeTransactionLogCache`

- Owning migration commit: `Migrate TestDeltaLakeTransactionLogCache to JUnit`
- Current class added in same migration commit:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/deltalake/TestDeltaLakeTransactionLogCache.java`
- Legacy class removed in same migration commit:
    - `testing/trino-product-tests/src/main/java/io/trino/tests/product/deltalake/TestDeltaLakeTransactionLogCache.java`
- Class-level environment requirement: `DeltaLakeMinioEnvironment`.
- Class-level tags: `DeltaLakeMinio`.
- Method inventory complete: Yes. Legacy methods: `1`. Current methods: `1`.
- Legacy helper/resource dependencies accounted for: Legacy class source reviewed directly.
- Intentional differences summary: `HDP to Hive 3.1 migration`
- Method statuses present: `verified`.

#### Methods

##### `testAllDataFilesAreLoadedWhenTransactionLogFileAfterTheCachedTableVersionIsMissing`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/deltalake/TestDeltaLakeTransactionLogCache.java` ->
  `testAllDataFilesAreLoadedWhenTransactionLogFileAfterTheCachedTableVersionIsMissing`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/deltalake/TestDeltaLakeTransactionLogCache.java` ->
  `TestDeltaLakeTransactionLogCache.testAllDataFilesAreLoadedWhenTransactionLogFileAfterTheCachedTableVersionIsMissing`
- Mapping type: `direct`
- Environment parity: Current class requires `DeltaLakeMinioEnvironment`. Routed by source review into
  `SuiteDeltaLakeOss` run 1.
- Tag parity: Current tags: `DeltaLakeMinio`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`, `INSERT`. Legacy setup operations: `CREATE`, `INSERT`.
- Action parity: Current action verbs: `SELECT`. Legacy action verbs: `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `containsOnly`, `row`. Legacy assertion helpers:
  `assertThat`, `containsOnly`, `row`.
- Cleanup parity: Current cleanup operations: `DELETE`, `DROP`. Legacy cleanup operations: `DELETE`, `DROP`.
- Any observed difference, however small: Current method uses parameter-injected environment helpers instead of Tempto
  query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`
- Reviewer note: Matched by current suite selection: `SuiteDeltaLakeOss` run 1 Exact-name mapping with normalized body
  similarity `0.76`.
- Audit status: `verified`

### `TestDeltaLakeWriteDatabricksCompatibility`

- Owning migration commit: `Migrate TestDeltaLakeWriteDatabricksCompatibility to JUnit`
- Current class added in same migration commit:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/deltalake/TestDeltaLakeWriteDatabricksCompatibility.java`
- Legacy class removed in same migration commit:
  -
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/deltalake/TestDeltaLakeWriteDatabricksCompatibility.java`
- Class-level environment requirement: `DeltaLakeMinioEnvironment`.
- Class-level tags: `DeltaLakeMinio`.
- Method inventory complete: Yes. Legacy methods: `15`. Current methods: `2`.
- Legacy helper/resource dependencies accounted for: Legacy class source reviewed directly. Cross-class or merged legacy
  coverage accounted for: `testCaseDeleteEntirePartition` -> covered in
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/deltalake/TestDeltaLakeWriteDatabricksCompatibilityDatabricks.java` ->
  `testCaseDeleteEntirePartition`; `testCaseDeletePartialPartition` -> covered in
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/deltalake/TestDeltaLakeWriteDatabricksCompatibilityDatabricks.java` ->
  `testCaseDeletePartialPartition`; `testCaseUpdateInPartition` -> covered in
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/deltalake/TestDeltaLakeWriteDatabricksCompatibilityDatabricks.java` ->
  `testCaseUpdateInPartition`; `testCaseUpdatePartitionColumnFails` -> covered in
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/deltalake/TestDeltaLakeWriteDatabricksCompatibilityDatabricks.java` ->
  `testCaseUpdatePartitionColumnFails`; `testDatabricksRespectsTrinoSettingNonNullableColumn` -> covered in
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/deltalake/TestDeltaLakeWriteDatabricksCompatibilityDatabricks.java` ->
  `testDatabricksRespectsTrinoSettingNonNullableColumn`; `testDatabricksVacuumRemoveChangeDataFeedFiles` -> covered in
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/deltalake/TestDeltaLakeWriteDatabricksCompatibilityDatabricks.java` ->
  `testDatabricksVacuumRemoveChangeDataFeedFiles`; `testDeleteCompatibility` -> covered in
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/deltalake/TestDeltaLakeWriteDatabricksCompatibilityDatabricks.java` ->
  `testDeleteCompatibility`; `testDeleteOnPartitionKeyCompatibility` -> covered in
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/deltalake/TestDeltaLakeWriteDatabricksCompatibilityDatabricks.java` ->
  `testDeleteOnPartitionKeyCompatibility`; `testDeleteOnPartitionedTableCompatibility` -> covered in
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/deltalake/TestDeltaLakeWriteDatabricksCompatibilityDatabricks.java` ->
  `testDeleteOnPartitionedTableCompatibility`; `testInsertingIntoDatabricksTableWithAddedNotNullConstraint` -> covered
  in
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/deltalake/TestDeltaLakeWriteDatabricksCompatibilityDatabricks.java` ->
  `testInsertingIntoDatabricksTableWithAddedNotNullConstraint`; `testTrinoRespectsDatabricksSettingNonNullableColumn` ->
  covered in
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/deltalake/TestDeltaLakeWriteDatabricksCompatibilityDatabricks.java` ->
  `testTrinoRespectsDatabricksSettingNonNullableColumn`; `testTrinoVacuumRemoveChangeDataFeedFiles` -> covered in
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/deltalake/TestDeltaLakeWriteDatabricksCompatibilityDatabricks.java` ->
  `testTrinoVacuumRemoveChangeDataFeedFiles`; `testUpdateCompatibility` -> covered in
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/deltalake/TestDeltaLakeWriteDatabricksCompatibilityDatabricks.java` ->
  `testUpdateCompatibility`.
- Intentional differences summary: `HDP to Hive 3.1 migration`
- Method statuses present: `verified`.

#### Methods

##### `testVacuumProtocolCheck`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/deltalake/TestDeltaLakeWriteDatabricksCompatibility.java` ->
  `testVacuumProtocolCheck`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/deltalake/TestDeltaLakeWriteDatabricksCompatibility.java` ->
  `TestDeltaLakeWriteDatabricksCompatibility.testVacuumProtocolCheck`
- Mapping type: `direct`
- Environment parity: Current class requires `DeltaLakeMinioEnvironment`. Routed by source review into
  `SuiteDeltaLakeOss` run 1.
- Tag parity: Current tags: `DeltaLakeMinio`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`, `INSERT`, `UPDATE`. Legacy setup operations: `CREATE`, `INSERT`,
  `UPDATE`.
- Action parity: Current action verbs: `CALL`, `SELECT`. Legacy action verbs: `CALL`, `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `containsOnly`, `row`. Legacy assertion helpers:
  `assertThat`, `containsOnly`, `row`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: Current method uses parameter-injected environment helpers instead of Tempto
  query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`
- Reviewer note: Matched by current suite selection: `SuiteDeltaLakeOss` run 1 Exact-name mapping with normalized body
  similarity `0.85`.
- Audit status: `verified`

##### `testUnsupportedWriterVersion`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/deltalake/TestDeltaLakeWriteDatabricksCompatibility.java` ->
  `testUnsupportedWriterVersion`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/deltalake/TestDeltaLakeWriteDatabricksCompatibility.java` ->
  `TestDeltaLakeWriteDatabricksCompatibility.testUnsupportedWriterVersion`
- Mapping type: `direct`
- Environment parity: Current class requires `DeltaLakeMinioEnvironment`. Routed by source review into
  `SuiteDeltaLakeOss` run 1.
- Tag parity: Current tags: `DeltaLakeMinio`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`. Legacy setup operations: `CREATE`.
- Action parity: Current action verbs: none. Legacy action verbs: none.
- Assertion parity: Current assertion helpers: `assertThatThrownBy`. Legacy assertion helpers: `assertThat`.
- Cleanup parity: Current cleanup operations: `DROP`. No legacy cleanup method body was available.
- Any observed difference, however small: Normalized body similarity is low (`0.49`), so fidelity was judged from
  SQL/helper/assertion shape instead of raw text. SQL verb set differs: legacy ['CREATE'] vs current ['CREATE', 'DROP'].
  Assertion helper names differ between legacy and current implementations.
- Known intentional difference: `HDP to Hive 3.1 migration`
- Reviewer note: Matched by current suite selection: `SuiteDeltaLakeOss` run 1 Exact-name mapping with normalized body
  similarity `0.49`.
- Audit status: `verified`

### `TestDeltaLakeWriteDatabricksCompatibilityDatabricks`

- Owning migration commit: `Migrate TestDeltaLakeWriteDatabricksCompatibility to JUnit`
- Current class added in same migration commit:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/deltalake/TestDeltaLakeWriteDatabricksCompatibilityDatabricks.java`
- Legacy class removed in same migration commit:
  -
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/deltalake/TestDeltaLakeWriteDatabricksCompatibility.java`
- Class-level environment requirement: `DeltaLakeDatabricksEnvironment`.
- Class-level tags: `ConfiguredFeatures`, `DeltaLakeDatabricks`, `ProfileSpecificTests`.
- Method inventory complete: Yes. Legacy methods: `15`. Current methods: `13`.
- Legacy helper/resource dependencies accounted for: Legacy class source reviewed directly. Cross-class or merged legacy
  coverage accounted for: `testUnsupportedWriterVersion` -> covered in
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/deltalake/TestDeltaLakeWriteDatabricksCompatibility.java` ->
  `testUnsupportedWriterVersion`; `testVacuumProtocolCheck` -> covered in
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/deltalake/TestDeltaLakeWriteDatabricksCompatibility.java` ->
  `testVacuumProtocolCheck`.
- Intentional differences summary: `HDP to Hive 3.1 migration`
- Method statuses present: `verified`.

#### Methods

##### `testUpdateCompatibility`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/deltalake/TestDeltaLakeWriteDatabricksCompatibility.java` ->
  `testUpdateCompatibility`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/deltalake/TestDeltaLakeWriteDatabricksCompatibilityDatabricks.java` ->
  `TestDeltaLakeWriteDatabricksCompatibilityDatabricks.testUpdateCompatibility`
- Mapping type: `direct`
- Environment parity: Current class requires `DeltaLakeDatabricksEnvironment`. No suite run selects this method from the
  current suite definitions.
- Tag parity: Current tags: `ConfiguredFeatures`, `DeltaLakeDatabricks`, `ProfileSpecificTests`. Tag routing needs no
  suite-level product-test claim.
- Setup parity: Current setup operations: `CREATE`, `INSERT`, `UPDATE`. Legacy setup operations: `CREATE`, `INSERT`,
  `UPDATE`.
- Action parity: Current action verbs: `SELECT`. Legacy action verbs: `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `containsOnly`, `row`. Legacy assertion helpers:
  `assertThat`, `containsOnly`, `row`.
- Cleanup parity: Current cleanup operations: none. No legacy cleanup method body was available.
- Any observed difference, however small: Current method uses parameter-injected environment helpers instead of Tempto
  query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`
- Reviewer note: Exact-name mapping with normalized body similarity `0.86`.
- Audit status: `verified`

##### `testDeleteCompatibility`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/deltalake/TestDeltaLakeWriteDatabricksCompatibility.java` ->
  `testDeleteCompatibility`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/deltalake/TestDeltaLakeWriteDatabricksCompatibilityDatabricks.java` ->
  `TestDeltaLakeWriteDatabricksCompatibilityDatabricks.testDeleteCompatibility`
- Mapping type: `direct`
- Environment parity: Current class requires `DeltaLakeDatabricksEnvironment`. No suite run selects this method from the
  current suite definitions.
- Tag parity: Current tags: `ConfiguredFeatures`, `DeltaLakeDatabricks`, `ProfileSpecificTests`. Tag routing needs no
  suite-level product-test claim.
- Setup parity: Current setup operations: `CREATE`, `INSERT`. Legacy setup operations: `CREATE`, `INSERT`.
- Action parity: Current action verbs: `SELECT`. Legacy action verbs: `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `containsOnly`, `row`. Legacy assertion helpers:
  `assertThat`, `containsOnly`, `row`.
- Cleanup parity: Current cleanup operations: `DELETE`. Legacy cleanup operations: `DELETE`.
- Any observed difference, however small: Current method uses parameter-injected environment helpers instead of Tempto
  query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`
- Reviewer note: Exact-name mapping with normalized body similarity `0.82`.
- Audit status: `verified`

##### `testDeleteOnPartitionedTableCompatibility`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/deltalake/TestDeltaLakeWriteDatabricksCompatibility.java` ->
  `testDeleteOnPartitionedTableCompatibility`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/deltalake/TestDeltaLakeWriteDatabricksCompatibilityDatabricks.java` ->
  `TestDeltaLakeWriteDatabricksCompatibilityDatabricks.testDeleteOnPartitionedTableCompatibility`
- Mapping type: `direct`
- Environment parity: Current class requires `DeltaLakeDatabricksEnvironment`. No suite run selects this method from the
  current suite definitions.
- Tag parity: Current tags: `ConfiguredFeatures`, `DeltaLakeDatabricks`, `ProfileSpecificTests`. Tag routing needs no
  suite-level product-test claim.
- Setup parity: Current setup operations: `CREATE`, `INSERT`. Legacy setup operations: `CREATE`, `INSERT`.
- Action parity: Current action verbs: `SELECT`. Legacy action verbs: `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `containsOnly`, `row`. Legacy assertion helpers:
  `assertThat`, `containsOnly`, `row`.
- Cleanup parity: Current cleanup operations: `DELETE`. Legacy cleanup operations: `DELETE`.
- Any observed difference, however small: Current method uses parameter-injected environment helpers instead of Tempto
  query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`
- Reviewer note: Exact-name mapping with normalized body similarity `0.84`.
- Audit status: `verified`

##### `testDeleteOnPartitionKeyCompatibility`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/deltalake/TestDeltaLakeWriteDatabricksCompatibility.java` ->
  `testDeleteOnPartitionKeyCompatibility`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/deltalake/TestDeltaLakeWriteDatabricksCompatibilityDatabricks.java` ->
  `TestDeltaLakeWriteDatabricksCompatibilityDatabricks.testDeleteOnPartitionKeyCompatibility`
- Mapping type: `direct`
- Environment parity: Current class requires `DeltaLakeDatabricksEnvironment`. No suite run selects this method from the
  current suite definitions.
- Tag parity: Current tags: `ConfiguredFeatures`, `DeltaLakeDatabricks`, `ProfileSpecificTests`. Tag routing needs no
  suite-level product-test claim.
- Setup parity: Current setup operations: `CREATE`, `INSERT`. Legacy setup operations: `CREATE`, `INSERT`.
- Action parity: Current action verbs: `SELECT`. Legacy action verbs: `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `containsOnly`, `row`. Legacy assertion helpers:
  `assertThat`, `containsOnly`, `row`.
- Cleanup parity: Current cleanup operations: `DELETE`. Legacy cleanup operations: `DELETE`.
- Any observed difference, however small: Current method uses parameter-injected environment helpers instead of Tempto
  query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`
- Reviewer note: Exact-name mapping with normalized body similarity `0.88`.
- Audit status: `verified`

##### `testCaseUpdateInPartition`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/deltalake/TestDeltaLakeWriteDatabricksCompatibility.java` ->
  `testCaseUpdateInPartition`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/deltalake/TestDeltaLakeWriteDatabricksCompatibilityDatabricks.java` ->
  `TestDeltaLakeWriteDatabricksCompatibilityDatabricks.testCaseUpdateInPartition`
- Mapping type: `direct`
- Environment parity: Current class requires `DeltaLakeDatabricksEnvironment`. No suite run selects this method from the
  current suite definitions.
- Tag parity: Current tags: `ConfiguredFeatures`, `DeltaLakeDatabricks`, `ProfileSpecificTests`. Tag routing needs no
  suite-level product-test claim.
- Setup parity: Current setup operations: `UPDATE`. Legacy setup operations: `UPDATE`.
- Action parity: Current action verbs: none. Legacy action verbs: none.
- Assertion parity: Current assertion helpers: `assertTable`. Legacy assertion helpers: `assertTable`, `row`.
- Cleanup parity: Current cleanup operations: none. No legacy cleanup method body was available.
- Any observed difference, however small: Assertion helper names differ between legacy and current implementations.
  Current method uses parameter-injected environment helpers instead of Tempto query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`
- Reviewer note: Exact-name mapping with normalized body similarity `0.58`.
- Audit status: `verified`

##### `testCaseUpdatePartitionColumnFails`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/deltalake/TestDeltaLakeWriteDatabricksCompatibility.java` ->
  `testCaseUpdatePartitionColumnFails`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/deltalake/TestDeltaLakeWriteDatabricksCompatibilityDatabricks.java` ->
  `TestDeltaLakeWriteDatabricksCompatibilityDatabricks.testCaseUpdatePartitionColumnFails`
- Mapping type: `direct`
- Environment parity: Current class requires `DeltaLakeDatabricksEnvironment`. No suite run selects this method from the
  current suite definitions.
- Tag parity: Current tags: `ConfiguredFeatures`, `DeltaLakeDatabricks`, `ProfileSpecificTests`. Tag routing needs no
  suite-level product-test claim.
- Setup parity: Current setup operations: `UPDATE`. Legacy setup operations: `UPDATE`.
- Action parity: Current action verbs: none. Legacy action verbs: none.
- Assertion parity: Current assertion helpers: `assertTable`. Legacy assertion helpers: `assertTable`, `row`.
- Cleanup parity: Current cleanup operations: none. No legacy cleanup method body was available.
- Any observed difference, however small: Assertion helper names differ between legacy and current implementations.
  Current method uses parameter-injected environment helpers instead of Tempto query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`
- Reviewer note: Exact-name mapping with normalized body similarity `0.66`.
- Audit status: `verified`

##### `testCaseDeletePartialPartition`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/deltalake/TestDeltaLakeWriteDatabricksCompatibility.java` ->
  `testCaseDeletePartialPartition`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/deltalake/TestDeltaLakeWriteDatabricksCompatibilityDatabricks.java` ->
  `TestDeltaLakeWriteDatabricksCompatibilityDatabricks.testCaseDeletePartialPartition`
- Mapping type: `direct`
- Environment parity: Current class requires `DeltaLakeDatabricksEnvironment`. No suite run selects this method from the
  current suite definitions.
- Tag parity: Current tags: `ConfiguredFeatures`, `DeltaLakeDatabricks`, `ProfileSpecificTests`. Tag routing needs no
  suite-level product-test claim.
- Setup parity: Current setup operations: none. Legacy setup operations: none.
- Action parity: Current action verbs: none. Legacy action verbs: none.
- Assertion parity: Current assertion helpers: `assertTable`. Legacy assertion helpers: `assertTable`, `row`.
- Cleanup parity: Current cleanup operations: `DELETE`. Legacy cleanup operations: `DELETE`.
- Any observed difference, however small: Assertion helper names differ between legacy and current implementations.
  Current method uses parameter-injected environment helpers instead of Tempto query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`
- Reviewer note: Exact-name mapping with normalized body similarity `0.62`.
- Audit status: `verified`

##### `testCaseDeleteEntirePartition`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/deltalake/TestDeltaLakeWriteDatabricksCompatibility.java` ->
  `testCaseDeleteEntirePartition`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/deltalake/TestDeltaLakeWriteDatabricksCompatibilityDatabricks.java` ->
  `TestDeltaLakeWriteDatabricksCompatibilityDatabricks.testCaseDeleteEntirePartition`
- Mapping type: `direct`
- Environment parity: Current class requires `DeltaLakeDatabricksEnvironment`. No suite run selects this method from the
  current suite definitions.
- Tag parity: Current tags: `ConfiguredFeatures`, `DeltaLakeDatabricks`, `ProfileSpecificTests`. Tag routing needs no
  suite-level product-test claim.
- Setup parity: Current setup operations: none. Legacy setup operations: none.
- Action parity: Current action verbs: none. Legacy action verbs: none.
- Assertion parity: Current assertion helpers: `assertTable`. Legacy assertion helpers: `assertTable`, `row`.
- Cleanup parity: Current cleanup operations: `DELETE`. Legacy cleanup operations: `DELETE`.
- Any observed difference, however small: Assertion helper names differ between legacy and current implementations.
  Current method uses parameter-injected environment helpers instead of Tempto query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`
- Reviewer note: Exact-name mapping with normalized body similarity `0.75`.
- Audit status: `verified`

##### `testTrinoRespectsDatabricksSettingNonNullableColumn`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/deltalake/TestDeltaLakeWriteDatabricksCompatibility.java` ->
  `testTrinoRespectsDatabricksSettingNonNullableColumn`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/deltalake/TestDeltaLakeWriteDatabricksCompatibilityDatabricks.java` ->
  `TestDeltaLakeWriteDatabricksCompatibilityDatabricks.testTrinoRespectsDatabricksSettingNonNullableColumn`
- Mapping type: `direct`
- Environment parity: Current class requires `DeltaLakeDatabricksEnvironment`. No suite run selects this method from the
  current suite definitions.
- Tag parity: Current tags: `ConfiguredFeatures`, `DeltaLakeDatabricks`, `ProfileSpecificTests`. Tag routing needs no
  suite-level product-test claim.
- Setup parity: Current setup operations: `CREATE`, `INSERT`. Legacy setup operations: `CREATE`, `INSERT`.
- Action parity: Current action verbs: `SELECT`. Legacy action verbs: `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `assertThatThrownBy`, `containsOnly`,
  `hasMessageContaining`, `row`. Legacy assertion helpers: `assertQueryFailure`, `assertThat`, `containsOnly`,
  `hasMessageContaining`, `row`.
- Cleanup parity: Current cleanup operations: none. No legacy cleanup method body was available.
- Any observed difference, however small: Assertion helper names differ between legacy and current implementations.
  Current method uses parameter-injected environment helpers instead of Tempto query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`
- Reviewer note: Exact-name mapping with normalized body similarity `0.84`.
- Audit status: `verified`

##### `testDatabricksRespectsTrinoSettingNonNullableColumn`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/deltalake/TestDeltaLakeWriteDatabricksCompatibility.java` ->
  `testDatabricksRespectsTrinoSettingNonNullableColumn`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/deltalake/TestDeltaLakeWriteDatabricksCompatibilityDatabricks.java` ->
  `TestDeltaLakeWriteDatabricksCompatibilityDatabricks.testDatabricksRespectsTrinoSettingNonNullableColumn`
- Mapping type: `direct`
- Environment parity: Current class requires `DeltaLakeDatabricksEnvironment`. No suite run selects this method from the
  current suite definitions.
- Tag parity: Current tags: `ConfiguredFeatures`, `DeltaLakeDatabricks`, `ProfileSpecificTests`. Tag routing needs no
  suite-level product-test claim.
- Setup parity: Current setup operations: `CREATE`, `INSERT`. Legacy setup operations: `CREATE`, `INSERT`.
- Action parity: Current action verbs: `WITH`, `SELECT`. Legacy action verbs: `WITH`, `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `assertThatThrownBy`, `containsOnly`,
  `hasMessageContaining`, `row`. Legacy assertion helpers: `assertQueryFailure`, `assertThat`, `containsOnly`,
  `hasMessageContaining`, `row`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: Assertion helper names differ between legacy and current implementations.
  Current method uses parameter-injected environment helpers instead of Tempto query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`
- Reviewer note: Exact-name mapping with normalized body similarity `0.80`.
- Audit status: `verified`

##### `testInsertingIntoDatabricksTableWithAddedNotNullConstraint`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/deltalake/TestDeltaLakeWriteDatabricksCompatibility.java` ->
  `testInsertingIntoDatabricksTableWithAddedNotNullConstraint`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/deltalake/TestDeltaLakeWriteDatabricksCompatibilityDatabricks.java` ->
  `TestDeltaLakeWriteDatabricksCompatibilityDatabricks.testInsertingIntoDatabricksTableWithAddedNotNullConstraint`
- Mapping type: `direct`
- Environment parity: Current class requires `DeltaLakeDatabricksEnvironment`. No suite run selects this method from the
  current suite definitions.
- Tag parity: Current tags: `ConfiguredFeatures`, `DeltaLakeDatabricks`, `ProfileSpecificTests`. Tag routing needs no
  suite-level product-test claim.
- Setup parity: Current setup operations: `CREATE`, `INSERT`, `ALTER`. Legacy setup operations: `CREATE`, `INSERT`,
  `ALTER`.
- Action parity: Current action verbs: `SELECT`. Legacy action verbs: `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `assertThatThrownBy`, `containsOnly`,
  `hasMessageContaining`, `row`. Legacy assertion helpers: `assertQueryFailure`, `assertThat`, `containsOnly`,
  `hasMessageContaining`, `row`.
- Cleanup parity: Current cleanup operations: none. No legacy cleanup method body was available.
- Any observed difference, however small: Assertion helper names differ between legacy and current implementations.
  Current method uses parameter-injected environment helpers instead of Tempto query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`
- Reviewer note: Exact-name mapping with normalized body similarity `0.86`.
- Audit status: `verified`

##### `testTrinoVacuumRemoveChangeDataFeedFiles`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/deltalake/TestDeltaLakeWriteDatabricksCompatibility.java` ->
  `testTrinoVacuumRemoveChangeDataFeedFiles`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/deltalake/TestDeltaLakeWriteDatabricksCompatibilityDatabricks.java` ->
  `TestDeltaLakeWriteDatabricksCompatibilityDatabricks.testTrinoVacuumRemoveChangeDataFeedFiles`
- Mapping type: `direct`
- Environment parity: Current class requires `DeltaLakeDatabricksEnvironment`. No suite run selects this method from the
  current suite definitions.
- Tag parity: Current tags: `ConfiguredFeatures`, `DeltaLakeDatabricks`, `DeltaLakeExclude173`, `ProfileSpecificTests`.
  Tag routing needs no suite-level product-test claim.
- Setup parity: Current setup operations: none. Legacy setup operations: none.
- Action parity: Current action verbs: `CALL`. Legacy action verbs: `CALL`.
- Assertion parity: Current assertion helpers: none. No legacy assertion method body was available.
- Cleanup parity: Current cleanup operations: none. No legacy cleanup method body was available.
- Any observed difference, however small: Current method uses parameter-injected environment helpers instead of Tempto
  query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`
- Reviewer note: Exact-name mapping with normalized body similarity `0.81`.
- Audit status: `verified`

##### `testDatabricksVacuumRemoveChangeDataFeedFiles`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/deltalake/TestDeltaLakeWriteDatabricksCompatibility.java` ->
  `testDatabricksVacuumRemoveChangeDataFeedFiles`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/deltalake/TestDeltaLakeWriteDatabricksCompatibilityDatabricks.java` ->
  `TestDeltaLakeWriteDatabricksCompatibilityDatabricks.testDatabricksVacuumRemoveChangeDataFeedFiles`
- Mapping type: `direct`
- Environment parity: Current class requires `DeltaLakeDatabricksEnvironment`. No suite run selects this method from the
  current suite definitions.
- Tag parity: Current tags: `ConfiguredFeatures`, `DeltaLakeDatabricks`, `ProfileSpecificTests`. Tag routing needs no
  suite-level product-test claim.
- Setup parity: Current setup operations: none. No legacy setup method body was available.
- Action parity: Current action verbs: none. No legacy action method body was available.
- Assertion parity: Current assertion helpers: none. No legacy assertion method body was available.
- Cleanup parity: Current cleanup operations: none. No legacy cleanup method body was available.
- Any observed difference, however small: No method-specific difference identified beyond the documented framework
  baseline.
- Known intentional difference: None.
- Reviewer note: High normalized body similarity `0.83`.
- Audit status: `verified`

### `TestHiveAndDeltaLakeRedirect`

- Owning migration commit: `Migrate TestHiveAndDeltaLakeRedirect to JUnit`
- Current class added in same migration commit:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/deltalake/TestHiveAndDeltaLakeRedirect.java`
- Legacy class removed in same migration commit:
    - `testing/trino-product-tests/src/main/java/io/trino/tests/product/deltalake/TestHiveAndDeltaLakeRedirect.java`
- Class-level environment requirement: `HiveDeltaLakeMinioEnvironment`.
- Class-level tags: `DeltaLakeOss`.
- Method inventory complete: Yes. Legacy methods: `30`. Current methods: `30`.
- Legacy helper/resource dependencies accounted for: Legacy class source reviewed directly.
- Intentional differences summary: `HDP to Hive 3.1 migration`
- Method statuses present: `verified`.

#### Methods

##### `testHiveToDeltaRedirect`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/deltalake/TestHiveAndDeltaLakeRedirect.java` ->
  `testHiveToDeltaRedirect`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/deltalake/TestHiveAndDeltaLakeRedirect.java` ->
  `TestHiveAndDeltaLakeRedirect.testHiveToDeltaRedirect`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveDeltaLakeMinioEnvironment`. Routed by source review into
  `SuiteDeltaLakeOss` run 3.
- Tag parity: Current tags: `DeltaLakeOss`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: none. Legacy setup operations: none.
- Action parity: Current action verbs: `SELECT`. Legacy action verbs: `SELECT`.
- Assertion parity: Current assertion helpers: `assertResultsEqual`. Legacy assertion helpers: `assertThat`,
  `containsOnly`.
- Cleanup parity: Current cleanup operations: `DROP`. No legacy cleanup method body was available.
- Any observed difference, however small: Normalized body similarity is low (`0.32`), so fidelity was judged from
  SQL/helper/assertion shape instead of raw text. SQL verb set differs: legacy ['SELECT'] vs current ['SELECT', 'DROP'].
  Assertion helper names differ between legacy and current implementations. Current method uses parameter-injected
  environment helpers instead of Tempto query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`
- Reviewer note: Matched by current suite selection: `SuiteDeltaLakeOss` run 3 Exact-name mapping with normalized body
  similarity `0.32`.
- Audit status: `verified`

##### `testHiveToDeltaNonDefaultSchemaRedirect`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/deltalake/TestHiveAndDeltaLakeRedirect.java` ->
  `testHiveToDeltaNonDefaultSchemaRedirect`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/deltalake/TestHiveAndDeltaLakeRedirect.java` ->
  `TestHiveAndDeltaLakeRedirect.testHiveToDeltaNonDefaultSchemaRedirect`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveDeltaLakeMinioEnvironment`. Routed by source review into
  `SuiteDeltaLakeOss` run 3.
- Tag parity: Current tags: `DeltaLakeOss`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`. Legacy setup operations: `CREATE`.
- Action parity: Current action verbs: `SELECT`. Legacy action verbs: `SELECT`.
- Assertion parity: Current assertion helpers: `assertResultsEqual`. Legacy assertion helpers: `assertThat`,
  `containsOnly`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: Assertion helper names differ between legacy and current implementations.
  Current method uses parameter-injected environment helpers instead of Tempto query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`
- Reviewer note: Matched by current suite selection: `SuiteDeltaLakeOss` run 3 Exact-name mapping with normalized body
  similarity `0.64`.
- Audit status: `verified`

##### `testHiveToNonexistentDeltaCatalogRedirectFailure`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/deltalake/TestHiveAndDeltaLakeRedirect.java` ->
  `testHiveToNonexistentDeltaCatalogRedirectFailure`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/deltalake/TestHiveAndDeltaLakeRedirect.java` ->
  `TestHiveAndDeltaLakeRedirect.testHiveToNonexistentDeltaCatalogRedirectFailure`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveDeltaLakeMinioEnvironment`. Routed by source review into
  `SuiteDeltaLakeOss` run 3.
- Tag parity: Current tags: `DeltaLakeOss`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: none. Legacy setup operations: none.
- Action parity: Current action verbs: `SELECT`. Legacy action verbs: `SELECT`.
- Assertion parity: Current assertion helpers: `assertThatThrownBy`. Legacy assertion helpers: `assertQueryFailure`.
- Cleanup parity: Current cleanup operations: `DROP`. No legacy cleanup method body was available.
- Any observed difference, however small: SQL verb set differs: legacy ['SELECT'] vs current ['SELECT', 'DROP'].
  Assertion helper names differ between legacy and current implementations. Current method uses parameter-injected
  environment helpers instead of Tempto query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`
- Reviewer note: Matched by current suite selection: `SuiteDeltaLakeOss` run 3 Exact-name mapping with normalized body
  similarity `0.77`.
- Audit status: `verified`

##### `testHiveToDeltaRedirectWithDefaultSchemaInSession`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/deltalake/TestHiveAndDeltaLakeRedirect.java` ->
  `testHiveToDeltaRedirectWithDefaultSchemaInSession`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/deltalake/TestHiveAndDeltaLakeRedirect.java` ->
  `TestHiveAndDeltaLakeRedirect.testHiveToDeltaRedirectWithDefaultSchemaInSession`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveDeltaLakeMinioEnvironment`. Routed by source review into
  `SuiteDeltaLakeOss` run 3.
- Tag parity: Current tags: `DeltaLakeOss`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: none. Legacy setup operations: none.
- Action parity: Current action verbs: `SELECT`. Legacy action verbs: `SELECT`.
- Assertion parity: Current assertion helpers: `assertResultsEqual`. Legacy assertion helpers: `assertThat`,
  `containsOnly`.
- Cleanup parity: Current cleanup operations: `DROP`. No legacy cleanup method body was available.
- Any observed difference, however small: Normalized body similarity is low (`0.50`), so fidelity was judged from
  SQL/helper/assertion shape instead of raw text. SQL verb set differs: legacy ['SELECT'] vs current ['SELECT', 'DROP'].
  Assertion helper names differ between legacy and current implementations. Current method uses parameter-injected
  environment helpers instead of Tempto query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`
- Reviewer note: Matched by current suite selection: `SuiteDeltaLakeOss` run 3 Exact-name mapping with normalized body
  similarity `0.50`.
- Audit status: `verified`

##### `testHiveToUnpartitionedDeltaPartitionsRedirect`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/deltalake/TestHiveAndDeltaLakeRedirect.java` ->
  `testHiveToUnpartitionedDeltaPartitionsRedirect`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/deltalake/TestHiveAndDeltaLakeRedirect.java` ->
  `TestHiveAndDeltaLakeRedirect.testHiveToUnpartitionedDeltaPartitionsRedirect`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveDeltaLakeMinioEnvironment`. Routed by source review into
  `SuiteDeltaLakeOss` run 3.
- Tag parity: Current tags: `DeltaLakeOss`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: none. Legacy setup operations: none.
- Action parity: Current action verbs: `SELECT`. Legacy action verbs: `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`. Legacy assertion helpers: `assertThat`.
- Cleanup parity: Current cleanup operations: `DROP`. No legacy cleanup method body was available.
- Any observed difference, however small: Normalized body similarity is low (`0.31`), so fidelity was judged from
  SQL/helper/assertion shape instead of raw text. SQL verb set differs: legacy ['SELECT'] vs current ['SELECT', 'DROP'].
  Current method uses parameter-injected environment helpers instead of Tempto query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`
- Reviewer note: Matched by current suite selection: `SuiteDeltaLakeOss` run 3 Exact-name mapping with normalized body
  similarity `0.31`.
- Audit status: `verified`

##### `testDeltaToHiveRedirect`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/deltalake/TestHiveAndDeltaLakeRedirect.java` ->
  `testDeltaToHiveRedirect`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/deltalake/TestHiveAndDeltaLakeRedirect.java` ->
  `TestHiveAndDeltaLakeRedirect.testDeltaToHiveRedirect`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveDeltaLakeMinioEnvironment`. Routed by source review into
  `SuiteDeltaLakeOss` run 3.
- Tag parity: Current tags: `DeltaLakeOss`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: none. Legacy setup operations: none.
- Action parity: Current action verbs: `SELECT`. Legacy action verbs: `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `containsOnly`, `row`. Legacy assertion helpers:
  `assertThat`, `containsOnly`, `row`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: Current method uses parameter-injected environment helpers instead of Tempto
  query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`
- Reviewer note: Matched by current suite selection: `SuiteDeltaLakeOss` run 3 Exact-name mapping with normalized body
  similarity `0.88`.
- Audit status: `verified`

##### `testDeltaToHiveNonDefaultSchemaRedirect`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/deltalake/TestHiveAndDeltaLakeRedirect.java` ->
  `testDeltaToHiveNonDefaultSchemaRedirect`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/deltalake/TestHiveAndDeltaLakeRedirect.java` ->
  `TestHiveAndDeltaLakeRedirect.testDeltaToHiveNonDefaultSchemaRedirect`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveDeltaLakeMinioEnvironment`. Routed by source review into
  `SuiteDeltaLakeOss` run 3.
- Tag parity: Current tags: `DeltaLakeOss`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`. Legacy setup operations: `CREATE`.
- Action parity: Current action verbs: `SELECT`. Legacy action verbs: `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `containsOnly`, `row`. Legacy assertion helpers:
  `assertThat`, `containsOnly`, `row`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: Current method uses parameter-injected environment helpers instead of Tempto
  query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`
- Reviewer note: Matched by current suite selection: `SuiteDeltaLakeOss` run 3 Exact-name mapping with normalized body
  similarity `0.89`.
- Audit status: `verified`

##### `testDeltaToNonexistentHiveCatalogRedirectFailure`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/deltalake/TestHiveAndDeltaLakeRedirect.java` ->
  `testDeltaToNonexistentHiveCatalogRedirectFailure`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/deltalake/TestHiveAndDeltaLakeRedirect.java` ->
  `TestHiveAndDeltaLakeRedirect.testDeltaToNonexistentHiveCatalogRedirectFailure`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveDeltaLakeMinioEnvironment`. Routed by source review into
  `SuiteDeltaLakeOss` run 3.
- Tag parity: Current tags: `DeltaLakeOss`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: none. Legacy setup operations: none.
- Action parity: Current action verbs: `SELECT`. Legacy action verbs: `SELECT`.
- Assertion parity: Current assertion helpers: `assertThatThrownBy`. Legacy assertion helpers: `assertQueryFailure`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: Assertion helper names differ between legacy and current implementations.
  Current method uses parameter-injected environment helpers instead of Tempto query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`
- Reviewer note: Matched by current suite selection: `SuiteDeltaLakeOss` run 3 Exact-name mapping with normalized body
  similarity `0.74`.
- Audit status: `verified`

##### `testDeltaToHiveRedirectWithDefaultSchemaInSession`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/deltalake/TestHiveAndDeltaLakeRedirect.java` ->
  `testDeltaToHiveRedirectWithDefaultSchemaInSession`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/deltalake/TestHiveAndDeltaLakeRedirect.java` ->
  `TestHiveAndDeltaLakeRedirect.testDeltaToHiveRedirectWithDefaultSchemaInSession`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveDeltaLakeMinioEnvironment`. Routed by source review into
  `SuiteDeltaLakeOss` run 3.
- Tag parity: Current tags: `DeltaLakeOss`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: none. Legacy setup operations: none.
- Action parity: Current action verbs: `SELECT`. Legacy action verbs: `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `containsOnly`, `row`. Legacy assertion helpers:
  `assertThat`, `containsOnly`, `row`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: Current method uses parameter-injected environment helpers instead of Tempto
  query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`
- Reviewer note: Matched by current suite selection: `SuiteDeltaLakeOss` run 3 Exact-name mapping with normalized body
  similarity `0.78`.
- Audit status: `verified`

##### `testDeltaToPartitionedHivePartitionsRedirect`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/deltalake/TestHiveAndDeltaLakeRedirect.java` ->
  `testDeltaToPartitionedHivePartitionsRedirect`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/deltalake/TestHiveAndDeltaLakeRedirect.java` ->
  `TestHiveAndDeltaLakeRedirect.testDeltaToPartitionedHivePartitionsRedirect`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveDeltaLakeMinioEnvironment`. Routed by source review into
  `SuiteDeltaLakeOss` run 3.
- Tag parity: Current tags: `DeltaLakeOss`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: none. Legacy setup operations: none.
- Action parity: Current action verbs: `SELECT`. Legacy action verbs: `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `containsOnly`, `row`. Legacy assertion helpers:
  `assertThat`, `containsOnly`, `row`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: Current method uses parameter-injected environment helpers instead of Tempto
  query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`
- Reviewer note: Matched by current suite selection: `SuiteDeltaLakeOss` run 3 Exact-name mapping with normalized body
  similarity `0.88`.
- Audit status: `verified`

##### `testDeltaToUnpartitionedHivePartitionsRedirectFailure`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/deltalake/TestHiveAndDeltaLakeRedirect.java` ->
  `testDeltaToUnpartitionedHivePartitionsRedirectFailure`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/deltalake/TestHiveAndDeltaLakeRedirect.java` ->
  `TestHiveAndDeltaLakeRedirect.testDeltaToUnpartitionedHivePartitionsRedirectFailure`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveDeltaLakeMinioEnvironment`. Routed by source review into
  `SuiteDeltaLakeOss` run 3.
- Tag parity: Current tags: `DeltaLakeOss`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: none. Legacy setup operations: none.
- Action parity: Current action verbs: `SELECT`. Legacy action verbs: `SELECT`.
- Assertion parity: Current assertion helpers: `assertThatThrownBy`, `hasMessageContaining`. Legacy assertion helpers:
  `assertQueryFailure`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: Normalized body similarity is low (`0.47`), so fidelity was judged from
  SQL/helper/assertion shape instead of raw text. Assertion helper names differ between legacy and current
  implementations. Current method uses parameter-injected environment helpers instead of Tempto query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`
- Reviewer note: Matched by current suite selection: `SuiteDeltaLakeOss` run 3 Exact-name mapping with normalized body
  similarity `0.47`.
- Audit status: `verified`

##### `testDeltaToHiveInsert`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/deltalake/TestHiveAndDeltaLakeRedirect.java` ->
  `testDeltaToHiveInsert`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/deltalake/TestHiveAndDeltaLakeRedirect.java` ->
  `TestHiveAndDeltaLakeRedirect.testDeltaToHiveInsert`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveDeltaLakeMinioEnvironment`. Routed by source review into
  `SuiteDeltaLakeOss` run 3.
- Tag parity: Current tags: `DeltaLakeOss`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `INSERT`. Legacy setup operations: `INSERT`.
- Action parity: Current action verbs: `SELECT`. Legacy action verbs: `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `containsOnly`, `row`. Legacy assertion helpers:
  `assertThat`, `containsOnly`, `row`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: Current method uses parameter-injected environment helpers instead of Tempto
  query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`
- Reviewer note: Matched by current suite selection: `SuiteDeltaLakeOss` run 3 Exact-name mapping with normalized body
  similarity `0.88`.
- Audit status: `verified`

##### `testHiveToDeltaInsert`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/deltalake/TestHiveAndDeltaLakeRedirect.java` ->
  `testHiveToDeltaInsert`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/deltalake/TestHiveAndDeltaLakeRedirect.java` ->
  `TestHiveAndDeltaLakeRedirect.testHiveToDeltaInsert`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveDeltaLakeMinioEnvironment`. Routed by source review into
  `SuiteDeltaLakeOss` run 3.
- Tag parity: Current tags: `DeltaLakeOss`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `INSERT`. Legacy setup operations: `INSERT`.
- Action parity: Current action verbs: `SELECT`. Legacy action verbs: `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `containsOnly`, `row`. Legacy assertion helpers:
  `assertThat`, `containsOnly`, `row`.
- Cleanup parity: Current cleanup operations: `DROP`. No legacy cleanup method body was available.
- Any observed difference, however small: SQL verb set differs: legacy ['INSERT', 'SELECT'] vs
  current ['INSERT', 'SELECT', 'DROP']. Current method uses parameter-injected environment helpers instead of Tempto
  query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`
- Reviewer note: Matched by current suite selection: `SuiteDeltaLakeOss` run 3 Exact-name mapping with normalized body
  similarity `0.77`.
- Audit status: `verified`

##### `testDeltaToHiveDescribe`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/deltalake/TestHiveAndDeltaLakeRedirect.java` ->
  `testDeltaToHiveDescribe`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/deltalake/TestHiveAndDeltaLakeRedirect.java` ->
  `TestHiveAndDeltaLakeRedirect.testDeltaToHiveDescribe`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveDeltaLakeMinioEnvironment`. Routed by source review into
  `SuiteDeltaLakeOss` run 3.
- Tag parity: Current tags: `DeltaLakeOss`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: none. Legacy setup operations: none.
- Action parity: Current action verbs: `DESCRIBE`. Legacy action verbs: `DESCRIBE`.
- Assertion parity: Current assertion helpers: `assertThat`, `containsOnly`, `row`. Legacy assertion helpers:
  `assertThat`, `containsOnly`, `row`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: Current method uses parameter-injected environment helpers instead of Tempto
  query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`
- Reviewer note: Matched by current suite selection: `SuiteDeltaLakeOss` run 3 Exact-name mapping with normalized body
  similarity `0.89`.
- Audit status: `verified`

##### `testHiveToDeltaDescribe`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/deltalake/TestHiveAndDeltaLakeRedirect.java` ->
  `testHiveToDeltaDescribe`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/deltalake/TestHiveAndDeltaLakeRedirect.java` ->
  `TestHiveAndDeltaLakeRedirect.testHiveToDeltaDescribe`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveDeltaLakeMinioEnvironment`. Routed by source review into
  `SuiteDeltaLakeOss` run 3.
- Tag parity: Current tags: `DeltaLakeOss`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: none. Legacy setup operations: none.
- Action parity: Current action verbs: `DESCRIBE`. Legacy action verbs: `DESCRIBE`.
- Assertion parity: Current assertion helpers: `assertThat`, `containsOnly`, `row`. Legacy assertion helpers:
  `assertThat`, `containsOnly`, `row`.
- Cleanup parity: Current cleanup operations: `DROP`. No legacy cleanup method body was available.
- Any observed difference, however small: SQL verb set differs: legacy ['DESCRIBE'] vs current ['DESCRIBE', 'DROP'].
  Current method uses parameter-injected environment helpers instead of Tempto query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`
- Reviewer note: Matched by current suite selection: `SuiteDeltaLakeOss` run 3 Exact-name mapping with normalized body
  similarity `0.81`.
- Audit status: `verified`

##### `testDeltaToHiveShowCreateTable`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/deltalake/TestHiveAndDeltaLakeRedirect.java` ->
  `testDeltaToHiveShowCreateTable`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/deltalake/TestHiveAndDeltaLakeRedirect.java` ->
  `TestHiveAndDeltaLakeRedirect.testDeltaToHiveShowCreateTable`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveDeltaLakeMinioEnvironment`. Routed by source review into
  `SuiteDeltaLakeOss` run 3.
- Tag parity: Current tags: `DeltaLakeOss`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: none. Legacy setup operations: none.
- Action parity: Current action verbs: `SHOW`. Legacy action verbs: `SHOW`.
- Assertion parity: Current assertion helpers: `assertThat`. Legacy assertion helpers: `assertThat`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: Current method uses parameter-injected environment helpers instead of Tempto
  query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`
- Reviewer note: Matched by current suite selection: `SuiteDeltaLakeOss` run 3 Exact-name mapping with normalized body
  similarity `0.71`.
- Audit status: `verified`

##### `testHiveToDeltaShowCreateTable`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/deltalake/TestHiveAndDeltaLakeRedirect.java` ->
  `testHiveToDeltaShowCreateTable`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/deltalake/TestHiveAndDeltaLakeRedirect.java` ->
  `TestHiveAndDeltaLakeRedirect.testHiveToDeltaShowCreateTable`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveDeltaLakeMinioEnvironment`. Routed by source review into
  `SuiteDeltaLakeOss` run 3.
- Tag parity: Current tags: `DeltaLakeOss`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: none. Legacy setup operations: none.
- Action parity: Current action verbs: `SHOW`. Legacy action verbs: `SHOW`.
- Assertion parity: Current assertion helpers: `assertThat`. Legacy assertion helpers: `assertThat`.
- Cleanup parity: Current cleanup operations: `DROP`. No legacy cleanup method body was available.
- Any observed difference, however small: SQL verb set differs: legacy ['SHOW'] vs current ['SHOW', 'DROP']. Current
  method uses parameter-injected environment helpers instead of Tempto query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`
- Reviewer note: Matched by current suite selection: `SuiteDeltaLakeOss` run 3 Exact-name mapping with normalized body
  similarity `0.63`.
- Audit status: `verified`

##### `testDeltaToHiveAlterTable`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/deltalake/TestHiveAndDeltaLakeRedirect.java` ->
  `testDeltaToHiveAlterTable`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/deltalake/TestHiveAndDeltaLakeRedirect.java` ->
  `TestHiveAndDeltaLakeRedirect.testDeltaToHiveAlterTable`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveDeltaLakeMinioEnvironment`. Routed by source review into
  `SuiteDeltaLakeOss` run 3.
- Tag parity: Current tags: `DeltaLakeOss`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `ALTER`. Legacy setup operations: `ALTER`.
- Action parity: Current action verbs: none. Legacy action verbs: none.
- Assertion parity: Current assertion helpers: `assertResultsEqual`. Legacy assertion helpers: `assertResultsEqual`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: Current method uses parameter-injected environment helpers instead of Tempto
  query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`
- Reviewer note: Matched by current suite selection: `SuiteDeltaLakeOss` run 3 Exact-name mapping with normalized body
  similarity `0.67`.
- Audit status: `verified`

##### `testHiveToDeltaAlterTable`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/deltalake/TestHiveAndDeltaLakeRedirect.java` ->
  `testHiveToDeltaAlterTable`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/deltalake/TestHiveAndDeltaLakeRedirect.java` ->
  `TestHiveAndDeltaLakeRedirect.testHiveToDeltaAlterTable`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveDeltaLakeMinioEnvironment`. Routed by source review into
  `SuiteDeltaLakeOss` run 3.
- Tag parity: Current tags: `DeltaLakeOss`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `ALTER`. Legacy setup operations: `ALTER`.
- Action parity: Current action verbs: none. Legacy action verbs: none.
- Assertion parity: Current assertion helpers: none. No legacy assertion method body was available.
- Cleanup parity: Current cleanup operations: `DROP`. No legacy cleanup method body was available.
- Any observed difference, however small: Normalized body similarity is low (`0.52`), so fidelity was judged from
  SQL/helper/assertion shape instead of raw text. SQL verb set differs: legacy ['ALTER'] vs current ['ALTER', 'DROP'].
  Current method uses parameter-injected environment helpers instead of Tempto query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`
- Reviewer note: Matched by current suite selection: `SuiteDeltaLakeOss` run 3 Exact-name mapping with normalized body
  similarity `0.52`.
- Audit status: `verified`

##### `testDeltaToHiveCommentTable`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/deltalake/TestHiveAndDeltaLakeRedirect.java` ->
  `testDeltaToHiveCommentTable`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/deltalake/TestHiveAndDeltaLakeRedirect.java` ->
  `TestHiveAndDeltaLakeRedirect.testDeltaToHiveCommentTable`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveDeltaLakeMinioEnvironment`. Routed by source review into
  `SuiteDeltaLakeOss` run 3.
- Tag parity: Current tags: `DeltaLakeOss`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: none. Legacy setup operations: none.
- Action parity: Current action verbs: none. Legacy action verbs: `SELECT`.
- Assertion parity: Current assertion helpers: `assertTableComment`, `isEqualTo`. Legacy assertion helpers:
  `assertTableComment`, `assertThat`, `isEqualTo`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: Normalized body similarity is low (`0.52`), so fidelity was judged from
  SQL/helper/assertion shape instead of raw text. SQL verb set differs: legacy ['SELECT', 'DROP'] vs current ['DROP'].
  Assertion helper names differ between legacy and current implementations. Current method uses parameter-injected
  environment helpers instead of Tempto query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`
- Reviewer note: Matched by current suite selection: `SuiteDeltaLakeOss` run 3 Exact-name mapping with normalized body
  similarity `0.52`.
- Audit status: `verified`

##### `testHiveToDeltaCommentTable`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/deltalake/TestHiveAndDeltaLakeRedirect.java` ->
  `testHiveToDeltaCommentTable`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/deltalake/TestHiveAndDeltaLakeRedirect.java` ->
  `TestHiveAndDeltaLakeRedirect.testHiveToDeltaCommentTable`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveDeltaLakeMinioEnvironment`. Routed by source review into
  `SuiteDeltaLakeOss` run 3.
- Tag parity: Current tags: `DeltaLakeOss`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: none. Legacy setup operations: none.
- Action parity: Current action verbs: none. Legacy action verbs: `SELECT`.
- Assertion parity: Current assertion helpers: `assertTableComment`, `isEqualTo`. Legacy assertion helpers:
  `assertTableComment`, `assertThat`, `isEqualTo`.
- Cleanup parity: Current cleanup operations: `DROP`. No legacy cleanup method body was available.
- Any observed difference, however small: Normalized body similarity is low (`0.50`), so fidelity was judged from
  SQL/helper/assertion shape instead of raw text. SQL verb set differs: legacy ['SELECT'] vs current ['DROP']. Assertion
  helper names differ between legacy and current implementations. Current method uses parameter-injected environment
  helpers instead of Tempto query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`
- Reviewer note: Matched by current suite selection: `SuiteDeltaLakeOss` run 3 Exact-name mapping with normalized body
  similarity `0.50`.
- Audit status: `verified`

##### `testDeltaToHiveCommentColumn`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/deltalake/TestHiveAndDeltaLakeRedirect.java` ->
  `testDeltaToHiveCommentColumn`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/deltalake/TestHiveAndDeltaLakeRedirect.java` ->
  `TestHiveAndDeltaLakeRedirect.testDeltaToHiveCommentColumn`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveDeltaLakeMinioEnvironment`. Routed by source review into
  `SuiteDeltaLakeOss` run 3.
- Tag parity: Current tags: `DeltaLakeOss`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: none. Legacy setup operations: none.
- Action parity: Current action verbs: none. Legacy action verbs: none.
- Assertion parity: Current assertion helpers: `assertColumnComment`, `isEqualTo`. Legacy assertion helpers:
  `assertColumnComment`, `isEqualTo`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: Current method uses parameter-injected environment helpers instead of Tempto
  query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`
- Reviewer note: Matched by current suite selection: `SuiteDeltaLakeOss` run 3 Exact-name mapping with normalized body
  similarity `0.60`.
- Audit status: `verified`

##### `testHiveToDeltaCommentColumn`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/deltalake/TestHiveAndDeltaLakeRedirect.java` ->
  `testHiveToDeltaCommentColumn`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/deltalake/TestHiveAndDeltaLakeRedirect.java` ->
  `TestHiveAndDeltaLakeRedirect.testHiveToDeltaCommentColumn`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveDeltaLakeMinioEnvironment`. Routed by source review into
  `SuiteDeltaLakeOss` run 3.
- Tag parity: Current tags: `DeltaLakeOss`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: none. No legacy setup method body was available.
- Action parity: Current action verbs: none. No legacy action method body was available.
- Assertion parity: Current assertion helpers: `assertColumnComment`, `isEqualTo`. Legacy assertion helpers:
  `assertColumnComment`, `isEqualTo`.
- Cleanup parity: Current cleanup operations: `DROP`. No legacy cleanup method body was available.
- Any observed difference, however small: Current method uses parameter-injected environment helpers instead of Tempto
  query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`
- Reviewer note: Matched by current suite selection: `SuiteDeltaLakeOss` run 3 Exact-name mapping with normalized body
  similarity `0.57`.
- Audit status: `verified`

##### `testInsertIntoDeltaTableFromHiveNonDefaultSchemaRedirect`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/deltalake/TestHiveAndDeltaLakeRedirect.java` ->
  `testInsertIntoDeltaTableFromHiveNonDefaultSchemaRedirect`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/deltalake/TestHiveAndDeltaLakeRedirect.java` ->
  `TestHiveAndDeltaLakeRedirect.testInsertIntoDeltaTableFromHiveNonDefaultSchemaRedirect`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveDeltaLakeMinioEnvironment`. Routed by source review into
  `SuiteDeltaLakeOss` run 3.
- Tag parity: Current tags: `DeltaLakeOss`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`, `INSERT`. Legacy setup operations: `CREATE`, `INSERT`.
- Action parity: Current action verbs: `SELECT`. Legacy action verbs: `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `containsOnly`, `row`. Legacy assertion helpers:
  `assertThat`, `containsOnly`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: Assertion helper names differ between legacy and current implementations.
  Current method uses parameter-injected environment helpers instead of Tempto query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`
- Reviewer note: Matched by current suite selection: `SuiteDeltaLakeOss` run 3 Exact-name mapping with normalized body
  similarity `0.82`.
- Audit status: `verified`

##### `testInformationSchemaColumnsHiveToDeltaRedirect`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/deltalake/TestHiveAndDeltaLakeRedirect.java` ->
  `testInformationSchemaColumnsHiveToDeltaRedirect`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/deltalake/TestHiveAndDeltaLakeRedirect.java` ->
  `TestHiveAndDeltaLakeRedirect.testInformationSchemaColumnsHiveToDeltaRedirect`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveDeltaLakeMinioEnvironment`. Routed by source review into
  `SuiteDeltaLakeOss` run 3.
- Tag parity: Current tags: `DeltaLakeOss`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`. Legacy setup operations: `CREATE`.
- Action parity: Current action verbs: `SELECT`. Legacy action verbs: `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `containsOnly`, `row`. Legacy assertion helpers:
  `assertThat`, `containsOnly`, `row`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: Current method uses parameter-injected environment helpers instead of Tempto
  query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`
- Reviewer note: Matched by current suite selection: `SuiteDeltaLakeOss` run 3 Exact-name mapping with normalized body
  similarity `0.87`.
- Audit status: `verified`

##### `testInformationSchemaColumnsDeltaToHiveRedirect`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/deltalake/TestHiveAndDeltaLakeRedirect.java` ->
  `testInformationSchemaColumnsDeltaToHiveRedirect`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/deltalake/TestHiveAndDeltaLakeRedirect.java` ->
  `TestHiveAndDeltaLakeRedirect.testInformationSchemaColumnsDeltaToHiveRedirect`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveDeltaLakeMinioEnvironment`. Routed by source review into
  `SuiteDeltaLakeOss` run 3.
- Tag parity: Current tags: `DeltaLakeOss`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`. Legacy setup operations: `CREATE`.
- Action parity: Current action verbs: `SELECT`. Legacy action verbs: `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `containsOnly`, `row`. Legacy assertion helpers:
  `assertThat`, `containsOnly`, `row`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: Current method uses parameter-injected environment helpers instead of Tempto
  query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`
- Reviewer note: Matched by current suite selection: `SuiteDeltaLakeOss` run 3 Exact-name mapping with normalized body
  similarity `0.93`.
- Audit status: `verified`

##### `testSystemJdbcColumnsHiveToDeltaRedirect`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/deltalake/TestHiveAndDeltaLakeRedirect.java` ->
  `testSystemJdbcColumnsHiveToDeltaRedirect`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/deltalake/TestHiveAndDeltaLakeRedirect.java` ->
  `TestHiveAndDeltaLakeRedirect.testSystemJdbcColumnsHiveToDeltaRedirect`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveDeltaLakeMinioEnvironment`. Routed by source review into
  `SuiteDeltaLakeOss` run 3.
- Tag parity: Current tags: `DeltaLakeOss`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`. Legacy setup operations: `CREATE`.
- Action parity: Current action verbs: `SELECT`. Legacy action verbs: `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `containsOnly`, `row`. Legacy assertion helpers:
  `assertThat`, `containsOnly`, `row`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: Current method uses parameter-injected environment helpers instead of Tempto
  query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`
- Reviewer note: Matched by current suite selection: `SuiteDeltaLakeOss` run 3 Exact-name mapping with normalized body
  similarity `0.87`.
- Audit status: `verified`

##### `testSystemJdbcColumnsDeltaToHiveRedirect`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/deltalake/TestHiveAndDeltaLakeRedirect.java` ->
  `testSystemJdbcColumnsDeltaToHiveRedirect`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/deltalake/TestHiveAndDeltaLakeRedirect.java` ->
  `TestHiveAndDeltaLakeRedirect.testSystemJdbcColumnsDeltaToHiveRedirect`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveDeltaLakeMinioEnvironment`. Routed by source review into
  `SuiteDeltaLakeOss` run 3.
- Tag parity: Current tags: `DeltaLakeOss`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`. Legacy setup operations: `CREATE`.
- Action parity: Current action verbs: `SELECT`. Legacy action verbs: `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `containsOnly`, `row`. Legacy assertion helpers:
  `assertThat`, `containsOnly`, `row`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: Current method uses parameter-injected environment helpers instead of Tempto
  query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`
- Reviewer note: Matched by current suite selection: `SuiteDeltaLakeOss` run 3 Exact-name mapping with normalized body
  similarity `0.89`.
- Audit status: `verified`

##### `testViewReferencingHiveAndDeltaTable`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/deltalake/TestHiveAndDeltaLakeRedirect.java` ->
  `testViewReferencingHiveAndDeltaTable`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/deltalake/TestHiveAndDeltaLakeRedirect.java` ->
  `TestHiveAndDeltaLakeRedirect.testViewReferencingHiveAndDeltaTable`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveDeltaLakeMinioEnvironment`. Routed by source review into
  `SuiteDeltaLakeOss` run 3.
- Tag parity: Current tags: `DeltaLakeOss`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`. Legacy setup operations: `CREATE`.
- Action parity: Current action verbs: `SELECT`, `WITH`. Legacy action verbs: `SELECT`, `WITH`.
- Assertion parity: Current assertion helpers: `assertThat`, `assertThatThrownBy`, `containsOnly`, `row`. Legacy
  assertion helpers: `assertQueryFailure`, `assertThat`, `containsOnly`, `row`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: Assertion helper names differ between legacy and current implementations.
  Current method uses parameter-injected environment helpers instead of Tempto query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`
- Reviewer note: Matched by current suite selection: `SuiteDeltaLakeOss` run 3 Exact-name mapping with normalized body
  similarity `0.85`.
- Audit status: `verified`

##### `testHiveToDeltaPropertiesRedirect`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/deltalake/TestHiveAndDeltaLakeRedirect.java` ->
  `testHiveToDeltaPropertiesRedirect`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/deltalake/TestHiveAndDeltaLakeRedirect.java` ->
  `TestHiveAndDeltaLakeRedirect.testHiveToDeltaPropertiesRedirect`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveDeltaLakeMinioEnvironment`. Routed by source review into
  `SuiteDeltaLakeOss` run 3.
- Tag parity: Current tags: `DeltaLakeOss`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`. Legacy setup operations: `CREATE`.
- Action parity: Current action verbs: `SELECT`. Legacy action verbs: `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `containsOnly`, `row`. Legacy assertion helpers:
  `assertThat`, `containsOnly`, `row`.
- Cleanup parity: Current cleanup operations: `DROP`. No legacy cleanup method body was available.
- Any observed difference, however small: SQL verb set differs: legacy ['CREATE', 'SELECT'] vs
  current ['CREATE', 'SELECT', 'DROP']. Current method uses parameter-injected environment helpers instead of Tempto
  query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`
- Reviewer note: Matched by current suite selection: `SuiteDeltaLakeOss` run 3 Exact-name mapping with normalized body
  similarity `0.79`.
- Audit status: `verified`

### `BaseTestDeltaLakeMinioReadsJunit`

- Owning migration commit: `Migrate TestDeltaLakeDatabricksMinioReads to JUnit`
- Current class added in same migration commit:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/deltalake/BaseTestDeltaLakeMinioReadsJunit.java`
- Legacy class removed in same migration commit:
  -
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/deltalake/TestDeltaLakeDatabricksMinioReads.java`
- Class-level environment requirement: none.
- Class-level tags: none.
- Method inventory complete: Yes. Legacy methods: `1`. Current methods: `1`.
- Legacy helper/resource dependencies accounted for: Legacy class source reviewed directly.
- Intentional differences summary: `HDP to Hive 3.1 migration`
- Method statuses present: `verified`.

#### Methods

##### `testReadRegionTable`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/deltalake/TestDeltaLakeDatabricksMinioReads.java` ->
  `testReadRegionTable`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/deltalake/BaseTestDeltaLakeMinioReadsJunit.java` ->
  `BaseTestDeltaLakeMinioReadsJunit.testReadRegionTable`
- Mapping type: `direct`
- Environment parity: Current class does not declare a concrete environment requirement. Routed by source review into
  `SuiteDeltaLakeOss` run 1.
- Tag parity: Current tags: `DeltaLakeMinio`, `ProfileSpecificTests`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: none. No legacy setup method body was available.
- Action parity: Current action verbs: `CALL`, `SELECT`. No legacy action method body was available.
- Assertion parity: Current assertion helpers: `assertEventCountEventually`, `assertThat`, `containsOnly`, `row`. Legacy
  assertion helpers: `assertNotificationsCount`.
- Cleanup parity: Current cleanup operations: `DROP`. No legacy cleanup method body was available.
- Any observed difference, however small: Normalized body similarity is low (`0.10`), so fidelity was judged from
  SQL/helper/assertion shape instead of raw text. Assertion helper names differ between legacy and current
  implementations.
- Known intentional difference: `HDP to Hive 3.1 migration`
- Reviewer note: Matched by current suite selection: `SuiteDeltaLakeOss` run 1 Exact-name mapping with normalized body
  similarity `0.10`.
- Audit status: `verified`

### `TestDeltaLakeDatabricksMinioReads`

- Owning migration commit: `Migrate TestDeltaLakeDatabricksMinioReads to JUnit`
- Current class added in same migration commit:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/deltalake/TestDeltaLakeDatabricksMinioReads.java`
- Legacy class removed in same migration commit:
  -
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/deltalake/TestDeltaLakeDatabricksMinioReads.java`
- Class-level environment requirement: `DeltaLakeMinioEnvironment`.
- Class-level tags: none.
- Method inventory complete: Yes. Legacy methods: `1`. Current methods: `0`.
- Legacy helper/resource dependencies accounted for: Legacy class source reviewed directly. Cross-class or merged legacy
  coverage accounted for: `testReadRegionTable` -> covered in shared base
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/deltalake/BaseTestDeltaLakeMinioReadsJunit.java` ->
  `testReadRegionTable`.
- Intentional differences summary: None identified at class scope.
- Method statuses present: .

#### Methods

### `TestDeltaLakeOssDeltaLakeMinioReads`

- Owning migration commit: `Migrate TestDeltaLakeOssDeltaLakeMinioReads to JUnit`
- Current class added in same migration commit:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/deltalake/TestDeltaLakeOssDeltaLakeMinioReads.java`
- Legacy class removed in same migration commit:
  -
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/deltalake/TestDeltaLakeOssDeltaLakeMinioReads.java`
- Class-level environment requirement: `DeltaLakeMinioEnvironment`.
- Class-level tags: none.
- Method inventory complete: Yes. Legacy methods: `1`. Current methods: `0`.
- Legacy helper/resource dependencies accounted for: Legacy class source reviewed directly. Cross-class or merged legacy
  coverage accounted for: `testReadRegionTable` -> covered in shared base
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/deltalake/BaseTestDeltaLakeMinioReadsJunit.java` ->
  `testReadRegionTable`.
- Intentional differences summary: None identified at class scope.
- Method statuses present: .

#### Methods

### `BaseTestDeltaLakeHdfsReadsJunit`

- Owning migration commit: `Migrate TestDeltaLakeDatabricksHdfsReads to JUnit`
- Current class added in same migration commit:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/deltalake/BaseTestDeltaLakeHdfsReadsJunit.java`
- Legacy class removed in same migration commit:
    - `testing/trino-product-tests/src/main/java/io/trino/tests/product/deltalake/BaseTestDeltaLakeHdfsReads.java`
- Class-level environment requirement: none.
- Class-level tags: none.
- Method inventory complete: Yes. Legacy methods: `1`. Current methods: `1`.
- Legacy helper/resource dependencies accounted for: Legacy class source reviewed directly.
- Intentional differences summary: `HDP to Hive 3.1 migration`
- Method statuses present: `verified`.

#### Methods

##### `testReads`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/deltalake/BaseTestDeltaLakeHdfsReads.java` ->
  `testReads`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/deltalake/BaseTestDeltaLakeHdfsReadsJunit.java` ->
  `BaseTestDeltaLakeHdfsReadsJunit.testReads`
- Mapping type: `direct`
- Environment parity: Current class does not declare a concrete environment requirement. Routed by source review into
  `SuiteDeltaLakeOss` run 2.
- Tag parity: Current tags: `DeltaLakeHdfs`, `ProfileSpecificTests`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: none. Legacy setup operations: none.
- Action parity: Current action verbs: `CALL`, `SELECT`. Legacy action verbs: `CALL`, `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `containsOnly`, `row`. Legacy assertion helpers:
  `assertThat`, `containsOnly`, `row`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: SQL verb set differs: legacy ['CALL', 'SELECT', 'DROP'] vs
  current ['DROP', 'CALL', 'SELECT'].
- Known intentional difference: `HDP to Hive 3.1 migration`
- Reviewer note: Matched by current suite selection: `SuiteDeltaLakeOss` run 2 Exact-name mapping with normalized body
  similarity `0.60`.
- Audit status: `verified`

### `TestDeltaLakeDatabricksHdfsReads`

- Owning migration commit: `Migrate TestDeltaLakeDatabricksHdfsReads to JUnit`
- Current class added in same migration commit:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/deltalake/TestDeltaLakeDatabricksHdfsReads.java`
- Legacy class removed in same migration commit:
    - `testing/trino-product-tests/src/main/java/io/trino/tests/product/deltalake/TestDeltaLakeDatabricksHdfsReads.java`
- Class-level environment requirement: `DeltaLakeOssEnvironment`.
- Class-level tags: none.
- Method inventory complete: Yes. Legacy methods: `0`. Current methods: `0`.
- Legacy helper/resource dependencies accounted for: Legacy class source reviewed directly.
- Intentional differences summary: None identified at class scope.
- Method statuses present: .

#### Methods

### `TestDeltaLakeOssDeltaLakeHdfsReads`

- Owning migration commit: `Migrate TestDeltaLakeOssDeltaLakeHdfsReads to JUnit`
- Current class added in same migration commit:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/deltalake/TestDeltaLakeOssDeltaLakeHdfsReads.java`
- Legacy class removed in same migration commit:
  -
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/deltalake/TestDeltaLakeOssDeltaLakeHdfsReads.java`
- Class-level environment requirement: `DeltaLakeOssEnvironment`.
- Class-level tags: none.
- Method inventory complete: Yes. Legacy methods: `0`. Current methods: `0`.
- Legacy helper/resource dependencies accounted for: Legacy class source reviewed directly.
- Intentional differences summary: None identified at class scope.
- Method statuses present: .

#### Methods

### `TestDeltaLakeAlluxioCaching`

- Owning migration commit: `Migrate TestDeltaLakeAlluxioCaching to JUnit`
- Current class added in same migration commit:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/deltalake/TestDeltaLakeAlluxioCaching.java`
- Legacy class removed in same migration commit:
    - `testing/trino-product-tests/src/main/java/io/trino/tests/product/deltalake/TestDeltaLakeAlluxioCaching.java`
- Class-level environment requirement: `DeltaLakeMinioCachingEnvironment`.
- Class-level tags: `ConfiguredFeatures`, `DeltaLakeAlluxioCaching`, `ProfileSpecificTests`.
- Method inventory complete: Yes. Legacy methods: `1`. Current methods: `1`.
- Legacy helper/resource dependencies accounted for: Legacy class source reviewed directly.
- Intentional differences summary: None identified at class scope.
- Method statuses present: `verified`.

#### Methods

##### `testReadFromCache`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/deltalake/TestDeltaLakeAlluxioCaching.java` ->
  `testReadFromCache`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/deltalake/TestDeltaLakeAlluxioCaching.java` ->
  `TestDeltaLakeAlluxioCaching.testReadFromCache`
- Mapping type: `direct`
- Environment parity: Current class requires `DeltaLakeMinioCachingEnvironment`. Routed by source review into
  `SuiteDeltaLakeOss` run 4.
- Tag parity: Current tags: `ConfiguredFeatures`, `DeltaLakeAlluxioCaching`, `ProfileSpecificTests`. Tag routing matches
  the current suite selection.
- Setup parity: Current setup operations: none. No legacy setup method body was available.
- Action parity: Current action verbs: none. No legacy action method body was available.
- Assertion parity: Current assertion helpers: none. No legacy assertion method body was available.
- Cleanup parity: Current cleanup operations: none. No legacy cleanup method body was available.
- Any observed difference, however small: No method-specific difference identified beyond the documented framework
  baseline.
- Known intentional difference: None.
- Reviewer note: Matched by current suite selection: `SuiteDeltaLakeOss` run 4 Exact-name mapping with normalized body
  similarity `0.76`.
- Audit status: `verified`
