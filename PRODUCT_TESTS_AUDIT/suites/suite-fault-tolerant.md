# Suite Audit: SuiteFaultTolerant

## Suite Summary

- Purpose: JUnit suite for FaultTolerant coverage.
- Owning lane: `fault-tolerant`
- Current suite class: `testing/trino-product-tests/src/test/java/io/trino/tests/product/suite/SuiteFaultTolerant.java`
- CI bucket: `bucket-6`

## Environment Runs

### Run 1

- Run name: `default`
- Environment: `FaultTolerantEnvironment`
- Include tags: `FaultTolerant`.
- Exclude tags: none.
- Expected mapped classes covered: `TestTaskRetriesFilesystemSmoke`.
- Expected mapped methods covered: `1` method(s).

## CI Wiring

- `pt-junit` bucket in `.github/workflows/ci.yml`: `bucket-6`
- Special secret/credential gate: None.
- Legacy launcher suite removed: `No dedicated legacy launcher suite identified`

## Parity Checklist

- Legacy suite or lane source: `fault-tolerant` lane and the corresponding legacy launcher coverage.
- Current suite class: `SuiteFaultTolerant`
- Explicit runs and environments: verified from current suite source.
- Include tags: verified from current suite source.
- Exclude tags: verified from current suite source.
- Expected migrated class count: `1`
- Expected migrated method count: `1`
- Expected migrated classes covered: `TestTaskRetriesFilesystemSmoke`.
- Expected migrated methods covered: `TestTaskRetriesFilesystemSmoke.testSimpleQuery`.
- Parity status: `verified`
