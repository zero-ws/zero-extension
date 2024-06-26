/*
 * This file is generated by jOOQ.
 */
package io.zerows.extension.commerce.documentation.domain.tables.daos;


import io.github.jklingsporn.vertx.jooq.classic.jdbc.JDBCClassicQueryExecutor;
import io.github.jklingsporn.vertx.jooq.shared.internal.AbstractVertxDAO;
import io.vertx.core.Future;
import io.zerows.extension.commerce.documentation.domain.tables.DQuestion;
import io.zerows.extension.commerce.documentation.domain.tables.records.DQuestionRecord;
import org.jooq.Configuration;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Collection;
import java.util.List;

/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({"all", "unchecked", "rawtypes"})
public class DQuestionDao extends AbstractVertxDAO<DQuestionRecord, io.zerows.extension.commerce.documentation.domain.tables.pojos.DQuestion, String, Future<List<io.zerows.extension.commerce.documentation.domain.tables.pojos.DQuestion>>, Future<io.zerows.extension.commerce.documentation.domain.tables.pojos.DQuestion>, Future<Integer>, Future<String>> implements io.github.jklingsporn.vertx.jooq.classic.VertxDAO<DQuestionRecord, io.zerows.extension.commerce.documentation.domain.tables.pojos.DQuestion, String> {

    /**
     * @param configuration The Configuration used for rendering and query
     *                      execution.
     * @param vertx         the vertx instance
     */
    public DQuestionDao(Configuration configuration, io.vertx.core.Vertx vertx) {
        super(DQuestion.D_QUESTION, io.zerows.extension.commerce.documentation.domain.tables.pojos.DQuestion.class, new JDBCClassicQueryExecutor<DQuestionRecord, io.zerows.extension.commerce.documentation.domain.tables.pojos.DQuestion, String>(configuration, io.zerows.extension.commerce.documentation.domain.tables.pojos.DQuestion.class, vertx));
    }

    @Override
    protected String getId(io.zerows.extension.commerce.documentation.domain.tables.pojos.DQuestion object) {
        return object.getKey();
    }

