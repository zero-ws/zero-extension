package io.vertx.mod.crud.uca.dao;

import io.aeon.experiment.specification.KModule;
import io.vertx.core.Future;
import io.vertx.core.json.JsonObject;
import io.vertx.mod.crud.init.IxPin;
import io.vertx.mod.crud.uca.desk.IxMod;
import io.vertx.up.uca.jooq.UxJoin;
import io.vertx.up.uca.jooq.UxJooq;

import java.util.function.Function;

/**
 * 针对底层的 SELECT 搜索操作，此处的条件支持完整的 Qr 查询引擎语法
 *
 * @author lang : 2023-08-03
 */
class OperateSearch implements Operate<JsonObject, JsonObject> {

    @Override
    public Function<JsonObject, Future<JsonObject>> annexFn(final IxMod in) {
        return condition -> {
            // KModule
            if (in.canJoin()) {


                // Join 模式，此种情况下 in.connected() 不可能为 null
                final KModule connect = in.connected();
                final UxJoin join = IxPin.join(in, connect);
                return join.searchAsync(condition);
            } else {


                // Direct 模式
                final UxJooq jooq = IxPin.jooq(in);
                return jooq.searchAsync(condition);
            }
        };
    }
}
