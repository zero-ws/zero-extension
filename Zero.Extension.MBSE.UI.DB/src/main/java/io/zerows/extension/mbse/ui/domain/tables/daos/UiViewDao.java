/*
 * This file is generated by jOOQ.
 */
package io.zerows.extension.mbse.ui.domain.tables.daos;


import io.github.jklingsporn.vertx.jooq.classic.jdbc.JDBCClassicQueryExecutor;
import io.github.jklingsporn.vertx.jooq.shared.internal.AbstractVertxDAO;
import io.vertx.core.Future;
import io.zerows.extension.mbse.ui.domain.tables.UiView;
import io.zerows.extension.mbse.ui.domain.tables.records.UiViewRecord;
import org.jooq.Configuration;

import java.time.LocalDateTime;
import java.util.Collection;
import java.util.List;

/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({"all", "unchecked", "rawtypes"})
public class UiViewDao extends AbstractVertxDAO<UiViewRecord, io.zerows.extension.mbse.ui.domain.tables.pojos.UiView, String, Future<List<io.zerows.extension.mbse.ui.domain.tables.pojos.UiView>>, Future<io.zerows.extension.mbse.ui.domain.tables.pojos.UiView>, Future<Integer>, Future<String>> implements io.github.jklingsporn.vertx.jooq.classic.VertxDAO<UiViewRecord, io.zerows.extension.mbse.ui.domain.tables.pojos.UiView, String> {

    /**
     * @param configuration The Configuration used for rendering and query
     *                      execution.
     * @param vertx         the vertx instance
     */
    public UiViewDao(Configuration configuration, io.vertx.core.Vertx vertx) {
        super(UiView.UI_VIEW, io.zerows.extension.mbse.ui.domain.tables.pojos.UiView.class, new JDBCClassicQueryExecutor<UiViewRecord, io.zerows.extension.mbse.ui.domain.tables.pojos.UiView, String>(configuration, io.zerows.extension.mbse.ui.domain.tables.pojos.UiView.class, vertx));
    }

    @Override
    protected String getId(io.zerows.extension.mbse.ui.domain.tables.pojos.UiView object) {
        return object.getKey();
    }

