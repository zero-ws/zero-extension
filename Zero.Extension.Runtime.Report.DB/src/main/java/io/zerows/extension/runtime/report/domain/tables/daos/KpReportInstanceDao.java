/*
 * This file is generated by jOOQ.
 */
package io.zerows.extension.runtime.report.domain.tables.daos;


import io.github.jklingsporn.vertx.jooq.shared.internal.AbstractVertxDAO;
import io.zerows.extension.runtime.report.domain.tables.KpReportInstance;
import io.zerows.extension.runtime.report.domain.tables.records.KpReportInstanceRecord;

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
public class KpReportInstanceDao extends AbstractVertxDAO<KpReportInstanceRecord, io.zerows.extension.runtime.report.domain.tables.pojos.KpReportInstance, String, Future<List<io.zerows.extension.runtime.report.domain.tables.pojos.KpReportInstance>>, Future<io.zerows.extension.runtime.report.domain.tables.pojos.KpReportInstance>, Future<Integer>, Future<String>> implements io.github.jklingsporn.vertx.jooq.classic.VertxDAO<KpReportInstanceRecord,io.zerows.extension.runtime.report.domain.tables.pojos.KpReportInstance,String> {

        /**
     * @param configuration The Configuration used for rendering and query
     * execution.
     * @param vertx the vertx instance
     */
        public KpReportInstanceDao(Configuration configuration, io.vertx.core.Vertx vertx) {
                super(KpReportInstance.KP_REPORT_INSTANCE, io.zerows.extension.runtime.report.domain.tables.pojos.KpReportInstance.class, new JDBCClassicQueryExecutor<KpReportInstanceRecord,io.zerows.extension.runtime.report.domain.tables.pojos.KpReportInstance,String>(configuration,io.zerows.extension.runtime.report.domain.tables.pojos.KpReportInstance.class,vertx));
        }

        @Override
        protected String getId(io.zerows.extension.runtime.report.domain.tables.pojos.KpReportInstance object) {
                return object.getKey();
        }

        /**
     * Find records that have <code>NAME IN (values)</code> asynchronously
     */
        public Future<List<io.zerows.extension.runtime.report.domain.tables.pojos.KpReportInstance>> findManyByName(Collection<String> values) {
                return findManyByCondition(KpReportInstance.KP_REPORT_INSTANCE.NAME.in(values));
        }

        /**
     * Find records that have <code>NAME IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<io.zerows.extension.runtime.report.domain.tables.pojos.KpReportInstance>> findManyByName(Collection<String> values, int limit) {
                return findManyByCondition(KpReportInstance.KP_REPORT_INSTANCE.NAME.in(values),limit);
        }

        /**
     * Find records that have <code>STATUS IN (values)</code> asynchronously
     */
        public Future<List<io.zerows.extension.runtime.report.domain.tables.pojos.KpReportInstance>> findManyByStatus(Collection<String> values) {
                return findManyByCondition(KpReportInstance.KP_REPORT_INSTANCE.STATUS.in(values));
        }

        /**
     * Find records that have <code>STATUS IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<io.zerows.extension.runtime.report.domain.tables.pojos.KpReportInstance>> findManyByStatus(Collection<String> values, int limit) {
                return findManyByCondition(KpReportInstance.KP_REPORT_INSTANCE.STATUS.in(values),limit);
        }

        /**
     * Find records that have <code>TYPE IN (values)</code> asynchronously
     */
        public Future<List<io.zerows.extension.runtime.report.domain.tables.pojos.KpReportInstance>> findManyByType(Collection<String> values) {
                return findManyByCondition(KpReportInstance.KP_REPORT_INSTANCE.TYPE.in(values));
        }

        /**
     * Find records that have <code>TYPE IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<io.zerows.extension.runtime.report.domain.tables.pojos.KpReportInstance>> findManyByType(Collection<String> values, int limit) {
                return findManyByCondition(KpReportInstance.KP_REPORT_INSTANCE.TYPE.in(values),limit);
        }

        /**
     * Find records that have <code>TITLE IN (values)</code> asynchronously
     */
        public Future<List<io.zerows.extension.runtime.report.domain.tables.pojos.KpReportInstance>> findManyByTitle(Collection<String> values) {
                return findManyByCondition(KpReportInstance.KP_REPORT_INSTANCE.TITLE.in(values));
        }

        /**
     * Find records that have <code>TITLE IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<io.zerows.extension.runtime.report.domain.tables.pojos.KpReportInstance>> findManyByTitle(Collection<String> values, int limit) {
                return findManyByCondition(KpReportInstance.KP_REPORT_INSTANCE.TITLE.in(values),limit);
        }

        /**
     * Find records that have <code>SUBTITLE IN (values)</code> asynchronously
     */
        public Future<List<io.zerows.extension.runtime.report.domain.tables.pojos.KpReportInstance>> findManyBySubtitle(Collection<String> values) {
                return findManyByCondition(KpReportInstance.KP_REPORT_INSTANCE.SUBTITLE.in(values));
        }

