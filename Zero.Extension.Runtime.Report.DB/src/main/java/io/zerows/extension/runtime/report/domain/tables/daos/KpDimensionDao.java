/*
 * This file is generated by jOOQ.
 */
package io.zerows.extension.runtime.report.domain.tables.daos;


import io.github.jklingsporn.vertx.jooq.shared.internal.AbstractVertxDAO;
import io.zerows.extension.runtime.report.domain.tables.KpDimension;
import io.zerows.extension.runtime.report.domain.tables.records.KpDimensionRecord;

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
public class KpDimensionDao extends AbstractVertxDAO<KpDimensionRecord, io.zerows.extension.runtime.report.domain.tables.pojos.KpDimension, String, Future<List<io.zerows.extension.runtime.report.domain.tables.pojos.KpDimension>>, Future<io.zerows.extension.runtime.report.domain.tables.pojos.KpDimension>, Future<Integer>, Future<String>> implements io.github.jklingsporn.vertx.jooq.classic.VertxDAO<KpDimensionRecord,io.zerows.extension.runtime.report.domain.tables.pojos.KpDimension,String> {

        /**
     * @param configuration The Configuration used for rendering and query
     * execution.
     * @param vertx the vertx instance
     */
        public KpDimensionDao(Configuration configuration, io.vertx.core.Vertx vertx) {
                super(KpDimension.KP_DIMENSION, io.zerows.extension.runtime.report.domain.tables.pojos.KpDimension.class, new JDBCClassicQueryExecutor<KpDimensionRecord,io.zerows.extension.runtime.report.domain.tables.pojos.KpDimension,String>(configuration,io.zerows.extension.runtime.report.domain.tables.pojos.KpDimension.class,vertx));
        }

        @Override
        protected String getId(io.zerows.extension.runtime.report.domain.tables.pojos.KpDimension object) {
                return object.getKey();
        }

        /**
     * Find records that have <code>NAME IN (values)</code> asynchronously
     */
        public Future<List<io.zerows.extension.runtime.report.domain.tables.pojos.KpDimension>> findManyByName(Collection<String> values) {
                return findManyByCondition(KpDimension.KP_DIMENSION.NAME.in(values));
        }

        /**
     * Find records that have <code>NAME IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<io.zerows.extension.runtime.report.domain.tables.pojos.KpDimension>> findManyByName(Collection<String> values, int limit) {
                return findManyByCondition(KpDimension.KP_DIMENSION.NAME.in(values),limit);
        }

        /**
     * Find records that have <code>CODE IN (values)</code> asynchronously
     */
        public Future<List<io.zerows.extension.runtime.report.domain.tables.pojos.KpDimension>> findManyByCode(Collection<String> values) {
                return findManyByCondition(KpDimension.KP_DIMENSION.CODE.in(values));
        }

        /**
     * Find records that have <code>CODE IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<io.zerows.extension.runtime.report.domain.tables.pojos.KpDimension>> findManyByCode(Collection<String> values, int limit) {
                return findManyByCondition(KpDimension.KP_DIMENSION.CODE.in(values),limit);
        }

        /**
     * Find records that have <code>TYPE IN (values)</code> asynchronously
     */
        public Future<List<io.zerows.extension.runtime.report.domain.tables.pojos.KpDimension>> findManyByType(Collection<String> values) {
                return findManyByCondition(KpDimension.KP_DIMENSION.TYPE.in(values));
        }

        /**
     * Find records that have <code>TYPE IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<io.zerows.extension.runtime.report.domain.tables.pojos.KpDimension>> findManyByType(Collection<String> values, int limit) {
                return findManyByCondition(KpDimension.KP_DIMENSION.TYPE.in(values),limit);
        }

        /**
     * Find records that have <code>STATUS IN (values)</code> asynchronously
     */
        public Future<List<io.zerows.extension.runtime.report.domain.tables.pojos.KpDimension>> findManyByStatus(Collection<String> values) {
                return findManyByCondition(KpDimension.KP_DIMENSION.STATUS.in(values));
        }

