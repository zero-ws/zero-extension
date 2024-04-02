package cn.vertxup.tpl.service;

import cn.vertxup.tpl.domain.tables.pojos.MyNotify;
import io.vertx.core.Future;
import io.vertx.core.json.JsonObject;
import io.vertx.mod.ke.cv.em.OwnerType;

/**
 * @author lang : 2024-04-02
 */
public interface NotifyStub {

    Future<MyNotify> fetchNotify(OwnerType ownerType, String owner);

    Future<MyNotify> saveNotify(OwnerType ownerType, String owner, JsonObject data);
}
