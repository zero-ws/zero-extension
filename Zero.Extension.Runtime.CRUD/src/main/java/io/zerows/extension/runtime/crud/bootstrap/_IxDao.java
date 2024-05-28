package io.zerows.extension.runtime.crud.bootstrap;

import io.horizon.eon.VPath;
import io.horizon.eon.VString;
import io.vertx.core.json.JsonObject;
import io.vertx.up.fn.Fn;
import io.vertx.up.util.Ut;
import io.zerows.core.feature.web.mbse.atom.specification.KModule;
import io.zerows.core.metadata.atom.MultiKeyMap;
import io.zerows.core.metadata.uca.environment.DevEnv;
import io.zerows.core.web.model.extension.HExtension;
import io.zerows.extension.runtime.crud.eon.IxFolder;
import io.zerows.extension.runtime.crud.eon.IxMsg;

import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ConcurrentMap;

import static io.zerows.extension.runtime.crud.util.Ix.LOG;

;

/*
 * Dao class initialization
 * plugin/crud/module/ folder singleton
 */
class IxDao {
    private static final MultiKeyMap<KModule> MODULE_MAP = new MultiKeyMap<>();

    static void init() {
        /*
         * Read all definition files, wall files must be following:
         * <name>.json
         * 1）Each file could define only one module, the filename is module name.
         * 2）Each file must be json format with .json extension, others will be ignored.
         * */
        final List<String> files = Ut.ioFiles(IxFolder.MODULE, VPath.SUFFIX.JSON);

        files.forEach(file -> {
            /* 1.File absolute path under classpath */
            final String path = IxFolder.MODULE + file;
            final JsonObject configDao = Ut.ioJObject(path);
            final String identifierDefault = file.replace(VString.DOT + VPath.SUFFIX.JSON, VString.EMPTY);

            Fn.runAt(() -> addModule(configDao, identifierDefault), configDao);
        });
        /*
         * Boot: Secondary founding to pick up default configuration
         */
        final Set<HExtension> boots = HExtension.initialize();
        boots.forEach(boot -> {
            /* Crud Module */
            final ConcurrentMap<String, JsonObject> modules = boot.module();
            modules.forEach((moduleKey, json) -> Fn.runAt(() -> addModule(json, moduleKey), json));
        });
        LOG.Init.info(IxDao.class, "IxDao Finished ! Size = {0}, Uris = {0}",
            MODULE_MAP.values().size(), IxConfiguration.getUris().size());
    }

    private static void addModule(final JsonObject data, final String identifierDefault) {
        /* 2. Deserialize to IxConfig object */
        final KModule config = Ut.deserialize(data, KModule.class);
        /* 3. Default Values */
        final String identifier = IxInitializer.configure(config, identifierDefault);
        /* 4. Url & Map */
        IxConfiguration.addUrs(config.getName());
        MODULE_MAP.put(identifier, config, config.getName());
        /* 5. Logger */
        if (DevEnv.devDaoBind()) {
            LOG.Init.info(IxDao.class, IxMsg.INIT_INFO, identifier, config.getName());
        }
    }

    static KModule get(final String actor) {
        final KModule config = MODULE_MAP.getOr(actor);
        if (Objects.isNull(config)) {
            LOG.Rest.warn(IxDao.class, "Actor: identifier = `{}` configuration is missing!", actor);
            return null;
        } else {
            LOG.Rest.info(IxDao.class, "Actor: identifier = `{0}`", actor);
            return config;
        }
    }
}
