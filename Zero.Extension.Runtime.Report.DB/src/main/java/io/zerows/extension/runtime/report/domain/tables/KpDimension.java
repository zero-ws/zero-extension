/*
 * This file is generated by jOOQ.
 */
package io.zerows.extension.runtime.report.domain.tables;


import io.zerows.extension.runtime.report.domain.Keys;
import io.zerows.extension.runtime.report.domain.Zdb;
import io.zerows.extension.runtime.report.domain.tables.records.KpDimensionRecord;

import java.time.LocalDateTime;
import java.util.function.Function;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Function21;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Records;
import org.jooq.Row21;
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
public class KpDimension extends TableImpl<KpDimensionRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>ZDB.KP_DIMENSION</code>
     */
    public static final KpDimension KP_DIMENSION = new KpDimension();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<KpDimensionRecord> getRecordType() {
        return KpDimensionRecord.class;
    }

    /**
     * The column <code>ZDB.KP_DIMENSION.KEY</code>. 「key」- 维度主键
     */
    public final TableField<KpDimensionRecord, String> KEY = createField(DSL.name("KEY"), SQLDataType.VARCHAR(36).nullable(false), this, "「key」- 维度主键");

    /**
     * The column <code>ZDB.KP_DIMENSION.NAME</code>. 「name」- 维度名称
     */
    public final TableField<KpDimensionRecord, String> NAME = createField(DSL.name("NAME"), SQLDataType.VARCHAR(255), this, "「name」- 维度名称");

    /**
     * The column <code>ZDB.KP_DIMENSION.TYPE</code>. 「type」- 维度类型
     */
    public final TableField<KpDimensionRecord, String> TYPE = createField(DSL.name("TYPE"), SQLDataType.VARCHAR(255), this, "「type」- 维度类型");

    /**
     * The column <code>ZDB.KP_DIMENSION.STATUS</code>. 「status」- 维度状态
     */
    public final TableField<KpDimensionRecord, String> STATUS = createField(DSL.name("STATUS"), SQLDataType.VARCHAR(255), this, "「status」- 维度状态");

    /**
     * The column <code>ZDB.KP_DIMENSION.START_AT</code>. 「startAt」- 开始时间
     */
    public final TableField<KpDimensionRecord, LocalDateTime> START_AT = createField(DSL.name("START_AT"), SQLDataType.LOCALDATETIME(0), this, "「startAt」- 开始时间");

    /**
     * The column <code>ZDB.KP_DIMENSION.END_AT</code>. 「endAt」- 结束时间
     */
    public final TableField<KpDimensionRecord, LocalDateTime> END_AT = createField(DSL.name("END_AT"), SQLDataType.LOCALDATETIME(0), this, "「endAt」- 结束时间");

    /**
     * The column <code>ZDB.KP_DIMENSION.DATA_SORT</code>. 「dataSort」- 排序维度处理
     */
    public final TableField<KpDimensionRecord, String> DATA_SORT = createField(DSL.name("DATA_SORT"), SQLDataType.CLOB, this, "「dataSort」- 排序维度处理");

    /**
     * The column <code>ZDB.KP_DIMENSION.DATA_GROUP</code>. 「dataGroup」- 分组维度处理
     */
    public final TableField<KpDimensionRecord, String> DATA_GROUP = createField(DSL.name("DATA_GROUP"), SQLDataType.CLOB, this, "「dataGroup」- 分组维度处理");

    /**
     * The column <code>ZDB.KP_DIMENSION.DATA_OUTPUT</code>. 「dataOutput」-
     * 输出专用配置
     */
    public final TableField<KpDimensionRecord, String> DATA_OUTPUT = createField(DSL.name("DATA_OUTPUT"), SQLDataType.CLOB, this, "「dataOutput」- 输出专用配置");

    /**
     * The column <code>ZDB.KP_DIMENSION.DATA_FIELD</code>. 「dataField」-
     * 当前报表对应字段
     */
    public final TableField<KpDimensionRecord, String> DATA_FIELD = createField(DSL.name("DATA_FIELD"), SQLDataType.CLOB, this, "「dataField」- 当前报表对应字段");

    /**
     * The column <code>ZDB.KP_DIMENSION.CHART_TYPE</code>. 「chartType」- 图表类型
     */
    public final TableField<KpDimensionRecord, String> CHART_TYPE = createField(DSL.name("CHART_TYPE"), SQLDataType.VARCHAR(255), this, "「chartType」- 图表类型");

    /**
     * The column <code>ZDB.KP_DIMENSION.CHART_CONFIG</code>. 「chartConfig」-
     * 若当前报表是图表，则使用此配置
     */
    public final TableField<KpDimensionRecord, String> CHART_CONFIG = createField(DSL.name("CHART_CONFIG"), SQLDataType.CLOB, this, "「chartConfig」- 若当前报表是图表，则使用此配置");

    /**
     * The column <code>ZDB.KP_DIMENSION.REPORT_ID</code>. 「reportId」- 关联报表ID
     */
    public final TableField<KpDimensionRecord, String> REPORT_ID = createField(DSL.name("REPORT_ID"), SQLDataType.VARCHAR(36), this, "「reportId」- 关联报表ID");

    /**
     * The column <code>ZDB.KP_DIMENSION.ACTIVE</code>. 「active」- 是否启用
     */
    public final TableField<KpDimensionRecord, Boolean> ACTIVE = createField(DSL.name("ACTIVE"), SQLDataType.BIT, this, "「active」- 是否启用");

    /**
     * The column <code>ZDB.KP_DIMENSION.SIGMA</code>. 「sigma」- 统一标识
     */
    public final TableField<KpDimensionRecord, String> SIGMA = createField(DSL.name("SIGMA"), SQLDataType.VARCHAR(32), this, "「sigma」- 统一标识");

    /**
     * The column <code>ZDB.KP_DIMENSION.METADATA</code>. 「metadata」- 附加配置
     */
    public final TableField<KpDimensionRecord, String> METADATA = createField(DSL.name("METADATA"), SQLDataType.CLOB, this, "「metadata」- 附加配置");

    /**
     * The column <code>ZDB.KP_DIMENSION.LANGUAGE</code>. 「language」- 使用的语言
     */
    public final TableField<KpDimensionRecord, String> LANGUAGE = createField(DSL.name("LANGUAGE"), SQLDataType.VARCHAR(8), this, "「language」- 使用的语言");

    /**
     * The column <code>ZDB.KP_DIMENSION.CREATED_AT</code>. 「createdAt」- 创建时间
     */
    public final TableField<KpDimensionRecord, LocalDateTime> CREATED_AT = createField(DSL.name("CREATED_AT"), SQLDataType.LOCALDATETIME(0), this, "「createdAt」- 创建时间");

    /**
     * The column <code>ZDB.KP_DIMENSION.CREATED_BY</code>. 「createdBy」- 创建人
     */
    public final TableField<KpDimensionRecord, String> CREATED_BY = createField(DSL.name("CREATED_BY"), SQLDataType.VARCHAR(36), this, "「createdBy」- 创建人");

    /**
     * The column <code>ZDB.KP_DIMENSION.UPDATED_AT</code>. 「updatedAt」- 更新时间
     */
    public final TableField<KpDimensionRecord, LocalDateTime> UPDATED_AT = createField(DSL.name("UPDATED_AT"), SQLDataType.LOCALDATETIME(0), this, "「updatedAt」- 更新时间");

    /**
     * The column <code>ZDB.KP_DIMENSION.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    public final TableField<KpDimensionRecord, String> UPDATED_BY = createField(DSL.name("UPDATED_BY"), SQLDataType.VARCHAR(36), this, "「updatedBy」- 更新人");

    private KpDimension(Name alias, Table<KpDimensionRecord> aliased) {
        this(alias, aliased, null);
    }

    private KpDimension(Name alias, Table<KpDimensionRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>ZDB.KP_DIMENSION</code> table reference
     */
    public KpDimension(String alias) {
        this(DSL.name(alias), KP_DIMENSION);
    }

    /**
     * Create an aliased <code>ZDB.KP_DIMENSION</code> table reference
     */
    public KpDimension(Name alias) {
        this(alias, KP_DIMENSION);
    }

    /**
     * Create a <code>ZDB.KP_DIMENSION</code> table reference
     */
    public KpDimension() {
        this(DSL.name("KP_DIMENSION"), null);
    }

    public <O extends Record> KpDimension(Table<O> child, ForeignKey<O, KpDimensionRecord> key) {
        super(child, key, KP_DIMENSION);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Zdb.ZDB;
    }

    @Override
    public UniqueKey<KpDimensionRecord> getPrimaryKey() {
        return Keys.KEY_KP_DIMENSION_PRIMARY;
    }

    @Override
    public KpDimension as(String alias) {
        return new KpDimension(DSL.name(alias), this);
    }

    @Override
    public KpDimension as(Name alias) {
        return new KpDimension(alias, this);
    }

    @Override
    public KpDimension as(Table<?> alias) {
        return new KpDimension(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public KpDimension rename(String name) {
        return new KpDimension(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public KpDimension rename(Name name) {
        return new KpDimension(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public KpDimension rename(Table<?> name) {
        return new KpDimension(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row21 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row21<String, String, String, String, LocalDateTime, LocalDateTime, String, String, String, String, String, String, String, Boolean, String, String, String, LocalDateTime, String, LocalDateTime, String> fieldsRow() {
        return (Row21) super.fieldsRow();
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function21<? super String, ? super String, ? super String, ? super String, ? super LocalDateTime, ? super LocalDateTime, ? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? super Boolean, ? super String, ? super String, ? super String, ? super LocalDateTime, ? super String, ? super LocalDateTime, ? super String, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function21<? super String, ? super String, ? super String, ? super String, ? super LocalDateTime, ? super LocalDateTime, ? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? super Boolean, ? super String, ? super String, ? super String, ? super LocalDateTime, ? super String, ? super LocalDateTime, ? super String, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}
