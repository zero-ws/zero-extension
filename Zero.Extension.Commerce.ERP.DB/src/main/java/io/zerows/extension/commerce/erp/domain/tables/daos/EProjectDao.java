/*
 * This file is generated by jOOQ.
 */
package io.zerows.extension.commerce.erp.domain.tables.daos;


import io.github.jklingsporn.vertx.jooq.classic.jdbc.JDBCClassicQueryExecutor;
import io.github.jklingsporn.vertx.jooq.shared.internal.AbstractVertxDAO;
import io.vertx.core.Future;
import io.zerows.extension.commerce.erp.domain.tables.EProject;
import io.zerows.extension.commerce.erp.domain.tables.records.EProjectRecord;
import org.jooq.Configuration;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Collection;
import java.util.List;

/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({"all", "unchecked", "rawtypes"})
public class EProjectDao extends AbstractVertxDAO<EProjectRecord, io.zerows.extension.commerce.erp.domain.tables.pojos.EProject, String, Future<List<io.zerows.extension.commerce.erp.domain.tables.pojos.EProject>>, Future<io.zerows.extension.commerce.erp.domain.tables.pojos.EProject>, Future<Integer>, Future<String>> implements io.github.jklingsporn.vertx.jooq.classic.VertxDAO<EProjectRecord, io.zerows.extension.commerce.erp.domain.tables.pojos.EProject, String> {

    /**
     * @param configuration The Configuration used for rendering and query
     *                      execution.
     * @param vertx         the vertx instance
     */
    public EProjectDao(Configuration configuration, io.vertx.core.Vertx vertx) {
        super(EProject.E_PROJECT, io.zerows.extension.commerce.erp.domain.tables.pojos.EProject.class, new JDBCClassicQueryExecutor<EProjectRecord, io.zerows.extension.commerce.erp.domain.tables.pojos.EProject, String>(configuration, io.zerows.extension.commerce.erp.domain.tables.pojos.EProject.class, vertx));
    }

    @Override
    protected String getId(io.zerows.extension.commerce.erp.domain.tables.pojos.EProject object) {
        return object.getKey();
    }

