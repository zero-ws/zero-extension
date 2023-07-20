/*
 * This file is generated by jOOQ.
 */
package cn.vertxup.lbs.domain.tables;


import cn.vertxup.lbs.domain.Keys;
import cn.vertxup.lbs.domain.Zdb;
import cn.vertxup.lbs.domain.tables.records.LYardRecord;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Function13;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Records;
import org.jooq.Row13;
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
public class LYard extends TableImpl<LYardRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>ZDB.L_YARD</code>
     */
    public static final LYard L_YARD = new LYard();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<LYardRecord> getRecordType() {
        return LYardRecord.class;
    }

    /**
     * The column <code>ZDB.L_YARD.KEY</code>. 「key」- 主键
     */
    public final TableField<LYardRecord, String> KEY = createField(DSL.name("KEY"), SQLDataType.VARCHAR(36).nullable(false), this, "「key」- 主键");

    /**
     * The column <code>ZDB.L_YARD.NAME</code>. 「name」- 名称
     */
    public final TableField<LYardRecord, String> NAME = createField(DSL.name("NAME"), SQLDataType.VARCHAR(32).nullable(false), this, "「name」- 名称");

    /**
     * The column <code>ZDB.L_YARD.CODE</code>. 「code」- 编码
     */
    public final TableField<LYardRecord, String> CODE = createField(DSL.name("CODE"), SQLDataType.VARCHAR(36), this, "「code」- 编码");

    /**
     * The column <code>ZDB.L_YARD.METADATA</code>. 「metadata」- 附加配置
     */
    public final TableField<LYardRecord, String> METADATA = createField(DSL.name("METADATA"), SQLDataType.CLOB, this, "「metadata」- 附加配置");

    /**
     * The column <code>ZDB.L_YARD.ORDER</code>. 「order」- 排序
     */
    public final TableField<LYardRecord, Integer> ORDER = createField(DSL.name("ORDER"), SQLDataType.INTEGER, this, "「order」- 排序");

    /**
     * The column <code>ZDB.L_YARD.LOCATION_ID</code>. 「locationId」- 关联地址ID
     */
    public final TableField<LYardRecord, String> LOCATION_ID = createField(DSL.name("LOCATION_ID"), SQLDataType.VARCHAR(36), this, "「locationId」- 关联地址ID");

    /**
     * The column <code>ZDB.L_YARD.ACTIVE</code>. 「active」- 是否启用
     */
    public final TableField<LYardRecord, Boolean> ACTIVE = createField(DSL.name("ACTIVE"), SQLDataType.BIT, this, "「active」- 是否启用");

    /**
     * The column <code>ZDB.L_YARD.SIGMA</code>. 「sigma」- 统一标识
     */
    public final TableField<LYardRecord, String> SIGMA = createField(DSL.name("SIGMA"), SQLDataType.VARCHAR(32), this, "「sigma」- 统一标识");

    /**
     * The column <code>ZDB.L_YARD.LANGUAGE</code>. 「language」- 使用的语言
     */
    public final TableField<LYardRecord, String> LANGUAGE = createField(DSL.name("LANGUAGE"), SQLDataType.VARCHAR(8), this, "「language」- 使用的语言");

    /**
     * The column <code>ZDB.L_YARD.CREATED_AT</code>. 「createdAt」- 创建时间
     */
    public final TableField<LYardRecord, LocalDateTime> CREATED_AT = createField(DSL.name("CREATED_AT"), SQLDataType.LOCALDATETIME(0), this, "「createdAt」- 创建时间");

    /**
     * The column <code>ZDB.L_YARD.CREATED_BY</code>. 「createdBy」- 创建人
     */
    public final TableField<LYardRecord, String> CREATED_BY = createField(DSL.name("CREATED_BY"), SQLDataType.VARCHAR(36), this, "「createdBy」- 创建人");

    /**
     * The column <code>ZDB.L_YARD.UPDATED_AT</code>. 「updatedAt」- 更新时间
     */
    public final TableField<LYardRecord, LocalDateTime> UPDATED_AT = createField(DSL.name("UPDATED_AT"), SQLDataType.LOCALDATETIME(0), this, "「updatedAt」- 更新时间");

    /**
     * The column <code>ZDB.L_YARD.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    public final TableField<LYardRecord, String> UPDATED_BY = createField(DSL.name("UPDATED_BY"), SQLDataType.VARCHAR(36), this, "「updatedBy」- 更新人");

    private LYard(Name alias, Table<LYardRecord> aliased) {
        this(alias, aliased, null);
    }

    private LYard(Name alias, Table<LYardRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>ZDB.L_YARD</code> table reference
     */
    public LYard(String alias) {
        this(DSL.name(alias), L_YARD);
    }

    /**
     * Create an aliased <code>ZDB.L_YARD</code> table reference
     */
    public LYard(Name alias) {
        this(alias, L_YARD);
    }

    /**
     * Create a <code>ZDB.L_YARD</code> table reference
     */
    public LYard() {
        this(DSL.name("L_YARD"), null);
    }

    public <O extends Record> LYard(Table<O> child, ForeignKey<O, LYardRecord> key) {
        super(child, key, L_YARD);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Zdb.ZDB;
    }

    @Override
    public UniqueKey<LYardRecord> getPrimaryKey() {
        return Keys.KEY_L_YARD_PRIMARY;
    }

    @Override
    public List<UniqueKey<LYardRecord>> getUniqueKeys() {
        return Arrays.asList(Keys.KEY_L_YARD_CODE);
    }

    @Override
    public LYard as(String alias) {
        return new LYard(DSL.name(alias), this);
    }

    @Override
    public LYard as(Name alias) {
        return new LYard(alias, this);
    }

    @Override
    public LYard as(Table<?> alias) {
        return new LYard(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public LYard rename(String name) {
        return new LYard(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public LYard rename(Name name) {
        return new LYard(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public LYard rename(Table<?> name) {
        return new LYard(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row13 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row13<String, String, String, String, Integer, String, Boolean, String, String, LocalDateTime, String, LocalDateTime, String> fieldsRow() {
        return (Row13) super.fieldsRow();
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function13<? super String, ? super String, ? super String, ? super String, ? super Integer, ? super String, ? super Boolean, ? super String, ? super String, ? super LocalDateTime, ? super String, ? super LocalDateTime, ? super String, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function13<? super String, ? super String, ? super String, ? super String, ? super Integer, ? super String, ? super Boolean, ? super String, ? super String, ? super LocalDateTime, ? super String, ? super LocalDateTime, ? super String, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}
