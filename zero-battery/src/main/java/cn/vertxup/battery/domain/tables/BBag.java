/*
 * This file is generated by jOOQ.
 */
package cn.vertxup.battery.domain.tables;


import cn.vertxup.battery.domain.Db;
import cn.vertxup.battery.domain.Keys;
import cn.vertxup.battery.domain.tables.records.BBagRecord;
import org.jooq.Record;
import org.jooq.*;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({"all", "unchecked", "rawtypes"})
public class BBag extends TableImpl<BBagRecord> {

    /**
     * The reference instance of <code>DB_ETERNAL.B_BAG</code>
     */
    public static final BBag B_BAG = new BBag();
    private static final long serialVersionUID = 1L;
    /**
     * The column <code>DB_ETERNAL.B_BAG.KEY</code>. 「key」- 模块主键
     */
    public final TableField<BBagRecord, String> KEY = createField(DSL.name("KEY"), SQLDataType.VARCHAR(36).nullable(false), this, "「key」- 模块主键");
    /**
     * The column <code>DB_ETERNAL.B_BAG.NAME</code>. 「name」- 模块名称
     */
    public final TableField<BBagRecord, String> NAME = createField(DSL.name("NAME"), SQLDataType.VARCHAR(255), this, "「name」- 模块名称");
    /**
     * The column <code>DB_ETERNAL.B_BAG.NAME_ABBR</code>. 「nameAbbr」- 模块缩写
     */
    public final TableField<BBagRecord, String> NAME_ABBR = createField(DSL.name("NAME_ABBR"), SQLDataType.VARCHAR(255), this, "「nameAbbr」- 模块缩写");
    /**
     * The column <code>DB_ETERNAL.B_BAG.NAME_FULL</code>. 「nameFull」- 模块全名
     */
    public final TableField<BBagRecord, String> NAME_FULL = createField(DSL.name("NAME_FULL"), SQLDataType.VARCHAR(255), this, "「nameFull」- 模块全名");
    /**
     * The column <code>DB_ETERNAL.B_BAG.TYPE</code>. 「type」- 包类型
     */
    public final TableField<BBagRecord, String> TYPE = createField(DSL.name("TYPE"), SQLDataType.VARCHAR(64), this, "「type」- 包类型");
    /**
     * The column <code>DB_ETERNAL.B_BAG.UI_ICON</code>. 「uiIcon」- 模块图标
     */
    public final TableField<BBagRecord, String> UI_ICON = createField(DSL.name("UI_ICON"), SQLDataType.VARCHAR(255), this, "「uiIcon」- 模块图标");
    /**
     * The column <code>DB_ETERNAL.B_BAG.UI_STYLE</code>. 「uiStyle」- 模块风格
     */
    public final TableField<BBagRecord, String> UI_STYLE = createField(DSL.name("UI_STYLE"), SQLDataType.CLOB, this, "「uiStyle」- 模块风格");
    /**
     * The column <code>DB_ETERNAL.B_BAG.UI_SORT</code>. 「uiSort」- 模块排序
     */
    public final TableField<BBagRecord, Long> UI_SORT = createField(DSL.name("UI_SORT"), SQLDataType.BIGINT, this, "「uiSort」- 模块排序");
    /**
     * The column <code>DB_ETERNAL.B_BAG.UI_CONFIG</code>. 「uiConfig」- 模块核心配置
     */
    public final TableField<BBagRecord, String> UI_CONFIG = createField(DSL.name("UI_CONFIG"), SQLDataType.CLOB, this, "「uiConfig」- 模块核心配置");
    /**
     * The column <code>DB_ETERNAL.B_BAG.ENTRY</code>. 「entry」-
     * 是否入口（带入口为应用，当前APP_ID下安装内容）
     */
    public final TableField<BBagRecord, Boolean> ENTRY = createField(DSL.name("ENTRY"), SQLDataType.BIT, this, "「entry」- 是否入口（带入口为应用，当前APP_ID下安装内容）");
    /**
     * The column <code>DB_ETERNAL.B_BAG.ENTRY_ID</code>. 「entryId」- 入口专用ID，关联
     * X_MENU 中的ID，其余的直接使用链接
     */
    public final TableField<BBagRecord, String> ENTRY_ID = createField(DSL.name("ENTRY_ID"), SQLDataType.VARCHAR(36), this, "「entryId」- 入口专用ID，关联 X_MENU 中的ID，其余的直接使用链接");
    /**
     * The column <code>DB_ETERNAL.B_BAG.APP_ID</code>. 「appId」- 关联的应用程序ID
     */
    public final TableField<BBagRecord, String> APP_ID = createField(DSL.name("APP_ID"), SQLDataType.VARCHAR(36), this, "「appId」- 关联的应用程序ID");
    /**
     * The column <code>DB_ETERNAL.B_BAG.PARENT_ID</code>. 「parentId」- 父包ID
     */
    public final TableField<BBagRecord, String> PARENT_ID = createField(DSL.name("PARENT_ID"), SQLDataType.VARCHAR(36), this, "「parentId」- 父包ID");
    /**
     * The column <code>DB_ETERNAL.B_BAG.ACTIVE</code>. 「active」- 是否启用
     */
    public final TableField<BBagRecord, Boolean> ACTIVE = createField(DSL.name("ACTIVE"), SQLDataType.BIT, this, "「active」- 是否启用");
    /**
     * The column <code>DB_ETERNAL.B_BAG.SIGMA</code>. 「sigma」- 统一标识
     */
    public final TableField<BBagRecord, String> SIGMA = createField(DSL.name("SIGMA"), SQLDataType.VARCHAR(32), this, "「sigma」- 统一标识");
    /**
     * The column <code>DB_ETERNAL.B_BAG.METADATA</code>. 「metadata」- 附加配置
     */
    public final TableField<BBagRecord, String> METADATA = createField(DSL.name("METADATA"), SQLDataType.CLOB, this, "「metadata」- 附加配置");
    /**
     * The column <code>DB_ETERNAL.B_BAG.LANGUAGE</code>. 「language」- 使用的语言
     */
    public final TableField<BBagRecord, String> LANGUAGE = createField(DSL.name("LANGUAGE"), SQLDataType.VARCHAR(8), this, "「language」- 使用的语言");
    /**
     * The column <code>DB_ETERNAL.B_BAG.CREATED_AT</code>. 「createdAt」- 创建时间
     */
    public final TableField<BBagRecord, LocalDateTime> CREATED_AT = createField(DSL.name("CREATED_AT"), SQLDataType.LOCALDATETIME(0), this, "「createdAt」- 创建时间");
    /**
     * The column <code>DB_ETERNAL.B_BAG.CREATED_BY</code>. 「createdBy」- 创建人
     */
    public final TableField<BBagRecord, String> CREATED_BY = createField(DSL.name("CREATED_BY"), SQLDataType.VARCHAR(36), this, "「createdBy」- 创建人");
    /**
     * The column <code>DB_ETERNAL.B_BAG.UPDATED_AT</code>. 「updatedAt」- 更新时间
     */
    public final TableField<BBagRecord, LocalDateTime> UPDATED_AT = createField(DSL.name("UPDATED_AT"), SQLDataType.LOCALDATETIME(0), this, "「updatedAt」- 更新时间");
    /**
     * The column <code>DB_ETERNAL.B_BAG.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    public final TableField<BBagRecord, String> UPDATED_BY = createField(DSL.name("UPDATED_BY"), SQLDataType.VARCHAR(36), this, "「updatedBy」- 更新人");

    private BBag(Name alias, Table<BBagRecord> aliased) {
        this(alias, aliased, null);
    }

    private BBag(Name alias, Table<BBagRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>DB_ETERNAL.B_BAG</code> table reference
     */
    public BBag(String alias) {
        this(DSL.name(alias), B_BAG);
    }

