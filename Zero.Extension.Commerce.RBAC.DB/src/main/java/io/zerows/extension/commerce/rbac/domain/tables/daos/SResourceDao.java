/*
 * This file is generated by jOOQ.
 */
package io.zerows.extension.commerce.rbac.domain.tables.daos;


import io.github.jklingsporn.vertx.jooq.classic.jdbc.JDBCClassicQueryExecutor;
import io.github.jklingsporn.vertx.jooq.shared.internal.AbstractVertxDAO;
import io.vertx.core.Future;
import io.zerows.extension.commerce.rbac.domain.tables.SResource;
import io.zerows.extension.commerce.rbac.domain.tables.records.SResourceRecord;
import org.jooq.Configuration;

import java.time.LocalDateTime;
import java.util.Collection;
import java.util.List;

/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({"all", "unchecked", "rawtypes"})
public class SResourceDao extends AbstractVertxDAO<SResourceRecord, io.zerows.extension.commerce.rbac.domain.tables.pojos.SResource, String, Future<List<io.zerows.extension.commerce.rbac.domain.tables.pojos.SResource>>, Future<io.zerows.extension.commerce.rbac.domain.tables.pojos.SResource>, Future<Integer>, Future<String>> implements io.github.jklingsporn.vertx.jooq.classic.VertxDAO<SResourceRecord, io.zerows.extension.commerce.rbac.domain.tables.pojos.SResource, String> {

    /**
     * @param configuration The Configuration used for rendering and query
     *                      execution.
     * @param vertx         the vertx instance
     */
    public SResourceDao(Configuration configuration, io.vertx.core.Vertx vertx) {
        super(SResource.S_RESOURCE, io.zerows.extension.commerce.rbac.domain.tables.pojos.SResource.class, new JDBCClassicQueryExecutor<SResourceRecord, io.zerows.extension.commerce.rbac.domain.tables.pojos.SResource, String>(configuration, io.zerows.extension.commerce.rbac.domain.tables.pojos.SResource.class, vertx));
    }

    @Override
    protected String getId(io.zerows.extension.commerce.rbac.domain.tables.pojos.SResource object) {
        return object.getKey();
    }

    /**
     * Find records that have <code>CODE IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.commerce.rbac.domain.tables.pojos.SResource>> findManyByCode(Collection<String> values) {
        return findManyByCondition(SResource.S_RESOURCE.CODE.in(values));
    }

    /**
     * Find records that have <code>CODE IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.commerce.rbac.domain.tables.pojos.SResource>> findManyByCode(Collection<String> values, int limit) {
        return findManyByCondition(SResource.S_RESOURCE.CODE.in(values), limit);
    }

    /**
     * Find records that have <code>NAME IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.commerce.rbac.domain.tables.pojos.SResource>> findManyByName(Collection<String> values) {
        return findManyByCondition(SResource.S_RESOURCE.NAME.in(values));
    }

    /**
     * Find records that have <code>NAME IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.commerce.rbac.domain.tables.pojos.SResource>> findManyByName(Collection<String> values, int limit) {
        return findManyByCondition(SResource.S_RESOURCE.NAME.in(values), limit);
    }

    /**
     * Find records that have <code>TYPE IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.commerce.rbac.domain.tables.pojos.SResource>> findManyByType(Collection<String> values) {
        return findManyByCondition(SResource.S_RESOURCE.TYPE.in(values));
    }

    /**
     * Find records that have <code>TYPE IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.commerce.rbac.domain.tables.pojos.SResource>> findManyByType(Collection<String> values, int limit) {
        return findManyByCondition(SResource.S_RESOURCE.TYPE.in(values), limit);
    }

    /**
     * Find records that have <code>IDENTIFIER IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.commerce.rbac.domain.tables.pojos.SResource>> findManyByIdentifier(Collection<String> values) {
        return findManyByCondition(SResource.S_RESOURCE.IDENTIFIER.in(values));
    }

    /**
     * Find records that have <code>IDENTIFIER IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.commerce.rbac.domain.tables.pojos.SResource>> findManyByIdentifier(Collection<String> values, int limit) {
        return findManyByCondition(SResource.S_RESOURCE.IDENTIFIER.in(values), limit);
    }

    /**
     * Find records that have <code>COMMENT IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.commerce.rbac.domain.tables.pojos.SResource>> findManyByComment(Collection<String> values) {
        return findManyByCondition(SResource.S_RESOURCE.COMMENT.in(values));
    }

    /**
     * Find records that have <code>COMMENT IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.commerce.rbac.domain.tables.pojos.SResource>> findManyByComment(Collection<String> values, int limit) {
        return findManyByCondition(SResource.S_RESOURCE.COMMENT.in(values), limit);
    }

    /**
     * Find records that have <code>LEVEL IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.commerce.rbac.domain.tables.pojos.SResource>> findManyByLevel(Collection<Integer> values) {
        return findManyByCondition(SResource.S_RESOURCE.LEVEL.in(values));
    }

    /**
     * Find records that have <code>LEVEL IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.commerce.rbac.domain.tables.pojos.SResource>> findManyByLevel(Collection<Integer> values, int limit) {
        return findManyByCondition(SResource.S_RESOURCE.LEVEL.in(values), limit);
    }

    /**
     * Find records that have <code>MODE_ROLE IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.commerce.rbac.domain.tables.pojos.SResource>> findManyByModeRole(Collection<String> values) {
        return findManyByCondition(SResource.S_RESOURCE.MODE_ROLE.in(values));
    }

    /**
     * Find records that have <code>MODE_ROLE IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.commerce.rbac.domain.tables.pojos.SResource>> findManyByModeRole(Collection<String> values, int limit) {
        return findManyByCondition(SResource.S_RESOURCE.MODE_ROLE.in(values), limit);
    }

    /**
     * Find records that have <code>MODE_GROUP IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.commerce.rbac.domain.tables.pojos.SResource>> findManyByModeGroup(Collection<String> values) {
        return findManyByCondition(SResource.S_RESOURCE.MODE_GROUP.in(values));
    }

    /**
     * Find records that have <code>MODE_GROUP IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.commerce.rbac.domain.tables.pojos.SResource>> findManyByModeGroup(Collection<String> values, int limit) {
        return findManyByCondition(SResource.S_RESOURCE.MODE_GROUP.in(values), limit);
    }

    /**
     * Find records that have <code>MODE_TREE IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.commerce.rbac.domain.tables.pojos.SResource>> findManyByModeTree(Collection<String> values) {
        return findManyByCondition(SResource.S_RESOURCE.MODE_TREE.in(values));
    }

    /**
     * Find records that have <code>MODE_TREE IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.commerce.rbac.domain.tables.pojos.SResource>> findManyByModeTree(Collection<String> values, int limit) {
        return findManyByCondition(SResource.S_RESOURCE.MODE_TREE.in(values), limit);
    }

    /**
     * Find records that have <code>VIRTUAL IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.commerce.rbac.domain.tables.pojos.SResource>> findManyByVirtual(Collection<Boolean> values) {
        return findManyByCondition(SResource.S_RESOURCE.VIRTUAL.in(values));
    }

    /**
     * Find records that have <code>VIRTUAL IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.commerce.rbac.domain.tables.pojos.SResource>> findManyByVirtual(Collection<Boolean> values, int limit) {
        return findManyByCondition(SResource.S_RESOURCE.VIRTUAL.in(values), limit);
    }

    /**
     * Find records that have <code>SEEK_SYNTAX IN (values)</code>
     * asynchronously
     */
    public Future<List<io.zerows.extension.commerce.rbac.domain.tables.pojos.SResource>> findManyBySeekSyntax(Collection<String> values) {
        return findManyByCondition(SResource.S_RESOURCE.SEEK_SYNTAX.in(values));
    }

