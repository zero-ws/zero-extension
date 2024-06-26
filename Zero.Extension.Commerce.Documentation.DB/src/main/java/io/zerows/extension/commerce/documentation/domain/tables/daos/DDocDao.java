/*
 * This file is generated by jOOQ.
 */
package io.zerows.extension.commerce.documentation.domain.tables.daos;


import io.github.jklingsporn.vertx.jooq.classic.jdbc.JDBCClassicQueryExecutor;
import io.github.jklingsporn.vertx.jooq.shared.internal.AbstractVertxDAO;
import io.vertx.core.Future;
import io.zerows.extension.commerce.documentation.domain.tables.DDoc;
import io.zerows.extension.commerce.documentation.domain.tables.records.DDocRecord;
import org.jooq.Configuration;

import java.time.LocalDateTime;
import java.util.Collection;
import java.util.List;

/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({"all", "unchecked", "rawtypes"})
public class DDocDao extends AbstractVertxDAO<DDocRecord, io.zerows.extension.commerce.documentation.domain.tables.pojos.DDoc, String, Future<List<io.zerows.extension.commerce.documentation.domain.tables.pojos.DDoc>>, Future<io.zerows.extension.commerce.documentation.domain.tables.pojos.DDoc>, Future<Integer>, Future<String>> implements io.github.jklingsporn.vertx.jooq.classic.VertxDAO<DDocRecord, io.zerows.extension.commerce.documentation.domain.tables.pojos.DDoc, String> {

    /**
     * @param configuration The Configuration used for rendering and query
     *                      execution.
     * @param vertx         the vertx instance
     */
    public DDocDao(Configuration configuration, io.vertx.core.Vertx vertx) {
        super(DDoc.D_DOC, io.zerows.extension.commerce.documentation.domain.tables.pojos.DDoc.class, new JDBCClassicQueryExecutor<DDocRecord, io.zerows.extension.commerce.documentation.domain.tables.pojos.DDoc, String>(configuration, io.zerows.extension.commerce.documentation.domain.tables.pojos.DDoc.class, vertx));
    }

    @Override
    protected String getId(io.zerows.extension.commerce.documentation.domain.tables.pojos.DDoc object) {
        return object.getKey();
    }

    /**
     * Find records that have <code>CODE IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.commerce.documentation.domain.tables.pojos.DDoc>> findManyByCode(Collection<String> values) {
        return findManyByCondition(DDoc.D_DOC.CODE.in(values));
    }

    /**
     * Find records that have <code>CODE IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.commerce.documentation.domain.tables.pojos.DDoc>> findManyByCode(Collection<String> values, int limit) {
        return findManyByCondition(DDoc.D_DOC.CODE.in(values), limit);
    }

    /**
     * Find records that have <code>STATUS IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.commerce.documentation.domain.tables.pojos.DDoc>> findManyByStatus(Collection<String> values) {
        return findManyByCondition(DDoc.D_DOC.STATUS.in(values));
    }

    /**
     * Find records that have <code>STATUS IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.commerce.documentation.domain.tables.pojos.DDoc>> findManyByStatus(Collection<String> values, int limit) {
        return findManyByCondition(DDoc.D_DOC.STATUS.in(values), limit);
    }

    /**
     * Find records that have <code>TYPE IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.commerce.documentation.domain.tables.pojos.DDoc>> findManyByType(Collection<String> values) {
        return findManyByCondition(DDoc.D_DOC.TYPE.in(values));
    }

    /**
     * Find records that have <code>TYPE IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.commerce.documentation.domain.tables.pojos.DDoc>> findManyByType(Collection<String> values, int limit) {
        return findManyByCondition(DDoc.D_DOC.TYPE.in(values), limit);
    }

    /**
     * Find records that have <code>CATEGORY IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.commerce.documentation.domain.tables.pojos.DDoc>> findManyByCategory(Collection<String> values) {
        return findManyByCondition(DDoc.D_DOC.CATEGORY.in(values));
    }

    /**
     * Find records that have <code>CATEGORY IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.commerce.documentation.domain.tables.pojos.DDoc>> findManyByCategory(Collection<String> values, int limit) {
        return findManyByCondition(DDoc.D_DOC.CATEGORY.in(values), limit);
    }

    /**
     * Find records that have <code>NAME IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.commerce.documentation.domain.tables.pojos.DDoc>> findManyByName(Collection<String> values) {
        return findManyByCondition(DDoc.D_DOC.NAME.in(values));
    }

    /**
     * Find records that have <code>NAME IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.commerce.documentation.domain.tables.pojos.DDoc>> findManyByName(Collection<String> values, int limit) {
        return findManyByCondition(DDoc.D_DOC.NAME.in(values), limit);
    }

    /**
     * Find records that have <code>SN IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.commerce.documentation.domain.tables.pojos.DDoc>> findManyBySn(Collection<String> values) {
        return findManyByCondition(DDoc.D_DOC.SN.in(values));
    }

    /**
     * Find records that have <code>SN IN (values)</code> asynchronously limited
     * by the given limit
     */
    public Future<List<io.zerows.extension.commerce.documentation.domain.tables.pojos.DDoc>> findManyBySn(Collection<String> values, int limit) {
        return findManyByCondition(DDoc.D_DOC.SN.in(values), limit);
    }

