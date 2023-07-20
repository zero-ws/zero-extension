/*
 * This file is generated by jOOQ.
 */
package cn.vertxup.rbac.domain.tables;


import cn.vertxup.rbac.domain.Keys;
import cn.vertxup.rbac.domain.Zdb;
import cn.vertxup.rbac.domain.tables.records.RRolePermRecord;

import java.util.function.Function;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Function2;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Records;
import org.jooq.Row2;
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
public class RRolePerm extends TableImpl<RRolePermRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>ZDB.R_ROLE_PERM</code>
     */
    public static final RRolePerm R_ROLE_PERM = new RRolePerm();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<RRolePermRecord> getRecordType() {
        return RRolePermRecord.class;
    }

    /**
     * The column <code>ZDB.R_ROLE_PERM.PERM_ID</code>. 「permId」- 关联权限ID
     */
    public final TableField<RRolePermRecord, String> PERM_ID = createField(DSL.name("PERM_ID"), SQLDataType.VARCHAR(36).nullable(false), this, "「permId」- 关联权限ID");

    /**
     * The column <code>ZDB.R_ROLE_PERM.ROLE_ID</code>. 「roleId」- 关联角色ID
     */
    public final TableField<RRolePermRecord, String> ROLE_ID = createField(DSL.name("ROLE_ID"), SQLDataType.VARCHAR(36).nullable(false), this, "「roleId」- 关联角色ID");

    private RRolePerm(Name alias, Table<RRolePermRecord> aliased) {
        this(alias, aliased, null);
    }

    private RRolePerm(Name alias, Table<RRolePermRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>ZDB.R_ROLE_PERM</code> table reference
     */
    public RRolePerm(String alias) {
        this(DSL.name(alias), R_ROLE_PERM);
    }

    /**
     * Create an aliased <code>ZDB.R_ROLE_PERM</code> table reference
     */
    public RRolePerm(Name alias) {
        this(alias, R_ROLE_PERM);
    }

    /**
     * Create a <code>ZDB.R_ROLE_PERM</code> table reference
     */
    public RRolePerm() {
        this(DSL.name("R_ROLE_PERM"), null);
    }

    public <O extends Record> RRolePerm(Table<O> child, ForeignKey<O, RRolePermRecord> key) {
        super(child, key, R_ROLE_PERM);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Zdb.ZDB;
    }

    @Override
    public UniqueKey<RRolePermRecord> getPrimaryKey() {
        return Keys.KEY_R_ROLE_PERM_PRIMARY;
    }

    @Override
    public RRolePerm as(String alias) {
        return new RRolePerm(DSL.name(alias), this);
    }

    @Override
    public RRolePerm as(Name alias) {
        return new RRolePerm(alias, this);
    }

    @Override
    public RRolePerm as(Table<?> alias) {
        return new RRolePerm(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public RRolePerm rename(String name) {
        return new RRolePerm(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public RRolePerm rename(Name name) {
        return new RRolePerm(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public RRolePerm rename(Table<?> name) {
        return new RRolePerm(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row2 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row2<String, String> fieldsRow() {
        return (Row2) super.fieldsRow();
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function2<? super String, ? super String, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function2<? super String, ? super String, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}
