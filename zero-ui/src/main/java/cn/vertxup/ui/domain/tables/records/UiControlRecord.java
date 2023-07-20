/*
 * This file is generated by jOOQ.
 */
package cn.vertxup.ui.domain.tables.records;


import cn.vertxup.ui.domain.tables.UiControl;
import cn.vertxup.ui.domain.tables.interfaces.IUiControl;

import io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo;

import java.time.LocalDateTime;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record19;
import org.jooq.Row19;
import org.jooq.impl.UpdatableRecordImpl;


import static io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo.*;
/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class UiControlRecord extends UpdatableRecordImpl<UiControlRecord> implements VertxPojo, Record19<String, String, String, String, String, String, String, String, String, String, String, Boolean, String, String, String, LocalDateTime, String, LocalDateTime, String>, IUiControl {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>ZDB.UI_CONTROL.KEY</code>. 「key」- 主键
     */
    @Override
    public UiControlRecord setKey(String value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.UI_CONTROL.KEY</code>. 「key」- 主键
     */
    @Override
    public String getKey() {
        return (String) get(0);
    }

    /**
     * Setter for <code>ZDB.UI_CONTROL.SIGN</code>. 「sign」- 控件使用的签名基本信息
     */
    @Override
    public UiControlRecord setSign(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.UI_CONTROL.SIGN</code>. 「sign」- 控件使用的签名基本信息
     */
    @Override
    public String getSign() {
        return (String) get(1);
    }

    /**
     * Setter for <code>ZDB.UI_CONTROL.PAGE_ID</code>. 「pageId」- 当前控件所在的页面ID
     */
    @Override
    public UiControlRecord setPageId(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.UI_CONTROL.PAGE_ID</code>. 「pageId」- 当前控件所在的页面ID
     */
    @Override
    public String getPageId() {
        return (String) get(2);
    }

    /**
     * Setter for <code>ZDB.UI_CONTROL.TYPE</code>. 「type」- 当前控件的类型：CONTAINER /
     * COMPONENT / FORM / LIST，其中 FORM / LIST 需要访问子表
     */
    @Override
    public UiControlRecord setType(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.UI_CONTROL.TYPE</code>. 「type」- 当前控件的类型：CONTAINER /
     * COMPONENT / FORM / LIST，其中 FORM / LIST 需要访问子表
     */
    @Override
    public String getType() {
        return (String) get(3);
    }

    /**
     * Setter for <code>ZDB.UI_CONTROL.CONTAINER_NAME</code>. 「containerName」-
     * 当前控件使用的容器名
     */
    @Override
    public UiControlRecord setContainerName(String value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.UI_CONTROL.CONTAINER_NAME</code>. 「containerName」-
     * 当前控件使用的容器名
     */
    @Override
    public String getContainerName() {
        return (String) get(4);
    }

    /**
     * Setter for <code>ZDB.UI_CONTROL.CONTAINER_CONFIG</code>.
     * 「containerConfig」- 当前控件使用的容器配置
     */
    @Override
    public UiControlRecord setContainerConfig(String value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.UI_CONTROL.CONTAINER_CONFIG</code>.
     * 「containerConfig」- 当前控件使用的容器配置
     */
    @Override
    public String getContainerConfig() {
        return (String) get(5);
    }

    /**
     * Setter for <code>ZDB.UI_CONTROL.ASSIST</code>. 「assist」 - 辅助数据（容器专用）
     */
    @Override
    public UiControlRecord setAssist(String value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.UI_CONTROL.ASSIST</code>. 「assist」 - 辅助数据（容器专用）
     */
    @Override
    public String getAssist() {
        return (String) get(6);
    }

    /**
     * Setter for <code>ZDB.UI_CONTROL.GRID</code>. 「grid」 - 容器专用
     */
    @Override
    public UiControlRecord setGrid(String value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.UI_CONTROL.GRID</code>. 「grid」 - 容器专用
     */
    @Override
    public String getGrid() {
        return (String) get(7);
    }

    /**
     * Setter for <code>ZDB.UI_CONTROL.COMPONENT_NAME</code>. 「componentName」-
     * 当前控件使用的组件名
     */
    @Override
    public UiControlRecord setComponentName(String value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.UI_CONTROL.COMPONENT_NAME</code>. 「componentName」-
     * 当前控件使用的组件名
     */
    @Override
    public String getComponentName() {
        return (String) get(8);
    }

    /**
     * Setter for <code>ZDB.UI_CONTROL.COMPONENT_CONFIG</code>.
     * 「componentConfig」- 当前控件使用的配置
     */
    @Override
    public UiControlRecord setComponentConfig(String value) {
        set(9, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.UI_CONTROL.COMPONENT_CONFIG</code>.
     * 「componentConfig」- 当前控件使用的配置
     */
    @Override
    public String getComponentConfig() {
        return (String) get(9);
    }

    /**
     * Setter for <code>ZDB.UI_CONTROL.COMPONENT_DATA</code>. 「componentData」-
     * 当前控件使用的数据，使用表达式结构
     */
    @Override
    public UiControlRecord setComponentData(String value) {
        set(10, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.UI_CONTROL.COMPONENT_DATA</code>. 「componentData」-
     * 当前控件使用的数据，使用表达式结构
     */
    @Override
    public String getComponentData() {
        return (String) get(10);
    }

    /**
     * Setter for <code>ZDB.UI_CONTROL.ACTIVE</code>. 「active」- 是否启用
     */
    @Override
    public UiControlRecord setActive(Boolean value) {
        set(11, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.UI_CONTROL.ACTIVE</code>. 「active」- 是否启用
     */
    @Override
    public Boolean getActive() {
        return (Boolean) get(11);
    }

    /**
     * Setter for <code>ZDB.UI_CONTROL.SIGMA</code>. 「sigma」- 统一标识
     */
    @Override
    public UiControlRecord setSigma(String value) {
        set(12, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.UI_CONTROL.SIGMA</code>. 「sigma」- 统一标识
     */
    @Override
    public String getSigma() {
        return (String) get(12);
    }

    /**
     * Setter for <code>ZDB.UI_CONTROL.METADATA</code>. 「metadata」- 附加配置
     */
    @Override
    public UiControlRecord setMetadata(String value) {
        set(13, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.UI_CONTROL.METADATA</code>. 「metadata」- 附加配置
     */
    @Override
    public String getMetadata() {
        return (String) get(13);
    }

    /**
     * Setter for <code>ZDB.UI_CONTROL.LANGUAGE</code>. 「language」- 使用的语言
     */
    @Override
    public UiControlRecord setLanguage(String value) {
        set(14, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.UI_CONTROL.LANGUAGE</code>. 「language」- 使用的语言
     */
    @Override
    public String getLanguage() {
        return (String) get(14);
    }

    /**
     * Setter for <code>ZDB.UI_CONTROL.CREATED_AT</code>. 「createdAt」- 创建时间
     */
    @Override
    public UiControlRecord setCreatedAt(LocalDateTime value) {
        set(15, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.UI_CONTROL.CREATED_AT</code>. 「createdAt」- 创建时间
     */
    @Override
    public LocalDateTime getCreatedAt() {
        return (LocalDateTime) get(15);
    }

    /**
     * Setter for <code>ZDB.UI_CONTROL.CREATED_BY</code>. 「createdBy」- 创建人
     */
    @Override
    public UiControlRecord setCreatedBy(String value) {
        set(16, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.UI_CONTROL.CREATED_BY</code>. 「createdBy」- 创建人
     */
    @Override
    public String getCreatedBy() {
        return (String) get(16);
    }

    /**
     * Setter for <code>ZDB.UI_CONTROL.UPDATED_AT</code>. 「updatedAt」- 更新时间
     */
    @Override
    public UiControlRecord setUpdatedAt(LocalDateTime value) {
        set(17, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.UI_CONTROL.UPDATED_AT</code>. 「updatedAt」- 更新时间
     */
    @Override
    public LocalDateTime getUpdatedAt() {
        return (LocalDateTime) get(17);
    }

    /**
     * Setter for <code>ZDB.UI_CONTROL.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    @Override
    public UiControlRecord setUpdatedBy(String value) {
        set(18, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.UI_CONTROL.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    @Override
    public String getUpdatedBy() {
        return (String) get(18);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<String> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record19 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row19<String, String, String, String, String, String, String, String, String, String, String, Boolean, String, String, String, LocalDateTime, String, LocalDateTime, String> fieldsRow() {
        return (Row19) super.fieldsRow();
    }

    @Override
    public Row19<String, String, String, String, String, String, String, String, String, String, String, Boolean, String, String, String, LocalDateTime, String, LocalDateTime, String> valuesRow() {
        return (Row19) super.valuesRow();
    }

    @Override
    public Field<String> field1() {
        return UiControl.UI_CONTROL.KEY;
    }

    @Override
    public Field<String> field2() {
        return UiControl.UI_CONTROL.SIGN;
    }

    @Override
    public Field<String> field3() {
        return UiControl.UI_CONTROL.PAGE_ID;
    }

    @Override
    public Field<String> field4() {
        return UiControl.UI_CONTROL.TYPE;
    }

    @Override
    public Field<String> field5() {
        return UiControl.UI_CONTROL.CONTAINER_NAME;
    }

    @Override
    public Field<String> field6() {
        return UiControl.UI_CONTROL.CONTAINER_CONFIG;
    }

    @Override
    public Field<String> field7() {
        return UiControl.UI_CONTROL.ASSIST;
    }

    @Override
    public Field<String> field8() {
        return UiControl.UI_CONTROL.GRID;
    }

    @Override
    public Field<String> field9() {
        return UiControl.UI_CONTROL.COMPONENT_NAME;
    }

    @Override
    public Field<String> field10() {
        return UiControl.UI_CONTROL.COMPONENT_CONFIG;
    }

    @Override
    public Field<String> field11() {
        return UiControl.UI_CONTROL.COMPONENT_DATA;
    }

    @Override
    public Field<Boolean> field12() {
        return UiControl.UI_CONTROL.ACTIVE;
    }

    @Override
    public Field<String> field13() {
        return UiControl.UI_CONTROL.SIGMA;
    }

    @Override
    public Field<String> field14() {
        return UiControl.UI_CONTROL.METADATA;
    }

    @Override
    public Field<String> field15() {
        return UiControl.UI_CONTROL.LANGUAGE;
    }

    @Override
    public Field<LocalDateTime> field16() {
        return UiControl.UI_CONTROL.CREATED_AT;
    }

    @Override
    public Field<String> field17() {
        return UiControl.UI_CONTROL.CREATED_BY;
    }

    @Override
    public Field<LocalDateTime> field18() {
        return UiControl.UI_CONTROL.UPDATED_AT;
    }

    @Override
    public Field<String> field19() {
        return UiControl.UI_CONTROL.UPDATED_BY;
    }

    @Override
    public String component1() {
        return getKey();
    }

    @Override
    public String component2() {
        return getSign();
    }

    @Override
    public String component3() {
        return getPageId();
    }

    @Override
    public String component4() {
        return getType();
    }

    @Override
    public String component5() {
        return getContainerName();
    }

    @Override
    public String component6() {
        return getContainerConfig();
    }

    @Override
    public String component7() {
        return getAssist();
    }

    @Override
    public String component8() {
        return getGrid();
    }

    @Override
    public String component9() {
        return getComponentName();
    }

    @Override
    public String component10() {
        return getComponentConfig();
    }

    @Override
    public String component11() {
        return getComponentData();
    }

    @Override
    public Boolean component12() {
        return getActive();
    }

    @Override
    public String component13() {
        return getSigma();
    }

    @Override
    public String component14() {
        return getMetadata();
    }

    @Override
    public String component15() {
        return getLanguage();
    }

    @Override
    public LocalDateTime component16() {
        return getCreatedAt();
    }

    @Override
    public String component17() {
        return getCreatedBy();
    }

    @Override
    public LocalDateTime component18() {
        return getUpdatedAt();
    }

    @Override
    public String component19() {
        return getUpdatedBy();
    }

    @Override
    public String value1() {
        return getKey();
    }

    @Override
    public String value2() {
        return getSign();
    }

    @Override
    public String value3() {
        return getPageId();
    }

    @Override
    public String value4() {
        return getType();
    }

    @Override
    public String value5() {
        return getContainerName();
    }

    @Override
    public String value6() {
        return getContainerConfig();
    }

    @Override
    public String value7() {
        return getAssist();
    }

    @Override
    public String value8() {
        return getGrid();
    }

    @Override
    public String value9() {
        return getComponentName();
    }

    @Override
    public String value10() {
        return getComponentConfig();
    }

    @Override
    public String value11() {
        return getComponentData();
    }

    @Override
    public Boolean value12() {
        return getActive();
    }

    @Override
    public String value13() {
        return getSigma();
    }

    @Override
    public String value14() {
        return getMetadata();
    }

    @Override
    public String value15() {
        return getLanguage();
    }

    @Override
    public LocalDateTime value16() {
        return getCreatedAt();
    }

    @Override
    public String value17() {
        return getCreatedBy();
    }

    @Override
    public LocalDateTime value18() {
        return getUpdatedAt();
    }

    @Override
    public String value19() {
        return getUpdatedBy();
    }

    @Override
    public UiControlRecord value1(String value) {
        setKey(value);
        return this;
    }

    @Override
    public UiControlRecord value2(String value) {
        setSign(value);
        return this;
    }

    @Override
    public UiControlRecord value3(String value) {
        setPageId(value);
        return this;
    }

    @Override
    public UiControlRecord value4(String value) {
        setType(value);
        return this;
    }

    @Override
    public UiControlRecord value5(String value) {
        setContainerName(value);
        return this;
    }

    @Override
    public UiControlRecord value6(String value) {
        setContainerConfig(value);
        return this;
    }

    @Override
    public UiControlRecord value7(String value) {
        setAssist(value);
        return this;
    }

    @Override
    public UiControlRecord value8(String value) {
        setGrid(value);
        return this;
    }

    @Override
    public UiControlRecord value9(String value) {
        setComponentName(value);
        return this;
    }

    @Override
    public UiControlRecord value10(String value) {
        setComponentConfig(value);
        return this;
    }

    @Override
    public UiControlRecord value11(String value) {
        setComponentData(value);
        return this;
    }

    @Override
    public UiControlRecord value12(Boolean value) {
        setActive(value);
        return this;
    }

    @Override
    public UiControlRecord value13(String value) {
        setSigma(value);
        return this;
    }

    @Override
    public UiControlRecord value14(String value) {
        setMetadata(value);
        return this;
    }

    @Override
    public UiControlRecord value15(String value) {
        setLanguage(value);
        return this;
    }

    @Override
    public UiControlRecord value16(LocalDateTime value) {
        setCreatedAt(value);
        return this;
    }

    @Override
    public UiControlRecord value17(String value) {
        setCreatedBy(value);
        return this;
    }

    @Override
    public UiControlRecord value18(LocalDateTime value) {
        setUpdatedAt(value);
        return this;
    }

    @Override
    public UiControlRecord value19(String value) {
        setUpdatedBy(value);
        return this;
    }

    @Override
    public UiControlRecord values(String value1, String value2, String value3, String value4, String value5, String value6, String value7, String value8, String value9, String value10, String value11, Boolean value12, String value13, String value14, String value15, LocalDateTime value16, String value17, LocalDateTime value18, String value19) {
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
        return this;
    }

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    @Override
    public void from(IUiControl from) {
        setKey(from.getKey());
        setSign(from.getSign());
        setPageId(from.getPageId());
        setType(from.getType());
        setContainerName(from.getContainerName());
        setContainerConfig(from.getContainerConfig());
        setAssist(from.getAssist());
        setGrid(from.getGrid());
        setComponentName(from.getComponentName());
        setComponentConfig(from.getComponentConfig());
        setComponentData(from.getComponentData());
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
    public <E extends IUiControl> E into(E into) {
        into.from(this);
        return into;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached UiControlRecord
     */
    public UiControlRecord() {
        super(UiControl.UI_CONTROL);
    }

    /**
     * Create a detached, initialised UiControlRecord
     */
    public UiControlRecord(String key, String sign, String pageId, String type, String containerName, String containerConfig, String assist, String grid, String componentName, String componentConfig, String componentData, Boolean active, String sigma, String metadata, String language, LocalDateTime createdAt, String createdBy, LocalDateTime updatedAt, String updatedBy) {
        super(UiControl.UI_CONTROL);

        setKey(key);
        setSign(sign);
        setPageId(pageId);
        setType(type);
        setContainerName(containerName);
        setContainerConfig(containerConfig);
        setAssist(assist);
        setGrid(grid);
        setComponentName(componentName);
        setComponentConfig(componentConfig);
        setComponentData(componentData);
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
     * Create a detached, initialised UiControlRecord
     */
    public UiControlRecord(cn.vertxup.ui.domain.tables.pojos.UiControl value) {
        super(UiControl.UI_CONTROL);

        if (value != null) {
            setKey(value.getKey());
            setSign(value.getSign());
            setPageId(value.getPageId());
            setType(value.getType());
            setContainerName(value.getContainerName());
            setContainerConfig(value.getContainerConfig());
            setAssist(value.getAssist());
            setGrid(value.getGrid());
            setComponentName(value.getComponentName());
            setComponentConfig(value.getComponentConfig());
            setComponentData(value.getComponentData());
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

        public UiControlRecord(io.vertx.core.json.JsonObject json) {
                this();
                fromJson(json);
        }
}
