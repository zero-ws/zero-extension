/*
 * This file is generated by jOOQ.
 */
package io.zerows.extension.commerce.finance.domain.tables.daos;


import io.github.jklingsporn.vertx.jooq.shared.internal.AbstractVertxDAO;
import io.zerows.extension.commerce.finance.domain.tables.FTransItem;
import io.zerows.extension.commerce.finance.domain.tables.records.FTransItemRecord;

import java.math.BigDecimal;
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
public class FTransItemDao extends AbstractVertxDAO<FTransItemRecord, io.zerows.extension.commerce.finance.domain.tables.pojos.FTransItem, String, Future<List<io.zerows.extension.commerce.finance.domain.tables.pojos.FTransItem>>, Future<io.zerows.extension.commerce.finance.domain.tables.pojos.FTransItem>, Future<Integer>, Future<String>> implements io.github.jklingsporn.vertx.jooq.classic.VertxDAO<FTransItemRecord,io.zerows.extension.commerce.finance.domain.tables.pojos.FTransItem,String> {

        /**
     * @param configuration The Configuration used for rendering and query
     * execution.
     * @param vertx the vertx instance
     */
        public FTransItemDao(Configuration configuration, io.vertx.core.Vertx vertx) {
                super(FTransItem.F_TRANS_ITEM, io.zerows.extension.commerce.finance.domain.tables.pojos.FTransItem.class, new JDBCClassicQueryExecutor<FTransItemRecord,io.zerows.extension.commerce.finance.domain.tables.pojos.FTransItem,String>(configuration,io.zerows.extension.commerce.finance.domain.tables.pojos.FTransItem.class,vertx));
        }

        @Override
        protected String getId(io.zerows.extension.commerce.finance.domain.tables.pojos.FTransItem object) {
                return object.getKey();
        }

        /**
     * Find records that have <code>NAME IN (values)</code> asynchronously
     */
        public Future<List<io.zerows.extension.commerce.finance.domain.tables.pojos.FTransItem>> findManyByName(Collection<String> values) {
                return findManyByCondition(FTransItem.F_TRANS_ITEM.NAME.in(values));
        }

        /**
     * Find records that have <code>NAME IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<io.zerows.extension.commerce.finance.domain.tables.pojos.FTransItem>> findManyByName(Collection<String> values, int limit) {
                return findManyByCondition(FTransItem.F_TRANS_ITEM.NAME.in(values),limit);
        }

        /**
     * Find records that have <code>CODE IN (values)</code> asynchronously
     */
        public Future<List<io.zerows.extension.commerce.finance.domain.tables.pojos.FTransItem>> findManyByCode(Collection<String> values) {
                return findManyByCondition(FTransItem.F_TRANS_ITEM.CODE.in(values));
        }

        /**
     * Find records that have <code>CODE IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<io.zerows.extension.commerce.finance.domain.tables.pojos.FTransItem>> findManyByCode(Collection<String> values, int limit) {
                return findManyByCondition(FTransItem.F_TRANS_ITEM.CODE.in(values),limit);
        }

        /**
     * Find records that have <code>SERIAL IN (values)</code> asynchronously
     */
        public Future<List<io.zerows.extension.commerce.finance.domain.tables.pojos.FTransItem>> findManyBySerial(Collection<String> values) {
                return findManyByCondition(FTransItem.F_TRANS_ITEM.SERIAL.in(values));
        }

        /**
     * Find records that have <code>SERIAL IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<io.zerows.extension.commerce.finance.domain.tables.pojos.FTransItem>> findManyBySerial(Collection<String> values, int limit) {
                return findManyByCondition(FTransItem.F_TRANS_ITEM.SERIAL.in(values),limit);
        }

        /**
     * Find records that have <code>AMOUNT IN (values)</code> asynchronously
     */
        public Future<List<io.zerows.extension.commerce.finance.domain.tables.pojos.FTransItem>> findManyByAmount(Collection<BigDecimal> values) {
                return findManyByCondition(FTransItem.F_TRANS_ITEM.AMOUNT.in(values));
        }

