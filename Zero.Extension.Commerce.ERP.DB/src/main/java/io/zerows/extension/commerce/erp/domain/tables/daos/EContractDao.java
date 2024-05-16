/*
 * This file is generated by jOOQ.
 */
package io.zerows.extension.commerce.erp.domain.tables.daos;


import io.github.jklingsporn.vertx.jooq.classic.jdbc.JDBCClassicQueryExecutor;
import io.github.jklingsporn.vertx.jooq.shared.internal.AbstractVertxDAO;
import io.vertx.core.Future;
import io.zerows.extension.commerce.erp.domain.tables.EContract;
import io.zerows.extension.commerce.erp.domain.tables.records.EContractRecord;
import org.jooq.Configuration;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Collection;
import java.util.List;

/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({"all", "unchecked", "rawtypes"})
public class EContractDao extends AbstractVertxDAO<EContractRecord, io.zerows.extension.commerce.erp.domain.tables.pojos.EContract, String, Future<List<io.zerows.extension.commerce.erp.domain.tables.pojos.EContract>>, Future<io.zerows.extension.commerce.erp.domain.tables.pojos.EContract>, Future<Integer>, Future<String>> implements io.github.jklingsporn.vertx.jooq.classic.VertxDAO<EContractRecord, io.zerows.extension.commerce.erp.domain.tables.pojos.EContract, String> {

    /**
     * @param configuration The Configuration used for rendering and query
     *                      execution.
     * @param vertx         the vertx instance
     */
    public EContractDao(Configuration configuration, io.vertx.core.Vertx vertx) {
        super(EContract.E_CONTRACT, io.zerows.extension.commerce.erp.domain.tables.pojos.EContract.class, new JDBCClassicQueryExecutor<EContractRecord, io.zerows.extension.commerce.erp.domain.tables.pojos.EContract, String>(configuration, io.zerows.extension.commerce.erp.domain.tables.pojos.EContract.class, vertx));
    }

    @Override
    protected String getId(io.zerows.extension.commerce.erp.domain.tables.pojos.EContract object) {
        return object.getKey();
    }

