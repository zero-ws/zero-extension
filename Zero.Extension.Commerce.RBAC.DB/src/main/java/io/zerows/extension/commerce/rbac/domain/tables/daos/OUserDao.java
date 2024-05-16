/*
 * This file is generated by jOOQ.
 */
package io.zerows.extension.commerce.rbac.domain.tables.daos;


import io.github.jklingsporn.vertx.jooq.classic.jdbc.JDBCClassicQueryExecutor;
import io.github.jklingsporn.vertx.jooq.shared.internal.AbstractVertxDAO;
import io.vertx.core.Future;
import io.zerows.extension.commerce.rbac.domain.tables.OUser;
import io.zerows.extension.commerce.rbac.domain.tables.records.OUserRecord;
import org.jooq.Configuration;

import java.util.Collection;
import java.util.List;

/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({"all", "unchecked", "rawtypes"})
public class OUserDao extends AbstractVertxDAO<OUserRecord, io.zerows.extension.commerce.rbac.domain.tables.pojos.OUser, String, Future<List<io.zerows.extension.commerce.rbac.domain.tables.pojos.OUser>>, Future<io.zerows.extension.commerce.rbac.domain.tables.pojos.OUser>, Future<Integer>, Future<String>> implements io.github.jklingsporn.vertx.jooq.classic.VertxDAO<OUserRecord, io.zerows.extension.commerce.rbac.domain.tables.pojos.OUser, String> {

    /**
     * @param configuration The Configuration used for rendering and query
     *                      execution.
     * @param vertx         the vertx instance
     */
    public OUserDao(Configuration configuration, io.vertx.core.Vertx vertx) {
        super(OUser.O_USER, io.zerows.extension.commerce.rbac.domain.tables.pojos.OUser.class, new JDBCClassicQueryExecutor<OUserRecord, io.zerows.extension.commerce.rbac.domain.tables.pojos.OUser, String>(configuration, io.zerows.extension.commerce.rbac.domain.tables.pojos.OUser.class, vertx));
    }

    @Override
    protected String getId(io.zerows.extension.commerce.rbac.domain.tables.pojos.OUser object) {
        return object.getKey();
    }

    /**
     * Find records that have <code>REDIRECT_URI IN (values)</code>
     * asynchronously
     */
    public Future<List<io.zerows.extension.commerce.rbac.domain.tables.pojos.OUser>> findManyByRedirectUri(Collection<String> values) {
        return findManyByCondition(OUser.O_USER.REDIRECT_URI.in(values));
    }

    /**
     * Find records that have <code>REDIRECT_URI IN (values)</code>
     * asynchronously limited by the given limit
     */
    public Future<List<io.zerows.extension.commerce.rbac.domain.tables.pojos.OUser>> findManyByRedirectUri(Collection<String> values, int limit) {
        return findManyByCondition(OUser.O_USER.REDIRECT_URI.in(values), limit);
    }

    /**
     * Find records that have <code>CODE IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.commerce.rbac.domain.tables.pojos.OUser>> findManyByCode(Collection<String> values) {
        return findManyByCondition(OUser.O_USER.CODE.in(values));
    }

    /**
     * Find records that have <code>CODE IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.commerce.rbac.domain.tables.pojos.OUser>> findManyByCode(Collection<String> values, int limit) {
        return findManyByCondition(OUser.O_USER.CODE.in(values), limit);
    }

    /**
     * Find records that have <code>CLIENT_SECRET IN (values)</code>
     * asynchronously
     */
    public Future<List<io.zerows.extension.commerce.rbac.domain.tables.pojos.OUser>> findManyByClientSecret(Collection<String> values) {
        return findManyByCondition(OUser.O_USER.CLIENT_SECRET.in(values));
    }

    /**
     * Find records that have <code>CLIENT_SECRET IN (values)</code>
     * asynchronously limited by the given limit
     */
    public Future<List<io.zerows.extension.commerce.rbac.domain.tables.pojos.OUser>> findManyByClientSecret(Collection<String> values, int limit) {
        return findManyByCondition(OUser.O_USER.CLIENT_SECRET.in(values), limit);
    }

