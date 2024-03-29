/*
 * This file is generated by jOOQ.
 */
package cn.vertxup.ui.domain.tables.daos;


import cn.vertxup.ui.domain.tables.UiControl;
import cn.vertxup.ui.domain.tables.records.UiControlRecord;

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
public class UiControlDao extends AbstractVertxDAO<UiControlRecord, cn.vertxup.ui.domain.tables.pojos.UiControl, String, Future<List<cn.vertxup.ui.domain.tables.pojos.UiControl>>, Future<cn.vertxup.ui.domain.tables.pojos.UiControl>, Future<Integer>, Future<String>> implements io.github.jklingsporn.vertx.jooq.classic.VertxDAO<UiControlRecord,cn.vertxup.ui.domain.tables.pojos.UiControl,String> {

        /**
     * @param configuration The Configuration used for rendering and query
     * execution.
     * @param vertx the vertx instance
     */
        public UiControlDao(Configuration configuration, io.vertx.core.Vertx vertx) {
                super(UiControl.UI_CONTROL, cn.vertxup.ui.domain.tables.pojos.UiControl.class, new JDBCClassicQueryExecutor<UiControlRecord,cn.vertxup.ui.domain.tables.pojos.UiControl,String>(configuration,cn.vertxup.ui.domain.tables.pojos.UiControl.class,vertx));
        }

        @Override
        protected String getId(cn.vertxup.ui.domain.tables.pojos.UiControl object) {
                return object.getKey();
        }

        /**
     * Find records that have <code>SIGN IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.ui.domain.tables.pojos.UiControl>> findManyBySign(Collection<String> values) {
                return findManyByCondition(UiControl.UI_CONTROL.SIGN.in(values));
        }

        /**
     * Find records that have <code>SIGN IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.ui.domain.tables.pojos.UiControl>> findManyBySign(Collection<String> values, int limit) {
                return findManyByCondition(UiControl.UI_CONTROL.SIGN.in(values),limit);
        }

        /**
     * Find records that have <code>PAGE_ID IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.ui.domain.tables.pojos.UiControl>> findManyByPageId(Collection<String> values) {
                return findManyByCondition(UiControl.UI_CONTROL.PAGE_ID.in(values));
        }

        /**
     * Find records that have <code>PAGE_ID IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.ui.domain.tables.pojos.UiControl>> findManyByPageId(Collection<String> values, int limit) {
                return findManyByCondition(UiControl.UI_CONTROL.PAGE_ID.in(values),limit);
        }

        /**
     * Find records that have <code>TYPE IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.ui.domain.tables.pojos.UiControl>> findManyByType(Collection<String> values) {
                return findManyByCondition(UiControl.UI_CONTROL.TYPE.in(values));
        }

        /**
     * Find records that have <code>TYPE IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.ui.domain.tables.pojos.UiControl>> findManyByType(Collection<String> values, int limit) {
                return findManyByCondition(UiControl.UI_CONTROL.TYPE.in(values),limit);
        }

        /**
     * Find records that have <code>CONTAINER_NAME IN (values)</code>
     * asynchronously
     */
        public Future<List<cn.vertxup.ui.domain.tables.pojos.UiControl>> findManyByContainerName(Collection<String> values) {
                return findManyByCondition(UiControl.UI_CONTROL.CONTAINER_NAME.in(values));
        }

        /**
     * Find records that have <code>CONTAINER_NAME IN (values)</code>
     * asynchronously limited by the given limit
     */
        public Future<List<cn.vertxup.ui.domain.tables.pojos.UiControl>> findManyByContainerName(Collection<String> values, int limit) {
                return findManyByCondition(UiControl.UI_CONTROL.CONTAINER_NAME.in(values),limit);
        }

        /**
     * Find records that have <code>CONTAINER_CONFIG IN (values)</code>
     * asynchronously
     */
        public Future<List<cn.vertxup.ui.domain.tables.pojos.UiControl>> findManyByContainerConfig(Collection<String> values) {
                return findManyByCondition(UiControl.UI_CONTROL.CONTAINER_CONFIG.in(values));
        }

