/*
 * This file is generated by jOOQ.
 */
package io.zerows.extension.mbse.action.domain.tables.daos;


import io.github.jklingsporn.vertx.jooq.classic.jdbc.JDBCClassicQueryExecutor;
import io.github.jklingsporn.vertx.jooq.shared.internal.AbstractVertxDAO;
import io.vertx.core.Future;
import io.zerows.extension.mbse.action.domain.tables.IJob;
import io.zerows.extension.mbse.action.domain.tables.records.IJobRecord;
import org.jooq.Configuration;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Collection;
import java.util.List;

/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({"all", "unchecked", "rawtypes"})
public class IJobDao extends AbstractVertxDAO<IJobRecord, io.zerows.extension.mbse.action.domain.tables.pojos.IJob, String, Future<List<io.zerows.extension.mbse.action.domain.tables.pojos.IJob>>, Future<io.zerows.extension.mbse.action.domain.tables.pojos.IJob>, Future<Integer>, Future<String>> implements io.github.jklingsporn.vertx.jooq.classic.VertxDAO<IJobRecord, io.zerows.extension.mbse.action.domain.tables.pojos.IJob, String> {

    /**
     * @param configuration The Configuration used for rendering and query
     *                      execution.
     * @param vertx         the vertx instance
     */
    public IJobDao(Configuration configuration, io.vertx.core.Vertx vertx) {
        super(IJob.I_JOB, io.zerows.extension.mbse.action.domain.tables.pojos.IJob.class, new JDBCClassicQueryExecutor<IJobRecord, io.zerows.extension.mbse.action.domain.tables.pojos.IJob, String>(configuration, io.zerows.extension.mbse.action.domain.tables.pojos.IJob.class, vertx));
    }

    @Override
    protected String getId(io.zerows.extension.mbse.action.domain.tables.pojos.IJob object) {
        return object.getKey();
    }

