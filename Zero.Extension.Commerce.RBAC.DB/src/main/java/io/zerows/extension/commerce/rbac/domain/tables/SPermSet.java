/*
 * This file is generated by jOOQ.
 */
package io.zerows.extension.commerce.rbac.domain.tables;


import io.zerows.extension.commerce.rbac.domain.Keys;
import io.zerows.extension.commerce.rbac.domain.Zdb;
import io.zerows.extension.commerce.rbac.domain.tables.records.SPermSetRecord;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Function13;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Records;
import org.jooq.Row13;
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
public class SPermSet extends TableImpl<SPermSetRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>ZDB.S_PERM_SET</code>
     */
    public static final SPermSet S_PERM_SET = new SPermSet();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<SPermSetRecord> getRecordType() {
        return SPermSetRecord.class;
    }

    /**
     * The column <code>ZDB.S_PERM_SET.KEY</code>. 「key」- 权限集ID
     */
    public final TableField<SPermSetRecord, String> KEY = createField(DSL.name("KEY"), SQLDataType.VARCHAR(36).nullable(false), this, "「key」- 权限集ID");

    /**
     * The column <code>ZDB.S_PERM_SET.NAME</code>. 「name」- 权限集名称
     */
    public final TableField<SPermSetRecord, String> NAME = createField(DSL.name("NAME"), SQLDataType.VARCHAR(255), this, "「name」- 权限集名称");

    /**
     * The column <code>ZDB.S_PERM_SET.CODE</code>. 「code」- 权限集关联权限代码
     */
    public final TableField<SPermSetRecord, String> CODE = createField(DSL.name("CODE"), SQLDataType.VARCHAR(255), this, "「code」- 权限集关联权限代码");

    /**
     * The column <code>ZDB.S_PERM_SET.TYPE</code>. 「type」- 权限集类型
     */
    public final TableField<SPermSetRecord, String> TYPE = createField(DSL.name("TYPE"), SQLDataType.VARCHAR(255), this, "「type」- 权限集类型");

    /**
     * The column <code>ZDB.S_PERM_SET.SIGMA</code>. 「sigma」- 绑定的统一标识
     */
    public final TableField<SPermSetRecord, String> SIGMA = createField(DSL.name("SIGMA"), SQLDataType.VARCHAR(128), this, "「sigma」- 绑定的统一标识");

    /**
     * The column <code>ZDB.S_PERM_SET.LANGUAGE</code>. 「language」- 使用的语言
     */
    public final TableField<SPermSetRecord, String> LANGUAGE = createField(DSL.name("LANGUAGE"), SQLDataType.VARCHAR(10), this, "「language」- 使用的语言");

    /**
     * The column <code>ZDB.S_PERM_SET.ACTIVE</code>. 「active」- 是否启用
     */
    public final TableField<SPermSetRecord, Boolean> ACTIVE = createField(DSL.name("ACTIVE"), SQLDataType.BIT, this, "「active」- 是否启用");

    /**
     * The column <code>ZDB.S_PERM_SET.COMMENT</code>. 「comment」- 权限集说明
     */
    public final TableField<SPermSetRecord, String> COMMENT = createField(DSL.name("COMMENT"), SQLDataType.CLOB, this, "「comment」- 权限集说明");

    /**
     * The column <code>ZDB.S_PERM_SET.METADATA</code>. 「metadata」- 附加配置数据
     */
    public final TableField<SPermSetRecord, String> METADATA = createField(DSL.name("METADATA"), SQLDataType.CLOB, this, "「metadata」- 附加配置数据");

    /**
     * The column <code>ZDB.S_PERM_SET.CREATED_AT</code>. 「createdAt」- 创建时间
     */
    public final TableField<SPermSetRecord, LocalDateTime> CREATED_AT = createField(DSL.name("CREATED_AT"), SQLDataType.LOCALDATETIME(0), this, "「createdAt」- 创建时间");

    /**
     * The column <code>ZDB.S_PERM_SET.CREATED_BY</code>. 「createdBy」- 创建人
     */
    public final TableField<SPermSetRecord, String> CREATED_BY = createField(DSL.name("CREATED_BY"), SQLDataType.VARCHAR(36), this, "「createdBy」- 创建人");

    /**
     * The column <code>ZDB.S_PERM_SET.UPDATED_AT</code>. 「updatedAt」- 更新时间
     */
    public final TableField<SPermSetRecord, LocalDateTime> UPDATED_AT = createField(DSL.name("UPDATED_AT"), SQLDataType.LOCALDATETIME(0), this, "「updatedAt」- 更新时间");

    /**
     * The column <code>ZDB.S_PERM_SET.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    public final TableField<SPermSetRecord, String> UPDATED_BY = createField(DSL.name("UPDATED_BY"), SQLDataType.VARCHAR(36), this, "「updatedBy」- 更新人");

    private SPermSet(Name alias, Table<SPermSetRecord> aliased) {
        this(alias, aliased, null);
    }

    private SPermSet(Name alias, Table<SPermSetRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>ZDB.S_PERM_SET</code> table reference
     */
    public SPermSet(String alias) {
        this(DSL.name(alias), S_PERM_SET);
    }

    /**
     * Create an aliased <code>ZDB.S_PERM_SET</code> table reference
     */
    public SPermSet(Name alias) {
        this(alias, S_PERM_SET);
    }

    /**
     * Create a <code>ZDB.S_PERM_SET</code> table reference
     */
    public SPermSet() {
        this(DSL.name("S_PERM_SET"), null);
    }

    public <O extends Record> SPermSet(Table<O> child, ForeignKey<O, SPermSetRecord> key) {
        super(child, key, S_PERM_SET);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Zdb.ZDB;
    }

    @Override
    public UniqueKey<SPermSetRecord> getPrimaryKey() {
        return Keys.KEY_S_PERM_SET_PRIMARY;
    }

    @Override
    public List<UniqueKey<SPermSetRecord>> getUniqueKeys() {
        return Arrays.asList(Keys.KEY_S_PERM_SET_NAME);
    }

    @Override
    public SPermSet as(String alias) {
        return new SPermSet(DSL.name(alias), this);
    }

    @Override
    public SPermSet as(Name alias) {
        return new SPermSet(alias, this);
    }

    @Override
    public SPermSet as(Table<?> alias) {
        return new SPermSet(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public SPermSet rename(String name) {
        return new SPermSet(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public SPermSet rename(Name name) {
        return new SPermSet(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public SPermSet rename(Table<?> name) {
        return new SPermSet(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row13 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row13<String, String, String, String, String, String, Boolean, String, String, LocalDateTime, String, LocalDateTime, String> fieldsRow() {
        return (Row13) super.fieldsRow();
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function13<? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? super Boolean, ? super String, ? super String, ? super LocalDateTime, ? super String, ? super LocalDateTime, ? super String, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function13<? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? super Boolean, ? super String, ? super String, ? super LocalDateTime, ? super String, ? super LocalDateTime, ? super String, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}
