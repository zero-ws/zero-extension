/*
 * This file is generated by jOOQ.
 */
package io.zerows.extension.runtime.tpl.domain.tables.daos;


import io.github.jklingsporn.vertx.jooq.shared.internal.AbstractVertxDAO;
import io.zerows.extension.runtime.tpl.domain.tables.MyNotify;
import io.zerows.extension.runtime.tpl.domain.tables.records.MyNotifyRecord;

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
public class MyNotifyDao extends AbstractVertxDAO<MyNotifyRecord, io.zerows.extension.runtime.tpl.domain.tables.pojos.MyNotify, String, Future<List<io.zerows.extension.runtime.tpl.domain.tables.pojos.MyNotify>>, Future<io.zerows.extension.runtime.tpl.domain.tables.pojos.MyNotify>, Future<Integer>, Future<String>> implements io.github.jklingsporn.vertx.jooq.classic.VertxDAO<MyNotifyRecord,io.zerows.extension.runtime.tpl.domain.tables.pojos.MyNotify,String> {

        /**
     * @param configuration The Configuration used for rendering and query
     * execution.
     * @param vertx the vertx instance
     */
        public MyNotifyDao(Configuration configuration, io.vertx.core.Vertx vertx) {
                super(MyNotify.MY_NOTIFY, io.zerows.extension.runtime.tpl.domain.tables.pojos.MyNotify.class, new JDBCClassicQueryExecutor<MyNotifyRecord,io.zerows.extension.runtime.tpl.domain.tables.pojos.MyNotify,String>(configuration,io.zerows.extension.runtime.tpl.domain.tables.pojos.MyNotify.class,vertx));
        }

        @Override
        protected String getId(io.zerows.extension.runtime.tpl.domain.tables.pojos.MyNotify object) {
                return object.getKey();
        }

        /**
     * Find records that have <code>OWNER_TYPE IN (values)</code> asynchronously
     */
        public Future<List<io.zerows.extension.runtime.tpl.domain.tables.pojos.MyNotify>> findManyByOwnerType(Collection<String> values) {
                return findManyByCondition(MyNotify.MY_NOTIFY.OWNER_TYPE.in(values));
        }

        /**
     * Find records that have <code>OWNER_TYPE IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<io.zerows.extension.runtime.tpl.domain.tables.pojos.MyNotify>> findManyByOwnerType(Collection<String> values, int limit) {
                return findManyByCondition(MyNotify.MY_NOTIFY.OWNER_TYPE.in(values),limit);
        }

        /**
     * Find records that have <code>OWNER_ID IN (values)</code> asynchronously
     */
        public Future<List<io.zerows.extension.runtime.tpl.domain.tables.pojos.MyNotify>> findManyByOwnerId(Collection<String> values) {
                return findManyByCondition(MyNotify.MY_NOTIFY.OWNER_ID.in(values));
        }

        /**
     * Find records that have <code>OWNER_ID IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<io.zerows.extension.runtime.tpl.domain.tables.pojos.MyNotify>> findManyByOwnerId(Collection<String> values, int limit) {
                return findManyByCondition(MyNotify.MY_NOTIFY.OWNER_ID.in(values),limit);
        }

        /**
     * Find records that have <code>CONFIG_INTERNAL IN (values)</code>
     * asynchronously
     */
        public Future<List<io.zerows.extension.runtime.tpl.domain.tables.pojos.MyNotify>> findManyByConfigInternal(Collection<String> values) {
                return findManyByCondition(MyNotify.MY_NOTIFY.CONFIG_INTERNAL.in(values));
        }

        /**
     * Find records that have <code>CONFIG_INTERNAL IN (values)</code>
     * asynchronously limited by the given limit
     */
        public Future<List<io.zerows.extension.runtime.tpl.domain.tables.pojos.MyNotify>> findManyByConfigInternal(Collection<String> values, int limit) {
                return findManyByCondition(MyNotify.MY_NOTIFY.CONFIG_INTERNAL.in(values),limit);
        }

