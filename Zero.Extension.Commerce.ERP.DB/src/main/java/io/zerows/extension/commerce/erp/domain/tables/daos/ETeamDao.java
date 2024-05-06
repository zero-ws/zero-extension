/*
 * This file is generated by jOOQ.
 */
package io.zerows.extension.commerce.erp.domain.tables.daos;


import io.github.jklingsporn.vertx.jooq.classic.jdbc.JDBCClassicQueryExecutor;
import io.github.jklingsporn.vertx.jooq.shared.internal.AbstractVertxDAO;
import io.vertx.core.Future;
import io.zerows.extension.commerce.erp.domain.tables.ETeam;
import io.zerows.extension.commerce.erp.domain.tables.records.ETeamRecord;
import org.jooq.Configuration;

import java.time.LocalDateTime;
import java.util.Collection;
import java.util.List;

/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({"all", "unchecked", "rawtypes"})
public class ETeamDao extends AbstractVertxDAO<ETeamRecord, io.zerows.extension.commerce.erp.domain.tables.pojos.ETeam, String, Future<List<io.zerows.extension.commerce.erp.domain.tables.pojos.ETeam>>, Future<io.zerows.extension.commerce.erp.domain.tables.pojos.ETeam>, Future<Integer>, Future<String>> implements io.github.jklingsporn.vertx.jooq.classic.VertxDAO<ETeamRecord, io.zerows.extension.commerce.erp.domain.tables.pojos.ETeam, String> {

    /**
     * @param configuration The Configuration used for rendering and query
     *                      execution.
     * @param vertx         the vertx instance
     */
    public ETeamDao(Configuration configuration, io.vertx.core.Vertx vertx) {
        super(ETeam.E_TEAM, io.zerows.extension.commerce.erp.domain.tables.pojos.ETeam.class, new JDBCClassicQueryExecutor<ETeamRecord, io.zerows.extension.commerce.erp.domain.tables.pojos.ETeam, String>(configuration, io.zerows.extension.commerce.erp.domain.tables.pojos.ETeam.class, vertx));
    }

    @Override
    protected String getId(io.zerows.extension.commerce.erp.domain.tables.pojos.ETeam object) {
        return object.getKey();
    }

    /**
     * Find records that have <code>NAME IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.commerce.erp.domain.tables.pojos.ETeam>> findManyByName(Collection<String> values) {
        return findManyByCondition(ETeam.E_TEAM.NAME.in(values));
    }

    /**
     * Find records that have <code>NAME IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.commerce.erp.domain.tables.pojos.ETeam>> findManyByName(Collection<String> values, int limit) {
        return findManyByCondition(ETeam.E_TEAM.NAME.in(values), limit);
    }

    /**
     * Find records that have <code>CODE IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.commerce.erp.domain.tables.pojos.ETeam>> findManyByCode(Collection<String> values) {
        return findManyByCondition(ETeam.E_TEAM.CODE.in(values));
    }

    /**
     * Find records that have <code>CODE IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.commerce.erp.domain.tables.pojos.ETeam>> findManyByCode(Collection<String> values, int limit) {
        return findManyByCondition(ETeam.E_TEAM.CODE.in(values), limit);
    }

    /**
     * Find records that have <code>LEADER_ID IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.commerce.erp.domain.tables.pojos.ETeam>> findManyByLeaderId(Collection<String> values) {
        return findManyByCondition(ETeam.E_TEAM.LEADER_ID.in(values));
    }

    /**
     * Find records that have <code>LEADER_ID IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.commerce.erp.domain.tables.pojos.ETeam>> findManyByLeaderId(Collection<String> values, int limit) {
        return findManyByCondition(ETeam.E_TEAM.LEADER_ID.in(values), limit);
    }

    /**
     * Find records that have <code>LEADER_NAME IN (values)</code>
     * asynchronously
     */
    public Future<List<io.zerows.extension.commerce.erp.domain.tables.pojos.ETeam>> findManyByLeaderName(Collection<String> values) {
        return findManyByCondition(ETeam.E_TEAM.LEADER_NAME.in(values));
    }

    /**
     * Find records that have <code>LEADER_NAME IN (values)</code>
     * asynchronously limited by the given limit
     */
    public Future<List<io.zerows.extension.commerce.erp.domain.tables.pojos.ETeam>> findManyByLeaderName(Collection<String> values, int limit) {
        return findManyByCondition(ETeam.E_TEAM.LEADER_NAME.in(values), limit);
    }

