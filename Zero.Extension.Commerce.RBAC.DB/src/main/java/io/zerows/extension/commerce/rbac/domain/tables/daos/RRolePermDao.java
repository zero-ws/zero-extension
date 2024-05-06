/*
 * This file is generated by jOOQ.
 */
package io.zerows.extension.commerce.rbac.domain.tables.daos;


import io.github.jklingsporn.vertx.jooq.classic.jdbc.JDBCClassicQueryExecutor;
import io.github.jklingsporn.vertx.jooq.shared.internal.AbstractVertxDAO;
import io.vertx.core.Future;
import io.zerows.extension.commerce.rbac.domain.tables.RRolePerm;
import io.zerows.extension.commerce.rbac.domain.tables.records.RRolePermRecord;
import org.jooq.Configuration;
import org.jooq.Record2;

import java.util.Collection;
import java.util.List;

/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({"all", "unchecked", "rawtypes"})
public class RRolePermDao extends AbstractVertxDAO<RRolePermRecord, io.zerows.extension.commerce.rbac.domain.tables.pojos.RRolePerm, Record2<String, String>, Future<List<io.zerows.extension.commerce.rbac.domain.tables.pojos.RRolePerm>>, Future<io.zerows.extension.commerce.rbac.domain.tables.pojos.RRolePerm>, Future<Integer>, Future<Record2<String, String>>> implements io.github.jklingsporn.vertx.jooq.classic.VertxDAO<RRolePermRecord, io.zerows.extension.commerce.rbac.domain.tables.pojos.RRolePerm, Record2<String, String>> {

    /**
     * @param configuration The Configuration used for rendering and query
     *                      execution.
     * @param vertx         the vertx instance
     */
    public RRolePermDao(Configuration configuration, io.vertx.core.Vertx vertx) {
        super(RRolePerm.R_ROLE_PERM, io.zerows.extension.commerce.rbac.domain.tables.pojos.RRolePerm.class, new JDBCClassicQueryExecutor<RRolePermRecord, io.zerows.extension.commerce.rbac.domain.tables.pojos.RRolePerm, Record2<String, String>>(configuration, io.zerows.extension.commerce.rbac.domain.tables.pojos.RRolePerm.class, vertx));
    }

    @Override
    protected Record2<String, String> getId(io.zerows.extension.commerce.rbac.domain.tables.pojos.RRolePerm object) {
        return compositeKeyRecord(object.getPermId(), object.getRoleId());
    }

    /**
     * Find records that have <code>ROLE_ID IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.commerce.rbac.domain.tables.pojos.RRolePerm>> findManyByRoleId(Collection<String> values) {
        return findManyByCondition(RRolePerm.R_ROLE_PERM.ROLE_ID.in(values));
    }

    /**
     * Find records that have <code>ROLE_ID IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.commerce.rbac.domain.tables.pojos.RRolePerm>> findManyByRoleId(Collection<String> values, int limit) {
        return findManyByCondition(RRolePerm.R_ROLE_PERM.ROLE_ID.in(values), limit);
    }

    @Override
    public JDBCClassicQueryExecutor<RRolePermRecord, io.zerows.extension.commerce.rbac.domain.tables.pojos.RRolePerm, Record2<String, String>> queryExecutor() {
        return (JDBCClassicQueryExecutor<RRolePermRecord, io.zerows.extension.commerce.rbac.domain.tables.pojos.RRolePerm, Record2<String, String>>) super.queryExecutor();
    }
}