    /**
     * Find records that have <code>CODE IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.commerce.documentation.domain.tables.pojos.DQuestion>> findManyByCode(Collection<String> values) {
        return findManyByCondition(DQuestion.D_QUESTION.CODE.in(values));
    }

    /**
     * Find records that have <code>CODE IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.commerce.documentation.domain.tables.pojos.DQuestion>> findManyByCode(Collection<String> values, int limit) {
        return findManyByCondition(DQuestion.D_QUESTION.CODE.in(values), limit);
    }

    /**
     * Find records that have <code>TYPE IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.commerce.documentation.domain.tables.pojos.DQuestion>> findManyByType(Collection<String> values) {
        return findManyByCondition(DQuestion.D_QUESTION.TYPE.in(values));
    }

    /**
     * Find records that have <code>TYPE IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.commerce.documentation.domain.tables.pojos.DQuestion>> findManyByType(Collection<String> values, int limit) {
        return findManyByCondition(DQuestion.D_QUESTION.TYPE.in(values), limit);
    }

    /**
     * Find records that have <code>SORT IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.commerce.documentation.domain.tables.pojos.DQuestion>> findManyBySort(Collection<Integer> values) {
        return findManyByCondition(DQuestion.D_QUESTION.SORT.in(values));
    }

    /**
     * Find records that have <code>SORT IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.commerce.documentation.domain.tables.pojos.DQuestion>> findManyBySort(Collection<Integer> values, int limit) {
        return findManyByCondition(DQuestion.D_QUESTION.SORT.in(values), limit);
    }

    /**
     * Find records that have <code>NAME IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.commerce.documentation.domain.tables.pojos.DQuestion>> findManyByName(Collection<String> values) {
        return findManyByCondition(DQuestion.D_QUESTION.NAME.in(values));
    }

    /**
     * Find records that have <code>NAME IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.commerce.documentation.domain.tables.pojos.DQuestion>> findManyByName(Collection<String> values, int limit) {
        return findManyByCondition(DQuestion.D_QUESTION.NAME.in(values), limit);
    }

    /**
     * Find records that have <code>BRIEF IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.commerce.documentation.domain.tables.pojos.DQuestion>> findManyByBrief(Collection<String> values) {
        return findManyByCondition(DQuestion.D_QUESTION.BRIEF.in(values));
    }

    /**
     * Find records that have <code>BRIEF IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.commerce.documentation.domain.tables.pojos.DQuestion>> findManyByBrief(Collection<String> values, int limit) {
        return findManyByCondition(DQuestion.D_QUESTION.BRIEF.in(values), limit);
    }

    /**
     * Find records that have <code>TIP IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.commerce.documentation.domain.tables.pojos.DQuestion>> findManyByTip(Collection<String> values) {
        return findManyByCondition(DQuestion.D_QUESTION.TIP.in(values));
    }

    /**
     * Find records that have <code>TIP IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.commerce.documentation.domain.tables.pojos.DQuestion>> findManyByTip(Collection<String> values, int limit) {
        return findManyByCondition(DQuestion.D_QUESTION.TIP.in(values), limit);
    }

    /**
     * Find records that have <code>MATERIAL IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.commerce.documentation.domain.tables.pojos.DQuestion>> findManyByMaterial(Collection<String> values) {
        return findManyByCondition(DQuestion.D_QUESTION.MATERIAL.in(values));
    }

    /**
     * Find records that have <code>MATERIAL IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.commerce.documentation.domain.tables.pojos.DQuestion>> findManyByMaterial(Collection<String> values, int limit) {
        return findManyByCondition(DQuestion.D_QUESTION.MATERIAL.in(values), limit);
    }

    /**
     * Find records that have <code>MATERIAL_FILES IN (values)</code>
     * asynchronously
     */
    public Future<List<io.zerows.extension.commerce.documentation.domain.tables.pojos.DQuestion>> findManyByMaterialFiles(Collection<String> values) {
        return findManyByCondition(DQuestion.D_QUESTION.MATERIAL_FILES.in(values));
    }

    /**
     * Find records that have <code>MATERIAL_FILES IN (values)</code>
     * asynchronously limited by the given limit
     */
    public Future<List<io.zerows.extension.commerce.documentation.domain.tables.pojos.DQuestion>> findManyByMaterialFiles(Collection<String> values, int limit) {
        return findManyByCondition(DQuestion.D_QUESTION.MATERIAL_FILES.in(values), limit);
    }

    /**
     * Find records that have <code>SCORE IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.commerce.documentation.domain.tables.pojos.DQuestion>> findManyByScore(Collection<BigDecimal> values) {
        return findManyByCondition(DQuestion.D_QUESTION.SCORE.in(values));
    }

    /**
     * Find records that have <code>SCORE IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.commerce.documentation.domain.tables.pojos.DQuestion>> findManyByScore(Collection<BigDecimal> values, int limit) {
        return findManyByCondition(DQuestion.D_QUESTION.SCORE.in(values), limit);
    }

    /**
     * Find records that have <code>LEVEL IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.commerce.documentation.domain.tables.pojos.DQuestion>> findManyByLevel(Collection<Integer> values) {
        return findManyByCondition(DQuestion.D_QUESTION.LEVEL.in(values));
    }

    /**
     * Find records that have <code>LEVEL IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.commerce.documentation.domain.tables.pojos.DQuestion>> findManyByLevel(Collection<Integer> values, int limit) {
        return findManyByCondition(DQuestion.D_QUESTION.LEVEL.in(values), limit);
    }

    /**
     * Find records that have <code>LEVEL_CONTENT IN (values)</code>
     * asynchronously
     */
    public Future<List<io.zerows.extension.commerce.documentation.domain.tables.pojos.DQuestion>> findManyByLevelContent(Collection<String> values) {
        return findManyByCondition(DQuestion.D_QUESTION.LEVEL_CONTENT.in(values));
    }

