/*
 * This file is generated by jOOQ.
 */
package io.zerows.extension.mbse.action.domain.tables.daos;


import io.github.jklingsporn.vertx.jooq.classic.jdbc.JDBCClassicQueryExecutor;
import io.github.jklingsporn.vertx.jooq.shared.internal.AbstractVertxDAO;
import io.vertx.core.Future;
import io.zerows.extension.mbse.action.domain.tables.IApi;
import io.zerows.extension.mbse.action.domain.tables.records.IApiRecord;
import org.jooq.Configuration;

import java.time.LocalDateTime;
import java.util.Collection;
import java.util.List;

/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({"all", "unchecked", "rawtypes"})
public class IApiDao extends AbstractVertxDAO<IApiRecord, io.zerows.extension.mbse.action.domain.tables.pojos.IApi, String, Future<List<io.zerows.extension.mbse.action.domain.tables.pojos.IApi>>, Future<io.zerows.extension.mbse.action.domain.tables.pojos.IApi>, Future<Integer>, Future<String>> implements io.github.jklingsporn.vertx.jooq.classic.VertxDAO<IApiRecord, io.zerows.extension.mbse.action.domain.tables.pojos.IApi, String> {

    /**
     * @param configuration The Configuration used for rendering and query
     *                      execution.
     * @param vertx         the vertx instance
     */
    public IApiDao(Configuration configuration, io.vertx.core.Vertx vertx) {
        super(IApi.I_API, io.zerows.extension.mbse.action.domain.tables.pojos.IApi.class, new JDBCClassicQueryExecutor<IApiRecord, io.zerows.extension.mbse.action.domain.tables.pojos.IApi, String>(configuration, io.zerows.extension.mbse.action.domain.tables.pojos.IApi.class, vertx));
    }

    @Override
    protected String getId(io.zerows.extension.mbse.action.domain.tables.pojos.IApi object) {
        return object.getKey();
    }

    /**
     * Find records that have <code>NAME IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.mbse.action.domain.tables.pojos.IApi>> findManyByName(Collection<String> values) {
        return findManyByCondition(IApi.I_API.NAME.in(values));
    }

    /**
     * Find records that have <code>NAME IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.mbse.action.domain.tables.pojos.IApi>> findManyByName(Collection<String> values, int limit) {
        return findManyByCondition(IApi.I_API.NAME.in(values), limit);
    }

    /**
     * Find records that have <code>URI IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.mbse.action.domain.tables.pojos.IApi>> findManyByUri(Collection<String> values) {
        return findManyByCondition(IApi.I_API.URI.in(values));
    }

    /**
     * Find records that have <code>URI IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.mbse.action.domain.tables.pojos.IApi>> findManyByUri(Collection<String> values, int limit) {
        return findManyByCondition(IApi.I_API.URI.in(values), limit);
    }

    /**
     * Find records that have <code>METHOD IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.mbse.action.domain.tables.pojos.IApi>> findManyByMethod(Collection<String> values) {
        return findManyByCondition(IApi.I_API.METHOD.in(values));
    }

    /**
     * Find records that have <code>METHOD IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.mbse.action.domain.tables.pojos.IApi>> findManyByMethod(Collection<String> values, int limit) {
        return findManyByCondition(IApi.I_API.METHOD.in(values), limit);
    }

    /**
     * Find records that have <code>CONSUMES IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.mbse.action.domain.tables.pojos.IApi>> findManyByConsumes(Collection<String> values) {
        return findManyByCondition(IApi.I_API.CONSUMES.in(values));
    }

    /**
     * Find records that have <code>CONSUMES IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.mbse.action.domain.tables.pojos.IApi>> findManyByConsumes(Collection<String> values, int limit) {
        return findManyByCondition(IApi.I_API.CONSUMES.in(values), limit);
    }

    /**
     * Find records that have <code>PRODUCES IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.mbse.action.domain.tables.pojos.IApi>> findManyByProduces(Collection<String> values) {
        return findManyByCondition(IApi.I_API.PRODUCES.in(values));
    }

    /**
     * Find records that have <code>PRODUCES IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.mbse.action.domain.tables.pojos.IApi>> findManyByProduces(Collection<String> values, int limit) {
        return findManyByCondition(IApi.I_API.PRODUCES.in(values), limit);
    }

    /**
     * Find records that have <code>SECURE IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.mbse.action.domain.tables.pojos.IApi>> findManyBySecure(Collection<Boolean> values) {
        return findManyByCondition(IApi.I_API.SECURE.in(values));
    }

    /**
     * Find records that have <code>SECURE IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.mbse.action.domain.tables.pojos.IApi>> findManyBySecure(Collection<Boolean> values, int limit) {
        return findManyByCondition(IApi.I_API.SECURE.in(values), limit);
    }

    /**
     * Find records that have <code>COMMENT IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.mbse.action.domain.tables.pojos.IApi>> findManyByComment(Collection<String> values) {
        return findManyByCondition(IApi.I_API.COMMENT.in(values));
    }

    /**
     * Find records that have <code>COMMENT IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.mbse.action.domain.tables.pojos.IApi>> findManyByComment(Collection<String> values, int limit) {
        return findManyByCondition(IApi.I_API.COMMENT.in(values), limit);
    }

    /**
     * Find records that have <code>TYPE IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.mbse.action.domain.tables.pojos.IApi>> findManyByType(Collection<String> values) {
        return findManyByCondition(IApi.I_API.TYPE.in(values));
    }

    /**
     * Find records that have <code>TYPE IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.mbse.action.domain.tables.pojos.IApi>> findManyByType(Collection<String> values, int limit) {
        return findManyByCondition(IApi.I_API.TYPE.in(values), limit);
    }

    /**
     * Find records that have <code>PARAM_MODE IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.mbse.action.domain.tables.pojos.IApi>> findManyByParamMode(Collection<String> values) {
        return findManyByCondition(IApi.I_API.PARAM_MODE.in(values));
    }

    /**
     * Find records that have <code>PARAM_MODE IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.mbse.action.domain.tables.pojos.IApi>> findManyByParamMode(Collection<String> values, int limit) {
        return findManyByCondition(IApi.I_API.PARAM_MODE.in(values), limit);
    }

    /**
     * Find records that have <code>PARAM_REQUIRED IN (values)</code>
     * asynchronously
     */
    public Future<List<io.zerows.extension.mbse.action.domain.tables.pojos.IApi>> findManyByParamRequired(Collection<String> values) {
        return findManyByCondition(IApi.I_API.PARAM_REQUIRED.in(values));
    }

