/*
 * This file is generated by jOOQ.
 */
package cn.vertxup.rbac.domain.tables.daos;


import cn.vertxup.rbac.domain.tables.SAction;
import cn.vertxup.rbac.domain.tables.records.SActionRecord;
import io.github.jklingsporn.vertx.jooq.classic.jdbc.JDBCClassicQueryExecutor;
import io.github.jklingsporn.vertx.jooq.shared.internal.AbstractVertxDAO;
import io.vertx.core.Future;
import org.jooq.Configuration;

import java.time.LocalDateTime;
import java.util.Collection;
import java.util.List;
/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class SActionDao extends AbstractVertxDAO<SActionRecord, cn.vertxup.rbac.domain.tables.pojos.SAction, String, Future<List<cn.vertxup.rbac.domain.tables.pojos.SAction>>, Future<cn.vertxup.rbac.domain.tables.pojos.SAction>, Future<Integer>, Future<String>> implements io.github.jklingsporn.vertx.jooq.classic.VertxDAO<SActionRecord,cn.vertxup.rbac.domain.tables.pojos.SAction,String> {

        /**
     * @param configuration The Configuration used for rendering and query
     * execution.
     * @param vertx the vertx instance
     */
        public SActionDao(Configuration configuration, io.vertx.core.Vertx vertx) {
                super(SAction.S_ACTION, cn.vertxup.rbac.domain.tables.pojos.SAction.class, new JDBCClassicQueryExecutor<SActionRecord,cn.vertxup.rbac.domain.tables.pojos.SAction,String>(configuration,cn.vertxup.rbac.domain.tables.pojos.SAction.class,vertx));
        }

        @Override
        protected String getId(cn.vertxup.rbac.domain.tables.pojos.SAction object) {
                return object.getKey();
        }

        /**
     * Find records that have <code>NAME IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.rbac.domain.tables.pojos.SAction>> findManyByName(Collection<String> values) {
                return findManyByCondition(SAction.S_ACTION.NAME.in(values));
        }

        /**
     * Find records that have <code>NAME IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.rbac.domain.tables.pojos.SAction>> findManyByName(Collection<String> values, int limit) {
                return findManyByCondition(SAction.S_ACTION.NAME.in(values),limit);
        }

        /**
     * Find records that have <code>CODE IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.rbac.domain.tables.pojos.SAction>> findManyByCode(Collection<String> values) {
                return findManyByCondition(SAction.S_ACTION.CODE.in(values));
        }

        /**
     * Find records that have <code>CODE IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.rbac.domain.tables.pojos.SAction>> findManyByCode(Collection<String> values, int limit) {
                return findManyByCondition(SAction.S_ACTION.CODE.in(values),limit);
        }

        /**
     * Find records that have <code>RESOURCE_ID IN (values)</code>
     * asynchronously
     */
        public Future<List<cn.vertxup.rbac.domain.tables.pojos.SAction>> findManyByResourceId(Collection<String> values) {
                return findManyByCondition(SAction.S_ACTION.RESOURCE_ID.in(values));
        }

        /**
     * Find records that have <code>RESOURCE_ID IN (values)</code>
     * asynchronously limited by the given limit
     */
        public Future<List<cn.vertxup.rbac.domain.tables.pojos.SAction>> findManyByResourceId(Collection<String> values, int limit) {
                return findManyByCondition(SAction.S_ACTION.RESOURCE_ID.in(values),limit);
        }

        /**
     * Find records that have <code>PERMISSION_ID IN (values)</code>
     * asynchronously
     */
        public Future<List<cn.vertxup.rbac.domain.tables.pojos.SAction>> findManyByPermissionId(Collection<String> values) {
                return findManyByCondition(SAction.S_ACTION.PERMISSION_ID.in(values));
        }

        /**
     * Find records that have <code>PERMISSION_ID IN (values)</code>
     * asynchronously limited by the given limit
     */
        public Future<List<cn.vertxup.rbac.domain.tables.pojos.SAction>> findManyByPermissionId(Collection<String> values, int limit) {
                return findManyByCondition(SAction.S_ACTION.PERMISSION_ID.in(values),limit);
        }

        /**
     * Find records that have <code>LEVEL IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.rbac.domain.tables.pojos.SAction>> findManyByLevel(Collection<Integer> values) {
                return findManyByCondition(SAction.S_ACTION.LEVEL.in(values));
        }

        /**
     * Find records that have <code>LEVEL IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.rbac.domain.tables.pojos.SAction>> findManyByLevel(Collection<Integer> values, int limit) {
                return findManyByCondition(SAction.S_ACTION.LEVEL.in(values),limit);
        }

        /**
     * Find records that have <code>URI IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.rbac.domain.tables.pojos.SAction>> findManyByUri(Collection<String> values) {
                return findManyByCondition(SAction.S_ACTION.URI.in(values));
        }

        /**
     * Find records that have <code>URI IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.rbac.domain.tables.pojos.SAction>> findManyByUri(Collection<String> values, int limit) {
                return findManyByCondition(SAction.S_ACTION.URI.in(values),limit);
        }

        /**
     * Find records that have <code>METHOD IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.rbac.domain.tables.pojos.SAction>> findManyByMethod(Collection<String> values) {
                return findManyByCondition(SAction.S_ACTION.METHOD.in(values));
        }

        /**
     * Find records that have <code>METHOD IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.rbac.domain.tables.pojos.SAction>> findManyByMethod(Collection<String> values, int limit) {
                return findManyByCondition(SAction.S_ACTION.METHOD.in(values),limit);
        }

        /**
     * Find records that have <code>SIGMA IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.rbac.domain.tables.pojos.SAction>> findManyBySigma(Collection<String> values) {
                return findManyByCondition(SAction.S_ACTION.SIGMA.in(values));
        }

        /**
     * Find records that have <code>SIGMA IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.rbac.domain.tables.pojos.SAction>> findManyBySigma(Collection<String> values, int limit) {
                return findManyByCondition(SAction.S_ACTION.SIGMA.in(values),limit);
        }

        /**
     * Find records that have <code>RENEWAL_CREDIT IN (values)</code>
     * asynchronously
     */
        public Future<List<cn.vertxup.rbac.domain.tables.pojos.SAction>> findManyByRenewalCredit(Collection<String> values) {
                return findManyByCondition(SAction.S_ACTION.RENEWAL_CREDIT.in(values));
        }

        /**
     * Find records that have <code>RENEWAL_CREDIT IN (values)</code>
     * asynchronously limited by the given limit
     */
        public Future<List<cn.vertxup.rbac.domain.tables.pojos.SAction>> findManyByRenewalCredit(Collection<String> values, int limit) {
                return findManyByCondition(SAction.S_ACTION.RENEWAL_CREDIT.in(values),limit);
        }

        /**
     * Find records that have <code>LANGUAGE IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.rbac.domain.tables.pojos.SAction>> findManyByLanguage(Collection<String> values) {
                return findManyByCondition(SAction.S_ACTION.LANGUAGE.in(values));
        }

        /**
     * Find records that have <code>LANGUAGE IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.rbac.domain.tables.pojos.SAction>> findManyByLanguage(Collection<String> values, int limit) {
                return findManyByCondition(SAction.S_ACTION.LANGUAGE.in(values),limit);
        }

        /**
     * Find records that have <code>ACTIVE IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.rbac.domain.tables.pojos.SAction>> findManyByActive(Collection<Boolean> values) {
                return findManyByCondition(SAction.S_ACTION.ACTIVE.in(values));
        }

        /**
     * Find records that have <code>ACTIVE IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.rbac.domain.tables.pojos.SAction>> findManyByActive(Collection<Boolean> values, int limit) {
                return findManyByCondition(SAction.S_ACTION.ACTIVE.in(values),limit);
        }

        /**
     * Find records that have <code>METADATA IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.rbac.domain.tables.pojos.SAction>> findManyByMetadata(Collection<String> values) {
                return findManyByCondition(SAction.S_ACTION.METADATA.in(values));
        }

        /**
     * Find records that have <code>METADATA IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.rbac.domain.tables.pojos.SAction>> findManyByMetadata(Collection<String> values, int limit) {
                return findManyByCondition(SAction.S_ACTION.METADATA.in(values),limit);
        }

        /**
     * Find records that have <code>COMMENT IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.rbac.domain.tables.pojos.SAction>> findManyByComment(Collection<String> values) {
                return findManyByCondition(SAction.S_ACTION.COMMENT.in(values));
        }

        /**
     * Find records that have <code>COMMENT IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.rbac.domain.tables.pojos.SAction>> findManyByComment(Collection<String> values, int limit) {
                return findManyByCondition(SAction.S_ACTION.COMMENT.in(values),limit);
        }

        /**
     * Find records that have <code>CREATED_AT IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.rbac.domain.tables.pojos.SAction>> findManyByCreatedAt(Collection<LocalDateTime> values) {
                return findManyByCondition(SAction.S_ACTION.CREATED_AT.in(values));
        }

        /**
     * Find records that have <code>CREATED_AT IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.rbac.domain.tables.pojos.SAction>> findManyByCreatedAt(Collection<LocalDateTime> values, int limit) {
                return findManyByCondition(SAction.S_ACTION.CREATED_AT.in(values),limit);
        }

        /**
     * Find records that have <code>CREATED_BY IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.rbac.domain.tables.pojos.SAction>> findManyByCreatedBy(Collection<String> values) {
                return findManyByCondition(SAction.S_ACTION.CREATED_BY.in(values));
        }

        /**
     * Find records that have <code>CREATED_BY IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.rbac.domain.tables.pojos.SAction>> findManyByCreatedBy(Collection<String> values, int limit) {
                return findManyByCondition(SAction.S_ACTION.CREATED_BY.in(values),limit);
        }

        /**
     * Find records that have <code>UPDATED_AT IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.rbac.domain.tables.pojos.SAction>> findManyByUpdatedAt(Collection<LocalDateTime> values) {
                return findManyByCondition(SAction.S_ACTION.UPDATED_AT.in(values));
        }

        /**
     * Find records that have <code>UPDATED_AT IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.rbac.domain.tables.pojos.SAction>> findManyByUpdatedAt(Collection<LocalDateTime> values, int limit) {
                return findManyByCondition(SAction.S_ACTION.UPDATED_AT.in(values),limit);
        }

        /**
     * Find records that have <code>UPDATED_BY IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.rbac.domain.tables.pojos.SAction>> findManyByUpdatedBy(Collection<String> values) {
                return findManyByCondition(SAction.S_ACTION.UPDATED_BY.in(values));
        }

        /**
     * Find records that have <code>UPDATED_BY IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.rbac.domain.tables.pojos.SAction>> findManyByUpdatedBy(Collection<String> values, int limit) {
                return findManyByCondition(SAction.S_ACTION.UPDATED_BY.in(values),limit);
        }

        @Override
        public JDBCClassicQueryExecutor<SActionRecord,cn.vertxup.rbac.domain.tables.pojos.SAction,String> queryExecutor(){
                return (JDBCClassicQueryExecutor<SActionRecord,cn.vertxup.rbac.domain.tables.pojos.SAction,String>) super.queryExecutor();
        }
}
