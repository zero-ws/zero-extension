/*
 * This file is generated by jOOQ.
 */
package io.zerows.extension.commerce.psi.domain.tables.daos;


import io.github.jklingsporn.vertx.jooq.classic.jdbc.JDBCClassicQueryExecutor;
import io.github.jklingsporn.vertx.jooq.shared.internal.AbstractVertxDAO;
import io.vertx.core.Future;
import io.zerows.extension.commerce.psi.domain.tables.POutTicket;
import io.zerows.extension.commerce.psi.domain.tables.records.POutTicketRecord;
import org.jooq.Configuration;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Collection;
import java.util.List;

/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({"all", "unchecked", "rawtypes"})
public class POutTicketDao extends AbstractVertxDAO<POutTicketRecord, io.zerows.extension.commerce.psi.domain.tables.pojos.POutTicket, String, Future<List<io.zerows.extension.commerce.psi.domain.tables.pojos.POutTicket>>, Future<io.zerows.extension.commerce.psi.domain.tables.pojos.POutTicket>, Future<Integer>, Future<String>> implements io.github.jklingsporn.vertx.jooq.classic.VertxDAO<POutTicketRecord, io.zerows.extension.commerce.psi.domain.tables.pojos.POutTicket, String> {

    /**
     * @param configuration The Configuration used for rendering and query
     *                      execution.
     * @param vertx         the vertx instance
     */
    public POutTicketDao(Configuration configuration, io.vertx.core.Vertx vertx) {
        super(POutTicket.P_OUT_TICKET, io.zerows.extension.commerce.psi.domain.tables.pojos.POutTicket.class, new JDBCClassicQueryExecutor<POutTicketRecord, io.zerows.extension.commerce.psi.domain.tables.pojos.POutTicket, String>(configuration, io.zerows.extension.commerce.psi.domain.tables.pojos.POutTicket.class, vertx));
    }

    @Override
    protected String getId(io.zerows.extension.commerce.psi.domain.tables.pojos.POutTicket object) {
        return object.getKey();
    }

    /**
     * Find records that have <code>SERIAL IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.commerce.psi.domain.tables.pojos.POutTicket>> findManyBySerial(Collection<String> values) {
        return findManyByCondition(POutTicket.P_OUT_TICKET.SERIAL.in(values));
    }

    /**
     * Find records that have <code>SERIAL IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.commerce.psi.domain.tables.pojos.POutTicket>> findManyBySerial(Collection<String> values, int limit) {
        return findManyByCondition(POutTicket.P_OUT_TICKET.SERIAL.in(values), limit);
    }

    /**
     * Find records that have <code>TYPE IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.commerce.psi.domain.tables.pojos.POutTicket>> findManyByType(Collection<String> values) {
        return findManyByCondition(POutTicket.P_OUT_TICKET.TYPE.in(values));
    }

    /**
     * Find records that have <code>TYPE IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.commerce.psi.domain.tables.pojos.POutTicket>> findManyByType(Collection<String> values, int limit) {
        return findManyByCondition(POutTicket.P_OUT_TICKET.TYPE.in(values), limit);
    }

    /**
     * Find records that have <code>TYPE_BUSINESS IN (values)</code>
     * asynchronously
     */
    public Future<List<io.zerows.extension.commerce.psi.domain.tables.pojos.POutTicket>> findManyByTypeBusiness(Collection<String> values) {
        return findManyByCondition(POutTicket.P_OUT_TICKET.TYPE_BUSINESS.in(values));
    }

    /**
     * Find records that have <code>TYPE_BUSINESS IN (values)</code>
     * asynchronously limited by the given limit
     */
    public Future<List<io.zerows.extension.commerce.psi.domain.tables.pojos.POutTicket>> findManyByTypeBusiness(Collection<String> values, int limit) {
        return findManyByCondition(POutTicket.P_OUT_TICKET.TYPE_BUSINESS.in(values), limit);
    }

    /**
     * Find records that have <code>STATUS IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.commerce.psi.domain.tables.pojos.POutTicket>> findManyByStatus(Collection<String> values) {
        return findManyByCondition(POutTicket.P_OUT_TICKET.STATUS.in(values));
    }

    /**
     * Find records that have <code>STATUS IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.commerce.psi.domain.tables.pojos.POutTicket>> findManyByStatus(Collection<String> values, int limit) {
        return findManyByCondition(POutTicket.P_OUT_TICKET.STATUS.in(values), limit);
    }

    /**
     * Find records that have <code>WH_ID IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.commerce.psi.domain.tables.pojos.POutTicket>> findManyByWhId(Collection<String> values) {
        return findManyByCondition(POutTicket.P_OUT_TICKET.WH_ID.in(values));
    }

    /**
     * Find records that have <code>WH_ID IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.commerce.psi.domain.tables.pojos.POutTicket>> findManyByWhId(Collection<String> values, int limit) {
        return findManyByCondition(POutTicket.P_OUT_TICKET.WH_ID.in(values), limit);
    }

    /**
     * Find records that have <code>CUSTOMER_ID IN (values)</code>
     * asynchronously
     */
    public Future<List<io.zerows.extension.commerce.psi.domain.tables.pojos.POutTicket>> findManyByCustomerId(Collection<String> values) {
        return findManyByCondition(POutTicket.P_OUT_TICKET.CUSTOMER_ID.in(values));
    }

