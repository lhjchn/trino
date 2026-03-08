# Lane Audit: Kafka

## Lane Summary

- Audit status: `completed`
- Section start commit: `Add Kafka environments`
- Section end commit: `Remove legacy SuiteKafka`
- Introduced JUnit suites: `SuiteKafka`.
- Extended existing suites: none.
- Retired legacy suites: `SuiteKafka`.
- Environment classes introduced: `KafkaEnvironment`.
- Method status counts: verified `20`, intentional difference `7`, needs follow-up `0`.

## Lane-Level Open Questions / Intentional Differences

- Lane-wide approved difference set: none beyond the framework baseline documented in the reviewer guide.
- Needs-follow-up methods: none currently identified in this source/history pass.

## Ported Test Classes

### `TestKafkaAvroReadsSmokeTest`

- Owning migration commit: `Migrate TestKafkaAvroReadsSmokeTest to JUnit`
- Current class added in same migration commit:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/kafka/TestKafkaAvroReadsSmokeTest.java`
- Legacy class removed in same migration commit:
    - `testing/trino-product-tests/src/main/java/io/trino/tests/product/kafka/TestKafkaAvroReadsSmokeTest.java`
- Class-level environment requirement: `KafkaBasicEnvironment`.
- Class-level tags: `Kafka`, `ProfileSpecificTests`.
- Method inventory complete: Yes. Legacy methods: `4`. Current methods: `3`.
- Legacy helper/resource dependencies accounted for: Legacy class source reviewed directly. Cross-class or merged legacy
  coverage accounted for: `testAvroWithSchemaReferences` -> covered in
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/kafka/TestKafkaAvroReadsSchemaRegistrySmokeTest.java` ->
  `testAvroWithSchemaReferences`.
- Intentional differences summary: None identified at class scope.
- Method statuses present: `verified`.

#### Methods

##### `testSelectPrimitiveDataType`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/kafka/TestKafkaAvroReadsSmokeTest.java` ->
  `testSelectPrimitiveDataType`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/kafka/TestKafkaAvroReadsSmokeTest.java` ->
  `TestKafkaAvroReadsSmokeTest.testSelectPrimitiveDataType`
- Mapping type: `direct`
- Environment parity: Current class requires `KafkaBasicEnvironment`. Routed by source review into `SuiteKafka` run 1.
- Tag parity: Current tags: `Kafka`, `ProfileSpecificTests`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: none. Legacy setup operations: none.
- Action parity: Current action verbs: `SELECT`. Legacy action verbs: `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `isEqualTo`. Legacy assertion helpers: `assertEventually`,
  `assertThat`, `containsOnly`, `row`.
- Cleanup parity: Current cleanup operations: none. No legacy cleanup method body was available.
- Any observed difference, however small: Normalized body similarity is low (`0.15`), so fidelity was judged from
  SQL/helper/assertion shape instead of raw text. Assertion helper names differ between legacy and current
  implementations. Current method uses parameter-injected environment helpers instead of Tempto query executors.
- Known intentional difference: None.
- Reviewer note: Matched by current suite selection: `SuiteKafka` run 1 Exact-name mapping with normalized body
  similarity `0.15`.
- Audit status: `verified`

##### `testNullType`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/kafka/TestKafkaAvroReadsSmokeTest.java` ->
  `testNullType`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/kafka/TestKafkaAvroReadsSmokeTest.java` ->
  `TestKafkaAvroReadsSmokeTest.testNullType`
- Mapping type: `direct`
- Environment parity: Current class requires `KafkaBasicEnvironment`. Routed by source review into `SuiteKafka` run 1.
- Tag parity: Current tags: `Kafka`, `ProfileSpecificTests`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: none. Legacy setup operations: none.
- Action parity: Current action verbs: `SELECT`. Legacy action verbs: `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`. Legacy assertion helpers: `assertEventually`, `assertThat`,
  `containsOnly`, `row`.
- Cleanup parity: Current cleanup operations: none. No legacy cleanup method body was available.
- Any observed difference, however small: Normalized body similarity is low (`0.09`), so fidelity was judged from
  SQL/helper/assertion shape instead of raw text. Assertion helper names differ between legacy and current
  implementations. Current method uses parameter-injected environment helpers instead of Tempto query executors.
- Known intentional difference: None.
- Reviewer note: Matched by current suite selection: `SuiteKafka` run 1 Exact-name mapping with normalized body
  similarity `0.09`.
- Audit status: `verified`

##### `testSelectStructuralDataType`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/kafka/TestKafkaAvroReadsSmokeTest.java` ->
  `testSelectStructuralDataType`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/kafka/TestKafkaAvroReadsSmokeTest.java` ->
  `TestKafkaAvroReadsSmokeTest.testSelectStructuralDataType`
- Mapping type: `direct`
- Environment parity: Current class requires `KafkaBasicEnvironment`. Routed by source review into `SuiteKafka` run 1.
- Tag parity: Current tags: `Kafka`, `ProfileSpecificTests`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: none. Legacy setup operations: none.
- Action parity: Current action verbs: `SELECT`. Legacy action verbs: `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `isEqualTo`. Legacy assertion helpers: `assertEventually`,
  `assertThat`, `containsOnly`, `row`.
- Cleanup parity: Current cleanup operations: none. No legacy cleanup method body was available.
- Any observed difference, however small: Normalized body similarity is low (`0.17`), so fidelity was judged from
  SQL/helper/assertion shape instead of raw text. Assertion helper names differ between legacy and current
  implementations. Current method uses parameter-injected environment helpers instead of Tempto query executors.
