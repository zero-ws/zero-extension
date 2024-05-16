/*
 * This file is generated by jOOQ.
 */
package io.zerows.extension.mbse.ui.domain.tables;


import io.zerows.extension.mbse.ui.domain.Indexes;
import io.zerows.extension.mbse.ui.domain.Keys;
import io.zerows.extension.mbse.ui.domain.Zdb;
import io.zerows.extension.mbse.ui.domain.tables.records.UiPageRecord;
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
public class UiPage extends TableImpl<UiPageRecord> {

    /**
     * The reference instance of <code>ZDB.UI_PAGE</code>
     */
    public static final UiPage UI_PAGE = new UiPage();
    private static final long serialVersionUID = 1L;
    /**
     * The column <code>ZDB.UI_PAGE.KEY</code>. 「key」- 页面唯一主键
     */
    public final TableField<UiPageRecord, String> KEY = createField(DSL.name("KEY"), SQLDataType.VARCHAR(36).nullable(false), this, "「key」- 页面唯一主键");
    /**
     * The column <code>ZDB.UI_PAGE.APP</code>. 「app」- 入口APP名称，APP中的path
     */
    public final TableField<UiPageRecord, String> APP = createField(DSL.name("APP"), SQLDataType.VARCHAR(32), this, "「app」- 入口APP名称，APP中的path");
    /**
     * The column <code>ZDB.UI_PAGE.MODULE</code>. 「module」- 模块相关信息
     */
    public final TableField<UiPageRecord, String> MODULE = createField(DSL.name("MODULE"), SQLDataType.VARCHAR(32), this, "「module」- 模块相关信息");
    /**
     * The column <code>ZDB.UI_PAGE.PAGE</code>. 「page」- 页面路径信息
     */
    public final TableField<UiPageRecord, String> PAGE = createField(DSL.name("PAGE"), SQLDataType.VARCHAR(32), this, "「page」- 页面路径信息");
    /**
     * The column <code>ZDB.UI_PAGE.LAYOUT_ID</code>. 「layoutId」- 使用的模板ID，最终生成
     * layout 顶层节点数据
     */
    public final TableField<UiPageRecord, String> LAYOUT_ID = createField(DSL.name("LAYOUT_ID"), SQLDataType.VARCHAR(36), this, "「layoutId」- 使用的模板ID，最终生成 layout 顶层节点数据");
    /**
     * The column <code>ZDB.UI_PAGE.SECURE</code>. 「secure」-
     * 是否执行安全检查（安全检查才会被权限系统捕捉）
     */
    public final TableField<UiPageRecord, Boolean> SECURE = createField(DSL.name("SECURE"), SQLDataType.BIT, this, "「secure」- 是否执行安全检查（安全检查才会被权限系统捕捉）");
    /**
     * The column <code>ZDB.UI_PAGE.PARAM_MAP</code>. 「paramMap」-
     * URL地址中的配置key=value
     */
    public final TableField<UiPageRecord, String> PARAM_MAP = createField(DSL.name("PARAM_MAP"), SQLDataType.CLOB, this, "「paramMap」- URL地址中的配置key=value");
    /**
     * The column <code>ZDB.UI_PAGE.CONTAINER_NAME</code>. 「containerName」-
     * 当前页面是否存在容器，如果有容器，那么设置容器名称
     */
    public final TableField<UiPageRecord, String> CONTAINER_NAME = createField(DSL.name("CONTAINER_NAME"), SQLDataType.VARCHAR(32), this, "「containerName」- 当前页面是否存在容器，如果有容器，那么设置容器名称");
    /**
     * The column <code>ZDB.UI_PAGE.CONTAINER_CONFIG</code>. 「containerConfig」-
     * 当前页面容器相关配置
     */
    public final TableField<UiPageRecord, String> CONTAINER_CONFIG = createField(DSL.name("CONTAINER_CONFIG"), SQLDataType.CLOB, this, "「containerConfig」- 当前页面容器相关配置");
    /**
     * The column <code>ZDB.UI_PAGE.STATE</code>. 「state」- 当前页面的初始化状态信息
     */
    public final TableField<UiPageRecord, String> STATE = createField(DSL.name("STATE"), SQLDataType.CLOB, this, "「state」- 当前页面的初始化状态信息");
    /**
     * The column <code>ZDB.UI_PAGE.GRID</code>. 「grid」- 当前页面的布局信息，Grid布局格式
     */
    public final TableField<UiPageRecord, String> GRID = createField(DSL.name("GRID"), SQLDataType.CLOB, this, "「grid」- 当前页面的布局信息，Grid布局格式");
    /**
     * The column <code>ZDB.UI_PAGE.ASSIST</code>. 「assist」- 当前页面的辅助数据Ajax配置
     */
    public final TableField<UiPageRecord, String> ASSIST = createField(DSL.name("ASSIST"), SQLDataType.CLOB, this, "「assist」- 当前页面的辅助数据Ajax配置");
    /**
     * The column <code>ZDB.UI_PAGE.ACTIVE</code>. 「active」- 是否启用
     */
    public final TableField<UiPageRecord, Boolean> ACTIVE = createField(DSL.name("ACTIVE"), SQLDataType.BIT, this, "「active」- 是否启用");
    /**
     * The column <code>ZDB.UI_PAGE.SIGMA</code>. 「sigma」- 统一标识
     */
    public final TableField<UiPageRecord, String> SIGMA = createField(DSL.name("SIGMA"), SQLDataType.VARCHAR(32), this, "「sigma」- 统一标识");
    /**
     * The column <code>ZDB.UI_PAGE.METADATA</code>. 「metadata」- 附加配置
     */
    public final TableField<UiPageRecord, String> METADATA = createField(DSL.name("METADATA"), SQLDataType.CLOB, this, "「metadata」- 附加配置");
    /**
     * The column <code>ZDB.UI_PAGE.LANGUAGE</code>. 「language」- 使用的语言
     */
    public final TableField<UiPageRecord, String> LANGUAGE = createField(DSL.name("LANGUAGE"), SQLDataType.VARCHAR(8), this, "「language」- 使用的语言");
    /**
     * The column <code>ZDB.UI_PAGE.CREATED_AT</code>. 「createdAt」- 创建时间
     */
    public final TableField<UiPageRecord, LocalDateTime> CREATED_AT = createField(DSL.name("CREATED_AT"), SQLDataType.LOCALDATETIME(0), this, "「createdAt」- 创建时间");
    /**
     * The column <code>ZDB.UI_PAGE.CREATED_BY</code>. 「createdBy」- 创建人
     */
    public final TableField<UiPageRecord, String> CREATED_BY = createField(DSL.name("CREATED_BY"), SQLDataType.VARCHAR(36), this, "「createdBy」- 创建人");
    /**
     * The column <code>ZDB.UI_PAGE.UPDATED_AT</code>. 「updatedAt」- 更新时间
     */
    public final TableField<UiPageRecord, LocalDateTime> UPDATED_AT = createField(DSL.name("UPDATED_AT"), SQLDataType.LOCALDATETIME(0), this, "「updatedAt」- 更新时间");
    /**
     * The column <code>ZDB.UI_PAGE.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    public final TableField<UiPageRecord, String> UPDATED_BY = createField(DSL.name("UPDATED_BY"), SQLDataType.VARCHAR(36), this, "「updatedBy」- 更新人");

    private UiPage(Name alias, Table<UiPageRecord> aliased) {
        this(alias, aliased, null);
    }

    private UiPage(Name alias, Table<UiPageRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>ZDB.UI_PAGE</code> table reference
     */
    public UiPage(String alias) {
        this(DSL.name(alias), UI_PAGE);
    }