        /**
     * Find records that have <code>CONTAINER_CONFIG IN (values)</code>
     * asynchronously limited by the given limit
     */
        public Future<List<cn.vertxup.ui.domain.tables.pojos.UiControl>> findManyByContainerConfig(Collection<String> values, int limit) {
                return findManyByCondition(UiControl.UI_CONTROL.CONTAINER_CONFIG.in(values),limit);
        }

        /**
     * Find records that have <code>ASSIST IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.ui.domain.tables.pojos.UiControl>> findManyByAssist(Collection<String> values) {
                return findManyByCondition(UiControl.UI_CONTROL.ASSIST.in(values));
        }

        /**
     * Find records that have <code>ASSIST IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.ui.domain.tables.pojos.UiControl>> findManyByAssist(Collection<String> values, int limit) {
                return findManyByCondition(UiControl.UI_CONTROL.ASSIST.in(values),limit);
        }

        /**
     * Find records that have <code>GRID IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.ui.domain.tables.pojos.UiControl>> findManyByGrid(Collection<String> values) {
                return findManyByCondition(UiControl.UI_CONTROL.GRID.in(values));
        }

        /**
     * Find records that have <code>GRID IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.ui.domain.tables.pojos.UiControl>> findManyByGrid(Collection<String> values, int limit) {
                return findManyByCondition(UiControl.UI_CONTROL.GRID.in(values),limit);
        }

        /**
     * Find records that have <code>COMPONENT_NAME IN (values)</code>
     * asynchronously
     */
        public Future<List<cn.vertxup.ui.domain.tables.pojos.UiControl>> findManyByComponentName(Collection<String> values) {
                return findManyByCondition(UiControl.UI_CONTROL.COMPONENT_NAME.in(values));
        }

        /**
     * Find records that have <code>COMPONENT_NAME IN (values)</code>
     * asynchronously limited by the given limit
     */
        public Future<List<cn.vertxup.ui.domain.tables.pojos.UiControl>> findManyByComponentName(Collection<String> values, int limit) {
                return findManyByCondition(UiControl.UI_CONTROL.COMPONENT_NAME.in(values),limit);
        }

        /**
     * Find records that have <code>COMPONENT_CONFIG IN (values)</code>
     * asynchronously
     */
        public Future<List<cn.vertxup.ui.domain.tables.pojos.UiControl>> findManyByComponentConfig(Collection<String> values) {
                return findManyByCondition(UiControl.UI_CONTROL.COMPONENT_CONFIG.in(values));
        }

        /**
     * Find records that have <code>COMPONENT_CONFIG IN (values)</code>
     * asynchronously limited by the given limit
     */
        public Future<List<cn.vertxup.ui.domain.tables.pojos.UiControl>> findManyByComponentConfig(Collection<String> values, int limit) {
                return findManyByCondition(UiControl.UI_CONTROL.COMPONENT_CONFIG.in(values),limit);
        }

        /**
     * Find records that have <code>COMPONENT_DATA IN (values)</code>
     * asynchronously
     */
        public Future<List<cn.vertxup.ui.domain.tables.pojos.UiControl>> findManyByComponentData(Collection<String> values) {
                return findManyByCondition(UiControl.UI_CONTROL.COMPONENT_DATA.in(values));
        }

        /**
     * Find records that have <code>COMPONENT_DATA IN (values)</code>
     * asynchronously limited by the given limit
     */
        public Future<List<cn.vertxup.ui.domain.tables.pojos.UiControl>> findManyByComponentData(Collection<String> values, int limit) {
                return findManyByCondition(UiControl.UI_CONTROL.COMPONENT_DATA.in(values),limit);
        }