    /**
     * Find records that have <code>CUSTOMER_ID IN (values)</code>
     * asynchronously limited by the given limit
     */
    public Future<List<io.zerows.extension.commerce.psi.domain.tables.pojos.POutTicket>> findManyByCustomerId(Collection<String> values, int limit) {
        return findManyByCondition(POutTicket.P_OUT_TICKET.CUSTOMER_ID.in(values), limit);
    }

    /**
     * Find records that have <code>CUSTOMER_INFO IN (values)</code>
     * asynchronously
     */
    public Future<List<io.zerows.extension.commerce.psi.domain.tables.pojos.POutTicket>> findManyByCustomerInfo(Collection<String> values) {
        return findManyByCondition(POutTicket.P_OUT_TICKET.CUSTOMER_INFO.in(values));
    }

    /**
     * Find records that have <code>CUSTOMER_INFO IN (values)</code>
     * asynchronously limited by the given limit
     */
    public Future<List<io.zerows.extension.commerce.psi.domain.tables.pojos.POutTicket>> findManyByCustomerInfo(Collection<String> values, int limit) {
        return findManyByCondition(POutTicket.P_OUT_TICKET.CUSTOMER_INFO.in(values), limit);
    }

    /**
     * Find records that have <code>OP_AT IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.commerce.psi.domain.tables.pojos.POutTicket>> findManyByOpAt(Collection<LocalDateTime> values) {
        return findManyByCondition(POutTicket.P_OUT_TICKET.OP_AT.in(values));
    }

    /**
     * Find records that have <code>OP_AT IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.commerce.psi.domain.tables.pojos.POutTicket>> findManyByOpAt(Collection<LocalDateTime> values, int limit) {
        return findManyByCondition(POutTicket.P_OUT_TICKET.OP_AT.in(values), limit);
    }

    /**
     * Find records that have <code>OP_BY IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.commerce.psi.domain.tables.pojos.POutTicket>> findManyByOpBy(Collection<String> values) {
        return findManyByCondition(POutTicket.P_OUT_TICKET.OP_BY.in(values));
    }

    /**
     * Find records that have <code>OP_BY IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.commerce.psi.domain.tables.pojos.POutTicket>> findManyByOpBy(Collection<String> values, int limit) {
        return findManyByCondition(POutTicket.P_OUT_TICKET.OP_BY.in(values), limit);
    }

    /**
     * Find records that have <code>OP_DEPT IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.commerce.psi.domain.tables.pojos.POutTicket>> findManyByOpDept(Collection<String> values) {
        return findManyByCondition(POutTicket.P_OUT_TICKET.OP_DEPT.in(values));
    }

    /**
     * Find records that have <code>OP_DEPT IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.commerce.psi.domain.tables.pojos.POutTicket>> findManyByOpDept(Collection<String> values, int limit) {
        return findManyByCondition(POutTicket.P_OUT_TICKET.OP_DEPT.in(values), limit);
    }

    /**
     * Find records that have <code>TAGS IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.commerce.psi.domain.tables.pojos.POutTicket>> findManyByTags(Collection<String> values) {
        return findManyByCondition(POutTicket.P_OUT_TICKET.TAGS.in(values));
    }

    /**
     * Find records that have <code>TAGS IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.commerce.psi.domain.tables.pojos.POutTicket>> findManyByTags(Collection<String> values, int limit) {
        return findManyByCondition(POutTicket.P_OUT_TICKET.TAGS.in(values), limit);
    }

    /**
     * Find records that have <code>COMMENT IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.commerce.psi.domain.tables.pojos.POutTicket>> findManyByComment(Collection<String> values) {
        return findManyByCondition(POutTicket.P_OUT_TICKET.COMMENT.in(values));
    }

    /**
     * Find records that have <code>COMMENT IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.commerce.psi.domain.tables.pojos.POutTicket>> findManyByComment(Collection<String> values, int limit) {
        return findManyByCondition(POutTicket.P_OUT_TICKET.COMMENT.in(values), limit);
    }

    /**
     * Find records that have <code>AMOUNT IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.commerce.psi.domain.tables.pojos.POutTicket>> findManyByAmount(Collection<BigDecimal> values) {
        return findManyByCondition(POutTicket.P_OUT_TICKET.AMOUNT.in(values));
    }

    /**
     * Find records that have <code>AMOUNT IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.commerce.psi.domain.tables.pojos.POutTicket>> findManyByAmount(Collection<BigDecimal> values, int limit) {
        return findManyByCondition(POutTicket.P_OUT_TICKET.AMOUNT.in(values), limit);
    }

    /**
     * Find records that have <code>APPROVED_BY IN (values)</code>
     * asynchronously
     */
    public Future<List<io.zerows.extension.commerce.psi.domain.tables.pojos.POutTicket>> findManyByApprovedBy(Collection<String> values) {
        return findManyByCondition(POutTicket.P_OUT_TICKET.APPROVED_BY.in(values));
    }

