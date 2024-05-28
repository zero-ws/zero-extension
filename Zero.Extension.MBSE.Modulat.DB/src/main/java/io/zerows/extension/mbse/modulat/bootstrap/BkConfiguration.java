package io.zerows.extension.mbse.modulat.bootstrap;

import io.vertx.core.json.JsonObject;
import io.vertx.up.eon.configure.YmlCore;
import io.vertx.up.util.Ut;
import io.zerows.core.metadata.store.OZeroStore;
import io.zerows.core.web.model.atom.io.MDConfiguration;
import io.zerows.core.web.model.extension.HExtension;
import io.zerows.extension.mbse.modulat.atom.PowerConfig;
import io.zerows.extension.mbse.modulat.eon.BkConstant;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

import static io.zerows.extension.mbse.modulat.util.Bk.LOG;

/**
 * @author <a href="http://www.origin-x.cn">Lang</a>
 */
class BkConfiguration {
    private static PowerConfig CONFIG;

    private BkConfiguration() {
    }

    static void init() {
        if (OZeroStore.is(YmlCore.module.__KEY)) {
            final MDConfiguration configuration = HExtension.ofConfiguration(BkConstant.BUNDLE_SYMBOLIC_NAME);
            final JsonObject configData = configuration.inConfiguration();
            LOG.Init.info(BkConfiguration.class, "The Modulat Engine will be initialized!! `{0}`",
                configData.encode());
            CONFIG = Ut.deserialize(configData, PowerConfig.class);
        }
    }

    static Set<String> builtIn() {
        if (Objects.isNull(CONFIG)) {
            init();
        }
        return Objects.isNull(CONFIG) ? new HashSet<>() : CONFIG.buildIn();
    }
}