- Known intentional difference: None.
- Reviewer note: Matched by current suite selection: `SuiteKafka` run 1 Exact-name mapping with normalized body
  similarity `0.17`.
- Audit status: `verified`

### `TestKafkaAvroReadsSchemaRegistrySmokeTest`

- Owning migration commit: `Add TestKafkaAvroReadsSchemaRegistrySmokeTest JUnit coverage`
- Current class added in same migration commit:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/kafka/TestKafkaAvroReadsSchemaRegistrySmokeTest.java`
- Legacy class removed in same migration commit:
    - None. This commit added new JUnit-side verification coverage rather than removing a legacy class.
- Class-level environment requirement: `KafkaSchemaRegistryEnvironment`.
- Class-level tags: `Kafka`, `KafkaSchemaRegistry`, `ProfileSpecificTests`.
- Method inventory complete: Not applicable. No legacy class or resource source exists for this new verification
  coverage.
- Legacy helper/resource dependencies accounted for: New JUnit-side verification coverage without a removed legacy
  counterpart.
- Intentional differences summary: `JUnit/AssertJ/Testcontainers framework replacement`
- Method statuses present: `intentional difference`.

#### Methods

##### `testSelectPrimitiveDataType`

- Legacy source method: No legacy source method; this is new JUnit-side verification coverage.
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/kafka/TestKafkaAvroReadsSchemaRegistrySmokeTest.java` ->
  `TestKafkaAvroReadsSchemaRegistrySmokeTest.testSelectPrimitiveDataType`
- Mapping type: `new coverage helper`
- Environment parity: Current class requires `KafkaSchemaRegistryEnvironment`. Routed by source review into `SuiteKafka`
  run 2.
- Tag parity: Current tags: `Kafka`, `KafkaSchemaRegistry`, `ProfileSpecificTests`. Tag routing matches the current
  suite selection.
- Setup parity: Current setup operations: none. No legacy setup method body was available.
- Action parity: Current action verbs: `SELECT`. No legacy action method body was available.
- Assertion parity: Current assertion helpers: `assertThat`, `isEqualTo`. No legacy assertion method body was available.
- Cleanup parity: Current cleanup operations: none. No legacy cleanup method body was available.
- Any observed difference, however small: No legacy method counterpart exists; this is new JUnit-side verification
  coverage.
- Known intentional difference: `JUnit/AssertJ/Testcontainers framework replacement`
- Reviewer note: Source/history review only.
- Audit status: `intentional difference`

##### `testNullType`

- Legacy source method: No legacy source method; this is new JUnit-side verification coverage.
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/kafka/TestKafkaAvroReadsSchemaRegistrySmokeTest.java` ->
  `TestKafkaAvroReadsSchemaRegistrySmokeTest.testNullType`
- Mapping type: `new coverage helper`
- Environment parity: Current class requires `KafkaSchemaRegistryEnvironment`. Routed by source review into `SuiteKafka`
  run 2.
- Tag parity: Current tags: `Kafka`, `KafkaSchemaRegistry`, `ProfileSpecificTests`. Tag routing matches the current
  suite selection.
- Setup parity: Current setup operations: none. No legacy setup method body was available.
- Action parity: Current action verbs: `SELECT`. No legacy action method body was available.
- Assertion parity: Current assertion helpers: `assertThat`. No legacy assertion method body was available.
- Cleanup parity: Current cleanup operations: none. No legacy cleanup method body was available.
- Any observed difference, however small: No legacy method counterpart exists; this is new JUnit-side verification
  coverage.
- Known intentional difference: `JUnit/AssertJ/Testcontainers framework replacement`
- Reviewer note: Source/history review only.
- Audit status: `intentional difference`

##### `testSelectStructuralDataType`

- Legacy source method: No legacy source method; this is new JUnit-side verification coverage.
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/kafka/TestKafkaAvroReadsSchemaRegistrySmokeTest.java` ->
  `TestKafkaAvroReadsSchemaRegistrySmokeTest.testSelectStructuralDataType`
- Mapping type: `new coverage helper`
- Environment parity: Current class requires `KafkaSchemaRegistryEnvironment`. Routed by source review into `SuiteKafka`
  run 2.
- Tag parity: Current tags: `Kafka`, `KafkaSchemaRegistry`, `ProfileSpecificTests`. Tag routing matches the current
  suite selection.
- Setup parity: Current setup operations: none. No legacy setup method body was available.
- Action parity: Current action verbs: `SELECT`. No legacy action method body was available.
- Assertion parity: Current assertion helpers: `assertThat`, `isEqualTo`. No legacy assertion method body was available.
- Cleanup parity: Current cleanup operations: none. No legacy cleanup method body was available.
- Any observed difference, however small: No legacy method counterpart exists; this is new JUnit-side verification
  coverage.
- Known intentional difference: `JUnit/AssertJ/Testcontainers framework replacement`
- Reviewer note: Source/history review only.
- Audit status: `intentional difference`

##### `testAvroWithSchemaReferences`

