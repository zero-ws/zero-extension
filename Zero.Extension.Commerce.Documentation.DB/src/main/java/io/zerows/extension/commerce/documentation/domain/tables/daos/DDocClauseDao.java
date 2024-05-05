/*
 * This file is generated by jOOQ.
 */
package io.zerows.extension.commerce.documentation.domain.tables.daos;


import io.github.jklingsporn.vertx.jooq.classic.jdbc.JDBCClassicQueryExecutor;
import io.github.jklingsporn.vertx.jooq.shared.internal.AbstractVertxDAO;
import io.vertx.core.Future;
import io.zerows.extension.commerce.documentation.domain.tables.DDocClause;
import io.zerows.extension.commerce.documentation.domain.tables.records.DDocClauseRecord;
import org.jooq.Configuration;

import java.time.LocalDateTime;
import java.util.Collection;
import java.util.List;

/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({"all", "unchecked", "rawtypes"})
public class DDocClauseDao extends AbstractVertxDAO<DDocClauseRecord, io.zerows.extension.commerce.documentation.domain.tables.pojos.DDocClause, String, Future<List<io.zerows.extension.commerce.documentation.domain.tables.pojos.DDocClause>>, Future<io.zerows.extension.commerce.documentation.domain.tables.pojos.DDocClause>, Future<Integer>, Future<String>> implements io.github.jklingsporn.vertx.jooq.classic.VertxDAO<DDocClauseRecord, io.zerows.extension.commerce.documentation.domain.tables.pojos.DDocClause, String> {

    /**
     * @param configuration The Configuration used for rendering and query
     *                      execution.
     * @param vertx         the vertx instance
     */
    public DDocClauseDao(Configuration configuration, io.vertx.core.Vertx vertx) {
        super(DDocClause.D_DOC_CLAUSE, io.zerows.extension.commerce.documentation.domain.tables.pojos.DDocClause.class, new JDBCClassicQueryExecutor<DDocClauseRecord, io.zerows.extension.commerce.documentation.domain.tables.pojos.DDocClause, String>(configuration, io.zerows.extension.commerce.documentation.domain.tables.pojos.DDocClause.class, vertx));
    }

    @Override
    protected String getId(io.zerows.extension.commerce.documentation.domain.tables.pojos.DDocClause object) {
        return object.getKey();
    }