    /**
     * Find records that have <code>NAME IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.commerce.erp.domain.tables.pojos.EProject>> findManyByName(Collection<String> values) {
        return findManyByCondition(EProject.E_PROJECT.NAME.in(values));
    }

    /**
     * Find records that have <code>NAME IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.commerce.erp.domain.tables.pojos.EProject>> findManyByName(Collection<String> values, int limit) {
        return findManyByCondition(EProject.E_PROJECT.NAME.in(values), limit);
    }

    /**
     * Find records that have <code>CODE IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.commerce.erp.domain.tables.pojos.EProject>> findManyByCode(Collection<String> values) {
        return findManyByCondition(EProject.E_PROJECT.CODE.in(values));
    }

    /**
     * Find records that have <code>CODE IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.commerce.erp.domain.tables.pojos.EProject>> findManyByCode(Collection<String> values, int limit) {
        return findManyByCondition(EProject.E_PROJECT.CODE.in(values), limit);
    }

    /**
     * Find records that have <code>SHORT_NAME IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.commerce.erp.domain.tables.pojos.EProject>> findManyByShortName(Collection<String> values) {
        return findManyByCondition(EProject.E_PROJECT.SHORT_NAME.in(values));
    }

    /**
     * Find records that have <code>SHORT_NAME IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.commerce.erp.domain.tables.pojos.EProject>> findManyByShortName(Collection<String> values, int limit) {
        return findManyByCondition(EProject.E_PROJECT.SHORT_NAME.in(values), limit);
    }

    /**
     * Find records that have <code>DEPT_ID IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.commerce.erp.domain.tables.pojos.EProject>> findManyByDeptId(Collection<String> values) {
        return findManyByCondition(EProject.E_PROJECT.DEPT_ID.in(values));
    }

    /**
     * Find records that have <code>DEPT_ID IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.commerce.erp.domain.tables.pojos.EProject>> findManyByDeptId(Collection<String> values, int limit) {
        return findManyByCondition(EProject.E_PROJECT.DEPT_ID.in(values), limit);
    }

    /**
     * Find records that have <code>TYPE IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.commerce.erp.domain.tables.pojos.EProject>> findManyByType(Collection<String> values) {
        return findManyByCondition(EProject.E_PROJECT.TYPE.in(values));
    }

    /**
     * Find records that have <code>TYPE IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.commerce.erp.domain.tables.pojos.EProject>> findManyByType(Collection<String> values, int limit) {
        return findManyByCondition(EProject.E_PROJECT.TYPE.in(values), limit);
    }

    /**
     * Find records that have <code>STATUS IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.commerce.erp.domain.tables.pojos.EProject>> findManyByStatus(Collection<String> values) {
        return findManyByCondition(EProject.E_PROJECT.STATUS.in(values));
    }

    /**
     * Find records that have <code>STATUS IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.commerce.erp.domain.tables.pojos.EProject>> findManyByStatus(Collection<String> values, int limit) {
        return findManyByCondition(EProject.E_PROJECT.STATUS.in(values), limit);
    }

    /**
     * Find records that have <code>BUDGET IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.commerce.erp.domain.tables.pojos.EProject>> findManyByBudget(Collection<String> values) {
        return findManyByCondition(EProject.E_PROJECT.BUDGET.in(values));
    }

    /**
     * Find records that have <code>BUDGET IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.commerce.erp.domain.tables.pojos.EProject>> findManyByBudget(Collection<String> values, int limit) {
        return findManyByCondition(EProject.E_PROJECT.BUDGET.in(values), limit);
    }

    /**
     * Find records that have <code>LEVEL IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.commerce.erp.domain.tables.pojos.EProject>> findManyByLevel(Collection<String> values) {
        return findManyByCondition(EProject.E_PROJECT.LEVEL.in(values));
    }

    /**
     * Find records that have <code>LEVEL IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.commerce.erp.domain.tables.pojos.EProject>> findManyByLevel(Collection<String> values, int limit) {
        return findManyByCondition(EProject.E_PROJECT.LEVEL.in(values), limit);
    }

    /**
     * Find records that have <code>PRIORITY IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.commerce.erp.domain.tables.pojos.EProject>> findManyByPriority(Collection<String> values) {
        return findManyByCondition(EProject.E_PROJECT.PRIORITY.in(values));
    }

    /**
     * Find records that have <code>PRIORITY IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.commerce.erp.domain.tables.pojos.EProject>> findManyByPriority(Collection<String> values, int limit) {
        return findManyByCondition(EProject.E_PROJECT.PRIORITY.in(values), limit);
    }

    /**
     * Find records that have <code>RISK IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.commerce.erp.domain.tables.pojos.EProject>> findManyByRisk(Collection<String> values) {
        return findManyByCondition(EProject.E_PROJECT.RISK.in(values));
    }

    /**
     * Find records that have <code>RISK IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.commerce.erp.domain.tables.pojos.EProject>> findManyByRisk(Collection<String> values, int limit) {
        return findManyByCondition(EProject.E_PROJECT.RISK.in(values), limit);
    }

    /**
     * Find records that have <code>TITLE IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.commerce.erp.domain.tables.pojos.EProject>> findManyByTitle(Collection<String> values) {
        return findManyByCondition(EProject.E_PROJECT.TITLE.in(values));
    }

    /**
     * Find records that have <code>TITLE IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.commerce.erp.domain.tables.pojos.EProject>> findManyByTitle(Collection<String> values, int limit) {
        return findManyByCondition(EProject.E_PROJECT.TITLE.in(values), limit);
    }

    /**
     * Find records that have <code>ICON IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.commerce.erp.domain.tables.pojos.EProject>> findManyByIcon(Collection<String> values) {
        return findManyByCondition(EProject.E_PROJECT.ICON.in(values));
    }

    /**
     * Find records that have <code>ICON IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.commerce.erp.domain.tables.pojos.EProject>> findManyByIcon(Collection<String> values, int limit) {
        return findManyByCondition(EProject.E_PROJECT.ICON.in(values), limit);
    }

    /**
     * Find records that have <code>AMOUNT IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.commerce.erp.domain.tables.pojos.EProject>> findManyByAmount(Collection<BigDecimal> values) {
        return findManyByCondition(EProject.E_PROJECT.AMOUNT.in(values));
    }

    /**
     * Find records that have <code>AMOUNT IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.commerce.erp.domain.tables.pojos.EProject>> findManyByAmount(Collection<BigDecimal> values, int limit) {
        return findManyByCondition(EProject.E_PROJECT.AMOUNT.in(values), limit);
    }

    /**
     * Find records that have <code>SUBJECT IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.commerce.erp.domain.tables.pojos.EProject>> findManyBySubject(Collection<String> values) {
        return findManyByCondition(EProject.E_PROJECT.SUBJECT.in(values));
    }

    /**
     * Find records that have <code>SUBJECT IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.commerce.erp.domain.tables.pojos.EProject>> findManyBySubject(Collection<String> values, int limit) {
        return findManyByCondition(EProject.E_PROJECT.SUBJECT.in(values), limit);
    }

    /**
     * Find records that have <code>DESCRIPTION IN (values)</code>
     * asynchronously
     */
    public Future<List<io.zerows.extension.commerce.erp.domain.tables.pojos.EProject>> findManyByDescription(Collection<String> values) {
        return findManyByCondition(EProject.E_PROJECT.DESCRIPTION.in(values));
    }

