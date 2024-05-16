/*
 * This file is generated by jOOQ.
 */
package io.zerows.extension.commerce.erp.domain.tables.daos;


import io.github.jklingsporn.vertx.jooq.classic.jdbc.JDBCClassicQueryExecutor;
import io.github.jklingsporn.vertx.jooq.shared.internal.AbstractVertxDAO;
import io.vertx.core.Future;
import io.zerows.extension.commerce.erp.domain.tables.EEmployee;
import io.zerows.extension.commerce.erp.domain.tables.records.EEmployeeRecord;
import org.jooq.Configuration;

import java.time.LocalDateTime;
import java.util.Collection;
import java.util.List;

/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({"all", "unchecked", "rawtypes"})
public class EEmployeeDao extends AbstractVertxDAO<EEmployeeRecord, io.zerows.extension.commerce.erp.domain.tables.pojos.EEmployee, String, Future<List<io.zerows.extension.commerce.erp.domain.tables.pojos.EEmployee>>, Future<io.zerows.extension.commerce.erp.domain.tables.pojos.EEmployee>, Future<Integer>, Future<String>> implements io.github.jklingsporn.vertx.jooq.classic.VertxDAO<EEmployeeRecord, io.zerows.extension.commerce.erp.domain.tables.pojos.EEmployee, String> {

    /**
     * @param configuration The Configuration used for rendering and query
     *                      execution.
     * @param vertx         the vertx instance
     */
    public EEmployeeDao(Configuration configuration, io.vertx.core.Vertx vertx) {
        super(EEmployee.E_EMPLOYEE, io.zerows.extension.commerce.erp.domain.tables.pojos.EEmployee.class, new JDBCClassicQueryExecutor<EEmployeeRecord, io.zerows.extension.commerce.erp.domain.tables.pojos.EEmployee, String>(configuration, io.zerows.extension.commerce.erp.domain.tables.pojos.EEmployee.class, vertx));
    }

    @Override
    protected String getId(io.zerows.extension.commerce.erp.domain.tables.pojos.EEmployee object) {
        return object.getKey();
    }

    /**
     * Find records that have <code>COMPANY_ID IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.commerce.erp.domain.tables.pojos.EEmployee>> findManyByCompanyId(Collection<String> values) {
        return findManyByCondition(EEmployee.E_EMPLOYEE.COMPANY_ID.in(values));
    }

    /**
     * Find records that have <code>COMPANY_ID IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.commerce.erp.domain.tables.pojos.EEmployee>> findManyByCompanyId(Collection<String> values, int limit) {
        return findManyByCondition(EEmployee.E_EMPLOYEE.COMPANY_ID.in(values), limit);
    }

    /**
     * Find records that have <code>DEPT_ID IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.commerce.erp.domain.tables.pojos.EEmployee>> findManyByDeptId(Collection<String> values) {
        return findManyByCondition(EEmployee.E_EMPLOYEE.DEPT_ID.in(values));
    }

    /**
     * Find records that have <code>DEPT_ID IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.commerce.erp.domain.tables.pojos.EEmployee>> findManyByDeptId(Collection<String> values, int limit) {
        return findManyByCondition(EEmployee.E_EMPLOYEE.DEPT_ID.in(values), limit);
    }

    /**
     * Find records that have <code>TEAM_ID IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.commerce.erp.domain.tables.pojos.EEmployee>> findManyByTeamId(Collection<String> values) {
        return findManyByCondition(EEmployee.E_EMPLOYEE.TEAM_ID.in(values));
    }

    /**
     * Find records that have <code>TEAM_ID IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.commerce.erp.domain.tables.pojos.EEmployee>> findManyByTeamId(Collection<String> values, int limit) {
        return findManyByCondition(EEmployee.E_EMPLOYEE.TEAM_ID.in(values), limit);
    }

    /**
     * Find records that have <code>IDENTITY_ID IN (values)</code>
     * asynchronously
     */
    public Future<List<io.zerows.extension.commerce.erp.domain.tables.pojos.EEmployee>> findManyByIdentityId(Collection<String> values) {
        return findManyByCondition(EEmployee.E_EMPLOYEE.IDENTITY_ID.in(values));
    }

    /**
     * Find records that have <code>IDENTITY_ID IN (values)</code>
     * asynchronously limited by the given limit
     */
    public Future<List<io.zerows.extension.commerce.erp.domain.tables.pojos.EEmployee>> findManyByIdentityId(Collection<String> values, int limit) {
        return findManyByCondition(EEmployee.E_EMPLOYEE.IDENTITY_ID.in(values), limit);
    }

