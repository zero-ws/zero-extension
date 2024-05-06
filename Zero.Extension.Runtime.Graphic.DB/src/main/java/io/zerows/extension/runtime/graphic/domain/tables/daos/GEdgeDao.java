/*
 * This file is generated by jOOQ.
 */
package io.zerows.extension.runtime.graphic.domain.tables.daos;


import io.github.jklingsporn.vertx.jooq.classic.jdbc.JDBCClassicQueryExecutor;
import io.github.jklingsporn.vertx.jooq.shared.internal.AbstractVertxDAO;
import io.vertx.core.Future;
import io.zerows.extension.runtime.graphic.domain.tables.GEdge;
import io.zerows.extension.runtime.graphic.domain.tables.records.GEdgeRecord;
import org.jooq.Configuration;

import java.time.LocalDateTime;
import java.util.Collection;
import java.util.List;

/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({"all", "unchecked", "rawtypes"})
public class GEdgeDao extends AbstractVertxDAO<GEdgeRecord, io.zerows.extension.runtime.graphic.domain.tables.pojos.GEdge, String, Future<List<io.zerows.extension.runtime.graphic.domain.tables.pojos.GEdge>>, Future<io.zerows.extension.runtime.graphic.domain.tables.pojos.GEdge>, Future<Integer>, Future<String>> implements io.github.jklingsporn.vertx.jooq.classic.VertxDAO<GEdgeRecord, io.zerows.extension.runtime.graphic.domain.tables.pojos.GEdge, String> {

    /**
     * @param configuration The Configuration used for rendering and query
     *                      execution.
     * @param vertx         the vertx instance
     */
    public GEdgeDao(Configuration configuration, io.vertx.core.Vertx vertx) {
        super(GEdge.G_EDGE, io.zerows.extension.runtime.graphic.domain.tables.pojos.GEdge.class, new JDBCClassicQueryExecutor<GEdgeRecord, io.zerows.extension.runtime.graphic.domain.tables.pojos.GEdge, String>(configuration, io.zerows.extension.runtime.graphic.domain.tables.pojos.GEdge.class, vertx));
    }

    @Override
    protected String getId(io.zerows.extension.runtime.graphic.domain.tables.pojos.GEdge object) {
        return object.getKey();
    }

