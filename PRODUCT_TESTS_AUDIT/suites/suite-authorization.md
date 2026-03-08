# Suite Audit: SuiteAuthorization

## Suite Summary

- Purpose: JUnit suite for Authorization coverage.
- Owning lane: `hive`
- Current suite class: `testing/trino-product-tests/src/test/java/io/trino/tests/product/suite/SuiteAuthorization.java`
- CI bucket: `bucket-6`

## Environment Runs

### Run 1

- Run name: `default`
- Environment: `HiveKerberosImpersonationEnvironment`
- Include tags: `Authorization`.
- Exclude tags: none.
- Expected mapped classes covered: `TestGrantRevoke`, `TestRoles`, `TestSqlStandardAccessControlChecks`.
- Expected mapped methods covered: `64` method(s).

## CI Wiring

- `pt-junit` bucket in `.github/workflows/ci.yml`: `bucket-6`
- Special secret/credential gate: None.
- Legacy launcher suite removed: `No dedicated legacy launcher suite identified`

## Parity Checklist

- Legacy suite or lane source: `hive` lane and the corresponding legacy launcher coverage.
- Current suite class: `SuiteAuthorization`
- Explicit runs and environments: verified from current suite source.
- Include tags: verified from current suite source.
- Exclude tags: verified from current suite source.
- Expected migrated class count: `3`
- Expected migrated method count: `64`
- Expected migrated classes covered: `TestGrantRevoke`, `TestRoles`, `TestSqlStandardAccessControlChecks`.
- Expected migrated methods covered: `TestGrantRevoke.testAll`, `TestGrantRevoke.testCustomRole`,
  `TestGrantRevoke.testDropRoleWithPermissionsGranted`, `TestGrantRevoke.testGrantOptionsOnGrantedPrivilege`,
  `TestGrantRevoke.testGrantRevoke`, `TestGrantRevoke.testGrantRevokeWithGrantOption`, `TestGrantRevoke.testPublic`,
  `TestGrantRevoke.testShowGrants`, `TestGrantRevoke.testTableOwnerPrivileges`,
  `TestGrantRevoke.testTablePrivilegesWithHiveOnlyViews`, `TestGrantRevoke.testTransitiveRole`,
  `TestGrantRevoke.testViewOwnerPrivileges`, `TestRoles.testAdminCanAddColumnToAnyTable`,
  `TestRoles.testAdminCanDropAnyTable`, `TestRoles.testAdminCanRenameAnyTable`,
  `TestRoles.testAdminCanRenameColumnInAnyTable`, `TestRoles.testAdminCanShowAllGrants`,
  `TestRoles.testAdminCanShowGrantsOnlyFromCurrentSchema`, `TestRoles.testAdminRoleIsGrantedToHdfs`,
  `TestRoles.testCreateDropRoleAccessControl`, `TestRoles.testCreateDuplicateRole`, `TestRoles.testCreateRole`,
  `TestRoles.testDropGrantedRole`, `TestRoles.testDropNonExistentRole`, `TestRoles.testDropRole`,
  `TestRoles.testDropTransitiveRole`, `TestRoles.testGrantRevokeRoleAccessControl`,
  `TestRoles.testGrantRoleMultipleTimes`, `TestRoles.testGrantRoleToRole`, `TestRoles.testGrantRoleToUser` ....
- Parity status: `verified`
