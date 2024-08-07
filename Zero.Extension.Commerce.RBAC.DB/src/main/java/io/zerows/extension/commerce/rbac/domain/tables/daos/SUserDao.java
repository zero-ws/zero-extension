/*
 * This file is generated by jOOQ.
 */
package io.zerows.extension.commerce.rbac.domain.tables.daos;


import io.github.jklingsporn.vertx.jooq.shared.internal.AbstractVertxDAO;
import io.zerows.extension.commerce.rbac.domain.tables.SUser;
import io.zerows.extension.commerce.rbac.domain.tables.records.SUserRecord;

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
public class SUserDao extends AbstractVertxDAO<SUserRecord, io.zerows.extension.commerce.rbac.domain.tables.pojos.SUser, String, Future<List<io.zerows.extension.commerce.rbac.domain.tables.pojos.SUser>>, Future<io.zerows.extension.commerce.rbac.domain.tables.pojos.SUser>, Future<Integer>, Future<String>> implements io.github.jklingsporn.vertx.jooq.classic.VertxDAO<SUserRecord,io.zerows.extension.commerce.rbac.domain.tables.pojos.SUser,String> {

        /**
     * @param configuration The Configuration used for rendering and query
     * execution.
     * @param vertx the vertx instance
     */
        public SUserDao(Configuration configuration, io.vertx.core.Vertx vertx) {
                super(SUser.S_USER, io.zerows.extension.commerce.rbac.domain.tables.pojos.SUser.class, new JDBCClassicQueryExecutor<SUserRecord,io.zerows.extension.commerce.rbac.domain.tables.pojos.SUser,String>(configuration,io.zerows.extension.commerce.rbac.domain.tables.pojos.SUser.class,vertx));
        }

        @Override
        protected String getId(io.zerows.extension.commerce.rbac.domain.tables.pojos.SUser object) {
                return object.getKey();
        }

        /**
     * Find records that have <code>USERNAME IN (values)</code> asynchronously
     */
        public Future<List<io.zerows.extension.commerce.rbac.domain.tables.pojos.SUser>> findManyByUsername(Collection<String> values) {
                return findManyByCondition(SUser.S_USER.USERNAME.in(values));
        }

        /**
     * Find records that have <code>USERNAME IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<io.zerows.extension.commerce.rbac.domain.tables.pojos.SUser>> findManyByUsername(Collection<String> values, int limit) {
                return findManyByCondition(SUser.S_USER.USERNAME.in(values),limit);
        }

        /**
     * Find records that have <code>REALNAME IN (values)</code> asynchronously
     */
        public Future<List<io.zerows.extension.commerce.rbac.domain.tables.pojos.SUser>> findManyByRealname(Collection<String> values) {
                return findManyByCondition(SUser.S_USER.REALNAME.in(values));
        }

        /**
     * Find records that have <code>REALNAME IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<io.zerows.extension.commerce.rbac.domain.tables.pojos.SUser>> findManyByRealname(Collection<String> values, int limit) {
                return findManyByCondition(SUser.S_USER.REALNAME.in(values),limit);
        }

        /**
     * Find records that have <code>ALIAS IN (values)</code> asynchronously
     */
        public Future<List<io.zerows.extension.commerce.rbac.domain.tables.pojos.SUser>> findManyByAlias(Collection<String> values) {
                return findManyByCondition(SUser.S_USER.ALIAS.in(values));
        }

        /**
     * Find records that have <code>ALIAS IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<io.zerows.extension.commerce.rbac.domain.tables.pojos.SUser>> findManyByAlias(Collection<String> values, int limit) {
                return findManyByCondition(SUser.S_USER.ALIAS.in(values),limit);
        }

        /**
     * Find records that have <code>MOBILE IN (values)</code> asynchronously
     */
        public Future<List<io.zerows.extension.commerce.rbac.domain.tables.pojos.SUser>> findManyByMobile(Collection<String> values) {
                return findManyByCondition(SUser.S_USER.MOBILE.in(values));
        }

        /**
     * Find records that have <code>MOBILE IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<io.zerows.extension.commerce.rbac.domain.tables.pojos.SUser>> findManyByMobile(Collection<String> values, int limit) {
                return findManyByCondition(SUser.S_USER.MOBILE.in(values),limit);
        }

        /**
     * Find records that have <code>EMAIL IN (values)</code> asynchronously
     */
        public Future<List<io.zerows.extension.commerce.rbac.domain.tables.pojos.SUser>> findManyByEmail(Collection<String> values) {
                return findManyByCondition(SUser.S_USER.EMAIL.in(values));
        }

