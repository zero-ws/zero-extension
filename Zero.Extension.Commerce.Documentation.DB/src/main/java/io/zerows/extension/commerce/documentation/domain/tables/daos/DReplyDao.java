/*
 * This file is generated by jOOQ.
 */
package io.zerows.extension.commerce.documentation.domain.tables.daos;


import io.github.jklingsporn.vertx.jooq.classic.jdbc.JDBCClassicQueryExecutor;
import io.github.jklingsporn.vertx.jooq.shared.internal.AbstractVertxDAO;
import io.vertx.core.Future;
import io.zerows.extension.commerce.documentation.domain.tables.DReply;
import io.zerows.extension.commerce.documentation.domain.tables.records.DReplyRecord;
import org.jooq.Configuration;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Collection;
import java.util.List;

/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({"all", "unchecked", "rawtypes"})
public class DReplyDao extends AbstractVertxDAO<DReplyRecord, io.zerows.extension.commerce.documentation.domain.tables.pojos.DReply, String, Future<List<io.zerows.extension.commerce.documentation.domain.tables.pojos.DReply>>, Future<io.zerows.extension.commerce.documentation.domain.tables.pojos.DReply>, Future<Integer>, Future<String>> implements io.github.jklingsporn.vertx.jooq.classic.VertxDAO<DReplyRecord, io.zerows.extension.commerce.documentation.domain.tables.pojos.DReply, String> {

    /**
     * @param configuration The Configuration used for rendering and query
     *                      execution.
     * @param vertx         the vertx instance
     */
    public DReplyDao(Configuration configuration, io.vertx.core.Vertx vertx) {
        super(DReply.D_REPLY, io.zerows.extension.commerce.documentation.domain.tables.pojos.DReply.class, new JDBCClassicQueryExecutor<DReplyRecord, io.zerows.extension.commerce.documentation.domain.tables.pojos.DReply, String>(configuration, io.zerows.extension.commerce.documentation.domain.tables.pojos.DReply.class, vertx));
    }

    @Override
    protected String getId(io.zerows.extension.commerce.documentation.domain.tables.pojos.DReply object) {
        return object.getKey();
    }

    /**
     * Find records that have <code>CODE IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.commerce.documentation.domain.tables.pojos.DReply>> findManyByCode(Collection<String> values) {
        return findManyByCondition(DReply.D_REPLY.CODE.in(values));
    }

    /**
     * Find records that have <code>CODE IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.commerce.documentation.domain.tables.pojos.DReply>> findManyByCode(Collection<String> values, int limit) {
        return findManyByCondition(DReply.D_REPLY.CODE.in(values), limit);
    }

    /**
     * Find records that have <code>USER_ID IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.commerce.documentation.domain.tables.pojos.DReply>> findManyByUserId(Collection<String> values) {
        return findManyByCondition(DReply.D_REPLY.USER_ID.in(values));
    }

    /**
     * Find records that have <code>USER_ID IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.commerce.documentation.domain.tables.pojos.DReply>> findManyByUserId(Collection<String> values, int limit) {
        return findManyByCondition(DReply.D_REPLY.USER_ID.in(values), limit);
    }

    /**
     * Find records that have <code>USER_NAME IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.commerce.documentation.domain.tables.pojos.DReply>> findManyByUserName(Collection<String> values) {
        return findManyByCondition(DReply.D_REPLY.USER_NAME.in(values));
    }

    /**
     * Find records that have <code>USER_NAME IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.commerce.documentation.domain.tables.pojos.DReply>> findManyByUserName(Collection<String> values, int limit) {
        return findManyByCondition(DReply.D_REPLY.USER_NAME.in(values), limit);
    }

    /**
     * Find records that have <code>USER_NO IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.commerce.documentation.domain.tables.pojos.DReply>> findManyByUserNo(Collection<String> values) {
        return findManyByCondition(DReply.D_REPLY.USER_NO.in(values));
    }

    /**
     * Find records that have <code>USER_NO IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.commerce.documentation.domain.tables.pojos.DReply>> findManyByUserNo(Collection<String> values, int limit) {
        return findManyByCondition(DReply.D_REPLY.USER_NO.in(values), limit);
    }

    /**
     * Find records that have <code>IDENTITY_IDC IN (values)</code>
     * asynchronously
     */
    public Future<List<io.zerows.extension.commerce.documentation.domain.tables.pojos.DReply>> findManyByIdentityIdc(Collection<String> values) {
        return findManyByCondition(DReply.D_REPLY.IDENTITY_IDC.in(values));
    }