    /**
     * Find records that have <code>NAME IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.mbse.ui.domain.tables.pojos.UiView>> findManyByName(Collection<String> values) {
        return findManyByCondition(UiView.UI_VIEW.NAME.in(values));
    }

    /**
     * Find records that have <code>NAME IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.mbse.ui.domain.tables.pojos.UiView>> findManyByName(Collection<String> values, int limit) {
        return findManyByCondition(UiView.UI_VIEW.NAME.in(values), limit);
    }

    /**
     * Find records that have <code>CODE IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.mbse.ui.domain.tables.pojos.UiView>> findManyByCode(Collection<String> values) {
        return findManyByCondition(UiView.UI_VIEW.CODE.in(values));
    }

    /**
     * Find records that have <code>CODE IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.mbse.ui.domain.tables.pojos.UiView>> findManyByCode(Collection<String> values, int limit) {
        return findManyByCondition(UiView.UI_VIEW.CODE.in(values), limit);
    }

    /**
     * Find records that have <code>SORT IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.mbse.ui.domain.tables.pojos.UiView>> findManyBySort(Collection<Integer> values) {
        return findManyByCondition(UiView.UI_VIEW.SORT.in(values));
    }

    /**
     * Find records that have <code>SORT IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.mbse.ui.domain.tables.pojos.UiView>> findManyBySort(Collection<Integer> values, int limit) {
        return findManyByCondition(UiView.UI_VIEW.SORT.in(values), limit);
    }

    /**
     * Find records that have <code>IDENTIFIER IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.mbse.ui.domain.tables.pojos.UiView>> findManyByIdentifier(Collection<String> values) {
        return findManyByCondition(UiView.UI_VIEW.IDENTIFIER.in(values));
    }

    /**
     * Find records that have <code>IDENTIFIER IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.mbse.ui.domain.tables.pojos.UiView>> findManyByIdentifier(Collection<String> values, int limit) {
        return findManyByCondition(UiView.UI_VIEW.IDENTIFIER.in(values), limit);
    }

    /**
     * Find records that have <code>WORKFLOW IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.mbse.ui.domain.tables.pojos.UiView>> findManyByWorkflow(Collection<String> values) {
        return findManyByCondition(UiView.UI_VIEW.WORKFLOW.in(values));
    }

    /**
     * Find records that have <code>WORKFLOW IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.mbse.ui.domain.tables.pojos.UiView>> findManyByWorkflow(Collection<String> values, int limit) {
        return findManyByCondition(UiView.UI_VIEW.WORKFLOW.in(values), limit);
    }

    /**
     * Find records that have <code>VIEW IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.mbse.ui.domain.tables.pojos.UiView>> findManyByView(Collection<String> values) {
        return findManyByCondition(UiView.UI_VIEW.VIEW.in(values));
    }

    /**
     * Find records that have <code>VIEW IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.mbse.ui.domain.tables.pojos.UiView>> findManyByView(Collection<String> values, int limit) {
        return findManyByCondition(UiView.UI_VIEW.VIEW.in(values), limit);
    }

    /**
     * Find records that have <code>POSITION IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.mbse.ui.domain.tables.pojos.UiView>> findManyByPosition(Collection<String> values) {
        return findManyByCondition(UiView.UI_VIEW.POSITION.in(values));
    }

    /**
     * Find records that have <code>POSITION IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.mbse.ui.domain.tables.pojos.UiView>> findManyByPosition(Collection<String> values, int limit) {
        return findManyByCondition(UiView.UI_VIEW.POSITION.in(values), limit);
    }

    /**
     * Find records that have <code>TITLE IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.mbse.ui.domain.tables.pojos.UiView>> findManyByTitle(Collection<String> values) {
        return findManyByCondition(UiView.UI_VIEW.TITLE.in(values));
    }

    /**
     * Find records that have <code>TITLE IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.mbse.ui.domain.tables.pojos.UiView>> findManyByTitle(Collection<String> values, int limit) {
        return findManyByCondition(UiView.UI_VIEW.TITLE.in(values), limit);
    }

    /**
     * Find records that have <code>PROJECTION IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.mbse.ui.domain.tables.pojos.UiView>> findManyByProjection(Collection<String> values) {
        return findManyByCondition(UiView.UI_VIEW.PROJECTION.in(values));
    }

    /**
     * Find records that have <code>PROJECTION IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.mbse.ui.domain.tables.pojos.UiView>> findManyByProjection(Collection<String> values, int limit) {
        return findManyByCondition(UiView.UI_VIEW.PROJECTION.in(values), limit);
    }

    /**
     * Find records that have <code>CRITERIA IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.mbse.ui.domain.tables.pojos.UiView>> findManyByCriteria(Collection<String> values) {
        return findManyByCondition(UiView.UI_VIEW.CRITERIA.in(values));
    }

    /**
     * Find records that have <code>CRITERIA IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.mbse.ui.domain.tables.pojos.UiView>> findManyByCriteria(Collection<String> values, int limit) {
        return findManyByCondition(UiView.UI_VIEW.CRITERIA.in(values), limit);
    }

    /**
     * Find records that have <code>ROWS IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.mbse.ui.domain.tables.pojos.UiView>> findManyByRows(Collection<String> values) {
        return findManyByCondition(UiView.UI_VIEW.ROWS.in(values));
    }

    /**
     * Find records that have <code>ROWS IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.mbse.ui.domain.tables.pojos.UiView>> findManyByRows(Collection<String> values, int limit) {
        return findManyByCondition(UiView.UI_VIEW.ROWS.in(values), limit);
    }

    /**
     * Find records that have <code>UI_CONFIG IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.mbse.ui.domain.tables.pojos.UiView>> findManyByUiConfig(Collection<String> values) {
        return findManyByCondition(UiView.UI_VIEW.UI_CONFIG.in(values));
    }

    /**
     * Find records that have <code>UI_CONFIG IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.mbse.ui.domain.tables.pojos.UiView>> findManyByUiConfig(Collection<String> values, int limit) {
        return findManyByCondition(UiView.UI_VIEW.UI_CONFIG.in(values), limit);
    }

    /**
     * Find records that have <code>QR_COMPONENT IN (values)</code>
     * asynchronously
     */
    public Future<List<io.zerows.extension.mbse.ui.domain.tables.pojos.UiView>> findManyByQrComponent(Collection<String> values) {
        return findManyByCondition(UiView.UI_VIEW.QR_COMPONENT.in(values));
    }

    /**
     * Find records that have <code>QR_COMPONENT IN (values)</code>
     * asynchronously limited by the given limit
     */
    public Future<List<io.zerows.extension.mbse.ui.domain.tables.pojos.UiView>> findManyByQrComponent(Collection<String> values, int limit) {
        return findManyByCondition(UiView.UI_VIEW.QR_COMPONENT.in(values), limit);
    }

