/*
 * This file is generated by jOOQ.
 */
package io.zerows.extension.commerce.lbs.domain.tables.daos;


import io.github.jklingsporn.vertx.jooq.shared.internal.AbstractVertxDAO;
import io.zerows.extension.commerce.lbs.domain.tables.LState;
import io.zerows.extension.commerce.lbs.domain.tables.records.LStateRecord;

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
public class LStateDao extends AbstractVertxDAO<LStateRecord, io.zerows.extension.commerce.lbs.domain.tables.pojos.LState, String, Future<List<io.zerows.extension.commerce.lbs.domain.tables.pojos.LState>>, Future<io.zerows.extension.commerce.lbs.domain.tables.pojos.LState>, Future<Integer>, Future<String>> implements io.github.jklingsporn.vertx.jooq.classic.VertxDAO<LStateRecord,io.zerows.extension.commerce.lbs.domain.tables.pojos.LState,String> {

        /**
     * @param configuration The Configuration used for rendering and query
     * execution.
     * @param vertx the vertx instance
     */
        public LStateDao(Configuration configuration, io.vertx.core.Vertx vertx) {
                super(LState.L_STATE, io.zerows.extension.commerce.lbs.domain.tables.pojos.LState.class, new JDBCClassicQueryExecutor<LStateRecord,io.zerows.extension.commerce.lbs.domain.tables.pojos.LState,String>(configuration,io.zerows.extension.commerce.lbs.domain.tables.pojos.LState.class,vertx));
        }

        @Override
        protected String getId(io.zerows.extension.commerce.lbs.domain.tables.pojos.LState object) {
                return object.getKey();
        }

        /**
     * Find records that have <code>NAME IN (values)</code> asynchronously
     */
        public Future<List<io.zerows.extension.commerce.lbs.domain.tables.pojos.LState>> findManyByName(Collection<String> values) {
                return findManyByCondition(LState.L_STATE.NAME.in(values));
        }

        /**
     * Find records that have <code>NAME IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<io.zerows.extension.commerce.lbs.domain.tables.pojos.LState>> findManyByName(Collection<String> values, int limit) {
                return findManyByCondition(LState.L_STATE.NAME.in(values),limit);
        }

        /**
     * Find records that have <code>CODE IN (values)</code> asynchronously
     */
        public Future<List<io.zerows.extension.commerce.lbs.domain.tables.pojos.LState>> findManyByCode(Collection<String> values) {
                return findManyByCondition(LState.L_STATE.CODE.in(values));
        }

        /**
     * Find records that have <code>CODE IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<io.zerows.extension.commerce.lbs.domain.tables.pojos.LState>> findManyByCode(Collection<String> values, int limit) {
                return findManyByCondition(LState.L_STATE.CODE.in(values),limit);
        }

        /**
     * Find records that have <code>ALIAS IN (values)</code> asynchronously
     */
        public Future<List<io.zerows.extension.commerce.lbs.domain.tables.pojos.LState>> findManyByAlias(Collection<String> values) {
                return findManyByCondition(LState.L_STATE.ALIAS.in(values));
        }

        /**
     * Find records that have <code>ALIAS IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<io.zerows.extension.commerce.lbs.domain.tables.pojos.LState>> findManyByAlias(Collection<String> values, int limit) {
                return findManyByCondition(LState.L_STATE.ALIAS.in(values),limit);
        }

        /**
     * Find records that have <code>METADATA IN (values)</code> asynchronously
     */
        public Future<List<io.zerows.extension.commerce.lbs.domain.tables.pojos.LState>> findManyByMetadata(Collection<String> values) {
                return findManyByCondition(LState.L_STATE.METADATA.in(values));
        }

        /**
     * Find records that have <code>METADATA IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<io.zerows.extension.commerce.lbs.domain.tables.pojos.LState>> findManyByMetadata(Collection<String> values, int limit) {
                return findManyByCondition(LState.L_STATE.METADATA.in(values),limit);
        }

        /**
     * Find records that have <code>ORDER IN (values)</code> asynchronously
     */
        public Future<List<io.zerows.extension.commerce.lbs.domain.tables.pojos.LState>> findManyByOrder(Collection<Integer> values) {
                return findManyByCondition(LState.L_STATE.ORDER.in(values));
        }

        /**
     * Find records that have <code>ORDER IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<io.zerows.extension.commerce.lbs.domain.tables.pojos.LState>> findManyByOrder(Collection<Integer> values, int limit) {
                return findManyByCondition(LState.L_STATE.ORDER.in(values),limit);
        }

        /**
     * Find records that have <code>COUNTRY_ID IN (values)</code> asynchronously
     */
        public Future<List<io.zerows.extension.commerce.lbs.domain.tables.pojos.LState>> findManyByCountryId(Collection<String> values) {
                return findManyByCondition(LState.L_STATE.COUNTRY_ID.in(values));
        }

