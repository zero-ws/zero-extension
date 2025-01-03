/*
 * This file is generated by jOOQ.
 */
package io.zerows.extension.runtime.report.domain.tables.records;


import io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo;
import io.zerows.extension.runtime.report.domain.tables.KpReport;
import io.zerows.extension.runtime.report.domain.tables.interfaces.IKpReport;

import java.time.LocalDateTime;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record20;
import org.jooq.Row20;
import org.jooq.impl.UpdatableRecordImpl;


import static io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo.*;
/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class KpReportRecord extends UpdatableRecordImpl<KpReportRecord> implements VertxPojo, Record20<String, String, String, String, String, String, String, String, LocalDateTime, String, String, String, Boolean, String, String, String, LocalDateTime, String, LocalDateTime, String>, IKpReport {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>ZDB.KP_REPORT.KEY</code>. 「key」- 报表主键
     */
    @Override
    public KpReportRecord setKey(String value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.KP_REPORT.KEY</code>. 「key」- 报表主键
     */
    @Override
    public String getKey() {
        return (String) get(0);
    }

    /**
     * Setter for <code>ZDB.KP_REPORT.NAME</code>. 「name」- 表表名称
     */
    @Override
    public KpReportRecord setName(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.KP_REPORT.NAME</code>. 「name」- 表表名称
     */
    @Override
    public String getName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>ZDB.KP_REPORT.CODE</code>. 「code」- 报表编码
     */
    @Override
    public KpReportRecord setCode(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.KP_REPORT.CODE</code>. 「code」- 报表编码
     */
    @Override
    public String getCode() {
        return (String) get(2);
    }

    /**
     * Setter for <code>ZDB.KP_REPORT.STATUS</code>. 「status」- 报表状态
     */
    @Override
    public KpReportRecord setStatus(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.KP_REPORT.STATUS</code>. 「status」- 报表状态
     */
    @Override
    public String getStatus() {
        return (String) get(3);
    }

    /**
     * Setter for <code>ZDB.KP_REPORT.TITLE</code>. 「title」- 报表标题
     */
    @Override
    public KpReportRecord setTitle(String value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.KP_REPORT.TITLE</code>. 「title」- 报表标题
     */
    @Override
    public String getTitle() {
        return (String) get(4);
    }

    /**
     * Setter for <code>ZDB.KP_REPORT.REPORT_PARAM</code>. 「reportParam」- 报表参数配置
     */
    @Override
    public KpReportRecord setReportParam(String value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.KP_REPORT.REPORT_PARAM</code>. 「reportParam」- 报表参数配置
     */
    @Override
    public String getReportParam() {
        return (String) get(5);
    }

    /**
     * Setter for <code>ZDB.KP_REPORT.REPORT_CONFIG</code>. 「reportConfig」-
     * 主表基础配置
     */
    @Override
    public KpReportRecord setReportConfig(String value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.KP_REPORT.REPORT_CONFIG</code>. 「reportConfig」-
     * 主表基础配置
     */
    @Override
    public String getReportConfig() {
        return (String) get(6);
    }

    /**
     * Setter for <code>ZDB.KP_REPORT.REPORT_BY</code>. 「reportBy」- 模板创建人
     */
    @Override
    public KpReportRecord setReportBy(String value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.KP_REPORT.REPORT_BY</code>. 「reportBy」- 模板创建人
     */
    @Override
    public String getReportBy() {
        return (String) get(7);
    }

    /**
     * Setter for <code>ZDB.KP_REPORT.REPORT_AT</code>. 「reportAt」- 模板创建时间
     */
    @Override
    public KpReportRecord setReportAt(LocalDateTime value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.KP_REPORT.REPORT_AT</code>. 「reportAt」- 模板创建时间
     */
    @Override
    public LocalDateTime getReportAt() {
        return (LocalDateTime) get(8);
    }

    /**
     * Setter for <code>ZDB.KP_REPORT.DATA_SET_ID</code>. 「dataSetId」- 数据源ID
     */
    @Override
    public KpReportRecord setDataSetId(String value) {
        set(9, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.KP_REPORT.DATA_SET_ID</code>. 「dataSetId」- 数据源ID
     */
    @Override
    public String getDataSetId() {
        return (String) get(9);
    }

    /**
     * Setter for <code>ZDB.KP_REPORT.DATA_TPL_ID</code>. 「dataTplId」- 关联报表模板
     */
    @Override
    public KpReportRecord setDataTplId(String value) {
        set(10, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.KP_REPORT.DATA_TPL_ID</code>. 「dataTplId」- 关联报表模板
     */
    @Override
    public String getDataTplId() {
        return (String) get(10);
    }

    /**
     * Setter for <code>ZDB.KP_REPORT.APP_ID</code>. 「appId」- 应用数据
     */
    @Override
    public KpReportRecord setAppId(String value) {
        set(11, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.KP_REPORT.APP_ID</code>. 「appId」- 应用数据
     */
    @Override
    public String getAppId() {
        return (String) get(11);
    }

    /**
     * Setter for <code>ZDB.KP_REPORT.ACTIVE</code>. 「active」- 是否启用
     */
    @Override
    public KpReportRecord setActive(Boolean value) {
        set(12, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.KP_REPORT.ACTIVE</code>. 「active」- 是否启用
     */
    @Override
    public Boolean getActive() {
        return (Boolean) get(12);
    }

    /**
     * Setter for <code>ZDB.KP_REPORT.SIGMA</code>. 「sigma」- 统一标识
     */
    @Override
    public KpReportRecord setSigma(String value) {
        set(13, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.KP_REPORT.SIGMA</code>. 「sigma」- 统一标识
     */
    @Override
    public String getSigma() {
        return (String) get(13);
    }

    /**
     * Setter for <code>ZDB.KP_REPORT.METADATA</code>. 「metadata」- 附加配置
     */
    @Override
    public KpReportRecord setMetadata(String value) {
        set(14, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.KP_REPORT.METADATA</code>. 「metadata」- 附加配置
     */
    @Override
    public String getMetadata() {
        return (String) get(14);
    }

    /**
     * Setter for <code>ZDB.KP_REPORT.LANGUAGE</code>. 「language」- 使用的语言
     */
    @Override
    public KpReportRecord setLanguage(String value) {
        set(15, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.KP_REPORT.LANGUAGE</code>. 「language」- 使用的语言
     */
    @Override
    public String getLanguage() {
        return (String) get(15);
    }

    /**
     * Setter for <code>ZDB.KP_REPORT.CREATED_AT</code>. 「createdAt」- 创建时间
     */
    @Override
    public KpReportRecord setCreatedAt(LocalDateTime value) {
        set(16, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.KP_REPORT.CREATED_AT</code>. 「createdAt」- 创建时间
     */
    @Override
    public LocalDateTime getCreatedAt() {
        return (LocalDateTime) get(16);
    }

    /**
     * Setter for <code>ZDB.KP_REPORT.CREATED_BY</code>. 「createdBy」- 创建人
     */
    @Override
    public KpReportRecord setCreatedBy(String value) {
        set(17, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.KP_REPORT.CREATED_BY</code>. 「createdBy」- 创建人
     */
    @Override
    public String getCreatedBy() {
        return (String) get(17);
    }

    /**
     * Setter for <code>ZDB.KP_REPORT.UPDATED_AT</code>. 「updatedAt」- 更新时间
     */
    @Override
    public KpReportRecord setUpdatedAt(LocalDateTime value) {
        set(18, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.KP_REPORT.UPDATED_AT</code>. 「updatedAt」- 更新时间
     */
    @Override
    public LocalDateTime getUpdatedAt() {
        return (LocalDateTime) get(18);
    }

    /**
     * Setter for <code>ZDB.KP_REPORT.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    @Override
    public KpReportRecord setUpdatedBy(String value) {
        set(19, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.KP_REPORT.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    @Override
    public String getUpdatedBy() {
        return (String) get(19);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<String> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record20 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row20<String, String, String, String, String, String, String, String, LocalDateTime, String, String, String, Boolean, String, String, String, LocalDateTime, String, LocalDateTime, String> fieldsRow() {
        return (Row20) super.fieldsRow();
    }

    @Override
    public Row20<String, String, String, String, String, String, String, String, LocalDateTime, String, String, String, Boolean, String, String, String, LocalDateTime, String, LocalDateTime, String> valuesRow() {
        return (Row20) super.valuesRow();
    }

    @Override
    public Field<String> field1() {
        return KpReport.KP_REPORT.KEY;
    }

    @Override
    public Field<String> field2() {
        return KpReport.KP_REPORT.NAME;
    }

    @Override
    public Field<String> field3() {
        return KpReport.KP_REPORT.CODE;
    }

    @Override
    public Field<String> field4() {
        return KpReport.KP_REPORT.STATUS;
    }

    @Override
    public Field<String> field5() {
        return KpReport.KP_REPORT.TITLE;
    }

    @Override
    public Field<String> field6() {
        return KpReport.KP_REPORT.REPORT_PARAM;
    }

    @Override
    public Field<String> field7() {
        return KpReport.KP_REPORT.REPORT_CONFIG;
    }

    @Override
    public Field<String> field8() {
        return KpReport.KP_REPORT.REPORT_BY;
    }

    @Override
    public Field<LocalDateTime> field9() {
        return KpReport.KP_REPORT.REPORT_AT;
    }

    @Override
    public Field<String> field10() {
        return KpReport.KP_REPORT.DATA_SET_ID;
    }

    @Override
    public Field<String> field11() {
        return KpReport.KP_REPORT.DATA_TPL_ID;
    }

    @Override
    public Field<String> field12() {
        return KpReport.KP_REPORT.APP_ID;
    }

    @Override
    public Field<Boolean> field13() {
        return KpReport.KP_REPORT.ACTIVE;
    }

    @Override
    public Field<String> field14() {
        return KpReport.KP_REPORT.SIGMA;
    }

    @Override
    public Field<String> field15() {
        return KpReport.KP_REPORT.METADATA;
    }

    @Override
    public Field<String> field16() {
        return KpReport.KP_REPORT.LANGUAGE;
    }

    @Override
    public Field<LocalDateTime> field17() {
        return KpReport.KP_REPORT.CREATED_AT;
    }

    @Override
    public Field<String> field18() {
        return KpReport.KP_REPORT.CREATED_BY;
    }

    @Override
    public Field<LocalDateTime> field19() {
        return KpReport.KP_REPORT.UPDATED_AT;
    }

    @Override
    public Field<String> field20() {
        return KpReport.KP_REPORT.UPDATED_BY;
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
        return getStatus();
    }

    @Override
    public String component5() {
        return getTitle();
    }

    @Override
    public String component6() {
        return getReportParam();
    }

    @Override
    public String component7() {
        return getReportConfig();
    }

    @Override
    public String component8() {
        return getReportBy();
    }

    @Override
    public LocalDateTime component9() {
        return getReportAt();
    }

    @Override
    public String component10() {
        return getDataSetId();
    }

    @Override
    public String component11() {
        return getDataTplId();
    }

    @Override
    public String component12() {
        return getAppId();
    }

    @Override
    public Boolean component13() {
        return getActive();
    }

    @Override
    public String component14() {
        return getSigma();
    }

    @Override
    public String component15() {
        return getMetadata();
    }

    @Override
    public String component16() {
        return getLanguage();
    }

    @Override
    public LocalDateTime component17() {
        return getCreatedAt();
    }

    @Override
    public String component18() {
        return getCreatedBy();
    }

    @Override
    public LocalDateTime component19() {
        return getUpdatedAt();
    }

    @Override
    public String component20() {
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
        return getStatus();
    }

    @Override
    public String value5() {
        return getTitle();
    }

    @Override
    public String value6() {
        return getReportParam();
    }

    @Override
    public String value7() {
        return getReportConfig();
    }

    @Override
    public String value8() {
        return getReportBy();
    }

    @Override
    public LocalDateTime value9() {
        return getReportAt();
    }

    @Override
    public String value10() {
        return getDataSetId();
    }

    @Override
    public String value11() {
        return getDataTplId();
    }

    @Override
    public String value12() {
        return getAppId();
    }

    @Override
    public Boolean value13() {
        return getActive();
    }

    @Override
    public String value14() {
        return getSigma();
    }

    @Override
    public String value15() {
        return getMetadata();
    }

    @Override
    public String value16() {
        return getLanguage();
    }

    @Override
    public LocalDateTime value17() {
        return getCreatedAt();
    }

    @Override
    public String value18() {
        return getCreatedBy();
    }

    @Override
    public LocalDateTime value19() {
        return getUpdatedAt();
    }

    @Override
    public String value20() {
        return getUpdatedBy();
    }

    @Override
    public KpReportRecord value1(String value) {
        setKey(value);
        return this;
    }

    @Override
    public KpReportRecord value2(String value) {
        setName(value);
        return this;
    }

    @Override
    public KpReportRecord value3(String value) {
        setCode(value);
        return this;
    }

    @Override
    public KpReportRecord value4(String value) {
        setStatus(value);
        return this;
    }

    @Override
    public KpReportRecord value5(String value) {
        setTitle(value);
        return this;
    }

    @Override
    public KpReportRecord value6(String value) {
        setReportParam(value);
        return this;
    }

    @Override
    public KpReportRecord value7(String value) {
        setReportConfig(value);
        return this;
    }

    @Override
    public KpReportRecord value8(String value) {
        setReportBy(value);
        return this;
    }

    @Override
    public KpReportRecord value9(LocalDateTime value) {
        setReportAt(value);
        return this;
    }

    @Override
    public KpReportRecord value10(String value) {
        setDataSetId(value);
        return this;
    }

    @Override
    public KpReportRecord value11(String value) {
        setDataTplId(value);
        return this;
    }

    @Override
    public KpReportRecord value12(String value) {
        setAppId(value);
        return this;
    }

    @Override
    public KpReportRecord value13(Boolean value) {
        setActive(value);
        return this;
    }

    @Override
    public KpReportRecord value14(String value) {
        setSigma(value);
        return this;
    }

    @Override
    public KpReportRecord value15(String value) {
        setMetadata(value);
        return this;
    }

    @Override
    public KpReportRecord value16(String value) {
        setLanguage(value);
        return this;
    }

    @Override
    public KpReportRecord value17(LocalDateTime value) {
        setCreatedAt(value);
        return this;
    }

    @Override
    public KpReportRecord value18(String value) {
        setCreatedBy(value);
        return this;
    }

    @Override
    public KpReportRecord value19(LocalDateTime value) {
        setUpdatedAt(value);
        return this;
    }

    @Override
    public KpReportRecord value20(String value) {
        setUpdatedBy(value);
        return this;
    }

    @Override
    public KpReportRecord values(String value1, String value2, String value3, String value4, String value5, String value6, String value7, String value8, LocalDateTime value9, String value10, String value11, String value12, Boolean value13, String value14, String value15, String value16, LocalDateTime value17, String value18, LocalDateTime value19, String value20) {
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
        return this;
    }

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    @Override
    public void from(IKpReport from) {
        setKey(from.getKey());
        setName(from.getName());
        setCode(from.getCode());
        setStatus(from.getStatus());
        setTitle(from.getTitle());
        setReportParam(from.getReportParam());
        setReportConfig(from.getReportConfig());
        setReportBy(from.getReportBy());
        setReportAt(from.getReportAt());
        setDataSetId(from.getDataSetId());
        setDataTplId(from.getDataTplId());
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
    public <E extends IKpReport> E into(E into) {
        into.from(this);
        return into;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached KpReportRecord
     */
    public KpReportRecord() {
        super(KpReport.KP_REPORT);
    }

    /**
     * Create a detached, initialised KpReportRecord
     */
    public KpReportRecord(String key, String name, String code, String status, String title, String reportParam, String reportConfig, String reportBy, LocalDateTime reportAt, String dataSetId, String dataTplId, String appId, Boolean active, String sigma, String metadata, String language, LocalDateTime createdAt, String createdBy, LocalDateTime updatedAt, String updatedBy) {
        super(KpReport.KP_REPORT);

        setKey(key);
        setName(name);
        setCode(code);
        setStatus(status);
        setTitle(title);
        setReportParam(reportParam);
        setReportConfig(reportConfig);
        setReportBy(reportBy);
        setReportAt(reportAt);
        setDataSetId(dataSetId);
        setDataTplId(dataTplId);
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
     * Create a detached, initialised KpReportRecord
     */
    public KpReportRecord(io.zerows.extension.runtime.report.domain.tables.pojos.KpReport value) {
        super(KpReport.KP_REPORT);

        if (value != null) {
            setKey(value.getKey());
            setName(value.getName());
            setCode(value.getCode());
            setStatus(value.getStatus());
            setTitle(value.getTitle());
            setReportParam(value.getReportParam());
            setReportConfig(value.getReportConfig());
            setReportBy(value.getReportBy());
            setReportAt(value.getReportAt());
            setDataSetId(value.getDataSetId());
            setDataTplId(value.getDataTplId());
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

        public KpReportRecord(io.vertx.core.json.JsonObject json) {
                this();
                fromJson(json);
        }
}
