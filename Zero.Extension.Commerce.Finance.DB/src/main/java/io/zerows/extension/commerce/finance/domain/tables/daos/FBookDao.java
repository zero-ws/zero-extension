/*
 * This file is generated by jOOQ.
 */
package io.zerows.extension.commerce.finance.domain.tables.daos;


import io.github.jklingsporn.vertx.jooq.classic.jdbc.JDBCClassicQueryExecutor;
import io.github.jklingsporn.vertx.jooq.shared.internal.AbstractVertxDAO;
import io.vertx.core.Future;
import io.zerows.extension.commerce.finance.domain.tables.FBook;
import io.zerows.extension.commerce.finance.domain.tables.records.FBookRecord;
import org.jooq.Configuration;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Collection;
import java.util.List;

/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({"all", "unchecked", "rawtypes"})
public class FBookDao extends AbstractVertxDAO<FBookRecord, io.zerows.extension.commerce.finance.domain.tables.pojos.FBook, String, Future<List<io.zerows.extension.commerce.finance.domain.tables.pojos.FBook>>, Future<io.zerows.extension.commerce.finance.domain.tables.pojos.FBook>, Future<Integer>, Future<String>> implements io.github.jklingsporn.vertx.jooq.classic.VertxDAO<FBookRecord, io.zerows.extension.commerce.finance.domain.tables.pojos.FBook, String> {

    /**
     * @param configuration The Configuration used for rendering and query
     *                      execution.
     * @param vertx         the vertx instance
     */
    public FBookDao(Configuration configuration, io.vertx.core.Vertx vertx) {
        super(FBook.F_BOOK, io.zerows.extension.commerce.finance.domain.tables.pojos.FBook.class, new JDBCClassicQueryExecutor<FBookRecord, io.zerows.extension.commerce.finance.domain.tables.pojos.FBook, String>(configuration, io.zerows.extension.commerce.finance.domain.tables.pojos.FBook.class, vertx));
    }

    @Override
    protected String getId(io.zerows.extension.commerce.finance.domain.tables.pojos.FBook object) {
        return object.getKey();
    }

    /**
     * Find records that have <code>NAME IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.commerce.finance.domain.tables.pojos.FBook>> findManyByName(Collection<String> values) {
        return findManyByCondition(FBook.F_BOOK.NAME.in(values));
    }

    /**
     * Find records that have <code>NAME IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.commerce.finance.domain.tables.pojos.FBook>> findManyByName(Collection<String> values, int limit) {
        return findManyByCondition(FBook.F_BOOK.NAME.in(values), limit);
    }

    /**
     * Find records that have <code>CODE IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.commerce.finance.domain.tables.pojos.FBook>> findManyByCode(Collection<String> values) {
        return findManyByCondition(FBook.F_BOOK.CODE.in(values));
    }

    /**
     * Find records that have <code>CODE IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.commerce.finance.domain.tables.pojos.FBook>> findManyByCode(Collection<String> values, int limit) {
        return findManyByCondition(FBook.F_BOOK.CODE.in(values), limit);
    }

    /**
     * Find records that have <code>SERIAL IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.commerce.finance.domain.tables.pojos.FBook>> findManyBySerial(Collection<String> values) {
        return findManyByCondition(FBook.F_BOOK.SERIAL.in(values));
    }

    /**
     * Find records that have <code>SERIAL IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.commerce.finance.domain.tables.pojos.FBook>> findManyBySerial(Collection<String> values, int limit) {
        return findManyByCondition(FBook.F_BOOK.SERIAL.in(values), limit);
    }

    /**
     * Find records that have <code>TYPE IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.commerce.finance.domain.tables.pojos.FBook>> findManyByType(Collection<String> values) {
        return findManyByCondition(FBook.F_BOOK.TYPE.in(values));
    }

    /**
     * Find records that have <code>TYPE IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.commerce.finance.domain.tables.pojos.FBook>> findManyByType(Collection<String> values, int limit) {
        return findManyByCondition(FBook.F_BOOK.TYPE.in(values), limit);
    }

    /**
     * Find records that have <code>STATUS IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.commerce.finance.domain.tables.pojos.FBook>> findManyByStatus(Collection<String> values) {
        return findManyByCondition(FBook.F_BOOK.STATUS.in(values));
    }

    /**
     * Find records that have <code>STATUS IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.commerce.finance.domain.tables.pojos.FBook>> findManyByStatus(Collection<String> values, int limit) {
        return findManyByCondition(FBook.F_BOOK.STATUS.in(values), limit);
    }

    /**
     * Find records that have <code>MAJOR IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.commerce.finance.domain.tables.pojos.FBook>> findManyByMajor(Collection<Boolean> values) {
        return findManyByCondition(FBook.F_BOOK.MAJOR.in(values));
    }

    /**
     * Find records that have <code>MAJOR IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.commerce.finance.domain.tables.pojos.FBook>> findManyByMajor(Collection<Boolean> values, int limit) {
        return findManyByCondition(FBook.F_BOOK.MAJOR.in(values), limit);
    }

    /**
     * Find records that have <code>AMOUNT IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.commerce.finance.domain.tables.pojos.FBook>> findManyByAmount(Collection<BigDecimal> values) {
        return findManyByCondition(FBook.F_BOOK.AMOUNT.in(values));
    }

    /**
     * Find records that have <code>AMOUNT IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.commerce.finance.domain.tables.pojos.FBook>> findManyByAmount(Collection<BigDecimal> values, int limit) {
        return findManyByCondition(FBook.F_BOOK.AMOUNT.in(values), limit);
    }

    /**
     * Find records that have <code>COMMENT IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.commerce.finance.domain.tables.pojos.FBook>> findManyByComment(Collection<String> values) {
        return findManyByCondition(FBook.F_BOOK.COMMENT.in(values));
    }

    /**
     * Find records that have <code>COMMENT IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.commerce.finance.domain.tables.pojos.FBook>> findManyByComment(Collection<String> values, int limit) {
        return findManyByCondition(FBook.F_BOOK.COMMENT.in(values), limit);
    }

    /**
     * Find records that have <code>CHECKED IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.commerce.finance.domain.tables.pojos.FBook>> findManyByChecked(Collection<Boolean> values) {
        return findManyByCondition(FBook.F_BOOK.CHECKED.in(values));
    }

    /**
     * Find records that have <code>CHECKED IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.commerce.finance.domain.tables.pojos.FBook>> findManyByChecked(Collection<Boolean> values, int limit) {
        return findManyByCondition(FBook.F_BOOK.CHECKED.in(values), limit);
    }

    /**
     * Find records that have <code>CHECKED_DESC IN (values)</code>
     * asynchronously
     */
    public Future<List<io.zerows.extension.commerce.finance.domain.tables.pojos.FBook>> findManyByCheckedDesc(Collection<String> values) {
        return findManyByCondition(FBook.F_BOOK.CHECKED_DESC.in(values));
    }

