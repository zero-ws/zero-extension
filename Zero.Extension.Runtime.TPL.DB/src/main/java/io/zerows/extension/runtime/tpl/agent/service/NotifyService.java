package io.zerows.extension.runtime.tpl.agent.service;

import io.vertx.core.Future;
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.JsonObject;
import io.vertx.up.eon.KName;
import io.vertx.up.unity.Ux;
import io.zerows.extension.runtime.skeleton.eon.em.OwnerType;
import io.zerows.extension.runtime.skeleton.osgi.spi.business.ExUser;
import io.zerows.extension.runtime.tpl.domain.tables.daos.MyNotifyDao;
import io.zerows.extension.runtime.tpl.domain.tables.pojos.MyNotify;

import java.util.Objects;

/**
 * @author lang : 2024-04-02
 */
public class NotifyService implements NotifyStub {

    @Override
    public Future<MyNotify> fetchNotify(final OwnerType ownerType, final String owner) {
        return this.fetchNotifyInternal(ownerType, owner).compose(notify -> {
            if (Objects.isNull(notify)) {
                return this.fetchNotifyInternal(owner);
            }
            return Ux.future(notify);
        });
    }

    private Future<MyNotify> fetchNotifyInternal(final String userId) {
        return Ux.channel(ExUser.class, JsonArray::new, stub -> stub.userRole(userId))
            .compose(roleIds -> {
                final JsonObject condition = Ux.whereAnd();
                condition.put(KName.OWNER_TYPE, OwnerType.ROLE.name());
                condition.put(KName.OWNER_ID + ",i", roleIds);
                return Ux.Jooq.on(MyNotifyDao.class).<MyNotify>fetchAsync(condition);
            })
            .compose(roles -> {
                if (Objects.isNull(roles) || roles.isEmpty()) {
                    return Ux.future(null);
                } else {
                    // TODO: 暂时只提取第一个角色的提醒设置，后续更改
                    return Ux.future(roles.get(0));
                }
            });
    }

    public Future<MyNotify> fetchNotifyInternal(final OwnerType ownerType, final String owner) {
        final JsonObject condition = Ux.whereAnd();
        condition.put(KName.OWNER_TYPE, ownerType.name());
        condition.put(KName.OWNER_ID, owner);
        return Ux.Jooq.on(MyNotifyDao.class).fetchOneAsync(condition);
    }

    @Override
    public Future<MyNotify> saveNotify(final OwnerType ownerType, final String owner, final JsonObject data) {
        return this.fetchNotifyInternal(ownerType, owner).compose(notify -> {
            final MyNotify processed;
            if (Objects.isNull(notify)) {
                data.put(KName.OWNER_TYPE, ownerType.name());
                data.put(KName.OWNER_ID, owner);
                processed = Ux.fromJson(data, MyNotify.class);
                return Ux.Jooq.on(MyNotifyDao.class).insertAsync(processed);
            } else {
                processed = Ux.updateT(notify, data);
                return Ux.Jooq.on(MyNotifyDao.class).updateAsync(processed);
            }
        });
    }
}