        /**
     * Find records that have <code>AMOUNT IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<io.zerows.extension.commerce.finance.domain.tables.pojos.FTransItem>> findManyByAmount(Collection<BigDecimal> values, int limit) {
                return findManyByCondition(FTransItem.F_TRANS_ITEM.AMOUNT.in(values),limit);
        }

        /**
     * Find records that have <code>TRANSACTION_ID IN (values)</code>
     * asynchronously
     */
        public Future<List<io.zerows.extension.commerce.finance.domain.tables.pojos.FTransItem>> findManyByTransactionId(Collection<String> values) {
                return findManyByCondition(FTransItem.F_TRANS_ITEM.TRANSACTION_ID.in(values));
        }

        /**
     * Find records that have <code>TRANSACTION_ID IN (values)</code>
     * asynchronously limited by the given limit
     */
        public Future<List<io.zerows.extension.commerce.finance.domain.tables.pojos.FTransItem>> findManyByTransactionId(Collection<String> values, int limit) {
                return findManyByCondition(FTransItem.F_TRANS_ITEM.TRANSACTION_ID.in(values),limit);
        }

        /**
     * Find records that have <code>PAY_NAME IN (values)</code> asynchronously
     */
        public Future<List<io.zerows.extension.commerce.finance.domain.tables.pojos.FTransItem>> findManyByPayName(Collection<String> values) {
                return findManyByCondition(FTransItem.F_TRANS_ITEM.PAY_NAME.in(values));
        }

        /**
     * Find records that have <code>PAY_NAME IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<io.zerows.extension.commerce.finance.domain.tables.pojos.FTransItem>> findManyByPayName(Collection<String> values, int limit) {
                return findManyByCondition(FTransItem.F_TRANS_ITEM.PAY_NAME.in(values),limit);
        }

        /**
     * Find records that have <code>PAY_MOBILE IN (values)</code> asynchronously
     */
        public Future<List<io.zerows.extension.commerce.finance.domain.tables.pojos.FTransItem>> findManyByPayMobile(Collection<String> values) {
                return findManyByCondition(FTransItem.F_TRANS_ITEM.PAY_MOBILE.in(values));
        }

        /**
     * Find records that have <code>PAY_MOBILE IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<io.zerows.extension.commerce.finance.domain.tables.pojos.FTransItem>> findManyByPayMobile(Collection<String> values, int limit) {
                return findManyByCondition(FTransItem.F_TRANS_ITEM.PAY_MOBILE.in(values),limit);
        }

        /**
     * Find records that have <code>PAY_METHOD IN (values)</code> asynchronously
     */
        public Future<List<io.zerows.extension.commerce.finance.domain.tables.pojos.FTransItem>> findManyByPayMethod(Collection<String> values) {
                return findManyByCondition(FTransItem.F_TRANS_ITEM.PAY_METHOD.in(values));
        }

        /**
     * Find records that have <code>PAY_METHOD IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<io.zerows.extension.commerce.finance.domain.tables.pojos.FTransItem>> findManyByPayMethod(Collection<String> values, int limit) {
                return findManyByCondition(FTransItem.F_TRANS_ITEM.PAY_METHOD.in(values),limit);
        }

        /**
     * Find records that have <code>PAY_ID IN (values)</code> asynchronously
     */
        public Future<List<io.zerows.extension.commerce.finance.domain.tables.pojos.FTransItem>> findManyByPayId(Collection<String> values) {
                return findManyByCondition(FTransItem.F_TRANS_ITEM.PAY_ID.in(values));
        }