    /**
     * Find records that have <code>APPROVED_BY IN (values)</code>
     * asynchronously limited by the given limit
     */
    public Future<List<io.zerows.extension.commerce.psi.domain.tables.pojos.POutTicket>> findManyByApprovedBy(Collection<String> values, int limit) {
        return findManyByCondition(POutTicket.P_OUT_TICKET.APPROVED_BY.in(values), limit);
    }

    /**
     * Find records that have <code>APPROVED_AT IN (values)</code>
     * asynchronously
     */
    public Future<List<io.zerows.extension.commerce.psi.domain.tables.pojos.POutTicket>> findManyByApprovedAt(Collection<LocalDateTime> values) {
        return findManyByCondition(POutTicket.P_OUT_TICKET.APPROVED_AT.in(values));
    }

    /**
     * Find records that have <code>APPROVED_AT IN (values)</code>
     * asynchronously limited by the given limit
     */
    public Future<List<io.zerows.extension.commerce.psi.domain.tables.pojos.POutTicket>> findManyByApprovedAt(Collection<LocalDateTime> values, int limit) {
        return findManyByCondition(POutTicket.P_OUT_TICKET.APPROVED_AT.in(values), limit);
    }

    /**
     * Find records that have <code>TO_ID IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.commerce.psi.domain.tables.pojos.POutTicket>> findManyByToId(Collection<String> values) {
        return findManyByCondition(POutTicket.P_OUT_TICKET.TO_ID.in(values));
    }

    /**
     * Find records that have <code>TO_ID IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.commerce.psi.domain.tables.pojos.POutTicket>> findManyByToId(Collection<String> values, int limit) {
        return findManyByCondition(POutTicket.P_OUT_TICKET.TO_ID.in(values), limit);
    }

    /**
     * Find records that have <code>TO_ADDRESS IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.commerce.psi.domain.tables.pojos.POutTicket>> findManyByToAddress(Collection<String> values) {
        return findManyByCondition(POutTicket.P_OUT_TICKET.TO_ADDRESS.in(values));
    }

    /**
     * Find records that have <code>TO_ADDRESS IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.commerce.psi.domain.tables.pojos.POutTicket>> findManyByToAddress(Collection<String> values, int limit) {
        return findManyByCondition(POutTicket.P_OUT_TICKET.TO_ADDRESS.in(values), limit);
    }

    /**
     * Find records that have <code>CURRENCY_ID IN (values)</code>
     * asynchronously
     */
    public Future<List<io.zerows.extension.commerce.psi.domain.tables.pojos.POutTicket>> findManyByCurrencyId(Collection<String> values) {
        return findManyByCondition(POutTicket.P_OUT_TICKET.CURRENCY_ID.in(values));
    }

    /**
     * Find records that have <code>CURRENCY_ID IN (values)</code>
     * asynchronously limited by the given limit
     */
    public Future<List<io.zerows.extension.commerce.psi.domain.tables.pojos.POutTicket>> findManyByCurrencyId(Collection<String> values, int limit) {
        return findManyByCondition(POutTicket.P_OUT_TICKET.CURRENCY_ID.in(values), limit);
    }

