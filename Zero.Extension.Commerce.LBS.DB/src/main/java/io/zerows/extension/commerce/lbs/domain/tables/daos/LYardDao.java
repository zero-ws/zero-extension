/*
 * This file is generated by jOOQ.
 */
package io.zerows.extension.commerce.lbs.domain.tables.daos;


import io.github.jklingsporn.vertx.jooq.shared.internal.AbstractVertxDAO;
import io.zerows.extension.commerce.lbs.domain.tables.LYard;
import io.zerows.extension.commerce.lbs.domain.tables.records.LYardRecord;

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
public class LYardDao extends AbstractVertxDAO<LYardRecord, io.zerows.extension.commerce.lbs.domain.tables.pojos.LYard, String, Future<List<io.zerows.extension.commerce.lbs.domain.tables.pojos.LYard>>, Future<io.zerows.extension.commerce.lbs.domain.tables.pojos.LYard>, Future<Integer>, Future<String>> implements io.github.jklingsporn.vertx.jooq.classic.VertxDAO<LYardRecord,io.zerows.extension.commerce.lbs.domain.tables.pojos.LYard,String> {

        /**
     * @param configuration The Configuration used for rendering and query
     * execution.
     * @param vertx the vertx instance
     */
        public LYardDao(Configuration configuration, io.vertx.core.Vertx vertx) {
                super(LYard.L_YARD, io.zerows.extension.commerce.lbs.domain.tables.pojos.LYard.class, new JDBCClassicQueryExecutor<LYardRecord,io.zerows.extension.commerce.lbs.domain.tables.pojos.LYard,String>(configuration,io.zerows.extension.commerce.lbs.domain.tables.pojos.LYard.class,vertx));
        }

        @Override
        protected String getId(io.zerows.extension.commerce.lbs.domain.tables.pojos.LYard object) {
                return object.getKey();
        }

        /**
     * Find records that have <code>NAME IN (values)</code> asynchronously
     */
        public Future<List<io.zerows.extension.commerce.lbs.domain.tables.pojos.LYard>> findManyByName(Collection<String> values) {
                return findManyByCondition(LYard.L_YARD.NAME.in(values));
        }

        /**
     * Find records that have <code>NAME IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<io.zerows.extension.commerce.lbs.domain.tables.pojos.LYard>> findManyByName(Collection<String> values, int limit) {
                return findManyByCondition(LYard.L_YARD.NAME.in(values),limit);
        }

        /**
     * Find records that have <code>CODE IN (values)</code> asynchronously
     */
        public Future<List<io.zerows.extension.commerce.lbs.domain.tables.pojos.LYard>> findManyByCode(Collection<String> values) {
                return findManyByCondition(LYard.L_YARD.CODE.in(values));
        }

        /**
     * Find records that have <code>CODE IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<io.zerows.extension.commerce.lbs.domain.tables.pojos.LYard>> findManyByCode(Collection<String> values, int limit) {
                return findManyByCondition(LYard.L_YARD.CODE.in(values),limit);
        }

        /**
     * Find records that have <code>METADATA IN (values)</code> asynchronously
     */
        public Future<List<io.zerows.extension.commerce.lbs.domain.tables.pojos.LYard>> findManyByMetadata(Collection<String> values) {
                return findManyByCondition(LYard.L_YARD.METADATA.in(values));
        }

        /**
     * Find records that have <code>METADATA IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<io.zerows.extension.commerce.lbs.domain.tables.pojos.LYard>> findManyByMetadata(Collection<String> values, int limit) {
                return findManyByCondition(LYard.L_YARD.METADATA.in(values),limit);
        }

        /**
     * Find records that have <code>ORDER IN (values)</code> asynchronously
     */
        public Future<List<io.zerows.extension.commerce.lbs.domain.tables.pojos.LYard>> findManyByOrder(Collection<Integer> values) {
                return findManyByCondition(LYard.L_YARD.ORDER.in(values));
        }

        /**
     * Find records that have <code>ORDER IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<io.zerows.extension.commerce.lbs.domain.tables.pojos.LYard>> findManyByOrder(Collection<Integer> values, int limit) {
                return findManyByCondition(LYard.L_YARD.ORDER.in(values),limit);
        }

        /**
     * Find records that have <code>LOCATION_ID IN (values)</code>
     * asynchronously
     */
        public Future<List<io.zerows.extension.commerce.lbs.domain.tables.pojos.LYard>> findManyByLocationId(Collection<String> values) {
                return findManyByCondition(LYard.L_YARD.LOCATION_ID.in(values));
        }

        /**
     * Find records that have <code>LOCATION_ID IN (values)</code>
     * asynchronously limited by the given limit
     */
        public Future<List<io.zerows.extension.commerce.lbs.domain.tables.pojos.LYard>> findManyByLocationId(Collection<String> values, int limit) {
                return findManyByCondition(LYard.L_YARD.LOCATION_ID.in(values),limit);
        }

