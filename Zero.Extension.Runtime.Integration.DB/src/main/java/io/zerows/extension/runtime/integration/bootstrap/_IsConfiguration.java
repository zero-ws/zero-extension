package io.zerows.extension.runtime.integration.bootstrap;

import io.horizon.runtime.Macrocosm;
import io.macrocosm.specification.app.HAmbient;
import io.vertx.core.json.JsonObject;
import io.vertx.up.util.Ut;
import io.zerows.core.metadata.atom.configuration.MDConfiguration;
import io.zerows.core.web.model.extension.HExtension;
import io.zerows.extension.runtime.integration.atom.IsConfig;
import io.zerows.extension.runtime.integration.eon.IsConstant;
import io.zerows.extension.runtime.skeleton.eon.KeMsg;

import java.util.Objects;

import static io.zerows.extension.runtime.integration.util.Is.LOG;

/**
 * @author <a href="http://www.origin-x.cn">Lang</a>
 */
final class IsConfiguration {
    private static final JsonObject CONFIG_DATA = new JsonObject();
    private static IsConfig CONFIG = null;

    static void registry(final HAmbient ambient) {
        initialize();

        final String module = IsConstant.BUNDLE_SYMBOLIC_NAME;
        LOG.Init.info(IsConfiguration.class, KeMsg.Configuration.DATA_J,
            module, CONFIG_DATA.encode());

        ambient.registry(module, CONFIG_DATA);
    }

    private static void initialize() {
        if (Objects.isNull(CONFIG)) {
            final MDConfiguration configuration = HExtension.getOrCreate(IsConstant.BUNDLE_SYMBOLIC_NAME);
            final JsonObject configData = configuration.inConfiguration();
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
