package io.zerows.extension.mbse.basement.bootstrap;

import io.macrocosm.specification.app.HAmbient;
import io.vertx.core.json.JsonObject;
import io.vertx.up.util.Ut;
import io.zerows.extension.mbse.basement.atom.config.AoConfig;
import io.zerows.extension.mbse.basement.eon.AoFolder;
import io.zerows.extension.runtime.skeleton.eon.KeIpc;
import io.zerows.extension.runtime.skeleton.eon.KeMsg;
import io.zerows.extension.runtime.skeleton.refine.Ke;

import java.util.Objects;

import static io.zerows.extension.mbse.basement.util.Ao.LOG;

class AoConfiguration {

    private static AoConfig CONFIG = null;

    static void registry(final HAmbient ambient) {
        if (null == CONFIG) {
            final JsonObject configData = Ut.ioJObject(AoFolder.CONFIG_FILE);
            final String module = Ke.getExtension(KeIpc.Module.ATOM);
            LOG.Init.info(AoConfiguration.class, KeMsg.Configuration.DATA_J,
                module, configData.encode());

            ambient.registry(module, configData);

            CONFIG = Ut.deserialize(configData, AoConfig.class);
            LOG.Init.info(AoConfiguration.class, KeMsg.Configuration.DATA_T,
                CONFIG.toString());
        }
    }

    static AoConfig getConfig() {
        // Fix Issue of Atom Disabled Null Pointer
        return Objects.isNull(CONFIG) ? new AoConfig() : CONFIG;
    }
}