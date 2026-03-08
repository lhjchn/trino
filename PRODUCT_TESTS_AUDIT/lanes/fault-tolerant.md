# Lane Audit: Fault Tolerant

## Lane Summary

- Audit status: `completed`
- Section start commit: `Add FaultTolerant environment`
- Section end commit: `Migrate TestTaskRetriesFilesystemSmoke to JUnit`
- Introduced JUnit suites: `SuiteFaultTolerant`.
- Extended existing suites: none.
- Retired legacy suites: none.
- Environment classes introduced: `FaultTolerantEnvironment`.
- Method status counts: verified `1`, intentional difference `0`, needs follow-up `0`.

## Lane-Level Open Questions / Intentional Differences

- Lane-wide approved difference set: none beyond the framework baseline documented in the reviewer guide.
- Needs-follow-up methods: none currently identified in this source/history pass.

## Ported Test Classes

### `TestTaskRetriesFilesystemSmoke`

- Owning migration commit: `Migrate TestTaskRetriesFilesystemSmoke to JUnit`
- Current class added in same migration commit:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/faulttolerant/TestTaskRetriesFilesystemSmoke.java`
- Legacy class removed in same migration commit:
  -
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/faulttolerant/TestTaskRetriesFilesystemSmoke.java`
- Class-level environment requirement: `FaultTolerantEnvironment`.
- Class-level tags: `FaultTolerant`.
- Method inventory complete: Yes. Legacy methods: `1`. Current methods: `1`.
- Legacy helper/resource dependencies accounted for: Legacy class source reviewed directly.
- Intentional differences summary: None identified at class scope.
- Method statuses present: `verified`.

#### Methods

##### `testSimpleQuery`

- Legacy source method:
  `testing/trino-product-tests/src/main/java/io/trino/tests/product/faulttolerant/TestTaskRetriesFilesystemSmoke.java` ->
  `testSimpleQuery`
- Current target method:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/faulttolerant/TestTaskRetriesFilesystemSmoke.java` ->
  `TestTaskRetriesFilesystemSmoke.testSimpleQuery`
- Mapping type: `direct`
- Environment parity: Current class requires `FaultTolerantEnvironment`. Routed by source review into
  `SuiteFaultTolerant` run 1.
- Tag parity: Current tags: `FaultTolerant`. Tag routing matches the current suite selection.
- Setup parity: Current setup operations: none. Legacy setup operations: none.
- Action parity: Current action verbs: `SELECT`. Legacy action verbs: `SELECT`.
- Assertion parity: Current assertion helpers: `assertThat`, `containsOnly`, `row`. Legacy assertion helpers:
  `assertThat`, `isEqualTo`.
- Cleanup parity: Current cleanup operations: none. No legacy cleanup method body was available.
- Any observed difference, however small: Assertion helper names differ between legacy and current implementations.
  Current method uses parameter-injected environment helpers instead of Tempto query executors.
- Known intentional difference: None.
- Reviewer note: Matched by current suite selection: `SuiteFaultTolerant` run 1 Exact-name mapping with normalized body
  similarity `0.66`.
- Audit status: `verified`
