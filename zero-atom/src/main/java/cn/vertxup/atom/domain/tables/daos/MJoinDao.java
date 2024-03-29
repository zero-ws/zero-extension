/*
 * This file is generated by jOOQ.
 */
package cn.vertxup.atom.domain.tables.daos;


import cn.vertxup.atom.domain.tables.MJoin;
import cn.vertxup.atom.domain.tables.records.MJoinRecord;

import io.github.jklingsporn.vertx.jooq.shared.internal.AbstractVertxDAO;

import java.util.Collection;

import org.jooq.Configuration;
import org.jooq.Record4;


import java.util.List;
import io.vertx.core.Future;
import io.github.jklingsporn.vertx.jooq.classic.jdbc.JDBCClassicQueryExecutor;
/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class MJoinDao extends AbstractVertxDAO<MJoinRecord, cn.vertxup.atom.domain.tables.pojos.MJoin, Record4<String, String, String, String>, Future<List<cn.vertxup.atom.domain.tables.pojos.MJoin>>, Future<cn.vertxup.atom.domain.tables.pojos.MJoin>, Future<Integer>, Future<Record4<String, String, String, String>>> implements io.github.jklingsporn.vertx.jooq.classic.VertxDAO<MJoinRecord,cn.vertxup.atom.domain.tables.pojos.MJoin,Record4<String, String, String, String>> {

        /**
     * @param configuration The Configuration used for rendering and query
     * execution.
     * @param vertx the vertx instance
     */
        public MJoinDao(Configuration configuration, io.vertx.core.Vertx vertx) {
                super(MJoin.M_JOIN, cn.vertxup.atom.domain.tables.pojos.MJoin.class, new JDBCClassicQueryExecutor<MJoinRecord,cn.vertxup.atom.domain.tables.pojos.MJoin,Record4<String, String, String, String>>(configuration,cn.vertxup.atom.domain.tables.pojos.MJoin.class,vertx));
        }

        @Override
        protected Record4<String, String, String, String> getId(cn.vertxup.atom.domain.tables.pojos.MJoin object) {
                return compositeKeyRecord(object.getModel(), object.getEntity(), object.getEntityKey(), object.getNamespace());
        }

        /**
     * Find records that have <code>ENTITY IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.atom.domain.tables.pojos.MJoin>> findManyByEntity(Collection<String> values) {
                return findManyByCondition(MJoin.M_JOIN.ENTITY.in(values));
        }

        /**
     * Find records that have <code>ENTITY IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.atom.domain.tables.pojos.MJoin>> findManyByEntity(Collection<String> values, int limit) {
                return findManyByCondition(MJoin.M_JOIN.ENTITY.in(values),limit);
        }

        /**
     * Find records that have <code>ENTITY_KEY IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.atom.domain.tables.pojos.MJoin>> findManyByEntityKey(Collection<String> values) {
                return findManyByCondition(MJoin.M_JOIN.ENTITY_KEY.in(values));
        }

        /**
     * Find records that have <code>ENTITY_KEY IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.atom.domain.tables.pojos.MJoin>> findManyByEntityKey(Collection<String> values, int limit) {
                return findManyByCondition(MJoin.M_JOIN.ENTITY_KEY.in(values),limit);
        }

        /**
     * Find records that have <code>PRIORITY IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.atom.domain.tables.pojos.MJoin>> findManyByPriority(Collection<Integer> values) {
                return findManyByCondition(MJoin.M_JOIN.PRIORITY.in(values));
        }

        /**
     * Find records that have <code>PRIORITY IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.atom.domain.tables.pojos.MJoin>> findManyByPriority(Collection<Integer> values, int limit) {
                return findManyByCondition(MJoin.M_JOIN.PRIORITY.in(values),limit);
        }

        /**
     * Find records that have <code>NAMESPACE IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.atom.domain.tables.pojos.MJoin>> findManyByNamespace(Collection<String> values) {
                return findManyByCondition(MJoin.M_JOIN.NAMESPACE.in(values));
        }

        /**
     * Find records that have <code>NAMESPACE IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.atom.domain.tables.pojos.MJoin>> findManyByNamespace(Collection<String> values, int limit) {
                return findManyByCondition(MJoin.M_JOIN.NAMESPACE.in(values),limit);
        }

        @Override
        public JDBCClassicQueryExecutor<MJoinRecord,cn.vertxup.atom.domain.tables.pojos.MJoin,Record4<String, String, String, String>> queryExecutor(){
                return (JDBCClassicQueryExecutor<MJoinRecord,cn.vertxup.atom.domain.tables.pojos.MJoin,Record4<String, String, String, String>>) super.queryExecutor();
        }
}
