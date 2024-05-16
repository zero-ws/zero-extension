/*
 * This file is generated by jOOQ.
 */
package io.zerows.extension.mbse.ui.domain.tables.records;


import io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo;
import io.zerows.extension.mbse.ui.domain.tables.UiView;
import io.zerows.extension.mbse.ui.domain.tables.interfaces.IUiView;
import org.jooq.Record1;
import org.jooq.impl.UpdatableRecordImpl;

import java.time.LocalDateTime;

/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({"all", "unchecked", "rawtypes"})
public class UiViewRecord extends UpdatableRecordImpl<UiViewRecord> implements VertxPojo, IUiView {

    private static final long serialVersionUID = 1L;

    /**
     * Create a detached UiViewRecord
     */
    public UiViewRecord() {
        super(UiView.UI_VIEW);
    }

    /**
     * Create a detached, initialised UiViewRecord
     */
    public UiViewRecord(String key, String name, String code, Integer sort, String identifier, String workflow, String view, String position, String title, String projection, String criteria, String rows, String uiConfig, String qrComponent, String qrConfig, String sigma, String language, Boolean active, String metadata, LocalDateTime createdAt, String createdBy, LocalDateTime updatedAt, String updatedBy) {
        super(UiView.UI_VIEW);

        setKey(key);
        setName(name);
        setCode(code);
        setSort(sort);
        setIdentifier(identifier);
        setWorkflow(workflow);
        setView(view);
        setPosition(position);
        setTitle(title);
        setProjection(projection);
        setCriteria(criteria);
        setRows(rows);
        setUiConfig(uiConfig);
        setQrComponent(qrComponent);
        setQrConfig(qrConfig);
        setSigma(sigma);
        setLanguage(language);
        setActive(active);
        setMetadata(metadata);
        setCreatedAt(createdAt);
        setCreatedBy(createdBy);
        setUpdatedAt(updatedAt);
        setUpdatedBy(updatedBy);
        resetChangedOnNotNull();
    }

    /**
     * Create a detached, initialised UiViewRecord
     */
    public UiViewRecord(io.zerows.extension.mbse.ui.domain.tables.pojos.UiView value) {
        super(UiView.UI_VIEW);

        if (value != null) {
            setKey(value.getKey());
            setName(value.getName());
            setCode(value.getCode());
            setSort(value.getSort());
            setIdentifier(value.getIdentifier());
            setWorkflow(value.getWorkflow());
            setView(value.getView());
            setPosition(value.getPosition());
            setTitle(value.getTitle());
            setProjection(value.getProjection());
            setCriteria(value.getCriteria());
            setRows(value.getRows());
            setUiConfig(value.getUiConfig());
            setQrComponent(value.getQrComponent());
            setQrConfig(value.getQrConfig());
            setSigma(value.getSigma());
            setLanguage(value.getLanguage());
            setActive(value.getActive());
            setMetadata(value.getMetadata());
            setCreatedAt(value.getCreatedAt());
            setCreatedBy(value.getCreatedBy());
            setUpdatedAt(value.getUpdatedAt());
            setUpdatedBy(value.getUpdatedBy());
            resetChangedOnNotNull();
        }
    }

    public UiViewRecord(io.vertx.core.json.JsonObject json) {
        this();
        fromJson(json);
    }

    /**
     * Getter for <code>ZDB.UI_VIEW.KEY</code>. 「key」- 查询记录ID
     */
    @Override
    public String getKey() {
        return (String) get(0);
    }

