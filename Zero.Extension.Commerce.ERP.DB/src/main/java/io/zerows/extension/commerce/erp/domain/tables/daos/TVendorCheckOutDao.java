/*
 * This file is generated by jOOQ.
 */
package io.zerows.extension.commerce.erp.domain.tables.daos;


import io.github.jklingsporn.vertx.jooq.classic.jdbc.JDBCClassicQueryExecutor;
import io.github.jklingsporn.vertx.jooq.shared.internal.AbstractVertxDAO;
import io.vertx.core.Future;
import io.zerows.extension.commerce.erp.domain.tables.TVendorCheckOut;
import io.zerows.extension.commerce.erp.domain.tables.records.TVendorCheckOutRecord;
import org.jooq.Configuration;

import java.time.LocalDateTime;
import java.util.Collection;
import java.util.List;

/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({"all", "unchecked", "rawtypes"})
public class TVendorCheckOutDao extends AbstractVertxDAO<TVendorCheckOutRecord, io.zerows.extension.commerce.erp.domain.tables.pojos.TVendorCheckOut, String, Future<List<io.zerows.extension.commerce.erp.domain.tables.pojos.TVendorCheckOut>>, Future<io.zerows.extension.commerce.erp.domain.tables.pojos.TVendorCheckOut>, Future<Integer>, Future<String>> implements io.github.jklingsporn.vertx.jooq.classic.VertxDAO<TVendorCheckOutRecord, io.zerows.extension.commerce.erp.domain.tables.pojos.TVendorCheckOut, String> {

    /**
     * @param configuration The Configuration used for rendering and query
     *                      execution.
     * @param vertx         the vertx instance
     */
    public TVendorCheckOutDao(Configuration configuration, io.vertx.core.Vertx vertx) {
        super(TVendorCheckOut.T_VENDOR_CHECK_OUT, io.zerows.extension.commerce.erp.domain.tables.pojos.TVendorCheckOut.class, new JDBCClassicQueryExecutor<TVendorCheckOutRecord, io.zerows.extension.commerce.erp.domain.tables.pojos.TVendorCheckOut, String>(configuration, io.zerows.extension.commerce.erp.domain.tables.pojos.TVendorCheckOut.class, vertx));
    }

    @Override
    protected String getId(io.zerows.extension.commerce.erp.domain.tables.pojos.TVendorCheckOut object) {
        return object.getKey();
    }

    /**
     * Find records that have <code>COMMENT_EXTENSION IN (values)</code>
     * asynchronously
     */
    public Future<List<io.zerows.extension.commerce.erp.domain.tables.pojos.TVendorCheckOut>> findManyByCommentExtension(Collection<String> values) {
        return findManyByCondition(TVendorCheckOut.T_VENDOR_CHECK_OUT.COMMENT_EXTENSION.in(values));
    }

    /**
     * Find records that have <code>COMMENT_EXTENSION IN (values)</code>
     * asynchronously limited by the given limit
     */
    public Future<List<io.zerows.extension.commerce.erp.domain.tables.pojos.TVendorCheckOut>> findManyByCommentExtension(Collection<String> values, int limit) {
        return findManyByCondition(TVendorCheckOut.T_VENDOR_CHECK_OUT.COMMENT_EXTENSION.in(values), limit);
    }

    /**
     * Find records that have <code>CLASSIFICATION IN (values)</code>
     * asynchronously
     */
    public Future<List<io.zerows.extension.commerce.erp.domain.tables.pojos.TVendorCheckOut>> findManyByClassification(Collection<String> values) {
        return findManyByCondition(TVendorCheckOut.T_VENDOR_CHECK_OUT.CLASSIFICATION.in(values));
    }

    /**
     * Find records that have <code>CLASSIFICATION IN (values)</code>
     * asynchronously limited by the given limit
     */
    public Future<List<io.zerows.extension.commerce.erp.domain.tables.pojos.TVendorCheckOut>> findManyByClassification(Collection<String> values, int limit) {
        return findManyByCondition(TVendorCheckOut.T_VENDOR_CHECK_OUT.CLASSIFICATION.in(values), limit);
    }

    /**
     * Find records that have <code>START_AT IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.commerce.erp.domain.tables.pojos.TVendorCheckOut>> findManyByStartAt(Collection<LocalDateTime> values) {
        return findManyByCondition(TVendorCheckOut.T_VENDOR_CHECK_OUT.START_AT.in(values));
    }

    /**
     * Find records that have <code>START_AT IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.commerce.erp.domain.tables.pojos.TVendorCheckOut>> findManyByStartAt(Collection<LocalDateTime> values, int limit) {
        return findManyByCondition(TVendorCheckOut.T_VENDOR_CHECK_OUT.START_AT.in(values), limit);
    }

    /**
     * Find records that have <code>END_AT IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.commerce.erp.domain.tables.pojos.TVendorCheckOut>> findManyByEndAt(Collection<LocalDateTime> values) {
        return findManyByCondition(TVendorCheckOut.T_VENDOR_CHECK_OUT.END_AT.in(values));
    }

    /**
     * Find records that have <code>END_AT IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.commerce.erp.domain.tables.pojos.TVendorCheckOut>> findManyByEndAt(Collection<LocalDateTime> values, int limit) {
        return findManyByCondition(TVendorCheckOut.T_VENDOR_CHECK_OUT.END_AT.in(values), limit);
    }

    /**
     * Find records that have <code>DAYS IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.commerce.erp.domain.tables.pojos.TVendorCheckOut>> findManyByDays(Collection<Integer> values) {
        return findManyByCondition(TVendorCheckOut.T_VENDOR_CHECK_OUT.DAYS.in(values));
    }

    /**
     * Find records that have <code>DAYS IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.commerce.erp.domain.tables.pojos.TVendorCheckOut>> findManyByDays(Collection<Integer> values, int limit) {
        return findManyByCondition(TVendorCheckOut.T_VENDOR_CHECK_OUT.DAYS.in(values), limit);
    }

    /**
     * Find records that have <code>LEAVE_AT IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.commerce.erp.domain.tables.pojos.TVendorCheckOut>> findManyByLeaveAt(Collection<LocalDateTime> values) {
        return findManyByCondition(TVendorCheckOut.T_VENDOR_CHECK_OUT.LEAVE_AT.in(values));
    }

    /**
     * Find records that have <code>LEAVE_AT IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.commerce.erp.domain.tables.pojos.TVendorCheckOut>> findManyByLeaveAt(Collection<LocalDateTime> values, int limit) {
        return findManyByCondition(TVendorCheckOut.T_VENDOR_CHECK_OUT.LEAVE_AT.in(values), limit);
    }

    /**
     * Find records that have <code>REASON IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.commerce.erp.domain.tables.pojos.TVendorCheckOut>> findManyByReason(Collection<String> values) {
        return findManyByCondition(TVendorCheckOut.T_VENDOR_CHECK_OUT.REASON.in(values));
    }

    /**
     * Find records that have <code>REASON IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.commerce.erp.domain.tables.pojos.TVendorCheckOut>> findManyByReason(Collection<String> values, int limit) {
        return findManyByCondition(TVendorCheckOut.T_VENDOR_CHECK_OUT.REASON.in(values), limit);
    }

    @Override
    public JDBCClassicQueryExecutor<TVendorCheckOutRecord, io.zerows.extension.commerce.erp.domain.tables.pojos.TVendorCheckOut, String> queryExecutor() {
        return (JDBCClassicQueryExecutor<TVendorCheckOutRecord, io.zerows.extension.commerce.erp.domain.tables.pojos.TVendorCheckOut, String>) super.queryExecutor();
    }
}
