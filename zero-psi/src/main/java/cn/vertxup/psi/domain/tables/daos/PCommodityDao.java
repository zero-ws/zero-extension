/*
 * This file is generated by jOOQ.
 */
package cn.vertxup.psi.domain.tables.daos;


import cn.vertxup.psi.domain.tables.PCommodity;
import cn.vertxup.psi.domain.tables.records.PCommodityRecord;
import io.github.jklingsporn.vertx.jooq.classic.jdbc.JDBCClassicQueryExecutor;
import io.github.jklingsporn.vertx.jooq.shared.internal.AbstractVertxDAO;
import io.vertx.core.Future;
import org.jooq.Configuration;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Collection;
import java.util.List;
/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PCommodityDao extends AbstractVertxDAO<PCommodityRecord, cn.vertxup.psi.domain.tables.pojos.PCommodity, String, Future<List<cn.vertxup.psi.domain.tables.pojos.PCommodity>>, Future<cn.vertxup.psi.domain.tables.pojos.PCommodity>, Future<Integer>, Future<String>> implements io.github.jklingsporn.vertx.jooq.classic.VertxDAO<PCommodityRecord,cn.vertxup.psi.domain.tables.pojos.PCommodity,String> {

        /**
     * @param configuration The Configuration used for rendering and query
     * execution.
     * @param vertx the vertx instance
     */
        public PCommodityDao(Configuration configuration, io.vertx.core.Vertx vertx) {
                super(PCommodity.P_COMMODITY, cn.vertxup.psi.domain.tables.pojos.PCommodity.class, new JDBCClassicQueryExecutor<PCommodityRecord,cn.vertxup.psi.domain.tables.pojos.PCommodity,String>(configuration,cn.vertxup.psi.domain.tables.pojos.PCommodity.class,vertx));
        }

        @Override
        protected String getId(cn.vertxup.psi.domain.tables.pojos.PCommodity object) {
                return object.getKey();
        }

        /**
     * Find records that have <code>NAME IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.psi.domain.tables.pojos.PCommodity>> findManyByName(Collection<String> values) {
                return findManyByCondition(PCommodity.P_COMMODITY.NAME.in(values));
        }

        /**
     * Find records that have <code>NAME IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.psi.domain.tables.pojos.PCommodity>> findManyByName(Collection<String> values, int limit) {
                return findManyByCondition(PCommodity.P_COMMODITY.NAME.in(values),limit);
        }

        /**
     * Find records that have <code>CODE IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.psi.domain.tables.pojos.PCommodity>> findManyByCode(Collection<String> values) {
                return findManyByCondition(PCommodity.P_COMMODITY.CODE.in(values));
        }

        /**
     * Find records that have <code>CODE IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.psi.domain.tables.pojos.PCommodity>> findManyByCode(Collection<String> values, int limit) {
                return findManyByCondition(PCommodity.P_COMMODITY.CODE.in(values),limit);
        }

        /**
     * Find records that have <code>TYPE IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.psi.domain.tables.pojos.PCommodity>> findManyByType(Collection<String> values) {
                return findManyByCondition(PCommodity.P_COMMODITY.TYPE.in(values));
        }

        /**
     * Find records that have <code>TYPE IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.psi.domain.tables.pojos.PCommodity>> findManyByType(Collection<String> values, int limit) {
                return findManyByCondition(PCommodity.P_COMMODITY.TYPE.in(values),limit);
        }

        /**
     * Find records that have <code>STATUS IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.psi.domain.tables.pojos.PCommodity>> findManyByStatus(Collection<String> values) {
                return findManyByCondition(PCommodity.P_COMMODITY.STATUS.in(values));
        }

        /**
     * Find records that have <code>STATUS IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.psi.domain.tables.pojos.PCommodity>> findManyByStatus(Collection<String> values, int limit) {
                return findManyByCondition(PCommodity.P_COMMODITY.STATUS.in(values),limit);
        }

        /**
     * Find records that have <code>TAGS IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.psi.domain.tables.pojos.PCommodity>> findManyByTags(Collection<String> values) {
                return findManyByCondition(PCommodity.P_COMMODITY.TAGS.in(values));
        }

        /**
     * Find records that have <code>TAGS IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.psi.domain.tables.pojos.PCommodity>> findManyByTags(Collection<String> values, int limit) {
                return findManyByCondition(PCommodity.P_COMMODITY.TAGS.in(values),limit);
        }

        /**
     * Find records that have <code>ORIGIN IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.psi.domain.tables.pojos.PCommodity>> findManyByOrigin(Collection<String> values) {
                return findManyByCondition(PCommodity.P_COMMODITY.ORIGIN.in(values));
        }

        /**
     * Find records that have <code>ORIGIN IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.psi.domain.tables.pojos.PCommodity>> findManyByOrigin(Collection<String> values, int limit) {
                return findManyByCondition(PCommodity.P_COMMODITY.ORIGIN.in(values),limit);
        }

        /**
     * Find records that have <code>BAR_CODE IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.psi.domain.tables.pojos.PCommodity>> findManyByBarCode(Collection<String> values) {
                return findManyByCondition(PCommodity.P_COMMODITY.BAR_CODE.in(values));
        }

        /**
     * Find records that have <code>BAR_CODE IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.psi.domain.tables.pojos.PCommodity>> findManyByBarCode(Collection<String> values, int limit) {
                return findManyByCondition(PCommodity.P_COMMODITY.BAR_CODE.in(values),limit);
        }

        /**
     * Find records that have <code>HELP_CODE IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.psi.domain.tables.pojos.PCommodity>> findManyByHelpCode(Collection<String> values) {
                return findManyByCondition(PCommodity.P_COMMODITY.HELP_CODE.in(values));
        }

        /**
     * Find records that have <code>HELP_CODE IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.psi.domain.tables.pojos.PCommodity>> findManyByHelpCode(Collection<String> values, int limit) {
                return findManyByCondition(PCommodity.P_COMMODITY.HELP_CODE.in(values),limit);
        }

        /**
     * Find records that have <code>BRAND_ID IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.psi.domain.tables.pojos.PCommodity>> findManyByBrandId(Collection<String> values) {
                return findManyByCondition(PCommodity.P_COMMODITY.BRAND_ID.in(values));
        }

        /**
     * Find records that have <code>BRAND_ID IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.psi.domain.tables.pojos.PCommodity>> findManyByBrandId(Collection<String> values, int limit) {
                return findManyByCondition(PCommodity.P_COMMODITY.BRAND_ID.in(values),limit);
        }

        /**
     * Find records that have <code>MODEL_NUMBER IN (values)</code>
     * asynchronously
     */
        public Future<List<cn.vertxup.psi.domain.tables.pojos.PCommodity>> findManyByModelNumber(Collection<String> values) {
                return findManyByCondition(PCommodity.P_COMMODITY.MODEL_NUMBER.in(values));
        }

        /**
     * Find records that have <code>MODEL_NUMBER IN (values)</code>
     * asynchronously limited by the given limit
     */
        public Future<List<cn.vertxup.psi.domain.tables.pojos.PCommodity>> findManyByModelNumber(Collection<String> values, int limit) {
                return findManyByCondition(PCommodity.P_COMMODITY.MODEL_NUMBER.in(values),limit);
        }

        /**
     * Find records that have <code>UNIT IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.psi.domain.tables.pojos.PCommodity>> findManyByUnit(Collection<String> values) {
                return findManyByCondition(PCommodity.P_COMMODITY.UNIT.in(values));
        }

        /**
     * Find records that have <code>UNIT IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.psi.domain.tables.pojos.PCommodity>> findManyByUnit(Collection<String> values, int limit) {
                return findManyByCondition(PCommodity.P_COMMODITY.UNIT.in(values),limit);
        }

        /**
     * Find records that have <code>EXPIRED_DAY IN (values)</code>
     * asynchronously
     */
        public Future<List<cn.vertxup.psi.domain.tables.pojos.PCommodity>> findManyByExpiredDay(Collection<Integer> values) {
                return findManyByCondition(PCommodity.P_COMMODITY.EXPIRED_DAY.in(values));
        }

        /**
     * Find records that have <code>EXPIRED_DAY IN (values)</code>
     * asynchronously limited by the given limit
     */
        public Future<List<cn.vertxup.psi.domain.tables.pojos.PCommodity>> findManyByExpiredDay(Collection<Integer> values, int limit) {
                return findManyByCondition(PCommodity.P_COMMODITY.EXPIRED_DAY.in(values),limit);
        }

        /**
     * Find records that have <code>K_WAY_COST IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.psi.domain.tables.pojos.PCommodity>> findManyByKWayCost(Collection<String> values) {
                return findManyByCondition(PCommodity.P_COMMODITY.K_WAY_COST.in(values));
        }

        /**
     * Find records that have <code>K_WAY_COST IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.psi.domain.tables.pojos.PCommodity>> findManyByKWayCost(Collection<String> values, int limit) {
                return findManyByCondition(PCommodity.P_COMMODITY.K_WAY_COST.in(values),limit);
        }

        /**
     * Find records that have <code>K_BY_BATCH IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.psi.domain.tables.pojos.PCommodity>> findManyByKByBatch(Collection<Boolean> values) {
                return findManyByCondition(PCommodity.P_COMMODITY.K_BY_BATCH.in(values));
        }

        /**
     * Find records that have <code>K_BY_BATCH IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.psi.domain.tables.pojos.PCommodity>> findManyByKByBatch(Collection<Boolean> values, int limit) {
                return findManyByCondition(PCommodity.P_COMMODITY.K_BY_BATCH.in(values),limit);
        }

        /**
     * Find records that have <code>K_TAX_TYPE IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.psi.domain.tables.pojos.PCommodity>> findManyByKTaxType(Collection<String> values) {
                return findManyByCondition(PCommodity.P_COMMODITY.K_TAX_TYPE.in(values));
        }

        /**
     * Find records that have <code>K_TAX_TYPE IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.psi.domain.tables.pojos.PCommodity>> findManyByKTaxType(Collection<String> values, int limit) {
                return findManyByCondition(PCommodity.P_COMMODITY.K_TAX_TYPE.in(values),limit);
        }

        /**
     * Find records that have <code>K_TAX_RATE IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.psi.domain.tables.pojos.PCommodity>> findManyByKTaxRate(Collection<BigDecimal> values) {
                return findManyByCondition(PCommodity.P_COMMODITY.K_TAX_RATE.in(values));
        }

        /**
     * Find records that have <code>K_TAX_RATE IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.psi.domain.tables.pojos.PCommodity>> findManyByKTaxRate(Collection<BigDecimal> values, int limit) {
                return findManyByCondition(PCommodity.P_COMMODITY.K_TAX_RATE.in(values),limit);
        }

        /**
     * Find records that have <code>DF_CUSTOMER IN (values)</code>
     * asynchronously
     */
        public Future<List<cn.vertxup.psi.domain.tables.pojos.PCommodity>> findManyByDfCustomer(Collection<String> values) {
                return findManyByCondition(PCommodity.P_COMMODITY.DF_CUSTOMER.in(values));
        }

        /**
     * Find records that have <code>DF_CUSTOMER IN (values)</code>
     * asynchronously limited by the given limit
     */
        public Future<List<cn.vertxup.psi.domain.tables.pojos.PCommodity>> findManyByDfCustomer(Collection<String> values, int limit) {
                return findManyByCondition(PCommodity.P_COMMODITY.DF_CUSTOMER.in(values),limit);
        }

        /**
     * Find records that have <code>DF_WH IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.psi.domain.tables.pojos.PCommodity>> findManyByDfWh(Collection<String> values) {
                return findManyByCondition(PCommodity.P_COMMODITY.DF_WH.in(values));
        }

        /**
     * Find records that have <code>DF_WH IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.psi.domain.tables.pojos.PCommodity>> findManyByDfWh(Collection<String> values, int limit) {
                return findManyByCondition(PCommodity.P_COMMODITY.DF_WH.in(values),limit);
        }

        /**
     * Find records that have <code>LOGO IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.psi.domain.tables.pojos.PCommodity>> findManyByLogo(Collection<String> values) {
                return findManyByCondition(PCommodity.P_COMMODITY.LOGO.in(values));
        }

        /**
     * Find records that have <code>LOGO IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.psi.domain.tables.pojos.PCommodity>> findManyByLogo(Collection<String> values, int limit) {
                return findManyByCondition(PCommodity.P_COMMODITY.LOGO.in(values),limit);
        }

        /**
     * Find records that have <code>PRICE IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.psi.domain.tables.pojos.PCommodity>> findManyByPrice(Collection<BigDecimal> values) {
                return findManyByCondition(PCommodity.P_COMMODITY.PRICE.in(values));
        }

        /**
     * Find records that have <code>PRICE IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.psi.domain.tables.pojos.PCommodity>> findManyByPrice(Collection<BigDecimal> values, int limit) {
                return findManyByCondition(PCommodity.P_COMMODITY.PRICE.in(values),limit);
        }

        /**
     * Find records that have <code>QUANTITY IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.psi.domain.tables.pojos.PCommodity>> findManyByQuantity(Collection<Integer> values) {
                return findManyByCondition(PCommodity.P_COMMODITY.QUANTITY.in(values));
        }

        /**
     * Find records that have <code>QUANTITY IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.psi.domain.tables.pojos.PCommodity>> findManyByQuantity(Collection<Integer> values, int limit) {
                return findManyByCondition(PCommodity.P_COMMODITY.QUANTITY.in(values),limit);
        }

        /**
     * Find records that have <code>AMOUNT IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.psi.domain.tables.pojos.PCommodity>> findManyByAmount(Collection<BigDecimal> values) {
                return findManyByCondition(PCommodity.P_COMMODITY.AMOUNT.in(values));
        }

        /**
     * Find records that have <code>AMOUNT IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.psi.domain.tables.pojos.PCommodity>> findManyByAmount(Collection<BigDecimal> values, int limit) {
                return findManyByCondition(PCommodity.P_COMMODITY.AMOUNT.in(values),limit);
        }

        /**
     * Find records that have <code>COMMENT IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.psi.domain.tables.pojos.PCommodity>> findManyByComment(Collection<String> values) {
                return findManyByCondition(PCommodity.P_COMMODITY.COMMENT.in(values));
        }

        /**
     * Find records that have <code>COMMENT IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.psi.domain.tables.pojos.PCommodity>> findManyByComment(Collection<String> values, int limit) {
                return findManyByCondition(PCommodity.P_COMMODITY.COMMENT.in(values),limit);
        }

        /**
     * Find records that have <code>ACTIVE IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.psi.domain.tables.pojos.PCommodity>> findManyByActive(Collection<Boolean> values) {
                return findManyByCondition(PCommodity.P_COMMODITY.ACTIVE.in(values));
        }

        /**
     * Find records that have <code>ACTIVE IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.psi.domain.tables.pojos.PCommodity>> findManyByActive(Collection<Boolean> values, int limit) {
                return findManyByCondition(PCommodity.P_COMMODITY.ACTIVE.in(values),limit);
        }

        /**
     * Find records that have <code>SIGMA IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.psi.domain.tables.pojos.PCommodity>> findManyBySigma(Collection<String> values) {
                return findManyByCondition(PCommodity.P_COMMODITY.SIGMA.in(values));
        }

        /**
     * Find records that have <code>SIGMA IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.psi.domain.tables.pojos.PCommodity>> findManyBySigma(Collection<String> values, int limit) {
                return findManyByCondition(PCommodity.P_COMMODITY.SIGMA.in(values),limit);
        }

        /**
     * Find records that have <code>METADATA IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.psi.domain.tables.pojos.PCommodity>> findManyByMetadata(Collection<String> values) {
                return findManyByCondition(PCommodity.P_COMMODITY.METADATA.in(values));
        }

        /**
     * Find records that have <code>METADATA IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.psi.domain.tables.pojos.PCommodity>> findManyByMetadata(Collection<String> values, int limit) {
                return findManyByCondition(PCommodity.P_COMMODITY.METADATA.in(values),limit);
        }

        /**
     * Find records that have <code>LANGUAGE IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.psi.domain.tables.pojos.PCommodity>> findManyByLanguage(Collection<String> values) {
                return findManyByCondition(PCommodity.P_COMMODITY.LANGUAGE.in(values));
        }

        /**
     * Find records that have <code>LANGUAGE IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.psi.domain.tables.pojos.PCommodity>> findManyByLanguage(Collection<String> values, int limit) {
                return findManyByCondition(PCommodity.P_COMMODITY.LANGUAGE.in(values),limit);
        }

        /**
     * Find records that have <code>CREATED_AT IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.psi.domain.tables.pojos.PCommodity>> findManyByCreatedAt(Collection<LocalDateTime> values) {
                return findManyByCondition(PCommodity.P_COMMODITY.CREATED_AT.in(values));
        }

        /**
     * Find records that have <code>CREATED_AT IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.psi.domain.tables.pojos.PCommodity>> findManyByCreatedAt(Collection<LocalDateTime> values, int limit) {
                return findManyByCondition(PCommodity.P_COMMODITY.CREATED_AT.in(values),limit);
        }

        /**
     * Find records that have <code>CREATED_BY IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.psi.domain.tables.pojos.PCommodity>> findManyByCreatedBy(Collection<String> values) {
                return findManyByCondition(PCommodity.P_COMMODITY.CREATED_BY.in(values));
        }

        /**
     * Find records that have <code>CREATED_BY IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.psi.domain.tables.pojos.PCommodity>> findManyByCreatedBy(Collection<String> values, int limit) {
                return findManyByCondition(PCommodity.P_COMMODITY.CREATED_BY.in(values),limit);
        }

        /**
     * Find records that have <code>UPDATED_AT IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.psi.domain.tables.pojos.PCommodity>> findManyByUpdatedAt(Collection<LocalDateTime> values) {
                return findManyByCondition(PCommodity.P_COMMODITY.UPDATED_AT.in(values));
        }

        /**
     * Find records that have <code>UPDATED_AT IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.psi.domain.tables.pojos.PCommodity>> findManyByUpdatedAt(Collection<LocalDateTime> values, int limit) {
                return findManyByCondition(PCommodity.P_COMMODITY.UPDATED_AT.in(values),limit);
        }

        /**
     * Find records that have <code>UPDATED_BY IN (values)</code> asynchronously
     */
        public Future<List<cn.vertxup.psi.domain.tables.pojos.PCommodity>> findManyByUpdatedBy(Collection<String> values) {
                return findManyByCondition(PCommodity.P_COMMODITY.UPDATED_BY.in(values));
        }

        /**
     * Find records that have <code>UPDATED_BY IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Future<List<cn.vertxup.psi.domain.tables.pojos.PCommodity>> findManyByUpdatedBy(Collection<String> values, int limit) {
                return findManyByCondition(PCommodity.P_COMMODITY.UPDATED_BY.in(values),limit);
        }

        @Override
        public JDBCClassicQueryExecutor<PCommodityRecord,cn.vertxup.psi.domain.tables.pojos.PCommodity,String> queryExecutor(){
                return (JDBCClassicQueryExecutor<PCommodityRecord,cn.vertxup.psi.domain.tables.pojos.PCommodity,String>) super.queryExecutor();
        }
}