        /**
     * Find records that have <code>STATUS IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<io.zerows.extension.runtime.report.domain.tables.pojos.KpDimension>> findManyByStatus(Collection<String> values, int limit) {
                return findManyByCondition(KpDimension.KP_DIMENSION.STATUS.in(values),limit);
        }

        /**
     * Find records that have <code>DATA_SET_ID IN (values)</code>
     * asynchronously
     */
        public Future<List<io.zerows.extension.runtime.report.domain.tables.pojos.KpDimension>> findManyByDataSetId(Collection<String> values) {
                return findManyByCondition(KpDimension.KP_DIMENSION.DATA_SET_ID.in(values));
        }

        /**
     * Find records that have <code>DATA_SET_ID IN (values)</code>
     * asynchronously limited by the given limit
     */
        public Future<List<io.zerows.extension.runtime.report.domain.tables.pojos.KpDimension>> findManyByDataSetId(Collection<String> values, int limit) {
                return findManyByCondition(KpDimension.KP_DIMENSION.DATA_SET_ID.in(values),limit);
        }

        /**
     * Find records that have <code>DATA_QUERY IN (values)</code> asynchronously
     */
        public Future<List<io.zerows.extension.runtime.report.domain.tables.pojos.KpDimension>> findManyByDataQuery(Collection<String> values) {
                return findManyByCondition(KpDimension.KP_DIMENSION.DATA_QUERY.in(values));
        }

        /**
     * Find records that have <code>DATA_QUERY IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<io.zerows.extension.runtime.report.domain.tables.pojos.KpDimension>> findManyByDataQuery(Collection<String> values, int limit) {
                return findManyByCondition(KpDimension.KP_DIMENSION.DATA_QUERY.in(values),limit);
        }

        /**
     * Find records that have <code>DATA_SORT IN (values)</code> asynchronously
     */
        public Future<List<io.zerows.extension.runtime.report.domain.tables.pojos.KpDimension>> findManyByDataSort(Collection<String> values) {
                return findManyByCondition(KpDimension.KP_DIMENSION.DATA_SORT.in(values));
        }

        /**
     * Find records that have <code>DATA_SORT IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<io.zerows.extension.runtime.report.domain.tables.pojos.KpDimension>> findManyByDataSort(Collection<String> values, int limit) {
                return findManyByCondition(KpDimension.KP_DIMENSION.DATA_SORT.in(values),limit);
        }

        /**
     * Find records that have <code>DATA_GROUP IN (values)</code> asynchronously
     */
        public Future<List<io.zerows.extension.runtime.report.domain.tables.pojos.KpDimension>> findManyByDataGroup(Collection<String> values) {
                return findManyByCondition(KpDimension.KP_DIMENSION.DATA_GROUP.in(values));
        }

        /**
     * Find records that have <code>DATA_GROUP IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<io.zerows.extension.runtime.report.domain.tables.pojos.KpDimension>> findManyByDataGroup(Collection<String> values, int limit) {
                return findManyByCondition(KpDimension.KP_DIMENSION.DATA_GROUP.in(values),limit);
        }

        /**
     * Find records that have <code>DATA_OUTPUT IN (values)</code>
     * asynchronously
     */
        public Future<List<io.zerows.extension.runtime.report.domain.tables.pojos.KpDimension>> findManyByDataOutput(Collection<String> values) {
                return findManyByCondition(KpDimension.KP_DIMENSION.DATA_OUTPUT.in(values));
        }

        /**
     * Find records that have <code>DATA_OUTPUT IN (values)</code>
     * asynchronously limited by the given limit
     */
        public Future<List<io.zerows.extension.runtime.report.domain.tables.pojos.KpDimension>> findManyByDataOutput(Collection<String> values, int limit) {
                return findManyByCondition(KpDimension.KP_DIMENSION.DATA_OUTPUT.in(values),limit);
        }

        /**
     * Find records that have <code>DATA_FIELD IN (values)</code> asynchronously
     */
        public Future<List<io.zerows.extension.runtime.report.domain.tables.pojos.KpDimension>> findManyByDataField(Collection<String> values) {
                return findManyByCondition(KpDimension.KP_DIMENSION.DATA_FIELD.in(values));
        }