    /**
     * Find records that have <code>CHECKED_DESC IN (values)</code>
     * asynchronously limited by the given limit
     */
    public Future<List<io.zerows.extension.commerce.finance.domain.tables.pojos.FBook>> findManyByCheckedDesc(Collection<String> values, int limit) {
        return findManyByCondition(FBook.F_BOOK.CHECKED_DESC.in(values), limit);
    }

    /**
     * Find records that have <code>EXCEED IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.commerce.finance.domain.tables.pojos.FBook>> findManyByExceed(Collection<Boolean> values) {
        return findManyByCondition(FBook.F_BOOK.EXCEED.in(values));
    }

    /**
     * Find records that have <code>EXCEED IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.commerce.finance.domain.tables.pojos.FBook>> findManyByExceed(Collection<Boolean> values, int limit) {
        return findManyByCondition(FBook.F_BOOK.EXCEED.in(values), limit);
    }

    /**
     * Find records that have <code>EXCEED_DESC IN (values)</code>
     * asynchronously
     */
    public Future<List<io.zerows.extension.commerce.finance.domain.tables.pojos.FBook>> findManyByExceedDesc(Collection<String> values) {
        return findManyByCondition(FBook.F_BOOK.EXCEED_DESC.in(values));
    }

    /**
     * Find records that have <code>EXCEED_DESC IN (values)</code>
     * asynchronously limited by the given limit
     */
    public Future<List<io.zerows.extension.commerce.finance.domain.tables.pojos.FBook>> findManyByExceedDesc(Collection<String> values, int limit) {
        return findManyByCondition(FBook.F_BOOK.EXCEED_DESC.in(values), limit);
    }

