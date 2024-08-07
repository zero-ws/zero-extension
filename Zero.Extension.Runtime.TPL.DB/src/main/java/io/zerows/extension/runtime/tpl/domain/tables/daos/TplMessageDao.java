/*
 * This file is generated by jOOQ.
 */
package io.zerows.extension.runtime.tpl.domain.tables.daos;


import io.github.jklingsporn.vertx.jooq.shared.internal.AbstractVertxDAO;
import io.zerows.extension.runtime.tpl.domain.tables.TplMessage;
import io.zerows.extension.runtime.tpl.domain.tables.records.TplMessageRecord;

import java.time.LocalDateTime;
import java.util.Collection;

import org.jooq.Configuration;


import java.util.List;
import io.vertx.core.Future;
import io.github.jklingsporn.vertx.jooq.classic.jdbc.JDBCClassicQueryExecutor;
/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TplMessageDao extends AbstractVertxDAO<TplMessageRecord, io.zerows.extension.runtime.tpl.domain.tables.pojos.TplMessage, String, Future<List<io.zerows.extension.runtime.tpl.domain.tables.pojos.TplMessage>>, Future<io.zerows.extension.runtime.tpl.domain.tables.pojos.TplMessage>, Future<Integer>, Future<String>> implements io.github.jklingsporn.vertx.jooq.classic.VertxDAO<TplMessageRecord,io.zerows.extension.runtime.tpl.domain.tables.pojos.TplMessage,String> {

        /**
     * @param configuration The Configuration used for rendering and query
     * execution.
     * @param vertx the vertx instance
     */
        public TplMessageDao(Configuration configuration, io.vertx.core.Vertx vertx) {
                super(TplMessage.TPL_MESSAGE, io.zerows.extension.runtime.tpl.domain.tables.pojos.TplMessage.class, new JDBCClassicQueryExecutor<TplMessageRecord,io.zerows.extension.runtime.tpl.domain.tables.pojos.TplMessage,String>(configuration,io.zerows.extension.runtime.tpl.domain.tables.pojos.TplMessage.class,vertx));
        }

        @Override
        protected String getId(io.zerows.extension.runtime.tpl.domain.tables.pojos.TplMessage object) {
                return object.getKey();
        }

        /**
     * Find records that have <code>NAME IN (values)</code> asynchronously
     */
        public Future<List<io.zerows.extension.runtime.tpl.domain.tables.pojos.TplMessage>> findManyByName(Collection<String> values) {
                return findManyByCondition(TplMessage.TPL_MESSAGE.NAME.in(values));
        }

        /**
     * Find records that have <code>NAME IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<io.zerows.extension.runtime.tpl.domain.tables.pojos.TplMessage>> findManyByName(Collection<String> values, int limit) {
                return findManyByCondition(TplMessage.TPL_MESSAGE.NAME.in(values),limit);
        }

        /**
     * Find records that have <code>CODE IN (values)</code> asynchronously
     */
        public Future<List<io.zerows.extension.runtime.tpl.domain.tables.pojos.TplMessage>> findManyByCode(Collection<String> values) {
                return findManyByCondition(TplMessage.TPL_MESSAGE.CODE.in(values));
        }

        /**
     * Find records that have <code>CODE IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<io.zerows.extension.runtime.tpl.domain.tables.pojos.TplMessage>> findManyByCode(Collection<String> values, int limit) {
                return findManyByCondition(TplMessage.TPL_MESSAGE.CODE.in(values),limit);
        }

        /**
     * Find records that have <code>TYPE IN (values)</code> asynchronously
     */
        public Future<List<io.zerows.extension.runtime.tpl.domain.tables.pojos.TplMessage>> findManyByType(Collection<String> values) {
                return findManyByCondition(TplMessage.TPL_MESSAGE.TYPE.in(values));
        }

        /**
     * Find records that have <code>TYPE IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<io.zerows.extension.runtime.tpl.domain.tables.pojos.TplMessage>> findManyByType(Collection<String> values, int limit) {
                return findManyByCondition(TplMessage.TPL_MESSAGE.TYPE.in(values),limit);
        }

        /**
     * Find records that have <code>EXPR_SUBJECT IN (values)</code>
     * asynchronously
     */
        public Future<List<io.zerows.extension.runtime.tpl.domain.tables.pojos.TplMessage>> findManyByExprSubject(Collection<String> values) {
                return findManyByCondition(TplMessage.TPL_MESSAGE.EXPR_SUBJECT.in(values));
        }

        /**
     * Find records that have <code>EXPR_SUBJECT IN (values)</code>
     * asynchronously limited by the given limit
     */
        public Future<List<io.zerows.extension.runtime.tpl.domain.tables.pojos.TplMessage>> findManyByExprSubject(Collection<String> values, int limit) {
                return findManyByCondition(TplMessage.TPL_MESSAGE.EXPR_SUBJECT.in(values),limit);
        }

        /**
     * Find records that have <code>EXPR_CONTENT IN (values)</code>
     * asynchronously
     */
        public Future<List<io.zerows.extension.runtime.tpl.domain.tables.pojos.TplMessage>> findManyByExprContent(Collection<String> values) {
                return findManyByCondition(TplMessage.TPL_MESSAGE.EXPR_CONTENT.in(values));
        }

        /**
     * Find records that have <code>EXPR_CONTENT IN (values)</code>
     * asynchronously limited by the given limit
     */
        public Future<List<io.zerows.extension.runtime.tpl.domain.tables.pojos.TplMessage>> findManyByExprContent(Collection<String> values, int limit) {
                return findManyByCondition(TplMessage.TPL_MESSAGE.EXPR_CONTENT.in(values),limit);
        }

        /**
     * Find records that have <code>EXPR_COMPONENT IN (values)</code>
     * asynchronously
     */
        public Future<List<io.zerows.extension.runtime.tpl.domain.tables.pojos.TplMessage>> findManyByExprComponent(Collection<String> values) {
                return findManyByCondition(TplMessage.TPL_MESSAGE.EXPR_COMPONENT.in(values));
        }

        /**
     * Find records that have <code>EXPR_COMPONENT IN (values)</code>
     * asynchronously limited by the given limit
     */
        public Future<List<io.zerows.extension.runtime.tpl.domain.tables.pojos.TplMessage>> findManyByExprComponent(Collection<String> values, int limit) {
                return findManyByCondition(TplMessage.TPL_MESSAGE.EXPR_COMPONENT.in(values),limit);
        }

        /**
     * Find records that have <code>APP_ID IN (values)</code> asynchronously
     */
        public Future<List<io.zerows.extension.runtime.tpl.domain.tables.pojos.TplMessage>> findManyByAppId(Collection<String> values) {
                return findManyByCondition(TplMessage.TPL_MESSAGE.APP_ID.in(values));
        }

        /**
     * Find records that have <code>APP_ID IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<io.zerows.extension.runtime.tpl.domain.tables.pojos.TplMessage>> findManyByAppId(Collection<String> values, int limit) {
                return findManyByCondition(TplMessage.TPL_MESSAGE.APP_ID.in(values),limit);
        }

        /**
     * Find records that have <code>ACTIVE IN (values)</code> asynchronously
     */
        public Future<List<io.zerows.extension.runtime.tpl.domain.tables.pojos.TplMessage>> findManyByActive(Collection<Boolean> values) {
                return findManyByCondition(TplMessage.TPL_MESSAGE.ACTIVE.in(values));
        }

        /**
     * Find records that have <code>ACTIVE IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<io.zerows.extension.runtime.tpl.domain.tables.pojos.TplMessage>> findManyByActive(Collection<Boolean> values, int limit) {
                return findManyByCondition(TplMessage.TPL_MESSAGE.ACTIVE.in(values),limit);
        }

        /**
     * Find records that have <code>SIGMA IN (values)</code> asynchronously
     */
        public Future<List<io.zerows.extension.runtime.tpl.domain.tables.pojos.TplMessage>> findManyBySigma(Collection<String> values) {
                return findManyByCondition(TplMessage.TPL_MESSAGE.SIGMA.in(values));
        }

        /**
     * Find records that have <code>SIGMA IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<io.zerows.extension.runtime.tpl.domain.tables.pojos.TplMessage>> findManyBySigma(Collection<String> values, int limit) {
                return findManyByCondition(TplMessage.TPL_MESSAGE.SIGMA.in(values),limit);
        }

        /**
     * Find records that have <code>METADATA IN (values)</code> asynchronously
     */
        public Future<List<io.zerows.extension.runtime.tpl.domain.tables.pojos.TplMessage>> findManyByMetadata(Collection<String> values) {
                return findManyByCondition(TplMessage.TPL_MESSAGE.METADATA.in(values));
        }

        /**
     * Find records that have <code>METADATA IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<io.zerows.extension.runtime.tpl.domain.tables.pojos.TplMessage>> findManyByMetadata(Collection<String> values, int limit) {
                return findManyByCondition(TplMessage.TPL_MESSAGE.METADATA.in(values),limit);
        }

        /**
     * Find records that have <code>LANGUAGE IN (values)</code> asynchronously
     */
        public Future<List<io.zerows.extension.runtime.tpl.domain.tables.pojos.TplMessage>> findManyByLanguage(Collection<String> values) {
                return findManyByCondition(TplMessage.TPL_MESSAGE.LANGUAGE.in(values));
        }

        /**
     * Find records that have <code>LANGUAGE IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<io.zerows.extension.runtime.tpl.domain.tables.pojos.TplMessage>> findManyByLanguage(Collection<String> values, int limit) {
                return findManyByCondition(TplMessage.TPL_MESSAGE.LANGUAGE.in(values),limit);
        }

        /**
     * Find records that have <code>CREATED_AT IN (values)</code> asynchronously
     */
        public Future<List<io.zerows.extension.runtime.tpl.domain.tables.pojos.TplMessage>> findManyByCreatedAt(Collection<LocalDateTime> values) {
                return findManyByCondition(TplMessage.TPL_MESSAGE.CREATED_AT.in(values));
        }

        /**
     * Find records that have <code>CREATED_AT IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<io.zerows.extension.runtime.tpl.domain.tables.pojos.TplMessage>> findManyByCreatedAt(Collection<LocalDateTime> values, int limit) {
                return findManyByCondition(TplMessage.TPL_MESSAGE.CREATED_AT.in(values),limit);
        }

        /**
     * Find records that have <code>CREATED_BY IN (values)</code> asynchronously
     */
        public Future<List<io.zerows.extension.runtime.tpl.domain.tables.pojos.TplMessage>> findManyByCreatedBy(Collection<String> values) {
                return findManyByCondition(TplMessage.TPL_MESSAGE.CREATED_BY.in(values));
        }

        /**
     * Find records that have <code>CREATED_BY IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<io.zerows.extension.runtime.tpl.domain.tables.pojos.TplMessage>> findManyByCreatedBy(Collection<String> values, int limit) {
                return findManyByCondition(TplMessage.TPL_MESSAGE.CREATED_BY.in(values),limit);
        }

        /**
     * Find records that have <code>UPDATED_AT IN (values)</code> asynchronously
     */
        public Future<List<io.zerows.extension.runtime.tpl.domain.tables.pojos.TplMessage>> findManyByUpdatedAt(Collection<LocalDateTime> values) {
                return findManyByCondition(TplMessage.TPL_MESSAGE.UPDATED_AT.in(values));
        }

        /**
     * Find records that have <code>UPDATED_AT IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<io.zerows.extension.runtime.tpl.domain.tables.pojos.TplMessage>> findManyByUpdatedAt(Collection<LocalDateTime> values, int limit) {
                return findManyByCondition(TplMessage.TPL_MESSAGE.UPDATED_AT.in(values),limit);
        }

        /**
     * Find records that have <code>UPDATED_BY IN (values)</code> asynchronously
     */
        public Future<List<io.zerows.extension.runtime.tpl.domain.tables.pojos.TplMessage>> findManyByUpdatedBy(Collection<String> values) {
                return findManyByCondition(TplMessage.TPL_MESSAGE.UPDATED_BY.in(values));
        }

        /**
     * Find records that have <code>UPDATED_BY IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<io.zerows.extension.runtime.tpl.domain.tables.pojos.TplMessage>> findManyByUpdatedBy(Collection<String> values, int limit) {
                return findManyByCondition(TplMessage.TPL_MESSAGE.UPDATED_BY.in(values),limit);
        }

        @Override
        public JDBCClassicQueryExecutor<TplMessageRecord,io.zerows.extension.runtime.tpl.domain.tables.pojos.TplMessage,String> queryExecutor(){
                return (JDBCClassicQueryExecutor<TplMessageRecord,io.zerows.extension.runtime.tpl.domain.tables.pojos.TplMessage,String>) super.queryExecutor();
        }
}