        /**
     * Find records that have <code>SUBTITLE IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<io.zerows.extension.runtime.report.domain.tables.pojos.KpReportInstance>> findManyBySubtitle(Collection<String> values, int limit) {
                return findManyByCondition(KpReportInstance.KP_REPORT_INSTANCE.SUBTITLE.in(values),limit);
        }

        /**
     * Find records that have <code>EXTRA IN (values)</code> asynchronously
     */
        public Future<List<io.zerows.extension.runtime.report.domain.tables.pojos.KpReportInstance>> findManyByExtra(Collection<String> values) {
                return findManyByCondition(KpReportInstance.KP_REPORT_INSTANCE.EXTRA.in(values));
        }

        /**
     * Find records that have <code>EXTRA IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<io.zerows.extension.runtime.report.domain.tables.pojos.KpReportInstance>> findManyByExtra(Collection<String> values, int limit) {
                return findManyByCondition(KpReportInstance.KP_REPORT_INSTANCE.EXTRA.in(values),limit);
        }

        /**
     * Find records that have <code>DESCRIPTION IN (values)</code>
     * asynchronously
     */
        public Future<List<io.zerows.extension.runtime.report.domain.tables.pojos.KpReportInstance>> findManyByDescription(Collection<String> values) {
                return findManyByCondition(KpReportInstance.KP_REPORT_INSTANCE.DESCRIPTION.in(values));
        }

        /**
     * Find records that have <code>DESCRIPTION IN (values)</code>
     * asynchronously limited by the given limit
     */
        public Future<List<io.zerows.extension.runtime.report.domain.tables.pojos.KpReportInstance>> findManyByDescription(Collection<String> values, int limit) {
                return findManyByCondition(KpReportInstance.KP_REPORT_INSTANCE.DESCRIPTION.in(values),limit);
        }

        /**
     * Find records that have <code>MODE_EXPR IN (values)</code> asynchronously
     */
        public Future<List<io.zerows.extension.runtime.report.domain.tables.pojos.KpReportInstance>> findManyByModeExpr(Collection<String> values) {
                return findManyByCondition(KpReportInstance.KP_REPORT_INSTANCE.MODE_EXPR.in(values));
        }

        /**
     * Find records that have <code>MODE_EXPR IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<io.zerows.extension.runtime.report.domain.tables.pojos.KpReportInstance>> findManyByModeExpr(Collection<String> values, int limit) {
                return findManyByCondition(KpReportInstance.KP_REPORT_INSTANCE.MODE_EXPR.in(values),limit);
        }

        /**
     * Find records that have <code>REPORT_ID IN (values)</code> asynchronously
     */
        public Future<List<io.zerows.extension.runtime.report.domain.tables.pojos.KpReportInstance>> findManyByReportId(Collection<String> values) {
                return findManyByCondition(KpReportInstance.KP_REPORT_INSTANCE.REPORT_ID.in(values));
        }

        /**
     * Find records that have <code>REPORT_ID IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<io.zerows.extension.runtime.report.domain.tables.pojos.KpReportInstance>> findManyByReportId(Collection<String> values, int limit) {
                return findManyByCondition(KpReportInstance.KP_REPORT_INSTANCE.REPORT_ID.in(values),limit);
        }

        /**
     * Find records that have <code>REPORT_CONTENT IN (values)</code>
     * asynchronously
     */
        public Future<List<io.zerows.extension.runtime.report.domain.tables.pojos.KpReportInstance>> findManyByReportContent(Collection<String> values) {
                return findManyByCondition(KpReportInstance.KP_REPORT_INSTANCE.REPORT_CONTENT.in(values));
        }

        /**
     * Find records that have <code>REPORT_CONTENT IN (values)</code>
     * asynchronously limited by the given limit
     */
        public Future<List<io.zerows.extension.runtime.report.domain.tables.pojos.KpReportInstance>> findManyByReportContent(Collection<String> values, int limit) {
                return findManyByCondition(KpReportInstance.KP_REPORT_INSTANCE.REPORT_CONTENT.in(values),limit);
        }

        /**
     * Find records that have <code>REPORT_DATA IN (values)</code>
     * asynchronously
     */
        public Future<List<io.zerows.extension.runtime.report.domain.tables.pojos.KpReportInstance>> findManyByReportData(Collection<String> values) {
                return findManyByCondition(KpReportInstance.KP_REPORT_INSTANCE.REPORT_DATA.in(values));
        }