    /**
     * Find records that have <code>PARAM_REQUIRED IN (values)</code>
     * asynchronously limited by the given limit
     */
    public Future<List<io.zerows.extension.mbse.action.domain.tables.pojos.IApi>> findManyByParamRequired(Collection<String> values, int limit) {
        return findManyByCondition(IApi.I_API.PARAM_REQUIRED.in(values), limit);
    }

    /**
     * Find records that have <code>PARAM_CONTAINED IN (values)</code>
     * asynchronously
     */
    public Future<List<io.zerows.extension.mbse.action.domain.tables.pojos.IApi>> findManyByParamContained(Collection<String> values) {
        return findManyByCondition(IApi.I_API.PARAM_CONTAINED.in(values));
    }

    /**
     * Find records that have <code>PARAM_CONTAINED IN (values)</code>
     * asynchronously limited by the given limit
     */
    public Future<List<io.zerows.extension.mbse.action.domain.tables.pojos.IApi>> findManyByParamContained(Collection<String> values, int limit) {
        return findManyByCondition(IApi.I_API.PARAM_CONTAINED.in(values), limit);
    }

    /**
     * Find records that have <code>IN_RULE IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.mbse.action.domain.tables.pojos.IApi>> findManyByInRule(Collection<String> values) {
        return findManyByCondition(IApi.I_API.IN_RULE.in(values));
    }

    /**
     * Find records that have <code>IN_RULE IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.mbse.action.domain.tables.pojos.IApi>> findManyByInRule(Collection<String> values, int limit) {
        return findManyByCondition(IApi.I_API.IN_RULE.in(values), limit);
    }

    /**
     * Find records that have <code>IN_MAPPING IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.mbse.action.domain.tables.pojos.IApi>> findManyByInMapping(Collection<String> values) {
        return findManyByCondition(IApi.I_API.IN_MAPPING.in(values));
    }

    /**
     * Find records that have <code>IN_MAPPING IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.mbse.action.domain.tables.pojos.IApi>> findManyByInMapping(Collection<String> values, int limit) {
        return findManyByCondition(IApi.I_API.IN_MAPPING.in(values), limit);
    }

    /**
     * Find records that have <code>IN_PLUG IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.mbse.action.domain.tables.pojos.IApi>> findManyByInPlug(Collection<String> values) {
        return findManyByCondition(IApi.I_API.IN_PLUG.in(values));
    }

    /**
     * Find records that have <code>IN_PLUG IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.mbse.action.domain.tables.pojos.IApi>> findManyByInPlug(Collection<String> values, int limit) {
        return findManyByCondition(IApi.I_API.IN_PLUG.in(values), limit);
    }

    /**
     * Find records that have <code>IN_SCRIPT IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.mbse.action.domain.tables.pojos.IApi>> findManyByInScript(Collection<String> values) {
        return findManyByCondition(IApi.I_API.IN_SCRIPT.in(values));
    }

    /**
     * Find records that have <code>IN_SCRIPT IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.mbse.action.domain.tables.pojos.IApi>> findManyByInScript(Collection<String> values, int limit) {
        return findManyByCondition(IApi.I_API.IN_SCRIPT.in(values), limit);
    }

    /**
     * Find records that have <code>OUT_WRITER IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.mbse.action.domain.tables.pojos.IApi>> findManyByOutWriter(Collection<String> values) {
        return findManyByCondition(IApi.I_API.OUT_WRITER.in(values));
    }

    /**
     * Find records that have <code>OUT_WRITER IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.mbse.action.domain.tables.pojos.IApi>> findManyByOutWriter(Collection<String> values, int limit) {
        return findManyByCondition(IApi.I_API.OUT_WRITER.in(values), limit);
    }

    /**
     * Find records that have <code>WORKER_TYPE IN (values)</code>
     * asynchronously
     */
    public Future<List<io.zerows.extension.mbse.action.domain.tables.pojos.IApi>> findManyByWorkerType(Collection<String> values) {
        return findManyByCondition(IApi.I_API.WORKER_TYPE.in(values));
    }

