/*
 * This file is generated by jOOQ.
 */
package io.zerows.extension.mbse.ui.domain.tables;


import io.zerows.extension.mbse.ui.domain.Keys;
import io.zerows.extension.mbse.ui.domain.Zdb;
import io.zerows.extension.mbse.ui.domain.tables.records.UiViewRecord;
import org.jooq.Record;
import org.jooq.*;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({"all", "unchecked", "rawtypes"})
public class UiView extends TableImpl<UiViewRecord> {

    /**
     * The reference instance of <code>ZDB.UI_VIEW</code>
     */
    public static final UiView UI_VIEW = new UiView();
    private static final long serialVersionUID = 1L;
    /**
     * The column <code>ZDB.UI_VIEW.KEY</code>. 「key」- 查询记录ID
     */
    public final TableField<UiViewRecord, String> KEY = createField(DSL.name("KEY"), SQLDataType.VARCHAR(36).nullable(false), this, "「key」- 查询记录ID");
    /**
     * The column <code>ZDB.UI_VIEW.NAME</code>. 「name」- 视图名称，每个 MATRIX 对应一个视图
     */
    public final TableField<UiViewRecord, String> NAME = createField(DSL.name("NAME"), SQLDataType.VARCHAR(255), this, "「name」- 视图名称，每个 MATRIX 对应一个视图");
    /**
     * The column <code>ZDB.UI_VIEW.CODE</code>. 「code」- 系统编码
     */
    public final TableField<UiViewRecord, String> CODE = createField(DSL.name("CODE"), SQLDataType.VARCHAR(255), this, "「code」- 系统编码");
    /**
     * The column <code>ZDB.UI_VIEW.SORT</code>. 「sort」- QR的顺序
     */
    public final TableField<UiViewRecord, Integer> SORT = createField(DSL.name("SORT"), SQLDataType.INTEGER, this, "「sort」- QR的顺序");
    /**
     * The column <code>ZDB.UI_VIEW.IDENTIFIER</code>. 「identifier」- 模型标识符
     */
    public final TableField<UiViewRecord, String> IDENTIFIER = createField(DSL.name("IDENTIFIER"), SQLDataType.VARCHAR(255), this, "「identifier」- 模型标识符");
    /**
     * The column <code>ZDB.UI_VIEW.WORKFLOW</code>. 「workflow」- 工作流名称
     */
    public final TableField<UiViewRecord, String> WORKFLOW = createField(DSL.name("WORKFLOW"), SQLDataType.VARCHAR(255), this, "「workflow」- 工作流名称");
    /**
     * The column <code>ZDB.UI_VIEW.VIEW</code>. 「view」- 视图名
     */
    public final TableField<UiViewRecord, String> VIEW = createField(DSL.name("VIEW"), SQLDataType.VARCHAR(96), this, "「view」- 视图名");
    /**
     * The column <code>ZDB.UI_VIEW.POSITION</code>. 「position」-
     * 当前视图的模块位置，比页面低一个维度
     */
    public final TableField<UiViewRecord, String> POSITION = createField(DSL.name("POSITION"), SQLDataType.VARCHAR(96), this, "「position」- 当前视图的模块位置，比页面低一个维度");
    /**
     * The column <code>ZDB.UI_VIEW.TITLE</code>. 「title」- 视图标题，用户输入，可选择
     */
    public final TableField<UiViewRecord, String> TITLE = createField(DSL.name("TITLE"), SQLDataType.VARCHAR(255), this, "「title」- 视图标题，用户输入，可选择");
    /**
     * The column <code>ZDB.UI_VIEW.PROJECTION</code>. 「projection」- 该资源的列定义
     */
    public final TableField<UiViewRecord, String> PROJECTION = createField(DSL.name("PROJECTION"), SQLDataType.CLOB, this, "「projection」- 该资源的列定义");
    /**
     * The column <code>ZDB.UI_VIEW.CRITERIA</code>. 「criteria」- 该资源的行查询
     */
    public final TableField<UiViewRecord, String> CRITERIA = createField(DSL.name("CRITERIA"), SQLDataType.CLOB, this, "「criteria」- 该资源的行查询");
    /**
     * The column <code>ZDB.UI_VIEW.ROWS</code>. 「rows」- 该资源针对保存的行进行过滤
     */
    public final TableField<UiViewRecord, String> ROWS = createField(DSL.name("ROWS"), SQLDataType.CLOB, this, "「rows」- 该资源针对保存的行进行过滤");
    /**
     * The column <code>ZDB.UI_VIEW.UI_CONFIG</code>. 「uiConfig」- 界面配置
     */
    public final TableField<UiViewRecord, String> UI_CONFIG = createField(DSL.name("UI_CONFIG"), SQLDataType.CLOB, this, "「uiConfig」- 界面配置");
    /**
     * The column <code>ZDB.UI_VIEW.QR_COMPONENT</code>. 「qrComponent」- 查询条件专用组件
     */
    public final TableField<UiViewRecord, String> QR_COMPONENT = createField(DSL.name("QR_COMPONENT"), SQLDataType.VARCHAR(255), this, "「qrComponent」- 查询条件专用组件");
    /**
     * The column <code>ZDB.UI_VIEW.QR_CONFIG</code>. 「qrConfig」- 查询组件专用配置
     */
    public final TableField<UiViewRecord, String> QR_CONFIG = createField(DSL.name("QR_CONFIG"), SQLDataType.CLOB, this, "「qrConfig」- 查询组件专用配置");
    /**
     * The column <code>ZDB.UI_VIEW.SIGMA</code>. 「sigma」- 用户组绑定的统一标识
     */
    public final TableField<UiViewRecord, String> SIGMA = createField(DSL.name("SIGMA"), SQLDataType.VARCHAR(128), this, "「sigma」- 用户组绑定的统一标识");
    /**
     * The column <code>ZDB.UI_VIEW.LANGUAGE</code>. 「language」- 使用的语言
     */
    public final TableField<UiViewRecord, String> LANGUAGE = createField(DSL.name("LANGUAGE"), SQLDataType.VARCHAR(10), this, "「language」- 使用的语言");
    /**
     * The column <code>ZDB.UI_VIEW.ACTIVE</code>. 「active」- 是否启用
     */
    public final TableField<UiViewRecord, Boolean> ACTIVE = createField(DSL.name("ACTIVE"), SQLDataType.BIT, this, "「active」- 是否启用");
    /**
     * The column <code>ZDB.UI_VIEW.METADATA</code>. 「metadata」- 附加配置数据
     */
    public final TableField<UiViewRecord, String> METADATA = createField(DSL.name("METADATA"), SQLDataType.CLOB, this, "「metadata」- 附加配置数据");
    /**
     * The column <code>ZDB.UI_VIEW.CREATED_AT</code>. 「createdAt」- 创建时间
     */
    public final TableField<UiViewRecord, LocalDateTime> CREATED_AT = createField(DSL.name("CREATED_AT"), SQLDataType.LOCALDATETIME(0), this, "「createdAt」- 创建时间");
    /**
     * The column <code>ZDB.UI_VIEW.CREATED_BY</code>. 「createdBy」- 创建人
     */
    public final TableField<UiViewRecord, String> CREATED_BY = createField(DSL.name("CREATED_BY"), SQLDataType.VARCHAR(36), this, "「createdBy」- 创建人");
    /**
     * The column <code>ZDB.UI_VIEW.UPDATED_AT</code>. 「updatedAt」- 更新时间
     */
    public final TableField<UiViewRecord, LocalDateTime> UPDATED_AT = createField(DSL.name("UPDATED_AT"), SQLDataType.LOCALDATETIME(0), this, "「updatedAt」- 更新时间");
    /**
     * The column <code>ZDB.UI_VIEW.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    public final TableField<UiViewRecord, String> UPDATED_BY = createField(DSL.name("UPDATED_BY"), SQLDataType.VARCHAR(36), this, "「updatedBy」- 更新人");

    private UiView(Name alias, Table<UiViewRecord> aliased) {
        this(alias, aliased, null);
    }

    private UiView(Name alias, Table<UiViewRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>ZDB.UI_VIEW</code> table reference
     */
    public UiView(String alias) {
        this(DSL.name(alias), UI_VIEW);
    }

