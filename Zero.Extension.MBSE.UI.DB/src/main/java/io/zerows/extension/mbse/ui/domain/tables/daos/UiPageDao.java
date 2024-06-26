/*
 * This file is generated by jOOQ.
 */
package io.zerows.extension.mbse.ui.domain.tables.daos;


import io.github.jklingsporn.vertx.jooq.classic.jdbc.JDBCClassicQueryExecutor;
import io.github.jklingsporn.vertx.jooq.shared.internal.AbstractVertxDAO;
import io.vertx.core.Future;
import io.zerows.extension.mbse.ui.domain.tables.UiPage;
import io.zerows.extension.mbse.ui.domain.tables.records.UiPageRecord;
import org.jooq.Configuration;

import java.time.LocalDateTime;
import java.util.Collection;
import java.util.List;

/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({"all", "unchecked", "rawtypes"})
public class UiPageDao extends AbstractVertxDAO<UiPageRecord, io.zerows.extension.mbse.ui.domain.tables.pojos.UiPage, String, Future<List<io.zerows.extension.mbse.ui.domain.tables.pojos.UiPage>>, Future<io.zerows.extension.mbse.ui.domain.tables.pojos.UiPage>, Future<Integer>, Future<String>> implements io.github.jklingsporn.vertx.jooq.classic.VertxDAO<UiPageRecord, io.zerows.extension.mbse.ui.domain.tables.pojos.UiPage, String> {

    /**
     * @param configuration The Configuration used for rendering and query
     *                      execution.
     * @param vertx         the vertx instance
     */
    public UiPageDao(Configuration configuration, io.vertx.core.Vertx vertx) {
        super(UiPage.UI_PAGE, io.zerows.extension.mbse.ui.domain.tables.pojos.UiPage.class, new JDBCClassicQueryExecutor<UiPageRecord, io.zerows.extension.mbse.ui.domain.tables.pojos.UiPage, String>(configuration, io.zerows.extension.mbse.ui.domain.tables.pojos.UiPage.class, vertx));
    }

    @Override
    protected String getId(io.zerows.extension.mbse.ui.domain.tables.pojos.UiPage object) {
        return object.getKey();
    }

    /**
     * Find records that have <code>APP IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.mbse.ui.domain.tables.pojos.UiPage>> findManyByApp(Collection<String> values) {
        return findManyByCondition(UiPage.UI_PAGE.APP.in(values));
    }

    /**
     * Find records that have <code>APP IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.mbse.ui.domain.tables.pojos.UiPage>> findManyByApp(Collection<String> values, int limit) {
        return findManyByCondition(UiPage.UI_PAGE.APP.in(values), limit);
    }

    /**
     * Find records that have <code>MODULE IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.mbse.ui.domain.tables.pojos.UiPage>> findManyByModule(Collection<String> values) {
        return findManyByCondition(UiPage.UI_PAGE.MODULE.in(values));
    }

    /**
     * Find records that have <code>MODULE IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.mbse.ui.domain.tables.pojos.UiPage>> findManyByModule(Collection<String> values, int limit) {
        return findManyByCondition(UiPage.UI_PAGE.MODULE.in(values), limit);
    }

    /**
     * Find records that have <code>PAGE IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.mbse.ui.domain.tables.pojos.UiPage>> findManyByPage(Collection<String> values) {
        return findManyByCondition(UiPage.UI_PAGE.PAGE.in(values));
    }

    /**
     * Find records that have <code>PAGE IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.mbse.ui.domain.tables.pojos.UiPage>> findManyByPage(Collection<String> values, int limit) {
        return findManyByCondition(UiPage.UI_PAGE.PAGE.in(values), limit);
    }

    /**
     * Find records that have <code>LAYOUT_ID IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.mbse.ui.domain.tables.pojos.UiPage>> findManyByLayoutId(Collection<String> values) {
        return findManyByCondition(UiPage.UI_PAGE.LAYOUT_ID.in(values));
    }

    /**
     * Find records that have <code>LAYOUT_ID IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.mbse.ui.domain.tables.pojos.UiPage>> findManyByLayoutId(Collection<String> values, int limit) {
        return findManyByCondition(UiPage.UI_PAGE.LAYOUT_ID.in(values), limit);
    }

    /**
     * Find records that have <code>SECURE IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.mbse.ui.domain.tables.pojos.UiPage>> findManyBySecure(Collection<Boolean> values) {
        return findManyByCondition(UiPage.UI_PAGE.SECURE.in(values));
    }

    /**
     * Find records that have <code>SECURE IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.mbse.ui.domain.tables.pojos.UiPage>> findManyBySecure(Collection<Boolean> values, int limit) {
        return findManyByCondition(UiPage.UI_PAGE.SECURE.in(values), limit);
    }

    /**
     * Find records that have <code>PARAM_MAP IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.mbse.ui.domain.tables.pojos.UiPage>> findManyByParamMap(Collection<String> values) {
        return findManyByCondition(UiPage.UI_PAGE.PARAM_MAP.in(values));
    }

    /**
     * Find records that have <code>PARAM_MAP IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.mbse.ui.domain.tables.pojos.UiPage>> findManyByParamMap(Collection<String> values, int limit) {
        return findManyByCondition(UiPage.UI_PAGE.PARAM_MAP.in(values), limit);
    }

    /**
     * Find records that have <code>CONTAINER_NAME IN (values)</code>
     * asynchronously
     */
    public Future<List<io.zerows.extension.mbse.ui.domain.tables.pojos.UiPage>> findManyByContainerName(Collection<String> values) {
        return findManyByCondition(UiPage.UI_PAGE.CONTAINER_NAME.in(values));
    }