    /**
     * Find records that have <code>CODE IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.commerce.documentation.domain.tables.pojos.DDocClause>> findManyByCode(Collection<String> values) {
        return findManyByCondition(DDocClause.D_DOC_CLAUSE.CODE.in(values));
    }

    /**
     * Find records that have <code>CODE IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.commerce.documentation.domain.tables.pojos.DDocClause>> findManyByCode(Collection<String> values, int limit) {
        return findManyByCondition(DDocClause.D_DOC_CLAUSE.CODE.in(values), limit);
    }

    /**
     * Find records that have <code>PREFIX IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.commerce.documentation.domain.tables.pojos.DDocClause>> findManyByPrefix(Collection<String> values) {
        return findManyByCondition(DDocClause.D_DOC_CLAUSE.PREFIX.in(values));
    }

    /**
     * Find records that have <code>PREFIX IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.commerce.documentation.domain.tables.pojos.DDocClause>> findManyByPrefix(Collection<String> values, int limit) {
        return findManyByCondition(DDocClause.D_DOC_CLAUSE.PREFIX.in(values), limit);
    }

    /**
     * Find records that have <code>NAME IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.commerce.documentation.domain.tables.pojos.DDocClause>> findManyByName(Collection<String> values) {
        return findManyByCondition(DDocClause.D_DOC_CLAUSE.NAME.in(values));
    }

    /**
     * Find records that have <code>NAME IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.commerce.documentation.domain.tables.pojos.DDocClause>> findManyByName(Collection<String> values, int limit) {
        return findManyByCondition(DDocClause.D_DOC_CLAUSE.NAME.in(values), limit);
    }

    /**
     * Find records that have <code>TITLE IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.commerce.documentation.domain.tables.pojos.DDocClause>> findManyByTitle(Collection<String> values) {
        return findManyByCondition(DDocClause.D_DOC_CLAUSE.TITLE.in(values));
    }

    /**
     * Find records that have <code>TITLE IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.commerce.documentation.domain.tables.pojos.DDocClause>> findManyByTitle(Collection<String> values, int limit) {
        return findManyByCondition(DDocClause.D_DOC_CLAUSE.TITLE.in(values), limit);
    }

    /**
     * Find records that have <code>TYPE IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.commerce.documentation.domain.tables.pojos.DDocClause>> findManyByType(Collection<String> values) {
        return findManyByCondition(DDocClause.D_DOC_CLAUSE.TYPE.in(values));
    }

    /**
     * Find records that have <code>TYPE IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.commerce.documentation.domain.tables.pojos.DDocClause>> findManyByType(Collection<String> values, int limit) {
        return findManyByCondition(DDocClause.D_DOC_CLAUSE.TYPE.in(values), limit);
    }

    /**
     * Find records that have <code>STATUS IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.commerce.documentation.domain.tables.pojos.DDocClause>> findManyByStatus(Collection<String> values) {
        return findManyByCondition(DDocClause.D_DOC_CLAUSE.STATUS.in(values));
    }

    /**
     * Find records that have <code>STATUS IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.commerce.documentation.domain.tables.pojos.DDocClause>> findManyByStatus(Collection<String> values, int limit) {
        return findManyByCondition(DDocClause.D_DOC_CLAUSE.STATUS.in(values), limit);
    }

    /**
     * Find records that have <code>CONTENT IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.commerce.documentation.domain.tables.pojos.DDocClause>> findManyByContent(Collection<String> values) {
        return findManyByCondition(DDocClause.D_DOC_CLAUSE.CONTENT.in(values));
    }

    /**
     * Find records that have <code>CONTENT IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.commerce.documentation.domain.tables.pojos.DDocClause>> findManyByContent(Collection<String> values, int limit) {
        return findManyByCondition(DDocClause.D_DOC_CLAUSE.CONTENT.in(values), limit);
    }

    /**
     * Find records that have <code>SOURCE IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.commerce.documentation.domain.tables.pojos.DDocClause>> findManyBySource(Collection<String> values) {
        return findManyByCondition(DDocClause.D_DOC_CLAUSE.SOURCE.in(values));
    }

    /**
     * Find records that have <code>SOURCE IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.commerce.documentation.domain.tables.pojos.DDocClause>> findManyBySource(Collection<String> values, int limit) {
        return findManyByCondition(DDocClause.D_DOC_CLAUSE.SOURCE.in(values), limit);
    }

    /**
     * Find records that have <code>SORT IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.commerce.documentation.domain.tables.pojos.DDocClause>> findManyBySort(Collection<Integer> values) {
        return findManyByCondition(DDocClause.D_DOC_CLAUSE.SORT.in(values));
    }

    /**
     * Find records that have <code>SORT IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.commerce.documentation.domain.tables.pojos.DDocClause>> findManyBySort(Collection<Integer> values, int limit) {
        return findManyByCondition(DDocClause.D_DOC_CLAUSE.SORT.in(values), limit);
    }

    /**
     * Find records that have <code>LEVEL IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.commerce.documentation.domain.tables.pojos.DDocClause>> findManyByLevel(Collection<Integer> values) {
        return findManyByCondition(DDocClause.D_DOC_CLAUSE.LEVEL.in(values));
    }

    /**
     * Find records that have <code>LEVEL IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.commerce.documentation.domain.tables.pojos.DDocClause>> findManyByLevel(Collection<Integer> values, int limit) {
        return findManyByCondition(DDocClause.D_DOC_CLAUSE.LEVEL.in(values), limit);
    }

    /**
     * Find records that have <code>PARENT_ID IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.commerce.documentation.domain.tables.pojos.DDocClause>> findManyByParentId(Collection<String> values) {
        return findManyByCondition(DDocClause.D_DOC_CLAUSE.PARENT_ID.in(values));
    }

    /**
     * Find records that have <code>PARENT_ID IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.commerce.documentation.domain.tables.pojos.DDocClause>> findManyByParentId(Collection<String> values, int limit) {
        return findManyByCondition(DDocClause.D_DOC_CLAUSE.PARENT_ID.in(values), limit);
    }

    /**
     * Find records that have <code>SIGMA IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.commerce.documentation.domain.tables.pojos.DDocClause>> findManyBySigma(Collection<String> values) {
        return findManyByCondition(DDocClause.D_DOC_CLAUSE.SIGMA.in(values));
    }

    /**
     * Find records that have <code>SIGMA IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.commerce.documentation.domain.tables.pojos.DDocClause>> findManyBySigma(Collection<String> values, int limit) {
        return findManyByCondition(DDocClause.D_DOC_CLAUSE.SIGMA.in(values), limit);
    }

    /**
     * Find records that have <code>LANGUAGE IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.commerce.documentation.domain.tables.pojos.DDocClause>> findManyByLanguage(Collection<String> values) {
        return findManyByCondition(DDocClause.D_DOC_CLAUSE.LANGUAGE.in(values));
    }

    /**
     * Find records that have <code>LANGUAGE IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.commerce.documentation.domain.tables.pojos.DDocClause>> findManyByLanguage(Collection<String> values, int limit) {
        return findManyByCondition(DDocClause.D_DOC_CLAUSE.LANGUAGE.in(values), limit);
    }

    /**
     * Find records that have <code>ACTIVE IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.commerce.documentation.domain.tables.pojos.DDocClause>> findManyByActive(Collection<Boolean> values) {
        return findManyByCondition(DDocClause.D_DOC_CLAUSE.ACTIVE.in(values));
    }

    /**
     * Find records that have <code>ACTIVE IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.commerce.documentation.domain.tables.pojos.DDocClause>> findManyByActive(Collection<Boolean> values, int limit) {
        return findManyByCondition(DDocClause.D_DOC_CLAUSE.ACTIVE.in(values), limit);
    }

    /**
     * Find records that have <code>METADATA IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.commerce.documentation.domain.tables.pojos.DDocClause>> findManyByMetadata(Collection<String> values) {
        return findManyByCondition(DDocClause.D_DOC_CLAUSE.METADATA.in(values));
    }

    /**
     * Find records that have <code>METADATA IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.commerce.documentation.domain.tables.pojos.DDocClause>> findManyByMetadata(Collection<String> values, int limit) {
        return findManyByCondition(DDocClause.D_DOC_CLAUSE.METADATA.in(values), limit);
    }

    /**
     * Find records that have <code>CREATED_AT IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.commerce.documentation.domain.tables.pojos.DDocClause>> findManyByCreatedAt(Collection<LocalDateTime> values) {
        return findManyByCondition(DDocClause.D_DOC_CLAUSE.CREATED_AT.in(values));
    }

    /**
     * Find records that have <code>CREATED_AT IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.commerce.documentation.domain.tables.pojos.DDocClause>> findManyByCreatedAt(Collection<LocalDateTime> values, int limit) {
        return findManyByCondition(DDocClause.D_DOC_CLAUSE.CREATED_AT.in(values), limit);
    }

    /**
     * Find records that have <code>CREATED_BY IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.commerce.documentation.domain.tables.pojos.DDocClause>> findManyByCreatedBy(Collection<String> values) {
        return findManyByCondition(DDocClause.D_DOC_CLAUSE.CREATED_BY.in(values));
    }

    /**
     * Find records that have <code>CREATED_BY IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.commerce.documentation.domain.tables.pojos.DDocClause>> findManyByCreatedBy(Collection<String> values, int limit) {
        return findManyByCondition(DDocClause.D_DOC_CLAUSE.CREATED_BY.in(values), limit);
    }

    /**
     * Find records that have <code>UPDATED_AT IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.commerce.documentation.domain.tables.pojos.DDocClause>> findManyByUpdatedAt(Collection<LocalDateTime> values) {
        return findManyByCondition(DDocClause.D_DOC_CLAUSE.UPDATED_AT.in(values));
    }

    /**
     * Find records that have <code>UPDATED_AT IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.commerce.documentation.domain.tables.pojos.DDocClause>> findManyByUpdatedAt(Collection<LocalDateTime> values, int limit) {
        return findManyByCondition(DDocClause.D_DOC_CLAUSE.UPDATED_AT.in(values), limit);
    }

    /**
     * Find records that have <code>UPDATED_BY IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.commerce.documentation.domain.tables.pojos.DDocClause>> findManyByUpdatedBy(Collection<String> values) {
        return findManyByCondition(DDocClause.D_DOC_CLAUSE.UPDATED_BY.in(values));
    }

    /**
     * Find records that have <code>UPDATED_BY IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.commerce.documentation.domain.tables.pojos.DDocClause>> findManyByUpdatedBy(Collection<String> values, int limit) {
        return findManyByCondition(DDocClause.D_DOC_CLAUSE.UPDATED_BY.in(values), limit);
    }

    @Override
    public JDBCClassicQueryExecutor<DDocClauseRecord, io.zerows.extension.commerce.documentation.domain.tables.pojos.DDocClause, String> queryExecutor() {
        return (JDBCClassicQueryExecutor<DDocClauseRecord, io.zerows.extension.commerce.documentation.domain.tables.pojos.DDocClause, String>) super.queryExecutor();
    }
}
