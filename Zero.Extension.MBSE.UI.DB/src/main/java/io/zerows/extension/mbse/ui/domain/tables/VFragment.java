/*
 * This file is generated by jOOQ.
 */
package io.zerows.extension.mbse.ui.domain.tables;


import io.zerows.extension.mbse.ui.domain.Keys;
import io.zerows.extension.mbse.ui.domain.Zdb;
import io.zerows.extension.mbse.ui.domain.tables.records.VFragmentRecord;
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
public class VFragment extends TableImpl<VFragmentRecord> {

    /**
     * The reference instance of <code>ZDB.V_FRAGMENT</code>
     */
    public static final VFragment V_FRAGMENT = new VFragment();
    private static final long serialVersionUID = 1L;
    /**
     * The column <code>ZDB.V_FRAGMENT.KEY</code>. 「key」- 选项主键
     */
    public final TableField<VFragmentRecord, String> KEY = createField(DSL.name("KEY"), SQLDataType.VARCHAR(36).nullable(false), this, "「key」- 选项主键");
    /**
     * The column <code>ZDB.V_FRAGMENT.CONTAINER</code>. 「container」- 容器专用格式
     */
    public final TableField<VFragmentRecord, String> CONTAINER = createField(DSL.name("CONTAINER"), SQLDataType.CLOB, this, "「container」- 容器专用格式");
    /**
     * The column <code>ZDB.V_FRAGMENT.NOTICE</code>. 「notice」- notice选项，Alert结构
     */
    public final TableField<VFragmentRecord, String> NOTICE = createField(DSL.name("NOTICE"), SQLDataType.CLOB, this, "「notice」- notice选项，Alert结构");
    /**
     * The column <code>ZDB.V_FRAGMENT.BUTTON_CONNECT</code>. 「buttonConnect」-
     * 按钮的ID（单按钮）
     */
    public final TableField<VFragmentRecord, String> BUTTON_CONNECT = createField(DSL.name("BUTTON_CONNECT"), SQLDataType.VARCHAR(36), this, "「buttonConnect」- 按钮的ID（单按钮）");
    /**
     * The column <code>ZDB.V_FRAGMENT.BUTTON_GROUP</code>. 「buttonGroup」-
     * 一组按钮配置
     */
    public final TableField<VFragmentRecord, String> BUTTON_GROUP = createField(DSL.name("BUTTON_GROUP"), SQLDataType.CLOB, this, "「buttonGroup」- 一组按钮配置");
    /**
     * The column <code>ZDB.V_FRAGMENT.MODAL</code>. 「modal」- modal选项，Model专用结构
     */
    public final TableField<VFragmentRecord, String> MODAL = createField(DSL.name("MODAL"), SQLDataType.CLOB, this, "「modal」- modal选项，Model专用结构");
    /**
     * The column <code>ZDB.V_FRAGMENT.GRID</code>. 「grid」- grid选项（分区面板专用）
     */
    public final TableField<VFragmentRecord, Integer> GRID = createField(DSL.name("GRID"), SQLDataType.INTEGER.defaultValue(DSL.inline("3", SQLDataType.INTEGER)), this, "「grid」- grid选项（分区面板专用）");
    /**
     * The column <code>ZDB.V_FRAGMENT.CONFIG</code>. 「config」- 根目录开始的基本配置
     */
    public final TableField<VFragmentRecord, String> CONFIG = createField(DSL.name("CONFIG"), SQLDataType.CLOB, this, "「config」- 根目录开始的基本配置");

    private VFragment(Name alias, Table<VFragmentRecord> aliased) {
        this(alias, aliased, null);
    }

    private VFragment(Name alias, Table<VFragmentRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>ZDB.V_FRAGMENT</code> table reference
     */
    public VFragment(String alias) {
        this(DSL.name(alias), V_FRAGMENT);
    }

    /**
     * Create an aliased <code>ZDB.V_FRAGMENT</code> table reference
     */
    public VFragment(Name alias) {
        this(alias, V_FRAGMENT);
    }

    /**
     * Create a <code>ZDB.V_FRAGMENT</code> table reference
     */
    public VFragment() {
        this(DSL.name("V_FRAGMENT"), null);
    }

    public <O extends Record> VFragment(Table<O> child, ForeignKey<O, VFragmentRecord> key) {
        super(child, key, V_FRAGMENT);
    }

    /**
     * The class holding records for this type
     */
    @Override
    public Class<VFragmentRecord> getRecordType() {
        return VFragmentRecord.class;
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Zdb.ZDB;
    }

    @Override
    public UniqueKey<VFragmentRecord> getPrimaryKey() {
        return Keys.KEY_V_FRAGMENT_PRIMARY;
    }

    @Override
    public VFragment as(String alias) {
        return new VFragment(DSL.name(alias), this);
    }

    @Override
    public VFragment as(Name alias) {
        return new VFragment(alias, this);
    }

    @Override
    public VFragment as(Table<?> alias) {
        return new VFragment(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public VFragment rename(String name) {
        return new VFragment(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public VFragment rename(Name name) {
        return new VFragment(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public VFragment rename(Table<?> name) {
        return new VFragment(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row8 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row8<String, String, String, String, String, String, Integer, String> fieldsRow() {
        return (Row8) super.fieldsRow();
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function8<? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? super Integer, ? super String, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function8<? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? super Integer, ? super String, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}