    /**
     * Find records that have <code>VICE_NAME IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.commerce.erp.domain.tables.pojos.EEmployee>> findManyByViceName(Collection<String> values) {
        return findManyByCondition(EEmployee.E_EMPLOYEE.VICE_NAME.in(values));
    }

    /**
     * Find records that have <code>VICE_NAME IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.commerce.erp.domain.tables.pojos.EEmployee>> findManyByViceName(Collection<String> values, int limit) {
        return findManyByCondition(EEmployee.E_EMPLOYEE.VICE_NAME.in(values), limit);
    }

    /**
     * Find records that have <code>VICE_EMAIL IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.commerce.erp.domain.tables.pojos.EEmployee>> findManyByViceEmail(Collection<String> values) {
        return findManyByCondition(EEmployee.E_EMPLOYEE.VICE_EMAIL.in(values));
    }

    /**
     * Find records that have <code>VICE_EMAIL IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.commerce.erp.domain.tables.pojos.EEmployee>> findManyByViceEmail(Collection<String> values, int limit) {
        return findManyByCondition(EEmployee.E_EMPLOYEE.VICE_EMAIL.in(values), limit);
    }

    /**
     * Find records that have <code>VICE_MOBILE IN (values)</code>
     * asynchronously
     */
    public Future<List<io.zerows.extension.commerce.erp.domain.tables.pojos.EEmployee>> findManyByViceMobile(Collection<String> values) {
        return findManyByCondition(EEmployee.E_EMPLOYEE.VICE_MOBILE.in(values));
    }

    /**
     * Find records that have <code>VICE_MOBILE IN (values)</code>
     * asynchronously limited by the given limit
     */
    public Future<List<io.zerows.extension.commerce.erp.domain.tables.pojos.EEmployee>> findManyByViceMobile(Collection<String> values, int limit) {
        return findManyByCondition(EEmployee.E_EMPLOYEE.VICE_MOBILE.in(values), limit);
    }

    /**
     * Find records that have <code>WORK_NUMBER IN (values)</code>
     * asynchronously
     */
    public Future<List<io.zerows.extension.commerce.erp.domain.tables.pojos.EEmployee>> findManyByWorkNumber(Collection<String> values) {
        return findManyByCondition(EEmployee.E_EMPLOYEE.WORK_NUMBER.in(values));
    }

    /**
     * Find records that have <code>WORK_NUMBER IN (values)</code>
     * asynchronously limited by the given limit
     */
    public Future<List<io.zerows.extension.commerce.erp.domain.tables.pojos.EEmployee>> findManyByWorkNumber(Collection<String> values, int limit) {
        return findManyByCondition(EEmployee.E_EMPLOYEE.WORK_NUMBER.in(values), limit);
    }

    /**
     * Find records that have <code>WORK_TITLE IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.commerce.erp.domain.tables.pojos.EEmployee>> findManyByWorkTitle(Collection<String> values) {
        return findManyByCondition(EEmployee.E_EMPLOYEE.WORK_TITLE.in(values));
    }

    /**
     * Find records that have <code>WORK_TITLE IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.commerce.erp.domain.tables.pojos.EEmployee>> findManyByWorkTitle(Collection<String> values, int limit) {
        return findManyByCondition(EEmployee.E_EMPLOYEE.WORK_TITLE.in(values), limit);
    }

    /**
     * Find records that have <code>WORK_LOCATION IN (values)</code>
     * asynchronously
     */
    public Future<List<io.zerows.extension.commerce.erp.domain.tables.pojos.EEmployee>> findManyByWorkLocation(Collection<String> values) {
        return findManyByCondition(EEmployee.E_EMPLOYEE.WORK_LOCATION.in(values));
    }

    /**
     * Find records that have <code>WORK_LOCATION IN (values)</code>
     * asynchronously limited by the given limit
     */
    public Future<List<io.zerows.extension.commerce.erp.domain.tables.pojos.EEmployee>> findManyByWorkLocation(Collection<String> values, int limit) {
        return findManyByCondition(EEmployee.E_EMPLOYEE.WORK_LOCATION.in(values), limit);
    }

