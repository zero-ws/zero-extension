/*
 * This file is generated by jOOQ.
 */
package io.zerows.extension.runtime.ambient.domain.tables.daos;


import io.github.jklingsporn.vertx.jooq.shared.internal.AbstractVertxDAO;
import io.zerows.extension.runtime.ambient.domain.tables.XMenu;
import io.zerows.extension.runtime.ambient.domain.tables.records.XMenuRecord;

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
public class XMenuDao extends AbstractVertxDAO<XMenuRecord, io.zerows.extension.runtime.ambient.domain.tables.pojos.XMenu, String, Future<List<io.zerows.extension.runtime.ambient.domain.tables.pojos.XMenu>>, Future<io.zerows.extension.runtime.ambient.domain.tables.pojos.XMenu>, Future<Integer>, Future<String>> implements io.github.jklingsporn.vertx.jooq.classic.VertxDAO<XMenuRecord,io.zerows.extension.runtime.ambient.domain.tables.pojos.XMenu,String> {

        /**
     * @param configuration The Configuration used for rendering and query
     * execution.
     * @param vertx the vertx instance
     */
        public XMenuDao(Configuration configuration, io.vertx.core.Vertx vertx) {
                super(XMenu.X_MENU, io.zerows.extension.runtime.ambient.domain.tables.pojos.XMenu.class, new JDBCClassicQueryExecutor<XMenuRecord,io.zerows.extension.runtime.ambient.domain.tables.pojos.XMenu,String>(configuration,io.zerows.extension.runtime.ambient.domain.tables.pojos.XMenu.class,vertx));
        }

        @Override
        protected String getId(io.zerows.extension.runtime.ambient.domain.tables.pojos.XMenu object) {
                return object.getKey();
        }

        /**
     * Find records that have <code>NAME IN (values)</code> asynchronously
     */
        public Future<List<io.zerows.extension.runtime.ambient.domain.tables.pojos.XMenu>> findManyByName(Collection<String> values) {
                return findManyByCondition(XMenu.X_MENU.NAME.in(values));
        }

        /**
     * Find records that have <code>NAME IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<io.zerows.extension.runtime.ambient.domain.tables.pojos.XMenu>> findManyByName(Collection<String> values, int limit) {
                return findManyByCondition(XMenu.X_MENU.NAME.in(values),limit);
        }

        /**
     * Find records that have <code>ICON IN (values)</code> asynchronously
     */
        public Future<List<io.zerows.extension.runtime.ambient.domain.tables.pojos.XMenu>> findManyByIcon(Collection<String> values) {
                return findManyByCondition(XMenu.X_MENU.ICON.in(values));
        }

        /**
     * Find records that have <code>ICON IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<io.zerows.extension.runtime.ambient.domain.tables.pojos.XMenu>> findManyByIcon(Collection<String> values, int limit) {
                return findManyByCondition(XMenu.X_MENU.ICON.in(values),limit);
        }

        /**
     * Find records that have <code>TEXT IN (values)</code> asynchronously
     */
        public Future<List<io.zerows.extension.runtime.ambient.domain.tables.pojos.XMenu>> findManyByText(Collection<String> values) {
                return findManyByCondition(XMenu.X_MENU.TEXT.in(values));
        }

        /**
     * Find records that have <code>TEXT IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<io.zerows.extension.runtime.ambient.domain.tables.pojos.XMenu>> findManyByText(Collection<String> values, int limit) {
                return findManyByCondition(XMenu.X_MENU.TEXT.in(values),limit);
        }

        /**
     * Find records that have <code>URI IN (values)</code> asynchronously
     */
        public Future<List<io.zerows.extension.runtime.ambient.domain.tables.pojos.XMenu>> findManyByUri(Collection<String> values) {
                return findManyByCondition(XMenu.X_MENU.URI.in(values));
        }

        /**
     * Find records that have <code>URI IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<io.zerows.extension.runtime.ambient.domain.tables.pojos.XMenu>> findManyByUri(Collection<String> values, int limit) {
                return findManyByCondition(XMenu.X_MENU.URI.in(values),limit);
        }

        /**
     * Find records that have <code>TYPE IN (values)</code> asynchronously
     */
        public Future<List<io.zerows.extension.runtime.ambient.domain.tables.pojos.XMenu>> findManyByType(Collection<String> values) {
                return findManyByCondition(XMenu.X_MENU.TYPE.in(values));
        }

