package io.mature.extension.migration.restore;

import io.horizon.eon.em.Environment;
import io.mature.extension.migration.tookit.AbstractStatic;
import io.vertx.core.Future;
import io.vertx.core.json.JsonObject;
import io.vertx.up.fn.Fn;
import io.vertx.up.unity.Ux;
import io.vertx.up.util.Ut;
import io.zerows.core.feature.database.atom.Database;
import io.zerows.core.feature.database.cp.zdk.DataPool;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.MessageFormat;
import java.util.HashSet;
import java.util.Set;

import static io.mature.extension.refine.Ox.LOG;

public class MetaCleaner extends AbstractStatic {
    public MetaCleaner(final Environment environment) {
        super(environment);
    }

    @Override
    public Future<JsonObject> procAsync(final JsonObject config) {
        this.banner("002.1. 清除原始数据");
        /*
         * 读取当前 DataPool
         */
        final DataPool pool = DataPool.create();
        return Fn.failOr(() -> {
            /*
             * 获取连接
             */
            final Connection connection = pool.getDataSource().getConnection();
            final Set<String> tables = this.toTables(connection);
            /*
             * SQL statements
             */
            tables.forEach(this::tableEmpty);
            /*
             * 执行
             */
            LOG.Shell.info(this.getClass(), "表数据清除完成，数量：{0}", String.valueOf(tables.size()));
            return Ux.future(config);
        });
    }

    private Set<String> toTables(final Connection connection) throws SQLException {
        final String tpl = "SELECT TABLE_NAME FROM information_schema.tables WHERE TABLE_SCHEMA = ''{0}'';";
        final Database database = Database.getCurrent();
        final String sql = MessageFormat.format(tpl, database.getInstance());

        final Statement statement = connection.createStatement();
        final ResultSet res = statement.executeQuery(sql);
        final Set<String> tableNames = new HashSet<>();
        while (res.next()) {
            final String name = res.getString("TABLE_NAME");
            if (Ut.isNotNil(name)) {
                tableNames.add(name);
            }
        }
        return tableNames;
    }
}
