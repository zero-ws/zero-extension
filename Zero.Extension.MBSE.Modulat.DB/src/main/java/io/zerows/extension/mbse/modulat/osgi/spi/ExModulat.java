package io.zerows.extension.mbse.modulat.osgi.spi;

import io.vertx.core.Future;
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.JsonObject;
import io.vertx.up.eon.KName;
import io.vertx.up.unity.Ux;
import io.zerows.extension.mbse.modulat.uca.dock.Ark;
import io.zerows.extension.runtime.skeleton.osgi.spi.modeler.Modulat;

import java.util.Objects;

/**
 * @author <a href="http://www.origin-x.cn">Lang</a>
 */
public class ExModulat implements Modulat {
    @Override
    public Future<JsonObject> extension(final JsonObject appJson) {
        final String key = appJson.getString(KName.KEY);
        return this.extension(key).compose(moduleJ -> {
            /*
             * appJ + moduleJ to build response ( Final )
             */
            final JsonObject original = moduleJ.copy();
            original.mergeIn(appJson, true);
            return Ux.future(original);
        });
    }

    /*
     * {
     *     "configKey1": {},
     *     "configKey2": {}
     * }
     */
    @Override
    public Future<JsonObject> extension(final String appId) {
        Objects.requireNonNull(appId);
        final JsonObject appJ = new JsonObject();
        // 解决无法连接导致AppId为空的问题
        appJ.put(KName.KEY, appId);
        return Ark.configure().modularize(appId)
            .compose(moduleJ -> {
                appJ.mergeIn((JsonObject) moduleJ, true);
                return Ux.future(appJ);
            })
            .compose(nil -> Ark.bag().modularize(appId))
            .compose(bagJ -> {
                final JsonArray bags = (JsonArray) bagJ;
                appJ.put(KName.App.BAGS, bags);
                return Ux.future(appJ);
            });
    }
}