- Legacy source method: No legacy source method; this is new JUnit-side verification coverage.
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/kafka/TestKafkaAvroReadsSchemaRegistrySmokeTest.java` ->
  `TestKafkaAvroReadsSchemaRegistrySmokeTest.testAvroWithSchemaReferences`
- Mapping type: `new coverage helper`
- Environment parity: Current class requires `KafkaSchemaRegistryEnvironment`. Routed by source review into `SuiteKafka`
  run 2.
- Tag parity: Current tags: `Kafka`, `KafkaSchemaRegistry`, `ProfileSpecificTests`. Tag routing matches the current
  suite selection.
- Setup parity: Current setup operations: none. No legacy setup method body was available.
- Action parity: Current action verbs: `SELECT`. No legacy action method body was available.
- Assertion parity: Current assertion helpers: `assertThat`, `isEqualTo`. No legacy assertion method body was available.
- Cleanup parity: Current cleanup operations: none. No legacy cleanup method body was available.
- Any observed difference, however small: No legacy method counterpart exists; this is new JUnit-side verification
  coverage.
- Known intentional difference: `JUnit/AssertJ/Testcontainers framework replacement`
- Reviewer note: Source/history review only.
- Audit status: `intentional difference`

### `TestKafkaAvroWritesSmokeTest`

- Owning migration commit: `Migrate TestKafkaAvroWritesSmokeTest to JUnit`
- Current class added in same migration commit:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/kafka/TestKafkaAvroWritesSmokeTest.java`
- Legacy class removed in same migration commit:
    - `testing/trino-product-tests/src/main/java/io/trino/tests/product/kafka/TestKafkaAvroWritesSmokeTest.java`
- Class-level environment requirement: `KafkaBasicEnvironment`.
- Class-level tags: `Kafka`, `ProfileSpecificTests`.
- Method inventory complete: Yes. Legacy methods: `2`. Current methods: `2`.
- Legacy helper/resource dependencies accounted for: Legacy class source reviewed directly.
- Intentional differences summary: None identified at class scope.
- Method statuses present: `verified`.

#### Methods

##### `testInsertPrimitiveDataType`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/kafka/TestKafkaAvroWritesSmokeTest.java` ->
  `testInsertPrimitiveDataType`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/kafka/TestKafkaAvroWritesSmokeTest.java` ->
  `TestKafkaAvroWritesSmokeTest.testInsertPrimitiveDataType`
- Mapping type: `direct`
- Environment parity: Current class requires `KafkaBasicEnvironment`. Routed by source review into `SuiteKafka` run 1.
- Tag parity: Current tags: `Kafka`, `ProfileSpecificTests`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `INSERT`. Legacy setup operations: `INSERT`.
- Action parity: Current action verbs: `SELECT`. Legacy action verbs: `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `isEqualTo`. Legacy assertion helpers: `assertThat`,
  `containsOnly`, `row`.
- Cleanup parity: Current cleanup operations: none. No legacy cleanup method body was available.
- Any observed difference, however small: Normalized body similarity is low (`0.41`), so fidelity was judged from
  SQL/helper/assertion shape instead of raw text. Assertion helper names differ between legacy and current
  implementations. Current method uses parameter-injected environment helpers instead of Tempto query executors.
- Known intentional difference: None.
- Reviewer note: Matched by current suite selection: `SuiteKafka` run 1 Exact-name mapping with normalized body
  similarity `0.41`.
- Audit status: `verified`

##### `testInsertStructuralDataType`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/kafka/TestKafkaAvroWritesSmokeTest.java` ->
  `testInsertStructuralDataType`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/kafka/TestKafkaAvroWritesSmokeTest.java` ->
  `TestKafkaAvroWritesSmokeTest.testInsertStructuralDataType`
- Mapping type: `direct`
- Environment parity: Current class requires `KafkaBasicEnvironment`. Routed by source review into `SuiteKafka` run 1.
- Tag parity: Current tags: `Kafka`, `ProfileSpecificTests`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `INSERT`. Legacy setup operations: `INSERT`.
- Action parity: Current action verbs: none. Legacy action verbs: none.
- Assertion parity: Current assertion helpers: `assertThatThrownBy`, `hasMessageContaining`. Legacy assertion helpers:
  `assertQueryFailure`.
- Cleanup parity: Current cleanup operations: none. No legacy cleanup method body was available.
- Any observed difference, however small: Normalized body similarity is low (`0.36`), so fidelity was judged from
  SQL/helper/assertion shape instead of raw text. Assertion helper names differ between legacy and current
  implementations. Current method uses parameter-injected environment helpers instead of Tempto query executors.
- Known intentional difference: None.
- Reviewer note: Matched by current suite selection: `SuiteKafka` run 1 Exact-name mapping with normalized body
  similarity `0.36`.
- Audit status: `verified`

### `TestKafkaProtobufReadsSmokeTest`

- Owning migration commit: `Migrate TestKafkaProtobufReadsSmokeTest to JUnit`
- Current class added in same migration commit:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/kafka/TestKafkaProtobufReadsSmokeTest.java`
- Legacy class removed in same migration commit:
    - `testing/trino-product-tests/src/main/java/io/trino/tests/product/kafka/TestKafkaProtobufReadsSmokeTest.java`