        /**
     * Find records that have <code>REPORT_DATA IN (values)</code>
     * asynchronously limited by the given limit
     */
        public Future<List<io.zerows.extension.runtime.report.domain.tables.pojos.KpReportInstance>> findManyByReportData(Collection<String> values, int limit) {
                return findManyByCondition(KpReportInstance.KP_REPORT_INSTANCE.REPORT_DATA.in(values),limit);
        }

        /**
     * Find records that have <code>REPORT_BY IN (values)</code> asynchronously
     */
        public Future<List<io.zerows.extension.runtime.report.domain.tables.pojos.KpReportInstance>> findManyByReportBy(Collection<String> values) {
                return findManyByCondition(KpReportInstance.KP_REPORT_INSTANCE.REPORT_BY.in(values));
        }

        /**
     * Find records that have <code>REPORT_BY IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<io.zerows.extension.runtime.report.domain.tables.pojos.KpReportInstance>> findManyByReportBy(Collection<String> values, int limit) {
                return findManyByCondition(KpReportInstance.KP_REPORT_INSTANCE.REPORT_BY.in(values),limit);
        }

        /**
     * Find records that have <code>REPORT_AT IN (values)</code> asynchronously
     */
        public Future<List<io.zerows.extension.runtime.report.domain.tables.pojos.KpReportInstance>> findManyByReportAt(Collection<LocalDateTime> values) {
                return findManyByCondition(KpReportInstance.KP_REPORT_INSTANCE.REPORT_AT.in(values));
        }

        /**
     * Find records that have <code>REPORT_AT IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<io.zerows.extension.runtime.report.domain.tables.pojos.KpReportInstance>> findManyByReportAt(Collection<LocalDateTime> values, int limit) {
                return findManyByCondition(KpReportInstance.KP_REPORT_INSTANCE.REPORT_AT.in(values),limit);
        }

        /**
     * Find records that have <code>REF_TYPE IN (values)</code> asynchronously
     */
        public Future<List<io.zerows.extension.runtime.report.domain.tables.pojos.KpReportInstance>> findManyByRefType(Collection<String> values) {
                return findManyByCondition(KpReportInstance.KP_REPORT_INSTANCE.REF_TYPE.in(values));
        }

        /**
     * Find records that have <code>REF_TYPE IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<io.zerows.extension.runtime.report.domain.tables.pojos.KpReportInstance>> findManyByRefType(Collection<String> values, int limit) {
                return findManyByCondition(KpReportInstance.KP_REPORT_INSTANCE.REF_TYPE.in(values),limit);
        }

        /**
     * Find records that have <code>REF_ID IN (values)</code> asynchronously
     */
        public Future<List<io.zerows.extension.runtime.report.domain.tables.pojos.KpReportInstance>> findManyByRefId(Collection<String> values) {
                return findManyByCondition(KpReportInstance.KP_REPORT_INSTANCE.REF_ID.in(values));
        }

        /**
     * Find records that have <code>REF_ID IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<io.zerows.extension.runtime.report.domain.tables.pojos.KpReportInstance>> findManyByRefId(Collection<String> values, int limit) {
                return findManyByCondition(KpReportInstance.KP_REPORT_INSTANCE.REF_ID.in(values),limit);
        }

        /**
     * Find records that have <code>ACTIVE IN (values)</code> asynchronously
     */
        public Future<List<io.zerows.extension.runtime.report.domain.tables.pojos.KpReportInstance>> findManyByActive(Collection<Boolean> values) {
                return findManyByCondition(KpReportInstance.KP_REPORT_INSTANCE.ACTIVE.in(values));
        }

        /**
     * Find records that have <code>ACTIVE IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<io.zerows.extension.runtime.report.domain.tables.pojos.KpReportInstance>> findManyByActive(Collection<Boolean> values, int limit) {
                return findManyByCondition(KpReportInstance.KP_REPORT_INSTANCE.ACTIVE.in(values),limit);
        }

        /**
     * Find records that have <code>SIGMA IN (values)</code> asynchronously
     */
        public Future<List<io.zerows.extension.runtime.report.domain.tables.pojos.KpReportInstance>> findManyBySigma(Collection<String> values) {
                return findManyByCondition(KpReportInstance.KP_REPORT_INSTANCE.SIGMA.in(values));
        }

        /**
     * Find records that have <code>SIGMA IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<io.zerows.extension.runtime.report.domain.tables.pojos.KpReportInstance>> findManyBySigma(Collection<String> values, int limit) {
                return findManyByCondition(KpReportInstance.KP_REPORT_INSTANCE.SIGMA.in(values),limit);
        }

        /**
     * Find records that have <code>METADATA IN (values)</code> asynchronously
     */
        public Future<List<io.zerows.extension.runtime.report.domain.tables.pojos.KpReportInstance>> findManyByMetadata(Collection<String> values) {
                return findManyByCondition(KpReportInstance.KP_REPORT_INSTANCE.METADATA.in(values));
        }

