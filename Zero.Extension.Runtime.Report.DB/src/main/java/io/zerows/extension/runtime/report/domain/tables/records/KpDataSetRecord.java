/*
 * This file is generated by jOOQ.
 */
package io.zerows.extension.runtime.report.domain.tables.records;


import io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo;
import io.zerows.extension.runtime.report.domain.tables.KpDataSet;
import io.zerows.extension.runtime.report.domain.tables.interfaces.IKpDataSet;

import java.time.LocalDateTime;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record21;
import org.jooq.Row21;
import org.jooq.impl.UpdatableRecordImpl;


import static io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo.*;
/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class KpDataSetRecord extends UpdatableRecordImpl<KpDataSetRecord> implements VertxPojo, Record21<String, String, String, String, String, String, String, String, String, String, String, String, String, Boolean, String, String, String, LocalDateTime, String, LocalDateTime, String>, IKpDataSet {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>ZDB.KP_DATA_SET.KEY</code>. 「key」- 数据源主键
     */
    @Override
    public KpDataSetRecord setKey(String value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.KP_DATA_SET.KEY</code>. 「key」- 数据源主键
     */
    @Override
    public String getKey() {
        return (String) get(0);
    }

    /**
     * Setter for <code>ZDB.KP_DATA_SET.NAME</code>. 「name」- 数据源名称
     */
    @Override
    public KpDataSetRecord setName(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.KP_DATA_SET.NAME</code>. 「name」- 数据源名称
     */
    @Override
    public String getName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>ZDB.KP_DATA_SET.CODE</code>. 「code」- 数据源编码
     */
    @Override
    public KpDataSetRecord setCode(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.KP_DATA_SET.CODE</code>. 「code」- 数据源编码
     */
    @Override
    public String getCode() {
        return (String) get(2);
    }

    /**
     * Setter for <code>ZDB.KP_DATA_SET.DATA_QUERY</code>. 「dataQuery」- 数据查询配置
     */
    @Override
    public KpDataSetRecord setDataQuery(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.KP_DATA_SET.DATA_QUERY</code>. 「dataQuery」- 数据查询配置
     */
    @Override
    public String getDataQuery() {
        return (String) get(3);
    }

    /**
     * Setter for <code>ZDB.KP_DATA_SET.DATA_SOURCE</code>. 「dataSource」-
     * 基于什么内容做报表
     */
    @Override
    public KpDataSetRecord setDataSource(String value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.KP_DATA_SET.DATA_SOURCE</code>. 「dataSource」-
     * 基于什么内容做报表
     */
    @Override
    public String getDataSource() {
        return (String) get(4);
    }

    /**
     * Setter for <code>ZDB.KP_DATA_SET.DATA_CONFIG</code>. 「dataConfig」-
     * 数据查询过程中的配置
     */
    @Override
    public KpDataSetRecord setDataConfig(String value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.KP_DATA_SET.DATA_CONFIG</code>. 「dataConfig」-
     * 数据查询过程中的配置
     */
    @Override
    public String getDataConfig() {
        return (String) get(5);
    }

    /**
     * Setter for <code>ZDB.KP_DATA_SET.DATA_FIELD</code>. 「dataField」- 数据字段
     */
    @Override
    public KpDataSetRecord setDataField(String value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.KP_DATA_SET.DATA_FIELD</code>. 「dataField」- 数据字段
     */
    @Override
    public String getDataField() {
        return (String) get(6);
    }

    /**
     * Setter for <code>ZDB.KP_DATA_SET.DATA_COMPONENT</code>. 「dataComponent」-
     * 数据查询组件
     */
    @Override
    public KpDataSetRecord setDataComponent(String value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.KP_DATA_SET.DATA_COMPONENT</code>. 「dataComponent」-
     * 数据查询组件
     */
    @Override
    public String getDataComponent() {
        return (String) get(7);
    }

    /**
     * Setter for <code>ZDB.KP_DATA_SET.TYPE</code>. 「type」- 数据源类型
     */
    @Override
    public KpDataSetRecord setType(String value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.KP_DATA_SET.TYPE</code>. 「type」- 数据源类型
     */
    @Override
    public String getType() {
        return (String) get(8);
    }

    /**
     * Setter for <code>ZDB.KP_DATA_SET.STATUS</code>. 「status」- 数据源状态
     */
    @Override
    public KpDataSetRecord setStatus(String value) {
        set(9, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.KP_DATA_SET.STATUS</code>. 「status」- 数据源状态
     */
    @Override
    public String getStatus() {
        return (String) get(9);
    }

    /**
     * Setter for <code>ZDB.KP_DATA_SET.SOURCE_ID</code>. 「sourceId」- 额外数据源
     */
    @Override
    public KpDataSetRecord setSourceId(String value) {
        set(10, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.KP_DATA_SET.SOURCE_ID</code>. 「sourceId」- 额外数据源
     */
    @Override
    public String getSourceId() {
        return (String) get(10);
    }

    /**
     * Setter for <code>ZDB.KP_DATA_SET.SOURCE_CONFIG</code>. 「sourceConfig」-
     * 数据源相关配置
     */
    @Override
    public KpDataSetRecord setSourceConfig(String value) {
        set(11, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.KP_DATA_SET.SOURCE_CONFIG</code>. 「sourceConfig」-
     * 数据源相关配置
     */
    @Override
    public String getSourceConfig() {
        return (String) get(11);
    }

    /**
     * Setter for <code>ZDB.KP_DATA_SET.APP_ID</code>. 「appId」- 应用数据
     */
    @Override
    public KpDataSetRecord setAppId(String value) {
        set(12, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.KP_DATA_SET.APP_ID</code>. 「appId」- 应用数据
     */
    @Override
    public String getAppId() {
        return (String) get(12);
    }

    /**
     * Setter for <code>ZDB.KP_DATA_SET.ACTIVE</code>. 「active」- 是否启用
     */
    @Override
    public KpDataSetRecord setActive(Boolean value) {
        set(13, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.KP_DATA_SET.ACTIVE</code>. 「active」- 是否启用
     */
    @Override
    public Boolean getActive() {
        return (Boolean) get(13);
    }

    /**
     * Setter for <code>ZDB.KP_DATA_SET.SIGMA</code>. 「sigma」- 统一标识
     */
    @Override
    public KpDataSetRecord setSigma(String value) {
        set(14, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.KP_DATA_SET.SIGMA</code>. 「sigma」- 统一标识
     */
    @Override
    public String getSigma() {
        return (String) get(14);
    }

    /**
     * Setter for <code>ZDB.KP_DATA_SET.METADATA</code>. 「metadata」- 附加配置
     */
    @Override
    public KpDataSetRecord setMetadata(String value) {
        set(15, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.KP_DATA_SET.METADATA</code>. 「metadata」- 附加配置
     */
    @Override
    public String getMetadata() {
        return (String) get(15);
    }

    /**
     * Setter for <code>ZDB.KP_DATA_SET.LANGUAGE</code>. 「language」- 使用的语言
     */
    @Override
    public KpDataSetRecord setLanguage(String value) {
        set(16, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.KP_DATA_SET.LANGUAGE</code>. 「language」- 使用的语言
     */
    @Override
    public String getLanguage() {
        return (String) get(16);
    }

    /**
     * Setter for <code>ZDB.KP_DATA_SET.CREATED_AT</code>. 「createdAt」- 创建时间
     */
    @Override
    public KpDataSetRecord setCreatedAt(LocalDateTime value) {
        set(17, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.KP_DATA_SET.CREATED_AT</code>. 「createdAt」- 创建时间
     */
    @Override
    public LocalDateTime getCreatedAt() {
        return (LocalDateTime) get(17);
    }

    /**
     * Setter for <code>ZDB.KP_DATA_SET.CREATED_BY</code>. 「createdBy」- 创建人
     */
    @Override
    public KpDataSetRecord setCreatedBy(String value) {
        set(18, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.KP_DATA_SET.CREATED_BY</code>. 「createdBy」- 创建人
     */
    @Override
    public String getCreatedBy() {
        return (String) get(18);
    }

    /**
     * Setter for <code>ZDB.KP_DATA_SET.UPDATED_AT</code>. 「updatedAt」- 更新时间
     */
    @Override
    public KpDataSetRecord setUpdatedAt(LocalDateTime value) {
        set(19, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.KP_DATA_SET.UPDATED_AT</code>. 「updatedAt」- 更新时间
     */
    @Override
    public LocalDateTime getUpdatedAt() {
        return (LocalDateTime) get(19);
    }

    /**
     * Setter for <code>ZDB.KP_DATA_SET.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    @Override
    public KpDataSetRecord setUpdatedBy(String value) {
        set(20, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.KP_DATA_SET.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    @Override
    public String getUpdatedBy() {
        return (String) get(20);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<String> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record21 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row21<String, String, String, String, String, String, String, String, String, String, String, String, String, Boolean, String, String, String, LocalDateTime, String, LocalDateTime, String> fieldsRow() {
        return (Row21) super.fieldsRow();
    }

    @Override
    public Row21<String, String, String, String, String, String, String, String, String, String, String, String, String, Boolean, String, String, String, LocalDateTime, String, LocalDateTime, String> valuesRow() {
        return (Row21) super.valuesRow();
    }

    @Override
    public Field<String> field1() {
        return KpDataSet.KP_DATA_SET.KEY;
    }

    @Override
    public Field<String> field2() {
        return KpDataSet.KP_DATA_SET.NAME;
    }

    @Override
    public Field<String> field3() {
        return KpDataSet.KP_DATA_SET.CODE;
    }

    @Override
    public Field<String> field4() {
        return KpDataSet.KP_DATA_SET.DATA_QUERY;
    }

    @Override
    public Field<String> field5() {
        return KpDataSet.KP_DATA_SET.DATA_SOURCE;
    }

    @Override
    public Field<String> field6() {
        return KpDataSet.KP_DATA_SET.DATA_CONFIG;
    }

    @Override
    public Field<String> field7() {
        return KpDataSet.KP_DATA_SET.DATA_FIELD;
    }

    @Override
    public Field<String> field8() {
        return KpDataSet.KP_DATA_SET.DATA_COMPONENT;
    }

    @Override
    public Field<String> field9() {
        return KpDataSet.KP_DATA_SET.TYPE;
    }

    @Override
    public Field<String> field10() {
        return KpDataSet.KP_DATA_SET.STATUS;
    }

    @Override
    public Field<String> field11() {
        return KpDataSet.KP_DATA_SET.SOURCE_ID;
    }

    @Override
    public Field<String> field12() {
        return KpDataSet.KP_DATA_SET.SOURCE_CONFIG;
    }

    @Override
    public Field<String> field13() {
        return KpDataSet.KP_DATA_SET.APP_ID;
    }

    @Override
    public Field<Boolean> field14() {
        return KpDataSet.KP_DATA_SET.ACTIVE;
    }

    @Override
    public Field<String> field15() {
        return KpDataSet.KP_DATA_SET.SIGMA;
    }

    @Override
    public Field<String> field16() {
        return KpDataSet.KP_DATA_SET.METADATA;
    }

    @Override
    public Field<String> field17() {
        return KpDataSet.KP_DATA_SET.LANGUAGE;
    }

    @Override
    public Field<LocalDateTime> field18() {
        return KpDataSet.KP_DATA_SET.CREATED_AT;
    }

    @Override
    public Field<String> field19() {
        return KpDataSet.KP_DATA_SET.CREATED_BY;
    }

    @Override
    public Field<LocalDateTime> field20() {
        return KpDataSet.KP_DATA_SET.UPDATED_AT;
    }

    @Override
    public Field<String> field21() {
        return KpDataSet.KP_DATA_SET.UPDATED_BY;
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
        return getDataQuery();
    }

    @Override
    public String component5() {
        return getDataSource();
    }

    @Override
    public String component6() {
        return getDataConfig();
    }

    @Override
    public String component7() {
        return getDataField();
    }

    @Override
    public String component8() {
        return getDataComponent();
    }

    @Override
    public String component9() {
        return getType();
    }

    @Override
    public String component10() {
        return getStatus();
    }

    @Override
    public String component11() {
        return getSourceId();
    }

    @Override
    public String component12() {
        return getSourceConfig();
    }

    @Override
    public String component13() {
        return getAppId();
    }

    @Override
    public Boolean component14() {
        return getActive();
    }

    @Override
    public String component15() {
        return getSigma();
    }

    @Override
    public String component16() {
        return getMetadata();
    }

    @Override
    public String component17() {
        return getLanguage();
    }

    @Override
    public LocalDateTime component18() {
        return getCreatedAt();
    }

    @Override
    public String component19() {
        return getCreatedBy();
    }

    @Override
    public LocalDateTime component20() {
        return getUpdatedAt();
    }

    @Override
    public String component21() {
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
        return getDataQuery();
    }

    @Override
    public String value5() {
        return getDataSource();
    }

    @Override
    public String value6() {
        return getDataConfig();
    }

    @Override
    public String value7() {
        return getDataField();
    }

    @Override
    public String value8() {
        return getDataComponent();
    }

    @Override
    public String value9() {
        return getType();
    }

    @Override
    public String value10() {
        return getStatus();
    }

    @Override
    public String value11() {
        return getSourceId();
    }

    @Override
    public String value12() {
        return getSourceConfig();
    }

    @Override
    public String value13() {
        return getAppId();
    }

    @Override
    public Boolean value14() {
        return getActive();
    }

    @Override
    public String value15() {
        return getSigma();
    }

    @Override
    public String value16() {
        return getMetadata();
    }

    @Override
    public String value17() {
        return getLanguage();
    }

    @Override
    public LocalDateTime value18() {
        return getCreatedAt();
    }

    @Override
    public String value19() {
        return getCreatedBy();
    }

    @Override
    public LocalDateTime value20() {
        return getUpdatedAt();
    }

    @Override
    public String value21() {
        return getUpdatedBy();
    }

    @Override
    public KpDataSetRecord value1(String value) {
        setKey(value);
        return this;
    }

    @Override
    public KpDataSetRecord value2(String value) {
        setName(value);
        return this;
    }

    @Override
    public KpDataSetRecord value3(String value) {
        setCode(value);
        return this;
    }

    @Override
    public KpDataSetRecord value4(String value) {
        setDataQuery(value);
        return this;
    }

    @Override
    public KpDataSetRecord value5(String value) {
        setDataSource(value);
        return this;
    }

    @Override
    public KpDataSetRecord value6(String value) {
        setDataConfig(value);
        return this;
    }

    @Override
    public KpDataSetRecord value7(String value) {
        setDataField(value);
        return this;
    }

    @Override
    public KpDataSetRecord value8(String value) {
        setDataComponent(value);
        return this;
    }

    @Override
    public KpDataSetRecord value9(String value) {
        setType(value);
        return this;
    }

    @Override
    public KpDataSetRecord value10(String value) {
        setStatus(value);
        return this;
    }

    @Override
    public KpDataSetRecord value11(String value) {
        setSourceId(value);
        return this;
    }

    @Override
    public KpDataSetRecord value12(String value) {
        setSourceConfig(value);
        return this;
    }

    @Override
    public KpDataSetRecord value13(String value) {
        setAppId(value);
        return this;
    }

    @Override
    public KpDataSetRecord value14(Boolean value) {
        setActive(value);
        return this;
    }

    @Override
    public KpDataSetRecord value15(String value) {
        setSigma(value);
        return this;
    }

    @Override
    public KpDataSetRecord value16(String value) {
        setMetadata(value);
        return this;
    }

    @Override
    public KpDataSetRecord value17(String value) {
        setLanguage(value);
        return this;
    }

    @Override
    public KpDataSetRecord value18(LocalDateTime value) {
        setCreatedAt(value);
        return this;
    }

    @Override
    public KpDataSetRecord value19(String value) {
        setCreatedBy(value);
        return this;
    }

    @Override
    public KpDataSetRecord value20(LocalDateTime value) {
        setUpdatedAt(value);
        return this;
    }

    @Override
    public KpDataSetRecord value21(String value) {
        setUpdatedBy(value);
        return this;
    }

    @Override
    public KpDataSetRecord values(String value1, String value2, String value3, String value4, String value5, String value6, String value7, String value8, String value9, String value10, String value11, String value12, String value13, Boolean value14, String value15, String value16, String value17, LocalDateTime value18, String value19, LocalDateTime value20, String value21) {
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
        return this;
    }

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    @Override
    public void from(IKpDataSet from) {
        setKey(from.getKey());
        setName(from.getName());
        setCode(from.getCode());
        setDataQuery(from.getDataQuery());
        setDataSource(from.getDataSource());
        setDataConfig(from.getDataConfig());
        setDataField(from.getDataField());
        setDataComponent(from.getDataComponent());
        setType(from.getType());
        setStatus(from.getStatus());
        setSourceId(from.getSourceId());
        setSourceConfig(from.getSourceConfig());
        setAppId(from.getAppId());
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
    public <E extends IKpDataSet> E into(E into) {
        into.from(this);
        return into;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached KpDataSetRecord
     */
    public KpDataSetRecord() {
        super(KpDataSet.KP_DATA_SET);
    }

    /**
     * Create a detached, initialised KpDataSetRecord
     */
    public KpDataSetRecord(String key, String name, String code, String dataQuery, String dataSource, String dataConfig, String dataField, String dataComponent, String type, String status, String sourceId, String sourceConfig, String appId, Boolean active, String sigma, String metadata, String language, LocalDateTime createdAt, String createdBy, LocalDateTime updatedAt, String updatedBy) {
        super(KpDataSet.KP_DATA_SET);

        setKey(key);
        setName(name);
        setCode(code);
        setDataQuery(dataQuery);
        setDataSource(dataSource);
        setDataConfig(dataConfig);
        setDataField(dataField);
        setDataComponent(dataComponent);
        setType(type);
        setStatus(status);
        setSourceId(sourceId);
        setSourceConfig(sourceConfig);
        setAppId(appId);
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
     * Create a detached, initialised KpDataSetRecord
     */
    public KpDataSetRecord(io.zerows.extension.runtime.report.domain.tables.pojos.KpDataSet value) {
        super(KpDataSet.KP_DATA_SET);

        if (value != null) {
            setKey(value.getKey());
            setName(value.getName());
            setCode(value.getCode());
            setDataQuery(value.getDataQuery());
            setDataSource(value.getDataSource());
            setDataConfig(value.getDataConfig());
            setDataField(value.getDataField());
            setDataComponent(value.getDataComponent());
            setType(value.getType());
            setStatus(value.getStatus());
            setSourceId(value.getSourceId());
            setSourceConfig(value.getSourceConfig());
            setAppId(value.getAppId());
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

        public KpDataSetRecord(io.vertx.core.json.JsonObject json) {
                this();
                fromJson(json);
        }
}