    /**
     * Find records that have <code>PREFIX IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.commerce.documentation.domain.tables.pojos.DDoc>> findManyByPrefix(Collection<String> values) {
        return findManyByCondition(DDoc.D_DOC.PREFIX.in(values));
    }

    /**
     * Find records that have <code>PREFIX IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.commerce.documentation.domain.tables.pojos.DDoc>> findManyByPrefix(Collection<String> values, int limit) {
        return findManyByCondition(DDoc.D_DOC.PREFIX.in(values), limit);
    }

    /**
     * Find records that have <code>BRIEF IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.commerce.documentation.domain.tables.pojos.DDoc>> findManyByBrief(Collection<String> values) {
        return findManyByCondition(DDoc.D_DOC.BRIEF.in(values));
    }

    /**
     * Find records that have <code>BRIEF IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.commerce.documentation.domain.tables.pojos.DDoc>> findManyByBrief(Collection<String> values, int limit) {
        return findManyByCondition(DDoc.D_DOC.BRIEF.in(values), limit);
    }

    /**
     * Find records that have <code>DESCRIPTION IN (values)</code>
     * asynchronously
     */
    public Future<List<io.zerows.extension.commerce.documentation.domain.tables.pojos.DDoc>> findManyByDescription(Collection<String> values) {
        return findManyByCondition(DDoc.D_DOC.DESCRIPTION.in(values));
    }

    /**
     * Find records that have <code>DESCRIPTION IN (values)</code>
     * asynchronously limited by the given limit
     */
    public Future<List<io.zerows.extension.commerce.documentation.domain.tables.pojos.DDoc>> findManyByDescription(Collection<String> values, int limit) {
        return findManyByCondition(DDoc.D_DOC.DESCRIPTION.in(values), limit);
    }