    /**
     * Find records that have <code>DEPT_ID IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.commerce.erp.domain.tables.pojos.ETeam>> findManyByDeptId(Collection<String> values) {
        return findManyByCondition(ETeam.E_TEAM.DEPT_ID.in(values));
    }

    /**
     * Find records that have <code>DEPT_ID IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.commerce.erp.domain.tables.pojos.ETeam>> findManyByDeptId(Collection<String> values, int limit) {
        return findManyByCondition(ETeam.E_TEAM.DEPT_ID.in(values), limit);
    }

    /**
     * Find records that have <code>TEAM_ID IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.commerce.erp.domain.tables.pojos.ETeam>> findManyByTeamId(Collection<String> values) {
        return findManyByCondition(ETeam.E_TEAM.TEAM_ID.in(values));
    }

    /**
     * Find records that have <code>TEAM_ID IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.commerce.erp.domain.tables.pojos.ETeam>> findManyByTeamId(Collection<String> values, int limit) {
        return findManyByCondition(ETeam.E_TEAM.TEAM_ID.in(values), limit);
    }

    /**
     * Find records that have <code>COMMENT IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.commerce.erp.domain.tables.pojos.ETeam>> findManyByComment(Collection<String> values) {
        return findManyByCondition(ETeam.E_TEAM.COMMENT.in(values));
    }

    /**
     * Find records that have <code>COMMENT IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.commerce.erp.domain.tables.pojos.ETeam>> findManyByComment(Collection<String> values, int limit) {
        return findManyByCondition(ETeam.E_TEAM.COMMENT.in(values), limit);
    }

    /**
     * Find records that have <code>BIND_ID IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.commerce.erp.domain.tables.pojos.ETeam>> findManyByBindId(Collection<String> values) {
        return findManyByCondition(ETeam.E_TEAM.BIND_ID.in(values));
    }

    /**
     * Find records that have <code>BIND_ID IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.commerce.erp.domain.tables.pojos.ETeam>> findManyByBindId(Collection<String> values, int limit) {
        return findManyByCondition(ETeam.E_TEAM.BIND_ID.in(values), limit);
    }

    /**
     * Find records that have <code>BIND_COMPONENT IN (values)</code>
     * asynchronously
     */
    public Future<List<io.zerows.extension.commerce.erp.domain.tables.pojos.ETeam>> findManyByBindComponent(Collection<String> values) {
        return findManyByCondition(ETeam.E_TEAM.BIND_COMPONENT.in(values));
    }

    /**
     * Find records that have <code>BIND_COMPONENT IN (values)</code>
     * asynchronously limited by the given limit
     */
    public Future<List<io.zerows.extension.commerce.erp.domain.tables.pojos.ETeam>> findManyByBindComponent(Collection<String> values, int limit) {
        return findManyByCondition(ETeam.E_TEAM.BIND_COMPONENT.in(values), limit);
    }

    /**
     * Find records that have <code>BIND_CONFIG IN (values)</code>
     * asynchronously
     */
    public Future<List<io.zerows.extension.commerce.erp.domain.tables.pojos.ETeam>> findManyByBindConfig(Collection<String> values) {
        return findManyByCondition(ETeam.E_TEAM.BIND_CONFIG.in(values));
    }

    /**
     * Find records that have <code>BIND_CONFIG IN (values)</code>
     * asynchronously limited by the given limit
     */
    public Future<List<io.zerows.extension.commerce.erp.domain.tables.pojos.ETeam>> findManyByBindConfig(Collection<String> values, int limit) {
        return findManyByCondition(ETeam.E_TEAM.BIND_CONFIG.in(values), limit);
    }

