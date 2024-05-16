/*
 * This file is generated by jOOQ.
 */
package io.zerows.extension.mbse.basement.domain.tables.daos;


import io.github.jklingsporn.vertx.jooq.classic.jdbc.JDBCClassicQueryExecutor;
import io.github.jklingsporn.vertx.jooq.shared.internal.AbstractVertxDAO;
import io.vertx.core.Future;
import io.zerows.extension.mbse.basement.domain.tables.MRelation;
import io.zerows.extension.mbse.basement.domain.tables.records.MRelationRecord;
import org.jooq.Configuration;

import java.time.LocalDateTime;
import java.util.Collection;
import java.util.List;

/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({"all", "unchecked", "rawtypes"})
public class MRelationDao extends AbstractVertxDAO<MRelationRecord, io.zerows.extension.mbse.basement.domain.tables.pojos.MRelation, String, Future<List<io.zerows.extension.mbse.basement.domain.tables.pojos.MRelation>>, Future<io.zerows.extension.mbse.basement.domain.tables.pojos.MRelation>, Future<Integer>, Future<String>> implements io.github.jklingsporn.vertx.jooq.classic.VertxDAO<MRelationRecord, io.zerows.extension.mbse.basement.domain.tables.pojos.MRelation, String> {

    /**
     * @param configuration The Configuration used for rendering and query
     *                      execution.
     * @param vertx         the vertx instance
     */
    public MRelationDao(Configuration configuration, io.vertx.core.Vertx vertx) {
        super(MRelation.M_RELATION, io.zerows.extension.mbse.basement.domain.tables.pojos.MRelation.class, new JDBCClassicQueryExecutor<MRelationRecord, io.zerows.extension.mbse.basement.domain.tables.pojos.MRelation, String>(configuration, io.zerows.extension.mbse.basement.domain.tables.pojos.MRelation.class, vertx));
    }

    @Override
    protected String getId(io.zerows.extension.mbse.basement.domain.tables.pojos.MRelation object) {
        return object.getKey();
    }

