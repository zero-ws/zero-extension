/*
 * This file is generated by jOOQ.
 */
package cn.vertxup.integration.domain.tables.daos;


import cn.vertxup.integration.domain.tables.IMessage;
import cn.vertxup.integration.domain.tables.records.IMessageRecord;

import io.github.jklingsporn.vertx.jooq.shared.internal.AbstractVertxDAO;

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
public class IMessageDao extends AbstractVertxDAO<IMessageRecord, cn.vertxup.integration.domain.tables.pojos.IMessage, String, Future<List<cn.vertxup.integration.domain.tables.pojos.IMessage>>, Future<cn.vertxup.integration.domain.tables.pojos.IMessage>, Future<Integer>, Future<String>> implements io.github.jklingsporn.vertx.jooq.classic.VertxDAO<IMessageRecord,cn.vertxup.integration.domain.tables.pojos.IMessage,String> {

        /**
     * @param configuration The Configuration used for rendering and query
     * execution.
     * @param vertx the vertx instance
     */
        public IMessageDao(Configuration configuration, io.vertx.core.Vertx vertx) {
                super(IMessage.I_MESSAGE, cn.vertxup.integration.domain.tables.pojos.IMessage.class, new JDBCClassicQueryExecutor<IMessageRecord,cn.vertxup.integration.domain.tables.pojos.IMessage,String>(configuration,cn.vertxup.integration.domain.tables.pojos.IMessage.class,vertx));
        }

        @Override
        protected String getId(cn.vertxup.integration.domain.tables.pojos.IMessage object) {
                return object.getKey();
        }

