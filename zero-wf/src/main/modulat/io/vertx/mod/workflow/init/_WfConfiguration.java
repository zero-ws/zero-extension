package io.vertx.mod.workflow.init;

import cn.vertxup.workflow.cv.WfCv;
import cn.vertxup.workflow.domain.tables.daos.WFlowDao;
import cn.vertxup.workflow.domain.tables.pojos.WFlow;
import io.macrocosm.specification.app.HAmbient;
import io.vertx.core.Future;
import io.vertx.core.Vertx;
import io.vertx.core.json.JsonObject;
import io.vertx.mod.ke.cv.KeIpc;
import io.vertx.mod.ke.cv.KeMsg;
import io.vertx.mod.ke.refine.Ke;
import io.vertx.mod.workflow.atom.configuration.MetaWorkflow;
import io.vertx.up.commune.config.Database;
import io.vertx.up.eon.configure.YmlCore;
import io.vertx.up.runtime.ZeroStore;
import io.vertx.up.unity.Ux;
import io.vertx.up.util.Ut;
import org.camunda.bpm.engine.ProcessEngine;
import org.camunda.bpm.engine.ProcessEngineConfiguration;
import org.camunda.bpm.engine.impl.cfg.ProcessEngineConfigurationImpl;
import org.camunda.bpm.engine.impl.cfg.StandaloneProcessEngineConfiguration;
import org.camunda.bpm.engine.impl.history.HistoryLevel;
import org.camunda.bpm.engine.impl.history.handler.DbHistoryEventHandler;
import org.camunda.bpm.engine.impl.history.handler.HistoryEventHandler;
import org.camunda.bpm.engine.impl.persistence.StrongUuidGenerator;
import org.jooq.Configuration;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

import static io.vertx.mod.workflow.refine.Wf.LOG;

/**
 * @author <a href="http://www.origin-x.cn">Lang</a>
 */
final class WfConfiguration {
    private static final ConcurrentMap<String, WFlow> FLOW_POOL = new ConcurrentHashMap<>();
    private static MetaWorkflow CONFIG;
    private static ProcessEngine ENGINE;
    private static HistoryEventHandler HANDLER;

    private WfConfiguration() {
    }

    private static MetaWorkflow configure() {
        if (Objects.isNull(CONFIG) && ZeroStore.is(YmlCore.workflow.__KEY)) {
            CONFIG = ZeroStore.option(YmlCore.workflow.__KEY, MetaWorkflow.class, null);
            LOG.Init.info(WfConfiguration.class, KeMsg.Configuration.DATA_T, CONFIG.toString());
        }
        return CONFIG;
    }

    static Future<Boolean> registry(final HAmbient ambient, final Vertx vertx) {
        // 截断返回
        if (Objects.nonNull(CONFIG)) {
            return Future.succeededFuture(Boolean.TRUE);
        }
        final JsonObject configJ = ZeroStore.option(YmlCore.workflow.__KEY);
        final String module = Ke.getExtension(KeIpc.Module.WF);
        LOG.Init.info(WfConfiguration.class, KeMsg.Configuration.DATA_J,
            module, configJ.encode());

        ambient.registry(module, configJ);

        configure();

        final Configuration configuration = Ke.getConfiguration();
        final WFlowDao flowDao = new WFlowDao(configuration, vertx);
        return flowDao.findAll().compose(flows -> {
            LOG.Init.info(WfConfiguration.class, "Flow definitions: {0}", flows.size());
            FLOW_POOL.putAll(Ut.elementZip(flows, WFlow::getCode, flow -> flow));
            return Ux.futureT();
        });
    }

    /*
     * Camunda Engine Creating
     */
    static ProcessEngine camunda() {
        Objects.requireNonNull(CONFIG);
        if (Objects.isNull(ENGINE)) {
            final Database database = CONFIG.camundaDatabase();
            Objects.requireNonNull(database);
            final ProcessEngineConfigurationImpl configuration = new StandaloneProcessEngineConfiguration()
                // Fix Issue:
                // org.camunda.bpm.engine.ProcessEngineException: historyLevel mismatch: configuration says HistoryLevelAudit(name=audit, id=2) and database says HistoryLevelFull(name=full, id=3)
                .setHistory(HistoryLevel.HISTORY_LEVEL_FULL.getName())     // none, audit, full, activity
                .setHistoryEventHandler(new DbHistoryEventHandler())
                .setIdGenerator(new StrongUuidGenerator())                 // uuid for task
                .setProcessEngineName(CONFIG.getName())
                .setDatabaseSchemaUpdate(ProcessEngineConfiguration.DB_SCHEMA_UPDATE_FALSE)
                .setJdbcUrl(database.getJdbcUrl())
                .setJdbcDriver(database.getDriverClassName())
                .setJdbcUsername(database.getUsername())
                .setJdbcPassword(database.getSmartPassword())
                .setJobExecutorActivate(true);
            // Default Handler for History
            HANDLER = configuration.getHistoryEventHandler();
            ENGINE = configuration.buildProcessEngine();
        }
        return ENGINE;
    }

    static List<String> camundaResources() {
        final List<String> folders = Ut.ioDirectories(WfCv.FOLDER_ROOT);
        final List<String> results = new ArrayList<>();
        folders.forEach(each -> results.add(WfCv.FOLDER_ROOT + "/" + each));
        final Set<String> internal = CONFIG.camundaResource();
        if (!internal.isEmpty()) {
            internal.forEach(each -> results.add(WfCv.FOLDER_ROOT + "/" + each));
        }
        return results;
    }

    static Set<String> camundaBuiltIn() {
        final MetaWorkflow configRef = configure();
        return Optional.ofNullable(configRef)
            .map(MetaWorkflow::camundaBuiltIn)
            .orElseGet(HashSet::new);
    }

    static HistoryEventHandler camundaLogger() {
        return HANDLER;
    }

    static WFlow workflow(final String code) {
        return FLOW_POOL.get(code);
    }
}
