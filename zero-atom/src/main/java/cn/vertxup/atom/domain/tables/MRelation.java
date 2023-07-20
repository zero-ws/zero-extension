/*
 * This file is generated by jOOQ.
 */
package cn.vertxup.atom.domain.tables;


import cn.vertxup.atom.domain.Indexes;
import cn.vertxup.atom.domain.Keys;
import cn.vertxup.atom.domain.Zdb;
import cn.vertxup.atom.domain.tables.records.MRelationRecord;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Function13;
import org.jooq.Index;
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
public class MRelation extends TableImpl<MRelationRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>ZDB.M_RELATION</code>
     */
    public static final MRelation M_RELATION = new MRelation();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<MRelationRecord> getRecordType() {
        return MRelationRecord.class;
    }

    /**
     * The column <code>ZDB.M_RELATION.KEY</code>. 「key」- 关系定义的主键
     */
    public final TableField<MRelationRecord, String> KEY = createField(DSL.name("KEY"), SQLDataType.VARCHAR(36).nullable(false), this, "「key」- 关系定义的主键");

    /**
     * The column <code>ZDB.M_RELATION.TYPE</code>. 「type」- 关系类型 - 来自（字典）
     */
    public final TableField<MRelationRecord, String> TYPE = createField(DSL.name("TYPE"), SQLDataType.VARCHAR(36), this, "「type」- 关系类型 - 来自（字典）");

    /**
     * The column <code>ZDB.M_RELATION.UPSTREAM</code>. 「upstream」- 当前关系是
     * upstream，表示上级
     */
    public final TableField<MRelationRecord, String> UPSTREAM = createField(DSL.name("UPSTREAM"), SQLDataType.VARCHAR(255), this, "「upstream」- 当前关系是 upstream，表示上级");

    /**
     * The column <code>ZDB.M_RELATION.DOWNSTREAM</code>. 「downstream」- 当前关系是
     * downstream，表示下级
     */
    public final TableField<MRelationRecord, String> DOWNSTREAM = createField(DSL.name("DOWNSTREAM"), SQLDataType.VARCHAR(255), this, "「downstream」- 当前关系是 downstream，表示下级");

    /**
     * The column <code>ZDB.M_RELATION.COMMENTS</code>. 「comments」- 关系定义的描述信息
     */
    public final TableField<MRelationRecord, String> COMMENTS = createField(DSL.name("COMMENTS"), SQLDataType.CLOB, this, "「comments」- 关系定义的描述信息");

    /**
     * The column <code>ZDB.M_RELATION.SIGMA</code>. 「sigma」- 统一标识
     */
    public final TableField<MRelationRecord, String> SIGMA = createField(DSL.name("SIGMA"), SQLDataType.VARCHAR(32), this, "「sigma」- 统一标识");

    /**
     * The column <code>ZDB.M_RELATION.LANGUAGE</code>. 「language」- 使用的语言
     */
    public final TableField<MRelationRecord, String> LANGUAGE = createField(DSL.name("LANGUAGE"), SQLDataType.VARCHAR(10), this, "「language」- 使用的语言");

    /**
     * The column <code>ZDB.M_RELATION.ACTIVE</code>. 「active」- 是否启用
     */
    public final TableField<MRelationRecord, Boolean> ACTIVE = createField(DSL.name("ACTIVE"), SQLDataType.BIT, this, "「active」- 是否启用");

    /**
     * The column <code>ZDB.M_RELATION.METADATA</code>. 「metadata」- 附加配置数据
     */
    public final TableField<MRelationRecord, String> METADATA = createField(DSL.name("METADATA"), SQLDataType.CLOB, this, "「metadata」- 附加配置数据");

    /**
     * The column <code>ZDB.M_RELATION.CREATED_AT</code>. 「createdAt」- 创建时间
     */
    public final TableField<MRelationRecord, LocalDateTime> CREATED_AT = createField(DSL.name("CREATED_AT"), SQLDataType.LOCALDATETIME(0), this, "「createdAt」- 创建时间");

    /**
     * The column <code>ZDB.M_RELATION.CREATED_BY</code>. 「createdBy」- 创建人
     */
    public final TableField<MRelationRecord, String> CREATED_BY = createField(DSL.name("CREATED_BY"), SQLDataType.VARCHAR(36), this, "「createdBy」- 创建人");

    /**
     * The column <code>ZDB.M_RELATION.UPDATED_AT</code>. 「updatedAt」- 更新时间
     */
    public final TableField<MRelationRecord, LocalDateTime> UPDATED_AT = createField(DSL.name("UPDATED_AT"), SQLDataType.LOCALDATETIME(0), this, "「updatedAt」- 更新时间");

    /**
     * The column <code>ZDB.M_RELATION.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    public final TableField<MRelationRecord, String> UPDATED_BY = createField(DSL.name("UPDATED_BY"), SQLDataType.VARCHAR(36), this, "「updatedBy」- 更新人");

    private MRelation(Name alias, Table<MRelationRecord> aliased) {
        this(alias, aliased, null);
    }

    private MRelation(Name alias, Table<MRelationRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>ZDB.M_RELATION</code> table reference
     */
    public MRelation(String alias) {
        this(DSL.name(alias), M_RELATION);
    }

    /**
     * Create an aliased <code>ZDB.M_RELATION</code> table reference
     */
    public MRelation(Name alias) {
        this(alias, M_RELATION);
    }

    /**
     * Create a <code>ZDB.M_RELATION</code> table reference
     */
    public MRelation() {
        this(DSL.name("M_RELATION"), null);
    }

    public <O extends Record> MRelation(Table<O> child, ForeignKey<O, MRelationRecord> key) {
        super(child, key, M_RELATION);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Zdb.ZDB;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.asList(Indexes.M_RELATION_UPSTREAM);
    }

    @Override
    public UniqueKey<MRelationRecord> getPrimaryKey() {
        return Keys.KEY_M_RELATION_PRIMARY;
    }

    @Override
    public List<UniqueKey<MRelationRecord>> getUniqueKeys() {
        return Arrays.asList(Keys.KEY_M_RELATION_TYPE);
    }

    @Override
    public MRelation as(String alias) {
        return new MRelation(DSL.name(alias), this);
    }

    @Override
    public MRelation as(Name alias) {
        return new MRelation(alias, this);
    }

    @Override
    public MRelation as(Table<?> alias) {
        return new MRelation(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public MRelation rename(String name) {
        return new MRelation(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public MRelation rename(Name name) {
        return new MRelation(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public MRelation rename(Table<?> name) {
        return new MRelation(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row13 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row13<String, String, String, String, String, String, String, Boolean, String, LocalDateTime, String, LocalDateTime, String> fieldsRow() {
        return (Row13) super.fieldsRow();
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function13<? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? super Boolean, ? super String, ? super LocalDateTime, ? super String, ? super LocalDateTime, ? super String, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function13<? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? super Boolean, ? super String, ? super LocalDateTime, ? super String, ? super LocalDateTime, ? super String, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}