    /**
     * Find records that have <code>NAMESPACE IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.mbse.action.domain.tables.pojos.IJob>> findManyByNamespace(Collection<String> values) {
        return findManyByCondition(IJob.I_JOB.NAMESPACE.in(values));
    }

    /**
     * Find records that have <code>NAMESPACE IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.mbse.action.domain.tables.pojos.IJob>> findManyByNamespace(Collection<String> values, int limit) {
        return findManyByCondition(IJob.I_JOB.NAMESPACE.in(values), limit);
    }

    /**
     * Find records that have <code>NAME IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.mbse.action.domain.tables.pojos.IJob>> findManyByName(Collection<String> values) {
        return findManyByCondition(IJob.I_JOB.NAME.in(values));
    }

    /**
     * Find records that have <code>NAME IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.mbse.action.domain.tables.pojos.IJob>> findManyByName(Collection<String> values, int limit) {
        return findManyByCondition(IJob.I_JOB.NAME.in(values), limit);
    }

    /**
     * Find records that have <code>CODE IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.mbse.action.domain.tables.pojos.IJob>> findManyByCode(Collection<String> values) {
        return findManyByCondition(IJob.I_JOB.CODE.in(values));
    }

    /**
     * Find records that have <code>CODE IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.mbse.action.domain.tables.pojos.IJob>> findManyByCode(Collection<String> values, int limit) {
        return findManyByCondition(IJob.I_JOB.CODE.in(values), limit);
    }

    /**
     * Find records that have <code>GROUP IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.mbse.action.domain.tables.pojos.IJob>> findManyByGroup(Collection<String> values) {
        return findManyByCondition(IJob.I_JOB.GROUP.in(values));
    }

    /**
     * Find records that have <code>GROUP IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.mbse.action.domain.tables.pojos.IJob>> findManyByGroup(Collection<String> values, int limit) {
        return findManyByCondition(IJob.I_JOB.GROUP.in(values), limit);
    }

    /**
     * Find records that have <code>COMMENT IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.mbse.action.domain.tables.pojos.IJob>> findManyByComment(Collection<String> values) {
        return findManyByCondition(IJob.I_JOB.COMMENT.in(values));
    }

    /**
     * Find records that have <code>COMMENT IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.mbse.action.domain.tables.pojos.IJob>> findManyByComment(Collection<String> values, int limit) {
        return findManyByCondition(IJob.I_JOB.COMMENT.in(values), limit);
    }

    /**
     * Find records that have <code>ADDITIONAL IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.mbse.action.domain.tables.pojos.IJob>> findManyByAdditional(Collection<String> values) {
        return findManyByCondition(IJob.I_JOB.ADDITIONAL.in(values));
    }

    /**
     * Find records that have <code>ADDITIONAL IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.mbse.action.domain.tables.pojos.IJob>> findManyByAdditional(Collection<String> values, int limit) {
        return findManyByCondition(IJob.I_JOB.ADDITIONAL.in(values), limit);
    }

    /**
     * Find records that have <code>PROXY IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.mbse.action.domain.tables.pojos.IJob>> findManyByProxy(Collection<String> values) {
        return findManyByCondition(IJob.I_JOB.PROXY.in(values));
    }

    /**
     * Find records that have <code>PROXY IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.mbse.action.domain.tables.pojos.IJob>> findManyByProxy(Collection<String> values, int limit) {
        return findManyByCondition(IJob.I_JOB.PROXY.in(values), limit);
    }

    /**
     * Find records that have <code>THRESHOLD IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.mbse.action.domain.tables.pojos.IJob>> findManyByThreshold(Collection<Integer> values) {
        return findManyByCondition(IJob.I_JOB.THRESHOLD.in(values));
    }

    /**
     * Find records that have <code>THRESHOLD IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.mbse.action.domain.tables.pojos.IJob>> findManyByThreshold(Collection<Integer> values, int limit) {
        return findManyByCondition(IJob.I_JOB.THRESHOLD.in(values), limit);
    }

    /**
     * Find records that have <code>TYPE IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.mbse.action.domain.tables.pojos.IJob>> findManyByType(Collection<String> values) {
        return findManyByCondition(IJob.I_JOB.TYPE.in(values));
    }

    /**
     * Find records that have <code>TYPE IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.mbse.action.domain.tables.pojos.IJob>> findManyByType(Collection<String> values, int limit) {
        return findManyByCondition(IJob.I_JOB.TYPE.in(values), limit);
    }

    /**
     * Find records that have <code>RUN_AT IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.mbse.action.domain.tables.pojos.IJob>> findManyByRunAt(Collection<LocalTime> values) {
        return findManyByCondition(IJob.I_JOB.RUN_AT.in(values));
    }

    /**
     * Find records that have <code>RUN_AT IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.mbse.action.domain.tables.pojos.IJob>> findManyByRunAt(Collection<LocalTime> values, int limit) {
        return findManyByCondition(IJob.I_JOB.RUN_AT.in(values), limit);
    }

    /**
     * Find records that have <code>RUN_FORMULA IN (values)</code>
     * asynchronously
     */
    public Future<List<io.zerows.extension.mbse.action.domain.tables.pojos.IJob>> findManyByRunFormula(Collection<String> values) {
        return findManyByCondition(IJob.I_JOB.RUN_FORMULA.in(values));
    }

    /**
     * Find records that have <code>RUN_FORMULA IN (values)</code>
     * asynchronously limited by the given limit
     */
    public Future<List<io.zerows.extension.mbse.action.domain.tables.pojos.IJob>> findManyByRunFormula(Collection<String> values, int limit) {
        return findManyByCondition(IJob.I_JOB.RUN_FORMULA.in(values), limit);
    }

    /**
     * Find records that have <code>DURATION IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.mbse.action.domain.tables.pojos.IJob>> findManyByDuration(Collection<Long> values) {
        return findManyByCondition(IJob.I_JOB.DURATION.in(values));
    }

    /**
     * Find records that have <code>DURATION IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.mbse.action.domain.tables.pojos.IJob>> findManyByDuration(Collection<Long> values, int limit) {
        return findManyByCondition(IJob.I_JOB.DURATION.in(values), limit);
    }

    /**
     * Find records that have <code>DURATION_COMPONENT IN (values)</code>
     * asynchronously
     */
    public Future<List<io.zerows.extension.mbse.action.domain.tables.pojos.IJob>> findManyByDurationComponent(Collection<String> values) {
        return findManyByCondition(IJob.I_JOB.DURATION_COMPONENT.in(values));
    }

    /**
     * Find records that have <code>DURATION_COMPONENT IN (values)</code>
     * asynchronously limited by the given limit
     */
    public Future<List<io.zerows.extension.mbse.action.domain.tables.pojos.IJob>> findManyByDurationComponent(Collection<String> values, int limit) {
        return findManyByCondition(IJob.I_JOB.DURATION_COMPONENT.in(values), limit);
    }

