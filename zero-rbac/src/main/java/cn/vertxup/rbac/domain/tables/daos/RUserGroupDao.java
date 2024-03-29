/*
 * This file is generated by jOOQ.
 */
package cn.vertxup.rbac.domain.tables.daos;


import cn.vertxup.rbac.domain.tables.RUserGroup;
import cn.vertxup.rbac.domain.tables.records.RUserGroupRecord;

import io.github.jklingsporn.vertx.jooq.shared.internal.AbstractVertxDAO;

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
public class RUserGroupDao extends AbstractVertxDAO<RUserGroupRecord, cn.vertxup.rbac.domain.tables.pojos.RUserGroup, Record2<String, String>, Future<List<cn.vertxup.rbac.domain.tables.pojos.RUserGroup>>, Future<cn.vertxup.rbac.domain.tables.pojos.RUserGroup>, Future<Integer>, Future<Record2<String, String>>> implements io.github.jklingsporn.vertx.jooq.classic.VertxDAO<RUserGroupRecord,cn.vertxup.rbac.domain.tables.pojos.RUserGroup,Record2<String, String>> {

        /**
     * @param configuration The Configuration used for rendering and query
     * execution.
     * @param vertx the vertx instance
     */
        public RUserGroupDao(Configuration configuration, io.vertx.core.Vertx vertx) {
                super(RUserGroup.R_USER_GROUP, cn.vertxup.rbac.domain.tables.pojos.RUserGroup.class, new JDBCClassicQueryExecutor<RUserGroupRecord,cn.vertxup.rbac.domain.tables.pojos.RUserGroup,Record2<String, String>>(configuration,cn.vertxup.rbac.domain.tables.pojos.RUserGroup.class,vertx));
        }

        @Override
        protected Record2<String, String> getId(cn.vertxup.rbac.domain.tables.pojos.RUserGroup object) {
                return compositeKeyRecord(object.getGroupId(), object.getUserId());
        }

        /**
     * Find records that have <code>USER_ID IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.rbac.domain.tables.pojos.RUserGroup>> findManyByUserId(Collection<String> values) {
                return findManyByCondition(RUserGroup.R_USER_GROUP.USER_ID.in(values));
        }

        /**
     * Find records that have <code>USER_ID IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.rbac.domain.tables.pojos.RUserGroup>> findManyByUserId(Collection<String> values, int limit) {
                return findManyByCondition(RUserGroup.R_USER_GROUP.USER_ID.in(values),limit);
        }

        /**
     * Find records that have <code>PRIORITY IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.rbac.domain.tables.pojos.RUserGroup>> findManyByPriority(Collection<Integer> values) {
                return findManyByCondition(RUserGroup.R_USER_GROUP.PRIORITY.in(values));
        }

        /**
     * Find records that have <code>PRIORITY IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.rbac.domain.tables.pojos.RUserGroup>> findManyByPriority(Collection<Integer> values, int limit) {
                return findManyByCondition(RUserGroup.R_USER_GROUP.PRIORITY.in(values),limit);
        }

        @Override
        public JDBCClassicQueryExecutor<RUserGroupRecord,cn.vertxup.rbac.domain.tables.pojos.RUserGroup,Record2<String, String>> queryExecutor(){
                return (JDBCClassicQueryExecutor<RUserGroupRecord,cn.vertxup.rbac.domain.tables.pojos.RUserGroup,Record2<String, String>>) super.queryExecutor();
        }
}
