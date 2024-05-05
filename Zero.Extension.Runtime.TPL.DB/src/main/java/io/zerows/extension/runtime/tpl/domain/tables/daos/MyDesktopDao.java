/*
 * This file is generated by jOOQ.
 */
package io.zerows.extension.runtime.tpl.domain.tables.daos;


import io.github.jklingsporn.vertx.jooq.classic.jdbc.JDBCClassicQueryExecutor;
import io.github.jklingsporn.vertx.jooq.shared.internal.AbstractVertxDAO;
import io.vertx.core.Future;
import io.zerows.extension.runtime.tpl.domain.tables.MyDesktop;
import io.zerows.extension.runtime.tpl.domain.tables.records.MyDesktopRecord;
import org.jooq.Configuration;

import java.time.LocalDateTime;
import java.util.Collection;
import java.util.List;

/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({"all", "unchecked", "rawtypes"})
public class MyDesktopDao extends AbstractVertxDAO<MyDesktopRecord, io.zerows.extension.runtime.tpl.domain.tables.pojos.MyDesktop, String, Future<List<io.zerows.extension.runtime.tpl.domain.tables.pojos.MyDesktop>>, Future<io.zerows.extension.runtime.tpl.domain.tables.pojos.MyDesktop>, Future<Integer>, Future<String>> implements io.github.jklingsporn.vertx.jooq.classic.VertxDAO<MyDesktopRecord, io.zerows.extension.runtime.tpl.domain.tables.pojos.MyDesktop, String> {

    /**
     * @param configuration The Configuration used for rendering and query
     *                      execution.
     * @param vertx         the vertx instance
     */
    public MyDesktopDao(Configuration configuration, io.vertx.core.Vertx vertx) {
        super(MyDesktop.MY_DESKTOP, io.zerows.extension.runtime.tpl.domain.tables.pojos.MyDesktop.class, new JDBCClassicQueryExecutor<MyDesktopRecord, io.zerows.extension.runtime.tpl.domain.tables.pojos.MyDesktop, String>(configuration, io.zerows.extension.runtime.tpl.domain.tables.pojos.MyDesktop.class, vertx));
    }

    @Override
    protected String getId(io.zerows.extension.runtime.tpl.domain.tables.pojos.MyDesktop object) {
        return object.getKey();
    }

