/*
 * This file is generated by jOOQ.
 */
package io.zerows.extension.commerce.rbac.domain.tables;


import io.zerows.extension.commerce.rbac.domain.Indexes;
import io.zerows.extension.commerce.rbac.domain.Keys;
import io.zerows.extension.commerce.rbac.domain.Zdb;
import io.zerows.extension.commerce.rbac.domain.tables.records.RUserGroupRecord;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Function3;
import org.jooq.Index;
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
public class RUserGroup extends TableImpl<RUserGroupRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>ZDB.R_USER_GROUP</code>
     */
    public static final RUserGroup R_USER_GROUP = new RUserGroup();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<RUserGroupRecord> getRecordType() {
        return RUserGroupRecord.class;
    }

    /**
     * The column <code>ZDB.R_USER_GROUP.GROUP_ID</code>. 「groupId」- 关联组ID
     */
    public final TableField<RUserGroupRecord, String> GROUP_ID = createField(DSL.name("GROUP_ID"), SQLDataType.VARCHAR(36).nullable(false), this, "「groupId」- 关联组ID");

    /**
     * The column <code>ZDB.R_USER_GROUP.USER_ID</code>. 「userId」- 关联用户ID
     */
    public final TableField<RUserGroupRecord, String> USER_ID = createField(DSL.name("USER_ID"), SQLDataType.VARCHAR(36).nullable(false), this, "「userId」- 关联用户ID");

    /**
     * The column <code>ZDB.R_USER_GROUP.PRIORITY</code>. 「priority」- 组优先级
     */
    public final TableField<RUserGroupRecord, Integer> PRIORITY = createField(DSL.name("PRIORITY"), SQLDataType.INTEGER, this, "「priority」- 组优先级");

    private RUserGroup(Name alias, Table<RUserGroupRecord> aliased) {
        this(alias, aliased, null);
    }

    private RUserGroup(Name alias, Table<RUserGroupRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>ZDB.R_USER_GROUP</code> table reference
     */
    public RUserGroup(String alias) {
        this(DSL.name(alias), R_USER_GROUP);
    }

    /**
     * Create an aliased <code>ZDB.R_USER_GROUP</code> table reference
     */
    public RUserGroup(Name alias) {
        this(alias, R_USER_GROUP);
    }

    /**
     * Create a <code>ZDB.R_USER_GROUP</code> table reference
     */
    public RUserGroup() {
        this(DSL.name("R_USER_GROUP"), null);
    }

    public <O extends Record> RUserGroup(Table<O> child, ForeignKey<O, RUserGroupRecord> key) {
        super(child, key, R_USER_GROUP);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Zdb.ZDB;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.asList(Indexes.R_USER_GROUP_IDX_R_USER_GROUP_USER_ID);
    }

    @Override
    public UniqueKey<RUserGroupRecord> getPrimaryKey() {
        return Keys.KEY_R_USER_GROUP_PRIMARY;
    }

    @Override
    public RUserGroup as(String alias) {
        return new RUserGroup(DSL.name(alias), this);
    }

    @Override
    public RUserGroup as(Name alias) {
        return new RUserGroup(alias, this);
    }

    @Override
    public RUserGroup as(Table<?> alias) {
        return new RUserGroup(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public RUserGroup rename(String name) {
        return new RUserGroup(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public RUserGroup rename(Name name) {
        return new RUserGroup(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public RUserGroup rename(Table<?> name) {
        return new RUserGroup(name.getQualifiedName(), null);
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