    /**
     * Find records that have <code>METADATA IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.commerce.erp.domain.tables.pojos.ETeam>> findManyByMetadata(Collection<String> values) {
        return findManyByCondition(ETeam.E_TEAM.METADATA.in(values));
    }

    /**
     * Find records that have <code>METADATA IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.commerce.erp.domain.tables.pojos.ETeam>> findManyByMetadata(Collection<String> values, int limit) {
        return findManyByCondition(ETeam.E_TEAM.METADATA.in(values), limit);
    }

    /**
     * Find records that have <code>ACTIVE IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.commerce.erp.domain.tables.pojos.ETeam>> findManyByActive(Collection<Boolean> values) {
        return findManyByCondition(ETeam.E_TEAM.ACTIVE.in(values));
    }

    /**
     * Find records that have <code>ACTIVE IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.commerce.erp.domain.tables.pojos.ETeam>> findManyByActive(Collection<Boolean> values, int limit) {
        return findManyByCondition(ETeam.E_TEAM.ACTIVE.in(values), limit);
    }

    /**
     * Find records that have <code>SIGMA IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.commerce.erp.domain.tables.pojos.ETeam>> findManyBySigma(Collection<String> values) {
        return findManyByCondition(ETeam.E_TEAM.SIGMA.in(values));
    }

    /**
     * Find records that have <code>SIGMA IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.commerce.erp.domain.tables.pojos.ETeam>> findManyBySigma(Collection<String> values, int limit) {
        return findManyByCondition(ETeam.E_TEAM.SIGMA.in(values), limit);
    }

    /**
     * Find records that have <code>LANGUAGE IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.commerce.erp.domain.tables.pojos.ETeam>> findManyByLanguage(Collection<String> values) {
        return findManyByCondition(ETeam.E_TEAM.LANGUAGE.in(values));
    }

    /**
     * Find records that have <code>LANGUAGE IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.commerce.erp.domain.tables.pojos.ETeam>> findManyByLanguage(Collection<String> values, int limit) {
        return findManyByCondition(ETeam.E_TEAM.LANGUAGE.in(values), limit);
    }

    /**
     * Find records that have <code>CREATED_AT IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.commerce.erp.domain.tables.pojos.ETeam>> findManyByCreatedAt(Collection<LocalDateTime> values) {
        return findManyByCondition(ETeam.E_TEAM.CREATED_AT.in(values));
    }

    /**
     * Find records that have <code>CREATED_AT IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.commerce.erp.domain.tables.pojos.ETeam>> findManyByCreatedAt(Collection<LocalDateTime> values, int limit) {
        return findManyByCondition(ETeam.E_TEAM.CREATED_AT.in(values), limit);
    }

    /**
     * Find records that have <code>CREATED_BY IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.commerce.erp.domain.tables.pojos.ETeam>> findManyByCreatedBy(Collection<String> values) {
        return findManyByCondition(ETeam.E_TEAM.CREATED_BY.in(values));
    }

    /**
     * Find records that have <code>CREATED_BY IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.commerce.erp.domain.tables.pojos.ETeam>> findManyByCreatedBy(Collection<String> values, int limit) {
        return findManyByCondition(ETeam.E_TEAM.CREATED_BY.in(values), limit);
    }

    /**
     * Find records that have <code>UPDATED_AT IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.commerce.erp.domain.tables.pojos.ETeam>> findManyByUpdatedAt(Collection<LocalDateTime> values) {
        return findManyByCondition(ETeam.E_TEAM.UPDATED_AT.in(values));
    }

    /**
     * Find records that have <code>UPDATED_AT IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.commerce.erp.domain.tables.pojos.ETeam>> findManyByUpdatedAt(Collection<LocalDateTime> values, int limit) {
        return findManyByCondition(ETeam.E_TEAM.UPDATED_AT.in(values), limit);
    }

    /**
     * Find records that have <code>UPDATED_BY IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.commerce.erp.domain.tables.pojos.ETeam>> findManyByUpdatedBy(Collection<String> values) {
        return findManyByCondition(ETeam.E_TEAM.UPDATED_BY.in(values));
    }

    /**
     * Find records that have <code>UPDATED_BY IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.commerce.erp.domain.tables.pojos.ETeam>> findManyByUpdatedBy(Collection<String> values, int limit) {
        return findManyByCondition(ETeam.E_TEAM.UPDATED_BY.in(values), limit);
    }

    @Override
    public JDBCClassicQueryExecutor<ETeamRecord, io.zerows.extension.commerce.erp.domain.tables.pojos.ETeam, String> queryExecutor() {
        return (JDBCClassicQueryExecutor<ETeamRecord, io.zerows.extension.commerce.erp.domain.tables.pojos.ETeam, String>) super.queryExecutor();
    }
}