        /**
     * Find records that have <code>PAY_ID IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<io.zerows.extension.commerce.finance.domain.tables.pojos.FTransItem>> findManyByPayId(Collection<String> values, int limit) {
                return findManyByCondition(FTransItem.F_TRANS_ITEM.PAY_ID.in(values),limit);
        }

        /**
     * Find records that have <code>START_AT IN (values)</code> asynchronously
     */
        public Future<List<io.zerows.extension.commerce.finance.domain.tables.pojos.FTransItem>> findManyByStartAt(Collection<LocalDateTime> values) {
                return findManyByCondition(FTransItem.F_TRANS_ITEM.START_AT.in(values));
        }

        /**
     * Find records that have <code>START_AT IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<io.zerows.extension.commerce.finance.domain.tables.pojos.FTransItem>> findManyByStartAt(Collection<LocalDateTime> values, int limit) {
                return findManyByCondition(FTransItem.F_TRANS_ITEM.START_AT.in(values),limit);
        }

        /**
     * Find records that have <code>END_AT IN (values)</code> asynchronously
     */
        public Future<List<io.zerows.extension.commerce.finance.domain.tables.pojos.FTransItem>> findManyByEndAt(Collection<LocalDateTime> values) {
                return findManyByCondition(FTransItem.F_TRANS_ITEM.END_AT.in(values));
        }

        /**
     * Find records that have <code>END_AT IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<io.zerows.extension.commerce.finance.domain.tables.pojos.FTransItem>> findManyByEndAt(Collection<LocalDateTime> values, int limit) {
                return findManyByCondition(FTransItem.F_TRANS_ITEM.END_AT.in(values),limit);
        }

        /**
     * Find records that have <code>GROUP_BY IN (values)</code> asynchronously
     */
        public Future<List<io.zerows.extension.commerce.finance.domain.tables.pojos.FTransItem>> findManyByGroupBy(Collection<String> values) {
                return findManyByCondition(FTransItem.F_TRANS_ITEM.GROUP_BY.in(values));
        }

        /**
     * Find records that have <code>GROUP_BY IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<io.zerows.extension.commerce.finance.domain.tables.pojos.FTransItem>> findManyByGroupBy(Collection<String> values, int limit) {
                return findManyByCondition(FTransItem.F_TRANS_ITEM.GROUP_BY.in(values),limit);
        }

        /**
     * Find records that have <code>SIGMA IN (values)</code> asynchronously
     */
        public Future<List<io.zerows.extension.commerce.finance.domain.tables.pojos.FTransItem>> findManyBySigma(Collection<String> values) {
                return findManyByCondition(FTransItem.F_TRANS_ITEM.SIGMA.in(values));
        }

        /**
     * Find records that have <code>SIGMA IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<io.zerows.extension.commerce.finance.domain.tables.pojos.FTransItem>> findManyBySigma(Collection<String> values, int limit) {
                return findManyByCondition(FTransItem.F_TRANS_ITEM.SIGMA.in(values),limit);
        }

        /**
     * Find records that have <code>LANGUAGE IN (values)</code> asynchronously
     */
        public Future<List<io.zerows.extension.commerce.finance.domain.tables.pojos.FTransItem>> findManyByLanguage(Collection<String> values) {
                return findManyByCondition(FTransItem.F_TRANS_ITEM.LANGUAGE.in(values));
        }

        /**
     * Find records that have <code>LANGUAGE IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<io.zerows.extension.commerce.finance.domain.tables.pojos.FTransItem>> findManyByLanguage(Collection<String> values, int limit) {
                return findManyByCondition(FTransItem.F_TRANS_ITEM.LANGUAGE.in(values),limit);
        }

        /**
     * Find records that have <code>ACTIVE IN (values)</code> asynchronously
     */
        public Future<List<io.zerows.extension.commerce.finance.domain.tables.pojos.FTransItem>> findManyByActive(Collection<Boolean> values) {
                return findManyByCondition(FTransItem.F_TRANS_ITEM.ACTIVE.in(values));
        }