    /**
     * Find records that have <code>DURATION_CONFIG IN (values)</code>
     * asynchronously
     */
    public Future<List<io.zerows.extension.mbse.action.domain.tables.pojos.IJob>> findManyByDurationConfig(Collection<String> values) {
        return findManyByCondition(IJob.I_JOB.DURATION_CONFIG.in(values));
    }

    /**
     * Find records that have <code>DURATION_CONFIG IN (values)</code>
     * asynchronously limited by the given limit
     */
    public Future<List<io.zerows.extension.mbse.action.domain.tables.pojos.IJob>> findManyByDurationConfig(Collection<String> values, int limit) {
        return findManyByCondition(IJob.I_JOB.DURATION_CONFIG.in(values), limit);
    }

    /**
     * Find records that have <code>INCOME_COMPONENT IN (values)</code>
     * asynchronously
     */
    public Future<List<io.zerows.extension.mbse.action.domain.tables.pojos.IJob>> findManyByIncomeComponent(Collection<String> values) {
        return findManyByCondition(IJob.I_JOB.INCOME_COMPONENT.in(values));
    }

    /**
     * Find records that have <code>INCOME_COMPONENT IN (values)</code>
     * asynchronously limited by the given limit
     */
    public Future<List<io.zerows.extension.mbse.action.domain.tables.pojos.IJob>> findManyByIncomeComponent(Collection<String> values, int limit) {
        return findManyByCondition(IJob.I_JOB.INCOME_COMPONENT.in(values), limit);
    }

    /**
     * Find records that have <code>INCOME_ADDRESS IN (values)</code>
     * asynchronously
     */
    public Future<List<io.zerows.extension.mbse.action.domain.tables.pojos.IJob>> findManyByIncomeAddress(Collection<String> values) {
        return findManyByCondition(IJob.I_JOB.INCOME_ADDRESS.in(values));
    }

    /**
     * Find records that have <code>INCOME_ADDRESS IN (values)</code>
     * asynchronously limited by the given limit
     */
    public Future<List<io.zerows.extension.mbse.action.domain.tables.pojos.IJob>> findManyByIncomeAddress(Collection<String> values, int limit) {
        return findManyByCondition(IJob.I_JOB.INCOME_ADDRESS.in(values), limit);
    }

    /**
     * Find records that have <code>OUTCOME_COMPONENT IN (values)</code>
     * asynchronously
     */
    public Future<List<io.zerows.extension.mbse.action.domain.tables.pojos.IJob>> findManyByOutcomeComponent(Collection<String> values) {
        return findManyByCondition(IJob.I_JOB.OUTCOME_COMPONENT.in(values));
    }

    /**
     * Find records that have <code>OUTCOME_COMPONENT IN (values)</code>
     * asynchronously limited by the given limit
     */
    public Future<List<io.zerows.extension.mbse.action.domain.tables.pojos.IJob>> findManyByOutcomeComponent(Collection<String> values, int limit) {
        return findManyByCondition(IJob.I_JOB.OUTCOME_COMPONENT.in(values), limit);
    }

    /**
     * Find records that have <code>OUTCOME_ADDRESS IN (values)</code>
     * asynchronously
     */
    public Future<List<io.zerows.extension.mbse.action.domain.tables.pojos.IJob>> findManyByOutcomeAddress(Collection<String> values) {
        return findManyByCondition(IJob.I_JOB.OUTCOME_ADDRESS.in(values));
    }

    /**
     * Find records that have <code>OUTCOME_ADDRESS IN (values)</code>
     * asynchronously limited by the given limit
     */
    public Future<List<io.zerows.extension.mbse.action.domain.tables.pojos.IJob>> findManyByOutcomeAddress(Collection<String> values, int limit) {
        return findManyByCondition(IJob.I_JOB.OUTCOME_ADDRESS.in(values), limit);
    }