    /**
     * Find records that have <code>QR_CONFIG IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.mbse.ui.domain.tables.pojos.UiView>> findManyByQrConfig(Collection<String> values) {
        return findManyByCondition(UiView.UI_VIEW.QR_CONFIG.in(values));
    }

    /**
     * Find records that have <code>QR_CONFIG IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.mbse.ui.domain.tables.pojos.UiView>> findManyByQrConfig(Collection<String> values, int limit) {
        return findManyByCondition(UiView.UI_VIEW.QR_CONFIG.in(values), limit);
    }

    /**
     * Find records that have <code>SIGMA IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.mbse.ui.domain.tables.pojos.UiView>> findManyBySigma(Collection<String> values) {
        return findManyByCondition(UiView.UI_VIEW.SIGMA.in(values));
    }

    /**
     * Find records that have <code>SIGMA IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.mbse.ui.domain.tables.pojos.UiView>> findManyBySigma(Collection<String> values, int limit) {
        return findManyByCondition(UiView.UI_VIEW.SIGMA.in(values), limit);
    }

    /**
     * Find records that have <code>LANGUAGE IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.mbse.ui.domain.tables.pojos.UiView>> findManyByLanguage(Collection<String> values) {
        return findManyByCondition(UiView.UI_VIEW.LANGUAGE.in(values));
    }

    /**
     * Find records that have <code>LANGUAGE IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.mbse.ui.domain.tables.pojos.UiView>> findManyByLanguage(Collection<String> values, int limit) {
        return findManyByCondition(UiView.UI_VIEW.LANGUAGE.in(values), limit);
    }

    /**
     * Find records that have <code>ACTIVE IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.mbse.ui.domain.tables.pojos.UiView>> findManyByActive(Collection<Boolean> values) {
        return findManyByCondition(UiView.UI_VIEW.ACTIVE.in(values));
    }

    /**
     * Find records that have <code>ACTIVE IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.mbse.ui.domain.tables.pojos.UiView>> findManyByActive(Collection<Boolean> values, int limit) {
        return findManyByCondition(UiView.UI_VIEW.ACTIVE.in(values), limit);
    }

    /**
     * Find records that have <code>METADATA IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.mbse.ui.domain.tables.pojos.UiView>> findManyByMetadata(Collection<String> values) {
        return findManyByCondition(UiView.UI_VIEW.METADATA.in(values));
    }

    /**
     * Find records that have <code>METADATA IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.mbse.ui.domain.tables.pojos.UiView>> findManyByMetadata(Collection<String> values, int limit) {
        return findManyByCondition(UiView.UI_VIEW.METADATA.in(values), limit);
    }

    /**
     * Find records that have <code>CREATED_AT IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.mbse.ui.domain.tables.pojos.UiView>> findManyByCreatedAt(Collection<LocalDateTime> values) {
        return findManyByCondition(UiView.UI_VIEW.CREATED_AT.in(values));
    }

    /**
     * Find records that have <code>CREATED_AT IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.mbse.ui.domain.tables.pojos.UiView>> findManyByCreatedAt(Collection<LocalDateTime> values, int limit) {
        return findManyByCondition(UiView.UI_VIEW.CREATED_AT.in(values), limit);
    }

    /**
     * Find records that have <code>CREATED_BY IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.mbse.ui.domain.tables.pojos.UiView>> findManyByCreatedBy(Collection<String> values) {
        return findManyByCondition(UiView.UI_VIEW.CREATED_BY.in(values));
    }

    /**
     * Find records that have <code>CREATED_BY IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.mbse.ui.domain.tables.pojos.UiView>> findManyByCreatedBy(Collection<String> values, int limit) {
        return findManyByCondition(UiView.UI_VIEW.CREATED_BY.in(values), limit);
    }

    /**
     * Find records that have <code>UPDATED_AT IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.mbse.ui.domain.tables.pojos.UiView>> findManyByUpdatedAt(Collection<LocalDateTime> values) {
        return findManyByCondition(UiView.UI_VIEW.UPDATED_AT.in(values));
    }

    /**
     * Find records that have <code>UPDATED_AT IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.mbse.ui.domain.tables.pojos.UiView>> findManyByUpdatedAt(Collection<LocalDateTime> values, int limit) {
        return findManyByCondition(UiView.UI_VIEW.UPDATED_AT.in(values), limit);
    }

    /**
     * Find records that have <code>UPDATED_BY IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.mbse.ui.domain.tables.pojos.UiView>> findManyByUpdatedBy(Collection<String> values) {
        return findManyByCondition(UiView.UI_VIEW.UPDATED_BY.in(values));
    }

    /**
     * Find records that have <code>UPDATED_BY IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.mbse.ui.domain.tables.pojos.UiView>> findManyByUpdatedBy(Collection<String> values, int limit) {
        return findManyByCondition(UiView.UI_VIEW.UPDATED_BY.in(values), limit);
    }

    @Override
    public JDBCClassicQueryExecutor<UiViewRecord, io.zerows.extension.mbse.ui.domain.tables.pojos.UiView, String> queryExecutor() {
        return (JDBCClassicQueryExecutor<UiViewRecord, io.zerows.extension.mbse.ui.domain.tables.pojos.UiView, String>) super.queryExecutor();
    }
}