    /**
     * Find records that have <code>NAME IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.runtime.graphic.domain.tables.pojos.GEdge>> findManyByName(Collection<String> values) {
        return findManyByCondition(GEdge.G_EDGE.NAME.in(values));
    }

    /**
     * Find records that have <code>NAME IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.runtime.graphic.domain.tables.pojos.GEdge>> findManyByName(Collection<String> values, int limit) {
        return findManyByCondition(GEdge.G_EDGE.NAME.in(values), limit);
    }

    /**
     * Find records that have <code>TYPE IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.runtime.graphic.domain.tables.pojos.GEdge>> findManyByType(Collection<String> values) {
        return findManyByCondition(GEdge.G_EDGE.TYPE.in(values));
    }

    /**
     * Find records that have <code>TYPE IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.runtime.graphic.domain.tables.pojos.GEdge>> findManyByType(Collection<String> values, int limit) {
        return findManyByCondition(GEdge.G_EDGE.TYPE.in(values), limit);
    }

    /**
     * Find records that have <code>SOURCE_KEY IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.runtime.graphic.domain.tables.pojos.GEdge>> findManyBySourceKey(Collection<String> values) {
        return findManyByCondition(GEdge.G_EDGE.SOURCE_KEY.in(values));
    }

    /**
     * Find records that have <code>SOURCE_KEY IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.runtime.graphic.domain.tables.pojos.GEdge>> findManyBySourceKey(Collection<String> values, int limit) {
        return findManyByCondition(GEdge.G_EDGE.SOURCE_KEY.in(values), limit);
    }

    /**
     * Find records that have <code>TARGET_KEY IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.runtime.graphic.domain.tables.pojos.GEdge>> findManyByTargetKey(Collection<String> values) {
        return findManyByCondition(GEdge.G_EDGE.TARGET_KEY.in(values));
    }

    /**
     * Find records that have <code>TARGET_KEY IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.runtime.graphic.domain.tables.pojos.GEdge>> findManyByTargetKey(Collection<String> values, int limit) {
        return findManyByCondition(GEdge.G_EDGE.TARGET_KEY.in(values), limit);
    }

    /**
     * Find records that have <code>GRAPHIC_ID IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.runtime.graphic.domain.tables.pojos.GEdge>> findManyByGraphicId(Collection<String> values) {
        return findManyByCondition(GEdge.G_EDGE.GRAPHIC_ID.in(values));
    }

    /**
     * Find records that have <code>GRAPHIC_ID IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.runtime.graphic.domain.tables.pojos.GEdge>> findManyByGraphicId(Collection<String> values, int limit) {
        return findManyByCondition(GEdge.G_EDGE.GRAPHIC_ID.in(values), limit);
    }

    /**
     * Find records that have <code>UI IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.runtime.graphic.domain.tables.pojos.GEdge>> findManyByUi(Collection<String> values) {
        return findManyByCondition(GEdge.G_EDGE.UI.in(values));
    }

    /**
     * Find records that have <code>UI IN (values)</code> asynchronously limited
     * by the given limit
     */
    public Future<List<io.zerows.extension.runtime.graphic.domain.tables.pojos.GEdge>> findManyByUi(Collection<String> values, int limit) {
        return findManyByCondition(GEdge.G_EDGE.UI.in(values), limit);
    }

    /**
     * Find records that have <code>RECORD_KEY IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.runtime.graphic.domain.tables.pojos.GEdge>> findManyByRecordKey(Collection<String> values) {
        return findManyByCondition(GEdge.G_EDGE.RECORD_KEY.in(values));
    }

    /**
     * Find records that have <code>RECORD_KEY IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.runtime.graphic.domain.tables.pojos.GEdge>> findManyByRecordKey(Collection<String> values, int limit) {
        return findManyByCondition(GEdge.G_EDGE.RECORD_KEY.in(values), limit);
    }

    /**
     * Find records that have <code>RECORD_DATA IN (values)</code>
     * asynchronously
     */
    public Future<List<io.zerows.extension.runtime.graphic.domain.tables.pojos.GEdge>> findManyByRecordData(Collection<String> values) {
        return findManyByCondition(GEdge.G_EDGE.RECORD_DATA.in(values));
    }

    /**
     * Find records that have <code>RECORD_DATA IN (values)</code>
     * asynchronously limited by the given limit
     */
    public Future<List<io.zerows.extension.runtime.graphic.domain.tables.pojos.GEdge>> findManyByRecordData(Collection<String> values, int limit) {
        return findManyByCondition(GEdge.G_EDGE.RECORD_DATA.in(values), limit);
    }

