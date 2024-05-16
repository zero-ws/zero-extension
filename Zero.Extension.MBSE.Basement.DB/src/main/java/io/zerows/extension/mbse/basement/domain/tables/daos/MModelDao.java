/*
 * This file is generated by jOOQ.
 */
package io.zerows.extension.mbse.basement.domain.tables.daos;


import io.github.jklingsporn.vertx.jooq.classic.jdbc.JDBCClassicQueryExecutor;
import io.github.jklingsporn.vertx.jooq.shared.internal.AbstractVertxDAO;
import io.vertx.core.Future;
import io.zerows.extension.mbse.basement.domain.tables.MModel;
import io.zerows.extension.mbse.basement.domain.tables.records.MModelRecord;
import org.jooq.Configuration;

import java.time.LocalDateTime;
import java.util.Collection;
import java.util.List;

/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({"all", "unchecked", "rawtypes"})
public class MModelDao extends AbstractVertxDAO<MModelRecord, io.zerows.extension.mbse.basement.domain.tables.pojos.MModel, String, Future<List<io.zerows.extension.mbse.basement.domain.tables.pojos.MModel>>, Future<io.zerows.extension.mbse.basement.domain.tables.pojos.MModel>, Future<Integer>, Future<String>> implements io.github.jklingsporn.vertx.jooq.classic.VertxDAO<MModelRecord, io.zerows.extension.mbse.basement.domain.tables.pojos.MModel, String> {

    /**
     * @param configuration The Configuration used for rendering and query
     *                      execution.
     * @param vertx         the vertx instance
     */
    public MModelDao(Configuration configuration, io.vertx.core.Vertx vertx) {
        super(MModel.M_MODEL, io.zerows.extension.mbse.basement.domain.tables.pojos.MModel.class, new JDBCClassicQueryExecutor<MModelRecord, io.zerows.extension.mbse.basement.domain.tables.pojos.MModel, String>(configuration, io.zerows.extension.mbse.basement.domain.tables.pojos.MModel.class, vertx));
    }

    @Override
    protected String getId(io.zerows.extension.mbse.basement.domain.tables.pojos.MModel object) {
        return object.getKey();
    }

    /**
     * Find records that have <code>IDENTIFIER IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.mbse.basement.domain.tables.pojos.MModel>> findManyByIdentifier(Collection<String> values) {
        return findManyByCondition(MModel.M_MODEL.IDENTIFIER.in(values));
    }

    /**
     * Find records that have <code>IDENTIFIER IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.mbse.basement.domain.tables.pojos.MModel>> findManyByIdentifier(Collection<String> values, int limit) {
        return findManyByCondition(MModel.M_MODEL.IDENTIFIER.in(values), limit);
    }

    /**
     * Find records that have <code>NAMESPACE IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.mbse.basement.domain.tables.pojos.MModel>> findManyByNamespace(Collection<String> values) {
        return findManyByCondition(MModel.M_MODEL.NAMESPACE.in(values));
    }

    /**
     * Find records that have <code>NAMESPACE IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.mbse.basement.domain.tables.pojos.MModel>> findManyByNamespace(Collection<String> values, int limit) {
        return findManyByCondition(MModel.M_MODEL.NAMESPACE.in(values), limit);
    }

    /**
     * Find records that have <code>NAME IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.mbse.basement.domain.tables.pojos.MModel>> findManyByName(Collection<String> values) {
        return findManyByCondition(MModel.M_MODEL.NAME.in(values));
    }

    /**
     * Find records that have <code>NAME IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.mbse.basement.domain.tables.pojos.MModel>> findManyByName(Collection<String> values, int limit) {
        return findManyByCondition(MModel.M_MODEL.NAME.in(values), limit);
    }

    /**
     * Find records that have <code>ALIAS IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.mbse.basement.domain.tables.pojos.MModel>> findManyByAlias(Collection<String> values) {
        return findManyByCondition(MModel.M_MODEL.ALIAS.in(values));
    }

    /**
     * Find records that have <code>ALIAS IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.mbse.basement.domain.tables.pojos.MModel>> findManyByAlias(Collection<String> values, int limit) {
        return findManyByCondition(MModel.M_MODEL.ALIAS.in(values), limit);
    }

    /**
     * Find records that have <code>TYPE IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.mbse.basement.domain.tables.pojos.MModel>> findManyByType(Collection<String> values) {
        return findManyByCondition(MModel.M_MODEL.TYPE.in(values));
    }

    /**
     * Find records that have <code>TYPE IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.mbse.basement.domain.tables.pojos.MModel>> findManyByType(Collection<String> values, int limit) {
        return findManyByCondition(MModel.M_MODEL.TYPE.in(values), limit);
    }

    /**
     * Find records that have <code>COMMENTS IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.mbse.basement.domain.tables.pojos.MModel>> findManyByComments(Collection<String> values) {
        return findManyByCondition(MModel.M_MODEL.COMMENTS.in(values));
    }

    /**
     * Find records that have <code>COMMENTS IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.mbse.basement.domain.tables.pojos.MModel>> findManyByComments(Collection<String> values, int limit) {
        return findManyByCondition(MModel.M_MODEL.COMMENTS.in(values), limit);
    }

    /**
     * Find records that have <code>CATEGORY_TREE IN (values)</code>
     * asynchronously
     */
    public Future<List<io.zerows.extension.mbse.basement.domain.tables.pojos.MModel>> findManyByCategoryTree(Collection<String> values) {
        return findManyByCondition(MModel.M_MODEL.CATEGORY_TREE.in(values));
    }