    /**
     * Find records that have <code>COMPANY_ID IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.commerce.psi.domain.tables.pojos.POutTicket>> findManyByCompanyId(Collection<String> values) {
        return findManyByCondition(POutTicket.P_OUT_TICKET.COMPANY_ID.in(values));
    }

    /**
     * Find records that have <code>COMPANY_ID IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.commerce.psi.domain.tables.pojos.POutTicket>> findManyByCompanyId(Collection<String> values, int limit) {
        return findManyByCondition(POutTicket.P_OUT_TICKET.COMPANY_ID.in(values), limit);
    }

    /**
     * Find records that have <code>ACTIVE IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.commerce.psi.domain.tables.pojos.POutTicket>> findManyByActive(Collection<Boolean> values) {
        return findManyByCondition(POutTicket.P_OUT_TICKET.ACTIVE.in(values));
    }

    /**
     * Find records that have <code>ACTIVE IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.commerce.psi.domain.tables.pojos.POutTicket>> findManyByActive(Collection<Boolean> values, int limit) {
        return findManyByCondition(POutTicket.P_OUT_TICKET.ACTIVE.in(values), limit);
    }

    /**
     * Find records that have <code>SIGMA IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.commerce.psi.domain.tables.pojos.POutTicket>> findManyBySigma(Collection<String> values) {
        return findManyByCondition(POutTicket.P_OUT_TICKET.SIGMA.in(values));
    }

    /**
     * Find records that have <code>SIGMA IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.commerce.psi.domain.tables.pojos.POutTicket>> findManyBySigma(Collection<String> values, int limit) {
        return findManyByCondition(POutTicket.P_OUT_TICKET.SIGMA.in(values), limit);
    }

    /**
     * Find records that have <code>METADATA IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.commerce.psi.domain.tables.pojos.POutTicket>> findManyByMetadata(Collection<String> values) {
        return findManyByCondition(POutTicket.P_OUT_TICKET.METADATA.in(values));
    }

    /**
     * Find records that have <code>METADATA IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.commerce.psi.domain.tables.pojos.POutTicket>> findManyByMetadata(Collection<String> values, int limit) {
        return findManyByCondition(POutTicket.P_OUT_TICKET.METADATA.in(values), limit);
    }

    /**
     * Find records that have <code>LANGUAGE IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.commerce.psi.domain.tables.pojos.POutTicket>> findManyByLanguage(Collection<String> values) {
        return findManyByCondition(POutTicket.P_OUT_TICKET.LANGUAGE.in(values));
    }

    /**
     * Find records that have <code>LANGUAGE IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.commerce.psi.domain.tables.pojos.POutTicket>> findManyByLanguage(Collection<String> values, int limit) {
        return findManyByCondition(POutTicket.P_OUT_TICKET.LANGUAGE.in(values), limit);
    }

    /**
     * Find records that have <code>CREATED_AT IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.commerce.psi.domain.tables.pojos.POutTicket>> findManyByCreatedAt(Collection<LocalDateTime> values) {
        return findManyByCondition(POutTicket.P_OUT_TICKET.CREATED_AT.in(values));
    }

    /**
     * Find records that have <code>CREATED_AT IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.commerce.psi.domain.tables.pojos.POutTicket>> findManyByCreatedAt(Collection<LocalDateTime> values, int limit) {
        return findManyByCondition(POutTicket.P_OUT_TICKET.CREATED_AT.in(values), limit);
    }

    /**
     * Find records that have <code>CREATED_BY IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.commerce.psi.domain.tables.pojos.POutTicket>> findManyByCreatedBy(Collection<String> values) {
        return findManyByCondition(POutTicket.P_OUT_TICKET.CREATED_BY.in(values));
    }

    /**
     * Find records that have <code>CREATED_BY IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.commerce.psi.domain.tables.pojos.POutTicket>> findManyByCreatedBy(Collection<String> values, int limit) {
        return findManyByCondition(POutTicket.P_OUT_TICKET.CREATED_BY.in(values), limit);
    }

    /**
     * Find records that have <code>UPDATED_AT IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.commerce.psi.domain.tables.pojos.POutTicket>> findManyByUpdatedAt(Collection<LocalDateTime> values) {
        return findManyByCondition(POutTicket.P_OUT_TICKET.UPDATED_AT.in(values));
    }

    /**
     * Find records that have <code>UPDATED_AT IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.commerce.psi.domain.tables.pojos.POutTicket>> findManyByUpdatedAt(Collection<LocalDateTime> values, int limit) {
        return findManyByCondition(POutTicket.P_OUT_TICKET.UPDATED_AT.in(values), limit);
    }

    /**
     * Find records that have <code>UPDATED_BY IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.commerce.psi.domain.tables.pojos.POutTicket>> findManyByUpdatedBy(Collection<String> values) {
        return findManyByCondition(POutTicket.P_OUT_TICKET.UPDATED_BY.in(values));
    }

    /**
     * Find records that have <code>UPDATED_BY IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.commerce.psi.domain.tables.pojos.POutTicket>> findManyByUpdatedBy(Collection<String> values, int limit) {
        return findManyByCondition(POutTicket.P_OUT_TICKET.UPDATED_BY.in(values), limit);
    }

    @Override
    public JDBCClassicQueryExecutor<POutTicketRecord, io.zerows.extension.commerce.psi.domain.tables.pojos.POutTicket, String> queryExecutor() {
        return (JDBCClassicQueryExecutor<POutTicketRecord, io.zerows.extension.commerce.psi.domain.tables.pojos.POutTicket, String>) super.queryExecutor();
    }
}
