/*
 * This file is generated by jOOQ.
 */
package cn.vertxup.ui.domain.tables;


import cn.vertxup.ui.domain.Keys;
import cn.vertxup.ui.domain.Zdb;
import cn.vertxup.ui.domain.tables.records.UiLayoutRecord;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Function11;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Records;
import org.jooq.Row11;
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
public class UiLayout extends TableImpl<UiLayoutRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>ZDB.UI_LAYOUT</code>
     */
    public static final UiLayout UI_LAYOUT = new UiLayout();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<UiLayoutRecord> getRecordType() {
        return UiLayoutRecord.class;
    }

    /**
     * The column <code>ZDB.UI_LAYOUT.KEY</code>. 「key」- Tpl模板唯一主键
     */
    public final TableField<UiLayoutRecord, String> KEY = createField(DSL.name("KEY"), SQLDataType.VARCHAR(36).nullable(false), this, "「key」- Tpl模板唯一主键");

    /**
     * The column <code>ZDB.UI_LAYOUT.NAME</code>. 「name」- Tpl模板名称
     */
    public final TableField<UiLayoutRecord, String> NAME = createField(DSL.name("NAME"), SQLDataType.VARCHAR(255), this, "「name」- Tpl模板名称");

    /**
     * The column <code>ZDB.UI_LAYOUT.CONFIG</code>. 「config」- 主配置
     */
    public final TableField<UiLayoutRecord, String> CONFIG = createField(DSL.name("CONFIG"), SQLDataType.CLOB, this, "「config」- 主配置");

    /**
     * The column <code>ZDB.UI_LAYOUT.ACTIVE</code>. 「active」- 是否启用
     */
    public final TableField<UiLayoutRecord, Boolean> ACTIVE = createField(DSL.name("ACTIVE"), SQLDataType.BIT, this, "「active」- 是否启用");

    /**
     * The column <code>ZDB.UI_LAYOUT.SIGMA</code>. 「sigma」- 统一标识
     */
    public final TableField<UiLayoutRecord, String> SIGMA = createField(DSL.name("SIGMA"), SQLDataType.VARCHAR(32), this, "「sigma」- 统一标识");

    /**
     * The column <code>ZDB.UI_LAYOUT.METADATA</code>. 「metadata」- 附加配置
     */
    public final TableField<UiLayoutRecord, String> METADATA = createField(DSL.name("METADATA"), SQLDataType.CLOB, this, "「metadata」- 附加配置");

    /**
     * The column <code>ZDB.UI_LAYOUT.LANGUAGE</code>. 「language」- 使用的语言
     */
    public final TableField<UiLayoutRecord, String> LANGUAGE = createField(DSL.name("LANGUAGE"), SQLDataType.VARCHAR(8), this, "「language」- 使用的语言");

    /**
     * The column <code>ZDB.UI_LAYOUT.CREATED_AT</code>. 「createdAt」- 创建时间
     */
    public final TableField<UiLayoutRecord, LocalDateTime> CREATED_AT = createField(DSL.name("CREATED_AT"), SQLDataType.LOCALDATETIME(0), this, "「createdAt」- 创建时间");

    /**
     * The column <code>ZDB.UI_LAYOUT.CREATED_BY</code>. 「createdBy」- 创建人
     */
    public final TableField<UiLayoutRecord, String> CREATED_BY = createField(DSL.name("CREATED_BY"), SQLDataType.VARCHAR(36), this, "「createdBy」- 创建人");

    /**
     * The column <code>ZDB.UI_LAYOUT.UPDATED_AT</code>. 「updatedAt」- 更新时间
     */
    public final TableField<UiLayoutRecord, LocalDateTime> UPDATED_AT = createField(DSL.name("UPDATED_AT"), SQLDataType.LOCALDATETIME(0), this, "「updatedAt」- 更新时间");

    /**
     * The column <code>ZDB.UI_LAYOUT.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    public final TableField<UiLayoutRecord, String> UPDATED_BY = createField(DSL.name("UPDATED_BY"), SQLDataType.VARCHAR(36), this, "「updatedBy」- 更新人");

    private UiLayout(Name alias, Table<UiLayoutRecord> aliased) {
        this(alias, aliased, null);
    }

    private UiLayout(Name alias, Table<UiLayoutRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>ZDB.UI_LAYOUT</code> table reference
     */
    public UiLayout(String alias) {
        this(DSL.name(alias), UI_LAYOUT);
    }

    /**
     * Create an aliased <code>ZDB.UI_LAYOUT</code> table reference
     */
    public UiLayout(Name alias) {
        this(alias, UI_LAYOUT);
    }

    /**
     * Create a <code>ZDB.UI_LAYOUT</code> table reference
     */
    public UiLayout() {
        this(DSL.name("UI_LAYOUT"), null);
    }

    public <O extends Record> UiLayout(Table<O> child, ForeignKey<O, UiLayoutRecord> key) {
        super(child, key, UI_LAYOUT);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Zdb.ZDB;
    }

    @Override
    public UniqueKey<UiLayoutRecord> getPrimaryKey() {
        return Keys.KEY_UI_LAYOUT_PRIMARY;
    }

    @Override
    public List<UniqueKey<UiLayoutRecord>> getUniqueKeys() {
        return Arrays.asList(Keys.KEY_UI_LAYOUT_NAME);
    }

    @Override
    public UiLayout as(String alias) {
        return new UiLayout(DSL.name(alias), this);
    }

    @Override
    public UiLayout as(Name alias) {
        return new UiLayout(alias, this);
    }

    @Override
    public UiLayout as(Table<?> alias) {
        return new UiLayout(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public UiLayout rename(String name) {
        return new UiLayout(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public UiLayout rename(Name name) {
        return new UiLayout(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public UiLayout rename(Table<?> name) {
        return new UiLayout(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row11 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row11<String, String, String, Boolean, String, String, String, LocalDateTime, String, LocalDateTime, String> fieldsRow() {
        return (Row11) super.fieldsRow();
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function11<? super String, ? super String, ? super String, ? super Boolean, ? super String, ? super String, ? super String, ? super LocalDateTime, ? super String, ? super LocalDateTime, ? super String, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function11<? super String, ? super String, ? super String, ? super Boolean, ? super String, ? super String, ? super String, ? super LocalDateTime, ? super String, ? super LocalDateTime, ? super String, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}