    /**
     * Find records that have <code>TYPE IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.mbse.basement.domain.tables.pojos.MRelation>> findManyByType(Collection<String> values) {
        return findManyByCondition(MRelation.M_RELATION.TYPE.in(values));
    }

    /**
     * Find records that have <code>TYPE IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.mbse.basement.domain.tables.pojos.MRelation>> findManyByType(Collection<String> values, int limit) {
        return findManyByCondition(MRelation.M_RELATION.TYPE.in(values), limit);
    }

    /**
     * Find records that have <code>UPSTREAM IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.mbse.basement.domain.tables.pojos.MRelation>> findManyByUpstream(Collection<String> values) {
        return findManyByCondition(MRelation.M_RELATION.UPSTREAM.in(values));
    }

    /**
     * Find records that have <code>UPSTREAM IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.mbse.basement.domain.tables.pojos.MRelation>> findManyByUpstream(Collection<String> values, int limit) {
        return findManyByCondition(MRelation.M_RELATION.UPSTREAM.in(values), limit);
    }

    /**
     * Find records that have <code>DOWNSTREAM IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.mbse.basement.domain.tables.pojos.MRelation>> findManyByDownstream(Collection<String> values) {
        return findManyByCondition(MRelation.M_RELATION.DOWNSTREAM.in(values));
    }

    /**
     * Find records that have <code>DOWNSTREAM IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.mbse.basement.domain.tables.pojos.MRelation>> findManyByDownstream(Collection<String> values, int limit) {
        return findManyByCondition(MRelation.M_RELATION.DOWNSTREAM.in(values), limit);
    }

    /**
     * Find records that have <code>COMMENTS IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.mbse.basement.domain.tables.pojos.MRelation>> findManyByComments(Collection<String> values) {
        return findManyByCondition(MRelation.M_RELATION.COMMENTS.in(values));
    }

    /**
     * Find records that have <code>COMMENTS IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.mbse.basement.domain.tables.pojos.MRelation>> findManyByComments(Collection<String> values, int limit) {
        return findManyByCondition(MRelation.M_RELATION.COMMENTS.in(values), limit);
    }

    /**
     * Find records that have <code>SIGMA IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.mbse.basement.domain.tables.pojos.MRelation>> findManyBySigma(Collection<String> values) {
        return findManyByCondition(MRelation.M_RELATION.SIGMA.in(values));
    }

    /**
     * Find records that have <code>SIGMA IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.mbse.basement.domain.tables.pojos.MRelation>> findManyBySigma(Collection<String> values, int limit) {
        return findManyByCondition(MRelation.M_RELATION.SIGMA.in(values), limit);
    }

    /**
     * Find records that have <code>LANGUAGE IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.mbse.basement.domain.tables.pojos.MRelation>> findManyByLanguage(Collection<String> values) {
        return findManyByCondition(MRelation.M_RELATION.LANGUAGE.in(values));
    }

    /**
     * Find records that have <code>LANGUAGE IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.mbse.basement.domain.tables.pojos.MRelation>> findManyByLanguage(Collection<String> values, int limit) {
        return findManyByCondition(MRelation.M_RELATION.LANGUAGE.in(values), limit);
    }

    /**
     * Find records that have <code>ACTIVE IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.mbse.basement.domain.tables.pojos.MRelation>> findManyByActive(Collection<Boolean> values) {
        return findManyByCondition(MRelation.M_RELATION.ACTIVE.in(values));
    }

    /**
     * Find records that have <code>ACTIVE IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.mbse.basement.domain.tables.pojos.MRelation>> findManyByActive(Collection<Boolean> values, int limit) {
        return findManyByCondition(MRelation.M_RELATION.ACTIVE.in(values), limit);
    }

    /**
     * Find records that have <code>METADATA IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.mbse.basement.domain.tables.pojos.MRelation>> findManyByMetadata(Collection<String> values) {
        return findManyByCondition(MRelation.M_RELATION.METADATA.in(values));
    }

    /**
     * Find records that have <code>METADATA IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.mbse.basement.domain.tables.pojos.MRelation>> findManyByMetadata(Collection<String> values, int limit) {
        return findManyByCondition(MRelation.M_RELATION.METADATA.in(values), limit);
    }

    /**
     * Find records that have <code>CREATED_AT IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.mbse.basement.domain.tables.pojos.MRelation>> findManyByCreatedAt(Collection<LocalDateTime> values) {
        return findManyByCondition(MRelation.M_RELATION.CREATED_AT.in(values));
    }

    /**
     * Find records that have <code>CREATED_AT IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.mbse.basement.domain.tables.pojos.MRelation>> findManyByCreatedAt(Collection<LocalDateTime> values, int limit) {
        return findManyByCondition(MRelation.M_RELATION.CREATED_AT.in(values), limit);
    }

    /**
     * Find records that have <code>CREATED_BY IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.mbse.basement.domain.tables.pojos.MRelation>> findManyByCreatedBy(Collection<String> values) {
        return findManyByCondition(MRelation.M_RELATION.CREATED_BY.in(values));
    }

    /**
     * Find records that have <code>CREATED_BY IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.mbse.basement.domain.tables.pojos.MRelation>> findManyByCreatedBy(Collection<String> values, int limit) {
        return findManyByCondition(MRelation.M_RELATION.CREATED_BY.in(values), limit);
    }

    /**
     * Find records that have <code>UPDATED_AT IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.mbse.basement.domain.tables.pojos.MRelation>> findManyByUpdatedAt(Collection<LocalDateTime> values) {
        return findManyByCondition(MRelation.M_RELATION.UPDATED_AT.in(values));
    }

    /**
     * Find records that have <code>UPDATED_AT IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.mbse.basement.domain.tables.pojos.MRelation>> findManyByUpdatedAt(Collection<LocalDateTime> values, int limit) {
        return findManyByCondition(MRelation.M_RELATION.UPDATED_AT.in(values), limit);
    }

    /**
     * Find records that have <code>UPDATED_BY IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.mbse.basement.domain.tables.pojos.MRelation>> findManyByUpdatedBy(Collection<String> values) {
        return findManyByCondition(MRelation.M_RELATION.UPDATED_BY.in(values));
    }

    /**
     * Find records that have <code>UPDATED_BY IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.mbse.basement.domain.tables.pojos.MRelation>> findManyByUpdatedBy(Collection<String> values, int limit) {
        return findManyByCondition(MRelation.M_RELATION.UPDATED_BY.in(values), limit);
    }

    @Override
    public JDBCClassicQueryExecutor<MRelationRecord, io.zerows.extension.mbse.basement.domain.tables.pojos.MRelation, String> queryExecutor() {
        return (JDBCClassicQueryExecutor<MRelationRecord, io.zerows.extension.mbse.basement.domain.tables.pojos.MRelation, String>) super.queryExecutor();
    }
}