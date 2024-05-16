/*
 * This file is generated by jOOQ.
 */
package io.zerows.extension.mbse.modulat.domain.tables.daos;


import io.github.jklingsporn.vertx.jooq.classic.jdbc.JDBCClassicQueryExecutor;
import io.github.jklingsporn.vertx.jooq.shared.internal.AbstractVertxDAO;
import io.vertx.core.Future;
import io.zerows.extension.mbse.modulat.domain.tables.BBag;
import io.zerows.extension.mbse.modulat.domain.tables.records.BBagRecord;
import org.jooq.Configuration;

import java.time.LocalDateTime;
import java.util.Collection;
import java.util.List;

/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({"all", "unchecked", "rawtypes"})
public class BBagDao extends AbstractVertxDAO<BBagRecord, io.zerows.extension.mbse.modulat.domain.tables.pojos.BBag, String, Future<List<io.zerows.extension.mbse.modulat.domain.tables.pojos.BBag>>, Future<io.zerows.extension.mbse.modulat.domain.tables.pojos.BBag>, Future<Integer>, Future<String>> implements io.github.jklingsporn.vertx.jooq.classic.VertxDAO<BBagRecord, io.zerows.extension.mbse.modulat.domain.tables.pojos.BBag, String> {

    /**
     * @param configuration The Configuration used for rendering and query
     *                      execution.
     * @param vertx         the vertx instance
     */
    public BBagDao(Configuration configuration, io.vertx.core.Vertx vertx) {
        super(BBag.B_BAG, io.zerows.extension.mbse.modulat.domain.tables.pojos.BBag.class, new JDBCClassicQueryExecutor<BBagRecord, io.zerows.extension.mbse.modulat.domain.tables.pojos.BBag, String>(configuration, io.zerows.extension.mbse.modulat.domain.tables.pojos.BBag.class, vertx));
    }

    @Override
    protected String getId(io.zerows.extension.mbse.modulat.domain.tables.pojos.BBag object) {
        return object.getKey();
    }