        /**
     * Find records that have <code>ACTIVE IN (values)</code> asynchronously
     */
        public Future<List<io.zerows.extension.commerce.lbs.domain.tables.pojos.LYard>> findManyByActive(Collection<Boolean> values) {
                return findManyByCondition(LYard.L_YARD.ACTIVE.in(values));
        }

        /**
     * Find records that have <code>ACTIVE IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<io.zerows.extension.commerce.lbs.domain.tables.pojos.LYard>> findManyByActive(Collection<Boolean> values, int limit) {
                return findManyByCondition(LYard.L_YARD.ACTIVE.in(values),limit);
        }

        /**
     * Find records that have <code>SIGMA IN (values)</code> asynchronously
     */
        public Future<List<io.zerows.extension.commerce.lbs.domain.tables.pojos.LYard>> findManyBySigma(Collection<String> values) {
                return findManyByCondition(LYard.L_YARD.SIGMA.in(values));
        }

        /**
     * Find records that have <code>SIGMA IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<io.zerows.extension.commerce.lbs.domain.tables.pojos.LYard>> findManyBySigma(Collection<String> values, int limit) {
                return findManyByCondition(LYard.L_YARD.SIGMA.in(values),limit);
        }

        /**
     * Find records that have <code>LANGUAGE IN (values)</code> asynchronously
     */
        public Future<List<io.zerows.extension.commerce.lbs.domain.tables.pojos.LYard>> findManyByLanguage(Collection<String> values) {
                return findManyByCondition(LYard.L_YARD.LANGUAGE.in(values));
        }

        /**
     * Find records that have <code>LANGUAGE IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<io.zerows.extension.commerce.lbs.domain.tables.pojos.LYard>> findManyByLanguage(Collection<String> values, int limit) {
                return findManyByCondition(LYard.L_YARD.LANGUAGE.in(values),limit);
        }

        /**
     * Find records that have <code>CREATED_AT IN (values)</code> asynchronously
     */
        public Future<List<io.zerows.extension.commerce.lbs.domain.tables.pojos.LYard>> findManyByCreatedAt(Collection<LocalDateTime> values) {
                return findManyByCondition(LYard.L_YARD.CREATED_AT.in(values));
        }

        /**
     * Find records that have <code>CREATED_AT IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<io.zerows.extension.commerce.lbs.domain.tables.pojos.LYard>> findManyByCreatedAt(Collection<LocalDateTime> values, int limit) {
                return findManyByCondition(LYard.L_YARD.CREATED_AT.in(values),limit);
        }

        /**
     * Find records that have <code>CREATED_BY IN (values)</code> asynchronously
     */
        public Future<List<io.zerows.extension.commerce.lbs.domain.tables.pojos.LYard>> findManyByCreatedBy(Collection<String> values) {
                return findManyByCondition(LYard.L_YARD.CREATED_BY.in(values));
        }

        /**
     * Find records that have <code>CREATED_BY IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<io.zerows.extension.commerce.lbs.domain.tables.pojos.LYard>> findManyByCreatedBy(Collection<String> values, int limit) {
                return findManyByCondition(LYard.L_YARD.CREATED_BY.in(values),limit);
        }

        /**
     * Find records that have <code>UPDATED_AT IN (values)</code> asynchronously
     */
        public Future<List<io.zerows.extension.commerce.lbs.domain.tables.pojos.LYard>> findManyByUpdatedAt(Collection<LocalDateTime> values) {
                return findManyByCondition(LYard.L_YARD.UPDATED_AT.in(values));
        }

        /**
     * Find records that have <code>UPDATED_AT IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<io.zerows.extension.commerce.lbs.domain.tables.pojos.LYard>> findManyByUpdatedAt(Collection<LocalDateTime> values, int limit) {
                return findManyByCondition(LYard.L_YARD.UPDATED_AT.in(values),limit);
        }

        /**
     * Find records that have <code>UPDATED_BY IN (values)</code> asynchronously
     */
        public Future<List<io.zerows.extension.commerce.lbs.domain.tables.pojos.LYard>> findManyByUpdatedBy(Collection<String> values) {
                return findManyByCondition(LYard.L_YARD.UPDATED_BY.in(values));
        }

        /**
     * Find records that have <code>UPDATED_BY IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<io.zerows.extension.commerce.lbs.domain.tables.pojos.LYard>> findManyByUpdatedBy(Collection<String> values, int limit) {
                return findManyByCondition(LYard.L_YARD.UPDATED_BY.in(values),limit);
        }

        @Override
        public JDBCClassicQueryExecutor<LYardRecord,io.zerows.extension.commerce.lbs.domain.tables.pojos.LYard,String> queryExecutor(){
                return (JDBCClassicQueryExecutor<LYardRecord,io.zerows.extension.commerce.lbs.domain.tables.pojos.LYard,String>) super.queryExecutor();
        }
}