    /**
     * Find records that have <code>WORK_PHONE IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.commerce.erp.domain.tables.pojos.EEmployee>> findManyByWorkPhone(Collection<String> values) {
        return findManyByCondition(EEmployee.E_EMPLOYEE.WORK_PHONE.in(values));
    }

    /**
     * Find records that have <code>WORK_PHONE IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.commerce.erp.domain.tables.pojos.EEmployee>> findManyByWorkPhone(Collection<String> values, int limit) {
        return findManyByCondition(EEmployee.E_EMPLOYEE.WORK_PHONE.in(values), limit);
    }

    /**
     * Find records that have <code>WORK_EXTENSION IN (values)</code>
     * asynchronously
     */
    public Future<List<io.zerows.extension.commerce.erp.domain.tables.pojos.EEmployee>> findManyByWorkExtension(Collection<String> values) {
        return findManyByCondition(EEmployee.E_EMPLOYEE.WORK_EXTENSION.in(values));
    }

    /**
     * Find records that have <code>WORK_EXTENSION IN (values)</code>
     * asynchronously limited by the given limit
     */
    public Future<List<io.zerows.extension.commerce.erp.domain.tables.pojos.EEmployee>> findManyByWorkExtension(Collection<String> values, int limit) {
        return findManyByCondition(EEmployee.E_EMPLOYEE.WORK_EXTENSION.in(values), limit);
    }

    /**
     * Find records that have <code>WORK_HIRE_AT IN (values)</code>
     * asynchronously
     */
    public Future<List<io.zerows.extension.commerce.erp.domain.tables.pojos.EEmployee>> findManyByWorkHireAt(Collection<LocalDateTime> values) {
        return findManyByCondition(EEmployee.E_EMPLOYEE.WORK_HIRE_AT.in(values));
    }

    /**
     * Find records that have <code>WORK_HIRE_AT IN (values)</code>
     * asynchronously limited by the given limit
     */
    public Future<List<io.zerows.extension.commerce.erp.domain.tables.pojos.EEmployee>> findManyByWorkHireAt(Collection<LocalDateTime> values, int limit) {
        return findManyByCondition(EEmployee.E_EMPLOYEE.WORK_HIRE_AT.in(values), limit);
    }

