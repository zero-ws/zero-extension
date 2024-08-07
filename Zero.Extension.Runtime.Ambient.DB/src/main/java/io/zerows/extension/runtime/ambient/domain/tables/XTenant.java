/*
 * This file is generated by jOOQ.
 */
package io.zerows.extension.runtime.ambient.domain.tables;


import io.zerows.extension.runtime.ambient.domain.Keys;
import io.zerows.extension.runtime.ambient.domain.Zdb;
import io.zerows.extension.runtime.ambient.domain.tables.records.XTenantRecord;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Function18;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Records;
import org.jooq.Row18;
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
public class XTenant extends TableImpl<XTenantRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>ZDB.X_TENANT</code>
     */
    public static final XTenant X_TENANT = new XTenant();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<XTenantRecord> getRecordType() {
        return XTenantRecord.class;
    }

    /**
     * The column <code>ZDB.X_TENANT.KEY</code>. 「key」- 租户主键
     */
    public final TableField<XTenantRecord, String> KEY = createField(DSL.name("KEY"), SQLDataType.VARCHAR(36).nullable(false), this, "「key」- 租户主键");

    /**
     * The column <code>ZDB.X_TENANT.NAME</code>. 「name」- 租户名称
     */
    public final TableField<XTenantRecord, String> NAME = createField(DSL.name("NAME"), SQLDataType.VARCHAR(255), this, "「name」- 租户名称");

    /**
     * The column <code>ZDB.X_TENANT.CODE</code>. 「code」- 租户编码
     */
    public final TableField<XTenantRecord, String> CODE = createField(DSL.name("CODE"), SQLDataType.VARCHAR(36), this, "「code」- 租户编码");

    /**
     * The column <code>ZDB.X_TENANT.STATUS</code>. 「status」- 租户状态
     */
    public final TableField<XTenantRecord, String> STATUS = createField(DSL.name("STATUS"), SQLDataType.VARCHAR(255), this, "「status」- 租户状态");

    /**
     * The column <code>ZDB.X_TENANT.TYPE</code>. 「type」- 租户类型
     */
    public final TableField<XTenantRecord, String> TYPE = createField(DSL.name("TYPE"), SQLDataType.VARCHAR(255), this, "「type」- 租户类型");

    /**
     * The column <code>ZDB.X_TENANT.ID_NUMBER</code>. 「idNumber」- 身份证号
     */
    public final TableField<XTenantRecord, String> ID_NUMBER = createField(DSL.name("ID_NUMBER"), SQLDataType.VARCHAR(255), this, "「idNumber」- 身份证号");

    /**
     * The column <code>ZDB.X_TENANT.ID_FRONT</code>. 「idFront」- 身份证正面
     */
    public final TableField<XTenantRecord, String> ID_FRONT = createField(DSL.name("ID_FRONT"), SQLDataType.VARCHAR(255), this, "「idFront」- 身份证正面");

    /**
     * The column <code>ZDB.X_TENANT.ID_BACK</code>. 「idBack」- 身份证反面
     */
    public final TableField<XTenantRecord, String> ID_BACK = createField(DSL.name("ID_BACK"), SQLDataType.VARCHAR(255), this, "「idBack」- 身份证反面");

    /**
     * The column <code>ZDB.X_TENANT.BANK_ID</code>. 「bankId」- 开户行
     */
    public final TableField<XTenantRecord, String> BANK_ID = createField(DSL.name("BANK_ID"), SQLDataType.VARCHAR(36), this, "「bankId」- 开户行");

    /**
     * The column <code>ZDB.X_TENANT.BANK_CARD</code>. 「bankCard」- 开户行账号
     */
    public final TableField<XTenantRecord, String> BANK_CARD = createField(DSL.name("BANK_CARD"), SQLDataType.VARCHAR(255), this, "「bankCard」- 开户行账号");

    /**
     * The column <code>ZDB.X_TENANT.ACTIVE</code>. 「active」- 是否启用
     */
    public final TableField<XTenantRecord, Boolean> ACTIVE = createField(DSL.name("ACTIVE"), SQLDataType.BIT, this, "「active」- 是否启用");

    /**
     * The column <code>ZDB.X_TENANT.SIGMA</code>. 「sigma」- 统一标识
     */
    public final TableField<XTenantRecord, String> SIGMA = createField(DSL.name("SIGMA"), SQLDataType.VARCHAR(32), this, "「sigma」- 统一标识");

    /**
     * The column <code>ZDB.X_TENANT.METADATA</code>. 「metadata」- 附加配置
     */
    public final TableField<XTenantRecord, String> METADATA = createField(DSL.name("METADATA"), SQLDataType.CLOB, this, "「metadata」- 附加配置");

    /**
     * The column <code>ZDB.X_TENANT.LANGUAGE</code>. 「language」- 使用的语言
     */
    public final TableField<XTenantRecord, String> LANGUAGE = createField(DSL.name("LANGUAGE"), SQLDataType.VARCHAR(8), this, "「language」- 使用的语言");

    /**
     * The column <code>ZDB.X_TENANT.CREATED_AT</code>. 「createdAt」- 创建时间
     */
    public final TableField<XTenantRecord, LocalDateTime> CREATED_AT = createField(DSL.name("CREATED_AT"), SQLDataType.LOCALDATETIME(0), this, "「createdAt」- 创建时间");

    /**
     * The column <code>ZDB.X_TENANT.CREATED_BY</code>. 「createdBy」- 创建人
     */
    public final TableField<XTenantRecord, String> CREATED_BY = createField(DSL.name("CREATED_BY"), SQLDataType.VARCHAR(36), this, "「createdBy」- 创建人");

    /**
     * The column <code>ZDB.X_TENANT.UPDATED_AT</code>. 「updatedAt」- 更新时间
     */
    public final TableField<XTenantRecord, LocalDateTime> UPDATED_AT = createField(DSL.name("UPDATED_AT"), SQLDataType.LOCALDATETIME(0), this, "「updatedAt」- 更新时间");

    /**
     * The column <code>ZDB.X_TENANT.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    public final TableField<XTenantRecord, String> UPDATED_BY = createField(DSL.name("UPDATED_BY"), SQLDataType.VARCHAR(36), this, "「updatedBy」- 更新人");

    private XTenant(Name alias, Table<XTenantRecord> aliased) {
        this(alias, aliased, null);
    }

    private XTenant(Name alias, Table<XTenantRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>ZDB.X_TENANT</code> table reference
     */
    public XTenant(String alias) {
        this(DSL.name(alias), X_TENANT);
    }

    /**
     * Create an aliased <code>ZDB.X_TENANT</code> table reference
     */
    public XTenant(Name alias) {
        this(alias, X_TENANT);
    }

    /**
     * Create a <code>ZDB.X_TENANT</code> table reference
     */
    public XTenant() {
        this(DSL.name("X_TENANT"), null);
    }

    public <O extends Record> XTenant(Table<O> child, ForeignKey<O, XTenantRecord> key) {
        super(child, key, X_TENANT);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Zdb.ZDB;
    }

    @Override
    public UniqueKey<XTenantRecord> getPrimaryKey() {
        return Keys.KEY_X_TENANT_PRIMARY;
    }

    @Override
    public List<UniqueKey<XTenantRecord>> getUniqueKeys() {
        return Arrays.asList(Keys.KEY_X_TENANT_CODE, Keys.KEY_X_TENANT_SIGMA);
    }

    @Override
    public XTenant as(String alias) {
        return new XTenant(DSL.name(alias), this);
    }

    @Override
    public XTenant as(Name alias) {
        return new XTenant(alias, this);
    }

    @Override
    public XTenant as(Table<?> alias) {
        return new XTenant(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public XTenant rename(String name) {
        return new XTenant(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public XTenant rename(Name name) {
        return new XTenant(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public XTenant rename(Table<?> name) {
        return new XTenant(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row18 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row18<String, String, String, String, String, String, String, String, String, String, Boolean, String, String, String, LocalDateTime, String, LocalDateTime, String> fieldsRow() {
        return (Row18) super.fieldsRow();
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function18<? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? super Boolean, ? super String, ? super String, ? super String, ? super LocalDateTime, ? super String, ? super LocalDateTime, ? super String, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function18<? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? super Boolean, ? super String, ? super String, ? super String, ? super LocalDateTime, ? super String, ? super LocalDateTime, ? super String, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}
