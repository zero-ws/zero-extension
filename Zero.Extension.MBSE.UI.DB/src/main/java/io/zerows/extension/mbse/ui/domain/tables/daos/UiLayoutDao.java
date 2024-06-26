/*
 * This file is generated by jOOQ.
 */
package io.zerows.extension.mbse.ui.domain.tables.daos;


import io.github.jklingsporn.vertx.jooq.classic.jdbc.JDBCClassicQueryExecutor;
import io.github.jklingsporn.vertx.jooq.shared.internal.AbstractVertxDAO;
import io.vertx.core.Future;
import io.zerows.extension.mbse.ui.domain.tables.UiLayout;
import io.zerows.extension.mbse.ui.domain.tables.records.UiLayoutRecord;
import org.jooq.Configuration;

import java.time.LocalDateTime;
import java.util.Collection;
import java.util.List;

/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({"all", "unchecked", "rawtypes"})
public class UiLayoutDao extends AbstractVertxDAO<UiLayoutRecord, io.zerows.extension.mbse.ui.domain.tables.pojos.UiLayout, String, Future<List<io.zerows.extension.mbse.ui.domain.tables.pojos.UiLayout>>, Future<io.zerows.extension.mbse.ui.domain.tables.pojos.UiLayout>, Future<Integer>, Future<String>> implements io.github.jklingsporn.vertx.jooq.classic.VertxDAO<UiLayoutRecord, io.zerows.extension.mbse.ui.domain.tables.pojos.UiLayout, String> {

    /**
     * @param configuration The Configuration used for rendering and query
     *                      execution.
     * @param vertx         the vertx instance
     */
    public UiLayoutDao(Configuration configuration, io.vertx.core.Vertx vertx) {
        super(UiLayout.UI_LAYOUT, io.zerows.extension.mbse.ui.domain.tables.pojos.UiLayout.class, new JDBCClassicQueryExecutor<UiLayoutRecord, io.zerows.extension.mbse.ui.domain.tables.pojos.UiLayout, String>(configuration, io.zerows.extension.mbse.ui.domain.tables.pojos.UiLayout.class, vertx));
    }

    @Override
    protected String getId(io.zerows.extension.mbse.ui.domain.tables.pojos.UiLayout object) {
        return object.getKey();
    }