    /**
     * Find records that have <code>NAME IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.commerce.erp.domain.tables.pojos.EContract>> findManyByName(Collection<String> values) {
        return findManyByCondition(EContract.E_CONTRACT.NAME.in(values));
    }

    /**
     * Find records that have <code>NAME IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.commerce.erp.domain.tables.pojos.EContract>> findManyByName(Collection<String> values, int limit) {
        return findManyByCondition(EContract.E_CONTRACT.NAME.in(values), limit);
    }

    /**
     * Find records that have <code>CODE IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.commerce.erp.domain.tables.pojos.EContract>> findManyByCode(Collection<String> values) {
        return findManyByCondition(EContract.E_CONTRACT.CODE.in(values));
    }

    /**
     * Find records that have <code>CODE IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.commerce.erp.domain.tables.pojos.EContract>> findManyByCode(Collection<String> values, int limit) {
        return findManyByCondition(EContract.E_CONTRACT.CODE.in(values), limit);
    }

    /**
     * Find records that have <code>DEPT_ID IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.commerce.erp.domain.tables.pojos.EContract>> findManyByDeptId(Collection<String> values) {
        return findManyByCondition(EContract.E_CONTRACT.DEPT_ID.in(values));
    }

    /**
     * Find records that have <code>DEPT_ID IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.commerce.erp.domain.tables.pojos.EContract>> findManyByDeptId(Collection<String> values, int limit) {
        return findManyByCondition(EContract.E_CONTRACT.DEPT_ID.in(values), limit);
    }

    /**
     * Find records that have <code>TYPE IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.commerce.erp.domain.tables.pojos.EContract>> findManyByType(Collection<String> values) {
        return findManyByCondition(EContract.E_CONTRACT.TYPE.in(values));
    }

    /**
     * Find records that have <code>TYPE IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.commerce.erp.domain.tables.pojos.EContract>> findManyByType(Collection<String> values, int limit) {
        return findManyByCondition(EContract.E_CONTRACT.TYPE.in(values), limit);
    }

    /**
     * Find records that have <code>STATUS IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.commerce.erp.domain.tables.pojos.EContract>> findManyByStatus(Collection<String> values) {
        return findManyByCondition(EContract.E_CONTRACT.STATUS.in(values));
    }

    /**
     * Find records that have <code>STATUS IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.commerce.erp.domain.tables.pojos.EContract>> findManyByStatus(Collection<String> values, int limit) {
        return findManyByCondition(EContract.E_CONTRACT.STATUS.in(values), limit);
    }

    /**
     * Find records that have <code>BUDGET IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.commerce.erp.domain.tables.pojos.EContract>> findManyByBudget(Collection<String> values) {
        return findManyByCondition(EContract.E_CONTRACT.BUDGET.in(values));
    }

    /**
     * Find records that have <code>BUDGET IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.commerce.erp.domain.tables.pojos.EContract>> findManyByBudget(Collection<String> values, int limit) {
        return findManyByCondition(EContract.E_CONTRACT.BUDGET.in(values), limit);
    }

    /**
     * Find records that have <code>LEVEL IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.commerce.erp.domain.tables.pojos.EContract>> findManyByLevel(Collection<String> values) {
        return findManyByCondition(EContract.E_CONTRACT.LEVEL.in(values));
    }

    /**
     * Find records that have <code>LEVEL IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.commerce.erp.domain.tables.pojos.EContract>> findManyByLevel(Collection<String> values, int limit) {
        return findManyByCondition(EContract.E_CONTRACT.LEVEL.in(values), limit);
    }

    /**
     * Find records that have <code>TITLE IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.commerce.erp.domain.tables.pojos.EContract>> findManyByTitle(Collection<String> values) {
        return findManyByCondition(EContract.E_CONTRACT.TITLE.in(values));
    }

    /**
     * Find records that have <code>TITLE IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.commerce.erp.domain.tables.pojos.EContract>> findManyByTitle(Collection<String> values, int limit) {
        return findManyByCondition(EContract.E_CONTRACT.TITLE.in(values), limit);
    }

    /**
     * Find records that have <code>SUBJECT IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.commerce.erp.domain.tables.pojos.EContract>> findManyBySubject(Collection<String> values) {
        return findManyByCondition(EContract.E_CONTRACT.SUBJECT.in(values));
    }

    /**
     * Find records that have <code>SUBJECT IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.commerce.erp.domain.tables.pojos.EContract>> findManyBySubject(Collection<String> values, int limit) {
        return findManyByCondition(EContract.E_CONTRACT.SUBJECT.in(values), limit);
    }

    /**
     * Find records that have <code>DESCRIPTION IN (values)</code>
     * asynchronously
     */
    public Future<List<io.zerows.extension.commerce.erp.domain.tables.pojos.EContract>> findManyByDescription(Collection<String> values) {
        return findManyByCondition(EContract.E_CONTRACT.DESCRIPTION.in(values));
    }

    /**
     * Find records that have <code>DESCRIPTION IN (values)</code>
     * asynchronously limited by the given limit
     */
    public Future<List<io.zerows.extension.commerce.erp.domain.tables.pojos.EContract>> findManyByDescription(Collection<String> values, int limit) {
        return findManyByCondition(EContract.E_CONTRACT.DESCRIPTION.in(values), limit);
    }

    /**
     * Find records that have <code>AMOUNT IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.commerce.erp.domain.tables.pojos.EContract>> findManyByAmount(Collection<BigDecimal> values) {
        return findManyByCondition(EContract.E_CONTRACT.AMOUNT.in(values));
    }

    /**
     * Find records that have <code>AMOUNT IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.commerce.erp.domain.tables.pojos.EContract>> findManyByAmount(Collection<BigDecimal> values, int limit) {
        return findManyByCondition(EContract.E_CONTRACT.AMOUNT.in(values), limit);
    }

    /**
     * Find records that have <code>REMARK IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.commerce.erp.domain.tables.pojos.EContract>> findManyByRemark(Collection<String> values) {
        return findManyByCondition(EContract.E_CONTRACT.REMARK.in(values));
    }

    /**
     * Find records that have <code>REMARK IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.commerce.erp.domain.tables.pojos.EContract>> findManyByRemark(Collection<String> values, int limit) {
        return findManyByCondition(EContract.E_CONTRACT.REMARK.in(values), limit);
    }

    /**
     * Find records that have <code>PLAN_START_AT IN (values)</code>
     * asynchronously
     */
    public Future<List<io.zerows.extension.commerce.erp.domain.tables.pojos.EContract>> findManyByPlanStartAt(Collection<LocalDateTime> values) {
        return findManyByCondition(EContract.E_CONTRACT.PLAN_START_AT.in(values));
    }