    /**
     * Find records that have <code>SIGMA IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.runtime.graphic.domain.tables.pojos.GEdge>> findManyBySigma(Collection<String> values) {
        return findManyByCondition(GEdge.G_EDGE.SIGMA.in(values));
    }

    /**
     * Find records that have <code>SIGMA IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.runtime.graphic.domain.tables.pojos.GEdge>> findManyBySigma(Collection<String> values, int limit) {
        return findManyByCondition(GEdge.G_EDGE.SIGMA.in(values), limit);
    }

    /**
     * Find records that have <code>LANGUAGE IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.runtime.graphic.domain.tables.pojos.GEdge>> findManyByLanguage(Collection<String> values) {
        return findManyByCondition(GEdge.G_EDGE.LANGUAGE.in(values));
    }

    /**
     * Find records that have <code>LANGUAGE IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.runtime.graphic.domain.tables.pojos.GEdge>> findManyByLanguage(Collection<String> values, int limit) {
        return findManyByCondition(GEdge.G_EDGE.LANGUAGE.in(values), limit);
    }

    /**
     * Find records that have <code>ACTIVE IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.runtime.graphic.domain.tables.pojos.GEdge>> findManyByActive(Collection<Boolean> values) {
        return findManyByCondition(GEdge.G_EDGE.ACTIVE.in(values));
    }

    /**
     * Find records that have <code>ACTIVE IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.runtime.graphic.domain.tables.pojos.GEdge>> findManyByActive(Collection<Boolean> values, int limit) {
        return findManyByCondition(GEdge.G_EDGE.ACTIVE.in(values), limit);
    }

    /**
     * Find records that have <code>METADATA IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.runtime.graphic.domain.tables.pojos.GEdge>> findManyByMetadata(Collection<String> values) {
        return findManyByCondition(GEdge.G_EDGE.METADATA.in(values));
    }

    /**
     * Find records that have <code>METADATA IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.runtime.graphic.domain.tables.pojos.GEdge>> findManyByMetadata(Collection<String> values, int limit) {
        return findManyByCondition(GEdge.G_EDGE.METADATA.in(values), limit);
    }

    /**
     * Find records that have <code>CREATED_AT IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.runtime.graphic.domain.tables.pojos.GEdge>> findManyByCreatedAt(Collection<LocalDateTime> values) {
        return findManyByCondition(GEdge.G_EDGE.CREATED_AT.in(values));
    }

    /**
     * Find records that have <code>CREATED_AT IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.runtime.graphic.domain.tables.pojos.GEdge>> findManyByCreatedAt(Collection<LocalDateTime> values, int limit) {
        return findManyByCondition(GEdge.G_EDGE.CREATED_AT.in(values), limit);
    }

    /**
     * Find records that have <code>CREATED_BY IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.runtime.graphic.domain.tables.pojos.GEdge>> findManyByCreatedBy(Collection<String> values) {
        return findManyByCondition(GEdge.G_EDGE.CREATED_BY.in(values));
    }

    /**
     * Find records that have <code>CREATED_BY IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.runtime.graphic.domain.tables.pojos.GEdge>> findManyByCreatedBy(Collection<String> values, int limit) {
        return findManyByCondition(GEdge.G_EDGE.CREATED_BY.in(values), limit);
    }

    /**
     * Find records that have <code>UPDATED_AT IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.runtime.graphic.domain.tables.pojos.GEdge>> findManyByUpdatedAt(Collection<LocalDateTime> values) {
        return findManyByCondition(GEdge.G_EDGE.UPDATED_AT.in(values));
    }

    /**
     * Find records that have <code>UPDATED_AT IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.runtime.graphic.domain.tables.pojos.GEdge>> findManyByUpdatedAt(Collection<LocalDateTime> values, int limit) {
        return findManyByCondition(GEdge.G_EDGE.UPDATED_AT.in(values), limit);
    }

    /**
     * Find records that have <code>UPDATED_BY IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.runtime.graphic.domain.tables.pojos.GEdge>> findManyByUpdatedBy(Collection<String> values) {
        return findManyByCondition(GEdge.G_EDGE.UPDATED_BY.in(values));
    }

    /**
     * Find records that have <code>UPDATED_BY IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.runtime.graphic.domain.tables.pojos.GEdge>> findManyByUpdatedBy(Collection<String> values, int limit) {
        return findManyByCondition(GEdge.G_EDGE.UPDATED_BY.in(values), limit);
    }

    @Override
    public JDBCClassicQueryExecutor<GEdgeRecord, io.zerows.extension.runtime.graphic.domain.tables.pojos.GEdge, String> queryExecutor() {
        return (JDBCClassicQueryExecutor<GEdgeRecord, io.zerows.extension.runtime.graphic.domain.tables.pojos.GEdge, String>) super.queryExecutor();
    }
}
