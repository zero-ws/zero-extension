/*
 * This file is generated by jOOQ.
 */
package io.zerows.extension.commerce.finance.domain.tables.daos;


import io.github.jklingsporn.vertx.jooq.classic.jdbc.JDBCClassicQueryExecutor;
import io.github.jklingsporn.vertx.jooq.shared.internal.AbstractVertxDAO;
import io.vertx.core.Future;
import io.zerows.extension.commerce.finance.domain.tables.FDebt;
import io.zerows.extension.commerce.finance.domain.tables.records.FDebtRecord;
import org.jooq.Configuration;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Collection;
import java.util.List;

/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({"all", "unchecked", "rawtypes"})
public class FDebtDao extends AbstractVertxDAO<FDebtRecord, io.zerows.extension.commerce.finance.domain.tables.pojos.FDebt, String, Future<List<io.zerows.extension.commerce.finance.domain.tables.pojos.FDebt>>, Future<io.zerows.extension.commerce.finance.domain.tables.pojos.FDebt>, Future<Integer>, Future<String>> implements io.github.jklingsporn.vertx.jooq.classic.VertxDAO<FDebtRecord, io.zerows.extension.commerce.finance.domain.tables.pojos.FDebt, String> {

    /**
     * @param configuration The Configuration used for rendering and query
     *                      execution.
     * @param vertx         the vertx instance
     */
    public FDebtDao(Configuration configuration, io.vertx.core.Vertx vertx) {
        super(FDebt.F_DEBT, io.zerows.extension.commerce.finance.domain.tables.pojos.FDebt.class, new JDBCClassicQueryExecutor<FDebtRecord, io.zerows.extension.commerce.finance.domain.tables.pojos.FDebt, String>(configuration, io.zerows.extension.commerce.finance.domain.tables.pojos.FDebt.class, vertx));
    }

    @Override
    protected String getId(io.zerows.extension.commerce.finance.domain.tables.pojos.FDebt object) {
        return object.getKey();
    }

    /**
     * Find records that have <code>NAME IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.commerce.finance.domain.tables.pojos.FDebt>> findManyByName(Collection<String> values) {
        return findManyByCondition(FDebt.F_DEBT.NAME.in(values));
    }

    /**
     * Find records that have <code>NAME IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.commerce.finance.domain.tables.pojos.FDebt>> findManyByName(Collection<String> values, int limit) {
        return findManyByCondition(FDebt.F_DEBT.NAME.in(values), limit);
    }

    /**
     * Find records that have <code>CODE IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.commerce.finance.domain.tables.pojos.FDebt>> findManyByCode(Collection<String> values) {
        return findManyByCondition(FDebt.F_DEBT.CODE.in(values));
    }

    /**
     * Find records that have <code>CODE IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.commerce.finance.domain.tables.pojos.FDebt>> findManyByCode(Collection<String> values, int limit) {
        return findManyByCondition(FDebt.F_DEBT.CODE.in(values), limit);
    }

    /**
     * Find records that have <code>SERIAL IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.commerce.finance.domain.tables.pojos.FDebt>> findManyBySerial(Collection<String> values) {
        return findManyByCondition(FDebt.F_DEBT.SERIAL.in(values));
    }

    /**
     * Find records that have <code>SERIAL IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.commerce.finance.domain.tables.pojos.FDebt>> findManyBySerial(Collection<String> values, int limit) {
        return findManyByCondition(FDebt.F_DEBT.SERIAL.in(values), limit);
    }

    /**
     * Find records that have <code>TYPE IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.commerce.finance.domain.tables.pojos.FDebt>> findManyByType(Collection<String> values) {
        return findManyByCondition(FDebt.F_DEBT.TYPE.in(values));
    }

    /**
     * Find records that have <code>TYPE IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.commerce.finance.domain.tables.pojos.FDebt>> findManyByType(Collection<String> values, int limit) {
        return findManyByCondition(FDebt.F_DEBT.TYPE.in(values), limit);
    }

    /**
     * Find records that have <code>AMOUNT IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.commerce.finance.domain.tables.pojos.FDebt>> findManyByAmount(Collection<BigDecimal> values) {
        return findManyByCondition(FDebt.F_DEBT.AMOUNT.in(values));
    }

    /**
     * Find records that have <code>AMOUNT IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.commerce.finance.domain.tables.pojos.FDebt>> findManyByAmount(Collection<BigDecimal> values, int limit) {
        return findManyByCondition(FDebt.F_DEBT.AMOUNT.in(values), limit);
    }

    /**
     * Find records that have <code>AMOUNT_BALANCE IN (values)</code>
     * asynchronously
     */
    public Future<List<io.zerows.extension.commerce.finance.domain.tables.pojos.FDebt>> findManyByAmountBalance(Collection<BigDecimal> values) {
        return findManyByCondition(FDebt.F_DEBT.AMOUNT_BALANCE.in(values));
    }