        /**
     * Find records that have <code>EMAIL IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<io.zerows.extension.commerce.rbac.domain.tables.pojos.SUser>> findManyByEmail(Collection<String> values, int limit) {
                return findManyByCondition(SUser.S_USER.EMAIL.in(values),limit);
        }

        /**
     * Find records that have <code>PASSWORD IN (values)</code> asynchronously
     */
        public Future<List<io.zerows.extension.commerce.rbac.domain.tables.pojos.SUser>> findManyByPassword(Collection<String> values) {
                return findManyByCondition(SUser.S_USER.PASSWORD.in(values));
        }

        /**
     * Find records that have <code>PASSWORD IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<io.zerows.extension.commerce.rbac.domain.tables.pojos.SUser>> findManyByPassword(Collection<String> values, int limit) {
                return findManyByCondition(SUser.S_USER.PASSWORD.in(values),limit);
        }

        /**
     * Find records that have <code>WECHAT IN (values)</code> asynchronously
     */
        public Future<List<io.zerows.extension.commerce.rbac.domain.tables.pojos.SUser>> findManyByWechat(Collection<String> values) {
                return findManyByCondition(SUser.S_USER.WECHAT.in(values));
        }

        /**
     * Find records that have <code>WECHAT IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<io.zerows.extension.commerce.rbac.domain.tables.pojos.SUser>> findManyByWechat(Collection<String> values, int limit) {
                return findManyByCondition(SUser.S_USER.WECHAT.in(values),limit);
        }

        /**
     * Find records that have <code>ALIPAY IN (values)</code> asynchronously
     */
        public Future<List<io.zerows.extension.commerce.rbac.domain.tables.pojos.SUser>> findManyByAlipay(Collection<String> values) {
                return findManyByCondition(SUser.S_USER.ALIPAY.in(values));
        }

        /**
     * Find records that have <code>ALIPAY IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<io.zerows.extension.commerce.rbac.domain.tables.pojos.SUser>> findManyByAlipay(Collection<String> values, int limit) {
                return findManyByCondition(SUser.S_USER.ALIPAY.in(values),limit);
        }

        /**
     * Find records that have <code>MODEL_ID IN (values)</code> asynchronously
     */
        public Future<List<io.zerows.extension.commerce.rbac.domain.tables.pojos.SUser>> findManyByModelId(Collection<String> values) {
                return findManyByCondition(SUser.S_USER.MODEL_ID.in(values));
        }

        /**
     * Find records that have <code>MODEL_ID IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<io.zerows.extension.commerce.rbac.domain.tables.pojos.SUser>> findManyByModelId(Collection<String> values, int limit) {
                return findManyByCondition(SUser.S_USER.MODEL_ID.in(values),limit);
        }

        /**
     * Find records that have <code>MODEL_KEY IN (values)</code> asynchronously
     */
        public Future<List<io.zerows.extension.commerce.rbac.domain.tables.pojos.SUser>> findManyByModelKey(Collection<String> values) {
                return findManyByCondition(SUser.S_USER.MODEL_KEY.in(values));
        }

        /**
     * Find records that have <code>MODEL_KEY IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<io.zerows.extension.commerce.rbac.domain.tables.pojos.SUser>> findManyByModelKey(Collection<String> values, int limit) {
                return findManyByCondition(SUser.S_USER.MODEL_KEY.in(values),limit);
        }

        /**
     * Find records that have <code>CATEGORY IN (values)</code> asynchronously
     */
        public Future<List<io.zerows.extension.commerce.rbac.domain.tables.pojos.SUser>> findManyByCategory(Collection<String> values) {
                return findManyByCondition(SUser.S_USER.CATEGORY.in(values));
        }

        /**
     * Find records that have <code>CATEGORY IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<io.zerows.extension.commerce.rbac.domain.tables.pojos.SUser>> findManyByCategory(Collection<String> values, int limit) {
                return findManyByCondition(SUser.S_USER.CATEGORY.in(values),limit);
        }

        /**
     * Find records that have <code>SIGMA IN (values)</code> asynchronously
     */
        public Future<List<io.zerows.extension.commerce.rbac.domain.tables.pojos.SUser>> findManyBySigma(Collection<String> values) {
                return findManyByCondition(SUser.S_USER.SIGMA.in(values));
        }

        /**
     * Find records that have <code>SIGMA IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<io.zerows.extension.commerce.rbac.domain.tables.pojos.SUser>> findManyBySigma(Collection<String> values, int limit) {
                return findManyByCondition(SUser.S_USER.SIGMA.in(values),limit);
        }

        /**
     * Find records that have <code>LANGUAGE IN (values)</code> asynchronously
     */
        public Future<List<io.zerows.extension.commerce.rbac.domain.tables.pojos.SUser>> findManyByLanguage(Collection<String> values) {
                return findManyByCondition(SUser.S_USER.LANGUAGE.in(values));
        }

