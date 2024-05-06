/*
 * This file is generated by jOOQ.
 */
package io.zerows.extension.commerce.rbac.domain.tables.daos;


import io.github.jklingsporn.vertx.jooq.classic.jdbc.JDBCClassicQueryExecutor;
import io.github.jklingsporn.vertx.jooq.shared.internal.AbstractVertxDAO;
import io.vertx.core.Future;
import io.zerows.extension.commerce.rbac.domain.tables.RGroupRole;
import io.zerows.extension.commerce.rbac.domain.tables.records.RGroupRoleRecord;
import org.jooq.Configuration;
import org.jooq.Record2;

import java.util.Collection;
import java.util.List;

/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({"all", "unchecked", "rawtypes"})
public class RGroupRoleDao extends AbstractVertxDAO<RGroupRoleRecord, io.zerows.extension.commerce.rbac.domain.tables.pojos.RGroupRole, Record2<String, String>, Future<List<io.zerows.extension.commerce.rbac.domain.tables.pojos.RGroupRole>>, Future<io.zerows.extension.commerce.rbac.domain.tables.pojos.RGroupRole>, Future<Integer>, Future<Record2<String, String>>> implements io.github.jklingsporn.vertx.jooq.classic.VertxDAO<RGroupRoleRecord, io.zerows.extension.commerce.rbac.domain.tables.pojos.RGroupRole, Record2<String, String>> {

    /**
     * @param configuration The Configuration used for rendering and query
     *                      execution.
     * @param vertx         the vertx instance
     */
    public RGroupRoleDao(Configuration configuration, io.vertx.core.Vertx vertx) {
        super(RGroupRole.R_GROUP_ROLE, io.zerows.extension.commerce.rbac.domain.tables.pojos.RGroupRole.class, new JDBCClassicQueryExecutor<RGroupRoleRecord, io.zerows.extension.commerce.rbac.domain.tables.pojos.RGroupRole, Record2<String, String>>(configuration, io.zerows.extension.commerce.rbac.domain.tables.pojos.RGroupRole.class, vertx));
    }

    @Override
    protected Record2<String, String> getId(io.zerows.extension.commerce.rbac.domain.tables.pojos.RGroupRole object) {
        return compositeKeyRecord(object.getGroupId(), object.getRoleId());
    }

    /**
     * Find records that have <code>ROLE_ID IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.commerce.rbac.domain.tables.pojos.RGroupRole>> findManyByRoleId(Collection<String> values) {
        return findManyByCondition(RGroupRole.R_GROUP_ROLE.ROLE_ID.in(values));
    }

    /**
     * Find records that have <code>ROLE_ID IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.commerce.rbac.domain.tables.pojos.RGroupRole>> findManyByRoleId(Collection<String> values, int limit) {
        return findManyByCondition(RGroupRole.R_GROUP_ROLE.ROLE_ID.in(values), limit);
    }

    /**
     * Find records that have <code>PRIORITY IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.commerce.rbac.domain.tables.pojos.RGroupRole>> findManyByPriority(Collection<Integer> values) {
        return findManyByCondition(RGroupRole.R_GROUP_ROLE.PRIORITY.in(values));
    }

    /**
     * Find records that have <code>PRIORITY IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.commerce.rbac.domain.tables.pojos.RGroupRole>> findManyByPriority(Collection<Integer> values, int limit) {
        return findManyByCondition(RGroupRole.R_GROUP_ROLE.PRIORITY.in(values), limit);
    }

    @Override
    public JDBCClassicQueryExecutor<RGroupRoleRecord, io.zerows.extension.commerce.rbac.domain.tables.pojos.RGroupRole, Record2<String, String>> queryExecutor() {
        return (JDBCClassicQueryExecutor<RGroupRoleRecord, io.zerows.extension.commerce.rbac.domain.tables.pojos.RGroupRole, Record2<String, String>>) super.queryExecutor();
    }
}