        /**
     * Find records that have <code>TYPE IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<io.zerows.extension.runtime.ambient.domain.tables.pojos.XMenu>> findManyByType(Collection<String> values, int limit) {
                return findManyByCondition(XMenu.X_MENU.TYPE.in(values),limit);
        }

        /**
     * Find records that have <code>ORDER IN (values)</code> asynchronously
     */
        public Future<List<io.zerows.extension.runtime.ambient.domain.tables.pojos.XMenu>> findManyByOrder(Collection<Long> values) {
                return findManyByCondition(XMenu.X_MENU.ORDER.in(values));
        }

        /**
     * Find records that have <code>ORDER IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<io.zerows.extension.runtime.ambient.domain.tables.pojos.XMenu>> findManyByOrder(Collection<Long> values, int limit) {
                return findManyByCondition(XMenu.X_MENU.ORDER.in(values),limit);
        }

        /**
     * Find records that have <code>LEVEL IN (values)</code> asynchronously
     */
        public Future<List<io.zerows.extension.runtime.ambient.domain.tables.pojos.XMenu>> findManyByLevel(Collection<Long> values) {
                return findManyByCondition(XMenu.X_MENU.LEVEL.in(values));
        }

        /**
     * Find records that have <code>LEVEL IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<io.zerows.extension.runtime.ambient.domain.tables.pojos.XMenu>> findManyByLevel(Collection<Long> values, int limit) {
                return findManyByCondition(XMenu.X_MENU.LEVEL.in(values),limit);
        }

        /**
     * Find records that have <code>PARENT_ID IN (values)</code> asynchronously
     */
        public Future<List<io.zerows.extension.runtime.ambient.domain.tables.pojos.XMenu>> findManyByParentId(Collection<String> values) {
                return findManyByCondition(XMenu.X_MENU.PARENT_ID.in(values));
        }

        /**
     * Find records that have <code>PARENT_ID IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<io.zerows.extension.runtime.ambient.domain.tables.pojos.XMenu>> findManyByParentId(Collection<String> values, int limit) {
                return findManyByCondition(XMenu.X_MENU.PARENT_ID.in(values),limit);
        }

        /**
     * Find records that have <code>APP_ID IN (values)</code> asynchronously
     */
        public Future<List<io.zerows.extension.runtime.ambient.domain.tables.pojos.XMenu>> findManyByAppId(Collection<String> values) {
                return findManyByCondition(XMenu.X_MENU.APP_ID.in(values));
        }

        /**
     * Find records that have <code>APP_ID IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<io.zerows.extension.runtime.ambient.domain.tables.pojos.XMenu>> findManyByAppId(Collection<String> values, int limit) {
                return findManyByCondition(XMenu.X_MENU.APP_ID.in(values),limit);
        }

        /**
     * Find records that have <code>ACTIVE IN (values)</code> asynchronously
     */
        public Future<List<io.zerows.extension.runtime.ambient.domain.tables.pojos.XMenu>> findManyByActive(Collection<Boolean> values) {
                return findManyByCondition(XMenu.X_MENU.ACTIVE.in(values));
        }

        /**
     * Find records that have <code>ACTIVE IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<io.zerows.extension.runtime.ambient.domain.tables.pojos.XMenu>> findManyByActive(Collection<Boolean> values, int limit) {
                return findManyByCondition(XMenu.X_MENU.ACTIVE.in(values),limit);
        }

        /**
     * Find records that have <code>SIGMA IN (values)</code> asynchronously
     */
        public Future<List<io.zerows.extension.runtime.ambient.domain.tables.pojos.XMenu>> findManyBySigma(Collection<String> values) {
                return findManyByCondition(XMenu.X_MENU.SIGMA.in(values));
        }

        /**
     * Find records that have <code>SIGMA IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<io.zerows.extension.runtime.ambient.domain.tables.pojos.XMenu>> findManyBySigma(Collection<String> values, int limit) {
                return findManyByCondition(XMenu.X_MENU.SIGMA.in(values),limit);
        }

        /**
     * Find records that have <code>METADATA IN (values)</code> asynchronously
     */
        public Future<List<io.zerows.extension.runtime.ambient.domain.tables.pojos.XMenu>> findManyByMetadata(Collection<String> values) {
                return findManyByCondition(XMenu.X_MENU.METADATA.in(values));
        }

