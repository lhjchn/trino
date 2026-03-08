# Suite Audit: SuiteAllConnectorsSmoke

## Suite Summary

- Purpose: JUnit suite for AllConnectorsSmoke coverage.
- Owning lane: `all-connectors-smoke`
- Current suite class:
  `testing/trino-product-tests/src/test/java/io/trino/tests/product/suite/SuiteAllConnectorsSmoke.java`
- CI bucket: `bucket-2`

## Environment Runs

### Run 1

- Run name: `default`
- Environment: `AllConnectorsSmokeEnvironment`
- Include tags: `AllConnectorsSmoke`.
- Exclude tags: none.
- Expected mapped classes covered: none from the audited product-test classes.
- Expected mapped methods covered: `0` method(s).

## CI Wiring

- `pt-junit` bucket in `.github/workflows/ci.yml`: `bucket-2`
- Special secret/credential gate: None.
- Legacy launcher suite removed: `Remove legacy SuiteAllConnectorsSmoke`

## Parity Checklist

- Legacy suite or lane source: `all-connectors-smoke` lane and the corresponding legacy launcher coverage.
- Current suite class: `SuiteAllConnectorsSmoke`
- Explicit runs and environments: verified from current suite source.
- Include tags: verified from current suite source.
- Exclude tags: verified from current suite source.
- Expected migrated class count: `0`
- Expected migrated method count: `0`
- Expected migrated classes covered: none.
- Expected migrated methods covered: none.
- Parity status: `verified`