    /**
     * Find records that have <code>BANK_ID IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.commerce.erp.domain.tables.pojos.EEmployee>> findManyByBankId(Collection<String> values) {
        return findManyByCondition(EEmployee.E_EMPLOYEE.BANK_ID.in(values));
    }

    /**
     * Find records that have <code>BANK_ID IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.commerce.erp.domain.tables.pojos.EEmployee>> findManyByBankId(Collection<String> values, int limit) {
        return findManyByCondition(EEmployee.E_EMPLOYEE.BANK_ID.in(values), limit);
    }

    /**
     * Find records that have <code>BANK_CARD IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.commerce.erp.domain.tables.pojos.EEmployee>> findManyByBankCard(Collection<String> values) {
        return findManyByCondition(EEmployee.E_EMPLOYEE.BANK_CARD.in(values));
    }

    /**
     * Find records that have <code>BANK_CARD IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.commerce.erp.domain.tables.pojos.EEmployee>> findManyByBankCard(Collection<String> values, int limit) {
        return findManyByCondition(EEmployee.E_EMPLOYEE.BANK_CARD.in(values), limit);
    }

    /**
     * Find records that have <code>TYPE IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.commerce.erp.domain.tables.pojos.EEmployee>> findManyByType(Collection<String> values) {
        return findManyByCondition(EEmployee.E_EMPLOYEE.TYPE.in(values));
    }

    /**
     * Find records that have <code>TYPE IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.commerce.erp.domain.tables.pojos.EEmployee>> findManyByType(Collection<String> values, int limit) {
        return findManyByCondition(EEmployee.E_EMPLOYEE.TYPE.in(values), limit);
    }

    /**
     * Find records that have <code>STATUS IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.commerce.erp.domain.tables.pojos.EEmployee>> findManyByStatus(Collection<String> values) {
        return findManyByCondition(EEmployee.E_EMPLOYEE.STATUS.in(values));
    }

    /**
     * Find records that have <code>STATUS IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.commerce.erp.domain.tables.pojos.EEmployee>> findManyByStatus(Collection<String> values, int limit) {
        return findManyByCondition(EEmployee.E_EMPLOYEE.STATUS.in(values), limit);
    }

    /**
     * Find records that have <code>METADATA IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.commerce.erp.domain.tables.pojos.EEmployee>> findManyByMetadata(Collection<String> values) {
        return findManyByCondition(EEmployee.E_EMPLOYEE.METADATA.in(values));
    }

    /**
     * Find records that have <code>METADATA IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.commerce.erp.domain.tables.pojos.EEmployee>> findManyByMetadata(Collection<String> values, int limit) {
        return findManyByCondition(EEmployee.E_EMPLOYEE.METADATA.in(values), limit);
    }

    /**
     * Find records that have <code>ACTIVE IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.commerce.erp.domain.tables.pojos.EEmployee>> findManyByActive(Collection<Boolean> values) {
        return findManyByCondition(EEmployee.E_EMPLOYEE.ACTIVE.in(values));
    }

    /**
     * Find records that have <code>ACTIVE IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.commerce.erp.domain.tables.pojos.EEmployee>> findManyByActive(Collection<Boolean> values, int limit) {
        return findManyByCondition(EEmployee.E_EMPLOYEE.ACTIVE.in(values), limit);
    }

    /**
     * Find records that have <code>SIGMA IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.commerce.erp.domain.tables.pojos.EEmployee>> findManyBySigma(Collection<String> values) {
        return findManyByCondition(EEmployee.E_EMPLOYEE.SIGMA.in(values));
    }

    /**
     * Find records that have <code>SIGMA IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.commerce.erp.domain.tables.pojos.EEmployee>> findManyBySigma(Collection<String> values, int limit) {
        return findManyByCondition(EEmployee.E_EMPLOYEE.SIGMA.in(values), limit);
    }

    /**
     * Find records that have <code>LANGUAGE IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.commerce.erp.domain.tables.pojos.EEmployee>> findManyByLanguage(Collection<String> values) {
        return findManyByCondition(EEmployee.E_EMPLOYEE.LANGUAGE.in(values));
    }

    /**
     * Find records that have <code>LANGUAGE IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.commerce.erp.domain.tables.pojos.EEmployee>> findManyByLanguage(Collection<String> values, int limit) {
        return findManyByCondition(EEmployee.E_EMPLOYEE.LANGUAGE.in(values), limit);
    }

    /**
     * Find records that have <code>CREATED_AT IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.commerce.erp.domain.tables.pojos.EEmployee>> findManyByCreatedAt(Collection<LocalDateTime> values) {
        return findManyByCondition(EEmployee.E_EMPLOYEE.CREATED_AT.in(values));
    }

    /**
     * Find records that have <code>CREATED_AT IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.commerce.erp.domain.tables.pojos.EEmployee>> findManyByCreatedAt(Collection<LocalDateTime> values, int limit) {
        return findManyByCondition(EEmployee.E_EMPLOYEE.CREATED_AT.in(values), limit);
    }

    /**
     * Find records that have <code>CREATED_BY IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.commerce.erp.domain.tables.pojos.EEmployee>> findManyByCreatedBy(Collection<String> values) {
        return findManyByCondition(EEmployee.E_EMPLOYEE.CREATED_BY.in(values));
    }

    /**
     * Find records that have <code>CREATED_BY IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.commerce.erp.domain.tables.pojos.EEmployee>> findManyByCreatedBy(Collection<String> values, int limit) {
        return findManyByCondition(EEmployee.E_EMPLOYEE.CREATED_BY.in(values), limit);
    }

    /**
     * Find records that have <code>UPDATED_AT IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.commerce.erp.domain.tables.pojos.EEmployee>> findManyByUpdatedAt(Collection<LocalDateTime> values) {
        return findManyByCondition(EEmployee.E_EMPLOYEE.UPDATED_AT.in(values));
    }

    /**
     * Find records that have <code>UPDATED_AT IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.commerce.erp.domain.tables.pojos.EEmployee>> findManyByUpdatedAt(Collection<LocalDateTime> values, int limit) {
        return findManyByCondition(EEmployee.E_EMPLOYEE.UPDATED_AT.in(values), limit);
    }

    /**
     * Find records that have <code>UPDATED_BY IN (values)</code> asynchronously
     */
    public Future<List<io.zerows.extension.commerce.erp.domain.tables.pojos.EEmployee>> findManyByUpdatedBy(Collection<String> values) {
        return findManyByCondition(EEmployee.E_EMPLOYEE.UPDATED_BY.in(values));
    }

    /**
     * Find records that have <code>UPDATED_BY IN (values)</code> asynchronously
     * limited by the given limit
     */
    public Future<List<io.zerows.extension.commerce.erp.domain.tables.pojos.EEmployee>> findManyByUpdatedBy(Collection<String> values, int limit) {
        return findManyByCondition(EEmployee.E_EMPLOYEE.UPDATED_BY.in(values), limit);
    }

    @Override
    public JDBCClassicQueryExecutor<EEmployeeRecord, io.zerows.extension.commerce.erp.domain.tables.pojos.EEmployee, String> queryExecutor() {
        return (JDBCClassicQueryExecutor<EEmployeeRecord, io.zerows.extension.commerce.erp.domain.tables.pojos.EEmployee, String>) super.queryExecutor();
    }
}