        /**
     * Find records that have <code>CONFIG_EMAIL IN (values)</code>
     * asynchronously
     */
        public Future<List<io.zerows.extension.runtime.tpl.domain.tables.pojos.MyNotify>> findManyByConfigEmail(Collection<String> values) {
                return findManyByCondition(MyNotify.MY_NOTIFY.CONFIG_EMAIL.in(values));
        }

        /**
     * Find records that have <code>CONFIG_EMAIL IN (values)</code>
     * asynchronously limited by the given limit
     */
        public Future<List<io.zerows.extension.runtime.tpl.domain.tables.pojos.MyNotify>> findManyByConfigEmail(Collection<String> values, int limit) {
                return findManyByCondition(MyNotify.MY_NOTIFY.CONFIG_EMAIL.in(values),limit);
        }

        /**
     * Find records that have <code>CONFIG_SMS IN (values)</code> asynchronously
     */
        public Future<List<io.zerows.extension.runtime.tpl.domain.tables.pojos.MyNotify>> findManyByConfigSms(Collection<String> values) {
                return findManyByCondition(MyNotify.MY_NOTIFY.CONFIG_SMS.in(values));
        }

        /**
     * Find records that have <code>CONFIG_SMS IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<io.zerows.extension.runtime.tpl.domain.tables.pojos.MyNotify>> findManyByConfigSms(Collection<String> values, int limit) {
                return findManyByCondition(MyNotify.MY_NOTIFY.CONFIG_SMS.in(values),limit);
        }

        /**
     * Find records that have <code>APP_ID IN (values)</code> asynchronously
     */
        public Future<List<io.zerows.extension.runtime.tpl.domain.tables.pojos.MyNotify>> findManyByAppId(Collection<String> values) {
                return findManyByCondition(MyNotify.MY_NOTIFY.APP_ID.in(values));
        }

        /**
     * Find records that have <code>APP_ID IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<io.zerows.extension.runtime.tpl.domain.tables.pojos.MyNotify>> findManyByAppId(Collection<String> values, int limit) {
                return findManyByCondition(MyNotify.MY_NOTIFY.APP_ID.in(values),limit);
        }

        /**
     * Find records that have <code>ACTIVE IN (values)</code> asynchronously
     */
        public Future<List<io.zerows.extension.runtime.tpl.domain.tables.pojos.MyNotify>> findManyByActive(Collection<Boolean> values) {
                return findManyByCondition(MyNotify.MY_NOTIFY.ACTIVE.in(values));
        }

        /**
     * Find records that have <code>ACTIVE IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<io.zerows.extension.runtime.tpl.domain.tables.pojos.MyNotify>> findManyByActive(Collection<Boolean> values, int limit) {
                return findManyByCondition(MyNotify.MY_NOTIFY.ACTIVE.in(values),limit);
        }

        /**
     * Find records that have <code>SIGMA IN (values)</code> asynchronously
     */
        public Future<List<io.zerows.extension.runtime.tpl.domain.tables.pojos.MyNotify>> findManyBySigma(Collection<String> values) {
                return findManyByCondition(MyNotify.MY_NOTIFY.SIGMA.in(values));
        }

        /**
     * Find records that have <code>SIGMA IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<io.zerows.extension.runtime.tpl.domain.tables.pojos.MyNotify>> findManyBySigma(Collection<String> values, int limit) {
                return findManyByCondition(MyNotify.MY_NOTIFY.SIGMA.in(values),limit);
        }

        /**
     * Find records that have <code>METADATA IN (values)</code> asynchronously
     */
        public Future<List<io.zerows.extension.runtime.tpl.domain.tables.pojos.MyNotify>> findManyByMetadata(Collection<String> values) {
                return findManyByCondition(MyNotify.MY_NOTIFY.METADATA.in(values));
        }