        /**
     * Find records that have <code>COUNTRY_ID IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<io.zerows.extension.commerce.lbs.domain.tables.pojos.LState>> findManyByCountryId(Collection<String> values, int limit) {
                return findManyByCondition(LState.L_STATE.COUNTRY_ID.in(values),limit);
        }

        /**
     * Find records that have <code>ACTIVE IN (values)</code> asynchronously
     */
        public Future<List<io.zerows.extension.commerce.lbs.domain.tables.pojos.LState>> findManyByActive(Collection<Boolean> values) {
                return findManyByCondition(LState.L_STATE.ACTIVE.in(values));
        }

        /**
     * Find records that have <code>ACTIVE IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<io.zerows.extension.commerce.lbs.domain.tables.pojos.LState>> findManyByActive(Collection<Boolean> values, int limit) {
                return findManyByCondition(LState.L_STATE.ACTIVE.in(values),limit);
        }

        /**
     * Find records that have <code>SIGMA IN (values)</code> asynchronously
     */
        public Future<List<io.zerows.extension.commerce.lbs.domain.tables.pojos.LState>> findManyBySigma(Collection<String> values) {
                return findManyByCondition(LState.L_STATE.SIGMA.in(values));
        }

        /**
     * Find records that have <code>SIGMA IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<io.zerows.extension.commerce.lbs.domain.tables.pojos.LState>> findManyBySigma(Collection<String> values, int limit) {
                return findManyByCondition(LState.L_STATE.SIGMA.in(values),limit);
        }

        /**
     * Find records that have <code>LANGUAGE IN (values)</code> asynchronously
     */
        public Future<List<io.zerows.extension.commerce.lbs.domain.tables.pojos.LState>> findManyByLanguage(Collection<String> values) {
                return findManyByCondition(LState.L_STATE.LANGUAGE.in(values));
        }

        /**
     * Find records that have <code>LANGUAGE IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<io.zerows.extension.commerce.lbs.domain.tables.pojos.LState>> findManyByLanguage(Collection<String> values, int limit) {
                return findManyByCondition(LState.L_STATE.LANGUAGE.in(values),limit);
        }

        /**
     * Find records that have <code>CREATED_AT IN (values)</code> asynchronously
     */
        public Future<List<io.zerows.extension.commerce.lbs.domain.tables.pojos.LState>> findManyByCreatedAt(Collection<LocalDateTime> values) {
                return findManyByCondition(LState.L_STATE.CREATED_AT.in(values));
        }

        /**
     * Find records that have <code>CREATED_AT IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<io.zerows.extension.commerce.lbs.domain.tables.pojos.LState>> findManyByCreatedAt(Collection<LocalDateTime> values, int limit) {
                return findManyByCondition(LState.L_STATE.CREATED_AT.in(values),limit);
        }

        /**
     * Find records that have <code>CREATED_BY IN (values)</code> asynchronously
     */
        public Future<List<io.zerows.extension.commerce.lbs.domain.tables.pojos.LState>> findManyByCreatedBy(Collection<String> values) {
                return findManyByCondition(LState.L_STATE.CREATED_BY.in(values));
        }

        /**
     * Find records that have <code>CREATED_BY IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<io.zerows.extension.commerce.lbs.domain.tables.pojos.LState>> findManyByCreatedBy(Collection<String> values, int limit) {
                return findManyByCondition(LState.L_STATE.CREATED_BY.in(values),limit);
        }

        /**
     * Find records that have <code>UPDATED_AT IN (values)</code> asynchronously
     */
        public Future<List<io.zerows.extension.commerce.lbs.domain.tables.pojos.LState>> findManyByUpdatedAt(Collection<LocalDateTime> values) {
                return findManyByCondition(LState.L_STATE.UPDATED_AT.in(values));
        }

        /**
     * Find records that have <code>UPDATED_AT IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<io.zerows.extension.commerce.lbs.domain.tables.pojos.LState>> findManyByUpdatedAt(Collection<LocalDateTime> values, int limit) {
                return findManyByCondition(LState.L_STATE.UPDATED_AT.in(values),limit);
        }

        /**
     * Find records that have <code>UPDATED_BY IN (values)</code> asynchronously
     */
        public Future<List<io.zerows.extension.commerce.lbs.domain.tables.pojos.LState>> findManyByUpdatedBy(Collection<String> values) {
                return findManyByCondition(LState.L_STATE.UPDATED_BY.in(values));
        }

        /**
     * Find records that have <code>UPDATED_BY IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<io.zerows.extension.commerce.lbs.domain.tables.pojos.LState>> findManyByUpdatedBy(Collection<String> values, int limit) {
                return findManyByCondition(LState.L_STATE.UPDATED_BY.in(values),limit);
        }

        @Override
        public JDBCClassicQueryExecutor<LStateRecord,io.zerows.extension.commerce.lbs.domain.tables.pojos.LState,String> queryExecutor(){
                return (JDBCClassicQueryExecutor<LStateRecord,io.zerows.extension.commerce.lbs.domain.tables.pojos.LState,String>) super.queryExecutor();
        }
}