    /**
     * Find records that have <code>NAME IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.mbse.modulat.domain.tables.pojos.BBag>> findManyByName(Collection<String> values) {
        return findManyByCondition(BBag.B_BAG.NAME.in(values));
    }

    /**
     * Find records that have <code>NAME IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.mbse.modulat.domain.tables.pojos.BBag>> findManyByName(Collection<String> values, int limit) {
        return findManyByCondition(BBag.B_BAG.NAME.in(values), limit);
    }

    /**
     * Find records that have <code>NAME_ABBR IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.mbse.modulat.domain.tables.pojos.BBag>> findManyByNameAbbr(Collection<String> values) {
        return findManyByCondition(BBag.B_BAG.NAME_ABBR.in(values));
    }

    /**
     * Find records that have <code>NAME_ABBR IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.mbse.modulat.domain.tables.pojos.BBag>> findManyByNameAbbr(Collection<String> values, int limit) {
        return findManyByCondition(BBag.B_BAG.NAME_ABBR.in(values), limit);
    }

    /**
     * Find records that have <code>NAME_FULL IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.mbse.modulat.domain.tables.pojos.BBag>> findManyByNameFull(Collection<String> values) {
        return findManyByCondition(BBag.B_BAG.NAME_FULL.in(values));
    }

    /**
     * Find records that have <code>NAME_FULL IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.mbse.modulat.domain.tables.pojos.BBag>> findManyByNameFull(Collection<String> values, int limit) {
        return findManyByCondition(BBag.B_BAG.NAME_FULL.in(values), limit);
    }

    /**
     * Find records that have <code>TYPE IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.mbse.modulat.domain.tables.pojos.BBag>> findManyByType(Collection<String> values) {
        return findManyByCondition(BBag.B_BAG.TYPE.in(values));
    }

    /**
     * Find records that have <code>TYPE IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.mbse.modulat.domain.tables.pojos.BBag>> findManyByType(Collection<String> values, int limit) {
        return findManyByCondition(BBag.B_BAG.TYPE.in(values), limit);
    }

    /**
     * Find records that have <code>UI_ICON IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.mbse.modulat.domain.tables.pojos.BBag>> findManyByUiIcon(Collection<String> values) {
        return findManyByCondition(BBag.B_BAG.UI_ICON.in(values));
    }

    /**
     * Find records that have <code>UI_ICON IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.mbse.modulat.domain.tables.pojos.BBag>> findManyByUiIcon(Collection<String> values, int limit) {
        return findManyByCondition(BBag.B_BAG.UI_ICON.in(values), limit);
    }

    /**
     * Find records that have <code>UI_STYLE IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.mbse.modulat.domain.tables.pojos.BBag>> findManyByUiStyle(Collection<String> values) {
        return findManyByCondition(BBag.B_BAG.UI_STYLE.in(values));
    }

    /**
     * Find records that have <code>UI_STYLE IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.mbse.modulat.domain.tables.pojos.BBag>> findManyByUiStyle(Collection<String> values, int limit) {
        return findManyByCondition(BBag.B_BAG.UI_STYLE.in(values), limit);
    }

    /**
     * Find records that have <code>UI_SORT IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.mbse.modulat.domain.tables.pojos.BBag>> findManyByUiSort(Collection<Long> values) {
        return findManyByCondition(BBag.B_BAG.UI_SORT.in(values));
    }

    /**
     * Find records that have <code>UI_SORT IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.mbse.modulat.domain.tables.pojos.BBag>> findManyByUiSort(Collection<Long> values, int limit) {
        return findManyByCondition(BBag.B_BAG.UI_SORT.in(values), limit);
    }

    /**
     * Find records that have <code>UI_CONFIG IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.mbse.modulat.domain.tables.pojos.BBag>> findManyByUiConfig(Collection<String> values) {
        return findManyByCondition(BBag.B_BAG.UI_CONFIG.in(values));
    }

    /**
     * Find records that have <code>UI_CONFIG IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.mbse.modulat.domain.tables.pojos.BBag>> findManyByUiConfig(Collection<String> values, int limit) {
        return findManyByCondition(BBag.B_BAG.UI_CONFIG.in(values), limit);
    }

    /**
     * Find records that have <code>ENTRY IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.mbse.modulat.domain.tables.pojos.BBag>> findManyByEntry(Collection<Boolean> values) {
        return findManyByCondition(BBag.B_BAG.ENTRY.in(values));
    }

    /**
     * Find records that have <code>ENTRY IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.mbse.modulat.domain.tables.pojos.BBag>> findManyByEntry(Collection<Boolean> values, int limit) {
        return findManyByCondition(BBag.B_BAG.ENTRY.in(values), limit);
    }

    /**
     * Find records that have <code>ENTRY_ID IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.mbse.modulat.domain.tables.pojos.BBag>> findManyByEntryId(Collection<String> values) {
        return findManyByCondition(BBag.B_BAG.ENTRY_ID.in(values));
    }

    /**
     * Find records that have <code>ENTRY_ID IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.mbse.modulat.domain.tables.pojos.BBag>> findManyByEntryId(Collection<String> values, int limit) {
        return findManyByCondition(BBag.B_BAG.ENTRY_ID.in(values), limit);
    }

    /**
     * Find records that have <code>APP_ID IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.mbse.modulat.domain.tables.pojos.BBag>> findManyByAppId(Collection<String> values) {
        return findManyByCondition(BBag.B_BAG.APP_ID.in(values));
    }

    /**
     * Find records that have <code>APP_ID IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.mbse.modulat.domain.tables.pojos.BBag>> findManyByAppId(Collection<String> values, int limit) {
        return findManyByCondition(BBag.B_BAG.APP_ID.in(values), limit);
    }

    /**
     * Find records that have <code>PARENT_ID IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.mbse.modulat.domain.tables.pojos.BBag>> findManyByParentId(Collection<String> values) {
        return findManyByCondition(BBag.B_BAG.PARENT_ID.in(values));
    }

    /**
     * Find records that have <code>PARENT_ID IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.mbse.modulat.domain.tables.pojos.BBag>> findManyByParentId(Collection<String> values, int limit) {
        return findManyByCondition(BBag.B_BAG.PARENT_ID.in(values), limit);
    }

    /**
     * Find records that have <code>ACTIVE IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.mbse.modulat.domain.tables.pojos.BBag>> findManyByActive(Collection<Boolean> values) {
        return findManyByCondition(BBag.B_BAG.ACTIVE.in(values));
    }

    /**
     * Find records that have <code>ACTIVE IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.mbse.modulat.domain.tables.pojos.BBag>> findManyByActive(Collection<Boolean> values, int limit) {
        return findManyByCondition(BBag.B_BAG.ACTIVE.in(values), limit);
    }

    /**
     * Find records that have <code>SIGMA IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.mbse.modulat.domain.tables.pojos.BBag>> findManyBySigma(Collection<String> values) {
        return findManyByCondition(BBag.B_BAG.SIGMA.in(values));
    }

    /**
     * Find records that have <code>SIGMA IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.mbse.modulat.domain.tables.pojos.BBag>> findManyBySigma(Collection<String> values, int limit) {
        return findManyByCondition(BBag.B_BAG.SIGMA.in(values), limit);
    }

    /**
     * Find records that have <code>METADATA IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.mbse.modulat.domain.tables.pojos.BBag>> findManyByMetadata(Collection<String> values) {
        return findManyByCondition(BBag.B_BAG.METADATA.in(values));
    }

    /**
     * Find records that have <code>METADATA IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.mbse.modulat.domain.tables.pojos.BBag>> findManyByMetadata(Collection<String> values, int limit) {
        return findManyByCondition(BBag.B_BAG.METADATA.in(values), limit);
    }

    /**
     * Find records that have <code>LANGUAGE IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.mbse.modulat.domain.tables.pojos.BBag>> findManyByLanguage(Collection<String> values) {
        return findManyByCondition(BBag.B_BAG.LANGUAGE.in(values));
    }

    /**
     * Find records that have <code>LANGUAGE IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.mbse.modulat.domain.tables.pojos.BBag>> findManyByLanguage(Collection<String> values, int limit) {
        return findManyByCondition(BBag.B_BAG.LANGUAGE.in(values), limit);
    }

    /**
     * Find records that have <code>CREATED_AT IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.mbse.modulat.domain.tables.pojos.BBag>> findManyByCreatedAt(Collection<LocalDateTime> values) {
        return findManyByCondition(BBag.B_BAG.CREATED_AT.in(values));
    }

    /**
     * Find records that have <code>CREATED_AT IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.mbse.modulat.domain.tables.pojos.BBag>> findManyByCreatedAt(Collection<LocalDateTime> values, int limit) {
        return findManyByCondition(BBag.B_BAG.CREATED_AT.in(values), limit);
    }

    /**
     * Find records that have <code>CREATED_BY IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.mbse.modulat.domain.tables.pojos.BBag>> findManyByCreatedBy(Collection<String> values) {
        return findManyByCondition(BBag.B_BAG.CREATED_BY.in(values));
    }

    /**
     * Find records that have <code>CREATED_BY IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.mbse.modulat.domain.tables.pojos.BBag>> findManyByCreatedBy(Collection<String> values, int limit) {
        return findManyByCondition(BBag.B_BAG.CREATED_BY.in(values), limit);
    }

    /**
     * Find records that have <code>UPDATED_AT IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.mbse.modulat.domain.tables.pojos.BBag>> findManyByUpdatedAt(Collection<LocalDateTime> values) {
        return findManyByCondition(BBag.B_BAG.UPDATED_AT.in(values));
    }

    /**
     * Find records that have <code>UPDATED_AT IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.mbse.modulat.domain.tables.pojos.BBag>> findManyByUpdatedAt(Collection<LocalDateTime> values, int limit) {
        return findManyByCondition(BBag.B_BAG.UPDATED_AT.in(values), limit);
    }

    /**
     * Find records that have <code>UPDATED_BY IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.mbse.modulat.domain.tables.pojos.BBag>> findManyByUpdatedBy(Collection<String> values) {
        return findManyByCondition(BBag.B_BAG.UPDATED_BY.in(values));
    }

    /**
     * Find records that have <code>UPDATED_BY IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.mbse.modulat.domain.tables.pojos.BBag>> findManyByUpdatedBy(Collection<String> values, int limit) {
        return findManyByCondition(BBag.B_BAG.UPDATED_BY.in(values), limit);
    }

    @Override
    public JDBCClassicQueryExecutor<BBagRecord, io.zerows.extension.mbse.modulat.domain.tables.pojos.BBag, String> queryExecutor() {
        return (JDBCClassicQueryExecutor<BBagRecord, io.zerows.extension.mbse.modulat.domain.tables.pojos.BBag, String>) super.queryExecutor();
    }
}