    /**
     * Find records that have <code>CATEGORY_TREE IN (values)</code>
     * asynchronously limited by the given limit
     */
    public Future<List<io.zerows.extension.mbse.basement.domain.tables.pojos.MModel>> findManyByCategoryTree(Collection<String> values, int limit) {
        return findManyByCondition(MModel.M_MODEL.CATEGORY_TREE.in(values), limit);
    }

    /**
     * Find records that have <code>CATEGORY_ID IN (values)</code>
     * asynchronously
     */
    public Future<List<io.zerows.extension.mbse.basement.domain.tables.pojos.MModel>> findManyByCategoryId(Collection<String> values) {
        return findManyByCondition(MModel.M_MODEL.CATEGORY_ID.in(values));
    }

    /**
     * Find records that have <code>CATEGORY_ID IN (values)</code>
     * asynchronously limited by the given limit
     */
    public Future<List<io.zerows.extension.mbse.basement.domain.tables.pojos.MModel>> findManyByCategoryId(Collection<String> values, int limit) {
        return findManyByCondition(MModel.M_MODEL.CATEGORY_ID.in(values), limit);
    }

    /**
     * Find records that have <code>RULE_UNIQUE IN (values)</code>
     * asynchronously
     */
    public Future<List<io.zerows.extension.mbse.basement.domain.tables.pojos.MModel>> findManyByRuleUnique(Collection<String> values) {
        return findManyByCondition(MModel.M_MODEL.RULE_UNIQUE.in(values));
    }

    /**
     * Find records that have <code>RULE_UNIQUE IN (values)</code>
     * asynchronously limited by the given limit
     */
    public Future<List<io.zerows.extension.mbse.basement.domain.tables.pojos.MModel>> findManyByRuleUnique(Collection<String> values, int limit) {
        return findManyByCondition(MModel.M_MODEL.RULE_UNIQUE.in(values), limit);
    }

    /**
     * Find records that have <code>IS_TRACK IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.mbse.basement.domain.tables.pojos.MModel>> findManyByIsTrack(Collection<Boolean> values) {
        return findManyByCondition(MModel.M_MODEL.IS_TRACK.in(values));
    }

    /**
     * Find records that have <code>IS_TRACK IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.mbse.basement.domain.tables.pojos.MModel>> findManyByIsTrack(Collection<Boolean> values, int limit) {
        return findManyByCondition(MModel.M_MODEL.IS_TRACK.in(values), limit);
    }

    /**
     * Find records that have <code>SPIDER IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.mbse.basement.domain.tables.pojos.MModel>> findManyBySpider(Collection<String> values) {
        return findManyByCondition(MModel.M_MODEL.SPIDER.in(values));
    }

    /**
     * Find records that have <code>SPIDER IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.mbse.basement.domain.tables.pojos.MModel>> findManyBySpider(Collection<String> values, int limit) {
        return findManyByCondition(MModel.M_MODEL.SPIDER.in(values), limit);
    }

    /**
     * Find records that have <code>SPIDER_COMPONENT IN (values)</code>
     * asynchronously
     */
    public Future<List<io.zerows.extension.mbse.basement.domain.tables.pojos.MModel>> findManyBySpiderComponent(Collection<String> values) {
        return findManyByCondition(MModel.M_MODEL.SPIDER_COMPONENT.in(values));
    }

    /**
     * Find records that have <code>SPIDER_COMPONENT IN (values)</code>
     * asynchronously limited by the given limit
     */
    public Future<List<io.zerows.extension.mbse.basement.domain.tables.pojos.MModel>> findManyBySpiderComponent(Collection<String> values, int limit) {
        return findManyByCondition(MModel.M_MODEL.SPIDER_COMPONENT.in(values), limit);
    }

