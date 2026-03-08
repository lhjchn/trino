# Product Test Audit

This directory contains the filled lane-by-lane and suite-by-suite fidelity audit for the JUnit product test migration.

## Purpose

This directory contains the detailed lane-by-lane and suite-by-suite fidelity audit that backs the reviewer guide in:

- `PRODUCT_TESTS_REVIEWER_GUIDE.md`

## Audit status model

- `verified`: source/history review found no material unexplained drift.
- `intentional difference`: the reviewed difference is explained by the approved migration-change set or by deliberate
  SQL-file consolidation/new JUnit-side verification coverage.
- `needs follow-up`: the current source/history review found a difference or mapping issue that is not yet clearly
  justified.

## Approved intentional differences

- `HDP to Hive 3.1 migration`
- `Ignite upgrade`
- `JUnit/AssertJ/Testcontainers framework replacement`
- `Kerberos deployment cleanup without intended coverage change`
- `MySQL upgrade`
- `outside-Docker execution`

## Notes

- Every observed difference is recorded, even if minor and non-actionable.
- Lane files are the primary artifact. Suite files are derived from the lane findings plus current suite/CI source.
- Unless a lane entry says otherwise, assume the legacy test class moved from the documented legacy path to the
  documented current path.
- Legacy source coverage is not limited to Java methods. SQL-file-backed and resource-backed tests are treated as
  first-class legacy sources and should be documented as such in the owning migration audit entry.
- Resource cleanup commits are not treated as proof of porting. If a legacy SQL/resource-backed test was migrated, the
  owning migration commit should account for it explicitly; later cleanup only removes obsolete copies.
- `TestSqlCancel` remains an intentional unscheduled retirement, not a missing port.
- Current gap summary is tracked in [GAPS.md](GAPS.md) with `0` follow-up item(s).

## SQL / Resource Coverage Notes

- Old SQL-file-backed connector cases are explicitly tracked in the lane audits, not inferred from later cleanup.
- Confirmed lane patterns:
    - `mysql-mariadb`: legacy connector SQL files under `src/main/resources/sql-tests/testcases/connectors/mysql/**` are
      mapped one-by-one to inline JUnit methods in `TestMySqlSqlTests`.
    - `postgresql`: legacy connector SQL files under `src/main/resources/sql-tests/testcases/connectors/postgresql/**`
      are mapped one-by-one to inherited JUnit methods in `BasePostgresqlSqlTests`, exercised by
      `TestPostgresqlSqlTests`.
    - `parquet`: legacy query resources removed in `Migrate TestParquet to JUnit` are accounted for in
      `TestParquetJunit`; specific absorbed files are documented in the Parquet lane entry.
- The later cleanup/removal of the old `src/main/resources/sql-tests/**` tree is not treated as a migration event by
  itself.

## Indexes

- [Lane Index](lanes/INDEX.md)
- [Suite Index](suites/INDEX.md)
- [Gap Summary](GAPS.md)