        /**
     * Find records that have <code>METADATA IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<io.zerows.extension.runtime.ambient.domain.tables.pojos.XMenu>> findManyByMetadata(Collection<String> values, int limit) {
                return findManyByCondition(XMenu.X_MENU.METADATA.in(values),limit);
        }

        /**
     * Find records that have <code>LANGUAGE IN (values)</code> asynchronously
     */
        public Future<List<io.zerows.extension.runtime.ambient.domain.tables.pojos.XMenu>> findManyByLanguage(Collection<String> values) {
                return findManyByCondition(XMenu.X_MENU.LANGUAGE.in(values));
        }

        /**
     * Find records that have <code>LANGUAGE IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<io.zerows.extension.runtime.ambient.domain.tables.pojos.XMenu>> findManyByLanguage(Collection<String> values, int limit) {
                return findManyByCondition(XMenu.X_MENU.LANGUAGE.in(values),limit);
        }

        /**
     * Find records that have <code>CREATED_AT IN (values)</code> asynchronously
     */
        public Future<List<io.zerows.extension.runtime.ambient.domain.tables.pojos.XMenu>> findManyByCreatedAt(Collection<LocalDateTime> values) {
                return findManyByCondition(XMenu.X_MENU.CREATED_AT.in(values));
        }

        /**
     * Find records that have <code>CREATED_AT IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<io.zerows.extension.runtime.ambient.domain.tables.pojos.XMenu>> findManyByCreatedAt(Collection<LocalDateTime> values, int limit) {
                return findManyByCondition(XMenu.X_MENU.CREATED_AT.in(values),limit);
        }

        /**
     * Find records that have <code>CREATED_BY IN (values)</code> asynchronously
     */
        public Future<List<io.zerows.extension.runtime.ambient.domain.tables.pojos.XMenu>> findManyByCreatedBy(Collection<String> values) {
                return findManyByCondition(XMenu.X_MENU.CREATED_BY.in(values));
        }

        /**
     * Find records that have <code>CREATED_BY IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<io.zerows.extension.runtime.ambient.domain.tables.pojos.XMenu>> findManyByCreatedBy(Collection<String> values, int limit) {
                return findManyByCondition(XMenu.X_MENU.CREATED_BY.in(values),limit);
        }

        /**
     * Find records that have <code>UPDATED_AT IN (values)</code> asynchronously
     */
        public Future<List<io.zerows.extension.runtime.ambient.domain.tables.pojos.XMenu>> findManyByUpdatedAt(Collection<LocalDateTime> values) {
                return findManyByCondition(XMenu.X_MENU.UPDATED_AT.in(values));
        }

        /**
     * Find records that have <code>UPDATED_AT IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<io.zerows.extension.runtime.ambient.domain.tables.pojos.XMenu>> findManyByUpdatedAt(Collection<LocalDateTime> values, int limit) {
                return findManyByCondition(XMenu.X_MENU.UPDATED_AT.in(values),limit);
        }

        /**
     * Find records that have <code>UPDATED_BY IN (values)</code> asynchronously
     */
        public Future<List<io.zerows.extension.runtime.ambient.domain.tables.pojos.XMenu>> findManyByUpdatedBy(Collection<String> values) {
                return findManyByCondition(XMenu.X_MENU.UPDATED_BY.in(values));
        }

        /**
     * Find records that have <code>UPDATED_BY IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<io.zerows.extension.runtime.ambient.domain.tables.pojos.XMenu>> findManyByUpdatedBy(Collection<String> values, int limit) {
                return findManyByCondition(XMenu.X_MENU.UPDATED_BY.in(values),limit);
        }

        @Override
        public JDBCClassicQueryExecutor<XMenuRecord,io.zerows.extension.runtime.ambient.domain.tables.pojos.XMenu,String> queryExecutor(){
                return (JDBCClassicQueryExecutor<XMenuRecord,io.zerows.extension.runtime.ambient.domain.tables.pojos.XMenu,String>) super.queryExecutor();
        }
}
