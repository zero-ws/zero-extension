/*
 * This file is generated by jOOQ.
 */
package io.zerows.extension.commerce.rbac.domain.tables.daos;


import io.github.jklingsporn.vertx.jooq.shared.internal.AbstractVertxDAO;
import io.zerows.extension.commerce.rbac.domain.tables.RUserRole;
import io.zerows.extension.commerce.rbac.domain.tables.records.RUserRoleRecord;

import java.util.Collection;

import org.jooq.Configuration;
import org.jooq.Record2;


import java.util.List;
import io.vertx.core.Future;
import io.github.jklingsporn.vertx.jooq.classic.jdbc.JDBCClassicQueryExecutor;
/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class RUserRoleDao extends AbstractVertxDAO<RUserRoleRecord, io.zerows.extension.commerce.rbac.domain.tables.pojos.RUserRole, Record2<String, String>, Future<List<io.zerows.extension.commerce.rbac.domain.tables.pojos.RUserRole>>, Future<io.zerows.extension.commerce.rbac.domain.tables.pojos.RUserRole>, Future<Integer>, Future<Record2<String, String>>> implements io.github.jklingsporn.vertx.jooq.classic.VertxDAO<RUserRoleRecord,io.zerows.extension.commerce.rbac.domain.tables.pojos.RUserRole,Record2<String, String>> {

        /**
     * @param configuration The Configuration used for rendering and query
     * execution.
     * @param vertx the vertx instance
     */
        public RUserRoleDao(Configuration configuration, io.vertx.core.Vertx vertx) {
                super(RUserRole.R_USER_ROLE, io.zerows.extension.commerce.rbac.domain.tables.pojos.RUserRole.class, new JDBCClassicQueryExecutor<RUserRoleRecord,io.zerows.extension.commerce.rbac.domain.tables.pojos.RUserRole,Record2<String, String>>(configuration,io.zerows.extension.commerce.rbac.domain.tables.pojos.RUserRole.class,vertx));
        }

        @Override
        protected Record2<String, String> getId(io.zerows.extension.commerce.rbac.domain.tables.pojos.RUserRole object) {
                return compositeKeyRecord(object.getUserId(), object.getRoleId());
        }

        /**
     * Find records that have <code>ROLE_ID IN (values)</code> asynchronously
     */
        public Future<List<io.zerows.extension.commerce.rbac.domain.tables.pojos.RUserRole>> findManyByRoleId(Collection<String> values) {
                return findManyByCondition(RUserRole.R_USER_ROLE.ROLE_ID.in(values));
        }

        /**
     * Find records that have <code>ROLE_ID IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<io.zerows.extension.commerce.rbac.domain.tables.pojos.RUserRole>> findManyByRoleId(Collection<String> values, int limit) {
                return findManyByCondition(RUserRole.R_USER_ROLE.ROLE_ID.in(values),limit);
        }

        /**
     * Find records that have <code>PRIORITY IN (values)</code> asynchronously
     */
        public Future<List<io.zerows.extension.commerce.rbac.domain.tables.pojos.RUserRole>> findManyByPriority(Collection<Integer> values) {
                return findManyByCondition(RUserRole.R_USER_ROLE.PRIORITY.in(values));
        }

        /**
     * Find records that have <code>PRIORITY IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<io.zerows.extension.commerce.rbac.domain.tables.pojos.RUserRole>> findManyByPriority(Collection<Integer> values, int limit) {
                return findManyByCondition(RUserRole.R_USER_ROLE.PRIORITY.in(values),limit);
        }

        @Override
        public JDBCClassicQueryExecutor<RUserRoleRecord,io.zerows.extension.commerce.rbac.domain.tables.pojos.RUserRole,Record2<String, String>> queryExecutor(){
                return (JDBCClassicQueryExecutor<RUserRoleRecord,io.zerows.extension.commerce.rbac.domain.tables.pojos.RUserRole,Record2<String, String>>) super.queryExecutor();
        }
}
