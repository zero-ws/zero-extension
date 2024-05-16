/*
 * This file is generated by jOOQ.
 */
package io.zerows.extension.commerce.rbac.domain.tables.daos;


import io.github.jklingsporn.vertx.jooq.classic.jdbc.JDBCClassicQueryExecutor;
import io.github.jklingsporn.vertx.jooq.shared.internal.AbstractVertxDAO;
import io.vertx.core.Future;
import io.zerows.extension.commerce.rbac.domain.tables.SGroup;
import io.zerows.extension.commerce.rbac.domain.tables.records.SGroupRecord;
import org.jooq.Configuration;

import java.time.LocalDateTime;
import java.util.Collection;
import java.util.List;

/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({"all", "unchecked", "rawtypes"})
public class SGroupDao extends AbstractVertxDAO<SGroupRecord, io.zerows.extension.commerce.rbac.domain.tables.pojos.SGroup, String, Future<List<io.zerows.extension.commerce.rbac.domain.tables.pojos.SGroup>>, Future<io.zerows.extension.commerce.rbac.domain.tables.pojos.SGroup>, Future<Integer>, Future<String>> implements io.github.jklingsporn.vertx.jooq.classic.VertxDAO<SGroupRecord, io.zerows.extension.commerce.rbac.domain.tables.pojos.SGroup, String> {

    /**
     * @param configuration The Configuration used for rendering and query
     *                      execution.
     * @param vertx         the vertx instance
     */
    public SGroupDao(Configuration configuration, io.vertx.core.Vertx vertx) {
        super(SGroup.S_GROUP, io.zerows.extension.commerce.rbac.domain.tables.pojos.SGroup.class, new JDBCClassicQueryExecutor<SGroupRecord, io.zerows.extension.commerce.rbac.domain.tables.pojos.SGroup, String>(configuration, io.zerows.extension.commerce.rbac.domain.tables.pojos.SGroup.class, vertx));
    }

    @Override
    protected String getId(io.zerows.extension.commerce.rbac.domain.tables.pojos.SGroup object) {
        return object.getKey();
    }