    /**
     * Find records that have <code>SCOPE IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.commerce.documentation.domain.tables.pojos.DDoc>> findManyByScope(Collection<String> values) {
        return findManyByCondition(DDoc.D_DOC.SCOPE.in(values));
    }

    /**
     * Find records that have <code>SCOPE IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.commerce.documentation.domain.tables.pojos.DDoc>> findManyByScope(Collection<String> values, int limit) {
        return findManyByCondition(DDoc.D_DOC.SCOPE.in(values), limit);
    }

    /**
     * Find records that have <code>VERSION IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.commerce.documentation.domain.tables.pojos.DDoc>> findManyByVersion(Collection<String> values) {
        return findManyByCondition(DDoc.D_DOC.VERSION.in(values));
    }

    /**
     * Find records that have <code>VERSION IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.commerce.documentation.domain.tables.pojos.DDoc>> findManyByVersion(Collection<String> values, int limit) {
        return findManyByCondition(DDoc.D_DOC.VERSION.in(values), limit);
    }

    /**
     * Find records that have <code>AUTHOR IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.commerce.documentation.domain.tables.pojos.DDoc>> findManyByAuthor(Collection<String> values) {
        return findManyByCondition(DDoc.D_DOC.AUTHOR.in(values));
    }

    /**
     * Find records that have <code>AUTHOR IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.commerce.documentation.domain.tables.pojos.DDoc>> findManyByAuthor(Collection<String> values, int limit) {
        return findManyByCondition(DDoc.D_DOC.AUTHOR.in(values), limit);
    }

    /**
     * Find records that have <code>AUTHOR_OR IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.commerce.documentation.domain.tables.pojos.DDoc>> findManyByAuthorOr(Collection<String> values) {
        return findManyByCondition(DDoc.D_DOC.AUTHOR_OR.in(values));
    }

    /**
     * Find records that have <code>AUTHOR_OR IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.commerce.documentation.domain.tables.pojos.DDoc>> findManyByAuthorOr(Collection<String> values, int limit) {
        return findManyByCondition(DDoc.D_DOC.AUTHOR_OR.in(values), limit);
    }

    /**
     * Find records that have <code>PUBLISHER IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.commerce.documentation.domain.tables.pojos.DDoc>> findManyByPublisher(Collection<String> values) {
        return findManyByCondition(DDoc.D_DOC.PUBLISHER.in(values));
    }

    /**
     * Find records that have <code>PUBLISHER IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.commerce.documentation.domain.tables.pojos.DDoc>> findManyByPublisher(Collection<String> values, int limit) {
        return findManyByCondition(DDoc.D_DOC.PUBLISHER.in(values), limit);
    }

    /**
     * Find records that have <code>PUBLISH_AT IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.commerce.documentation.domain.tables.pojos.DDoc>> findManyByPublishAt(Collection<LocalDateTime> values) {
        return findManyByCondition(DDoc.D_DOC.PUBLISH_AT.in(values));
    }

    /**
     * Find records that have <code>PUBLISH_AT IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.commerce.documentation.domain.tables.pojos.DDoc>> findManyByPublishAt(Collection<LocalDateTime> values, int limit) {
        return findManyByCondition(DDoc.D_DOC.PUBLISH_AT.in(values), limit);
    }

    /**
     * Find records that have <code>MODEL_ID IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.commerce.documentation.domain.tables.pojos.DDoc>> findManyByModelId(Collection<String> values) {
        return findManyByCondition(DDoc.D_DOC.MODEL_ID.in(values));
    }

    /**
     * Find records that have <code>MODEL_ID IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.commerce.documentation.domain.tables.pojos.DDoc>> findManyByModelId(Collection<String> values, int limit) {
        return findManyByCondition(DDoc.D_DOC.MODEL_ID.in(values), limit);
    }

    /**
     * Find records that have <code>MODEL_KEY IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.commerce.documentation.domain.tables.pojos.DDoc>> findManyByModelKey(Collection<String> values) {
        return findManyByCondition(DDoc.D_DOC.MODEL_KEY.in(values));
    }

    /**
     * Find records that have <code>MODEL_KEY IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.commerce.documentation.domain.tables.pojos.DDoc>> findManyByModelKey(Collection<String> values, int limit) {
        return findManyByCondition(DDoc.D_DOC.MODEL_KEY.in(values), limit);
    }

    /**
     * Find records that have <code>COPY IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.commerce.documentation.domain.tables.pojos.DDoc>> findManyByCopy(Collection<Boolean> values) {
        return findManyByCondition(DDoc.D_DOC.COPY.in(values));
    }

    /**
     * Find records that have <code>COPY IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.commerce.documentation.domain.tables.pojos.DDoc>> findManyByCopy(Collection<Boolean> values, int limit) {
        return findManyByCondition(DDoc.D_DOC.COPY.in(values), limit);
    }

    /**
     * Find records that have <code>COPY_TO IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.commerce.documentation.domain.tables.pojos.DDoc>> findManyByCopyTo(Collection<String> values) {
        return findManyByCondition(DDoc.D_DOC.COPY_TO.in(values));
    }

    /**
     * Find records that have <code>COPY_TO IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.commerce.documentation.domain.tables.pojos.DDoc>> findManyByCopyTo(Collection<String> values, int limit) {
        return findManyByCondition(DDoc.D_DOC.COPY_TO.in(values), limit);
    }

    /**
     * Find records that have <code>FILE_NAME IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.commerce.documentation.domain.tables.pojos.DDoc>> findManyByFileName(Collection<String> values) {
        return findManyByCondition(DDoc.D_DOC.FILE_NAME.in(values));
    }

    /**
     * Find records that have <code>FILE_NAME IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.commerce.documentation.domain.tables.pojos.DDoc>> findManyByFileName(Collection<String> values, int limit) {
        return findManyByCondition(DDoc.D_DOC.FILE_NAME.in(values), limit);
    }

    /**
     * Find records that have <code>FILE_KEY IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.commerce.documentation.domain.tables.pojos.DDoc>> findManyByFileKey(Collection<String> values) {
        return findManyByCondition(DDoc.D_DOC.FILE_KEY.in(values));
    }

    /**
     * Find records that have <code>FILE_KEY IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.commerce.documentation.domain.tables.pojos.DDoc>> findManyByFileKey(Collection<String> values, int limit) {
        return findManyByCondition(DDoc.D_DOC.FILE_KEY.in(values), limit);
    }

    /**
     * Find records that have <code>SIGMA IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.commerce.documentation.domain.tables.pojos.DDoc>> findManyBySigma(Collection<String> values) {
        return findManyByCondition(DDoc.D_DOC.SIGMA.in(values));
    }

    /**
     * Find records that have <code>SIGMA IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.commerce.documentation.domain.tables.pojos.DDoc>> findManyBySigma(Collection<String> values, int limit) {
        return findManyByCondition(DDoc.D_DOC.SIGMA.in(values), limit);
    }

    /**
     * Find records that have <code>LANGUAGE IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.commerce.documentation.domain.tables.pojos.DDoc>> findManyByLanguage(Collection<String> values) {
        return findManyByCondition(DDoc.D_DOC.LANGUAGE.in(values));
    }

    /**
     * Find records that have <code>LANGUAGE IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.commerce.documentation.domain.tables.pojos.DDoc>> findManyByLanguage(Collection<String> values, int limit) {
        return findManyByCondition(DDoc.D_DOC.LANGUAGE.in(values), limit);
    }

    /**
     * Find records that have <code>ACTIVE IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.commerce.documentation.domain.tables.pojos.DDoc>> findManyByActive(Collection<Boolean> values) {
        return findManyByCondition(DDoc.D_DOC.ACTIVE.in(values));
    }

    /**
     * Find records that have <code>ACTIVE IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.commerce.documentation.domain.tables.pojos.DDoc>> findManyByActive(Collection<Boolean> values, int limit) {
        return findManyByCondition(DDoc.D_DOC.ACTIVE.in(values), limit);
    }

    /**
     * Find records that have <code>METADATA IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.commerce.documentation.domain.tables.pojos.DDoc>> findManyByMetadata(Collection<String> values) {
        return findManyByCondition(DDoc.D_DOC.METADATA.in(values));
    }

    /**
     * Find records that have <code>METADATA IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.commerce.documentation.domain.tables.pojos.DDoc>> findManyByMetadata(Collection<String> values, int limit) {
        return findManyByCondition(DDoc.D_DOC.METADATA.in(values), limit);
    }

    /**
     * Find records that have <code>CREATED_AT IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.commerce.documentation.domain.tables.pojos.DDoc>> findManyByCreatedAt(Collection<LocalDateTime> values) {
        return findManyByCondition(DDoc.D_DOC.CREATED_AT.in(values));
    }

    /**
     * Find records that have <code>CREATED_AT IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.commerce.documentation.domain.tables.pojos.DDoc>> findManyByCreatedAt(Collection<LocalDateTime> values, int limit) {
        return findManyByCondition(DDoc.D_DOC.CREATED_AT.in(values), limit);
    }

    /**
     * Find records that have <code>CREATED_BY IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.commerce.documentation.domain.tables.pojos.DDoc>> findManyByCreatedBy(Collection<String> values) {
        return findManyByCondition(DDoc.D_DOC.CREATED_BY.in(values));
    }

    /**
     * Find records that have <code>CREATED_BY IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.commerce.documentation.domain.tables.pojos.DDoc>> findManyByCreatedBy(Collection<String> values, int limit) {
        return findManyByCondition(DDoc.D_DOC.CREATED_BY.in(values), limit);
    }

    /**
     * Find records that have <code>UPDATED_AT IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.commerce.documentation.domain.tables.pojos.DDoc>> findManyByUpdatedAt(Collection<LocalDateTime> values) {
        return findManyByCondition(DDoc.D_DOC.UPDATED_AT.in(values));
    }

    /**
     * Find records that have <code>UPDATED_AT IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.commerce.documentation.domain.tables.pojos.DDoc>> findManyByUpdatedAt(Collection<LocalDateTime> values, int limit) {
        return findManyByCondition(DDoc.D_DOC.UPDATED_AT.in(values), limit);
    }

    /**
     * Find records that have <code>UPDATED_BY IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.commerce.documentation.domain.tables.pojos.DDoc>> findManyByUpdatedBy(Collection<String> values) {
        return findManyByCondition(DDoc.D_DOC.UPDATED_BY.in(values));
    }

    /**
     * Find records that have <code>UPDATED_BY IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.commerce.documentation.domain.tables.pojos.DDoc>> findManyByUpdatedBy(Collection<String> values, int limit) {
        return findManyByCondition(DDoc.D_DOC.UPDATED_BY.in(values), limit);
    }

    @Override
    public JDBCClassicQueryExecutor<DDocRecord, io.zerows.extension.commerce.documentation.domain.tables.pojos.DDoc, String> queryExecutor() {
        return (JDBCClassicQueryExecutor<DDocRecord, io.zerows.extension.commerce.documentation.domain.tables.pojos.DDoc, String>) super.queryExecutor();
    }
}