        /**
     * Find records that have <code>METADATA IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<io.zerows.extension.runtime.report.domain.tables.pojos.KpReportInstance>> findManyByMetadata(Collection<String> values, int limit) {
                return findManyByCondition(KpReportInstance.KP_REPORT_INSTANCE.METADATA.in(values),limit);
        }

        /**
     * Find records that have <code>LANGUAGE IN (values)</code> asynchronously
     */
        public Future<List<io.zerows.extension.runtime.report.domain.tables.pojos.KpReportInstance>> findManyByLanguage(Collection<String> values) {
                return findManyByCondition(KpReportInstance.KP_REPORT_INSTANCE.LANGUAGE.in(values));
        }

        /**
     * Find records that have <code>LANGUAGE IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<io.zerows.extension.runtime.report.domain.tables.pojos.KpReportInstance>> findManyByLanguage(Collection<String> values, int limit) {
                return findManyByCondition(KpReportInstance.KP_REPORT_INSTANCE.LANGUAGE.in(values),limit);
        }

        /**
     * Find records that have <code>CREATED_AT IN (values)</code> asynchronously
     */
        public Future<List<io.zerows.extension.runtime.report.domain.tables.pojos.KpReportInstance>> findManyByCreatedAt(Collection<LocalDateTime> values) {
                return findManyByCondition(KpReportInstance.KP_REPORT_INSTANCE.CREATED_AT.in(values));
        }

        /**
     * Find records that have <code>CREATED_AT IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<io.zerows.extension.runtime.report.domain.tables.pojos.KpReportInstance>> findManyByCreatedAt(Collection<LocalDateTime> values, int limit) {
                return findManyByCondition(KpReportInstance.KP_REPORT_INSTANCE.CREATED_AT.in(values),limit);
        }

        /**
     * Find records that have <code>CREATED_BY IN (values)</code> asynchronously
     */
        public Future<List<io.zerows.extension.runtime.report.domain.tables.pojos.KpReportInstance>> findManyByCreatedBy(Collection<String> values) {
                return findManyByCondition(KpReportInstance.KP_REPORT_INSTANCE.CREATED_BY.in(values));
        }

        /**
     * Find records that have <code>CREATED_BY IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<io.zerows.extension.runtime.report.domain.tables.pojos.KpReportInstance>> findManyByCreatedBy(Collection<String> values, int limit) {
                return findManyByCondition(KpReportInstance.KP_REPORT_INSTANCE.CREATED_BY.in(values),limit);
        }

        /**
     * Find records that have <code>UPDATED_AT IN (values)</code> asynchronously
     */
        public Future<List<io.zerows.extension.runtime.report.domain.tables.pojos.KpReportInstance>> findManyByUpdatedAt(Collection<LocalDateTime> values) {
                return findManyByCondition(KpReportInstance.KP_REPORT_INSTANCE.UPDATED_AT.in(values));
        }

        /**
     * Find records that have <code>UPDATED_AT IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<io.zerows.extension.runtime.report.domain.tables.pojos.KpReportInstance>> findManyByUpdatedAt(Collection<LocalDateTime> values, int limit) {
                return findManyByCondition(KpReportInstance.KP_REPORT_INSTANCE.UPDATED_AT.in(values),limit);
        }

        /**
     * Find records that have <code>UPDATED_BY IN (values)</code> asynchronously
     */
        public Future<List<io.zerows.extension.runtime.report.domain.tables.pojos.KpReportInstance>> findManyByUpdatedBy(Collection<String> values) {
                return findManyByCondition(KpReportInstance.KP_REPORT_INSTANCE.UPDATED_BY.in(values));
        }

        /**
     * Find records that have <code>UPDATED_BY IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<io.zerows.extension.runtime.report.domain.tables.pojos.KpReportInstance>> findManyByUpdatedBy(Collection<String> values, int limit) {
                return findManyByCondition(KpReportInstance.KP_REPORT_INSTANCE.UPDATED_BY.in(values),limit);
        }

        @Override
        public JDBCClassicQueryExecutor<KpReportInstanceRecord,io.zerows.extension.runtime.report.domain.tables.pojos.KpReportInstance,String> queryExecutor(){
                return (JDBCClassicQueryExecutor<KpReportInstanceRecord,io.zerows.extension.runtime.report.domain.tables.pojos.KpReportInstance,String>) super.queryExecutor();
        }
}
