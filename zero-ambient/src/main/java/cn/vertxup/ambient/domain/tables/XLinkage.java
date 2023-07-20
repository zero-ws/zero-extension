/*
 * This file is generated by jOOQ.
 */
package cn.vertxup.ambient.domain.tables;


import cn.vertxup.ambient.domain.Indexes;
import cn.vertxup.ambient.domain.Keys;
import cn.vertxup.ambient.domain.Zdb;
import cn.vertxup.ambient.domain.tables.records.XLinkageRecord;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Function22;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Records;
import org.jooq.Row22;
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
public class XLinkage extends TableImpl<XLinkageRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>ZDB.X_LINKAGE</code>
     */
    public static final XLinkage X_LINKAGE = new XLinkage();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<XLinkageRecord> getRecordType() {
        return XLinkageRecord.class;
    }

    /**
     * The column <code>ZDB.X_LINKAGE.KEY</code>. 「key」- 连接主键
     */
    public final TableField<XLinkageRecord, String> KEY = createField(DSL.name("KEY"), SQLDataType.VARCHAR(36).nullable(false), this, "「key」- 连接主键");

    /**
     * The column <code>ZDB.X_LINKAGE.NAME</code>. 「name」- 名称
     */
    public final TableField<XLinkageRecord, String> NAME = createField(DSL.name("NAME"), SQLDataType.VARCHAR(255).nullable(false), this, "「name」- 名称");

    /**
     * The column <code>ZDB.X_LINKAGE.TYPE</code>. 「type」- 连接类型
     */
    public final TableField<XLinkageRecord, String> TYPE = createField(DSL.name("TYPE"), SQLDataType.VARCHAR(64).nullable(false), this, "「type」- 连接类型");

    /**
     * The column <code>ZDB.X_LINKAGE.ALIAS</code>. 「alias」- 别称
     */
    public final TableField<XLinkageRecord, String> ALIAS = createField(DSL.name("ALIAS"), SQLDataType.VARCHAR(128), this, "「alias」- 别称");

    /**
     * The column <code>ZDB.X_LINKAGE.REGION</code>. 「region」-
     * 连接区域标识，同一个区域算一个连接（批次）
     */
    public final TableField<XLinkageRecord, String> REGION = createField(DSL.name("REGION"), SQLDataType.VARCHAR(255), this, "「region」- 连接区域标识，同一个区域算一个连接（批次）");

    /**
     * The column <code>ZDB.X_LINKAGE.LINK_KEY</code>. 「linkKey」- 双向Key计算，根据
     * source / target 计算
     */
    public final TableField<XLinkageRecord, String> LINK_KEY = createField(DSL.name("LINK_KEY"), SQLDataType.VARCHAR(255), this, "「linkKey」- 双向Key计算，根据 source / target 计算");

    /**
     * The column <code>ZDB.X_LINKAGE.LINK_TYPE</code>. 「linkType」- 关系记录类型
     */
    public final TableField<XLinkageRecord, String> LINK_TYPE = createField(DSL.name("LINK_TYPE"), SQLDataType.VARCHAR(255), this, "「linkType」- 关系记录类型");

    /**
     * The column <code>ZDB.X_LINKAGE.LINK_DATA</code>. 「linkData」- 关联数据Json格式
     */
    public final TableField<XLinkageRecord, String> LINK_DATA = createField(DSL.name("LINK_DATA"), SQLDataType.CLOB, this, "「linkData」- 关联数据Json格式");

    /**
     * The column <code>ZDB.X_LINKAGE.SOURCE_KEY</code>. 「sourceKey」- 源实体
     */
    public final TableField<XLinkageRecord, String> SOURCE_KEY = createField(DSL.name("SOURCE_KEY"), SQLDataType.VARCHAR(255), this, "「sourceKey」- 源实体");

    /**
     * The column <code>ZDB.X_LINKAGE.SOURCE_TYPE</code>. 「sourceType」- 源实体类型
     */
    public final TableField<XLinkageRecord, String> SOURCE_TYPE = createField(DSL.name("SOURCE_TYPE"), SQLDataType.VARCHAR(255), this, "「sourceType」- 源实体类型");

    /**
     * The column <code>ZDB.X_LINKAGE.SOURCE_DATA</code>. 「sourceData」-
     * 源记录Json格式
     */
    public final TableField<XLinkageRecord, String> SOURCE_DATA = createField(DSL.name("SOURCE_DATA"), SQLDataType.CLOB, this, "「sourceData」- 源记录Json格式");

    /**
     * The column <code>ZDB.X_LINKAGE.TARGET_KEY</code>. 「targetKey」- 目标实体
     */
    public final TableField<XLinkageRecord, String> TARGET_KEY = createField(DSL.name("TARGET_KEY"), SQLDataType.VARCHAR(255), this, "「targetKey」- 目标实体");

    /**
     * The column <code>ZDB.X_LINKAGE.TARGET_TYPE</code>. 「targetType」- 目标实体类型
     */
    public final TableField<XLinkageRecord, String> TARGET_TYPE = createField(DSL.name("TARGET_TYPE"), SQLDataType.VARCHAR(255), this, "「targetType」- 目标实体类型");

    /**
     * The column <code>ZDB.X_LINKAGE.TARGET_DATA</code>. 「targetData」-
     * 目标记录Json格式
     */
    public final TableField<XLinkageRecord, String> TARGET_DATA = createField(DSL.name("TARGET_DATA"), SQLDataType.CLOB, this, "「targetData」- 目标记录Json格式");

    /**
     * The column <code>ZDB.X_LINKAGE.SIGMA</code>. 「sigma」- 统一标识
     */
    public final TableField<XLinkageRecord, String> SIGMA = createField(DSL.name("SIGMA"), SQLDataType.VARCHAR(32), this, "「sigma」- 统一标识");

    /**
     * The column <code>ZDB.X_LINKAGE.LANGUAGE</code>. 「language」- 使用的语言
     */
    public final TableField<XLinkageRecord, String> LANGUAGE = createField(DSL.name("LANGUAGE"), SQLDataType.VARCHAR(10), this, "「language」- 使用的语言");

    /**
     * The column <code>ZDB.X_LINKAGE.ACTIVE</code>. 「active」- 是否启用
     */
    public final TableField<XLinkageRecord, Boolean> ACTIVE = createField(DSL.name("ACTIVE"), SQLDataType.BIT, this, "「active」- 是否启用");

    /**
     * The column <code>ZDB.X_LINKAGE.METADATA</code>. 「metadata」- 附加配置数据
     */
    public final TableField<XLinkageRecord, String> METADATA = createField(DSL.name("METADATA"), SQLDataType.CLOB, this, "「metadata」- 附加配置数据");

    /**
     * The column <code>ZDB.X_LINKAGE.CREATED_AT</code>. 「createdAt」- 创建时间
     */
    public final TableField<XLinkageRecord, LocalDateTime> CREATED_AT = createField(DSL.name("CREATED_AT"), SQLDataType.LOCALDATETIME(0), this, "「createdAt」- 创建时间");

    /**
     * The column <code>ZDB.X_LINKAGE.CREATED_BY</code>. 「createdBy」- 创建人
     */
    public final TableField<XLinkageRecord, String> CREATED_BY = createField(DSL.name("CREATED_BY"), SQLDataType.VARCHAR(36), this, "「createdBy」- 创建人");

    /**
     * The column <code>ZDB.X_LINKAGE.UPDATED_AT</code>. 「updatedAt」- 更新时间
     */
    public final TableField<XLinkageRecord, LocalDateTime> UPDATED_AT = createField(DSL.name("UPDATED_AT"), SQLDataType.LOCALDATETIME(0), this, "「updatedAt」- 更新时间");

    /**
     * The column <code>ZDB.X_LINKAGE.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    public final TableField<XLinkageRecord, String> UPDATED_BY = createField(DSL.name("UPDATED_BY"), SQLDataType.VARCHAR(36), this, "「updatedBy」- 更新人");

    private XLinkage(Name alias, Table<XLinkageRecord> aliased) {
        this(alias, aliased, null);
    }

    private XLinkage(Name alias, Table<XLinkageRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>ZDB.X_LINKAGE</code> table reference
     */
    public XLinkage(String alias) {
        this(DSL.name(alias), X_LINKAGE);
    }

    /**
     * Create an aliased <code>ZDB.X_LINKAGE</code> table reference
     */
    public XLinkage(Name alias) {
        this(alias, X_LINKAGE);
    }

    /**
     * Create a <code>ZDB.X_LINKAGE</code> table reference
     */
    public XLinkage() {
        this(DSL.name("X_LINKAGE"), null);
    }

    public <O extends Record> XLinkage(Table<O> child, ForeignKey<O, XLinkageRecord> key) {
        super(child, key, X_LINKAGE);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Zdb.ZDB;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.asList(Indexes.X_LINKAGE_IDX_X_LINKAGE_R_SOURCE_KEY, Indexes.X_LINKAGE_IDX_X_LINKAGE_R_SOURCE_TYPE, Indexes.X_LINKAGE_IDX_X_LINKAGE_R_TARGET_KEY, Indexes.X_LINKAGE_IDX_X_LINKAGE_R_TARGET_TYPE, Indexes.X_LINKAGE_IDX_X_LINKAGE_REGION, Indexes.X_LINKAGE_IDX_X_LINKAGE_SIGMA);
    }

    @Override
    public UniqueKey<XLinkageRecord> getPrimaryKey() {
        return Keys.KEY_X_LINKAGE_PRIMARY;
    }

    @Override
    public List<UniqueKey<XLinkageRecord>> getUniqueKeys() {
        return Arrays.asList(Keys.KEY_X_LINKAGE_REGION, Keys.KEY_X_LINKAGE_LINK_KEY);
    }

    @Override
    public XLinkage as(String alias) {
        return new XLinkage(DSL.name(alias), this);
    }

    @Override
    public XLinkage as(Name alias) {
        return new XLinkage(alias, this);
    }

    @Override
    public XLinkage as(Table<?> alias) {
        return new XLinkage(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public XLinkage rename(String name) {
        return new XLinkage(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public XLinkage rename(Name name) {
        return new XLinkage(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public XLinkage rename(Table<?> name) {
        return new XLinkage(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row22 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row22<String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, Boolean, String, LocalDateTime, String, LocalDateTime, String> fieldsRow() {
        return (Row22) super.fieldsRow();
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function22<? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? super Boolean, ? super String, ? super LocalDateTime, ? super String, ? super LocalDateTime, ? super String, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function22<? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? super Boolean, ? super String, ? super LocalDateTime, ? super String, ? super LocalDateTime, ? super String, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}