- Class-level environment requirement: `KafkaBasicEnvironment`.
- Class-level tags: `Kafka`, `ProfileSpecificTests`.
- Method inventory complete: Yes. Legacy methods: `5`. Current methods: `2`.
- Legacy helper/resource dependencies accounted for: Legacy class source reviewed directly. Cross-class or merged legacy
  coverage accounted for: `testProtobufWithSchemaReferences` -> covered in
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/kafka/TestKafkaProtobufReadsSchemaRegistrySmokeTest.java` ->
  `testProtobufWithSchemaReferences`; `testSelectPrimitiveDataTypeWithSchemaRegistry` -> covered in
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/kafka/TestKafkaProtobufReadsSchemaRegistrySmokeTest.java` ->
  `testSelectPrimitiveDataType`; `testSelectStructuralDataTypeWithSchemaRegistry` -> covered in
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/kafka/TestKafkaProtobufReadsSchemaRegistrySmokeTest.java` ->
  `testSelectStructuralDataType`.
- Intentional differences summary: None identified at class scope.
- Method statuses present: `verified`.

#### Methods

##### `testSelectPrimitiveDataType`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/kafka/TestKafkaProtobufReadsSmokeTest.java` ->
  `testSelectPrimitiveDataType`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/kafka/TestKafkaProtobufReadsSmokeTest.java` ->
  `TestKafkaProtobufReadsSmokeTest.testSelectPrimitiveDataType`
- Mapping type: `direct`
- Environment parity: Current class requires `KafkaBasicEnvironment`. Routed by source review into `SuiteKafka` run 1.
- Tag parity: Current tags: `Kafka`, `ProfileSpecificTests`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: none. No legacy setup method body was available.
- Action parity: Current action verbs: `SELECT`. No legacy action method body was available.
- Assertion parity: Current assertion helpers: `assertThat`, `isEqualTo`. No legacy assertion method body was available.
- Cleanup parity: Current cleanup operations: none. No legacy cleanup method body was available.
- Any observed difference, however small: Normalized body similarity is low (`0.12`), so fidelity was judged from
  SQL/helper/assertion shape instead of raw text.
- Known intentional difference: None.
- Reviewer note: Matched by current suite selection: `SuiteKafka` run 1 Exact-name mapping with normalized body
  similarity `0.12`.
- Audit status: `verified`

##### `testSelectStructuralDataType`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/kafka/TestKafkaProtobufReadsSmokeTest.java` ->
  `testSelectStructuralDataType`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/kafka/TestKafkaProtobufReadsSmokeTest.java` ->
  `TestKafkaProtobufReadsSmokeTest.testSelectStructuralDataType`
- Mapping type: `direct`
- Environment parity: Current class requires `KafkaBasicEnvironment`. Routed by source review into `SuiteKafka` run 1.
- Tag parity: Current tags: `Kafka`, `ProfileSpecificTests`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: none. No legacy setup method body was available.
- Action parity: Current action verbs: `SELECT`. No legacy action method body was available.
- Assertion parity: Current assertion helpers: `assertThat`, `isEqualTo`. No legacy assertion method body was available.
- Cleanup parity: Current cleanup operations: none. No legacy cleanup method body was available.
- Any observed difference, however small: Normalized body similarity is low (`0.13`), so fidelity was judged from
  SQL/helper/assertion shape instead of raw text.
- Known intentional difference: None.
- Reviewer note: Matched by current suite selection: `SuiteKafka` run 1 Exact-name mapping with normalized body
  similarity `0.13`.
- Audit status: `verified`

### `TestKafkaProtobufReadsSchemaRegistrySmokeTest`

- Owning migration commit: `Add TestKafkaProtobufReadsSchemaRegistrySmokeTest JUnit coverage`
- Current class added in same migration commit:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/kafka/TestKafkaProtobufReadsSchemaRegistrySmokeTest.java`
- Legacy class removed in same migration commit:
    - None. This commit added new JUnit-side verification coverage rather than removing a legacy class.
- Class-level environment requirement: `KafkaSchemaRegistryEnvironment`.
- Class-level tags: `KafkaConfluentLicense`, `KafkaSchemaRegistry`, `ProfileSpecificTests`.
- Method inventory complete: Not applicable. No legacy class or resource source exists for this new verification
  coverage.
- Legacy helper/resource dependencies accounted for: New JUnit-side verification coverage without a removed legacy
  counterpart.
- Intentional differences summary: `JUnit/AssertJ/Testcontainers framework replacement`
- Method statuses present: `intentional difference`.

#### Methods

##### `testSelectPrimitiveDataType`

- Legacy source method: No legacy source method; this is new JUnit-side verification coverage.
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/kafka/TestKafkaProtobufReadsSchemaRegistrySmokeTest.java` ->
  `TestKafkaProtobufReadsSchemaRegistrySmokeTest.testSelectPrimitiveDataType`
- Mapping type: `new coverage helper`
- Environment parity: Current class requires `KafkaSchemaRegistryEnvironment`. Routed by source review into `SuiteKafka`
  run 3.
- Tag parity: Current tags: `KafkaConfluentLicense`, `KafkaSchemaRegistry`, `ProfileSpecificTests`. Tag routing matches
  the current suite selection.
- Setup parity: Current setup operations: none. No legacy setup method body was available.
- Action parity: Current action verbs: `SELECT`. No legacy action method body was available.
- Assertion parity: Current assertion helpers: `assertThat`, `isEqualTo`. No legacy assertion method body was available.
- Cleanup parity: Current cleanup operations: none. No legacy cleanup method body was available.
- Any observed difference, however small: No legacy method counterpart exists; this is new JUnit-side verification
  coverage.
- Known intentional difference: `JUnit/AssertJ/Testcontainers framework replacement`
- Reviewer note: Source/history review only.
- Audit status: `intentional difference`

##### `testSelectStructuralDataType`

- Legacy source method: No legacy source method; this is new JUnit-side verification coverage.
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/kafka/TestKafkaProtobufReadsSchemaRegistrySmokeTest.java` ->
  `TestKafkaProtobufReadsSchemaRegistrySmokeTest.testSelectStructuralDataType`
- Mapping type: `new coverage helper`
- Environment parity: Current class requires `KafkaSchemaRegistryEnvironment`. Routed by source review into `SuiteKafka`
  run 3.
