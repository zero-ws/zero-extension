/*
 * This file is generated by jOOQ.
 */
package io.zerows.extension.runtime.report.domain.tables.records;


import io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo;
import io.zerows.extension.runtime.report.domain.tables.KpDimension;
import io.zerows.extension.runtime.report.domain.tables.interfaces.IKpDimension;

import java.time.LocalDateTime;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record22;
import org.jooq.Row22;
import org.jooq.impl.UpdatableRecordImpl;


import static io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo.*;
/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class KpDimensionRecord extends UpdatableRecordImpl<KpDimensionRecord> implements VertxPojo, Record22<String, String, String, String, String, String, String, String, String, String, String, String, String, String, Boolean, String, String, String, LocalDateTime, String, LocalDateTime, String>, IKpDimension {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>ZDB.KP_DIMENSION.KEY</code>. 「key」- 维度主键
     */
    @Override
    public KpDimensionRecord setKey(String value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.KP_DIMENSION.KEY</code>. 「key」- 维度主键
     */
    @Override
    public String getKey() {
        return (String) get(0);
    }

    /**
     * Setter for <code>ZDB.KP_DIMENSION.NAME</code>. 「name」- 维度名称
     */
    @Override
    public KpDimensionRecord setName(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.KP_DIMENSION.NAME</code>. 「name」- 维度名称
     */
    @Override
    public String getName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>ZDB.KP_DIMENSION.CODE</code>. 「code」- 维度代码
     */
    @Override
    public KpDimensionRecord setCode(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.KP_DIMENSION.CODE</code>. 「code」- 维度代码
     */
    @Override
    public String getCode() {
        return (String) get(2);
    }

    /**
     * Setter for <code>ZDB.KP_DIMENSION.TYPE</code>. 「type」- 维度类型
     */
    @Override
    public KpDimensionRecord setType(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.KP_DIMENSION.TYPE</code>. 「type」- 维度类型
     */
    @Override
    public String getType() {
        return (String) get(3);
    }

    /**
     * Setter for <code>ZDB.KP_DIMENSION.STATUS</code>. 「status」- 维度状态
     */
    @Override
    public KpDimensionRecord setStatus(String value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.KP_DIMENSION.STATUS</code>. 「status」- 维度状态
     */
    @Override
    public String getStatus() {
        return (String) get(4);
    }

    /**
     * Setter for <code>ZDB.KP_DIMENSION.DATA_SET_ID</code>. 「dataSetId」- 数据源ID
     */
    @Override
    public KpDimensionRecord setDataSetId(String value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.KP_DIMENSION.DATA_SET_ID</code>. 「dataSetId」- 数据源ID
     */
    @Override
    public String getDataSetId() {
        return (String) get(5);
    }

    /**
     * Setter for <code>ZDB.KP_DIMENSION.DATA_QUERY</code>. 「dataQuery」- 数据查询配置
     */
    @Override
    public KpDimensionRecord setDataQuery(String value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.KP_DIMENSION.DATA_QUERY</code>. 「dataQuery」- 数据查询配置
     */
    @Override
    public String getDataQuery() {
        return (String) get(6);
    }

    /**
     * Setter for <code>ZDB.KP_DIMENSION.DATA_SORT</code>. 「dataSort」- 排序维度处理
     */
    @Override
    public KpDimensionRecord setDataSort(String value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.KP_DIMENSION.DATA_SORT</code>. 「dataSort」- 排序维度处理
     */
    @Override
    public String getDataSort() {
        return (String) get(7);
    }

    /**
     * Setter for <code>ZDB.KP_DIMENSION.DATA_GROUP</code>. 「dataGroup」- 分组维度处理
     */
    @Override
    public KpDimensionRecord setDataGroup(String value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.KP_DIMENSION.DATA_GROUP</code>. 「dataGroup」- 分组维度处理
     */
    @Override
    public String getDataGroup() {
        return (String) get(8);
    }

    /**
     * Setter for <code>ZDB.KP_DIMENSION.DATA_OUTPUT</code>. 「dataOutput」-
     * 输出专用配置
     */
    @Override
    public KpDimensionRecord setDataOutput(String value) {
        set(9, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.KP_DIMENSION.DATA_OUTPUT</code>. 「dataOutput」-
     * 输出专用配置
     */
    @Override
    public String getDataOutput() {
        return (String) get(9);
    }

    /**
     * Setter for <code>ZDB.KP_DIMENSION.DATA_FIELD</code>. 「dataField」-
     * 当前报表对应字段
     */
    @Override
    public KpDimensionRecord setDataField(String value) {
        set(10, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.KP_DIMENSION.DATA_FIELD</code>. 「dataField」-
     * 当前报表对应字段
     */
    @Override
    public String getDataField() {
        return (String) get(10);
    }

    /**
     * Setter for <code>ZDB.KP_DIMENSION.CHART_TYPE</code>. 「chartType」- 图表类型
     */
    @Override
    public KpDimensionRecord setChartType(String value) {
        set(11, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.KP_DIMENSION.CHART_TYPE</code>. 「chartType」- 图表类型
     */
    @Override
    public String getChartType() {
        return (String) get(11);
    }

    /**
     * Setter for <code>ZDB.KP_DIMENSION.CHART_CONFIG</code>. 「chartConfig」-
     * 若当前报表是图表，则使用此配置
     */
    @Override
    public KpDimensionRecord setChartConfig(String value) {
        set(12, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.KP_DIMENSION.CHART_CONFIG</code>. 「chartConfig」-
     * 若当前报表是图表，则使用此配置
     */
    @Override
    public String getChartConfig() {
        return (String) get(12);
    }

    /**
     * Setter for <code>ZDB.KP_DIMENSION.REPORT_ID</code>. 「reportId」- 关联报表ID
     */
    @Override
    public KpDimensionRecord setReportId(String value) {
        set(13, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.KP_DIMENSION.REPORT_ID</code>. 「reportId」- 关联报表ID
     */
    @Override
    public String getReportId() {
        return (String) get(13);
    }

    /**
     * Setter for <code>ZDB.KP_DIMENSION.ACTIVE</code>. 「active」- 是否启用
     */
    @Override
    public KpDimensionRecord setActive(Boolean value) {
        set(14, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.KP_DIMENSION.ACTIVE</code>. 「active」- 是否启用
     */
    @Override
    public Boolean getActive() {
        return (Boolean) get(14);
    }

    /**
     * Setter for <code>ZDB.KP_DIMENSION.SIGMA</code>. 「sigma」- 统一标识
     */
    @Override
    public KpDimensionRecord setSigma(String value) {
        set(15, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.KP_DIMENSION.SIGMA</code>. 「sigma」- 统一标识
     */
    @Override
    public String getSigma() {
        return (String) get(15);
    }

    /**
     * Setter for <code>ZDB.KP_DIMENSION.METADATA</code>. 「metadata」- 附加配置
     */
    @Override
    public KpDimensionRecord setMetadata(String value) {
        set(16, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.KP_DIMENSION.METADATA</code>. 「metadata」- 附加配置
     */
    @Override
    public String getMetadata() {
        return (String) get(16);
    }

    /**
     * Setter for <code>ZDB.KP_DIMENSION.LANGUAGE</code>. 「language」- 使用的语言
     */
    @Override
    public KpDimensionRecord setLanguage(String value) {
        set(17, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.KP_DIMENSION.LANGUAGE</code>. 「language」- 使用的语言
     */
    @Override
    public String getLanguage() {
        return (String) get(17);
    }

    /**
     * Setter for <code>ZDB.KP_DIMENSION.CREATED_AT</code>. 「createdAt」- 创建时间
     */
    @Override
    public KpDimensionRecord setCreatedAt(LocalDateTime value) {
        set(18, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.KP_DIMENSION.CREATED_AT</code>. 「createdAt」- 创建时间
     */
    @Override
    public LocalDateTime getCreatedAt() {
        return (LocalDateTime) get(18);
    }

    /**
     * Setter for <code>ZDB.KP_DIMENSION.CREATED_BY</code>. 「createdBy」- 创建人
     */
    @Override
    public KpDimensionRecord setCreatedBy(String value) {
        set(19, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.KP_DIMENSION.CREATED_BY</code>. 「createdBy」- 创建人
     */
    @Override
    public String getCreatedBy() {
        return (String) get(19);
    }

    /**
     * Setter for <code>ZDB.KP_DIMENSION.UPDATED_AT</code>. 「updatedAt」- 更新时间
     */
    @Override
    public KpDimensionRecord setUpdatedAt(LocalDateTime value) {
        set(20, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.KP_DIMENSION.UPDATED_AT</code>. 「updatedAt」- 更新时间
     */
    @Override
    public LocalDateTime getUpdatedAt() {
        return (LocalDateTime) get(20);
    }

    /**
     * Setter for <code>ZDB.KP_DIMENSION.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    @Override
    public KpDimensionRecord setUpdatedBy(String value) {
        set(21, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.KP_DIMENSION.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    @Override
    public String getUpdatedBy() {
        return (String) get(21);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<String> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record22 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row22<String, String, String, String, String, String, String, String, String, String, String, String, String, String, Boolean, String, String, String, LocalDateTime, String, LocalDateTime, String> fieldsRow() {
        return (Row22) super.fieldsRow();
    }

    @Override
    public Row22<String, String, String, String, String, String, String, String, String, String, String, String, String, String, Boolean, String, String, String, LocalDateTime, String, LocalDateTime, String> valuesRow() {
        return (Row22) super.valuesRow();
    }

    @Override
    public Field<String> field1() {
        return KpDimension.KP_DIMENSION.KEY;
    }

    @Override
    public Field<String> field2() {
        return KpDimension.KP_DIMENSION.NAME;
    }

    @Override
    public Field<String> field3() {
        return KpDimension.KP_DIMENSION.CODE;
    }

    @Override
    public Field<String> field4() {
        return KpDimension.KP_DIMENSION.TYPE;
    }

    @Override
    public Field<String> field5() {
        return KpDimension.KP_DIMENSION.STATUS;
    }

    @Override
    public Field<String> field6() {
        return KpDimension.KP_DIMENSION.DATA_SET_ID;
    }

    @Override
    public Field<String> field7() {
        return KpDimension.KP_DIMENSION.DATA_QUERY;
    }

    @Override
    public Field<String> field8() {
        return KpDimension.KP_DIMENSION.DATA_SORT;
    }

    @Override
    public Field<String> field9() {
        return KpDimension.KP_DIMENSION.DATA_GROUP;
    }

    @Override
    public Field<String> field10() {
        return KpDimension.KP_DIMENSION.DATA_OUTPUT;
    }

    @Override
    public Field<String> field11() {
        return KpDimension.KP_DIMENSION.DATA_FIELD;
    }

    @Override
    public Field<String> field12() {
        return KpDimension.KP_DIMENSION.CHART_TYPE;
    }

    @Override
    public Field<String> field13() {
        return KpDimension.KP_DIMENSION.CHART_CONFIG;
    }

    @Override
    public Field<String> field14() {
        return KpDimension.KP_DIMENSION.REPORT_ID;
    }

    @Override
    public Field<Boolean> field15() {
        return KpDimension.KP_DIMENSION.ACTIVE;
    }

    @Override
    public Field<String> field16() {
        return KpDimension.KP_DIMENSION.SIGMA;
    }

    @Override
    public Field<String> field17() {
        return KpDimension.KP_DIMENSION.METADATA;
    }

    @Override
    public Field<String> field18() {
        return KpDimension.KP_DIMENSION.LANGUAGE;
    }

    @Override
    public Field<LocalDateTime> field19() {
        return KpDimension.KP_DIMENSION.CREATED_AT;
    }

    @Override
    public Field<String> field20() {
        return KpDimension.KP_DIMENSION.CREATED_BY;
    }

    @Override
    public Field<LocalDateTime> field21() {
        return KpDimension.KP_DIMENSION.UPDATED_AT;
    }

    @Override
    public Field<String> field22() {
        return KpDimension.KP_DIMENSION.UPDATED_BY;
    }

    @Override
    public String component1() {
        return getKey();
    }

    @Override
    public String component2() {
        return getName();
    }

    @Override
    public String component3() {
        return getCode();
    }

    @Override
    public String component4() {
        return getType();
    }

    @Override
    public String component5() {
        return getStatus();
    }

    @Override
    public String component6() {
        return getDataSetId();
    }

    @Override
    public String component7() {
        return getDataQuery();
    }

    @Override
    public String component8() {
        return getDataSort();
    }

    @Override
    public String component9() {
        return getDataGroup();
    }

    @Override
    public String component10() {
        return getDataOutput();
    }

    @Override
    public String component11() {
        return getDataField();
    }

    @Override
    public String component12() {
        return getChartType();
    }

    @Override
    public String component13() {
        return getChartConfig();
    }

    @Override
    public String component14() {
        return getReportId();
    }

    @Override
    public Boolean component15() {
        return getActive();
    }

    @Override
    public String component16() {
        return getSigma();
    }

    @Override
    public String component17() {
        return getMetadata();
    }

    @Override
    public String component18() {
        return getLanguage();
    }

    @Override
    public LocalDateTime component19() {
        return getCreatedAt();
    }

    @Override
    public String component20() {
        return getCreatedBy();
    }

    @Override
    public LocalDateTime component21() {
        return getUpdatedAt();
    }

    @Override
    public String component22() {
        return getUpdatedBy();
    }

    @Override
    public String value1() {
        return getKey();
    }

    @Override
    public String value2() {
        return getName();
    }

    @Override
    public String value3() {
        return getCode();
    }

    @Override
    public String value4() {
        return getType();
    }

    @Override
    public String value5() {
        return getStatus();
    }

    @Override
    public String value6() {
        return getDataSetId();
    }

    @Override
    public String value7() {
        return getDataQuery();
    }

    @Override
    public String value8() {
        return getDataSort();
    }

    @Override
    public String value9() {
        return getDataGroup();
    }

    @Override
    public String value10() {
        return getDataOutput();
    }

    @Override
    public String value11() {
        return getDataField();
    }

    @Override
    public String value12() {
        return getChartType();
    }

    @Override
    public String value13() {
        return getChartConfig();
    }

    @Override
    public String value14() {
        return getReportId();
    }

    @Override
    public Boolean value15() {
        return getActive();
    }

    @Override
    public String value16() {
        return getSigma();
    }

    @Override
    public String value17() {
        return getMetadata();
    }

    @Override
    public String value18() {
        return getLanguage();
    }

    @Override
    public LocalDateTime value19() {
        return getCreatedAt();
    }

    @Override
    public String value20() {
        return getCreatedBy();
    }

    @Override
    public LocalDateTime value21() {
        return getUpdatedAt();
    }

    @Override
    public String value22() {
        return getUpdatedBy();
    }

    @Override
    public KpDimensionRecord value1(String value) {
        setKey(value);
        return this;
    }

    @Override
    public KpDimensionRecord value2(String value) {
        setName(value);
        return this;
    }

    @Override
    public KpDimensionRecord value3(String value) {
        setCode(value);
        return this;
    }

    @Override
    public KpDimensionRecord value4(String value) {
        setType(value);
        return this;
    }

    @Override
    public KpDimensionRecord value5(String value) {
        setStatus(value);
        return this;
    }

    @Override
    public KpDimensionRecord value6(String value) {
        setDataSetId(value);
        return this;
    }

    @Override
    public KpDimensionRecord value7(String value) {
        setDataQuery(value);
        return this;
    }

    @Override
    public KpDimensionRecord value8(String value) {
        setDataSort(value);
        return this;
    }

    @Override
    public KpDimensionRecord value9(String value) {
        setDataGroup(value);
        return this;
    }

    @Override
    public KpDimensionRecord value10(String value) {
        setDataOutput(value);
        return this;
    }

    @Override
    public KpDimensionRecord value11(String value) {
        setDataField(value);
        return this;
    }

    @Override
    public KpDimensionRecord value12(String value) {
        setChartType(value);
        return this;
    }

    @Override
    public KpDimensionRecord value13(String value) {
        setChartConfig(value);
        return this;
    }

    @Override
    public KpDimensionRecord value14(String value) {
        setReportId(value);
        return this;
    }

    @Override
    public KpDimensionRecord value15(Boolean value) {
        setActive(value);
        return this;
    }

    @Override
    public KpDimensionRecord value16(String value) {
        setSigma(value);
        return this;
    }

    @Override
    public KpDimensionRecord value17(String value) {
        setMetadata(value);
        return this;
    }

    @Override
    public KpDimensionRecord value18(String value) {
        setLanguage(value);
        return this;
    }

    @Override
    public KpDimensionRecord value19(LocalDateTime value) {
        setCreatedAt(value);
        return this;
    }

    @Override
    public KpDimensionRecord value20(String value) {
        setCreatedBy(value);
        return this;
    }

    @Override
    public KpDimensionRecord value21(LocalDateTime value) {
        setUpdatedAt(value);
        return this;
    }

    @Override
    public KpDimensionRecord value22(String value) {
        setUpdatedBy(value);
        return this;
    }

    @Override
    public KpDimensionRecord values(String value1, String value2, String value3, String value4, String value5, String value6, String value7, String value8, String value9, String value10, String value11, String value12, String value13, String value14, Boolean value15, String value16, String value17, String value18, LocalDateTime value19, String value20, LocalDateTime value21, String value22) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        value11(value11);
        value12(value12);
        value13(value13);
        value14(value14);
        value15(value15);
        value16(value16);
        value17(value17);
        value18(value18);
        value19(value19);
        value20(value20);
        value21(value21);
        value22(value22);
        return this;
    }

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    @Override
    public void from(IKpDimension from) {
        setKey(from.getKey());
        setName(from.getName());
        setCode(from.getCode());
        setType(from.getType());
        setStatus(from.getStatus());
        setDataSetId(from.getDataSetId());
        setDataQuery(from.getDataQuery());
        setDataSort(from.getDataSort());
        setDataGroup(from.getDataGroup());
        setDataOutput(from.getDataOutput());
        setDataField(from.getDataField());
        setChartType(from.getChartType());
        setChartConfig(from.getChartConfig());
        setReportId(from.getReportId());
        setActive(from.getActive());
        setSigma(from.getSigma());
        setMetadata(from.getMetadata());
        setLanguage(from.getLanguage());
        setCreatedAt(from.getCreatedAt());
        setCreatedBy(from.getCreatedBy());
        setUpdatedAt(from.getUpdatedAt());
        setUpdatedBy(from.getUpdatedBy());
        resetChangedOnNotNull();
    }

    @Override
    public <E extends IKpDimension> E into(E into) {
        into.from(this);
        return into;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached KpDimensionRecord
     */
    public KpDimensionRecord() {
        super(KpDimension.KP_DIMENSION);
    }

    /**
     * Create a detached, initialised KpDimensionRecord
     */
    public KpDimensionRecord(String key, String name, String code, String type, String status, String dataSetId, String dataQuery, String dataSort, String dataGroup, String dataOutput, String dataField, String chartType, String chartConfig, String reportId, Boolean active, String sigma, String metadata, String language, LocalDateTime createdAt, String createdBy, LocalDateTime updatedAt, String updatedBy) {
        super(KpDimension.KP_DIMENSION);

        setKey(key);
        setName(name);
        setCode(code);
        setType(type);
        setStatus(status);
        setDataSetId(dataSetId);
        setDataQuery(dataQuery);
        setDataSort(dataSort);
        setDataGroup(dataGroup);
        setDataOutput(dataOutput);
        setDataField(dataField);
        setChartType(chartType);
        setChartConfig(chartConfig);
        setReportId(reportId);
        setActive(active);
        setSigma(sigma);
        setMetadata(metadata);
        setLanguage(language);
        setCreatedAt(createdAt);
        setCreatedBy(createdBy);
        setUpdatedAt(updatedAt);
        setUpdatedBy(updatedBy);
        resetChangedOnNotNull();
    }

    /**
     * Create a detached, initialised KpDimensionRecord
     */
    public KpDimensionRecord(io.zerows.extension.runtime.report.domain.tables.pojos.KpDimension value) {
        super(KpDimension.KP_DIMENSION);

        if (value != null) {
            setKey(value.getKey());
            setName(value.getName());
            setCode(value.getCode());
            setType(value.getType());
            setStatus(value.getStatus());
            setDataSetId(value.getDataSetId());
            setDataQuery(value.getDataQuery());
            setDataSort(value.getDataSort());
            setDataGroup(value.getDataGroup());
            setDataOutput(value.getDataOutput());
            setDataField(value.getDataField());
            setChartType(value.getChartType());
            setChartConfig(value.getChartConfig());
            setReportId(value.getReportId());
            setActive(value.getActive());
            setSigma(value.getSigma());
            setMetadata(value.getMetadata());
            setLanguage(value.getLanguage());
            setCreatedAt(value.getCreatedAt());
            setCreatedBy(value.getCreatedBy());
            setUpdatedAt(value.getUpdatedAt());
            setUpdatedBy(value.getUpdatedBy());
            resetChangedOnNotNull();
        }
    }

        public KpDimensionRecord(io.vertx.core.json.JsonObject json) {
                this();
                fromJson(json);
        }
}
