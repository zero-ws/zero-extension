/*
 * This file is generated by jOOQ.
 */
package io.zerows.extension.commerce.erp.domain.tables.daos;


import io.github.jklingsporn.vertx.jooq.classic.jdbc.JDBCClassicQueryExecutor;
import io.github.jklingsporn.vertx.jooq.shared.internal.AbstractVertxDAO;
import io.vertx.core.Future;
import io.zerows.extension.commerce.erp.domain.tables.RCompanyCustomer;
import io.zerows.extension.commerce.erp.domain.tables.records.RCompanyCustomerRecord;
import org.jooq.Configuration;
import org.jooq.Record2;

import java.util.Collection;
import java.util.List;

/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({"all", "unchecked", "rawtypes"})
public class RCompanyCustomerDao extends AbstractVertxDAO<RCompanyCustomerRecord, io.zerows.extension.commerce.erp.domain.tables.pojos.RCompanyCustomer, Record2<String, String>, Future<List<io.zerows.extension.commerce.erp.domain.tables.pojos.RCompanyCustomer>>, Future<io.zerows.extension.commerce.erp.domain.tables.pojos.RCompanyCustomer>, Future<Integer>, Future<Record2<String, String>>> implements io.github.jklingsporn.vertx.jooq.classic.VertxDAO<RCompanyCustomerRecord, io.zerows.extension.commerce.erp.domain.tables.pojos.RCompanyCustomer, Record2<String, String>> {

    /**
     * @param configuration The Configuration used for rendering and query
     *                      execution.
     * @param vertx         the vertx instance
     */
    public RCompanyCustomerDao(Configuration configuration, io.vertx.core.Vertx vertx) {
        super(RCompanyCustomer.R_COMPANY_CUSTOMER, io.zerows.extension.commerce.erp.domain.tables.pojos.RCompanyCustomer.class, new JDBCClassicQueryExecutor<RCompanyCustomerRecord, io.zerows.extension.commerce.erp.domain.tables.pojos.RCompanyCustomer, Record2<String, String>>(configuration, io.zerows.extension.commerce.erp.domain.tables.pojos.RCompanyCustomer.class, vertx));
    }

    @Override
    protected Record2<String, String> getId(io.zerows.extension.commerce.erp.domain.tables.pojos.RCompanyCustomer object) {
        return compositeKeyRecord(object.getCompanyId(), object.getCustomerId());
    }

    /**
     * Find records that have <code>CUSTOMER_ID IN (values)</code>
     * asynchronously
     */
    public Future<List<io.zerows.extension.commerce.erp.domain.tables.pojos.RCompanyCustomer>> findManyByCustomerId(Collection<String> values) {
        return findManyByCondition(RCompanyCustomer.R_COMPANY_CUSTOMER.CUSTOMER_ID.in(values));
    }

    /**
     * Find records that have <code>CUSTOMER_ID IN (values)</code>
     * asynchronously limited by the given limit
     */
    public Future<List<io.zerows.extension.commerce.erp.domain.tables.pojos.RCompanyCustomer>> findManyByCustomerId(Collection<String> values, int limit) {
        return findManyByCondition(RCompanyCustomer.R_COMPANY_CUSTOMER.CUSTOMER_ID.in(values), limit);
    }

    /**
     * Find records that have <code>LINK_COMPONENT IN (values)</code>
     * asynchronously
     */
    public Future<List<io.zerows.extension.commerce.erp.domain.tables.pojos.RCompanyCustomer>> findManyByLinkComponent(Collection<String> values) {
        return findManyByCondition(RCompanyCustomer.R_COMPANY_CUSTOMER.LINK_COMPONENT.in(values));
    }

    /**
     * Find records that have <code>LINK_COMPONENT IN (values)</code>
     * asynchronously limited by the given limit
     */
    public Future<List<io.zerows.extension.commerce.erp.domain.tables.pojos.RCompanyCustomer>> findManyByLinkComponent(Collection<String> values, int limit) {
        return findManyByCondition(RCompanyCustomer.R_COMPANY_CUSTOMER.LINK_COMPONENT.in(values), limit);
    }

    /**
     * Find records that have <code>COMMENT IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.commerce.erp.domain.tables.pojos.RCompanyCustomer>> findManyByComment(Collection<String> values) {
        return findManyByCondition(RCompanyCustomer.R_COMPANY_CUSTOMER.COMMENT.in(values));
    }

    /**
     * Find records that have <code>COMMENT IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.commerce.erp.domain.tables.pojos.RCompanyCustomer>> findManyByComment(Collection<String> values, int limit) {
        return findManyByCondition(RCompanyCustomer.R_COMPANY_CUSTOMER.COMMENT.in(values), limit);
    }

    @Override
    public JDBCClassicQueryExecutor<RCompanyCustomerRecord, io.zerows.extension.commerce.erp.domain.tables.pojos.RCompanyCustomer, Record2<String, String>> queryExecutor() {
        return (JDBCClassicQueryExecutor<RCompanyCustomerRecord, io.zerows.extension.commerce.erp.domain.tables.pojos.RCompanyCustomer, Record2<String, String>>) super.queryExecutor();
    }
}