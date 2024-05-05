/*
 * This file is generated by jOOQ.
 */
package io.zerows.extension.commerce.erp.domain.tables.daos;


import io.github.jklingsporn.vertx.jooq.classic.jdbc.JDBCClassicQueryExecutor;
import io.github.jklingsporn.vertx.jooq.shared.internal.AbstractVertxDAO;
import io.vertx.core.Future;
import io.zerows.extension.commerce.erp.domain.tables.TOaTraining;
import io.zerows.extension.commerce.erp.domain.tables.records.TOaTrainingRecord;
import org.jooq.Configuration;

import java.time.LocalDateTime;
import java.util.Collection;
import java.util.List;

/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({"all", "unchecked", "rawtypes"})
public class TOaTrainingDao extends AbstractVertxDAO<TOaTrainingRecord, io.zerows.extension.commerce.erp.domain.tables.pojos.TOaTraining, String, Future<List<io.zerows.extension.commerce.erp.domain.tables.pojos.TOaTraining>>, Future<io.zerows.extension.commerce.erp.domain.tables.pojos.TOaTraining>, Future<Integer>, Future<String>> implements io.github.jklingsporn.vertx.jooq.classic.VertxDAO<TOaTrainingRecord, io.zerows.extension.commerce.erp.domain.tables.pojos.TOaTraining, String> {

    /**
     * @param configuration The Configuration used for rendering and query
     *                      execution.
     * @param vertx         the vertx instance
     */
    public TOaTrainingDao(Configuration configuration, io.vertx.core.Vertx vertx) {
        super(TOaTraining.T_OA_TRAINING, io.zerows.extension.commerce.erp.domain.tables.pojos.TOaTraining.class, new JDBCClassicQueryExecutor<TOaTrainingRecord, io.zerows.extension.commerce.erp.domain.tables.pojos.TOaTraining, String>(configuration, io.zerows.extension.commerce.erp.domain.tables.pojos.TOaTraining.class, vertx));
    }

    @Override
    protected String getId(io.zerows.extension.commerce.erp.domain.tables.pojos.TOaTraining object) {
        return object.getKey();
    }

    /**
     * Find records that have <code>COMMENT_EXTENSION IN (values)</code>
     * asynchronously
     */
    public Future<List<io.zerows.extension.commerce.erp.domain.tables.pojos.TOaTraining>> findManyByCommentExtension(Collection<String> values) {
        return findManyByCondition(TOaTraining.T_OA_TRAINING.COMMENT_EXTENSION.in(values));
    }

    /**
     * Find records that have <code>COMMENT_EXTENSION IN (values)</code>
     * asynchronously limited by the given limit
     */
    public Future<List<io.zerows.extension.commerce.erp.domain.tables.pojos.TOaTraining>> findManyByCommentExtension(Collection<String> values, int limit) {
        return findManyByCondition(TOaTraining.T_OA_TRAINING.COMMENT_EXTENSION.in(values), limit);
    }

    /**
     * Find records that have <code>START_AT IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.commerce.erp.domain.tables.pojos.TOaTraining>> findManyByStartAt(Collection<LocalDateTime> values) {
        return findManyByCondition(TOaTraining.T_OA_TRAINING.START_AT.in(values));
    }

    /**
     * Find records that have <code>START_AT IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.commerce.erp.domain.tables.pojos.TOaTraining>> findManyByStartAt(Collection<LocalDateTime> values, int limit) {
        return findManyByCondition(TOaTraining.T_OA_TRAINING.START_AT.in(values), limit);
    }

    /**
     * Find records that have <code>END_AT IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.commerce.erp.domain.tables.pojos.TOaTraining>> findManyByEndAt(Collection<LocalDateTime> values) {
        return findManyByCondition(TOaTraining.T_OA_TRAINING.END_AT.in(values));
    }

    /**
     * Find records that have <code>END_AT IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.commerce.erp.domain.tables.pojos.TOaTraining>> findManyByEndAt(Collection<LocalDateTime> values, int limit) {
        return findManyByCondition(TOaTraining.T_OA_TRAINING.END_AT.in(values), limit);
    }

    /**
     * Find records that have <code>TRAIN_LOCATION IN (values)</code>
     * asynchronously
     */
    public Future<List<io.zerows.extension.commerce.erp.domain.tables.pojos.TOaTraining>> findManyByTrainLocation(Collection<String> values) {
        return findManyByCondition(TOaTraining.T_OA_TRAINING.TRAIN_LOCATION.in(values));
    }