    /**
     * Setter for <code>ZDB.UI_VIEW.KEY</code>. 「key」- 查询记录ID
     */
    @Override
    public UiViewRecord setKey(String value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.UI_VIEW.NAME</code>. 「name」- 视图名称，每个 MATRIX 对应一个视图
     */
    @Override
    public String getName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>ZDB.UI_VIEW.NAME</code>. 「name」- 视图名称，每个 MATRIX 对应一个视图
     */
    @Override
    public UiViewRecord setName(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.UI_VIEW.CODE</code>. 「code」- 系统编码
     */
    @Override
    public String getCode() {
        return (String) get(2);
    }

    /**
     * Setter for <code>ZDB.UI_VIEW.CODE</code>. 「code」- 系统编码
     */
    @Override
    public UiViewRecord setCode(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.UI_VIEW.SORT</code>. 「sort」- QR的顺序
     */
    @Override
    public Integer getSort() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>ZDB.UI_VIEW.SORT</code>. 「sort」- QR的顺序
     */
    @Override
    public UiViewRecord setSort(Integer value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.UI_VIEW.IDENTIFIER</code>. 「identifier」- 模型标识符
     */
    @Override
    public String getIdentifier() {
        return (String) get(4);
    }

    /**
     * Setter for <code>ZDB.UI_VIEW.IDENTIFIER</code>. 「identifier」- 模型标识符
     */
    @Override
    public UiViewRecord setIdentifier(String value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.UI_VIEW.WORKFLOW</code>. 「workflow」- 工作流名称
     */
    @Override
    public String getWorkflow() {
        return (String) get(5);
    }

    /**
     * Setter for <code>ZDB.UI_VIEW.WORKFLOW</code>. 「workflow」- 工作流名称
     */
    @Override
    public UiViewRecord setWorkflow(String value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.UI_VIEW.VIEW</code>. 「view」- 视图名
     */
    @Override
    public String getView() {
        return (String) get(6);
    }

    /**
     * Setter for <code>ZDB.UI_VIEW.VIEW</code>. 「view」- 视图名
     */
    @Override
    public UiViewRecord setView(String value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.UI_VIEW.POSITION</code>. 「position」-
     * 当前视图的模块位置，比页面低一个维度
     */
    @Override
    public String getPosition() {
        return (String) get(7);
    }

    /**
     * Setter for <code>ZDB.UI_VIEW.POSITION</code>. 「position」-
     * 当前视图的模块位置，比页面低一个维度
     */
    @Override
    public UiViewRecord setPosition(String value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.UI_VIEW.TITLE</code>. 「title」- 视图标题，用户输入，可选择
     */
    @Override
    public String getTitle() {
        return (String) get(8);
    }

    /**
     * Setter for <code>ZDB.UI_VIEW.TITLE</code>. 「title」- 视图标题，用户输入，可选择
     */
    @Override
    public UiViewRecord setTitle(String value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.UI_VIEW.PROJECTION</code>. 「projection」- 该资源的列定义
     */
    @Override
    public String getProjection() {
        return (String) get(9);
    }

    /**
     * Setter for <code>ZDB.UI_VIEW.PROJECTION</code>. 「projection」- 该资源的列定义
     */
    @Override
    public UiViewRecord setProjection(String value) {
        set(9, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.UI_VIEW.CRITERIA</code>. 「criteria」- 该资源的行查询
     */
    @Override
    public String getCriteria() {
        return (String) get(10);
    }

    /**
     * Setter for <code>ZDB.UI_VIEW.CRITERIA</code>. 「criteria」- 该资源的行查询
     */
    @Override
    public UiViewRecord setCriteria(String value) {
        set(10, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.UI_VIEW.ROWS</code>. 「rows」- 该资源针对保存的行进行过滤
     */
    @Override
    public String getRows() {
        return (String) get(11);
    }

    /**
     * Setter for <code>ZDB.UI_VIEW.ROWS</code>. 「rows」- 该资源针对保存的行进行过滤
     */
    @Override
    public UiViewRecord setRows(String value) {
        set(11, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.UI_VIEW.UI_CONFIG</code>. 「uiConfig」- 界面配置
     */
    @Override
    public String getUiConfig() {
        return (String) get(12);
    }

    /**
     * Setter for <code>ZDB.UI_VIEW.UI_CONFIG</code>. 「uiConfig」- 界面配置
     */
    @Override
    public UiViewRecord setUiConfig(String value) {
        set(12, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.UI_VIEW.QR_COMPONENT</code>. 「qrComponent」- 查询条件专用组件
     */
    @Override
    public String getQrComponent() {
        return (String) get(13);
    }

    /**
     * Setter for <code>ZDB.UI_VIEW.QR_COMPONENT</code>. 「qrComponent」- 查询条件专用组件
     */
    @Override
    public UiViewRecord setQrComponent(String value) {
        set(13, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.UI_VIEW.QR_CONFIG</code>. 「qrConfig」- 查询组件专用配置
     */
    @Override
    public String getQrConfig() {
        return (String) get(14);
    }

    /**
     * Setter for <code>ZDB.UI_VIEW.QR_CONFIG</code>. 「qrConfig」- 查询组件专用配置
     */
    @Override
    public UiViewRecord setQrConfig(String value) {
        set(14, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.UI_VIEW.SIGMA</code>. 「sigma」- 用户组绑定的统一标识
     */
    @Override
    public String getSigma() {
        return (String) get(15);
    }

    /**
     * Setter for <code>ZDB.UI_VIEW.SIGMA</code>. 「sigma」- 用户组绑定的统一标识
     */
    @Override
    public UiViewRecord setSigma(String value) {
        set(15, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.UI_VIEW.LANGUAGE</code>. 「language」- 使用的语言
     */
    @Override
    public String getLanguage() {
        return (String) get(16);
    }

    /**
     * Setter for <code>ZDB.UI_VIEW.LANGUAGE</code>. 「language」- 使用的语言
     */
    @Override
    public UiViewRecord setLanguage(String value) {
        set(16, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.UI_VIEW.ACTIVE</code>. 「active」- 是否启用
     */
    @Override
    public Boolean getActive() {
        return (Boolean) get(17);
    }

    /**
     * Setter for <code>ZDB.UI_VIEW.ACTIVE</code>. 「active」- 是否启用
     */
    @Override
    public UiViewRecord setActive(Boolean value) {
        set(17, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.UI_VIEW.METADATA</code>. 「metadata」- 附加配置数据
     */
    @Override
    public String getMetadata() {
        return (String) get(18);
    }

    /**
     * Setter for <code>ZDB.UI_VIEW.METADATA</code>. 「metadata」- 附加配置数据
     */
    @Override
    public UiViewRecord setMetadata(String value) {
        set(18, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.UI_VIEW.CREATED_AT</code>. 「createdAt」- 创建时间
     */
    @Override
    public LocalDateTime getCreatedAt() {
        return (LocalDateTime) get(19);
    }

    /**
     * Setter for <code>ZDB.UI_VIEW.CREATED_AT</code>. 「createdAt」- 创建时间
     */
    @Override
    public UiViewRecord setCreatedAt(LocalDateTime value) {
        set(19, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.UI_VIEW.CREATED_BY</code>. 「createdBy」- 创建人
     */
    @Override
    public String getCreatedBy() {
        return (String) get(20);
    }

    /**
     * Setter for <code>ZDB.UI_VIEW.CREATED_BY</code>. 「createdBy」- 创建人
     */
    @Override
    public UiViewRecord setCreatedBy(String value) {
        set(20, value);
        return this;
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * Getter for <code>ZDB.UI_VIEW.UPDATED_AT</code>. 「updatedAt」- 更新时间
     */
    @Override
    public LocalDateTime getUpdatedAt() {
        return (LocalDateTime) get(21);
    }

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    /**
     * Setter for <code>ZDB.UI_VIEW.UPDATED_AT</code>. 「updatedAt」- 更新时间
     */
    @Override
    public UiViewRecord setUpdatedAt(LocalDateTime value) {
        set(21, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.UI_VIEW.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    @Override
    public String getUpdatedBy() {
        return (String) get(22);
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Setter for <code>ZDB.UI_VIEW.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    @Override
    public UiViewRecord setUpdatedBy(String value) {
        set(22, value);
        return this;
    }

    @Override
    public Record1<String> key() {
        return (Record1) super.key();
    }

    @Override
    public void from(IUiView from) {
        setKey(from.getKey());
        setName(from.getName());
        setCode(from.getCode());
        setSort(from.getSort());
        setIdentifier(from.getIdentifier());
        setWorkflow(from.getWorkflow());
        setView(from.getView());
        setPosition(from.getPosition());
        setTitle(from.getTitle());
        setProjection(from.getProjection());
        setCriteria(from.getCriteria());
        setRows(from.getRows());
        setUiConfig(from.getUiConfig());
        setQrComponent(from.getQrComponent());
        setQrConfig(from.getQrConfig());
        setSigma(from.getSigma());
        setLanguage(from.getLanguage());
        setActive(from.getActive());
        setMetadata(from.getMetadata());
        setCreatedAt(from.getCreatedAt());
        setCreatedBy(from.getCreatedBy());
        setUpdatedAt(from.getUpdatedAt());
        setUpdatedBy(from.getUpdatedBy());
        resetChangedOnNotNull();
    }

    @Override
    public <E extends IUiView> E into(E into) {
        into.from(this);
        return into;
    }
}