- Tag parity: Current tags: `KafkaConfluentLicense`, `KafkaSchemaRegistry`, `ProfileSpecificTests`. Tag routing matches
  the current suite selection.
- Setup parity: Current setup operations: none. No legacy setup method body was available.
- Action parity: Current action verbs: `SELECT`. No legacy action method body was available.
- Assertion parity: Current assertion helpers: `assertThat`, `isEqualTo`. No legacy assertion method body was available.
- Cleanup parity: Current cleanup operations: none. No legacy cleanup method body was available.
- Any observed difference, however small: No legacy method counterpart exists; this is new JUnit-side verification
  coverage.
- Known intentional difference: `JUnit/AssertJ/Testcontainers framework replacement`
- Reviewer note: Source/history review only.
- Audit status: `intentional difference`

##### `testProtobufWithSchemaReferences`

- Legacy source method: No legacy source method; this is new JUnit-side verification coverage.
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/kafka/TestKafkaProtobufReadsSchemaRegistrySmokeTest.java` ->
  `TestKafkaProtobufReadsSchemaRegistrySmokeTest.testProtobufWithSchemaReferences`
- Mapping type: `new coverage helper`
- Environment parity: Current class requires `KafkaSchemaRegistryEnvironment`. Routed by source review into `SuiteKafka`
  run 3.
- Tag parity: Current tags: `KafkaConfluentLicense`, `KafkaSchemaRegistry`, `ProfileSpecificTests`. Tag routing matches
  the current suite selection.
- Setup parity: Current setup operations: none. No legacy setup method body was available.
- Action parity: Current action verbs: `SELECT`. No legacy action method body was available.
- Assertion parity: Current assertion helpers: `assertThat`, `isEqualTo`. No legacy assertion method body was available.
- Cleanup parity: Current cleanup operations: none. No legacy cleanup method body was available.
- Any observed difference, however small: No legacy method counterpart exists; this is new JUnit-side verification
  coverage.
- Known intentional difference: `JUnit/AssertJ/Testcontainers framework replacement`
- Reviewer note: Source/history review only.
- Audit status: `intentional difference`

### `TestKafkaProtobufWritesSmokeTest`

- Owning migration commit: `Migrate TestKafkaProtobufWritesSmokeTest to JUnit`
- Current class added in same migration commit:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/kafka/TestKafkaProtobufWritesSmokeTest.java`
- Legacy class removed in same migration commit:
    - `testing/trino-product-tests/src/main/java/io/trino/tests/product/kafka/TestKafkaProtobufWritesSmokeTest.java`
- Class-level environment requirement: `KafkaBasicEnvironment`.
- Class-level tags: `Kafka`, `ProfileSpecificTests`.
- Method inventory complete: Yes. Legacy methods: `2`. Current methods: `2`.
- Legacy helper/resource dependencies accounted for: Legacy class source reviewed directly.
- Intentional differences summary: None identified at class scope.
- Method statuses present: `verified`.

#### Methods

##### `testInsertAllDataType`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/kafka/TestKafkaProtobufWritesSmokeTest.java` ->
  `testInsertAllDataType`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/kafka/TestKafkaProtobufWritesSmokeTest.java` ->
  `TestKafkaProtobufWritesSmokeTest.testInsertAllDataType`
- Mapping type: `direct`
- Environment parity: Current class requires `KafkaBasicEnvironment`. Routed by source review into `SuiteKafka` run 1.
- Tag parity: Current tags: `Kafka`, `ProfileSpecificTests`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `INSERT`. Legacy setup operations: `INSERT`.
- Action parity: Current action verbs: `SELECT`. Legacy action verbs: `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `assertThatThrownBy`, `hasMessageContaining`, `isEqualTo`.
  Legacy assertion helpers: `assertQueryFailure`, `assertThat`, `containsOnly`, `row`.
- Cleanup parity: Current cleanup operations: none. No legacy cleanup method body was available.
- Any observed difference, however small: Normalized body similarity is low (`0.16`), so fidelity was judged from
  SQL/helper/assertion shape instead of raw text. Assertion helper names differ between legacy and current
  implementations. Current method uses parameter-injected environment helpers instead of Tempto query executors.
- Known intentional difference: None.
- Reviewer note: Matched by current suite selection: `SuiteKafka` run 1 Exact-name mapping with normalized body
  similarity `0.16`.
- Audit status: `verified`

##### `testInsertStructuralDataType`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/kafka/TestKafkaProtobufWritesSmokeTest.java` ->
  `testInsertStructuralDataType`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/kafka/TestKafkaProtobufWritesSmokeTest.java` ->
  `TestKafkaProtobufWritesSmokeTest.testInsertStructuralDataType`
- Mapping type: `direct`
- Environment parity: Current class requires `KafkaBasicEnvironment`. Routed by source review into `SuiteKafka` run 1.
- Tag parity: Current tags: `Kafka`, `ProfileSpecificTests`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `INSERT`. Legacy setup operations: `INSERT`.
- Action parity: Current action verbs: `SELECT`. Legacy action verbs: `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `isEqualTo`. Legacy assertion helpers: `assertThat`,
  `containsOnly`, `row`.
- Cleanup parity: Current cleanup operations: none. No legacy cleanup method body was available.
- Any observed difference, however small: Normalized body similarity is low (`0.44`), so fidelity was judged from
  SQL/helper/assertion shape instead of raw text. Assertion helper names differ between legacy and current
  implementations. Current method uses parameter-injected environment helpers instead of Tempto query executors.