    /**
     * Find records that have <code>TRAIN_LOCATION IN (values)</code>
     * asynchronously limited by the given limit
     */
    public Future<List<io.zerows.extension.commerce.erp.domain.tables.pojos.TOaTraining>> findManyByTrainLocation(Collection<String> values, int limit) {
        return findManyByCondition(TOaTraining.T_OA_TRAINING.TRAIN_LOCATION.in(values), limit);
    }

    /**
     * Find records that have <code>TRAIN_MODE IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.commerce.erp.domain.tables.pojos.TOaTraining>> findManyByTrainMode(Collection<String> values) {
        return findManyByCondition(TOaTraining.T_OA_TRAINING.TRAIN_MODE.in(values));
    }

    /**
     * Find records that have <code>TRAIN_MODE IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.commerce.erp.domain.tables.pojos.TOaTraining>> findManyByTrainMode(Collection<String> values, int limit) {
        return findManyByCondition(TOaTraining.T_OA_TRAINING.TRAIN_MODE.in(values), limit);
    }

    /**
     * Find records that have <code>LEADER IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.commerce.erp.domain.tables.pojos.TOaTraining>> findManyByLeader(Collection<String> values) {
        return findManyByCondition(TOaTraining.T_OA_TRAINING.LEADER.in(values));
    }

    /**
     * Find records that have <code>LEADER IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.commerce.erp.domain.tables.pojos.TOaTraining>> findManyByLeader(Collection<String> values, int limit) {
        return findManyByCondition(TOaTraining.T_OA_TRAINING.LEADER.in(values), limit);
    }

    /**
     * Find records that have <code>LEADER_COMMENT IN (values)</code>
     * asynchronously
     */
    public Future<List<io.zerows.extension.commerce.erp.domain.tables.pojos.TOaTraining>> findManyByLeaderComment(Collection<String> values) {
        return findManyByCondition(TOaTraining.T_OA_TRAINING.LEADER_COMMENT.in(values));
    }

    /**
     * Find records that have <code>LEADER_COMMENT IN (values)</code>
     * asynchronously limited by the given limit
     */
    public Future<List<io.zerows.extension.commerce.erp.domain.tables.pojos.TOaTraining>> findManyByLeaderComment(Collection<String> values, int limit) {
        return findManyByCondition(TOaTraining.T_OA_TRAINING.LEADER_COMMENT.in(values), limit);
    }

    /**
     * Find records that have <code>REVIEWER IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.commerce.erp.domain.tables.pojos.TOaTraining>> findManyByReviewer(Collection<String> values) {
        return findManyByCondition(TOaTraining.T_OA_TRAINING.REVIEWER.in(values));
    }

    /**
     * Find records that have <code>REVIEWER IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.commerce.erp.domain.tables.pojos.TOaTraining>> findManyByReviewer(Collection<String> values, int limit) {
        return findManyByCondition(TOaTraining.T_OA_TRAINING.REVIEWER.in(values), limit);
    }

    /**
     * Find records that have <code>REVIEWER_COMMENT IN (values)</code>
     * asynchronously
     */
    public Future<List<io.zerows.extension.commerce.erp.domain.tables.pojos.TOaTraining>> findManyByReviewerComment(Collection<String> values) {
        return findManyByCondition(TOaTraining.T_OA_TRAINING.REVIEWER_COMMENT.in(values));
    }

    /**
     * Find records that have <code>REVIEWER_COMMENT IN (values)</code>
     * asynchronously limited by the given limit
     */
    public Future<List<io.zerows.extension.commerce.erp.domain.tables.pojos.TOaTraining>> findManyByReviewerComment(Collection<String> values, int limit) {
        return findManyByCondition(TOaTraining.T_OA_TRAINING.REVIEWER_COMMENT.in(values), limit);
    }

    @Override
    public JDBCClassicQueryExecutor<TOaTrainingRecord, io.zerows.extension.commerce.erp.domain.tables.pojos.TOaTraining, String> queryExecutor() {
        return (JDBCClassicQueryExecutor<TOaTrainingRecord, io.zerows.extension.commerce.erp.domain.tables.pojos.TOaTraining, String>) super.queryExecutor();
    }
}