    /**
     * Find records that have <code>WORKER_TYPE IN (values)</code>
     * asynchronously limited by the given limit
     */
    public Future<List<io.zerows.extension.mbse.action.domain.tables.pojos.IApi>> findManyByWorkerType(Collection<String> values, int limit) {
        return findManyByCondition(IApi.I_API.WORKER_TYPE.in(values), limit);
    }

    /**
     * Find records that have <code>WORKER_ADDRESS IN (values)</code>
     * asynchronously
     */
    public Future<List<io.zerows.extension.mbse.action.domain.tables.pojos.IApi>> findManyByWorkerAddress(Collection<String> values) {
        return findManyByCondition(IApi.I_API.WORKER_ADDRESS.in(values));
    }

    /**
     * Find records that have <code>WORKER_ADDRESS IN (values)</code>
     * asynchronously limited by the given limit
     */
    public Future<List<io.zerows.extension.mbse.action.domain.tables.pojos.IApi>> findManyByWorkerAddress(Collection<String> values, int limit) {
        return findManyByCondition(IApi.I_API.WORKER_ADDRESS.in(values), limit);
    }

    /**
     * Find records that have <code>WORKER_CONSUMER IN (values)</code>
     * asynchronously
     */
    public Future<List<io.zerows.extension.mbse.action.domain.tables.pojos.IApi>> findManyByWorkerConsumer(Collection<String> values) {
        return findManyByCondition(IApi.I_API.WORKER_CONSUMER.in(values));
    }

    /**
     * Find records that have <code>WORKER_CONSUMER IN (values)</code>
     * asynchronously limited by the given limit
     */
    public Future<List<io.zerows.extension.mbse.action.domain.tables.pojos.IApi>> findManyByWorkerConsumer(Collection<String> values, int limit) {
        return findManyByCondition(IApi.I_API.WORKER_CONSUMER.in(values), limit);
    }

    /**
     * Find records that have <code>WORKER_CLASS IN (values)</code>
     * asynchronously
     */
    public Future<List<io.zerows.extension.mbse.action.domain.tables.pojos.IApi>> findManyByWorkerClass(Collection<String> values) {
        return findManyByCondition(IApi.I_API.WORKER_CLASS.in(values));
    }

    /**
     * Find records that have <code>WORKER_CLASS IN (values)</code>
     * asynchronously limited by the given limit
     */
    public Future<List<io.zerows.extension.mbse.action.domain.tables.pojos.IApi>> findManyByWorkerClass(Collection<String> values, int limit) {
        return findManyByCondition(IApi.I_API.WORKER_CLASS.in(values), limit);
    }

