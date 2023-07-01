/*
 * This file is generated by jOOQ.
 */
package cn.vertxup.integration.domain.tables.daos;


import cn.vertxup.integration.domain.tables.DDocSegment;
import cn.vertxup.integration.domain.tables.records.DDocSegmentRecord;

import io.github.jklingsporn.vertx.jooq.shared.internal.AbstractVertxDAO;

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
public class DDocSegmentDao extends AbstractVertxDAO<DDocSegmentRecord, cn.vertxup.integration.domain.tables.pojos.DDocSegment, String, Future<List<cn.vertxup.integration.domain.tables.pojos.DDocSegment>>, Future<cn.vertxup.integration.domain.tables.pojos.DDocSegment>, Future<Integer>, Future<String>> implements io.github.jklingsporn.vertx.jooq.classic.VertxDAO<DDocSegmentRecord,cn.vertxup.integration.domain.tables.pojos.DDocSegment,String> {

        /**
     * @param configuration The Configuration used for rendering and query
     * execution.
     * @param vertx the vertx instance
     */
        public DDocSegmentDao(Configuration configuration, io.vertx.core.Vertx vertx) {
                super(DDocSegment.D_DOC_SEGMENT, cn.vertxup.integration.domain.tables.pojos.DDocSegment.class, new JDBCClassicQueryExecutor<DDocSegmentRecord,cn.vertxup.integration.domain.tables.pojos.DDocSegment,String>(configuration,cn.vertxup.integration.domain.tables.pojos.DDocSegment.class,vertx));
        }

        @Override
        protected String getId(cn.vertxup.integration.domain.tables.pojos.DDocSegment object) {
                return object.getKey();
        }

        /**
     * Find records that have <code>CODE IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.integration.domain.tables.pojos.DDocSegment>> findManyByCode(Collection<String> values) {
                return findManyByCondition(DDocSegment.D_DOC_SEGMENT.CODE.in(values));
        }

        /**
     * Find records that have <code>CODE IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.integration.domain.tables.pojos.DDocSegment>> findManyByCode(Collection<String> values, int limit) {
                return findManyByCondition(DDocSegment.D_DOC_SEGMENT.CODE.in(values),limit);
        }

        /**
     * Find records that have <code>NAME IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.integration.domain.tables.pojos.DDocSegment>> findManyByName(Collection<String> values) {
                return findManyByCondition(DDocSegment.D_DOC_SEGMENT.NAME.in(values));
        }

        /**
     * Find records that have <code>NAME IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.integration.domain.tables.pojos.DDocSegment>> findManyByName(Collection<String> values, int limit) {
                return findManyByCondition(DDocSegment.D_DOC_SEGMENT.NAME.in(values),limit);
        }

        /**
     * Find records that have <code>TYPE IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.integration.domain.tables.pojos.DDocSegment>> findManyByType(Collection<String> values) {
                return findManyByCondition(DDocSegment.D_DOC_SEGMENT.TYPE.in(values));
        }

        /**
     * Find records that have <code>TYPE IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.integration.domain.tables.pojos.DDocSegment>> findManyByType(Collection<String> values, int limit) {
                return findManyByCondition(DDocSegment.D_DOC_SEGMENT.TYPE.in(values),limit);
        }

        /**
     * Find records that have <code>PREFIX IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.integration.domain.tables.pojos.DDocSegment>> findManyByPrefix(Collection<String> values) {
                return findManyByCondition(DDocSegment.D_DOC_SEGMENT.PREFIX.in(values));
        }

        /**
     * Find records that have <code>PREFIX IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.integration.domain.tables.pojos.DDocSegment>> findManyByPrefix(Collection<String> values, int limit) {
                return findManyByCondition(DDocSegment.D_DOC_SEGMENT.PREFIX.in(values),limit);
        }

        /**
     * Find records that have <code>STATUS IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.integration.domain.tables.pojos.DDocSegment>> findManyByStatus(Collection<String> values) {
                return findManyByCondition(DDocSegment.D_DOC_SEGMENT.STATUS.in(values));
        }

        /**
     * Find records that have <code>STATUS IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.integration.domain.tables.pojos.DDocSegment>> findManyByStatus(Collection<String> values, int limit) {
                return findManyByCondition(DDocSegment.D_DOC_SEGMENT.STATUS.in(values),limit);
        }

        /**
     * Find records that have <code>CONTENT IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.integration.domain.tables.pojos.DDocSegment>> findManyByContent(Collection<String> values) {
                return findManyByCondition(DDocSegment.D_DOC_SEGMENT.CONTENT.in(values));
        }

        /**
     * Find records that have <code>CONTENT IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.integration.domain.tables.pojos.DDocSegment>> findManyByContent(Collection<String> values, int limit) {
                return findManyByCondition(DDocSegment.D_DOC_SEGMENT.CONTENT.in(values),limit);
        }

        /**
     * Find records that have <code>CONTENT_TEXT IN (values)</code>
     * asynchronously
     */
        public Future<List<cn.vertxup.integration.domain.tables.pojos.DDocSegment>> findManyByContentText(Collection<String> values) {
                return findManyByCondition(DDocSegment.D_DOC_SEGMENT.CONTENT_TEXT.in(values));
        }

