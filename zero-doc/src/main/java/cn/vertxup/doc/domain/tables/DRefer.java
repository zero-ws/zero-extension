/*
 * This file is generated by jOOQ.
 */
package cn.vertxup.doc.domain.tables;


import cn.vertxup.doc.domain.Keys;
import cn.vertxup.doc.domain.Zdb;
import cn.vertxup.doc.domain.tables.records.DReferRecord;

import java.util.function.Function;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Function7;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Records;
import org.jooq.Row7;
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
public class DRefer extends TableImpl<DReferRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>ZDB.D_REFER</code>
     */
    public static final DRefer D_REFER = new DRefer();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<DReferRecord> getRecordType() {
        return DReferRecord.class;
    }

    /**
     * The column <code>ZDB.D_REFER.FROM_ID</code>. 「fromId」- 从ID
     */
    public final TableField<DReferRecord, String> FROM_ID = createField(DSL.name("FROM_ID"), SQLDataType.VARCHAR(36).nullable(false), this, "「fromId」- 从ID");

    /**
     * The column <code>ZDB.D_REFER.FROM_TYPE</code>. 「fromType」- 从类型
     */
    public final TableField<DReferRecord, String> FROM_TYPE = createField(DSL.name("FROM_TYPE"), SQLDataType.VARCHAR(64).nullable(false), this, "「fromType」- 从类型");

    /**
     * The column <code>ZDB.D_REFER.TO_ID</code>. 「toId」- 到ID
     */
    public final TableField<DReferRecord, String> TO_ID = createField(DSL.name("TO_ID"), SQLDataType.VARCHAR(36).nullable(false), this, "「toId」- 到ID");

    /**
     * The column <code>ZDB.D_REFER.TO_TYPE</code>. 「toType」- 到类型
     */
    public final TableField<DReferRecord, String> TO_TYPE = createField(DSL.name("TO_TYPE"), SQLDataType.VARCHAR(64).nullable(false), this, "「toType」- 到类型");

    /**
     * The column <code>ZDB.D_REFER.INLINE</code>. 「inline」- 是否内联
     */
    public final TableField<DReferRecord, Boolean> INLINE = createField(DSL.name("INLINE"), SQLDataType.BIT, this, "「inline」- 是否内联");

    /**
     * The column <code>ZDB.D_REFER.COMMENT</code>. 「comment」- 关系备注
     */
    public final TableField<DReferRecord, String> COMMENT = createField(DSL.name("COMMENT"), SQLDataType.CLOB, this, "「comment」- 关系备注");

    /**
     * The column <code>ZDB.D_REFER.REFER_COMPONENT</code>. 「referComponent」-
     * 关联执行组件（扩展用）
     */
    public final TableField<DReferRecord, String> REFER_COMPONENT = createField(DSL.name("REFER_COMPONENT"), SQLDataType.VARCHAR(255), this, "「referComponent」- 关联执行组件（扩展用）");

    private DRefer(Name alias, Table<DReferRecord> aliased) {
        this(alias, aliased, null);
    }

    private DRefer(Name alias, Table<DReferRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>ZDB.D_REFER</code> table reference
     */
    public DRefer(String alias) {
        this(DSL.name(alias), D_REFER);
    }

    /**
     * Create an aliased <code>ZDB.D_REFER</code> table reference
     */
    public DRefer(Name alias) {
        this(alias, D_REFER);
    }

    /**
     * Create a <code>ZDB.D_REFER</code> table reference
     */
    public DRefer() {
        this(DSL.name("D_REFER"), null);
    }

    public <O extends Record> DRefer(Table<O> child, ForeignKey<O, DReferRecord> key) {
        super(child, key, D_REFER);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Zdb.ZDB;
    }

    @Override
    public UniqueKey<DReferRecord> getPrimaryKey() {
        return Keys.KEY_D_REFER_PRIMARY;
    }

    @Override
    public DRefer as(String alias) {
        return new DRefer(DSL.name(alias), this);
    }

    @Override
    public DRefer as(Name alias) {
        return new DRefer(alias, this);
    }

    @Override
    public DRefer as(Table<?> alias) {
        return new DRefer(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public DRefer rename(String name) {
        return new DRefer(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public DRefer rename(Name name) {
        return new DRefer(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public DRefer rename(Table<?> name) {
        return new DRefer(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row7 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row7<String, String, String, String, Boolean, String, String> fieldsRow() {
        return (Row7) super.fieldsRow();
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function7<? super String, ? super String, ? super String, ? super String, ? super Boolean, ? super String, ? super String, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function7<? super String, ? super String, ? super String, ? super String, ? super Boolean, ? super String, ? super String, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}