        /**
     * Find records that have <code>METADATA IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<io.zerows.extension.runtime.tpl.domain.tables.pojos.MyNotify>> findManyByMetadata(Collection<String> values, int limit) {
                return findManyByCondition(MyNotify.MY_NOTIFY.METADATA.in(values),limit);
        }

        /**
     * Find records that have <code>LANGUAGE IN (values)</code> asynchronously
     */
        public Future<List<io.zerows.extension.runtime.tpl.domain.tables.pojos.MyNotify>> findManyByLanguage(Collection<String> values) {
                return findManyByCondition(MyNotify.MY_NOTIFY.LANGUAGE.in(values));
        }

        /**
     * Find records that have <code>LANGUAGE IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<io.zerows.extension.runtime.tpl.domain.tables.pojos.MyNotify>> findManyByLanguage(Collection<String> values, int limit) {
                return findManyByCondition(MyNotify.MY_NOTIFY.LANGUAGE.in(values),limit);
        }

        /**
     * Find records that have <code>CREATED_AT IN (values)</code> asynchronously
     */
        public Future<List<io.zerows.extension.runtime.tpl.domain.tables.pojos.MyNotify>> findManyByCreatedAt(Collection<LocalDateTime> values) {
                return findManyByCondition(MyNotify.MY_NOTIFY.CREATED_AT.in(values));
        }

        /**
     * Find records that have <code>CREATED_AT IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<io.zerows.extension.runtime.tpl.domain.tables.pojos.MyNotify>> findManyByCreatedAt(Collection<LocalDateTime> values, int limit) {
                return findManyByCondition(MyNotify.MY_NOTIFY.CREATED_AT.in(values),limit);
        }

        /**
     * Find records that have <code>CREATED_BY IN (values)</code> asynchronously
     */
        public Future<List<io.zerows.extension.runtime.tpl.domain.tables.pojos.MyNotify>> findManyByCreatedBy(Collection<String> values) {
                return findManyByCondition(MyNotify.MY_NOTIFY.CREATED_BY.in(values));
        }

        /**
     * Find records that have <code>CREATED_BY IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<io.zerows.extension.runtime.tpl.domain.tables.pojos.MyNotify>> findManyByCreatedBy(Collection<String> values, int limit) {
                return findManyByCondition(MyNotify.MY_NOTIFY.CREATED_BY.in(values),limit);
        }

        /**
     * Find records that have <code>UPDATED_AT IN (values)</code> asynchronously
     */
        public Future<List<io.zerows.extension.runtime.tpl.domain.tables.pojos.MyNotify>> findManyByUpdatedAt(Collection<LocalDateTime> values) {
                return findManyByCondition(MyNotify.MY_NOTIFY.UPDATED_AT.in(values));
        }

        /**
     * Find records that have <code>UPDATED_AT IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<io.zerows.extension.runtime.tpl.domain.tables.pojos.MyNotify>> findManyByUpdatedAt(Collection<LocalDateTime> values, int limit) {
                return findManyByCondition(MyNotify.MY_NOTIFY.UPDATED_AT.in(values),limit);
        }

        /**
     * Find records that have <code>UPDATED_BY IN (values)</code> asynchronously
     */
        public Future<List<io.zerows.extension.runtime.tpl.domain.tables.pojos.MyNotify>> findManyByUpdatedBy(Collection<String> values) {
                return findManyByCondition(MyNotify.MY_NOTIFY.UPDATED_BY.in(values));
        }

        /**
     * Find records that have <code>UPDATED_BY IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<io.zerows.extension.runtime.tpl.domain.tables.pojos.MyNotify>> findManyByUpdatedBy(Collection<String> values, int limit) {
                return findManyByCondition(MyNotify.MY_NOTIFY.UPDATED_BY.in(values),limit);
        }

        @Override
        public JDBCClassicQueryExecutor<MyNotifyRecord,io.zerows.extension.runtime.tpl.domain.tables.pojos.MyNotify,String> queryExecutor(){
                return (JDBCClassicQueryExecutor<MyNotifyRecord,io.zerows.extension.runtime.tpl.domain.tables.pojos.MyNotify,String>) super.queryExecutor();
        }
}
