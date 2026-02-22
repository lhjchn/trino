#!/usr/bin/env bash

set -euxo pipefail

/usr/bin/mysqld_safe &
while ! mysqladmin ping -proot --silent; do sleep 1; done

hive --service metatool -updateLocation "abfs://${ABFS_CONTAINER}@${ABFS_ACCOUNT}.dfs.core.windows.net/${ABFS_SCHEMA}" hdfs://hadoop-master:9000/user/hive/warehouse

<<<<<<< HEAD:testing/trino-product-tests-launcher/src/main/resources/docker/trino-product-tests/conf/environment/multinode-azure/update-location.sh
killall mariadbd || true
killall mysqld_safe || true
while pgrep -x mariadbd >/dev/null || pgrep -x mysqld_safe >/dev/null; do sleep 1; done
||||||| parent of f71bf0b0466 (fixup! Add Azure environment):testing/trino-product-tests/src/test/resources/docker/trino-product-tests/conf/environment/multinode-azure/update-location.sh
killall mysqld || true
while pgrep mysqld; do sleep 1; done
=======
killall mariadbd || true
killall mysqld_safe || true
while pgrep -x mariadbd >/dev/null || pgrep -x mysqld_safe >/dev/null; do sleep 1; done
>>>>>>> f71bf0b0466 (fixup! Add Azure environment):testing/trino-product-tests/src/test/resources/docker/trino-product-tests/conf/environment/multinode-azure/update-location.sh
