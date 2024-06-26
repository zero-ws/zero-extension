/*
 * This file is generated by jOOQ.
 */
package io.zerows.extension.commerce.erp.domain.tables.daos;


import io.github.jklingsporn.vertx.jooq.classic.jdbc.JDBCClassicQueryExecutor;
import io.github.jklingsporn.vertx.jooq.shared.internal.AbstractVertxDAO;
import io.vertx.core.Future;
import io.zerows.extension.commerce.erp.domain.tables.TOaAssignment;
import io.zerows.extension.commerce.erp.domain.tables.records.TOaAssignmentRecord;
import org.jooq.Configuration;

import java.time.LocalDateTime;
import java.util.Collection;
import java.util.List;

/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({"all", "unchecked", "rawtypes"})
public class TOaAssignmentDao extends AbstractVertxDAO<TOaAssignmentRecord, io.zerows.extension.commerce.erp.domain.tables.pojos.TOaAssignment, String, Future<List<io.zerows.extension.commerce.erp.domain.tables.pojos.TOaAssignment>>, Future<io.zerows.extension.commerce.erp.domain.tables.pojos.TOaAssignment>, Future<Integer>, Future<String>> implements io.github.jklingsporn.vertx.jooq.classic.VertxDAO<TOaAssignmentRecord, io.zerows.extension.commerce.erp.domain.tables.pojos.TOaAssignment, String> {

    /**
     * @param configuration The Configuration used for rendering and query
     *                      execution.
     * @param vertx         the vertx instance
     */
    public TOaAssignmentDao(Configuration configuration, io.vertx.core.Vertx vertx) {
        super(TOaAssignment.T_OA_ASSIGNMENT, io.zerows.extension.commerce.erp.domain.tables.pojos.TOaAssignment.class, new JDBCClassicQueryExecutor<TOaAssignmentRecord, io.zerows.extension.commerce.erp.domain.tables.pojos.TOaAssignment, String>(configuration, io.zerows.extension.commerce.erp.domain.tables.pojos.TOaAssignment.class, vertx));
    }

    @Override
    protected String getId(io.zerows.extension.commerce.erp.domain.tables.pojos.TOaAssignment object) {
        return object.getKey();
    }

    /**
     * Find records that have <code>COMMENT_EXTENSION IN (values)</code>
     * asynchronously
     */
    public Future<List<io.zerows.extension.commerce.erp.domain.tables.pojos.TOaAssignment>> findManyByCommentExtension(Collection<String> values) {
        return findManyByCondition(TOaAssignment.T_OA_ASSIGNMENT.COMMENT_EXTENSION.in(values));
    }

    /**
     * Find records that have <code>COMMENT_EXTENSION IN (values)</code>
     * asynchronously limited by the given limit
     */
    public Future<List<io.zerows.extension.commerce.erp.domain.tables.pojos.TOaAssignment>> findManyByCommentExtension(Collection<String> values, int limit) {
        return findManyByCondition(TOaAssignment.T_OA_ASSIGNMENT.COMMENT_EXTENSION.in(values), limit);
    }

    /**
     * Find records that have <code>REQUEST_BY IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.commerce.erp.domain.tables.pojos.TOaAssignment>> findManyByRequestBy(Collection<String> values) {
        return findManyByCondition(TOaAssignment.T_OA_ASSIGNMENT.REQUEST_BY.in(values));
    }

    /**
     * Find records that have <code>REQUEST_BY IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.commerce.erp.domain.tables.pojos.TOaAssignment>> findManyByRequestBy(Collection<String> values, int limit) {
        return findManyByCondition(TOaAssignment.T_OA_ASSIGNMENT.REQUEST_BY.in(values), limit);
    }

    /**
     * Find records that have <code>START_AT IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.commerce.erp.domain.tables.pojos.TOaAssignment>> findManyByStartAt(Collection<LocalDateTime> values) {
        return findManyByCondition(TOaAssignment.T_OA_ASSIGNMENT.START_AT.in(values));
    }

    /**
     * Find records that have <code>START_AT IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.commerce.erp.domain.tables.pojos.TOaAssignment>> findManyByStartAt(Collection<LocalDateTime> values, int limit) {
        return findManyByCondition(TOaAssignment.T_OA_ASSIGNMENT.START_AT.in(values), limit);
    }

    /**
     * Find records that have <code>END_AT IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.commerce.erp.domain.tables.pojos.TOaAssignment>> findManyByEndAt(Collection<LocalDateTime> values) {
        return findManyByCondition(TOaAssignment.T_OA_ASSIGNMENT.END_AT.in(values));
    }

    /**
     * Find records that have <code>END_AT IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.commerce.erp.domain.tables.pojos.TOaAssignment>> findManyByEndAt(Collection<LocalDateTime> values, int limit) {
        return findManyByCondition(TOaAssignment.T_OA_ASSIGNMENT.END_AT.in(values), limit);
    }

    /**
     * Find records that have <code>DAYS IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.commerce.erp.domain.tables.pojos.TOaAssignment>> findManyByDays(Collection<Integer> values) {
        return findManyByCondition(TOaAssignment.T_OA_ASSIGNMENT.DAYS.in(values));
    }

    /**
     * Find records that have <code>DAYS IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.commerce.erp.domain.tables.pojos.TOaAssignment>> findManyByDays(Collection<Integer> values, int limit) {
        return findManyByCondition(TOaAssignment.T_OA_ASSIGNMENT.DAYS.in(values), limit);
    }

    /**
     * Find records that have <code>REASON IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.commerce.erp.domain.tables.pojos.TOaAssignment>> findManyByReason(Collection<String> values) {
        return findManyByCondition(TOaAssignment.T_OA_ASSIGNMENT.REASON.in(values));
    }

    /**
     * Find records that have <code>REASON IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.commerce.erp.domain.tables.pojos.TOaAssignment>> findManyByReason(Collection<String> values, int limit) {
        return findManyByCondition(TOaAssignment.T_OA_ASSIGNMENT.REASON.in(values), limit);
    }

    /**
     * Find records that have <code>WORK_CONTENT IN (values)</code>
     * asynchronously
     */
    public Future<List<io.zerows.extension.commerce.erp.domain.tables.pojos.TOaAssignment>> findManyByWorkContent(Collection<String> values) {
        return findManyByCondition(TOaAssignment.T_OA_ASSIGNMENT.WORK_CONTENT.in(values));
    }

    /**
     * Find records that have <code>WORK_CONTENT IN (values)</code>
     * asynchronously limited by the given limit
     */
    public Future<List<io.zerows.extension.commerce.erp.domain.tables.pojos.TOaAssignment>> findManyByWorkContent(Collection<String> values, int limit) {
        return findManyByCondition(TOaAssignment.T_OA_ASSIGNMENT.WORK_CONTENT.in(values), limit);
    }

    @Override
    public JDBCClassicQueryExecutor<TOaAssignmentRecord, io.zerows.extension.commerce.erp.domain.tables.pojos.TOaAssignment, String> queryExecutor() {
        return (JDBCClassicQueryExecutor<TOaAssignmentRecord, io.zerows.extension.commerce.erp.domain.tables.pojos.TOaAssignment, String>) super.queryExecutor();
    }
}
