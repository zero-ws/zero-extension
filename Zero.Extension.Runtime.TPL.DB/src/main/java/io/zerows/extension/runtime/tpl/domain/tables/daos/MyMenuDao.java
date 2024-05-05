/*
 * This file is generated by jOOQ.
 */
package io.zerows.extension.runtime.tpl.domain.tables.daos;


import io.github.jklingsporn.vertx.jooq.classic.jdbc.JDBCClassicQueryExecutor;
import io.github.jklingsporn.vertx.jooq.shared.internal.AbstractVertxDAO;
import io.vertx.core.Future;
import io.zerows.extension.runtime.tpl.domain.tables.MyMenu;
import io.zerows.extension.runtime.tpl.domain.tables.records.MyMenuRecord;
import org.jooq.Configuration;

import java.time.LocalDateTime;
import java.util.Collection;
import java.util.List;

/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({"all", "unchecked", "rawtypes"})
public class MyMenuDao extends AbstractVertxDAO<MyMenuRecord, io.zerows.extension.runtime.tpl.domain.tables.pojos.MyMenu, String, Future<List<io.zerows.extension.runtime.tpl.domain.tables.pojos.MyMenu>>, Future<io.zerows.extension.runtime.tpl.domain.tables.pojos.MyMenu>, Future<Integer>, Future<String>> implements io.github.jklingsporn.vertx.jooq.classic.VertxDAO<MyMenuRecord, io.zerows.extension.runtime.tpl.domain.tables.pojos.MyMenu, String> {

    /**
     * @param configuration The Configuration used for rendering and query
     *                      execution.
     * @param vertx         the vertx instance
     */
    public MyMenuDao(Configuration configuration, io.vertx.core.Vertx vertx) {
        super(MyMenu.MY_MENU, io.zerows.extension.runtime.tpl.domain.tables.pojos.MyMenu.class, new JDBCClassicQueryExecutor<MyMenuRecord, io.zerows.extension.runtime.tpl.domain.tables.pojos.MyMenu, String>(configuration, io.zerows.extension.runtime.tpl.domain.tables.pojos.MyMenu.class, vertx));
    }

    @Override
    protected String getId(io.zerows.extension.runtime.tpl.domain.tables.pojos.MyMenu object) {
        return object.getKey();
    }

    /**
     * Find records that have <code>ICON IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.runtime.tpl.domain.tables.pojos.MyMenu>> findManyByIcon(Collection<String> values) {
        return findManyByCondition(MyMenu.MY_MENU.ICON.in(values));
    }

    /**
     * Find records that have <code>ICON IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.runtime.tpl.domain.tables.pojos.MyMenu>> findManyByIcon(Collection<String> values, int limit) {
        return findManyByCondition(MyMenu.MY_MENU.ICON.in(values), limit);
    }

    /**
     * Find records that have <code>TEXT IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.runtime.tpl.domain.tables.pojos.MyMenu>> findManyByText(Collection<String> values) {
        return findManyByCondition(MyMenu.MY_MENU.TEXT.in(values));
    }

    /**
     * Find records that have <code>TEXT IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.runtime.tpl.domain.tables.pojos.MyMenu>> findManyByText(Collection<String> values, int limit) {
        return findManyByCondition(MyMenu.MY_MENU.TEXT.in(values), limit);
    }

    /**
     * Find records that have <code>URI IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.runtime.tpl.domain.tables.pojos.MyMenu>> findManyByUri(Collection<String> values) {
        return findManyByCondition(MyMenu.MY_MENU.URI.in(values));
    }

    /**
     * Find records that have <code>URI IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.runtime.tpl.domain.tables.pojos.MyMenu>> findManyByUri(Collection<String> values, int limit) {
        return findManyByCondition(MyMenu.MY_MENU.URI.in(values), limit);
    }

    /**
     * Find records that have <code>UI_SORT IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.runtime.tpl.domain.tables.pojos.MyMenu>> findManyByUiSort(Collection<Long> values) {
        return findManyByCondition(MyMenu.MY_MENU.UI_SORT.in(values));
    }

    /**
     * Find records that have <code>UI_SORT IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.runtime.tpl.domain.tables.pojos.MyMenu>> findManyByUiSort(Collection<Long> values, int limit) {
        return findManyByCondition(MyMenu.MY_MENU.UI_SORT.in(values), limit);
    }

    /**
     * Find records that have <code>UI_PARENT IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.runtime.tpl.domain.tables.pojos.MyMenu>> findManyByUiParent(Collection<String> values) {
        return findManyByCondition(MyMenu.MY_MENU.UI_PARENT.in(values));
    }

    /**
     * Find records that have <code>UI_PARENT IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.runtime.tpl.domain.tables.pojos.MyMenu>> findManyByUiParent(Collection<String> values, int limit) {
        return findManyByCondition(MyMenu.MY_MENU.UI_PARENT.in(values), limit);
    }

    /**
     * Find records that have <code>UI_COLOR_FG IN (values)</code>
     * asynchronously
     */
    public Future<List<io.zerows.extension.runtime.tpl.domain.tables.pojos.MyMenu>> findManyByUiColorFg(Collection<String> values) {
        return findManyByCondition(MyMenu.MY_MENU.UI_COLOR_FG.in(values));
    }

