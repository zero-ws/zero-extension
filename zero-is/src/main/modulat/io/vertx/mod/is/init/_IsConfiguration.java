package io.vertx.mod.is.init;

import io.horizon.runtime.Macrocosm;
import io.macrocosm.specification.app.HAmbient;
import io.vertx.core.json.JsonObject;
import io.vertx.mod.is.atom.IsConfig;
import io.vertx.mod.is.cv.IsFolder;
import io.vertx.mod.ke.cv.KeIpc;
import io.vertx.mod.ke.cv.KeMsg;
import io.vertx.mod.ke.refine.Ke;
import io.vertx.up.util.Ut;

import java.util.Objects;

import static io.vertx.mod.is.refine.Is.LOG;

/**
 * @author <a href="http://www.origin-x.cn">Lang</a>
 */
final class IsConfiguration {
    private static final JsonObject CONFIG_DATA = new JsonObject();
    private static IsConfig CONFIG = null;

    static void registry(final HAmbient ambient) {
        initialize();

        final String module = Ke.getExtension(KeIpc.Module.IS);
        LOG.Init.info(IsConfiguration.class, KeMsg.Configuration.DATA_J,
            module, CONFIG_DATA.encode());

        ambient.registry(module, CONFIG_DATA);
    }

    private static void initialize() {
        if (Objects.isNull(CONFIG)) {
            final JsonObject configData = Ut.ioJObject(IsFolder.CONFIG_FILE);
            CONFIG_DATA.mergeIn(configData, true);

            CONFIG = Ut.deserialize(configData, IsConfig.class);
            LOG.Init.info(IsConfiguration.class, KeMsg.Configuration.DATA_T, CONFIG.toString());
            {
                // 新环境变量 Z_SIS_STORE
                final String storeRoot = Ut.envWith(Macrocosm.SIS_STORE, CONFIG.getStoreRoot());
                CONFIG.setStoreRoot(storeRoot);
                LOG.Init.info(IsConfiguration.class, "Is StoreRoot = {0}", storeRoot);
            }
        }
    }

    static IsConfig getConfig() {
        initialize();
        
        return CONFIG;
    }
}