    /**
     * Find records that have <code>NAME IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.mbse.ui.domain.tables.pojos.UiLayout>> findManyByName(Collection<String> values) {
        return findManyByCondition(UiLayout.UI_LAYOUT.NAME.in(values));
    }

    /**
     * Find records that have <code>NAME IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.mbse.ui.domain.tables.pojos.UiLayout>> findManyByName(Collection<String> values, int limit) {
        return findManyByCondition(UiLayout.UI_LAYOUT.NAME.in(values), limit);
    }

    /**
     * Find records that have <code>CONFIG IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.mbse.ui.domain.tables.pojos.UiLayout>> findManyByConfig(Collection<String> values) {
        return findManyByCondition(UiLayout.UI_LAYOUT.CONFIG.in(values));
    }

    /**
     * Find records that have <code>CONFIG IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.mbse.ui.domain.tables.pojos.UiLayout>> findManyByConfig(Collection<String> values, int limit) {
        return findManyByCondition(UiLayout.UI_LAYOUT.CONFIG.in(values), limit);
    }

    /**
     * Find records that have <code>ACTIVE IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.mbse.ui.domain.tables.pojos.UiLayout>> findManyByActive(Collection<Boolean> values) {
        return findManyByCondition(UiLayout.UI_LAYOUT.ACTIVE.in(values));
    }

    /**
     * Find records that have <code>ACTIVE IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.mbse.ui.domain.tables.pojos.UiLayout>> findManyByActive(Collection<Boolean> values, int limit) {
        return findManyByCondition(UiLayout.UI_LAYOUT.ACTIVE.in(values), limit);
    }

    /**
     * Find records that have <code>SIGMA IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.mbse.ui.domain.tables.pojos.UiLayout>> findManyBySigma(Collection<String> values) {
        return findManyByCondition(UiLayout.UI_LAYOUT.SIGMA.in(values));
    }

    /**
     * Find records that have <code>SIGMA IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.mbse.ui.domain.tables.pojos.UiLayout>> findManyBySigma(Collection<String> values, int limit) {
        return findManyByCondition(UiLayout.UI_LAYOUT.SIGMA.in(values), limit);
    }

    /**
     * Find records that have <code>METADATA IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.mbse.ui.domain.tables.pojos.UiLayout>> findManyByMetadata(Collection<String> values) {
        return findManyByCondition(UiLayout.UI_LAYOUT.METADATA.in(values));
    }

    /**
     * Find records that have <code>METADATA IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.mbse.ui.domain.tables.pojos.UiLayout>> findManyByMetadata(Collection<String> values, int limit) {
        return findManyByCondition(UiLayout.UI_LAYOUT.METADATA.in(values), limit);
    }

    /**
     * Find records that have <code>LANGUAGE IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.mbse.ui.domain.tables.pojos.UiLayout>> findManyByLanguage(Collection<String> values) {
        return findManyByCondition(UiLayout.UI_LAYOUT.LANGUAGE.in(values));
    }

    /**
     * Find records that have <code>LANGUAGE IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.mbse.ui.domain.tables.pojos.UiLayout>> findManyByLanguage(Collection<String> values, int limit) {
        return findManyByCondition(UiLayout.UI_LAYOUT.LANGUAGE.in(values), limit);
    }

    /**
     * Find records that have <code>CREATED_AT IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.mbse.ui.domain.tables.pojos.UiLayout>> findManyByCreatedAt(Collection<LocalDateTime> values) {
        return findManyByCondition(UiLayout.UI_LAYOUT.CREATED_AT.in(values));
    }

    /**
     * Find records that have <code>CREATED_AT IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.mbse.ui.domain.tables.pojos.UiLayout>> findManyByCreatedAt(Collection<LocalDateTime> values, int limit) {
        return findManyByCondition(UiLayout.UI_LAYOUT.CREATED_AT.in(values), limit);
    }

    /**
     * Find records that have <code>CREATED_BY IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.mbse.ui.domain.tables.pojos.UiLayout>> findManyByCreatedBy(Collection<String> values) {
        return findManyByCondition(UiLayout.UI_LAYOUT.CREATED_BY.in(values));
    }

    /**
     * Find records that have <code>CREATED_BY IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.mbse.ui.domain.tables.pojos.UiLayout>> findManyByCreatedBy(Collection<String> values, int limit) {
        return findManyByCondition(UiLayout.UI_LAYOUT.CREATED_BY.in(values), limit);
    }

    /**
     * Find records that have <code>UPDATED_AT IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.mbse.ui.domain.tables.pojos.UiLayout>> findManyByUpdatedAt(Collection<LocalDateTime> values) {
        return findManyByCondition(UiLayout.UI_LAYOUT.UPDATED_AT.in(values));
    }

    /**
     * Find records that have <code>UPDATED_AT IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.mbse.ui.domain.tables.pojos.UiLayout>> findManyByUpdatedAt(Collection<LocalDateTime> values, int limit) {
        return findManyByCondition(UiLayout.UI_LAYOUT.UPDATED_AT.in(values), limit);
    }

    /**
     * Find records that have <code>UPDATED_BY IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.mbse.ui.domain.tables.pojos.UiLayout>> findManyByUpdatedBy(Collection<String> values) {
        return findManyByCondition(UiLayout.UI_LAYOUT.UPDATED_BY.in(values));
    }

    /**
     * Find records that have <code>UPDATED_BY IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.mbse.ui.domain.tables.pojos.UiLayout>> findManyByUpdatedBy(Collection<String> values, int limit) {
        return findManyByCondition(UiLayout.UI_LAYOUT.UPDATED_BY.in(values), limit);
    }

    @Override
    public JDBCClassicQueryExecutor<UiLayoutRecord, io.zerows.extension.mbse.ui.domain.tables.pojos.UiLayout, String> queryExecutor() {
        return (JDBCClassicQueryExecutor<UiLayoutRecord, io.zerows.extension.mbse.ui.domain.tables.pojos.UiLayout, String>) super.queryExecutor();
    }
}