    /**
     * Find records that have <code>CLIENT_ID IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.commerce.rbac.domain.tables.pojos.OUser>> findManyByClientId(Collection<String> values) {
        return findManyByCondition(OUser.O_USER.CLIENT_ID.in(values));
    }

    /**
     * Find records that have <code>CLIENT_ID IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.commerce.rbac.domain.tables.pojos.OUser>> findManyByClientId(Collection<String> values, int limit) {
        return findManyByCondition(OUser.O_USER.CLIENT_ID.in(values), limit);
    }

    /**
     * Find records that have <code>GRANT_TYPE IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.commerce.rbac.domain.tables.pojos.OUser>> findManyByGrantType(Collection<String> values) {
        return findManyByCondition(OUser.O_USER.GRANT_TYPE.in(values));
    }

    /**
     * Find records that have <code>GRANT_TYPE IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.commerce.rbac.domain.tables.pojos.OUser>> findManyByGrantType(Collection<String> values, int limit) {
        return findManyByCondition(OUser.O_USER.GRANT_TYPE.in(values), limit);
    }

    /**
     * Find records that have <code>SCOPE IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.commerce.rbac.domain.tables.pojos.OUser>> findManyByScope(Collection<String> values) {
        return findManyByCondition(OUser.O_USER.SCOPE.in(values));
    }

    /**
     * Find records that have <code>SCOPE IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.commerce.rbac.domain.tables.pojos.OUser>> findManyByScope(Collection<String> values, int limit) {
        return findManyByCondition(OUser.O_USER.SCOPE.in(values), limit);
    }

    /**
     * Find records that have <code>STATE IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.commerce.rbac.domain.tables.pojos.OUser>> findManyByState(Collection<String> values) {
        return findManyByCondition(OUser.O_USER.STATE.in(values));
    }

    /**
     * Find records that have <code>STATE IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.commerce.rbac.domain.tables.pojos.OUser>> findManyByState(Collection<String> values, int limit) {
        return findManyByCondition(OUser.O_USER.STATE.in(values), limit);
    }

    /**
     * Find records that have <code>LANGUAGE IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.commerce.rbac.domain.tables.pojos.OUser>> findManyByLanguage(Collection<String> values) {
        return findManyByCondition(OUser.O_USER.LANGUAGE.in(values));
    }

    /**
     * Find records that have <code>LANGUAGE IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.commerce.rbac.domain.tables.pojos.OUser>> findManyByLanguage(Collection<String> values, int limit) {
        return findManyByCondition(OUser.O_USER.LANGUAGE.in(values), limit);
    }

    /**
     * Find records that have <code>ACTIVE IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.commerce.rbac.domain.tables.pojos.OUser>> findManyByActive(Collection<Boolean> values) {
        return findManyByCondition(OUser.O_USER.ACTIVE.in(values));
    }

    /**
     * Find records that have <code>ACTIVE IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.commerce.rbac.domain.tables.pojos.OUser>> findManyByActive(Collection<Boolean> values, int limit) {
        return findManyByCondition(OUser.O_USER.ACTIVE.in(values), limit);
    }

    /**
     * Find records that have <code>METADATA IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.commerce.rbac.domain.tables.pojos.OUser>> findManyByMetadata(Collection<String> values) {
        return findManyByCondition(OUser.O_USER.METADATA.in(values));
    }

    /**
     * Find records that have <code>METADATA IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.commerce.rbac.domain.tables.pojos.OUser>> findManyByMetadata(Collection<String> values, int limit) {
        return findManyByCondition(OUser.O_USER.METADATA.in(values), limit);
    }

    @Override
    public JDBCClassicQueryExecutor<OUserRecord, io.zerows.extension.commerce.rbac.domain.tables.pojos.OUser, String> queryExecutor() {
        return (JDBCClassicQueryExecutor<OUserRecord, io.zerows.extension.commerce.rbac.domain.tables.pojos.OUser, String>) super.queryExecutor();
    }
}