    /**
     * Find records that have <code>WORKER_JS IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.mbse.action.domain.tables.pojos.IApi>> findManyByWorkerJs(Collection<String> values) {
        return findManyByCondition(IApi.I_API.WORKER_JS.in(values));
    }

    /**
     * Find records that have <code>WORKER_JS IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.mbse.action.domain.tables.pojos.IApi>> findManyByWorkerJs(Collection<String> values, int limit) {
        return findManyByCondition(IApi.I_API.WORKER_JS.in(values), limit);
    }

    /**
     * Find records that have <code>SERVICE_ID IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.mbse.action.domain.tables.pojos.IApi>> findManyByServiceId(Collection<String> values) {
        return findManyByCondition(IApi.I_API.SERVICE_ID.in(values));
    }

    /**
     * Find records that have <code>SERVICE_ID IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.mbse.action.domain.tables.pojos.IApi>> findManyByServiceId(Collection<String> values, int limit) {
        return findManyByCondition(IApi.I_API.SERVICE_ID.in(values), limit);
    }

    /**
     * Find records that have <code>SIGMA IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.mbse.action.domain.tables.pojos.IApi>> findManyBySigma(Collection<String> values) {
        return findManyByCondition(IApi.I_API.SIGMA.in(values));
    }

    /**
     * Find records that have <code>SIGMA IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.mbse.action.domain.tables.pojos.IApi>> findManyBySigma(Collection<String> values, int limit) {
        return findManyByCondition(IApi.I_API.SIGMA.in(values), limit);
    }

    /**
     * Find records that have <code>LANGUAGE IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.mbse.action.domain.tables.pojos.IApi>> findManyByLanguage(Collection<String> values) {
        return findManyByCondition(IApi.I_API.LANGUAGE.in(values));
    }

    /**
     * Find records that have <code>LANGUAGE IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.mbse.action.domain.tables.pojos.IApi>> findManyByLanguage(Collection<String> values, int limit) {
        return findManyByCondition(IApi.I_API.LANGUAGE.in(values), limit);
    }

    /**
     * Find records that have <code>ACTIVE IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.mbse.action.domain.tables.pojos.IApi>> findManyByActive(Collection<Boolean> values) {
        return findManyByCondition(IApi.I_API.ACTIVE.in(values));
    }

    /**
     * Find records that have <code>ACTIVE IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.mbse.action.domain.tables.pojos.IApi>> findManyByActive(Collection<Boolean> values, int limit) {
        return findManyByCondition(IApi.I_API.ACTIVE.in(values), limit);
    }

    /**
     * Find records that have <code>METADATA IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.mbse.action.domain.tables.pojos.IApi>> findManyByMetadata(Collection<String> values) {
        return findManyByCondition(IApi.I_API.METADATA.in(values));
    }

    /**
     * Find records that have <code>METADATA IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.mbse.action.domain.tables.pojos.IApi>> findManyByMetadata(Collection<String> values, int limit) {
        return findManyByCondition(IApi.I_API.METADATA.in(values), limit);
    }

    /**
     * Find records that have <code>CREATED_AT IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.mbse.action.domain.tables.pojos.IApi>> findManyByCreatedAt(Collection<LocalDateTime> values) {
        return findManyByCondition(IApi.I_API.CREATED_AT.in(values));
    }

    /**
     * Find records that have <code>CREATED_AT IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.mbse.action.domain.tables.pojos.IApi>> findManyByCreatedAt(Collection<LocalDateTime> values, int limit) {
        return findManyByCondition(IApi.I_API.CREATED_AT.in(values), limit);
    }

    /**
     * Find records that have <code>CREATED_BY IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.mbse.action.domain.tables.pojos.IApi>> findManyByCreatedBy(Collection<String> values) {
        return findManyByCondition(IApi.I_API.CREATED_BY.in(values));
    }

    /**
     * Find records that have <code>CREATED_BY IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.mbse.action.domain.tables.pojos.IApi>> findManyByCreatedBy(Collection<String> values, int limit) {
        return findManyByCondition(IApi.I_API.CREATED_BY.in(values), limit);
    }

    /**
     * Find records that have <code>UPDATED_AT IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.mbse.action.domain.tables.pojos.IApi>> findManyByUpdatedAt(Collection<LocalDateTime> values) {
        return findManyByCondition(IApi.I_API.UPDATED_AT.in(values));
    }

    /**
     * Find records that have <code>UPDATED_AT IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.mbse.action.domain.tables.pojos.IApi>> findManyByUpdatedAt(Collection<LocalDateTime> values, int limit) {
        return findManyByCondition(IApi.I_API.UPDATED_AT.in(values), limit);
    }

    /**
     * Find records that have <code>UPDATED_BY IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.mbse.action.domain.tables.pojos.IApi>> findManyByUpdatedBy(Collection<String> values) {
        return findManyByCondition(IApi.I_API.UPDATED_BY.in(values));
    }

    /**
     * Find records that have <code>UPDATED_BY IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.mbse.action.domain.tables.pojos.IApi>> findManyByUpdatedBy(Collection<String> values, int limit) {
        return findManyByCondition(IApi.I_API.UPDATED_BY.in(values), limit);
    }

    @Override
    public JDBCClassicQueryExecutor<IApiRecord, io.zerows.extension.mbse.action.domain.tables.pojos.IApi, String> queryExecutor() {
        return (JDBCClassicQueryExecutor<IApiRecord, io.zerows.extension.mbse.action.domain.tables.pojos.IApi, String>) super.queryExecutor();
    }
}