    /**
     * Find records that have <code>IDENTITY_IDC IN (values)</code>
     * asynchronously limited by the given limit
     */
    public Future<List<io.zerows.extension.commerce.documentation.domain.tables.pojos.DReply>> findManyByIdentityIdc(Collection<String> values, int limit) {
        return findManyByCondition(DReply.D_REPLY.IDENTITY_IDC.in(values), limit);
    }

    /**
     * Find records that have <code>IDENTITY_ID IN (values)</code>
     * asynchronously
     */
    public Future<List<io.zerows.extension.commerce.documentation.domain.tables.pojos.DReply>> findManyByIdentityId(Collection<String> values) {
        return findManyByCondition(DReply.D_REPLY.IDENTITY_ID.in(values));
    }

    /**
     * Find records that have <code>IDENTITY_ID IN (values)</code>
     * asynchronously limited by the given limit
     */
    public Future<List<io.zerows.extension.commerce.documentation.domain.tables.pojos.DReply>> findManyByIdentityId(Collection<String> values, int limit) {
        return findManyByCondition(DReply.D_REPLY.IDENTITY_ID.in(values), limit);
    }

    /**
     * Find records that have <code>EXAM_ID IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.commerce.documentation.domain.tables.pojos.DReply>> findManyByExamId(Collection<String> values) {
        return findManyByCondition(DReply.D_REPLY.EXAM_ID.in(values));
    }

    /**
     * Find records that have <code>EXAM_ID IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.commerce.documentation.domain.tables.pojos.DReply>> findManyByExamId(Collection<String> values, int limit) {
        return findManyByCondition(DReply.D_REPLY.EXAM_ID.in(values), limit);
    }

    /**
     * Find records that have <code>PAPER_ID IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.commerce.documentation.domain.tables.pojos.DReply>> findManyByPaperId(Collection<String> values) {
        return findManyByCondition(DReply.D_REPLY.PAPER_ID.in(values));
    }

    /**
     * Find records that have <code>PAPER_ID IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.commerce.documentation.domain.tables.pojos.DReply>> findManyByPaperId(Collection<String> values, int limit) {
        return findManyByCondition(DReply.D_REPLY.PAPER_ID.in(values), limit);
    }

    /**
     * Find records that have <code>MODEL_ID IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.commerce.documentation.domain.tables.pojos.DReply>> findManyByModelId(Collection<String> values) {
        return findManyByCondition(DReply.D_REPLY.MODEL_ID.in(values));
    }

    /**
     * Find records that have <code>MODEL_ID IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.commerce.documentation.domain.tables.pojos.DReply>> findManyByModelId(Collection<String> values, int limit) {
        return findManyByCondition(DReply.D_REPLY.MODEL_ID.in(values), limit);
    }

    /**
     * Find records that have <code>MODEL_KEY IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.commerce.documentation.domain.tables.pojos.DReply>> findManyByModelKey(Collection<String> values) {
        return findManyByCondition(DReply.D_REPLY.MODEL_KEY.in(values));
    }

    /**
     * Find records that have <code>MODEL_KEY IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.commerce.documentation.domain.tables.pojos.DReply>> findManyByModelKey(Collection<String> values, int limit) {
        return findManyByCondition(DReply.D_REPLY.MODEL_KEY.in(values), limit);
    }

    /**
     * Find records that have <code>SCORE IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.commerce.documentation.domain.tables.pojos.DReply>> findManyByScore(Collection<BigDecimal> values) {
        return findManyByCondition(DReply.D_REPLY.SCORE.in(values));
    }

    /**
     * Find records that have <code>SCORE IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.commerce.documentation.domain.tables.pojos.DReply>> findManyByScore(Collection<BigDecimal> values, int limit) {
        return findManyByCondition(DReply.D_REPLY.SCORE.in(values), limit);
    }

    /**
     * Find records that have <code>GRADE IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.commerce.documentation.domain.tables.pojos.DReply>> findManyByGrade(Collection<String> values) {
        return findManyByCondition(DReply.D_REPLY.GRADE.in(values));
    }

    /**
     * Find records that have <code>GRADE IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.commerce.documentation.domain.tables.pojos.DReply>> findManyByGrade(Collection<String> values, int limit) {
        return findManyByCondition(DReply.D_REPLY.GRADE.in(values), limit);
    }

    /**
     * Find records that have <code>PASSED IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.commerce.documentation.domain.tables.pojos.DReply>> findManyByPassed(Collection<Boolean> values) {
        return findManyByCondition(DReply.D_REPLY.PASSED.in(values));
    }

    /**
     * Find records that have <code>PASSED IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.commerce.documentation.domain.tables.pojos.DReply>> findManyByPassed(Collection<Boolean> values, int limit) {
        return findManyByCondition(DReply.D_REPLY.PASSED.in(values), limit);
    }

    /**
     * Find records that have <code>Q_TOTAL IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.commerce.documentation.domain.tables.pojos.DReply>> findManyByQTotal(Collection<Integer> values) {
        return findManyByCondition(DReply.D_REPLY.Q_TOTAL.in(values));
    }

    /**
     * Find records that have <code>Q_TOTAL IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.commerce.documentation.domain.tables.pojos.DReply>> findManyByQTotal(Collection<Integer> values, int limit) {
        return findManyByCondition(DReply.D_REPLY.Q_TOTAL.in(values), limit);
    }

    /**
     * Find records that have <code>Q_REPLY IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.commerce.documentation.domain.tables.pojos.DReply>> findManyByQReply(Collection<Integer> values) {
        return findManyByCondition(DReply.D_REPLY.Q_REPLY.in(values));
    }

    /**
     * Find records that have <code>Q_REPLY IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.commerce.documentation.domain.tables.pojos.DReply>> findManyByQReply(Collection<Integer> values, int limit) {
        return findManyByCondition(DReply.D_REPLY.Q_REPLY.in(values), limit);
    }

    /**
     * Find records that have <code>Q_OK IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.commerce.documentation.domain.tables.pojos.DReply>> findManyByQOk(Collection<Integer> values) {
        return findManyByCondition(DReply.D_REPLY.Q_OK.in(values));
    }

    /**
     * Find records that have <code>Q_OK IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.commerce.documentation.domain.tables.pojos.DReply>> findManyByQOk(Collection<Integer> values, int limit) {
        return findManyByCondition(DReply.D_REPLY.Q_OK.in(values), limit);
    }

    /**
     * Find records that have <code>SIGMA IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.commerce.documentation.domain.tables.pojos.DReply>> findManyBySigma(Collection<String> values) {
        return findManyByCondition(DReply.D_REPLY.SIGMA.in(values));
    }

    /**
     * Find records that have <code>SIGMA IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.commerce.documentation.domain.tables.pojos.DReply>> findManyBySigma(Collection<String> values, int limit) {
        return findManyByCondition(DReply.D_REPLY.SIGMA.in(values), limit);
    }

    /**
     * Find records that have <code>LANGUAGE IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.commerce.documentation.domain.tables.pojos.DReply>> findManyByLanguage(Collection<String> values) {
        return findManyByCondition(DReply.D_REPLY.LANGUAGE.in(values));
    }

    /**
     * Find records that have <code>LANGUAGE IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.commerce.documentation.domain.tables.pojos.DReply>> findManyByLanguage(Collection<String> values, int limit) {
        return findManyByCondition(DReply.D_REPLY.LANGUAGE.in(values), limit);
    }

    /**
     * Find records that have <code>ACTIVE IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.commerce.documentation.domain.tables.pojos.DReply>> findManyByActive(Collection<Boolean> values) {
        return findManyByCondition(DReply.D_REPLY.ACTIVE.in(values));
    }

    /**
     * Find records that have <code>ACTIVE IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.commerce.documentation.domain.tables.pojos.DReply>> findManyByActive(Collection<Boolean> values, int limit) {
        return findManyByCondition(DReply.D_REPLY.ACTIVE.in(values), limit);
    }

    /**
     * Find records that have <code>METADATA IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.commerce.documentation.domain.tables.pojos.DReply>> findManyByMetadata(Collection<String> values) {
        return findManyByCondition(DReply.D_REPLY.METADATA.in(values));
    }

    /**
     * Find records that have <code>METADATA IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.commerce.documentation.domain.tables.pojos.DReply>> findManyByMetadata(Collection<String> values, int limit) {
        return findManyByCondition(DReply.D_REPLY.METADATA.in(values), limit);
    }

    /**
     * Find records that have <code>CREATED_AT IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.commerce.documentation.domain.tables.pojos.DReply>> findManyByCreatedAt(Collection<LocalDateTime> values) {
        return findManyByCondition(DReply.D_REPLY.CREATED_AT.in(values));
    }

    /**
     * Find records that have <code>CREATED_AT IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.commerce.documentation.domain.tables.pojos.DReply>> findManyByCreatedAt(Collection<LocalDateTime> values, int limit) {
        return findManyByCondition(DReply.D_REPLY.CREATED_AT.in(values), limit);
    }

    /**
     * Find records that have <code>CREATED_BY IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.commerce.documentation.domain.tables.pojos.DReply>> findManyByCreatedBy(Collection<String> values) {
        return findManyByCondition(DReply.D_REPLY.CREATED_BY.in(values));
    }

    /**
     * Find records that have <code>CREATED_BY IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.commerce.documentation.domain.tables.pojos.DReply>> findManyByCreatedBy(Collection<String> values, int limit) {
        return findManyByCondition(DReply.D_REPLY.CREATED_BY.in(values), limit);
    }

    /**
     * Find records that have <code>UPDATED_AT IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.commerce.documentation.domain.tables.pojos.DReply>> findManyByUpdatedAt(Collection<LocalDateTime> values) {
        return findManyByCondition(DReply.D_REPLY.UPDATED_AT.in(values));
    }

    /**
     * Find records that have <code>UPDATED_AT IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.commerce.documentation.domain.tables.pojos.DReply>> findManyByUpdatedAt(Collection<LocalDateTime> values, int limit) {
        return findManyByCondition(DReply.D_REPLY.UPDATED_AT.in(values), limit);
    }

    /**
     * Find records that have <code>UPDATED_BY IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.commerce.documentation.domain.tables.pojos.DReply>> findManyByUpdatedBy(Collection<String> values) {
        return findManyByCondition(DReply.D_REPLY.UPDATED_BY.in(values));
    }

    /**
     * Find records that have <code>UPDATED_BY IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.commerce.documentation.domain.tables.pojos.DReply>> findManyByUpdatedBy(Collection<String> values, int limit) {
        return findManyByCondition(DReply.D_REPLY.UPDATED_BY.in(values), limit);
    }

    @Override
    public JDBCClassicQueryExecutor<DReplyRecord, io.zerows.extension.commerce.documentation.domain.tables.pojos.DReply, String> queryExecutor() {
        return (JDBCClassicQueryExecutor<DReplyRecord, io.zerows.extension.commerce.documentation.domain.tables.pojos.DReply, String>) super.queryExecutor();
    }
}