    /**
     * Find records that have <code>DESCRIPTION IN (values)</code>
     * asynchronously limited by the given limit
     */
    public Future<List<io.zerows.extension.commerce.erp.domain.tables.pojos.EProject>> findManyByDescription(Collection<String> values, int limit) {
        return findManyByCondition(EProject.E_PROJECT.DESCRIPTION.in(values), limit);
    }

    /**
     * Find records that have <code>REMARK IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.commerce.erp.domain.tables.pojos.EProject>> findManyByRemark(Collection<String> values) {
        return findManyByCondition(EProject.E_PROJECT.REMARK.in(values));
    }

    /**
     * Find records that have <code>REMARK IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.commerce.erp.domain.tables.pojos.EProject>> findManyByRemark(Collection<String> values, int limit) {
        return findManyByCondition(EProject.E_PROJECT.REMARK.in(values), limit);
    }

    /**
     * Find records that have <code>LEAD_BY IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.commerce.erp.domain.tables.pojos.EProject>> findManyByLeadBy(Collection<String> values) {
        return findManyByCondition(EProject.E_PROJECT.LEAD_BY.in(values));
    }

    /**
     * Find records that have <code>LEAD_BY IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.commerce.erp.domain.tables.pojos.EProject>> findManyByLeadBy(Collection<String> values, int limit) {
        return findManyByCondition(EProject.E_PROJECT.LEAD_BY.in(values), limit);
    }

    /**
     * Find records that have <code>PLAN_START_AT IN (values)</code>
     * asynchronously
     */
    public Future<List<io.zerows.extension.commerce.erp.domain.tables.pojos.EProject>> findManyByPlanStartAt(Collection<LocalDateTime> values) {
        return findManyByCondition(EProject.E_PROJECT.PLAN_START_AT.in(values));
    }

    /**
     * Find records that have <code>PLAN_START_AT IN (values)</code>
     * asynchronously limited by the given limit
     */
    public Future<List<io.zerows.extension.commerce.erp.domain.tables.pojos.EProject>> findManyByPlanStartAt(Collection<LocalDateTime> values, int limit) {
        return findManyByCondition(EProject.E_PROJECT.PLAN_START_AT.in(values), limit);
    }

    /**
     * Find records that have <code>PLAN_END_AT IN (values)</code>
     * asynchronously
     */
    public Future<List<io.zerows.extension.commerce.erp.domain.tables.pojos.EProject>> findManyByPlanEndAt(Collection<LocalDateTime> values) {
        return findManyByCondition(EProject.E_PROJECT.PLAN_END_AT.in(values));
    }

    /**
     * Find records that have <code>PLAN_END_AT IN (values)</code>
     * asynchronously limited by the given limit
     */
    public Future<List<io.zerows.extension.commerce.erp.domain.tables.pojos.EProject>> findManyByPlanEndAt(Collection<LocalDateTime> values, int limit) {
        return findManyByCondition(EProject.E_PROJECT.PLAN_END_AT.in(values), limit);
    }