    /**
     * Find records that have <code>BAG_ID IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.runtime.tpl.domain.tables.pojos.MyDesktop>> findManyByBagId(Collection<String> values) {
        return findManyByCondition(MyDesktop.MY_DESKTOP.BAG_ID.in(values));
    }

    /**
     * Find records that have <code>BAG_ID IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.runtime.tpl.domain.tables.pojos.MyDesktop>> findManyByBagId(Collection<String> values, int limit) {
        return findManyByCondition(MyDesktop.MY_DESKTOP.BAG_ID.in(values), limit);
    }

    /**
     * Find records that have <code>UI_CONFIG IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.runtime.tpl.domain.tables.pojos.MyDesktop>> findManyByUiConfig(Collection<String> values) {
        return findManyByCondition(MyDesktop.MY_DESKTOP.UI_CONFIG.in(values));
    }

    /**
     * Find records that have <code>UI_CONFIG IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.runtime.tpl.domain.tables.pojos.MyDesktop>> findManyByUiConfig(Collection<String> values, int limit) {
        return findManyByCondition(MyDesktop.MY_DESKTOP.UI_CONFIG.in(values), limit);
    }

    /**
     * Find records that have <code>UI_GRID IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.runtime.tpl.domain.tables.pojos.MyDesktop>> findManyByUiGrid(Collection<String> values) {
        return findManyByCondition(MyDesktop.MY_DESKTOP.UI_GRID.in(values));
    }

    /**
     * Find records that have <code>UI_GRID IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.runtime.tpl.domain.tables.pojos.MyDesktop>> findManyByUiGrid(Collection<String> values, int limit) {
        return findManyByCondition(MyDesktop.MY_DESKTOP.UI_GRID.in(values), limit);
    }

    /**
     * Find records that have <code>OWNER IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.runtime.tpl.domain.tables.pojos.MyDesktop>> findManyByOwner(Collection<String> values) {
        return findManyByCondition(MyDesktop.MY_DESKTOP.OWNER.in(values));
    }

    /**
     * Find records that have <code>OWNER IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.runtime.tpl.domain.tables.pojos.MyDesktop>> findManyByOwner(Collection<String> values, int limit) {
        return findManyByCondition(MyDesktop.MY_DESKTOP.OWNER.in(values), limit);
    }

    /**
     * Find records that have <code>OWNER_TYPE IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.runtime.tpl.domain.tables.pojos.MyDesktop>> findManyByOwnerType(Collection<String> values) {
        return findManyByCondition(MyDesktop.MY_DESKTOP.OWNER_TYPE.in(values));
    }

    /**
     * Find records that have <code>OWNER_TYPE IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.runtime.tpl.domain.tables.pojos.MyDesktop>> findManyByOwnerType(Collection<String> values, int limit) {
        return findManyByCondition(MyDesktop.MY_DESKTOP.OWNER_TYPE.in(values), limit);
    }

    /**
     * Find records that have <code>ACTIVE IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.runtime.tpl.domain.tables.pojos.MyDesktop>> findManyByActive(Collection<Boolean> values) {
        return findManyByCondition(MyDesktop.MY_DESKTOP.ACTIVE.in(values));
    }

    /**
     * Find records that have <code>ACTIVE IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.runtime.tpl.domain.tables.pojos.MyDesktop>> findManyByActive(Collection<Boolean> values, int limit) {
        return findManyByCondition(MyDesktop.MY_DESKTOP.ACTIVE.in(values), limit);
    }

    /**
     * Find records that have <code>SIGMA IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.runtime.tpl.domain.tables.pojos.MyDesktop>> findManyBySigma(Collection<String> values) {
        return findManyByCondition(MyDesktop.MY_DESKTOP.SIGMA.in(values));
    }

    /**
     * Find records that have <code>SIGMA IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.runtime.tpl.domain.tables.pojos.MyDesktop>> findManyBySigma(Collection<String> values, int limit) {
        return findManyByCondition(MyDesktop.MY_DESKTOP.SIGMA.in(values), limit);
    }

    /**
     * Find records that have <code>METADATA IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.runtime.tpl.domain.tables.pojos.MyDesktop>> findManyByMetadata(Collection<String> values) {
        return findManyByCondition(MyDesktop.MY_DESKTOP.METADATA.in(values));
    }

    /**
     * Find records that have <code>METADATA IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.runtime.tpl.domain.tables.pojos.MyDesktop>> findManyByMetadata(Collection<String> values, int limit) {
        return findManyByCondition(MyDesktop.MY_DESKTOP.METADATA.in(values), limit);
    }

    /**
     * Find records that have <code>LANGUAGE IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.runtime.tpl.domain.tables.pojos.MyDesktop>> findManyByLanguage(Collection<String> values) {
        return findManyByCondition(MyDesktop.MY_DESKTOP.LANGUAGE.in(values));
    }

    /**
     * Find records that have <code>LANGUAGE IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.runtime.tpl.domain.tables.pojos.MyDesktop>> findManyByLanguage(Collection<String> values, int limit) {
        return findManyByCondition(MyDesktop.MY_DESKTOP.LANGUAGE.in(values), limit);
    }

    /**
     * Find records that have <code>CREATED_AT IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.runtime.tpl.domain.tables.pojos.MyDesktop>> findManyByCreatedAt(Collection<LocalDateTime> values) {
        return findManyByCondition(MyDesktop.MY_DESKTOP.CREATED_AT.in(values));
    }

    /**
     * Find records that have <code>CREATED_AT IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.runtime.tpl.domain.tables.pojos.MyDesktop>> findManyByCreatedAt(Collection<LocalDateTime> values, int limit) {
        return findManyByCondition(MyDesktop.MY_DESKTOP.CREATED_AT.in(values), limit);
    }

    /**
     * Find records that have <code>CREATED_BY IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.runtime.tpl.domain.tables.pojos.MyDesktop>> findManyByCreatedBy(Collection<String> values) {
        return findManyByCondition(MyDesktop.MY_DESKTOP.CREATED_BY.in(values));
    }

    /**
     * Find records that have <code>CREATED_BY IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.runtime.tpl.domain.tables.pojos.MyDesktop>> findManyByCreatedBy(Collection<String> values, int limit) {
        return findManyByCondition(MyDesktop.MY_DESKTOP.CREATED_BY.in(values), limit);
    }

    /**
     * Find records that have <code>UPDATED_AT IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.runtime.tpl.domain.tables.pojos.MyDesktop>> findManyByUpdatedAt(Collection<LocalDateTime> values) {
        return findManyByCondition(MyDesktop.MY_DESKTOP.UPDATED_AT.in(values));
    }

    /**
     * Find records that have <code>UPDATED_AT IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.runtime.tpl.domain.tables.pojos.MyDesktop>> findManyByUpdatedAt(Collection<LocalDateTime> values, int limit) {
        return findManyByCondition(MyDesktop.MY_DESKTOP.UPDATED_AT.in(values), limit);
    }

    /**
     * Find records that have <code>UPDATED_BY IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.runtime.tpl.domain.tables.pojos.MyDesktop>> findManyByUpdatedBy(Collection<String> values) {
        return findManyByCondition(MyDesktop.MY_DESKTOP.UPDATED_BY.in(values));
    }

    /**
     * Find records that have <code>UPDATED_BY IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.runtime.tpl.domain.tables.pojos.MyDesktop>> findManyByUpdatedBy(Collection<String> values, int limit) {
        return findManyByCondition(MyDesktop.MY_DESKTOP.UPDATED_BY.in(values), limit);
    }

    @Override
    public JDBCClassicQueryExecutor<MyDesktopRecord, io.zerows.extension.runtime.tpl.domain.tables.pojos.MyDesktop, String> queryExecutor() {
        return (JDBCClassicQueryExecutor<MyDesktopRecord, io.zerows.extension.runtime.tpl.domain.tables.pojos.MyDesktop, String>) super.queryExecutor();
    }
}
