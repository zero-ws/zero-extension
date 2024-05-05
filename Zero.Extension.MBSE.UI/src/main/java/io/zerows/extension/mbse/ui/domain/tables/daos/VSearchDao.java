/*
 * This file is generated by jOOQ.
 */
package io.zerows.extension.mbse.ui.domain.tables.daos;


import io.github.jklingsporn.vertx.jooq.classic.jdbc.JDBCClassicQueryExecutor;
import io.github.jklingsporn.vertx.jooq.shared.internal.AbstractVertxDAO;
import io.vertx.core.Future;
import io.zerows.extension.mbse.ui.domain.tables.VSearch;
import io.zerows.extension.mbse.ui.domain.tables.records.VSearchRecord;
import org.jooq.Configuration;

import java.util.Collection;
import java.util.List;

/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({"all", "unchecked", "rawtypes"})
public class VSearchDao extends AbstractVertxDAO<VSearchRecord, io.zerows.extension.mbse.ui.domain.tables.pojos.VSearch, String, Future<List<io.zerows.extension.mbse.ui.domain.tables.pojos.VSearch>>, Future<io.zerows.extension.mbse.ui.domain.tables.pojos.VSearch>, Future<Integer>, Future<String>> implements io.github.jklingsporn.vertx.jooq.classic.VertxDAO<VSearchRecord, io.zerows.extension.mbse.ui.domain.tables.pojos.VSearch, String> {

    /**
     * @param configuration The Configuration used for rendering and query
     *                      execution.
     * @param vertx         the vertx instance
     */
    public VSearchDao(Configuration configuration, io.vertx.core.Vertx vertx) {
        super(VSearch.V_SEARCH, io.zerows.extension.mbse.ui.domain.tables.pojos.VSearch.class, new JDBCClassicQueryExecutor<VSearchRecord, io.zerows.extension.mbse.ui.domain.tables.pojos.VSearch, String>(configuration, io.zerows.extension.mbse.ui.domain.tables.pojos.VSearch.class, vertx));
    }

    @Override
    protected String getId(io.zerows.extension.mbse.ui.domain.tables.pojos.VSearch object) {
        return object.getKey();
    }

    /**
     * Find records that have <code>ENABLED IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.mbse.ui.domain.tables.pojos.VSearch>> findManyByEnabled(Collection<Boolean> values) {
        return findManyByCondition(VSearch.V_SEARCH.ENABLED.in(values));
    }

    /**
     * Find records that have <code>ENABLED IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.mbse.ui.domain.tables.pojos.VSearch>> findManyByEnabled(Collection<Boolean> values, int limit) {
        return findManyByCondition(VSearch.V_SEARCH.ENABLED.in(values), limit);
    }

    /**
     * Find records that have <code>ADVANCED IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.mbse.ui.domain.tables.pojos.VSearch>> findManyByAdvanced(Collection<Boolean> values) {
        return findManyByCondition(VSearch.V_SEARCH.ADVANCED.in(values));
    }

    /**
     * Find records that have <code>ADVANCED IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.mbse.ui.domain.tables.pojos.VSearch>> findManyByAdvanced(Collection<Boolean> values, int limit) {
        return findManyByCondition(VSearch.V_SEARCH.ADVANCED.in(values), limit);
    }

    /**
     * Find records that have <code>OP_REDO IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.mbse.ui.domain.tables.pojos.VSearch>> findManyByOpRedo(Collection<String> values) {
        return findManyByCondition(VSearch.V_SEARCH.OP_REDO.in(values));
    }

    /**
     * Find records that have <code>OP_REDO IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.mbse.ui.domain.tables.pojos.VSearch>> findManyByOpRedo(Collection<String> values, int limit) {
        return findManyByCondition(VSearch.V_SEARCH.OP_REDO.in(values), limit);
    }

    /**
     * Find records that have <code>OP_ADVANCED IN (values)</code>
     * asynchronously
     */
    public Future<List<io.zerows.extension.mbse.ui.domain.tables.pojos.VSearch>> findManyByOpAdvanced(Collection<String> values) {
        return findManyByCondition(VSearch.V_SEARCH.OP_ADVANCED.in(values));
    }

    /**
     * Find records that have <code>OP_ADVANCED IN (values)</code>
     * asynchronously limited by the given limit
     */
    public Future<List<io.zerows.extension.mbse.ui.domain.tables.pojos.VSearch>> findManyByOpAdvanced(Collection<String> values, int limit) {
        return findManyByCondition(VSearch.V_SEARCH.OP_ADVANCED.in(values), limit);
    }

    /**
     * Find records that have <code>OP_VIEW IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.mbse.ui.domain.tables.pojos.VSearch>> findManyByOpView(Collection<String> values) {
        return findManyByCondition(VSearch.V_SEARCH.OP_VIEW.in(values));
    }

    /**
     * Find records that have <code>OP_VIEW IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.mbse.ui.domain.tables.pojos.VSearch>> findManyByOpView(Collection<String> values, int limit) {
        return findManyByCondition(VSearch.V_SEARCH.OP_VIEW.in(values), limit);
    }

    /**
     * Find records that have <code>CONFIRM_CLEAR IN (values)</code>
     * asynchronously
     */
    public Future<List<io.zerows.extension.mbse.ui.domain.tables.pojos.VSearch>> findManyByConfirmClear(Collection<String> values) {
        return findManyByCondition(VSearch.V_SEARCH.CONFIRM_CLEAR.in(values));
    }