    /**
     * Find records that have <code>LEVEL_CONTENT IN (values)</code>
     * asynchronously limited by the given limit
     */
    public Future<List<io.zerows.extension.commerce.documentation.domain.tables.pojos.DQuestion>> findManyByLevelContent(Collection<String> values, int limit) {
        return findManyByCondition(DQuestion.D_QUESTION.LEVEL_CONTENT.in(values), limit);
    }

    /**
     * Find records that have <code>ANSWER_DEFINE IN (values)</code>
     * asynchronously
     */
    public Future<List<io.zerows.extension.commerce.documentation.domain.tables.pojos.DQuestion>> findManyByAnswerDefine(Collection<String> values) {
        return findManyByCondition(DQuestion.D_QUESTION.ANSWER_DEFINE.in(values));
    }

    /**
     * Find records that have <code>ANSWER_DEFINE IN (values)</code>
     * asynchronously limited by the given limit
     */
    public Future<List<io.zerows.extension.commerce.documentation.domain.tables.pojos.DQuestion>> findManyByAnswerDefine(Collection<String> values, int limit) {
        return findManyByCondition(DQuestion.D_QUESTION.ANSWER_DEFINE.in(values), limit);
    }

    /**
     * Find records that have <code>STORE_ID IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.commerce.documentation.domain.tables.pojos.DQuestion>> findManyByStoreId(Collection<String> values) {
        return findManyByCondition(DQuestion.D_QUESTION.STORE_ID.in(values));
    }

    /**
     * Find records that have <code>STORE_ID IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.commerce.documentation.domain.tables.pojos.DQuestion>> findManyByStoreId(Collection<String> values, int limit) {
        return findManyByCondition(DQuestion.D_QUESTION.STORE_ID.in(values), limit);
    }

    /**
     * Find records that have <code>MODEL_ID IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.commerce.documentation.domain.tables.pojos.DQuestion>> findManyByModelId(Collection<String> values) {
        return findManyByCondition(DQuestion.D_QUESTION.MODEL_ID.in(values));
    }

    /**
     * Find records that have <code>MODEL_ID IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.commerce.documentation.domain.tables.pojos.DQuestion>> findManyByModelId(Collection<String> values, int limit) {
        return findManyByCondition(DQuestion.D_QUESTION.MODEL_ID.in(values), limit);
    }

    /**
     * Find records that have <code>MODEL_KEY IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.commerce.documentation.domain.tables.pojos.DQuestion>> findManyByModelKey(Collection<String> values) {
        return findManyByCondition(DQuestion.D_QUESTION.MODEL_KEY.in(values));
    }

    /**
     * Find records that have <code>MODEL_KEY IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.commerce.documentation.domain.tables.pojos.DQuestion>> findManyByModelKey(Collection<String> values, int limit) {
        return findManyByCondition(DQuestion.D_QUESTION.MODEL_KEY.in(values), limit);
    }

    /**
     * Find records that have <code>SIGMA IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.commerce.documentation.domain.tables.pojos.DQuestion>> findManyBySigma(Collection<String> values) {
        return findManyByCondition(DQuestion.D_QUESTION.SIGMA.in(values));
    }

    /**
     * Find records that have <code>SIGMA IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.commerce.documentation.domain.tables.pojos.DQuestion>> findManyBySigma(Collection<String> values, int limit) {
        return findManyByCondition(DQuestion.D_QUESTION.SIGMA.in(values), limit);
    }

    /**
     * Find records that have <code>LANGUAGE IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.commerce.documentation.domain.tables.pojos.DQuestion>> findManyByLanguage(Collection<String> values) {
        return findManyByCondition(DQuestion.D_QUESTION.LANGUAGE.in(values));
    }

    /**
     * Find records that have <code>LANGUAGE IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.commerce.documentation.domain.tables.pojos.DQuestion>> findManyByLanguage(Collection<String> values, int limit) {
        return findManyByCondition(DQuestion.D_QUESTION.LANGUAGE.in(values), limit);
    }

    /**
     * Find records that have <code>ACTIVE IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.commerce.documentation.domain.tables.pojos.DQuestion>> findManyByActive(Collection<Boolean> values) {
        return findManyByCondition(DQuestion.D_QUESTION.ACTIVE.in(values));
    }

    /**
     * Find records that have <code>ACTIVE IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.commerce.documentation.domain.tables.pojos.DQuestion>> findManyByActive(Collection<Boolean> values, int limit) {
        return findManyByCondition(DQuestion.D_QUESTION.ACTIVE.in(values), limit);
    }

    /**
     * Find records that have <code>METADATA IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.commerce.documentation.domain.tables.pojos.DQuestion>> findManyByMetadata(Collection<String> values) {
        return findManyByCondition(DQuestion.D_QUESTION.METADATA.in(values));
    }

    /**
     * Find records that have <code>METADATA IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.commerce.documentation.domain.tables.pojos.DQuestion>> findManyByMetadata(Collection<String> values, int limit) {
        return findManyByCondition(DQuestion.D_QUESTION.METADATA.in(values), limit);
    }

    /**
     * Find records that have <code>CREATED_AT IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.commerce.documentation.domain.tables.pojos.DQuestion>> findManyByCreatedAt(Collection<LocalDateTime> values) {
        return findManyByCondition(DQuestion.D_QUESTION.CREATED_AT.in(values));
    }

    /**
     * Find records that have <code>CREATED_AT IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.commerce.documentation.domain.tables.pojos.DQuestion>> findManyByCreatedAt(Collection<LocalDateTime> values, int limit) {
        return findManyByCondition(DQuestion.D_QUESTION.CREATED_AT.in(values), limit);
    }

    /**
     * Find records that have <code>CREATED_BY IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.commerce.documentation.domain.tables.pojos.DQuestion>> findManyByCreatedBy(Collection<String> values) {
        return findManyByCondition(DQuestion.D_QUESTION.CREATED_BY.in(values));
    }

    /**
     * Find records that have <code>CREATED_BY IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.commerce.documentation.domain.tables.pojos.DQuestion>> findManyByCreatedBy(Collection<String> values, int limit) {
        return findManyByCondition(DQuestion.D_QUESTION.CREATED_BY.in(values), limit);
    }

    /**
     * Find records that have <code>UPDATED_AT IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.commerce.documentation.domain.tables.pojos.DQuestion>> findManyByUpdatedAt(Collection<LocalDateTime> values) {
        return findManyByCondition(DQuestion.D_QUESTION.UPDATED_AT.in(values));
    }

    /**
     * Find records that have <code>UPDATED_AT IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.commerce.documentation.domain.tables.pojos.DQuestion>> findManyByUpdatedAt(Collection<LocalDateTime> values, int limit) {
        return findManyByCondition(DQuestion.D_QUESTION.UPDATED_AT.in(values), limit);
    }

    /**
     * Find records that have <code>UPDATED_BY IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.commerce.documentation.domain.tables.pojos.DQuestion>> findManyByUpdatedBy(Collection<String> values) {
        return findManyByCondition(DQuestion.D_QUESTION.UPDATED_BY.in(values));
    }

    /**
     * Find records that have <code>UPDATED_BY IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.commerce.documentation.domain.tables.pojos.DQuestion>> findManyByUpdatedBy(Collection<String> values, int limit) {
        return findManyByCondition(DQuestion.D_QUESTION.UPDATED_BY.in(values), limit);
    }

    @Override
    public JDBCClassicQueryExecutor<DQuestionRecord, io.zerows.extension.commerce.documentation.domain.tables.pojos.DQuestion, String> queryExecutor() {
        return (JDBCClassicQueryExecutor<DQuestionRecord, io.zerows.extension.commerce.documentation.domain.tables.pojos.DQuestion, String>) super.queryExecutor();
    }
}
