/*
 * This file is generated by jOOQ.
 */
package io.zerows.extension.commerce.rbac.domain.tables.daos;


import io.github.jklingsporn.vertx.jooq.shared.internal.AbstractVertxDAO;
import io.zerows.extension.commerce.rbac.domain.tables.SView;
import io.zerows.extension.commerce.rbac.domain.tables.records.SViewRecord;

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
public class SViewDao extends AbstractVertxDAO<SViewRecord, io.zerows.extension.commerce.rbac.domain.tables.pojos.SView, String, Future<List<io.zerows.extension.commerce.rbac.domain.tables.pojos.SView>>, Future<io.zerows.extension.commerce.rbac.domain.tables.pojos.SView>, Future<Integer>, Future<String>> implements io.github.jklingsporn.vertx.jooq.classic.VertxDAO<SViewRecord,io.zerows.extension.commerce.rbac.domain.tables.pojos.SView,String> {

        /**
     * @param configuration The Configuration used for rendering and query
     * execution.
     * @param vertx the vertx instance
     */
        public SViewDao(Configuration configuration, io.vertx.core.Vertx vertx) {
                super(SView.S_VIEW, io.zerows.extension.commerce.rbac.domain.tables.pojos.SView.class, new JDBCClassicQueryExecutor<SViewRecord,io.zerows.extension.commerce.rbac.domain.tables.pojos.SView,String>(configuration,io.zerows.extension.commerce.rbac.domain.tables.pojos.SView.class,vertx));
        }

        @Override
        protected String getId(io.zerows.extension.commerce.rbac.domain.tables.pojos.SView object) {
                return object.getKey();
        }

        /**
     * Find records that have <code>NAME IN (values)</code> asynchronously
     */
        public Future<List<io.zerows.extension.commerce.rbac.domain.tables.pojos.SView>> findManyByName(Collection<String> values) {
                return findManyByCondition(SView.S_VIEW.NAME.in(values));
        }

        /**
     * Find records that have <code>NAME IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<io.zerows.extension.commerce.rbac.domain.tables.pojos.SView>> findManyByName(Collection<String> values, int limit) {
                return findManyByCondition(SView.S_VIEW.NAME.in(values),limit);
        }

        /**
     * Find records that have <code>TITLE IN (values)</code> asynchronously
     */
        public Future<List<io.zerows.extension.commerce.rbac.domain.tables.pojos.SView>> findManyByTitle(Collection<String> values) {
                return findManyByCondition(SView.S_VIEW.TITLE.in(values));
        }

        /**
     * Find records that have <code>TITLE IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<io.zerows.extension.commerce.rbac.domain.tables.pojos.SView>> findManyByTitle(Collection<String> values, int limit) {
                return findManyByCondition(SView.S_VIEW.TITLE.in(values),limit);
        }

        /**
     * Find records that have <code>OWNER IN (values)</code> asynchronously
     */
        public Future<List<io.zerows.extension.commerce.rbac.domain.tables.pojos.SView>> findManyByOwner(Collection<String> values) {
                return findManyByCondition(SView.S_VIEW.OWNER.in(values));
        }

        /**
     * Find records that have <code>OWNER IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<io.zerows.extension.commerce.rbac.domain.tables.pojos.SView>> findManyByOwner(Collection<String> values, int limit) {
                return findManyByCondition(SView.S_VIEW.OWNER.in(values),limit);
        }

        /**
     * Find records that have <code>OWNER_TYPE IN (values)</code> asynchronously
     */
        public Future<List<io.zerows.extension.commerce.rbac.domain.tables.pojos.SView>> findManyByOwnerType(Collection<String> values) {
                return findManyByCondition(SView.S_VIEW.OWNER_TYPE.in(values));
        }

        /**
     * Find records that have <code>OWNER_TYPE IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<io.zerows.extension.commerce.rbac.domain.tables.pojos.SView>> findManyByOwnerType(Collection<String> values, int limit) {
                return findManyByCondition(SView.S_VIEW.OWNER_TYPE.in(values),limit);
        }

        /**
     * Find records that have <code>RESOURCE_ID IN (values)</code>
     * asynchronously
     */
        public Future<List<io.zerows.extension.commerce.rbac.domain.tables.pojos.SView>> findManyByResourceId(Collection<String> values) {
                return findManyByCondition(SView.S_VIEW.RESOURCE_ID.in(values));
        }