    /**
     * Find records that have <code>NAME IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.commerce.rbac.domain.tables.pojos.SGroup>> findManyByName(Collection<String> values) {
        return findManyByCondition(SGroup.S_GROUP.NAME.in(values));
    }

    /**
     * Find records that have <code>NAME IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.commerce.rbac.domain.tables.pojos.SGroup>> findManyByName(Collection<String> values, int limit) {
        return findManyByCondition(SGroup.S_GROUP.NAME.in(values), limit);
    }

    /**
     * Find records that have <code>CODE IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.commerce.rbac.domain.tables.pojos.SGroup>> findManyByCode(Collection<String> values) {
        return findManyByCondition(SGroup.S_GROUP.CODE.in(values));
    }

    /**
     * Find records that have <code>CODE IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.commerce.rbac.domain.tables.pojos.SGroup>> findManyByCode(Collection<String> values, int limit) {
        return findManyByCondition(SGroup.S_GROUP.CODE.in(values), limit);
    }

    /**
     * Find records that have <code>PARENT_ID IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.commerce.rbac.domain.tables.pojos.SGroup>> findManyByParentId(Collection<String> values) {
        return findManyByCondition(SGroup.S_GROUP.PARENT_ID.in(values));
    }

    /**
     * Find records that have <code>PARENT_ID IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.commerce.rbac.domain.tables.pojos.SGroup>> findManyByParentId(Collection<String> values, int limit) {
        return findManyByCondition(SGroup.S_GROUP.PARENT_ID.in(values), limit);
    }

    /**
     * Find records that have <code>MODEL_ID IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.commerce.rbac.domain.tables.pojos.SGroup>> findManyByModelId(Collection<String> values) {
        return findManyByCondition(SGroup.S_GROUP.MODEL_ID.in(values));
    }

    /**
     * Find records that have <code>MODEL_ID IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.commerce.rbac.domain.tables.pojos.SGroup>> findManyByModelId(Collection<String> values, int limit) {
        return findManyByCondition(SGroup.S_GROUP.MODEL_ID.in(values), limit);
    }

    /**
     * Find records that have <code>MODEL_KEY IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.commerce.rbac.domain.tables.pojos.SGroup>> findManyByModelKey(Collection<String> values) {
        return findManyByCondition(SGroup.S_GROUP.MODEL_KEY.in(values));
    }

    /**
     * Find records that have <code>MODEL_KEY IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.commerce.rbac.domain.tables.pojos.SGroup>> findManyByModelKey(Collection<String> values, int limit) {
        return findManyByCondition(SGroup.S_GROUP.MODEL_KEY.in(values), limit);
    }

    /**
     * Find records that have <code>CATEGORY IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.commerce.rbac.domain.tables.pojos.SGroup>> findManyByCategory(Collection<String> values) {
        return findManyByCondition(SGroup.S_GROUP.CATEGORY.in(values));
    }

    /**
     * Find records that have <code>CATEGORY IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.commerce.rbac.domain.tables.pojos.SGroup>> findManyByCategory(Collection<String> values, int limit) {
        return findManyByCondition(SGroup.S_GROUP.CATEGORY.in(values), limit);
    }

    /**
     * Find records that have <code>SIGMA IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.commerce.rbac.domain.tables.pojos.SGroup>> findManyBySigma(Collection<String> values) {
        return findManyByCondition(SGroup.S_GROUP.SIGMA.in(values));
    }

    /**
     * Find records that have <code>SIGMA IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.commerce.rbac.domain.tables.pojos.SGroup>> findManyBySigma(Collection<String> values, int limit) {
        return findManyByCondition(SGroup.S_GROUP.SIGMA.in(values), limit);
    }

    /**
     * Find records that have <code>LANGUAGE IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.commerce.rbac.domain.tables.pojos.SGroup>> findManyByLanguage(Collection<String> values) {
        return findManyByCondition(SGroup.S_GROUP.LANGUAGE.in(values));
    }

    /**
     * Find records that have <code>LANGUAGE IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.commerce.rbac.domain.tables.pojos.SGroup>> findManyByLanguage(Collection<String> values, int limit) {
        return findManyByCondition(SGroup.S_GROUP.LANGUAGE.in(values), limit);
    }

    /**
     * Find records that have <code>ACTIVE IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.commerce.rbac.domain.tables.pojos.SGroup>> findManyByActive(Collection<Boolean> values) {
        return findManyByCondition(SGroup.S_GROUP.ACTIVE.in(values));
    }

    /**
     * Find records that have <code>ACTIVE IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.commerce.rbac.domain.tables.pojos.SGroup>> findManyByActive(Collection<Boolean> values, int limit) {
        return findManyByCondition(SGroup.S_GROUP.ACTIVE.in(values), limit);
    }

    /**
     * Find records that have <code>METADATA IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.commerce.rbac.domain.tables.pojos.SGroup>> findManyByMetadata(Collection<String> values) {
        return findManyByCondition(SGroup.S_GROUP.METADATA.in(values));
    }

    /**
     * Find records that have <code>METADATA IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.commerce.rbac.domain.tables.pojos.SGroup>> findManyByMetadata(Collection<String> values, int limit) {
        return findManyByCondition(SGroup.S_GROUP.METADATA.in(values), limit);
    }

    /**
     * Find records that have <code>CREATED_AT IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.commerce.rbac.domain.tables.pojos.SGroup>> findManyByCreatedAt(Collection<LocalDateTime> values) {
        return findManyByCondition(SGroup.S_GROUP.CREATED_AT.in(values));
    }

    /**
     * Find records that have <code>CREATED_AT IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.commerce.rbac.domain.tables.pojos.SGroup>> findManyByCreatedAt(Collection<LocalDateTime> values, int limit) {
        return findManyByCondition(SGroup.S_GROUP.CREATED_AT.in(values), limit);
    }

    /**
     * Find records that have <code>CREATED_BY IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.commerce.rbac.domain.tables.pojos.SGroup>> findManyByCreatedBy(Collection<String> values) {
        return findManyByCondition(SGroup.S_GROUP.CREATED_BY.in(values));
    }

    /**
     * Find records that have <code>CREATED_BY IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.commerce.rbac.domain.tables.pojos.SGroup>> findManyByCreatedBy(Collection<String> values, int limit) {
        return findManyByCondition(SGroup.S_GROUP.CREATED_BY.in(values), limit);
    }

    /**
     * Find records that have <code>UPDATED_AT IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.commerce.rbac.domain.tables.pojos.SGroup>> findManyByUpdatedAt(Collection<LocalDateTime> values) {
        return findManyByCondition(SGroup.S_GROUP.UPDATED_AT.in(values));
    }

    /**
     * Find records that have <code>UPDATED_AT IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.commerce.rbac.domain.tables.pojos.SGroup>> findManyByUpdatedAt(Collection<LocalDateTime> values, int limit) {
        return findManyByCondition(SGroup.S_GROUP.UPDATED_AT.in(values), limit);
    }

    /**
     * Find records that have <code>UPDATED_BY IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.commerce.rbac.domain.tables.pojos.SGroup>> findManyByUpdatedBy(Collection<String> values) {
        return findManyByCondition(SGroup.S_GROUP.UPDATED_BY.in(values));
    }

    /**
     * Find records that have <code>UPDATED_BY IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.commerce.rbac.domain.tables.pojos.SGroup>> findManyByUpdatedBy(Collection<String> values, int limit) {
        return findManyByCondition(SGroup.S_GROUP.UPDATED_BY.in(values), limit);
    }

    @Override
    public JDBCClassicQueryExecutor<SGroupRecord, io.zerows.extension.commerce.rbac.domain.tables.pojos.SGroup, String> queryExecutor() {
        return (JDBCClassicQueryExecutor<SGroupRecord, io.zerows.extension.commerce.rbac.domain.tables.pojos.SGroup, String>) super.queryExecutor();
    }
}