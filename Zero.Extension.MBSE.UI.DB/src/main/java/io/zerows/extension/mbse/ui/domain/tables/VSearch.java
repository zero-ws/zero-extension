/*
 * This file is generated by jOOQ.
 */
package io.zerows.extension.mbse.ui.domain.tables;


import io.zerows.extension.mbse.ui.domain.Keys;
import io.zerows.extension.mbse.ui.domain.Zdb;
import io.zerows.extension.mbse.ui.domain.tables.records.VSearchRecord;
import org.jooq.Record;
import org.jooq.*;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;

import java.util.function.Function;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({"all", "unchecked", "rawtypes"})
public class VSearch extends TableImpl<VSearchRecord> {

    /**
     * The reference instance of <code>ZDB.V_SEARCH</code>
     */
    public static final VSearch V_SEARCH = new VSearch();
    private static final long serialVersionUID = 1L;
    /**
     * The column <code>ZDB.V_SEARCH.KEY</code>. 「key」- 选项主键
     */
    public final TableField<VSearchRecord, String> KEY = createField(DSL.name("KEY"), SQLDataType.VARCHAR(36).nullable(false), this, "「key」- 选项主键");
    /**
     * The column <code>ZDB.V_SEARCH.ENABLED</code>. 「enabled」- search.enabled:
     * 是否启用搜索
     */
    public final TableField<VSearchRecord, Boolean> ENABLED = createField(DSL.name("ENABLED"), SQLDataType.BIT, this, "「enabled」- search.enabled: 是否启用搜索");
    /**
     * The column <code>ZDB.V_SEARCH.ADVANCED</code>. 「advanced」-
     * search.advanced: 是否启用高级搜索
     */
    public final TableField<VSearchRecord, Boolean> ADVANCED = createField(DSL.name("ADVANCED"), SQLDataType.BIT, this, "「advanced」- search.advanced: 是否启用高级搜索");
    /**
     * The column <code>ZDB.V_SEARCH.OP_REDO</code>. 「opRedo」- search.op.redo:
     * 清除条件按钮提示文字
     */
    public final TableField<VSearchRecord, String> OP_REDO = createField(DSL.name("OP_REDO"), SQLDataType.VARCHAR(64), this, "「opRedo」- search.op.redo: 清除条件按钮提示文字");
    /**
     * The column <code>ZDB.V_SEARCH.OP_ADVANCED</code>. 「opAdvanced」-
     * search.op.advanced: 高级搜索按钮提示文字
     */
    public final TableField<VSearchRecord, String> OP_ADVANCED = createField(DSL.name("OP_ADVANCED"), SQLDataType.VARCHAR(64), this, "「opAdvanced」- search.op.advanced: 高级搜索按钮提示文字");
    /**
     * The column <code>ZDB.V_SEARCH.OP_VIEW</code>. 「opView」-
     * search.op.view：视图查询条件修改文字
     */
    public final TableField<VSearchRecord, String> OP_VIEW = createField(DSL.name("OP_VIEW"), SQLDataType.VARCHAR(64), this, "「opView」- search.op.view：视图查询条件修改文字");
    /**
     * The column <code>ZDB.V_SEARCH.CONFIRM_CLEAR</code>. 「confirmClear」-
     * search.confirm.clear: 清除条件提示
     */
    public final TableField<VSearchRecord, String> CONFIRM_CLEAR = createField(DSL.name("CONFIRM_CLEAR"), SQLDataType.VARCHAR(255), this, "「confirmClear」- search.confirm.clear: 清除条件提示");
    /**
     * The column <code>ZDB.V_SEARCH.PLACEHOLDER</code>. 「placeholder」-
     * search.placeholder: 搜索框水印文字
     */
    public final TableField<VSearchRecord, String> PLACEHOLDER = createField(DSL.name("PLACEHOLDER"), SQLDataType.VARCHAR(255), this, "「placeholder」- search.placeholder: 搜索框水印文字");
    /**
     * The column <code>ZDB.V_SEARCH.COND</code>. 「cond」- search.cond: 搜索条件
     */
    public final TableField<VSearchRecord, String> COND = createField(DSL.name("COND"), SQLDataType.CLOB, this, "「cond」- search.cond: 搜索条件");
    /**
     * The column <code>ZDB.V_SEARCH.ADVANCED_WIDTH</code>. 「advancedWidth」-
     * search.advanced.width: 高级搜索窗口宽度
     */
    public final TableField<VSearchRecord, String> ADVANCED_WIDTH = createField(DSL.name("ADVANCED_WIDTH"), SQLDataType.VARCHAR(100), this, "「advancedWidth」- search.advanced.width: 高级搜索窗口宽度");
    /**
     * The column <code>ZDB.V_SEARCH.ADVANCED_TITLE</code>. 「advancedTitle」-
     * search.advanced.title: 高级搜索窗口标题
     */
    public final TableField<VSearchRecord, String> ADVANCED_TITLE = createField(DSL.name("ADVANCED_TITLE"), SQLDataType.VARCHAR(128), this, "「advancedTitle」- search.advanced.title: 高级搜索窗口标题");
    /**
     * The column <code>ZDB.V_SEARCH.ADVANCED_NOTICE</code>. 「advancedNotice」-
     * search.advanced.notice: 提示信息结构（Alert）
     */
    public final TableField<VSearchRecord, String> ADVANCED_NOTICE = createField(DSL.name("ADVANCED_NOTICE"), SQLDataType.CLOB, this, "「advancedNotice」- search.advanced.notice: 提示信息结构（Alert）");
    /**
     * The column <code>ZDB.V_SEARCH.ADVANCED_VIEW</code>. 「viewOption」-
     * search.criteria.xxx：视图选项信息
     */
    public final TableField<VSearchRecord, String> ADVANCED_VIEW = createField(DSL.name("ADVANCED_VIEW"), SQLDataType.CLOB, this, "「viewOption」- search.criteria.xxx：视图选项信息");