        /**
     * Find records that have <code>RESOURCE_ID IN (values)</code>
     * asynchronously limited by the given limit
     */
        public Future<List<io.zerows.extension.commerce.rbac.domain.tables.pojos.SView>> findManyByResourceId(Collection<String> values, int limit) {
                return findManyByCondition(SView.S_VIEW.RESOURCE_ID.in(values),limit);
        }

        /**
     * Find records that have <code>PROJECTION IN (values)</code> asynchronously
     */
        public Future<List<io.zerows.extension.commerce.rbac.domain.tables.pojos.SView>> findManyByProjection(Collection<String> values) {
                return findManyByCondition(SView.S_VIEW.PROJECTION.in(values));
        }

        /**
     * Find records that have <code>PROJECTION IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<io.zerows.extension.commerce.rbac.domain.tables.pojos.SView>> findManyByProjection(Collection<String> values, int limit) {
                return findManyByCondition(SView.S_VIEW.PROJECTION.in(values),limit);
        }

        /**
     * Find records that have <code>CRITERIA IN (values)</code> asynchronously
     */
        public Future<List<io.zerows.extension.commerce.rbac.domain.tables.pojos.SView>> findManyByCriteria(Collection<String> values) {
                return findManyByCondition(SView.S_VIEW.CRITERIA.in(values));
        }

        /**
     * Find records that have <code>CRITERIA IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<io.zerows.extension.commerce.rbac.domain.tables.pojos.SView>> findManyByCriteria(Collection<String> values, int limit) {
                return findManyByCondition(SView.S_VIEW.CRITERIA.in(values),limit);
        }

        /**
     * Find records that have <code>ROWS IN (values)</code> asynchronously
     */
        public Future<List<io.zerows.extension.commerce.rbac.domain.tables.pojos.SView>> findManyByRows(Collection<String> values) {
                return findManyByCondition(SView.S_VIEW.ROWS.in(values));
        }

        /**
     * Find records that have <code>ROWS IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<io.zerows.extension.commerce.rbac.domain.tables.pojos.SView>> findManyByRows(Collection<String> values, int limit) {
                return findManyByCondition(SView.S_VIEW.ROWS.in(values),limit);
        }

        /**
     * Find records that have <code>POSITION IN (values)</code> asynchronously
     */
        public Future<List<io.zerows.extension.commerce.rbac.domain.tables.pojos.SView>> findManyByPosition(Collection<String> values) {
                return findManyByCondition(SView.S_VIEW.POSITION.in(values));
        }

        /**
     * Find records that have <code>POSITION IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<io.zerows.extension.commerce.rbac.domain.tables.pojos.SView>> findManyByPosition(Collection<String> values, int limit) {
                return findManyByCondition(SView.S_VIEW.POSITION.in(values),limit);
        }

        /**
     * Find records that have <code>VISITANT IN (values)</code> asynchronously
     */
        public Future<List<io.zerows.extension.commerce.rbac.domain.tables.pojos.SView>> findManyByVisitant(Collection<Boolean> values) {
                return findManyByCondition(SView.S_VIEW.VISITANT.in(values));
        }

        /**
     * Find records that have <code>VISITANT IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<io.zerows.extension.commerce.rbac.domain.tables.pojos.SView>> findManyByVisitant(Collection<Boolean> values, int limit) {
                return findManyByCondition(SView.S_VIEW.VISITANT.in(values),limit);
        }

        /**
     * Find records that have <code>SIGMA IN (values)</code> asynchronously
     */
        public Future<List<io.zerows.extension.commerce.rbac.domain.tables.pojos.SView>> findManyBySigma(Collection<String> values) {
                return findManyByCondition(SView.S_VIEW.SIGMA.in(values));
        }

        /**
     * Find records that have <code>SIGMA IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<io.zerows.extension.commerce.rbac.domain.tables.pojos.SView>> findManyBySigma(Collection<String> values, int limit) {
                return findManyByCondition(SView.S_VIEW.SIGMA.in(values),limit);
        }

        /**
     * Find records that have <code>LANGUAGE IN (values)</code> asynchronously
     */
        public Future<List<io.zerows.extension.commerce.rbac.domain.tables.pojos.SView>> findManyByLanguage(Collection<String> values) {
                return findManyByCondition(SView.S_VIEW.LANGUAGE.in(values));
        }