    /**
     * Create an aliased <code>ZDB.UI_VIEW</code> table reference
     */
    public UiView(Name alias) {
        this(alias, UI_VIEW);
    }

    /**
     * Create a <code>ZDB.UI_VIEW</code> table reference
     */
    public UiView() {
        this(DSL.name("UI_VIEW"), null);
    }

    public <O extends Record> UiView(Table<O> child, ForeignKey<O, UiViewRecord> key) {
        super(child, key, UI_VIEW);
    }

    /**
     * The class holding records for this type
     */
    @Override
    public Class<UiViewRecord> getRecordType() {
        return UiViewRecord.class;
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Zdb.ZDB;
    }

    @Override
    public UniqueKey<UiViewRecord> getPrimaryKey() {
        return Keys.KEY_UI_VIEW_PRIMARY;
    }

    @Override
    public List<UniqueKey<UiViewRecord>> getUniqueKeys() {
        return Arrays.asList(Keys.KEY_UI_VIEW_SIGMA, Keys.KEY_UI_VIEW_SIGMA_2);
    }

    @Override
    public UiView as(String alias) {
        return new UiView(DSL.name(alias), this);
    }

    @Override
    public UiView as(Name alias) {
        return new UiView(alias, this);
    }

    @Override
    public UiView as(Table<?> alias) {
        return new UiView(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public UiView rename(String name) {
        return new UiView(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public UiView rename(Name name) {
        return new UiView(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public UiView rename(Table<?> name) {
        return new UiView(name.getQualifiedName(), null);
    }
}