    private VSearch(Name alias, Table<VSearchRecord> aliased) {
        this(alias, aliased, null);
    }

    private VSearch(Name alias, Table<VSearchRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>ZDB.V_SEARCH</code> table reference
     */
    public VSearch(String alias) {
        this(DSL.name(alias), V_SEARCH);
    }

    /**
     * Create an aliased <code>ZDB.V_SEARCH</code> table reference
     */
    public VSearch(Name alias) {
        this(alias, V_SEARCH);
    }

    /**
     * Create a <code>ZDB.V_SEARCH</code> table reference
     */
    public VSearch() {
        this(DSL.name("V_SEARCH"), null);
    }

    public <O extends Record> VSearch(Table<O> child, ForeignKey<O, VSearchRecord> key) {
        super(child, key, V_SEARCH);
    }

    /**
     * The class holding records for this type
     */
    @Override
    public Class<VSearchRecord> getRecordType() {
        return VSearchRecord.class;
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Zdb.ZDB;
    }

    @Override
    public UniqueKey<VSearchRecord> getPrimaryKey() {
        return Keys.KEY_V_SEARCH_PRIMARY;
    }

    @Override
    public VSearch as(String alias) {
        return new VSearch(DSL.name(alias), this);
    }

    @Override
    public VSearch as(Name alias) {
        return new VSearch(alias, this);
    }

    @Override
    public VSearch as(Table<?> alias) {
        return new VSearch(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public VSearch rename(String name) {
        return new VSearch(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public VSearch rename(Name name) {
        return new VSearch(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public VSearch rename(Table<?> name) {
        return new VSearch(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row13 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row13<String, Boolean, Boolean, String, String, String, String, String, String, String, String, String, String> fieldsRow() {
        return (Row13) super.fieldsRow();
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function13<? super String, ? super Boolean, ? super Boolean, ? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function13<? super String, ? super Boolean, ? super Boolean, ? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}
