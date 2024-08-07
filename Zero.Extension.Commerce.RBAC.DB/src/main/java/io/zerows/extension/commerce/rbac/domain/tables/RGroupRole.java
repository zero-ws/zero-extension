/*
 * This file is generated by jOOQ.
 */
package io.zerows.extension.commerce.rbac.domain.tables;


import io.zerows.extension.commerce.rbac.domain.Keys;
import io.zerows.extension.commerce.rbac.domain.Zdb;
import io.zerows.extension.commerce.rbac.domain.tables.records.RGroupRoleRecord;

import java.util.function.Function;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Function3;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Records;
import org.jooq.Row3;
import org.jooq.Schema;
import org.jooq.SelectField;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class RGroupRole extends TableImpl<RGroupRoleRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>ZDB.R_GROUP_ROLE</code>
     */
    public static final RGroupRole R_GROUP_ROLE = new RGroupRole();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<RGroupRoleRecord> getRecordType() {
        return RGroupRoleRecord.class;
    }

    /**
     * The column <code>ZDB.R_GROUP_ROLE.GROUP_ID</code>. 「groupId」- 关联组ID
     */
    public final TableField<RGroupRoleRecord, String> GROUP_ID = createField(DSL.name("GROUP_ID"), SQLDataType.VARCHAR(36).nullable(false), this, "「groupId」- 关联组ID");

    /**
     * The column <code>ZDB.R_GROUP_ROLE.ROLE_ID</code>. 「roleId」- 关联角色ID
     */
    public final TableField<RGroupRoleRecord, String> ROLE_ID = createField(DSL.name("ROLE_ID"), SQLDataType.VARCHAR(36).nullable(false), this, "「roleId」- 关联角色ID");

    /**
     * The column <code>ZDB.R_GROUP_ROLE.PRIORITY</code>. 「priority」- 角色优先级
     */
    public final TableField<RGroupRoleRecord, Integer> PRIORITY = createField(DSL.name("PRIORITY"), SQLDataType.INTEGER, this, "「priority」- 角色优先级");

    private RGroupRole(Name alias, Table<RGroupRoleRecord> aliased) {
        this(alias, aliased, null);
    }

    private RGroupRole(Name alias, Table<RGroupRoleRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>ZDB.R_GROUP_ROLE</code> table reference
     */
    public RGroupRole(String alias) {
        this(DSL.name(alias), R_GROUP_ROLE);
    }

    /**
     * Create an aliased <code>ZDB.R_GROUP_ROLE</code> table reference
     */
    public RGroupRole(Name alias) {
        this(alias, R_GROUP_ROLE);
    }

    /**
     * Create a <code>ZDB.R_GROUP_ROLE</code> table reference
     */
    public RGroupRole() {
        this(DSL.name("R_GROUP_ROLE"), null);
    }

    public <O extends Record> RGroupRole(Table<O> child, ForeignKey<O, RGroupRoleRecord> key) {
        super(child, key, R_GROUP_ROLE);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Zdb.ZDB;
    }

    @Override
    public UniqueKey<RGroupRoleRecord> getPrimaryKey() {
        return Keys.KEY_R_GROUP_ROLE_PRIMARY;
    }

    @Override
    public RGroupRole as(String alias) {
        return new RGroupRole(DSL.name(alias), this);
    }

    @Override
    public RGroupRole as(Name alias) {
        return new RGroupRole(alias, this);
    }

    @Override
    public RGroupRole as(Table<?> alias) {
        return new RGroupRole(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public RGroupRole rename(String name) {
        return new RGroupRole(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public RGroupRole rename(Name name) {
        return new RGroupRole(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public RGroupRole rename(Table<?> name) {
        return new RGroupRole(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row3 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row3<String, String, Integer> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function3<? super String, ? super String, ? super Integer, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function3<? super String, ? super String, ? super Integer, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}