- Known intentional difference: None.
- Reviewer note: Matched by current suite selection: `SuiteKafka` run 1 Exact-name mapping with normalized body
  similarity `0.44`.
- Audit status: `verified`

### `TestKafkaPushdownSmokeTest`

- Owning migration commit: `Migrate TestKafkaPushdownSmokeTest to JUnit`
- Current class added in same migration commit:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/kafka/TestKafkaPushdownSmokeTest.java`
- Legacy class removed in same migration commit:
    - `testing/trino-product-tests/src/main/java/io/trino/tests/product/kafka/TestKafkaPushdownSmokeTest.java`
- Class-level environment requirement: `KafkaBasicEnvironment`.
- Class-level tags: `Kafka`, `ProfileSpecificTests`.
- Method inventory complete: Yes. Legacy methods: `3`. Current methods: `3`.
- Legacy helper/resource dependencies accounted for: Legacy class source reviewed directly.
- Intentional differences summary: None identified at class scope.
- Method statuses present: `verified`.

#### Methods

##### `testPartitionPushdown`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/kafka/TestKafkaPushdownSmokeTest.java` ->
  `testPartitionPushdown`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/kafka/TestKafkaPushdownSmokeTest.java` ->
  `TestKafkaPushdownSmokeTest.testPartitionPushdown`
- Mapping type: `direct`
- Environment parity: Current class requires `KafkaBasicEnvironment`. Routed by source review into `SuiteKafka` run 1.
- Tag parity: Current tags: `Kafka`, `ProfileSpecificTests`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: none. Legacy setup operations: none.
- Action parity: Current action verbs: `SELECT`. Legacy action verbs: `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `isEqualTo`. Legacy assertion helpers: `assertThat`, `row`.
- Cleanup parity: Current cleanup operations: none. No legacy cleanup method body was available.
- Any observed difference, however small: Normalized body similarity is low (`0.18`), so fidelity was judged from
  SQL/helper/assertion shape instead of raw text. Assertion helper names differ between legacy and current
  implementations. Current method uses parameter-injected environment helpers instead of Tempto query executors.
- Known intentional difference: None.
- Reviewer note: Matched by current suite selection: `SuiteKafka` run 1 Exact-name mapping with normalized body
  similarity `0.18`.
- Audit status: `verified`

##### `testOffsetPushdown`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/kafka/TestKafkaPushdownSmokeTest.java` ->
  `testOffsetPushdown`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/kafka/TestKafkaPushdownSmokeTest.java` ->
  `TestKafkaPushdownSmokeTest.testOffsetPushdown`
- Mapping type: `direct`
- Environment parity: Current class requires `KafkaBasicEnvironment`. Routed by source review into `SuiteKafka` run 1.
- Tag parity: Current tags: `Kafka`, `ProfileSpecificTests`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: none. Legacy setup operations: none.
- Action parity: Current action verbs: `SELECT`. Legacy action verbs: `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `isEqualTo`. Legacy assertion helpers: `assertThat`, `row`.
- Cleanup parity: Current cleanup operations: none. No legacy cleanup method body was available.
- Any observed difference, however small: Normalized body similarity is low (`0.27`), so fidelity was judged from
  SQL/helper/assertion shape instead of raw text. Assertion helper names differ between legacy and current
  implementations. Current method uses parameter-injected environment helpers instead of Tempto query executors.
- Known intentional difference: None.
- Reviewer note: Matched by current suite selection: `SuiteKafka` run 1 Exact-name mapping with normalized body
  similarity `0.27`.
- Audit status: `verified`

##### `testCreateTimePushdown`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/kafka/TestKafkaPushdownSmokeTest.java` ->
  `testCreateTimePushdown`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/kafka/TestKafkaPushdownSmokeTest.java` ->
  `TestKafkaPushdownSmokeTest.testCreateTimePushdown`
- Mapping type: `direct`
- Environment parity: Current class requires `KafkaBasicEnvironment`. Routed by source review into `SuiteKafka` run 1.
- Tag parity: Current tags: `Kafka`, `ProfileSpecificTests`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `INSERT`. Legacy setup operations: `INSERT`.
- Action parity: Current action verbs: `SELECT`. Legacy action verbs: `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `isEqualTo`. Legacy assertion helpers: `assertThat`, `row`.
- Cleanup parity: Current cleanup operations: none. No legacy cleanup method body was available.
- Any observed difference, however small: Normalized body similarity is low (`0.32`), so fidelity was judged from
  SQL/helper/assertion shape instead of raw text. Assertion helper names differ between legacy and current
  implementations. Current method uses parameter-injected environment helpers instead of Tempto query executors.
- Known intentional difference: None.
- Reviewer note: Matched by current suite selection: `SuiteKafka` run 1 Exact-name mapping with normalized body
  similarity `0.32`.
- Audit status: `verified`

### `TestKafkaReadsSmokeTest`

