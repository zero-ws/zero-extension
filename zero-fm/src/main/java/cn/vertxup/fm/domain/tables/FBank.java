/*
 * This file is generated by jOOQ.
 */
package cn.vertxup.fm.domain.tables;


import cn.vertxup.fm.domain.Keys;
import cn.vertxup.fm.domain.Zdb;
import cn.vertxup.fm.domain.tables.records.FBankRecord;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Function20;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Records;
import org.jooq.Row20;
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
public class FBank extends TableImpl<FBankRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>ZDB.F_BANK</code>
     */
    public static final FBank F_BANK = new FBank();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<FBankRecord> getRecordType() {
        return FBankRecord.class;
    }

    /**
     * The column <code>ZDB.F_BANK.KEY</code>. 「key」- 银行主键
     */
    public final TableField<FBankRecord, String> KEY = createField(DSL.name("KEY"), SQLDataType.VARCHAR(36).nullable(false), this, "「key」- 银行主键");

    /**
     * The column <code>ZDB.F_BANK.NAME</code>. 「name」- 银行名称
     */
    public final TableField<FBankRecord, String> NAME = createField(DSL.name("NAME"), SQLDataType.VARCHAR(255), this, "「name」- 银行名称");

    /**
     * The column <code>ZDB.F_BANK.CODE</code>. 「code」- 银行系统编号
     */
    public final TableField<FBankRecord, String> CODE = createField(DSL.name("CODE"), SQLDataType.VARCHAR(255).nullable(false), this, "「code」- 银行系统编号");

    /**
     * The column <code>ZDB.F_BANK.ALIAS</code>. 「alias」- 银行别称
     */
    public final TableField<FBankRecord, String> ALIAS = createField(DSL.name("ALIAS"), SQLDataType.VARCHAR(255), this, "「alias」- 银行别称");

    /**
     * The column <code>ZDB.F_BANK.LOGO</code>. 「logo」- 银行图标
     */
    public final TableField<FBankRecord, String> LOGO = createField(DSL.name("LOGO"), SQLDataType.VARCHAR(255), this, "「logo」- 银行图标");

    /**
     * The column <code>ZDB.F_BANK.WEBSITE</code>. 「website」- 银行主页
     */
    public final TableField<FBankRecord, String> WEBSITE = createField(DSL.name("WEBSITE"), SQLDataType.VARCHAR(255), this, "「website」- 银行主页");

    /**
     * The column <code>ZDB.F_BANK.COMMENT</code>. 「comment」 - 银行备注
     */
    public final TableField<FBankRecord, String> COMMENT = createField(DSL.name("COMMENT"), SQLDataType.CLOB, this, "「comment」 - 银行备注");

    /**
     * The column <code>ZDB.F_BANK.BRANCH_NAME</code>. 「branchName」- 支行名称
     */
    public final TableField<FBankRecord, String> BRANCH_NAME = createField(DSL.name("BRANCH_NAME"), SQLDataType.VARCHAR(255), this, "「branchName」- 支行名称");

    /**
     * The column <code>ZDB.F_BANK.BRANCH_CODE</code>. 「branchCode」- 支行编号
     */
    public final TableField<FBankRecord, String> BRANCH_CODE = createField(DSL.name("BRANCH_CODE"), SQLDataType.VARCHAR(255), this, "「branchCode」- 支行编号");

    /**
     * The column <code>ZDB.F_BANK.BRANCH</code>. 「branch」- 是否支行
     */
    public final TableField<FBankRecord, Boolean> BRANCH = createField(DSL.name("BRANCH"), SQLDataType.BIT, this, "「branch」- 是否支行");

    /**
     * The column <code>ZDB.F_BANK.BANK_ID</code>. 「bankId」- 所属银行ID
     */
    public final TableField<FBankRecord, String> BANK_ID = createField(DSL.name("BANK_ID"), SQLDataType.VARCHAR(36), this, "「bankId」- 所属银行ID");

    /**
     * The column <code>ZDB.F_BANK.LOCATION_ID</code>. 「locationId」- 银行地址对应信息
     */
    public final TableField<FBankRecord, String> LOCATION_ID = createField(DSL.name("LOCATION_ID"), SQLDataType.VARCHAR(36), this, "「locationId」- 银行地址对应信息");

    /**
     * The column <code>ZDB.F_BANK.SIGMA</code>. 「sigma」- 统一标识
     */
    public final TableField<FBankRecord, String> SIGMA = createField(DSL.name("SIGMA"), SQLDataType.VARCHAR(32), this, "「sigma」- 统一标识");

    /**
     * The column <code>ZDB.F_BANK.LANGUAGE</code>. 「language」- 使用的语言
     */
    public final TableField<FBankRecord, String> LANGUAGE = createField(DSL.name("LANGUAGE"), SQLDataType.VARCHAR(10), this, "「language」- 使用的语言");

    /**
     * The column <code>ZDB.F_BANK.ACTIVE</code>. 「active」- 是否启用
     */
    public final TableField<FBankRecord, Boolean> ACTIVE = createField(DSL.name("ACTIVE"), SQLDataType.BIT, this, "「active」- 是否启用");

    /**
     * The column <code>ZDB.F_BANK.METADATA</code>. 「metadata」- 附加配置数据
     */
    public final TableField<FBankRecord, String> METADATA = createField(DSL.name("METADATA"), SQLDataType.CLOB, this, "「metadata」- 附加配置数据");

    /**
     * The column <code>ZDB.F_BANK.CREATED_AT</code>. 「createdAt」- 创建时间
     */
    public final TableField<FBankRecord, LocalDateTime> CREATED_AT = createField(DSL.name("CREATED_AT"), SQLDataType.LOCALDATETIME(0), this, "「createdAt」- 创建时间");

    /**
     * The column <code>ZDB.F_BANK.CREATED_BY</code>. 「createdBy」- 创建人
     */
    public final TableField<FBankRecord, String> CREATED_BY = createField(DSL.name("CREATED_BY"), SQLDataType.VARCHAR(36), this, "「createdBy」- 创建人");

    /**
     * The column <code>ZDB.F_BANK.UPDATED_AT</code>. 「updatedAt」- 更新时间
     */
    public final TableField<FBankRecord, LocalDateTime> UPDATED_AT = createField(DSL.name("UPDATED_AT"), SQLDataType.LOCALDATETIME(0), this, "「updatedAt」- 更新时间");

    /**
     * The column <code>ZDB.F_BANK.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    public final TableField<FBankRecord, String> UPDATED_BY = createField(DSL.name("UPDATED_BY"), SQLDataType.VARCHAR(36), this, "「updatedBy」- 更新人");

    private FBank(Name alias, Table<FBankRecord> aliased) {
        this(alias, aliased, null);
    }

    private FBank(Name alias, Table<FBankRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>ZDB.F_BANK</code> table reference
     */
    public FBank(String alias) {
        this(DSL.name(alias), F_BANK);
    }

    /**
     * Create an aliased <code>ZDB.F_BANK</code> table reference
     */
    public FBank(Name alias) {
        this(alias, F_BANK);
    }

    /**
     * Create a <code>ZDB.F_BANK</code> table reference
     */
    public FBank() {
        this(DSL.name("F_BANK"), null);
    }

    public <O extends Record> FBank(Table<O> child, ForeignKey<O, FBankRecord> key) {
        super(child, key, F_BANK);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Zdb.ZDB;
    }

    @Override
    public UniqueKey<FBankRecord> getPrimaryKey() {
        return Keys.KEY_F_BANK_PRIMARY;
    }

    @Override
    public List<UniqueKey<FBankRecord>> getUniqueKeys() {
        return Arrays.asList(Keys.KEY_F_BANK_CODE, Keys.KEY_F_BANK_BRANCH_NAME, Keys.KEY_F_BANK_BRANCH_CODE);
    }

    @Override
    public FBank as(String alias) {
        return new FBank(DSL.name(alias), this);
    }

    @Override
    public FBank as(Name alias) {
        return new FBank(alias, this);
    }

    @Override
    public FBank as(Table<?> alias) {
        return new FBank(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public FBank rename(String name) {
        return new FBank(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public FBank rename(Name name) {
        return new FBank(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public FBank rename(Table<?> name) {
        return new FBank(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row20 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row20<String, String, String, String, String, String, String, String, String, Boolean, String, String, String, String, Boolean, String, LocalDateTime, String, LocalDateTime, String> fieldsRow() {
        return (Row20) super.fieldsRow();
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function20<? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? super Boolean, ? super String, ? super String, ? super String, ? super String, ? super Boolean, ? super String, ? super LocalDateTime, ? super String, ? super LocalDateTime, ? super String, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function20<? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? super Boolean, ? super String, ? super String, ? super String, ? super String, ? super Boolean, ? super String, ? super LocalDateTime, ? super String, ? super LocalDateTime, ? super String, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}
