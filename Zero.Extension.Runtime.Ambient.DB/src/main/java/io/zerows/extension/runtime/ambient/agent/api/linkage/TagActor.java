package io.zerows.extension.runtime.ambient.agent.api.linkage;

import io.vertx.core.Future;
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.JsonObject;
import io.vertx.up.annotations.Address;
import io.vertx.up.annotations.Me;
import io.vertx.up.annotations.Queue;
import io.vertx.up.eon.KName;
import io.vertx.up.unity.Ux;
import io.vertx.up.util.Ut;
import io.zerows.core.feature.database.jooq.operation.UxJooq;
import io.zerows.extension.runtime.ambient.agent.service.linkage.TagStub;
import io.zerows.extension.runtime.ambient.domain.tables.daos.RTagObjectDao;
import io.zerows.extension.runtime.ambient.domain.tables.daos.XTagDao;
import io.zerows.extension.runtime.ambient.domain.tables.pojos.RTagObject;
import io.zerows.extension.runtime.ambient.eon.Addr;
import jakarta.inject.Inject;

import java.util.List;
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

    @Address(Addr.Tag.MODEL_OF_FETCH)
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

    @Address(Addr.Tag.MODEL_OF_TAGS)
    public Future<JsonArray> linkAsync(final String modelId,
                                       final String modelKey,
                                       final JsonArray body) {
        final UxJooq jq = Ux.Jooq.on(RTagObjectDao.class);
        // 先删除
        final JsonObject qr = Ux.whereAnd();
        qr.put("entityType", modelId);
        qr.put(KName.ENTITY_ID, modelKey);
        return jq.deleteByAsync(qr).compose(removed -> {
            // 插入新的
            final JsonArray data = new JsonArray();
            Ut.itJString(body).map(tagId -> {
                final JsonObject item = new JsonObject();
                item.put("tagId", tagId);
                item.put("entityType", modelId);
                item.put(KName.ENTITY_ID, modelKey);
                return item;
            }).forEach(data::add);

            // 新建关联
            final List<RTagObject> links = Ux.fromJson(data, RTagObject.class);
            return jq.insertAsync(links);
        }).compose(Ux::futureA);
    }

    @Address(Addr.Tag.MODEL_OF_REMOVE)
    public Future<Boolean> unlinkAsync(final String modelId,
                                       final String modelKey,
                                       final String tagId) {
        final JsonObject qr = Ux.whereAnd();
        qr.put("entityType", modelId);
        qr.put(KName.ENTITY_ID, modelKey);
        qr.put("tagId", tagId);
        return Ux.Jooq.on(RTagObjectDao.class).deleteByAsync(qr);
    }
}