    /**
     * Create an aliased <code>DB_ETERNAL.B_BAG</code> table reference
     */
    public BBag(Name alias) {
        this(alias, B_BAG);
    }

    /**
     * Create a <code>DB_ETERNAL.B_BAG</code> table reference
     */
    public BBag() {
        this(DSL.name("B_BAG"), null);
    }

    public <O extends Record> BBag(Table<O> child, ForeignKey<O, BBagRecord> key) {
        super(child, key, B_BAG);
    }

    /**
     * The class holding records for this type
     */
    @Override
    public Class<BBagRecord> getRecordType() {
        return BBagRecord.class;
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Db.DB_ETERNAL;
    }

    @Override
    public UniqueKey<BBagRecord> getPrimaryKey() {
        return Keys.KEY_B_BAG_PRIMARY;
    }

    @Override
    public List<UniqueKey<BBagRecord>> getUniqueKeys() {
        return Arrays.asList(Keys.KEY_B_BAG_NAME, Keys.KEY_B_BAG_NAME_ABBR);
    }

    @Override
    public BBag as(String alias) {
        return new BBag(DSL.name(alias), this);
    }

    @Override
    public BBag as(Name alias) {
        return new BBag(alias, this);
    }

    @Override
    public BBag as(Table<?> alias) {
        return new BBag(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public BBag rename(String name) {
        return new BBag(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public BBag rename(Name name) {
        return new BBag(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public BBag rename(Table<?> name) {
        return new BBag(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row21 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row21<String, String, String, String, String, String, String, Long, String, Boolean, String, String, String, Boolean, String, String, String, LocalDateTime, String, LocalDateTime, String> fieldsRow() {
        return (Row21) super.fieldsRow();
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function21<? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? super Long, ? super String, ? super Boolean, ? super String, ? super String, ? super String, ? super Boolean, ? super String, ? super String, ? super String, ? super LocalDateTime, ? super String, ? super LocalDateTime, ? super String, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function21<? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? super Long, ? super String, ? super Boolean, ? super String, ? super String, ? super String, ? super Boolean, ? super String, ? super String, ? super String, ? super LocalDateTime, ? super String, ? super LocalDateTime, ? super String, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}
