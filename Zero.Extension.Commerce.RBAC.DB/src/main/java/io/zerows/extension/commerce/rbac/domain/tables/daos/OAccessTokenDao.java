/*
 * This file is generated by jOOQ.
 */
package io.zerows.extension.commerce.rbac.domain.tables.daos;


import io.github.jklingsporn.vertx.jooq.shared.internal.AbstractVertxDAO;
import io.zerows.extension.commerce.rbac.domain.tables.OAccessToken;
import io.zerows.extension.commerce.rbac.domain.tables.records.OAccessTokenRecord;

import java.time.LocalDateTime;
import java.util.Collection;

import org.jooq.Configuration;


import java.util.List;
import io.vertx.core.Future;
import io.github.jklingsporn.vertx.jooq.classic.jdbc.JDBCClassicQueryExecutor;
/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class OAccessTokenDao extends AbstractVertxDAO<OAccessTokenRecord, io.zerows.extension.commerce.rbac.domain.tables.pojos.OAccessToken, String, Future<List<io.zerows.extension.commerce.rbac.domain.tables.pojos.OAccessToken>>, Future<io.zerows.extension.commerce.rbac.domain.tables.pojos.OAccessToken>, Future<Integer>, Future<String>> implements io.github.jklingsporn.vertx.jooq.classic.VertxDAO<OAccessTokenRecord,io.zerows.extension.commerce.rbac.domain.tables.pojos.OAccessToken,String> {

        /**
     * @param configuration The Configuration used for rendering and query
     * execution.
     * @param vertx the vertx instance
     */
        public OAccessTokenDao(Configuration configuration, io.vertx.core.Vertx vertx) {
                super(OAccessToken.O_ACCESS_TOKEN, io.zerows.extension.commerce.rbac.domain.tables.pojos.OAccessToken.class, new JDBCClassicQueryExecutor<OAccessTokenRecord,io.zerows.extension.commerce.rbac.domain.tables.pojos.OAccessToken,String>(configuration,io.zerows.extension.commerce.rbac.domain.tables.pojos.OAccessToken.class,vertx));
        }

        @Override
        protected String getId(io.zerows.extension.commerce.rbac.domain.tables.pojos.OAccessToken object) {
                return object.getKey();
        }

        /**
     * Find records that have <code>TOKEN IN (values)</code> asynchronously
     */
        public Future<List<io.zerows.extension.commerce.rbac.domain.tables.pojos.OAccessToken>> findManyByToken(Collection<byte[]> values) {
                return findManyByCondition(OAccessToken.O_ACCESS_TOKEN.TOKEN.in(values));
        }

        /**
     * Find records that have <code>TOKEN IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<io.zerows.extension.commerce.rbac.domain.tables.pojos.OAccessToken>> findManyByToken(Collection<byte[]> values, int limit) {
                return findManyByCondition(OAccessToken.O_ACCESS_TOKEN.TOKEN.in(values),limit);
        }

        /**
     * Find records that have <code>AUTH IN (values)</code> asynchronously
     */
        public Future<List<io.zerows.extension.commerce.rbac.domain.tables.pojos.OAccessToken>> findManyByAuth(Collection<byte[]> values) {
                return findManyByCondition(OAccessToken.O_ACCESS_TOKEN.AUTH.in(values));
        }

        /**
     * Find records that have <code>AUTH IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<io.zerows.extension.commerce.rbac.domain.tables.pojos.OAccessToken>> findManyByAuth(Collection<byte[]> values, int limit) {
                return findManyByCondition(OAccessToken.O_ACCESS_TOKEN.AUTH.in(values),limit);
        }

        /**
     * Find records that have <code>EXPIRED_TIME IN (values)</code>
     * asynchronously
     */
        public Future<List<io.zerows.extension.commerce.rbac.domain.tables.pojos.OAccessToken>> findManyByExpiredTime(Collection<Long> values) {
                return findManyByCondition(OAccessToken.O_ACCESS_TOKEN.EXPIRED_TIME.in(values));
        }

        /**
     * Find records that have <code>EXPIRED_TIME IN (values)</code>
     * asynchronously limited by the given limit
     */
        public Future<List<io.zerows.extension.commerce.rbac.domain.tables.pojos.OAccessToken>> findManyByExpiredTime(Collection<Long> values, int limit) {
                return findManyByCondition(OAccessToken.O_ACCESS_TOKEN.EXPIRED_TIME.in(values),limit);
        }

        /**
     * Find records that have <code>REFRESH_TOKEN IN (values)</code>
     * asynchronously
     */
        public Future<List<io.zerows.extension.commerce.rbac.domain.tables.pojos.OAccessToken>> findManyByRefreshToken(Collection<byte[]> values) {
                return findManyByCondition(OAccessToken.O_ACCESS_TOKEN.REFRESH_TOKEN.in(values));
        }

        /**
     * Find records that have <code>REFRESH_TOKEN IN (values)</code>
     * asynchronously limited by the given limit
     */
        public Future<List<io.zerows.extension.commerce.rbac.domain.tables.pojos.OAccessToken>> findManyByRefreshToken(Collection<byte[]> values, int limit) {
                return findManyByCondition(OAccessToken.O_ACCESS_TOKEN.REFRESH_TOKEN.in(values),limit);
        }

        /**
     * Find records that have <code>LANGUAGE IN (values)</code> asynchronously
     */
        public Future<List<io.zerows.extension.commerce.rbac.domain.tables.pojos.OAccessToken>> findManyByLanguage(Collection<String> values) {
                return findManyByCondition(OAccessToken.O_ACCESS_TOKEN.LANGUAGE.in(values));
        }

        /**
     * Find records that have <code>LANGUAGE IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<io.zerows.extension.commerce.rbac.domain.tables.pojos.OAccessToken>> findManyByLanguage(Collection<String> values, int limit) {
                return findManyByCondition(OAccessToken.O_ACCESS_TOKEN.LANGUAGE.in(values),limit);
        }

        /**
     * Find records that have <code>ACTIVE IN (values)</code> asynchronously
     */
        public Future<List<io.zerows.extension.commerce.rbac.domain.tables.pojos.OAccessToken>> findManyByActive(Collection<Boolean> values) {
                return findManyByCondition(OAccessToken.O_ACCESS_TOKEN.ACTIVE.in(values));
        }

        /**
     * Find records that have <code>ACTIVE IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<io.zerows.extension.commerce.rbac.domain.tables.pojos.OAccessToken>> findManyByActive(Collection<Boolean> values, int limit) {
                return findManyByCondition(OAccessToken.O_ACCESS_TOKEN.ACTIVE.in(values),limit);
        }

        /**
     * Find records that have <code>METADATA IN (values)</code> asynchronously
     */
        public Future<List<io.zerows.extension.commerce.rbac.domain.tables.pojos.OAccessToken>> findManyByMetadata(Collection<String> values) {
                return findManyByCondition(OAccessToken.O_ACCESS_TOKEN.METADATA.in(values));
        }

        /**
     * Find records that have <code>METADATA IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<io.zerows.extension.commerce.rbac.domain.tables.pojos.OAccessToken>> findManyByMetadata(Collection<String> values, int limit) {
                return findManyByCondition(OAccessToken.O_ACCESS_TOKEN.METADATA.in(values),limit);
        }

        /**
     * Find records that have <code>CREATED_AT IN (values)</code> asynchronously
     */
        public Future<List<io.zerows.extension.commerce.rbac.domain.tables.pojos.OAccessToken>> findManyByCreatedAt(Collection<LocalDateTime> values) {
                return findManyByCondition(OAccessToken.O_ACCESS_TOKEN.CREATED_AT.in(values));
        }

        /**
     * Find records that have <code>CREATED_AT IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<io.zerows.extension.commerce.rbac.domain.tables.pojos.OAccessToken>> findManyByCreatedAt(Collection<LocalDateTime> values, int limit) {
                return findManyByCondition(OAccessToken.O_ACCESS_TOKEN.CREATED_AT.in(values),limit);
        }

        /**
     * Find records that have <code>CREATED_BY IN (values)</code> asynchronously
     */
        public Future<List<io.zerows.extension.commerce.rbac.domain.tables.pojos.OAccessToken>> findManyByCreatedBy(Collection<String> values) {
                return findManyByCondition(OAccessToken.O_ACCESS_TOKEN.CREATED_BY.in(values));
        }

        /**
     * Find records that have <code>CREATED_BY IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<io.zerows.extension.commerce.rbac.domain.tables.pojos.OAccessToken>> findManyByCreatedBy(Collection<String> values, int limit) {
                return findManyByCondition(OAccessToken.O_ACCESS_TOKEN.CREATED_BY.in(values),limit);
        }

        @Override
        public JDBCClassicQueryExecutor<OAccessTokenRecord,io.zerows.extension.commerce.rbac.domain.tables.pojos.OAccessToken,String> queryExecutor(){
                return (JDBCClassicQueryExecutor<OAccessTokenRecord,io.zerows.extension.commerce.rbac.domain.tables.pojos.OAccessToken,String>) super.queryExecutor();
        }
}
