package io.zerows.extension.mbse.modulat.uca.dock;

import io.horizon.uca.cache.Cc;
import io.modello.eon.em.EmModel;
import io.vertx.core.Future;
import io.vertx.core.json.JsonObject;
import io.vertx.core.shareddata.ClusterSerializable;
import io.vertx.up.eon.KName;
import io.vertx.up.fn.Fn;
import io.vertx.up.unity.Ux;
import io.vertx.up.util.Ut;
import io.zerows.extension.mbse.modulat.domain.tables.daos.BBagDao;
import io.zerows.extension.mbse.modulat.domain.tables.pojos.BBag;
import io.zerows.extension.runtime.skeleton.eon.em.TypeBag;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

import static io.zerows.extension.mbse.modulat.util.Bk.LOG;

class ArkConfigure extends AbstractArk {

    /*
     * 该方法会提取应用存储专用的配置信息，该配置信息会被存储到 B_BLOCK 表中，开发中心可修订
     * 配置程序，如：
     * {
     *     "store": "mXXX"
     * }
     * 格式，最终使用时用
     * mXXX = configuration
     * 的 JSON 格式
     *
     * 输入的格式
     */
    private static final Cc<String, Future<JsonObject>> ASYNC_BAG_ADMIN = Cc.openA();

    @Override
    public Future<ClusterSerializable> modularize(final String appId, final EmModel.By by) {
        return ASYNC_BAG_ADMIN.pick(() -> {
            final JsonObject condition = this.buildQr(appId, TypeBag.EXTENSION, by);
            /*
             * 新路由中，BAG直接提取 EXTENSION 类型的模型即可
             * parentId __ NULL 在旧版本中是可行的，旧版本没有入口根包的概念
             * 新版本中多了入口根包概念，所以就不可以使用这个条件了，否则会导致BLOCK
             * 为空。
             */
            condition.put(KName.PARENT_ID + ",n", null);
            LOG.Spi.info(this.getClass(), "Modulat condition = {0}", condition.encode());
            return Ux.Jooq.on(BBagDao.class).<BBag>fetchAsync(condition).compose(bags -> {
                final ConcurrentMap<String, Future<JsonObject>> futures = new ConcurrentHashMap<>();
                bags.forEach(bag -> {
                    final JsonObject uiConfig = Ut.toJObject(bag.getUiConfig());
                    final String configKey = Ut.valueString(uiConfig, KName.STORE);
                    if (Ut.isNotNil(configKey)) {
                        futures.put(configKey, this.configureBag(bag));
                    }
                });
                return Fn.combineM(futures);
            }).compose(map -> {
                final JsonObject result = Ut.toJObject(map);
                return Ux.future(result);
            });
        }, appId).compose(Ux::future);
    }
}