    /**
     * Find records that have <code>SEEK_SYNTAX IN (values)</code>
     * asynchronously limited by the given limit
     */
    public Future<List<io.zerows.extension.commerce.rbac.domain.tables.pojos.SResource>> findManyBySeekSyntax(Collection<String> values, int limit) {
        return findManyByCondition(SResource.S_RESOURCE.SEEK_SYNTAX.in(values), limit);
    }

    /**
     * Find records that have <code>SEEK_CONFIG IN (values)</code>
     * asynchronously
     */
    public Future<List<io.zerows.extension.commerce.rbac.domain.tables.pojos.SResource>> findManyBySeekConfig(Collection<String> values) {
        return findManyByCondition(SResource.S_RESOURCE.SEEK_CONFIG.in(values));
    }

    /**
     * Find records that have <code>SEEK_CONFIG IN (values)</code>
     * asynchronously limited by the given limit
     */
    public Future<List<io.zerows.extension.commerce.rbac.domain.tables.pojos.SResource>> findManyBySeekConfig(Collection<String> values, int limit) {
        return findManyByCondition(SResource.S_RESOURCE.SEEK_CONFIG.in(values), limit);
    }

    /**
     * Find records that have <code>SEEK_COMPONENT IN (values)</code>
     * asynchronously
     */
    public Future<List<io.zerows.extension.commerce.rbac.domain.tables.pojos.SResource>> findManyBySeekComponent(Collection<String> values) {
        return findManyByCondition(SResource.S_RESOURCE.SEEK_COMPONENT.in(values));
    }

    /**
     * Find records that have <code>SEEK_COMPONENT IN (values)</code>
     * asynchronously limited by the given limit
     */
    public Future<List<io.zerows.extension.commerce.rbac.domain.tables.pojos.SResource>> findManyBySeekComponent(Collection<String> values, int limit) {
        return findManyByCondition(SResource.S_RESOURCE.SEEK_COMPONENT.in(values), limit);
    }