    /**
     * Find records that have <code>UI_COLOR_FG IN (values)</code>
     * asynchronously limited by the given limit
     */
    public Future<List<io.zerows.extension.runtime.tpl.domain.tables.pojos.MyMenu>> findManyByUiColorFg(Collection<String> values, int limit) {
        return findManyByCondition(MyMenu.MY_MENU.UI_COLOR_FG.in(values), limit);
    }

    /**
     * Find records that have <code>UI_COLOR_BG IN (values)</code>
     * asynchronously
     */
    public Future<List<io.zerows.extension.runtime.tpl.domain.tables.pojos.MyMenu>> findManyByUiColorBg(Collection<String> values) {
        return findManyByCondition(MyMenu.MY_MENU.UI_COLOR_BG.in(values));
    }

    /**
     * Find records that have <code>UI_COLOR_BG IN (values)</code>
     * asynchronously limited by the given limit
     */
    public Future<List<io.zerows.extension.runtime.tpl.domain.tables.pojos.MyMenu>> findManyByUiColorBg(Collection<String> values, int limit) {
        return findManyByCondition(MyMenu.MY_MENU.UI_COLOR_BG.in(values), limit);
    }

    /**
     * Find records that have <code>TYPE IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.runtime.tpl.domain.tables.pojos.MyMenu>> findManyByType(Collection<String> values) {
        return findManyByCondition(MyMenu.MY_MENU.TYPE.in(values));
    }

    /**
     * Find records that have <code>TYPE IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.runtime.tpl.domain.tables.pojos.MyMenu>> findManyByType(Collection<String> values, int limit) {
        return findManyByCondition(MyMenu.MY_MENU.TYPE.in(values), limit);
    }

    /**
     * Find records that have <code>PAGE IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.runtime.tpl.domain.tables.pojos.MyMenu>> findManyByPage(Collection<String> values) {
        return findManyByCondition(MyMenu.MY_MENU.PAGE.in(values));
    }

    /**
     * Find records that have <code>PAGE IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.runtime.tpl.domain.tables.pojos.MyMenu>> findManyByPage(Collection<String> values, int limit) {
        return findManyByCondition(MyMenu.MY_MENU.PAGE.in(values), limit);
    }

    /**
     * Find records that have <code>POSITION IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.runtime.tpl.domain.tables.pojos.MyMenu>> findManyByPosition(Collection<String> values) {
        return findManyByCondition(MyMenu.MY_MENU.POSITION.in(values));
    }

    /**
     * Find records that have <code>POSITION IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.runtime.tpl.domain.tables.pojos.MyMenu>> findManyByPosition(Collection<String> values, int limit) {
        return findManyByCondition(MyMenu.MY_MENU.POSITION.in(values), limit);
    }

    /**
     * Find records that have <code>OWNER IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.runtime.tpl.domain.tables.pojos.MyMenu>> findManyByOwner(Collection<String> values) {
        return findManyByCondition(MyMenu.MY_MENU.OWNER.in(values));
    }

    /**
     * Find records that have <code>OWNER IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.runtime.tpl.domain.tables.pojos.MyMenu>> findManyByOwner(Collection<String> values, int limit) {
        return findManyByCondition(MyMenu.MY_MENU.OWNER.in(values), limit);
    }

    /**
     * Find records that have <code>OWNER_TYPE IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.runtime.tpl.domain.tables.pojos.MyMenu>> findManyByOwnerType(Collection<String> values) {
        return findManyByCondition(MyMenu.MY_MENU.OWNER_TYPE.in(values));
    }

    /**
     * Find records that have <code>OWNER_TYPE IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.runtime.tpl.domain.tables.pojos.MyMenu>> findManyByOwnerType(Collection<String> values, int limit) {
        return findManyByCondition(MyMenu.MY_MENU.OWNER_TYPE.in(values), limit);
    }

    /**
     * Find records that have <code>ACTIVE IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.runtime.tpl.domain.tables.pojos.MyMenu>> findManyByActive(Collection<Boolean> values) {
        return findManyByCondition(MyMenu.MY_MENU.ACTIVE.in(values));
    }

    /**
     * Find records that have <code>ACTIVE IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.runtime.tpl.domain.tables.pojos.MyMenu>> findManyByActive(Collection<Boolean> values, int limit) {
        return findManyByCondition(MyMenu.MY_MENU.ACTIVE.in(values), limit);
    }

    /**
     * Find records that have <code>SIGMA IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.runtime.tpl.domain.tables.pojos.MyMenu>> findManyBySigma(Collection<String> values) {
        return findManyByCondition(MyMenu.MY_MENU.SIGMA.in(values));
    }

    /**
     * Find records that have <code>SIGMA IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.runtime.tpl.domain.tables.pojos.MyMenu>> findManyBySigma(Collection<String> values, int limit) {
        return findManyByCondition(MyMenu.MY_MENU.SIGMA.in(values), limit);
    }

    /**
     * Find records that have <code>METADATA IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.runtime.tpl.domain.tables.pojos.MyMenu>> findManyByMetadata(Collection<String> values) {
        return findManyByCondition(MyMenu.MY_MENU.METADATA.in(values));
    }

    /**
     * Find records that have <code>METADATA IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.runtime.tpl.domain.tables.pojos.MyMenu>> findManyByMetadata(Collection<String> values, int limit) {
        return findManyByCondition(MyMenu.MY_MENU.METADATA.in(values), limit);
    }

    /**
     * Find records that have <code>LANGUAGE IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.runtime.tpl.domain.tables.pojos.MyMenu>> findManyByLanguage(Collection<String> values) {
        return findManyByCondition(MyMenu.MY_MENU.LANGUAGE.in(values));
    }

    /**
     * Find records that have <code>LANGUAGE IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.runtime.tpl.domain.tables.pojos.MyMenu>> findManyByLanguage(Collection<String> values, int limit) {
        return findManyByCondition(MyMenu.MY_MENU.LANGUAGE.in(values), limit);
    }

    /**
     * Find records that have <code>CREATED_AT IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.runtime.tpl.domain.tables.pojos.MyMenu>> findManyByCreatedAt(Collection<LocalDateTime> values) {
        return findManyByCondition(MyMenu.MY_MENU.CREATED_AT.in(values));
    }

    /**
     * Find records that have <code>CREATED_AT IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.runtime.tpl.domain.tables.pojos.MyMenu>> findManyByCreatedAt(Collection<LocalDateTime> values, int limit) {
        return findManyByCondition(MyMenu.MY_MENU.CREATED_AT.in(values), limit);
    }

    /**
     * Find records that have <code>CREATED_BY IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.runtime.tpl.domain.tables.pojos.MyMenu>> findManyByCreatedBy(Collection<String> values) {
        return findManyByCondition(MyMenu.MY_MENU.CREATED_BY.in(values));
    }

    /**
     * Find records that have <code>CREATED_BY IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.runtime.tpl.domain.tables.pojos.MyMenu>> findManyByCreatedBy(Collection<String> values, int limit) {
        return findManyByCondition(MyMenu.MY_MENU.CREATED_BY.in(values), limit);
    }

    /**
     * Find records that have <code>UPDATED_AT IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.runtime.tpl.domain.tables.pojos.MyMenu>> findManyByUpdatedAt(Collection<LocalDateTime> values) {
        return findManyByCondition(MyMenu.MY_MENU.UPDATED_AT.in(values));
    }

    /**
     * Find records that have <code>UPDATED_AT IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.runtime.tpl.domain.tables.pojos.MyMenu>> findManyByUpdatedAt(Collection<LocalDateTime> values, int limit) {
        return findManyByCondition(MyMenu.MY_MENU.UPDATED_AT.in(values), limit);
    }

    /**
     * Find records that have <code>UPDATED_BY IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.runtime.tpl.domain.tables.pojos.MyMenu>> findManyByUpdatedBy(Collection<String> values) {
        return findManyByCondition(MyMenu.MY_MENU.UPDATED_BY.in(values));
    }

    /**
     * Find records that have <code>UPDATED_BY IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.runtime.tpl.domain.tables.pojos.MyMenu>> findManyByUpdatedBy(Collection<String> values, int limit) {
        return findManyByCondition(MyMenu.MY_MENU.UPDATED_BY.in(values), limit);
    }

    @Override
    public JDBCClassicQueryExecutor<MyMenuRecord, io.zerows.extension.runtime.tpl.domain.tables.pojos.MyMenu, String> queryExecutor() {
        return (JDBCClassicQueryExecutor<MyMenuRecord, io.zerows.extension.runtime.tpl.domain.tables.pojos.MyMenu, String>) super.queryExecutor();
    }
}