        /**
     * Find records that have <code>DATA_FIELD IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<io.zerows.extension.runtime.report.domain.tables.pojos.KpDimension>> findManyByDataField(Collection<String> values, int limit) {
                return findManyByCondition(KpDimension.KP_DIMENSION.DATA_FIELD.in(values),limit);
        }

        /**
     * Find records that have <code>CHART_TYPE IN (values)</code> asynchronously
     */
        public Future<List<io.zerows.extension.runtime.report.domain.tables.pojos.KpDimension>> findManyByChartType(Collection<String> values) {
                return findManyByCondition(KpDimension.KP_DIMENSION.CHART_TYPE.in(values));
        }

        /**
     * Find records that have <code>CHART_TYPE IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<io.zerows.extension.runtime.report.domain.tables.pojos.KpDimension>> findManyByChartType(Collection<String> values, int limit) {
                return findManyByCondition(KpDimension.KP_DIMENSION.CHART_TYPE.in(values),limit);
        }

        /**
     * Find records that have <code>CHART_CONFIG IN (values)</code>
     * asynchronously
     */
        public Future<List<io.zerows.extension.runtime.report.domain.tables.pojos.KpDimension>> findManyByChartConfig(Collection<String> values) {
                return findManyByCondition(KpDimension.KP_DIMENSION.CHART_CONFIG.in(values));
        }

        /**
     * Find records that have <code>CHART_CONFIG IN (values)</code>
     * asynchronously limited by the given limit
     */
        public Future<List<io.zerows.extension.runtime.report.domain.tables.pojos.KpDimension>> findManyByChartConfig(Collection<String> values, int limit) {
                return findManyByCondition(KpDimension.KP_DIMENSION.CHART_CONFIG.in(values),limit);
        }

        /**
     * Find records that have <code>REPORT_ID IN (values)</code> asynchronously
     */
        public Future<List<io.zerows.extension.runtime.report.domain.tables.pojos.KpDimension>> findManyByReportId(Collection<String> values) {
                return findManyByCondition(KpDimension.KP_DIMENSION.REPORT_ID.in(values));
        }

        /**
     * Find records that have <code>REPORT_ID IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<io.zerows.extension.runtime.report.domain.tables.pojos.KpDimension>> findManyByReportId(Collection<String> values, int limit) {
                return findManyByCondition(KpDimension.KP_DIMENSION.REPORT_ID.in(values),limit);
        }

        /**
     * Find records that have <code>ACTIVE IN (values)</code> asynchronously
     */
        public Future<List<io.zerows.extension.runtime.report.domain.tables.pojos.KpDimension>> findManyByActive(Collection<Boolean> values) {
                return findManyByCondition(KpDimension.KP_DIMENSION.ACTIVE.in(values));
        }

        /**
     * Find records that have <code>ACTIVE IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<io.zerows.extension.runtime.report.domain.tables.pojos.KpDimension>> findManyByActive(Collection<Boolean> values, int limit) {
                return findManyByCondition(KpDimension.KP_DIMENSION.ACTIVE.in(values),limit);
        }

        /**
     * Find records that have <code>SIGMA IN (values)</code> asynchronously
     */
        public Future<List<io.zerows.extension.runtime.report.domain.tables.pojos.KpDimension>> findManyBySigma(Collection<String> values) {
                return findManyByCondition(KpDimension.KP_DIMENSION.SIGMA.in(values));
        }

        /**
     * Find records that have <code>SIGMA IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<io.zerows.extension.runtime.report.domain.tables.pojos.KpDimension>> findManyBySigma(Collection<String> values, int limit) {
                return findManyByCondition(KpDimension.KP_DIMENSION.SIGMA.in(values),limit);
        }

        /**
     * Find records that have <code>METADATA IN (values)</code> asynchronously
     */
        public Future<List<io.zerows.extension.runtime.report.domain.tables.pojos.KpDimension>> findManyByMetadata(Collection<String> values) {
                return findManyByCondition(KpDimension.KP_DIMENSION.METADATA.in(values));
        }

