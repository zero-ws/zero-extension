/*
 * This file is generated by jOOQ.
 */
package cn.vertxup.doc.domain.tables.daos;


import cn.vertxup.doc.domain.tables.DResult;
import cn.vertxup.doc.domain.tables.records.DResultRecord;

import io.github.jklingsporn.vertx.jooq.shared.internal.AbstractVertxDAO;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Collection;

import org.jooq.Configuration;


import java.util.List;
import io.vertx.core.Future;
import io.github.jklingsporn.vertx.jooq.classic.jdbc.JDBCClassicQueryExecutor;
/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class DResultDao extends AbstractVertxDAO<DResultRecord, cn.vertxup.doc.domain.tables.pojos.DResult, String, Future<List<cn.vertxup.doc.domain.tables.pojos.DResult>>, Future<cn.vertxup.doc.domain.tables.pojos.DResult>, Future<Integer>, Future<String>> implements io.github.jklingsporn.vertx.jooq.classic.VertxDAO<DResultRecord,cn.vertxup.doc.domain.tables.pojos.DResult,String> {

        /**
     * @param configuration The Configuration used for rendering and query
     * execution.
     * @param vertx the vertx instance
     */
        public DResultDao(Configuration configuration, io.vertx.core.Vertx vertx) {
                super(DResult.D_RESULT, cn.vertxup.doc.domain.tables.pojos.DResult.class, new JDBCClassicQueryExecutor<DResultRecord,cn.vertxup.doc.domain.tables.pojos.DResult,String>(configuration,cn.vertxup.doc.domain.tables.pojos.DResult.class,vertx));
        }

        @Override
        protected String getId(cn.vertxup.doc.domain.tables.pojos.DResult object) {
                return object.getKey();
        }

        /**
     * Find records that have <code>CODE IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.doc.domain.tables.pojos.DResult>> findManyByCode(Collection<String> values) {
                return findManyByCondition(DResult.D_RESULT.CODE.in(values));
        }

        /**
     * Find records that have <code>CODE IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.doc.domain.tables.pojos.DResult>> findManyByCode(Collection<String> values, int limit) {
                return findManyByCondition(DResult.D_RESULT.CODE.in(values),limit);
        }

        /**
     * Find records that have <code>NAME IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.doc.domain.tables.pojos.DResult>> findManyByName(Collection<String> values) {
                return findManyByCondition(DResult.D_RESULT.NAME.in(values));
        }

        /**
     * Find records that have <code>NAME IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.doc.domain.tables.pojos.DResult>> findManyByName(Collection<String> values, int limit) {
                return findManyByCondition(DResult.D_RESULT.NAME.in(values),limit);
        }

        /**
     * Find records that have <code>CONTENT IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.doc.domain.tables.pojos.DResult>> findManyByContent(Collection<String> values) {
                return findManyByCondition(DResult.D_RESULT.CONTENT.in(values));
        }

        /**
     * Find records that have <code>CONTENT IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.doc.domain.tables.pojos.DResult>> findManyByContent(Collection<String> values, int limit) {
                return findManyByCondition(DResult.D_RESULT.CONTENT.in(values),limit);
        }

        /**
     * Find records that have <code>TYPE IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.doc.domain.tables.pojos.DResult>> findManyByType(Collection<String> values) {
                return findManyByCondition(DResult.D_RESULT.TYPE.in(values));
        }

        /**
     * Find records that have <code>TYPE IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.doc.domain.tables.pojos.DResult>> findManyByType(Collection<String> values, int limit) {
                return findManyByCondition(DResult.D_RESULT.TYPE.in(values),limit);
        }

        /**
     * Find records that have <code>SORT IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.doc.domain.tables.pojos.DResult>> findManyBySort(Collection<Integer> values) {
                return findManyByCondition(DResult.D_RESULT.SORT.in(values));
        }

        /**
     * Find records that have <code>SORT IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.doc.domain.tables.pojos.DResult>> findManyBySort(Collection<Integer> values, int limit) {
                return findManyByCondition(DResult.D_RESULT.SORT.in(values),limit);
        }

        /**
     * Find records that have <code>SCORE IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.doc.domain.tables.pojos.DResult>> findManyByScore(Collection<BigDecimal> values) {
                return findManyByCondition(DResult.D_RESULT.SCORE.in(values));
        }

        /**
     * Find records that have <code>SCORE IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.doc.domain.tables.pojos.DResult>> findManyByScore(Collection<BigDecimal> values, int limit) {
                return findManyByCondition(DResult.D_RESULT.SCORE.in(values),limit);
        }

        /**
     * Find records that have <code>SCORE_MARK IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.doc.domain.tables.pojos.DResult>> findManyByScoreMark(Collection<String> values) {
                return findManyByCondition(DResult.D_RESULT.SCORE_MARK.in(values));
        }

        /**
     * Find records that have <code>SCORE_MARK IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.doc.domain.tables.pojos.DResult>> findManyByScoreMark(Collection<String> values, int limit) {
                return findManyByCondition(DResult.D_RESULT.SCORE_MARK.in(values),limit);
        }

        /**
     * Find records that have <code>SCORE_GRADE IN (values)</code>
     * asynchronously
     */
        public Future<List<cn.vertxup.doc.domain.tables.pojos.DResult>> findManyByScoreGrade(Collection<String> values) {
                return findManyByCondition(DResult.D_RESULT.SCORE_GRADE.in(values));
        }

        /**
     * Find records that have <code>SCORE_GRADE IN (values)</code>
     * asynchronously limited by the given limit
     */
        public Future<List<cn.vertxup.doc.domain.tables.pojos.DResult>> findManyByScoreGrade(Collection<String> values, int limit) {
                return findManyByCondition(DResult.D_RESULT.SCORE_GRADE.in(values),limit);
        }

        /**
     * Find records that have <code>SCORE_CONTENT IN (values)</code>
     * asynchronously
     */
        public Future<List<cn.vertxup.doc.domain.tables.pojos.DResult>> findManyByScoreContent(Collection<String> values) {
                return findManyByCondition(DResult.D_RESULT.SCORE_CONTENT.in(values));
        }

        /**
     * Find records that have <code>SCORE_CONTENT IN (values)</code>
     * asynchronously limited by the given limit
     */
        public Future<List<cn.vertxup.doc.domain.tables.pojos.DResult>> findManyByScoreContent(Collection<String> values, int limit) {
                return findManyByCondition(DResult.D_RESULT.SCORE_CONTENT.in(values),limit);
        }

        /**
     * Find records that have <code>MADE_NAME IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.doc.domain.tables.pojos.DResult>> findManyByMadeName(Collection<String> values) {
                return findManyByCondition(DResult.D_RESULT.MADE_NAME.in(values));
        }

        /**
     * Find records that have <code>MADE_NAME IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.doc.domain.tables.pojos.DResult>> findManyByMadeName(Collection<String> values, int limit) {
                return findManyByCondition(DResult.D_RESULT.MADE_NAME.in(values),limit);
        }

        /**
     * Find records that have <code>MADE_AT IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.doc.domain.tables.pojos.DResult>> findManyByMadeAt(Collection<LocalDateTime> values) {
                return findManyByCondition(DResult.D_RESULT.MADE_AT.in(values));
        }

        /**
     * Find records that have <code>MADE_AT IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.doc.domain.tables.pojos.DResult>> findManyByMadeAt(Collection<LocalDateTime> values, int limit) {
                return findManyByCondition(DResult.D_RESULT.MADE_AT.in(values),limit);
        }

        /**
     * Find records that have <code>MODEL_ID IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.doc.domain.tables.pojos.DResult>> findManyByModelId(Collection<String> values) {
                return findManyByCondition(DResult.D_RESULT.MODEL_ID.in(values));
        }

        /**
     * Find records that have <code>MODEL_ID IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.doc.domain.tables.pojos.DResult>> findManyByModelId(Collection<String> values, int limit) {
                return findManyByCondition(DResult.D_RESULT.MODEL_ID.in(values),limit);
        }

        /**
     * Find records that have <code>MODEL_KEY IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.doc.domain.tables.pojos.DResult>> findManyByModelKey(Collection<String> values) {
                return findManyByCondition(DResult.D_RESULT.MODEL_KEY.in(values));
        }

        /**
     * Find records that have <code>MODEL_KEY IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.doc.domain.tables.pojos.DResult>> findManyByModelKey(Collection<String> values, int limit) {
                return findManyByCondition(DResult.D_RESULT.MODEL_KEY.in(values),limit);
        }

        /**
     * Find records that have <code>SIGMA IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.doc.domain.tables.pojos.DResult>> findManyBySigma(Collection<String> values) {
                return findManyByCondition(DResult.D_RESULT.SIGMA.in(values));
        }

        /**
     * Find records that have <code>SIGMA IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.doc.domain.tables.pojos.DResult>> findManyBySigma(Collection<String> values, int limit) {
                return findManyByCondition(DResult.D_RESULT.SIGMA.in(values),limit);
        }

        /**
     * Find records that have <code>LANGUAGE IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.doc.domain.tables.pojos.DResult>> findManyByLanguage(Collection<String> values) {
                return findManyByCondition(DResult.D_RESULT.LANGUAGE.in(values));
        }

        /**
     * Find records that have <code>LANGUAGE IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.doc.domain.tables.pojos.DResult>> findManyByLanguage(Collection<String> values, int limit) {
                return findManyByCondition(DResult.D_RESULT.LANGUAGE.in(values),limit);
        }

        /**
     * Find records that have <code>ACTIVE IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.doc.domain.tables.pojos.DResult>> findManyByActive(Collection<Boolean> values) {
                return findManyByCondition(DResult.D_RESULT.ACTIVE.in(values));
        }

        /**
     * Find records that have <code>ACTIVE IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.doc.domain.tables.pojos.DResult>> findManyByActive(Collection<Boolean> values, int limit) {
                return findManyByCondition(DResult.D_RESULT.ACTIVE.in(values),limit);
        }

        /**
     * Find records that have <code>METADATA IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.doc.domain.tables.pojos.DResult>> findManyByMetadata(Collection<String> values) {
                return findManyByCondition(DResult.D_RESULT.METADATA.in(values));
        }

        /**
     * Find records that have <code>METADATA IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.doc.domain.tables.pojos.DResult>> findManyByMetadata(Collection<String> values, int limit) {
                return findManyByCondition(DResult.D_RESULT.METADATA.in(values),limit);
        }

        /**
     * Find records that have <code>CREATED_AT IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.doc.domain.tables.pojos.DResult>> findManyByCreatedAt(Collection<LocalDateTime> values) {
                return findManyByCondition(DResult.D_RESULT.CREATED_AT.in(values));
        }

        /**
     * Find records that have <code>CREATED_AT IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.doc.domain.tables.pojos.DResult>> findManyByCreatedAt(Collection<LocalDateTime> values, int limit) {
                return findManyByCondition(DResult.D_RESULT.CREATED_AT.in(values),limit);
        }

        /**
     * Find records that have <code>CREATED_BY IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.doc.domain.tables.pojos.DResult>> findManyByCreatedBy(Collection<String> values) {
                return findManyByCondition(DResult.D_RESULT.CREATED_BY.in(values));
        }

        /**
     * Find records that have <code>CREATED_BY IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.doc.domain.tables.pojos.DResult>> findManyByCreatedBy(Collection<String> values, int limit) {
                return findManyByCondition(DResult.D_RESULT.CREATED_BY.in(values),limit);
        }

        /**
     * Find records that have <code>UPDATED_AT IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.doc.domain.tables.pojos.DResult>> findManyByUpdatedAt(Collection<LocalDateTime> values) {
                return findManyByCondition(DResult.D_RESULT.UPDATED_AT.in(values));
        }

        /**
     * Find records that have <code>UPDATED_AT IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.doc.domain.tables.pojos.DResult>> findManyByUpdatedAt(Collection<LocalDateTime> values, int limit) {
                return findManyByCondition(DResult.D_RESULT.UPDATED_AT.in(values),limit);
        }

        /**
     * Find records that have <code>UPDATED_BY IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.doc.domain.tables.pojos.DResult>> findManyByUpdatedBy(Collection<String> values) {
                return findManyByCondition(DResult.D_RESULT.UPDATED_BY.in(values));
        }

        /**
     * Find records that have <code>UPDATED_BY IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.doc.domain.tables.pojos.DResult>> findManyByUpdatedBy(Collection<String> values, int limit) {
                return findManyByCondition(DResult.D_RESULT.UPDATED_BY.in(values),limit);
        }

        @Override
        public JDBCClassicQueryExecutor<DResultRecord,cn.vertxup.doc.domain.tables.pojos.DResult,String> queryExecutor(){
                return (JDBCClassicQueryExecutor<DResultRecord,cn.vertxup.doc.domain.tables.pojos.DResult,String>) super.queryExecutor();
        }
}
