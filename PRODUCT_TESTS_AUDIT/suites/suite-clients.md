# Suite Audit: SuiteClients

## Suite Summary

- Purpose: JUnit suite for Clients coverage.
- Owning lane: `jdbc`
- Current suite class: `testing/trino-product-tests/src/test/java/io/trino/tests/product/suite/SuiteClients.java`
- CI bucket: `bucket-3`

## Environment Runs

### Run 1

- Run name: `default`
- Environment: `JdbcBasicEnvironment`
- Include tags: `Jdbc`.
- Exclude tags: `ProfileSpecificTests`.
- Expected mapped classes covered: `TestJdbc`, `TestPreparedStatements`, `TestJmxConnectorJunit`.
- Expected mapped methods covered: `22` method(s).

### Run 2

- Run name: `default`
- Environment: `CliEnvironment`
- Include tags: `Cli`.
- Exclude tags: none.
- Expected mapped classes covered: `TestTrinoCli`.
- Expected mapped methods covered: `28` method(s).

## CI Wiring

- `pt-junit` bucket in `.github/workflows/ci.yml`: `bucket-3`
- Special secret/credential gate: None.
- Legacy launcher suite removed: `Remove legacy SuiteClients`
- Later extended in lane(s): `clients`.

## Parity Checklist

- Legacy suite or lane source: `jdbc` lane and the corresponding legacy launcher coverage.
- Current suite class: `SuiteClients`
- Explicit runs and environments: verified from current suite source.
- Include tags: verified from current suite source.
- Exclude tags: verified from current suite source.
- Expected migrated class count: `4`
- Expected migrated method count: `50`
- Expected migrated classes covered: `TestJdbc`, `TestJmxConnectorJunit`, `TestPreparedStatements`, `TestTrinoCli`.
- Expected migrated methods covered: `TestJdbc.shouldExecuteQuery`,
  `TestJdbc.shouldExecuteQueryWithSelectedCatalogAndSchema`, `TestJdbc.shouldGetColumns`, `TestJdbc.shouldGetSchemas`,
  `TestJdbc.shouldGetTableTypes`, `TestJdbc.shouldGetTables`, `TestJdbc.shouldInsertSelectQuery`,
  `TestJdbc.shouldSetLocale`, `TestJdbc.shouldSetTimezone`, `TestJdbc.testDeallocate`, `TestJdbc.testSessionProperties`,
  `TestJmxConnectorJunit.selectFromJavaOperatingSystemJmxMBean`, `TestJmxConnectorJunit.selectFromJavaRuntimeJmxMBean`,
  `TestPreparedStatements.executeImmediateInsertSql`, `TestPreparedStatements.executeImmediateSelectSql`,
  `TestPreparedStatements.executeImmediateVarbinarySql`, `TestPreparedStatements.preparedInsertApi`,
  `TestPreparedStatements.preparedInsertSql`, `TestPreparedStatements.preparedInsertVarbinaryApi`,
  `TestPreparedStatements.preparedInsertVarbinarySql`, `TestPreparedStatements.preparedSelectApi`,
  `TestPreparedStatements.preparedSelectSql`, `TestTrinoCli.shouldDescribeTable`, `TestTrinoCli.shouldDisplayVersion`,
  `TestTrinoCli.shouldExecuteEmptyListOfStatements`, `TestTrinoCli.shouldExitOnErrorFromExecute`,
  `TestTrinoCli.shouldExitOnErrorFromFile`, `TestTrinoCli.shouldExitWithErrorOnUnknownPropertiesInConfigFile`,
  `TestTrinoCli.shouldHandleConfigEnvVariable`, `TestTrinoCli.shouldHandleSession` ....
- Parity status: `verified`
