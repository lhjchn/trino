# Suite Audit: SuiteIceberg

## Suite Summary

- Purpose: JUnit suite for Iceberg coverage.
- Owning lane: `iceberg`
- Current suite class: `testing/trino-product-tests/src/test/java/io/trino/tests/product/suite/SuiteIceberg.java`
- CI bucket: `bucket-7`

## Environment Runs

### Run 1

- Run name: `default`
- Environment: `SparkIcebergEnvironment`
- Include tags: `Iceberg`.
- Exclude tags: `IcebergFormatVersionCompatibility`, `StorageFormats`.
- Expected mapped classes covered: `TestCreateDropSchema`, `TestIcebergInsert`, `TestIcebergOptimize`,
  `TestIcebergPartitionEvolution`, `TestIcebergProcedureCalls`, `TestIcebergSparkCompatibility`,
  `TestIcebergSparkDropTableCompatibility`.
- Expected mapped methods covered: `111` method(s).

### Run 2

- Run name: `default`
- Environment: `HiveIcebergRedirectionsEnvironment`
- Include tags: `HiveIcebergRedirections`.
- Exclude tags: none.
- Expected mapped classes covered: `TestHiveRedirectionToIceberg`, `TestIcebergHiveMetadataListing`,
  `TestIcebergHiveViewsCompatibility`, `TestIcebergRedirectionToHive`.
- Expected mapped methods covered: `57` method(s).

### Run 3

- Run name: `default`
- Environment: `SparkIcebergRestEnvironment`
- Include tags: `IcebergRest`.
- Exclude tags: none.
- Expected mapped classes covered: none from the audited product-test classes.
- Expected mapped methods covered: `0` method(s).

### Run 4

- Run name: `default`
- Environment: `SparkIcebergJdbcCatalogEnvironment`
- Include tags: `IcebergJdbc`.
- Exclude tags: none.
- Expected mapped classes covered: none from the audited product-test classes.
- Expected mapped methods covered: `0` method(s).

### Run 5

- Run name: `default`
- Environment: `SparkIcebergNessieEnvironment`
- Include tags: `IcebergNessie`.
- Exclude tags: none.
- Expected mapped classes covered: none from the audited product-test classes.
- Expected mapped methods covered: `0` method(s).

### Run 6

- Run name: `default`
- Environment: `MultiNodeIcebergMinioCachingEnvironment`
- Include tags: `IcebergAlluxioCaching`.
- Exclude tags: `StorageFormats`.
- Expected mapped classes covered: `TestIcebergAlluxioCaching`.
- Expected mapped methods covered: `1` method(s).

## CI Wiring

- `pt-junit` bucket in `.github/workflows/ci.yml`: `bucket-7`
- Special secret/credential gate: None.
- Legacy launcher suite removed: `Remove legacy SuiteIceberg`

## Parity Checklist

- Legacy suite or lane source: `iceberg` lane and the corresponding legacy launcher coverage.
- Current suite class: `SuiteIceberg`
- Explicit runs and environments: verified from current suite source.
- Include tags: verified from current suite source.
- Exclude tags: verified from current suite source.
- Expected migrated class count: `12`
- Expected migrated method count: `169`
- Expected migrated classes covered: `TestCreateDropSchema`, `TestHiveRedirectionToIceberg`,
  `TestIcebergAlluxioCaching`, `TestIcebergHiveMetadataListing`, `TestIcebergHiveViewsCompatibility`,
  `TestIcebergInsert`, `TestIcebergOptimize`, `TestIcebergPartitionEvolution`, `TestIcebergProcedureCalls`,
  `TestIcebergRedirectionToHive`, `TestIcebergSparkCompatibility`, `TestIcebergSparkDropTableCompatibility`.
- Expected migrated methods covered: `TestCreateDropSchema.testDropSchemaFiles`,
  `TestCreateDropSchema.testDropSchemaFilesWithLocation`, `TestCreateDropSchema.testDropWithExternalFiles`,
  `TestCreateDropSchema.testDropWithExternalFilesInSubdirectory`,
  `TestHiveRedirectionToIceberg.testAlterTableAddColumn`, `TestHiveRedirectionToIceberg.testAlterTableDropColumn`,
  `TestHiveRedirectionToIceberg.testAlterTableRename`, `TestHiveRedirectionToIceberg.testAlterTableRenameColumn`,
  `TestHiveRedirectionToIceberg.testCommentColumn`, `TestHiveRedirectionToIceberg.testCommentTable`,
  `TestHiveRedirectionToIceberg.testDelete`, `TestHiveRedirectionToIceberg.testDeny`,
  `TestHiveRedirectionToIceberg.testDescribe`, `TestHiveRedirectionToIceberg.testDropTable`,
  `TestHiveRedirectionToIceberg.testGrant`, `TestHiveRedirectionToIceberg.testInformationSchemaColumns`,
  `TestHiveRedirectionToIceberg.testInsert`, `TestHiveRedirectionToIceberg.testMerge`,
  `TestHiveRedirectionToIceberg.testRedirect`, `TestHiveRedirectionToIceberg.testRedirectPartitionsToPartitioned`,
  `TestHiveRedirectionToIceberg.testRedirectPartitionsToUnpartitioned`,
  `TestHiveRedirectionToIceberg.testRedirectToNonexistentCatalog`,
  `TestHiveRedirectionToIceberg.testRedirectWithDefaultSchemaInSession`,
  `TestHiveRedirectionToIceberg.testRedirectWithNonDefaultSchema`, `TestHiveRedirectionToIceberg.testRevoke`,
  `TestHiveRedirectionToIceberg.testSetTableAuthorization`, `TestHiveRedirectionToIceberg.testShowCreateTable`,
  `TestHiveRedirectionToIceberg.testShowGrants`, `TestHiveRedirectionToIceberg.testShowStats`,
  `TestHiveRedirectionToIceberg.testSystemJdbcColumns` ....
- Parity status: `verified`