        /**
     * Find records that have <code>METADATA IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<io.zerows.extension.runtime.report.domain.tables.pojos.KpDimension>> findManyByMetadata(Collection<String> values, int limit) {
                return findManyByCondition(KpDimension.KP_DIMENSION.METADATA.in(values),limit);
        }

        /**
     * Find records that have <code>LANGUAGE IN (values)</code> asynchronously
     */
        public Future<List<io.zerows.extension.runtime.report.domain.tables.pojos.KpDimension>> findManyByLanguage(Collection<String> values) {
                return findManyByCondition(KpDimension.KP_DIMENSION.LANGUAGE.in(values));
        }

        /**
     * Find records that have <code>LANGUAGE IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<io.zerows.extension.runtime.report.domain.tables.pojos.KpDimension>> findManyByLanguage(Collection<String> values, int limit) {
                return findManyByCondition(KpDimension.KP_DIMENSION.LANGUAGE.in(values),limit);
        }

        /**
     * Find records that have <code>CREATED_AT IN (values)</code> asynchronously
     */
        public Future<List<io.zerows.extension.runtime.report.domain.tables.pojos.KpDimension>> findManyByCreatedAt(Collection<LocalDateTime> values) {
                return findManyByCondition(KpDimension.KP_DIMENSION.CREATED_AT.in(values));
        }

        /**
     * Find records that have <code>CREATED_AT IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<io.zerows.extension.runtime.report.domain.tables.pojos.KpDimension>> findManyByCreatedAt(Collection<LocalDateTime> values, int limit) {
                return findManyByCondition(KpDimension.KP_DIMENSION.CREATED_AT.in(values),limit);
        }

        /**
     * Find records that have <code>CREATED_BY IN (values)</code> asynchronously
     */
        public Future<List<io.zerows.extension.runtime.report.domain.tables.pojos.KpDimension>> findManyByCreatedBy(Collection<String> values) {
                return findManyByCondition(KpDimension.KP_DIMENSION.CREATED_BY.in(values));
        }

        /**
     * Find records that have <code>CREATED_BY IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<io.zerows.extension.runtime.report.domain.tables.pojos.KpDimension>> findManyByCreatedBy(Collection<String> values, int limit) {
                return findManyByCondition(KpDimension.KP_DIMENSION.CREATED_BY.in(values),limit);
        }

        /**
     * Find records that have <code>UPDATED_AT IN (values)</code> asynchronously
     */
        public Future<List<io.zerows.extension.runtime.report.domain.tables.pojos.KpDimension>> findManyByUpdatedAt(Collection<LocalDateTime> values) {
                return findManyByCondition(KpDimension.KP_DIMENSION.UPDATED_AT.in(values));
        }

        /**
     * Find records that have <code>UPDATED_AT IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<io.zerows.extension.runtime.report.domain.tables.pojos.KpDimension>> findManyByUpdatedAt(Collection<LocalDateTime> values, int limit) {
                return findManyByCondition(KpDimension.KP_DIMENSION.UPDATED_AT.in(values),limit);
        }

        /**
     * Find records that have <code>UPDATED_BY IN (values)</code> asynchronously
     */
        public Future<List<io.zerows.extension.runtime.report.domain.tables.pojos.KpDimension>> findManyByUpdatedBy(Collection<String> values) {
                return findManyByCondition(KpDimension.KP_DIMENSION.UPDATED_BY.in(values));
        }

        /**
     * Find records that have <code>UPDATED_BY IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<io.zerows.extension.runtime.report.domain.tables.pojos.KpDimension>> findManyByUpdatedBy(Collection<String> values, int limit) {
                return findManyByCondition(KpDimension.KP_DIMENSION.UPDATED_BY.in(values),limit);
        }

        @Override
        public JDBCClassicQueryExecutor<KpDimensionRecord,io.zerows.extension.runtime.report.domain.tables.pojos.KpDimension,String> queryExecutor(){
                return (JDBCClassicQueryExecutor<KpDimensionRecord,io.zerows.extension.runtime.report.domain.tables.pojos.KpDimension,String>) super.queryExecutor();
        }
}