    /**
     * Find records that have <code>CONFIRM_CLEAR IN (values)</code>
     * asynchronously limited by the given limit
     */
    public Future<List<io.zerows.extension.mbse.ui.domain.tables.pojos.VSearch>> findManyByConfirmClear(Collection<String> values, int limit) {
        return findManyByCondition(VSearch.V_SEARCH.CONFIRM_CLEAR.in(values), limit);
    }

    /**
     * Find records that have <code>PLACEHOLDER IN (values)</code>
     * asynchronously
     */
    public Future<List<io.zerows.extension.mbse.ui.domain.tables.pojos.VSearch>> findManyByPlaceholder(Collection<String> values) {
        return findManyByCondition(VSearch.V_SEARCH.PLACEHOLDER.in(values));
    }

    /**
     * Find records that have <code>PLACEHOLDER IN (values)</code>
     * asynchronously limited by the given limit
     */
    public Future<List<io.zerows.extension.mbse.ui.domain.tables.pojos.VSearch>> findManyByPlaceholder(Collection<String> values, int limit) {
        return findManyByCondition(VSearch.V_SEARCH.PLACEHOLDER.in(values), limit);
    }

    /**
     * Find records that have <code>COND IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.mbse.ui.domain.tables.pojos.VSearch>> findManyByCond(Collection<String> values) {
        return findManyByCondition(VSearch.V_SEARCH.COND.in(values));
    }

    /**
     * Find records that have <code>COND IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.mbse.ui.domain.tables.pojos.VSearch>> findManyByCond(Collection<String> values, int limit) {
        return findManyByCondition(VSearch.V_SEARCH.COND.in(values), limit);
    }

    /**
     * Find records that have <code>ADVANCED_WIDTH IN (values)</code>
     * asynchronously
     */
    public Future<List<io.zerows.extension.mbse.ui.domain.tables.pojos.VSearch>> findManyByAdvancedWidth(Collection<String> values) {
        return findManyByCondition(VSearch.V_SEARCH.ADVANCED_WIDTH.in(values));
    }

    /**
     * Find records that have <code>ADVANCED_WIDTH IN (values)</code>
     * asynchronously limited by the given limit
     */
    public Future<List<io.zerows.extension.mbse.ui.domain.tables.pojos.VSearch>> findManyByAdvancedWidth(Collection<String> values, int limit) {
        return findManyByCondition(VSearch.V_SEARCH.ADVANCED_WIDTH.in(values), limit);
    }

    /**
     * Find records that have <code>ADVANCED_TITLE IN (values)</code>
     * asynchronously
     */
    public Future<List<io.zerows.extension.mbse.ui.domain.tables.pojos.VSearch>> findManyByAdvancedTitle(Collection<String> values) {
        return findManyByCondition(VSearch.V_SEARCH.ADVANCED_TITLE.in(values));
    }

    /**
     * Find records that have <code>ADVANCED_TITLE IN (values)</code>
     * asynchronously limited by the given limit
     */
    public Future<List<io.zerows.extension.mbse.ui.domain.tables.pojos.VSearch>> findManyByAdvancedTitle(Collection<String> values, int limit) {
        return findManyByCondition(VSearch.V_SEARCH.ADVANCED_TITLE.in(values), limit);
    }

    /**
     * Find records that have <code>ADVANCED_NOTICE IN (values)</code>
     * asynchronously
     */
    public Future<List<io.zerows.extension.mbse.ui.domain.tables.pojos.VSearch>> findManyByAdvancedNotice(Collection<String> values) {
        return findManyByCondition(VSearch.V_SEARCH.ADVANCED_NOTICE.in(values));
    }

    /**
     * Find records that have <code>ADVANCED_NOTICE IN (values)</code>
     * asynchronously limited by the given limit
     */
    public Future<List<io.zerows.extension.mbse.ui.domain.tables.pojos.VSearch>> findManyByAdvancedNotice(Collection<String> values, int limit) {
        return findManyByCondition(VSearch.V_SEARCH.ADVANCED_NOTICE.in(values), limit);
    }

    /**
     * Find records that have <code>ADVANCED_VIEW IN (values)</code>
     * asynchronously
     */
    public Future<List<io.zerows.extension.mbse.ui.domain.tables.pojos.VSearch>> findManyByAdvancedView(Collection<String> values) {
        return findManyByCondition(VSearch.V_SEARCH.ADVANCED_VIEW.in(values));
    }

    /**
     * Find records that have <code>ADVANCED_VIEW IN (values)</code>
     * asynchronously limited by the given limit
     */
    public Future<List<io.zerows.extension.mbse.ui.domain.tables.pojos.VSearch>> findManyByAdvancedView(Collection<String> values, int limit) {
        return findManyByCondition(VSearch.V_SEARCH.ADVANCED_VIEW.in(values), limit);
    }

    @Override
    public JDBCClassicQueryExecutor<VSearchRecord, io.zerows.extension.mbse.ui.domain.tables.pojos.VSearch, String> queryExecutor() {
        return (JDBCClassicQueryExecutor<VSearchRecord, io.zerows.extension.mbse.ui.domain.tables.pojos.VSearch, String>) super.queryExecutor();
    }
}