    /**
     * Find records that have <code>SIGMA IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.commerce.rbac.domain.tables.pojos.SResource>> findManyBySigma(Collection<String> values) {
        return findManyByCondition(SResource.S_RESOURCE.SIGMA.in(values));
    }

    /**
     * Find records that have <code>SIGMA IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.commerce.rbac.domain.tables.pojos.SResource>> findManyBySigma(Collection<String> values, int limit) {
        return findManyByCondition(SResource.S_RESOURCE.SIGMA.in(values), limit);
    }

    /**
     * Find records that have <code>CATEGORY IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.commerce.rbac.domain.tables.pojos.SResource>> findManyByCategory(Collection<String> values) {
        return findManyByCondition(SResource.S_RESOURCE.CATEGORY.in(values));
    }

    /**
     * Find records that have <code>CATEGORY IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.commerce.rbac.domain.tables.pojos.SResource>> findManyByCategory(Collection<String> values, int limit) {
        return findManyByCondition(SResource.S_RESOURCE.CATEGORY.in(values), limit);
    }

    /**
     * Find records that have <code>LANGUAGE IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.commerce.rbac.domain.tables.pojos.SResource>> findManyByLanguage(Collection<String> values) {
        return findManyByCondition(SResource.S_RESOURCE.LANGUAGE.in(values));
    }

    /**
     * Find records that have <code>LANGUAGE IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.commerce.rbac.domain.tables.pojos.SResource>> findManyByLanguage(Collection<String> values, int limit) {
        return findManyByCondition(SResource.S_RESOURCE.LANGUAGE.in(values), limit);
    }

    /**
     * Find records that have <code>ACTIVE IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.commerce.rbac.domain.tables.pojos.SResource>> findManyByActive(Collection<Boolean> values) {
        return findManyByCondition(SResource.S_RESOURCE.ACTIVE.in(values));
    }

    /**
     * Find records that have <code>ACTIVE IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.commerce.rbac.domain.tables.pojos.SResource>> findManyByActive(Collection<Boolean> values, int limit) {
        return findManyByCondition(SResource.S_RESOURCE.ACTIVE.in(values), limit);
    }

    /**
     * Find records that have <code>METADATA IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.commerce.rbac.domain.tables.pojos.SResource>> findManyByMetadata(Collection<String> values) {
        return findManyByCondition(SResource.S_RESOURCE.METADATA.in(values));
    }

    /**
     * Find records that have <code>METADATA IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.commerce.rbac.domain.tables.pojos.SResource>> findManyByMetadata(Collection<String> values, int limit) {
        return findManyByCondition(SResource.S_RESOURCE.METADATA.in(values), limit);
    }

    /**
     * Find records that have <code>CREATED_AT IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.commerce.rbac.domain.tables.pojos.SResource>> findManyByCreatedAt(Collection<LocalDateTime> values) {
        return findManyByCondition(SResource.S_RESOURCE.CREATED_AT.in(values));
    }

    /**
     * Find records that have <code>CREATED_AT IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.commerce.rbac.domain.tables.pojos.SResource>> findManyByCreatedAt(Collection<LocalDateTime> values, int limit) {
        return findManyByCondition(SResource.S_RESOURCE.CREATED_AT.in(values), limit);
    }

    /**
     * Find records that have <code>CREATED_BY IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.commerce.rbac.domain.tables.pojos.SResource>> findManyByCreatedBy(Collection<String> values) {
        return findManyByCondition(SResource.S_RESOURCE.CREATED_BY.in(values));
    }

    /**
     * Find records that have <code>CREATED_BY IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.commerce.rbac.domain.tables.pojos.SResource>> findManyByCreatedBy(Collection<String> values, int limit) {
        return findManyByCondition(SResource.S_RESOURCE.CREATED_BY.in(values), limit);
    }

    /**
     * Find records that have <code>UPDATED_AT IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.commerce.rbac.domain.tables.pojos.SResource>> findManyByUpdatedAt(Collection<LocalDateTime> values) {
        return findManyByCondition(SResource.S_RESOURCE.UPDATED_AT.in(values));
    }

    /**
     * Find records that have <code>UPDATED_AT IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.commerce.rbac.domain.tables.pojos.SResource>> findManyByUpdatedAt(Collection<LocalDateTime> values, int limit) {
        return findManyByCondition(SResource.S_RESOURCE.UPDATED_AT.in(values), limit);
    }

    /**
     * Find records that have <code>UPDATED_BY IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.commerce.rbac.domain.tables.pojos.SResource>> findManyByUpdatedBy(Collection<String> values) {
        return findManyByCondition(SResource.S_RESOURCE.UPDATED_BY.in(values));
    }

    /**
     * Find records that have <code>UPDATED_BY IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.commerce.rbac.domain.tables.pojos.SResource>> findManyByUpdatedBy(Collection<String> values, int limit) {
        return findManyByCondition(SResource.S_RESOURCE.UPDATED_BY.in(values), limit);
    }

    @Override
    public JDBCClassicQueryExecutor<SResourceRecord, io.zerows.extension.commerce.rbac.domain.tables.pojos.SResource, String> queryExecutor() {
        return (JDBCClassicQueryExecutor<SResourceRecord, io.zerows.extension.commerce.rbac.domain.tables.pojos.SResource, String>) super.queryExecutor();
    }
}