    /**
     * Find records that have <code>AMOUNT_BALANCE IN (values)</code>
     * asynchronously limited by the given limit
     */
    public Future<List<io.zerows.extension.commerce.finance.domain.tables.pojos.FDebt>> findManyByAmountBalance(Collection<BigDecimal> values, int limit) {
        return findManyByCondition(FDebt.F_DEBT.AMOUNT_BALANCE.in(values), limit);
    }

    /**
     * Find records that have <code>FINISHED IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.commerce.finance.domain.tables.pojos.FDebt>> findManyByFinished(Collection<Boolean> values) {
        return findManyByCondition(FDebt.F_DEBT.FINISHED.in(values));
    }

    /**
     * Find records that have <code>FINISHED IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.commerce.finance.domain.tables.pojos.FDebt>> findManyByFinished(Collection<Boolean> values, int limit) {
        return findManyByCondition(FDebt.F_DEBT.FINISHED.in(values), limit);
    }

    /**
     * Find records that have <code>FINISHED_AT IN (values)</code>
     * asynchronously
     */
    public Future<List<io.zerows.extension.commerce.finance.domain.tables.pojos.FDebt>> findManyByFinishedAt(Collection<LocalDateTime> values) {
        return findManyByCondition(FDebt.F_DEBT.FINISHED_AT.in(values));
    }

    /**
     * Find records that have <code>FINISHED_AT IN (values)</code>
     * asynchronously limited by the given limit
     */
    public Future<List<io.zerows.extension.commerce.finance.domain.tables.pojos.FDebt>> findManyByFinishedAt(Collection<LocalDateTime> values, int limit) {
        return findManyByCondition(FDebt.F_DEBT.FINISHED_AT.in(values), limit);
    }

    /**
     * Find records that have <code>SIGN_NAME IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.commerce.finance.domain.tables.pojos.FDebt>> findManyBySignName(Collection<String> values) {
        return findManyByCondition(FDebt.F_DEBT.SIGN_NAME.in(values));
    }

    /**
     * Find records that have <code>SIGN_NAME IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.commerce.finance.domain.tables.pojos.FDebt>> findManyBySignName(Collection<String> values, int limit) {
        return findManyByCondition(FDebt.F_DEBT.SIGN_NAME.in(values), limit);
    }

    /**
     * Find records that have <code>SIGN_MOBILE IN (values)</code>
     * asynchronously
     */
    public Future<List<io.zerows.extension.commerce.finance.domain.tables.pojos.FDebt>> findManyBySignMobile(Collection<String> values) {
        return findManyByCondition(FDebt.F_DEBT.SIGN_MOBILE.in(values));
    }

    /**
     * Find records that have <code>SIGN_MOBILE IN (values)</code>
     * asynchronously limited by the given limit
     */
    public Future<List<io.zerows.extension.commerce.finance.domain.tables.pojos.FDebt>> findManyBySignMobile(Collection<String> values, int limit) {
        return findManyByCondition(FDebt.F_DEBT.SIGN_MOBILE.in(values), limit);
    }

    /**
     * Find records that have <code>COMMENT IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.commerce.finance.domain.tables.pojos.FDebt>> findManyByComment(Collection<String> values) {
        return findManyByCondition(FDebt.F_DEBT.COMMENT.in(values));
    }

    /**
     * Find records that have <code>COMMENT IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.commerce.finance.domain.tables.pojos.FDebt>> findManyByComment(Collection<String> values, int limit) {
        return findManyByCondition(FDebt.F_DEBT.COMMENT.in(values), limit);
    }

    /**
     * Find records that have <code>CUSTOMER_ID IN (values)</code>
     * asynchronously
     */
    public Future<List<io.zerows.extension.commerce.finance.domain.tables.pojos.FDebt>> findManyByCustomerId(Collection<String> values) {
        return findManyByCondition(FDebt.F_DEBT.CUSTOMER_ID.in(values));
    }

    /**
     * Find records that have <code>CUSTOMER_ID IN (values)</code>
     * asynchronously limited by the given limit
     */
    public Future<List<io.zerows.extension.commerce.finance.domain.tables.pojos.FDebt>> findManyByCustomerId(Collection<String> values, int limit) {
        return findManyByCondition(FDebt.F_DEBT.CUSTOMER_ID.in(values), limit);
    }