    /**
     * Find records that have <code>MODEL_ID IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.commerce.finance.domain.tables.pojos.FBook>> findManyByModelId(Collection<String> values) {
        return findManyByCondition(FBook.F_BOOK.MODEL_ID.in(values));
    }

    /**
     * Find records that have <code>MODEL_ID IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.commerce.finance.domain.tables.pojos.FBook>> findManyByModelId(Collection<String> values, int limit) {
        return findManyByCondition(FBook.F_BOOK.MODEL_ID.in(values), limit);
    }

    /**
     * Find records that have <code>MODEL_KEY IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.commerce.finance.domain.tables.pojos.FBook>> findManyByModelKey(Collection<String> values) {
        return findManyByCondition(FBook.F_BOOK.MODEL_KEY.in(values));
    }

    /**
     * Find records that have <code>MODEL_KEY IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.commerce.finance.domain.tables.pojos.FBook>> findManyByModelKey(Collection<String> values, int limit) {
        return findManyByCondition(FBook.F_BOOK.MODEL_KEY.in(values), limit);
    }

    /**
     * Find records that have <code>PARENT_ID IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.commerce.finance.domain.tables.pojos.FBook>> findManyByParentId(Collection<String> values) {
        return findManyByCondition(FBook.F_BOOK.PARENT_ID.in(values));
    }

    /**
     * Find records that have <code>PARENT_ID IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.commerce.finance.domain.tables.pojos.FBook>> findManyByParentId(Collection<String> values, int limit) {
        return findManyByCondition(FBook.F_BOOK.PARENT_ID.in(values), limit);
    }

    /**
     * Find records that have <code>ORDER_ID IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.commerce.finance.domain.tables.pojos.FBook>> findManyByOrderId(Collection<String> values) {
        return findManyByCondition(FBook.F_BOOK.ORDER_ID.in(values));
    }

    /**
     * Find records that have <code>ORDER_ID IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.commerce.finance.domain.tables.pojos.FBook>> findManyByOrderId(Collection<String> values, int limit) {
        return findManyByCondition(FBook.F_BOOK.ORDER_ID.in(values), limit);
    }

    /**
     * Find records that have <code>SIGMA IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.commerce.finance.domain.tables.pojos.FBook>> findManyBySigma(Collection<String> values) {
        return findManyByCondition(FBook.F_BOOK.SIGMA.in(values));
    }

    /**
     * Find records that have <code>SIGMA IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.commerce.finance.domain.tables.pojos.FBook>> findManyBySigma(Collection<String> values, int limit) {
        return findManyByCondition(FBook.F_BOOK.SIGMA.in(values), limit);
    }

    /**
     * Find records that have <code>LANGUAGE IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.commerce.finance.domain.tables.pojos.FBook>> findManyByLanguage(Collection<String> values) {
        return findManyByCondition(FBook.F_BOOK.LANGUAGE.in(values));
    }

    /**
     * Find records that have <code>LANGUAGE IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.commerce.finance.domain.tables.pojos.FBook>> findManyByLanguage(Collection<String> values, int limit) {
        return findManyByCondition(FBook.F_BOOK.LANGUAGE.in(values), limit);
    }

    /**
     * Find records that have <code>ACTIVE IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.commerce.finance.domain.tables.pojos.FBook>> findManyByActive(Collection<Boolean> values) {
        return findManyByCondition(FBook.F_BOOK.ACTIVE.in(values));
    }

    /**
     * Find records that have <code>ACTIVE IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.commerce.finance.domain.tables.pojos.FBook>> findManyByActive(Collection<Boolean> values, int limit) {
        return findManyByCondition(FBook.F_BOOK.ACTIVE.in(values), limit);
    }

    /**
     * Find records that have <code>METADATA IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.commerce.finance.domain.tables.pojos.FBook>> findManyByMetadata(Collection<String> values) {
        return findManyByCondition(FBook.F_BOOK.METADATA.in(values));
    }

    /**
     * Find records that have <code>METADATA IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.commerce.finance.domain.tables.pojos.FBook>> findManyByMetadata(Collection<String> values, int limit) {
        return findManyByCondition(FBook.F_BOOK.METADATA.in(values), limit);
    }

    /**
     * Find records that have <code>CREATED_AT IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.commerce.finance.domain.tables.pojos.FBook>> findManyByCreatedAt(Collection<LocalDateTime> values) {
        return findManyByCondition(FBook.F_BOOK.CREATED_AT.in(values));
    }

    /**
     * Find records that have <code>CREATED_AT IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.commerce.finance.domain.tables.pojos.FBook>> findManyByCreatedAt(Collection<LocalDateTime> values, int limit) {
        return findManyByCondition(FBook.F_BOOK.CREATED_AT.in(values), limit);
    }

    /**
     * Find records that have <code>CREATED_BY IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.commerce.finance.domain.tables.pojos.FBook>> findManyByCreatedBy(Collection<String> values) {
        return findManyByCondition(FBook.F_BOOK.CREATED_BY.in(values));
    }

    /**
     * Find records that have <code>CREATED_BY IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.commerce.finance.domain.tables.pojos.FBook>> findManyByCreatedBy(Collection<String> values, int limit) {
        return findManyByCondition(FBook.F_BOOK.CREATED_BY.in(values), limit);
    }

    /**
     * Find records that have <code>UPDATED_AT IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.commerce.finance.domain.tables.pojos.FBook>> findManyByUpdatedAt(Collection<LocalDateTime> values) {
        return findManyByCondition(FBook.F_BOOK.UPDATED_AT.in(values));
    }

    /**
     * Find records that have <code>UPDATED_AT IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.commerce.finance.domain.tables.pojos.FBook>> findManyByUpdatedAt(Collection<LocalDateTime> values, int limit) {
        return findManyByCondition(FBook.F_BOOK.UPDATED_AT.in(values), limit);
    }

    /**
     * Find records that have <code>UPDATED_BY IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.commerce.finance.domain.tables.pojos.FBook>> findManyByUpdatedBy(Collection<String> values) {
        return findManyByCondition(FBook.F_BOOK.UPDATED_BY.in(values));
    }

    /**
     * Find records that have <code>UPDATED_BY IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.commerce.finance.domain.tables.pojos.FBook>> findManyByUpdatedBy(Collection<String> values, int limit) {
        return findManyByCondition(FBook.F_BOOK.UPDATED_BY.in(values), limit);
    }

    @Override
    public JDBCClassicQueryExecutor<FBookRecord, io.zerows.extension.commerce.finance.domain.tables.pojos.FBook, String> queryExecutor() {
        return (JDBCClassicQueryExecutor<FBookRecord, io.zerows.extension.commerce.finance.domain.tables.pojos.FBook, String>) super.queryExecutor();
    }
}
