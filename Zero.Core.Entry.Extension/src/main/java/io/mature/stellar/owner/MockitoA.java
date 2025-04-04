package io.mature.stellar.owner;

import io.horizon.eon.em.Environment;
import io.horizon.eon.spec.VWeb;
import io.mature.stellar.vendor.OkB;
import io.vertx.core.json.JsonObject;
import io.vertx.up.util.Ut;
import io.zerows.core.feature.database.atom.Database;

/**
 * @author lang : 2023-06-13
 */
public class MockitoA extends AbstractPartyA {
    public MockitoA() {
        super(Environment.Mockito);
    }

    /**
     * Mock环境中的数据库信息可能来自文件部分
     *
     * @return 数据库配置信息
     */
    @Override
    public Database configDatabase() {
        final Database database = new Database();
        final String path = VWeb.runtime.environment.ofDatabase(this.environment());
        final JsonObject item = Ut.ioJObject(path);
        if (Ut.isNotNil(item)) {
            database.fromJson(item);
        }
        return database;
    }

    /**
     * Mock环境中的集成相关信息可能来自文件
     */
    @Override
    public OkB partyB(final String name) {
        final OkB okB = super.partyB(name);
        final String path = VWeb.runtime.environment.ofIntegration(this.environment());
        final JsonObject item = Ut.ioJObject(path + name + ".json");
        if (Ut.isNotNil(item)) {
            okB.configIntegration().fromJson(item);
            okB.configIntegration().mockOn();
        }
        return okB;
    }
}