    /**
     * Find records that have <code>START_AT IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.commerce.erp.domain.tables.pojos.EProject>> findManyByStartAt(Collection<LocalDateTime> values) {
        return findManyByCondition(EProject.E_PROJECT.START_AT.in(values));
    }

    /**
     * Find records that have <code>START_AT IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.commerce.erp.domain.tables.pojos.EProject>> findManyByStartAt(Collection<LocalDateTime> values, int limit) {
        return findManyByCondition(EProject.E_PROJECT.START_AT.in(values), limit);
    }

    /**
     * Find records that have <code>END_AT IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.commerce.erp.domain.tables.pojos.EProject>> findManyByEndAt(Collection<LocalDateTime> values) {
        return findManyByCondition(EProject.E_PROJECT.END_AT.in(values));
    }

    /**
     * Find records that have <code>END_AT IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.commerce.erp.domain.tables.pojos.EProject>> findManyByEndAt(Collection<LocalDateTime> values, int limit) {
        return findManyByCondition(EProject.E_PROJECT.END_AT.in(values), limit);
    }

    /**
     * Find records that have <code>METADATA IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.commerce.erp.domain.tables.pojos.EProject>> findManyByMetadata(Collection<String> values) {
        return findManyByCondition(EProject.E_PROJECT.METADATA.in(values));
    }

    /**
     * Find records that have <code>METADATA IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.commerce.erp.domain.tables.pojos.EProject>> findManyByMetadata(Collection<String> values, int limit) {
        return findManyByCondition(EProject.E_PROJECT.METADATA.in(values), limit);
    }

    /**
     * Find records that have <code>ACTIVE IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.commerce.erp.domain.tables.pojos.EProject>> findManyByActive(Collection<Boolean> values) {
        return findManyByCondition(EProject.E_PROJECT.ACTIVE.in(values));
    }

    /**
     * Find records that have <code>ACTIVE IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.commerce.erp.domain.tables.pojos.EProject>> findManyByActive(Collection<Boolean> values, int limit) {
        return findManyByCondition(EProject.E_PROJECT.ACTIVE.in(values), limit);
    }

    /**
     * Find records that have <code>SIGMA IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.commerce.erp.domain.tables.pojos.EProject>> findManyBySigma(Collection<String> values) {
        return findManyByCondition(EProject.E_PROJECT.SIGMA.in(values));
    }

    /**
     * Find records that have <code>SIGMA IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.commerce.erp.domain.tables.pojos.EProject>> findManyBySigma(Collection<String> values, int limit) {
        return findManyByCondition(EProject.E_PROJECT.SIGMA.in(values), limit);
    }

    /**
     * Find records that have <code>LANGUAGE IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.commerce.erp.domain.tables.pojos.EProject>> findManyByLanguage(Collection<String> values) {
        return findManyByCondition(EProject.E_PROJECT.LANGUAGE.in(values));
    }

    /**
     * Find records that have <code>LANGUAGE IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.commerce.erp.domain.tables.pojos.EProject>> findManyByLanguage(Collection<String> values, int limit) {
        return findManyByCondition(EProject.E_PROJECT.LANGUAGE.in(values), limit);
    }

    /**
     * Find records that have <code>CREATED_AT IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.commerce.erp.domain.tables.pojos.EProject>> findManyByCreatedAt(Collection<LocalDateTime> values) {
        return findManyByCondition(EProject.E_PROJECT.CREATED_AT.in(values));
    }

    /**
     * Find records that have <code>CREATED_AT IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.commerce.erp.domain.tables.pojos.EProject>> findManyByCreatedAt(Collection<LocalDateTime> values, int limit) {
        return findManyByCondition(EProject.E_PROJECT.CREATED_AT.in(values), limit);
    }

    /**
     * Find records that have <code>CREATED_BY IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.commerce.erp.domain.tables.pojos.EProject>> findManyByCreatedBy(Collection<String> values) {
        return findManyByCondition(EProject.E_PROJECT.CREATED_BY.in(values));
    }

    /**
     * Find records that have <code>CREATED_BY IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.commerce.erp.domain.tables.pojos.EProject>> findManyByCreatedBy(Collection<String> values, int limit) {
        return findManyByCondition(EProject.E_PROJECT.CREATED_BY.in(values), limit);
    }

    /**
     * Find records that have <code>UPDATED_AT IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.commerce.erp.domain.tables.pojos.EProject>> findManyByUpdatedAt(Collection<LocalDateTime> values) {
        return findManyByCondition(EProject.E_PROJECT.UPDATED_AT.in(values));
    }

    /**
     * Find records that have <code>UPDATED_AT IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.commerce.erp.domain.tables.pojos.EProject>> findManyByUpdatedAt(Collection<LocalDateTime> values, int limit) {
        return findManyByCondition(EProject.E_PROJECT.UPDATED_AT.in(values), limit);
    }

    /**
     * Find records that have <code>UPDATED_BY IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.commerce.erp.domain.tables.pojos.EProject>> findManyByUpdatedBy(Collection<String> values) {
        return findManyByCondition(EProject.E_PROJECT.UPDATED_BY.in(values));
    }

    /**
     * Find records that have <code>UPDATED_BY IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.commerce.erp.domain.tables.pojos.EProject>> findManyByUpdatedBy(Collection<String> values, int limit) {
        return findManyByCondition(EProject.E_PROJECT.UPDATED_BY.in(values), limit);
    }

    @Override
    public JDBCClassicQueryExecutor<EProjectRecord, io.zerows.extension.commerce.erp.domain.tables.pojos.EProject, String> queryExecutor() {
        return (JDBCClassicQueryExecutor<EProjectRecord, io.zerows.extension.commerce.erp.domain.tables.pojos.EProject, String>) super.queryExecutor();
    }
}