    /**
     * Find records that have <code>CONTAINER_NAME IN (values)</code>
     * asynchronously limited by the given limit
     */
    public Future<List<io.zerows.extension.mbse.ui.domain.tables.pojos.UiPage>> findManyByContainerName(Collection<String> values, int limit) {
        return findManyByCondition(UiPage.UI_PAGE.CONTAINER_NAME.in(values), limit);
    }

    /**
     * Find records that have <code>CONTAINER_CONFIG IN (values)</code>
     * asynchronously
     */
    public Future<List<io.zerows.extension.mbse.ui.domain.tables.pojos.UiPage>> findManyByContainerConfig(Collection<String> values) {
        return findManyByCondition(UiPage.UI_PAGE.CONTAINER_CONFIG.in(values));
    }

    /**
     * Find records that have <code>CONTAINER_CONFIG IN (values)</code>
     * asynchronously limited by the given limit
     */
    public Future<List<io.zerows.extension.mbse.ui.domain.tables.pojos.UiPage>> findManyByContainerConfig(Collection<String> values, int limit) {
        return findManyByCondition(UiPage.UI_PAGE.CONTAINER_CONFIG.in(values), limit);
    }

    /**
     * Find records that have <code>STATE IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.mbse.ui.domain.tables.pojos.UiPage>> findManyByState(Collection<String> values) {
        return findManyByCondition(UiPage.UI_PAGE.STATE.in(values));
    }

    /**
     * Find records that have <code>STATE IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.mbse.ui.domain.tables.pojos.UiPage>> findManyByState(Collection<String> values, int limit) {
        return findManyByCondition(UiPage.UI_PAGE.STATE.in(values), limit);
    }

    /**
     * Find records that have <code>GRID IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.mbse.ui.domain.tables.pojos.UiPage>> findManyByGrid(Collection<String> values) {
        return findManyByCondition(UiPage.UI_PAGE.GRID.in(values));
    }

    /**
     * Find records that have <code>GRID IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.mbse.ui.domain.tables.pojos.UiPage>> findManyByGrid(Collection<String> values, int limit) {
        return findManyByCondition(UiPage.UI_PAGE.GRID.in(values), limit);
    }

    /**
     * Find records that have <code>ASSIST IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.mbse.ui.domain.tables.pojos.UiPage>> findManyByAssist(Collection<String> values) {
        return findManyByCondition(UiPage.UI_PAGE.ASSIST.in(values));
    }

    /**
     * Find records that have <code>ASSIST IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.mbse.ui.domain.tables.pojos.UiPage>> findManyByAssist(Collection<String> values, int limit) {
        return findManyByCondition(UiPage.UI_PAGE.ASSIST.in(values), limit);
    }

    /**
     * Find records that have <code>ACTIVE IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.mbse.ui.domain.tables.pojos.UiPage>> findManyByActive(Collection<Boolean> values) {
        return findManyByCondition(UiPage.UI_PAGE.ACTIVE.in(values));
    }

    /**
     * Find records that have <code>ACTIVE IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.mbse.ui.domain.tables.pojos.UiPage>> findManyByActive(Collection<Boolean> values, int limit) {
        return findManyByCondition(UiPage.UI_PAGE.ACTIVE.in(values), limit);
    }

    /**
     * Find records that have <code>SIGMA IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.mbse.ui.domain.tables.pojos.UiPage>> findManyBySigma(Collection<String> values) {
        return findManyByCondition(UiPage.UI_PAGE.SIGMA.in(values));
    }

    /**
     * Find records that have <code>SIGMA IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.mbse.ui.domain.tables.pojos.UiPage>> findManyBySigma(Collection<String> values, int limit) {
        return findManyByCondition(UiPage.UI_PAGE.SIGMA.in(values), limit);
    }

    /**
     * Find records that have <code>METADATA IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.mbse.ui.domain.tables.pojos.UiPage>> findManyByMetadata(Collection<String> values) {
        return findManyByCondition(UiPage.UI_PAGE.METADATA.in(values));
    }

    /**
     * Find records that have <code>METADATA IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.mbse.ui.domain.tables.pojos.UiPage>> findManyByMetadata(Collection<String> values, int limit) {
        return findManyByCondition(UiPage.UI_PAGE.METADATA.in(values), limit);
    }

    /**
     * Find records that have <code>LANGUAGE IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.mbse.ui.domain.tables.pojos.UiPage>> findManyByLanguage(Collection<String> values) {
        return findManyByCondition(UiPage.UI_PAGE.LANGUAGE.in(values));
    }

    /**
     * Find records that have <code>LANGUAGE IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.mbse.ui.domain.tables.pojos.UiPage>> findManyByLanguage(Collection<String> values, int limit) {
        return findManyByCondition(UiPage.UI_PAGE.LANGUAGE.in(values), limit);
    }

    /**
     * Find records that have <code>CREATED_AT IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.mbse.ui.domain.tables.pojos.UiPage>> findManyByCreatedAt(Collection<LocalDateTime> values) {
        return findManyByCondition(UiPage.UI_PAGE.CREATED_AT.in(values));
    }

    /**
     * Find records that have <code>CREATED_AT IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.mbse.ui.domain.tables.pojos.UiPage>> findManyByCreatedAt(Collection<LocalDateTime> values, int limit) {
        return findManyByCondition(UiPage.UI_PAGE.CREATED_AT.in(values), limit);
    }

    /**
     * Find records that have <code>CREATED_BY IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.mbse.ui.domain.tables.pojos.UiPage>> findManyByCreatedBy(Collection<String> values) {
        return findManyByCondition(UiPage.UI_PAGE.CREATED_BY.in(values));
    }

    /**
     * Find records that have <code>CREATED_BY IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.mbse.ui.domain.tables.pojos.UiPage>> findManyByCreatedBy(Collection<String> values, int limit) {
        return findManyByCondition(UiPage.UI_PAGE.CREATED_BY.in(values), limit);
    }

    /**
     * Find records that have <code>UPDATED_AT IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.mbse.ui.domain.tables.pojos.UiPage>> findManyByUpdatedAt(Collection<LocalDateTime> values) {
        return findManyByCondition(UiPage.UI_PAGE.UPDATED_AT.in(values));
    }

    /**
     * Find records that have <code>UPDATED_AT IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.mbse.ui.domain.tables.pojos.UiPage>> findManyByUpdatedAt(Collection<LocalDateTime> values, int limit) {
        return findManyByCondition(UiPage.UI_PAGE.UPDATED_AT.in(values), limit);
    }

    /**
     * Find records that have <code>UPDATED_BY IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.mbse.ui.domain.tables.pojos.UiPage>> findManyByUpdatedBy(Collection<String> values) {
        return findManyByCondition(UiPage.UI_PAGE.UPDATED_BY.in(values));
    }

    /**
     * Find records that have <code>UPDATED_BY IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.mbse.ui.domain.tables.pojos.UiPage>> findManyByUpdatedBy(Collection<String> values, int limit) {
        return findManyByCondition(UiPage.UI_PAGE.UPDATED_BY.in(values), limit);
    }

    @Override
    public JDBCClassicQueryExecutor<UiPageRecord, io.zerows.extension.mbse.ui.domain.tables.pojos.UiPage, String> queryExecutor() {
        return (JDBCClassicQueryExecutor<UiPageRecord, io.zerows.extension.mbse.ui.domain.tables.pojos.UiPage, String>) super.queryExecutor();
    }
}