- Owning migration commit: `Migrate TestKafkaReadsSmokeTest to JUnit`
- Current class added in same migration commit:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/kafka/TestKafkaReadsSmokeTest.java`
- Legacy class removed in same migration commit:
    - `testing/trino-product-tests/src/main/java/io/trino/tests/product/kafka/TestKafkaReadsSmokeTest.java`
- Class-level environment requirement: `KafkaBasicEnvironment`.
- Class-level tags: `Kafka`, `ProfileSpecificTests`.
- Method inventory complete: Yes. Legacy methods: `4`. Current methods: `4`.
- Legacy helper/resource dependencies accounted for: Legacy class source reviewed directly.
- Intentional differences summary: None identified at class scope.
- Method statuses present: `verified`.

#### Methods

##### `testSelectSimpleKeyAndValue`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/kafka/TestKafkaReadsSmokeTest.java` ->
  `testSelectSimpleKeyAndValue`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/kafka/TestKafkaReadsSmokeTest.java` ->
  `TestKafkaReadsSmokeTest.testSelectSimpleKeyAndValue`
- Mapping type: `direct`
- Environment parity: Current class requires `KafkaBasicEnvironment`. Routed by source review into `SuiteKafka` run 1.
- Tag parity: Current tags: `Kafka`, `ProfileSpecificTests`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: none. Legacy setup operations: none.
- Action parity: Current action verbs: `SELECT`. Legacy action verbs: `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`. Legacy assertion helpers: `assertThat`, `containsOnly`,
  `row`.
- Cleanup parity: Current cleanup operations: none. No legacy cleanup method body was available.
- Any observed difference, however small: Normalized body similarity is low (`0.08`), so fidelity was judged from
  SQL/helper/assertion shape instead of raw text. Assertion helper names differ between legacy and current
  implementations. Current method uses parameter-injected environment helpers instead of Tempto query executors.
- Known intentional difference: None.
- Reviewer note: Matched by current suite selection: `SuiteKafka` run 1 Exact-name mapping with normalized body
  similarity `0.08`.
- Audit status: `verified`

##### `testSelectAllRawTable`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/kafka/TestKafkaReadsSmokeTest.java` ->
  `testSelectAllRawTable`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/kafka/TestKafkaReadsSmokeTest.java` ->
  `TestKafkaReadsSmokeTest.testSelectAllRawTable`
- Mapping type: `direct`
- Environment parity: Current class requires `KafkaBasicEnvironment`. Routed by source review into `SuiteKafka` run 1.
- Tag parity: Current tags: `Kafka`, `ProfileSpecificTests`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: none. Legacy setup operations: none.
- Action parity: Current action verbs: `SELECT`. Legacy action verbs: `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `isEqualTo`. Legacy assertion helpers: `assertThat`,
  `containsOnly`, `row`.
- Cleanup parity: Current cleanup operations: none. No legacy cleanup method body was available.
- Any observed difference, however small: Normalized body similarity is low (`0.06`), so fidelity was judged from
  SQL/helper/assertion shape instead of raw text. Assertion helper names differ between legacy and current
  implementations. Current method uses parameter-injected environment helpers instead of Tempto query executors.
- Known intentional difference: None.
- Reviewer note: Matched by current suite selection: `SuiteKafka` run 1 Exact-name mapping with normalized body
  similarity `0.06`.
- Audit status: `verified`

##### `testSelectAllCsvTable`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/kafka/TestKafkaReadsSmokeTest.java` ->
  `testSelectAllCsvTable`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/kafka/TestKafkaReadsSmokeTest.java` ->
  `TestKafkaReadsSmokeTest.testSelectAllCsvTable`
- Mapping type: `direct`
- Environment parity: Current class requires `KafkaBasicEnvironment`. Routed by source review into `SuiteKafka` run 1.
- Tag parity: Current tags: `Kafka`, `ProfileSpecificTests`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: none. Legacy setup operations: none.
- Action parity: Current action verbs: `SELECT`. Legacy action verbs: `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`. Legacy assertion helpers: `assertThat`, `containsOnly`,
  `row`.
- Cleanup parity: Current cleanup operations: none. No legacy cleanup method body was available.
- Any observed difference, however small: Normalized body similarity is low (`0.30`), so fidelity was judged from
  SQL/helper/assertion shape instead of raw text. Assertion helper names differ between legacy and current
  implementations. Current method uses parameter-injected environment helpers instead of Tempto query executors.
- Known intentional difference: None.
- Reviewer note: Matched by current suite selection: `SuiteKafka` run 1 Exact-name mapping with normalized body
  similarity `0.30`.
- Audit status: `verified`

##### `testSelectAllJsonTable`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/kafka/TestKafkaReadsSmokeTest.java` ->
  `testSelectAllJsonTable`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/kafka/TestKafkaReadsSmokeTest.java` ->
  `TestKafkaReadsSmokeTest.testSelectAllJsonTable`
- Mapping type: `direct`
- Environment parity: Current class requires `KafkaBasicEnvironment`. Routed by source review into `SuiteKafka` run 1.
- Tag parity: Current tags: `Kafka`, `ProfileSpecificTests`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: none. Legacy setup operations: none.
- Action parity: Current action verbs: `SELECT`. Legacy action verbs: `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `isEqualTo`. Legacy assertion helpers: `assertThat`,
  `containsOnly`, `row`.
- Cleanup parity: Current cleanup operations: none. No legacy cleanup method body was available.
- Any observed difference, however small: Normalized body similarity is low (`0.26`), so fidelity was judged from
  SQL/helper/assertion shape instead of raw text. Assertion helper names differ between legacy and current
  implementations. Current method uses parameter-injected environment helpers instead of Tempto query executors.
- Known intentional difference: None.
- Reviewer note: Matched by current suite selection: `SuiteKafka` run 1 Exact-name mapping with normalized body
  similarity `0.26`.
- Audit status: `verified`

### `TestKafkaWritesSmokeTest`