    /**
     * Create an aliased <code>ZDB.UI_PAGE</code> table reference
     */
    public UiPage(Name alias) {
        this(alias, UI_PAGE);
    }

    /**
     * Create a <code>ZDB.UI_PAGE</code> table reference
     */
    public UiPage() {
        this(DSL.name("UI_PAGE"), null);
    }

    public <O extends Record> UiPage(Table<O> child, ForeignKey<O, UiPageRecord> key) {
        super(child, key, UI_PAGE);
    }

    /**
     * The class holding records for this type
     */
    @Override
    public Class<UiPageRecord> getRecordType() {
        return UiPageRecord.class;
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Zdb.ZDB;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.asList(Indexes.UI_PAGE_IDXM_UI_PAGE_APP_MODULE_PAGE_LANGUAGE_SIGMA);
    }

    @Override
    public UniqueKey<UiPageRecord> getPrimaryKey() {
        return Keys.KEY_UI_PAGE_PRIMARY;
    }

    @Override
    public List<UniqueKey<UiPageRecord>> getUniqueKeys() {
        return Arrays.asList(Keys.KEY_UI_PAGE_APP);
    }

    @Override
    public UiPage as(String alias) {
        return new UiPage(DSL.name(alias), this);
    }

    @Override
    public UiPage as(Name alias) {
        return new UiPage(alias, this);
    }

    @Override
    public UiPage as(Table<?> alias) {
        return new UiPage(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public UiPage rename(String name) {
        return new UiPage(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public UiPage rename(Name name) {
        return new UiPage(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public UiPage rename(Table<?> name) {
        return new UiPage(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row20 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row20<String, String, String, String, String, Boolean, String, String, String, String, String, String, Boolean, String, String, String, LocalDateTime, String, LocalDateTime, String> fieldsRow() {
        return (Row20) super.fieldsRow();
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function20<? super String, ? super String, ? super String, ? super String, ? super String, ? super Boolean, ? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? super Boolean, ? super String, ? super String, ? super String, ? super LocalDateTime, ? super String, ? super LocalDateTime, ? super String, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function20<? super String, ? super String, ? super String, ? super String, ? super String, ? super Boolean, ? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? super Boolean, ? super String, ? super String, ? super String, ? super LocalDateTime, ? super String, ? super LocalDateTime, ? super String, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}