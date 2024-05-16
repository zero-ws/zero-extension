/*
 * This file is generated by jOOQ.
 */
package io.zerows.extension.mbse.modulat.domain.tables;


import io.zerows.extension.mbse.modulat.domain.Keys;
import io.zerows.extension.mbse.modulat.domain.Zdb;
import io.zerows.extension.mbse.modulat.domain.tables.records.BAuthorityRecord;
import org.jooq.Record;
import org.jooq.*;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({"all", "unchecked", "rawtypes"})
public class BAuthority extends TableImpl<BAuthorityRecord> {

    /**
     * The reference instance of <code>ZDB.B_AUTHORITY</code>
     */
    public static final BAuthority B_AUTHORITY = new BAuthority();
    private static final long serialVersionUID = 1L;
    /**
     * The column <code>ZDB.B_AUTHORITY.KEY</code>. 「key」- 主键
     */
    public final TableField<BAuthorityRecord, String> KEY = createField(DSL.name("KEY"), SQLDataType.VARCHAR(36).nullable(false), this, "「key」- 主键");
    /**
     * The column <code>ZDB.B_AUTHORITY.CODE</code>. 「name」- 系统内部编码
     */
    public final TableField<BAuthorityRecord, String> CODE = createField(DSL.name("CODE"), SQLDataType.VARCHAR(255), this, "「name」- 系统内部编码");
    /**
     * The column <code>ZDB.B_AUTHORITY.BLOCK_ID</code>. 「blockId」- 所属模块ID
     */
    public final TableField<BAuthorityRecord, String> BLOCK_ID = createField(DSL.name("BLOCK_ID"), SQLDataType.VARCHAR(36), this, "「blockId」- 所属模块ID");
    /**
     * The column <code>ZDB.B_AUTHORITY.TYPE</code>. 「type」- 类型保留，单独区分
     */
    public final TableField<BAuthorityRecord, String> TYPE = createField(DSL.name("TYPE"), SQLDataType.VARCHAR(64), this, "「type」- 类型保留，单独区分");
    /**
     * The column <code>ZDB.B_AUTHORITY.LIC_RESOURCE</code>. 「licResource」- 资源编码
     */
    public final TableField<BAuthorityRecord, String> LIC_RESOURCE = createField(DSL.name("LIC_RESOURCE"), SQLDataType.CLOB, this, "「licResource」- 资源编码");
    /**
     * The column <code>ZDB.B_AUTHORITY.LIC_ACTION</code>. 「licAction」- 操作编码
     */
    public final TableField<BAuthorityRecord, String> LIC_ACTION = createField(DSL.name("LIC_ACTION"), SQLDataType.CLOB, this, "「licAction」- 操作编码");
    /**
     * The column <code>ZDB.B_AUTHORITY.LIC_PERMISSION</code>. 「licPermission」-
     * 所需权限集合
     */
    public final TableField<BAuthorityRecord, String> LIC_PERMISSION = createField(DSL.name("LIC_PERMISSION"), SQLDataType.CLOB, this, "「licPermission」- 所需权限集合");
    /**
     * The column <code>ZDB.B_AUTHORITY.LIC_VIEW</code>. 「licView」- 视图集合
     */
    public final TableField<BAuthorityRecord, String> LIC_VIEW = createField(DSL.name("LIC_VIEW"), SQLDataType.CLOB, this, "「licView」- 视图集合");
    /**
     * The column <code>ZDB.B_AUTHORITY.ACTIVE</code>. 「active」- 是否启用
     */
    public final TableField<BAuthorityRecord, Boolean> ACTIVE = createField(DSL.name("ACTIVE"), SQLDataType.BIT, this, "「active」- 是否启用");
    /**
     * The column <code>ZDB.B_AUTHORITY.SIGMA</code>. 「sigma」- 统一标识
     */
    public final TableField<BAuthorityRecord, String> SIGMA = createField(DSL.name("SIGMA"), SQLDataType.VARCHAR(32), this, "「sigma」- 统一标识");
    /**
     * The column <code>ZDB.B_AUTHORITY.METADATA</code>. 「metadata」- 附加配置
     */
    public final TableField<BAuthorityRecord, String> METADATA = createField(DSL.name("METADATA"), SQLDataType.CLOB, this, "「metadata」- 附加配置");
    /**
     * The column <code>ZDB.B_AUTHORITY.LANGUAGE</code>. 「language」- 使用的语言
     */
    public final TableField<BAuthorityRecord, String> LANGUAGE = createField(DSL.name("LANGUAGE"), SQLDataType.VARCHAR(8), this, "「language」- 使用的语言");

    private BAuthority(Name alias, Table<BAuthorityRecord> aliased) {
        this(alias, aliased, null);
    }

    private BAuthority(Name alias, Table<BAuthorityRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>ZDB.B_AUTHORITY</code> table reference
     */
    public BAuthority(String alias) {
        this(DSL.name(alias), B_AUTHORITY);
    }

    /**
     * Create an aliased <code>ZDB.B_AUTHORITY</code> table reference
     */
    public BAuthority(Name alias) {
        this(alias, B_AUTHORITY);
    }

    /**
     * Create a <code>ZDB.B_AUTHORITY</code> table reference
     */
    public BAuthority() {
        this(DSL.name("B_AUTHORITY"), null);
    }

    public <O extends Record> BAuthority(Table<O> child, ForeignKey<O, BAuthorityRecord> key) {
        super(child, key, B_AUTHORITY);
    }

    /**
     * The class holding records for this type
     */
    @Override
    public Class<BAuthorityRecord> getRecordType() {
        return BAuthorityRecord.class;
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Zdb.ZDB;
    }

    @Override
    public UniqueKey<BAuthorityRecord> getPrimaryKey() {
        return Keys.KEY_B_AUTHORITY_PRIMARY;
    }

    @Override
    public List<UniqueKey<BAuthorityRecord>> getUniqueKeys() {
        return Arrays.asList(Keys.KEY_B_AUTHORITY_CODE);
    }

    @Override
    public BAuthority as(String alias) {
        return new BAuthority(DSL.name(alias), this);
    }

    @Override
    public BAuthority as(Name alias) {
        return new BAuthority(alias, this);
    }

    @Override
    public BAuthority as(Table<?> alias) {
        return new BAuthority(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public BAuthority rename(String name) {
        return new BAuthority(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public BAuthority rename(Name name) {
        return new BAuthority(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public BAuthority rename(Table<?> name) {
        return new BAuthority(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row12 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row12<String, String, String, String, String, String, String, String, Boolean, String, String, String> fieldsRow() {
        return (Row12) super.fieldsRow();
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function12<? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? super Boolean, ? super String, ? super String, ? super String, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function12<? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? super Boolean, ? super String, ? super String, ? super String, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}