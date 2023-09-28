package cn.vertxup.ambient.api.linkage;

import cn.vertxup.ambient.domain.tables.daos.XTagDao;
import cn.vertxup.ambient.domain.tables.pojos.RTagObject;
import cn.vertxup.ambient.service.linkage.TagStub;
import io.vertx.core.Future;
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.JsonObject;
import io.vertx.mod.ambient.cv.Addr;
import io.vertx.up.annotations.Address;
import io.vertx.up.annotations.Me;
import io.vertx.up.annotations.Queue;
import io.vertx.up.eon.KName;
import io.vertx.up.unity.Ux;
import io.vertx.up.util.Ut;
import jakarta.inject.Inject;

import java.util.Set;

/**
 * @author lang : 2023-09-28
 */
@Queue
public class TagActor {

    @Inject
    private transient TagStub stub;

    @Address(Addr.Tag.SYNC_SAVE)
    @Me
    public Future<JsonObject> saveAsync(final JsonObject body) {
        return this.stub.saveAsync(body);
    }

    @Address(Addr.Tag.SYNC_DELETE)
    public Future<Boolean> deleteAsync(final String key) {
        return this.stub.deleteAsync(key);
    }

    @Address(Addr.Tag.FETCH_BY_MODEL)
    public Future<JsonArray> fetchByModel(final String modelId,
                                          final String modelKey) {
        return this.stub.fetchAsync(modelId, modelKey)
            .compose(tagObjects -> {
                final Set<String> keys = Ut.valueSetString(tagObjects, RTagObject::getTagId);
                return Ux.future(Ut.toJArray(keys));
            })
            .compose(keySet -> Ux.Jooq.on(XTagDao.class).fetchInAsync(KName.KEY, keySet))
            .compose(Ux::futureA);
    }
}