    /**
     * Find records that have <code>SERVICE_ID IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.mbse.action.domain.tables.pojos.IJob>> findManyByServiceId(Collection<String> values) {
        return findManyByCondition(IJob.I_JOB.SERVICE_ID.in(values));
    }

    /**
     * Find records that have <code>SERVICE_ID IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.mbse.action.domain.tables.pojos.IJob>> findManyByServiceId(Collection<String> values, int limit) {
        return findManyByCondition(IJob.I_JOB.SERVICE_ID.in(values), limit);
    }

    /**
     * Find records that have <code>SIGMA IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.mbse.action.domain.tables.pojos.IJob>> findManyBySigma(Collection<String> values) {
        return findManyByCondition(IJob.I_JOB.SIGMA.in(values));
    }

    /**
     * Find records that have <code>SIGMA IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.mbse.action.domain.tables.pojos.IJob>> findManyBySigma(Collection<String> values, int limit) {
        return findManyByCondition(IJob.I_JOB.SIGMA.in(values), limit);
    }

    /**
     * Find records that have <code>LANGUAGE IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.mbse.action.domain.tables.pojos.IJob>> findManyByLanguage(Collection<String> values) {
        return findManyByCondition(IJob.I_JOB.LANGUAGE.in(values));
    }

    /**
     * Find records that have <code>LANGUAGE IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.mbse.action.domain.tables.pojos.IJob>> findManyByLanguage(Collection<String> values, int limit) {
        return findManyByCondition(IJob.I_JOB.LANGUAGE.in(values), limit);
    }

    /**
     * Find records that have <code>ACTIVE IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.mbse.action.domain.tables.pojos.IJob>> findManyByActive(Collection<Boolean> values) {
        return findManyByCondition(IJob.I_JOB.ACTIVE.in(values));
    }

    /**
     * Find records that have <code>ACTIVE IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.mbse.action.domain.tables.pojos.IJob>> findManyByActive(Collection<Boolean> values, int limit) {
        return findManyByCondition(IJob.I_JOB.ACTIVE.in(values), limit);
    }

    /**
     * Find records that have <code>METADATA IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.mbse.action.domain.tables.pojos.IJob>> findManyByMetadata(Collection<String> values) {
        return findManyByCondition(IJob.I_JOB.METADATA.in(values));
    }

    /**
     * Find records that have <code>METADATA IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.mbse.action.domain.tables.pojos.IJob>> findManyByMetadata(Collection<String> values, int limit) {
        return findManyByCondition(IJob.I_JOB.METADATA.in(values), limit);
    }

    /**
     * Find records that have <code>CREATED_AT IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.mbse.action.domain.tables.pojos.IJob>> findManyByCreatedAt(Collection<LocalDateTime> values) {
        return findManyByCondition(IJob.I_JOB.CREATED_AT.in(values));
    }

    /**
     * Find records that have <code>CREATED_AT IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.mbse.action.domain.tables.pojos.IJob>> findManyByCreatedAt(Collection<LocalDateTime> values, int limit) {
        return findManyByCondition(IJob.I_JOB.CREATED_AT.in(values), limit);
    }

    /**
     * Find records that have <code>CREATED_BY IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.mbse.action.domain.tables.pojos.IJob>> findManyByCreatedBy(Collection<String> values) {
        return findManyByCondition(IJob.I_JOB.CREATED_BY.in(values));
    }

    /**
     * Find records that have <code>CREATED_BY IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.mbse.action.domain.tables.pojos.IJob>> findManyByCreatedBy(Collection<String> values, int limit) {
        return findManyByCondition(IJob.I_JOB.CREATED_BY.in(values), limit);
    }

    /**
     * Find records that have <code>UPDATED_AT IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.mbse.action.domain.tables.pojos.IJob>> findManyByUpdatedAt(Collection<LocalDateTime> values) {
        return findManyByCondition(IJob.I_JOB.UPDATED_AT.in(values));
    }

    /**
     * Find records that have <code>UPDATED_AT IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.mbse.action.domain.tables.pojos.IJob>> findManyByUpdatedAt(Collection<LocalDateTime> values, int limit) {
        return findManyByCondition(IJob.I_JOB.UPDATED_AT.in(values), limit);
    }

    /**
     * Find records that have <code>UPDATED_BY IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.mbse.action.domain.tables.pojos.IJob>> findManyByUpdatedBy(Collection<String> values) {
        return findManyByCondition(IJob.I_JOB.UPDATED_BY.in(values));
    }

    /**
     * Find records that have <code>UPDATED_BY IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.mbse.action.domain.tables.pojos.IJob>> findManyByUpdatedBy(Collection<String> values, int limit) {
        return findManyByCondition(IJob.I_JOB.UPDATED_BY.in(values), limit);
    }

    @Override
    public JDBCClassicQueryExecutor<IJobRecord, io.zerows.extension.mbse.action.domain.tables.pojos.IJob, String> queryExecutor() {
        return (JDBCClassicQueryExecutor<IJobRecord, io.zerows.extension.mbse.action.domain.tables.pojos.IJob, String>) super.queryExecutor();
    }
}