    /**
     * Find records that have <code>SIGMA IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.mbse.basement.domain.tables.pojos.MModel>> findManyBySigma(Collection<String> values) {
        return findManyByCondition(MModel.M_MODEL.SIGMA.in(values));
    }

    /**
     * Find records that have <code>SIGMA IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.mbse.basement.domain.tables.pojos.MModel>> findManyBySigma(Collection<String> values, int limit) {
        return findManyByCondition(MModel.M_MODEL.SIGMA.in(values), limit);
    }

    /**
     * Find records that have <code>LANGUAGE IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.mbse.basement.domain.tables.pojos.MModel>> findManyByLanguage(Collection<String> values) {
        return findManyByCondition(MModel.M_MODEL.LANGUAGE.in(values));
    }

    /**
     * Find records that have <code>LANGUAGE IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.mbse.basement.domain.tables.pojos.MModel>> findManyByLanguage(Collection<String> values, int limit) {
        return findManyByCondition(MModel.M_MODEL.LANGUAGE.in(values), limit);
    }

    /**
     * Find records that have <code>ACTIVE IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.mbse.basement.domain.tables.pojos.MModel>> findManyByActive(Collection<Boolean> values) {
        return findManyByCondition(MModel.M_MODEL.ACTIVE.in(values));
    }

    /**
     * Find records that have <code>ACTIVE IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.mbse.basement.domain.tables.pojos.MModel>> findManyByActive(Collection<Boolean> values, int limit) {
        return findManyByCondition(MModel.M_MODEL.ACTIVE.in(values), limit);
    }

    /**
     * Find records that have <code>METADATA IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.mbse.basement.domain.tables.pojos.MModel>> findManyByMetadata(Collection<String> values) {
        return findManyByCondition(MModel.M_MODEL.METADATA.in(values));
    }

    /**
     * Find records that have <code>METADATA IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.mbse.basement.domain.tables.pojos.MModel>> findManyByMetadata(Collection<String> values, int limit) {
        return findManyByCondition(MModel.M_MODEL.METADATA.in(values), limit);
    }

    /**
     * Find records that have <code>CREATED_AT IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.mbse.basement.domain.tables.pojos.MModel>> findManyByCreatedAt(Collection<LocalDateTime> values) {
        return findManyByCondition(MModel.M_MODEL.CREATED_AT.in(values));
    }

    /**
     * Find records that have <code>CREATED_AT IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.mbse.basement.domain.tables.pojos.MModel>> findManyByCreatedAt(Collection<LocalDateTime> values, int limit) {
        return findManyByCondition(MModel.M_MODEL.CREATED_AT.in(values), limit);
    }

    /**
     * Find records that have <code>CREATED_BY IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.mbse.basement.domain.tables.pojos.MModel>> findManyByCreatedBy(Collection<String> values) {
        return findManyByCondition(MModel.M_MODEL.CREATED_BY.in(values));
    }

    /**
     * Find records that have <code>CREATED_BY IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.mbse.basement.domain.tables.pojos.MModel>> findManyByCreatedBy(Collection<String> values, int limit) {
        return findManyByCondition(MModel.M_MODEL.CREATED_BY.in(values), limit);
    }

    /**
     * Find records that have <code>UPDATED_AT IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.mbse.basement.domain.tables.pojos.MModel>> findManyByUpdatedAt(Collection<LocalDateTime> values) {
        return findManyByCondition(MModel.M_MODEL.UPDATED_AT.in(values));
    }

    /**
     * Find records that have <code>UPDATED_AT IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.mbse.basement.domain.tables.pojos.MModel>> findManyByUpdatedAt(Collection<LocalDateTime> values, int limit) {
        return findManyByCondition(MModel.M_MODEL.UPDATED_AT.in(values), limit);
    }

    /**
     * Find records that have <code>UPDATED_BY IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.mbse.basement.domain.tables.pojos.MModel>> findManyByUpdatedBy(Collection<String> values) {
        return findManyByCondition(MModel.M_MODEL.UPDATED_BY.in(values));
    }

    /**
     * Find records that have <code>UPDATED_BY IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.mbse.basement.domain.tables.pojos.MModel>> findManyByUpdatedBy(Collection<String> values, int limit) {
        return findManyByCondition(MModel.M_MODEL.UPDATED_BY.in(values), limit);
    }

    @Override
    public JDBCClassicQueryExecutor<MModelRecord, io.zerows.extension.mbse.basement.domain.tables.pojos.MModel, String> queryExecutor() {
        return (JDBCClassicQueryExecutor<MModelRecord, io.zerows.extension.mbse.basement.domain.tables.pojos.MModel, String>) super.queryExecutor();
    }
}