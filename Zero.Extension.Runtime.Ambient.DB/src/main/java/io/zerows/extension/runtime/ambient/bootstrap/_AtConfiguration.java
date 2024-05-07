package io.zerows.extension.runtime.ambient.bootstrap;

import io.macrocosm.specification.app.HAmbient;
import io.vertx.core.json.JsonObject;
import io.vertx.up.fn.Fn;
import io.vertx.up.util.Ut;
import io.zerows.extension.runtime.ambient.eon.AtFolder;
import io.zerows.extension.runtime.ambient.exception._500InitSpecificationException;
import io.zerows.extension.runtime.ambient.exception._500PrerequisiteSpecException;
import io.zerows.extension.runtime.skeleton.eon.KeIpc;
import io.zerows.extension.runtime.skeleton.eon.KeMsg;
import io.zerows.extension.runtime.skeleton.osgi.spi.extension.Init;
import io.zerows.extension.runtime.skeleton.osgi.spi.extension.Prerequisite;
import io.zerows.extension.runtime.skeleton.refine.Ke;

import java.util.Objects;

import static io.zerows.extension.runtime.ambient.util.At.LOG;

final class AtConfiguration {

    private static AtConfig CONFIG = null;

    private AtConfiguration() {
    }

    static void registry(final HAmbient ambient) {
        if (Objects.nonNull(CONFIG)) {
            return;
        }
        final JsonObject configData = Ut.ioJObject(AtFolder.CONFIG_FILE);
        final String module = Ke.getExtension(KeIpc.Module.AMBIENT);
        LOG.Init.info(AtConfiguration.class, KeMsg.Configuration.DATA_J,
            module, configData.encode());

        ambient.registry(module, configData);

        CONFIG = Ut.deserialize(configData, AtConfig.class);
        LOG.Init.info(AtConfiguration.class, KeMsg.Configuration.DATA_T, CONFIG.toString());
    }

    static AtConfig getConfig() {
        return CONFIG;
    }

    static Init getInit(final Class<?> initClass) {
        if (Objects.isNull(initClass)) {
            return null;
        } else {
            Fn.outWeb(!Ut.isImplement(initClass, Init.class), _500InitSpecificationException.class,
                AtPin.class, initClass.getName());
            return Init.generate(initClass);
        }
    }

    static Prerequisite getPrerequisite() {
        final Class<?> prerequisite = CONFIG.getPrerequisite();
        if (Objects.isNull(prerequisite)) {
            return null;
        } else {
            Fn.outWeb(!Ut.isImplement(prerequisite, Prerequisite.class), _500PrerequisiteSpecException.class,
                AtPin.class, prerequisite.getName());
            return Prerequisite.generate(prerequisite);
        }
    }
}