- Owning migration commit: `Migrate TestKafkaWritesSmokeTest to JUnit`
- Current class added in same migration commit:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/kafka/TestKafkaWritesSmokeTest.java`
- Legacy class removed in same migration commit:
    - `testing/trino-product-tests/src/main/java/io/trino/tests/product/kafka/TestKafkaWritesSmokeTest.java`
- Class-level environment requirement: `KafkaBasicEnvironment`.
- Class-level tags: `Kafka`, `ProfileSpecificTests`.
- Method inventory complete: Yes. Legacy methods: `4`. Current methods: `4`.
- Legacy helper/resource dependencies accounted for: Legacy class source reviewed directly.
- Intentional differences summary: None identified at class scope.
- Method statuses present: `verified`.

#### Methods

##### `testInsertSimpleKeyAndValue`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/kafka/TestKafkaWritesSmokeTest.java` ->
  `testInsertSimpleKeyAndValue`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/kafka/TestKafkaWritesSmokeTest.java` ->
  `TestKafkaWritesSmokeTest.testInsertSimpleKeyAndValue`
- Mapping type: `direct`
- Environment parity: Current class requires `KafkaBasicEnvironment`. Routed by source review into `SuiteKafka` run 1.
- Tag parity: Current tags: `Kafka`, `ProfileSpecificTests`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `INSERT`. Legacy setup operations: `INSERT`.
- Action parity: Current action verbs: `SELECT`. Legacy action verbs: `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `isEqualTo`. Legacy assertion helpers: `assertThat`,
  `containsOnly`, `row`.
- Cleanup parity: Current cleanup operations: none. No legacy cleanup method body was available.
- Any observed difference, however small: Normalized body similarity is low (`0.25`), so fidelity was judged from
  SQL/helper/assertion shape instead of raw text. Assertion helper names differ between legacy and current
  implementations. Current method uses parameter-injected environment helpers instead of Tempto query executors.
- Known intentional difference: None.
- Reviewer note: Matched by current suite selection: `SuiteKafka` run 1 Exact-name mapping with normalized body
  similarity `0.25`.
- Audit status: `verified`

##### `testInsertRawTable`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/kafka/TestKafkaWritesSmokeTest.java` ->
  `testInsertRawTable`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/kafka/TestKafkaWritesSmokeTest.java` ->
  `TestKafkaWritesSmokeTest.testInsertRawTable`
- Mapping type: `direct`
- Environment parity: Current class requires `KafkaBasicEnvironment`. Routed by source review into `SuiteKafka` run 1.
- Tag parity: Current tags: `Kafka`, `ProfileSpecificTests`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `INSERT`. Legacy setup operations: `INSERT`.
- Action parity: Current action verbs: `SELECT`. Legacy action verbs: `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `isEqualTo`. Legacy assertion helpers: `assertThat`,
  `containsOnly`, `row`.
- Cleanup parity: Current cleanup operations: none. No legacy cleanup method body was available.
- Any observed difference, however small: Normalized body similarity is low (`0.38`), so fidelity was judged from
  SQL/helper/assertion shape instead of raw text. Assertion helper names differ between legacy and current
  implementations. Current method uses parameter-injected environment helpers instead of Tempto query executors.
- Known intentional difference: None.
- Reviewer note: Matched by current suite selection: `SuiteKafka` run 1 Exact-name mapping with normalized body
  similarity `0.38`.
- Audit status: `verified`

##### `testInsertCsvTable`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/kafka/TestKafkaWritesSmokeTest.java` ->
  `testInsertCsvTable`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/kafka/TestKafkaWritesSmokeTest.java` ->
  `TestKafkaWritesSmokeTest.testInsertCsvTable`
- Mapping type: `direct`
- Environment parity: Current class requires `KafkaBasicEnvironment`. Routed by source review into `SuiteKafka` run 1.
- Tag parity: Current tags: `Kafka`, `ProfileSpecificTests`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `INSERT`. Legacy setup operations: `INSERT`.
- Action parity: Current action verbs: `SELECT`. Legacy action verbs: `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `isEqualTo`. Legacy assertion helpers: `assertThat`,
  `containsOnly`, `row`.
- Cleanup parity: Current cleanup operations: none. No legacy cleanup method body was available.
- Any observed difference, however small: Normalized body similarity is low (`0.25`), so fidelity was judged from
  SQL/helper/assertion shape instead of raw text. Assertion helper names differ between legacy and current
  implementations. Current method uses parameter-injected environment helpers instead of Tempto query executors.
- Known intentional difference: None.
- Reviewer note: Matched by current suite selection: `SuiteKafka` run 1 Exact-name mapping with normalized body
  similarity `0.25`.
- Audit status: `verified`

##### `testInsertJsonTable`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/kafka/TestKafkaWritesSmokeTest.java` ->
  `testInsertJsonTable`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/kafka/TestKafkaWritesSmokeTest.java` ->
  `TestKafkaWritesSmokeTest.testInsertJsonTable`
- Mapping type: `direct`
- Environment parity: Current class requires `KafkaBasicEnvironment`. Routed by source review into `SuiteKafka` run 1.
- Tag parity: Current tags: `Kafka`, `ProfileSpecificTests`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: `INSERT`. Legacy setup operations: `INSERT`.
- Action parity: Current action verbs: `SELECT`. Legacy action verbs: `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `isEqualTo`. Legacy assertion helpers: `assertThat`,
  `containsOnly`, `row`.
- Cleanup parity: Current cleanup operations: none. No legacy cleanup method body was available.
- Any observed difference, however small: Assertion helper names differ between legacy and current implementations.
  Current method uses parameter-injected environment helpers instead of Tempto query executors.
- Known intentional difference: None.
- Reviewer note: Matched by current suite selection: `SuiteKafka` run 1 Exact-name mapping with normalized body
  similarity `0.68`.
- Audit status: `verified`