    /**
     * Find records that have <code>SIGMA IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.commerce.finance.domain.tables.pojos.FDebt>> findManyBySigma(Collection<String> values) {
        return findManyByCondition(FDebt.F_DEBT.SIGMA.in(values));
    }

    /**
     * Find records that have <code>SIGMA IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.commerce.finance.domain.tables.pojos.FDebt>> findManyBySigma(Collection<String> values, int limit) {
        return findManyByCondition(FDebt.F_DEBT.SIGMA.in(values), limit);
    }

    /**
     * Find records that have <code>LANGUAGE IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.commerce.finance.domain.tables.pojos.FDebt>> findManyByLanguage(Collection<String> values) {
        return findManyByCondition(FDebt.F_DEBT.LANGUAGE.in(values));
    }

    /**
     * Find records that have <code>LANGUAGE IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.commerce.finance.domain.tables.pojos.FDebt>> findManyByLanguage(Collection<String> values, int limit) {
        return findManyByCondition(FDebt.F_DEBT.LANGUAGE.in(values), limit);
    }

    /**
     * Find records that have <code>ACTIVE IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.commerce.finance.domain.tables.pojos.FDebt>> findManyByActive(Collection<Boolean> values) {
        return findManyByCondition(FDebt.F_DEBT.ACTIVE.in(values));
    }

    /**
     * Find records that have <code>ACTIVE IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.commerce.finance.domain.tables.pojos.FDebt>> findManyByActive(Collection<Boolean> values, int limit) {
        return findManyByCondition(FDebt.F_DEBT.ACTIVE.in(values), limit);
    }

    /**
     * Find records that have <code>METADATA IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.commerce.finance.domain.tables.pojos.FDebt>> findManyByMetadata(Collection<String> values) {
        return findManyByCondition(FDebt.F_DEBT.METADATA.in(values));
    }

    /**
     * Find records that have <code>METADATA IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.commerce.finance.domain.tables.pojos.FDebt>> findManyByMetadata(Collection<String> values, int limit) {
        return findManyByCondition(FDebt.F_DEBT.METADATA.in(values), limit);
    }

    /**
     * Find records that have <code>CREATED_AT IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.commerce.finance.domain.tables.pojos.FDebt>> findManyByCreatedAt(Collection<LocalDateTime> values) {
        return findManyByCondition(FDebt.F_DEBT.CREATED_AT.in(values));
    }

    /**
     * Find records that have <code>CREATED_AT IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.commerce.finance.domain.tables.pojos.FDebt>> findManyByCreatedAt(Collection<LocalDateTime> values, int limit) {
        return findManyByCondition(FDebt.F_DEBT.CREATED_AT.in(values), limit);
    }

    /**
     * Find records that have <code>CREATED_BY IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.commerce.finance.domain.tables.pojos.FDebt>> findManyByCreatedBy(Collection<String> values) {
        return findManyByCondition(FDebt.F_DEBT.CREATED_BY.in(values));
    }

    /**
     * Find records that have <code>CREATED_BY IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.commerce.finance.domain.tables.pojos.FDebt>> findManyByCreatedBy(Collection<String> values, int limit) {
        return findManyByCondition(FDebt.F_DEBT.CREATED_BY.in(values), limit);
    }

    /**
     * Find records that have <code>UPDATED_AT IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.commerce.finance.domain.tables.pojos.FDebt>> findManyByUpdatedAt(Collection<LocalDateTime> values) {
        return findManyByCondition(FDebt.F_DEBT.UPDATED_AT.in(values));
    }

    /**
     * Find records that have <code>UPDATED_AT IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.commerce.finance.domain.tables.pojos.FDebt>> findManyByUpdatedAt(Collection<LocalDateTime> values, int limit) {
        return findManyByCondition(FDebt.F_DEBT.UPDATED_AT.in(values), limit);
    }

    /**
     * Find records that have <code>UPDATED_BY IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.commerce.finance.domain.tables.pojos.FDebt>> findManyByUpdatedBy(Collection<String> values) {
        return findManyByCondition(FDebt.F_DEBT.UPDATED_BY.in(values));
    }

    /**
     * Find records that have <code>UPDATED_BY IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.commerce.finance.domain.tables.pojos.FDebt>> findManyByUpdatedBy(Collection<String> values, int limit) {
        return findManyByCondition(FDebt.F_DEBT.UPDATED_BY.in(values), limit);
    }

    @Override
    public JDBCClassicQueryExecutor<FDebtRecord, io.zerows.extension.commerce.finance.domain.tables.pojos.FDebt, String> queryExecutor() {
        return (JDBCClassicQueryExecutor<FDebtRecord, io.zerows.extension.commerce.finance.domain.tables.pojos.FDebt, String>) super.queryExecutor();
    }
}