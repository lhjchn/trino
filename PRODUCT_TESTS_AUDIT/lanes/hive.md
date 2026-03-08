# Lane Audit: Hive

## Lane Summary

- Audit status: `completed`
- Section start commit: `Add Hive environments`
- Section end commit: `Remove legacy SuiteHiveTransactional`
- Introduced JUnit suites: `SuiteAuthorization`, `SuiteHdfsImpersonation`, `SuiteHiveAlluxioCaching`, `SuiteHiveBasic`,
  `SuiteHiveKerberos`, `SuiteHiveSpark`, `SuiteHiveStorageFormats`, `SuiteHiveTransactional`, `SuiteHmsOnly`,
  `SuiteStorageFormatsDetailed`, `SuiteTwoHives`.
- Extended existing suites: none.
- Retired legacy suites: `SuiteHmsOnly`, `SuiteStorageFormatsDetailed`, `SuiteHiveTransactional`.
- Environment classes introduced: `DeltaLakeMinioEnvironment`, `DeltaLakeOssEnvironment`, `HiveBasicEnvironment`,
  `HiveHudiRedirectionsEnvironment`, `HiveIcebergRedirectionsEnvironment`, `HiveImpersonationEnvironment`,
  `HiveKerberosEnvironment`, `HiveSparkEnvironment`, `HiveSparkNoStatsFallbackEnvironment`,
  `HiveStorageFormatsEnvironment`, `HiveTransactionalEnvironment`, `HudiEnvironment`, `MultinodeHive4Environment`,
  `MultinodeHiveCachingEnvironment`, `TwoKerberosHivesEnvironment`, `TwoMixedHivesEnvironment`.
- Method status counts: verified `467`, intentional difference `2`, needs follow-up `0`.

## Lane-Level Open Questions / Intentional Differences

- Lane-wide approved difference set: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`.
- Needs-follow-up methods: none currently identified in this source/history pass.

## Ported Test Classes

### `BaseTestAvroSchemaEvolutionJunit`

- Owning migration commit: `Add Hive environments`
- Current class added in same migration commit:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/BaseTestAvroSchemaEvolutionJunit.java`
- Legacy class removed in same migration commit:
    - `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/BaseTestAvroSchemaEvolution.java`
- Class-level environment requirement: none.
- Class-level tags: none.
- Method inventory complete: Yes. Legacy methods: `8`. Current methods: `8`.
- Legacy helper/resource dependencies accounted for: Legacy class source reviewed directly.
- Intentional differences summary: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Method statuses present: `verified`.

#### Methods

##### `testSelectTable`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/BaseTestAvroSchemaEvolution.java` ->
  `testSelectTable`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/BaseTestAvroSchemaEvolutionJunit.java` ->
  `BaseTestAvroSchemaEvolutionJunit.testSelectTable`
- Mapping type: `direct`
- Environment parity: Current class does not declare a concrete environment requirement. No suite run selects this
  method from the current suite definitions.
- Tag parity: Current tags: none. Tag routing needs no suite-level product-test claim.
- Setup parity: Current setup operations: none. Legacy setup operations: none.
- Action parity: Current action verbs: `SELECT`. Legacy action verbs: `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `row`. Legacy assertion helpers: `assertThat`, `row`.
- Cleanup parity: Current cleanup operations: none. No legacy cleanup method body was available.
- Any observed difference, however small: No method-specific difference identified beyond the documented framework
  baseline.
- Known intentional difference: None.
- Reviewer note: Exact-name mapping with normalized body similarity `0.72`.
- Audit status: `verified`

##### `testInsertAfterSchemaEvolution`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/BaseTestAvroSchemaEvolution.java` ->
  `testInsertAfterSchemaEvolution`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/BaseTestAvroSchemaEvolutionJunit.java` ->
  `BaseTestAvroSchemaEvolutionJunit.testInsertAfterSchemaEvolution`
- Mapping type: `direct`
- Environment parity: Current class does not declare a concrete environment requirement. No suite run selects this
  method from the current suite definitions.
- Tag parity: Current tags: none. Tag routing needs no suite-level product-test claim.
- Setup parity: Current setup operations: none. No legacy setup method body was available.
- Action parity: Current action verbs: `SELECT`. No legacy action method body was available.
- Assertion parity: Current assertion helpers: `assertThat`, `assertUnmodified`, `containsOnly`. Legacy assertion
  helpers: `assertThat`, `assertUnmodified`, `containsOnly`.
- Cleanup parity: Current cleanup operations: none. No legacy cleanup method body was available.
- Any observed difference, however small: Normalized body similarity is low (`0.08`), so fidelity was judged from
  SQL/helper/assertion shape instead of raw text.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Exact-name mapping with normalized body similarity `0.08`.
- Audit status: `verified`

##### `testSchemaEvolutionWithIncompatibleType`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/BaseTestAvroSchemaEvolution.java` ->
  `testSchemaEvolutionWithIncompatibleType`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/BaseTestAvroSchemaEvolutionJunit.java` ->
  `BaseTestAvroSchemaEvolutionJunit.testSchemaEvolutionWithIncompatibleType`
- Mapping type: `direct`
- Environment parity: Current class does not declare a concrete environment requirement. No suite run selects this
  method from the current suite definitions.
- Tag parity: Current tags: none. Tag routing needs no suite-level product-test claim.
- Setup parity: Current setup operations: none. No legacy setup method body was available.
- Action parity: Current action verbs: `SHOW`, `SELECT`. No legacy action method body was available.
- Assertion parity: Current assertion helpers: `assertThat`, `assertThatThrownBy`, `assertUnmodified`, `row`. Legacy
  assertion helpers: `assertQueryFailure`, `assertThat`, `assertUnmodified`, `row`.
- Cleanup parity: Current cleanup operations: none. No legacy cleanup method body was available.
- Any observed difference, however small: Assertion helper names differ between legacy and current implementations.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Exact-name mapping with normalized body similarity `0.56`.
- Audit status: `verified`

##### `testSchemaEvolutionWithUrl`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/BaseTestAvroSchemaEvolution.java` ->
  `testSchemaEvolutionWithUrl`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/BaseTestAvroSchemaEvolutionJunit.java` ->
  `BaseTestAvroSchemaEvolutionJunit.testSchemaEvolutionWithUrl`
- Mapping type: `direct`
- Environment parity: Current class does not declare a concrete environment requirement. No suite run selects this
  method from the current suite definitions.
- Tag parity: Current tags: none. Tag routing needs no suite-level product-test claim.
- Setup parity: Current setup operations: none. No legacy setup method body was available.
- Action parity: Current action verbs: `SHOW`, `SELECT`. No legacy action method body was available.
- Assertion parity: Current assertion helpers: `assertThat`, `row`. Legacy assertion helpers: `assertThat`, `row`.
- Cleanup parity: Current cleanup operations: none. No legacy cleanup method body was available.
- Any observed difference, however small: Normalized body similarity is low (`0.47`), so fidelity was judged from
  SQL/helper/assertion shape instead of raw text.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Exact-name mapping with normalized body similarity `0.47`.
- Audit status: `verified`

##### `testSchemaEvolutionWithLiteral`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/BaseTestAvroSchemaEvolution.java` ->
  `testSchemaEvolutionWithLiteral`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/BaseTestAvroSchemaEvolutionJunit.java` ->
  `BaseTestAvroSchemaEvolutionJunit.testSchemaEvolutionWithLiteral`
- Mapping type: `direct`
- Environment parity: Current class does not declare a concrete environment requirement. No suite run selects this
  method from the current suite definitions.
- Tag parity: Current tags: none. Tag routing needs no suite-level product-test claim.
- Setup parity: Current setup operations: none. No legacy setup method body was available.
- Action parity: Current action verbs: `SHOW`, `SELECT`. No legacy action method body was available.
- Assertion parity: Current assertion helpers: `assertThat`, `row`. Legacy assertion helpers: `assertThat`, `row`.
- Cleanup parity: Current cleanup operations: none. No legacy cleanup method body was available.
- Any observed difference, however small: No method-specific difference identified beyond the documented framework
  baseline.
- Known intentional difference: None.
- Reviewer note: Exact-name mapping with normalized body similarity `0.75`.
- Audit status: `verified`

##### `testSchemaWhenUrlIsUnset`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/BaseTestAvroSchemaEvolution.java` ->
  `testSchemaWhenUrlIsUnset`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/BaseTestAvroSchemaEvolutionJunit.java` ->
  `BaseTestAvroSchemaEvolutionJunit.testSchemaWhenUrlIsUnset`
- Mapping type: `direct`
- Environment parity: Current class does not declare a concrete environment requirement. No suite run selects this
  method from the current suite definitions.
- Tag parity: Current tags: none. Tag routing needs no suite-level product-test claim.
- Setup parity: Current setup operations: `ALTER`. Legacy setup operations: `ALTER`.
- Action parity: Current action verbs: `SHOW`, `SELECT`. Legacy action verbs: none.
- Assertion parity: Current assertion helpers: `assertThat`, `row`. Legacy assertion helpers: `assertThat`, `row`.
- Cleanup parity: Current cleanup operations: none. No legacy cleanup method body was available.
- Any observed difference, however small: SQL verb set differs: legacy ['ALTER'] vs current ['SHOW', 'SELECT', 'ALTER'].
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Exact-name mapping with normalized body similarity `0.79`.
- Audit status: `verified`

##### `testSchemaWhenLiteralIsUnset`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/BaseTestAvroSchemaEvolution.java` ->
  `testSchemaWhenLiteralIsUnset`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/BaseTestAvroSchemaEvolutionJunit.java` ->
  `BaseTestAvroSchemaEvolutionJunit.testSchemaWhenLiteralIsUnset`
- Mapping type: `direct`
- Environment parity: Current class does not declare a concrete environment requirement. No suite run selects this
  method from the current suite definitions.
- Tag parity: Current tags: none. Tag routing needs no suite-level product-test claim.
- Setup parity: Current setup operations: `ALTER`. Legacy setup operations: `ALTER`.
- Action parity: Current action verbs: `SHOW`, `SELECT`. Legacy action verbs: none.
- Assertion parity: Current assertion helpers: `assertThat`, `row`. Legacy assertion helpers: `assertThat`, `row`.
- Cleanup parity: Current cleanup operations: none. No legacy cleanup method body was available.
- Any observed difference, however small: SQL verb set differs: legacy ['ALTER'] vs current ['SHOW', 'SELECT', 'ALTER'].
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Exact-name mapping with normalized body similarity `0.79`.
- Audit status: `verified`

##### `testCreateTableLike`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/BaseTestAvroSchemaEvolution.java` ->
  `testCreateTableLike`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/BaseTestAvroSchemaEvolutionJunit.java` ->
  `BaseTestAvroSchemaEvolutionJunit.testCreateTableLike`
- Mapping type: `direct`
- Environment parity: Current class does not declare a concrete environment requirement. No suite run selects this
  method from the current suite definitions.
- Tag parity: Current tags: none. Tag routing needs no suite-level product-test claim.
- Setup parity: Current setup operations: `CREATE`. Legacy setup operations: `CREATE`.
- Action parity: Current action verbs: `SELECT`. Legacy action verbs: `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `row`. Legacy assertion helpers: `assertThat`, `row`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: No method-specific difference identified beyond the documented framework
  baseline.
- Known intentional difference: None.
- Reviewer note: Exact-name mapping with normalized body similarity `0.63`.
- Audit status: `verified`

### `TestTwoHivesJunit`

- Owning migration commit: `Migrate TestTwoHives to JUnit`
- Current class added in same migration commit:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/TestTwoHivesJunit.java`
- Legacy class removed in same migration commit:
    - `testing/trino-product-tests/src/main/java/io/trino/tests/product/TestTwoHives.java`
- Class-level environment requirement: `ProductTestEnvironment`.
- Class-level tags: `ProfileSpecificTests`, `TwoHives`.
- Method inventory complete: Yes. Legacy methods: `2`. Current methods: `2`.
- Legacy helper/resource dependencies accounted for: Legacy class source reviewed directly.
- Intentional differences summary: `Kerberos deployment cleanup without intended coverage change`
- Method statuses present: `verified`.

#### Methods

##### `testCreateTableAsSelectAndAnalyze`

- Legacy source method: `testing/trino-product-tests/src/main/java/io/trino/tests/product/TestTwoHives.java` ->
  `testCreateTableAsSelectAndAnalyze`
- Current target method: `testing/trino-product-tests/src/test/java/io/trino/tests/product/TestTwoHivesJunit.java` ->
  `TestTwoHivesJunit.testCreateTableAsSelectAndAnalyze`
- Mapping type: `direct`
- Environment parity: Current class requires `ProductTestEnvironment`. No suite run selects this method from the current
  suite definitions.
- Tag parity: Current tags: `ProfileSpecificTests`, `TwoHives`. Tag routing needs no suite-level product-test claim.
- Setup parity: Current setup operations: `CREATE`. Legacy setup operations: `CREATE`.
- Action parity: Current action verbs: `SELECT`, `ANALYZE`, `SHOW`. Legacy action verbs: `SELECT`, `ANALYZE`, `SHOW`.
- Assertion parity: Current assertion helpers: `assertEquals`, `assertThat`, `containsOnly`, `row`. Legacy assertion
  helpers: `assertThat`, `containsOnly`, `row`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: Assertion helper names differ between legacy and current implementations.
  Current method uses parameter-injected environment helpers instead of Tempto query executors.
- Known intentional difference: `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Exact-name mapping with normalized body similarity `0.86`.
- Audit status: `verified`

##### `testJoinFromTwoHives`

- Legacy source method: `testing/trino-product-tests/src/main/java/io/trino/tests/product/TestTwoHives.java` ->
  `testJoinFromTwoHives`
- Current target method: `testing/trino-product-tests/src/test/java/io/trino/tests/product/TestTwoHivesJunit.java` ->
  `TestTwoHivesJunit.testJoinFromTwoHives`
- Mapping type: `direct`
- Environment parity: Current class requires `ProductTestEnvironment`. No suite run selects this method from the current
  suite definitions.
- Tag parity: Current tags: `ProfileSpecificTests`, `TwoHives`. Tag routing needs no suite-level product-test claim.
- Setup parity: Current setup operations: `CREATE`. Legacy setup operations: `CREATE`.
- Action parity: Current action verbs: `SELECT`. Legacy action verbs: `SELECT`.
- Assertion parity: Current assertion helpers: `assertEquals`, `assertThat`, `containsOnly`, `row`. Legacy assertion
  helpers: `assertThat`, `containsOnly`, `row`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: Normalized body similarity is low (`0.51`), so fidelity was judged from
  SQL/helper/assertion shape instead of raw text. Assertion helper names differ between legacy and current
  implementations. Current method uses parameter-injected environment helpers instead of Tempto query executors.
- Known intentional difference: `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Exact-name mapping with normalized body similarity `0.51`.
- Audit status: `verified`

### `TestImpersonationJunit`

- Owning migration commit: `Migrate TestImpersonation to JUnit`
- Current class added in same migration commit:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestImpersonationJunit.java`
- Legacy class removed in same migration commit:
    - `testing/trino-product-tests/src/main/java/io/trino/tests/product/TestImpersonation.java`
- Class-level environment requirement: `ProductTestEnvironment`.
- Class-level tags: `ConfiguredFeatures`, `HdfsImpersonation`, `ProfileSpecificTests`.
- Method inventory complete: Yes. Legacy methods: `4`. Current methods: `2`.
- Legacy helper/resource dependencies accounted for: Legacy class source reviewed directly. Cross-class or merged legacy
  coverage accounted for: `testExternalLocationTableCreationSuccess` -> covered in companion class
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestImpersonationNoImpersonationJunit.java`;
  `testHdfsImpersonationDisabled` -> covered in companion class
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestImpersonationNoImpersonationJunit.java`.
- Intentional differences summary: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Method statuses present: `verified`.

#### Methods

##### `testExternalLocationTableCreationFailure`

- Legacy source method: `testing/trino-product-tests/src/main/java/io/trino/tests/product/TestImpersonation.java` ->
  `testExternalLocationTableCreationFailure`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestImpersonationJunit.java` ->
  `TestImpersonationJunit.testExternalLocationTableCreationFailure`
- Mapping type: `direct`
- Environment parity: Current class requires `ProductTestEnvironment`. No suite run selects this method from the current
  suite definitions.
- Tag parity: Current tags: `ConfiguredFeatures`, `HdfsImpersonation`, `ProfileSpecificTests`. Tag routing needs no
  suite-level product-test claim.
- Setup parity: Current setup operations: `CREATE`. Legacy setup operations: `CREATE`.
- Action parity: Current action verbs: none. Legacy action verbs: none.
- Assertion parity: Current assertion helpers: `assertThat`, `assertThatThrownBy`, `isEqualTo`. Legacy assertion
  helpers: `assertQueryFailure`, `assertThat`, `isEqualTo`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: Normalized body similarity is low (`0.50`), so fidelity was judged from
  SQL/helper/assertion shape instead of raw text. Assertion helper names differ between legacy and current
  implementations.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Exact-name mapping with normalized body similarity `0.50`.
- Audit status: `verified`

##### `testHdfsImpersonationEnabled`

- Legacy source method: `testing/trino-product-tests/src/main/java/io/trino/tests/product/TestImpersonation.java` ->
  `testHdfsImpersonationEnabled`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestImpersonationJunit.java` ->
  `TestImpersonationJunit.testHdfsImpersonationEnabled`
- Mapping type: `direct`
- Environment parity: Current class requires `ProductTestEnvironment`. No suite run selects this method from the current
  suite definitions.
- Tag parity: Current tags: `ConfiguredFeatures`, `HdfsImpersonation`, `ProfileSpecificTests`. Tag routing needs no
  suite-level product-test claim.
- Setup parity: Current setup operations: none. No legacy setup method body was available.
- Action parity: Current action verbs: none. No legacy action method body was available.
- Assertion parity: Current assertion helpers: none. No legacy assertion method body was available.
- Cleanup parity: Current cleanup operations: none. No legacy cleanup method body was available.
- Any observed difference, however small: Normalized body similarity is low (`0.46`), so fidelity was judged from
  SQL/helper/assertion shape instead of raw text.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Exact-name mapping with normalized body similarity `0.46`.
- Audit status: `verified`

### `TestImpersonationNoImpersonationJunit`

- Owning migration commit: `Migrate TestImpersonation to JUnit`
- Current class added in same migration commit:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestImpersonationNoImpersonationJunit.java`
- Legacy class removed in same migration commit:
    - `testing/trino-product-tests/src/main/java/io/trino/tests/product/TestImpersonation.java`
- Class-level environment requirement: `HiveBasicEnvironment`.
- Class-level tags: `ConfiguredFeatures`, `HdfsNoImpersonation`, `ProfileSpecificTests`.
- Method inventory complete: Yes. Legacy methods: `4`. Current methods: `2`.
- Legacy helper/resource dependencies accounted for: Legacy class source reviewed directly. Cross-class or merged legacy
  coverage accounted for: `testExternalLocationTableCreationFailure` -> covered in companion class
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestImpersonationJunit.java`;
  `testHdfsImpersonationEnabled` -> covered in companion class
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestImpersonationJunit.java`.
- Intentional differences summary: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Method statuses present: `verified`.

#### Methods

##### `testExternalLocationTableCreationSuccess`

- Legacy source method: `testing/trino-product-tests/src/main/java/io/trino/tests/product/TestImpersonation.java` ->
  `testExternalLocationTableCreationSuccess`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestImpersonationNoImpersonationJunit.java` ->
  `TestImpersonationNoImpersonationJunit.testExternalLocationTableCreationSuccess`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveBasicEnvironment`. Routed by source review into `SuiteHiveBasic` run
    1.
- Tag parity: Current tags: `ConfiguredFeatures`, `HdfsNoImpersonation`, `ProfileSpecificTests`. Tag routing matches the
  current suite selection.
- Setup parity: Current setup operations: `CREATE`. Legacy setup operations: `CREATE`.
- Action parity: Current action verbs: `SELECT`. Legacy action verbs: `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `isEqualTo`. Legacy assertion helpers: `assertThat`,
  `isEqualTo`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: Normalized body similarity is low (`0.30`), so fidelity was judged from
  SQL/helper/assertion shape instead of raw text.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Matched by current suite selection: `SuiteHiveBasic` run 1 Exact-name mapping with normalized body
  similarity `0.30`.
- Audit status: `verified`

##### `testHdfsImpersonationDisabled`

- Legacy source method: `testing/trino-product-tests/src/main/java/io/trino/tests/product/TestImpersonation.java` ->
  `testHdfsImpersonationDisabled`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestImpersonationNoImpersonationJunit.java` ->
  `TestImpersonationNoImpersonationJunit.testHdfsImpersonationDisabled`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveBasicEnvironment`. Routed by source review into `SuiteHiveBasic` run
    1.
- Tag parity: Current tags: `ConfiguredFeatures`, `HdfsNoImpersonation`, `ProfileSpecificTests`. Tag routing matches the
  current suite selection.
- Setup parity: Current setup operations: none. No legacy setup method body was available.
- Action parity: Current action verbs: none. No legacy action method body was available.
- Assertion parity: Current assertion helpers: none. No legacy assertion method body was available.
- Cleanup parity: Current cleanup operations: none. No legacy cleanup method body was available.
- Any observed difference, however small: No method-specific difference identified beyond the documented framework
  baseline.
- Known intentional difference: None.
- Reviewer note: Matched by current suite selection: `SuiteHiveBasic` run 1 Exact-name mapping with normalized body
  similarity `0.56`.
- Audit status: `verified`

### `TestAllDatatypesFromHiveConnector`

- Owning migration commit: `Migrate TestAllDatatypesFromHiveConnector to JUnit`
- Current class added in same migration commit:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestAllDatatypesFromHiveConnector.java`
- Legacy class removed in same migration commit:
    - `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestAllDatatypesFromHiveConnector.java`
- Class-level environment requirement: `HiveStorageFormatsEnvironment`.
- Class-level tags: `StorageFormats`.
- Method inventory complete: Yes. Legacy methods: `5`. Current methods: `5`.
- Legacy helper/resource dependencies accounted for: Legacy class source reviewed directly.
- Intentional differences summary: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Method statuses present: `verified`.

#### Methods

##### `testSelectAllDatatypesTextFile`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestAllDatatypesFromHiveConnector.java` ->
  `testSelectAllDatatypesTextFile`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestAllDatatypesFromHiveConnector.java` ->
  `TestAllDatatypesFromHiveConnector.testSelectAllDatatypesTextFile`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveStorageFormatsEnvironment`. Routed by source review into
  `SuiteHiveStorageFormats` run 1.
- Tag parity: Current tags: `StorageFormats`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`, `INSERT`. Legacy setup operations: none.
- Action parity: Current action verbs: `SELECT`. Legacy action verbs: `SELECT`.
- Assertion parity: Current assertion helpers: `assertColumnTypes`, `assertProperAllDatatypesSchema`, `assertThat`,
  `containsOnly`, `row`. Legacy assertion helpers: `assertColumnTypes`, `assertProperAllDatatypesSchema`, `assertThat`,
  `containsOnly`, `row`.
- Cleanup parity: Current cleanup operations: `DROP`. No legacy cleanup method body was available.
- Any observed difference, however small: Normalized body similarity is low (`0.45`), so fidelity was judged from
  SQL/helper/assertion shape instead of raw text. SQL verb set differs: legacy ['SELECT'] vs
  current ['CREATE', 'INSERT', 'SELECT', 'DROP']. Current method uses parameter-injected environment helpers instead of
  Tempto query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Matched by current suite selection: `SuiteHiveStorageFormats` run 1 Exact-name mapping with normalized
  body similarity `0.45`.
- Audit status: `verified`

##### `testSelectAllDatatypesOrc`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestAllDatatypesFromHiveConnector.java` ->
  `testSelectAllDatatypesOrc`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestAllDatatypesFromHiveConnector.java` ->
  `TestAllDatatypesFromHiveConnector.testSelectAllDatatypesOrc`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveStorageFormatsEnvironment`. Routed by source review into
  `SuiteHiveStorageFormats` run 1.
- Tag parity: Current tags: `StorageFormats`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`, `INSERT`. Legacy setup operations: none.
- Action parity: Current action verbs: `SELECT`. Legacy action verbs: `SELECT`.
- Assertion parity: Current assertion helpers: `assertColumnTypes`, `assertProperAllDatatypesSchema`, `assertThat`,
  `containsOnly`, `row`. Legacy assertion helpers: `assertColumnTypes`, `assertProperAllDatatypesSchema`, `assertThat`,
  `containsOnly`, `row`.
- Cleanup parity: Current cleanup operations: `DROP`. No legacy cleanup method body was available.
- Any observed difference, however small: Normalized body similarity is low (`0.41`), so fidelity was judged from
  SQL/helper/assertion shape instead of raw text. SQL verb set differs: legacy ['SELECT'] vs
  current ['CREATE', 'INSERT', 'SELECT', 'DROP']. Current method uses parameter-injected environment helpers instead of
  Tempto query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Matched by current suite selection: `SuiteHiveStorageFormats` run 1 Exact-name mapping with normalized
  body similarity `0.41`.
- Audit status: `verified`

##### `testSelectAllDatatypesRcfile`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestAllDatatypesFromHiveConnector.java` ->
  `testSelectAllDatatypesRcfile`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestAllDatatypesFromHiveConnector.java` ->
  `TestAllDatatypesFromHiveConnector.testSelectAllDatatypesRcfile`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveStorageFormatsEnvironment`. Routed by source review into
  `SuiteHiveStorageFormats` run 1.
- Tag parity: Current tags: `StorageFormats`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`, `INSERT`. Legacy setup operations: none.
- Action parity: Current action verbs: `SELECT`. Legacy action verbs: `SELECT`.
- Assertion parity: Current assertion helpers: `assertColumnTypes`, `assertProperAllDatatypesSchema`, `assertThat`,
  `containsOnly`, `row`. Legacy assertion helpers: `assertColumnTypes`, `assertProperAllDatatypesSchema`, `assertThat`,
  `containsOnly`, `row`.
- Cleanup parity: Current cleanup operations: `DROP`. No legacy cleanup method body was available.
- Any observed difference, however small: Normalized body similarity is low (`0.41`), so fidelity was judged from
  SQL/helper/assertion shape instead of raw text. SQL verb set differs: legacy ['SELECT'] vs
  current ['CREATE', 'INSERT', 'SELECT', 'DROP']. Current method uses parameter-injected environment helpers instead of
  Tempto query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Matched by current suite selection: `SuiteHiveStorageFormats` run 1 Exact-name mapping with normalized
  body similarity `0.41`.
- Audit status: `verified`

##### `testSelectAllDatatypesAvro`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestAllDatatypesFromHiveConnector.java` ->
  `testSelectAllDatatypesAvro`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestAllDatatypesFromHiveConnector.java` ->
  `TestAllDatatypesFromHiveConnector.testSelectAllDatatypesAvro`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveStorageFormatsEnvironment`. Routed by source review into
  `SuiteHiveStorageFormats` run 1.
- Tag parity: Current tags: `StorageFormats`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`, `INSERT`. Legacy setup operations: `INSERT`.
- Action parity: Current action verbs: `SHOW`, `SELECT`. Legacy action verbs: `SHOW`, `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `containsOnly`, `row`. Legacy assertion helpers:
  `assertThat`, `containsOnly`, `row`.
- Cleanup parity: Current cleanup operations: `DROP`. No legacy cleanup method body was available.
- Any observed difference, however small: SQL verb set differs: legacy ['INSERT', 'SHOW', 'SELECT'] vs
  current ['CREATE', 'INSERT', 'SHOW', 'SELECT', 'DROP']. Current method uses parameter-injected environment helpers
  instead of Tempto query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Matched by current suite selection: `SuiteHiveStorageFormats` run 1 Exact-name mapping with normalized
  body similarity `0.65`.
- Audit status: `verified`

##### `testSelectAllDatatypesParquetFile`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestAllDatatypesFromHiveConnector.java` ->
  `testSelectAllDatatypesParquetFile`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestAllDatatypesFromHiveConnector.java` ->
  `TestAllDatatypesFromHiveConnector.testSelectAllDatatypesParquetFile`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveStorageFormatsEnvironment`. Routed by source review into
  `SuiteHiveStorageFormats` run 1.
- Tag parity: Current tags: `StorageFormats`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`, `INSERT`. Legacy setup operations: `INSERT`.
- Action parity: Current action verbs: `SHOW`, `SELECT`. Legacy action verbs: `SHOW`, `SELECT`.
- Assertion parity: Current assertion helpers: `assertColumnTypesParquet`, `assertThat`, `containsOnly`, `row`. Legacy
  assertion helpers: `assertColumnTypesParquet`, `assertThat`, `containsOnly`, `row`.
- Cleanup parity: Current cleanup operations: `DROP`. No legacy cleanup method body was available.
- Any observed difference, however small: SQL verb set differs: legacy ['INSERT', 'SHOW', 'SELECT'] vs
  current ['CREATE', 'INSERT', 'SHOW', 'SELECT', 'DROP']. Current method uses parameter-injected environment helpers
  instead of Tempto query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Matched by current suite selection: `SuiteHiveStorageFormats` run 1 Exact-name mapping with normalized
  body similarity `0.70`.
- Audit status: `verified`

### `TestAvroSchemaLiteral`

- Owning migration commit: `Migrate TestAvroSchemaLiteral to JUnit`
- Current class added in same migration commit:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestAvroSchemaLiteral.java`
- Legacy class removed in same migration commit:
    - `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestAvroSchemaLiteral.java`
- Class-level environment requirement: `HiveStorageFormatsEnvironment`.
- Class-level tags: `StorageFormats`.
- Method inventory complete: Yes. Legacy methods: `2`. Current methods: `2`.
- Legacy helper/resource dependencies accounted for: Legacy class source reviewed directly.
- Intentional differences summary: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Method statuses present: `verified`.

#### Methods

##### `testHiveCreatedTable`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestAvroSchemaLiteral.java` ->
  `testHiveCreatedTable`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestAvroSchemaLiteral.java` ->
  `TestAvroSchemaLiteral.testHiveCreatedTable`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveStorageFormatsEnvironment`. Routed by source review into
  `SuiteHiveStorageFormats` run 1.
- Tag parity: Current tags: `StorageFormats`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`, `INSERT`. Legacy setup operations: `CREATE`, `INSERT`.
- Action parity: Current action verbs: `SELECT`. Legacy action verbs: `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `row`. Legacy assertion helpers: `assertThat`, `row`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: Current method uses parameter-injected environment helpers instead of Tempto
  query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Matched by current suite selection: `SuiteHiveStorageFormats` run 1 Exact-name mapping with normalized
  body similarity `0.83`.
- Audit status: `verified`

##### `testTrinoCreatedTable`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestAvroSchemaLiteral.java` ->
  `testTrinoCreatedTable`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestAvroSchemaLiteral.java` ->
  `TestAvroSchemaLiteral.testTrinoCreatedTable`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveStorageFormatsEnvironment`. Routed by source review into
  `SuiteHiveStorageFormats` run 1.
- Tag parity: Current tags: `StorageFormats`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`, `INSERT`. Legacy setup operations: `CREATE`, `INSERT`.
- Action parity: Current action verbs: `SELECT`. Legacy action verbs: `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `row`. Legacy assertion helpers: `assertThat`, `row`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: Current method uses parameter-injected environment helpers instead of Tempto
  query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Matched by current suite selection: `SuiteHiveStorageFormats` run 1 Exact-name mapping with normalized
  body similarity `0.73`.
- Audit status: `verified`

### `TestAvroSchemaStrictness`

- Owning migration commit: `Migrate TestAvroSchemaStrictness to JUnit`
- Current class added in same migration commit:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestAvroSchemaStrictness.java`
- Legacy class removed in same migration commit:
    - `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestAvroSchemaStrictness.java`
- Class-level environment requirement: `HiveStorageFormatsEnvironment`.
- Class-level tags: `StorageFormats`.
- Method inventory complete: Yes. Legacy methods: `1`. Current methods: `1`.
- Legacy helper/resource dependencies accounted for: Legacy class source reviewed directly.
- Intentional differences summary: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Method statuses present: `verified`.

#### Methods

##### `testInvalidUnionDefaults`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestAvroSchemaStrictness.java` ->
  `testInvalidUnionDefaults`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestAvroSchemaStrictness.java` ->
  `TestAvroSchemaStrictness.testInvalidUnionDefaults`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveStorageFormatsEnvironment`. Routed by source review into
  `SuiteHiveStorageFormats` run 1.
- Tag parity: Current tags: `StorageFormats`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`. Legacy setup operations: `CREATE`.
- Action parity: Current action verbs: `SELECT`. Legacy action verbs: `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `containsOnly`, `row`. Legacy assertion helpers:
  `assertThat`, `containsOnly`, `row`.
- Cleanup parity: Current cleanup operations: `DROP`. No legacy cleanup method body was available.
- Any observed difference, however small: SQL verb set differs: legacy ['CREATE', 'SELECT'] vs
  current ['CREATE', 'SELECT', 'DROP']. Current method uses parameter-injected environment helpers instead of Tempto
  query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Matched by current suite selection: `SuiteHiveStorageFormats` run 1 Exact-name mapping with normalized
  body similarity `0.59`.
- Audit status: `verified`

### `TestAvroSchemaUrl`

- Owning migration commit: `Migrate TestAvroSchemaUrl to JUnit`
- Current class added in same migration commit:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestAvroSchemaUrl.java`
- Legacy class removed in same migration commit:
    - `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestAvroSchemaUrl.java`
- Class-level environment requirement: `HiveStorageFormatsEnvironment`.
- Class-level tags: `StorageFormats`.
- Method inventory complete: Yes. Legacy methods: `4`. Current methods: `4`.
- Legacy helper/resource dependencies accounted for: Legacy class source reviewed directly.
- Intentional differences summary: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Method statuses present: `verified`.

#### Methods

##### `testHiveCreatedTable`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestAvroSchemaUrl.java` ->
  `testHiveCreatedTable`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestAvroSchemaUrl.java` ->
  `TestAvroSchemaUrl.testHiveCreatedTable`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveStorageFormatsEnvironment`. Routed by source review into
  `SuiteHiveStorageFormats` run 1.
- Tag parity: Current tags: `StorageFormats`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`, `INSERT`. Legacy setup operations: `CREATE`, `INSERT`.
- Action parity: Current action verbs: `SELECT`. Legacy action verbs: `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `row`. Legacy assertion helpers: `assertThat`, `row`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: Current method uses parameter-injected environment helpers instead of Tempto
  query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Matched by current suite selection: `SuiteHiveStorageFormats` run 1 Exact-name mapping with normalized
  body similarity `0.80`.
- Audit status: `verified`

##### `testAvroSchemaUrlInSerdeProperties`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestAvroSchemaUrl.java` ->
  `testAvroSchemaUrlInSerdeProperties`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestAvroSchemaUrl.java` ->
  `TestAvroSchemaUrl.testAvroSchemaUrlInSerdeProperties`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveStorageFormatsEnvironment`. Routed by source review into
  `SuiteHiveStorageFormats` run 1.
- Tag parity: Current tags: `StorageFormats`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`, `ALTER`, `INSERT`. Legacy setup operations: `CREATE`, `ALTER`,
  `INSERT`.
- Action parity: Current action verbs: `WITH`, `SHOW`, `SELECT`. Legacy action verbs: `WITH`, `SHOW`, `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `assertThatThrownBy`, `hasMessageContaining`, `row`. Legacy
  assertion helpers: `assertQueryFailure`, `assertThat`, `hasMessageContaining`, `row`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: Assertion helper names differ between legacy and current implementations.
  Current method uses parameter-injected environment helpers instead of Tempto query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Matched by current suite selection: `SuiteHiveStorageFormats` run 1 Exact-name mapping with normalized
  body similarity `0.74`.
- Audit status: `verified`

##### `testTrinoCreatedTable`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestAvroSchemaUrl.java` ->
  `testTrinoCreatedTable`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestAvroSchemaUrl.java` ->
  `TestAvroSchemaUrl.testTrinoCreatedTable`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveStorageFormatsEnvironment`. Routed by source review into
  `SuiteHiveStorageFormats` run 1.
- Tag parity: Current tags: `StorageFormats`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`, `INSERT`. Legacy setup operations: `CREATE`, `INSERT`.
- Action parity: Current action verbs: `SELECT`. Legacy action verbs: `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `row`. Legacy assertion helpers: `assertThat`, `row`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: Current method uses parameter-injected environment helpers instead of Tempto
  query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Matched by current suite selection: `SuiteHiveStorageFormats` run 1 Exact-name mapping with normalized
  body similarity `0.69`.
- Audit status: `verified`

##### `testTableWithLongColumnType`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestAvroSchemaUrl.java` ->
  `testTableWithLongColumnType`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestAvroSchemaUrl.java` ->
  `TestAvroSchemaUrl.testTableWithLongColumnType`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveStorageFormatsEnvironment`. Routed by source review into
  `SuiteHiveStorageFormats` run 1.
- Tag parity: Current tags: `StorageFormats`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`. Legacy setup operations: `CREATE`.
- Action parity: Current action verbs: `WITH`, `SELECT`. Legacy action verbs: `WITH`, `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `containsOnly`, `row`. Legacy assertion helpers:
  `assertThat`, `containsOnly`, `row`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: Current method uses parameter-injected environment helpers instead of Tempto
  query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Matched by current suite selection: `SuiteHiveStorageFormats` run 1 Exact-name mapping with normalized
  body similarity `0.78`.
- Audit status: `verified`

### `TestAvroSymlinkInputFormat`

- Owning migration commit: `Migrate TestAvroSymlinkInputFormat to JUnit`
- Current class added in same migration commit:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestAvroSymlinkInputFormat.java`
- Legacy class removed in same migration commit:
    - `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestAvroSymlinkInputFormat.java`
- Class-level environment requirement: `HiveStorageFormatsEnvironment`.
- Class-level tags: `StorageFormats`.
- Method inventory complete: Yes. Legacy methods: `3`. Current methods: `3`.
- Legacy helper/resource dependencies accounted for: Legacy class source reviewed directly.
- Intentional differences summary: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Method statuses present: `verified`.

#### Methods

##### `testSymlinkTable`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestAvroSymlinkInputFormat.java` ->
  `testSymlinkTable`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestAvroSymlinkInputFormat.java` ->
  `TestAvroSymlinkInputFormat.testSymlinkTable`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveStorageFormatsEnvironment`. Routed by source review into
  `SuiteHiveStorageFormats` run 1.
- Tag parity: Current tags: `StorageFormats`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`. Legacy setup operations: `CREATE`.
- Action parity: Current action verbs: `WITH`, `SELECT`. Legacy action verbs: `WITH`, `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `row`. Legacy assertion helpers: `assertThat`, `row`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: Current method uses parameter-injected environment helpers instead of Tempto
  query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Matched by current suite selection: `SuiteHiveStorageFormats` run 1 Exact-name mapping with normalized
  body similarity `0.83`.
- Audit status: `verified`

##### `testSymlinkTableWithMultipleParentDirectories`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestAvroSymlinkInputFormat.java` ->
  `testSymlinkTableWithMultipleParentDirectories`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestAvroSymlinkInputFormat.java` ->
  `TestAvroSymlinkInputFormat.testSymlinkTableWithMultipleParentDirectories`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveStorageFormatsEnvironment`. Routed by source review into
  `SuiteHiveStorageFormats` run 1.
- Tag parity: Current tags: `StorageFormats`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`. Legacy setup operations: `CREATE`.
- Action parity: Current action verbs: `WITH`, `SELECT`. Legacy action verbs: `WITH`, `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `row`. Legacy assertion helpers: `assertThat`, `row`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: Current method uses parameter-injected environment helpers instead of Tempto
  query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Matched by current suite selection: `SuiteHiveStorageFormats` run 1 Exact-name mapping with normalized
  body similarity `0.87`.
- Audit status: `verified`

##### `testSymlinkTableWithNestedDirectory`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestAvroSymlinkInputFormat.java` ->
  `testSymlinkTableWithNestedDirectory`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestAvroSymlinkInputFormat.java` ->
  `TestAvroSymlinkInputFormat.testSymlinkTableWithNestedDirectory`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveStorageFormatsEnvironment`. Routed by source review into
  `SuiteHiveStorageFormats` run 1.
- Tag parity: Current tags: `StorageFormats`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`. Legacy setup operations: `CREATE`.
- Action parity: Current action verbs: `WITH`, `SELECT`. Legacy action verbs: `WITH`, `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `row`. Legacy assertion helpers: `assertThat`, `row`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: Current method uses parameter-injected environment helpers instead of Tempto
  query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Matched by current suite selection: `SuiteHiveStorageFormats` run 1 Exact-name mapping with normalized
  body similarity `0.79`.
- Audit status: `verified`

### `TestCreateDropSchema`

- Owning migration commit: `Migrate TestCreateDropSchema to JUnit`
- Current class added in same migration commit:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestCreateDropSchema.java`
- Legacy class removed in same migration commit:
    - `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestCreateDropSchema.java`
- Class-level environment requirement: `HiveBasicEnvironment`.
- Class-level tags: `HdfsNoImpersonation`.
- Method inventory complete: Yes. Legacy methods: `7`. Current methods: `7`.
- Legacy helper/resource dependencies accounted for: Legacy class source reviewed directly.
- Intentional differences summary: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Method statuses present: `verified`.

#### Methods

##### `testCreateDropSchema`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestCreateDropSchema.java` ->
  `testCreateDropSchema`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestCreateDropSchema.java` ->
  `TestCreateDropSchema.testCreateDropSchema`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveBasicEnvironment`. Routed by source review into `SuiteHiveBasic` run
    1.
- Tag parity: Current tags: `HdfsNoImpersonation`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`. Legacy setup operations: `CREATE`.
- Action parity: Current action verbs: none. Legacy action verbs: none.
- Assertion parity: Current assertion helpers: `assertFileExistence`, `assertThatThrownBy`, `hasMessageContaining`.
  Legacy assertion helpers: `assertFileExistence`, `assertQueryFailure`, `hasMessageContaining`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: Assertion helper names differ between legacy and current implementations.
  Current method uses parameter-injected environment helpers instead of Tempto query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Matched by current suite selection: `SuiteHiveBasic` run 1 Exact-name mapping with normalized body
  similarity `0.77`.
- Audit status: `verified`

##### `testDropSchemaFiles`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestCreateDropSchema.java` ->
  `testDropSchemaFiles`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestCreateDropSchema.java` ->
  `TestCreateDropSchema.testDropSchemaFiles`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveBasicEnvironment`. Routed by source review into `SuiteHiveBasic` run
    1.
- Tag parity: Current tags: `HdfsNoImpersonation`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`. Legacy setup operations: `CREATE`.
- Action parity: Current action verbs: none. Legacy action verbs: none.
- Assertion parity: Current assertion helpers: `assertFileExistence`. Legacy assertion helpers: `assertFileExistence`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: Current method uses parameter-injected environment helpers instead of Tempto
  query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Matched by current suite selection: `SuiteHiveBasic` run 1 Exact-name mapping with normalized body
  similarity `0.79`.
- Audit status: `verified`

##### `testDropSchemaFilesWithLocation`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestCreateDropSchema.java` ->
  `testDropSchemaFilesWithLocation`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestCreateDropSchema.java` ->
  `TestCreateDropSchema.testDropSchemaFilesWithLocation`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveBasicEnvironment`. Routed by source review into `SuiteHiveBasic` run
    1.
- Tag parity: Current tags: `HdfsNoImpersonation`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`. Legacy setup operations: `CREATE`.
- Action parity: Current action verbs: none. Legacy action verbs: none.
- Assertion parity: Current assertion helpers: `assertFileExistence`. Legacy assertion helpers: `assertFileExistence`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: Current method uses parameter-injected environment helpers instead of Tempto
  query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Matched by current suite selection: `SuiteHiveBasic` run 1 Exact-name mapping with normalized body
  similarity `0.81`.
- Audit status: `verified`

##### `testDropWithExternalFilesInSubdirectory`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestCreateDropSchema.java` ->
  `testDropWithExternalFilesInSubdirectory`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestCreateDropSchema.java` ->
  `TestCreateDropSchema.testDropWithExternalFilesInSubdirectory`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveBasicEnvironment`. Routed by source review into `SuiteHiveBasic` run
    1.
- Tag parity: Current tags: `HdfsNoImpersonation`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`. Legacy setup operations: `CREATE`.
- Action parity: Current action verbs: none. Legacy action verbs: none.
- Assertion parity: Current assertion helpers: `assertFileExistence`. Legacy assertion helpers: `assertFileExistence`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: Current method uses parameter-injected environment helpers instead of Tempto
  query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Matched by current suite selection: `SuiteHiveBasic` run 1 Exact-name mapping with normalized body
  similarity `0.86`.
- Audit status: `verified`

##### `testDropSchemaFilesWithEmptyExternalSubdir`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestCreateDropSchema.java` ->
  `testDropSchemaFilesWithEmptyExternalSubdir`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestCreateDropSchema.java` ->
  `TestCreateDropSchema.testDropSchemaFilesWithEmptyExternalSubdir`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveBasicEnvironment`. Routed by source review into `SuiteHiveBasic` run
    1.
- Tag parity: Current tags: `HdfsNoImpersonation`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`. Legacy setup operations: `CREATE`.
- Action parity: Current action verbs: none. Legacy action verbs: none.
- Assertion parity: Current assertion helpers: `assertFileExistence`. Legacy assertion helpers: `assertFileExistence`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: Current method uses parameter-injected environment helpers instead of Tempto
  query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Matched by current suite selection: `SuiteHiveBasic` run 1 Exact-name mapping with normalized body
  similarity `0.75`.
- Audit status: `verified`

##### `testDropSchemaFilesTransactions`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestCreateDropSchema.java` ->
  `testDropSchemaFilesTransactions`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestCreateDropSchema.java` ->
  `TestCreateDropSchema.testDropSchemaFilesTransactions`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveBasicEnvironment`. Routed by source review into `SuiteHiveBasic` run
    1.
- Tag parity: Current tags: `HdfsNoImpersonation`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`. Legacy setup operations: `CREATE`.
- Action parity: Current action verbs: none. Legacy action verbs: none.
- Assertion parity: Current assertion helpers: `assertFileExistence`. Legacy assertion helpers: `assertFileExistence`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: Current method uses parameter-injected environment helpers instead of Tempto
  query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Matched by current suite selection: `SuiteHiveBasic` run 1 Exact-name mapping with normalized body
  similarity `0.57`.
- Audit status: `verified`

##### `testDropTransactionsWithExternalFiles`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestCreateDropSchema.java` ->
  `testDropTransactionsWithExternalFiles`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestCreateDropSchema.java` ->
  `TestCreateDropSchema.testDropTransactionsWithExternalFiles`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveBasicEnvironment`. Routed by source review into `SuiteHiveBasic` run
    1.
- Tag parity: Current tags: `HdfsNoImpersonation`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`. Legacy setup operations: `CREATE`.
- Action parity: Current action verbs: none. Legacy action verbs: none.
- Assertion parity: Current assertion helpers: `assertFileExistence`. Legacy assertion helpers: `assertFileExistence`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: Current method uses parameter-injected environment helpers instead of Tempto
  query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Matched by current suite selection: `SuiteHiveBasic` run 1 Exact-name mapping with normalized body
  similarity `0.70`.
- Audit status: `verified`

### `TestCsvFileHiveTable`

- Owning migration commit: `Migrate TestCsvFileHiveTable to JUnit`
- Current class added in same migration commit:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestCsvFileHiveTable.java`
- Legacy class removed in same migration commit:
    - `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestCsvFileHiveTable.java`
- Class-level environment requirement: `HiveBasicEnvironment`.
- Class-level tags: `HdfsNoImpersonation`.
- Method inventory complete: Yes. Legacy methods: `1`. Current methods: `1`.
- Legacy helper/resource dependencies accounted for: Legacy class source reviewed directly.
- Intentional differences summary: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Method statuses present: `verified`.

#### Methods

##### `testCreateCsvFileTableAsSelectSkipHeaderFooter`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestCsvFileHiveTable.java` ->
  `testCreateCsvFileTableAsSelectSkipHeaderFooter`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestCsvFileHiveTable.java` ->
  `TestCsvFileHiveTable.testCreateCsvFileTableAsSelectSkipHeaderFooter`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveBasicEnvironment`. Routed by source review into `SuiteHiveBasic` run
    1.
- Tag parity: Current tags: `HdfsNoImpersonation`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`, `INSERT`. Legacy setup operations: `CREATE`, `INSERT`.
- Action parity: Current action verbs: `WITH`, `SELECT`. Legacy action verbs: `WITH`, `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `assertThatThrownBy`, `containsOnly`, `row`. Legacy
  assertion helpers: `assertThat`, `assertThatThrownBy`, `containsOnly`, `row`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: Current method uses parameter-injected environment helpers instead of Tempto
  query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Matched by current suite selection: `SuiteHiveBasic` run 1 Exact-name mapping with normalized body
  similarity `0.70`.
- Audit status: `verified`

### `TestExternalHiveTable`

- Owning migration commit: `Migrate TestExternalHiveTable to JUnit`
- Current class added in same migration commit:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestExternalHiveTable.java`
- Legacy class removed in same migration commit:
    - `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestExternalHiveTable.java`
- Class-level environment requirement: `HiveBasicEnvironment`.
- Class-level tags: `HdfsNoImpersonation`.
- Method inventory complete: Yes. Legacy methods: `6`. Current methods: `6`.
- Legacy helper/resource dependencies accounted for: Legacy class source reviewed directly.
- Intentional differences summary: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Method statuses present: `verified`.

#### Methods

##### `testShowStatisticsForExternalTable`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestExternalHiveTable.java` ->
  `testShowStatisticsForExternalTable`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestExternalHiveTable.java` ->
  `TestExternalHiveTable.testShowStatisticsForExternalTable`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveBasicEnvironment`. Routed by source review into `SuiteHiveBasic` run
    1.
- Tag parity: Current tags: `HdfsNoImpersonation`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`. Legacy setup operations: `CREATE`.
- Action parity: Current action verbs: `ANALYZE`, `SHOW`, `CALL`. Legacy action verbs: `ANALYZE`, `SHOW`, `CALL`.
- Assertion parity: Current assertion helpers: `assertThat`, `containsOnly`, `row`. Legacy assertion helpers:
  `assertThat`, `containsOnly`, `row`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: Current method uses parameter-injected environment helpers instead of Tempto
  query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Matched by current suite selection: `SuiteHiveBasic` run 1 Exact-name mapping with normalized body
  similarity `0.68`.
- Audit status: `verified`

##### `testAnalyzeExternalTable`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestExternalHiveTable.java` ->
  `testAnalyzeExternalTable`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestExternalHiveTable.java` ->
  `TestExternalHiveTable.testAnalyzeExternalTable`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveBasicEnvironment`. Routed by source review into `SuiteHiveBasic` run
    1.
- Tag parity: Current tags: `HdfsNoImpersonation`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`. Legacy setup operations: `CREATE`.
- Action parity: Current action verbs: `ANALYZE`. Legacy action verbs: `ANALYZE`.
- Assertion parity: Current assertion helpers: `assertThat`, `row`. Legacy assertion helpers: `assertThat`, `row`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: Normalized body similarity is low (`0.39`), so fidelity was judged from
  SQL/helper/assertion shape instead of raw text. Current method uses parameter-injected environment helpers instead of
  Tempto query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Matched by current suite selection: `SuiteHiveBasic` run 1 Exact-name mapping with normalized body
  similarity `0.39`.
- Audit status: `verified`

##### `testInsertIntoExternalTable`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestExternalHiveTable.java` ->
  `testInsertIntoExternalTable`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestExternalHiveTable.java` ->
  `TestExternalHiveTable.testInsertIntoExternalTable`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveBasicEnvironment`. Routed by source review into `SuiteHiveBasic` run
    1.
- Tag parity: Current tags: `HdfsNoImpersonation`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`, `INSERT`. Legacy setup operations: `CREATE`, `INSERT`.
- Action parity: Current action verbs: `SELECT`. Legacy action verbs: `SELECT`.
- Assertion parity: Current assertion helpers: `assertThatThrownBy`, `hasMessageContaining`. Legacy assertion helpers:
  `assertQueryFailure`, `hasMessageContaining`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: Normalized body similarity is low (`0.03`), so fidelity was judged from
  SQL/helper/assertion shape instead of raw text. Assertion helper names differ between legacy and current
  implementations. Current method uses parameter-injected environment helpers instead of Tempto query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Matched by current suite selection: `SuiteHiveBasic` run 1 Exact-name mapping with normalized body
  similarity `0.03`.
- Audit status: `verified`

##### `testDeleteFromExternalTable`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestExternalHiveTable.java` ->
  `testDeleteFromExternalTable`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestExternalHiveTable.java` ->
  `TestExternalHiveTable.testDeleteFromExternalTable`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveBasicEnvironment`. Routed by source review into `SuiteHiveBasic` run
    1.
- Tag parity: Current tags: `HdfsNoImpersonation`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`. Legacy setup operations: `CREATE`.
- Action parity: Current action verbs: none. Legacy action verbs: none.
- Assertion parity: Current assertion helpers: `assertThatThrownBy`, `hasMessageContaining`. Legacy assertion helpers:
  `assertQueryFailure`, `hasMessageContaining`.
- Cleanup parity: Current cleanup operations: `DROP`, `DELETE`. Legacy cleanup operations: `DROP`, `DELETE`.
- Any observed difference, however small: Normalized body similarity is low (`0.33`), so fidelity was judged from
  SQL/helper/assertion shape instead of raw text. Assertion helper names differ between legacy and current
  implementations. Current method uses parameter-injected environment helpers instead of Tempto query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Matched by current suite selection: `SuiteHiveBasic` run 1 Exact-name mapping with normalized body
  similarity `0.33`.
- Audit status: `verified`

##### `testDeleteFromExternalPartitionedTableTable`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestExternalHiveTable.java` ->
  `testDeleteFromExternalPartitionedTableTable`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestExternalHiveTable.java` ->
  `TestExternalHiveTable.testDeleteFromExternalPartitionedTableTable`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveBasicEnvironment`. Routed by source review into `SuiteHiveBasic` run
    1.
- Tag parity: Current tags: `HdfsNoImpersonation`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`. Legacy setup operations: `CREATE`.
- Action parity: Current action verbs: `SELECT`. Legacy action verbs: `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `assertThatThrownBy`, `hasMessageContaining`. Legacy
  assertion helpers: `assertQueryFailure`, `assertThat`, `hasMessageContaining`.
- Cleanup parity: Current cleanup operations: `DROP`, `DELETE`. Legacy cleanup operations: `DROP`, `DELETE`.
- Any observed difference, however small: Normalized body similarity is low (`0.54`), so fidelity was judged from
  SQL/helper/assertion shape instead of raw text. Assertion helper names differ between legacy and current
  implementations. Current method uses parameter-injected environment helpers instead of Tempto query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Matched by current suite selection: `SuiteHiveBasic` run 1 Exact-name mapping with normalized body
  similarity `0.54`.
- Audit status: `verified`

##### `testCreateExternalTableWithInaccessibleSchemaLocation`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestExternalHiveTable.java` ->
  `testCreateExternalTableWithInaccessibleSchemaLocation`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestExternalHiveTable.java` ->
  `TestExternalHiveTable.testCreateExternalTableWithInaccessibleSchemaLocation`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveBasicEnvironment`. Routed by source review into `SuiteHiveBasic` run
    1.
- Tag parity: Current tags: `HdfsNoImpersonation`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`. Legacy setup operations: `CREATE`.
- Action parity: Current action verbs: `SELECT`. Legacy action verbs: none.
- Assertion parity: Current assertion helpers: `assertThat`, `containsOnly`, `row`. No legacy assertion method body was
  available.
- Cleanup parity: Current cleanup operations: `DROP`. No legacy cleanup method body was available.
- Any observed difference, however small: Normalized body similarity is low (`0.37`), so fidelity was judged from
  SQL/helper/assertion shape instead of raw text. SQL verb set differs: legacy ['CREATE'] vs
  current ['CREATE', 'SELECT', 'DROP']. Current method uses parameter-injected environment helpers instead of Tempto
  query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Matched by current suite selection: `SuiteHiveBasic` run 1 Exact-name mapping with normalized body
  similarity `0.37`.
- Audit status: `verified`

### `TestGrantRevoke`

- Owning migration commit: `Migrate TestGrantRevoke to JUnit`
- Current class added in same migration commit:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestGrantRevoke.java`
- Legacy class removed in same migration commit:
    - `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestGrantRevoke.java`
- Class-level environment requirement: `HiveKerberosImpersonationEnvironment`.
- Class-level tags: `Authorization`.
- Method inventory complete: Yes. Legacy methods: `13`. Current methods: `12`.
- Legacy helper/resource dependencies accounted for: Legacy class source reviewed directly. Ignored non-test/helper
  legacy methods: `cleanupRoles`.
- Intentional differences summary: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Method statuses present: `verified`.

#### Methods

##### `testGrantRevoke`

- Legacy source method: `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestGrantRevoke.java` ->
  `testGrantRevoke`
- Current target method: `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestGrantRevoke.java` ->
  `TestGrantRevoke.testGrantRevoke`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveKerberosImpersonationEnvironment`. Routed by source review into
  `SuiteAuthorization` run 1.
- Tag parity: Current tags: `Authorization`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `INSERT`. Legacy setup operations: `INSERT`.
- Action parity: Current action verbs: `SELECT`. Legacy action verbs: `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `assertThatThrownBy`, `hasMessageContaining`, `isEqualTo`.
  Legacy assertion helpers: `assertQueryFailure`, `assertThat`, `hasMessageContaining`.
- Cleanup parity: Current cleanup operations: `DELETE`. Legacy cleanup operations: `DELETE`.
- Any observed difference, however small: Normalized body similarity is low (`0.21`), so fidelity was judged from
  SQL/helper/assertion shape instead of raw text. Assertion helper names differ between legacy and current
  implementations.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Matched by current suite selection: `SuiteAuthorization` run 1 Exact-name mapping with normalized body
  similarity `0.21`.
- Audit status: `verified`

##### `testGrantOptionsOnGrantedPrivilege`

- Legacy source method: `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestGrantRevoke.java` ->
  `testGrantOptionsOnGrantedPrivilege`
- Current target method: `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestGrantRevoke.java` ->
  `TestGrantRevoke.testGrantOptionsOnGrantedPrivilege`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveKerberosImpersonationEnvironment`. Routed by source review into
  `SuiteAuthorization` run 1.
- Tag parity: Current tags: `Authorization`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: none. No legacy setup method body was available.
- Action parity: Current action verbs: none. No legacy action method body was available.
- Assertion parity: Current assertion helpers: `assertThatThrownBy`, `hasMessageContaining`. Legacy assertion helpers:
  `assertQueryFailure`, `hasMessageContaining`.
- Cleanup parity: Current cleanup operations: none. No legacy cleanup method body was available.
- Any observed difference, however small: Normalized body similarity is low (`0.51`), so fidelity was judged from
  SQL/helper/assertion shape instead of raw text. Assertion helper names differ between legacy and current
  implementations.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Matched by current suite selection: `SuiteAuthorization` run 1 Exact-name mapping with normalized body
  similarity `0.51`.
- Audit status: `verified`

##### `testGrantRevokeWithGrantOption`

- Legacy source method: `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestGrantRevoke.java` ->
  `testGrantRevokeWithGrantOption`
- Current target method: `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestGrantRevoke.java` ->
  `TestGrantRevoke.testGrantRevokeWithGrantOption`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveKerberosImpersonationEnvironment`. Routed by source review into
  `SuiteAuthorization` run 1.
- Tag parity: Current tags: `Authorization`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`. Legacy setup operations: `CREATE`.
- Action parity: Current action verbs: `SELECT`. Legacy action verbs: `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `assertThatThrownBy`, `hasMessageContaining`. Legacy
  assertion helpers: `assertQueryFailure`, `assertThat`, `hasMessageContaining`.
- Cleanup parity: Current cleanup operations: none. No legacy cleanup method body was available.
- Any observed difference, however small: Normalized body similarity is low (`0.29`), so fidelity was judged from
  SQL/helper/assertion shape instead of raw text. Assertion helper names differ between legacy and current
  implementations. Current method uses parameter-injected environment helpers instead of Tempto query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Matched by current suite selection: `SuiteAuthorization` run 1 Exact-name mapping with normalized body
  similarity `0.29`.
- Audit status: `verified`

##### `testShowGrants`

- Legacy source method: `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestGrantRevoke.java` ->
  `testShowGrants`
- Current target method: `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestGrantRevoke.java` ->
  `TestGrantRevoke.testShowGrants`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveKerberosImpersonationEnvironment`. Routed by source review into
  `SuiteAuthorization` run 1.
- Tag parity: Current tags: `Authorization`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`, `INSERT`. Legacy setup operations: `CREATE`, `INSERT`.
- Action parity: Current action verbs: `SHOW`, `SELECT`. Legacy action verbs: `SHOW`, `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `containsOnly`, `row`. Legacy assertion helpers:
  `assertThat`, `containsOnly`, `row`.
- Cleanup parity: Current cleanup operations: none. No legacy cleanup method body was available.
- Any observed difference, however small: Current method uses parameter-injected environment helpers instead of Tempto
  query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Matched by current suite selection: `SuiteAuthorization` run 1 Exact-name mapping with normalized body
  similarity `0.61`.
- Audit status: `verified`

##### `testAll`

- Legacy source method: `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestGrantRevoke.java` ->
  `testAll`
- Current target method: `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestGrantRevoke.java` ->
  `TestGrantRevoke.testAll`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveKerberosImpersonationEnvironment`. Routed by source review into
  `SuiteAuthorization` run 1.
- Tag parity: Current tags: `Authorization`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `INSERT`. Legacy setup operations: `INSERT`.
- Action parity: Current action verbs: `SELECT`, `SHOW`. Legacy action verbs: `SELECT`, `SHOW`.
- Assertion parity: Current assertion helpers: `assertAccessDeniedOnAllOperationsOnTable`, `assertThat`, `isEqualTo`.
  Legacy assertion helpers: `assertAccessDeniedOnAllOperationsOnTable`, `assertThat`.
- Cleanup parity: Current cleanup operations: `DELETE`. Legacy cleanup operations: `DELETE`.
- Any observed difference, however small: Normalized body similarity is low (`0.39`), so fidelity was judged from
  SQL/helper/assertion shape instead of raw text. Assertion helper names differ between legacy and current
  implementations.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Matched by current suite selection: `SuiteAuthorization` run 1 Exact-name mapping with normalized body
  similarity `0.39`.
- Audit status: `verified`

##### `testPublic`

- Legacy source method: `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestGrantRevoke.java` ->
  `testPublic`
- Current target method: `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestGrantRevoke.java` ->
  `TestGrantRevoke.testPublic`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveKerberosImpersonationEnvironment`. Routed by source review into
  `SuiteAuthorization` run 1.
- Tag parity: Current tags: `Authorization`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: none. Legacy setup operations: none.
- Action parity: Current action verbs: `SELECT`. Legacy action verbs: `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `assertThatThrownBy`, `hasMessageContaining`. Legacy
  assertion helpers: `assertQueryFailure`, `assertThat`, `hasMessageContaining`.
- Cleanup parity: Current cleanup operations: none. No legacy cleanup method body was available.
- Any observed difference, however small: Normalized body similarity is low (`0.24`), so fidelity was judged from
  SQL/helper/assertion shape instead of raw text. Assertion helper names differ between legacy and current
  implementations.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Matched by current suite selection: `SuiteAuthorization` run 1 Exact-name mapping with normalized body
  similarity `0.24`.
- Audit status: `verified`

##### `testCustomRole`

- Legacy source method: `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestGrantRevoke.java` ->
  `testCustomRole`
- Current target method: `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestGrantRevoke.java` ->
  `TestGrantRevoke.testCustomRole`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveKerberosImpersonationEnvironment`. Routed by source review into
  `SuiteAuthorization` run 1.
- Tag parity: Current tags: `Authorization`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`. Legacy setup operations: `CREATE`.
- Action parity: Current action verbs: `SELECT`. Legacy action verbs: `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `assertThatThrownBy`, `hasMessageContaining`. Legacy
  assertion helpers: `assertQueryFailure`, `assertThat`, `hasMessageContaining`.
- Cleanup parity: Current cleanup operations: none. No legacy cleanup method body was available.
- Any observed difference, however small: Normalized body similarity is low (`0.20`), so fidelity was judged from
  SQL/helper/assertion shape instead of raw text. Assertion helper names differ between legacy and current
  implementations. Current method uses parameter-injected environment helpers instead of Tempto query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Matched by current suite selection: `SuiteAuthorization` run 1 Exact-name mapping with normalized body
  similarity `0.20`.
- Audit status: `verified`

##### `testTransitiveRole`

- Legacy source method: `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestGrantRevoke.java` ->
  `testTransitiveRole`
- Current target method: `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestGrantRevoke.java` ->
  `TestGrantRevoke.testTransitiveRole`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveKerberosImpersonationEnvironment`. Routed by source review into
  `SuiteAuthorization` run 1.
- Tag parity: Current tags: `Authorization`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`. Legacy setup operations: `CREATE`.
- Action parity: Current action verbs: `SELECT`. Legacy action verbs: `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `assertThatThrownBy`, `hasMessageContaining`. Legacy
  assertion helpers: `assertQueryFailure`, `assertThat`, `hasMessageContaining`.
- Cleanup parity: Current cleanup operations: none. No legacy cleanup method body was available.
- Any observed difference, however small: Normalized body similarity is low (`0.22`), so fidelity was judged from
  SQL/helper/assertion shape instead of raw text. Assertion helper names differ between legacy and current
  implementations. Current method uses parameter-injected environment helpers instead of Tempto query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Matched by current suite selection: `SuiteAuthorization` run 1 Exact-name mapping with normalized body
  similarity `0.22`.
- Audit status: `verified`

##### `testDropRoleWithPermissionsGranted`

- Legacy source method: `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestGrantRevoke.java` ->
  `testDropRoleWithPermissionsGranted`
- Current target method: `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestGrantRevoke.java` ->
  `TestGrantRevoke.testDropRoleWithPermissionsGranted`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveKerberosImpersonationEnvironment`. Routed by source review into
  `SuiteAuthorization` run 1.
- Tag parity: Current tags: `Authorization`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`. Legacy setup operations: `CREATE`.
- Action parity: Current action verbs: `SELECT`. Legacy action verbs: `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `assertThatThrownBy`, `hasMessageContaining`. Legacy
  assertion helpers: `assertQueryFailure`, `assertThat`, `hasMessageContaining`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: Normalized body similarity is low (`0.22`), so fidelity was judged from
  SQL/helper/assertion shape instead of raw text. Assertion helper names differ between legacy and current
  implementations. Current method uses parameter-injected environment helpers instead of Tempto query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Matched by current suite selection: `SuiteAuthorization` run 1 Exact-name mapping with normalized body
  similarity `0.22`.
- Audit status: `verified`

##### `testTableOwnerPrivileges`

- Legacy source method: `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestGrantRevoke.java` ->
  `testTableOwnerPrivileges`
- Current target method: `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestGrantRevoke.java` ->
  `TestGrantRevoke.testTableOwnerPrivileges`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveKerberosImpersonationEnvironment`. Routed by source review into
  `SuiteAuthorization` run 1.
- Tag parity: Current tags: `Authorization`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `INSERT`, `UPDATE`. Legacy setup operations: none.
- Action parity: Current action verbs: `SHOW`, `SELECT`. Legacy action verbs: `SHOW`.
- Assertion parity: Current assertion helpers: `assertThat`, `contains`, `row`. Legacy assertion helpers: `assertThat`,
  `containsOnly`.
- Cleanup parity: Current cleanup operations: `DELETE`. No legacy cleanup method body was available.
- Any observed difference, however small: Normalized body similarity is low (`0.22`), so fidelity was judged from
  SQL/helper/assertion shape instead of raw text. SQL verb set differs: legacy ['SHOW'] vs
  current ['SHOW', 'SELECT', 'INSERT', 'UPDATE', 'DELETE']. Assertion helper names differ between legacy and current
  implementations.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Matched by current suite selection: `SuiteAuthorization` run 1 Exact-name mapping with normalized body
  similarity `0.22`.
- Audit status: `verified`

##### `testViewOwnerPrivileges`

- Legacy source method: `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestGrantRevoke.java` ->
  `testViewOwnerPrivileges`
- Current target method: `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestGrantRevoke.java` ->
  `TestGrantRevoke.testViewOwnerPrivileges`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveKerberosImpersonationEnvironment`. Routed by source review into
  `SuiteAuthorization` run 1.
- Tag parity: Current tags: `Authorization`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`, `INSERT`, `UPDATE`. Legacy setup operations: none.
- Action parity: Current action verbs: `SHOW`, `SELECT`. Legacy action verbs: `SELECT`, `SHOW`.
- Assertion parity: Current assertion helpers: `assertThat`, `contains`, `row`. Legacy assertion helpers: `assertThat`,
  `containsOnly`.
- Cleanup parity: Current cleanup operations: `DELETE`, `DROP`. No legacy cleanup method body was available.
- Any observed difference, however small: Normalized body similarity is low (`0.19`), so fidelity was judged from
  SQL/helper/assertion shape instead of raw text. SQL verb set differs: legacy ['SELECT', 'SHOW'] vs
  current ['CREATE', 'SHOW', 'SELECT', 'INSERT', 'UPDATE', 'DELETE', 'DROP']. Assertion helper names differ between
  legacy and current implementations.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Matched by current suite selection: `SuiteAuthorization` run 1 Exact-name mapping with normalized body
  similarity `0.19`.
- Audit status: `verified`

##### `testTablePrivilegesWithHiveOnlyViews`

- Legacy source method: `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestGrantRevoke.java` ->
  `testTablePrivilegesWithHiveOnlyViews`
- Current target method: `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestGrantRevoke.java` ->
  `TestGrantRevoke.testTablePrivilegesWithHiveOnlyViews`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveKerberosImpersonationEnvironment`. Routed by source review into
  `SuiteAuthorization` run 1.
- Tag parity: Current tags: `Authorization`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`. Legacy setup operations: none.
- Action parity: Current action verbs: `SELECT`, `SHOW`. Legacy action verbs: `SELECT`, `SHOW`.
- Assertion parity: Current assertion helpers: `assertThat`, `contains`, `row`. Legacy assertion helpers: `assertThat`,
  `contains`, `row`.
- Cleanup parity: Current cleanup operations: `DROP`. No legacy cleanup method body was available.
- Any observed difference, however small: Normalized body similarity is low (`0.40`), so fidelity was judged from
  SQL/helper/assertion shape instead of raw text. SQL verb set differs: legacy ['SELECT', 'SHOW'] vs
  current ['CREATE', 'SELECT', 'SHOW', 'DROP']. Current method uses parameter-injected environment helpers instead of
  Tempto query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Matched by current suite selection: `SuiteAuthorization` run 1 Exact-name mapping with normalized body
  similarity `0.40`.
- Audit status: `verified`

### `TestHdfsSyncPartitionMetadata`

- Owning migration commit: `Migrate TestHdfsSyncPartitionMetadata to JUnit`
- Current class added in same migration commit:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestHdfsSyncPartitionMetadata.java`
- Legacy class removed in same migration commit:
    - `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestHdfsSyncPartitionMetadata.java`
- Class-level environment requirement: `HiveBasicEnvironment`.
- Class-level tags: `HdfsNoImpersonation`.
- Method inventory complete: Yes. Legacy methods: `10`. Current methods: `10`.
- Legacy helper/resource dependencies accounted for: Legacy class source reviewed directly.
- Intentional differences summary: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Method statuses present: `verified`.

#### Methods

##### `testAddPartition`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestHdfsSyncPartitionMetadata.java` ->
  `testAddPartition`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestHdfsSyncPartitionMetadata.java` ->
  `TestHdfsSyncPartitionMetadata.testAddPartition`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveBasicEnvironment`. Routed by source review into `SuiteHiveBasic` run
    1.
- Tag parity: Current tags: `HdfsNoImpersonation`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: none. No legacy setup method body was available.
- Action parity: Current action verbs: `CALL`, `SELECT`. No legacy action method body was available.
- Assertion parity: Current assertion helpers: `assertPartitions`, `assertThatThrownBy`, `row`. No legacy assertion
  method body was available.
- Cleanup parity: Current cleanup operations: none. No legacy cleanup method body was available.
- Any observed difference, however small: Normalized body similarity is low (`0.08`), so fidelity was judged from
  SQL/helper/assertion shape instead of raw text.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Matched by current suite selection: `SuiteHiveBasic` run 1 Exact-name mapping with normalized body
  similarity `0.08`.
- Audit status: `verified`

##### `testAddPartitionContainingCharactersThatNeedUrlEncoding`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestHdfsSyncPartitionMetadata.java` ->
  `testAddPartitionContainingCharactersThatNeedUrlEncoding`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestHdfsSyncPartitionMetadata.java` ->
  `TestHdfsSyncPartitionMetadata.testAddPartitionContainingCharactersThatNeedUrlEncoding`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveBasicEnvironment`. Routed by source review into `SuiteHiveBasic` run
    1.
- Tag parity: Current tags: `HdfsNoImpersonation`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`, `INSERT`. No legacy setup method body was available.
- Action parity: Current action verbs: `WITH`, `CALL`. No legacy action method body was available.
- Assertion parity: Current assertion helpers: `assertPartitions`, `row`. No legacy assertion method body was available.
- Cleanup parity: Current cleanup operations: `DROP`. No legacy cleanup method body was available.
- Any observed difference, however small: Normalized body similarity is low (`0.06`), so fidelity was judged from
  SQL/helper/assertion shape instead of raw text.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Matched by current suite selection: `SuiteHiveBasic` run 1 Exact-name mapping with normalized body
  similarity `0.06`.
- Audit status: `verified`

##### `testDropPartition`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestHdfsSyncPartitionMetadata.java` ->
  `testDropPartition`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestHdfsSyncPartitionMetadata.java` ->
  `TestHdfsSyncPartitionMetadata.testDropPartition`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveBasicEnvironment`. Routed by source review into `SuiteHiveBasic` run
    1.
- Tag parity: Current tags: `HdfsNoImpersonation`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: none. No legacy setup method body was available.
- Action parity: Current action verbs: `CALL`. No legacy action method body was available.
- Assertion parity: Current assertion helpers: `assertData`, `assertPartitions`, `row`. No legacy assertion method body
  was available.
- Cleanup parity: Current cleanup operations: none. No legacy cleanup method body was available.
- Any observed difference, however small: Normalized body similarity is low (`0.04`), so fidelity was judged from
  SQL/helper/assertion shape instead of raw text.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Matched by current suite selection: `SuiteHiveBasic` run 1 Exact-name mapping with normalized body
  similarity `0.04`.
- Audit status: `verified`

##### `testDropPartitionContainingCharactersThatNeedUrlEncoding`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestHdfsSyncPartitionMetadata.java` ->
  `testDropPartitionContainingCharactersThatNeedUrlEncoding`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestHdfsSyncPartitionMetadata.java` ->
  `TestHdfsSyncPartitionMetadata.testDropPartitionContainingCharactersThatNeedUrlEncoding`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveBasicEnvironment`. Routed by source review into `SuiteHiveBasic` run
    1.
- Tag parity: Current tags: `HdfsNoImpersonation`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`, `INSERT`. No legacy setup method body was available.
- Action parity: Current action verbs: `WITH`, `CALL`. No legacy action method body was available.
- Assertion parity: Current assertion helpers: `assertPartitions`, `row`. No legacy assertion method body was available.
- Cleanup parity: Current cleanup operations: `DROP`, `DELETE`. No legacy cleanup method body was available.
- Any observed difference, however small: Normalized body similarity is low (`0.08`), so fidelity was judged from
  SQL/helper/assertion shape instead of raw text.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Matched by current suite selection: `SuiteHiveBasic` run 1 Exact-name mapping with normalized body
  similarity `0.08`.
- Audit status: `verified`

##### `testFullSyncPartition`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestHdfsSyncPartitionMetadata.java` ->
  `testFullSyncPartition`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestHdfsSyncPartitionMetadata.java` ->
  `TestHdfsSyncPartitionMetadata.testFullSyncPartition`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveBasicEnvironment`. Routed by source review into `SuiteHiveBasic` run
    1.
- Tag parity: Current tags: `HdfsNoImpersonation`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: none. No legacy setup method body was available.
- Action parity: Current action verbs: `CALL`. No legacy action method body was available.
- Assertion parity: Current assertion helpers: `assertData`, `assertPartitions`, `row`. No legacy assertion method body
  was available.
- Cleanup parity: Current cleanup operations: none. No legacy cleanup method body was available.
- Any observed difference, however small: Normalized body similarity is low (`0.16`), so fidelity was judged from
  SQL/helper/assertion shape instead of raw text.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Matched by current suite selection: `SuiteHiveBasic` run 1 Exact-name mapping with normalized body
  similarity `0.16`.
- Audit status: `verified`

##### `testInvalidSyncMode`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestHdfsSyncPartitionMetadata.java` ->
  `testInvalidSyncMode`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestHdfsSyncPartitionMetadata.java` ->
  `TestHdfsSyncPartitionMetadata.testInvalidSyncMode`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveBasicEnvironment`. Routed by source review into `SuiteHiveBasic` run
    1.
- Tag parity: Current tags: `HdfsNoImpersonation`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: none. No legacy setup method body was available.
- Action parity: Current action verbs: `CALL`. No legacy action method body was available.
- Assertion parity: Current assertion helpers: `assertThatThrownBy`. No legacy assertion method body was available.
- Cleanup parity: Current cleanup operations: none. No legacy cleanup method body was available.
- Any observed difference, however small: Normalized body similarity is low (`0.04`), so fidelity was judged from
  SQL/helper/assertion shape instead of raw text.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Matched by current suite selection: `SuiteHiveBasic` run 1 Exact-name mapping with normalized body
  similarity `0.04`.
- Audit status: `verified`

##### `testMixedCasePartitionNames`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestHdfsSyncPartitionMetadata.java` ->
  `testMixedCasePartitionNames`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestHdfsSyncPartitionMetadata.java` ->
  `TestHdfsSyncPartitionMetadata.testMixedCasePartitionNames`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveBasicEnvironment`. Routed by source review into `SuiteHiveBasic` run
    1.
- Tag parity: Current tags: `HdfsNoImpersonation`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: none. No legacy setup method body was available.
- Action parity: Current action verbs: `CALL`. No legacy action method body was available.
- Assertion parity: Current assertion helpers: `assertData`, `assertPartitions`, `row`. No legacy assertion method body
  was available.
- Cleanup parity: Current cleanup operations: none. No legacy cleanup method body was available.
- Any observed difference, however small: Normalized body similarity is low (`0.05`), so fidelity was judged from
  SQL/helper/assertion shape instead of raw text.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Matched by current suite selection: `SuiteHiveBasic` run 1 Exact-name mapping with normalized body
  similarity `0.05`.
- Audit status: `verified`

##### `testConflictingMixedCasePartitionNames`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestHdfsSyncPartitionMetadata.java` ->
  `testConflictingMixedCasePartitionNames`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestHdfsSyncPartitionMetadata.java` ->
  `TestHdfsSyncPartitionMetadata.testConflictingMixedCasePartitionNames`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveBasicEnvironment`. Routed by source review into `SuiteHiveBasic` run
    1.
- Tag parity: Current tags: `HdfsNoImpersonation`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: none. No legacy setup method body was available.
- Action parity: Current action verbs: `CALL`. No legacy action method body was available.
- Assertion parity: Current assertion helpers: `assertPartitions`, `assertThatThrownBy`, `hasMessageContaining`, `row`.
  No legacy assertion method body was available.
- Cleanup parity: Current cleanup operations: none. No legacy cleanup method body was available.
- Any observed difference, however small: Normalized body similarity is low (`0.17`), so fidelity was judged from
  SQL/helper/assertion shape instead of raw text.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Matched by current suite selection: `SuiteHiveBasic` run 1 Exact-name mapping with normalized body
  similarity `0.17`.
- Audit status: `verified`

##### `testSyncPartitionMetadataWithNullArgument`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestHdfsSyncPartitionMetadata.java` ->
  `testSyncPartitionMetadataWithNullArgument`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestHdfsSyncPartitionMetadata.java` ->
  `TestHdfsSyncPartitionMetadata.testSyncPartitionMetadataWithNullArgument`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveBasicEnvironment`. Routed by source review into `SuiteHiveBasic` run
    1.
- Tag parity: Current tags: `HdfsNoImpersonation`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: none. No legacy setup method body was available.
- Action parity: Current action verbs: `CALL`. No legacy action method body was available.
- Assertion parity: Current assertion helpers: `assertThatThrownBy`. No legacy assertion method body was available.
- Cleanup parity: Current cleanup operations: none. No legacy cleanup method body was available.
- Any observed difference, however small: Normalized body similarity is low (`0.05`), so fidelity was judged from
  SQL/helper/assertion shape instead of raw text.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Matched by current suite selection: `SuiteHiveBasic` run 1 Exact-name mapping with normalized body
  similarity `0.05`.
- Audit status: `verified`

##### `testAddNonConventionalHivePartition`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestHdfsSyncPartitionMetadata.java` ->
  `testAddNonConventionalHivePartition`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestHdfsSyncPartitionMetadata.java` ->
  `TestHdfsSyncPartitionMetadata.testAddNonConventionalHivePartition`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveBasicEnvironment`. Routed by source review into `SuiteHiveBasic` run
    1.
- Tag parity: Current tags: `HdfsNoImpersonation`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`, `INSERT`, `ALTER`. Legacy setup operations: `CREATE`, `INSERT`,
  `ALTER`.
- Action parity: Current action verbs: `WITH`, `CALL`. Legacy action verbs: `WITH`, `CALL`.
- Assertion parity: Current assertion helpers: `assertPartitions`, `row`. Legacy assertion helpers: `assertPartitions`,
  `row`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: Current method uses parameter-injected environment helpers instead of Tempto
  query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Matched by current suite selection: `SuiteHiveBasic` run 1 Exact-name mapping with normalized body
  similarity `0.76`.
- Audit status: `verified`

### `TestHiveAlluxioCaching`

- Owning migration commit: `Migrate TestHiveAlluxioCaching to JUnit`
- Current class added in same migration commit:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestHiveAlluxioCaching.java`
- Legacy class removed in same migration commit:
    - `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestHiveAlluxioCaching.java`
- Class-level environment requirement: `MultinodeHiveCachingEnvironment`.
- Class-level tags: `HiveAlluxioCaching`.
- Method inventory complete: Yes. Legacy methods: `1`. Current methods: `1`.
- Legacy helper/resource dependencies accounted for: Legacy class source reviewed directly.
- Intentional differences summary: None identified at class scope.
- Method statuses present: `verified`.

#### Methods

##### `testReadFromCache`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestHiveAlluxioCaching.java` ->
  `testReadFromCache`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestHiveAlluxioCaching.java` ->
  `TestHiveAlluxioCaching.testReadFromCache`
- Mapping type: `direct`
- Environment parity: Current class requires `MultinodeHiveCachingEnvironment`. Routed by source review into
  `SuiteHiveAlluxioCaching` run 1.
- Tag parity: Current tags: `HiveAlluxioCaching`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: none. No legacy setup method body was available.
- Action parity: Current action verbs: none. No legacy action method body was available.
- Assertion parity: Current assertion helpers: none. No legacy assertion method body was available.
- Cleanup parity: Current cleanup operations: none. No legacy cleanup method body was available.
- Any observed difference, however small: No method-specific difference identified beyond the documented framework
  baseline.
- Known intentional difference: None.
- Reviewer note: Matched by current suite selection: `SuiteHiveAlluxioCaching` run 1 Exact-name mapping with normalized
  body similarity `0.77`.
- Audit status: `verified`

### `TestHiveBasicTableStatistics`

- Owning migration commit: `Migrate TestHiveBasicTableStatistics to JUnit`
- Current class added in same migration commit:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestHiveBasicTableStatistics.java`
- Legacy class removed in same migration commit:
    - `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestHiveBasicTableStatistics.java`
- Class-level environment requirement: `HiveBasicEnvironment`.
- Class-level tags: `HdfsNoImpersonation`.
- Method inventory complete: Yes. Legacy methods: `10`. Current methods: `10`.
- Legacy helper/resource dependencies accounted for: Legacy class source reviewed directly.
- Intentional differences summary: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Method statuses present: `verified`.

#### Methods

##### `testCreateUnpartitioned`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestHiveBasicTableStatistics.java` ->
  `testCreateUnpartitioned`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestHiveBasicTableStatistics.java` ->
  `TestHiveBasicTableStatistics.testCreateUnpartitioned`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveBasicEnvironment`. Routed by source review into `SuiteHiveBasic` run
    1.
- Tag parity: Current tags: `HdfsNoImpersonation`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`. Legacy setup operations: `CREATE`.
- Action parity: Current action verbs: none. Legacy action verbs: none.
- Assertion parity: Current assertion helpers: `assertThat`, `assertThatStatisticsAreNonZero`, `isEqualTo`. Legacy
  assertion helpers: `assertThat`, `assertThatStatisticsAreNonZero`, `isEqualTo`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: Current method uses parameter-injected environment helpers instead of Tempto
  query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Matched by current suite selection: `SuiteHiveBasic` run 1 Exact-name mapping with normalized body
  similarity `0.78`.
- Audit status: `verified`

##### `testCreateExternalUnpartitioned`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestHiveBasicTableStatistics.java` ->
  `testCreateExternalUnpartitioned`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestHiveBasicTableStatistics.java` ->
  `TestHiveBasicTableStatistics.testCreateExternalUnpartitioned`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveBasicEnvironment`. Routed by source review into `SuiteHiveBasic` run
    1.
- Tag parity: Current tags: `HdfsNoImpersonation`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`. Legacy setup operations: `CREATE`.
- Action parity: Current action verbs: `WITH`. Legacy action verbs: `WITH`.
- Assertion parity: Current assertion helpers: `assertThatStatisticsAreNotPresent`. Legacy assertion helpers:
  `assertThatStatisticsAreNotPresent`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: Current method uses parameter-injected environment helpers instead of Tempto
  query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Matched by current suite selection: `SuiteHiveBasic` run 1 Exact-name mapping with normalized body
  similarity `0.68`.
- Audit status: `verified`

##### `testCreateTableWithNoData`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestHiveBasicTableStatistics.java` ->
  `testCreateTableWithNoData`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestHiveBasicTableStatistics.java` ->
  `TestHiveBasicTableStatistics.testCreateTableWithNoData`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveBasicEnvironment`. Routed by source review into `SuiteHiveBasic` run
    1.
- Tag parity: Current tags: `HdfsNoImpersonation`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`. Legacy setup operations: `CREATE`.
- Action parity: Current action verbs: none. Legacy action verbs: none.
- Assertion parity: Current assertion helpers: `assertThatStatisticsAreZero`. Legacy assertion helpers:
  `assertThatStatisticsAreZero`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: Current method uses parameter-injected environment helpers instead of Tempto
  query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Matched by current suite selection: `SuiteHiveBasic` run 1 Exact-name mapping with normalized body
  similarity `0.59`.
- Audit status: `verified`

##### `testInsertUnpartitioned`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestHiveBasicTableStatistics.java` ->
  `testInsertUnpartitioned`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestHiveBasicTableStatistics.java` ->
  `TestHiveBasicTableStatistics.testInsertUnpartitioned`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveBasicEnvironment`. Routed by source review into `SuiteHiveBasic` run
    1.
- Tag parity: Current tags: `HdfsNoImpersonation`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`. Legacy setup operations: `CREATE`.
- Action parity: Current action verbs: none. Legacy action verbs: none.
- Assertion parity: Current assertion helpers: `assertThat`, `assertThatStatisticsAreNonZero`,
  `assertThatStatisticsAreZero`, `assertThatStatisticsValuesHaveIncreased`, `isEqualTo`. Legacy assertion helpers:
  `assertThat`, `assertThatStatisticsAreNonZero`, `assertThatStatisticsAreZero`,
  `assertThatStatisticsValuesHaveIncreased`, `isEqualTo`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: Current method uses parameter-injected environment helpers instead of Tempto
  query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Matched by current suite selection: `SuiteHiveBasic` run 1 Exact-name mapping with normalized body
  similarity `0.89`.
- Audit status: `verified`

##### `testCreatePartitioned`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestHiveBasicTableStatistics.java` ->
  `testCreatePartitioned`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestHiveBasicTableStatistics.java` ->
  `TestHiveBasicTableStatistics.testCreatePartitioned`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveBasicEnvironment`. Routed by source review into `SuiteHiveBasic` run
    1.
- Tag parity: Current tags: `HdfsNoImpersonation`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`. Legacy setup operations: `CREATE`.
- Action parity: Current action verbs: `WITH`, `SELECT`. Legacy action verbs: `WITH`, `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `assertThatStatisticsAreNonZero`,
  `assertThatStatisticsAreNotPresent`, `isEqualTo`. Legacy assertion helpers: `assertThat`,
  `assertThatStatisticsAreNonZero`, `assertThatStatisticsAreNotPresent`, `isEqualTo`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: Current method uses parameter-injected environment helpers instead of Tempto
  query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Matched by current suite selection: `SuiteHiveBasic` run 1 Exact-name mapping with normalized body
  similarity `0.82`.
- Audit status: `verified`

##### `testAnalyzePartitioned`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestHiveBasicTableStatistics.java` ->
  `testAnalyzePartitioned`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestHiveBasicTableStatistics.java` ->
  `TestHiveBasicTableStatistics.testAnalyzePartitioned`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveBasicEnvironment`. Routed by source review into `SuiteHiveBasic` run
    1.
- Tag parity: Current tags: `HdfsNoImpersonation`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`. Legacy setup operations: `CREATE`.
- Action parity: Current action verbs: `WITH`, `SELECT`, `ANALYZE`. Legacy action verbs: `WITH`, `SELECT`, `ANALYZE`.
- Assertion parity: Current assertion helpers: `assertThat`, `assertThatStatisticsAreNotPresent`,
  `assertThatStatisticsArePresent`, `isEqualTo`. Legacy assertion helpers: `assertThat`,
  `assertThatStatisticsAreNotPresent`, `assertThatStatisticsArePresent`, `isEqualTo`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: Current method uses parameter-injected environment helpers instead of Tempto
  query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Matched by current suite selection: `SuiteHiveBasic` run 1 Exact-name mapping with normalized body
  similarity `0.91`.
- Audit status: `verified`

##### `testAnalyzeUnpartitioned`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestHiveBasicTableStatistics.java` ->
  `testAnalyzeUnpartitioned`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestHiveBasicTableStatistics.java` ->
  `TestHiveBasicTableStatistics.testAnalyzeUnpartitioned`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveBasicEnvironment`. Routed by source review into `SuiteHiveBasic` run
    1.
- Tag parity: Current tags: `HdfsNoImpersonation`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`. Legacy setup operations: `CREATE`.
- Action parity: Current action verbs: `SELECT`, `ANALYZE`. Legacy action verbs: `SELECT`, `ANALYZE`.
- Assertion parity: Current assertion helpers: `assertThat`, `assertThatStatisticsArePresent`, `isEqualTo`. Legacy
  assertion helpers: `assertThat`, `assertThatStatisticsArePresent`, `isEqualTo`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: Current method uses parameter-injected environment helpers instead of Tempto
  query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Matched by current suite selection: `SuiteHiveBasic` run 1 Exact-name mapping with normalized body
  similarity `0.88`.
- Audit status: `verified`

##### `testInsertPartitioned`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestHiveBasicTableStatistics.java` ->
  `testInsertPartitioned`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestHiveBasicTableStatistics.java` ->
  `TestHiveBasicTableStatistics.testInsertPartitioned`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveBasicEnvironment`. Routed by source review into `SuiteHiveBasic` run
    1.
- Tag parity: Current tags: `HdfsNoImpersonation`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`. Legacy setup operations: `CREATE`.
- Action parity: Current action verbs: `WITH`. Legacy action verbs: `WITH`.
- Assertion parity: Current assertion helpers: `assertThat`, `assertThatStatisticsAreNonZero`,
  `assertThatStatisticsAreNotPresent`, `assertThatStatisticsValuesHaveIncreased`, `isEqualTo`. Legacy assertion helpers:
  `assertThat`, `assertThatStatisticsAreNonZero`, `assertThatStatisticsAreNotPresent`,
  `assertThatStatisticsValuesHaveIncreased`, `isEqualTo`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: Current method uses parameter-injected environment helpers instead of Tempto
  query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Matched by current suite selection: `SuiteHiveBasic` run 1 Exact-name mapping with normalized body
  similarity `0.92`.
- Audit status: `verified`

##### `testInsertBucketed`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestHiveBasicTableStatistics.java` ->
  `testInsertBucketed`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestHiveBasicTableStatistics.java` ->
  `TestHiveBasicTableStatistics.testInsertBucketed`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveBasicEnvironment`. Routed by source review into `SuiteHiveBasic` run
    1.
- Tag parity: Current tags: `HdfsNoImpersonation`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`. Legacy setup operations: `CREATE`.
- Action parity: Current action verbs: `WITH`, `SELECT`. Legacy action verbs: `WITH`, `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `assertThatStatisticsAreNonZero`, `isEqualTo`. Legacy
  assertion helpers: `assertThat`, `assertThatStatisticsAreNonZero`, `isEqualTo`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: Current method uses parameter-injected environment helpers instead of Tempto
  query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Matched by current suite selection: `SuiteHiveBasic` run 1 Exact-name mapping with normalized body
  similarity `0.91`.
- Audit status: `verified`

##### `testInsertBucketedPartitioned`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestHiveBasicTableStatistics.java` ->
  `testInsertBucketedPartitioned`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestHiveBasicTableStatistics.java` ->
  `TestHiveBasicTableStatistics.testInsertBucketedPartitioned`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveBasicEnvironment`. Routed by source review into `SuiteHiveBasic` run
    1.
- Tag parity: Current tags: `HdfsNoImpersonation`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`, `INSERT`. Legacy setup operations: `CREATE`, `INSERT`.
- Action parity: Current action verbs: `WITH`, `SELECT`. Legacy action verbs: `WITH`, `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `assertThatStatisticsAreNonZero`,
  `assertThatStatisticsAreNotPresent`, `isEqualTo`. Legacy assertion helpers: `assertThat`,
  `assertThatStatisticsAreNonZero`, `assertThatStatisticsAreNotPresent`, `isEqualTo`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: Current method uses parameter-injected environment helpers instead of Tempto
  query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Matched by current suite selection: `SuiteHiveBasic` run 1 Exact-name mapping with normalized body
  similarity `0.83`.
- Audit status: `verified`

### `TestHiveBucketedTables`

- Owning migration commit: `Migrate TestHiveBucketedTables to JUnit`
- Current class added in same migration commit:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestHiveBucketedTables.java`
- Legacy class removed in same migration commit:
    - `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestHiveBucketedTables.java`
- Class-level environment requirement: `HiveBasicEnvironment`.
- Class-level tags: `HdfsNoImpersonation`.
- Method inventory complete: Yes. Legacy methods: `14`. Current methods: `16`.
- Legacy helper/resource dependencies accounted for: Legacy class source reviewed directly.
- Intentional differences summary: `HDP to Hive 3.1 migration`, `JUnit/AssertJ/Testcontainers framework replacement`,
  `Kerberos deployment cleanup without intended coverage change`; `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Method statuses present: `intentional difference`, `verified`.

#### Methods

##### `testSelectStar`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestHiveBucketedTables.java` ->
  `testSelectStar`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestHiveBucketedTables.java` ->
  `TestHiveBucketedTables.testSelectStar`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveBasicEnvironment`. Routed by source review into `SuiteHiveBasic` run
    1.
- Tag parity: Current tags: `HdfsNoImpersonation`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: none. Legacy setup operations: none.
- Action parity: Current action verbs: `SELECT`. Legacy action verbs: `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `containsOnly`, `row`. Legacy assertion helpers:
  `assertThat`.
- Cleanup parity: Current cleanup operations: `DROP`. No legacy cleanup method body was available.
- Any observed difference, however small: Normalized body similarity is low (`0.12`), so fidelity was judged from
  SQL/helper/assertion shape instead of raw text. SQL verb set differs: legacy ['SELECT'] vs current ['SELECT', 'DROP'].
  Assertion helper names differ between legacy and current implementations. Current method uses parameter-injected
  environment helpers instead of Tempto query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Matched by current suite selection: `SuiteHiveBasic` run 1 Exact-name mapping with normalized body
  similarity `0.12`.
- Audit status: `verified`

##### `testIgnorePartitionBucketingIfNotBucketed`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestHiveBucketedTables.java` ->
  `testIgnorePartitionBucketingIfNotBucketed`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestHiveBucketedTables.java` ->
  `TestHiveBucketedTables.testIgnorePartitionBucketingIfNotBucketed`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveBasicEnvironment`. Routed by source review into `SuiteHiveBasic` run
    1.
- Tag parity: Current tags: `HdfsNoImpersonation`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `ALTER`. Legacy setup operations: `ALTER`.
- Action parity: Current action verbs: `SELECT`. Legacy action verbs: `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `contains`, `row`. Legacy assertion helpers: `assertThat`,
  `contains`, `row`.
- Cleanup parity: Current cleanup operations: `DROP`. No legacy cleanup method body was available.
- Any observed difference, however small: SQL verb set differs: legacy ['ALTER', 'SELECT'] vs
  current ['ALTER', 'SELECT', 'DROP']. Current method uses parameter-injected environment helpers instead of Tempto
  query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Matched by current suite selection: `SuiteHiveBasic` run 1 Exact-name mapping with normalized body
  similarity `0.57`.
- Audit status: `verified`

##### `testAllowMultipleFilesPerBucket`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestHiveBucketedTables.java` ->
  `testAllowMultipleFilesPerBucket`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestHiveBucketedTables.java` ->
  `TestHiveBucketedTables.testAllowMultipleFilesPerBucket`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveBasicEnvironment`. Routed by source review into `SuiteHiveBasic` run
    1.
- Tag parity: Current tags: `HdfsNoImpersonation`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: none. Legacy setup operations: none.
- Action parity: Current action verbs: `SELECT`. Legacy action verbs: `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `contains`, `row`. Legacy assertion helpers: `assertThat`,
  `contains`, `row`.
- Cleanup parity: Current cleanup operations: `DROP`. No legacy cleanup method body was available.
- Any observed difference, however small: SQL verb set differs: legacy ['SELECT'] vs current ['SELECT', 'DROP']. Current
  method uses parameter-injected environment helpers instead of Tempto query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Matched by current suite selection: `SuiteHiveBasic` run 1 Exact-name mapping with normalized body
  similarity `0.58`.
- Audit status: `verified`

##### `testSelectAfterMultipleInserts`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestHiveBucketedTables.java` ->
  `testSelectAfterMultipleInserts`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestHiveBucketedTables.java` ->
  `TestHiveBucketedTables.testSelectAfterMultipleInserts`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveBasicEnvironment`. Routed by source review into `SuiteHiveBasic` run
    1.
- Tag parity: Current tags: `HdfsNoImpersonation`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: none. Legacy setup operations: none.
- Action parity: Current action verbs: `SELECT`. Legacy action verbs: `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `containsOnly`, `row`. Legacy assertion helpers:
  `assertThat`, `containsOnly`, `row`.
- Cleanup parity: Current cleanup operations: `DROP`. No legacy cleanup method body was available.
- Any observed difference, however small: SQL verb set differs: legacy ['SELECT'] vs current ['SELECT', 'DROP']. Current
  method uses parameter-injected environment helpers instead of Tempto query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Matched by current suite selection: `SuiteHiveBasic` run 1 Exact-name mapping with normalized body
  similarity `0.62`.
- Audit status: `verified`

##### `testSelectAfterMultipleInsertsForSortedTable`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestHiveBucketedTables.java` ->
  `testSelectAfterMultipleInsertsForSortedTable`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestHiveBucketedTables.java` ->
  `TestHiveBucketedTables.testSelectAfterMultipleInsertsForSortedTable`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveBasicEnvironment`. Routed by source review into `SuiteHiveBasic` run
    1.
- Tag parity: Current tags: `HdfsNoImpersonation`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: none. Legacy setup operations: none.
- Action parity: Current action verbs: `SELECT`. Legacy action verbs: `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `containsOnly`, `row`. Legacy assertion helpers:
  `assertThat`, `containsOnly`, `row`.
- Cleanup parity: Current cleanup operations: `DROP`. No legacy cleanup method body was available.
- Any observed difference, however small: SQL verb set differs: legacy ['SELECT'] vs current ['SELECT', 'DROP']. Current
  method uses parameter-injected environment helpers instead of Tempto query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Matched by current suite selection: `SuiteHiveBasic` run 1 Exact-name mapping with normalized body
  similarity `0.61`.
- Audit status: `verified`

##### `testSelectAfterMultipleInsertsForPartitionedTable`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestHiveBucketedTables.java` ->
  `testSelectAfterMultipleInsertsForPartitionedTable`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestHiveBucketedTables.java` ->
  `TestHiveBucketedTables.testSelectAfterMultipleInsertsForPartitionedTable`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveBasicEnvironment`. Routed by source review into `SuiteHiveBasic` run
    1.
- Tag parity: Current tags: `HdfsNoImpersonation`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: none. Legacy setup operations: none.
- Action parity: Current action verbs: `SELECT`. Legacy action verbs: `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `containsOnly`, `row`. Legacy assertion helpers:
  `assertThat`, `containsOnly`, `row`.
- Cleanup parity: Current cleanup operations: `DROP`. No legacy cleanup method body was available.
- Any observed difference, however small: SQL verb set differs: legacy ['SELECT'] vs current ['SELECT', 'DROP']. Current
  method uses parameter-injected environment helpers instead of Tempto query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Matched by current suite selection: `SuiteHiveBasic` run 1 Exact-name mapping with normalized body
  similarity `0.74`.
- Audit status: `verified`

##### `testSelectFromEmptyBucketedTableEmptyTablesAllowed`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestHiveBucketedTables.java` ->
  `testSelectFromEmptyBucketedTableEmptyTablesAllowed`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestHiveBucketedTables.java` ->
  `TestHiveBucketedTables.testSelectFromEmptyBucketedTableEmptyTablesAllowed`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveBasicEnvironment`. Routed by source review into `SuiteHiveBasic` run
    1.
- Tag parity: Current tags: `HdfsNoImpersonation`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: none. Legacy setup operations: none.
- Action parity: Current action verbs: `SELECT`. Legacy action verbs: `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `row`. Legacy assertion helpers: `assertThat`, `row`.
- Cleanup parity: Current cleanup operations: `DROP`. No legacy cleanup method body was available.
- Any observed difference, however small: Normalized body similarity is low (`0.37`), so fidelity was judged from
  SQL/helper/assertion shape instead of raw text. SQL verb set differs: legacy ['SELECT'] vs current ['SELECT', 'DROP'].
  Current method uses parameter-injected environment helpers instead of Tempto query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Matched by current suite selection: `SuiteHiveBasic` run 1 Exact-name mapping with normalized body
  similarity `0.37`.
- Audit status: `verified`

##### `testSelectFromIncompleteBucketedTableEmptyTablesAllowed`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestHiveBucketedTables.java` ->
  `testSelectFromIncompleteBucketedTableEmptyTablesAllowed`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestHiveBucketedTables.java` ->
  `TestHiveBucketedTables.testSelectFromIncompleteBucketedTableEmptyTablesAllowed`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveBasicEnvironment`. Routed by source review into `SuiteHiveBasic` run
    1.
- Tag parity: Current tags: `HdfsNoImpersonation`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: none. Legacy setup operations: none.
- Action parity: Current action verbs: `SELECT`. Legacy action verbs: `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `row`. Legacy assertion helpers: `assertThat`, `row`.
- Cleanup parity: Current cleanup operations: `DROP`. No legacy cleanup method body was available.
- Any observed difference, however small: SQL verb set differs: legacy ['SELECT'] vs current ['SELECT', 'DROP']. Current
  method uses parameter-injected environment helpers instead of Tempto query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Matched by current suite selection: `SuiteHiveBasic` run 1 Exact-name mapping with normalized body
  similarity `0.56`.
- Audit status: `verified`

##### `testInsertPartitionedBucketed`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestHiveBucketedTables.java` ->
  `testInsertPartitionedBucketed`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestHiveBucketedTables.java` ->
  `TestHiveBucketedTables.testInsertPartitionedBucketed`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveBasicEnvironment`. Routed by source review into `SuiteHiveBasic` run
    1.
- Tag parity: Current tags: `HdfsNoImpersonation`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`. Legacy setup operations: `CREATE`.
- Action parity: Current action verbs: `SELECT`. Legacy action verbs: `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `row`. Legacy assertion helpers: `assertThat`, `row`.
- Cleanup parity: Current cleanup operations: `DROP`. No legacy cleanup method body was available.
- Any observed difference, however small: SQL verb set differs: legacy ['CREATE', 'SELECT'] vs
  current ['CREATE', 'SELECT', 'DROP']. Current method uses parameter-injected environment helpers instead of Tempto
  query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Matched by current suite selection: `SuiteHiveBasic` run 1 Exact-name mapping with normalized body
  similarity `0.66`.
- Audit status: `verified`

##### `testCreatePartitionedBucketedTableAsSelect`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestHiveBucketedTables.java` ->
  `testCreatePartitionedBucketedTableAsSelect`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestHiveBucketedTables.java` ->
  `TestHiveBucketedTables.testCreatePartitionedBucketedTableAsSelect`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveBasicEnvironment`. Routed by source review into `SuiteHiveBasic` run
    1.
- Tag parity: Current tags: `HdfsNoImpersonation`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `INSERT`. Legacy setup operations: `INSERT`.
- Action parity: Current action verbs: `SELECT`. Legacy action verbs: `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `row`. Legacy assertion helpers: `assertThat`, `row`.
- Cleanup parity: Current cleanup operations: `DROP`. No legacy cleanup method body was available.
- Any observed difference, however small: Normalized body similarity is low (`0.49`), so fidelity was judged from
  SQL/helper/assertion shape instead of raw text. SQL verb set differs: legacy ['INSERT', 'SELECT'] vs
  current ['INSERT', 'SELECT', 'DROP']. Current method uses parameter-injected environment helpers instead of Tempto
  query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Matched by current suite selection: `SuiteHiveBasic` run 1 Exact-name mapping with normalized body
  similarity `0.49`.
- Audit status: `verified`

##### `testInsertIntoBucketedTables`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestHiveBucketedTables.java` ->
  `testInsertIntoBucketedTables`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestHiveBucketedTables.java` ->
  `TestHiveBucketedTables.testInsertIntoBucketedTables`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveBasicEnvironment`. Routed by source review into `SuiteHiveBasic` run
    1.
- Tag parity: Current tags: `HdfsNoImpersonation`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `INSERT`. Legacy setup operations: `INSERT`.
- Action parity: Current action verbs: `SELECT`. Legacy action verbs: `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `row`. Legacy assertion helpers: `assertThat`, `row`.
- Cleanup parity: Current cleanup operations: `DROP`. No legacy cleanup method body was available.
- Any observed difference, however small: SQL verb set differs: legacy ['INSERT', 'SELECT'] vs
  current ['INSERT', 'SELECT', 'DROP']. Current method uses parameter-injected environment helpers instead of Tempto
  query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Matched by current suite selection: `SuiteHiveBasic` run 1 Exact-name mapping with normalized body
  similarity `0.56`.
- Audit status: `verified`

##### `testCreateBucketedTableAsSelect`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestHiveBucketedTables.java` ->
  `testCreateBucketedTableAsSelect`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestHiveBucketedTables.java` ->
  `TestHiveBucketedTables.testCreateBucketedTableAsSelect`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveBasicEnvironment`. Routed by source review into `SuiteHiveBasic` run
    1.
- Tag parity: Current tags: `HdfsNoImpersonation`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`. Legacy setup operations: `CREATE`.
- Action parity: Current action verbs: `SELECT`. Legacy action verbs: `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `row`. Legacy assertion helpers: `assertThat`, `row`.
- Cleanup parity: Current cleanup operations: `DROP`. No legacy cleanup method body was available.
- Any observed difference, however small: Normalized body similarity is low (`0.39`), so fidelity was judged from
  SQL/helper/assertion shape instead of raw text. SQL verb set differs: legacy ['CREATE', 'SELECT'] vs
  current ['CREATE', 'SELECT', 'DROP']. Current method uses parameter-injected environment helpers instead of Tempto
  query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Matched by current suite selection: `SuiteHiveBasic` run 1 Exact-name mapping with normalized body
  similarity `0.39`.
- Audit status: `verified`

##### `testBucketingVersion`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestHiveBucketedTables.java` ->
  `testBucketingVersion`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestHiveBucketedTables.java` ->
  `TestHiveBucketedTables.testBucketingVersion`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveBasicEnvironment`. Routed by source review into `SuiteHiveBasic` run
    1.
- Tag parity: Current tags: `HdfsNoImpersonation`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: none. No legacy setup method body was available.
- Action parity: Current action verbs: none. No legacy action method body was available.
- Assertion parity: Current assertion helpers: none. No legacy assertion method body was available.
- Cleanup parity: Current cleanup operations: none. No legacy cleanup method body was available.
- Any observed difference, however small: No method-specific difference identified beyond the documented framework
  baseline.
- Known intentional difference: None.
- Reviewer note: Matched by current suite selection: `SuiteHiveBasic` run 1 Exact-name mapping with normalized body
  similarity `0.62`.
- Audit status: `verified`

##### `testBucketingVersion2HiveInsertValues`

- Legacy source method: No legacy source method; this is new JUnit-side verification coverage.
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestHiveBucketedTables.java` ->
  `TestHiveBucketedTables.testBucketingVersion2HiveInsertValues`
- Mapping type: `new coverage helper`
- Environment parity: Current class requires `HiveBasicEnvironment`. Routed by source review into `SuiteHiveBasic` run
    1.
- Tag parity: Current tags: `HdfsNoImpersonation`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `INSERT`. No legacy setup method body was available.
- Action parity: Current action verbs: `SELECT`. No legacy action method body was available.
- Assertion parity: Current assertion helpers: `assertThat`, `contains`, `isEqualTo`. No legacy assertion method body
  was available.
- Cleanup parity: Current cleanup operations: `DROP`. No legacy cleanup method body was available.
- Any observed difference, however small: No direct legacy counterpart exists; this adds explicit Hive 3.1
  bucketing-version=2 INSERT VALUES coverage for the known runtime-specific behavior investigation.
- Known intentional difference: `HDP to Hive 3.1 migration`, `JUnit/AssertJ/Testcontainers framework replacement`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Source/history review only.
- Audit status: `intentional difference`

##### `testBucketingVersion2HiveInsertSelectProducesCorruption`

- Legacy source method: No legacy source method; this is new JUnit-side verification coverage.
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestHiveBucketedTables.java` ->
  `TestHiveBucketedTables.testBucketingVersion2HiveInsertSelectProducesCorruption`
- Mapping type: `new coverage helper`
- Environment parity: Current class requires `HiveBasicEnvironment`. Routed by source review into `SuiteHiveBasic` run
    1.
- Tag parity: Current tags: `HdfsNoImpersonation`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `INSERT`. No legacy setup method body was available.
- Action parity: Current action verbs: `SELECT`. No legacy action method body was available.
- Assertion parity: Current assertion helpers: `assertThatThrownBy`, `hasMessageContaining`. No legacy assertion method
  body was available.
- Cleanup parity: Current cleanup operations: `DROP`. No legacy cleanup method body was available.
- Any observed difference, however small: No direct legacy counterpart exists; this adds explicit Hive 3.1
  bucketing-version=2 INSERT SELECT corruption coverage for the known runtime-specific behavior investigation.
- Known intentional difference: `HDP to Hive 3.1 migration`, `JUnit/AssertJ/Testcontainers framework replacement`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Source/history review only.
- Audit status: `intentional difference`

##### `testBucketingWithUnsupportedDataTypes`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestHiveBucketedTables.java` ->
  `testBucketingWithUnsupportedDataTypes`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestHiveBucketedTables.java` ->
  `TestHiveBucketedTables.testBucketingWithUnsupportedDataTypes`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveBasicEnvironment`. Routed by source review into `SuiteHiveBasic` run
    1.
- Tag parity: Current tags: `HdfsNoImpersonation`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`, `INSERT`. Legacy setup operations: `CREATE`, `INSERT`.
- Action parity: Current action verbs: `SHOW`, `WITH`, `SELECT`. Legacy action verbs: `SHOW`, `WITH`, `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `assertThatThrownBy`. Legacy assertion helpers:
  `assertQueryFailure`, `assertThat`.
- Cleanup parity: Current cleanup operations: `DROP`. No legacy cleanup method body was available.
- Any observed difference, however small: SQL verb set differs: legacy ['CREATE', 'SHOW', 'WITH', 'SELECT', 'INSERT'] vs
  current ['CREATE', 'SHOW', 'WITH', 'SELECT', 'INSERT', 'DROP']. Assertion helper names differ between legacy and
  current implementations. Current method uses parameter-injected environment helpers instead of Tempto query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Matched by current suite selection: `SuiteHiveBasic` run 1 Exact-name mapping with normalized body
  similarity `0.80`.
- Audit status: `verified`

### `TestHiveCoercionOnPartitionedTable`

- Owning migration commit: `Migrate TestHiveCoercionOnPartitionedTable to JUnit`
- Current class added in same migration commit:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestHiveCoercionOnPartitionedTable.java`
- Legacy class removed in same migration commit:
    - `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestHiveCoercionOnPartitionedTable.java`
- Class-level environment requirement: `HiveStorageFormatsEnvironment`.
- Class-level tags: `StorageFormats`.
- Method inventory complete: Yes. Legacy methods: `13`. Current methods: `13`.
- Legacy helper/resource dependencies accounted for: Legacy class source reviewed directly.
- Intentional differences summary: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Method statuses present: `verified`.

#### Methods

##### `testHiveCoercionTextFile`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestHiveCoercionOnPartitionedTable.java` ->
  `testHiveCoercionTextFile`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestHiveCoercionOnPartitionedTable.java` ->
  `TestHiveCoercionOnPartitionedTable.testHiveCoercionTextFile`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveStorageFormatsEnvironment`. Routed by source review into
  `SuiteHiveStorageFormats` run 1.
- Tag parity: Current tags: `StorageFormats`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: none. No legacy setup method body was available.
- Action parity: Current action verbs: none. No legacy action method body was available.
- Assertion parity: Current assertion helpers: none. No legacy assertion method body was available.
- Cleanup parity: Current cleanup operations: none. No legacy cleanup method body was available.
- Any observed difference, however small: Normalized body similarity is low (`0.50`), so fidelity was judged from
  SQL/helper/assertion shape instead of raw text.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Matched by current suite selection: `SuiteHiveStorageFormats` run 1 Exact-name mapping with normalized
  body similarity `0.50`.
- Audit status: `verified`

##### `testHiveCoercionWithDifferentTimestampPrecisionTextFile`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestHiveCoercionOnPartitionedTable.java` ->
  `testHiveCoercionWithDifferentTimestampPrecisionTextFile`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestHiveCoercionOnPartitionedTable.java` ->
  `TestHiveCoercionOnPartitionedTable.testHiveCoercionWithDifferentTimestampPrecisionTextFile`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveStorageFormatsEnvironment`. Routed by source review into
  `SuiteHiveStorageFormats` run 1.
- Tag parity: Current tags: `StorageFormats`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: none. No legacy setup method body was available.
- Action parity: Current action verbs: none. No legacy action method body was available.
- Assertion parity: Current assertion helpers: none. No legacy assertion method body was available.
- Cleanup parity: Current cleanup operations: none. No legacy cleanup method body was available.
- Any observed difference, however small: Normalized body similarity is low (`0.29`), so fidelity was judged from
  SQL/helper/assertion shape instead of raw text.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Matched by current suite selection: `SuiteHiveStorageFormats` run 1 Exact-name mapping with normalized
  body similarity `0.29`.
- Audit status: `verified`

##### `testHiveCoercionOrc`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestHiveCoercionOnPartitionedTable.java` ->
  `testHiveCoercionOrc`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestHiveCoercionOnPartitionedTable.java` ->
  `TestHiveCoercionOnPartitionedTable.testHiveCoercionOrc`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveStorageFormatsEnvironment`. Routed by source review into
  `SuiteHiveStorageFormats` run 1.
- Tag parity: Current tags: `StorageFormats`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: none. No legacy setup method body was available.
- Action parity: Current action verbs: none. No legacy action method body was available.
- Assertion parity: Current assertion helpers: none. No legacy assertion method body was available.
- Cleanup parity: Current cleanup operations: none. No legacy cleanup method body was available.
- Any observed difference, however small: Normalized body similarity is low (`0.53`), so fidelity was judged from
  SQL/helper/assertion shape instead of raw text.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Matched by current suite selection: `SuiteHiveStorageFormats` run 1 Exact-name mapping with normalized
  body similarity `0.53`.
- Audit status: `verified`

##### `testHiveCoercionWithDifferentTimestampPrecisionOrc`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestHiveCoercionOnPartitionedTable.java` ->
  `testHiveCoercionWithDifferentTimestampPrecisionOrc`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestHiveCoercionOnPartitionedTable.java` ->
  `TestHiveCoercionOnPartitionedTable.testHiveCoercionWithDifferentTimestampPrecisionOrc`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveStorageFormatsEnvironment`. Routed by source review into
  `SuiteHiveStorageFormats` run 1.
- Tag parity: Current tags: `StorageFormats`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: none. No legacy setup method body was available.
- Action parity: Current action verbs: none. No legacy action method body was available.
- Assertion parity: Current assertion helpers: none. No legacy assertion method body was available.
- Cleanup parity: Current cleanup operations: none. No legacy cleanup method body was available.
- Any observed difference, however small: No method-specific difference identified beyond the documented framework
  baseline.
- Known intentional difference: None.
- Reviewer note: Matched by current suite selection: `SuiteHiveStorageFormats` run 1 Exact-name mapping with normalized
  body similarity `0.69`.
- Audit status: `verified`

##### `testHiveCoercionRcText`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestHiveCoercionOnPartitionedTable.java` ->
  `testHiveCoercionRcText`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestHiveCoercionOnPartitionedTable.java` ->
  `TestHiveCoercionOnPartitionedTable.testHiveCoercionRcText`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveStorageFormatsEnvironment`. Routed by source review into
  `SuiteHiveStorageFormats` run 1.
- Tag parity: Current tags: `StorageFormats`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: none. No legacy setup method body was available.
- Action parity: Current action verbs: none. No legacy action method body was available.
- Assertion parity: Current assertion helpers: none. No legacy assertion method body was available.
- Cleanup parity: Current cleanup operations: none. No legacy cleanup method body was available.
- Any observed difference, however small: Normalized body similarity is low (`0.04`), so fidelity was judged from
  SQL/helper/assertion shape instead of raw text.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Matched by current suite selection: `SuiteHiveStorageFormats` run 1 Exact-name mapping with normalized
  body similarity `0.04`.
- Audit status: `verified`

##### `testHiveCoercionWithDifferentTimestampPrecisionRcText`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestHiveCoercionOnPartitionedTable.java` ->
  `testHiveCoercionWithDifferentTimestampPrecisionRcText`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestHiveCoercionOnPartitionedTable.java` ->
  `TestHiveCoercionOnPartitionedTable.testHiveCoercionWithDifferentTimestampPrecisionRcText`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveStorageFormatsEnvironment`. Routed by source review into
  `SuiteHiveStorageFormats` run 1.
- Tag parity: Current tags: `StorageFormats`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: none. No legacy setup method body was available.
- Action parity: Current action verbs: none. No legacy action method body was available.
- Assertion parity: Current assertion helpers: none. No legacy assertion method body was available.
- Cleanup parity: Current cleanup operations: none. No legacy cleanup method body was available.
- Any observed difference, however small: Normalized body similarity is low (`0.03`), so fidelity was judged from
  SQL/helper/assertion shape instead of raw text.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Matched by current suite selection: `SuiteHiveStorageFormats` run 1 Exact-name mapping with normalized
  body similarity `0.03`.
- Audit status: `verified`

##### `testHiveCoercionRcBinary`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestHiveCoercionOnPartitionedTable.java` ->
  `testHiveCoercionRcBinary`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestHiveCoercionOnPartitionedTable.java` ->
  `TestHiveCoercionOnPartitionedTable.testHiveCoercionRcBinary`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveStorageFormatsEnvironment`. Routed by source review into
  `SuiteHiveStorageFormats` run 1.
- Tag parity: Current tags: `StorageFormats`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: none. No legacy setup method body was available.
- Action parity: Current action verbs: none. No legacy action method body was available.
- Assertion parity: Current assertion helpers: none. No legacy assertion method body was available.
- Cleanup parity: Current cleanup operations: none. No legacy cleanup method body was available.
- Any observed difference, however small: Normalized body similarity is low (`0.45`), so fidelity was judged from
  SQL/helper/assertion shape instead of raw text.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Matched by current suite selection: `SuiteHiveStorageFormats` run 1 Exact-name mapping with normalized
  body similarity `0.45`.
- Audit status: `verified`

##### `testHiveCoercionWithDifferentTimestampPrecisionRcBinary`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestHiveCoercionOnPartitionedTable.java` ->
  `testHiveCoercionWithDifferentTimestampPrecisionRcBinary`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestHiveCoercionOnPartitionedTable.java` ->
  `TestHiveCoercionOnPartitionedTable.testHiveCoercionWithDifferentTimestampPrecisionRcBinary`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveStorageFormatsEnvironment`. Routed by source review into
  `SuiteHiveStorageFormats` run 1.
- Tag parity: Current tags: `StorageFormats`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: none. No legacy setup method body was available.
- Action parity: Current action verbs: none. No legacy action method body was available.
- Assertion parity: Current assertion helpers: none. No legacy assertion method body was available.
- Cleanup parity: Current cleanup operations: none. No legacy cleanup method body was available.
- Any observed difference, however small: No method-specific difference identified beyond the documented framework
  baseline.
- Known intentional difference: None.
- Reviewer note: Matched by current suite selection: `SuiteHiveStorageFormats` run 1 Exact-name mapping with normalized
  body similarity `0.59`.
- Audit status: `verified`

##### `testHiveCoercionParquet`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestHiveCoercionOnPartitionedTable.java` ->
  `testHiveCoercionParquet`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestHiveCoercionOnPartitionedTable.java` ->
  `TestHiveCoercionOnPartitionedTable.testHiveCoercionParquet`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveStorageFormatsEnvironment`. Routed by source review into
  `SuiteHiveStorageFormats` run 1.
- Tag parity: Current tags: `StorageFormats`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: none. No legacy setup method body was available.
- Action parity: Current action verbs: none. No legacy action method body was available.
- Assertion parity: Current assertion helpers: none. No legacy assertion method body was available.
- Cleanup parity: Current cleanup operations: none. No legacy cleanup method body was available.
- Any observed difference, however small: No method-specific difference identified beyond the documented framework
  baseline.
- Known intentional difference: None.
- Reviewer note: Matched by current suite selection: `SuiteHiveStorageFormats` run 1 Exact-name mapping with normalized
  body similarity `0.57`.
- Audit status: `verified`

##### `testHiveCoercionWithDifferentTimestampPrecisionParquet`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestHiveCoercionOnPartitionedTable.java` ->
  `testHiveCoercionWithDifferentTimestampPrecisionParquet`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestHiveCoercionOnPartitionedTable.java` ->
  `TestHiveCoercionOnPartitionedTable.testHiveCoercionWithDifferentTimestampPrecisionParquet`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveStorageFormatsEnvironment`. Routed by source review into
  `SuiteHiveStorageFormats` run 1.
- Tag parity: Current tags: `StorageFormats`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: none. No legacy setup method body was available.
- Action parity: Current action verbs: none. No legacy action method body was available.
- Assertion parity: Current assertion helpers: none. No legacy assertion method body was available.
- Cleanup parity: Current cleanup operations: none. No legacy cleanup method body was available.
- Any observed difference, however small: No method-specific difference identified beyond the documented framework
  baseline.
- Known intentional difference: None.
- Reviewer note: Matched by current suite selection: `SuiteHiveStorageFormats` run 1 Exact-name mapping with normalized
  body similarity `0.70`.
- Audit status: `verified`

##### `testHiveCoercionSequence`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestHiveCoercionOnPartitionedTable.java` ->
  `testHiveCoercionSequence`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestHiveCoercionOnPartitionedTable.java` ->
  `TestHiveCoercionOnPartitionedTable.testHiveCoercionSequence`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveStorageFormatsEnvironment`. Routed by source review into
  `SuiteHiveStorageFormats` run 1.
- Tag parity: Current tags: `StorageFormats`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: none. No legacy setup method body was available.
- Action parity: Current action verbs: none. No legacy action method body was available.
- Assertion parity: Current assertion helpers: none. No legacy assertion method body was available.
- Cleanup parity: Current cleanup operations: none. No legacy cleanup method body was available.
- Any observed difference, however small: No method-specific difference identified beyond the documented framework
  baseline.
- Known intentional difference: None.
- Reviewer note: Matched by current suite selection: `SuiteHiveStorageFormats` run 1 Exact-name mapping with normalized
  body similarity `0.56`.
- Audit status: `verified`

##### `testHiveCoercionWithDifferentTimestampPrecisionSequence`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestHiveCoercionOnPartitionedTable.java` ->
  `testHiveCoercionWithDifferentTimestampPrecisionSequence`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestHiveCoercionOnPartitionedTable.java` ->
  `TestHiveCoercionOnPartitionedTable.testHiveCoercionWithDifferentTimestampPrecisionSequence`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveStorageFormatsEnvironment`. Routed by source review into
  `SuiteHiveStorageFormats` run 1.
- Tag parity: Current tags: `StorageFormats`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: none. No legacy setup method body was available.
- Action parity: Current action verbs: none. No legacy action method body was available.
- Assertion parity: Current assertion helpers: none. No legacy assertion method body was available.
- Cleanup parity: Current cleanup operations: none. No legacy cleanup method body was available.
- Any observed difference, however small: No method-specific difference identified beyond the documented framework
  baseline.
- Known intentional difference: None.
- Reviewer note: Matched by current suite selection: `SuiteHiveStorageFormats` run 1 Exact-name mapping with normalized
  body similarity `0.70`.
- Audit status: `verified`

##### `testHiveCoercionAvro`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestHiveCoercionOnPartitionedTable.java` ->
  `testHiveCoercionAvro`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestHiveCoercionOnPartitionedTable.java` ->
  `TestHiveCoercionOnPartitionedTable.testHiveCoercionAvro`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveStorageFormatsEnvironment`. Routed by source review into
  `SuiteHiveStorageFormats` run 1.
- Tag parity: Current tags: `StorageFormats`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`, `INSERT`, `ALTER`. Legacy setup operations: `INSERT`, `ALTER`.
- Action parity: Current action verbs: `SHOW`, `SELECT`. Legacy action verbs: `SHOW`, `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `containsOnly`, `isEqualTo`, `row`. Legacy assertion
  helpers: `assertThat`, `containsOnly`, `row`.
- Cleanup parity: Current cleanup operations: `DROP`. No legacy cleanup method body was available.
- Any observed difference, however small: SQL verb set differs: legacy ['INSERT', 'ALTER', 'SHOW', 'SELECT'] vs
  current ['CREATE', 'INSERT', 'ALTER', 'SHOW', 'SELECT', 'DROP']. Assertion helper names differ between legacy and
  current implementations. Current method uses parameter-injected environment helpers instead of Tempto query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Matched by current suite selection: `SuiteHiveStorageFormats` run 1 Exact-name mapping with normalized
  body similarity `0.59`.
- Audit status: `verified`

### `TestHiveCoercionOnUnpartitionedTable`

- Owning migration commit: `Migrate TestHiveCoercionOnUnpartitionedTable to JUnit`
- Current class added in same migration commit:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestHiveCoercionOnUnpartitionedTable.java`
- Legacy class removed in same migration commit:
    - `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestHiveCoercionOnUnpartitionedTable.java`
- Class-level environment requirement: `HiveStorageFormatsEnvironment`.
- Class-level tags: `StorageFormats`.
- Method inventory complete: Yes. Legacy methods: `4`. Current methods: `4`.
- Legacy helper/resource dependencies accounted for: Legacy class source reviewed directly.
- Intentional differences summary: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Method statuses present: `verified`.

#### Methods

##### `testHiveCoercionOrc`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestHiveCoercionOnUnpartitionedTable.java` ->
  `testHiveCoercionOrc`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestHiveCoercionOnUnpartitionedTable.java` ->
  `TestHiveCoercionOnUnpartitionedTable.testHiveCoercionOrc`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveStorageFormatsEnvironment`. Routed by source review into
  `SuiteHiveStorageFormats` run 1.
- Tag parity: Current tags: `StorageFormats`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: none. No legacy setup method body was available.
- Action parity: Current action verbs: none. No legacy action method body was available.
- Assertion parity: Current assertion helpers: none. No legacy assertion method body was available.
- Cleanup parity: Current cleanup operations: none. No legacy cleanup method body was available.
- Any observed difference, however small: No method-specific difference identified beyond the documented framework
  baseline.
- Known intentional difference: None.
- Reviewer note: Matched by current suite selection: `SuiteHiveStorageFormats` run 1 Exact-name mapping with normalized
  body similarity `0.64`.
- Audit status: `verified`

##### `testHiveCoercionWithDifferentTimestampPrecisionOrc`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestHiveCoercionOnUnpartitionedTable.java` ->
  `testHiveCoercionWithDifferentTimestampPrecision`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestHiveCoercionOnUnpartitionedTable.java` ->
  `TestHiveCoercionOnUnpartitionedTable.testHiveCoercionWithDifferentTimestampPrecisionOrc`
- Mapping type: `renamed`
- Environment parity: Current class requires `HiveStorageFormatsEnvironment`. Routed by source review into
  `SuiteHiveStorageFormats` run 1.
- Tag parity: Current tags: `StorageFormats`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: none. No legacy setup method body was available.
- Action parity: Current action verbs: none. No legacy action method body was available.
- Assertion parity: Current assertion helpers: none. No legacy assertion method body was available.
- Cleanup parity: Current cleanup operations: none. No legacy cleanup method body was available.
- Any observed difference, however small: Current method maps to legacy
  `testHiveCoercionWithDifferentTimestampPrecision` rather than the same method name.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Matched by current suite selection: `SuiteHiveStorageFormats` run 1
- Audit status: `verified`

##### `testHiveCoercionParquet`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestHiveCoercionOnUnpartitionedTable.java` ->
  `testHiveCoercionParquet`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestHiveCoercionOnUnpartitionedTable.java` ->
  `TestHiveCoercionOnUnpartitionedTable.testHiveCoercionParquet`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveStorageFormatsEnvironment`. Routed by source review into
  `SuiteHiveStorageFormats` run 1.
- Tag parity: Current tags: `StorageFormats`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: none. No legacy setup method body was available.
- Action parity: Current action verbs: none. No legacy action method body was available.
- Assertion parity: Current assertion helpers: none. No legacy assertion method body was available.
- Cleanup parity: Current cleanup operations: none. No legacy cleanup method body was available.
- Any observed difference, however small: No method-specific difference identified beyond the documented framework
  baseline.
- Known intentional difference: None.
- Reviewer note: Matched by current suite selection: `SuiteHiveStorageFormats` run 1 Exact-name mapping with normalized
  body similarity `0.67`.
- Audit status: `verified`

##### `testHiveCoercionWithDifferentTimestampPrecisionParquet`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestHiveCoercionOnUnpartitionedTable.java` ->
  `testHiveCoercionWithDifferentTimestampPrecisionParquet`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestHiveCoercionOnUnpartitionedTable.java` ->
  `TestHiveCoercionOnUnpartitionedTable.testHiveCoercionWithDifferentTimestampPrecisionParquet`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveStorageFormatsEnvironment`. Routed by source review into
  `SuiteHiveStorageFormats` run 1.
- Tag parity: Current tags: `StorageFormats`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: none. No legacy setup method body was available.
- Action parity: Current action verbs: none. No legacy action method body was available.
- Assertion parity: Current assertion helpers: none. No legacy assertion method body was available.
- Cleanup parity: Current cleanup operations: none. No legacy cleanup method body was available.
- Any observed difference, however small: No method-specific difference identified beyond the documented framework
  baseline.
- Known intentional difference: None.
- Reviewer note: Matched by current suite selection: `SuiteHiveStorageFormats` run 1 Exact-name mapping with normalized
  body similarity `0.78`.
- Audit status: `verified`

### `TestHiveCompatibility`

- Owning migration commit: `Migrate TestHiveCompatibility to JUnit`
- Current class added in same migration commit:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestHiveCompatibility.java`
- Legacy class removed in same migration commit:
    - `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestHiveCompatibility.java`
- Class-level environment requirement: `HiveStorageFormatsEnvironment`.
- Class-level tags: `StorageFormatsDetailed`.
- Method inventory complete: Yes. Legacy methods: `4`. Current methods: `4`.
- Legacy helper/resource dependencies accounted for: Legacy class source reviewed directly.
- Intentional differences summary: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Method statuses present: `verified`.

#### Methods

##### `testInsertAllSupportedDataTypesWithTrino`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestHiveCompatibility.java` ->
  `testInsertAllSupportedDataTypesWithTrino`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestHiveCompatibility.java` ->
  `TestHiveCompatibility.testInsertAllSupportedDataTypesWithTrino`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveStorageFormatsEnvironment`. Routed by source review into
  `SuiteStorageFormatsDetailed` run 1.
- Tag parity: Current tags: `StorageFormatsDetailed`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`, `INSERT`. Legacy setup operations: `CREATE`, `INSERT`.
- Action parity: Current action verbs: `WITH`, `SELECT`. Legacy action verbs: `WITH`, `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `contains`, `containsOnly`, `row`. Legacy assertion
  helpers: `assertThat`, `contains`, `containsOnly`, `row`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: Current method uses parameter-injected environment helpers instead of Tempto
  query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Matched by current suite selection: `SuiteStorageFormatsDetailed` run 1 Exact-name mapping with
  normalized body similarity `0.95`.
- Audit status: `verified`

##### `testTimestampFieldWrittenByOptimizedParquetWriterCanBeReadByHive`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestHiveCompatibility.java` ->
  `testTimestampFieldWrittenByOptimizedParquetWriterCanBeReadByHive`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestHiveCompatibility.java` ->
  `TestHiveCompatibility.testTimestampFieldWrittenByOptimizedParquetWriterCanBeReadByHive`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveStorageFormatsEnvironment`. Routed by source review into
  `SuiteStorageFormatsDetailed` run 1.
- Tag parity: Current tags: `StorageFormatsDetailed`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`, `INSERT`. Legacy setup operations: `CREATE`, `INSERT`.
- Action parity: Current action verbs: `SELECT`. Legacy action verbs: `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `containsOnly`, `row`. Legacy assertion helpers:
  `assertThat`, `containsOnly`, `row`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: Current method uses parameter-injected environment helpers instead of Tempto
  query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Matched by current suite selection: `SuiteStorageFormatsDetailed` run 1 Exact-name mapping with
  normalized body similarity `0.81`.
- Audit status: `verified`

##### `testSmallDecimalFieldWrittenByOptimizedParquetWriterCanBeReadByHive`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestHiveCompatibility.java` ->
  `testSmallDecimalFieldWrittenByOptimizedParquetWriterCanBeReadByHive`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestHiveCompatibility.java` ->
  `TestHiveCompatibility.testSmallDecimalFieldWrittenByOptimizedParquetWriterCanBeReadByHive`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveStorageFormatsEnvironment`. Routed by source review into
  `SuiteStorageFormatsDetailed` run 1.
- Tag parity: Current tags: `StorageFormatsDetailed`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`, `INSERT`. Legacy setup operations: `CREATE`, `INSERT`.
- Action parity: Current action verbs: `SELECT`. Legacy action verbs: `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `containsOnly`, `row`. Legacy assertion helpers:
  `assertThat`, `containsOnly`, `row`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: Current method uses parameter-injected environment helpers instead of Tempto
  query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Matched by current suite selection: `SuiteStorageFormatsDetailed` run 1 Exact-name mapping with
  normalized body similarity `0.70`.
- Audit status: `verified`

##### `testTrinoHiveParquetBloomFilterCompatibility`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestHiveCompatibility.java` ->
  `testTrinoHiveParquetBloomFilterCompatibility`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestHiveCompatibility.java` ->
  `TestHiveCompatibility.testTrinoHiveParquetBloomFilterCompatibility`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveStorageFormatsEnvironment`. Routed by source review into
  `SuiteStorageFormatsDetailed` run 1.
- Tag parity: Current tags: `StorageFormatsDetailed`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`, `INSERT`. Legacy setup operations: `CREATE`, `INSERT`.
- Action parity: Current action verbs: `WITH`, `SELECT`. Legacy action verbs: `WITH`, `SELECT`.
- Assertion parity: Current assertion helpers: `assertHiveBloomFilterTableSelectResult`. Legacy assertion helpers:
  `assertHiveBloomFilterTableSelectResult`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: Current method uses parameter-injected environment helpers instead of Tempto
  query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Matched by current suite selection: `SuiteStorageFormatsDetailed` run 1 Exact-name mapping with
  normalized body similarity `0.95`.
- Audit status: `verified`

### `TestHiveConnectorKerberosSmokeTest`

- Owning migration commit: `Migrate TestHiveConnectorKerberosSmokeTest to JUnit`
- Current class added in same migration commit:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestHiveConnectorKerberosSmokeTest.java`
- Legacy class removed in same migration commit:
    - `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestHiveConnectorKerberosSmokeTest.java`
- Class-level environment requirement: `HiveKerberosEnvironment`.
- Class-level tags: `HiveKerberos`.
- Method inventory complete: Yes. Legacy methods: `1`. Current methods: `1`.
- Legacy helper/resource dependencies accounted for: Legacy class source reviewed directly.
- Intentional differences summary: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Method statuses present: `verified`.

#### Methods

##### `kerberosTicketExpiryTest`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestHiveConnectorKerberosSmokeTest.java` ->
  `kerberosTicketExpiryTest`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestHiveConnectorKerberosSmokeTest.java` ->
  `TestHiveConnectorKerberosSmokeTest.kerberosTicketExpiryTest`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveKerberosEnvironment`. Routed by source review into `SuiteHiveKerberos`
  run 1.
- Tag parity: Current tags: `HiveKerberos`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`. Legacy setup operations: `CREATE`.
- Action parity: Current action verbs: none. Legacy action verbs: none.
- Assertion parity: Current assertion helpers: `assertThat`, `hasMessageContaining`. Legacy assertion helpers:
  `assertThat`.
- Cleanup parity: Current cleanup operations: `DROP`. No legacy cleanup method body was available.
- Any observed difference, however small: SQL verb set differs: legacy ['CREATE'] vs current ['DROP', 'CREATE'].
  Assertion helper names differ between legacy and current implementations. Current method uses parameter-injected
  environment helpers instead of Tempto query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Matched by current suite selection: `SuiteHiveKerberos` run 1 Exact-name mapping with normalized body
  similarity `0.63`.
- Audit status: `verified`

### `TestHiveCreateTable`

- Owning migration commit: `Migrate TestHiveCreateTable to JUnit`
- Current class added in same migration commit:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestHiveCreateTable.java`
- Legacy class removed in same migration commit:
    - `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestHiveCreateTable.java`
- Class-level environment requirement: `HiveStorageFormatsEnvironment`.
- Class-level tags: none.
- Method inventory complete: Yes. Legacy methods: `3`. Current methods: `2`.
- Legacy helper/resource dependencies accounted for: Legacy class source reviewed directly. Cross-class or merged legacy
  coverage accounted for: `testVerifyEnvironmentHiveTransactionalByDefault` -> covered in
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestHiveTransactionalEnvironment.java` ->
  `testVerifyEnvironmentHiveTransactionalByDefault`.
- Intentional differences summary: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Method statuses present: `verified`.

#### Methods

##### `testCreateTable`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestHiveCreateTable.java` -> `testCreateTable`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestHiveCreateTable.java` ->
  `TestHiveCreateTable.testCreateTable`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveStorageFormatsEnvironment`. Routed by source review into
  `SuiteHiveStorageFormats` run 1.
- Tag parity: Current tags: `StorageFormats`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`, `INSERT`. Legacy setup operations: `CREATE`, `INSERT`.
- Action parity: Current action verbs: `SELECT`. Legacy action verbs: `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `containsOnly`, `row`. Legacy assertion helpers:
  `assertThat`, `containsOnly`, `row`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: Current method uses parameter-injected environment helpers instead of Tempto
  query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Matched by current suite selection: `SuiteHiveStorageFormats` run 1 Exact-name mapping with normalized
  body similarity `0.79`.
- Audit status: `verified`

##### `testCreateTableAsSelect`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestHiveCreateTable.java` ->
  `testCreateTableAsSelect`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestHiveCreateTable.java` ->
  `TestHiveCreateTable.testCreateTableAsSelect`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveStorageFormatsEnvironment`. Routed by source review into
  `SuiteHiveStorageFormats` run 1.
- Tag parity: Current tags: `StorageFormats`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`. Legacy setup operations: `CREATE`.
- Action parity: Current action verbs: `SELECT`. Legacy action verbs: `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `containsOnly`, `row`. Legacy assertion helpers:
  `assertThat`, `containsOnly`, `row`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: Current method uses parameter-injected environment helpers instead of Tempto
  query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Matched by current suite selection: `SuiteHiveStorageFormats` run 1 Exact-name mapping with normalized
  body similarity `0.75`.
- Audit status: `verified`

### `TestHiveHiddenFiles`

- Owning migration commit: `Migrate TestHiveHiddenFiles to JUnit`
- Current class added in same migration commit:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestHiveHiddenFiles.java`
- Legacy class removed in same migration commit:
    - `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestHiveHiddenFiles.java`
- Class-level environment requirement: `HiveBasicEnvironment`.
- Class-level tags: `HdfsNoImpersonation`.
- Method inventory complete: Yes. Legacy methods: `2`. Current methods: `2`.
- Legacy helper/resource dependencies accounted for: Legacy class source reviewed directly.
- Intentional differences summary: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Method statuses present: `verified`.

#### Methods

##### `testSelectFromTableContainingHiddenFiles`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestHiveHiddenFiles.java` ->
  `testSelectFromTableContainingHiddenFiles`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestHiveHiddenFiles.java` ->
  `TestHiveHiddenFiles.testSelectFromTableContainingHiddenFiles`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveBasicEnvironment`. Routed by source review into `SuiteHiveBasic` run
    1.
- Tag parity: Current tags: `HdfsNoImpersonation`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`, `INSERT`. Legacy setup operations: `CREATE`, `INSERT`.
- Action parity: Current action verbs: `SELECT`. Legacy action verbs: `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `containsOnly`, `row`. Legacy assertion helpers:
  `assertThat`, `containsOnly`, `row`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: Current method uses parameter-injected environment helpers instead of Tempto
  query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Matched by current suite selection: `SuiteHiveBasic` run 1 Exact-name mapping with normalized body
  similarity `0.62`.
- Audit status: `verified`

##### `testSelectFromTableContainingFilenamesWithUnderscore`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestHiveHiddenFiles.java` ->
  `testSelectFromTableContainingFilenamesWithUnderscore`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestHiveHiddenFiles.java` ->
  `TestHiveHiddenFiles.testSelectFromTableContainingFilenamesWithUnderscore`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveBasicEnvironment`. Routed by source review into `SuiteHiveBasic` run
    1.
- Tag parity: Current tags: `HdfsNoImpersonation`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`. Legacy setup operations: `CREATE`.
- Action parity: Current action verbs: `SELECT`. Legacy action verbs: `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `containsOnly`, `row`. Legacy assertion helpers:
  `assertThat`, `containsOnly`, `row`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: Current method uses parameter-injected environment helpers instead of Tempto
  query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Matched by current suite selection: `SuiteHiveBasic` run 1 Exact-name mapping with normalized body
  similarity `0.66`.
- Audit status: `verified`

### `TestHiveIgnoreAbsentPartitions`

- Owning migration commit: `Migrate TestHiveIgnoreAbsentPartitions to JUnit`
- Current class added in same migration commit:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestHiveIgnoreAbsentPartitions.java`
- Legacy class removed in same migration commit:
    - `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestHiveIgnoreAbsentPartitions.java`
- Class-level environment requirement: `HiveBasicEnvironment`.
- Class-level tags: `HdfsNoImpersonation`.
- Method inventory complete: Yes. Legacy methods: `2`. Current methods: `2`.
- Legacy helper/resource dependencies accounted for: Legacy class source reviewed directly.
- Intentional differences summary: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Method statuses present: `verified`.

#### Methods

##### `testIgnoreAbsentPartitions`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestHiveIgnoreAbsentPartitions.java` ->
  `testIgnoreAbsentPartitions`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestHiveIgnoreAbsentPartitions.java` ->
  `TestHiveIgnoreAbsentPartitions.testIgnoreAbsentPartitions`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveBasicEnvironment`. Routed by source review into `SuiteHiveBasic` run
    1.
- Tag parity: Current tags: `HdfsNoImpersonation`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`, `INSERT`. Legacy setup operations: none.
- Action parity: Current action verbs: `WITH`, `SELECT`, `CALL`. Legacy action verbs: `SELECT`, `CALL`.
- Assertion parity: Current assertion helpers: `assertThat`, `assertThatThrownBy`, `containsOnly`,
  `hasMessageContaining`, `row`. Legacy assertion helpers: `assertQueryFailure`, `assertThat`, `containsOnly`,
  `hasMessageContaining`, `row`.
- Cleanup parity: Current cleanup operations: `DROP`. No legacy cleanup method body was available.
- Any observed difference, however small: SQL verb set differs: legacy ['SELECT', 'CALL'] vs
  current ['DROP', 'CREATE', 'WITH', 'INSERT', 'SELECT', 'CALL']. Assertion helper names differ between legacy and
  current implementations. Current method uses parameter-injected environment helpers instead of Tempto query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Matched by current suite selection: `SuiteHiveBasic` run 1 Exact-name mapping with normalized body
  similarity `0.60`.
- Audit status: `verified`

##### `testShouldThrowErrorOnUnpartitionedTableMissingData`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestHiveIgnoreAbsentPartitions.java` ->
  `testShouldThrowErrorOnUnpartitionedTableMissingData`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestHiveIgnoreAbsentPartitions.java` ->
  `TestHiveIgnoreAbsentPartitions.testShouldThrowErrorOnUnpartitionedTableMissingData`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveBasicEnvironment`. Routed by source review into `SuiteHiveBasic` run
    1.
- Tag parity: Current tags: `HdfsNoImpersonation`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`. Legacy setup operations: `CREATE`.
- Action parity: Current action verbs: `SELECT`. Legacy action verbs: `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `assertThatThrownBy`, `containsOnly`,
  `hasMessageContaining`, `row`. Legacy assertion helpers: `assertQueryFailure`, `assertThat`, `containsOnly`,
  `hasMessageContaining`, `row`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: Assertion helper names differ between legacy and current implementations.
  Current method uses parameter-injected environment helpers instead of Tempto query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Matched by current suite selection: `SuiteHiveBasic` run 1 Exact-name mapping with normalized body
  similarity `0.78`.
- Audit status: `verified`

### `TestHiveMaterializedView`

- Owning migration commit: `Migrate TestHiveMaterializedView to JUnit`
- Current class added in same migration commit:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestHiveMaterializedView.java`
- Legacy class removed in same migration commit:
    - `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestHiveMaterializedView.java`
- Class-level environment requirement: `HiveStorageFormatsEnvironment`.
- Class-level tags: `StorageFormats`.
- Method inventory complete: Yes. Legacy methods: `2`. Current methods: `2`.
- Legacy helper/resource dependencies accounted for: Legacy class source reviewed directly.
- Intentional differences summary: None identified at class scope.
- Method statuses present: `verified`.

#### Methods

##### `testMaterializedView`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestHiveMaterializedView.java` ->
  `testMaterializedView`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestHiveMaterializedView.java` ->
  `TestHiveMaterializedView.testMaterializedView`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveStorageFormatsEnvironment`. Routed by source review into
  `SuiteHiveStorageFormats` run 1.
- Tag parity: Current tags: `StorageFormats`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: none. No legacy setup method body was available.
- Action parity: Current action verbs: none. No legacy action method body was available.
- Assertion parity: Current assertion helpers: none. No legacy assertion method body was available.
- Cleanup parity: Current cleanup operations: none. No legacy cleanup method body was available.
- Any observed difference, however small: No method-specific difference identified beyond the documented framework
  baseline.
- Known intentional difference: None.
- Reviewer note: Matched by current suite selection: `SuiteHiveStorageFormats` run 1 Exact-name mapping with normalized
  body similarity `0.69`.
- Audit status: `verified`

##### `testPartitionedMaterializedView`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestHiveMaterializedView.java` ->
  `testPartitionedMaterializedView`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestHiveMaterializedView.java` ->
  `TestHiveMaterializedView.testPartitionedMaterializedView`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveStorageFormatsEnvironment`. Routed by source review into
  `SuiteHiveStorageFormats` run 1.
- Tag parity: Current tags: `StorageFormats`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: none. No legacy setup method body was available.
- Action parity: Current action verbs: none. No legacy action method body was available.
- Assertion parity: Current assertion helpers: none. No legacy assertion method body was available.
- Cleanup parity: Current cleanup operations: none. No legacy cleanup method body was available.
- Any observed difference, however small: No method-specific difference identified beyond the documented framework
  baseline.
- Known intentional difference: None.
- Reviewer note: Matched by current suite selection: `SuiteHiveStorageFormats` run 1 Exact-name mapping with normalized
  body similarity `0.73`.
- Audit status: `verified`

### `TestHiveOnOrcLegacyDateCompatibility`

- Owning migration commit: `Migrate TestHiveOnOrcLegacyDateCompatibility to JUnit`
- Current class added in same migration commit:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestHiveOnOrcLegacyDateCompatibility.java`
- Legacy class removed in same migration commit:
    - `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestHiveOnOrcLegacyDateCompatibility.java`
- Class-level environment requirement: `MultinodeHive4Environment`.
- Class-level tags: `Hive4`.
- Method inventory complete: Yes. Legacy methods: `2`. Current methods: `2`.
- Legacy helper/resource dependencies accounted for: Legacy class source reviewed directly.
- Intentional differences summary: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Method statuses present: `verified`.

#### Methods

##### `testReadLegacyDateFromOrcWrittenByTrino`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestHiveOnOrcLegacyDateCompatibility.java` ->
  `testReadLegacyDateFromOrcWrittenByTrino`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestHiveOnOrcLegacyDateCompatibility.java` ->
  `TestHiveOnOrcLegacyDateCompatibility.testReadLegacyDateFromOrcWrittenByTrino`
- Mapping type: `direct`
- Environment parity: Current class requires `MultinodeHive4Environment`. Routed by source review into `SuiteHive4` run
    1.
- Tag parity: Current tags: `Hive4`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`, `INSERT`. Legacy setup operations: `CREATE`, `INSERT`.
- Action parity: Current action verbs: `SELECT`. Legacy action verbs: `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `containsOnly`, `row`. Legacy assertion helpers:
  `assertThat`, `containsOnly`, `row`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: Current method uses parameter-injected environment helpers instead of Tempto
  query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Matched by current suite selection: `SuiteHive4` run 1 Exact-name mapping with normalized body
  similarity `0.94`.
- Audit status: `verified`

##### `testReadLegacyDateFromOrcWrittenByHive`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestHiveOnOrcLegacyDateCompatibility.java` ->
  `testReadLegacyDateFromOrcWrittenByHive`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestHiveOnOrcLegacyDateCompatibility.java` ->
  `TestHiveOnOrcLegacyDateCompatibility.testReadLegacyDateFromOrcWrittenByHive`
- Mapping type: `direct`
- Environment parity: Current class requires `MultinodeHive4Environment`. Routed by source review into `SuiteHive4` run
    1.
- Tag parity: Current tags: `Hive4`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`, `INSERT`. Legacy setup operations: `CREATE`, `INSERT`.
- Action parity: Current action verbs: `SELECT`. Legacy action verbs: `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `containsOnly`, `row`. Legacy assertion helpers:
  `assertThat`, `containsOnly`, `row`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: Current method uses parameter-injected environment helpers instead of Tempto
  query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Matched by current suite selection: `SuiteHive4` run 1 Exact-name mapping with normalized body
  similarity `0.94`.
- Audit status: `verified`

### `TestHivePartitionSchemaEvolution`

- Owning migration commit: `Migrate TestHivePartitionSchemaEvolution to JUnit`
- Current class added in same migration commit:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestHivePartitionSchemaEvolution.java`
- Legacy class removed in same migration commit:
    - `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestHivePartitionSchemaEvolution.java`
- Class-level environment requirement: `HiveBasicEnvironment`.
- Class-level tags: `HdfsNoImpersonation`.
- Method inventory complete: Yes. Legacy methods: `2`. Current methods: `1`.
- Legacy helper/resource dependencies accounted for: Legacy class source reviewed directly. Cross-class or merged legacy
  coverage accounted for: `testOrc` -> merged into parameterized `testPartitionSchemaEvolution`; `testParquet` -> merged
  into parameterized `testPartitionSchemaEvolution`.
- Intentional differences summary: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Method statuses present: `verified`.

#### Methods

##### `testPartitionSchemaEvolution`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestHivePartitionSchemaEvolution.java` ->
  `testParquet`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestHivePartitionSchemaEvolution.java` ->
  `TestHivePartitionSchemaEvolution.testPartitionSchemaEvolution`
- Mapping type: `merged`
- Environment parity: Current class requires `HiveBasicEnvironment`. Routed by source review into `SuiteHiveBasic` run
    1.
- Tag parity: Current tags: `HdfsNoImpersonation`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `ALTER`. No legacy setup method body was available.
- Action parity: Current action verbs: none. No legacy action method body was available.
- Assertion parity: Current assertion helpers: `row`. No legacy assertion method body was available.
- Cleanup parity: Current cleanup operations: `DROP`. No legacy cleanup method body was available.
- Any observed difference, however small: Legacy `testParquet` and `testOrc` were merged into one parameterized JUnit
  method over the same two formats.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Matched by current suite selection: `SuiteHiveBasic` run 1
- Audit status: `verified`

### `TestHivePartitionsTable`

- Owning migration commit: `Migrate TestHivePartitionsTable to JUnit`
- Current class added in same migration commit:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestHivePartitionsTable.java`
- Legacy class removed in same migration commit:
    - `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestHivePartitionsTable.java`
- Class-level environment requirement: `HiveBasicEnvironment`.
- Class-level tags: `HdfsNoImpersonation`.
- Method inventory complete: Yes. Legacy methods: `3`. Current methods: `3`.
- Legacy helper/resource dependencies accounted for: Legacy class source reviewed directly.
- Intentional differences summary: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Method statuses present: `verified`.

#### Methods

##### `testShowPartitionsFromHiveTable`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestHivePartitionsTable.java` ->
  `testShowPartitionsFromHiveTable`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestHivePartitionsTable.java` ->
  `TestHivePartitionsTable.testShowPartitionsFromHiveTable`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveBasicEnvironment`. Routed by source review into `SuiteHiveBasic` run
    1.
- Tag parity: Current tags: `HdfsNoImpersonation`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: none. Legacy setup operations: none.
- Action parity: Current action verbs: `SELECT`. Legacy action verbs: `SELECT`.
- Assertion parity: Current assertion helpers: `assertColumnNames`, `assertThat`, `assertThatThrownBy`,
  `hasMessageContaining`, `row`. Legacy assertion helpers: `assertColumnNames`, `assertQueryFailure`, `assertThat`,
  `hasMessageContaining`, `row`.
- Cleanup parity: Current cleanup operations: `DROP`. No legacy cleanup method body was available.
- Any observed difference, however small: Normalized body similarity is low (`0.07`), so fidelity was judged from
  SQL/helper/assertion shape instead of raw text. SQL verb set differs: legacy ['SELECT'] vs current ['SELECT', 'DROP'].
  Assertion helper names differ between legacy and current implementations. Current method uses parameter-injected
  environment helpers instead of Tempto query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Matched by current suite selection: `SuiteHiveBasic` run 1 Exact-name mapping with normalized body
  similarity `0.07`.
- Audit status: `verified`

##### `testShowPartitionsFromUnpartitionedTable`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestHivePartitionsTable.java` ->
  `testShowPartitionsFromUnpartitionedTable`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestHivePartitionsTable.java` ->
  `TestHivePartitionsTable.testShowPartitionsFromUnpartitionedTable`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveBasicEnvironment`. Routed by source review into `SuiteHiveBasic` run
    1.
- Tag parity: Current tags: `HdfsNoImpersonation`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: none. Legacy setup operations: none.
- Action parity: Current action verbs: `SELECT`. Legacy action verbs: `SELECT`.
- Assertion parity: Current assertion helpers: `assertThatThrownBy`. Legacy assertion helpers: `assertQueryFailure`.
- Cleanup parity: Current cleanup operations: `DROP`. No legacy cleanup method body was available.
- Any observed difference, however small: Normalized body similarity is low (`0.51`), so fidelity was judged from
  SQL/helper/assertion shape instead of raw text. SQL verb set differs: legacy ['SELECT'] vs current ['SELECT', 'DROP'].
  Assertion helper names differ between legacy and current implementations. Current method uses parameter-injected
  environment helpers instead of Tempto query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Matched by current suite selection: `SuiteHiveBasic` run 1 Exact-name mapping with normalized body
  similarity `0.51`.
- Audit status: `verified`

##### `testShowPartitionsFromHiveTableWithTooManyPartitions`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestHivePartitionsTable.java` ->
  `testShowPartitionsFromHiveTableWithTooManyPartitions`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestHivePartitionsTable.java` ->
  `TestHivePartitionsTable.testShowPartitionsFromHiveTableWithTooManyPartitions`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveBasicEnvironment`. Routed by source review into `SuiteHiveBasic` run
    1.
- Tag parity: Current tags: `HdfsNoImpersonation`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: none. Legacy setup operations: none.
- Action parity: Current action verbs: `SELECT`. Legacy action verbs: `SELECT`.
- Assertion parity: Current assertion helpers: `assertColumnNames`, `assertThat`, `assertThatThrownBy`, `row`. Legacy
  assertion helpers: `assertColumnNames`, `assertThat`, `assertThatThrownBy`, `row`.
- Cleanup parity: Current cleanup operations: `DROP`. No legacy cleanup method body was available.
- Any observed difference, however small: SQL verb set differs: legacy ['SELECT'] vs current ['SELECT', 'DROP']. Current
  method uses parameter-injected environment helpers instead of Tempto query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Matched by current suite selection: `SuiteHiveBasic` run 1 Exact-name mapping with normalized body
  similarity `0.78`.
- Audit status: `verified`

### `TestHivePropertiesTable`

- Owning migration commit: `Migrate TestHivePropertiesTable to JUnit`
- Current class added in same migration commit:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestHivePropertiesTable.java`
- Legacy class removed in same migration commit:
    - `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestHivePropertiesTable.java`
- Class-level environment requirement: `HiveBasicEnvironment`.
- Class-level tags: `HdfsNoImpersonation`.
- Method inventory complete: Yes. Legacy methods: `2`. Current methods: `2`.
- Legacy helper/resource dependencies accounted for: Legacy class source reviewed directly.
- Intentional differences summary: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Method statuses present: `verified`.

#### Methods

##### `testTrinoViewPropertiesTable`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestHivePropertiesTable.java` ->
  `testTrinoViewPropertiesTable`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestHivePropertiesTable.java` ->
  `TestHivePropertiesTable.testTrinoViewPropertiesTable`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveBasicEnvironment`. Routed by source review into `SuiteHiveBasic` run
    1.
- Tag parity: Current tags: `HdfsNoImpersonation`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`. Legacy setup operations: `CREATE`.
- Action parity: Current action verbs: `SHOW`, `SELECT`. Legacy action verbs: `SHOW`, `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `containsOnly`, `row`. Legacy assertion helpers:
  `assertThat`, `containsOnly`, `row`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: Current method uses parameter-injected environment helpers instead of Tempto
  query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Matched by current suite selection: `SuiteHiveBasic` run 1 Exact-name mapping with normalized body
  similarity `0.84`.
- Audit status: `verified`

##### `testHiveViewPropertiesTable`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestHivePropertiesTable.java` ->
  `testHiveViewPropertiesTable`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestHivePropertiesTable.java` ->
  `TestHivePropertiesTable.testHiveViewPropertiesTable`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveBasicEnvironment`. Routed by source review into `SuiteHiveBasic` run
    1.
- Tag parity: Current tags: `HdfsNoImpersonation`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`. Legacy setup operations: `CREATE`.
- Action parity: Current action verbs: `SHOW`, `SELECT`. Legacy action verbs: `SHOW`, `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `contains`, `row`. Legacy assertion helpers: `assertThat`,
  `contains`, `row`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: Current method uses parameter-injected environment helpers instead of Tempto
  query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Matched by current suite selection: `SuiteHiveBasic` run 1 Exact-name mapping with normalized body
  similarity `0.56`.
- Audit status: `verified`

### `TestHiveRedirectionToHudi`

- Owning migration commit: `Migrate TestHiveRedirectionToHudi to JUnit`
- Current class added in same migration commit:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestHiveRedirectionToHudi.java`
- Legacy class removed in same migration commit:
    - `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestHiveRedirectionToHudi.java`
- Class-level environment requirement: `HiveHudiRedirectionsEnvironment`.
- Class-level tags: `HiveHudiRedirections`.
- Method inventory complete: Yes. Legacy methods: `17`. Current methods: `17`.
- Legacy helper/resource dependencies accounted for: Legacy class source reviewed directly.
- Intentional differences summary: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Method statuses present: `verified`.

#### Methods

##### `testRedirect`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestHiveRedirectionToHudi.java` ->
  `testRedirect`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestHiveRedirectionToHudi.java` ->
  `TestHiveRedirectionToHudi.testRedirect`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveHudiRedirectionsEnvironment`. Routed by source review into `SuiteHudi`
  run 2.
- Tag parity: Current tags: `HiveHudiRedirections`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: none. Legacy setup operations: none.
- Action parity: Current action verbs: none. Legacy action verbs: none.
- Assertion parity: Current assertion helpers: `assertResultsEqual`. Legacy assertion helpers: `assertResultsEqual`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: Current method uses parameter-injected environment helpers instead of Tempto
  query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Matched by current suite selection: `SuiteHudi` run 2 Exact-name mapping with normalized body
  similarity `0.88`.
- Audit status: `verified`

##### `testRedirectWithNonDefaultSchema`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestHiveRedirectionToHudi.java` ->
  `testRedirectWithNonDefaultSchema`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestHiveRedirectionToHudi.java` ->
  `TestHiveRedirectionToHudi.testRedirectWithNonDefaultSchema`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveHudiRedirectionsEnvironment`. Routed by source review into `SuiteHudi`
  run 2.
- Tag parity: Current tags: `HiveHudiRedirections`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`. Legacy setup operations: `CREATE`.
- Action parity: Current action verbs: none. Legacy action verbs: none.
- Assertion parity: Current assertion helpers: `assertResultsEqual`. Legacy assertion helpers: `assertResultsEqual`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: Normalized body similarity is low (`0.35`), so fidelity was judged from
  SQL/helper/assertion shape instead of raw text. Current method uses parameter-injected environment helpers instead of
  Tempto query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Matched by current suite selection: `SuiteHudi` run 2 Exact-name mapping with normalized body
  similarity `0.35`.
- Audit status: `verified`

##### `testRedirectToNonexistentCatalog`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestHiveRedirectionToHudi.java` ->
  `testRedirectToNonexistentCatalog`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestHiveRedirectionToHudi.java` ->
  `TestHiveRedirectionToHudi.testRedirectToNonexistentCatalog`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveHudiRedirectionsEnvironment`. Routed by source review into `SuiteHudi`
  run 2.
- Tag parity: Current tags: `HiveHudiRedirections`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: none. Legacy setup operations: none.
- Action parity: Current action verbs: none. Legacy action verbs: none.
- Assertion parity: Current assertion helpers: `assertResultsEqual`, `assertThatThrownBy`. Legacy assertion helpers:
  `assertQueryFailure`, `assertResultsEqual`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: Assertion helper names differ between legacy and current implementations.
  Current method uses parameter-injected environment helpers instead of Tempto query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Matched by current suite selection: `SuiteHudi` run 2 Exact-name mapping with normalized body
  similarity `0.85`.
- Audit status: `verified`

##### `testRedirectWithDefaultSchemaInSession`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestHiveRedirectionToHudi.java` ->
  `testRedirectWithDefaultSchemaInSession`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestHiveRedirectionToHudi.java` ->
  `TestHiveRedirectionToHudi.testRedirectWithDefaultSchemaInSession`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveHudiRedirectionsEnvironment`. Routed by source review into `SuiteHudi`
  run 2.
- Tag parity: Current tags: `HiveHudiRedirections`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: none. Legacy setup operations: none.
- Action parity: Current action verbs: none. Legacy action verbs: none.
- Assertion parity: Current assertion helpers: `assertResultsEqual`. Legacy assertion helpers: `assertResultsEqual`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: Current method uses parameter-injected environment helpers instead of Tempto
  query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Matched by current suite selection: `SuiteHudi` run 2 Exact-name mapping with normalized body
  similarity `0.84`.
- Audit status: `verified`

##### `testRedirectPartitionsToUnpartitioned`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestHiveRedirectionToHudi.java` ->
  `testRedirectPartitionsToUnpartitioned`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestHiveRedirectionToHudi.java` ->
  `TestHiveRedirectionToHudi.testRedirectPartitionsToUnpartitioned`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveHudiRedirectionsEnvironment`. Routed by source review into `SuiteHudi`
  run 2.
- Tag parity: Current tags: `HiveHudiRedirections`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: none. Legacy setup operations: none.
- Action parity: Current action verbs: `SELECT`. Legacy action verbs: `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `containsOnly`, `row`. Legacy assertion helpers:
  `assertThat`, `containsOnly`, `row`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: Current method uses parameter-injected environment helpers instead of Tempto
  query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Matched by current suite selection: `SuiteHudi` run 2 Exact-name mapping with normalized body
  similarity `0.86`.
- Audit status: `verified`

##### `testRedirectPartitionsToPartitioned`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestHiveRedirectionToHudi.java` ->
  `testRedirectPartitionsToPartitioned`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestHiveRedirectionToHudi.java` ->
  `TestHiveRedirectionToHudi.testRedirectPartitionsToPartitioned`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveHudiRedirectionsEnvironment`. Routed by source review into `SuiteHudi`
  run 2.
- Tag parity: Current tags: `HiveHudiRedirections`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: none. Legacy setup operations: none.
- Action parity: Current action verbs: `SELECT`. Legacy action verbs: `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `containsOnly`, `row`. Legacy assertion helpers:
  `assertThat`, `containsOnly`, `row`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: Current method uses parameter-injected environment helpers instead of Tempto
  query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Matched by current suite selection: `SuiteHudi` run 2 Exact-name mapping with normalized body
  similarity `0.90`.
- Audit status: `verified`

##### `testInsert`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestHiveRedirectionToHudi.java` -> `testInsert`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestHiveRedirectionToHudi.java` ->
  `TestHiveRedirectionToHudi.testInsert`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveHudiRedirectionsEnvironment`. Routed by source review into `SuiteHudi`
  run 2.
- Tag parity: Current tags: `HiveHudiRedirections`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `INSERT`. Legacy setup operations: `INSERT`.
- Action parity: Current action verbs: none. Legacy action verbs: none.
- Assertion parity: Current assertion helpers: `assertThatThrownBy`. Legacy assertion helpers: `assertQueryFailure`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: Assertion helper names differ between legacy and current implementations.
  Current method uses parameter-injected environment helpers instead of Tempto query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Matched by current suite selection: `SuiteHudi` run 2 Exact-name mapping with normalized body
  similarity `0.84`.
- Audit status: `verified`

##### `testDelete`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestHiveRedirectionToHudi.java` -> `testDelete`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestHiveRedirectionToHudi.java` ->
  `TestHiveRedirectionToHudi.testDelete`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveHudiRedirectionsEnvironment`. Routed by source review into `SuiteHudi`
  run 2.
- Tag parity: Current tags: `HiveHudiRedirections`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: none. Legacy setup operations: none.
- Action parity: Current action verbs: none. Legacy action verbs: none.
- Assertion parity: Current assertion helpers: `assertThatThrownBy`. Legacy assertion helpers: `assertQueryFailure`.
- Cleanup parity: Current cleanup operations: `DELETE`, `DROP`. Legacy cleanup operations: `DELETE`, `DROP`.
- Any observed difference, however small: Assertion helper names differ between legacy and current implementations.
  Current method uses parameter-injected environment helpers instead of Tempto query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Matched by current suite selection: `SuiteHudi` run 2 Exact-name mapping with normalized body
  similarity `0.85`.
- Audit status: `verified`

##### `testUpdate`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestHiveRedirectionToHudi.java` -> `testUpdate`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestHiveRedirectionToHudi.java` ->
  `TestHiveRedirectionToHudi.testUpdate`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveHudiRedirectionsEnvironment`. Routed by source review into `SuiteHudi`
  run 2.
- Tag parity: Current tags: `HiveHudiRedirections`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `UPDATE`. Legacy setup operations: `UPDATE`.
- Action parity: Current action verbs: none. Legacy action verbs: none.
- Assertion parity: Current assertion helpers: `assertThatThrownBy`. Legacy assertion helpers: `assertQueryFailure`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: Assertion helper names differ between legacy and current implementations.
  Current method uses parameter-injected environment helpers instead of Tempto query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Matched by current suite selection: `SuiteHudi` run 2 Exact-name mapping with normalized body
  similarity `0.85`.
- Audit status: `verified`

##### `testMerge`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestHiveRedirectionToHudi.java` -> `testMerge`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestHiveRedirectionToHudi.java` ->
  `TestHiveRedirectionToHudi.testMerge`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveHudiRedirectionsEnvironment`. Routed by source review into `SuiteHudi`
  run 2.
- Tag parity: Current tags: `HiveHudiRedirections`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: none. Legacy setup operations: none.
- Action parity: Current action verbs: `MERGE`. Legacy action verbs: `MERGE`.
- Assertion parity: Current assertion helpers: `assertThatThrownBy`. Legacy assertion helpers: `assertQueryFailure`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: Assertion helper names differ between legacy and current implementations.
  Current method uses parameter-injected environment helpers instead of Tempto query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Matched by current suite selection: `SuiteHudi` run 2 Exact-name mapping with normalized body
  similarity `0.90`.
- Audit status: `verified`

##### `testDropTable`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestHiveRedirectionToHudi.java` ->
  `testDropTable`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestHiveRedirectionToHudi.java` ->
  `TestHiveRedirectionToHudi.testDropTable`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveHudiRedirectionsEnvironment`. Routed by source review into `SuiteHudi`
  run 2.
- Tag parity: Current tags: `HiveHudiRedirections`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: none. Legacy setup operations: none.
- Action parity: Current action verbs: none. Legacy action verbs: none.
- Assertion parity: Current assertion helpers: `assertThatThrownBy`. Legacy assertion helpers: `assertQueryFailure`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: Assertion helper names differ between legacy and current implementations.
  Current method uses parameter-injected environment helpers instead of Tempto query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Matched by current suite selection: `SuiteHudi` run 2 Exact-name mapping with normalized body
  similarity `0.73`.
- Audit status: `verified`

##### `testDescribe`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestHiveRedirectionToHudi.java` ->
  `testDescribe`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestHiveRedirectionToHudi.java` ->
  `TestHiveRedirectionToHudi.testDescribe`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveHudiRedirectionsEnvironment`. Routed by source review into `SuiteHudi`
  run 2.
- Tag parity: Current tags: `HiveHudiRedirections`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: none. Legacy setup operations: none.
- Action parity: Current action verbs: `DESCRIBE`. Legacy action verbs: `DESCRIBE`.
- Assertion parity: Current assertion helpers: `assertResultsEqual`. Legacy assertion helpers: `assertResultsEqual`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: Current method uses parameter-injected environment helpers instead of Tempto
  query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Matched by current suite selection: `SuiteHudi` run 2 Exact-name mapping with normalized body
  similarity `0.89`.
- Audit status: `verified`

##### `testShowGrants`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestHiveRedirectionToHudi.java` ->
  `testShowGrants`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestHiveRedirectionToHudi.java` ->
  `TestHiveRedirectionToHudi.testShowGrants`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveHudiRedirectionsEnvironment`. Routed by source review into `SuiteHudi`
  run 2.
- Tag parity: Current tags: `HiveHudiRedirections`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: none. Legacy setup operations: none.
- Action parity: Current action verbs: `SHOW`. Legacy action verbs: `SHOW`.
- Assertion parity: Current assertion helpers: `assertThatThrownBy`. Legacy assertion helpers: `assertQueryFailure`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: Assertion helper names differ between legacy and current implementations.
  Current method uses parameter-injected environment helpers instead of Tempto query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Matched by current suite selection: `SuiteHudi` run 2 Exact-name mapping with normalized body
  similarity `0.88`.
- Audit status: `verified`

##### `testGrant`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestHiveRedirectionToHudi.java` -> `testGrant`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestHiveRedirectionToHudi.java` ->
  `TestHiveRedirectionToHudi.testGrant`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveHudiRedirectionsEnvironment`. Routed by source review into `SuiteHudi`
  run 2.
- Tag parity: Current tags: `HiveHudiRedirections`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: none. Legacy setup operations: none.
- Action parity: Current action verbs: none. Legacy action verbs: none.
- Assertion parity: Current assertion helpers: `assertThatThrownBy`. Legacy assertion helpers: `assertQueryFailure`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: Assertion helper names differ between legacy and current implementations.
  Current method uses parameter-injected environment helpers instead of Tempto query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Matched by current suite selection: `SuiteHudi` run 2 Exact-name mapping with normalized body
  similarity `0.87`.
- Audit status: `verified`

##### `testRevoke`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestHiveRedirectionToHudi.java` -> `testRevoke`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestHiveRedirectionToHudi.java` ->
  `TestHiveRedirectionToHudi.testRevoke`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveHudiRedirectionsEnvironment`. Routed by source review into `SuiteHudi`
  run 2.
- Tag parity: Current tags: `HiveHudiRedirections`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: none. Legacy setup operations: none.
- Action parity: Current action verbs: none. Legacy action verbs: none.
- Assertion parity: Current assertion helpers: `assertThatThrownBy`. Legacy assertion helpers: `assertQueryFailure`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: Assertion helper names differ between legacy and current implementations.
  Current method uses parameter-injected environment helpers instead of Tempto query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Matched by current suite selection: `SuiteHudi` run 2 Exact-name mapping with normalized body
  similarity `0.87`.
- Audit status: `verified`

##### `testSetTableAuthorization`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestHiveRedirectionToHudi.java` ->
  `testSetTableAuthorization`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestHiveRedirectionToHudi.java` ->
  `TestHiveRedirectionToHudi.testSetTableAuthorization`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveHudiRedirectionsEnvironment`. Routed by source review into `SuiteHudi`
  run 2.
- Tag parity: Current tags: `HiveHudiRedirections`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `ALTER`. Legacy setup operations: `ALTER`.
- Action parity: Current action verbs: none. Legacy action verbs: none.
- Assertion parity: Current assertion helpers: `assertThatThrownBy`. Legacy assertion helpers: `assertQueryFailure`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: Assertion helper names differ between legacy and current implementations.
  Current method uses parameter-injected environment helpers instead of Tempto query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Matched by current suite selection: `SuiteHudi` run 2 Exact-name mapping with normalized body
  similarity `0.88`.
- Audit status: `verified`

##### `testDeny`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestHiveRedirectionToHudi.java` -> `testDeny`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestHiveRedirectionToHudi.java` ->
  `TestHiveRedirectionToHudi.testDeny`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveHudiRedirectionsEnvironment`. Routed by source review into `SuiteHudi`
  run 2.
- Tag parity: Current tags: `HiveHudiRedirections`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: none. Legacy setup operations: none.
- Action parity: Current action verbs: none. Legacy action verbs: none.
- Assertion parity: Current assertion helpers: `assertThatThrownBy`. Legacy assertion helpers: `assertQueryFailure`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: Assertion helper names differ between legacy and current implementations.
  Current method uses parameter-injected environment helpers instead of Tempto query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Matched by current suite selection: `SuiteHudi` run 2 Exact-name mapping with normalized body
  similarity `0.87`.
- Audit status: `verified`

### `TestHiveRedirectionToIceberg`

- Owning migration commit: `Migrate TestHiveRedirectionToIceberg to JUnit`
- Current class added in same migration commit:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestHiveRedirectionToIceberg.java`
- Legacy class removed in same migration commit:
    - `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestHiveRedirectionToIceberg.java`
- Class-level environment requirement: `HiveIcebergRedirectionsEnvironment`.
- Class-level tags: `HiveIcebergRedirections`.
- Method inventory complete: Yes. Legacy methods: `27`. Current methods: `27`.
- Legacy helper/resource dependencies accounted for: Legacy class source reviewed directly.
- Intentional differences summary: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Method statuses present: `verified`.

#### Methods

##### `testRedirect`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestHiveRedirectionToIceberg.java` ->
  `testRedirect`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestHiveRedirectionToIceberg.java` ->
  `TestHiveRedirectionToIceberg.testRedirect`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveIcebergRedirectionsEnvironment`. Routed by source review into
  `SuiteIceberg` run 2.
- Tag parity: Current tags: `HiveIcebergRedirections`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`. Legacy setup operations: none.
- Action parity: Current action verbs: none. Legacy action verbs: none.
- Assertion parity: Current assertion helpers: `assertResultsEqual`. Legacy assertion helpers: `assertResultsEqual`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: SQL verb set differs: legacy ['DROP'] vs current ['CREATE', 'DROP']. Current
  method uses parameter-injected environment helpers instead of Tempto query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Matched by current suite selection: `SuiteIceberg` run 2 Exact-name mapping with normalized body
  similarity `0.71`.
- Audit status: `verified`

##### `testRedirectWithNonDefaultSchema`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestHiveRedirectionToIceberg.java` ->
  `testRedirectWithNonDefaultSchema`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestHiveRedirectionToIceberg.java` ->
  `TestHiveRedirectionToIceberg.testRedirectWithNonDefaultSchema`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveIcebergRedirectionsEnvironment`. Routed by source review into
  `SuiteIceberg` run 2.
- Tag parity: Current tags: `HiveIcebergRedirections`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`. Legacy setup operations: none.
- Action parity: Current action verbs: none. Legacy action verbs: none.
- Assertion parity: Current assertion helpers: `assertResultsEqual`. Legacy assertion helpers: `assertResultsEqual`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: SQL verb set differs: legacy ['DROP'] vs current ['CREATE', 'DROP']. Current
  method uses parameter-injected environment helpers instead of Tempto query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Matched by current suite selection: `SuiteIceberg` run 2 Exact-name mapping with normalized body
  similarity `0.71`.
- Audit status: `verified`

##### `testRedirectToNonexistentCatalog`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestHiveRedirectionToIceberg.java` ->
  `testRedirectToNonexistentCatalog`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestHiveRedirectionToIceberg.java` ->
  `TestHiveRedirectionToIceberg.testRedirectToNonexistentCatalog`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveIcebergRedirectionsEnvironment`. Routed by source review into
  `SuiteIceberg` run 2.
- Tag parity: Current tags: `HiveIcebergRedirections`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`. Legacy setup operations: none.
- Action parity: Current action verbs: none. Legacy action verbs: none.
- Assertion parity: Current assertion helpers: `assertResultsEqual`, `assertThatThrownBy`. Legacy assertion helpers:
  `assertQueryFailure`, `assertResultsEqual`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: SQL verb set differs: legacy ['DROP'] vs current ['CREATE', 'DROP']. Assertion
  helper names differ between legacy and current implementations. Current method uses parameter-injected environment
  helpers instead of Tempto query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Matched by current suite selection: `SuiteIceberg` run 2 Exact-name mapping with normalized body
  similarity `0.74`.
- Audit status: `verified`

##### `testRedirectWithDefaultSchemaInSession`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestHiveRedirectionToIceberg.java` ->
  `testRedirectWithDefaultSchemaInSession`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestHiveRedirectionToIceberg.java` ->
  `TestHiveRedirectionToIceberg.testRedirectWithDefaultSchemaInSession`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveIcebergRedirectionsEnvironment`. Routed by source review into
  `SuiteIceberg` run 2.
- Tag parity: Current tags: `HiveIcebergRedirections`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`. Legacy setup operations: none.
- Action parity: Current action verbs: none. Legacy action verbs: none.
- Assertion parity: Current assertion helpers: `assertResultsEqual`. Legacy assertion helpers: `assertResultsEqual`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: SQL verb set differs: legacy ['DROP'] vs current ['CREATE', 'DROP']. Current
  method uses parameter-injected environment helpers instead of Tempto query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Matched by current suite selection: `SuiteIceberg` run 2 Exact-name mapping with normalized body
  similarity `0.70`.
- Audit status: `verified`

##### `testRedirectPartitionsToUnpartitioned`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestHiveRedirectionToIceberg.java` ->
  `testRedirectPartitionsToUnpartitioned`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestHiveRedirectionToIceberg.java` ->
  `TestHiveRedirectionToIceberg.testRedirectPartitionsToUnpartitioned`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveIcebergRedirectionsEnvironment`. Routed by source review into
  `SuiteIceberg` run 2.
- Tag parity: Current tags: `HiveIcebergRedirections`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`. Legacy setup operations: none.
- Action parity: Current action verbs: `SELECT`. Legacy action verbs: `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `containsOnly`, `row`. Legacy assertion helpers:
  `assertThat`, `containsOnly`, `row`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: SQL verb set differs: legacy ['SELECT', 'DROP'] vs
  current ['CREATE', 'SELECT', 'DROP']. Current method uses parameter-injected environment helpers instead of Tempto
  query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Matched by current suite selection: `SuiteIceberg` run 2 Exact-name mapping with normalized body
  similarity `0.79`.
- Audit status: `verified`

##### `testRedirectPartitionsToPartitioned`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestHiveRedirectionToIceberg.java` ->
  `testRedirectPartitionsToPartitioned`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestHiveRedirectionToIceberg.java` ->
  `TestHiveRedirectionToIceberg.testRedirectPartitionsToPartitioned`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveIcebergRedirectionsEnvironment`. Routed by source review into
  `SuiteIceberg` run 2.
- Tag parity: Current tags: `HiveIcebergRedirections`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`. Legacy setup operations: none.
- Action parity: Current action verbs: `SELECT`. Legacy action verbs: `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `containsOnly`, `row`. Legacy assertion helpers:
  `assertThat`, `containsOnly`, `row`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: SQL verb set differs: legacy ['SELECT', 'DROP'] vs
  current ['CREATE', 'SELECT', 'DROP']. Current method uses parameter-injected environment helpers instead of Tempto
  query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Matched by current suite selection: `SuiteIceberg` run 2 Exact-name mapping with normalized body
  similarity `0.84`.
- Audit status: `verified`

##### `testInsert`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestHiveRedirectionToIceberg.java` ->
  `testInsert`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestHiveRedirectionToIceberg.java` ->
  `TestHiveRedirectionToIceberg.testInsert`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveIcebergRedirectionsEnvironment`. Routed by source review into
  `SuiteIceberg` run 2.
- Tag parity: Current tags: `HiveIcebergRedirections`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`, `INSERT`. Legacy setup operations: `INSERT`.
- Action parity: Current action verbs: none. Legacy action verbs: none.
- Assertion parity: Current assertion helpers: `assertThat`, `containsOnly`, `row`. Legacy assertion helpers:
  `assertThat`, `containsOnly`, `row`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: SQL verb set differs: legacy ['INSERT', 'DROP'] vs
  current ['CREATE', 'INSERT', 'DROP']. Current method uses parameter-injected environment helpers instead of Tempto
  query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Matched by current suite selection: `SuiteIceberg` run 2 Exact-name mapping with normalized body
  similarity `0.79`.
- Audit status: `verified`

##### `testDelete`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestHiveRedirectionToIceberg.java` ->
  `testDelete`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestHiveRedirectionToIceberg.java` ->
  `TestHiveRedirectionToIceberg.testDelete`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveIcebergRedirectionsEnvironment`. Routed by source review into
  `SuiteIceberg` run 2.
- Tag parity: Current tags: `HiveIcebergRedirections`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`. Legacy setup operations: none.
- Action parity: Current action verbs: `SELECT`. Legacy action verbs: `SELECT`.
- Assertion parity: Current assertion helpers: `assertResultsEqual`. Legacy assertion helpers: `assertResultsEqual`.
- Cleanup parity: Current cleanup operations: `DELETE`, `DROP`. Legacy cleanup operations: `DELETE`, `DROP`.
- Any observed difference, however small: SQL verb set differs: legacy ['DELETE', 'SELECT', 'DROP'] vs
  current ['CREATE', 'DELETE', 'SELECT', 'DROP']. Current method uses parameter-injected environment helpers instead of
  Tempto query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Matched by current suite selection: `SuiteIceberg` run 2 Exact-name mapping with normalized body
  similarity `0.75`.
- Audit status: `verified`

##### `testUpdate`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestHiveRedirectionToIceberg.java` ->
  `testUpdate`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestHiveRedirectionToIceberg.java` ->
  `TestHiveRedirectionToIceberg.testUpdate`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveIcebergRedirectionsEnvironment`. Routed by source review into
  `SuiteIceberg` run 2.
- Tag parity: Current tags: `HiveIcebergRedirections`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`, `UPDATE`. Legacy setup operations: `UPDATE`.
- Action parity: Current action verbs: `SELECT`. Legacy action verbs: `SELECT`.
- Assertion parity: Current assertion helpers: `assertResultsEqual`, `assertThat`, `isEqualTo`. Legacy assertion
  helpers: `assertResultsEqual`, `assertThat`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: SQL verb set differs: legacy ['UPDATE', 'SELECT', 'DROP'] vs
  current ['CREATE', 'UPDATE', 'SELECT', 'DROP']. Assertion helper names differ between legacy and current
  implementations. Current method uses parameter-injected environment helpers instead of Tempto query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Matched by current suite selection: `SuiteIceberg` run 2 Exact-name mapping with normalized body
  similarity `0.77`.
- Audit status: `verified`

##### `testMerge`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestHiveRedirectionToIceberg.java` ->
  `testMerge`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestHiveRedirectionToIceberg.java` ->
  `TestHiveRedirectionToIceberg.testMerge`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveIcebergRedirectionsEnvironment`. Routed by source review into
  `SuiteIceberg` run 2.
- Tag parity: Current tags: `HiveIcebergRedirections`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`. Legacy setup operations: none.
- Action parity: Current action verbs: `MERGE`. Legacy action verbs: `MERGE`.
- Assertion parity: Current assertion helpers: `assertResultsEqual`, `assertThat`, `isEqualTo`. Legacy assertion
  helpers: `assertResultsEqual`, `assertThat`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: SQL verb set differs: legacy ['MERGE', 'DROP'] vs
  current ['CREATE', 'MERGE', 'DROP']. Assertion helper names differ between legacy and current implementations. Current
  method uses parameter-injected environment helpers instead of Tempto query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Matched by current suite selection: `SuiteIceberg` run 2 Exact-name mapping with normalized body
  similarity `0.81`.
- Audit status: `verified`

##### `testDropTable`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestHiveRedirectionToIceberg.java` ->
  `testDropTable`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestHiveRedirectionToIceberg.java` ->
  `TestHiveRedirectionToIceberg.testDropTable`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveIcebergRedirectionsEnvironment`. Routed by source review into
  `SuiteIceberg` run 2.
- Tag parity: Current tags: `HiveIcebergRedirections`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`. Legacy setup operations: none.
- Action parity: Current action verbs: none. Legacy action verbs: none.
- Assertion parity: Current assertion helpers: `assertThatThrownBy`. Legacy assertion helpers: `assertQueryFailure`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: SQL verb set differs: legacy ['DROP'] vs current ['CREATE', 'DROP']. Assertion
  helper names differ between legacy and current implementations. Current method uses parameter-injected environment
  helpers instead of Tempto query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Matched by current suite selection: `SuiteIceberg` run 2 Exact-name mapping with normalized body
  similarity `0.71`.
- Audit status: `verified`

##### `testDescribe`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestHiveRedirectionToIceberg.java` ->
  `testDescribe`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestHiveRedirectionToIceberg.java` ->
  `TestHiveRedirectionToIceberg.testDescribe`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveIcebergRedirectionsEnvironment`. Routed by source review into
  `SuiteIceberg` run 2.
- Tag parity: Current tags: `HiveIcebergRedirections`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`. Legacy setup operations: none.
- Action parity: Current action verbs: `DESCRIBE`. Legacy action verbs: `DESCRIBE`.
- Assertion parity: Current assertion helpers: `assertResultsEqual`. Legacy assertion helpers: `assertResultsEqual`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: SQL verb set differs: legacy ['DESCRIBE', 'DROP'] vs
  current ['CREATE', 'DESCRIBE', 'DROP']. Current method uses parameter-injected environment helpers instead of Tempto
  query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Matched by current suite selection: `SuiteIceberg` run 2 Exact-name mapping with normalized body
  similarity `0.72`.
- Audit status: `verified`

##### `testShowCreateTable`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestHiveRedirectionToIceberg.java` ->
  `testShowCreateTable`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestHiveRedirectionToIceberg.java` ->
  `TestHiveRedirectionToIceberg.testShowCreateTable`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveIcebergRedirectionsEnvironment`. Routed by source review into
  `SuiteIceberg` run 2.
- Tag parity: Current tags: `HiveIcebergRedirections`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`. Legacy setup operations: none.
- Action parity: Current action verbs: `SHOW`, `WITH`. Legacy action verbs: `SHOW`, `WITH`.
- Assertion parity: Current assertion helpers: `assertThat`. Legacy assertion helpers: `assertThat`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: SQL verb set differs: legacy ['SHOW', 'WITH', 'DROP'] vs
  current ['CREATE', 'SHOW', 'WITH', 'DROP']. Current method uses parameter-injected environment helpers instead of
  Tempto query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Matched by current suite selection: `SuiteIceberg` run 2 Exact-name mapping with normalized body
  similarity `0.89`.
- Audit status: `verified`

##### `testShowStats`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestHiveRedirectionToIceberg.java` ->
  `testShowStats`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestHiveRedirectionToIceberg.java` ->
  `TestHiveRedirectionToIceberg.testShowStats`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveIcebergRedirectionsEnvironment`. Routed by source review into
  `SuiteIceberg` run 2.
- Tag parity: Current tags: `HiveIcebergRedirections`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`. Legacy setup operations: none.
- Action parity: Current action verbs: `SHOW`. Legacy action verbs: `SHOW`.
- Assertion parity: Current assertion helpers: `assertThat`, `containsOnly`, `row`. Legacy assertion helpers:
  `assertThat`, `containsOnly`, `row`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: SQL verb set differs: legacy ['SHOW', 'DROP'] vs
  current ['CREATE', 'SHOW', 'DROP']. Current method uses parameter-injected environment helpers instead of Tempto query
  executors.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Matched by current suite selection: `SuiteIceberg` run 2 Exact-name mapping with normalized body
  similarity `0.84`.
- Audit status: `verified`

##### `testAlterTableRename`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestHiveRedirectionToIceberg.java` ->
  `testAlterTableRename`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestHiveRedirectionToIceberg.java` ->
  `TestHiveRedirectionToIceberg.testAlterTableRename`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveIcebergRedirectionsEnvironment`. Routed by source review into
  `SuiteIceberg` run 2.
- Tag parity: Current tags: `HiveIcebergRedirections`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`, `ALTER`. Legacy setup operations: `ALTER`.
- Action parity: Current action verbs: none. Legacy action verbs: none.
- Assertion parity: Current assertion helpers: `assertResultsEqual`, `assertThatThrownBy`. Legacy assertion helpers:
  `assertQueryFailure`, `assertResultsEqual`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: SQL verb set differs: legacy ['ALTER', 'DROP'] vs
  current ['CREATE', 'ALTER', 'DROP']. Assertion helper names differ between legacy and current implementations. Current
  method uses parameter-injected environment helpers instead of Tempto query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Matched by current suite selection: `SuiteIceberg` run 2 Exact-name mapping with normalized body
  similarity `0.86`.
- Audit status: `verified`

##### `testAlterTableAddColumn`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestHiveRedirectionToIceberg.java` ->
  `testAlterTableAddColumn`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestHiveRedirectionToIceberg.java` ->
  `TestHiveRedirectionToIceberg.testAlterTableAddColumn`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveIcebergRedirectionsEnvironment`. Routed by source review into
  `SuiteIceberg` run 2.
- Tag parity: Current tags: `HiveIcebergRedirections`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`, `ALTER`. Legacy setup operations: `ALTER`.
- Action parity: Current action verbs: `DESCRIBE`, `SELECT`. Legacy action verbs: `DESCRIBE`, `SELECT`.
- Assertion parity: Current assertion helpers: `assertResultsEqual`, `assertThat`, `containsOnly`. Legacy assertion
  helpers: `assertResultsEqual`, `assertThat`, `containsOnly`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: SQL verb set differs: legacy ['ALTER', 'DESCRIBE', 'SELECT', 'DROP'] vs
  current ['CREATE', 'ALTER', 'DESCRIBE', 'SELECT', 'DROP']. Current method uses parameter-injected environment helpers
  instead of Tempto query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Matched by current suite selection: `SuiteIceberg` run 2 Exact-name mapping with normalized body
  similarity `0.78`.
- Audit status: `verified`

##### `testAlterTableDropColumn`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestHiveRedirectionToIceberg.java` ->
  `testAlterTableDropColumn`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestHiveRedirectionToIceberg.java` ->
  `TestHiveRedirectionToIceberg.testAlterTableDropColumn`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveIcebergRedirectionsEnvironment`. Routed by source review into
  `SuiteIceberg` run 2.
- Tag parity: Current tags: `HiveIcebergRedirections`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`, `ALTER`. Legacy setup operations: `ALTER`.
- Action parity: Current action verbs: `DESCRIBE`, `SELECT`. Legacy action verbs: `DESCRIBE`, `SELECT`.
- Assertion parity: Current assertion helpers: `assertResultsEqual`, `assertThat`, `containsOnly`. Legacy assertion
  helpers: `assertResultsEqual`, `assertThat`, `containsOnly`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: SQL verb set differs: legacy ['ALTER', 'DROP', 'DESCRIBE', 'SELECT'] vs
  current ['CREATE', 'ALTER', 'DROP', 'DESCRIBE', 'SELECT']. Current method uses parameter-injected environment helpers
  instead of Tempto query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Matched by current suite selection: `SuiteIceberg` run 2 Exact-name mapping with normalized body
  similarity `0.81`.
- Audit status: `verified`

##### `testAlterTableRenameColumn`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestHiveRedirectionToIceberg.java` ->
  `testAlterTableRenameColumn`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestHiveRedirectionToIceberg.java` ->
  `TestHiveRedirectionToIceberg.testAlterTableRenameColumn`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveIcebergRedirectionsEnvironment`. Routed by source review into
  `SuiteIceberg` run 2.
- Tag parity: Current tags: `HiveIcebergRedirections`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`, `ALTER`. Legacy setup operations: `ALTER`.
- Action parity: Current action verbs: `DESCRIBE`, `SELECT`. Legacy action verbs: `DESCRIBE`, `SELECT`.
- Assertion parity: Current assertion helpers: `assertResultsEqual`, `assertThat`, `containsOnly`. Legacy assertion
  helpers: `assertResultsEqual`, `assertThat`, `containsOnly`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: SQL verb set differs: legacy ['ALTER', 'DESCRIBE', 'SELECT', 'DROP'] vs
  current ['CREATE', 'ALTER', 'DESCRIBE', 'SELECT', 'DROP']. Current method uses parameter-injected environment helpers
  instead of Tempto query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Matched by current suite selection: `SuiteIceberg` run 2 Exact-name mapping with normalized body
  similarity `0.78`.
- Audit status: `verified`

##### `testCommentTable`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestHiveRedirectionToIceberg.java` ->
  `testCommentTable`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestHiveRedirectionToIceberg.java` ->
  `TestHiveRedirectionToIceberg.testCommentTable`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveIcebergRedirectionsEnvironment`. Routed by source review into
  `SuiteIceberg` run 2.
- Tag parity: Current tags: `HiveIcebergRedirections`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`. Legacy setup operations: none.
- Action parity: Current action verbs: none. Legacy action verbs: none.
- Assertion parity: Current assertion helpers: `assertTableComment`, `isEqualTo`. Legacy assertion helpers:
  `assertTableComment`, `isEqualTo`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: SQL verb set differs: legacy ['DROP'] vs current ['CREATE', 'DROP']. Current
  method uses parameter-injected environment helpers instead of Tempto query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Matched by current suite selection: `SuiteIceberg` run 2 Exact-name mapping with normalized body
  similarity `0.72`.
- Audit status: `verified`

##### `testCommentColumn`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestHiveRedirectionToIceberg.java` ->
  `testCommentColumn`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestHiveRedirectionToIceberg.java` ->
  `TestHiveRedirectionToIceberg.testCommentColumn`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveIcebergRedirectionsEnvironment`. Routed by source review into
  `SuiteIceberg` run 2.
- Tag parity: Current tags: `HiveIcebergRedirections`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`. Legacy setup operations: none.
- Action parity: Current action verbs: none. Legacy action verbs: none.
- Assertion parity: Current assertion helpers: `assertColumnComment`, `isEqualTo`. Legacy assertion helpers:
  `assertColumnComment`, `isEqualTo`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: SQL verb set differs: legacy ['DROP'] vs current ['CREATE', 'DROP']. Current
  method uses parameter-injected environment helpers instead of Tempto query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Matched by current suite selection: `SuiteIceberg` run 2 Exact-name mapping with normalized body
  similarity `0.81`.
- Audit status: `verified`

##### `testShowGrants`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestHiveRedirectionToIceberg.java` ->
  `testShowGrants`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestHiveRedirectionToIceberg.java` ->
  `TestHiveRedirectionToIceberg.testShowGrants`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveIcebergRedirectionsEnvironment`. Routed by source review into
  `SuiteIceberg` run 2.
- Tag parity: Current tags: `HiveIcebergRedirections`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`. Legacy setup operations: none.
- Action parity: Current action verbs: `SHOW`. Legacy action verbs: `SHOW`.
- Assertion parity: Current assertion helpers: `assertThatThrownBy`. Legacy assertion helpers: `assertQueryFailure`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: SQL verb set differs: legacy ['SHOW', 'DROP'] vs
  current ['CREATE', 'SHOW', 'DROP']. Assertion helper names differ between legacy and current implementations. Current
  method uses parameter-injected environment helpers instead of Tempto query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Matched by current suite selection: `SuiteIceberg` run 2 Exact-name mapping with normalized body
  similarity `0.79`.
- Audit status: `verified`

##### `testInformationSchemaColumns`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestHiveRedirectionToIceberg.java` ->
  `testInformationSchemaColumns`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestHiveRedirectionToIceberg.java` ->
  `TestHiveRedirectionToIceberg.testInformationSchemaColumns`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveIcebergRedirectionsEnvironment`. Routed by source review into
  `SuiteIceberg` run 2.
- Tag parity: Current tags: `HiveIcebergRedirections`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`. Legacy setup operations: `CREATE`.
- Action parity: Current action verbs: `SELECT`. Legacy action verbs: `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `containsOnly`, `row`. Legacy assertion helpers:
  `assertThat`, `containsOnly`, `row`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: Current method uses parameter-injected environment helpers instead of Tempto
  query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Matched by current suite selection: `SuiteIceberg` run 2 Exact-name mapping with normalized body
  similarity `0.91`.
- Audit status: `verified`

##### `testSystemJdbcColumns`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestHiveRedirectionToIceberg.java` ->
  `testSystemJdbcColumns`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestHiveRedirectionToIceberg.java` ->
  `TestHiveRedirectionToIceberg.testSystemJdbcColumns`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveIcebergRedirectionsEnvironment`. Routed by source review into
  `SuiteIceberg` run 2.
- Tag parity: Current tags: `HiveIcebergRedirections`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`. Legacy setup operations: `CREATE`.
- Action parity: Current action verbs: `SELECT`. Legacy action verbs: `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `containsOnly`, `row`. Legacy assertion helpers:
  `assertThat`, `containsOnly`, `row`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: Current method uses parameter-injected environment helpers instead of Tempto
  query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Matched by current suite selection: `SuiteIceberg` run 2 Exact-name mapping with normalized body
  similarity `0.92`.
- Audit status: `verified`

##### `testGrant`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestHiveRedirectionToIceberg.java` ->
  `testGrant`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestHiveRedirectionToIceberg.java` ->
  `TestHiveRedirectionToIceberg.testGrant`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveIcebergRedirectionsEnvironment`. Routed by source review into
  `SuiteIceberg` run 2.
- Tag parity: Current tags: `HiveIcebergRedirections`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`. Legacy setup operations: none.
- Action parity: Current action verbs: none. Legacy action verbs: none.
- Assertion parity: Current assertion helpers: `assertThatThrownBy`. Legacy assertion helpers: `assertQueryFailure`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: SQL verb set differs: legacy ['DROP'] vs current ['CREATE', 'DROP']. Assertion
  helper names differ between legacy and current implementations. Current method uses parameter-injected environment
  helpers instead of Tempto query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Matched by current suite selection: `SuiteIceberg` run 2 Exact-name mapping with normalized body
  similarity `0.76`.
- Audit status: `verified`

##### `testRevoke`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestHiveRedirectionToIceberg.java` ->
  `testRevoke`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestHiveRedirectionToIceberg.java` ->
  `TestHiveRedirectionToIceberg.testRevoke`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveIcebergRedirectionsEnvironment`. Routed by source review into
  `SuiteIceberg` run 2.
- Tag parity: Current tags: `HiveIcebergRedirections`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`. Legacy setup operations: none.
- Action parity: Current action verbs: none. Legacy action verbs: none.
- Assertion parity: Current assertion helpers: `assertThatThrownBy`. Legacy assertion helpers: `assertQueryFailure`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: SQL verb set differs: legacy ['DROP'] vs current ['CREATE', 'DROP']. Assertion
  helper names differ between legacy and current implementations. Current method uses parameter-injected environment
  helpers instead of Tempto query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Matched by current suite selection: `SuiteIceberg` run 2 Exact-name mapping with normalized body
  similarity `0.76`.
- Audit status: `verified`

##### `testSetTableAuthorization`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestHiveRedirectionToIceberg.java` ->
  `testSetTableAuthorization`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestHiveRedirectionToIceberg.java` ->
  `TestHiveRedirectionToIceberg.testSetTableAuthorization`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveIcebergRedirectionsEnvironment`. Routed by source review into
  `SuiteIceberg` run 2.
- Tag parity: Current tags: `HiveIcebergRedirections`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`, `ALTER`. Legacy setup operations: `ALTER`.
- Action parity: Current action verbs: none. Legacy action verbs: none.
- Assertion parity: Current assertion helpers: `assertThatThrownBy`. Legacy assertion helpers: `assertQueryFailure`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: SQL verb set differs: legacy ['ALTER', 'DROP'] vs
  current ['CREATE', 'ALTER', 'DROP']. Assertion helper names differ between legacy and current implementations. Current
  method uses parameter-injected environment helpers instead of Tempto query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Matched by current suite selection: `SuiteIceberg` run 2 Exact-name mapping with normalized body
  similarity `0.76`.
- Audit status: `verified`

##### `testDeny`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestHiveRedirectionToIceberg.java` ->
  `testDeny`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestHiveRedirectionToIceberg.java` ->
  `TestHiveRedirectionToIceberg.testDeny`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveIcebergRedirectionsEnvironment`. Routed by source review into
  `SuiteIceberg` run 2.
- Tag parity: Current tags: `HiveIcebergRedirections`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`. Legacy setup operations: none.
- Action parity: Current action verbs: none. Legacy action verbs: none.
- Assertion parity: Current assertion helpers: `assertThatThrownBy`. Legacy assertion helpers: `assertQueryFailure`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: SQL verb set differs: legacy ['DROP'] vs current ['CREATE', 'DROP']. Assertion
  helper names differ between legacy and current implementations. Current method uses parameter-injected environment
  helpers instead of Tempto query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Matched by current suite selection: `SuiteIceberg` run 2 Exact-name mapping with normalized body
  similarity `0.76`.
- Audit status: `verified`

### `TestHiveRequireQueryPartitionsFilter`

- Owning migration commit: `Migrate TestHiveRequireQueryPartitionsFilter to JUnit`
- Current class added in same migration commit:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestHiveRequireQueryPartitionsFilter.java`
- Legacy class removed in same migration commit:
    - `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestHiveRequireQueryPartitionsFilter.java`
- Class-level environment requirement: `HiveBasicEnvironment`.
- Class-level tags: `HdfsNoImpersonation`.
- Method inventory complete: Yes. Legacy methods: `2`. Current methods: `2`.
- Legacy helper/resource dependencies accounted for: Legacy class source reviewed directly.
- Intentional differences summary: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Method statuses present: `verified`.

#### Methods

##### `testRequiresQueryPartitionFilter`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestHiveRequireQueryPartitionsFilter.java` ->
  `testRequiresQueryPartitionFilter`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestHiveRequireQueryPartitionsFilter.java` ->
  `TestHiveRequireQueryPartitionsFilter.testRequiresQueryPartitionFilter`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveBasicEnvironment`. Routed by source review into `SuiteHiveBasic` run
    1.
- Tag parity: Current tags: `HdfsNoImpersonation`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: none. Legacy setup operations: none.
- Action parity: Current action verbs: `SELECT`. Legacy action verbs: `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `assertThatThrownBy`, `containsOnly`, `row`. Legacy
  assertion helpers: `assertQueryFailure`, `assertThat`, `containsOnly`, `row`.
- Cleanup parity: Current cleanup operations: `DROP`. No legacy cleanup method body was available.
- Any observed difference, however small: SQL verb set differs: legacy ['SELECT'] vs current ['SELECT', 'DROP'].
  Assertion helper names differ between legacy and current implementations. Current method uses parameter-injected
  environment helpers instead of Tempto query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Matched by current suite selection: `SuiteHiveBasic` run 1 Exact-name mapping with normalized body
  similarity `0.65`.
- Audit status: `verified`

##### `testRequiresQueryPartitionFilterOnSpecificSchema`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestHiveRequireQueryPartitionsFilter.java` ->
  `testRequiresQueryPartitionFilterOnSpecificSchema`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestHiveRequireQueryPartitionsFilter.java` ->
  `TestHiveRequireQueryPartitionsFilter.testRequiresQueryPartitionFilterOnSpecificSchema`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveBasicEnvironment`. Routed by source review into `SuiteHiveBasic` run
    1.
- Tag parity: Current tags: `HdfsNoImpersonation`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: none. Legacy setup operations: none.
- Action parity: Current action verbs: `SELECT`. Legacy action verbs: `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `assertThatThrownBy`, `containsOnly`, `row`. Legacy
  assertion helpers: `assertQueryFailure`, `assertThat`, `containsOnly`, `row`.
- Cleanup parity: Current cleanup operations: `DROP`. No legacy cleanup method body was available.
- Any observed difference, however small: Normalized body similarity is low (`0.51`), so fidelity was judged from
  SQL/helper/assertion shape instead of raw text. SQL verb set differs: legacy ['SELECT'] vs current ['SELECT', 'DROP'].
  Assertion helper names differ between legacy and current implementations. Current method uses parameter-injected
  environment helpers instead of Tempto query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Matched by current suite selection: `SuiteHiveBasic` run 1 Exact-name mapping with normalized body
  similarity `0.51`.
- Audit status: `verified`

### `TestHiveSchema`

- Owning migration commit: `Migrate TestHiveSchema to JUnit`
- Current class added in same migration commit:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestHiveSchema.java`
- Legacy class removed in same migration commit:
    - `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestHiveSchema.java`
- Class-level environment requirement: `HiveBasicEnvironment`.
- Class-level tags: `HdfsNoImpersonation`.
- Method inventory complete: Yes. Legacy methods: `2`. Current methods: `2`.
- Legacy helper/resource dependencies accounted for: Legacy class source reviewed directly.
- Intentional differences summary: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Method statuses present: `verified`.

#### Methods

##### `testSysSchemaFilteredOut`

- Legacy source method: `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestHiveSchema.java` ->
  `testSysSchemaFilteredOut`
- Current target method: `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestHiveSchema.java` ->
  `TestHiveSchema.testSysSchemaFilteredOut`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveBasicEnvironment`. Routed by source review into `SuiteHiveBasic` run
    1.
- Tag parity: Current tags: `HdfsNoImpersonation`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`. Legacy setup operations: none.
- Action parity: Current action verbs: `SHOW`, `DESCRIBE`, `SELECT`. Legacy action verbs: `SHOW`, `DESCRIBE`, `SELECT`.
- Assertion parity: Current assertion helpers: `assertContainsFirstColumnValue`, `assertDoesNotContainFirstColumnValue`,
  `assertThat`, `assertThatThrownBy`, `hasMessageContaining`. Legacy assertion helpers: `assertQueryFailure`,
  `assertThat`, `hasMessageContaining`.
- Cleanup parity: Current cleanup operations: `DROP`. No legacy cleanup method body was available.
- Any observed difference, however small: SQL verb set differs: legacy ['SHOW', 'DESCRIBE', 'SELECT'] vs
  current ['DROP', 'CREATE', 'SHOW', 'DESCRIBE', 'SELECT']. Assertion helper names differ between legacy and current
  implementations. Current method uses parameter-injected environment helpers instead of Tempto query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Matched by current suite selection: `SuiteHiveBasic` run 1 Exact-name mapping with normalized body
  similarity `0.64`.
- Audit status: `verified`

##### `testHiveInformationSchemaFilteredOut`

- Legacy source method: `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestHiveSchema.java` ->
  `testHiveInformationSchemaFilteredOut`
- Current target method: `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestHiveSchema.java` ->
  `TestHiveSchema.testHiveInformationSchemaFilteredOut`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveBasicEnvironment`. Routed by source review into `SuiteHiveBasic` run
    1.
- Tag parity: Current tags: `HdfsNoImpersonation`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`. Legacy setup operations: none.
- Action parity: Current action verbs: `SHOW`, `DESCRIBE`, `SELECT`. Legacy action verbs: `SHOW`, `DESCRIBE`, `SELECT`.
- Assertion parity: Current assertion helpers: `assertContainsFirstColumnValue`, `assertDoesNotContainFirstColumnValue`,
  `assertThat`, `assertThatThrownBy`, `containsOnly`, `hasMessageContaining`. Legacy assertion helpers:
  `assertQueryFailure`, `assertThat`, `containsOnly`, `hasMessageContaining`, `row`.
- Cleanup parity: Current cleanup operations: `DROP`. No legacy cleanup method body was available.
- Any observed difference, however small: SQL verb set differs: legacy ['SHOW', 'DESCRIBE', 'SELECT'] vs
  current ['DROP', 'CREATE', 'SHOW', 'DESCRIBE', 'SELECT']. Assertion helper names differ between legacy and current
  implementations. Current method uses parameter-injected environment helpers instead of Tempto query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Matched by current suite selection: `SuiteHiveBasic` run 1 Exact-name mapping with normalized body
  similarity `0.72`.
- Audit status: `verified`

### `TestHiveSparkCompatibility`

- Owning migration commit: `Migrate TestHiveSparkCompatibility to JUnit`
- Current class added in same migration commit:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestHiveSparkCompatibility.java`
- Legacy class removed in same migration commit:
    - `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestHiveSparkCompatibility.java`
- Class-level environment requirement: `HiveSparkEnvironment`.
- Class-level tags: `HiveSpark`.
- Method inventory complete: Yes. Legacy methods: `17`. Current methods: `17`.
- Legacy helper/resource dependencies accounted for: Legacy class source reviewed directly.
- Intentional differences summary: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Method statuses present: `verified`.

#### Methods

##### `testReadSparkCreatedTable`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestHiveSparkCompatibility.java` ->
  `testReadSparkCreatedTable`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestHiveSparkCompatibility.java` ->
  `TestHiveSparkCompatibility.testReadSparkCreatedTable`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveSparkEnvironment`. Routed by source review into `SuiteHiveSpark` run
    1.
- Tag parity: Current tags: `HiveSpark`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`, `INSERT`. Legacy setup operations: `CREATE`, `INSERT`.
- Action parity: Current action verbs: `SELECT`, `SHOW`, `WITH`. Legacy action verbs: `SELECT`, `SHOW`, `WITH`.
- Assertion parity: Current assertion helpers: `assertThat`, `containsOnly`, `row`. Legacy assertion helpers:
  `assertThat`, `containsOnly`, `row`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: Current method uses parameter-injected environment helpers instead of Tempto
  query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Matched by current suite selection: `SuiteHiveSpark` run 1 Exact-name mapping with normalized body
  similarity `0.83`.
- Audit status: `verified`

##### `testSparkParquetTimestampCompatibility`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestHiveSparkCompatibility.java` ->
  `testSparkParquetTimestampCompatibility`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestHiveSparkCompatibility.java` ->
  `TestHiveSparkCompatibility.testSparkParquetTimestampCompatibility`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveSparkEnvironment`. Routed by source review into `SuiteHiveSpark` run
    1.
- Tag parity: Current tags: `HiveSpark`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`, `INSERT`. Legacy setup operations: `CREATE`, `INSERT`.
- Action parity: Current action verbs: `SELECT`. Legacy action verbs: `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `containsOnly`, `row`. Legacy assertion helpers:
  `assertThat`, `containsOnly`, `row`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: Current method uses parameter-injected environment helpers instead of Tempto
  query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Matched by current suite selection: `SuiteHiveSpark` run 1 Exact-name mapping with normalized body
  similarity `0.88`.
- Audit status: `verified`

##### `testSparkClusteringCaseSensitiveCompatibility`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestHiveSparkCompatibility.java` ->
  `testSparkClusteringCaseSensitiveCompatibility`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestHiveSparkCompatibility.java` ->
  `TestHiveSparkCompatibility.testSparkClusteringCaseSensitiveCompatibility`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveSparkEnvironment`. Routed by source review into `SuiteHiveSpark` run
    1.
- Tag parity: Current tags: `HiveSpark`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`, `INSERT`. Legacy setup operations: `CREATE`, `INSERT`.
- Action parity: Current action verbs: `SELECT`. Legacy action verbs: `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `containsOnly`, `row`. Legacy assertion helpers:
  `assertThat`, `containsOnly`, `row`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: Current method uses parameter-injected environment helpers instead of Tempto
  query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Matched by current suite selection: `SuiteHiveSpark` run 1 Exact-name mapping with normalized body
  similarity `0.88`.
- Audit status: `verified`

##### `testSparkParquetBloomFilterCompatibility`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestHiveSparkCompatibility.java` ->
  `testSparkParquetBloomFilterCompatibility`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestHiveSparkCompatibility.java` ->
  `TestHiveSparkCompatibility.testSparkParquetBloomFilterCompatibility`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveSparkEnvironment`. Routed by source review into `SuiteHiveSpark` run
    1.
- Tag parity: Current tags: `HiveSpark`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`, `INSERT`. Legacy setup operations: `CREATE`, `INSERT`.
- Action parity: Current action verbs: `SELECT`. Legacy action verbs: `SELECT`.
- Assertion parity: Current assertion helpers: `assertTrinoBloomFilterTableSelectResult`. Legacy assertion helpers:
  `assertTrinoBloomFilterTableSelectResult`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: Current method uses parameter-injected environment helpers instead of Tempto
  query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Matched by current suite selection: `SuiteHiveSpark` run 1 Exact-name mapping with normalized body
  similarity `0.79`.
- Audit status: `verified`

##### `testTrinoSparkParquetBloomFilterCompatibility`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestHiveSparkCompatibility.java` ->
  `testTrinoSparkParquetBloomFilterCompatibility`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestHiveSparkCompatibility.java` ->
  `TestHiveSparkCompatibility.testTrinoSparkParquetBloomFilterCompatibility`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveSparkEnvironment`. Routed by source review into `SuiteHiveSpark` run
    1.
- Tag parity: Current tags: `HiveSpark`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`, `INSERT`. Legacy setup operations: `CREATE`, `INSERT`.
- Action parity: Current action verbs: `WITH`, `SELECT`. Legacy action verbs: `WITH`, `SELECT`.
- Assertion parity: Current assertion helpers: `assertSparkBloomFilterTableSelectResult`. Legacy assertion helpers:
  `assertSparkBloomFilterTableSelectResult`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: Current method uses parameter-injected environment helpers instead of Tempto
  query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Matched by current suite selection: `SuiteHiveSpark` run 1 Exact-name mapping with normalized body
  similarity `0.96`.
- Audit status: `verified`

##### `testInsertFailsOnBucketedTableCreatedBySpark`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestHiveSparkCompatibility.java` ->
  `testInsertFailsOnBucketedTableCreatedBySpark`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestHiveSparkCompatibility.java` ->
  `TestHiveSparkCompatibility.testInsertFailsOnBucketedTableCreatedBySpark`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveSparkEnvironment`. Routed by source review into `SuiteHiveSpark` run
    1.
- Tag parity: Current tags: `HiveSpark`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`, `INSERT`. Legacy setup operations: `CREATE`, `INSERT`.
- Action parity: Current action verbs: none. Legacy action verbs: none.
- Assertion parity: Current assertion helpers: `assertThatThrownBy`, `hasMessageContaining`. Legacy assertion helpers:
  `assertQueryFailure`, `hasMessageContaining`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: Assertion helper names differ between legacy and current implementations.
  Current method uses parameter-injected environment helpers instead of Tempto query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Matched by current suite selection: `SuiteHiveSpark` run 1 Exact-name mapping with normalized body
  similarity `0.84`.
- Audit status: `verified`

##### `testUpdateFailsOnBucketedTableCreatedBySpark`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestHiveSparkCompatibility.java` ->
  `testUpdateFailsOnBucketedTableCreatedBySpark`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestHiveSparkCompatibility.java` ->
  `TestHiveSparkCompatibility.testUpdateFailsOnBucketedTableCreatedBySpark`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveSparkEnvironment`. Routed by source review into `SuiteHiveSpark` run
    1.
- Tag parity: Current tags: `HiveSpark`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`, `UPDATE`. Legacy setup operations: `CREATE`, `UPDATE`.
- Action parity: Current action verbs: none. Legacy action verbs: none.
- Assertion parity: Current assertion helpers: `assertThatThrownBy`. Legacy assertion helpers: `assertQueryFailure`,
  `hasMessageContaining`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: Assertion helper names differ between legacy and current implementations.
  Current method uses parameter-injected environment helpers instead of Tempto query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Matched by current suite selection: `SuiteHiveSpark` run 1 Exact-name mapping with normalized body
  similarity `0.73`.
- Audit status: `verified`

##### `testDeleteFailsOnBucketedTableCreatedBySpark`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestHiveSparkCompatibility.java` ->
  `testDeleteFailsOnBucketedTableCreatedBySpark`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestHiveSparkCompatibility.java` ->
  `TestHiveSparkCompatibility.testDeleteFailsOnBucketedTableCreatedBySpark`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveSparkEnvironment`. Routed by source review into `SuiteHiveSpark` run
    1.
- Tag parity: Current tags: `HiveSpark`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`. Legacy setup operations: `CREATE`.
- Action parity: Current action verbs: none. Legacy action verbs: none.
- Assertion parity: Current assertion helpers: `assertThatThrownBy`. Legacy assertion helpers: `assertQueryFailure`,
  `hasMessageContaining`.
- Cleanup parity: Current cleanup operations: `DELETE`, `DROP`. Legacy cleanup operations: `DELETE`, `DROP`.
- Any observed difference, however small: Assertion helper names differ between legacy and current implementations.
  Current method uses parameter-injected environment helpers instead of Tempto query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Matched by current suite selection: `SuiteHiveSpark` run 1 Exact-name mapping with normalized body
  similarity `0.73`.
- Audit status: `verified`

##### `testReadTrinoCreatedOrcTable`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestHiveSparkCompatibility.java` ->
  `testReadTrinoCreatedOrcTable`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestHiveSparkCompatibility.java` ->
  `TestHiveSparkCompatibility.testReadTrinoCreatedOrcTable`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveSparkEnvironment`. Routed by source review into `SuiteHiveSpark` run
    1.
- Tag parity: Current tags: `HiveSpark`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: none. No legacy setup method body was available.
- Action parity: Current action verbs: none. No legacy action method body was available.
- Assertion parity: Current assertion helpers: none. No legacy assertion method body was available.
- Cleanup parity: Current cleanup operations: none. No legacy cleanup method body was available.
- Any observed difference, however small: No method-specific difference identified beyond the documented framework
  baseline.
- Known intentional difference: None.
- Reviewer note: Matched by current suite selection: `SuiteHiveSpark` run 1 High normalized body similarity `0.83`.
- Audit status: `verified`

##### `testReadTrinoCreatedParquetTable`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestHiveSparkCompatibility.java` ->
  `testReadTrinoCreatedParquetTable`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestHiveSparkCompatibility.java` ->
  `TestHiveSparkCompatibility.testReadTrinoCreatedParquetTable`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveSparkEnvironment`. Routed by source review into `SuiteHiveSpark` run
    1.
- Tag parity: Current tags: `HiveSpark`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: none. No legacy setup method body was available.
- Action parity: Current action verbs: none. No legacy action method body was available.
- Assertion parity: Current assertion helpers: none. No legacy assertion method body was available.
- Cleanup parity: Current cleanup operations: none. No legacy cleanup method body was available.
- Any observed difference, however small: No method-specific difference identified beyond the documented framework
  baseline.
- Known intentional difference: None.
- Reviewer note: Matched by current suite selection: `SuiteHiveSpark` run 1 High normalized body similarity `0.84`.
- Audit status: `verified`

##### `testReadSparkDateAndTimePartitionName`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestHiveSparkCompatibility.java` ->
  `testReadSparkdDateAndTimePartitionName`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestHiveSparkCompatibility.java` ->
  `TestHiveSparkCompatibility.testReadSparkDateAndTimePartitionName`
- Mapping type: `renamed`
- Environment parity: Current class requires `HiveSparkEnvironment`. Routed by source review into `SuiteHiveSpark` run
    1.
- Tag parity: Current tags: `HiveSpark`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`, `INSERT`. Legacy setup operations: `CREATE`, `INSERT`.
- Action parity: Current action verbs: `SELECT`. Legacy action verbs: `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `assertThatThrownBy`, `containsOnly`, `row`. Legacy
  assertion helpers: `assertQueryFailure`, `assertThat`, `containsOnly`, `hasMessageContaining`, `row`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: Current method maps to legacy `testReadSparkdDateAndTimePartitionName` rather
  than the same method name. Assertion helper names differ between legacy and current implementations. Current method
  uses parameter-injected environment helpers instead of Tempto query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Matched by current suite selection: `SuiteHiveSpark` run 1
- Audit status: `verified`

##### `testTextInputFormatWithParquetHiveSerDe`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestHiveSparkCompatibility.java` ->
  `testTextInputFormatWithParquetHiveSerDe`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestHiveSparkCompatibility.java` ->
  `TestHiveSparkCompatibility.testTextInputFormatWithParquetHiveSerDe`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveSparkEnvironment`. Routed by source review into `SuiteHiveSpark` run
    1.
- Tag parity: Current tags: `HiveSpark`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`, `INSERT`. Legacy setup operations: `CREATE`, `INSERT`.
- Action parity: Current action verbs: `SELECT`. Legacy action verbs: `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `assertThatThrownBy`, `contains`, `containsOnly`, `row`.
  Legacy assertion helpers: `assertQueryFailure`, `assertThat`, `contains`, `containsOnly`, `row`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: Assertion helper names differ between legacy and current implementations.
  Current method uses parameter-injected environment helpers instead of Tempto query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Matched by current suite selection: `SuiteHiveSpark` run 1 Exact-name mapping with normalized body
  similarity `0.61`.
- Audit status: `verified`

##### `testReadSparkInvalidDatePartitionName`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestHiveSparkCompatibility.java` ->
  `testReadSparkInvalidDatePartitionName`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestHiveSparkCompatibility.java` ->
  `TestHiveSparkCompatibility.testReadSparkInvalidDatePartitionName`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveSparkEnvironment`. Routed by source review into `SuiteHiveSpark` run
    1.
- Tag parity: Current tags: `HiveSpark`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`, `INSERT`. Legacy setup operations: `CREATE`, `INSERT`.
- Action parity: Current action verbs: `SELECT`. Legacy action verbs: `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `containsOnly`, `row`. Legacy assertion helpers:
  `assertQueryFailure`, `assertThat`, `containsOnly`, `hasMessageContaining`, `row`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: Normalized body similarity is low (`0.45`), so fidelity was judged from
  SQL/helper/assertion shape instead of raw text. SQL verb set differs: legacy ['CREATE', 'INSERT', 'DROP', 'SELECT'] vs
  current ['CREATE', 'INSERT', 'SELECT', 'DROP']. Assertion helper names differ between legacy and current
  implementations. Current method uses parameter-injected environment helpers instead of Tempto query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Matched by current suite selection: `SuiteHiveSpark` run 1 Exact-name mapping with normalized body
  similarity `0.45`.
- Audit status: `verified`

##### `testReadSparkBucketedTable`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestHiveSparkCompatibility.java` ->
  `testReadSparkBucketedTable`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestHiveSparkCompatibility.java` ->
  `TestHiveSparkCompatibility.testReadSparkBucketedTable`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveSparkEnvironment`. Routed by source review into `SuiteHiveSpark` run
    1.
- Tag parity: Current tags: `HiveSpark`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`, `INSERT`. Legacy setup operations: `CREATE`, `INSERT`.
- Action parity: Current action verbs: `SELECT`, `SHOW`, `WITH`. Legacy action verbs: `SELECT`, `SHOW`, `WITH`.
- Assertion parity: Current assertion helpers: `assertThat`, `assertThatThrownBy`, `containsOnly`,
  `hasMessageContaining`, `row`. Legacy assertion helpers: `assertQueryFailure`, `assertThat`, `containsOnly`,
  `hasMessageContaining`, `row`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: Assertion helper names differ between legacy and current implementations.
  Current method uses parameter-injected environment helpers instead of Tempto query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Matched by current suite selection: `SuiteHiveSpark` run 1 Exact-name mapping with normalized body
  similarity `0.95`.
- Audit status: `verified`

##### `testReadSparkStatisticsUnpartitionedTable`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestHiveSparkCompatibility.java` ->
  `testReadSparkStatisticsUnpartitionedTable`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestHiveSparkCompatibility.java` ->
  `TestHiveSparkCompatibility.testReadSparkStatisticsUnpartitionedTable`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveSparkEnvironment`. Routed by source review into `SuiteHiveSpark` run
    1.
- Tag parity: Current tags: `HiveSpark`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`, `INSERT`. Legacy setup operations: `CREATE`, `INSERT`.
- Action parity: Current action verbs: `ANALYZE`, `SHOW`. Legacy action verbs: `ANALYZE`, `SHOW`.
- Assertion parity: Current assertion helpers: `assertThat`, `containsOnly`, `row`. Legacy assertion helpers:
  `assertThat`, `containsOnly`, `row`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: Current method uses parameter-injected environment helpers instead of Tempto
  query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Matched by current suite selection: `SuiteHiveSpark` run 1 Exact-name mapping with normalized body
  similarity `0.95`.
- Audit status: `verified`

##### `testReadSparkStatisticsPartitionedTable`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestHiveSparkCompatibility.java` ->
  `testReadSparkStatisticsPartitionedTable`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestHiveSparkCompatibility.java` ->
  `TestHiveSparkCompatibility.testReadSparkStatisticsPartitionedTable`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveSparkEnvironment`. Routed by source review into `SuiteHiveSpark` run
    1.
- Tag parity: Current tags: `HiveSpark`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`, `INSERT`. Legacy setup operations: `CREATE`, `INSERT`.
- Action parity: Current action verbs: `ANALYZE`, `SHOW`. Legacy action verbs: `ANALYZE`, `SHOW`.
- Assertion parity: Current assertion helpers: `assertThat`, `containsOnly`, `row`. Legacy assertion helpers:
  `assertThat`, `containsOnly`, `row`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: Current method uses parameter-injected environment helpers instead of Tempto
  query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Matched by current suite selection: `SuiteHiveSpark` run 1 Exact-name mapping with normalized body
  similarity `0.97`.
- Audit status: `verified`

##### `testIgnoringSparkStatisticsWithDisabledFallback`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestHiveSparkCompatibility.java` ->
  `testIgnoringSparkStatisticsWithDisabledFallback`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestHiveSparkCompatibility.java` ->
  `TestHiveSparkCompatibility.testIgnoringSparkStatisticsWithDisabledFallback`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveSparkEnvironment`. Routed by source review into `SuiteHiveSpark` run
    1.
- Tag parity: Current tags: `HiveSpark`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`, `INSERT`. Legacy setup operations: `CREATE`, `INSERT`.
- Action parity: Current action verbs: `ANALYZE`, `SHOW`. Legacy action verbs: `ANALYZE`, `SHOW`.
- Assertion parity: Current assertion helpers: `assertThat`, `containsOnly`, `row`. Legacy assertion helpers:
  `assertThat`, `containsOnly`, `row`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: Current method uses parameter-injected environment helpers instead of Tempto
  query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Matched by current suite selection: `SuiteHiveSpark` run 1 Exact-name mapping with normalized body
  similarity `0.96`.
- Audit status: `verified`

### `TestHiveTableStatistics`

- Owning migration commit: `Migrate TestHiveTableStatistics to JUnit`
- Current class added in same migration commit:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestHiveTableStatistics.java`
- Legacy class removed in same migration commit:
    - `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestHiveTableStatistics.java`
- Class-level environment requirement: `MultinodeHive4Environment`.
- Class-level tags: none.
- Method inventory complete: Yes. Legacy methods: `22`. Current methods: `22`.
- Legacy helper/resource dependencies accounted for: Legacy class source reviewed directly.
- Intentional differences summary: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Method statuses present: `verified`.

#### Methods

##### `testStatisticsForUnpartitionedTable`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestHiveTableStatistics.java` ->
  `testStatisticsForUnpartitionedTable`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestHiveTableStatistics.java` ->
  `TestHiveTableStatistics.testStatisticsForUnpartitionedTable`
- Mapping type: `direct`
- Environment parity: Current class requires `MultinodeHive4Environment`. No suite run selects this method from the
  current suite definitions.
- Tag parity: Current tags: none. Tag routing needs no suite-level product-test claim.
- Setup parity: Current setup operations: `CREATE`. Legacy setup operations: none.
- Action parity: Current action verbs: `CALL`, `SHOW`, `ANALYZE`. Legacy action verbs: `SHOW`, `ANALYZE`, `CALL`.
- Assertion parity: Current assertion helpers: `assertStatsContainsOnly`, `assertThat`, `containsOnly`, `row`. Legacy
  assertion helpers: `assertThat`, `containsOnly`, `row`.
- Cleanup parity: Current cleanup operations: `DROP`. No legacy cleanup method body was available.
- Any observed difference, however small: SQL verb set differs: legacy ['SHOW', 'ANALYZE', 'CALL'] vs
  current ['DROP', 'CREATE', 'CALL', 'SHOW', 'ANALYZE']. Assertion helper names differ between legacy and current
  implementations. Current method uses parameter-injected environment helpers instead of Tempto query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Exact-name mapping with normalized body similarity `0.66`.
- Audit status: `verified`

##### `testStatisticsForTablePartitionedByBigint`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestHiveTableStatistics.java` ->
  `testStatisticsForTablePartitionedByBigint`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestHiveTableStatistics.java` ->
  `TestHiveTableStatistics.testStatisticsForTablePartitionedByBigint`
- Mapping type: `direct`
- Environment parity: Current class requires `MultinodeHive4Environment`. No suite run selects this method from the
  current suite definitions.
- Tag parity: Current tags: none. Tag routing needs no suite-level product-test claim.
- Setup parity: Current setup operations: `CREATE`. Legacy setup operations: none.
- Action parity: Current action verbs: `CALL`, `SHOW`, `ANALYZE`. Legacy action verbs: `SHOW`, `ANALYZE`, `CALL`.
- Assertion parity: Current assertion helpers: `assertStatsContainsOnly`, `assertThat`, `containsOnly`, `row`. Legacy
  assertion helpers: `assertThat`, `containsOnly`, `row`.
- Cleanup parity: Current cleanup operations: `DROP`. No legacy cleanup method body was available.
- Any observed difference, however small: SQL verb set differs: legacy ['SHOW', 'ANALYZE', 'CALL'] vs
  current ['DROP', 'CREATE', 'CALL', 'SHOW', 'ANALYZE']. Assertion helper names differ between legacy and current
  implementations. Current method uses parameter-injected environment helpers instead of Tempto query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Exact-name mapping with normalized body similarity `0.66`.
- Audit status: `verified`

##### `testStatisticsForTablePartitionedByVarchar`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestHiveTableStatistics.java` ->
  `testStatisticsForTablePartitionedByVarchar`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestHiveTableStatistics.java` ->
  `TestHiveTableStatistics.testStatisticsForTablePartitionedByVarchar`
- Mapping type: `direct`
- Environment parity: Current class requires `MultinodeHive4Environment`. No suite run selects this method from the
  current suite definitions.
- Tag parity: Current tags: none. Tag routing needs no suite-level product-test claim.
- Setup parity: Current setup operations: `CREATE`, `INSERT`. Legacy setup operations: none.
- Action parity: Current action verbs: `CALL`, `SHOW`, `ANALYZE`. Legacy action verbs: `SHOW`, `ANALYZE`, `CALL`.
- Assertion parity: Current assertion helpers: `assertStatsContainsOnly`, `assertThat`, `containsOnly`, `row`. Legacy
  assertion helpers: `assertThat`, `containsOnly`, `row`.
- Cleanup parity: Current cleanup operations: `DROP`. No legacy cleanup method body was available.
- Any observed difference, however small: SQL verb set differs: legacy ['SHOW', 'ANALYZE', 'CALL'] vs
  current ['DROP', 'CREATE', 'INSERT', 'CALL', 'SHOW', 'ANALYZE']. Assertion helper names differ between legacy and
  current implementations. Current method uses parameter-injected environment helpers instead of Tempto query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Exact-name mapping with normalized body similarity `0.70`.
- Audit status: `verified`

##### `testStatisticsForAllDataTypes`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestHiveTableStatistics.java` ->
  `testStatisticsForAllDataTypes`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestHiveTableStatistics.java` ->
  `TestHiveTableStatistics.testStatisticsForAllDataTypes`
- Mapping type: `direct`
- Environment parity: Current class requires `MultinodeHive4Environment`. No suite run selects this method from the
  current suite definitions.
- Tag parity: Current tags: none. Tag routing needs no suite-level product-test claim.
- Setup parity: Current setup operations: `CREATE`, `INSERT`. Legacy setup operations: none.
- Action parity: Current action verbs: `CALL`, `ANALYZE`, `SHOW`. Legacy action verbs: `ANALYZE`, `SHOW`, `CALL`.
- Assertion parity: Current assertion helpers: `assertThat`, `containsOnly`, `row`. Legacy assertion helpers:
  `assertThat`, `containsOnly`, `row`.
- Cleanup parity: Current cleanup operations: `DROP`. No legacy cleanup method body was available.
- Any observed difference, however small: SQL verb set differs: legacy ['ANALYZE', 'SHOW', 'CALL'] vs
  current ['DROP', 'CREATE', 'INSERT', 'CALL', 'ANALYZE', 'SHOW']. Current method uses parameter-injected environment
  helpers instead of Tempto query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Exact-name mapping with normalized body similarity `0.85`.
- Audit status: `verified`

##### `testStatisticsForAllDataTypesNoData`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestHiveTableStatistics.java` ->
  `testStatisticsForAllDataTypesNoData`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestHiveTableStatistics.java` ->
  `TestHiveTableStatistics.testStatisticsForAllDataTypesNoData`
- Mapping type: `direct`
- Environment parity: Current class requires `MultinodeHive4Environment`. No suite run selects this method from the
  current suite definitions.
- Tag parity: Current tags: none. Tag routing needs no suite-level product-test claim.
- Setup parity: Current setup operations: `CREATE`. Legacy setup operations: none.
- Action parity: Current action verbs: `ANALYZE`, `SHOW`, `CALL`. Legacy action verbs: `ANALYZE`, `SHOW`, `CALL`.
- Assertion parity: Current assertion helpers: `assertThat`, `containsOnly`, `row`. Legacy assertion helpers:
  `assertThat`, `containsOnly`, `row`.
- Cleanup parity: Current cleanup operations: `DROP`. No legacy cleanup method body was available.
- Any observed difference, however small: SQL verb set differs: legacy ['ANALYZE', 'SHOW', 'CALL'] vs
  current ['DROP', 'CREATE', 'ANALYZE', 'SHOW', 'CALL']. Current method uses parameter-injected environment helpers
  instead of Tempto query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Exact-name mapping with normalized body similarity `0.87`.
- Audit status: `verified`

##### `testStatisticsForAllDataTypesOnlyNulls`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestHiveTableStatistics.java` ->
  `testStatisticsForAllDataTypesOnlyNulls`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestHiveTableStatistics.java` ->
  `TestHiveTableStatistics.testStatisticsForAllDataTypesOnlyNulls`
- Mapping type: `direct`
- Environment parity: Current class requires `MultinodeHive4Environment`. No suite run selects this method from the
  current suite definitions.
- Tag parity: Current tags: none. Tag routing needs no suite-level product-test claim.
- Setup parity: Current setup operations: `CREATE`, `INSERT`. Legacy setup operations: `INSERT`.
- Action parity: Current action verbs: `ANALYZE`, `SHOW`, `CALL`. Legacy action verbs: `ANALYZE`, `SHOW`, `CALL`.
- Assertion parity: Current assertion helpers: `assertThat`, `containsOnly`, `row`. Legacy assertion helpers:
  `assertThat`, `containsOnly`, `row`.
- Cleanup parity: Current cleanup operations: `DROP`. No legacy cleanup method body was available.
- Any observed difference, however small: SQL verb set differs: legacy ['INSERT', 'ANALYZE', 'SHOW', 'CALL'] vs
  current ['DROP', 'CREATE', 'INSERT', 'ANALYZE', 'SHOW', 'CALL']. Current method uses parameter-injected environment
  helpers instead of Tempto query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Exact-name mapping with normalized body similarity `0.87`.
- Audit status: `verified`

##### `testStatisticsForSkewedTable`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestHiveTableStatistics.java` ->
  `testStatisticsForSkewedTable`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestHiveTableStatistics.java` ->
  `TestHiveTableStatistics.testStatisticsForSkewedTable`
- Mapping type: `direct`
- Environment parity: Current class requires `MultinodeHive4Environment`. No suite run selects this method from the
  current suite definitions.
- Tag parity: Current tags: none. Tag routing needs no suite-level product-test claim.
- Setup parity: Current setup operations: `CREATE`, `INSERT`. Legacy setup operations: `CREATE`, `INSERT`.
- Action parity: Current action verbs: `ANALYZE`, `CALL`. Legacy action verbs: `SHOW`, `ANALYZE`, `CALL`.
- Assertion parity: Current assertion helpers: `assertSkewedTableStats`. Legacy assertion helpers: `assertThat`,
  `containsOnly`, `row`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: Normalized body similarity is low (`0.42`), so fidelity was judged from
  SQL/helper/assertion shape instead of raw text. SQL verb set differs:
  legacy ['DROP', 'CREATE', 'INSERT', 'SHOW', 'ANALYZE', 'CALL'] vs
  current ['DROP', 'CREATE', 'INSERT', 'ANALYZE', 'CALL']. Assertion helper names differ between legacy and current
  implementations. Current method uses parameter-injected environment helpers instead of Tempto query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Exact-name mapping with normalized body similarity `0.42`.
- Audit status: `verified`

##### `testAnalyzesForSkewedTable`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestHiveTableStatistics.java` ->
  `testAnalyzesForSkewedTable`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestHiveTableStatistics.java` ->
  `TestHiveTableStatistics.testAnalyzesForSkewedTable`
- Mapping type: `direct`
- Environment parity: Current class requires `MultinodeHive4Environment`. No suite run selects this method from the
  current suite definitions.
- Tag parity: Current tags: none. Tag routing needs no suite-level product-test claim.
- Setup parity: Current setup operations: `CREATE`, `INSERT`. Legacy setup operations: `CREATE`, `INSERT`.
- Action parity: Current action verbs: `ANALYZE`. Legacy action verbs: `SHOW`, `ANALYZE`.
- Assertion parity: Current assertion helpers: `assertSkewedTableStats`, `assertThat`, `row`. Legacy assertion helpers:
  `assertThat`, `containsOnly`, `row`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: Normalized body similarity is low (`0.50`), so fidelity was judged from
  SQL/helper/assertion shape instead of raw text. SQL verb set differs:
  legacy ['DROP', 'CREATE', 'INSERT', 'SHOW', 'ANALYZE'] vs current ['DROP', 'CREATE', 'INSERT', 'ANALYZE']. Assertion
  helper names differ between legacy and current implementations. Current method uses parameter-injected environment
  helpers instead of Tempto query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Exact-name mapping with normalized body similarity `0.50`.
- Audit status: `verified`

##### `testAnalyzeForUnpartitionedTable`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestHiveTableStatistics.java` ->
  `testAnalyzeForUnpartitionedTable`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestHiveTableStatistics.java` ->
  `TestHiveTableStatistics.testAnalyzeForUnpartitionedTable`
- Mapping type: `direct`
- Environment parity: Current class requires `MultinodeHive4Environment`. No suite run selects this method from the
  current suite definitions.
- Tag parity: Current tags: none. Tag routing needs no suite-level product-test claim.
- Setup parity: Current setup operations: `CREATE`. Legacy setup operations: none.
- Action parity: Current action verbs: `CALL`, `SHOW`, `ANALYZE`. Legacy action verbs: `SHOW`, `ANALYZE`.
- Assertion parity: Current assertion helpers: `assertThat`, `containsOnly`, `row`. Legacy assertion helpers:
  `assertThat`, `containsOnly`, `row`.
- Cleanup parity: Current cleanup operations: `DROP`. No legacy cleanup method body was available.
- Any observed difference, however small: SQL verb set differs: legacy ['SHOW', 'ANALYZE'] vs
  current ['DROP', 'CREATE', 'CALL', 'SHOW', 'ANALYZE']. Current method uses parameter-injected environment helpers
  instead of Tempto query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Exact-name mapping with normalized body similarity `0.68`.
- Audit status: `verified`

##### `testAnalyzeForTablePartitionedByBigint`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestHiveTableStatistics.java` ->
  `testAnalyzeForTablePartitionedByBigint`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestHiveTableStatistics.java` ->
  `TestHiveTableStatistics.testAnalyzeForTablePartitionedByBigint`
- Mapping type: `direct`
- Environment parity: Current class requires `MultinodeHive4Environment`. No suite run selects this method from the
  current suite definitions.
- Tag parity: Current tags: none. Tag routing needs no suite-level product-test claim.
- Setup parity: Current setup operations: `CREATE`. Legacy setup operations: none.
- Action parity: Current action verbs: `CALL`, `SHOW`, `ANALYZE`, `WITH`. Legacy action verbs: `SHOW`, `ANALYZE`,
  `WITH`.
- Assertion parity: Current assertion helpers: `assertThat`, `containsOnly`, `row`. Legacy assertion helpers:
  `assertThat`, `containsOnly`, `row`.
- Cleanup parity: Current cleanup operations: `DROP`. No legacy cleanup method body was available.
- Any observed difference, however small: SQL verb set differs: legacy ['SHOW', 'ANALYZE', 'WITH'] vs
  current ['DROP', 'CREATE', 'CALL', 'SHOW', 'ANALYZE', 'WITH']. Current method uses parameter-injected environment
  helpers instead of Tempto query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Exact-name mapping with normalized body similarity `0.81`.
- Audit status: `verified`

##### `testAnalyzeForTablePartitionedByVarchar`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestHiveTableStatistics.java` ->
  `testAnalyzeForTablePartitionedByVarchar`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestHiveTableStatistics.java` ->
  `TestHiveTableStatistics.testAnalyzeForTablePartitionedByVarchar`
- Mapping type: `direct`
- Environment parity: Current class requires `MultinodeHive4Environment`. No suite run selects this method from the
  current suite definitions.
- Tag parity: Current tags: none. Tag routing needs no suite-level product-test claim.
- Setup parity: Current setup operations: `CREATE`, `INSERT`. Legacy setup operations: none.
- Action parity: Current action verbs: `CALL`, `SHOW`, `ANALYZE`, `WITH`. Legacy action verbs: `SHOW`, `ANALYZE`,
  `WITH`.
- Assertion parity: Current assertion helpers: `assertThat`, `containsOnly`, `row`. Legacy assertion helpers:
  `assertThat`, `containsOnly`, `row`.
- Cleanup parity: Current cleanup operations: `DROP`. No legacy cleanup method body was available.
- Any observed difference, however small: Normalized body similarity is low (`0.51`), so fidelity was judged from
  SQL/helper/assertion shape instead of raw text. SQL verb set differs: legacy ['SHOW', 'ANALYZE', 'WITH'] vs
  current ['DROP', 'CREATE', 'INSERT', 'CALL', 'SHOW', 'ANALYZE', 'WITH']. Current method uses parameter-injected
  environment helpers instead of Tempto query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Exact-name mapping with normalized body similarity `0.51`.
- Audit status: `verified`

##### `testAnalyzeForAllDataTypes`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestHiveTableStatistics.java` ->
  `testAnalyzeForAllDataTypes`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestHiveTableStatistics.java` ->
  `TestHiveTableStatistics.testAnalyzeForAllDataTypes`
- Mapping type: `direct`
- Environment parity: Current class requires `MultinodeHive4Environment`. No suite run selects this method from the
  current suite definitions.
- Tag parity: Current tags: none. Tag routing needs no suite-level product-test claim.
- Setup parity: Current setup operations: `CREATE`, `INSERT`. Legacy setup operations: none.
- Action parity: Current action verbs: `CALL`, `SHOW`, `ANALYZE`. Legacy action verbs: `SHOW`, `ANALYZE`.
- Assertion parity: Current assertion helpers: `assertThat`, `containsOnly`, `row`. Legacy assertion helpers:
  `assertThat`, `containsOnly`, `row`.
- Cleanup parity: Current cleanup operations: `DROP`. No legacy cleanup method body was available.
- Any observed difference, however small: SQL verb set differs: legacy ['SHOW', 'ANALYZE'] vs
  current ['DROP', 'CREATE', 'INSERT', 'CALL', 'SHOW', 'ANALYZE']. Current method uses parameter-injected environment
  helpers instead of Tempto query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Exact-name mapping with normalized body similarity `0.86`.
- Audit status: `verified`

##### `testAnalyzeForAllDataTypesNoData`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestHiveTableStatistics.java` ->
  `testAnalyzeForAllDataTypesNoData`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestHiveTableStatistics.java` ->
  `TestHiveTableStatistics.testAnalyzeForAllDataTypesNoData`
- Mapping type: `direct`
- Environment parity: Current class requires `MultinodeHive4Environment`. No suite run selects this method from the
  current suite definitions.
- Tag parity: Current tags: none. Tag routing needs no suite-level product-test claim.
- Setup parity: Current setup operations: `CREATE`. Legacy setup operations: none.
- Action parity: Current action verbs: `SHOW`, `ANALYZE`. Legacy action verbs: `SHOW`, `ANALYZE`.
- Assertion parity: Current assertion helpers: `assertThat`, `containsOnly`, `row`. Legacy assertion helpers:
  `assertThat`, `containsOnly`, `row`.
- Cleanup parity: Current cleanup operations: `DROP`. No legacy cleanup method body was available.
- Any observed difference, however small: SQL verb set differs: legacy ['SHOW', 'ANALYZE'] vs
  current ['DROP', 'CREATE', 'SHOW', 'ANALYZE']. Current method uses parameter-injected environment helpers instead of
  Tempto query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Exact-name mapping with normalized body similarity `0.88`.
- Audit status: `verified`

##### `testAnalyzeForAllDataTypesOnlyNulls`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestHiveTableStatistics.java` ->
  `testAnalyzeForAllDataTypesOnlyNulls`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestHiveTableStatistics.java` ->
  `TestHiveTableStatistics.testAnalyzeForAllDataTypesOnlyNulls`
- Mapping type: `direct`
- Environment parity: Current class requires `MultinodeHive4Environment`. No suite run selects this method from the
  current suite definitions.
- Tag parity: Current tags: none. Tag routing needs no suite-level product-test claim.
- Setup parity: Current setup operations: `CREATE`, `INSERT`. Legacy setup operations: `INSERT`.
- Action parity: Current action verbs: `SHOW`, `ANALYZE`. Legacy action verbs: `SHOW`, `ANALYZE`.
- Assertion parity: Current assertion helpers: `assertThat`, `containsOnly`, `row`. Legacy assertion helpers:
  `assertThat`, `containsOnly`, `row`.
- Cleanup parity: Current cleanup operations: `DROP`. No legacy cleanup method body was available.
- Any observed difference, however small: SQL verb set differs: legacy ['INSERT', 'SHOW', 'ANALYZE'] vs
  current ['DROP', 'CREATE', 'INSERT', 'SHOW', 'ANALYZE']. Current method uses parameter-injected environment helpers
  instead of Tempto query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Exact-name mapping with normalized body similarity `0.88`.
- Audit status: `verified`

##### `testComputeTableStatisticsOnCreateTable`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestHiveTableStatistics.java` ->
  `testComputeTableStatisticsOnCreateTable`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestHiveTableStatistics.java` ->
  `TestHiveTableStatistics.testComputeTableStatisticsOnCreateTable`
- Mapping type: `direct`
- Environment parity: Current class requires `MultinodeHive4Environment`. No suite run selects this method from the
  current suite definitions.
- Tag parity: Current tags: none. Tag routing needs no suite-level product-test claim.
- Setup parity: Current setup operations: `CREATE`, `INSERT`. No legacy setup method body was available.
- Action parity: Current action verbs: `SHOW`. No legacy action method body was available.
- Assertion parity: Current assertion helpers: `assertThat`, `containsOnly`. Legacy assertion helpers:
  `assertComputeTableStatisticsOnCreateTable`.
- Cleanup parity: Current cleanup operations: `DROP`. No legacy cleanup method body was available.
- Any observed difference, however small: Normalized body similarity is low (`0.08`), so fidelity was judged from
  SQL/helper/assertion shape instead of raw text. Assertion helper names differ between legacy and current
  implementations.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Exact-name mapping with normalized body similarity `0.08`.
- Audit status: `verified`

##### `testComputeFloatingPointStatistics`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestHiveTableStatistics.java` ->
  `testComputeFloatingPointStatistics`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestHiveTableStatistics.java` ->
  `TestHiveTableStatistics.testComputeFloatingPointStatistics`
- Mapping type: `direct`
- Environment parity: Current class requires `MultinodeHive4Environment`. No suite run selects this method from the
  current suite definitions.
- Tag parity: Current tags: none. Tag routing needs no suite-level product-test claim.
- Setup parity: Current setup operations: `CREATE`, `INSERT`. Legacy setup operations: `CREATE`, `INSERT`.
- Action parity: Current action verbs: `ANALYZE`, `SHOW`. Legacy action verbs: `ANALYZE`, `SHOW`.
- Assertion parity: Current assertion helpers: `assertThat`, `containsOnly`, `row`. Legacy assertion helpers:
  `assertThat`, `containsOnly`, `row`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: Current method uses parameter-injected environment helpers instead of Tempto
  query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Exact-name mapping with normalized body similarity `0.72`.
- Audit status: `verified`

##### `testComputeStatisticsForTableWithOnlyDateColumns`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestHiveTableStatistics.java` ->
  `testComputeStatisticsForTableWithOnlyDateColumns`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestHiveTableStatistics.java` ->
  `TestHiveTableStatistics.testComputeStatisticsForTableWithOnlyDateColumns`
- Mapping type: `direct`
- Environment parity: Current class requires `MultinodeHive4Environment`. No suite run selects this method from the
  current suite definitions.
- Tag parity: Current tags: none. Tag routing needs no suite-level product-test claim.
- Setup parity: Current setup operations: `CREATE`. Legacy setup operations: `CREATE`.
- Action parity: Current action verbs: `SHOW`, `ANALYZE`. Legacy action verbs: `SHOW`, `ANALYZE`.
- Assertion parity: Current assertion helpers: `assertThat`, `containsOnly`, `row`. Legacy assertion helpers:
  `assertThat`, `containsOnly`, `row`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: Current method uses parameter-injected environment helpers instead of Tempto
  query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Exact-name mapping with normalized body similarity `0.81`.
- Audit status: `verified`

##### `testMixedHiveAndTrinoStatistics`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestHiveTableStatistics.java` ->
  `testMixedHiveAndTrinoStatistics`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestHiveTableStatistics.java` ->
  `TestHiveTableStatistics.testMixedHiveAndTrinoStatistics`
- Mapping type: `direct`
- Environment parity: Current class requires `MultinodeHive4Environment`. No suite run selects this method from the
  current suite definitions.
- Tag parity: Current tags: none. Tag routing needs no suite-level product-test claim.
- Setup parity: Current setup operations: `CREATE`, `INSERT`. Legacy setup operations: `CREATE`, `INSERT`.
- Action parity: Current action verbs: `SHOW`, `CALL`, `ANALYZE`. Legacy action verbs: `SHOW`, `CALL`, `ANALYZE`.
- Assertion parity: Current assertion helpers: `assertThat`, `containsOnly`, `row`. Legacy assertion helpers:
  `assertThat`, `containsOnly`, `row`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: Current method uses parameter-injected environment helpers instead of Tempto
  query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Exact-name mapping with normalized body similarity `0.69`.
- Audit status: `verified`

##### `testEmptyPartitionedHiveStatistics`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestHiveTableStatistics.java` ->
  `testEmptyPartitionedHiveStatistics`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestHiveTableStatistics.java` ->
  `TestHiveTableStatistics.testEmptyPartitionedHiveStatistics`
- Mapping type: `direct`
- Environment parity: Current class requires `MultinodeHive4Environment`. No suite run selects this method from the
  current suite definitions.
- Tag parity: Current tags: none. Tag routing needs no suite-level product-test claim.
- Setup parity: Current setup operations: `CREATE`, `INSERT`. Legacy setup operations: `CREATE`, `INSERT`.
- Action parity: Current action verbs: `SHOW`. Legacy action verbs: `SHOW`.
- Assertion parity: Current assertion helpers: `assertThat`, `containsOnly`, `row`. Legacy assertion helpers:
  `assertThat`, `containsOnly`, `row`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: SQL verb set differs: legacy ['CREATE', 'INSERT', 'SHOW', 'DROP'] vs
  current ['DROP', 'CREATE', 'INSERT', 'SHOW']. Current method uses parameter-injected environment helpers instead of
  Tempto query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Exact-name mapping with normalized body similarity `0.55`.
- Audit status: `verified`

##### `testComputeTableStatisticsOnInsert`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestHiveTableStatistics.java` ->
  `testComputeTableStatisticsOnInsert`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestHiveTableStatistics.java` ->
  `TestHiveTableStatistics.testComputeTableStatisticsOnInsert`
- Mapping type: `direct`
- Environment parity: Current class requires `MultinodeHive4Environment`. No suite run selects this method from the
  current suite definitions.
- Tag parity: Current tags: none. Tag routing needs no suite-level product-test claim.
- Setup parity: Current setup operations: `CREATE`, `INSERT`. Legacy setup operations: `CREATE`, `INSERT`.
- Action parity: Current action verbs: `SHOW`. Legacy action verbs: `SHOW`.
- Assertion parity: Current assertion helpers: `assertComputeTableStatisticsOnInsert`, `assertThat`, `containsOnly`,
  `row`. Legacy assertion helpers: `assertComputeTableStatisticsOnInsert`, `assertThat`, `containsOnly`, `row`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: Current method uses parameter-injected environment helpers instead of Tempto
  query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Exact-name mapping with normalized body similarity `0.70`.
- Audit status: `verified`

##### `testComputePartitionStatisticsOnCreateTable`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestHiveTableStatistics.java` ->
  `testComputePartitionStatisticsOnCreateTable`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestHiveTableStatistics.java` ->
  `TestHiveTableStatistics.testComputePartitionStatisticsOnCreateTable`
- Mapping type: `direct`
- Environment parity: Current class requires `MultinodeHive4Environment`. No suite run selects this method from the
  current suite definitions.
- Tag parity: Current tags: none. Tag routing needs no suite-level product-test claim.
- Setup parity: Current setup operations: `CREATE`. Legacy setup operations: `CREATE`.
- Action parity: Current action verbs: `SHOW`. Legacy action verbs: `SELECT`, `SHOW`.
- Assertion parity: Current assertion helpers: `assertThat`, `containsOnly`, `row`. Legacy assertion helpers:
  `assertThat`, `containsOnly`, `row`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: SQL verb set differs: legacy ['DROP', 'CREATE', 'SELECT', 'SHOW'] vs
  current ['DROP', 'CREATE', 'SHOW']. Current method uses parameter-injected environment helpers instead of Tempto query
  executors.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Exact-name mapping with normalized body similarity `0.94`.
- Audit status: `verified`

##### `testComputePartitionStatisticsOnInsert`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestHiveTableStatistics.java` ->
  `testComputePartitionStatisticsOnInsert`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestHiveTableStatistics.java` ->
  `TestHiveTableStatistics.testComputePartitionStatisticsOnInsert`
- Mapping type: `direct`
- Environment parity: Current class requires `MultinodeHive4Environment`. No suite run selects this method from the
  current suite definitions.
- Tag parity: Current tags: none. Tag routing needs no suite-level product-test claim.
- Setup parity: Current setup operations: `CREATE`, `INSERT`. Legacy setup operations: `CREATE`, `INSERT`.
- Action parity: Current action verbs: `SHOW`. Legacy action verbs: `SHOW`.
- Assertion parity: Current assertion helpers: `assertThat`, `containsOnly`, `row`. Legacy assertion helpers:
  `assertThat`, `containsOnly`, `row`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: Current method uses parameter-injected environment helpers instead of Tempto
  query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Exact-name mapping with normalized body similarity `0.96`.
- Audit status: `verified`

### `TestHiveViewCompatibility`

- Owning migration commit: `Migrate TestHiveViewCompatibility to JUnit`
- Current class added in same migration commit:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestHiveViewCompatibility.java`
- Legacy class removed in same migration commit:
    - `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestHiveViewCompatibility.java`
- Class-level environment requirement: `HiveSparkEnvironment`.
- Class-level tags: `HiveSpark`, `HiveViewCompatibility`.
- Method inventory complete: Yes. Legacy methods: `4`. Current methods: `4`.
- Legacy helper/resource dependencies accounted for: Legacy class source reviewed directly.
- Intentional differences summary: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Method statuses present: `verified`.

#### Methods

##### `testSelectOnView`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestHiveViewCompatibility.java` ->
  `testSelectOnView`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestHiveViewCompatibility.java` ->
  `TestHiveViewCompatibility.testSelectOnView`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveSparkEnvironment`. Routed by source review into `SuiteCompatibility`
  run 1, `SuiteHiveSpark` run 1.
- Tag parity: Current tags: `HiveSpark`, `HiveViewCompatibility`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`. Legacy setup operations: `CREATE`.
- Action parity: Current action verbs: `SELECT`. Legacy action verbs: `SELECT`.
- Assertion parity: Current assertion helpers: `assertViewQuery`, `containsOnly`, `row`. Legacy assertion helpers:
  `assertViewQuery`, `containsOnly`, `row`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: No method-specific difference identified beyond the documented framework
  baseline.
- Known intentional difference: None.
- Reviewer note: Matched by current suite selection: `SuiteCompatibility` run 1, `SuiteHiveSpark` run 1 Exact-name
  mapping with normalized body similarity `0.75`.
- Audit status: `verified`

##### `testSelectOnViewFromDifferentSchema`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestHiveViewCompatibility.java` ->
  `testSelectOnViewFromDifferentSchema`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestHiveViewCompatibility.java` ->
  `TestHiveViewCompatibility.testSelectOnViewFromDifferentSchema`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveSparkEnvironment`. Routed by source review into `SuiteCompatibility`
  run 1, `SuiteHiveSpark` run 1.
- Tag parity: Current tags: `HiveSpark`, `HiveViewCompatibility`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`. Legacy setup operations: `CREATE`.
- Action parity: Current action verbs: `SELECT`. Legacy action verbs: `SELECT`.
- Assertion parity: Current assertion helpers: `assertViewQuery`. Legacy assertion helpers: `assertViewQuery`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: No method-specific difference identified beyond the documented framework
  baseline.
- Known intentional difference: None.
- Reviewer note: Matched by current suite selection: `SuiteCompatibility` run 1, `SuiteHiveSpark` run 1 Exact-name
  mapping with normalized body similarity `0.56`.
- Audit status: `verified`

##### `testExistingView`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestHiveViewCompatibility.java` ->
  `testExistingView`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestHiveViewCompatibility.java` ->
  `TestHiveViewCompatibility.testExistingView`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveSparkEnvironment`. Routed by source review into `SuiteCompatibility`
  run 1, `SuiteHiveSpark` run 1.
- Tag parity: Current tags: `HiveSpark`, `HiveViewCompatibility`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`. Legacy setup operations: `CREATE`.
- Action parity: Current action verbs: none. Legacy action verbs: none.
- Assertion parity: Current assertion helpers: `assertThatThrownBy`. Legacy assertion helpers: `assertQueryFailure`,
  `hasMessageContaining`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: Normalized body similarity is low (`0.50`), so fidelity was judged from
  SQL/helper/assertion shape instead of raw text. Assertion helper names differ between legacy and current
  implementations. Current method uses parameter-injected environment helpers instead of Tempto query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Matched by current suite selection: `SuiteCompatibility` run 1, `SuiteHiveSpark` run 1 Exact-name
  mapping with normalized body similarity `0.50`.
- Audit status: `verified`

##### `testCommentOnViewColumn`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestHiveViewCompatibility.java` ->
  `testCommentOnViewColumn`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestHiveViewCompatibility.java` ->
  `TestHiveViewCompatibility.testCommentOnViewColumn`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveSparkEnvironment`. Routed by source review into `SuiteCompatibility`
  run 1, `SuiteHiveSpark` run 1.
- Tag parity: Current tags: `HiveSpark`, `HiveViewCompatibility`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`. Legacy setup operations: `CREATE`.
- Action parity: Current action verbs: `SELECT`. Legacy action verbs: `SELECT`.
- Assertion parity: Current assertion helpers: `assertViewQuery`. Legacy assertion helpers: `assertViewQuery`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: Normalized body similarity is low (`0.48`), so fidelity was judged from
  SQL/helper/assertion shape instead of raw text. Current method uses parameter-injected environment helpers instead of
  Tempto query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Matched by current suite selection: `SuiteCompatibility` run 1, `SuiteHiveSpark` run 1 Exact-name
  mapping with normalized body similarity `0.48`.
- Audit status: `verified`

### `TestHiveViews`

- Owning migration commit: `Migrate TestHiveViews to JUnit`
- Current class added in same migration commit:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestHiveViews.java`
- Legacy class removed in same migration commit:
    - `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestHiveViews.java`
- Class-level environment requirement: `HiveBasicEnvironment`.
- Class-level tags: `HdfsNoImpersonation`.
- Method inventory complete: Yes. Legacy methods: `10`. Current methods: `41`.
- Legacy helper/resource dependencies accounted for: Legacy class source reviewed directly.
- Intentional differences summary: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Method statuses present: `verified`.

#### Methods

##### `testFailingHiveViewsWithMetadataListing`

- Legacy source method: `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestHiveViews.java` ->
  `testFailingHiveViewsWithMetadataListing`
- Current target method: `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestHiveViews.java` ->
  `TestHiveViews.testFailingHiveViewsWithMetadataListing`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveBasicEnvironment`. Routed by source review into `SuiteHiveBasic` run
    1.
- Tag parity: Current tags: `HdfsNoImpersonation`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: none. Legacy setup operations: none.
- Action parity: Current action verbs: none. Legacy action verbs: none.
- Assertion parity: Current assertion helpers: none. No legacy assertion method body was available.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: No method-specific difference identified beyond the documented framework
  baseline.
- Known intentional difference: None.
- Reviewer note: Matched by current suite selection: `SuiteHiveBasic` run 1 High normalized body similarity `0.86`.
- Audit status: `verified`

##### `testLateralViewExplode`

- Legacy source method: `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestHiveViews.java` ->
  `testLateralViewExplode`
- Current target method: `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestHiveViews.java` ->
  `TestHiveViews.testLateralViewExplode`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveBasicEnvironment`. Routed by source review into `SuiteHiveBasic` run
    1.
- Tag parity: Current tags: `HdfsNoImpersonation`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`. Legacy setup operations: `CREATE`.
- Action parity: Current action verbs: `SELECT`. Legacy action verbs: `SELECT`.
- Assertion parity: Current assertion helpers: `assertViewQuery`, `containsOnly`, `row`. Legacy assertion helpers:
  `assertViewQuery`, `containsOnly`, `row`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: Current method uses parameter-injected environment helpers instead of Tempto
  query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Matched by current suite selection: `SuiteHiveBasic` run 1 Exact-name mapping with normalized body
  similarity `0.87`.
- Audit status: `verified`

##### `testLateralViewExplodeArrayOfStructs`

- Legacy source method: `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestHiveViews.java` ->
  `testLateralViewExplodeArrayOfStructs`
- Current target method: `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestHiveViews.java` ->
  `TestHiveViews.testLateralViewExplodeArrayOfStructs`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveBasicEnvironment`. Routed by source review into `SuiteHiveBasic` run
    1.
- Tag parity: Current tags: `HdfsNoImpersonation`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`, `INSERT`. Legacy setup operations: `CREATE`, `INSERT`.
- Action parity: Current action verbs: `SELECT`. Legacy action verbs: `SELECT`.
- Assertion parity: Current assertion helpers: `assertViewQuery`, `containsOnly`, `row`. Legacy assertion helpers:
  `assertViewQuery`, `containsOnly`, `row`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: Current method uses parameter-injected environment helpers instead of Tempto
  query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Matched by current suite selection: `SuiteHiveBasic` run 1 Exact-name mapping with normalized body
  similarity `0.61`.
- Audit status: `verified`

##### `testLateralViewJsonTupleAs`

- Legacy source method: `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestHiveViews.java` ->
  `testLateralViewJsonTupleAs`
- Current target method: `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestHiveViews.java` ->
  `TestHiveViews.testLateralViewJsonTupleAs`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveBasicEnvironment`. Routed by source review into `SuiteHiveBasic` run
    1.
- Tag parity: Current tags: `HdfsNoImpersonation`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`. Legacy setup operations: `CREATE`.
- Action parity: Current action verbs: `SELECT`. Legacy action verbs: `SELECT`.
- Assertion parity: Current assertion helpers: `assertViewQuery`, `containsOnly`, `row`. Legacy assertion helpers:
  `assertViewQuery`, `containsOnly`, `row`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: Current method uses parameter-injected environment helpers instead of Tempto
  query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Matched by current suite selection: `SuiteHiveBasic` run 1 Exact-name mapping with normalized body
  similarity `0.91`.
- Audit status: `verified`

##### `testFromUtcTimestamp`

- Legacy source method: `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestHiveViews.java` ->
  `testFromUtcTimestamp`
- Current target method: `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestHiveViews.java` ->
  `TestHiveViews.testFromUtcTimestamp`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveBasicEnvironment`. Routed by source review into `SuiteHiveBasic` run
    1.
- Tag parity: Current tags: `HdfsNoImpersonation`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`, `INSERT`. Legacy setup operations: `CREATE`, `INSERT`.
- Action parity: Current action verbs: `SELECT`. Legacy action verbs: `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `containsOnly`, `row`. Legacy assertion helpers:
  `assertThat`, `containsOnly`, `row`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: Current method uses parameter-injected environment helpers instead of Tempto
  query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Matched by current suite selection: `SuiteHiveBasic` run 1 Exact-name mapping with normalized body
  similarity `0.96`.
- Audit status: `verified`

##### `testFromUtcTimestampInvalidTimeZone`

- Legacy source method: `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestHiveViews.java` ->
  `testFromUtcTimestampInvalidTimeZone`
- Current target method: `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestHiveViews.java` ->
  `TestHiveViews.testFromUtcTimestampInvalidTimeZone`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveBasicEnvironment`. Routed by source review into `SuiteHiveBasic` run
    1.
- Tag parity: Current tags: `HdfsNoImpersonation`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`, `INSERT`. Legacy setup operations: `CREATE`, `INSERT`.
- Action parity: Current action verbs: `SELECT`. Legacy action verbs: `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `assertThatThrownBy`, `containsOnly`,
  `hasMessageContaining`, `row`. Legacy assertion helpers: `assertQueryFailure`, `assertThat`, `containsOnly`,
  `hasMessageContaining`, `row`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: Assertion helper names differ between legacy and current implementations.
  Current method uses parameter-injected environment helpers instead of Tempto query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Matched by current suite selection: `SuiteHiveBasic` run 1 Exact-name mapping with normalized body
  similarity `0.83`.
- Audit status: `verified`

##### `testNestedFieldWithReservedKeyNames`

- Legacy source method: `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestHiveViews.java` ->
  `testNestedFieldWithReservedKeyNames`
- Current target method: `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestHiveViews.java` ->
  `TestHiveViews.testNestedFieldWithReservedKeyNames`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveBasicEnvironment`. Routed by source review into `SuiteHiveBasic` run
    1.
- Tag parity: Current tags: `HdfsNoImpersonation`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`, `INSERT`. Legacy setup operations: `CREATE`, `INSERT`.
- Action parity: Current action verbs: `SELECT`. Legacy action verbs: `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `containsOnly`, `row`. Legacy assertion helpers:
  `assertThat`, `containsOnly`, `row`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: Current method uses parameter-injected environment helpers instead of Tempto
  query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Matched by current suite selection: `SuiteHiveBasic` run 1 Exact-name mapping with normalized body
  similarity `0.92`.
- Audit status: `verified`

##### `testFromUtcTimestampCornerCases`

- Legacy source method: `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestHiveViews.java` ->
  `testFromUtcTimestampCornerCases`
- Current target method: `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestHiveViews.java` ->
  `TestHiveViews.testFromUtcTimestampCornerCases`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveBasicEnvironment`. Routed by source review into `SuiteHiveBasic` run
    1.
- Tag parity: Current tags: `HdfsNoImpersonation`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`. Legacy setup operations: `CREATE`.
- Action parity: Current action verbs: `SELECT`. Legacy action verbs: `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `containsOnly`, `row`. Legacy assertion helpers:
  `assertThat`, `containsOnly`, `row`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: Current method uses parameter-injected environment helpers instead of Tempto
  query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Matched by current suite selection: `SuiteHiveBasic` run 1 Exact-name mapping with normalized body
  similarity `0.92`.
- Audit status: `verified`

##### `testCastTimestampAsDecimal`

- Legacy source method: `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestHiveViews.java` ->
  `testCastTimestampAsDecimal`
- Current target method: `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestHiveViews.java` ->
  `TestHiveViews.testCastTimestampAsDecimal`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveBasicEnvironment`. Routed by source review into `SuiteHiveBasic` run
    1.
- Tag parity: Current tags: `HdfsNoImpersonation`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`, `INSERT`. Legacy setup operations: `CREATE`, `INSERT`.
- Action parity: Current action verbs: `SELECT`. Legacy action verbs: `SELECT`.
- Assertion parity: Current assertion helpers: `assertViewQuery`, `containsOnly`, `row`. Legacy assertion helpers:
  `assertViewQuery`, `containsOnly`, `row`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: No method-specific difference identified beyond the documented framework
  baseline.
- Known intentional difference: None.
- Reviewer note: Matched by current suite selection: `SuiteHiveBasic` run 1 High normalized body similarity `0.84`.
- Audit status: `verified`

##### `testUnionBetweenCharAndVarchar`

- Legacy source method: `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestHiveViews.java` ->
  `testUnionBetweenCharAndVarchar`
- Current target method: `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestHiveViews.java` ->
  `TestHiveViews.testUnionBetweenCharAndVarchar`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveBasicEnvironment`. Routed by source review into `SuiteHiveBasic` run
    1.
- Tag parity: Current tags: `HdfsNoImpersonation`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`, `INSERT`. Legacy setup operations: `CREATE`, `INSERT`.
- Action parity: Current action verbs: `SELECT`. Legacy action verbs: `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `containsOnly`, `row`. Legacy assertion helpers:
  `assertThat`, `containsOnly`, `row`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: Current method uses parameter-injected environment helpers instead of Tempto
  query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Matched by current suite selection: `SuiteHiveBasic` run 1 Exact-name mapping with normalized body
  similarity `0.71`.
- Audit status: `verified`

##### `testSelectOnView`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/AbstractTestHiveViews.java` ->
  `testSelectOnView`
- Current target method: `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestHiveViews.java` ->
  `TestHiveViews.testSelectOnView`
- Mapping type: `merged`
- Environment parity: Current class requires `HiveBasicEnvironment`. Routed by source review into `SuiteHiveBasic` run
    1.
- Tag parity: Current tags: `HdfsNoImpersonation`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`. Legacy setup operations: `CREATE`.
- Action parity: Current action verbs: `SELECT`. Legacy action verbs: `SELECT`.
- Assertion parity: Current assertion helpers: `assertViewQuery`, `containsOnly`, `row`. Legacy assertion helpers:
  `assertViewQuery`, `containsOnly`, `row`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: No method-specific difference identified beyond the documented framework
  baseline.
- Known intentional difference: None.
- Reviewer note: Matched by current suite selection: `SuiteHiveBasic` run 1 High normalized body similarity `0.88`.
- Audit status: `verified`

##### `testArrayIndexingInView`

- Legacy source method: Multiple legacy source methods matched:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/AbstractTestHiveViews.java` ->
  `testArrayIndexingInView`,
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestHiveViewsLegacy.java` ->
  `testArrayIndexingInView`
- Current target method: `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestHiveViews.java` ->
  `TestHiveViews.testArrayIndexingInView`
- Mapping type: `merged`
- Environment parity: Current class requires `HiveBasicEnvironment`. Routed by source review into `SuiteHiveBasic` run
    1.
- Tag parity: Current tags: `HdfsNoImpersonation`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`, `INSERT`. Legacy setup operations: `CREATE`, `INSERT`.
- Action parity: Current action verbs: `SELECT`. Legacy action verbs: `SELECT`.
- Assertion parity: Current assertion helpers: `assertViewQuery`, `containsOnly`, `row`. Legacy assertion helpers:
  `assertViewQuery`, `containsOnly`, `row`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: Legacy source review found the same method name in multiple sibling legacy
  classes; current coverage appears to consolidate that family.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Source/history review only.
- Audit status: `verified`

##### `testCommonTableExpression`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/AbstractTestHiveViews.java` ->
  `testCommonTableExpression`
- Current target method: `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestHiveViews.java` ->
  `TestHiveViews.testCommonTableExpression`
- Mapping type: `merged`
- Environment parity: Current class requires `HiveBasicEnvironment`. Routed by source review into `SuiteHiveBasic` run
    1.
- Tag parity: Current tags: `HdfsNoImpersonation`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`. Legacy setup operations: `CREATE`.
- Action parity: Current action verbs: `WITH`, `SELECT`. Legacy action verbs: `WITH`, `SELECT`.
- Assertion parity: Current assertion helpers: `assertViewQuery`, `containsOnly`, `row`. Legacy assertion helpers:
  `assertViewQuery`, `containsOnly`, `row`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: No method-specific difference identified beyond the documented framework
  baseline.
- Known intentional difference: None.
- Reviewer note: Matched by current suite selection: `SuiteHiveBasic` run 1 Exact-name mapping with normalized body
  similarity `0.76`.
- Audit status: `verified`

##### `testNestedCommonTableExpression`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/AbstractTestHiveViews.java` ->
  `testNestedCommonTableExpression`
- Current target method: `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestHiveViews.java` ->
  `TestHiveViews.testNestedCommonTableExpression`
- Mapping type: `merged`
- Environment parity: Current class requires `HiveBasicEnvironment`. Routed by source review into `SuiteHiveBasic` run
    1.
- Tag parity: Current tags: `HdfsNoImpersonation`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`. Legacy setup operations: `CREATE`.
- Action parity: Current action verbs: `WITH`, `SELECT`. Legacy action verbs: `WITH`, `SELECT`.
- Assertion parity: Current assertion helpers: `assertViewQuery`, `containsOnly`, `row`. Legacy assertion helpers:
  `assertViewQuery`, `containsOnly`, `row`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: No method-specific difference identified beyond the documented framework
  baseline.
- Known intentional difference: None.
- Reviewer note: Matched by current suite selection: `SuiteHiveBasic` run 1 High normalized body similarity `0.82`.
- Audit status: `verified`

##### `testArrayConstructionInView`

- Legacy source method: Multiple legacy source methods matched:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/AbstractTestHiveViews.java` ->
  `testArrayConstructionInView`,
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestHiveViewsLegacy.java` ->
  `testArrayConstructionInView`
- Current target method: `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestHiveViews.java` ->
  `TestHiveViews.testArrayConstructionInView`
- Mapping type: `merged`
- Environment parity: Current class requires `HiveBasicEnvironment`. Routed by source review into `SuiteHiveBasic` run
    1.
- Tag parity: Current tags: `HdfsNoImpersonation`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`. Legacy setup operations: `CREATE`.
- Action parity: Current action verbs: `SELECT`. Legacy action verbs: `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `containsOnly`, `row`. Legacy assertion helpers:
  `assertThat`, `containsOnly`, `row`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: Legacy source review found the same method name in multiple sibling legacy
  classes; current coverage appears to consolidate that family.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Source/history review only.
- Audit status: `verified`

##### `testMapConstructionInView`

- Legacy source method: Multiple legacy source methods matched:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/AbstractTestHiveViews.java` ->
  `testMapConstructionInView`,
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestHiveViewsLegacy.java` ->
  `testMapConstructionInView`
- Current target method: `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestHiveViews.java` ->
  `TestHiveViews.testMapConstructionInView`
- Mapping type: `merged`
- Environment parity: Current class requires `HiveBasicEnvironment`. Routed by source review into `SuiteHiveBasic` run
    1.
- Tag parity: Current tags: `HdfsNoImpersonation`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`. Legacy setup operations: `CREATE`.
- Action parity: Current action verbs: `SELECT`. Legacy action verbs: `SELECT`.
- Assertion parity: Current assertion helpers: `assertViewQuery`, `containsOnly`, `row`. Legacy assertion helpers:
  `assertViewQuery`, `containsOnly`, `row`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: Legacy source review found the same method name in multiple sibling legacy
  classes; current coverage appears to consolidate that family.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Source/history review only.
- Audit status: `verified`

##### `testSelectOnViewFromDifferentSchema`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/AbstractTestHiveViews.java` ->
  `testSelectOnViewFromDifferentSchema`
- Current target method: `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestHiveViews.java` ->
  `TestHiveViews.testSelectOnViewFromDifferentSchema`
- Mapping type: `merged`
- Environment parity: Current class requires `HiveBasicEnvironment`. Routed by source review into `SuiteHiveBasic` run
    1.
- Tag parity: Current tags: `HdfsNoImpersonation`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`. Legacy setup operations: `CREATE`.
- Action parity: Current action verbs: `SELECT`. Legacy action verbs: `SELECT`.
- Assertion parity: Current assertion helpers: `assertViewQuery`. Legacy assertion helpers: `assertViewQuery`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: No method-specific difference identified beyond the documented framework
  baseline.
- Known intentional difference: None.
- Reviewer note: Matched by current suite selection: `SuiteHiveBasic` run 1 Exact-name mapping with normalized body
  similarity `0.70`.
- Audit status: `verified`

##### `testViewReferencingTableInDifferentSchema`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/AbstractTestHiveViews.java` ->
  `testViewReferencingTableInDifferentSchema`
- Current target method: `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestHiveViews.java` ->
  `TestHiveViews.testViewReferencingTableInDifferentSchema`
- Mapping type: `merged`
- Environment parity: Current class requires `HiveBasicEnvironment`. Routed by source review into `SuiteHiveBasic` run
    1.
- Tag parity: Current tags: `HdfsNoImpersonation`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`. Legacy setup operations: `CREATE`.
- Action parity: Current action verbs: `SELECT`. Legacy action verbs: `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `containsOnly`, `row`. Legacy assertion helpers:
  `assertThat`, `containsOnly`, `row`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: Normalized body similarity is low (`0.41`), so fidelity was judged from
  SQL/helper/assertion shape instead of raw text. Current method uses parameter-injected environment helpers instead of
  Tempto query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Matched by current suite selection: `SuiteHiveBasic` run 1 Exact-name mapping with normalized body
  similarity `0.41`.
- Audit status: `verified`

##### `testViewReferencingTableInTheSameSchemaWithoutQualifier`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/AbstractTestHiveViews.java` ->
  `testViewReferencingTableInTheSameSchemaWithoutQualifier`
- Current target method: `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestHiveViews.java` ->
  `TestHiveViews.testViewReferencingTableInTheSameSchemaWithoutQualifier`
- Mapping type: `merged`
- Environment parity: Current class requires `HiveBasicEnvironment`. Routed by source review into `SuiteHiveBasic` run
    1.
- Tag parity: Current tags: `HdfsNoImpersonation`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`. Legacy setup operations: `CREATE`.
- Action parity: Current action verbs: `SELECT`. Legacy action verbs: `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `containsOnly`, `row`. Legacy assertion helpers:
  `assertThat`, `containsOnly`, `row`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: Current method uses parameter-injected environment helpers instead of Tempto
  query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Matched by current suite selection: `SuiteHiveBasic` run 1 Exact-name mapping with normalized body
  similarity `0.76`.
- Audit status: `verified`

##### `testViewWithUnsupportedCoercion`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/AbstractTestHiveViews.java` ->
  `testViewWithUnsupportedCoercion`
- Current target method: `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestHiveViews.java` ->
  `TestHiveViews.testViewWithUnsupportedCoercion`
- Mapping type: `merged`
- Environment parity: Current class requires `HiveBasicEnvironment`. Routed by source review into `SuiteHiveBasic` run
    1.
- Tag parity: Current tags: `HdfsNoImpersonation`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`. Legacy setup operations: `CREATE`.
- Action parity: Current action verbs: `SELECT`. Legacy action verbs: `SELECT`.
- Assertion parity: Current assertion helpers: `assertThatThrownBy`, `hasMessageContaining`. Legacy assertion helpers:
  `assertQueryFailure`, `hasMessageContaining`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: Assertion helper names differ between legacy and current implementations.
  Current method uses parameter-injected environment helpers instead of Tempto query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Matched by current suite selection: `SuiteHiveBasic` run 1 Exact-name mapping with normalized body
  similarity `0.77`.
- Audit status: `verified`

##### `testOuterParentheses`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/AbstractTestHiveViews.java` ->
  `testOuterParentheses`
- Current target method: `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestHiveViews.java` ->
  `TestHiveViews.testOuterParentheses`
- Mapping type: `merged`
- Environment parity: Current class requires `HiveBasicEnvironment`. Routed by source review into `SuiteHiveBasic` run
    1.
- Tag parity: Current tags: `HdfsNoImpersonation`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`. Legacy setup operations: `CREATE`.
- Action parity: Current action verbs: `SELECT`. Legacy action verbs: `SELECT`.
- Assertion parity: Current assertion helpers: `assertViewQuery`, `containsOnly`, `row`. Legacy assertion helpers:
  `assertViewQuery`, `containsOnly`, `row`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: No method-specific difference identified beyond the documented framework
  baseline.
- Known intentional difference: None.
- Reviewer note: Matched by current suite selection: `SuiteHiveBasic` run 1 Exact-name mapping with normalized body
  similarity `0.74`.
- Audit status: `verified`

##### `testDateFunction`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/AbstractTestHiveViews.java` ->
  `testDateFunction`
- Current target method: `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestHiveViews.java` ->
  `TestHiveViews.testDateFunction`
- Mapping type: `merged`
- Environment parity: Current class requires `HiveBasicEnvironment`. Routed by source review into `SuiteHiveBasic` run
    1.
- Tag parity: Current tags: `HdfsNoImpersonation`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`, `INSERT`. Legacy setup operations: `CREATE`, `INSERT`.
- Action parity: Current action verbs: `SELECT`. Legacy action verbs: `SELECT`.
- Assertion parity: Current assertion helpers: `assertViewQuery`, `containsOnly`, `row`. Legacy assertion helpers:
  `assertViewQuery`, `containsOnly`, `row`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: No method-specific difference identified beyond the documented framework
  baseline.
- Known intentional difference: None.
- Reviewer note: Matched by current suite selection: `SuiteHiveBasic` run 1 Exact-name mapping with normalized body
  similarity `0.77`.
- Audit status: `verified`

##### `testPmodFunction`

- Legacy source method: Multiple legacy source methods matched:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/AbstractTestHiveViews.java` ->
  `testPmodFunction`,
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestHiveViewsLegacy.java` -> `testPmodFunction`
- Current target method: `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestHiveViews.java` ->
  `TestHiveViews.testPmodFunction`
- Mapping type: `merged`
- Environment parity: Current class requires `HiveBasicEnvironment`. Routed by source review into `SuiteHiveBasic` run
    1.
- Tag parity: Current tags: `HdfsNoImpersonation`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`, `INSERT`. Legacy setup operations: `CREATE`, `INSERT`.
- Action parity: Current action verbs: `SELECT`. Legacy action verbs: `SELECT`.
- Assertion parity: Current assertion helpers: `assertViewQuery`, `containsOnly`, `row`. Legacy assertion helpers:
  `assertViewQuery`, `containsOnly`, `row`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: Legacy source review found the same method name in multiple sibling legacy
  classes; current coverage appears to consolidate that family.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Source/history review only.
- Audit status: `verified`

##### `testWithUnsupportedFunction`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/AbstractTestHiveViews.java` ->
  `testWithUnsupportedFunction`
- Current target method: `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestHiveViews.java` ->
  `TestHiveViews.testWithUnsupportedFunction`
- Mapping type: `merged`
- Environment parity: Current class requires `HiveBasicEnvironment`. Routed by source review into `SuiteHiveBasic` run
    1.
- Tag parity: Current tags: `HdfsNoImpersonation`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`. Legacy setup operations: `CREATE`.
- Action parity: Current action verbs: `SELECT`. Legacy action verbs: `SELECT`.
- Assertion parity: Current assertion helpers: `assertThatThrownBy`, `hasMessageContaining`. Legacy assertion helpers:
  `assertQueryFailure`, `hasMessageContaining`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: Assertion helper names differ between legacy and current implementations.
  Current method uses parameter-injected environment helpers instead of Tempto query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Matched by current suite selection: `SuiteHiveBasic` run 1 Exact-name mapping with normalized body
  similarity `0.77`.
- Audit status: `verified`

##### `testExistingView`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/AbstractTestHiveViews.java` ->
  `testExistingView`
- Current target method: `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestHiveViews.java` ->
  `TestHiveViews.testExistingView`
- Mapping type: `merged`
- Environment parity: Current class requires `HiveBasicEnvironment`. Routed by source review into `SuiteHiveBasic` run
    1.
- Tag parity: Current tags: `HdfsNoImpersonation`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`. Legacy setup operations: `CREATE`.
- Action parity: Current action verbs: none. Legacy action verbs: none.
- Assertion parity: Current assertion helpers: `assertThatThrownBy`, `hasMessageContaining`. Legacy assertion helpers:
  `assertQueryFailure`, `hasMessageContaining`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: Assertion helper names differ between legacy and current implementations.
  Current method uses parameter-injected environment helpers instead of Tempto query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Matched by current suite selection: `SuiteHiveBasic` run 1 Exact-name mapping with normalized body
  similarity `0.70`.
- Audit status: `verified`

##### `testShowCreateView`

- Legacy source method: Multiple legacy source methods matched:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/AbstractTestHiveViews.java` ->
  `testShowCreateView`,
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestHiveViewsLegacy.java` ->
  `testShowCreateView`
- Current target method: `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestHiveViews.java` ->
  `TestHiveViews.testShowCreateView`
- Mapping type: `merged`
- Environment parity: Current class requires `HiveBasicEnvironment`. Routed by source review into `SuiteHiveBasic` run
    1.
- Tag parity: Current tags: `HdfsNoImpersonation`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`. Legacy setup operations: `CREATE`.
- Action parity: Current action verbs: `SHOW`, `SELECT`. Legacy action verbs: `SHOW`, `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `isEqualTo`. Legacy assertion helpers: `assertThat`,
  `isEqualTo`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: Legacy source review found the same method name in multiple sibling legacy
  classes; current coverage appears to consolidate that family.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Source/history review only.
- Audit status: `verified`

##### `testRichSqlSyntax`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/AbstractTestHiveViews.java` ->
  `testRichSqlSyntax`
- Current target method: `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestHiveViews.java` ->
  `TestHiveViews.testRichSqlSyntax`
- Mapping type: `merged`
- Environment parity: Current class requires `HiveBasicEnvironment`. Routed by source review into `SuiteHiveBasic` run
    1.
- Tag parity: Current tags: `HdfsNoImpersonation`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`. Legacy setup operations: `CREATE`.
- Action parity: Current action verbs: `SELECT`. Legacy action verbs: `SELECT`.
- Assertion parity: Current assertion helpers: `assertViewQuery`, `containsOnly`, `row`. Legacy assertion helpers:
  `assertViewQuery`, `containsOnly`, `row`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: No method-specific difference identified beyond the documented framework
  baseline.
- Known intentional difference: None.
- Reviewer note: Matched by current suite selection: `SuiteHiveBasic` run 1 High normalized body similarity `0.96`.
- Audit status: `verified`

##### `testIdentifierThatStartWithDigit`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/AbstractTestHiveViews.java` ->
  `testIdentifierThatStartWithDigit`
- Current target method: `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestHiveViews.java` ->
  `TestHiveViews.testIdentifierThatStartWithDigit`
- Mapping type: `merged`
- Environment parity: Current class requires `HiveBasicEnvironment`. Routed by source review into `SuiteHiveBasic` run
    1.
- Tag parity: Current tags: `HdfsNoImpersonation`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`. Legacy setup operations: `CREATE`.
- Action parity: Current action verbs: `SELECT`. Legacy action verbs: `SELECT`.
- Assertion parity: Current assertion helpers: `assertViewQuery`, `contains`, `row`. Legacy assertion helpers:
  `assertViewQuery`, `contains`, `row`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: Current method uses parameter-injected environment helpers instead of Tempto
  query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Matched by current suite selection: `SuiteHiveBasic` run 1 Exact-name mapping with normalized body
  similarity `0.78`.
- Audit status: `verified`

##### `testHiveViewInInformationSchema`

- Legacy source method: Multiple legacy source methods matched:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/AbstractTestHiveViews.java` ->
  `testHiveViewInInformationSchema`,
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestHiveViewsLegacy.java` ->
  `testHiveViewInInformationSchema`
- Current target method: `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestHiveViews.java` ->
  `TestHiveViews.testHiveViewInInformationSchema`
- Mapping type: `merged`
- Environment parity: Current class requires `HiveBasicEnvironment`. Routed by source review into `SuiteHiveBasic` run
    1.
- Tag parity: Current tags: `HdfsNoImpersonation`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`. Legacy setup operations: `CREATE`.
- Action parity: Current action verbs: `SELECT`, `DESCRIBE`. Legacy action verbs: `SELECT`, `DESCRIBE`.
- Assertion parity: Current assertion helpers: `assertThat`, `contains`, `containsOnly`, `row`. Legacy assertion
  helpers: `assertThat`, `contains`, `containsOnly`, `row`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: Legacy source review found the same method name in multiple sibling legacy
  classes; current coverage appears to consolidate that family.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Source/history review only.
- Audit status: `verified`

##### `testHiveViewWithParametrizedTypes`

- Legacy source method: Multiple legacy source methods matched:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/AbstractTestHiveViews.java` ->
  `testHiveViewWithParametrizedTypes`,
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestHiveViewsLegacy.java` ->
  `testHiveViewWithParametrizedTypes`
- Current target method: `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestHiveViews.java` ->
  `TestHiveViews.testHiveViewWithParametrizedTypes`
- Mapping type: `merged`
- Environment parity: Current class requires `HiveBasicEnvironment`. Routed by source review into `SuiteHiveBasic` run
    1.
- Tag parity: Current tags: `HdfsNoImpersonation`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`, `INSERT`. Legacy setup operations: `CREATE`, `INSERT`.
- Action parity: Current action verbs: `SELECT`. Legacy action verbs: `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `assertViewQuery`, `containsOnly`, `row`. Legacy assertion
  helpers: `assertThat`, `assertViewQuery`, `containsOnly`, `row`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: Legacy source review found the same method name in multiple sibling legacy
  classes; current coverage appears to consolidate that family.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Source/history review only.
- Audit status: `verified`

##### `testHiveViewWithTextualTypes`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/AbstractTestHiveViews.java` ->
  `testHiveViewWithTextualTypes`
- Current target method: `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestHiveViews.java` ->
  `TestHiveViews.testHiveViewWithTextualTypes`
- Mapping type: `merged`
- Environment parity: Current class requires `HiveBasicEnvironment`. Routed by source review into `SuiteHiveBasic` run
    1.
- Tag parity: Current tags: `HdfsNoImpersonation`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`, `INSERT`. Legacy setup operations: `CREATE`, `INSERT`.
- Action parity: Current action verbs: `SELECT`. Legacy action verbs: `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `assertViewQuery`, `containsOnly`, `row`. Legacy assertion
  helpers: `assertThat`, `assertViewQuery`, `containsOnly`, `row`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: Current method uses parameter-injected environment helpers instead of Tempto
  query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Matched by current suite selection: `SuiteHiveBasic` run 1 Exact-name mapping with normalized body
  similarity `0.81`.
- Audit status: `verified`

##### `testNestedHiveViews`

- Legacy source method: Multiple legacy source methods matched:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/AbstractTestHiveViews.java` ->
  `testNestedHiveViews`,
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestHiveViewsLegacy.java` ->
  `testNestedHiveViews`
- Current target method: `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestHiveViews.java` ->
  `TestHiveViews.testNestedHiveViews`
- Mapping type: `merged`
- Environment parity: Current class requires `HiveBasicEnvironment`. Routed by source review into `SuiteHiveBasic` run
    1.
- Tag parity: Current tags: `HdfsNoImpersonation`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`. Legacy setup operations: `CREATE`.
- Action parity: Current action verbs: `SELECT`. Legacy action verbs: `SELECT`.
- Assertion parity: Current assertion helpers: `assertViewQuery`, `containsOnly`, `row`. Legacy assertion helpers:
  `assertViewQuery`, `containsOnly`, `row`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: Legacy source review found the same method name in multiple sibling legacy
  classes; current coverage appears to consolidate that family.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Source/history review only.
- Audit status: `verified`

##### `testSelectFromHiveViewWithoutDefaultCatalogAndSchema`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/AbstractTestHiveViews.java` ->
  `testSelectFromHiveViewWithoutDefaultCatalogAndSchema`
- Current target method: `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestHiveViews.java` ->
  `TestHiveViews.testSelectFromHiveViewWithoutDefaultCatalogAndSchema`
- Mapping type: `merged`
- Environment parity: Current class requires `HiveBasicEnvironment`. Routed by source review into `SuiteHiveBasic` run
    1.
- Tag parity: Current tags: `HdfsNoImpersonation`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`. Legacy setup operations: `CREATE`.
- Action parity: Current action verbs: `SELECT`. Legacy action verbs: `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `assertThatThrownBy`, `isEqualTo`. Legacy assertion
  helpers: `assertQueryFailure`, `assertThat`, `containsOnly`, `row`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: Assertion helper names differ between legacy and current implementations.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Matched by current suite selection: `SuiteHiveBasic` run 1 Exact-name mapping with normalized body
  similarity `0.65`.
- Audit status: `verified`

##### `testTimestampHiveView`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/AbstractTestHiveViews.java` ->
  `testTimestampHiveView`
- Current target method: `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestHiveViews.java` ->
  `TestHiveViews.testTimestampHiveView`
- Mapping type: `merged`
- Environment parity: Current class requires `HiveBasicEnvironment`. Routed by source review into `SuiteHiveBasic` run
    1.
- Tag parity: Current tags: `HdfsNoImpersonation`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`, `INSERT`. Legacy setup operations: `CREATE`, `INSERT`.
- Action parity: Current action verbs: `SELECT`. Legacy action verbs: `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `containsOnly`, `row`. Legacy assertion helpers:
  `assertThat`, `containsOnly`, `row`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: Normalized body similarity is low (`0.49`), so fidelity was judged from
  SQL/helper/assertion shape instead of raw text. Current method uses parameter-injected environment helpers instead of
  Tempto query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Matched by current suite selection: `SuiteHiveBasic` run 1 Exact-name mapping with normalized body
  similarity `0.49`.
- Audit status: `verified`

##### `testCurrentUser`

- Legacy source method: Multiple legacy source methods matched:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/AbstractTestHiveViews.java` ->
  `testCurrentUser`, `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestHiveViewsLegacy.java` ->
  `testCurrentUser`
- Current target method: `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestHiveViews.java` ->
  `TestHiveViews.testCurrentUser`
- Mapping type: `merged`
- Environment parity: Current class requires `HiveBasicEnvironment`. Routed by source review into `SuiteHiveBasic` run
    1.
- Tag parity: Current tags: `HdfsNoImpersonation`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`. Legacy setup operations: `CREATE`.
- Action parity: Current action verbs: `SELECT`. Legacy action verbs: `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `containsOnly`, `isEqualTo`, `row`. Legacy assertion
  helpers: `assertThat`, `containsOnly`, `row`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: Legacy source review found the same method name in multiple sibling legacy
  classes; current coverage appears to consolidate that family.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Source/history review only.
- Audit status: `verified`

##### `testNestedGroupBy`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/AbstractTestHiveViews.java` ->
  `testNestedGroupBy`
- Current target method: `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestHiveViews.java` ->
  `TestHiveViews.testNestedGroupBy`
- Mapping type: `merged`
- Environment parity: Current class requires `HiveBasicEnvironment`. Routed by source review into `SuiteHiveBasic` run
    1.
- Tag parity: Current tags: `HdfsNoImpersonation`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`. Legacy setup operations: `CREATE`.
- Action parity: Current action verbs: `SELECT`. Legacy action verbs: `SELECT`.
- Assertion parity: Current assertion helpers: `assertViewQuery`, `containsOnly`, `row`. Legacy assertion helpers:
  `assertViewQuery`, `containsOnly`, `row`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: No method-specific difference identified beyond the documented framework
  baseline.
- Known intentional difference: None.
- Reviewer note: Matched by current suite selection: `SuiteHiveBasic` run 1 High normalized body similarity `0.81`.
- Audit status: `verified`

##### `testUnionAllViews`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/AbstractTestHiveViews.java` ->
  `testUnionAllViews`
- Current target method: `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestHiveViews.java` ->
  `TestHiveViews.testUnionAllViews`
- Mapping type: `merged`
- Environment parity: Current class requires `HiveBasicEnvironment`. Routed by source review into `SuiteHiveBasic` run
    1.
- Tag parity: Current tags: `HdfsNoImpersonation`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`, `INSERT`. Legacy setup operations: `CREATE`, `INSERT`.
- Action parity: Current action verbs: `SELECT`. Legacy action verbs: `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `containsOnly`, `row`. Legacy assertion helpers:
  `assertThat`, `containsOnly`, `row`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: Current method uses parameter-injected environment helpers instead of Tempto
  query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Matched by current suite selection: `SuiteHiveBasic` run 1 Exact-name mapping with normalized body
  similarity `0.68`.
- Audit status: `verified`

##### `testUnionDistinctViews`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/AbstractTestHiveViews.java` ->
  `testUnionDistinctViews`
- Current target method: `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestHiveViews.java` ->
  `TestHiveViews.testUnionDistinctViews`
- Mapping type: `merged`
- Environment parity: Current class requires `HiveBasicEnvironment`. Routed by source review into `SuiteHiveBasic` run
    1.
- Tag parity: Current tags: `HdfsNoImpersonation`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`, `INSERT`. Legacy setup operations: `CREATE`, `INSERT`.
- Action parity: Current action verbs: `SELECT`. Legacy action verbs: `SELECT`.
- Assertion parity: Current assertion helpers: `assertViewQuery`, `containsOnly`, `row`. Legacy assertion helpers:
  `assertViewQuery`, `containsOnly`, `row`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: No method-specific difference identified beyond the documented framework
  baseline.
- Known intentional difference: None.
- Reviewer note: Matched by current suite selection: `SuiteHiveBasic` run 1 High normalized body similarity `0.83`.
- Audit status: `verified`

##### `testHivePartitionViews`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/AbstractTestHiveViews.java` ->
  `testHivePartitionViews`
- Current target method: `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestHiveViews.java` ->
  `TestHiveViews.testHivePartitionViews`
- Mapping type: `merged`
- Environment parity: Current class requires `HiveBasicEnvironment`. Routed by source review into `SuiteHiveBasic` run
    1.
- Tag parity: Current tags: `HdfsNoImpersonation`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`, `INSERT`. Legacy setup operations: `CREATE`, `INSERT`.
- Action parity: Current action verbs: `SELECT`. Legacy action verbs: `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `containsOnly`, `row`. Legacy assertion helpers:
  `assertThat`, `containsOnly`, `row`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: Current method uses parameter-injected environment helpers instead of Tempto
  query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Matched by current suite selection: `SuiteHiveBasic` run 1 Exact-name mapping with normalized body
  similarity `0.68`.
- Audit status: `verified`

##### `testViewWithColumnAliasesDifferingInCase`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/AbstractTestHiveViews.java` ->
  `testViewWithColumnAliasesDifferingInCase`
- Current target method: `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestHiveViews.java` ->
  `TestHiveViews.testViewWithColumnAliasesDifferingInCase`
- Mapping type: `merged`
- Environment parity: Current class requires `HiveBasicEnvironment`. Routed by source review into `SuiteHiveBasic` run
    1.
- Tag parity: Current tags: `HdfsNoImpersonation`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`, `INSERT`. Legacy setup operations: `CREATE`, `INSERT`.
- Action parity: Current action verbs: `SELECT`. Legacy action verbs: `SELECT`.
- Assertion parity: Current assertion helpers: `assertViewQuery`, `containsOnly`, `row`. Legacy assertion helpers:
  `assertViewQuery`, `containsOnly`, `row`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: Normalized body similarity is low (`0.15`), so fidelity was judged from
  SQL/helper/assertion shape instead of raw text.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Matched by current suite selection: `SuiteHiveBasic` run 1 Exact-name mapping with normalized body
  similarity `0.15`.
- Audit status: `verified`

##### `testRunAsInvoker`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/AbstractTestHiveViews.java` ->
  `testRunAsInvoker`
- Current target method: `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestHiveViews.java` ->
  `TestHiveViews.testRunAsInvoker`
- Mapping type: `merged`
- Environment parity: Current class requires `HiveBasicEnvironment`. Routed by source review into `SuiteHiveBasic` run
    1.
- Tag parity: Current tags: `HdfsNoImpersonation`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`. Legacy setup operations: `CREATE`.
- Action parity: Current action verbs: `SELECT`. Legacy action verbs: `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `assertThatThrownBy`, `hasMessageContaining`. Legacy
  assertion helpers: `assertThat`, `assertThatThrownBy`, `hasMessageContaining`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: Current method uses parameter-injected environment helpers instead of Tempto
  query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Matched by current suite selection: `SuiteHiveBasic` run 1 Exact-name mapping with normalized body
  similarity `0.62`.
- Audit status: `verified`

### `TestHiveViewsLegacy`

- Owning migration commit: `Migrate TestHiveViewsLegacy to JUnit`
- Current class added in same migration commit:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestHiveViewsLegacy.java`
- Legacy class removed in same migration commit:
    - `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestHiveViewsLegacy.java`
- Class-level environment requirement: `HiveBasicEnvironment`.
- Class-level tags: `HdfsNoImpersonation`.
- Method inventory complete: Yes. Legacy methods: `9`. Current methods: `31`.
- Legacy helper/resource dependencies accounted for: Legacy class source reviewed directly.
- Intentional differences summary: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Method statuses present: `verified`.

#### Methods

##### `testSelectOnView`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/AbstractTestHiveViews.java` ->
  `testSelectOnView`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestHiveViewsLegacy.java` ->
  `TestHiveViewsLegacy.testSelectOnView`
- Mapping type: `merged`
- Environment parity: Current class requires `HiveBasicEnvironment`. Routed by source review into `SuiteHiveBasic` run
    1.
- Tag parity: Current tags: `HdfsNoImpersonation`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`. Legacy setup operations: `CREATE`.
- Action parity: Current action verbs: `SELECT`. Legacy action verbs: `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `containsOnly`, `row`. Legacy assertion helpers:
  `assertViewQuery`, `containsOnly`, `row`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: Assertion helper names differ between legacy and current implementations.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Matched by current suite selection: `SuiteHiveBasic` run 1 Exact-name mapping with normalized body
  similarity `0.74`.
- Audit status: `verified`

##### `testRichSqlSyntax`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/AbstractTestHiveViews.java` ->
  `testRichSqlSyntax`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestHiveViewsLegacy.java` ->
  `TestHiveViewsLegacy.testRichSqlSyntax`
- Mapping type: `merged`
- Environment parity: Current class requires `HiveBasicEnvironment`. Routed by source review into `SuiteHiveBasic` run
    1.
- Tag parity: Current tags: `HdfsNoImpersonation`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`. Legacy setup operations: `CREATE`.
- Action parity: Current action verbs: `SELECT`. Legacy action verbs: `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `containsOnly`, `row`. Legacy assertion helpers:
  `assertViewQuery`, `containsOnly`, `row`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: Assertion helper names differ between legacy and current implementations.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Matched by current suite selection: `SuiteHiveBasic` run 1 Exact-name mapping with normalized body
  similarity `0.94`.
- Audit status: `verified`

##### `testCommonTableExpression`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/AbstractTestHiveViews.java` ->
  `testCommonTableExpression`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestHiveViewsLegacy.java` ->
  `TestHiveViewsLegacy.testCommonTableExpression`
- Mapping type: `merged`
- Environment parity: Current class requires `HiveBasicEnvironment`. Routed by source review into `SuiteHiveBasic` run
    1.
- Tag parity: Current tags: `HdfsNoImpersonation`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`. Legacy setup operations: `CREATE`.
- Action parity: Current action verbs: `WITH`, `SELECT`. Legacy action verbs: `WITH`, `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `containsOnly`, `row`. Legacy assertion helpers:
  `assertViewQuery`, `containsOnly`, `row`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: Assertion helper names differ between legacy and current implementations.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Matched by current suite selection: `SuiteHiveBasic` run 1 Exact-name mapping with normalized body
  similarity `0.55`.
- Audit status: `verified`

##### `testNestedCommonTableExpression`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/AbstractTestHiveViews.java` ->
  `testNestedCommonTableExpression`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestHiveViewsLegacy.java` ->
  `TestHiveViewsLegacy.testNestedCommonTableExpression`
- Mapping type: `merged`
- Environment parity: Current class requires `HiveBasicEnvironment`. Routed by source review into `SuiteHiveBasic` run
    1.
- Tag parity: Current tags: `HdfsNoImpersonation`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`. Legacy setup operations: `CREATE`.
- Action parity: Current action verbs: `WITH`, `SELECT`. Legacy action verbs: `WITH`, `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `containsOnly`, `row`. Legacy assertion helpers:
  `assertViewQuery`, `containsOnly`, `row`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: Assertion helper names differ between legacy and current implementations.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Matched by current suite selection: `SuiteHiveBasic` run 1 Exact-name mapping with normalized body
  similarity `0.62`.
- Audit status: `verified`

##### `testSelectOnViewFromDifferentSchema`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/AbstractTestHiveViews.java` ->
  `testSelectOnViewFromDifferentSchema`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestHiveViewsLegacy.java` ->
  `TestHiveViewsLegacy.testSelectOnViewFromDifferentSchema`
- Mapping type: `merged`
- Environment parity: Current class requires `HiveBasicEnvironment`. Routed by source review into `SuiteHiveBasic` run
    1.
- Tag parity: Current tags: `HdfsNoImpersonation`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`. Legacy setup operations: `CREATE`.
- Action parity: Current action verbs: `SELECT`. Legacy action verbs: `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`. Legacy assertion helpers: `assertViewQuery`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: Assertion helper names differ between legacy and current implementations.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Matched by current suite selection: `SuiteHiveBasic` run 1 Exact-name mapping with normalized body
  similarity `0.71`.
- Audit status: `verified`

##### `testViewReferencingTableInDifferentSchema`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/AbstractTestHiveViews.java` ->
  `testViewReferencingTableInDifferentSchema`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestHiveViewsLegacy.java` ->
  `TestHiveViewsLegacy.testViewReferencingTableInDifferentSchema`
- Mapping type: `merged`
- Environment parity: Current class requires `HiveBasicEnvironment`. Routed by source review into `SuiteHiveBasic` run
    1.
- Tag parity: Current tags: `HdfsNoImpersonation`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`. Legacy setup operations: `CREATE`.
- Action parity: Current action verbs: `SELECT`. Legacy action verbs: `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `containsOnly`, `row`. Legacy assertion helpers:
  `assertThat`, `containsOnly`, `row`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: Current method uses parameter-injected environment helpers instead of Tempto
  query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Matched by current suite selection: `SuiteHiveBasic` run 1 Exact-name mapping with normalized body
  similarity `0.77`.
- Audit status: `verified`

##### `testViewReferencingTableInTheSameSchemaWithoutQualifier`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/AbstractTestHiveViews.java` ->
  `testViewReferencingTableInTheSameSchemaWithoutQualifier`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestHiveViewsLegacy.java` ->
  `TestHiveViewsLegacy.testViewReferencingTableInTheSameSchemaWithoutQualifier`
- Mapping type: `merged`
- Environment parity: Current class requires `HiveBasicEnvironment`. Routed by source review into `SuiteHiveBasic` run
    1.
- Tag parity: Current tags: `HdfsNoImpersonation`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`. Legacy setup operations: `CREATE`.
- Action parity: Current action verbs: `SELECT`. Legacy action verbs: `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `containsOnly`, `row`. Legacy assertion helpers:
  `assertThat`, `containsOnly`, `row`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: Current method uses parameter-injected environment helpers instead of Tempto
  query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Matched by current suite selection: `SuiteHiveBasic` run 1 Exact-name mapping with normalized body
  similarity `0.71`.
- Audit status: `verified`

##### `testViewWithUnsupportedCoercion`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/AbstractTestHiveViews.java` ->
  `testViewWithUnsupportedCoercion`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestHiveViewsLegacy.java` ->
  `TestHiveViewsLegacy.testViewWithUnsupportedCoercion`
- Mapping type: `merged`
- Environment parity: Current class requires `HiveBasicEnvironment`. Routed by source review into `SuiteHiveBasic` run
    1.
- Tag parity: Current tags: `HdfsNoImpersonation`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`. Legacy setup operations: `CREATE`.
- Action parity: Current action verbs: `SELECT`. Legacy action verbs: `SELECT`.
- Assertion parity: Current assertion helpers: `assertThatThrownBy`, `hasMessageContaining`. Legacy assertion helpers:
  `assertQueryFailure`, `hasMessageContaining`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: Assertion helper names differ between legacy and current implementations.
  Current method uses parameter-injected environment helpers instead of Tempto query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Matched by current suite selection: `SuiteHiveBasic` run 1 Exact-name mapping with normalized body
  similarity `0.85`.
- Audit status: `verified`

##### `testOuterParentheses`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/AbstractTestHiveViews.java` ->
  `testOuterParentheses`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestHiveViewsLegacy.java` ->
  `TestHiveViewsLegacy.testOuterParentheses`
- Mapping type: `merged`
- Environment parity: Current class requires `HiveBasicEnvironment`. Routed by source review into `SuiteHiveBasic` run
    1.
- Tag parity: Current tags: `HdfsNoImpersonation`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`. Legacy setup operations: `CREATE`.
- Action parity: Current action verbs: `SELECT`. Legacy action verbs: `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `containsOnly`, `row`. Legacy assertion helpers:
  `assertViewQuery`, `containsOnly`, `row`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: Assertion helper names differ between legacy and current implementations.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Matched by current suite selection: `SuiteHiveBasic` run 1 Exact-name mapping with normalized body
  similarity `0.69`.
- Audit status: `verified`

##### `testDateFunction`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/AbstractTestHiveViews.java` ->
  `testDateFunction`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestHiveViewsLegacy.java` ->
  `TestHiveViewsLegacy.testDateFunction`
- Mapping type: `merged`
- Environment parity: Current class requires `HiveBasicEnvironment`. Routed by source review into `SuiteHiveBasic` run
    1.
- Tag parity: Current tags: `HdfsNoImpersonation`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`, `INSERT`. Legacy setup operations: `CREATE`, `INSERT`.
- Action parity: Current action verbs: `SELECT`. Legacy action verbs: `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `containsOnly`, `row`. Legacy assertion helpers:
  `assertViewQuery`, `containsOnly`, `row`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: Assertion helper names differ between legacy and current implementations.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Matched by current suite selection: `SuiteHiveBasic` run 1 Exact-name mapping with normalized body
  similarity `0.69`.
- Audit status: `verified`

##### `testWithUnsupportedFunction`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/AbstractTestHiveViews.java` ->
  `testWithUnsupportedFunction`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestHiveViewsLegacy.java` ->
  `TestHiveViewsLegacy.testWithUnsupportedFunction`
- Mapping type: `merged`
- Environment parity: Current class requires `HiveBasicEnvironment`. Routed by source review into `SuiteHiveBasic` run
    1.
- Tag parity: Current tags: `HdfsNoImpersonation`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`. Legacy setup operations: `CREATE`.
- Action parity: Current action verbs: `SELECT`. Legacy action verbs: `SELECT`.
- Assertion parity: Current assertion helpers: `assertThatThrownBy`, `hasMessageContaining`. Legacy assertion helpers:
  `assertQueryFailure`, `hasMessageContaining`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: Assertion helper names differ between legacy and current implementations.
  Current method uses parameter-injected environment helpers instead of Tempto query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Matched by current suite selection: `SuiteHiveBasic` run 1 Exact-name mapping with normalized body
  similarity `0.85`.
- Audit status: `verified`

##### `testExistingView`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/AbstractTestHiveViews.java` ->
  `testExistingView`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestHiveViewsLegacy.java` ->
  `TestHiveViewsLegacy.testExistingView`
- Mapping type: `merged`
- Environment parity: Current class requires `HiveBasicEnvironment`. Routed by source review into `SuiteHiveBasic` run
    1.
- Tag parity: Current tags: `HdfsNoImpersonation`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`. Legacy setup operations: `CREATE`.
- Action parity: Current action verbs: none. Legacy action verbs: none.
- Assertion parity: Current assertion helpers: `assertThatThrownBy`, `hasMessageContaining`. Legacy assertion helpers:
  `assertQueryFailure`, `hasMessageContaining`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: Assertion helper names differ between legacy and current implementations.
  Current method uses parameter-injected environment helpers instead of Tempto query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Matched by current suite selection: `SuiteHiveBasic` run 1 Exact-name mapping with normalized body
  similarity `0.73`.
- Audit status: `verified`

##### `testIdentifierThatStartWithDigit`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/AbstractTestHiveViews.java` ->
  `testIdentifierThatStartWithDigit`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestHiveViewsLegacy.java` ->
  `TestHiveViewsLegacy.testIdentifierThatStartWithDigit`
- Mapping type: `merged`
- Environment parity: Current class requires `HiveBasicEnvironment`. Routed by source review into `SuiteHiveBasic` run
    1.
- Tag parity: Current tags: `HdfsNoImpersonation`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`. Legacy setup operations: `CREATE`.
- Action parity: Current action verbs: `SELECT`. Legacy action verbs: `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `contains`, `row`. Legacy assertion helpers:
  `assertViewQuery`, `contains`, `row`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: Assertion helper names differ between legacy and current implementations.
  Current method uses parameter-injected environment helpers instead of Tempto query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Matched by current suite selection: `SuiteHiveBasic` run 1 Exact-name mapping with normalized body
  similarity `0.63`.
- Audit status: `verified`

##### `testSelectFromHiveViewWithoutDefaultCatalogAndSchema`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/AbstractTestHiveViews.java` ->
  `testSelectFromHiveViewWithoutDefaultCatalogAndSchema`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestHiveViewsLegacy.java` ->
  `TestHiveViewsLegacy.testSelectFromHiveViewWithoutDefaultCatalogAndSchema`
- Mapping type: `merged`
- Environment parity: Current class requires `HiveBasicEnvironment`. Routed by source review into `SuiteHiveBasic` run
    1.
- Tag parity: Current tags: `HdfsNoImpersonation`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`. Legacy setup operations: `CREATE`.
- Action parity: Current action verbs: `SELECT`. Legacy action verbs: `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `containsOnly`, `row`. Legacy assertion helpers:
  `assertQueryFailure`, `assertThat`, `containsOnly`, `row`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: Assertion helper names differ between legacy and current implementations.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Matched by current suite selection: `SuiteHiveBasic` run 1 Exact-name mapping with normalized body
  similarity `0.59`.
- Audit status: `verified`

##### `testTimestampHiveView`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/AbstractTestHiveViews.java` ->
  `testTimestampHiveView`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestHiveViewsLegacy.java` ->
  `TestHiveViewsLegacy.testTimestampHiveView`
- Mapping type: `merged`
- Environment parity: Current class requires `HiveBasicEnvironment`. Routed by source review into `SuiteHiveBasic` run
    1.
- Tag parity: Current tags: `HdfsNoImpersonation`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`, `INSERT`. Legacy setup operations: `CREATE`, `INSERT`.
- Action parity: Current action verbs: `SELECT`. Legacy action verbs: `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `containsOnly`, `row`. Legacy assertion helpers:
  `assertThat`, `containsOnly`, `row`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: Normalized body similarity is low (`0.40`), so fidelity was judged from
  SQL/helper/assertion shape instead of raw text. Current method uses parameter-injected environment helpers instead of
  Tempto query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Matched by current suite selection: `SuiteHiveBasic` run 1 Exact-name mapping with normalized body
  similarity `0.40`.
- Audit status: `verified`

##### `testNestedGroupBy`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/AbstractTestHiveViews.java` ->
  `testNestedGroupBy`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestHiveViewsLegacy.java` ->
  `TestHiveViewsLegacy.testNestedGroupBy`
- Mapping type: `merged`
- Environment parity: Current class requires `HiveBasicEnvironment`. Routed by source review into `SuiteHiveBasic` run
    1.
- Tag parity: Current tags: `HdfsNoImpersonation`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`. Legacy setup operations: `CREATE`.
- Action parity: Current action verbs: `SELECT`. Legacy action verbs: `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `containsOnly`, `row`. Legacy assertion helpers:
  `assertViewQuery`, `containsOnly`, `row`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: Assertion helper names differ between legacy and current implementations.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Matched by current suite selection: `SuiteHiveBasic` run 1 Exact-name mapping with normalized body
  similarity `0.70`.
- Audit status: `verified`

##### `testUnionAllViews`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/AbstractTestHiveViews.java` ->
  `testUnionAllViews`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestHiveViewsLegacy.java` ->
  `TestHiveViewsLegacy.testUnionAllViews`
- Mapping type: `merged`
- Environment parity: Current class requires `HiveBasicEnvironment`. Routed by source review into `SuiteHiveBasic` run
    1.
- Tag parity: Current tags: `HdfsNoImpersonation`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`, `INSERT`. Legacy setup operations: `CREATE`, `INSERT`.
- Action parity: Current action verbs: `SELECT`. Legacy action verbs: `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `containsOnly`, `row`. Legacy assertion helpers:
  `assertThat`, `containsOnly`, `row`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: Current method uses parameter-injected environment helpers instead of Tempto
  query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Matched by current suite selection: `SuiteHiveBasic` run 1 Exact-name mapping with normalized body
  similarity `0.76`.
- Audit status: `verified`

##### `testUnionDistinctViews`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/AbstractTestHiveViews.java` ->
  `testUnionDistinctViews`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestHiveViewsLegacy.java` ->
  `TestHiveViewsLegacy.testUnionDistinctViews`
- Mapping type: `merged`
- Environment parity: Current class requires `HiveBasicEnvironment`. Routed by source review into `SuiteHiveBasic` run
    1.
- Tag parity: Current tags: `HdfsNoImpersonation`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`, `INSERT`. Legacy setup operations: `CREATE`, `INSERT`.
- Action parity: Current action verbs: `SELECT`. Legacy action verbs: `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `containsOnly`, `row`. Legacy assertion helpers:
  `assertViewQuery`, `containsOnly`, `row`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: Normalized body similarity is low (`0.37`), so fidelity was judged from
  SQL/helper/assertion shape instead of raw text. Assertion helper names differ between legacy and current
  implementations.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Matched by current suite selection: `SuiteHiveBasic` run 1 Exact-name mapping with normalized body
  similarity `0.37`.
- Audit status: `verified`

##### `testHivePartitionViews`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/AbstractTestHiveViews.java` ->
  `testHivePartitionViews`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestHiveViewsLegacy.java` ->
  `TestHiveViewsLegacy.testHivePartitionViews`
- Mapping type: `merged`
- Environment parity: Current class requires `HiveBasicEnvironment`. Routed by source review into `SuiteHiveBasic` run
    1.
- Tag parity: Current tags: `HdfsNoImpersonation`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`, `INSERT`. Legacy setup operations: `CREATE`, `INSERT`.
- Action parity: Current action verbs: `SELECT`. Legacy action verbs: `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `containsOnly`, `row`. Legacy assertion helpers:
  `assertThat`, `containsOnly`, `row`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: Current method uses parameter-injected environment helpers instead of Tempto
  query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Matched by current suite selection: `SuiteHiveBasic` run 1 Exact-name mapping with normalized body
  similarity `0.78`.
- Audit status: `verified`

##### `testViewWithColumnAliasesDifferingInCase`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/AbstractTestHiveViews.java` ->
  `testViewWithColumnAliasesDifferingInCase`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestHiveViewsLegacy.java` ->
  `TestHiveViewsLegacy.testViewWithColumnAliasesDifferingInCase`
- Mapping type: `merged`
- Environment parity: Current class requires `HiveBasicEnvironment`. Routed by source review into `SuiteHiveBasic` run
    1.
- Tag parity: Current tags: `HdfsNoImpersonation`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`, `INSERT`. Legacy setup operations: `CREATE`, `INSERT`.
- Action parity: Current action verbs: `SELECT`. Legacy action verbs: `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `containsOnly`, `row`. Legacy assertion helpers:
  `assertViewQuery`, `containsOnly`, `row`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: Normalized body similarity is low (`0.15`), so fidelity was judged from
  SQL/helper/assertion shape instead of raw text. Assertion helper names differ between legacy and current
  implementations.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Matched by current suite selection: `SuiteHiveBasic` run 1 Exact-name mapping with normalized body
  similarity `0.15`.
- Audit status: `verified`

##### `testRunAsInvoker`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/AbstractTestHiveViews.java` ->
  `testRunAsInvoker`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestHiveViewsLegacy.java` ->
  `TestHiveViewsLegacy.testRunAsInvoker`
- Mapping type: `merged`
- Environment parity: Current class requires `HiveBasicEnvironment`. Routed by source review into `SuiteHiveBasic` run
    1.
- Tag parity: Current tags: `HdfsNoImpersonation`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`. Legacy setup operations: `CREATE`.
- Action parity: Current action verbs: `SELECT`. Legacy action verbs: `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`. Legacy assertion helpers: `assertThat`,
  `assertThatThrownBy`, `hasMessageContaining`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: Normalized body similarity is low (`0.40`), so fidelity was judged from
  SQL/helper/assertion shape instead of raw text. Assertion helper names differ between legacy and current
  implementations. Current method uses parameter-injected environment helpers instead of Tempto query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Matched by current suite selection: `SuiteHiveBasic` run 1 Exact-name mapping with normalized body
  similarity `0.40`.
- Audit status: `verified`

##### `testShowCreateView`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestHiveViewsLegacy.java` ->
  `testShowCreateView`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestHiveViewsLegacy.java` ->
  `TestHiveViewsLegacy.testShowCreateView`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveBasicEnvironment`. Routed by source review into `SuiteHiveBasic` run
    1.
- Tag parity: Current tags: `HdfsNoImpersonation`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`. Legacy setup operations: `CREATE`.
- Action parity: Current action verbs: `SHOW`. Legacy action verbs: `SHOW`.
- Assertion parity: Current assertion helpers: `assertThat`. Legacy assertion helpers: `assertThat`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: Current method uses parameter-injected environment helpers instead of Tempto
  query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Matched by current suite selection: `SuiteHiveBasic` run 1 Exact-name mapping with normalized body
  similarity `0.57`.
- Audit status: `verified`

##### `testHiveViewInInformationSchema`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestHiveViewsLegacy.java` ->
  `testHiveViewInInformationSchema`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestHiveViewsLegacy.java` ->
  `TestHiveViewsLegacy.testHiveViewInInformationSchema`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveBasicEnvironment`. Routed by source review into `SuiteHiveBasic` run
    1.
- Tag parity: Current tags: `HdfsNoImpersonation`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`. Legacy setup operations: `CREATE`.
- Action parity: Current action verbs: `SELECT`, `DESCRIBE`. Legacy action verbs: `SELECT`, `DESCRIBE`.
- Assertion parity: Current assertion helpers: `assertThat`, `contains`, `containsOnly`, `row`. Legacy assertion
  helpers: `assertThat`, `contains`, `containsOnly`, `row`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: Current method uses parameter-injected environment helpers instead of Tempto
  query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Matched by current suite selection: `SuiteHiveBasic` run 1 Exact-name mapping with normalized body
  similarity `0.78`.
- Audit status: `verified`

##### `testHiveViewWithParametrizedTypes`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestHiveViewsLegacy.java` ->
  `testHiveViewWithParametrizedTypes`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestHiveViewsLegacy.java` ->
  `TestHiveViewsLegacy.testHiveViewWithParametrizedTypes`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveBasicEnvironment`. Routed by source review into `SuiteHiveBasic` run
    1.
- Tag parity: Current tags: `HdfsNoImpersonation`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`, `INSERT`. Legacy setup operations: `CREATE`, `INSERT`.
- Action parity: Current action verbs: `SELECT`. Legacy action verbs: `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `containsOnly`, `row`. Legacy assertion helpers:
  `assertThat`, `containsOnly`, `row`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: Current method uses parameter-injected environment helpers instead of Tempto
  query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Matched by current suite selection: `SuiteHiveBasic` run 1 Exact-name mapping with normalized body
  similarity `0.78`.
- Audit status: `verified`

##### `testArrayIndexingInView`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestHiveViewsLegacy.java` ->
  `testArrayIndexingInView`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestHiveViewsLegacy.java` ->
  `TestHiveViewsLegacy.testArrayIndexingInView`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveBasicEnvironment`. Routed by source review into `SuiteHiveBasic` run
    1.
- Tag parity: Current tags: `HdfsNoImpersonation`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`, `INSERT`. No legacy setup method body was available.
- Action parity: Current action verbs: `SELECT`. No legacy action method body was available.
- Assertion parity: Current assertion helpers: `assertThat`, `assertThatThrownBy`, `containsOnly`,
  `hasMessageContaining`, `row`. Legacy assertion helpers: `assertThatThrownBy`, `hasMessageContaining`.
- Cleanup parity: Current cleanup operations: `DROP`. No legacy cleanup method body was available.
- Any observed difference, however small: Normalized body similarity is low (`0.03`), so fidelity was judged from
  SQL/helper/assertion shape instead of raw text. Assertion helper names differ between legacy and current
  implementations.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Matched by current suite selection: `SuiteHiveBasic` run 1 Exact-name mapping with normalized body
  similarity `0.03`.
- Audit status: `verified`

##### `testArrayConstructionInView`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestHiveViewsLegacy.java` ->
  `testArrayConstructionInView`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestHiveViewsLegacy.java` ->
  `TestHiveViewsLegacy.testArrayConstructionInView`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveBasicEnvironment`. Routed by source review into `SuiteHiveBasic` run
    1.
- Tag parity: Current tags: `HdfsNoImpersonation`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`. No legacy setup method body was available.
- Action parity: Current action verbs: `SELECT`. No legacy action method body was available.
- Assertion parity: Current assertion helpers: `assertThatThrownBy`, `hasMessageContaining`. Legacy assertion helpers:
  `assertThatThrownBy`, `hasMessageContaining`.
- Cleanup parity: Current cleanup operations: `DROP`. No legacy cleanup method body was available.
- Any observed difference, however small: Normalized body similarity is low (`0.22`), so fidelity was judged from
  SQL/helper/assertion shape instead of raw text.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Matched by current suite selection: `SuiteHiveBasic` run 1 Exact-name mapping with normalized body
  similarity `0.22`.
- Audit status: `verified`

##### `testMapConstructionInView`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestHiveViewsLegacy.java` ->
  `testMapConstructionInView`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestHiveViewsLegacy.java` ->
  `TestHiveViewsLegacy.testMapConstructionInView`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveBasicEnvironment`. Routed by source review into `SuiteHiveBasic` run
    1.
- Tag parity: Current tags: `HdfsNoImpersonation`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`. No legacy setup method body was available.
- Action parity: Current action verbs: `SELECT`. No legacy action method body was available.
- Assertion parity: Current assertion helpers: `assertThatThrownBy`, `hasMessageContaining`. Legacy assertion helpers:
  `assertThatThrownBy`, `hasMessageContaining`.
- Cleanup parity: Current cleanup operations: `DROP`. No legacy cleanup method body was available.
- Any observed difference, however small: Normalized body similarity is low (`0.30`), so fidelity was judged from
  SQL/helper/assertion shape instead of raw text.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Matched by current suite selection: `SuiteHiveBasic` run 1 Exact-name mapping with normalized body
  similarity `0.30`.
- Audit status: `verified`

##### `testPmodFunction`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestHiveViewsLegacy.java` -> `testPmodFunction`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestHiveViewsLegacy.java` ->
  `TestHiveViewsLegacy.testPmodFunction`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveBasicEnvironment`. Routed by source review into `SuiteHiveBasic` run
    1.
- Tag parity: Current tags: `HdfsNoImpersonation`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`, `INSERT`. No legacy setup method body was available.
- Action parity: Current action verbs: `SELECT`. No legacy action method body was available.
- Assertion parity: Current assertion helpers: `assertThatThrownBy`, `hasMessageContaining`. Legacy assertion helpers:
  `assertThatThrownBy`, `hasMessageContaining`.
- Cleanup parity: Current cleanup operations: `DROP`. No legacy cleanup method body was available.
- Any observed difference, however small: Normalized body similarity is low (`0.08`), so fidelity was judged from
  SQL/helper/assertion shape instead of raw text.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Matched by current suite selection: `SuiteHiveBasic` run 1 Exact-name mapping with normalized body
  similarity `0.08`.
- Audit status: `verified`

##### `testNestedHiveViews`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestHiveViewsLegacy.java` ->
  `testNestedHiveViews`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestHiveViewsLegacy.java` ->
  `TestHiveViewsLegacy.testNestedHiveViews`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveBasicEnvironment`. Routed by source review into `SuiteHiveBasic` run
    1.
- Tag parity: Current tags: `HdfsNoImpersonation`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`. No legacy setup method body was available.
- Action parity: Current action verbs: `SELECT`. No legacy action method body was available.
- Assertion parity: Current assertion helpers: `assertThatThrownBy`, `hasMessageContaining`. Legacy assertion helpers:
  `assertThatThrownBy`, `hasMessageContaining`.
- Cleanup parity: Current cleanup operations: `DROP`. No legacy cleanup method body was available.
- Any observed difference, however small: Normalized body similarity is low (`0.44`), so fidelity was judged from
  SQL/helper/assertion shape instead of raw text.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Matched by current suite selection: `SuiteHiveBasic` run 1 Exact-name mapping with normalized body
  similarity `0.44`.
- Audit status: `verified`

##### `testCurrentUser`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestHiveViewsLegacy.java` -> `testCurrentUser`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestHiveViewsLegacy.java` ->
  `TestHiveViewsLegacy.testCurrentUser`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveBasicEnvironment`. Routed by source review into `SuiteHiveBasic` run
    1.
- Tag parity: Current tags: `HdfsNoImpersonation`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`. No legacy setup method body was available.
- Action parity: Current action verbs: `SELECT`. No legacy action method body was available.
- Assertion parity: Current assertion helpers: `assertThatThrownBy`, `hasMessageContaining`. Legacy assertion helpers:
  `assertThatThrownBy`, `hasMessageContaining`.
- Cleanup parity: Current cleanup operations: `DROP`. No legacy cleanup method body was available.
- Any observed difference, however small: Normalized body similarity is low (`0.46`), so fidelity was judged from
  SQL/helper/assertion shape instead of raw text.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Matched by current suite selection: `SuiteHiveBasic` run 1 Exact-name mapping with normalized body
  similarity `0.46`.
- Audit status: `verified`

##### `testHiveViewWithTextualTypes`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/AbstractTestHiveViews.java` ->
  `testHiveViewWithTextualTypes`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestHiveViewsLegacy.java` ->
  `TestHiveViewsLegacy.testHiveViewWithTextualTypes`
- Mapping type: `merged`
- Environment parity: Current class requires `HiveBasicEnvironment`. Routed by source review into `SuiteHiveBasic` run
    1.
- Tag parity: Current tags: `HdfsNoImpersonation`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`, `INSERT`. Legacy setup operations: `CREATE`, `INSERT`.
- Action parity: Current action verbs: `SELECT`. Legacy action verbs: `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `containsOnly`, `row`. Legacy assertion helpers:
  `assertThat`, `assertViewQuery`, `containsOnly`, `row`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: Assertion helper names differ between legacy and current implementations.
  Current method uses parameter-injected environment helpers instead of Tempto query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Matched by current suite selection: `SuiteHiveBasic` run 1 Exact-name mapping with normalized body
  similarity `0.63`.
- Audit status: `verified`

### `TestInsertIntoHiveTable`

- Owning migration commit: `Migrate TestInsertIntoHiveTable to JUnit`
- Current class added in same migration commit:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestInsertIntoHiveTable.java`
- Legacy class removed in same migration commit:
    - `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestInsertIntoHiveTable.java`
- Class-level environment requirement: `HiveBasicEnvironment`.
- Class-level tags: `HdfsNoImpersonation`.
- Method inventory complete: Yes. Legacy methods: `3`. Current methods: `3`.
- Legacy helper/resource dependencies accounted for: Legacy class source reviewed directly.
- Intentional differences summary: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Method statuses present: `verified`.

#### Methods

##### `testInsertIntoValuesToHiveTableAllHiveSimpleTypes`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestInsertIntoHiveTable.java` ->
  `testInsertIntoValuesToHiveTableAllHiveSimpleTypes`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestInsertIntoHiveTable.java` ->
  `TestInsertIntoHiveTable.testInsertIntoValuesToHiveTableAllHiveSimpleTypes`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveBasicEnvironment`. Routed by source review into `SuiteHiveBasic` run
    1.
- Tag parity: Current tags: `HdfsNoImpersonation`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `INSERT`. Legacy setup operations: `INSERT`.
- Action parity: Current action verbs: `SELECT`. Legacy action verbs: `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `containsOnly`, `row`. Legacy assertion helpers:
  `assertThat`, `containsOnly`, `row`.
- Cleanup parity: Current cleanup operations: none. No legacy cleanup method body was available.
- Any observed difference, however small: Current method uses parameter-injected environment helpers instead of Tempto
  query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Matched by current suite selection: `SuiteHiveBasic` run 1 Exact-name mapping with normalized body
  similarity `0.83`.
- Audit status: `verified`

##### `testInsertIntoSelectToHiveTableAllHiveSimpleTypes`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestInsertIntoHiveTable.java` ->
  `testInsertIntoSelectToHiveTableAllHiveSimpleTypes`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestInsertIntoHiveTable.java` ->
  `TestInsertIntoHiveTable.testInsertIntoSelectToHiveTableAllHiveSimpleTypes`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveBasicEnvironment`. Routed by source review into `SuiteHiveBasic` run
    1.
- Tag parity: Current tags: `HdfsNoImpersonation`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `INSERT`. Legacy setup operations: `INSERT`.
- Action parity: Current action verbs: `SELECT`. Legacy action verbs: `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `containsOnly`, `row`. Legacy assertion helpers:
  `assertThat`, `containsOnly`, `row`.
- Cleanup parity: Current cleanup operations: none. No legacy cleanup method body was available.
- Any observed difference, however small: Current method uses parameter-injected environment helpers instead of Tempto
  query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Matched by current suite selection: `SuiteHiveBasic` run 1 Exact-name mapping with normalized body
  similarity `0.72`.
- Audit status: `verified`

##### `testInsertIntoPartitionedWithSerdeProperty`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestInsertIntoHiveTable.java` ->
  `testInsertIntoPartitionedWithSerdeProperty`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestInsertIntoHiveTable.java` ->
  `TestInsertIntoHiveTable.testInsertIntoPartitionedWithSerdeProperty`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveBasicEnvironment`. Routed by source review into `SuiteHiveBasic` run
    1.
- Tag parity: Current tags: `HdfsNoImpersonation`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `INSERT`. Legacy setup operations: `INSERT`.
- Action parity: Current action verbs: `SELECT`. Legacy action verbs: `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `row`. Legacy assertion helpers: `assertThat`, `row`.
- Cleanup parity: Current cleanup operations: none. No legacy cleanup method body was available.
- Any observed difference, however small: Normalized body similarity is low (`0.45`), so fidelity was judged from
  SQL/helper/assertion shape instead of raw text. Current method uses parameter-injected environment helpers instead of
  Tempto query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Matched by current suite selection: `SuiteHiveBasic` run 1 Exact-name mapping with normalized body
  similarity `0.45`.
- Audit status: `verified`

### `TestParquetFileWithReorderedColumns`

- Owning migration commit: `Migrate TestParquetFileWithReorderedColumns to JUnit`
- Current class added in same migration commit:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestParquetFileWithReorderedColumns.java`
- Legacy class removed in same migration commit:
    - `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestParquetFileWithReorderedColumns.java`
- Class-level environment requirement: `HiveSparkEnvironment`.
- Class-level tags: `HiveSpark`.
- Method inventory complete: Yes. Legacy methods: `1`. Current methods: `1`.
- Legacy helper/resource dependencies accounted for: Legacy class source reviewed directly.
- Intentional differences summary: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Method statuses present: `verified`.

#### Methods

##### `testReadParquetFileWithReorderedColumns`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestParquetFileWithReorderedColumns.java` ->
  `testReadParquetFileWithReorderedColumns`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestParquetFileWithReorderedColumns.java` ->
  `TestParquetFileWithReorderedColumns.testReadParquetFileWithReorderedColumns`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveSparkEnvironment`. Routed by source review into `SuiteHiveSpark` run
    1.
- Tag parity: Current tags: `HiveSpark`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`. Legacy setup operations: `CREATE`.
- Action parity: Current action verbs: `WITH`, `SELECT`. Legacy action verbs: `WITH`, `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `row`. Legacy assertion helpers: `assertThat`, `row`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: Normalized body similarity is low (`0.53`), so fidelity was judged from
  SQL/helper/assertion shape instead of raw text. Current method uses parameter-injected environment helpers instead of
  Tempto query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Matched by current suite selection: `SuiteHiveSpark` run 1 Exact-name mapping with normalized body
  similarity `0.53`.
- Audit status: `verified`

### `TestParquetSymlinkInputFormat`

- Owning migration commit: `Migrate TestParquetSymlinkInputFormat to JUnit`
- Current class added in same migration commit:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestParquetSymlinkInputFormat.java`
- Legacy class removed in same migration commit:
    - `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestParquetSymlinkInputFormat.java`
- Class-level environment requirement: `HiveStorageFormatsEnvironment`.
- Class-level tags: `StorageFormats`.
- Method inventory complete: Yes. Legacy methods: `3`. Current methods: `3`.
- Legacy helper/resource dependencies accounted for: Legacy class source reviewed directly.
- Intentional differences summary: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Method statuses present: `verified`.

#### Methods

##### `testSymlinkTable`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestParquetSymlinkInputFormat.java` ->
  `testSymlinkTable`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestParquetSymlinkInputFormat.java` ->
  `TestParquetSymlinkInputFormat.testSymlinkTable`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveStorageFormatsEnvironment`. Routed by source review into
  `SuiteHiveStorageFormats` run 1.
- Tag parity: Current tags: `StorageFormats`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`. Legacy setup operations: `CREATE`.
- Action parity: Current action verbs: `SELECT`. Legacy action verbs: `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `row`. Legacy assertion helpers: `assertThat`, `row`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: Current method uses parameter-injected environment helpers instead of Tempto
  query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Matched by current suite selection: `SuiteHiveStorageFormats` run 1 Exact-name mapping with normalized
  body similarity `0.76`.
- Audit status: `verified`

##### `testSymlinkTableWithSymlinkFileContainingNonExistentPath`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestParquetSymlinkInputFormat.java` ->
  `testSymlinkTableWithSymlinkFileContainingNonExistentPath`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestParquetSymlinkInputFormat.java` ->
  `TestParquetSymlinkInputFormat.testSymlinkTableWithSymlinkFileContainingNonExistentPath`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveStorageFormatsEnvironment`. Routed by source review into
  `SuiteHiveStorageFormats` run 1.
- Tag parity: Current tags: `StorageFormats`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`. Legacy setup operations: `CREATE`.
- Action parity: Current action verbs: `SELECT`. Legacy action verbs: `SELECT`.
- Assertion parity: Current assertion helpers: `assertThatThrownBy`. Legacy assertion helpers: `assertThatThrownBy`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: Current method uses parameter-injected environment helpers instead of Tempto
  query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Matched by current suite selection: `SuiteHiveStorageFormats` run 1 Exact-name mapping with normalized
  body similarity `0.87`.
- Audit status: `verified`

##### `testSymlinkTableWithMultipleParentDirectories`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestParquetSymlinkInputFormat.java` ->
  `testSymlinkTableWithMultipleParentDirectories`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestParquetSymlinkInputFormat.java` ->
  `TestParquetSymlinkInputFormat.testSymlinkTableWithMultipleParentDirectories`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveStorageFormatsEnvironment`. Routed by source review into
  `SuiteHiveStorageFormats` run 1.
- Tag parity: Current tags: `StorageFormats`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`. Legacy setup operations: `CREATE`.
- Action parity: Current action verbs: `SELECT`. Legacy action verbs: `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `row`. Legacy assertion helpers: `assertThat`, `row`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: Current method uses parameter-injected environment helpers instead of Tempto
  query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Matched by current suite selection: `SuiteHiveStorageFormats` run 1 Exact-name mapping with normalized
  body similarity `0.88`.
- Audit status: `verified`

### `TestRoles`

- Owning migration commit: `Migrate TestRoles to JUnit`
- Current class added in same migration commit:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestRoles.java`
- Legacy class removed in same migration commit:
    - `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestRoles.java`
- Class-level environment requirement: `HiveKerberosImpersonationEnvironment`.
- Class-level tags: `Authorization`.
- Method inventory complete: Yes. Legacy methods: `35`. Current methods: `35`.
- Legacy helper/resource dependencies accounted for: Legacy class source reviewed directly.
- Intentional differences summary: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Method statuses present: `verified`.

#### Methods

##### `testCreateRole`

- Legacy source method: `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestRoles.java` ->
  `testCreateRole`
- Current target method: `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestRoles.java` ->
  `TestRoles.testCreateRole`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveKerberosImpersonationEnvironment`. Routed by source review into
  `SuiteAuthorization` run 1.
- Tag parity: Current tags: `Authorization`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`. Legacy setup operations: `CREATE`.
- Action parity: Current action verbs: none. Legacy action verbs: none.
- Assertion parity: Current assertion helpers: `assertThat`, `contains`. Legacy assertion helpers: `assertThat`,
  `contains`.
- Cleanup parity: Current cleanup operations: none. No legacy cleanup method body was available.
- Any observed difference, however small: Current method uses parameter-injected environment helpers instead of Tempto
  query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Matched by current suite selection: `SuiteAuthorization` run 1 Exact-name mapping with normalized body
  similarity `0.76`.
- Audit status: `verified`

##### `testDropRole`

- Legacy source method: `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestRoles.java` ->
  `testDropRole`
- Current target method: `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestRoles.java` ->
  `TestRoles.testDropRole`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveKerberosImpersonationEnvironment`. Routed by source review into
  `SuiteAuthorization` run 1.
- Tag parity: Current tags: `Authorization`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`. Legacy setup operations: `CREATE`.
- Action parity: Current action verbs: none. Legacy action verbs: none.
- Assertion parity: Current assertion helpers: `assertThat`, `contains`. Legacy assertion helpers: `assertThat`,
  `contains`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: Current method uses parameter-injected environment helpers instead of Tempto
  query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Matched by current suite selection: `SuiteAuthorization` run 1 Exact-name mapping with normalized body
  similarity `0.71`.
- Audit status: `verified`

##### `testListRoles`

- Legacy source method: `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestRoles.java` ->
  `testListRoles`
- Current target method: `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestRoles.java` ->
  `TestRoles.testListRoles`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveKerberosImpersonationEnvironment`. Routed by source review into
  `SuiteAuthorization` run 1.
- Tag parity: Current tags: `Authorization`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`. Legacy setup operations: `CREATE`.
- Action parity: Current action verbs: `SELECT`. Legacy action verbs: `SHOW`, `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `contains`, `row`. Legacy assertion helpers: `assertThat`,
  `containsOnly`.
- Cleanup parity: Current cleanup operations: none. No legacy cleanup method body was available.
- Any observed difference, however small: Normalized body similarity is low (`0.21`), so fidelity was judged from
  SQL/helper/assertion shape instead of raw text. SQL verb set differs: legacy ['CREATE', 'SHOW', 'SELECT'] vs
  current ['CREATE', 'SELECT']. Assertion helper names differ between legacy and current implementations. Current method
  uses parameter-injected environment helpers instead of Tempto query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Matched by current suite selection: `SuiteAuthorization` run 1 Exact-name mapping with normalized body
  similarity `0.21`.
- Audit status: `verified`

##### `testCreateDuplicateRole`

- Legacy source method: `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestRoles.java` ->
  `testCreateDuplicateRole`
- Current target method: `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestRoles.java` ->
  `TestRoles.testCreateDuplicateRole`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveKerberosImpersonationEnvironment`. Routed by source review into
  `SuiteAuthorization` run 1.
- Tag parity: Current tags: `Authorization`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`. Legacy setup operations: `CREATE`.
- Action parity: Current action verbs: none. Legacy action verbs: none.
- Assertion parity: Current assertion helpers: `assertThatThrownBy`. Legacy assertion helpers: `assertQueryFailure`,
  `hasMessageContaining`.
- Cleanup parity: Current cleanup operations: none. No legacy cleanup method body was available.
- Any observed difference, however small: Assertion helper names differ between legacy and current implementations.
  Current method uses parameter-injected environment helpers instead of Tempto query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Matched by current suite selection: `SuiteAuthorization` run 1 Exact-name mapping with normalized body
  similarity `0.70`.
- Audit status: `verified`

##### `testDropNonExistentRole`

- Legacy source method: `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestRoles.java` ->
  `testDropNonExistentRole`
- Current target method: `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestRoles.java` ->
  `TestRoles.testDropNonExistentRole`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveKerberosImpersonationEnvironment`. Routed by source review into
  `SuiteAuthorization` run 1.
- Tag parity: Current tags: `Authorization`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: none. Legacy setup operations: none.
- Action parity: Current action verbs: none. Legacy action verbs: none.
- Assertion parity: Current assertion helpers: `assertThatThrownBy`. Legacy assertion helpers: `assertQueryFailure`,
  `hasMessageContaining`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: Assertion helper names differ between legacy and current implementations.
  Current method uses parameter-injected environment helpers instead of Tempto query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Matched by current suite selection: `SuiteAuthorization` run 1 Exact-name mapping with normalized body
  similarity `0.67`.
- Audit status: `verified`

##### `testCreateDropRoleAccessControl`

- Legacy source method: `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestRoles.java` ->
  `testCreateDropRoleAccessControl`
- Current target method: `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestRoles.java` ->
  `TestRoles.testCreateDropRoleAccessControl`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveKerberosImpersonationEnvironment`. Routed by source review into
  `SuiteAuthorization` run 1.
- Tag parity: Current tags: `Authorization`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`. Legacy setup operations: `CREATE`.
- Action parity: Current action verbs: `SELECT`. Legacy action verbs: `SELECT`.
- Assertion parity: Current assertion helpers: `assertThatThrownBy`. Legacy assertion helpers: `assertQueryFailure`,
  `hasMessageContaining`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: Assertion helper names differ between legacy and current implementations.
  Current method uses parameter-injected environment helpers instead of Tempto query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Matched by current suite selection: `SuiteAuthorization` run 1 Exact-name mapping with normalized body
  similarity `0.58`.
- Audit status: `verified`

##### `testPublicRoleIsGrantedToEveryone`

- Legacy source method: `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestRoles.java` ->
  `testPublicRoleIsGrantedToEveryone`
- Current target method: `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestRoles.java` ->
  `TestRoles.testPublicRoleIsGrantedToEveryone`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveKerberosImpersonationEnvironment`. Routed by source review into
  `SuiteAuthorization` run 1.
- Tag parity: Current tags: `Authorization`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: none. Legacy setup operations: none.
- Action parity: Current action verbs: `SELECT`. Legacy action verbs: `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `contains`, `row`. Legacy assertion helpers: `assertThat`,
  `contains`, `row`.
- Cleanup parity: Current cleanup operations: none. No legacy cleanup method body was available.
- Any observed difference, however small: Current method uses parameter-injected environment helpers instead of Tempto
  query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Matched by current suite selection: `SuiteAuthorization` run 1 Exact-name mapping with normalized body
  similarity `0.84`.
- Audit status: `verified`

##### `testAdminRoleIsGrantedToHdfs`

- Legacy source method: `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestRoles.java` ->
  `testAdminRoleIsGrantedToHdfs`
- Current target method: `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestRoles.java` ->
  `TestRoles.testAdminRoleIsGrantedToHdfs`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveKerberosImpersonationEnvironment`. Routed by source review into
  `SuiteAuthorization` run 1.
- Tag parity: Current tags: `Authorization`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: none. Legacy setup operations: none.
- Action parity: Current action verbs: `SELECT`. Legacy action verbs: `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`. Legacy assertion helpers: `assertThat`, `contains`, `row`.
- Cleanup parity: Current cleanup operations: none. No legacy cleanup method body was available.
- Any observed difference, however small: Normalized body similarity is low (`0.22`), so fidelity was judged from
  SQL/helper/assertion shape instead of raw text. Assertion helper names differ between legacy and current
  implementations. Current method uses parameter-injected environment helpers instead of Tempto query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Matched by current suite selection: `SuiteAuthorization` run 1 Exact-name mapping with normalized body
  similarity `0.22`.
- Audit status: `verified`

##### `testGrantRoleToUser`

- Legacy source method: `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestRoles.java` ->
  `testGrantRoleToUser`
- Current target method: `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestRoles.java` ->
  `TestRoles.testGrantRoleToUser`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveKerberosImpersonationEnvironment`. Routed by source review into
  `SuiteAuthorization` run 1.
- Tag parity: Current tags: `Authorization`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`. Legacy setup operations: `CREATE`.
- Action parity: Current action verbs: `SELECT`. Legacy action verbs: `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `containsOnly`, `row`. Legacy assertion helpers:
  `assertThat`, `containsOnly`, `row`.
- Cleanup parity: Current cleanup operations: none. No legacy cleanup method body was available.
- Any observed difference, however small: Normalized body similarity is low (`0.04`), so fidelity was judged from
  SQL/helper/assertion shape instead of raw text. Current method uses parameter-injected environment helpers instead of
  Tempto query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Matched by current suite selection: `SuiteAuthorization` run 1 Exact-name mapping with normalized body
  similarity `0.04`.
- Audit status: `verified`

##### `testGrantRoleToRole`

- Legacy source method: `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestRoles.java` ->
  `testGrantRoleToRole`
- Current target method: `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestRoles.java` ->
  `TestRoles.testGrantRoleToRole`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveKerberosImpersonationEnvironment`. Routed by source review into
  `SuiteAuthorization` run 1.
- Tag parity: Current tags: `Authorization`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`. Legacy setup operations: `CREATE`.
- Action parity: Current action verbs: `SELECT`. Legacy action verbs: `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `containsOnly`, `row`. Legacy assertion helpers:
  `assertThat`, `containsOnly`, `row`.
- Cleanup parity: Current cleanup operations: none. No legacy cleanup method body was available.
- Any observed difference, however small: Normalized body similarity is low (`0.03`), so fidelity was judged from
  SQL/helper/assertion shape instead of raw text. Current method uses parameter-injected environment helpers instead of
  Tempto query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Matched by current suite selection: `SuiteAuthorization` run 1 Exact-name mapping with normalized body
  similarity `0.03`.
- Audit status: `verified`

##### `testGrantRoleWithAdminOption`

- Legacy source method: `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestRoles.java` ->
  `testGrantRoleWithAdminOption`
- Current target method: `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestRoles.java` ->
  `TestRoles.testGrantRoleWithAdminOption`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveKerberosImpersonationEnvironment`. Routed by source review into
  `SuiteAuthorization` run 1.
- Tag parity: Current tags: `Authorization`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`. Legacy setup operations: `CREATE`.
- Action parity: Current action verbs: `SELECT`. Legacy action verbs: `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `containsOnly`, `row`. Legacy assertion helpers:
  `assertThat`, `containsOnly`, `row`.
- Cleanup parity: Current cleanup operations: none. No legacy cleanup method body was available.
- Any observed difference, however small: Normalized body similarity is low (`0.03`), so fidelity was judged from
  SQL/helper/assertion shape instead of raw text. Current method uses parameter-injected environment helpers instead of
  Tempto query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Matched by current suite selection: `SuiteAuthorization` run 1 Exact-name mapping with normalized body
  similarity `0.03`.
- Audit status: `verified`

##### `testGrantRoleMultipleTimes`

- Legacy source method: `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestRoles.java` ->
  `testGrantRoleMultipleTimes`
- Current target method: `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestRoles.java` ->
  `TestRoles.testGrantRoleMultipleTimes`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveKerberosImpersonationEnvironment`. Routed by source review into
  `SuiteAuthorization` run 1.
- Tag parity: Current tags: `Authorization`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`. Legacy setup operations: `CREATE`.
- Action parity: Current action verbs: `SELECT`. Legacy action verbs: `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `containsOnly`, `row`. Legacy assertion helpers:
  `assertThat`, `containsOnly`, `row`.
- Cleanup parity: Current cleanup operations: none. No legacy cleanup method body was available.
- Any observed difference, however small: Normalized body similarity is low (`0.49`), so fidelity was judged from
  SQL/helper/assertion shape instead of raw text. Current method uses parameter-injected environment helpers instead of
  Tempto query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Matched by current suite selection: `SuiteAuthorization` run 1 Exact-name mapping with normalized body
  similarity `0.49`.
- Audit status: `verified`

##### `testRevokeRoleFromUser`

- Legacy source method: `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestRoles.java` ->
  `testRevokeRoleFromUser`
- Current target method: `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestRoles.java` ->
  `TestRoles.testRevokeRoleFromUser`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveKerberosImpersonationEnvironment`. Routed by source review into
  `SuiteAuthorization` run 1.
- Tag parity: Current tags: `Authorization`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`. Legacy setup operations: `CREATE`.
- Action parity: Current action verbs: `SELECT`. Legacy action verbs: `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `containsOnly`, `row`. Legacy assertion helpers:
  `assertThat`, `containsOnly`, `row`.
- Cleanup parity: Current cleanup operations: none. No legacy cleanup method body was available.
- Any observed difference, however small: Normalized body similarity is low (`0.03`), so fidelity was judged from
  SQL/helper/assertion shape instead of raw text. Current method uses parameter-injected environment helpers instead of
  Tempto query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Matched by current suite selection: `SuiteAuthorization` run 1 Exact-name mapping with normalized body
  similarity `0.03`.
- Audit status: `verified`

##### `testRevokeRoleFromRole`

- Legacy source method: `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestRoles.java` ->
  `testRevokeRoleFromRole`
- Current target method: `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestRoles.java` ->
  `TestRoles.testRevokeRoleFromRole`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveKerberosImpersonationEnvironment`. Routed by source review into
  `SuiteAuthorization` run 1.
- Tag parity: Current tags: `Authorization`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`. Legacy setup operations: `CREATE`.
- Action parity: Current action verbs: `SELECT`. Legacy action verbs: `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `containsOnly`, `row`. Legacy assertion helpers:
  `assertThat`, `containsOnly`, `row`.
- Cleanup parity: Current cleanup operations: none. No legacy cleanup method body was available.
- Any observed difference, however small: Normalized body similarity is low (`0.03`), so fidelity was judged from
  SQL/helper/assertion shape instead of raw text. Current method uses parameter-injected environment helpers instead of
  Tempto query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Matched by current suite selection: `SuiteAuthorization` run 1 Exact-name mapping with normalized body
  similarity `0.03`.
- Audit status: `verified`

##### `testRevokeRoleFromOwner`

- Legacy source method: `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestRoles.java` ->
  `testRevokeRoleFromOwner`
- Current target method: `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestRoles.java` ->
  `TestRoles.testRevokeRoleFromOwner`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveKerberosImpersonationEnvironment`. Routed by source review into
  `SuiteAuthorization` run 1.
- Tag parity: Current tags: `Authorization`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`, `UPDATE`, `INSERT`. Legacy setup operations: `CREATE`, `UPDATE`,
  `INSERT`.
- Action parity: Current action verbs: `SHOW`, `SELECT`. Legacy action verbs: `SHOW`, `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `containsOnly`, `row`. Legacy assertion helpers:
  `assertThat`, `containsOnly`, `row`.
- Cleanup parity: Current cleanup operations: `DELETE`, `DROP`. Legacy cleanup operations: `DELETE`, `DROP`.
- Any observed difference, however small: Current method uses parameter-injected environment helpers instead of Tempto
  query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Matched by current suite selection: `SuiteAuthorization` run 1 Exact-name mapping with normalized body
  similarity `0.91`.
- Audit status: `verified`

##### `testDropGrantedRole`

- Legacy source method: `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestRoles.java` ->
  `testDropGrantedRole`
- Current target method: `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestRoles.java` ->
  `TestRoles.testDropGrantedRole`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveKerberosImpersonationEnvironment`. Routed by source review into
  `SuiteAuthorization` run 1.
- Tag parity: Current tags: `Authorization`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`. Legacy setup operations: `CREATE`.
- Action parity: Current action verbs: `SELECT`. Legacy action verbs: `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `containsOnly`, `row`. Legacy assertion helpers:
  `assertThat`, `containsOnly`, `row`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: Normalized body similarity is low (`0.03`), so fidelity was judged from
  SQL/helper/assertion shape instead of raw text. Current method uses parameter-injected environment helpers instead of
  Tempto query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Matched by current suite selection: `SuiteAuthorization` run 1 Exact-name mapping with normalized body
  similarity `0.03`.
- Audit status: `verified`

##### `testRevokeTransitiveRoleFromUser`

- Legacy source method: `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestRoles.java` ->
  `testRevokeTransitiveRoleFromUser`
- Current target method: `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestRoles.java` ->
  `TestRoles.testRevokeTransitiveRoleFromUser`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveKerberosImpersonationEnvironment`. Routed by source review into
  `SuiteAuthorization` run 1.
- Tag parity: Current tags: `Authorization`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`. Legacy setup operations: `CREATE`.
- Action parity: Current action verbs: `SELECT`. Legacy action verbs: `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `containsOnly`, `row`. Legacy assertion helpers:
  `assertThat`, `containsOnly`, `row`.
- Cleanup parity: Current cleanup operations: none. No legacy cleanup method body was available.
- Any observed difference, however small: Normalized body similarity is low (`0.02`), so fidelity was judged from
  SQL/helper/assertion shape instead of raw text. Current method uses parameter-injected environment helpers instead of
  Tempto query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Matched by current suite selection: `SuiteAuthorization` run 1 Exact-name mapping with normalized body
  similarity `0.02`.
- Audit status: `verified`

##### `testRevokeTransitiveRoleFromRole`

- Legacy source method: `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestRoles.java` ->
  `testRevokeTransitiveRoleFromRole`
- Current target method: `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestRoles.java` ->
  `TestRoles.testRevokeTransitiveRoleFromRole`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveKerberosImpersonationEnvironment`. Routed by source review into
  `SuiteAuthorization` run 1.
- Tag parity: Current tags: `Authorization`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`. Legacy setup operations: `CREATE`.
- Action parity: Current action verbs: `SELECT`. Legacy action verbs: `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `containsOnly`, `row`. Legacy assertion helpers:
  `assertThat`, `containsOnly`, `row`.
- Cleanup parity: Current cleanup operations: none. No legacy cleanup method body was available.
- Any observed difference, however small: Normalized body similarity is low (`0.02`), so fidelity was judged from
  SQL/helper/assertion shape instead of raw text. Current method uses parameter-injected environment helpers instead of
  Tempto query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Matched by current suite selection: `SuiteAuthorization` run 1 Exact-name mapping with normalized body
  similarity `0.02`.
- Audit status: `verified`

##### `testDropTransitiveRole`

- Legacy source method: `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestRoles.java` ->
  `testDropTransitiveRole`
- Current target method: `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestRoles.java` ->
  `TestRoles.testDropTransitiveRole`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveKerberosImpersonationEnvironment`. Routed by source review into
  `SuiteAuthorization` run 1.
- Tag parity: Current tags: `Authorization`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`. Legacy setup operations: `CREATE`.
- Action parity: Current action verbs: `SELECT`. Legacy action verbs: `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `containsOnly`, `row`. Legacy assertion helpers:
  `assertThat`, `containsOnly`, `row`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: Normalized body similarity is low (`0.02`), so fidelity was judged from
  SQL/helper/assertion shape instead of raw text. Current method uses parameter-injected environment helpers instead of
  Tempto query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Matched by current suite selection: `SuiteAuthorization` run 1 Exact-name mapping with normalized body
  similarity `0.02`.
- Audit status: `verified`

##### `testRevokeAdminOption`

- Legacy source method: `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestRoles.java` ->
  `testRevokeAdminOption`
- Current target method: `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestRoles.java` ->
  `TestRoles.testRevokeAdminOption`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveKerberosImpersonationEnvironment`. Routed by source review into
  `SuiteAuthorization` run 1.
- Tag parity: Current tags: `Authorization`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`. Legacy setup operations: `CREATE`.
- Action parity: Current action verbs: `SELECT`. Legacy action verbs: `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `containsOnly`, `row`. Legacy assertion helpers:
  `assertThat`, `containsOnly`, `row`.
- Cleanup parity: Current cleanup operations: none. No legacy cleanup method body was available.
- Any observed difference, however small: Current method uses parameter-injected environment helpers instead of Tempto
  query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Matched by current suite selection: `SuiteAuthorization` run 1 Exact-name mapping with normalized body
  similarity `0.80`.
- Audit status: `verified`

##### `testRevokeMultipleTimes`

- Legacy source method: `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestRoles.java` ->
  `testRevokeMultipleTimes`
- Current target method: `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestRoles.java` ->
  `TestRoles.testRevokeMultipleTimes`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveKerberosImpersonationEnvironment`. Routed by source review into
  `SuiteAuthorization` run 1.
- Tag parity: Current tags: `Authorization`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`. Legacy setup operations: `CREATE`.
- Action parity: Current action verbs: `SELECT`. Legacy action verbs: `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `containsOnly`, `row`. Legacy assertion helpers:
  `assertThat`, `containsOnly`, `row`.
- Cleanup parity: Current cleanup operations: none. No legacy cleanup method body was available.
- Any observed difference, however small: Normalized body similarity is low (`0.40`), so fidelity was judged from
  SQL/helper/assertion shape instead of raw text. Current method uses parameter-injected environment helpers instead of
  Tempto query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Matched by current suite selection: `SuiteAuthorization` run 1 Exact-name mapping with normalized body
  similarity `0.40`.
- Audit status: `verified`

##### `testGrantRevokeRoleAccessControl`

- Legacy source method: `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestRoles.java` ->
  `testGrantRevokeRoleAccessControl`
- Current target method: `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestRoles.java` ->
  `TestRoles.testGrantRevokeRoleAccessControl`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveKerberosImpersonationEnvironment`. Routed by source review into
  `SuiteAuthorization` run 1.
- Tag parity: Current tags: `Authorization`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`. Legacy setup operations: `CREATE`.
- Action parity: Current action verbs: none. Legacy action verbs: none.
- Assertion parity: Current assertion helpers: `assertThatThrownBy`. Legacy assertion helpers: `assertQueryFailure`,
  `hasMessageContaining`.
- Cleanup parity: Current cleanup operations: none. No legacy cleanup method body was available.
- Any observed difference, however small: Normalized body similarity is low (`0.41`), so fidelity was judged from
  SQL/helper/assertion shape instead of raw text. Assertion helper names differ between legacy and current
  implementations. Current method uses parameter-injected environment helpers instead of Tempto query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Matched by current suite selection: `SuiteAuthorization` run 1 Exact-name mapping with normalized body
  similarity `0.41`.
- Audit status: `verified`

##### `testSetRole`

- Legacy source method: `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestRoles.java` ->
  `testSetRole`
- Current target method: `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestRoles.java` ->
  `TestRoles.testSetRole`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveKerberosImpersonationEnvironment`. Routed by source review into
  `SuiteAuthorization` run 1.
- Tag parity: Current tags: `Authorization`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`. Legacy setup operations: `CREATE`.
- Action parity: Current action verbs: `SELECT`. Legacy action verbs: `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `containsOnly`, `row`. Legacy assertion helpers:
  `assertThat`, `containsOnly`, `row`.
- Cleanup parity: Current cleanup operations: none. No legacy cleanup method body was available.
- Any observed difference, however small: Normalized body similarity is low (`0.27`), so fidelity was judged from
  SQL/helper/assertion shape instead of raw text. Current method uses parameter-injected environment helpers instead of
  Tempto query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Matched by current suite selection: `SuiteAuthorization` run 1 Exact-name mapping with normalized body
  similarity `0.27`.
- Audit status: `verified`

##### `testSetAdminRole`

- Legacy source method: `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestRoles.java` ->
  `testSetAdminRole`
- Current target method: `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestRoles.java` ->
  `TestRoles.testSetAdminRole`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveKerberosImpersonationEnvironment`. Routed by source review into
  `SuiteAuthorization` run 1.
- Tag parity: Current tags: `Authorization`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: none. Legacy setup operations: none.
- Action parity: Current action verbs: `SELECT`. Legacy action verbs: `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `containsOnly`, `row`. Legacy assertion helpers:
  `assertThat`, `containsOnly`, `row`.
- Cleanup parity: Current cleanup operations: none. No legacy cleanup method body was available.
- Any observed difference, however small: Current method uses parameter-injected environment helpers instead of Tempto
  query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Matched by current suite selection: `SuiteAuthorization` run 1 Exact-name mapping with normalized body
  similarity `0.74`.
- Audit status: `verified`

##### `testShowRoles`

- Legacy source method: `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestRoles.java` ->
  `testShowRoles`
- Current target method: `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestRoles.java` ->
  `TestRoles.testShowRoles`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveKerberosImpersonationEnvironment`. Routed by source review into
  `SuiteAuthorization` run 1.
- Tag parity: Current tags: `Authorization`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`. Legacy setup operations: `CREATE`.
- Action parity: Current action verbs: `SHOW`. Legacy action verbs: `SHOW`.
- Assertion parity: Current assertion helpers: `assertThat`, `assertThatThrownBy`, `containsOnly`, `row`. Legacy
  assertion helpers: `assertQueryFailure`, `assertThat`, `containsOnly`, `hasMessageContaining`, `row`.
- Cleanup parity: Current cleanup operations: none. No legacy cleanup method body was available.
- Any observed difference, however small: Normalized body similarity is low (`0.46`), so fidelity was judged from
  SQL/helper/assertion shape instead of raw text. Assertion helper names differ between legacy and current
  implementations. Current method uses parameter-injected environment helpers instead of Tempto query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Matched by current suite selection: `SuiteAuthorization` run 1 Exact-name mapping with normalized body
  similarity `0.46`.
- Audit status: `verified`

##### `testShowCurrentRoles`

- Legacy source method: `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestRoles.java` ->
  `testShowCurrentRoles`
- Current target method: `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestRoles.java` ->
  `TestRoles.testShowCurrentRoles`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveKerberosImpersonationEnvironment`. Routed by source review into
  `SuiteAuthorization` run 1.
- Tag parity: Current tags: `Authorization`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`. Legacy setup operations: `CREATE`.
- Action parity: Current action verbs: `SHOW`. Legacy action verbs: `SHOW`.
- Assertion parity: Current assertion helpers: `assertThat`, `containsOnly`, `row`. Legacy assertion helpers:
  `assertThat`, `containsOnly`, `row`.
- Cleanup parity: Current cleanup operations: none. No legacy cleanup method body was available.
- Any observed difference, however small: Current method uses parameter-injected environment helpers instead of Tempto
  query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Matched by current suite selection: `SuiteAuthorization` run 1 Exact-name mapping with normalized body
  similarity `0.68`.
- Audit status: `verified`

##### `testShowRoleGrants`

- Legacy source method: `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestRoles.java` ->
  `testShowRoleGrants`
- Current target method: `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestRoles.java` ->
  `TestRoles.testShowRoleGrants`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveKerberosImpersonationEnvironment`. Routed by source review into
  `SuiteAuthorization` run 1.
- Tag parity: Current tags: `Authorization`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`. Legacy setup operations: `CREATE`.
- Action parity: Current action verbs: `SHOW`. Legacy action verbs: `SHOW`.
- Assertion parity: Current assertion helpers: `assertThat`, `containsOnly`, `row`. Legacy assertion helpers:
  `assertThat`, `containsOnly`, `row`.
- Cleanup parity: Current cleanup operations: none. No legacy cleanup method body was available.
- Any observed difference, however small: Normalized body similarity is low (`0.42`), so fidelity was judged from
  SQL/helper/assertion shape instead of raw text. Current method uses parameter-injected environment helpers instead of
  Tempto query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Matched by current suite selection: `SuiteAuthorization` run 1 Exact-name mapping with normalized body
  similarity `0.42`.
- Audit status: `verified`

##### `testSetRoleCreateDropSchema`

- Legacy source method: `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestRoles.java` ->
  `testSetRoleCreateDropSchema`
- Current target method: `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestRoles.java` ->
  `TestRoles.testSetRoleCreateDropSchema`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveKerberosImpersonationEnvironment`. Routed by source review into
  `SuiteAuthorization` run 1.
- Tag parity: Current tags: `Authorization`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`. Legacy setup operations: `CREATE`.
- Action parity: Current action verbs: none. Legacy action verbs: none.
- Assertion parity: Current assertion helpers: `assertAdminExecute`. Legacy assertion helpers: `assertAdminExecute`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: Normalized body similarity is low (`0.48`), so fidelity was judged from
  SQL/helper/assertion shape instead of raw text. Current method uses parameter-injected environment helpers instead of
  Tempto query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Matched by current suite selection: `SuiteAuthorization` run 1 Exact-name mapping with normalized body
  similarity `0.48`.
- Audit status: `verified`

##### `testAdminCanDropAnyTable`

- Legacy source method: `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestRoles.java` ->
  `testAdminCanDropAnyTable`
- Current target method: `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestRoles.java` ->
  `TestRoles.testAdminCanDropAnyTable`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveKerberosImpersonationEnvironment`. Routed by source review into
  `SuiteAuthorization` run 1.
- Tag parity: Current tags: `Authorization`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`. Legacy setup operations: `CREATE`.
- Action parity: Current action verbs: none. Legacy action verbs: none.
- Assertion parity: Current assertion helpers: `assertAdminExecute`. Legacy assertion helpers: `assertAdminExecute`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: Current method uses parameter-injected environment helpers instead of Tempto
  query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Matched by current suite selection: `SuiteAuthorization` run 1 Exact-name mapping with normalized body
  similarity `0.58`.
- Audit status: `verified`

##### `testAdminCanRenameAnyTable`

- Legacy source method: `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestRoles.java` ->
  `testAdminCanRenameAnyTable`
- Current target method: `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestRoles.java` ->
  `TestRoles.testAdminCanRenameAnyTable`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveKerberosImpersonationEnvironment`. Routed by source review into
  `SuiteAuthorization` run 1.
- Tag parity: Current tags: `Authorization`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`, `ALTER`. Legacy setup operations: `CREATE`, `ALTER`.
- Action parity: Current action verbs: none. Legacy action verbs: none.
- Assertion parity: Current assertion helpers: `assertAdminExecute`. Legacy assertion helpers: `assertAdminExecute`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: Current method uses parameter-injected environment helpers instead of Tempto
  query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Matched by current suite selection: `SuiteAuthorization` run 1 Exact-name mapping with normalized body
  similarity `0.68`.
- Audit status: `verified`

##### `testAdminCanAddColumnToAnyTable`

- Legacy source method: `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestRoles.java` ->
  `testAdminCanAddColumnToAnyTable`
- Current target method: `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestRoles.java` ->
  `TestRoles.testAdminCanAddColumnToAnyTable`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveKerberosImpersonationEnvironment`. Routed by source review into
  `SuiteAuthorization` run 1.
- Tag parity: Current tags: `Authorization`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`, `ALTER`. Legacy setup operations: `CREATE`, `ALTER`.
- Action parity: Current action verbs: none. Legacy action verbs: none.
- Assertion parity: Current assertion helpers: `assertAdminExecute`. Legacy assertion helpers: `assertAdminExecute`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: Current method uses parameter-injected environment helpers instead of Tempto
  query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Matched by current suite selection: `SuiteAuthorization` run 1 Exact-name mapping with normalized body
  similarity `0.65`.
- Audit status: `verified`

##### `testAdminCanRenameColumnInAnyTable`

- Legacy source method: `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestRoles.java` ->
  `testAdminCanRenameColumnInAnyTable`
- Current target method: `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestRoles.java` ->
  `TestRoles.testAdminCanRenameColumnInAnyTable`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveKerberosImpersonationEnvironment`. Routed by source review into
  `SuiteAuthorization` run 1.
- Tag parity: Current tags: `Authorization`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`, `ALTER`. Legacy setup operations: `CREATE`, `ALTER`.
- Action parity: Current action verbs: none. Legacy action verbs: none.
- Assertion parity: Current assertion helpers: `assertAdminExecute`. Legacy assertion helpers: `assertAdminExecute`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: Current method uses parameter-injected environment helpers instead of Tempto
  query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Matched by current suite selection: `SuiteAuthorization` run 1 Exact-name mapping with normalized body
  similarity `0.65`.
- Audit status: `verified`

##### `testAdminCanShowAllGrants`

- Legacy source method: `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestRoles.java` ->
  `testAdminCanShowAllGrants`
- Current target method: `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestRoles.java` ->
  `TestRoles.testAdminCanShowAllGrants`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveKerberosImpersonationEnvironment`. Routed by source review into
  `SuiteAuthorization` run 1.
- Tag parity: Current tags: `Authorization`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`, `UPDATE`, `INSERT`. Legacy setup operations: `CREATE`, `UPDATE`,
  `INSERT`.
- Action parity: Current action verbs: `SHOW`, `SELECT`. Legacy action verbs: `SHOW`, `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `containsOnly`, `row`. Legacy assertion helpers:
  `assertThat`, `containsOnly`, `row`.
- Cleanup parity: Current cleanup operations: `DELETE`, `DROP`. Legacy cleanup operations: `DELETE`, `DROP`.
- Any observed difference, however small: Current method uses parameter-injected environment helpers instead of Tempto
  query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Matched by current suite selection: `SuiteAuthorization` run 1 Exact-name mapping with normalized body
  similarity `0.91`.
- Audit status: `verified`

##### `testAdminCanShowGrantsOnlyFromCurrentSchema`

- Legacy source method: `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestRoles.java` ->
  `testAdminCanShowGrantsOnlyFromCurrentSchema`
- Current target method: `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestRoles.java` ->
  `TestRoles.testAdminCanShowGrantsOnlyFromCurrentSchema`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveKerberosImpersonationEnvironment`. Routed by source review into
  `SuiteAuthorization` run 1.
- Tag parity: Current tags: `Authorization`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`, `UPDATE`, `INSERT`. Legacy setup operations: `CREATE`, `UPDATE`,
  `INSERT`.
- Action parity: Current action verbs: `SHOW`, `SELECT`. Legacy action verbs: `SHOW`, `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `containsOnly`, `row`. Legacy assertion helpers:
  `assertThat`, `containsOnly`, `row`.
- Cleanup parity: Current cleanup operations: `DELETE`, `DROP`. Legacy cleanup operations: `DELETE`, `DROP`.
- Any observed difference, however small: Current method uses parameter-injected environment helpers instead of Tempto
  query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Matched by current suite selection: `SuiteAuthorization` run 1 Exact-name mapping with normalized body
  similarity `0.91`.
- Audit status: `verified`

##### `testSetRoleTablePermissions`

- Legacy source method: `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestRoles.java` ->
  `testSetRoleTablePermissions`
- Current target method: `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestRoles.java` ->
  `TestRoles.testSetRoleTablePermissions`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveKerberosImpersonationEnvironment`. Routed by source review into
  `SuiteAuthorization` run 1.
- Tag parity: Current tags: `Authorization`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`, `INSERT`. Legacy setup operations: `CREATE`, `INSERT`.
- Action parity: Current action verbs: `SELECT`, `SHOW`. Legacy action verbs: `SELECT`, `SHOW`.
- Assertion parity: Current assertion helpers: `assertAdminExecute`, `assertThat`, `assertThatThrownBy`, `containsOnly`,
  `hasMessageContaining`, `row`. Legacy assertion helpers: `assertAdminExecute`, `assertQueryFailure`, `assertThat`,
  `containsOnly`, `hasMessageContaining`, `row`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: Assertion helper names differ between legacy and current implementations.
  Current method uses parameter-injected environment helpers instead of Tempto query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Matched by current suite selection: `SuiteAuthorization` run 1 Exact-name mapping with normalized body
  similarity `0.62`.
- Audit status: `verified`

### `TestSqlStandardAccessControlChecks`

- Owning migration commit: `Migrate TestSqlStandardAccessControlChecks to JUnit`
- Current class added in same migration commit:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestSqlStandardAccessControlChecks.java`
- Legacy class removed in same migration commit:
    - `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestSqlStandardAccessControlChecks.java`
- Class-level environment requirement: `HiveKerberosImpersonationEnvironment`.
- Class-level tags: `Authorization`.
- Method inventory complete: Yes. Legacy methods: `17`. Current methods: `17`.
- Legacy helper/resource dependencies accounted for: Legacy class source reviewed directly.
- Intentional differences summary: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Method statuses present: `verified`.

#### Methods

##### `testAccessControlSelect`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestSqlStandardAccessControlChecks.java` ->
  `testAccessControlSelect`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestSqlStandardAccessControlChecks.java` ->
  `TestSqlStandardAccessControlChecks.testAccessControlSelect`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveKerberosImpersonationEnvironment`. Routed by source review into
  `SuiteAuthorization` run 1.
- Tag parity: Current tags: `Authorization`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`. Legacy setup operations: none.
- Action parity: Current action verbs: `SELECT`. Legacy action verbs: `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `assertThatThrownBy`, `hasMessageContaining`. Legacy
  assertion helpers: `assertQueryFailure`, `assertThat`, `hasMessageContaining`.
- Cleanup parity: Current cleanup operations: `DROP`. No legacy cleanup method body was available.
- Any observed difference, however small: Normalized body similarity is low (`0.07`), so fidelity was judged from
  SQL/helper/assertion shape instead of raw text. SQL verb set differs: legacy ['SELECT'] vs
  current ['DROP', 'CREATE', 'SELECT']. Assertion helper names differ between legacy and current implementations.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Matched by current suite selection: `SuiteAuthorization` run 1 Exact-name mapping with normalized body
  similarity `0.07`.
- Audit status: `verified`

##### `testAccessControlSelectFromPartitions`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestSqlStandardAccessControlChecks.java` ->
  `testAccessControlSelectFromPartitions`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestSqlStandardAccessControlChecks.java` ->
  `TestSqlStandardAccessControlChecks.testAccessControlSelectFromPartitions`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveKerberosImpersonationEnvironment`. Routed by source review into
  `SuiteAuthorization` run 1.
- Tag parity: Current tags: `Authorization`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`. Legacy setup operations: none.
- Action parity: Current action verbs: `SELECT`. Legacy action verbs: `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `assertThatThrownBy`, `hasMessageContaining`. Legacy
  assertion helpers: `assertQueryFailure`, `assertThat`, `hasMessageContaining`.
- Cleanup parity: Current cleanup operations: `DROP`. No legacy cleanup method body was available.
- Any observed difference, however small: Normalized body similarity is low (`0.49`), so fidelity was judged from
  SQL/helper/assertion shape instead of raw text. SQL verb set differs: legacy ['SELECT'] vs
  current ['DROP', 'CREATE', 'SELECT']. Assertion helper names differ between legacy and current implementations.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Matched by current suite selection: `SuiteAuthorization` run 1 Exact-name mapping with normalized body
  similarity `0.49`.
- Audit status: `verified`

##### `testAccessControlInsert`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestSqlStandardAccessControlChecks.java` ->
  `testAccessControlInsert`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestSqlStandardAccessControlChecks.java` ->
  `TestSqlStandardAccessControlChecks.testAccessControlInsert`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveKerberosImpersonationEnvironment`. Routed by source review into
  `SuiteAuthorization` run 1.
- Tag parity: Current tags: `Authorization`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`, `INSERT`. Legacy setup operations: `INSERT`.
- Action parity: Current action verbs: `SELECT`. Legacy action verbs: `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `assertThatThrownBy`, `hasMessageContaining`. Legacy
  assertion helpers: `assertQueryFailure`, `assertThat`, `hasMessageContaining`.
- Cleanup parity: Current cleanup operations: `DROP`. No legacy cleanup method body was available.
- Any observed difference, however small: Normalized body similarity is low (`0.41`), so fidelity was judged from
  SQL/helper/assertion shape instead of raw text. SQL verb set differs: legacy ['INSERT', 'SELECT'] vs
  current ['DROP', 'CREATE', 'INSERT', 'SELECT']. Assertion helper names differ between legacy and current
  implementations.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Matched by current suite selection: `SuiteAuthorization` run 1 Exact-name mapping with normalized body
  similarity `0.41`.
- Audit status: `verified`

##### `testAccessControlUpdate`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestSqlStandardAccessControlChecks.java` ->
  `testAccessControlUpdate`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestSqlStandardAccessControlChecks.java` ->
  `TestSqlStandardAccessControlChecks.testAccessControlUpdate`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveKerberosImpersonationEnvironment`. Routed by source review into
  `SuiteAuthorization` run 1.
- Tag parity: Current tags: `Authorization`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`, `UPDATE`. Legacy setup operations: `UPDATE`.
- Action parity: Current action verbs: none. Legacy action verbs: none.
- Assertion parity: Current assertion helpers: `assertThatThrownBy`, `hasMessageContaining`. Legacy assertion helpers:
  `assertQueryFailure`, `hasMessageContaining`.
- Cleanup parity: Current cleanup operations: `DROP`. No legacy cleanup method body was available.
- Any observed difference, however small: SQL verb set differs: legacy ['UPDATE'] vs
  current ['DROP', 'CREATE', 'UPDATE']. Assertion helper names differ between legacy and current implementations.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Matched by current suite selection: `SuiteAuthorization` run 1 Exact-name mapping with normalized body
  similarity `0.64`.
- Audit status: `verified`

##### `testAccessControlDelete`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestSqlStandardAccessControlChecks.java` ->
  `testAccessControlDelete`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestSqlStandardAccessControlChecks.java` ->
  `TestSqlStandardAccessControlChecks.testAccessControlDelete`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveKerberosImpersonationEnvironment`. Routed by source review into
  `SuiteAuthorization` run 1.
- Tag parity: Current tags: `Authorization`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`, `INSERT`. Legacy setup operations: `INSERT`.
- Action parity: Current action verbs: `SELECT`. Legacy action verbs: `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `assertThatThrownBy`, `hasMessageContaining`. Legacy
  assertion helpers: `assertQueryFailure`, `assertThat`, `hasMessageContaining`.
- Cleanup parity: Current cleanup operations: `DROP`, `DELETE`. Legacy cleanup operations: `DELETE`.
- Any observed difference, however small: Normalized body similarity is low (`0.50`), so fidelity was judged from
  SQL/helper/assertion shape instead of raw text. SQL verb set differs: legacy ['INSERT', 'SELECT', 'DELETE'] vs
  current ['DROP', 'CREATE', 'INSERT', 'SELECT', 'DELETE']. Assertion helper names differ between legacy and current
  implementations.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Matched by current suite selection: `SuiteAuthorization` run 1 Exact-name mapping with normalized body
  similarity `0.50`.
- Audit status: `verified`

##### `testAccessControlCreateTableAsSelect`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestSqlStandardAccessControlChecks.java` ->
  `testAccessControlCreateTableAsSelect`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestSqlStandardAccessControlChecks.java` ->
  `TestSqlStandardAccessControlChecks.testAccessControlCreateTableAsSelect`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveKerberosImpersonationEnvironment`. Routed by source review into
  `SuiteAuthorization` run 1.
- Tag parity: Current tags: `Authorization`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`. Legacy setup operations: `CREATE`.
- Action parity: Current action verbs: `SELECT`. Legacy action verbs: `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `assertThatThrownBy`, `hasMessageContaining`. Legacy
  assertion helpers: `assertQueryFailure`, `assertThat`, `hasMessageContaining`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: Normalized body similarity is low (`0.32`), so fidelity was judged from
  SQL/helper/assertion shape instead of raw text. Assertion helper names differ between legacy and current
  implementations.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Matched by current suite selection: `SuiteAuthorization` run 1 Exact-name mapping with normalized body
  similarity `0.32`.
- Audit status: `verified`

##### `testAccessControlDropTable`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestSqlStandardAccessControlChecks.java` ->
  `testAccessControlDropTable`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestSqlStandardAccessControlChecks.java` ->
  `TestSqlStandardAccessControlChecks.testAccessControlDropTable`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveKerberosImpersonationEnvironment`. Routed by source review into
  `SuiteAuthorization` run 1.
- Tag parity: Current tags: `Authorization`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`. Legacy setup operations: none.
- Action parity: Current action verbs: `SELECT`. Legacy action verbs: `SELECT`.
- Assertion parity: Current assertion helpers: `assertThatThrownBy`, `hasMessageContaining`. Legacy assertion helpers:
  `assertQueryFailure`, `hasMessageContaining`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: Normalized body similarity is low (`0.31`), so fidelity was judged from
  SQL/helper/assertion shape instead of raw text. SQL verb set differs: legacy ['DROP', 'SELECT'] vs
  current ['DROP', 'CREATE', 'SELECT']. Assertion helper names differ between legacy and current implementations.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Matched by current suite selection: `SuiteAuthorization` run 1 Exact-name mapping with normalized body
  similarity `0.31`.
- Audit status: `verified`

##### `testAccessControlAlterTable`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestSqlStandardAccessControlChecks.java` ->
  `testAccessControlAlterTable`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestSqlStandardAccessControlChecks.java` ->
  `TestSqlStandardAccessControlChecks.testAccessControlAlterTable`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveKerberosImpersonationEnvironment`. Routed by source review into
  `SuiteAuthorization` run 1.
- Tag parity: Current tags: `Authorization`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`, `ALTER`. Legacy setup operations: `ALTER`.
- Action parity: Current action verbs: `SHOW`. Legacy action verbs: `SHOW`.
- Assertion parity: Current assertion helpers: `assertThat`, `assertThatThrownBy`, `hasMessageContaining`. Legacy
  assertion helpers: `assertQueryFailure`, `assertThat`, `hasMessageContaining`.
- Cleanup parity: Current cleanup operations: `DROP`. No legacy cleanup method body was available.
- Any observed difference, however small: Normalized body similarity is low (`0.53`), so fidelity was judged from
  SQL/helper/assertion shape instead of raw text. SQL verb set differs: legacy ['SHOW', 'ALTER'] vs
  current ['DROP', 'CREATE', 'SHOW', 'ALTER']. Assertion helper names differ between legacy and current implementations.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Matched by current suite selection: `SuiteAuthorization` run 1 Exact-name mapping with normalized body
  similarity `0.53`.
- Audit status: `verified`

##### `testAccessControlCreateView`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestSqlStandardAccessControlChecks.java` ->
  `testAccessControlCreateView`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestSqlStandardAccessControlChecks.java` ->
  `TestSqlStandardAccessControlChecks.testAccessControlCreateView`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveKerberosImpersonationEnvironment`. Routed by source review into
  `SuiteAuthorization` run 1.
- Tag parity: Current tags: `Authorization`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`. Legacy setup operations: `CREATE`.
- Action parity: Current action verbs: `SELECT`. Legacy action verbs: `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `assertThatThrownBy`, `hasMessageContaining`. Legacy
  assertion helpers: `assertQueryFailure`, `assertThat`, `hasMessageContaining`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: Normalized body similarity is low (`0.05`), so fidelity was judged from
  SQL/helper/assertion shape instead of raw text. SQL verb set differs: legacy ['SELECT', 'CREATE', 'DROP'] vs
  current ['DROP', 'CREATE', 'SELECT']. Assertion helper names differ between legacy and current implementations.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Matched by current suite selection: `SuiteAuthorization` run 1 Exact-name mapping with normalized body
  similarity `0.05`.
- Audit status: `verified`

##### `testAccessControlDropView`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestSqlStandardAccessControlChecks.java` ->
  `testAccessControlDropView`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestSqlStandardAccessControlChecks.java` ->
  `TestSqlStandardAccessControlChecks.testAccessControlDropView`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveKerberosImpersonationEnvironment`. Routed by source review into
  `SuiteAuthorization` run 1.
- Tag parity: Current tags: `Authorization`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`. Legacy setup operations: `CREATE`.
- Action parity: Current action verbs: `SELECT`. Legacy action verbs: `SELECT`.
- Assertion parity: Current assertion helpers: `assertThatThrownBy`, `hasMessageContaining`. Legacy assertion helpers:
  `assertQueryFailure`, `hasMessageContaining`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: Normalized body similarity is low (`0.51`), so fidelity was judged from
  SQL/helper/assertion shape instead of raw text. Assertion helper names differ between legacy and current
  implementations.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Matched by current suite selection: `SuiteAuthorization` run 1 Exact-name mapping with normalized body
  similarity `0.51`.
- Audit status: `verified`

##### `testAccessControlSelectWithCaseSensitiveUserName`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestSqlStandardAccessControlChecks.java` ->
  `testAccessControlSelectWithCaseSensitiveUserName`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestSqlStandardAccessControlChecks.java` ->
  `TestSqlStandardAccessControlChecks.testAccessControlSelectWithCaseSensitiveUserName`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveKerberosImpersonationEnvironment`. Routed by source review into
  `SuiteAuthorization` run 1.
- Tag parity: Current tags: `Authorization`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`. Legacy setup operations: none.
- Action parity: Current action verbs: `SELECT`. Legacy action verbs: `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `assertThatThrownBy`, `hasMessageContaining`. Legacy
  assertion helpers: `assertQueryFailure`, `assertThat`, `hasMessageContaining`.
- Cleanup parity: Current cleanup operations: `DROP`. No legacy cleanup method body was available.
- Any observed difference, however small: Normalized body similarity is low (`0.37`), so fidelity was judged from
  SQL/helper/assertion shape instead of raw text. SQL verb set differs: legacy ['SELECT'] vs
  current ['DROP', 'CREATE', 'SELECT']. Assertion helper names differ between legacy and current implementations.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Matched by current suite selection: `SuiteAuthorization` run 1 Exact-name mapping with normalized body
  similarity `0.37`.
- Audit status: `verified`

##### `testAccessControlSetTableAuthorization`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestSqlStandardAccessControlChecks.java` ->
  `testAccessControlSetTableAuthorization`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestSqlStandardAccessControlChecks.java` ->
  `TestSqlStandardAccessControlChecks.testAccessControlSetTableAuthorization`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveKerberosImpersonationEnvironment`. Routed by source review into
  `SuiteAuthorization` run 1.
- Tag parity: Current tags: `Authorization`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`, `ALTER`. Legacy setup operations: `CREATE`, `ALTER`.
- Action parity: Current action verbs: none. Legacy action verbs: none.
- Assertion parity: Current assertion helpers: `assertThatThrownBy`, `hasMessageContaining`. Legacy assertion helpers:
  `assertQueryFailure`, `hasMessageContaining`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: SQL verb set differs: legacy ['CREATE', 'ALTER', 'DROP'] vs
  current ['DROP', 'CREATE', 'ALTER']. Assertion helper names differ between legacy and current implementations.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Matched by current suite selection: `SuiteAuthorization` run 1 Exact-name mapping with normalized body
  similarity `0.61`.
- Audit status: `verified`

##### `testAccessControlSetViewAuthorization`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestSqlStandardAccessControlChecks.java` ->
  `testAccessControlSetViewAuthorization`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestSqlStandardAccessControlChecks.java` ->
  `TestSqlStandardAccessControlChecks.testAccessControlSetViewAuthorization`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveKerberosImpersonationEnvironment`. Routed by source review into
  `SuiteAuthorization` run 1.
- Tag parity: Current tags: `Authorization`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`, `ALTER`. Legacy setup operations: `ALTER`.
- Action parity: Current action verbs: none. Legacy action verbs: none.
- Assertion parity: Current assertion helpers: `assertThatThrownBy`, `hasMessageContaining`. Legacy assertion helpers:
  `assertQueryFailure`, `hasMessageContaining`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: Normalized body similarity is low (`0.13`), so fidelity was judged from
  SQL/helper/assertion shape instead of raw text. SQL verb set differs: legacy ['ALTER', 'DROP'] vs
  current ['DROP', 'CREATE', 'ALTER']. Assertion helper names differ between legacy and current implementations.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Matched by current suite selection: `SuiteAuthorization` run 1 Exact-name mapping with normalized body
  similarity `0.13`.
- Audit status: `verified`

##### `testAccessControlSetHiveViewAuthorization`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestSqlStandardAccessControlChecks.java` ->
  `testAccessControlSetHiveViewAuthorization`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestSqlStandardAccessControlChecks.java` ->
  `TestSqlStandardAccessControlChecks.testAccessControlSetHiveViewAuthorization`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveKerberosImpersonationEnvironment`. Routed by source review into
  `SuiteAuthorization` run 1.
- Tag parity: Current tags: `Authorization`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`, `ALTER`. Legacy setup operations: `CREATE`, `ALTER`.
- Action parity: Current action verbs: none. Legacy action verbs: none.
- Assertion parity: Current assertion helpers: `assertThatThrownBy`, `hasMessageContaining`. Legacy assertion helpers:
  `assertQueryFailure`, `hasMessageContaining`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: Normalized body similarity is low (`0.15`), so fidelity was judged from
  SQL/helper/assertion shape instead of raw text. SQL verb set differs: legacy ['CREATE', 'ALTER', 'DROP'] vs
  current ['DROP', 'CREATE', 'ALTER']. Assertion helper names differ between legacy and current implementations.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Matched by current suite selection: `SuiteAuthorization` run 1 Exact-name mapping with normalized body
  similarity `0.15`.
- Audit status: `verified`

##### `testAccessControlShowColumns`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestSqlStandardAccessControlChecks.java` ->
  `testAccessControlShowColumns`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestSqlStandardAccessControlChecks.java` ->
  `TestSqlStandardAccessControlChecks.testAccessControlShowColumns`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveKerberosImpersonationEnvironment`. Routed by source review into
  `SuiteAuthorization` run 1.
- Tag parity: Current tags: `Authorization`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`. Legacy setup operations: none.
- Action parity: Current action verbs: `SHOW`. Legacy action verbs: `SHOW`.
- Assertion parity: Current assertion helpers: `assertThat`, `assertThatThrownBy`, `hasMessageContaining`. Legacy
  assertion helpers: `assertQueryFailure`, `assertThat`, `hasMessageContaining`.
- Cleanup parity: Current cleanup operations: `DROP`. No legacy cleanup method body was available.
- Any observed difference, however small: Normalized body similarity is low (`0.48`), so fidelity was judged from
  SQL/helper/assertion shape instead of raw text. SQL verb set differs: legacy ['SHOW'] vs
  current ['DROP', 'CREATE', 'SHOW']. Assertion helper names differ between legacy and current implementations.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Matched by current suite selection: `SuiteAuthorization` run 1 Exact-name mapping with normalized body
  similarity `0.48`.
- Audit status: `verified`

##### `testAccessControlShowStatsFor`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestSqlStandardAccessControlChecks.java` ->
  `testAccessControlShowStatsFor`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestSqlStandardAccessControlChecks.java` ->
  `TestSqlStandardAccessControlChecks.testAccessControlShowStatsFor`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveKerberosImpersonationEnvironment`. Routed by source review into
  `SuiteAuthorization` run 1.
- Tag parity: Current tags: `Authorization`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`. Legacy setup operations: none.
- Action parity: Current action verbs: `SHOW`. Legacy action verbs: `SHOW`.
- Assertion parity: Current assertion helpers: `assertThat`, `assertThatThrownBy`, `hasMessageContaining`. Legacy
  assertion helpers: `assertQueryFailure`, `assertThat`, `hasMessageContaining`.
- Cleanup parity: Current cleanup operations: `DROP`. No legacy cleanup method body was available.
- Any observed difference, however small: Normalized body similarity is low (`0.08`), so fidelity was judged from
  SQL/helper/assertion shape instead of raw text. SQL verb set differs: legacy ['SHOW'] vs
  current ['DROP', 'CREATE', 'SHOW']. Assertion helper names differ between legacy and current implementations.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Matched by current suite selection: `SuiteAuthorization` run 1 Exact-name mapping with normalized body
  similarity `0.08`.
- Audit status: `verified`

##### `testAccessControlFilterColumns`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestSqlStandardAccessControlChecks.java` ->
  `testAccessControlFilterColumns`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestSqlStandardAccessControlChecks.java` ->
  `TestSqlStandardAccessControlChecks.testAccessControlFilterColumns`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveKerberosImpersonationEnvironment`. Routed by source review into
  `SuiteAuthorization` run 1.
- Tag parity: Current tags: `Authorization`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`. Legacy setup operations: none.
- Action parity: Current action verbs: `SELECT`. Legacy action verbs: `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`. Legacy assertion helpers: `assertThat`.
- Cleanup parity: Current cleanup operations: `DROP`. No legacy cleanup method body was available.
- Any observed difference, however small: Normalized body similarity is low (`0.38`), so fidelity was judged from
  SQL/helper/assertion shape instead of raw text. SQL verb set differs: legacy ['SELECT'] vs
  current ['DROP', 'CREATE', 'SELECT'].
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Matched by current suite selection: `SuiteAuthorization` run 1 Exact-name mapping with normalized body
  similarity `0.38`.
- Audit status: `verified`

### `TestTablePartitioningSelect`

- Owning migration commit: `Migrate TestTablePartitioningSelect to JUnit`
- Current class added in same migration commit:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestTablePartitioningSelect.java`
- Legacy class removed in same migration commit:
    - `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestTablePartitioningSelect.java`
- Class-level environment requirement: `HiveBasicEnvironment`.
- Class-level tags: `HdfsNoImpersonation`.
- Method inventory complete: Yes. Legacy methods: `1`. Current methods: `5`.
- Legacy helper/resource dependencies accounted for: Legacy class source reviewed directly.
- Intentional differences summary: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Method statuses present: `verified`.

#### Methods

##### `testSelectPartitionedTextFileTable`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestTablePartitioningSelect.java` ->
  `testSelectPartitionedHiveTableDifferentFormats`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestTablePartitioningSelect.java` ->
  `TestTablePartitioningSelect.testSelectPartitionedTextFileTable`
- Mapping type: `split`
- Environment parity: Current class requires `HiveBasicEnvironment`. Routed by source review into `SuiteHiveBasic` run
    1.
- Tag parity: Current tags: `HdfsNoImpersonation`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: none. Legacy setup operations: none.
- Action parity: Current action verbs: none. Legacy action verbs: `SELECT`.
- Assertion parity: Current assertion helpers: none. Legacy assertion helpers: `assertThat`, `containsOnly`, `row`.
- Cleanup parity: Current cleanup operations: none. No legacy cleanup method body was available.
- Any observed difference, however small: Legacy format-parameterized coverage was expanded into one explicit JUnit
  method per file format.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Matched by current suite selection: `SuiteHiveBasic` run 1
- Audit status: `verified`

##### `testSelectPartitionedOrcTable`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestTablePartitioningSelect.java` ->
  `testSelectPartitionedHiveTableDifferentFormats`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestTablePartitioningSelect.java` ->
  `TestTablePartitioningSelect.testSelectPartitionedOrcTable`
- Mapping type: `split`
- Environment parity: Current class requires `HiveBasicEnvironment`. Routed by source review into `SuiteHiveBasic` run
    1.
- Tag parity: Current tags: `HdfsNoImpersonation`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: none. Legacy setup operations: none.
- Action parity: Current action verbs: none. Legacy action verbs: `SELECT`.
- Assertion parity: Current assertion helpers: none. Legacy assertion helpers: `assertThat`, `containsOnly`, `row`.
- Cleanup parity: Current cleanup operations: none. No legacy cleanup method body was available.
- Any observed difference, however small: Legacy format-parameterized coverage was expanded into one explicit JUnit
  method per file format.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Matched by current suite selection: `SuiteHiveBasic` run 1
- Audit status: `verified`

##### `testSelectPartitionedRcFileTable`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestTablePartitioningSelect.java` ->
  `testSelectPartitionedHiveTableDifferentFormats`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestTablePartitioningSelect.java` ->
  `TestTablePartitioningSelect.testSelectPartitionedRcFileTable`
- Mapping type: `split`
- Environment parity: Current class requires `HiveBasicEnvironment`. Routed by source review into `SuiteHiveBasic` run
    1.
- Tag parity: Current tags: `HdfsNoImpersonation`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: none. Legacy setup operations: none.
- Action parity: Current action verbs: none. Legacy action verbs: `SELECT`.
- Assertion parity: Current assertion helpers: none. Legacy assertion helpers: `assertThat`, `containsOnly`, `row`.
- Cleanup parity: Current cleanup operations: none. No legacy cleanup method body was available.
- Any observed difference, however small: Legacy format-parameterized coverage was expanded into one explicit JUnit
  method per file format.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Matched by current suite selection: `SuiteHiveBasic` run 1
- Audit status: `verified`

##### `testSelectPartitionedParquetTable`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestTablePartitioningSelect.java` ->
  `testSelectPartitionedHiveTableDifferentFormats`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestTablePartitioningSelect.java` ->
  `TestTablePartitioningSelect.testSelectPartitionedParquetTable`
- Mapping type: `split`
- Environment parity: Current class requires `HiveBasicEnvironment`. Routed by source review into `SuiteHiveBasic` run
    1.
- Tag parity: Current tags: `HdfsNoImpersonation`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: none. Legacy setup operations: none.
- Action parity: Current action verbs: none. Legacy action verbs: `SELECT`.
- Assertion parity: Current assertion helpers: none. Legacy assertion helpers: `assertThat`, `containsOnly`, `row`.
- Cleanup parity: Current cleanup operations: none. No legacy cleanup method body was available.
- Any observed difference, however small: Legacy format-parameterized coverage was expanded into one explicit JUnit
  method per file format.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Matched by current suite selection: `SuiteHiveBasic` run 1
- Audit status: `verified`

##### `testSelectPartitionedAvroTable`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestTablePartitioningSelect.java` ->
  `testSelectPartitionedHiveTableDifferentFormats`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestTablePartitioningSelect.java` ->
  `TestTablePartitioningSelect.testSelectPartitionedAvroTable`
- Mapping type: `split`
- Environment parity: Current class requires `HiveBasicEnvironment`. Routed by source review into `SuiteHiveBasic` run
    1.
- Tag parity: Current tags: `HdfsNoImpersonation`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: none. Legacy setup operations: none.
- Action parity: Current action verbs: none. Legacy action verbs: `SELECT`.
- Assertion parity: Current assertion helpers: none. Legacy assertion helpers: `assertThat`, `containsOnly`, `row`.
- Cleanup parity: Current cleanup operations: none. No legacy cleanup method body was available.
- Any observed difference, however small: Legacy format-parameterized coverage was expanded into one explicit JUnit
  method per file format.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Matched by current suite selection: `SuiteHiveBasic` run 1
- Audit status: `verified`

### `TestTablePartitioningWithSpecialChars`

- Owning migration commit: `Migrate TestTablePartitioningWithSpecialChars to JUnit`
- Current class added in same migration commit:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestTablePartitioningWithSpecialChars.java`
- Legacy class removed in same migration commit:
    - `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestTablePartitioningWithSpecialChars.java`
- Class-level environment requirement: `HiveBasicEnvironment`.
- Class-level tags: `HdfsNoImpersonation`.
- Method inventory complete: Yes. Legacy methods: `4`. Current methods: `4`.
- Legacy helper/resource dependencies accounted for: Legacy class source reviewed directly.
- Intentional differences summary: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Method statuses present: `verified`.

#### Methods

##### `testStringPartitioningWithSpecialCharactersCtasInTrino`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestTablePartitioningWithSpecialChars.java` ->
  `testStringPartitioningWithSpecialCharactersCtasInTrino`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestTablePartitioningWithSpecialChars.java` ->
  `TestTablePartitioningWithSpecialChars.testStringPartitioningWithSpecialCharactersCtasInTrino`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveBasicEnvironment`. Routed by source review into `SuiteHiveBasic` run
    1.
- Tag parity: Current tags: `HdfsNoImpersonation`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`. Legacy setup operations: `CREATE`.
- Action parity: Current action verbs: `WITH`, `SELECT`. Legacy action verbs: `WITH`, `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `contains`, `containsOnly`. Legacy assertion helpers:
  `assertThat`, `contains`, `containsOnly`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: Current method uses parameter-injected environment helpers instead of Tempto
  query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Matched by current suite selection: `SuiteHiveBasic` run 1 Exact-name mapping with normalized body
  similarity `0.72`.
- Audit status: `verified`

##### `testStringPartitioningWithSpecialCharactersInsertInTrino`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestTablePartitioningWithSpecialChars.java` ->
  `testStringPartitioningWithSpecialCharactersInsertInTrino`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestTablePartitioningWithSpecialChars.java` ->
  `TestTablePartitioningWithSpecialChars.testStringPartitioningWithSpecialCharactersInsertInTrino`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveBasicEnvironment`. Routed by source review into `SuiteHiveBasic` run
    1.
- Tag parity: Current tags: `HdfsNoImpersonation`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`, `INSERT`. Legacy setup operations: `CREATE`, `INSERT`.
- Action parity: Current action verbs: `SELECT`. Legacy action verbs: `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `contains`, `containsOnly`. Legacy assertion helpers:
  `assertThat`, `contains`, `containsOnly`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: Current method uses parameter-injected environment helpers instead of Tempto
  query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Matched by current suite selection: `SuiteHiveBasic` run 1 Exact-name mapping with normalized body
  similarity `0.80`.
- Audit status: `verified`

##### `testStringPartitioningWithSpecialCharactersInsertInHive`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestTablePartitioningWithSpecialChars.java` ->
  `testStringPartitioningWithSpecialCharactersInsertInHive`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestTablePartitioningWithSpecialChars.java` ->
  `TestTablePartitioningWithSpecialChars.testStringPartitioningWithSpecialCharactersInsertInHive`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveBasicEnvironment`. Routed by source review into `SuiteHiveBasic` run
    1.
- Tag parity: Current tags: `HdfsNoImpersonation`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`, `INSERT`. Legacy setup operations: `CREATE`, `INSERT`.
- Action parity: Current action verbs: `SELECT`. Legacy action verbs: `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `contains`, `containsOnly`. Legacy assertion helpers:
  `assertThat`, `contains`, `containsOnly`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: Current method uses parameter-injected environment helpers instead of Tempto
  query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Matched by current suite selection: `SuiteHiveBasic` run 1 Exact-name mapping with normalized body
  similarity `0.64`.
- Audit status: `verified`

##### `testStringPartitioningWithUtfChars`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestTablePartitioningWithSpecialChars.java` ->
  `testStringPartitioningWithUtfChars`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestTablePartitioningWithSpecialChars.java` ->
  `TestTablePartitioningWithSpecialChars.testStringPartitioningWithUtfChars`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveBasicEnvironment`. Routed by source review into `SuiteHiveBasic` run
    1.
- Tag parity: Current tags: `HdfsNoImpersonation`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`, `INSERT`. Legacy setup operations: `CREATE`, `INSERT`.
- Action parity: Current action verbs: none. Legacy action verbs: none.
- Assertion parity: Current assertion helpers: `assertThatThrownBy`, `hasMessageContaining`. Legacy assertion helpers:
  `assertQueryFailure`, `hasMessageContaining`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: Assertion helper names differ between legacy and current implementations.
  Current method uses parameter-injected environment helpers instead of Tempto query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Matched by current suite selection: `SuiteHiveBasic` run 1 Exact-name mapping with normalized body
  similarity `0.78`.
- Audit status: `verified`

### `TestTextFileHiveTable`

- Owning migration commit: `Migrate TestTextFileHiveTable to JUnit`
- Current class added in same migration commit:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestTextFileHiveTable.java`
- Legacy class removed in same migration commit:
    - `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestTextFileHiveTable.java`
- Class-level environment requirement: `HiveBasicEnvironment`.
- Class-level tags: `HdfsNoImpersonation`.
- Method inventory complete: Yes. Legacy methods: `3`. Current methods: `3`.
- Legacy helper/resource dependencies accounted for: Legacy class source reviewed directly.
- Intentional differences summary: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Method statuses present: `verified`.

#### Methods

##### `testCreateTextFileSkipHeaderFooter`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestTextFileHiveTable.java` ->
  `testCreateTextFileSkipHeaderFooter`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestTextFileHiveTable.java` ->
  `TestTextFileHiveTable.testCreateTextFileSkipHeaderFooter`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveBasicEnvironment`. Routed by source review into `SuiteHiveBasic` run
    1.
- Tag parity: Current tags: `HdfsNoImpersonation`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`. Legacy setup operations: `CREATE`.
- Action parity: Current action verbs: `WITH`, `SELECT`. Legacy action verbs: `WITH`, `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `containsOnly`, `row`. Legacy assertion helpers:
  `assertThat`, `containsOnly`, `row`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: Current method uses parameter-injected environment helpers instead of Tempto
  query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Matched by current suite selection: `SuiteHiveBasic` run 1 Exact-name mapping with normalized body
  similarity `0.80`.
- Audit status: `verified`

##### `testInsertTextFileSkipHeaderFooter`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestTextFileHiveTable.java` ->
  `testInsertTextFileSkipHeaderFooter`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestTextFileHiveTable.java` ->
  `TestTextFileHiveTable.testInsertTextFileSkipHeaderFooter`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveBasicEnvironment`. Routed by source review into `SuiteHiveBasic` run
    1.
- Tag parity: Current tags: `HdfsNoImpersonation`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`, `INSERT`. Legacy setup operations: `CREATE`, `INSERT`.
- Action parity: Current action verbs: `SELECT`. Legacy action verbs: `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `assertThatThrownBy`, `containsOnly`, `row`. Legacy
  assertion helpers: `assertThat`, `assertThatThrownBy`, `containsOnly`, `row`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: Current method uses parameter-injected environment helpers instead of Tempto
  query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Matched by current suite selection: `SuiteHiveBasic` run 1 Exact-name mapping with normalized body
  similarity `0.81`.
- Audit status: `verified`

##### `testCreateTextFileTableAsSelectSkipHeaderFooter`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestTextFileHiveTable.java` ->
  `testCreateTextFileTableAsSelectSkipHeaderFooter`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestTextFileHiveTable.java` ->
  `TestTextFileHiveTable.testCreateTextFileTableAsSelectSkipHeaderFooter`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveBasicEnvironment`. Routed by source review into `SuiteHiveBasic` run
    1.
- Tag parity: Current tags: `HdfsNoImpersonation`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`, `INSERT`. Legacy setup operations: `CREATE`, `INSERT`.
- Action parity: Current action verbs: `WITH`, `SELECT`. Legacy action verbs: `WITH`, `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `assertThatThrownBy`, `containsOnly`, `row`. Legacy
  assertion helpers: `assertThat`, `assertThatThrownBy`, `containsOnly`, `row`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: Current method uses parameter-injected environment helpers instead of Tempto
  query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Matched by current suite selection: `SuiteHiveBasic` run 1 Exact-name mapping with normalized body
  similarity `0.67`.
- Audit status: `verified`

### `TestTextfileSymlinkInputFormat`

- Owning migration commit: `Migrate TestTextfileSymlinkInputFormat to JUnit`
- Current class added in same migration commit:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestTextfileSymlinkInputFormat.java`
- Legacy class removed in same migration commit:
    - `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestTextfileSymlinkInputFormat.java`
- Class-level environment requirement: `HiveStorageFormatsEnvironment`.
- Class-level tags: `StorageFormats`.
- Method inventory complete: Yes. Legacy methods: `3`. Current methods: `3`.
- Legacy helper/resource dependencies accounted for: Legacy class source reviewed directly.
- Intentional differences summary: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Method statuses present: `verified`.

#### Methods

##### `testSymlinkTable`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestTextfileSymlinkInputFormat.java` ->
  `testSymlinkTable`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestTextfileSymlinkInputFormat.java` ->
  `TestTextfileSymlinkInputFormat.testSymlinkTable`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveStorageFormatsEnvironment`. Routed by source review into
  `SuiteHiveStorageFormats` run 1.
- Tag parity: Current tags: `StorageFormats`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: none. Legacy setup operations: none.
- Action parity: Current action verbs: none. Legacy action verbs: none.
- Assertion parity: Current assertion helpers: `assertThat`, `row`. Legacy assertion helpers: `assertThat`, `row`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: Current method uses parameter-injected environment helpers instead of Tempto
  query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Matched by current suite selection: `SuiteHiveStorageFormats` run 1 Exact-name mapping with normalized
  body similarity `0.70`.
- Audit status: `verified`

##### `testSymlinkTableWithSymlinkFileContainingNonExistentPath`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestTextfileSymlinkInputFormat.java` ->
  `testSymlinkTableWithSymlinkFileContainingNonExistentPath`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestTextfileSymlinkInputFormat.java` ->
  `TestTextfileSymlinkInputFormat.testSymlinkTableWithSymlinkFileContainingNonExistentPath`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveStorageFormatsEnvironment`. Routed by source review into
  `SuiteHiveStorageFormats` run 1.
- Tag parity: Current tags: `StorageFormats`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: none. Legacy setup operations: none.
- Action parity: Current action verbs: none. Legacy action verbs: none.
- Assertion parity: Current assertion helpers: `assertThatThrownBy`. Legacy assertion helpers: `assertThatThrownBy`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: Current method uses parameter-injected environment helpers instead of Tempto
  query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Matched by current suite selection: `SuiteHiveStorageFormats` run 1 Exact-name mapping with normalized
  body similarity `0.81`.
- Audit status: `verified`

##### `testSymlinkTableWithMultipleParentDirectories`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestTextfileSymlinkInputFormat.java` ->
  `testSymlinkTableWithMultipleParentDirectories`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestTextfileSymlinkInputFormat.java` ->
  `TestTextfileSymlinkInputFormat.testSymlinkTableWithMultipleParentDirectories`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveStorageFormatsEnvironment`. Routed by source review into
  `SuiteHiveStorageFormats` run 1.
- Tag parity: Current tags: `StorageFormats`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: none. Legacy setup operations: none.
- Action parity: Current action verbs: none. Legacy action verbs: none.
- Assertion parity: Current assertion helpers: `assertThat`, `row`. Legacy assertion helpers: `assertThat`, `row`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: Current method uses parameter-injected environment helpers instead of Tempto
  query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Matched by current suite selection: `SuiteHiveStorageFormats` run 1 Exact-name mapping with normalized
  body similarity `0.62`.
- Audit status: `verified`

### `TestAvroSchemaEvolutionOnSimpleTable`

- Owning migration commit: `Migrate TestAvroSchemaEvolutionOnSimpleTable to JUnit`
- Current class added in same migration commit:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestAvroSchemaEvolutionOnSimpleTable.java`
- Legacy class removed in same migration commit:
    - `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestAvroSchemaEvolutionOnSimpleTable.java`
- Class-level environment requirement: `HiveStorageFormatsEnvironment`.
- Class-level tags: `StorageFormats`.
- Method inventory complete: Yes. Legacy methods: `0`. Current methods: `0`.
- Legacy helper/resource dependencies accounted for: Legacy class source reviewed directly.
- Intentional differences summary: None identified at class scope.
- Method statuses present: .

#### Methods

### `TestAvroSchemaEvolutionOnTableWithPartitioning`

- Owning migration commit: `Migrate TestAvroSchemaEvolutionOnTableWithPartitioning to JUnit`
- Current class added in same migration commit:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestAvroSchemaEvolutionOnTableWithPartitioning.java`
- Legacy class removed in same migration commit:
  -
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestAvroSchemaEvolutionOnTableWithPartitioning.java`
- Class-level environment requirement: `HiveStorageFormatsEnvironment`.
- Class-level tags: `StorageFormats`.
- Method inventory complete: Yes. Legacy methods: `0`. Current methods: `0`.
- Legacy helper/resource dependencies accounted for: Legacy class source reviewed directly.
- Intentional differences summary: None identified at class scope.
- Method statuses present: .

#### Methods

### `TestHiveDeltaLakeTable`

- Owning migration commit: `Migrate TestHiveDeltaLakeTable to JUnit`
- Current class added in same migration commit:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestHiveDeltaLakeTable.java`
- Legacy class removed in same migration commit:
    - `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestHiveDeltaLakeTable.java`
- Class-level environment requirement: `HiveStorageFormatsEnvironment`.
- Class-level tags: `StorageFormats`.
- Method inventory complete: Yes. Legacy methods: `1`. Current methods: `1`.
- Legacy helper/resource dependencies accounted for: Legacy class source reviewed directly.
- Intentional differences summary: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Method statuses present: `verified`.

#### Methods

##### `testReadDeltaLakeTable`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestHiveDeltaLakeTable.java` ->
  `testReadDeltaLakeTable`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestHiveDeltaLakeTable.java` ->
  `TestHiveDeltaLakeTable.testReadDeltaLakeTable`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveStorageFormatsEnvironment`. Routed by source review into
  `SuiteHiveStorageFormats` run 1.
- Tag parity: Current tags: `StorageFormats`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`. Legacy setup operations: `CREATE`.
- Action parity: Current action verbs: `SELECT`. Legacy action verbs: `SELECT`.
- Assertion parity: Current assertion helpers: `assertThatThrownBy`. Legacy assertion helpers: `assertQueryFailure`,
  `hasMessageContaining`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: Normalized body similarity is low (`0.44`), so fidelity was judged from
  SQL/helper/assertion shape instead of raw text. Assertion helper names differ between legacy and current
  implementations. Current method uses parameter-injected environment helpers instead of Tempto query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Matched by current suite selection: `SuiteHiveStorageFormats` run 1 Exact-name mapping with normalized
  body similarity `0.44`.
- Audit status: `verified`

### `TestCsv`

- Owning migration commit: `Migrate TestCsv to JUnit`
- Current class added in same migration commit:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestCsv.java`
- Legacy class removed in same migration commit:
    - `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestCsv.java`
- Class-level environment requirement: `HiveStorageFormatsEnvironment`.
- Class-level tags: `HmsOnly`, `StorageFormats`.
- Method inventory complete: Yes. Legacy methods: `10`. Current methods: `10`.
- Legacy helper/resource dependencies accounted for: Legacy class source reviewed directly.
- Intentional differences summary: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Method statuses present: `verified`.

#### Methods

##### `testInsertIntoCsvTable`

- Legacy source method: `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestCsv.java` ->
  `testInsertIntoCsvTable`
- Current target method: `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestCsv.java` ->
  `TestCsv.testInsertIntoCsvTable`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveStorageFormatsEnvironment`. Routed by source review into
  `SuiteHmsOnly` run 1.
- Tag parity: Current tags: `HmsOnly`, `StorageFormats`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: none. No legacy setup method body was available.
- Action parity: Current action verbs: none. No legacy action method body was available.
- Assertion parity: Current assertion helpers: none. No legacy assertion method body was available.
- Cleanup parity: Current cleanup operations: none. No legacy cleanup method body was available.
- Any observed difference, however small: No method-specific difference identified beyond the documented framework
  baseline.
- Known intentional difference: None.
- Reviewer note: Matched by current suite selection: `SuiteHmsOnly` run 1 High normalized body similarity `0.82`.
- Audit status: `verified`

##### `testInsertIntoCsvTableWithCustomProperties`

- Legacy source method: `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestCsv.java` ->
  `testInsertIntoCsvTableWithCustomProperties`
- Current target method: `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestCsv.java` ->
  `TestCsv.testInsertIntoCsvTableWithCustomProperties`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveStorageFormatsEnvironment`. Routed by source review into
  `SuiteHmsOnly` run 1.
- Tag parity: Current tags: `HmsOnly`, `StorageFormats`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: none. No legacy setup method body was available.
- Action parity: Current action verbs: none. No legacy action method body was available.
- Assertion parity: Current assertion helpers: none. No legacy assertion method body was available.
- Cleanup parity: Current cleanup operations: none. No legacy cleanup method body was available.
- Any observed difference, however small: No method-specific difference identified beyond the documented framework
  baseline.
- Known intentional difference: None.
- Reviewer note: Matched by current suite selection: `SuiteHmsOnly` run 1 High normalized body similarity `0.90`.
- Audit status: `verified`

##### `testCreateCsvTableAs`

- Legacy source method: `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestCsv.java` ->
  `testCreateCsvTableAs`
- Current target method: `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestCsv.java` ->
  `TestCsv.testCreateCsvTableAs`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveStorageFormatsEnvironment`. Routed by source review into
  `SuiteHmsOnly` run 1.
- Tag parity: Current tags: `HmsOnly`, `StorageFormats`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: none. No legacy setup method body was available.
- Action parity: Current action verbs: none. No legacy action method body was available.
- Assertion parity: Current assertion helpers: none. No legacy assertion method body was available.
- Cleanup parity: Current cleanup operations: none. No legacy cleanup method body was available.
- Any observed difference, however small: No method-specific difference identified beyond the documented framework
  baseline.
- Known intentional difference: None.
- Reviewer note: Matched by current suite selection: `SuiteHmsOnly` run 1 Exact-name mapping with normalized body
  similarity `0.72`.
- Audit status: `verified`

##### `testCreateCsvTableAsWithCustomProperties`

- Legacy source method: `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestCsv.java` ->
  `testCreateCsvTableAsWithCustomProperties`
- Current target method: `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestCsv.java` ->
  `TestCsv.testCreateCsvTableAsWithCustomProperties`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveStorageFormatsEnvironment`. Routed by source review into
  `SuiteHmsOnly` run 1.
- Tag parity: Current tags: `HmsOnly`, `StorageFormats`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: none. No legacy setup method body was available.
- Action parity: Current action verbs: none. No legacy action method body was available.
- Assertion parity: Current assertion helpers: none. No legacy assertion method body was available.
- Cleanup parity: Current cleanup operations: none. No legacy cleanup method body was available.
- Any observed difference, however small: No method-specific difference identified beyond the documented framework
  baseline.
- Known intentional difference: None.
- Reviewer note: Matched by current suite selection: `SuiteHmsOnly` run 1 High normalized body similarity `0.86`.
- Audit status: `verified`

##### `testInsertIntoPartitionedCsvTable`

- Legacy source method: `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestCsv.java` ->
  `testInsertIntoPartitionedCsvTable`
- Current target method: `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestCsv.java` ->
  `TestCsv.testInsertIntoPartitionedCsvTable`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveStorageFormatsEnvironment`. Routed by source review into
  `SuiteHmsOnly` run 1.
- Tag parity: Current tags: `HmsOnly`, `StorageFormats`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: none. No legacy setup method body was available.
- Action parity: Current action verbs: none. No legacy action method body was available.
- Assertion parity: Current assertion helpers: none. No legacy assertion method body was available.
- Cleanup parity: Current cleanup operations: none. No legacy cleanup method body was available.
- Any observed difference, however small: No method-specific difference identified beyond the documented framework
  baseline.
- Known intentional difference: None.
- Reviewer note: Matched by current suite selection: `SuiteHmsOnly` run 1 High normalized body similarity `0.83`.
- Audit status: `verified`

##### `testInsertIntoPartitionedCsvTableWithCustomProperties`

- Legacy source method: `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestCsv.java` ->
  `testInsertIntoPartitionedCsvTableWithCustomProperties`
- Current target method: `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestCsv.java` ->
  `TestCsv.testInsertIntoPartitionedCsvTableWithCustomProperties`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveStorageFormatsEnvironment`. Routed by source review into
  `SuiteHmsOnly` run 1.
- Tag parity: Current tags: `HmsOnly`, `StorageFormats`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: none. No legacy setup method body was available.
- Action parity: Current action verbs: none. No legacy action method body was available.
- Assertion parity: Current assertion helpers: none. No legacy assertion method body was available.
- Cleanup parity: Current cleanup operations: none. No legacy cleanup method body was available.
- Any observed difference, however small: No method-specific difference identified beyond the documented framework
  baseline.
- Known intentional difference: None.
- Reviewer note: Matched by current suite selection: `SuiteHmsOnly` run 1 High normalized body similarity `0.90`.
- Audit status: `verified`

##### `testCreatePartitionedCsvTableAs`

- Legacy source method: `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestCsv.java` ->
  `testCreatePartitionedCsvTableAs`
- Current target method: `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestCsv.java` ->
  `TestCsv.testCreatePartitionedCsvTableAs`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveStorageFormatsEnvironment`. Routed by source review into
  `SuiteHmsOnly` run 1.
- Tag parity: Current tags: `HmsOnly`, `StorageFormats`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: none. No legacy setup method body was available.
- Action parity: Current action verbs: none. No legacy action method body was available.
- Assertion parity: Current assertion helpers: none. No legacy assertion method body was available.
- Cleanup parity: Current cleanup operations: none. No legacy cleanup method body was available.
- Any observed difference, however small: No method-specific difference identified beyond the documented framework
  baseline.
- Known intentional difference: None.
- Reviewer note: Matched by current suite selection: `SuiteHmsOnly` run 1 High normalized body similarity `0.86`.
- Audit status: `verified`

##### `testCreatePartitionedCsvTableAsWithCustomParamters`

- Legacy source method: `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestCsv.java` ->
  `testCreatePartitionedCsvTableAsWithCustomParamters`
- Current target method: `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestCsv.java` ->
  `TestCsv.testCreatePartitionedCsvTableAsWithCustomParamters`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveStorageFormatsEnvironment`. Routed by source review into
  `SuiteHmsOnly` run 1.
- Tag parity: Current tags: `HmsOnly`, `StorageFormats`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: none. No legacy setup method body was available.
- Action parity: Current action verbs: none. No legacy action method body was available.
- Assertion parity: Current assertion helpers: none. No legacy assertion method body was available.
- Cleanup parity: Current cleanup operations: none. No legacy cleanup method body was available.
- Any observed difference, however small: No method-specific difference identified beyond the documented framework
  baseline.
- Known intentional difference: None.
- Reviewer note: Matched by current suite selection: `SuiteHmsOnly` run 1 Exact-name mapping with normalized body
  similarity `0.59`.
- Audit status: `verified`

##### `testReadCsvTableWithMultiCharProperties`

- Legacy source method: `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestCsv.java` ->
  `testReadCsvTableWithMultiCharProperties`
- Current target method: `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestCsv.java` ->
  `TestCsv.testReadCsvTableWithMultiCharProperties`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveStorageFormatsEnvironment`. Routed by source review into
  `SuiteHmsOnly` run 1.
- Tag parity: Current tags: `HmsOnly`, `StorageFormats`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`, `INSERT`. Legacy setup operations: `CREATE`, `INSERT`.
- Action parity: Current action verbs: `WITH`, `SELECT`. Legacy action verbs: `WITH`, `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `containsOnly`, `row`. Legacy assertion helpers:
  `assertThat`, `containsOnly`, `row`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: Current method uses parameter-injected environment helpers instead of Tempto
  query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Matched by current suite selection: `SuiteHmsOnly` run 1 Exact-name mapping with normalized body
  similarity `0.78`.
- Audit status: `verified`

##### `testWriteCsvTableWithMultiCharProperties`

- Legacy source method: `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestCsv.java` ->
  `testWriteCsvTableWithMultiCharProperties`
- Current target method: `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestCsv.java` ->
  `TestCsv.testWriteCsvTableWithMultiCharProperties`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveStorageFormatsEnvironment`. Routed by source review into
  `SuiteHmsOnly` run 1.
- Tag parity: Current tags: `HmsOnly`, `StorageFormats`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`, `INSERT`. Legacy setup operations: `CREATE`, `INSERT`.
- Action parity: Current action verbs: `WITH`, `SELECT`. Legacy action verbs: `WITH`, `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `containsOnly`, `row`. Legacy assertion helpers:
  `assertThat`, `containsOnly`, `row`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: Current method uses parameter-injected environment helpers instead of Tempto
  query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Matched by current suite selection: `SuiteHmsOnly` run 1 Exact-name mapping with normalized body
  similarity `0.78`.
- Audit status: `verified`

### `TestHiveStorageFormats`

- Owning migration commit: `Migrate TestHiveStorageFormats to JUnit`
- Current class added in same migration commit:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestHiveStorageFormats.java`
- Legacy class removed in same migration commit:
    - `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestHiveStorageFormats.java`
- Class-level environment requirement: `HiveStorageFormatsEnvironment`.
- Class-level tags: `HmsOnly`, `StorageFormats`, `StorageFormatsDetailed`.
- Method inventory complete: Yes. Legacy methods: `18`. Current methods: `18`.
- Legacy helper/resource dependencies accounted for: Legacy class source reviewed directly.
- Intentional differences summary: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Method statuses present: `verified`.

#### Methods

##### `verifyDataProviderCompleteness`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestHiveStorageFormats.java` ->
  `verifyDataProviderCompleteness`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestHiveStorageFormats.java` ->
  `TestHiveStorageFormats.verifyDataProviderCompleteness`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveStorageFormatsEnvironment`. Routed by source review into
  `SuiteHmsOnly` run 1, `SuiteStorageFormatsDetailed` run 1.
- Tag parity: Current tags: `HmsOnly`, `StorageFormats`, `StorageFormatsDetailed`. Tag routing matches the current suite
  selection.
- Setup parity: Current setup operations: none. Legacy setup operations: none.
- Action parity: Current action verbs: `SELECT`. Legacy action verbs: `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `isEqualTo`. Legacy assertion helpers: `assertThat`,
  `isEqualTo`.
- Cleanup parity: Current cleanup operations: none. No legacy cleanup method body was available.
- Any observed difference, however small: Current method uses parameter-injected environment helpers instead of Tempto
  query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Matched by current suite selection: `SuiteHmsOnly` run 1, `SuiteStorageFormatsDetailed` run 1
  Exact-name mapping with normalized body similarity `0.93`.
- Audit status: `verified`

##### `testInsertIntoTable`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestHiveStorageFormats.java` ->
  `testInsertIntoTable`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestHiveStorageFormats.java` ->
  `TestHiveStorageFormats.testInsertIntoTable`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveStorageFormatsEnvironment`. Routed by source review into
  `SuiteHmsOnly` run 1, `SuiteStorageFormatsDetailed` run 1.
- Tag parity: Current tags: `HmsOnly`, `StorageFormats`, `StorageFormatsDetailed`. Tag routing matches the current suite
  selection.
- Setup parity: Current setup operations: `CREATE`, `INSERT`. Legacy setup operations: `CREATE`, `INSERT`.
- Action parity: Current action verbs: `SELECT`. Legacy action verbs: `SELECT`.
- Assertion parity: Current assertion helpers: `assertResultEqualForLineitemTable`. Legacy assertion helpers:
  `assertResultEqualForLineitemTable`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: Current method uses parameter-injected environment helpers instead of Tempto
  query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Matched by current suite selection: `SuiteHmsOnly` run 1, `SuiteStorageFormatsDetailed` run 1
  Exact-name mapping with normalized body similarity `0.73`.
- Audit status: `verified`

##### `testCreateTableAs`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestHiveStorageFormats.java` ->
  `testCreateTableAs`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestHiveStorageFormats.java` ->
  `TestHiveStorageFormats.testCreateTableAs`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveStorageFormatsEnvironment`. Routed by source review into
  `SuiteHmsOnly` run 1, `SuiteStorageFormatsDetailed` run 1.
- Tag parity: Current tags: `HmsOnly`, `StorageFormats`, `StorageFormatsDetailed`. Tag routing matches the current suite
  selection.
- Setup parity: Current setup operations: `CREATE`. Legacy setup operations: `CREATE`.
- Action parity: Current action verbs: `SELECT`. Legacy action verbs: `SELECT`.
- Assertion parity: Current assertion helpers: `assertResultEqualForLineitemTable`. Legacy assertion helpers:
  `assertResultEqualForLineitemTable`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: Normalized body similarity is low (`0.55`), so fidelity was judged from
  SQL/helper/assertion shape instead of raw text. Current method uses parameter-injected environment helpers instead of
  Tempto query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Matched by current suite selection: `SuiteHmsOnly` run 1, `SuiteStorageFormatsDetailed` run 1
  Exact-name mapping with normalized body similarity `0.55`.
- Audit status: `verified`

##### `testInsertIntoPartitionedTable`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestHiveStorageFormats.java` ->
  `testInsertIntoPartitionedTable`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestHiveStorageFormats.java` ->
  `TestHiveStorageFormats.testInsertIntoPartitionedTable`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveStorageFormatsEnvironment`. Routed by source review into
  `SuiteHmsOnly` run 1, `SuiteStorageFormatsDetailed` run 1.
- Tag parity: Current tags: `HmsOnly`, `StorageFormats`, `StorageFormatsDetailed`. Tag routing matches the current suite
  selection.
- Setup parity: Current setup operations: `CREATE`, `INSERT`. Legacy setup operations: `CREATE`, `INSERT`.
- Action parity: Current action verbs: `SELECT`. Legacy action verbs: `SELECT`.
- Assertion parity: Current assertion helpers: `assertResultEqualForLineitemTable`. Legacy assertion helpers:
  `assertResultEqualForLineitemTable`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: Current method uses parameter-injected environment helpers instead of Tempto
  query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Matched by current suite selection: `SuiteHmsOnly` run 1, `SuiteStorageFormatsDetailed` run 1
  Exact-name mapping with normalized body similarity `0.73`.
- Audit status: `verified`

##### `testInsertAndSelectWithNullFormat`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestHiveStorageFormats.java` ->
  `testInsertAndSelectWithNullFormat`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestHiveStorageFormats.java` ->
  `TestHiveStorageFormats.testInsertAndSelectWithNullFormat`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveStorageFormatsEnvironment`. Routed by source review into
  `SuiteHmsOnly` run 1, `SuiteStorageFormatsDetailed` run 1.
- Tag parity: Current tags: `HmsOnly`, `StorageFormats`, `StorageFormatsDetailed`. Tag routing matches the current suite
  selection.
- Setup parity: Current setup operations: `CREATE`, `INSERT`. Legacy setup operations: `CREATE`, `INSERT`.
- Action parity: Current action verbs: `WITH`, `SELECT`. Legacy action verbs: `WITH`, `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `containsOnly`, `row`. Legacy assertion helpers:
  `assertThat`, `containsOnly`, `row`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: Current method uses parameter-injected environment helpers instead of Tempto
  query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Matched by current suite selection: `SuiteHmsOnly` run 1, `SuiteStorageFormatsDetailed` run 1
  Exact-name mapping with normalized body similarity `0.72`.
- Audit status: `verified`

##### `testSelectFromZeroByteFile`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestHiveStorageFormats.java` ->
  `testSelectFromZeroByteFile`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestHiveStorageFormats.java` ->
  `TestHiveStorageFormats.testSelectFromZeroByteFile`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveStorageFormatsEnvironment`. Routed by source review into
  `SuiteHmsOnly` run 1, `SuiteStorageFormatsDetailed` run 1.
- Tag parity: Current tags: `HmsOnly`, `StorageFormats`, `StorageFormatsDetailed`. Tag routing matches the current suite
  selection.
- Setup parity: Current setup operations: `CREATE`. Legacy setup operations: `CREATE`.
- Action parity: Current action verbs: `WITH`, `SELECT`. Legacy action verbs: `WITH`, `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`. Legacy assertion helpers: `assertThat`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: Current method uses parameter-injected environment helpers instead of Tempto
  query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Matched by current suite selection: `SuiteHmsOnly` run 1, `SuiteStorageFormatsDetailed` run 1
  Exact-name mapping with normalized body similarity `0.81`.
- Audit status: `verified`

##### `testSelectWithNullFormat`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestHiveStorageFormats.java` ->
  `testSelectWithNullFormat`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestHiveStorageFormats.java` ->
  `TestHiveStorageFormats.testSelectWithNullFormat`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveStorageFormatsEnvironment`. Routed by source review into
  `SuiteHmsOnly` run 1, `SuiteStorageFormatsDetailed` run 1.
- Tag parity: Current tags: `HmsOnly`, `StorageFormats`, `StorageFormatsDetailed`. Tag routing matches the current suite
  selection.
- Setup parity: Current setup operations: `CREATE`, `INSERT`. Legacy setup operations: `CREATE`, `INSERT`.
- Action parity: Current action verbs: `WITH`, `SELECT`. Legacy action verbs: `WITH`, `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `containsOnly`, `row`. Legacy assertion helpers:
  `assertThat`, `containsOnly`, `row`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: Current method uses parameter-injected environment helpers instead of Tempto
  query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Matched by current suite selection: `SuiteHmsOnly` run 1, `SuiteStorageFormatsDetailed` run 1
  Exact-name mapping with normalized body similarity `0.59`.
- Audit status: `verified`

##### `testCreatePartitionedTableAs`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestHiveStorageFormats.java` ->
  `testCreatePartitionedTableAs`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestHiveStorageFormats.java` ->
  `TestHiveStorageFormats.testCreatePartitionedTableAs`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveStorageFormatsEnvironment`. Routed by source review into
  `SuiteHmsOnly` run 1, `SuiteStorageFormatsDetailed` run 1.
- Tag parity: Current tags: `HmsOnly`, `StorageFormats`, `StorageFormatsDetailed`. Tag routing matches the current suite
  selection.
- Setup parity: Current setup operations: `CREATE`. Legacy setup operations: `CREATE`.
- Action parity: Current action verbs: `SELECT`. Legacy action verbs: `SELECT`.
- Assertion parity: Current assertion helpers: `assertResultEqualForLineitemTable`. Legacy assertion helpers:
  `assertResultEqualForLineitemTable`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: Current method uses parameter-injected environment helpers instead of Tempto
  query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Matched by current suite selection: `SuiteHmsOnly` run 1, `SuiteStorageFormatsDetailed` run 1
  Exact-name mapping with normalized body similarity `0.58`.
- Audit status: `verified`

##### `testOrcTableCreatedInTrino`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestHiveStorageFormats.java` ->
  `testOrcTableCreatedInTrino`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestHiveStorageFormats.java` ->
  `TestHiveStorageFormats.testOrcTableCreatedInTrino`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveStorageFormatsEnvironment`. Routed by source review into
  `SuiteHmsOnly` run 1, `SuiteStorageFormatsDetailed` run 1.
- Tag parity: Current tags: `HmsOnly`, `StorageFormats`, `StorageFormatsDetailed`. Tag routing matches the current suite
  selection.
- Setup parity: Current setup operations: `CREATE`. Legacy setup operations: `CREATE`.
- Action parity: Current action verbs: `SELECT`. Legacy action verbs: `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `containsOnly`, `row`. Legacy assertion helpers:
  `assertThat`, `containsOnly`, `row`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: Current method uses parameter-injected environment helpers instead of Tempto
  query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Matched by current suite selection: `SuiteHmsOnly` run 1, `SuiteStorageFormatsDetailed` run 1
  Exact-name mapping with normalized body similarity `0.75`.
- Audit status: `verified`

##### `testNestedFieldsWrittenByHive`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestHiveStorageFormats.java` ->
  `testNestedFieldsWrittenByHive`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestHiveStorageFormats.java` ->
  `TestHiveStorageFormats.testNestedFieldsWrittenByHive`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveStorageFormatsEnvironment`. Routed by source review into
  `SuiteHmsOnly` run 1, `SuiteStorageFormatsDetailed` run 1.
- Tag parity: Current tags: `HmsOnly`, `StorageFormats`, `StorageFormatsDetailed`. Tag routing matches the current suite
  selection.
- Setup parity: Current setup operations: none. No legacy setup method body was available.
- Action parity: Current action verbs: none. No legacy action method body was available.
- Assertion parity: Current assertion helpers: none. No legacy assertion method body was available.
- Cleanup parity: Current cleanup operations: none. No legacy cleanup method body was available.
- Any observed difference, however small: No method-specific difference identified beyond the documented framework
  baseline.
- Known intentional difference: None.
- Reviewer note: Matched by current suite selection: `SuiteHmsOnly` run 1, `SuiteStorageFormatsDetailed` run 1
  Exact-name mapping with normalized body similarity `0.78`.
- Audit status: `verified`

##### `testNestedFieldsWrittenByTrino`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestHiveStorageFormats.java` ->
  `testNestedFieldsWrittenByTrino`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestHiveStorageFormats.java` ->
  `TestHiveStorageFormats.testNestedFieldsWrittenByTrino`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveStorageFormatsEnvironment`. Routed by source review into
  `SuiteHmsOnly` run 1, `SuiteStorageFormatsDetailed` run 1.
- Tag parity: Current tags: `HmsOnly`, `StorageFormats`, `StorageFormatsDetailed`. Tag routing matches the current suite
  selection.
- Setup parity: Current setup operations: none. No legacy setup method body was available.
- Action parity: Current action verbs: none. No legacy action method body was available.
- Assertion parity: Current assertion helpers: none. No legacy assertion method body was available.
- Cleanup parity: Current cleanup operations: none. No legacy cleanup method body was available.
- Any observed difference, however small: No method-specific difference identified beyond the documented framework
  baseline.
- Known intentional difference: None.
- Reviewer note: Matched by current suite selection: `SuiteHmsOnly` run 1, `SuiteStorageFormatsDetailed` run 1
  Exact-name mapping with normalized body similarity `0.78`.
- Audit status: `verified`

##### `testOrcStructsWithNonLowercaseFields`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestHiveStorageFormats.java` ->
  `testOrcStructsWithNonLowercaseFields`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestHiveStorageFormats.java` ->
  `TestHiveStorageFormats.testOrcStructsWithNonLowercaseFields`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveStorageFormatsEnvironment`. Routed by source review into
  `SuiteHmsOnly` run 1, `SuiteStorageFormatsDetailed` run 1.
- Tag parity: Current tags: `HmsOnly`, `StorageFormats`, `StorageFormatsDetailed`. Tag routing matches the current suite
  selection.
- Setup parity: Current setup operations: `CREATE`, `INSERT`. Legacy setup operations: `CREATE`, `INSERT`.
- Action parity: Current action verbs: `SELECT`. Legacy action verbs: `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `containsOnly`, `row`. Legacy assertion helpers:
  `assertThat`, `containsOnly`, `row`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: Current method uses parameter-injected environment helpers instead of Tempto
  query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Matched by current suite selection: `SuiteHmsOnly` run 1, `SuiteStorageFormatsDetailed` run 1
  Exact-name mapping with normalized body similarity `0.73`.
- Audit status: `verified`

##### `testTimestampCreatedFromHive`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestHiveStorageFormats.java` ->
  `testTimestampCreatedFromHive`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestHiveStorageFormats.java` ->
  `TestHiveStorageFormats.testTimestampCreatedFromHive`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveStorageFormatsEnvironment`. Routed by source review into
  `SuiteHmsOnly` run 1, `SuiteStorageFormatsDetailed` run 1.
- Tag parity: Current tags: `HmsOnly`, `StorageFormats`, `StorageFormatsDetailed`. Tag routing matches the current suite
  selection.
- Setup parity: Current setup operations: `INSERT`. Legacy setup operations: `INSERT`.
- Action parity: Current action verbs: none. Legacy action verbs: none.
- Assertion parity: Current assertion helpers: `assertSimpleTimestamps`. Legacy assertion helpers:
  `assertSimpleTimestamps`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: Current method uses parameter-injected environment helpers instead of Tempto
  query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Matched by current suite selection: `SuiteHmsOnly` run 1, `SuiteStorageFormatsDetailed` run 1
  Exact-name mapping with normalized body similarity `0.66`.
- Audit status: `verified`

##### `testTimestampCreatedFromTrino`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestHiveStorageFormats.java` ->
  `testTimestampCreatedFromTrino`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestHiveStorageFormats.java` ->
  `TestHiveStorageFormats.testTimestampCreatedFromTrino`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveStorageFormatsEnvironment`. Routed by source review into
  `SuiteHmsOnly` run 1, `SuiteStorageFormatsDetailed` run 1.
- Tag parity: Current tags: `HmsOnly`, `StorageFormats`, `StorageFormatsDetailed`. Tag routing matches the current suite
  selection.
- Setup parity: Current setup operations: `INSERT`. Legacy setup operations: `INSERT`.
- Action parity: Current action verbs: none. Legacy action verbs: none.
- Assertion parity: Current assertion helpers: `assertSimpleTimestamps`. Legacy assertion helpers:
  `assertSimpleTimestamps`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: Current method uses parameter-injected environment helpers instead of Tempto
  query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Matched by current suite selection: `SuiteHmsOnly` run 1, `SuiteStorageFormatsDetailed` run 1
  Exact-name mapping with normalized body similarity `0.76`.
- Audit status: `verified`

##### `testStructTimestampsFromHive`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestHiveStorageFormats.java` ->
  `testStructTimestampsFromHive`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestHiveStorageFormats.java` ->
  `TestHiveStorageFormats.testStructTimestampsFromHive`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveStorageFormatsEnvironment`. Routed by source review into
  `SuiteHmsOnly` run 1, `SuiteStorageFormatsDetailed` run 1.
- Tag parity: Current tags: `HmsOnly`, `StorageFormats`, `StorageFormatsDetailed`. Tag routing matches the current suite
  selection.
- Setup parity: Current setup operations: `INSERT`. Legacy setup operations: `INSERT`.
- Action parity: Current action verbs: `SELECT`. Legacy action verbs: `SELECT`.
- Assertion parity: Current assertion helpers: `assertStructTimestamps`. Legacy assertion helpers:
  `assertStructTimestamps`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: Current method uses parameter-injected environment helpers instead of Tempto
  query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Matched by current suite selection: `SuiteHmsOnly` run 1, `SuiteStorageFormatsDetailed` run 1
  Exact-name mapping with normalized body similarity `0.70`.
- Audit status: `verified`

##### `testStructTimestampsFromTrino`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestHiveStorageFormats.java` ->
  `testStructTimestampsFromTrino`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestHiveStorageFormats.java` ->
  `TestHiveStorageFormats.testStructTimestampsFromTrino`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveStorageFormatsEnvironment`. Routed by source review into
  `SuiteHmsOnly` run 1, `SuiteStorageFormatsDetailed` run 1.
- Tag parity: Current tags: `HmsOnly`, `StorageFormats`, `StorageFormatsDetailed`. Tag routing matches the current suite
  selection.
- Setup parity: Current setup operations: `INSERT`. Legacy setup operations: `INSERT`.
- Action parity: Current action verbs: none. Legacy action verbs: none.
- Assertion parity: Current assertion helpers: `assertStructTimestamps`, `row`. Legacy assertion helpers:
  `assertStructTimestamps`, `row`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: Current method uses parameter-injected environment helpers instead of Tempto
  query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Matched by current suite selection: `SuiteHmsOnly` run 1, `SuiteStorageFormatsDetailed` run 1
  Exact-name mapping with normalized body similarity `0.66`.
- Audit status: `verified`

##### `testLargeParquetInsert`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestHiveStorageFormats.java` ->
  `testLargeParquetInsert`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestHiveStorageFormats.java` ->
  `TestHiveStorageFormats.testLargeParquetInsert`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveStorageFormatsEnvironment`. Routed by source review into
  `SuiteHmsOnly` run 1, `SuiteStorageFormatsDetailed` run 1.
- Tag parity: Current tags: `HmsOnly`, `StorageFormats`, `StorageFormatsDetailed`. Tag routing matches the current suite
  selection.
- Setup parity: Current setup operations: none. No legacy setup method body was available.
- Action parity: Current action verbs: none. No legacy action method body was available.
- Assertion parity: Current assertion helpers: none. No legacy assertion method body was available.
- Cleanup parity: Current cleanup operations: none. No legacy cleanup method body was available.
- Any observed difference, however small: No method-specific difference identified beyond the documented framework
  baseline.
- Known intentional difference: None.
- Reviewer note: Matched by current suite selection: `SuiteHmsOnly` run 1, `SuiteStorageFormatsDetailed` run 1 High
  normalized body similarity `0.94`.
- Audit status: `verified`

##### `testLargeOrcInsert`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestHiveStorageFormats.java` ->
  `testLargeOrcInsert`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestHiveStorageFormats.java` ->
  `TestHiveStorageFormats.testLargeOrcInsert`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveStorageFormatsEnvironment`. Routed by source review into
  `SuiteHmsOnly` run 1, `SuiteStorageFormatsDetailed` run 1.
- Tag parity: Current tags: `HmsOnly`, `StorageFormats`, `StorageFormatsDetailed`. Tag routing matches the current suite
  selection.
- Setup parity: Current setup operations: none. No legacy setup method body was available.
- Action parity: Current action verbs: none. No legacy action method body was available.
- Assertion parity: Current assertion helpers: none. No legacy assertion method body was available.
- Cleanup parity: Current cleanup operations: none. No legacy cleanup method body was available.
- Any observed difference, however small: No method-specific difference identified beyond the documented framework
  baseline.
- Known intentional difference: None.
- Reviewer note: Matched by current suite selection: `SuiteHmsOnly` run 1, `SuiteStorageFormatsDetailed` run 1 High
  normalized body similarity `0.85`.
- Audit status: `verified`

### `TestHiveCompression`

- Owning migration commit: `Migrate TestHiveCompression to JUnit`
- Current class added in same migration commit:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestHiveCompression.java`
- Legacy class removed in same migration commit:
    - `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestHiveCompression.java`
- Class-level environment requirement: `HiveStorageFormatsEnvironment`.
- Class-level tags: `HiveCompression`, `StorageFormats`.
- Method inventory complete: Yes. Legacy methods: `4`. Current methods: `4`.
- Legacy helper/resource dependencies accounted for: Legacy class source reviewed directly.
- Intentional differences summary: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Method statuses present: `verified`.

#### Methods

##### `testReadTextfileWithLzop`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestHiveCompression.java` ->
  `testReadTextfileWithLzop`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestHiveCompression.java` ->
  `TestHiveCompression.testReadTextfileWithLzop`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveStorageFormatsEnvironment`. Routed by source review into
  `SuiteStorageFormatsDetailed` run 2.
- Tag parity: Current tags: `HiveCompression`, `StorageFormats`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: none. No legacy setup method body was available.
- Action parity: Current action verbs: none. No legacy action method body was available.
- Assertion parity: Current assertion helpers: none. No legacy assertion method body was available.
- Cleanup parity: Current cleanup operations: none. No legacy cleanup method body was available.
- Any observed difference, however small: No method-specific difference identified beyond the documented framework
  baseline.
- Known intentional difference: None.
- Reviewer note: Matched by current suite selection: `SuiteStorageFormatsDetailed` run 2 High normalized body similarity
  `0.86`.
- Audit status: `verified`

##### `testReadSequencefileWithLzo`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestHiveCompression.java` ->
  `testReadSequencefileWithLzo`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestHiveCompression.java` ->
  `TestHiveCompression.testReadSequencefileWithLzo`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveStorageFormatsEnvironment`. Routed by source review into
  `SuiteStorageFormatsDetailed` run 2.
- Tag parity: Current tags: `HiveCompression`, `StorageFormats`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: none. No legacy setup method body was available.
- Action parity: Current action verbs: none. No legacy action method body was available.
- Assertion parity: Current assertion helpers: none. No legacy assertion method body was available.
- Cleanup parity: Current cleanup operations: none. No legacy cleanup method body was available.
- Any observed difference, however small: No method-specific difference identified beyond the documented framework
  baseline.
- Known intentional difference: None.
- Reviewer note: Matched by current suite selection: `SuiteStorageFormatsDetailed` run 2 High normalized body similarity
  `0.87`.
- Audit status: `verified`

##### `testSnappyCompressedParquetTableCreatedInHive`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestHiveCompression.java` ->
  `testSnappyCompressedParquetTableCreatedInHive`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestHiveCompression.java` ->
  `TestHiveCompression.testSnappyCompressedParquetTableCreatedInHive`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveStorageFormatsEnvironment`. Routed by source review into
  `SuiteStorageFormatsDetailed` run 2.
- Tag parity: Current tags: `HiveCompression`, `StorageFormats`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`, `INSERT`. Legacy setup operations: `CREATE`, `INSERT`.
- Action parity: Current action verbs: `SELECT`. Legacy action verbs: `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `row`. Legacy assertion helpers: `assertThat`, `row`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: Current method uses parameter-injected environment helpers instead of Tempto
  query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Matched by current suite selection: `SuiteStorageFormatsDetailed` run 2 Exact-name mapping with
  normalized body similarity `0.83`.
- Audit status: `verified`

##### `testSnappyCompressedParquetTableCreatedInTrino`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestHiveCompression.java` ->
  `testSnappyCompressedParquetTableCreatedInTrino`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestHiveCompression.java` ->
  `TestHiveCompression.testSnappyCompressedParquetTableCreatedInTrino`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveStorageFormatsEnvironment`. Routed by source review into
  `SuiteStorageFormatsDetailed` run 2.
- Tag parity: Current tags: `HiveCompression`, `StorageFormats`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`, `INSERT`. Legacy setup operations: `CREATE`, `INSERT`.
- Action parity: Current action verbs: `WITH`, `SELECT`. Legacy action verbs: `WITH`, `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `row`. Legacy assertion helpers: `assertThat`, `row`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: Current method uses parameter-injected environment helpers instead of Tempto
  query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Matched by current suite selection: `SuiteStorageFormatsDetailed` run 2 Exact-name mapping with
  normalized body similarity `0.82`.
- Audit status: `verified`

### `TestHiveMerge`

- Owning migration commit: `Migrate TestHiveMerge to JUnit`
- Current class added in same migration commit:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestHiveMerge.java`
- Legacy class removed in same migration commit:
    - `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestHiveMerge.java`
- Class-level environment requirement: `HiveTransactionalEnvironment`.
- Class-level tags: `HiveTransactional`.
- Method inventory complete: Yes. Legacy methods: `25`. Current methods: `25`.
- Legacy helper/resource dependencies accounted for: Legacy class source reviewed directly.
- Intentional differences summary: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Method statuses present: `verified`.

#### Methods

##### `testMergeSimpleSelect`

- Legacy source method: `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestHiveMerge.java` ->
  `testMergeSimpleSelect`
- Current target method: `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestHiveMerge.java` ->
  `TestHiveMerge.testMergeSimpleSelect`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveTransactionalEnvironment`. Routed by source review into
  `SuiteHiveTransactional` run 1.
- Tag parity: Current tags: `HiveTransactional`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`, `INSERT`. Legacy setup operations: `CREATE`, `INSERT`.
- Action parity: Current action verbs: `MERGE`, `SELECT`. Legacy action verbs: `MERGE`, `SELECT`.
- Assertion parity: Current assertion helpers: `row`. Legacy assertion helpers: `row`.
- Cleanup parity: Current cleanup operations: none. No legacy cleanup method body was available.
- Any observed difference, however small: Current method uses parameter-injected environment helpers instead of Tempto
  query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Matched by current suite selection: `SuiteHiveTransactional` run 1 Exact-name mapping with normalized
  body similarity `0.87`.
- Audit status: `verified`

##### `testMergeSimpleSelectPartitioned`

- Legacy source method: `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestHiveMerge.java` ->
  `testMergeSimpleSelectPartitioned`
- Current target method: `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestHiveMerge.java` ->
  `TestHiveMerge.testMergeSimpleSelectPartitioned`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveTransactionalEnvironment`. Routed by source review into
  `SuiteHiveTransactional` run 1.
- Tag parity: Current tags: `HiveTransactional`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`, `INSERT`. Legacy setup operations: `CREATE`, `INSERT`.
- Action parity: Current action verbs: `MERGE`, `SELECT`. Legacy action verbs: `MERGE`, `SELECT`.
- Assertion parity: Current assertion helpers: `row`. Legacy assertion helpers: `row`.
- Cleanup parity: Current cleanup operations: none. No legacy cleanup method body was available.
- Any observed difference, however small: Current method uses parameter-injected environment helpers instead of Tempto
  query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Matched by current suite selection: `SuiteHiveTransactional` run 1 Exact-name mapping with normalized
  body similarity `0.86`.
- Audit status: `verified`

##### `testMergeUpdateWithVariousLayouts`

- Legacy source method: `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestHiveMerge.java` ->
  `testMergeUpdateWithVariousLayouts`
- Current target method: `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestHiveMerge.java` ->
  `TestHiveMerge.testMergeUpdateWithVariousLayouts`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveTransactionalEnvironment`. Routed by source review into
  `SuiteHiveTransactional` run 1.
- Tag parity: Current tags: `HiveTransactional`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`, `INSERT`. Legacy setup operations: `CREATE`, `INSERT`.
- Action parity: Current action verbs: `SELECT`, `MERGE`. Legacy action verbs: `SELECT`, `MERGE`.
- Assertion parity: Current assertion helpers: `row`. Legacy assertion helpers: `row`.
- Cleanup parity: Current cleanup operations: none. No legacy cleanup method body was available.
- Any observed difference, however small: Current method uses parameter-injected environment helpers instead of Tempto
  query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Matched by current suite selection: `SuiteHiveTransactional` run 1 Exact-name mapping with normalized
  body similarity `0.92`.
- Audit status: `verified`

##### `testMergeUnBucketedUnPartitionedFailure`

- Legacy source method: `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestHiveMerge.java` ->
  `testMergeUnBucketedUnPartitionedFailure`
- Current target method: `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestHiveMerge.java` ->
  `TestHiveMerge.testMergeUnBucketedUnPartitionedFailure`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveTransactionalEnvironment`. Routed by source review into
  `SuiteHiveTransactional` run 1.
- Tag parity: Current tags: `HiveTransactional`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`, `INSERT`. Legacy setup operations: `CREATE`, `INSERT`.
- Action parity: Current action verbs: `SELECT`, `MERGE`. Legacy action verbs: `SELECT`, `MERGE`.
- Assertion parity: Current assertion helpers: `row`. Legacy assertion helpers: `row`.
- Cleanup parity: Current cleanup operations: none. No legacy cleanup method body was available.
- Any observed difference, however small: Current method uses parameter-injected environment helpers instead of Tempto
  query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Matched by current suite selection: `SuiteHiveTransactional` run 1 Exact-name mapping with normalized
  body similarity `0.88`.
- Audit status: `verified`

##### `testMergeMultipleOperationsUnbucketedUnpartitioned`

- Legacy source method: `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestHiveMerge.java` ->
  `testMergeMultipleOperationsUnbucketedUnpartitioned`
- Current target method: `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestHiveMerge.java` ->
  `TestHiveMerge.testMergeMultipleOperationsUnbucketedUnpartitioned`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveTransactionalEnvironment`. Routed by source review into
  `SuiteHiveTransactional` run 1.
- Tag parity: Current tags: `HiveTransactional`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`. Legacy setup operations: `CREATE`.
- Action parity: Current action verbs: none. Legacy action verbs: none.
- Assertion parity: Current assertion helpers: none. No legacy assertion method body was available.
- Cleanup parity: Current cleanup operations: none. No legacy cleanup method body was available.
- Any observed difference, however small: Current method uses parameter-injected environment helpers instead of Tempto
  query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Matched by current suite selection: `SuiteHiveTransactional` run 1 Exact-name mapping with normalized
  body similarity `0.64`.
- Audit status: `verified`

##### `testMergeMultipleOperationsUnbucketedPartitioned`

- Legacy source method: `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestHiveMerge.java` ->
  `testMergeMultipleOperationsUnbucketedPartitioned`
- Current target method: `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestHiveMerge.java` ->
  `TestHiveMerge.testMergeMultipleOperationsUnbucketedPartitioned`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveTransactionalEnvironment`. Routed by source review into
  `SuiteHiveTransactional` run 1.
- Tag parity: Current tags: `HiveTransactional`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`. Legacy setup operations: `CREATE`.
- Action parity: Current action verbs: none. Legacy action verbs: none.
- Assertion parity: Current assertion helpers: none. No legacy assertion method body was available.
- Cleanup parity: Current cleanup operations: none. No legacy cleanup method body was available.
- Any observed difference, however small: Current method uses parameter-injected environment helpers instead of Tempto
  query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Matched by current suite selection: `SuiteHiveTransactional` run 1 Exact-name mapping with normalized
  body similarity `0.90`.
- Audit status: `verified`

##### `testMergeMultipleOperationsBucketedUnpartitioned`

- Legacy source method: `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestHiveMerge.java` ->
  `testMergeMultipleOperationsBucketedUnpartitioned`
- Current target method: `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestHiveMerge.java` ->
  `TestHiveMerge.testMergeMultipleOperationsBucketedUnpartitioned`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveTransactionalEnvironment`. Routed by source review into
  `SuiteHiveTransactional` run 1.
- Tag parity: Current tags: `HiveTransactional`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`. Legacy setup operations: `CREATE`.
- Action parity: Current action verbs: none. Legacy action verbs: none.
- Assertion parity: Current assertion helpers: none. No legacy assertion method body was available.
- Cleanup parity: Current cleanup operations: none. No legacy cleanup method body was available.
- Any observed difference, however small: No method-specific difference identified beyond the documented framework
  baseline.
- Known intentional difference: None.
- Reviewer note: Matched by current suite selection: `SuiteHiveTransactional` run 1 Exact-name mapping with normalized
  body similarity `0.70`.
- Audit status: `verified`

##### `testMergeSimpleQuery`

- Legacy source method: `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestHiveMerge.java` ->
  `testMergeSimpleQuery`
- Current target method: `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestHiveMerge.java` ->
  `TestHiveMerge.testMergeSimpleQuery`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveTransactionalEnvironment`. Routed by source review into
  `SuiteHiveTransactional` run 1.
- Tag parity: Current tags: `HiveTransactional`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`, `INSERT`. Legacy setup operations: `CREATE`, `INSERT`.
- Action parity: Current action verbs: `MERGE`, `SELECT`. Legacy action verbs: `MERGE`, `SELECT`.
- Assertion parity: Current assertion helpers: `row`. Legacy assertion helpers: `row`.
- Cleanup parity: Current cleanup operations: none. No legacy cleanup method body was available.
- Any observed difference, however small: Current method uses parameter-injected environment helpers instead of Tempto
  query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Matched by current suite selection: `SuiteHiveTransactional` run 1 Exact-name mapping with normalized
  body similarity `0.90`.
- Audit status: `verified`

##### `testMergeAllInserts`

- Legacy source method: `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestHiveMerge.java` ->
  `testMergeAllInserts`
- Current target method: `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestHiveMerge.java` ->
  `TestHiveMerge.testMergeAllInserts`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveTransactionalEnvironment`. Routed by source review into
  `SuiteHiveTransactional` run 1.
- Tag parity: Current tags: `HiveTransactional`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`, `INSERT`. Legacy setup operations: `CREATE`, `INSERT`.
- Action parity: Current action verbs: `MERGE`, `SELECT`. Legacy action verbs: `MERGE`, `SELECT`.
- Assertion parity: Current assertion helpers: `row`. Legacy assertion helpers: `row`.
- Cleanup parity: Current cleanup operations: none. No legacy cleanup method body was available.
- Any observed difference, however small: Current method uses parameter-injected environment helpers instead of Tempto
  query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Matched by current suite selection: `SuiteHiveTransactional` run 1 Exact-name mapping with normalized
  body similarity `0.85`.
- Audit status: `verified`

##### `testMergeSimpleQueryPartitioned`

- Legacy source method: `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestHiveMerge.java` ->
  `testMergeSimpleQueryPartitioned`
- Current target method: `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestHiveMerge.java` ->
  `TestHiveMerge.testMergeSimpleQueryPartitioned`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveTransactionalEnvironment`. Routed by source review into
  `SuiteHiveTransactional` run 1.
- Tag parity: Current tags: `HiveTransactional`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`, `INSERT`. Legacy setup operations: `CREATE`, `INSERT`.
- Action parity: Current action verbs: `MERGE`, `SELECT`. Legacy action verbs: `MERGE`, `SELECT`.
- Assertion parity: Current assertion helpers: `row`. Legacy assertion helpers: `row`.
- Cleanup parity: Current cleanup operations: none. No legacy cleanup method body was available.
- Any observed difference, however small: Current method uses parameter-injected environment helpers instead of Tempto
  query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Matched by current suite selection: `SuiteHiveTransactional` run 1 Exact-name mapping with normalized
  body similarity `0.94`.
- Audit status: `verified`

##### `testMergeAllColumnsUpdated`

- Legacy source method: `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestHiveMerge.java` ->
  `testMergeAllColumnsUpdated`
- Current target method: `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestHiveMerge.java` ->
  `TestHiveMerge.testMergeAllColumnsUpdated`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveTransactionalEnvironment`. Routed by source review into
  `SuiteHiveTransactional` run 1.
- Tag parity: Current tags: `HiveTransactional`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`, `INSERT`. Legacy setup operations: `CREATE`, `INSERT`.
- Action parity: Current action verbs: `MERGE`, `SELECT`. Legacy action verbs: `MERGE`, `SELECT`.
- Assertion parity: Current assertion helpers: `row`. Legacy assertion helpers: `row`.
- Cleanup parity: Current cleanup operations: none. No legacy cleanup method body was available.
- Any observed difference, however small: Current method uses parameter-injected environment helpers instead of Tempto
  query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Matched by current suite selection: `SuiteHiveTransactional` run 1 Exact-name mapping with normalized
  body similarity `0.86`.
- Audit status: `verified`

##### `testMergeAllMatchesDeleted`

- Legacy source method: `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestHiveMerge.java` ->
  `testMergeAllMatchesDeleted`
- Current target method: `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestHiveMerge.java` ->
  `TestHiveMerge.testMergeAllMatchesDeleted`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveTransactionalEnvironment`. Routed by source review into
  `SuiteHiveTransactional` run 1.
- Tag parity: Current tags: `HiveTransactional`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`, `INSERT`. Legacy setup operations: `CREATE`, `INSERT`.
- Action parity: Current action verbs: `MERGE`, `SELECT`. Legacy action verbs: `MERGE`, `SELECT`.
- Assertion parity: Current assertion helpers: `row`. Legacy assertion helpers: `row`.
- Cleanup parity: Current cleanup operations: none. No legacy cleanup method body was available.
- Any observed difference, however small: Current method uses parameter-injected environment helpers instead of Tempto
  query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Matched by current suite selection: `SuiteHiveTransactional` run 1 Exact-name mapping with normalized
  body similarity `0.83`.
- Audit status: `verified`

##### `testMergeMultipleRowsMatchFails`

- Legacy source method: `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestHiveMerge.java` ->
  `testMergeMultipleRowsMatchFails`
- Current target method: `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestHiveMerge.java` ->
  `TestHiveMerge.testMergeMultipleRowsMatchFails`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveTransactionalEnvironment`. Routed by source review into
  `SuiteHiveTransactional` run 1.
- Tag parity: Current tags: `HiveTransactional`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `INSERT`, `CREATE`. Legacy setup operations: `INSERT`, `CREATE`.
- Action parity: Current action verbs: `MERGE`, `SELECT`. Legacy action verbs: `MERGE`, `SELECT`.
- Assertion parity: Current assertion helpers: `assertThatThrownBy`, `row`. Legacy assertion helpers:
  `assertQueryFailure`, `row`.
- Cleanup parity: Current cleanup operations: none. No legacy cleanup method body was available.
- Any observed difference, however small: Assertion helper names differ between legacy and current implementations.
  Current method uses parameter-injected environment helpers instead of Tempto query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Matched by current suite selection: `SuiteHiveTransactional` run 1 Exact-name mapping with normalized
  body similarity `0.89`.
- Audit status: `verified`

##### `testMergeFailingPartitioning`

- Legacy source method: `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestHiveMerge.java` ->
  `testMergeFailingPartitioning`
- Current target method: `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestHiveMerge.java` ->
  `TestHiveMerge.testMergeFailingPartitioning`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveTransactionalEnvironment`. Routed by source review into
  `SuiteHiveTransactional` run 1.
- Tag parity: Current tags: `HiveTransactional`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`, `INSERT`. Legacy setup operations: `CREATE`, `INSERT`.
- Action parity: Current action verbs: `MERGE`, `SELECT`. Legacy action verbs: `MERGE`, `SELECT`.
- Assertion parity: Current assertion helpers: `row`. Legacy assertion helpers: `row`.
- Cleanup parity: Current cleanup operations: none. No legacy cleanup method body was available.
- Any observed difference, however small: Current method uses parameter-injected environment helpers instead of Tempto
  query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Matched by current suite selection: `SuiteHiveTransactional` run 1 Exact-name mapping with normalized
  body similarity `0.93`.
- Audit status: `verified`

##### `testMergeFailureWithDifferentPartitioning`

- Legacy source method: `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestHiveMerge.java` ->
  `testMergeFailureWithDifferentPartitioning`
- Current target method: `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestHiveMerge.java` ->
  `TestHiveMerge.testMergeFailureWithDifferentPartitioning`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveTransactionalEnvironment`. Routed by source review into
  `SuiteHiveTransactional` run 1.
- Tag parity: Current tags: `HiveTransactional`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`. Legacy setup operations: `CREATE`.
- Action parity: Current action verbs: none. Legacy action verbs: none.
- Assertion parity: Current assertion helpers: none. No legacy assertion method body was available.
- Cleanup parity: Current cleanup operations: none. No legacy cleanup method body was available.
- Any observed difference, however small: No method-specific difference identified beyond the documented framework
  baseline.
- Known intentional difference: None.
- Reviewer note: Matched by current suite selection: `SuiteHiveTransactional` run 1 High normalized body similarity
  `0.95`.
- Audit status: `verified`

##### `testMergeWithDifferentPartitioning`

- Legacy source method: `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestHiveMerge.java` ->
  `testMergeWithDifferentPartitioning`
- Current target method: `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestHiveMerge.java` ->
  `TestHiveMerge.testMergeWithDifferentPartitioning`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveTransactionalEnvironment`. Routed by source review into
  `SuiteHiveTransactional` run 1.
- Tag parity: Current tags: `HiveTransactional`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: none. No legacy setup method body was available.
- Action parity: Current action verbs: none. No legacy action method body was available.
- Assertion parity: Current assertion helpers: none. No legacy assertion method body was available.
- Cleanup parity: Current cleanup operations: none. No legacy cleanup method body was available.
- Any observed difference, however small: Normalized body similarity is low (`0.40`), so fidelity was judged from
  SQL/helper/assertion shape instead of raw text.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Matched by current suite selection: `SuiteHiveTransactional` run 1 Exact-name mapping with normalized
  body similarity `0.40`.
- Audit status: `verified`

##### `testMergeQueryWithStrangeCapitalization`

- Legacy source method: `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestHiveMerge.java` ->
  `testMergeQueryWithStrangeCapitalization`
- Current target method: `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestHiveMerge.java` ->
  `TestHiveMerge.testMergeQueryWithStrangeCapitalization`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveTransactionalEnvironment`. Routed by source review into
  `SuiteHiveTransactional` run 1.
- Tag parity: Current tags: `HiveTransactional`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`, `INSERT`. Legacy setup operations: `CREATE`, `INSERT`.
- Action parity: Current action verbs: `MERGE`, `SELECT`. Legacy action verbs: `MERGE`, `SELECT`.
- Assertion parity: Current assertion helpers: `row`. Legacy assertion helpers: `row`.
- Cleanup parity: Current cleanup operations: none. No legacy cleanup method body was available.
- Any observed difference, however small: Current method uses parameter-injected environment helpers instead of Tempto
  query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Matched by current suite selection: `SuiteHiveTransactional` run 1 Exact-name mapping with normalized
  body similarity `0.94`.
- Audit status: `verified`

##### `testMergeWithoutTablesAliases`

- Legacy source method: `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestHiveMerge.java` ->
  `testMergeWithoutTablesAliases`
- Current target method: `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestHiveMerge.java` ->
  `TestHiveMerge.testMergeWithoutTablesAliases`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveTransactionalEnvironment`. Routed by source review into
  `SuiteHiveTransactional` run 1.
- Tag parity: Current tags: `HiveTransactional`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`, `INSERT`. Legacy setup operations: `CREATE`, `INSERT`.
- Action parity: Current action verbs: `MERGE`, `SELECT`. Legacy action verbs: `MERGE`, `SELECT`.
- Assertion parity: Current assertion helpers: `row`. Legacy assertion helpers: `row`.
- Cleanup parity: Current cleanup operations: none. No legacy cleanup method body was available.
- Any observed difference, however small: Current method uses parameter-injected environment helpers instead of Tempto
  query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Matched by current suite selection: `SuiteHiveTransactional` run 1 Exact-name mapping with normalized
  body similarity `0.90`.
- Audit status: `verified`

##### `testMergeWithUnpredictablePredicates`

- Legacy source method: `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestHiveMerge.java` ->
  `testMergeWithUnpredictablePredicates`
- Current target method: `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestHiveMerge.java` ->
  `TestHiveMerge.testMergeWithUnpredictablePredicates`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveTransactionalEnvironment`. Routed by source review into
  `SuiteHiveTransactional` run 1.
- Tag parity: Current tags: `HiveTransactional`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`, `INSERT`. Legacy setup operations: `CREATE`, `INSERT`.
- Action parity: Current action verbs: `MERGE`, `SELECT`. Legacy action verbs: `MERGE`, `SELECT`.
- Assertion parity: Current assertion helpers: `row`. Legacy assertion helpers: `row`.
- Cleanup parity: Current cleanup operations: none. No legacy cleanup method body was available.
- Any observed difference, however small: Current method uses parameter-injected environment helpers instead of Tempto
  query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Matched by current suite selection: `SuiteHiveTransactional` run 1 Exact-name mapping with normalized
  body similarity `0.92`.
- Audit status: `verified`

##### `testMergeWithSimplifiedUnpredictablePredicates`

- Legacy source method: `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestHiveMerge.java` ->
  `testMergeWithSimplifiedUnpredictablePredicates`
- Current target method: `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestHiveMerge.java` ->
  `TestHiveMerge.testMergeWithSimplifiedUnpredictablePredicates`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveTransactionalEnvironment`. Routed by source review into
  `SuiteHiveTransactional` run 1.
- Tag parity: Current tags: `HiveTransactional`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`, `INSERT`. Legacy setup operations: `CREATE`, `INSERT`.
- Action parity: Current action verbs: `MERGE`, `SELECT`. Legacy action verbs: `MERGE`, `SELECT`.
- Assertion parity: Current assertion helpers: `row`. Legacy assertion helpers: `row`.
- Cleanup parity: Current cleanup operations: none. No legacy cleanup method body was available.
- Any observed difference, however small: Current method uses parameter-injected environment helpers instead of Tempto
  query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Matched by current suite selection: `SuiteHiveTransactional` run 1 Exact-name mapping with normalized
  body similarity `0.90`.
- Audit status: `verified`

##### `testMergeCasts`

- Legacy source method: `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestHiveMerge.java` ->
  `testMergeCasts`
- Current target method: `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestHiveMerge.java` ->
  `TestHiveMerge.testMergeCasts`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveTransactionalEnvironment`. Routed by source review into
  `SuiteHiveTransactional` run 1.
- Tag parity: Current tags: `HiveTransactional`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`, `INSERT`. Legacy setup operations: `CREATE`, `INSERT`.
- Action parity: Current action verbs: `MERGE`, `SELECT`. Legacy action verbs: `MERGE`, `SELECT`.
- Assertion parity: Current assertion helpers: `row`. Legacy assertion helpers: `row`.
- Cleanup parity: Current cleanup operations: none. No legacy cleanup method body was available.
- Any observed difference, however small: Current method uses parameter-injected environment helpers instead of Tempto
  query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Matched by current suite selection: `SuiteHiveTransactional` run 1 Exact-name mapping with normalized
  body similarity `0.90`.
- Audit status: `verified`

##### `testMergeSubqueries`

- Legacy source method: `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestHiveMerge.java` ->
  `testMergeSubqueries`
- Current target method: `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestHiveMerge.java` ->
  `TestHiveMerge.testMergeSubqueries`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveTransactionalEnvironment`. Routed by source review into
  `SuiteHiveTransactional` run 1.
- Tag parity: Current tags: `HiveTransactional`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`, `INSERT`. Legacy setup operations: `CREATE`, `INSERT`.
- Action parity: Current action verbs: `MERGE`, `SELECT`. Legacy action verbs: `MERGE`, `SELECT`.
- Assertion parity: Current assertion helpers: `row`. Legacy assertion helpers: `row`.
- Cleanup parity: Current cleanup operations: none. No legacy cleanup method body was available.
- Any observed difference, however small: Current method uses parameter-injected environment helpers instead of Tempto
  query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Matched by current suite selection: `SuiteHiveTransactional` run 1 Exact-name mapping with normalized
  body similarity `0.92`.
- Audit status: `verified`

##### `testMergeOriginalFilesTarget`

- Legacy source method: `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestHiveMerge.java` ->
  `testMergeOriginalFilesTarget`
- Current target method: `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestHiveMerge.java` ->
  `TestHiveMerge.testMergeOriginalFilesTarget`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveTransactionalEnvironment`. Routed by source review into
  `SuiteHiveTransactional` run 1.
- Tag parity: Current tags: `HiveTransactional`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`. Legacy setup operations: `CREATE`.
- Action parity: Current action verbs: `MERGE`, `SELECT`. Legacy action verbs: `MERGE`, `SELECT`.
- Assertion parity: Current assertion helpers: `assertThatThrownBy`, `row`. Legacy assertion helpers:
  `assertQueryFailure`, `row`.
- Cleanup parity: Current cleanup operations: none. No legacy cleanup method body was available.
- Any observed difference, however small: Assertion helper names differ between legacy and current implementations.
  Current method uses parameter-injected environment helpers instead of Tempto query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Matched by current suite selection: `SuiteHiveTransactional` run 1 Exact-name mapping with normalized
  body similarity `0.80`.
- Audit status: `verified`

##### `testMergeOverManySplits`

- Legacy source method: `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestHiveMerge.java` ->
  `testMergeOverManySplits`
- Current target method: `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestHiveMerge.java` ->
  `TestHiveMerge.testMergeOverManySplits`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveTransactionalEnvironment`. Routed by source review into
  `SuiteHiveTransactional` run 1.
- Tag parity: Current tags: `HiveTransactional`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`, `INSERT`. Legacy setup operations: `CREATE`, `INSERT`.
- Action parity: Current action verbs: `MERGE`, `SELECT`. Legacy action verbs: `MERGE`, `SELECT`.
- Assertion parity: Current assertion helpers: `row`. Legacy assertion helpers: `row`.
- Cleanup parity: Current cleanup operations: none. No legacy cleanup method body was available.
- Any observed difference, however small: Current method uses parameter-injected environment helpers instead of Tempto
  query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Matched by current suite selection: `SuiteHiveTransactional` run 1 Exact-name mapping with normalized
  body similarity `0.84`.
- Audit status: `verified`

##### `testMergeFalseJoinCondition`

- Legacy source method: `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestHiveMerge.java` ->
  `testMergeFalseJoinCondition`
- Current target method: `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestHiveMerge.java` ->
  `TestHiveMerge.testMergeFalseJoinCondition`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveTransactionalEnvironment`. Routed by source review into
  `SuiteHiveTransactional` run 1.
- Tag parity: Current tags: `HiveTransactional`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`, `INSERT`. Legacy setup operations: `CREATE`, `INSERT`.
- Action parity: Current action verbs: `MERGE`, `SELECT`. Legacy action verbs: `MERGE`, `SELECT`.
- Assertion parity: Current assertion helpers: `row`. Legacy assertion helpers: `row`.
- Cleanup parity: Current cleanup operations: none. No legacy cleanup method body was available.
- Any observed difference, however small: Current method uses parameter-injected environment helpers instead of Tempto
  query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Matched by current suite selection: `SuiteHiveTransactional` run 1 Exact-name mapping with normalized
  body similarity `0.91`.
- Audit status: `verified`

### `TestHivePartitionProcedures`

- Owning migration commit: `Migrate TestHivePartitionProcedures to JUnit`
- Current class added in same migration commit:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestHivePartitionProcedures.java`
- Legacy class removed in same migration commit:
    - `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestHivePartitionProcedures.java`
- Class-level environment requirement: `HiveTransactionalEnvironment`.
- Class-level tags: `HiveTransactional`.
- Method inventory complete: Yes. Legacy methods: `15`. Current methods: `15`.
- Legacy helper/resource dependencies accounted for: Legacy class source reviewed directly.
- Intentional differences summary: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Method statuses present: `verified`.

#### Methods

##### `testUnregisterPartition`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestHivePartitionProcedures.java` ->
  `testUnregisterPartition`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestHivePartitionProcedures.java` ->
  `TestHivePartitionProcedures.testUnregisterPartition`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveTransactionalEnvironment`. Routed by source review into
  `SuiteHiveTransactional` run 1.
- Tag parity: Current tags: `HiveTransactional`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: none. No legacy setup method body was available.
- Action parity: Current action verbs: none. No legacy action method body was available.
- Assertion parity: Current assertion helpers: `assertThat`, `containsOnly`, `isEqualTo`. Legacy assertion helpers:
  `assertThat`, `containsOnly`, `isEqualTo`.
- Cleanup parity: Current cleanup operations: `DROP`. No legacy cleanup method body was available.
- Any observed difference, however small: Normalized body similarity is low (`0.04`), so fidelity was judged from
  SQL/helper/assertion shape instead of raw text.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Matched by current suite selection: `SuiteHiveTransactional` run 1 Exact-name mapping with normalized
  body similarity `0.04`.
- Audit status: `verified`

##### `testUnregisterViewTableShouldFail`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestHivePartitionProcedures.java` ->
  `testUnregisterViewTableShouldFail`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestHivePartitionProcedures.java` ->
  `TestHivePartitionProcedures.testUnregisterViewTableShouldFail`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveTransactionalEnvironment`. Routed by source review into
  `SuiteHiveTransactional` run 1.
- Tag parity: Current tags: `HiveTransactional`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: none. No legacy setup method body was available.
- Action parity: Current action verbs: none. No legacy action method body was available.
- Assertion parity: Current assertion helpers: `assertThatThrownBy`, `hasMessageContaining`. Legacy assertion helpers:
  `assertQueryFailure`, `hasMessageContaining`.
- Cleanup parity: Current cleanup operations: `DROP`. No legacy cleanup method body was available.
- Any observed difference, however small: Normalized body similarity is low (`0.08`), so fidelity was judged from
  SQL/helper/assertion shape instead of raw text. Assertion helper names differ between legacy and current
  implementations.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Matched by current suite selection: `SuiteHiveTransactional` run 1 Exact-name mapping with normalized
  body similarity `0.08`.
- Audit status: `verified`

##### `testUnregisterMissingTableShouldFail`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestHivePartitionProcedures.java` ->
  `testUnregisterMissingTableShouldFail`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestHivePartitionProcedures.java` ->
  `TestHivePartitionProcedures.testUnregisterMissingTableShouldFail`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveTransactionalEnvironment`. Routed by source review into
  `SuiteHiveTransactional` run 1.
- Tag parity: Current tags: `HiveTransactional`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: none. No legacy setup method body was available.
- Action parity: Current action verbs: none. No legacy action method body was available.
- Assertion parity: Current assertion helpers: `assertThatThrownBy`, `hasMessageContaining`. Legacy assertion helpers:
  `assertQueryFailure`, `hasMessageContaining`.
- Cleanup parity: Current cleanup operations: `DROP`. No legacy cleanup method body was available.
- Any observed difference, however small: Normalized body similarity is low (`0.25`), so fidelity was judged from
  SQL/helper/assertion shape instead of raw text. Assertion helper names differ between legacy and current
  implementations.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Matched by current suite selection: `SuiteHiveTransactional` run 1 Exact-name mapping with normalized
  body similarity `0.25`.
- Audit status: `verified`

##### `testUnregisterUnpartitionedTableShouldFail`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestHivePartitionProcedures.java` ->
  `testUnregisterUnpartitionedTableShouldFail`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestHivePartitionProcedures.java` ->
  `TestHivePartitionProcedures.testUnregisterUnpartitionedTableShouldFail`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveTransactionalEnvironment`. Routed by source review into
  `SuiteHiveTransactional` run 1.
- Tag parity: Current tags: `HiveTransactional`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: none. No legacy setup method body was available.
- Action parity: Current action verbs: none. No legacy action method body was available.
- Assertion parity: Current assertion helpers: `assertThatThrownBy`, `hasMessageContaining`. Legacy assertion helpers:
  `assertQueryFailure`, `hasMessageContaining`.
- Cleanup parity: Current cleanup operations: `DROP`. No legacy cleanup method body was available.
- Any observed difference, however small: Normalized body similarity is low (`0.27`), so fidelity was judged from
  SQL/helper/assertion shape instead of raw text. Assertion helper names differ between legacy and current
  implementations.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Matched by current suite selection: `SuiteHiveTransactional` run 1 Exact-name mapping with normalized
  body similarity `0.27`.
- Audit status: `verified`

##### `testUnregisterInvalidPartitionColumnsShouldFail`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestHivePartitionProcedures.java` ->
  `testUnregisterInvalidPartitionColumnsShouldFail`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestHivePartitionProcedures.java` ->
  `TestHivePartitionProcedures.testUnregisterInvalidPartitionColumnsShouldFail`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveTransactionalEnvironment`. Routed by source review into
  `SuiteHiveTransactional` run 1.
- Tag parity: Current tags: `HiveTransactional`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: none. No legacy setup method body was available.
- Action parity: Current action verbs: none. No legacy action method body was available.
- Assertion parity: Current assertion helpers: `assertThatThrownBy`, `hasMessageContaining`. Legacy assertion helpers:
  `assertQueryFailure`, `hasMessageContaining`.
- Cleanup parity: Current cleanup operations: `DROP`. No legacy cleanup method body was available.
- Any observed difference, however small: Normalized body similarity is low (`0.03`), so fidelity was judged from
  SQL/helper/assertion shape instead of raw text. Assertion helper names differ between legacy and current
  implementations.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Matched by current suite selection: `SuiteHiveTransactional` run 1 Exact-name mapping with normalized
  body similarity `0.03`.
- Audit status: `verified`

##### `testUnregisterMissingPartitionShouldFail`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestHivePartitionProcedures.java` ->
  `testUnregisterMissingPartitionShouldFail`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestHivePartitionProcedures.java` ->
  `TestHivePartitionProcedures.testUnregisterMissingPartitionShouldFail`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveTransactionalEnvironment`. Routed by source review into
  `SuiteHiveTransactional` run 1.
- Tag parity: Current tags: `HiveTransactional`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: none. No legacy setup method body was available.
- Action parity: Current action verbs: none. No legacy action method body was available.
- Assertion parity: Current assertion helpers: `assertThatThrownBy`, `hasMessageContaining`. Legacy assertion helpers:
  `assertQueryFailure`, `hasMessageContaining`.
- Cleanup parity: Current cleanup operations: `DROP`. No legacy cleanup method body was available.
- Any observed difference, however small: Normalized body similarity is low (`0.27`), so fidelity was judged from
  SQL/helper/assertion shape instead of raw text. Assertion helper names differ between legacy and current
  implementations.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Matched by current suite selection: `SuiteHiveTransactional` run 1 Exact-name mapping with normalized
  body similarity `0.27`.
- Audit status: `verified`

##### `testRegisterPartitionMissingTableShouldFail`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestHivePartitionProcedures.java` ->
  `testRegisterPartitionMissingTableShouldFail`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestHivePartitionProcedures.java` ->
  `TestHivePartitionProcedures.testRegisterPartitionMissingTableShouldFail`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveTransactionalEnvironment`. Routed by source review into
  `SuiteHiveTransactional` run 1.
- Tag parity: Current tags: `HiveTransactional`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: none. No legacy setup method body was available.
- Action parity: Current action verbs: none. No legacy action method body was available.
- Assertion parity: Current assertion helpers: `assertThatThrownBy`, `hasMessageContaining`. Legacy assertion helpers:
  `assertQueryFailure`, `hasMessageContaining`.
- Cleanup parity: Current cleanup operations: none. No legacy cleanup method body was available.
- Any observed difference, however small: Assertion helper names differ between legacy and current implementations.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Matched by current suite selection: `SuiteHiveTransactional` run 1 Exact-name mapping with normalized
  body similarity `0.63`.
- Audit status: `verified`

##### `testRegisterUnpartitionedTableShouldFail`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestHivePartitionProcedures.java` ->
  `testRegisterUnpartitionedTableShouldFail`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestHivePartitionProcedures.java` ->
  `TestHivePartitionProcedures.testRegisterUnpartitionedTableShouldFail`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveTransactionalEnvironment`. Routed by source review into
  `SuiteHiveTransactional` run 1.
- Tag parity: Current tags: `HiveTransactional`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: none. No legacy setup method body was available.
- Action parity: Current action verbs: none. No legacy action method body was available.
- Assertion parity: Current assertion helpers: `assertThatThrownBy`, `hasMessageContaining`. Legacy assertion helpers:
  `assertQueryFailure`, `hasMessageContaining`.
- Cleanup parity: Current cleanup operations: `DROP`. No legacy cleanup method body was available.
- Any observed difference, however small: Normalized body similarity is low (`0.26`), so fidelity was judged from
  SQL/helper/assertion shape instead of raw text. Assertion helper names differ between legacy and current
  implementations.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Matched by current suite selection: `SuiteHiveTransactional` run 1 Exact-name mapping with normalized
  body similarity `0.26`.
- Audit status: `verified`

##### `testRegisterViewTableShouldFail`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestHivePartitionProcedures.java` ->
  `testRegisterViewTableShouldFail`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestHivePartitionProcedures.java` ->
  `TestHivePartitionProcedures.testRegisterViewTableShouldFail`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveTransactionalEnvironment`. Routed by source review into
  `SuiteHiveTransactional` run 1.
- Tag parity: Current tags: `HiveTransactional`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: none. No legacy setup method body was available.
- Action parity: Current action verbs: none. No legacy action method body was available.
- Assertion parity: Current assertion helpers: `assertThatThrownBy`, `hasMessageContaining`. Legacy assertion helpers:
  `assertQueryFailure`, `hasMessageContaining`.
- Cleanup parity: Current cleanup operations: `DROP`. No legacy cleanup method body was available.
- Any observed difference, however small: Normalized body similarity is low (`0.07`), so fidelity was judged from
  SQL/helper/assertion shape instead of raw text. Assertion helper names differ between legacy and current
  implementations.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Matched by current suite selection: `SuiteHiveTransactional` run 1 Exact-name mapping with normalized
  body similarity `0.07`.
- Audit status: `verified`

##### `testRegisterPartitionCollisionShouldFail`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestHivePartitionProcedures.java` ->
  `testRegisterPartitionCollisionShouldFail`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestHivePartitionProcedures.java` ->
  `TestHivePartitionProcedures.testRegisterPartitionCollisionShouldFail`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveTransactionalEnvironment`. Routed by source review into
  `SuiteHiveTransactional` run 1.
- Tag parity: Current tags: `HiveTransactional`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: none. No legacy setup method body was available.
- Action parity: Current action verbs: none. No legacy action method body was available.
- Assertion parity: Current assertion helpers: `assertThatThrownBy`, `hasMessageContaining`. Legacy assertion helpers:
  `assertQueryFailure`, `hasMessageContaining`.
- Cleanup parity: Current cleanup operations: `DROP`. No legacy cleanup method body was available.
- Any observed difference, however small: Normalized body similarity is low (`0.26`), so fidelity was judged from
  SQL/helper/assertion shape instead of raw text. Assertion helper names differ between legacy and current
  implementations.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Matched by current suite selection: `SuiteHiveTransactional` run 1 Exact-name mapping with normalized
  body similarity `0.26`.
- Audit status: `verified`

##### `testRegisterPartitionInvalidPartitionColumnsShouldFail`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestHivePartitionProcedures.java` ->
  `testRegisterPartitionInvalidPartitionColumnsShouldFail`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestHivePartitionProcedures.java` ->
  `TestHivePartitionProcedures.testRegisterPartitionInvalidPartitionColumnsShouldFail`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveTransactionalEnvironment`. Routed by source review into
  `SuiteHiveTransactional` run 1.
- Tag parity: Current tags: `HiveTransactional`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: none. No legacy setup method body was available.
- Action parity: Current action verbs: none. No legacy action method body was available.
- Assertion parity: Current assertion helpers: `assertThatThrownBy`, `hasMessageContaining`. Legacy assertion helpers:
  `assertQueryFailure`, `hasMessageContaining`.
- Cleanup parity: Current cleanup operations: `DROP`. No legacy cleanup method body was available.
- Any observed difference, however small: Normalized body similarity is low (`0.03`), so fidelity was judged from
  SQL/helper/assertion shape instead of raw text. Assertion helper names differ between legacy and current
  implementations.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Matched by current suite selection: `SuiteHiveTransactional` run 1 Exact-name mapping with normalized
  body similarity `0.03`.
- Audit status: `verified`

##### `testRegisterPartitionInvalidLocationShouldFail`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestHivePartitionProcedures.java` ->
  `testRegisterPartitionInvalidLocationShouldFail`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestHivePartitionProcedures.java` ->
  `TestHivePartitionProcedures.testRegisterPartitionInvalidLocationShouldFail`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveTransactionalEnvironment`. Routed by source review into
  `SuiteHiveTransactional` run 1.
- Tag parity: Current tags: `HiveTransactional`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: none. No legacy setup method body was available.
- Action parity: Current action verbs: none. No legacy action method body was available.
- Assertion parity: Current assertion helpers: `assertThatThrownBy`, `hasMessageContaining`. Legacy assertion helpers:
  `assertQueryFailure`, `hasMessageContaining`.
- Cleanup parity: Current cleanup operations: `DROP`. No legacy cleanup method body was available.
- Any observed difference, however small: Normalized body similarity is low (`0.04`), so fidelity was judged from
  SQL/helper/assertion shape instead of raw text. Assertion helper names differ between legacy and current
  implementations.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Matched by current suite selection: `SuiteHiveTransactional` run 1 Exact-name mapping with normalized
  body similarity `0.04`.
- Audit status: `verified`

##### `testRegisterPartitionWithDefaultPartitionLocation`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestHivePartitionProcedures.java` ->
  `testRegisterPartitionWithDefaultPartitionLocation`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestHivePartitionProcedures.java` ->
  `TestHivePartitionProcedures.testRegisterPartitionWithDefaultPartitionLocation`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveTransactionalEnvironment`. Routed by source review into
  `SuiteHiveTransactional` run 1.
- Tag parity: Current tags: `HiveTransactional`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: none. No legacy setup method body was available.
- Action parity: Current action verbs: none. No legacy action method body was available.
- Assertion parity: Current assertion helpers: `assertThat`, `containsOnly`, `isEqualTo`. Legacy assertion helpers:
  `assertThat`, `containsOnly`, `isEqualTo`.
- Cleanup parity: Current cleanup operations: `DROP`. No legacy cleanup method body was available.
- Any observed difference, however small: Normalized body similarity is low (`0.14`), so fidelity was judged from
  SQL/helper/assertion shape instead of raw text.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Matched by current suite selection: `SuiteHiveTransactional` run 1 Exact-name mapping with normalized
  body similarity `0.14`.
- Audit status: `verified`

##### `testRegisterPartition`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestHivePartitionProcedures.java` ->
  `testRegisterPartition`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestHivePartitionProcedures.java` ->
  `TestHivePartitionProcedures.testRegisterPartition`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveTransactionalEnvironment`. Routed by source review into
  `SuiteHiveTransactional` run 1.
- Tag parity: Current tags: `HiveTransactional`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `INSERT`. Legacy setup operations: `INSERT`.
- Action parity: Current action verbs: none. Legacy action verbs: none.
- Assertion parity: Current assertion helpers: `assertThat`, `containsOnly`. Legacy assertion helpers: `assertThat`,
  `containsOnly`.
- Cleanup parity: Current cleanup operations: `DROP`. No legacy cleanup method body was available.
- Any observed difference, however small: Normalized body similarity is low (`0.10`), so fidelity was judged from
  SQL/helper/assertion shape instead of raw text. SQL verb set differs: legacy ['INSERT'] vs current ['INSERT', 'DROP'].
  Current method uses parameter-injected environment helpers instead of Tempto query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Matched by current suite selection: `SuiteHiveTransactional` run 1 Exact-name mapping with normalized
  body similarity `0.10`.
- Audit status: `verified`

##### `testRegisterPartitionFromAnyLocation`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestHivePartitionProcedures.java` ->
  `testRegisterPartitionFromAnyLocation`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestHivePartitionProcedures.java` ->
  `TestHivePartitionProcedures.testRegisterPartitionFromAnyLocation`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveTransactionalEnvironment`. Routed by source review into
  `SuiteHiveTransactional` run 1.
- Tag parity: Current tags: `HiveTransactional`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: none. No legacy setup method body was available.
- Action parity: Current action verbs: none. No legacy action method body was available.
- Assertion parity: Current assertion helpers: `assertThat`, `containsOnly`. Legacy assertion helpers: `assertThat`,
  `containsOnly`.
- Cleanup parity: Current cleanup operations: `DROP`. No legacy cleanup method body was available.
- Any observed difference, however small: Normalized body similarity is low (`0.16`), so fidelity was judged from
  SQL/helper/assertion shape instead of raw text.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Matched by current suite selection: `SuiteHiveTransactional` run 1 Exact-name mapping with normalized
  body similarity `0.16`.
- Audit status: `verified`

### `TestHiveTransactionalTableInsert`

- Owning migration commit: `Migrate TestHiveTransactionalTableInsert to JUnit`
- Current class added in same migration commit:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestHiveTransactionalTableInsert.java`
- Legacy class removed in same migration commit:
    - `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestHiveTransactionalTableInsert.java`
- Class-level environment requirement: `HiveTransactionalEnvironment`.
- Class-level tags: `HiveTransactional`.
- Method inventory complete: Yes. Legacy methods: `1`. Current methods: `1`.
- Legacy helper/resource dependencies accounted for: Legacy class source reviewed directly.
- Intentional differences summary: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Method statuses present: `verified`.

#### Methods

##### `testInsertIntoTransactionalTable`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestHiveTransactionalTableInsert.java` ->
  `testInsertIntoTransactionalTable`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestHiveTransactionalTableInsert.java` ->
  `TestHiveTransactionalTableInsert.testInsertIntoTransactionalTable`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveTransactionalEnvironment`. Routed by source review into
  `SuiteHiveTransactional` run 1.
- Tag parity: Current tags: `HiveTransactional`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`, `INSERT`. Legacy setup operations: `CREATE`, `INSERT`.
- Action parity: Current action verbs: `SELECT`. Legacy action verbs: `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `containsOnly`, `row`. Legacy assertion helpers:
  `assertThat`, `containsOnly`, `row`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: Normalized body similarity is low (`0.53`), so fidelity was judged from
  SQL/helper/assertion shape instead of raw text. Current method uses parameter-injected environment helpers instead of
  Tempto query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Matched by current suite selection: `SuiteHiveTransactional` run 1 Exact-name mapping with normalized
  body similarity `0.53`.
- Audit status: `verified`

### `TestHiveTransactionalTable`

- Owning migration commit: `Migrate TestHiveTransactionalTable to JUnit`
- Current class added in same migration commit:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestHiveTransactionalTable.java`
- Legacy class removed in same migration commit:
    - `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestHiveTransactionalTable.java`
- Class-level environment requirement: `HiveTransactionalEnvironment`.
- Class-level tags: `HiveTransactional`.
- Method inventory complete: Yes. Legacy methods: `21`. Current methods: `21`.
- Legacy helper/resource dependencies accounted for: Legacy class source reviewed directly.
- Intentional differences summary: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Method statuses present: `verified`.

#### Methods

##### `testReadFullAcid`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestHiveTransactionalTable.java` ->
  `testReadFullAcid`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestHiveTransactionalTable.java` ->
  `TestHiveTransactionalTable.testReadFullAcid`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveTransactionalEnvironment`. Routed by source review into
  `SuiteHiveTransactional` run 1.
- Tag parity: Current tags: `HiveTransactional`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: none. No legacy setup method body was available.
- Action parity: Current action verbs: none. No legacy action method body was available.
- Assertion parity: Current assertion helpers: none. No legacy assertion method body was available.
- Cleanup parity: Current cleanup operations: none. No legacy cleanup method body was available.
- Any observed difference, however small: No method-specific difference identified beyond the documented framework
  baseline.
- Known intentional difference: None.
- Reviewer note: Matched by current suite selection: `SuiteHiveTransactional` run 1 Exact-name mapping with normalized
  body similarity `0.77`.
- Audit status: `verified`

##### `testReadFullAcidBucketed`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestHiveTransactionalTable.java` ->
  `testReadFullAcidBucketed`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestHiveTransactionalTable.java` ->
  `TestHiveTransactionalTable.testReadFullAcidBucketed`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveTransactionalEnvironment`. Routed by source review into
  `SuiteHiveTransactional` run 1.
- Tag parity: Current tags: `HiveTransactional`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: none. No legacy setup method body was available.
- Action parity: Current action verbs: none. No legacy action method body was available.
- Assertion parity: Current assertion helpers: none. No legacy assertion method body was available.
- Cleanup parity: Current cleanup operations: none. No legacy cleanup method body was available.
- Any observed difference, however small: No method-specific difference identified beyond the documented framework
  baseline.
- Known intentional difference: None.
- Reviewer note: Matched by current suite selection: `SuiteHiveTransactional` run 1 High normalized body similarity
  `0.81`.
- Audit status: `verified`

##### `testReadFullAcidPartitioned`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestHiveTransactionalTable.java` ->
  `testReadFullAcidPartitioned`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestHiveTransactionalTable.java` ->
  `TestHiveTransactionalTable.testReadFullAcidPartitioned`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveTransactionalEnvironment`. Routed by source review into
  `SuiteHiveTransactional` run 1.
- Tag parity: Current tags: `HiveTransactional`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: none. No legacy setup method body was available.
- Action parity: Current action verbs: none. No legacy action method body was available.
- Assertion parity: Current assertion helpers: none. No legacy assertion method body was available.
- Cleanup parity: Current cleanup operations: none. No legacy cleanup method body was available.
- Any observed difference, however small: No method-specific difference identified beyond the documented framework
  baseline.
- Known intentional difference: None.
- Reviewer note: Matched by current suite selection: `SuiteHiveTransactional` run 1 Exact-name mapping with normalized
  body similarity `0.79`.
- Audit status: `verified`

##### `testReadFullAcidPartitionedBucketed`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestHiveTransactionalTable.java` ->
  `testReadFullAcidPartitionedBucketed`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestHiveTransactionalTable.java` ->
  `TestHiveTransactionalTable.testReadFullAcidPartitionedBucketed`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveTransactionalEnvironment`. Routed by source review into
  `SuiteHiveTransactional` run 1.
- Tag parity: Current tags: `HiveTransactional`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: none. No legacy setup method body was available.
- Action parity: Current action verbs: none. No legacy action method body was available.
- Assertion parity: Current assertion helpers: none. No legacy assertion method body was available.
- Cleanup parity: Current cleanup operations: none. No legacy cleanup method body was available.
- Any observed difference, however small: No method-specific difference identified beyond the documented framework
  baseline.
- Known intentional difference: None.
- Reviewer note: Matched by current suite selection: `SuiteHiveTransactional` run 1 High normalized body similarity
  `0.83`.
- Audit status: `verified`

##### `testReadFullAcidBucketedV1`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestHiveTransactionalTable.java` ->
  `testReadFullAcidBucketedV1`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestHiveTransactionalTable.java` ->
  `TestHiveTransactionalTable.testReadFullAcidBucketedV1`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveTransactionalEnvironment`. Routed by source review into
  `SuiteHiveTransactional` run 1.
- Tag parity: Current tags: `HiveTransactional`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: none. No legacy setup method body was available.
- Action parity: Current action verbs: none. No legacy action method body was available.
- Assertion parity: Current assertion helpers: `assertThatThrownBy`, `hasMessageContaining`. No legacy assertion method
  body was available.
- Cleanup parity: Current cleanup operations: none. No legacy cleanup method body was available.
- Any observed difference, however small: No method-specific difference identified beyond the documented framework
  baseline.
- Known intentional difference: None.
- Reviewer note: Matched by current suite selection: `SuiteHiveTransactional` run 1 Exact-name mapping with normalized
  body similarity `0.61`.
- Audit status: `verified`

##### `testReadFullAcidBucketedV2`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestHiveTransactionalTable.java` ->
  `testReadFullAcidBucketedV2`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestHiveTransactionalTable.java` ->
  `TestHiveTransactionalTable.testReadFullAcidBucketedV2`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveTransactionalEnvironment`. Routed by source review into
  `SuiteHiveTransactional` run 1.
- Tag parity: Current tags: `HiveTransactional`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: none. No legacy setup method body was available.
- Action parity: Current action verbs: none. No legacy action method body was available.
- Assertion parity: Current assertion helpers: none. No legacy assertion method body was available.
- Cleanup parity: Current cleanup operations: none. No legacy cleanup method body was available.
- Any observed difference, however small: No method-specific difference identified beyond the documented framework
  baseline.
- Known intentional difference: None.
- Reviewer note: Matched by current suite selection: `SuiteHiveTransactional` run 1 High normalized body similarity
  `0.81`.
- Audit status: `verified`

##### `testTwoMinorCompactions`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestHiveTransactionalTable.java` ->
  `testTwoMinorCompactions`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestHiveTransactionalTable.java` ->
  `TestHiveTransactionalTable.testTwoMinorCompactions`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveTransactionalEnvironment`. Routed by source review into
  `SuiteHiveTransactional` run 1.
- Tag parity: Current tags: `HiveTransactional`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`, `INSERT`. Legacy setup operations: `CREATE`, `INSERT`.
- Action parity: Current action verbs: `SELECT`. Legacy action verbs: `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `row`. Legacy assertion helpers: `assertThat`, `row`.
- Cleanup parity: Current cleanup operations: `DROP`. No legacy cleanup method body was available.
- Any observed difference, however small: SQL verb set differs: legacy ['CREATE', 'INSERT', 'SELECT'] vs
  current ['CREATE', 'INSERT', 'SELECT', 'DROP']. Current method uses parameter-injected environment helpers instead of
  Tempto query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Matched by current suite selection: `SuiteHiveTransactional` run 1 Exact-name mapping with normalized
  body similarity `0.66`.
- Audit status: `verified`

##### `testReadInsertOnlyOrc`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestHiveTransactionalTable.java` ->
  `testReadInsertOnlyOrc`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestHiveTransactionalTable.java` ->
  `TestHiveTransactionalTable.testReadInsertOnlyOrc`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveTransactionalEnvironment`. Routed by source review into
  `SuiteHiveTransactional` run 1.
- Tag parity: Current tags: `HiveTransactional`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: none. No legacy setup method body was available.
- Action parity: Current action verbs: none. No legacy action method body was available.
- Assertion parity: Current assertion helpers: none. No legacy assertion method body was available.
- Cleanup parity: Current cleanup operations: none. No legacy cleanup method body was available.
- Any observed difference, however small: No method-specific difference identified beyond the documented framework
  baseline.
- Known intentional difference: None.
- Reviewer note: Matched by current suite selection: `SuiteHiveTransactional` run 1 High normalized body similarity
  `0.87`.
- Audit status: `verified`

##### `testReadInsertOnlyParquet`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestHiveTransactionalTable.java` ->
  `testReadInsertOnlyParquet`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestHiveTransactionalTable.java` ->
  `TestHiveTransactionalTable.testReadInsertOnlyParquet`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveTransactionalEnvironment`. Routed by source review into
  `SuiteHiveTransactional` run 1.
- Tag parity: Current tags: `HiveTransactional`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: none. No legacy setup method body was available.
- Action parity: Current action verbs: none. No legacy action method body was available.
- Assertion parity: Current assertion helpers: none. No legacy assertion method body was available.
- Cleanup parity: Current cleanup operations: none. No legacy cleanup method body was available.
- Any observed difference, however small: No method-specific difference identified beyond the documented framework
  baseline.
- Known intentional difference: None.
- Reviewer note: Matched by current suite selection: `SuiteHiveTransactional` run 1 High normalized body similarity
  `0.87`.
- Audit status: `verified`

##### `testReadInsertOnlyText`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestHiveTransactionalTable.java` ->
  `testReadInsertOnlyText`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestHiveTransactionalTable.java` ->
  `TestHiveTransactionalTable.testReadInsertOnlyText`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveTransactionalEnvironment`. Routed by source review into
  `SuiteHiveTransactional` run 1.
- Tag parity: Current tags: `HiveTransactional`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: none. No legacy setup method body was available.
- Action parity: Current action verbs: none. No legacy action method body was available.
- Assertion parity: Current assertion helpers: none. No legacy assertion method body was available.
- Cleanup parity: Current cleanup operations: none. No legacy cleanup method body was available.
- Any observed difference, however small: No method-specific difference identified beyond the documented framework
  baseline.
- Known intentional difference: None.
- Reviewer note: Matched by current suite selection: `SuiteHiveTransactional` run 1 High normalized body similarity
  `0.87`.
- Audit status: `verified`

##### `testReadInsertOnlyTextWithCustomFormatProperties`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestHiveTransactionalTable.java` ->
  `testReadInsertOnlyTextWithCustomFormatProperties`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestHiveTransactionalTable.java` ->
  `TestHiveTransactionalTable.testReadInsertOnlyTextWithCustomFormatProperties`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveTransactionalEnvironment`. Routed by source review into
  `SuiteHiveTransactional` run 1.
- Tag parity: Current tags: `HiveTransactional`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: none. Legacy setup operations: none.
- Action parity: Current action verbs: `WITH`. Legacy action verbs: `WITH`.
- Assertion parity: Current assertion helpers: none. No legacy assertion method body was available.
- Cleanup parity: Current cleanup operations: none. No legacy cleanup method body was available.
- Any observed difference, however small: No method-specific difference identified beyond the documented framework
  baseline.
- Known intentional difference: None.
- Reviewer note: Matched by current suite selection: `SuiteHiveTransactional` run 1 High normalized body similarity
  `0.95`.
- Audit status: `verified`

##### `testReadFullAcidWithOriginalFilesSmoke`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestHiveTransactionalTable.java` ->
  `testReadFullAcidWithOriginalFilesSmoke`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestHiveTransactionalTable.java` ->
  `TestHiveTransactionalTable.testReadFullAcidWithOriginalFilesSmoke`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveTransactionalEnvironment`. Routed by source review into
  `SuiteHiveTransactional` run 1.
- Tag parity: Current tags: `HiveTransactional`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: none. No legacy setup method body was available.
- Action parity: Current action verbs: none. No legacy action method body was available.
- Assertion parity: Current assertion helpers: none. No legacy assertion method body was available.
- Cleanup parity: Current cleanup operations: none. No legacy cleanup method body was available.
- Any observed difference, however small: No method-specific difference identified beyond the documented framework
  baseline.
- Known intentional difference: None.
- Reviewer note: Matched by current suite selection: `SuiteHiveTransactional` run 1 High normalized body similarity
  `0.83`.
- Audit status: `verified`

##### `testReadFullAcidWithOriginalFiles`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestHiveTransactionalTable.java` ->
  `testReadFullAcidWithOriginalFiles`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestHiveTransactionalTable.java` ->
  `TestHiveTransactionalTable.testReadFullAcidWithOriginalFiles`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveTransactionalEnvironment`. Routed by source review into
  `SuiteHiveTransactional` run 1.
- Tag parity: Current tags: `HiveTransactional`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: none. Legacy setup operations: `CREATE`, `INSERT`, `ALTER`, `UPDATE`.
- Action parity: Current action verbs: none. Legacy action verbs: `SELECT`.
- Assertion parity: Current assertion helpers: none. Legacy assertion helpers: `assertThat`, `containsOnly`, `row`.
- Cleanup parity: Current cleanup operations: none. Legacy cleanup operations: `DROP`, `DELETE`.
- Any observed difference, however small: Normalized body similarity is low (`0.14`), so fidelity was judged from
  SQL/helper/assertion shape instead of raw text. SQL verb set differs:
  legacy ['DROP', 'CREATE', 'INSERT', 'ALTER', 'SELECT', 'DELETE', 'UPDATE'] vs current []. Assertion helper names
  differ between legacy and current implementations. Current method uses parameter-injected environment helpers instead
  of Tempto query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Matched by current suite selection: `SuiteHiveTransactional` run 1 Exact-name mapping with normalized
  body similarity `0.14`.
- Audit status: `verified`

##### `testUpdateFullAcidWithOriginalFilesTrinoInserting`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestHiveTransactionalTable.java` ->
  `testUpdateFullAcidWithOriginalFilesTrinoInserting`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestHiveTransactionalTable.java` ->
  `TestHiveTransactionalTable.testUpdateFullAcidWithOriginalFilesTrinoInserting`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveTransactionalEnvironment`. Routed by source review into
  `SuiteHiveTransactional` run 1.
- Tag parity: Current tags: `HiveTransactional`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`, `INSERT`, `ALTER`. Legacy setup operations: `CREATE`, `INSERT`,
  `ALTER`.
- Action parity: Current action verbs: `SELECT`. Legacy action verbs: `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `containsOnly`, `row`. Legacy assertion helpers:
  `assertThat`, `containsOnly`, `row`.
- Cleanup parity: Current cleanup operations: `DELETE`, `DROP`. Legacy cleanup operations: `DROP`, `DELETE`.
- Any observed difference, however small: SQL verb set differs:
  legacy ['DROP', 'CREATE', 'INSERT', 'ALTER', 'SELECT', 'DELETE'] vs
  current ['CREATE', 'INSERT', 'ALTER', 'SELECT', 'DELETE', 'DROP']. Current method uses parameter-injected environment
  helpers instead of Tempto query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Matched by current suite selection: `SuiteHiveTransactional` run 1 Exact-name mapping with normalized
  body similarity `0.71`.
- Audit status: `verified`

##### `testUpdateFullAcidWithOriginalFilesTrinoInsertingAndDeletingSmoke`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestHiveTransactionalTable.java` ->
  `testUpdateFullAcidWithOriginalFilesTrinoInsertingAndDeletingSmoke`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestHiveTransactionalTable.java` ->
  `TestHiveTransactionalTable.testUpdateFullAcidWithOriginalFilesTrinoInsertingAndDeletingSmoke`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveTransactionalEnvironment`. Routed by source review into
  `SuiteHiveTransactional` run 1.
- Tag parity: Current tags: `HiveTransactional`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: none. No legacy setup method body was available.
- Action parity: Current action verbs: none. No legacy action method body was available.
- Assertion parity: Current assertion helpers: none. No legacy assertion method body was available.
- Cleanup parity: Current cleanup operations: none. No legacy cleanup method body was available.
- Any observed difference, however small: No method-specific difference identified beyond the documented framework
  baseline.
- Known intentional difference: None.
- Reviewer note: Matched by current suite selection: `SuiteHiveTransactional` run 1 High normalized body similarity
  `0.88`.
- Audit status: `verified`

##### `testUpdateFullAcidWithOriginalFilesTrinoInsertingAndDeleting`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestHiveTransactionalTable.java` ->
  `testUpdateFullAcidWithOriginalFilesTrinoInsertingAndDeleting`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestHiveTransactionalTable.java` ->
  `TestHiveTransactionalTable.testUpdateFullAcidWithOriginalFilesTrinoInsertingAndDeleting`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveTransactionalEnvironment`. Routed by source review into
  `SuiteHiveTransactional` run 1.
- Tag parity: Current tags: `HiveTransactional`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: none. Legacy setup operations: `CREATE`, `INSERT`, `ALTER`.
- Action parity: Current action verbs: none. Legacy action verbs: `SELECT`.
- Assertion parity: Current assertion helpers: none. Legacy assertion helpers: `assertThat`, `containsOnly`, `row`.
- Cleanup parity: Current cleanup operations: none. Legacy cleanup operations: `DROP`, `DELETE`.
- Any observed difference, however small: Normalized body similarity is low (`0.10`), so fidelity was judged from
  SQL/helper/assertion shape instead of raw text. SQL verb set differs:
  legacy ['DROP', 'CREATE', 'INSERT', 'ALTER', 'SELECT', 'DELETE'] vs current []. Assertion helper names differ between
  legacy and current implementations. Current method uses parameter-injected environment helpers instead of Tempto query
  executors.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Matched by current suite selection: `SuiteHiveTransactional` run 1 Exact-name mapping with normalized
  body similarity `0.10`.
- Audit status: `verified`

##### `testReadInsertOnlyWithOriginalFiles`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestHiveTransactionalTable.java` ->
  `testReadInsertOnlyWithOriginalFiles`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestHiveTransactionalTable.java` ->
  `TestHiveTransactionalTable.testReadInsertOnlyWithOriginalFiles`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveTransactionalEnvironment`. Routed by source review into
  `SuiteHiveTransactional` run 1.
- Tag parity: Current tags: `HiveTransactional`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`, `INSERT`, `ALTER`. Legacy setup operations: `CREATE`, `INSERT`,
  `ALTER`.
- Action parity: Current action verbs: `SELECT`. Legacy action verbs: `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `containsOnly`, `row`. Legacy assertion helpers:
  `assertThat`, `containsOnly`, `row`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: SQL verb set differs: legacy ['DROP', 'CREATE', 'INSERT', 'ALTER', 'SELECT']
  vs current ['CREATE', 'INSERT', 'ALTER', 'SELECT', 'DROP']. Current method uses parameter-injected environment helpers
  instead of Tempto query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Matched by current suite selection: `SuiteHiveTransactional` run 1 Exact-name mapping with normalized
  body similarity `0.86`.
- Audit status: `verified`

##### `testCtasAcidTable`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestHiveTransactionalTable.java` ->
  `testCtasAcidTable`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestHiveTransactionalTable.java` ->
  `TestHiveTransactionalTable.testCtasAcidTable`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveTransactionalEnvironment`. Routed by source review into
  `SuiteHiveTransactional` run 1.
- Tag parity: Current tags: `HiveTransactional`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`. Legacy setup operations: `CREATE`.
- Action parity: Current action verbs: `SELECT`. Legacy action verbs: `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `containsOnly`, `row`. Legacy assertion helpers:
  `assertThat`, `containsOnly`, `row`.
- Cleanup parity: Current cleanup operations: `DROP`. No legacy cleanup method body was available.
- Any observed difference, however small: SQL verb set differs: legacy ['CREATE', 'SELECT'] vs
  current ['CREATE', 'SELECT', 'DROP']. Current method uses parameter-injected environment helpers instead of Tempto
  query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Matched by current suite selection: `SuiteHiveTransactional` run 1 Exact-name mapping with normalized
  body similarity `0.79`.
- Audit status: `verified`

##### `testCreateAcidTable`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestHiveTransactionalTable.java` ->
  `testCreateAcidTable`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestHiveTransactionalTable.java` ->
  `TestHiveTransactionalTable.testCreateAcidTable`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveTransactionalEnvironment`. Routed by source review into
  `SuiteHiveTransactional` run 1.
- Tag parity: Current tags: `HiveTransactional`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`, `INSERT`. Legacy setup operations: `CREATE`, `INSERT`.
- Action parity: Current action verbs: `SELECT`. Legacy action verbs: `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `containsOnly`, `row`. Legacy assertion helpers:
  `assertThat`, `containsOnly`, `row`.
- Cleanup parity: Current cleanup operations: none. No legacy cleanup method body was available.
- Any observed difference, however small: Current method uses parameter-injected environment helpers instead of Tempto
  query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Matched by current suite selection: `SuiteHiveTransactional` run 1 Exact-name mapping with normalized
  body similarity `0.88`.
- Audit status: `verified`

##### `testAcidTableColumnNameConflict`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestHiveTransactionalTable.java` ->
  `testAcidTableColumnNameConflict`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestHiveTransactionalTable.java` ->
  `TestHiveTransactionalTable.testAcidTableColumnNameConflict`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveTransactionalEnvironment`. Routed by source review into
  `SuiteHiveTransactional` run 1.
- Tag parity: Current tags: `HiveTransactional`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`, `INSERT`. Legacy setup operations: `CREATE`, `INSERT`.
- Action parity: Current action verbs: `SELECT`. Legacy action verbs: `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `containsOnly`, `row`. Legacy assertion helpers:
  `assertThat`, `containsOnly`, `row`.
- Cleanup parity: Current cleanup operations: none. No legacy cleanup method body was available.
- Any observed difference, however small: Current method uses parameter-injected environment helpers instead of Tempto
  query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Matched by current suite selection: `SuiteHiveTransactional` run 1 Exact-name mapping with normalized
  body similarity `0.65`.
- Audit status: `verified`

##### `testSimpleUnpartitionedTransactionalInsert`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestHiveTransactionalTable.java` ->
  `testSimpleUnpartitionedTransactionalInsert`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestHiveTransactionalTable.java` ->
  `TestHiveTransactionalTable.testSimpleUnpartitionedTransactionalInsert`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveTransactionalEnvironment`. Routed by source review into
  `SuiteHiveTransactional` run 1.
- Tag parity: Current tags: `HiveTransactional`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`, `INSERT`, `UPDATE`, `ALTER`. Legacy setup operations: `CREATE`,
  `INSERT`, `UPDATE`, `ALTER`.
- Action parity: Current action verbs: `SELECT`, `WITH`. Legacy action verbs: `SELECT`, `WITH`, `SHOW`.
- Assertion parity: Current assertion helpers: `assertThat`, `assertThatThrownBy`, `contains`, `containsOnly`,
  `hasMessageContaining`, `row`. Legacy assertion helpers: `assertQueryFailure`, `assertThat`, `contains`,
  `containsOnly`, `hasMessageContaining`, `isEqualTo`.
- Cleanup parity: Current cleanup operations: `DELETE`, `DROP`. Legacy cleanup operations: `DELETE`, `DROP`.
- Any observed difference, however small: Normalized body similarity is low (`0.20`), so fidelity was judged from
  SQL/helper/assertion shape instead of raw text. SQL verb set differs:
  legacy ['CREATE', 'INSERT', 'SELECT', 'DELETE', 'UPDATE', 'WITH', 'ALTER', 'DROP', 'SHOW'] vs
  current ['CREATE', 'INSERT', 'SELECT', 'DELETE', 'UPDATE', 'WITH', 'ALTER', 'DROP']. Assertion helper names differ
  between legacy and current implementations. Current method uses parameter-injected environment helpers instead of
  Tempto query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Matched by current suite selection: `SuiteHiveTransactional` run 1 Exact-name mapping with normalized
  body similarity `0.20`.
- Audit status: `verified`

### `TestWriteToHiveTransactionalTableInTrino`

- Owning migration commit: `Migrate TestWriteToHiveTransactionalTableInTrino to JUnit`
- Current class added in same migration commit:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestWriteToHiveTransactionalTableInTrino.java`
- Legacy class removed in same migration commit:
  -
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestWriteToHiveTransactionalTableInTrino.java`
- Class-level environment requirement: `HiveTransactionalEnvironment`.
- Class-level tags: `HiveTransactional`.
- Method inventory complete: Yes. Legacy methods: `7`. Current methods: `7`.
- Legacy helper/resource dependencies accounted for: Legacy class source reviewed directly.
- Intentional differences summary: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Method statuses present: `verified`.

#### Methods

##### `testInsertIntoUnpartitionedTable`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestWriteToHiveTransactionalTableInTrino.java` ->
  `testInsertIntoUnpartitionedTable`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestWriteToHiveTransactionalTableInTrino.java` ->
  `TestWriteToHiveTransactionalTableInTrino.testInsertIntoUnpartitionedTable`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveTransactionalEnvironment`. Routed by source review into
  `SuiteHiveTransactional` run 1.
- Tag parity: Current tags: `HiveTransactional`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`, `INSERT`. Legacy setup operations: `CREATE`, `INSERT`.
- Action parity: Current action verbs: `SELECT`. Legacy action verbs: `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `containsOnly`, `row`. Legacy assertion helpers:
  `assertThat`, `containsOnly`, `row`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: Current method uses parameter-injected environment helpers instead of Tempto
  query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Matched by current suite selection: `SuiteHiveTransactional` run 1 Exact-name mapping with normalized
  body similarity `0.57`.
- Audit status: `verified`

##### `testInsertIntoPartitionedTable`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestWriteToHiveTransactionalTableInTrino.java` ->
  `testInsertIntoPartitionedTable`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestWriteToHiveTransactionalTableInTrino.java` ->
  `TestWriteToHiveTransactionalTableInTrino.testInsertIntoPartitionedTable`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveTransactionalEnvironment`. Routed by source review into
  `SuiteHiveTransactional` run 1.
- Tag parity: Current tags: `HiveTransactional`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`, `INSERT`. Legacy setup operations: `CREATE`, `INSERT`.
- Action parity: Current action verbs: `SELECT`. Legacy action verbs: `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `containsOnly`, `row`. Legacy assertion helpers:
  `assertThat`, `containsOnly`, `row`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: Current method uses parameter-injected environment helpers instead of Tempto
  query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Matched by current suite selection: `SuiteHiveTransactional` run 1 Exact-name mapping with normalized
  body similarity `0.63`.
- Audit status: `verified`

##### `testInsertIntoNonPartitionedTable`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestWriteToHiveTransactionalTableInTrino.java` ->
  `testInsertIntoNonPartitionedTable`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestWriteToHiveTransactionalTableInTrino.java` ->
  `TestWriteToHiveTransactionalTableInTrino.testInsertIntoNonPartitionedTable`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveTransactionalEnvironment`. Routed by source review into
  `SuiteHiveTransactional` run 1.
- Tag parity: Current tags: `HiveTransactional`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`, `INSERT`. Legacy setup operations: `CREATE`, `INSERT`.
- Action parity: Current action verbs: `SELECT`. Legacy action verbs: `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `containsOnly`, `row`. Legacy assertion helpers:
  `assertThat`, `containsOnly`, `row`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: Current method uses parameter-injected environment helpers instead of Tempto
  query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Matched by current suite selection: `SuiteHiveTransactional` run 1 Exact-name mapping with normalized
  body similarity `0.73`.
- Audit status: `verified`

##### `testUpdateOnUnpartitionedTable`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestWriteToHiveTransactionalTableInTrino.java` ->
  `testUpdateOnUnpartitionedTable`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestWriteToHiveTransactionalTableInTrino.java` ->
  `TestWriteToHiveTransactionalTableInTrino.testUpdateOnUnpartitionedTable`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveTransactionalEnvironment`. Routed by source review into
  `SuiteHiveTransactional` run 1.
- Tag parity: Current tags: `HiveTransactional`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`, `INSERT`, `UPDATE`. Legacy setup operations: `CREATE`, `INSERT`,
  `UPDATE`.
- Action parity: Current action verbs: `SELECT`. Legacy action verbs: `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `containsOnly`, `row`. Legacy assertion helpers:
  `assertThat`, `containsOnly`, `row`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: Current method uses parameter-injected environment helpers instead of Tempto
  query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Matched by current suite selection: `SuiteHiveTransactional` run 1 Exact-name mapping with normalized
  body similarity `0.78`.
- Audit status: `verified`

##### `testUpdateOnPartitionedTable`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestWriteToHiveTransactionalTableInTrino.java` ->
  `testUpdateOnPartitionedTable`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestWriteToHiveTransactionalTableInTrino.java` ->
  `TestWriteToHiveTransactionalTableInTrino.testUpdateOnPartitionedTable`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveTransactionalEnvironment`. Routed by source review into
  `SuiteHiveTransactional` run 1.
- Tag parity: Current tags: `HiveTransactional`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`, `INSERT`, `UPDATE`. Legacy setup operations: `CREATE`, `INSERT`,
  `UPDATE`.
- Action parity: Current action verbs: `SELECT`. Legacy action verbs: `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `containsOnly`, `row`. Legacy assertion helpers:
  `assertThat`, `containsOnly`, `row`.
- Cleanup parity: Current cleanup operations: `DROP`. Legacy cleanup operations: `DROP`.
- Any observed difference, however small: Current method uses parameter-injected environment helpers instead of Tempto
  query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Matched by current suite selection: `SuiteHiveTransactional` run 1 Exact-name mapping with normalized
  body similarity `0.81`.
- Audit status: `verified`

##### `testDeleteOnUnpartitionedTable`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestWriteToHiveTransactionalTableInTrino.java` ->
  `testDeleteOnUnpartitionedTable`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestWriteToHiveTransactionalTableInTrino.java` ->
  `TestWriteToHiveTransactionalTableInTrino.testDeleteOnUnpartitionedTable`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveTransactionalEnvironment`. Routed by source review into
  `SuiteHiveTransactional` run 1.
- Tag parity: Current tags: `HiveTransactional`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`, `INSERT`. Legacy setup operations: `CREATE`, `INSERT`.
- Action parity: Current action verbs: `SELECT`. Legacy action verbs: `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `containsOnly`, `row`. Legacy assertion helpers:
  `assertThat`, `containsOnly`, `row`.
- Cleanup parity: Current cleanup operations: `DELETE`, `DROP`. Legacy cleanup operations: `DELETE`, `DROP`.
- Any observed difference, however small: Current method uses parameter-injected environment helpers instead of Tempto
  query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Matched by current suite selection: `SuiteHiveTransactional` run 1 Exact-name mapping with normalized
  body similarity `0.61`.
- Audit status: `verified`

##### `testDeleteOnPartitionedTable`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/hive/TestWriteToHiveTransactionalTableInTrino.java` ->
  `testDeleteOnPartitionedTable`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/hive/TestWriteToHiveTransactionalTableInTrino.java` ->
  `TestWriteToHiveTransactionalTableInTrino.testDeleteOnPartitionedTable`
- Mapping type: `direct`
- Environment parity: Current class requires `HiveTransactionalEnvironment`. Routed by source review into
  `SuiteHiveTransactional` run 1.
- Tag parity: Current tags: `HiveTransactional`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `CREATE`, `INSERT`. Legacy setup operations: `CREATE`, `INSERT`.
- Action parity: Current action verbs: `SELECT`. Legacy action verbs: `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `containsOnly`, `row`. Legacy assertion helpers:
  `assertThat`, `containsOnly`, `row`.
- Cleanup parity: Current cleanup operations: `DELETE`, `DROP`. Legacy cleanup operations: `DELETE`, `DROP`.
- Any observed difference, however small: Current method uses parameter-injected environment helpers instead of Tempto
  query executors.
- Known intentional difference: `HDP to Hive 3.1 migration`,
  `Kerberos deployment cleanup without intended coverage change`
- Reviewer note: Matched by current suite selection: `SuiteHiveTransactional` run 1 Exact-name mapping with normalized
  body similarity `0.68`.
- Audit status: `verified`
