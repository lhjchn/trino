# Lane Audit: Tls

## Lane Summary

- Audit status: `completed`
- Section start commit: `Add TLS environment`
- Section end commit: `Migrate TestTls to JUnit`
- Introduced JUnit suites: `SuiteTls`.
- Extended existing suites: none.
- Retired legacy suites: none.
- Environment classes introduced: `TlsEnvironment`.
- Method status counts: verified `1`, intentional difference `0`, needs follow-up `0`.

## Lane-Level Open Questions / Intentional Differences

- Lane-wide approved difference set: none beyond the framework baseline documented in the reviewer guide.
- Needs-follow-up methods: none currently identified in this source/history pass.

## Ported Test Classes

### `TestTlsJunit`

- Owning migration commit: `Migrate TestTls to JUnit`
- Current class added in same migration commit:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/tls/TestTlsJunit.java`
- Legacy class removed in same migration commit:
    - `testing/trino-product-tests/src/main/java/io/trino/tests/product/TestTls.java`
- Class-level environment requirement: `TlsEnvironment`.
- Class-level tags: `ConfiguredFeatures`, `ProfileSpecificTests`, `Tls`.
- Method inventory complete: Yes. Legacy methods: `1`. Current methods: `1`.
- Legacy helper/resource dependencies accounted for: Legacy class source reviewed directly.
- Intentional differences summary: None identified at class scope.
- Method statuses present: `verified`.

#### Methods

##### `testHttpPortIsClosed`

- Legacy source method: `testing/trino-product-tests/src/main/java/io/trino/tests/product/TestTls.java` ->
  `testHttpPortIsClosed`
- Current target method: `testing/trino-product-tests/src/test/java/io/trino/tests/product/tls/TestTlsJunit.java` ->
  `TestTlsJunit.testHttpPortIsClosed`
- Mapping type: `direct`
- Environment parity: Current class requires `TlsEnvironment`. Routed by source review into `SuiteTls` run 1.
- Tag parity: Current tags: `ConfiguredFeatures`, `ProfileSpecificTests`, `Tls`. Tag routing matches the current suite
  selection.
- Setup parity: Current setup operations: none. No legacy setup method body was available.
- Action parity: Current action verbs: none. No legacy action method body was available.
- Assertion parity: Current assertion helpers: `assertThat`. Legacy assertion helpers: `assertPortIsClosed`,
  `assertPortIsOpen`, `assertThat`.
- Cleanup parity: Current cleanup operations: none. No legacy cleanup method body was available.
- Any observed difference, however small: Normalized body similarity is low (`0.18`), so fidelity was judged from
  SQL/helper/assertion shape instead of raw text. Assertion helper names differ between legacy and current
  implementations.
- Known intentional difference: None.
- Reviewer note: Matched by current suite selection: `SuiteTls` run 1 Exact-name mapping with normalized body similarity
  `0.18`.
- Audit status: `verified`
