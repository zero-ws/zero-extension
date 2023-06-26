/*
 * This file is generated by jOOQ.
 */
package cn.vertxup.erp.domain.tables.records;


import cn.vertxup.erp.domain.tables.RTeamEmployee;
import cn.vertxup.erp.domain.tables.interfaces.IRTeamEmployee;

import io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo;

import org.jooq.Field;
import org.jooq.Record2;
import org.jooq.Record4;
import org.jooq.Row4;
import org.jooq.impl.UpdatableRecordImpl;


import static io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo.*;
/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class RTeamEmployeeRecord extends UpdatableRecordImpl<RTeamEmployeeRecord> implements VertxPojo, Record4<String, String, String, String>, IRTeamEmployee {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>DB_ETERNAL.R_TEAM_EMPLOYEE.TEAM_ID</code>. 「teamId」-
     * 组的ID
     */
    @Override
    public RTeamEmployeeRecord setTeamId(String value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.R_TEAM_EMPLOYEE.TEAM_ID</code>. 「teamId」-
     * 组的ID
     */
    @Override
    public String getTeamId() {
        return (String) get(0);
    }

    /**
     * Setter for <code>DB_ETERNAL.R_TEAM_EMPLOYEE.EMPLOYEE_ID</code>.
     * 「employeeId」- 员工ID
     */
    @Override
    public RTeamEmployeeRecord setEmployeeId(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.R_TEAM_EMPLOYEE.EMPLOYEE_ID</code>.
     * 「employeeId」- 员工ID
     */
    @Override
    public String getEmployeeId() {
        return (String) get(1);
    }

    /**
     * Setter for <code>DB_ETERNAL.R_TEAM_EMPLOYEE.LINK_COMPONENT</code>.
     * 「linkComponent」- 关联执行组件（扩展用）
     */
    @Override
    public RTeamEmployeeRecord setLinkComponent(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.R_TEAM_EMPLOYEE.LINK_COMPONENT</code>.
     * 「linkComponent」- 关联执行组件（扩展用）
     */
    @Override
    public String getLinkComponent() {
        return (String) get(2);
    }

    /**
     * Setter for <code>DB_ETERNAL.R_TEAM_EMPLOYEE.COMMENT</code>. 「comment」-
     * 关系备注
     */
    @Override
    public RTeamEmployeeRecord setComment(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.R_TEAM_EMPLOYEE.COMMENT</code>. 「comment」-
     * 关系备注
     */
    @Override
    public String getComment() {
        return (String) get(3);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record2<String, String> key() {
        return (Record2) super.key();
    }

    // -------------------------------------------------------------------------
    // Record4 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row4<String, String, String, String> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    @Override
    public Row4<String, String, String, String> valuesRow() {
        return (Row4) super.valuesRow();
    }

    @Override
    public Field<String> field1() {
        return RTeamEmployee.R_TEAM_EMPLOYEE.TEAM_ID;
    }

    @Override
    public Field<String> field2() {
        return RTeamEmployee.R_TEAM_EMPLOYEE.EMPLOYEE_ID;
    }

    @Override
    public Field<String> field3() {
        return RTeamEmployee.R_TEAM_EMPLOYEE.LINK_COMPONENT;
    }

    @Override
    public Field<String> field4() {
        return RTeamEmployee.R_TEAM_EMPLOYEE.COMMENT;
    }

    @Override
    public String component1() {
        return getTeamId();
    }

    @Override
    public String component2() {
        return getEmployeeId();
    }

    @Override
    public String component3() {
        return getLinkComponent();
    }

    @Override
    public String component4() {
        return getComment();
    }

    @Override
    public String value1() {
        return getTeamId();
    }

    @Override
    public String value2() {
        return getEmployeeId();
    }

    @Override
    public String value3() {
        return getLinkComponent();
    }

    @Override
    public String value4() {
        return getComment();
    }

    @Override
    public RTeamEmployeeRecord value1(String value) {
        setTeamId(value);
        return this;
    }

    @Override
    public RTeamEmployeeRecord value2(String value) {
        setEmployeeId(value);
        return this;
    }

    @Override
    public RTeamEmployeeRecord value3(String value) {
        setLinkComponent(value);
        return this;
    }

    @Override
    public RTeamEmployeeRecord value4(String value) {
        setComment(value);
        return this;
    }

    @Override
    public RTeamEmployeeRecord values(String value1, String value2, String value3, String value4) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        return this;
    }

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    @Override
    public void from(IRTeamEmployee from) {
        setTeamId(from.getTeamId());
        setEmployeeId(from.getEmployeeId());
        setLinkComponent(from.getLinkComponent());
        setComment(from.getComment());
        resetChangedOnNotNull();
    }

    @Override
    public <E extends IRTeamEmployee> E into(E into) {
        into.from(this);
        return into;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached RTeamEmployeeRecord
     */
    public RTeamEmployeeRecord() {
        super(RTeamEmployee.R_TEAM_EMPLOYEE);
    }

    /**
     * Create a detached, initialised RTeamEmployeeRecord
     */
    public RTeamEmployeeRecord(String teamId, String employeeId, String linkComponent, String comment) {
        super(RTeamEmployee.R_TEAM_EMPLOYEE);

        setTeamId(teamId);
        setEmployeeId(employeeId);
        setLinkComponent(linkComponent);
        setComment(comment);
        resetChangedOnNotNull();
    }

    /**
     * Create a detached, initialised RTeamEmployeeRecord
     */
    public RTeamEmployeeRecord(cn.vertxup.erp.domain.tables.pojos.RTeamEmployee value) {
        super(RTeamEmployee.R_TEAM_EMPLOYEE);

        if (value != null) {
            setTeamId(value.getTeamId());
            setEmployeeId(value.getEmployeeId());
            setLinkComponent(value.getLinkComponent());
            setComment(value.getComment());
            resetChangedOnNotNull();
        }
    }

        public RTeamEmployeeRecord(io.vertx.core.json.JsonObject json) {
                this();
                fromJson(json);
        }
}
