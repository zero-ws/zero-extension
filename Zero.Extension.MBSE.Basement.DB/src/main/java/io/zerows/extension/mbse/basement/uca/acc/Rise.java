package io.zerows.extension.mbse.basement.uca.acc;

import io.horizon.uca.cache.Cc;
import io.vertx.core.Future;
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.JsonObject;
import io.zerows.extension.mbse.basement.atom.builtin.DataAtom;
import io.zerows.core.domain.atom.commune.dynamic.Apt;
import io.zerows.core.feature.database.atom.Database;

/**
 * @author <a href="http://www.origin-x.cn">Lang</a>
 */
interface Pool {
    Cc<String, Rise> CC_RISE = Cc.openThread();
}

/**
 * @author <a href="http://www.origin-x.cn">Lang</a>
 */
public interface Rise {

    static Rise rapid() {
        return Pool.CC_RISE.pick(RiseRapid::new); // Fn.po?lThread(Pool.POOL_RAPID, RiseRapid::new);
    }

    Rise bind(Database database);

    /*
     * 读取增量结果
     * ADD - 新增
     * UPDATE - 更新
     * DELETE - 删除
     */
    Future<Apt> fetchBatch(JsonObject criteria, DataAtom atom);

    Future<Boolean> writeData(String key, JsonArray data, DataAtom atom);
}
