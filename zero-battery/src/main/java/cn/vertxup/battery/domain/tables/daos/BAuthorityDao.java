/*
 * This file is generated by jOOQ.
 */
package cn.vertxup.battery.domain.tables.daos;


import cn.vertxup.battery.domain.tables.BAuthority;
import cn.vertxup.battery.domain.tables.records.BAuthorityRecord;
import io.github.jklingsporn.vertx.jooq.classic.jdbc.JDBCClassicQueryExecutor;
import io.github.jklingsporn.vertx.jooq.shared.internal.AbstractVertxDAO;
import io.vertx.core.Future;
import org.jooq.Configuration;

import java.util.Collection;
import java.util.List;
/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class BAuthorityDao extends AbstractVertxDAO<BAuthorityRecord, cn.vertxup.battery.domain.tables.pojos.BAuthority, String, Future<List<cn.vertxup.battery.domain.tables.pojos.BAuthority>>, Future<cn.vertxup.battery.domain.tables.pojos.BAuthority>, Future<Integer>, Future<String>> implements io.github.jklingsporn.vertx.jooq.classic.VertxDAO<BAuthorityRecord,cn.vertxup.battery.domain.tables.pojos.BAuthority,String> {

        /**
     * @param configuration The Configuration used for rendering and query
     * execution.
     * @param vertx the vertx instance
     */
        public BAuthorityDao(Configuration configuration, io.vertx.core.Vertx vertx) {
                super(BAuthority.B_AUTHORITY, cn.vertxup.battery.domain.tables.pojos.BAuthority.class, new JDBCClassicQueryExecutor<BAuthorityRecord,cn.vertxup.battery.domain.tables.pojos.BAuthority,String>(configuration,cn.vertxup.battery.domain.tables.pojos.BAuthority.class,vertx));
        }

        @Override
        protected String getId(cn.vertxup.battery.domain.tables.pojos.BAuthority object) {
                return object.getKey();
        }

        /**
     * Find records that have <code>CODE IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.battery.domain.tables.pojos.BAuthority>> findManyByCode(Collection<String> values) {
                return findManyByCondition(BAuthority.B_AUTHORITY.CODE.in(values));
        }

        /**
     * Find records that have <code>CODE IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.battery.domain.tables.pojos.BAuthority>> findManyByCode(Collection<String> values, int limit) {
                return findManyByCondition(BAuthority.B_AUTHORITY.CODE.in(values),limit);
        }

        /**
     * Find records that have <code>BLOCK_ID IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.battery.domain.tables.pojos.BAuthority>> findManyByBlockId(Collection<String> values) {
                return findManyByCondition(BAuthority.B_AUTHORITY.BLOCK_ID.in(values));
        }

        /**
     * Find records that have <code>BLOCK_ID IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.battery.domain.tables.pojos.BAuthority>> findManyByBlockId(Collection<String> values, int limit) {
                return findManyByCondition(BAuthority.B_AUTHORITY.BLOCK_ID.in(values),limit);
        }

        /**
     * Find records that have <code>TYPE IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.battery.domain.tables.pojos.BAuthority>> findManyByType(Collection<String> values) {
                return findManyByCondition(BAuthority.B_AUTHORITY.TYPE.in(values));
        }

        /**
     * Find records that have <code>TYPE IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.battery.domain.tables.pojos.BAuthority>> findManyByType(Collection<String> values, int limit) {
                return findManyByCondition(BAuthority.B_AUTHORITY.TYPE.in(values),limit);
        }

        /**
     * Find records that have <code>LIC_RESOURCE IN (values)</code>
     * asynchronously
     */
        public Future<List<cn.vertxup.battery.domain.tables.pojos.BAuthority>> findManyByLicResource(Collection<String> values) {
                return findManyByCondition(BAuthority.B_AUTHORITY.LIC_RESOURCE.in(values));
        }

        /**
     * Find records that have <code>LIC_RESOURCE IN (values)</code>
     * asynchronously limited by the given limit
     */
        public Future<List<cn.vertxup.battery.domain.tables.pojos.BAuthority>> findManyByLicResource(Collection<String> values, int limit) {
                return findManyByCondition(BAuthority.B_AUTHORITY.LIC_RESOURCE.in(values),limit);
        }

        /**
     * Find records that have <code>LIC_ACTION IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.battery.domain.tables.pojos.BAuthority>> findManyByLicAction(Collection<String> values) {
                return findManyByCondition(BAuthority.B_AUTHORITY.LIC_ACTION.in(values));
        }

        /**
     * Find records that have <code>LIC_ACTION IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.battery.domain.tables.pojos.BAuthority>> findManyByLicAction(Collection<String> values, int limit) {
                return findManyByCondition(BAuthority.B_AUTHORITY.LIC_ACTION.in(values),limit);
        }

        /**
     * Find records that have <code>LIC_PERMISSION IN (values)</code>
     * asynchronously
     */
        public Future<List<cn.vertxup.battery.domain.tables.pojos.BAuthority>> findManyByLicPermission(Collection<String> values) {
                return findManyByCondition(BAuthority.B_AUTHORITY.LIC_PERMISSION.in(values));
        }

        /**
     * Find records that have <code>LIC_PERMISSION IN (values)</code>
     * asynchronously limited by the given limit
     */
        public Future<List<cn.vertxup.battery.domain.tables.pojos.BAuthority>> findManyByLicPermission(Collection<String> values, int limit) {
                return findManyByCondition(BAuthority.B_AUTHORITY.LIC_PERMISSION.in(values),limit);
        }

        /**
     * Find records that have <code>LIC_VIEW IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.battery.domain.tables.pojos.BAuthority>> findManyByLicView(Collection<String> values) {
                return findManyByCondition(BAuthority.B_AUTHORITY.LIC_VIEW.in(values));
        }

        /**
     * Find records that have <code>LIC_VIEW IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.battery.domain.tables.pojos.BAuthority>> findManyByLicView(Collection<String> values, int limit) {
                return findManyByCondition(BAuthority.B_AUTHORITY.LIC_VIEW.in(values),limit);
        }

        /**
     * Find records that have <code>ACTIVE IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.battery.domain.tables.pojos.BAuthority>> findManyByActive(Collection<Boolean> values) {
                return findManyByCondition(BAuthority.B_AUTHORITY.ACTIVE.in(values));
        }

        /**
     * Find records that have <code>ACTIVE IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.battery.domain.tables.pojos.BAuthority>> findManyByActive(Collection<Boolean> values, int limit) {
                return findManyByCondition(BAuthority.B_AUTHORITY.ACTIVE.in(values),limit);
        }

        /**
     * Find records that have <code>SIGMA IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.battery.domain.tables.pojos.BAuthority>> findManyBySigma(Collection<String> values) {
                return findManyByCondition(BAuthority.B_AUTHORITY.SIGMA.in(values));
        }

        /**
     * Find records that have <code>SIGMA IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.battery.domain.tables.pojos.BAuthority>> findManyBySigma(Collection<String> values, int limit) {
                return findManyByCondition(BAuthority.B_AUTHORITY.SIGMA.in(values),limit);
        }

        /**
     * Find records that have <code>METADATA IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.battery.domain.tables.pojos.BAuthority>> findManyByMetadata(Collection<String> values) {
                return findManyByCondition(BAuthority.B_AUTHORITY.METADATA.in(values));
        }

        /**
     * Find records that have <code>METADATA IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.battery.domain.tables.pojos.BAuthority>> findManyByMetadata(Collection<String> values, int limit) {
                return findManyByCondition(BAuthority.B_AUTHORITY.METADATA.in(values),limit);
        }

        /**
     * Find records that have <code>LANGUAGE IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.battery.domain.tables.pojos.BAuthority>> findManyByLanguage(Collection<String> values) {
                return findManyByCondition(BAuthority.B_AUTHORITY.LANGUAGE.in(values));
        }

        /**
     * Find records that have <code>LANGUAGE IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.battery.domain.tables.pojos.BAuthority>> findManyByLanguage(Collection<String> values, int limit) {
                return findManyByCondition(BAuthority.B_AUTHORITY.LANGUAGE.in(values),limit);
        }

        @Override
        public JDBCClassicQueryExecutor<BAuthorityRecord,cn.vertxup.battery.domain.tables.pojos.BAuthority,String> queryExecutor(){
                return (JDBCClassicQueryExecutor<BAuthorityRecord,cn.vertxup.battery.domain.tables.pojos.BAuthority,String>) super.queryExecutor();
        }
}
