/*
 * This file is generated by jOOQ.
 */
package cn.vertxup.atom.domain.tables;


import cn.vertxup.atom.domain.Indexes;
import cn.vertxup.atom.domain.Keys;
import cn.vertxup.atom.domain.Zdb;
import cn.vertxup.atom.domain.tables.records.MKeyRecord;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Function14;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Records;
import org.jooq.Row14;
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
public class MKey extends TableImpl<MKeyRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>ZDB.M_KEY</code>
     */
    public static final MKey M_KEY = new MKey();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<MKeyRecord> getRecordType() {
        return MKeyRecord.class;
    }

    /**
     * The column <code>ZDB.M_KEY.KEY</code>. 「key」- 键ID
     */
    public final TableField<MKeyRecord, String> KEY = createField(DSL.name("KEY"), SQLDataType.VARCHAR(36).nullable(false), this, "「key」- 键ID");

    /**
     * The column <code>ZDB.M_KEY.NAME</code>. 「name」- 键名称
     */
    public final TableField<MKeyRecord, String> NAME = createField(DSL.name("NAME"), SQLDataType.VARCHAR(255), this, "「name」- 键名称");

    /**
     * The column <code>ZDB.M_KEY.TYPE</code>. 「type」- 键类型
     */
    public final TableField<MKeyRecord, String> TYPE = createField(DSL.name("TYPE"), SQLDataType.VARCHAR(20), this, "「type」- 键类型");

    /**
     * The column <code>ZDB.M_KEY.COLUMNS</code>. 「columns」- JsonArray格式，键覆盖的列集合
     */
    public final TableField<MKeyRecord, String> COLUMNS = createField(DSL.name("COLUMNS"), SQLDataType.CLOB, this, "「columns」- JsonArray格式，键覆盖的列集合");

    /**
     * The column <code>ZDB.M_KEY.ENTITY_ID</code>. 「entityId」- 关联的实体ID
     */
    public final TableField<MKeyRecord, String> ENTITY_ID = createField(DSL.name("ENTITY_ID"), SQLDataType.VARCHAR(36), this, "「entityId」- 关联的实体ID");

    /**
     * The column <code>ZDB.M_KEY.COMMENTS</code>. 「comments」- 当前属性的描述信息
     */
    public final TableField<MKeyRecord, String> COMMENTS = createField(DSL.name("COMMENTS"), SQLDataType.CLOB, this, "「comments」- 当前属性的描述信息");

    /**
     * The column <code>ZDB.M_KEY.SIGMA</code>. 「sigma」- 统一标识
     */
    public final TableField<MKeyRecord, String> SIGMA = createField(DSL.name("SIGMA"), SQLDataType.VARCHAR(32), this, "「sigma」- 统一标识");

    /**
     * The column <code>ZDB.M_KEY.LANGUAGE</code>. 「language」- 使用的语言
     */
    public final TableField<MKeyRecord, String> LANGUAGE = createField(DSL.name("LANGUAGE"), SQLDataType.VARCHAR(10), this, "「language」- 使用的语言");

    /**
     * The column <code>ZDB.M_KEY.ACTIVE</code>. 「active」- 是否启用
     */
    public final TableField<MKeyRecord, Boolean> ACTIVE = createField(DSL.name("ACTIVE"), SQLDataType.BIT, this, "「active」- 是否启用");

    /**
     * The column <code>ZDB.M_KEY.METADATA</code>. 「metadata」- 附加配置数据
     */
    public final TableField<MKeyRecord, String> METADATA = createField(DSL.name("METADATA"), SQLDataType.CLOB, this, "「metadata」- 附加配置数据");

    /**
     * The column <code>ZDB.M_KEY.CREATED_AT</code>. 「createdAt」- 创建时间
     */
    public final TableField<MKeyRecord, LocalDateTime> CREATED_AT = createField(DSL.name("CREATED_AT"), SQLDataType.LOCALDATETIME(0), this, "「createdAt」- 创建时间");

    /**
     * The column <code>ZDB.M_KEY.CREATED_BY</code>. 「createdBy」- 创建人
     */
    public final TableField<MKeyRecord, String> CREATED_BY = createField(DSL.name("CREATED_BY"), SQLDataType.VARCHAR(36), this, "「createdBy」- 创建人");

    /**
     * The column <code>ZDB.M_KEY.UPDATED_AT</code>. 「updatedAt」- 更新时间
     */
    public final TableField<MKeyRecord, LocalDateTime> UPDATED_AT = createField(DSL.name("UPDATED_AT"), SQLDataType.LOCALDATETIME(0), this, "「updatedAt」- 更新时间");

    /**
     * The column <code>ZDB.M_KEY.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    public final TableField<MKeyRecord, String> UPDATED_BY = createField(DSL.name("UPDATED_BY"), SQLDataType.VARCHAR(36), this, "「updatedBy」- 更新人");

    private MKey(Name alias, Table<MKeyRecord> aliased) {
        this(alias, aliased, null);
    }

    private MKey(Name alias, Table<MKeyRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>ZDB.M_KEY</code> table reference
     */
    public MKey(String alias) {
        this(DSL.name(alias), M_KEY);
    }

    /**
     * Create an aliased <code>ZDB.M_KEY</code> table reference
     */
    public MKey(Name alias) {
        this(alias, M_KEY);
    }

    /**
     * Create a <code>ZDB.M_KEY</code> table reference
     */
    public MKey() {
        this(DSL.name("M_KEY"), null);
    }

    public <O extends Record> MKey(Table<O> child, ForeignKey<O, MKeyRecord> key) {
        super(child, key, M_KEY);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Zdb.ZDB;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.asList(Indexes.M_KEY_IDX_M_KEY_ENTITY_ID);
    }

    @Override
    public UniqueKey<MKeyRecord> getPrimaryKey() {
        return Keys.KEY_M_KEY_PRIMARY;
    }

    @Override
    public List<UniqueKey<MKeyRecord>> getUniqueKeys() {
        return Arrays.asList(Keys.KEY_M_KEY_NAME);
    }

    @Override
    public MKey as(String alias) {
        return new MKey(DSL.name(alias), this);
    }

    @Override
    public MKey as(Name alias) {
        return new MKey(alias, this);
    }

    @Override
    public MKey as(Table<?> alias) {
        return new MKey(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public MKey rename(String name) {
        return new MKey(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public MKey rename(Name name) {
        return new MKey(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public MKey rename(Table<?> name) {
        return new MKey(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row14 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row14<String, String, String, String, String, String, String, String, Boolean, String, LocalDateTime, String, LocalDateTime, String> fieldsRow() {
        return (Row14) super.fieldsRow();
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function14<? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? super Boolean, ? super String, ? super LocalDateTime, ? super String, ? super LocalDateTime, ? super String, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function14<? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? super Boolean, ? super String, ? super LocalDateTime, ? super String, ? super LocalDateTime, ? super String, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}
