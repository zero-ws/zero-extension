/*
 * This file is generated by jOOQ.
 */
package io.zerows.extension.mbse.basement.domain.tables;


import io.zerows.extension.mbse.basement.domain.Keys;
import io.zerows.extension.mbse.basement.domain.Zdb;
import io.zerows.extension.mbse.basement.domain.tables.records.MAccRecord;
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
public class MAcc extends TableImpl<MAccRecord> {

    /**
     * The reference instance of <code>ZDB.M_ACC</code>
     */
    public static final MAcc M_ACC = new MAcc();
    private static final long serialVersionUID = 1L;
    /**
     * The column <code>ZDB.M_ACC.KEY</code>. 「key」- 增量记录ID
     */
    public final TableField<MAccRecord, String> KEY = createField(DSL.name("KEY"), SQLDataType.VARCHAR(36).nullable(false), this, "「key」- 增量记录ID");
    /**
     * The column <code>ZDB.M_ACC.MODEL_ID</code>. 「modelId」-
     * 关联的模型identifier，用于描述
     */
    public final TableField<MAccRecord, String> MODEL_ID = createField(DSL.name("MODEL_ID"), SQLDataType.VARCHAR(255), this, "「modelId」- 关联的模型identifier，用于描述");
    /**
     * The column <code>ZDB.M_ACC.MODEL_KEY</code>. 「modelKey」-
     * 关联的模型记录ID，用于描述哪一个Model中的记录
     */
    public final TableField<MAccRecord, String> MODEL_KEY = createField(DSL.name("MODEL_KEY"), SQLDataType.VARCHAR(36), this, "「modelKey」- 关联的模型记录ID，用于描述哪一个Model中的记录");
    /**
     * The column <code>ZDB.M_ACC.RECORD_JSON</code>. 「recordJson」-
     * 上一次的记录内容（Json格式）
     */
    public final TableField<MAccRecord, String> RECORD_JSON = createField(DSL.name("RECORD_JSON"), SQLDataType.CLOB, this, "「recordJson」- 上一次的记录内容（Json格式）");
    /**
     * The column <code>ZDB.M_ACC.RECORD_RAW</code>. 「recordRaw」- 上一次的记录的原始内容
     */
    public final TableField<MAccRecord, String> RECORD_RAW = createField(DSL.name("RECORD_RAW"), SQLDataType.CLOB, this, "「recordRaw」- 上一次的记录的原始内容");
    /**
     * The column <code>ZDB.M_ACC.RECORD_UNIQUE</code>. 「recordUnique」-
     * 业务标识规则专用Key，可计算获取
     */
    public final TableField<MAccRecord, String> RECORD_UNIQUE = createField(DSL.name("RECORD_UNIQUE"), SQLDataType.VARCHAR(255), this, "「recordUnique」- 业务标识规则专用Key，可计算获取");
    /**
     * The column <code>ZDB.M_ACC.SIGMA</code>. 「sigma」- 统一标识
     */
    public final TableField<MAccRecord, String> SIGMA = createField(DSL.name("SIGMA"), SQLDataType.VARCHAR(32), this, "「sigma」- 统一标识");
    /**
     * The column <code>ZDB.M_ACC.LANGUAGE</code>. 「language」- 使用的语言
     */
    public final TableField<MAccRecord, String> LANGUAGE = createField(DSL.name("LANGUAGE"), SQLDataType.VARCHAR(10), this, "「language」- 使用的语言");
    /**
     * The column <code>ZDB.M_ACC.ACTIVE</code>. 「active」- 是否启用
     */
    public final TableField<MAccRecord, Boolean> ACTIVE = createField(DSL.name("ACTIVE"), SQLDataType.BIT, this, "「active」- 是否启用");
    /**
     * The column <code>ZDB.M_ACC.METADATA</code>. 「metadata」- 附加配置数据
     */
    public final TableField<MAccRecord, String> METADATA = createField(DSL.name("METADATA"), SQLDataType.CLOB, this, "「metadata」- 附加配置数据");
    /**
     * The column <code>ZDB.M_ACC.CREATED_AT</code>. 「createdAt」- 创建时间
     */
    public final TableField<MAccRecord, LocalDateTime> CREATED_AT = createField(DSL.name("CREATED_AT"), SQLDataType.LOCALDATETIME(0), this, "「createdAt」- 创建时间");
    /**
     * The column <code>ZDB.M_ACC.CREATED_BY</code>. 「createdBy」- 创建人
     */
    public final TableField<MAccRecord, String> CREATED_BY = createField(DSL.name("CREATED_BY"), SQLDataType.VARCHAR(36), this, "「createdBy」- 创建人");
    /**
     * The column <code>ZDB.M_ACC.UPDATED_AT</code>. 「updatedAt」- 更新时间
     */
    public final TableField<MAccRecord, LocalDateTime> UPDATED_AT = createField(DSL.name("UPDATED_AT"), SQLDataType.LOCALDATETIME(0), this, "「updatedAt」- 更新时间");
    /**
     * The column <code>ZDB.M_ACC.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    public final TableField<MAccRecord, String> UPDATED_BY = createField(DSL.name("UPDATED_BY"), SQLDataType.VARCHAR(36), this, "「updatedBy」- 更新人");

    private MAcc(Name alias, Table<MAccRecord> aliased) {
        this(alias, aliased, null);
    }

    private MAcc(Name alias, Table<MAccRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>ZDB.M_ACC</code> table reference
     */
    public MAcc(String alias) {
        this(DSL.name(alias), M_ACC);
    }

    /**
     * Create an aliased <code>ZDB.M_ACC</code> table reference
     */
    public MAcc(Name alias) {
        this(alias, M_ACC);
    }

    /**
     * Create a <code>ZDB.M_ACC</code> table reference
     */
    public MAcc() {
        this(DSL.name("M_ACC"), null);
    }

    public <O extends Record> MAcc(Table<O> child, ForeignKey<O, MAccRecord> key) {
        super(child, key, M_ACC);
    }

    /**
     * The class holding records for this type
     */
    @Override
    public Class<MAccRecord> getRecordType() {
        return MAccRecord.class;
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Zdb.ZDB;
    }

    @Override
    public UniqueKey<MAccRecord> getPrimaryKey() {
        return Keys.KEY_M_ACC_PRIMARY;
    }

    @Override
    public List<UniqueKey<MAccRecord>> getUniqueKeys() {
        return Arrays.asList(Keys.KEY_M_ACC_SIGMA);
    }

    @Override
    public MAcc as(String alias) {
        return new MAcc(DSL.name(alias), this);
    }

    @Override
    public MAcc as(Name alias) {
        return new MAcc(alias, this);
    }

    @Override
    public MAcc as(Table<?> alias) {
        return new MAcc(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public MAcc rename(String name) {
        return new MAcc(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public MAcc rename(Name name) {
        return new MAcc(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public MAcc rename(Table<?> name) {
        return new MAcc(name.getQualifiedName(), null);
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