        /**
     * Find records that have <code>NAME IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.integration.domain.tables.pojos.IMessage>> findManyByName(Collection<String> values) {
                return findManyByCondition(IMessage.I_MESSAGE.NAME.in(values));
        }

        /**
     * Find records that have <code>NAME IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.integration.domain.tables.pojos.IMessage>> findManyByName(Collection<String> values, int limit) {
                return findManyByCondition(IMessage.I_MESSAGE.NAME.in(values),limit);
        }

        /**
     * Find records that have <code>CODE IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.integration.domain.tables.pojos.IMessage>> findManyByCode(Collection<String> values) {
                return findManyByCondition(IMessage.I_MESSAGE.CODE.in(values));
        }

        /**
     * Find records that have <code>CODE IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.integration.domain.tables.pojos.IMessage>> findManyByCode(Collection<String> values, int limit) {
                return findManyByCondition(IMessage.I_MESSAGE.CODE.in(values),limit);
        }

        /**
     * Find records that have <code>TYPE IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.integration.domain.tables.pojos.IMessage>> findManyByType(Collection<String> values) {
                return findManyByCondition(IMessage.I_MESSAGE.TYPE.in(values));
        }

        /**
     * Find records that have <code>TYPE IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.integration.domain.tables.pojos.IMessage>> findManyByType(Collection<String> values, int limit) {
                return findManyByCondition(IMessage.I_MESSAGE.TYPE.in(values),limit);
        }

        /**
     * Find records that have <code>STATUS IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.integration.domain.tables.pojos.IMessage>> findManyByStatus(Collection<String> values) {
                return findManyByCondition(IMessage.I_MESSAGE.STATUS.in(values));
        }

        /**
     * Find records that have <code>STATUS IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.integration.domain.tables.pojos.IMessage>> findManyByStatus(Collection<String> values, int limit) {
                return findManyByCondition(IMessage.I_MESSAGE.STATUS.in(values),limit);
        }

        /**
     * Find records that have <code>SUBJECT IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.integration.domain.tables.pojos.IMessage>> findManyBySubject(Collection<String> values) {
                return findManyByCondition(IMessage.I_MESSAGE.SUBJECT.in(values));
        }

        /**
     * Find records that have <code>SUBJECT IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.integration.domain.tables.pojos.IMessage>> findManyBySubject(Collection<String> values, int limit) {
                return findManyByCondition(IMessage.I_MESSAGE.SUBJECT.in(values),limit);
        }

        /**
     * Find records that have <code>CONTENT IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.integration.domain.tables.pojos.IMessage>> findManyByContent(Collection<String> values) {
                return findManyByCondition(IMessage.I_MESSAGE.CONTENT.in(values));
        }

        /**
     * Find records that have <code>CONTENT IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.integration.domain.tables.pojos.IMessage>> findManyByContent(Collection<String> values, int limit) {
                return findManyByCondition(IMessage.I_MESSAGE.CONTENT.in(values),limit);
        }

        /**
     * Find records that have <code>SEND_FROM IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.integration.domain.tables.pojos.IMessage>> findManyBySendFrom(Collection<String> values) {
                return findManyByCondition(IMessage.I_MESSAGE.SEND_FROM.in(values));
        }

        /**
     * Find records that have <code>SEND_FROM IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.integration.domain.tables.pojos.IMessage>> findManyBySendFrom(Collection<String> values, int limit) {
                return findManyByCondition(IMessage.I_MESSAGE.SEND_FROM.in(values),limit);
        }

        /**
     * Find records that have <code>SEND_TO IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.integration.domain.tables.pojos.IMessage>> findManyBySendTo(Collection<String> values) {
                return findManyByCondition(IMessage.I_MESSAGE.SEND_TO.in(values));
        }

        /**
     * Find records that have <code>SEND_TO IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.integration.domain.tables.pojos.IMessage>> findManyBySendTo(Collection<String> values, int limit) {
                return findManyByCondition(IMessage.I_MESSAGE.SEND_TO.in(values),limit);
        }

        /**
     * Find records that have <code>SEND_BY IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.integration.domain.tables.pojos.IMessage>> findManyBySendBy(Collection<String> values) {
                return findManyByCondition(IMessage.I_MESSAGE.SEND_BY.in(values));
        }

        /**
     * Find records that have <code>SEND_BY IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.integration.domain.tables.pojos.IMessage>> findManyBySendBy(Collection<String> values, int limit) {
                return findManyByCondition(IMessage.I_MESSAGE.SEND_BY.in(values),limit);
        }

        /**
     * Find records that have <code>SEND_AT IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.integration.domain.tables.pojos.IMessage>> findManyBySendAt(Collection<String> values) {
                return findManyByCondition(IMessage.I_MESSAGE.SEND_AT.in(values));
        }

        /**
     * Find records that have <code>SEND_AT IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.integration.domain.tables.pojos.IMessage>> findManyBySendAt(Collection<String> values, int limit) {
                return findManyByCondition(IMessage.I_MESSAGE.SEND_AT.in(values),limit);
        }

        /**
     * Find records that have <code>APP_ID IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.integration.domain.tables.pojos.IMessage>> findManyByAppId(Collection<String> values) {
                return findManyByCondition(IMessage.I_MESSAGE.APP_ID.in(values));
        }

        /**
     * Find records that have <code>APP_ID IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.integration.domain.tables.pojos.IMessage>> findManyByAppId(Collection<String> values, int limit) {
                return findManyByCondition(IMessage.I_MESSAGE.APP_ID.in(values),limit);
        }

        /**
     * Find records that have <code>ACTIVE IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.integration.domain.tables.pojos.IMessage>> findManyByActive(Collection<Boolean> values) {
                return findManyByCondition(IMessage.I_MESSAGE.ACTIVE.in(values));
        }

        /**
     * Find records that have <code>ACTIVE IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.integration.domain.tables.pojos.IMessage>> findManyByActive(Collection<Boolean> values, int limit) {
                return findManyByCondition(IMessage.I_MESSAGE.ACTIVE.in(values),limit);
        }

        /**
     * Find records that have <code>SIGMA IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.integration.domain.tables.pojos.IMessage>> findManyBySigma(Collection<String> values) {
                return findManyByCondition(IMessage.I_MESSAGE.SIGMA.in(values));
        }

        /**
     * Find records that have <code>SIGMA IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.integration.domain.tables.pojos.IMessage>> findManyBySigma(Collection<String> values, int limit) {
                return findManyByCondition(IMessage.I_MESSAGE.SIGMA.in(values),limit);
        }

        /**
     * Find records that have <code>METADATA IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.integration.domain.tables.pojos.IMessage>> findManyByMetadata(Collection<String> values) {
                return findManyByCondition(IMessage.I_MESSAGE.METADATA.in(values));
        }

        /**
     * Find records that have <code>METADATA IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.integration.domain.tables.pojos.IMessage>> findManyByMetadata(Collection<String> values, int limit) {
                return findManyByCondition(IMessage.I_MESSAGE.METADATA.in(values),limit);
        }

        /**
     * Find records that have <code>LANGUAGE IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.integration.domain.tables.pojos.IMessage>> findManyByLanguage(Collection<String> values) {
                return findManyByCondition(IMessage.I_MESSAGE.LANGUAGE.in(values));
        }

        /**
     * Find records that have <code>LANGUAGE IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.integration.domain.tables.pojos.IMessage>> findManyByLanguage(Collection<String> values, int limit) {
                return findManyByCondition(IMessage.I_MESSAGE.LANGUAGE.in(values),limit);
        }

        /**
     * Find records that have <code>CREATED_AT IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.integration.domain.tables.pojos.IMessage>> findManyByCreatedAt(Collection<LocalDateTime> values) {
                return findManyByCondition(IMessage.I_MESSAGE.CREATED_AT.in(values));
        }

        /**
     * Find records that have <code>CREATED_AT IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.integration.domain.tables.pojos.IMessage>> findManyByCreatedAt(Collection<LocalDateTime> values, int limit) {
                return findManyByCondition(IMessage.I_MESSAGE.CREATED_AT.in(values),limit);
        }

        /**
     * Find records that have <code>CREATED_BY IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.integration.domain.tables.pojos.IMessage>> findManyByCreatedBy(Collection<String> values) {
                return findManyByCondition(IMessage.I_MESSAGE.CREATED_BY.in(values));
        }

        /**
     * Find records that have <code>CREATED_BY IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.integration.domain.tables.pojos.IMessage>> findManyByCreatedBy(Collection<String> values, int limit) {
                return findManyByCondition(IMessage.I_MESSAGE.CREATED_BY.in(values),limit);
        }

        /**
     * Find records that have <code>UPDATED_AT IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.integration.domain.tables.pojos.IMessage>> findManyByUpdatedAt(Collection<LocalDateTime> values) {
                return findManyByCondition(IMessage.I_MESSAGE.UPDATED_AT.in(values));
        }

        /**
     * Find records that have <code>UPDATED_AT IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.integration.domain.tables.pojos.IMessage>> findManyByUpdatedAt(Collection<LocalDateTime> values, int limit) {
                return findManyByCondition(IMessage.I_MESSAGE.UPDATED_AT.in(values),limit);
        }

        /**
     * Find records that have <code>UPDATED_BY IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.integration.domain.tables.pojos.IMessage>> findManyByUpdatedBy(Collection<String> values) {
                return findManyByCondition(IMessage.I_MESSAGE.UPDATED_BY.in(values));
        }

        /**
     * Find records that have <code>UPDATED_BY IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.integration.domain.tables.pojos.IMessage>> findManyByUpdatedBy(Collection<String> values, int limit) {
                return findManyByCondition(IMessage.I_MESSAGE.UPDATED_BY.in(values),limit);
        }

        @Override
        public JDBCClassicQueryExecutor<IMessageRecord,cn.vertxup.integration.domain.tables.pojos.IMessage,String> queryExecutor(){
                return (JDBCClassicQueryExecutor<IMessageRecord,cn.vertxup.integration.domain.tables.pojos.IMessage,String>) super.queryExecutor();
        }
}
