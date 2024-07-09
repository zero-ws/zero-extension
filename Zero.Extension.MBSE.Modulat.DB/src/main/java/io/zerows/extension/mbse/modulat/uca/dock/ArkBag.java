package io.zerows.extension.mbse.modulat.uca.dock;

import io.horizon.uca.cache.Cc;
import io.modello.eon.em.EmModel;
import io.vertx.core.Future;
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.JsonObject;
import io.vertx.core.shareddata.ClusterSerializable;
import io.vertx.up.eon.KName;
import io.vertx.up.unity.Ux;
import io.zerows.extension.mbse.modulat.domain.tables.daos.BBagDao;
import io.zerows.extension.mbse.modulat.domain.tables.pojos.BBag;
import io.zerows.extension.runtime.skeleton.eon.em.TypeBag;

import java.util.Set;

import static io.zerows.extension.mbse.modulat.util.Bk.LOG;

class ArkBag extends AbstractArk {
    /*
     * B_BAG 专用数据存储结构，以及 B_BAG 核心缓存结构，用于加载 X_BAG 中的基础数据
     * ENTRY = true AND ENTRY_ID __ NOT NULL
     *
     * 这种场景下会为所有的 modules 构造 ( Bag = App ) 的基础入口配置，而页面模型则会直接在
     */
    private static final Cc<String, Future<JsonArray>> ASYNC_BAG_DATA = Cc.openA();

    @Override
    public Future<ClusterSerializable> modularize(final String appId, final EmModel.By by) {
        return ASYNC_BAG_DATA.pick(() -> {
            final Set<TypeBag> typeSet = Set.of(TypeBag.EXTENSION, TypeBag.COMMERCE, TypeBag.FOUNDATION);
            final JsonObject condition = this.buildQr(appId, typeSet, by);
            condition.put(KName.ENTRY, Boolean.TRUE);
            LOG.Spi.info(this.getClass(), "Modulat condition = {0}", condition.encode());
            return Ux.Jooq.on(BBagDao.class).<BBag>fetchAsync(condition)
                // JsonArray -> ClusterSerializable
                .compose(Ux::futureA);
        }, appId).compose(Ux::future);
    }
}