        /**
     * Find records that have <code>CONTENT_TEXT IN (values)</code>
     * asynchronously limited by the given limit
     */
        public Future<List<cn.vertxup.integration.domain.tables.pojos.DDocSegment>> findManyByContentText(Collection<String> values, int limit) {
                return findManyByCondition(DDocSegment.D_DOC_SEGMENT.CONTENT_TEXT.in(values),limit);
        }

        /**
     * Find records that have <code>CONTENT_STORE IN (values)</code>
     * asynchronously
     */
        public Future<List<cn.vertxup.integration.domain.tables.pojos.DDocSegment>> findManyByContentStore(Collection<String> values) {
                return findManyByCondition(DDocSegment.D_DOC_SEGMENT.CONTENT_STORE.in(values));
        }

        /**
     * Find records that have <code>CONTENT_STORE IN (values)</code>
     * asynchronously limited by the given limit
     */
        public Future<List<cn.vertxup.integration.domain.tables.pojos.DDocSegment>> findManyByContentStore(Collection<String> values, int limit) {
                return findManyByCondition(DDocSegment.D_DOC_SEGMENT.CONTENT_STORE.in(values),limit);
        }

        /**
     * Find records that have <code>SORT IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.integration.domain.tables.pojos.DDocSegment>> findManyBySort(Collection<Integer> values) {
                return findManyByCondition(DDocSegment.D_DOC_SEGMENT.SORT.in(values));
        }

        /**
     * Find records that have <code>SORT IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.integration.domain.tables.pojos.DDocSegment>> findManyBySort(Collection<Integer> values, int limit) {
                return findManyByCondition(DDocSegment.D_DOC_SEGMENT.SORT.in(values),limit);
        }

        /**
     * Find records that have <code>LEVEL IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.integration.domain.tables.pojos.DDocSegment>> findManyByLevel(Collection<Integer> values) {
                return findManyByCondition(DDocSegment.D_DOC_SEGMENT.LEVEL.in(values));
        }

        /**
     * Find records that have <code>LEVEL IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.integration.domain.tables.pojos.DDocSegment>> findManyByLevel(Collection<Integer> values, int limit) {
                return findManyByCondition(DDocSegment.D_DOC_SEGMENT.LEVEL.in(values),limit);
        }

        /**
     * Find records that have <code>DOC_ID IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.integration.domain.tables.pojos.DDocSegment>> findManyByDocId(Collection<String> values) {
                return findManyByCondition(DDocSegment.D_DOC_SEGMENT.DOC_ID.in(values));
        }

        /**
     * Find records that have <code>DOC_ID IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.integration.domain.tables.pojos.DDocSegment>> findManyByDocId(Collection<String> values, int limit) {
                return findManyByCondition(DDocSegment.D_DOC_SEGMENT.DOC_ID.in(values),limit);
        }

        /**
     * Find records that have <code>PARENT_ID IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.integration.domain.tables.pojos.DDocSegment>> findManyByParentId(Collection<String> values) {
                return findManyByCondition(DDocSegment.D_DOC_SEGMENT.PARENT_ID.in(values));
        }

        /**
     * Find records that have <code>PARENT_ID IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.integration.domain.tables.pojos.DDocSegment>> findManyByParentId(Collection<String> values, int limit) {
                return findManyByCondition(DDocSegment.D_DOC_SEGMENT.PARENT_ID.in(values),limit);
        }

        /**
     * Find records that have <code>SIGMA IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.integration.domain.tables.pojos.DDocSegment>> findManyBySigma(Collection<String> values) {
                return findManyByCondition(DDocSegment.D_DOC_SEGMENT.SIGMA.in(values));
        }

        /**
     * Find records that have <code>SIGMA IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.integration.domain.tables.pojos.DDocSegment>> findManyBySigma(Collection<String> values, int limit) {
                return findManyByCondition(DDocSegment.D_DOC_SEGMENT.SIGMA.in(values),limit);
        }

        /**
     * Find records that have <code>LANGUAGE IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.integration.domain.tables.pojos.DDocSegment>> findManyByLanguage(Collection<String> values) {
                return findManyByCondition(DDocSegment.D_DOC_SEGMENT.LANGUAGE.in(values));
        }

        /**
     * Find records that have <code>LANGUAGE IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.integration.domain.tables.pojos.DDocSegment>> findManyByLanguage(Collection<String> values, int limit) {
                return findManyByCondition(DDocSegment.D_DOC_SEGMENT.LANGUAGE.in(values),limit);
        }

        /**
     * Find records that have <code>ACTIVE IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.integration.domain.tables.pojos.DDocSegment>> findManyByActive(Collection<Boolean> values) {
                return findManyByCondition(DDocSegment.D_DOC_SEGMENT.ACTIVE.in(values));
        }

        /**
     * Find records that have <code>ACTIVE IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.integration.domain.tables.pojos.DDocSegment>> findManyByActive(Collection<Boolean> values, int limit) {
                return findManyByCondition(DDocSegment.D_DOC_SEGMENT.ACTIVE.in(values),limit);
        }

        /**
     * Find records that have <code>METADATA IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.integration.domain.tables.pojos.DDocSegment>> findManyByMetadata(Collection<String> values) {
                return findManyByCondition(DDocSegment.D_DOC_SEGMENT.METADATA.in(values));
        }

        /**
     * Find records that have <code>METADATA IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.integration.domain.tables.pojos.DDocSegment>> findManyByMetadata(Collection<String> values, int limit) {
                return findManyByCondition(DDocSegment.D_DOC_SEGMENT.METADATA.in(values),limit);
        }

        /**
     * Find records that have <code>CREATED_AT IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.integration.domain.tables.pojos.DDocSegment>> findManyByCreatedAt(Collection<LocalDateTime> values) {
                return findManyByCondition(DDocSegment.D_DOC_SEGMENT.CREATED_AT.in(values));
        }

        /**
     * Find records that have <code>CREATED_AT IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.integration.domain.tables.pojos.DDocSegment>> findManyByCreatedAt(Collection<LocalDateTime> values, int limit) {
                return findManyByCondition(DDocSegment.D_DOC_SEGMENT.CREATED_AT.in(values),limit);
        }

        /**
     * Find records that have <code>CREATED_BY IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.integration.domain.tables.pojos.DDocSegment>> findManyByCreatedBy(Collection<String> values) {
                return findManyByCondition(DDocSegment.D_DOC_SEGMENT.CREATED_BY.in(values));
        }

        /**
     * Find records that have <code>CREATED_BY IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.integration.domain.tables.pojos.DDocSegment>> findManyByCreatedBy(Collection<String> values, int limit) {
                return findManyByCondition(DDocSegment.D_DOC_SEGMENT.CREATED_BY.in(values),limit);
        }

        /**
     * Find records that have <code>UPDATED_AT IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.integration.domain.tables.pojos.DDocSegment>> findManyByUpdatedAt(Collection<LocalDateTime> values) {
                return findManyByCondition(DDocSegment.D_DOC_SEGMENT.UPDATED_AT.in(values));
        }

        /**
     * Find records that have <code>UPDATED_AT IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.integration.domain.tables.pojos.DDocSegment>> findManyByUpdatedAt(Collection<LocalDateTime> values, int limit) {
                return findManyByCondition(DDocSegment.D_DOC_SEGMENT.UPDATED_AT.in(values),limit);
        }

        /**
     * Find records that have <code>UPDATED_BY IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.integration.domain.tables.pojos.DDocSegment>> findManyByUpdatedBy(Collection<String> values) {
                return findManyByCondition(DDocSegment.D_DOC_SEGMENT.UPDATED_BY.in(values));
        }

        /**
     * Find records that have <code>UPDATED_BY IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.integration.domain.tables.pojos.DDocSegment>> findManyByUpdatedBy(Collection<String> values, int limit) {
                return findManyByCondition(DDocSegment.D_DOC_SEGMENT.UPDATED_BY.in(values),limit);
        }

        @Override
        public JDBCClassicQueryExecutor<DDocSegmentRecord,cn.vertxup.integration.domain.tables.pojos.DDocSegment,String> queryExecutor(){
                return (JDBCClassicQueryExecutor<DDocSegmentRecord,cn.vertxup.integration.domain.tables.pojos.DDocSegment,String>) super.queryExecutor();
        }
}