    /**
     * Find records that have <code>PLAN_START_AT IN (values)</code>
     * asynchronously limited by the given limit
     */
    public Future<List<io.zerows.extension.commerce.erp.domain.tables.pojos.EContract>> findManyByPlanStartAt(Collection<LocalDateTime> values, int limit) {
        return findManyByCondition(EContract.E_CONTRACT.PLAN_START_AT.in(values), limit);
    }

    /**
     * Find records that have <code>PLAN_END_AT IN (values)</code>
     * asynchronously
     */
    public Future<List<io.zerows.extension.commerce.erp.domain.tables.pojos.EContract>> findManyByPlanEndAt(Collection<LocalDateTime> values) {
        return findManyByCondition(EContract.E_CONTRACT.PLAN_END_AT.in(values));
    }

    /**
     * Find records that have <code>PLAN_END_AT IN (values)</code>
     * asynchronously limited by the given limit
     */
    public Future<List<io.zerows.extension.commerce.erp.domain.tables.pojos.EContract>> findManyByPlanEndAt(Collection<LocalDateTime> values, int limit) {
        return findManyByCondition(EContract.E_CONTRACT.PLAN_END_AT.in(values), limit);
    }

    /**
     * Find records that have <code>START_AT IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.commerce.erp.domain.tables.pojos.EContract>> findManyByStartAt(Collection<LocalDateTime> values) {
        return findManyByCondition(EContract.E_CONTRACT.START_AT.in(values));
    }

    /**
     * Find records that have <code>START_AT IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.commerce.erp.domain.tables.pojos.EContract>> findManyByStartAt(Collection<LocalDateTime> values, int limit) {
        return findManyByCondition(EContract.E_CONTRACT.START_AT.in(values), limit);
    }

    /**
     * Find records that have <code>END_AT IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.commerce.erp.domain.tables.pojos.EContract>> findManyByEndAt(Collection<LocalDateTime> values) {
        return findManyByCondition(EContract.E_CONTRACT.END_AT.in(values));
    }

    /**
     * Find records that have <code>END_AT IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.commerce.erp.domain.tables.pojos.EContract>> findManyByEndAt(Collection<LocalDateTime> values, int limit) {
        return findManyByCondition(EContract.E_CONTRACT.END_AT.in(values), limit);
    }

    /**
     * Find records that have <code>SIGNED_BY IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.commerce.erp.domain.tables.pojos.EContract>> findManyBySignedBy(Collection<String> values) {
        return findManyByCondition(EContract.E_CONTRACT.SIGNED_BY.in(values));
    }

    /**
     * Find records that have <code>SIGNED_BY IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.commerce.erp.domain.tables.pojos.EContract>> findManyBySignedBy(Collection<String> values, int limit) {
        return findManyByCondition(EContract.E_CONTRACT.SIGNED_BY.in(values), limit);
    }

    /**
     * Find records that have <code>SIGNED_AT IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.commerce.erp.domain.tables.pojos.EContract>> findManyBySignedAt(Collection<LocalDateTime> values) {
        return findManyByCondition(EContract.E_CONTRACT.SIGNED_AT.in(values));
    }

    /**
     * Find records that have <code>SIGNED_AT IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.commerce.erp.domain.tables.pojos.EContract>> findManyBySignedAt(Collection<LocalDateTime> values, int limit) {
        return findManyByCondition(EContract.E_CONTRACT.SIGNED_AT.in(values), limit);
    }

    /**
     * Find records that have <code>PARTY_A IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.commerce.erp.domain.tables.pojos.EContract>> findManyByPartyA(Collection<String> values) {
        return findManyByCondition(EContract.E_CONTRACT.PARTY_A.in(values));
    }

    /**
     * Find records that have <code>PARTY_A IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.commerce.erp.domain.tables.pojos.EContract>> findManyByPartyA(Collection<String> values, int limit) {
        return findManyByCondition(EContract.E_CONTRACT.PARTY_A.in(values), limit);
    }

    /**
     * Find records that have <code>PARTY_B IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.commerce.erp.domain.tables.pojos.EContract>> findManyByPartyB(Collection<String> values) {
        return findManyByCondition(EContract.E_CONTRACT.PARTY_B.in(values));
    }

    /**
     * Find records that have <code>PARTY_B IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.commerce.erp.domain.tables.pojos.EContract>> findManyByPartyB(Collection<String> values, int limit) {
        return findManyByCondition(EContract.E_CONTRACT.PARTY_B.in(values), limit);
    }

    /**
     * Find records that have <code>A_NAME IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.commerce.erp.domain.tables.pojos.EContract>> findManyByAName(Collection<String> values) {
        return findManyByCondition(EContract.E_CONTRACT.A_NAME.in(values));
    }

    /**
     * Find records that have <code>A_NAME IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.commerce.erp.domain.tables.pojos.EContract>> findManyByAName(Collection<String> values, int limit) {
        return findManyByCondition(EContract.E_CONTRACT.A_NAME.in(values), limit);
    }

    /**
     * Find records that have <code>A_PHONE IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.commerce.erp.domain.tables.pojos.EContract>> findManyByAPhone(Collection<String> values) {
        return findManyByCondition(EContract.E_CONTRACT.A_PHONE.in(values));
    }

    /**
     * Find records that have <code>A_PHONE IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.commerce.erp.domain.tables.pojos.EContract>> findManyByAPhone(Collection<String> values, int limit) {
        return findManyByCondition(EContract.E_CONTRACT.A_PHONE.in(values), limit);
    }

    /**
     * Find records that have <code>A_LEGAL IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.commerce.erp.domain.tables.pojos.EContract>> findManyByALegal(Collection<String> values) {
        return findManyByCondition(EContract.E_CONTRACT.A_LEGAL.in(values));
    }

    /**
     * Find records that have <code>A_LEGAL IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.commerce.erp.domain.tables.pojos.EContract>> findManyByALegal(Collection<String> values, int limit) {
        return findManyByCondition(EContract.E_CONTRACT.A_LEGAL.in(values), limit);
    }

    /**
     * Find records that have <code>A_ADDRESS IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.commerce.erp.domain.tables.pojos.EContract>> findManyByAAddress(Collection<String> values) {
        return findManyByCondition(EContract.E_CONTRACT.A_ADDRESS.in(values));
    }

    /**
     * Find records that have <code>A_ADDRESS IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.commerce.erp.domain.tables.pojos.EContract>> findManyByAAddress(Collection<String> values, int limit) {
        return findManyByCondition(EContract.E_CONTRACT.A_ADDRESS.in(values), limit);
    }

    /**
     * Find records that have <code>B_NAME IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.commerce.erp.domain.tables.pojos.EContract>> findManyByBName(Collection<String> values) {
        return findManyByCondition(EContract.E_CONTRACT.B_NAME.in(values));
    }

    /**
     * Find records that have <code>B_NAME IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.commerce.erp.domain.tables.pojos.EContract>> findManyByBName(Collection<String> values, int limit) {
        return findManyByCondition(EContract.E_CONTRACT.B_NAME.in(values), limit);
    }

    /**
     * Find records that have <code>B_PHONE IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.commerce.erp.domain.tables.pojos.EContract>> findManyByBPhone(Collection<String> values) {
        return findManyByCondition(EContract.E_CONTRACT.B_PHONE.in(values));
    }

    /**
     * Find records that have <code>B_PHONE IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.commerce.erp.domain.tables.pojos.EContract>> findManyByBPhone(Collection<String> values, int limit) {
        return findManyByCondition(EContract.E_CONTRACT.B_PHONE.in(values), limit);
    }

    /**
     * Find records that have <code>B_LEGAL IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.commerce.erp.domain.tables.pojos.EContract>> findManyByBLegal(Collection<String> values) {
        return findManyByCondition(EContract.E_CONTRACT.B_LEGAL.in(values));
    }

    /**
     * Find records that have <code>B_LEGAL IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.commerce.erp.domain.tables.pojos.EContract>> findManyByBLegal(Collection<String> values, int limit) {
        return findManyByCondition(EContract.E_CONTRACT.B_LEGAL.in(values), limit);
    }

    /**
     * Find records that have <code>B_ADDRESS IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.commerce.erp.domain.tables.pojos.EContract>> findManyByBAddress(Collection<String> values) {
        return findManyByCondition(EContract.E_CONTRACT.B_ADDRESS.in(values));
    }

    /**
     * Find records that have <code>B_ADDRESS IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.commerce.erp.domain.tables.pojos.EContract>> findManyByBAddress(Collection<String> values, int limit) {
        return findManyByCondition(EContract.E_CONTRACT.B_ADDRESS.in(values), limit);
    }

    /**
     * Find records that have <code>METADATA IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.commerce.erp.domain.tables.pojos.EContract>> findManyByMetadata(Collection<String> values) {
        return findManyByCondition(EContract.E_CONTRACT.METADATA.in(values));
    }

    /**
     * Find records that have <code>METADATA IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.commerce.erp.domain.tables.pojos.EContract>> findManyByMetadata(Collection<String> values, int limit) {
        return findManyByCondition(EContract.E_CONTRACT.METADATA.in(values), limit);
    }

    /**
     * Find records that have <code>ACTIVE IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.commerce.erp.domain.tables.pojos.EContract>> findManyByActive(Collection<Boolean> values) {
        return findManyByCondition(EContract.E_CONTRACT.ACTIVE.in(values));
    }

    /**
     * Find records that have <code>ACTIVE IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.commerce.erp.domain.tables.pojos.EContract>> findManyByActive(Collection<Boolean> values, int limit) {
        return findManyByCondition(EContract.E_CONTRACT.ACTIVE.in(values), limit);
    }

    /**
     * Find records that have <code>SIGMA IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.commerce.erp.domain.tables.pojos.EContract>> findManyBySigma(Collection<String> values) {
        return findManyByCondition(EContract.E_CONTRACT.SIGMA.in(values));
    }

    /**
     * Find records that have <code>SIGMA IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.commerce.erp.domain.tables.pojos.EContract>> findManyBySigma(Collection<String> values, int limit) {
        return findManyByCondition(EContract.E_CONTRACT.SIGMA.in(values), limit);
    }

    /**
     * Find records that have <code>LANGUAGE IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.commerce.erp.domain.tables.pojos.EContract>> findManyByLanguage(Collection<String> values) {
        return findManyByCondition(EContract.E_CONTRACT.LANGUAGE.in(values));
    }

    /**
     * Find records that have <code>LANGUAGE IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.commerce.erp.domain.tables.pojos.EContract>> findManyByLanguage(Collection<String> values, int limit) {
        return findManyByCondition(EContract.E_CONTRACT.LANGUAGE.in(values), limit);
    }

    /**
     * Find records that have <code>CREATED_AT IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.commerce.erp.domain.tables.pojos.EContract>> findManyByCreatedAt(Collection<LocalDateTime> values) {
        return findManyByCondition(EContract.E_CONTRACT.CREATED_AT.in(values));
    }

    /**
     * Find records that have <code>CREATED_AT IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.commerce.erp.domain.tables.pojos.EContract>> findManyByCreatedAt(Collection<LocalDateTime> values, int limit) {
        return findManyByCondition(EContract.E_CONTRACT.CREATED_AT.in(values), limit);
    }

    /**
     * Find records that have <code>CREATED_BY IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.commerce.erp.domain.tables.pojos.EContract>> findManyByCreatedBy(Collection<String> values) {
        return findManyByCondition(EContract.E_CONTRACT.CREATED_BY.in(values));
    }

    /**
     * Find records that have <code>CREATED_BY IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.commerce.erp.domain.tables.pojos.EContract>> findManyByCreatedBy(Collection<String> values, int limit) {
        return findManyByCondition(EContract.E_CONTRACT.CREATED_BY.in(values), limit);
    }

    /**
     * Find records that have <code>UPDATED_AT IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.commerce.erp.domain.tables.pojos.EContract>> findManyByUpdatedAt(Collection<LocalDateTime> values) {
        return findManyByCondition(EContract.E_CONTRACT.UPDATED_AT.in(values));
    }

    /**
     * Find records that have <code>UPDATED_AT IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.commerce.erp.domain.tables.pojos.EContract>> findManyByUpdatedAt(Collection<LocalDateTime> values, int limit) {
        return findManyByCondition(EContract.E_CONTRACT.UPDATED_AT.in(values), limit);
    }

    /**
     * Find records that have <code>UPDATED_BY IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.commerce.erp.domain.tables.pojos.EContract>> findManyByUpdatedBy(Collection<String> values) {
        return findManyByCondition(EContract.E_CONTRACT.UPDATED_BY.in(values));
    }

    /**
     * Find records that have <code>UPDATED_BY IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.commerce.erp.domain.tables.pojos.EContract>> findManyByUpdatedBy(Collection<String> values, int limit) {
        return findManyByCondition(EContract.E_CONTRACT.UPDATED_BY.in(values), limit);
    }

    @Override
    public JDBCClassicQueryExecutor<EContractRecord, io.zerows.extension.commerce.erp.domain.tables.pojos.EContract, String> queryExecutor() {
        return (JDBCClassicQueryExecutor<EContractRecord, io.zerows.extension.commerce.erp.domain.tables.pojos.EContract, String>) super.queryExecutor();
    }
}