        /**
     * Find records that have <code>ACTIVE IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<io.zerows.extension.commerce.finance.domain.tables.pojos.FTransItem>> findManyByActive(Collection<Boolean> values, int limit) {
                return findManyByCondition(FTransItem.F_TRANS_ITEM.ACTIVE.in(values),limit);
        }

        /**
     * Find records that have <code>METADATA IN (values)</code> asynchronously
     */
        public Future<List<io.zerows.extension.commerce.finance.domain.tables.pojos.FTransItem>> findManyByMetadata(Collection<String> values) {
                return findManyByCondition(FTransItem.F_TRANS_ITEM.METADATA.in(values));
        }

        /**
     * Find records that have <code>METADATA IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<io.zerows.extension.commerce.finance.domain.tables.pojos.FTransItem>> findManyByMetadata(Collection<String> values, int limit) {
                return findManyByCondition(FTransItem.F_TRANS_ITEM.METADATA.in(values),limit);
        }

        /**
     * Find records that have <code>CREATED_AT IN (values)</code> asynchronously
     */
        public Future<List<io.zerows.extension.commerce.finance.domain.tables.pojos.FTransItem>> findManyByCreatedAt(Collection<LocalDateTime> values) {
                return findManyByCondition(FTransItem.F_TRANS_ITEM.CREATED_AT.in(values));
        }

        /**
     * Find records that have <code>CREATED_AT IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<io.zerows.extension.commerce.finance.domain.tables.pojos.FTransItem>> findManyByCreatedAt(Collection<LocalDateTime> values, int limit) {
                return findManyByCondition(FTransItem.F_TRANS_ITEM.CREATED_AT.in(values),limit);
        }

        /**
     * Find records that have <code>CREATED_BY IN (values)</code> asynchronously
     */
        public Future<List<io.zerows.extension.commerce.finance.domain.tables.pojos.FTransItem>> findManyByCreatedBy(Collection<String> values) {
                return findManyByCondition(FTransItem.F_TRANS_ITEM.CREATED_BY.in(values));
        }

        /**
     * Find records that have <code>CREATED_BY IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<io.zerows.extension.commerce.finance.domain.tables.pojos.FTransItem>> findManyByCreatedBy(Collection<String> values, int limit) {
                return findManyByCondition(FTransItem.F_TRANS_ITEM.CREATED_BY.in(values),limit);
        }

        /**
     * Find records that have <code>UPDATED_AT IN (values)</code> asynchronously
     */
        public Future<List<io.zerows.extension.commerce.finance.domain.tables.pojos.FTransItem>> findManyByUpdatedAt(Collection<LocalDateTime> values) {
                return findManyByCondition(FTransItem.F_TRANS_ITEM.UPDATED_AT.in(values));
        }

        /**
     * Find records that have <code>UPDATED_AT IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<io.zerows.extension.commerce.finance.domain.tables.pojos.FTransItem>> findManyByUpdatedAt(Collection<LocalDateTime> values, int limit) {
                return findManyByCondition(FTransItem.F_TRANS_ITEM.UPDATED_AT.in(values),limit);
        }

        /**
     * Find records that have <code>UPDATED_BY IN (values)</code> asynchronously
     */
        public Future<List<io.zerows.extension.commerce.finance.domain.tables.pojos.FTransItem>> findManyByUpdatedBy(Collection<String> values) {
                return findManyByCondition(FTransItem.F_TRANS_ITEM.UPDATED_BY.in(values));
        }

        /**
     * Find records that have <code>UPDATED_BY IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<io.zerows.extension.commerce.finance.domain.tables.pojos.FTransItem>> findManyByUpdatedBy(Collection<String> values, int limit) {
                return findManyByCondition(FTransItem.F_TRANS_ITEM.UPDATED_BY.in(values),limit);
        }

        @Override
        public JDBCClassicQueryExecutor<FTransItemRecord,io.zerows.extension.commerce.finance.domain.tables.pojos.FTransItem,String> queryExecutor(){
                return (JDBCClassicQueryExecutor<FTransItemRecord,io.zerows.extension.commerce.finance.domain.tables.pojos.FTransItem,String>) super.queryExecutor();
        }
}