        /**
     * Find records that have <code>LANGUAGE IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<io.zerows.extension.commerce.rbac.domain.tables.pojos.SUser>> findManyByLanguage(Collection<String> values, int limit) {
                return findManyByCondition(SUser.S_USER.LANGUAGE.in(values),limit);
        }

        /**
     * Find records that have <code>ACTIVE IN (values)</code> asynchronously
     */
        public Future<List<io.zerows.extension.commerce.rbac.domain.tables.pojos.SUser>> findManyByActive(Collection<Boolean> values) {
                return findManyByCondition(SUser.S_USER.ACTIVE.in(values));
        }

        /**
     * Find records that have <code>ACTIVE IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<io.zerows.extension.commerce.rbac.domain.tables.pojos.SUser>> findManyByActive(Collection<Boolean> values, int limit) {
                return findManyByCondition(SUser.S_USER.ACTIVE.in(values),limit);
        }

        /**
     * Find records that have <code>METADATA IN (values)</code> asynchronously
     */
        public Future<List<io.zerows.extension.commerce.rbac.domain.tables.pojos.SUser>> findManyByMetadata(Collection<String> values) {
                return findManyByCondition(SUser.S_USER.METADATA.in(values));
        }

        /**
     * Find records that have <code>METADATA IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<io.zerows.extension.commerce.rbac.domain.tables.pojos.SUser>> findManyByMetadata(Collection<String> values, int limit) {
                return findManyByCondition(SUser.S_USER.METADATA.in(values),limit);
        }

        /**
     * Find records that have <code>CREATED_AT IN (values)</code> asynchronously
     */
        public Future<List<io.zerows.extension.commerce.rbac.domain.tables.pojos.SUser>> findManyByCreatedAt(Collection<LocalDateTime> values) {
                return findManyByCondition(SUser.S_USER.CREATED_AT.in(values));
        }

        /**
     * Find records that have <code>CREATED_AT IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<io.zerows.extension.commerce.rbac.domain.tables.pojos.SUser>> findManyByCreatedAt(Collection<LocalDateTime> values, int limit) {
                return findManyByCondition(SUser.S_USER.CREATED_AT.in(values),limit);
        }

        /**
     * Find records that have <code>CREATED_BY IN (values)</code> asynchronously
     */
        public Future<List<io.zerows.extension.commerce.rbac.domain.tables.pojos.SUser>> findManyByCreatedBy(Collection<String> values) {
                return findManyByCondition(SUser.S_USER.CREATED_BY.in(values));
        }

        /**
     * Find records that have <code>CREATED_BY IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<io.zerows.extension.commerce.rbac.domain.tables.pojos.SUser>> findManyByCreatedBy(Collection<String> values, int limit) {
                return findManyByCondition(SUser.S_USER.CREATED_BY.in(values),limit);
        }

        /**
     * Find records that have <code>UPDATED_AT IN (values)</code> asynchronously
     */
        public Future<List<io.zerows.extension.commerce.rbac.domain.tables.pojos.SUser>> findManyByUpdatedAt(Collection<LocalDateTime> values) {
                return findManyByCondition(SUser.S_USER.UPDATED_AT.in(values));
        }

        /**
     * Find records that have <code>UPDATED_AT IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<io.zerows.extension.commerce.rbac.domain.tables.pojos.SUser>> findManyByUpdatedAt(Collection<LocalDateTime> values, int limit) {
                return findManyByCondition(SUser.S_USER.UPDATED_AT.in(values),limit);
        }

        /**
     * Find records that have <code>UPDATED_BY IN (values)</code> asynchronously
     */
        public Future<List<io.zerows.extension.commerce.rbac.domain.tables.pojos.SUser>> findManyByUpdatedBy(Collection<String> values) {
                return findManyByCondition(SUser.S_USER.UPDATED_BY.in(values));
        }

        /**
     * Find records that have <code>UPDATED_BY IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<io.zerows.extension.commerce.rbac.domain.tables.pojos.SUser>> findManyByUpdatedBy(Collection<String> values, int limit) {
                return findManyByCondition(SUser.S_USER.UPDATED_BY.in(values),limit);
        }

        @Override
        public JDBCClassicQueryExecutor<SUserRecord,io.zerows.extension.commerce.rbac.domain.tables.pojos.SUser,String> queryExecutor(){
                return (JDBCClassicQueryExecutor<SUserRecord,io.zerows.extension.commerce.rbac.domain.tables.pojos.SUser,String>) super.queryExecutor();
        }
}