        /**
     * Find records that have <code>LANGUAGE IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<io.zerows.extension.commerce.rbac.domain.tables.pojos.SView>> findManyByLanguage(Collection<String> values, int limit) {
                return findManyByCondition(SView.S_VIEW.LANGUAGE.in(values),limit);
        }

        /**
     * Find records that have <code>ACTIVE IN (values)</code> asynchronously
     */
        public Future<List<io.zerows.extension.commerce.rbac.domain.tables.pojos.SView>> findManyByActive(Collection<Boolean> values) {
                return findManyByCondition(SView.S_VIEW.ACTIVE.in(values));
        }

        /**
     * Find records that have <code>ACTIVE IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<io.zerows.extension.commerce.rbac.domain.tables.pojos.SView>> findManyByActive(Collection<Boolean> values, int limit) {
                return findManyByCondition(SView.S_VIEW.ACTIVE.in(values),limit);
        }

        /**
     * Find records that have <code>METADATA IN (values)</code> asynchronously
     */
        public Future<List<io.zerows.extension.commerce.rbac.domain.tables.pojos.SView>> findManyByMetadata(Collection<String> values) {
                return findManyByCondition(SView.S_VIEW.METADATA.in(values));
        }

        /**
     * Find records that have <code>METADATA IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<io.zerows.extension.commerce.rbac.domain.tables.pojos.SView>> findManyByMetadata(Collection<String> values, int limit) {
                return findManyByCondition(SView.S_VIEW.METADATA.in(values),limit);
        }

        /**
     * Find records that have <code>CREATED_AT IN (values)</code> asynchronously
     */
        public Future<List<io.zerows.extension.commerce.rbac.domain.tables.pojos.SView>> findManyByCreatedAt(Collection<LocalDateTime> values) {
                return findManyByCondition(SView.S_VIEW.CREATED_AT.in(values));
        }

        /**
     * Find records that have <code>CREATED_AT IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<io.zerows.extension.commerce.rbac.domain.tables.pojos.SView>> findManyByCreatedAt(Collection<LocalDateTime> values, int limit) {
                return findManyByCondition(SView.S_VIEW.CREATED_AT.in(values),limit);
        }

        /**
     * Find records that have <code>CREATED_BY IN (values)</code> asynchronously
     */
        public Future<List<io.zerows.extension.commerce.rbac.domain.tables.pojos.SView>> findManyByCreatedBy(Collection<String> values) {
                return findManyByCondition(SView.S_VIEW.CREATED_BY.in(values));
        }

        /**
     * Find records that have <code>CREATED_BY IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<io.zerows.extension.commerce.rbac.domain.tables.pojos.SView>> findManyByCreatedBy(Collection<String> values, int limit) {
                return findManyByCondition(SView.S_VIEW.CREATED_BY.in(values),limit);
        }

        /**
     * Find records that have <code>UPDATED_AT IN (values)</code> asynchronously
     */
        public Future<List<io.zerows.extension.commerce.rbac.domain.tables.pojos.SView>> findManyByUpdatedAt(Collection<LocalDateTime> values) {
                return findManyByCondition(SView.S_VIEW.UPDATED_AT.in(values));
        }

        /**
     * Find records that have <code>UPDATED_AT IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<io.zerows.extension.commerce.rbac.domain.tables.pojos.SView>> findManyByUpdatedAt(Collection<LocalDateTime> values, int limit) {
                return findManyByCondition(SView.S_VIEW.UPDATED_AT.in(values),limit);
        }

        /**
     * Find records that have <code>UPDATED_BY IN (values)</code> asynchronously
     */
        public Future<List<io.zerows.extension.commerce.rbac.domain.tables.pojos.SView>> findManyByUpdatedBy(Collection<String> values) {
                return findManyByCondition(SView.S_VIEW.UPDATED_BY.in(values));
        }

        /**
     * Find records that have <code>UPDATED_BY IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<io.zerows.extension.commerce.rbac.domain.tables.pojos.SView>> findManyByUpdatedBy(Collection<String> values, int limit) {
                return findManyByCondition(SView.S_VIEW.UPDATED_BY.in(values),limit);
        }

        @Override
        public JDBCClassicQueryExecutor<SViewRecord,io.zerows.extension.commerce.rbac.domain.tables.pojos.SView,String> queryExecutor(){
                return (JDBCClassicQueryExecutor<SViewRecord,io.zerows.extension.commerce.rbac.domain.tables.pojos.SView,String>) super.queryExecutor();
        }
}