        /**
     * Find records that have <code>ACTIVE IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.ui.domain.tables.pojos.UiControl>> findManyByActive(Collection<Boolean> values) {
                return findManyByCondition(UiControl.UI_CONTROL.ACTIVE.in(values));
        }

        /**
     * Find records that have <code>ACTIVE IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.ui.domain.tables.pojos.UiControl>> findManyByActive(Collection<Boolean> values, int limit) {
                return findManyByCondition(UiControl.UI_CONTROL.ACTIVE.in(values),limit);
        }

        /**
     * Find records that have <code>SIGMA IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.ui.domain.tables.pojos.UiControl>> findManyBySigma(Collection<String> values) {
                return findManyByCondition(UiControl.UI_CONTROL.SIGMA.in(values));
        }

        /**
     * Find records that have <code>SIGMA IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.ui.domain.tables.pojos.UiControl>> findManyBySigma(Collection<String> values, int limit) {
                return findManyByCondition(UiControl.UI_CONTROL.SIGMA.in(values),limit);
        }

        /**
     * Find records that have <code>METADATA IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.ui.domain.tables.pojos.UiControl>> findManyByMetadata(Collection<String> values) {
                return findManyByCondition(UiControl.UI_CONTROL.METADATA.in(values));
        }

        /**
     * Find records that have <code>METADATA IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.ui.domain.tables.pojos.UiControl>> findManyByMetadata(Collection<String> values, int limit) {
                return findManyByCondition(UiControl.UI_CONTROL.METADATA.in(values),limit);
        }

        /**
     * Find records that have <code>LANGUAGE IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.ui.domain.tables.pojos.UiControl>> findManyByLanguage(Collection<String> values) {
                return findManyByCondition(UiControl.UI_CONTROL.LANGUAGE.in(values));
        }

        /**
     * Find records that have <code>LANGUAGE IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.ui.domain.tables.pojos.UiControl>> findManyByLanguage(Collection<String> values, int limit) {
                return findManyByCondition(UiControl.UI_CONTROL.LANGUAGE.in(values),limit);
        }

        /**
     * Find records that have <code>CREATED_AT IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.ui.domain.tables.pojos.UiControl>> findManyByCreatedAt(Collection<LocalDateTime> values) {
                return findManyByCondition(UiControl.UI_CONTROL.CREATED_AT.in(values));
        }

        /**
     * Find records that have <code>CREATED_AT IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.ui.domain.tables.pojos.UiControl>> findManyByCreatedAt(Collection<LocalDateTime> values, int limit) {
                return findManyByCondition(UiControl.UI_CONTROL.CREATED_AT.in(values),limit);
        }

        /**
     * Find records that have <code>CREATED_BY IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.ui.domain.tables.pojos.UiControl>> findManyByCreatedBy(Collection<String> values) {
                return findManyByCondition(UiControl.UI_CONTROL.CREATED_BY.in(values));
        }

        /**
     * Find records that have <code>CREATED_BY IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.ui.domain.tables.pojos.UiControl>> findManyByCreatedBy(Collection<String> values, int limit) {
                return findManyByCondition(UiControl.UI_CONTROL.CREATED_BY.in(values),limit);
        }

        /**
     * Find records that have <code>UPDATED_AT IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.ui.domain.tables.pojos.UiControl>> findManyByUpdatedAt(Collection<LocalDateTime> values) {
                return findManyByCondition(UiControl.UI_CONTROL.UPDATED_AT.in(values));
        }

        /**
     * Find records that have <code>UPDATED_AT IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.ui.domain.tables.pojos.UiControl>> findManyByUpdatedAt(Collection<LocalDateTime> values, int limit) {
                return findManyByCondition(UiControl.UI_CONTROL.UPDATED_AT.in(values),limit);
        }

        /**
     * Find records that have <code>UPDATED_BY IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.ui.domain.tables.pojos.UiControl>> findManyByUpdatedBy(Collection<String> values) {
                return findManyByCondition(UiControl.UI_CONTROL.UPDATED_BY.in(values));
        }

        /**
     * Find records that have <code>UPDATED_BY IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.ui.domain.tables.pojos.UiControl>> findManyByUpdatedBy(Collection<String> values, int limit) {
                return findManyByCondition(UiControl.UI_CONTROL.UPDATED_BY.in(values),limit);
        }

        @Override
        public JDBCClassicQueryExecutor<UiControlRecord,cn.vertxup.ui.domain.tables.pojos.UiControl,String> queryExecutor(){
                return (JDBCClassicQueryExecutor<UiControlRecord,cn.vertxup.ui.domain.tables.pojos.UiControl,String>) super.queryExecutor();
        }
}
