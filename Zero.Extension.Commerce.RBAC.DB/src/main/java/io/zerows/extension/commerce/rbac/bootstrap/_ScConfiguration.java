package io.zerows.extension.commerce.rbac.bootstrap;

import io.macrocosm.specification.app.HAmbient;
import io.vertx.core.json.JsonObject;
import io.vertx.up.util.Ut;
import io.zerows.extension.commerce.rbac.atom.ScConfig;
import io.zerows.extension.commerce.rbac.eon.ScFolder;
import io.zerows.extension.runtime.skeleton.eon.KeIpc;
import io.zerows.extension.runtime.skeleton.eon.KeMsg;
import io.zerows.extension.runtime.skeleton.refine.Ke;

import java.util.Objects;

import static io.zerows.extension.commerce.rbac.util.Sc.LOG;

/*
 * Configuration class initialization
 * plugin/rbac/configuration.json
 *
 */
class ScConfiguration {
    private static ScConfig CONFIG = null;

    static void registry(final HAmbient ambient) {
        /*
         * Read definition of security configuration from RBAC default folder
         */
        if (null == CONFIG) {
            final JsonObject configData = Ut.ioJObject(ScFolder.CONFIG_FILE);
            final String module = Ke.getExtension(KeIpc.Module.RBAC);
            LOG.Init.info(ScConfiguration.class, KeMsg.Configuration.DATA_J,
                module, configData.encode());

            ambient.registry(module, configData);

            CONFIG = Ut.deserialize(configData, ScConfig.class);
            LOG.Init.info(ScConfiguration.class, KeMsg.Configuration.DATA_T,
                CONFIG.toString());
        }
    }

    static ScConfig getConfig() {
        Objects.requireNonNull(CONFIG);
        return CONFIG;
    }
}
