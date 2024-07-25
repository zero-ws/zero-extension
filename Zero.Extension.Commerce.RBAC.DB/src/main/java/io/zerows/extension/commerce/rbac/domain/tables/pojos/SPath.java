/*
 * This file is generated by jOOQ.
 */
package io.zerows.extension.commerce.rbac.domain.tables.pojos;


import io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo;
import io.zerows.extension.commerce.rbac.domain.tables.interfaces.ISPath;

import java.time.LocalDateTime;


import static io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo.*;
/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class SPath implements VertxPojo, ISPath {

    private static final long serialVersionUID = 1L;

    private String key;
    private String name;
    private String code;
    private String phase;
    private String mapping;
    private String parentId;
    private String runComponent;
    private String runType;
    private String dmType;
    private String dmComponent;
    private String dmCondition;
    private String dmConfig;
    private String uiType;
    private String uiConfig;
    private String uiCondition;
    private String uiComponent;
    private String uiSurface;
    private Integer uiSort;
    private String sigma;
    private String language;
    private Boolean active;
    private String metadata;
    private LocalDateTime createdAt;
    private String createdBy;
    private LocalDateTime updatedAt;
    private String updatedBy;

    public SPath() {}

    public SPath(ISPath value) {
        this.key = value.getKey();
        this.name = value.getName();
        this.code = value.getCode();
        this.phase = value.getPhase();
        this.mapping = value.getMapping();
        this.parentId = value.getParentId();
        this.runComponent = value.getRunComponent();
        this.runType = value.getRunType();
        this.dmType = value.getDmType();
        this.dmComponent = value.getDmComponent();
        this.dmCondition = value.getDmCondition();
        this.dmConfig = value.getDmConfig();
        this.uiType = value.getUiType();
        this.uiConfig = value.getUiConfig();
        this.uiCondition = value.getUiCondition();
        this.uiComponent = value.getUiComponent();
        this.uiSurface = value.getUiSurface();
        this.uiSort = value.getUiSort();
        this.sigma = value.getSigma();
        this.language = value.getLanguage();
        this.active = value.getActive();
        this.metadata = value.getMetadata();
        this.createdAt = value.getCreatedAt();
        this.createdBy = value.getCreatedBy();
        this.updatedAt = value.getUpdatedAt();
        this.updatedBy = value.getUpdatedBy();
    }

    public SPath(
        String key,
        String name,
        String code,
        String phase,
        String mapping,
        String parentId,
        String runComponent,
        String runType,
        String dmType,
        String dmComponent,
        String dmCondition,
        String dmConfig,
        String uiType,
        String uiConfig,
        String uiCondition,
        String uiComponent,
        String uiSurface,
        Integer uiSort,
        String sigma,
        String language,
        Boolean active,
        String metadata,
        LocalDateTime createdAt,
        String createdBy,
        LocalDateTime updatedAt,
        String updatedBy
    ) {
        this.key = key;
        this.name = name;
        this.code = code;
        this.phase = phase;
        this.mapping = mapping;
        this.parentId = parentId;
        this.runComponent = runComponent;
        this.runType = runType;
        this.dmType = dmType;
        this.dmComponent = dmComponent;
        this.dmCondition = dmCondition;
        this.dmConfig = dmConfig;
        this.uiType = uiType;
        this.uiConfig = uiConfig;
        this.uiCondition = uiCondition;
        this.uiComponent = uiComponent;
        this.uiSurface = uiSurface;
        this.uiSort = uiSort;
        this.sigma = sigma;
        this.language = language;
        this.active = active;
        this.metadata = metadata;
        this.createdAt = createdAt;
        this.createdBy = createdBy;
        this.updatedAt = updatedAt;
        this.updatedBy = updatedBy;
    }

        public SPath(io.vertx.core.json.JsonObject json) {
                this();
                fromJson(json);
        }

    /**
     * Getter for <code>ZDB.S_PATH.KEY</code>. 「key」- 规则主键
     */
    @Override
    public String getKey() {
        return this.key;
    }

    /**
     * Setter for <code>ZDB.S_PATH.KEY</code>. 「key」- 规则主键
     */
    @Override
    public SPath setKey(String key) {
        this.key = key;
        return this;
    }

    /**
     * Getter for <code>ZDB.S_PATH.NAME</code>. 「name」- 规则名称
     */
    @Override
    public String getName() {
        return this.name;
    }

    /**
     * Setter for <code>ZDB.S_PATH.NAME</code>. 「name」- 规则名称
     */
    @Override
    public SPath setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Getter for <code>ZDB.S_PATH.CODE</code>. 「code」- 系统界面标识
     */
    @Override
    public String getCode() {
        return this.code;
    }

    /**
     * Setter for <code>ZDB.S_PATH.CODE</code>. 「code」- 系统界面标识
     */
    @Override
    public SPath setCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * Getter for <code>ZDB.S_PATH.PHASE</code>. 「phase」- UI读取数据的操作周期
     */
    @Override
    public String getPhase() {
        return this.phase;
    }

    /**
     * Setter for <code>ZDB.S_PATH.PHASE</code>. 「phase」- UI读取数据的操作周期
     */
    @Override
    public SPath setPhase(String phase) {
        this.phase = phase;
        return this;
    }

    /**
     * Getter for <code>ZDB.S_PATH.MAPPING</code>. 「mapping」- 从 dm -&gt; ui 转换
     */
    @Override
    public String getMapping() {
        return this.mapping;
    }

    /**
     * Setter for <code>ZDB.S_PATH.MAPPING</code>. 「mapping」- 从 dm -&gt; ui 转换
     */
    @Override
    public SPath setMapping(String mapping) {
        this.mapping = mapping;
        return this;
    }

    /**
     * Getter for <code>ZDB.S_PATH.PARENT_ID</code>. 「parentId」-
     * 区域模式下的父ID，系统内部读取
     */
    @Override
    public String getParentId() {
        return this.parentId;
    }

    /**
     * Setter for <code>ZDB.S_PATH.PARENT_ID</code>. 「parentId」-
     * 区域模式下的父ID，系统内部读取
     */
    @Override
    public SPath setParentId(String parentId) {
        this.parentId = parentId;
        return this;
    }

    /**
     * Getter for <code>ZDB.S_PATH.RUN_COMPONENT</code>. 「runComponent」-
     * HValve执行组件，组件内置处理 dm / ui 两部分内容
     */
    @Override
    public String getRunComponent() {
        return this.runComponent;
    }

    /**
     * Setter for <code>ZDB.S_PATH.RUN_COMPONENT</code>. 「runComponent」-
     * HValve执行组件，组件内置处理 dm / ui 两部分内容
     */
    @Override
    public SPath setRunComponent(String runComponent) {
        this.runComponent = runComponent;
        return this;
    }

    /**
     * Getter for <code>ZDB.S_PATH.RUN_TYPE</code>. 「runType」- 视图管理类型（查询用）
     */
    @Override
    public String getRunType() {
        return this.runType;
    }

    /**
     * Setter for <code>ZDB.S_PATH.RUN_TYPE</code>. 「runType」- 视图管理类型（查询用）
     */
    @Override
    public SPath setRunType(String runType) {
        this.runType = runType;
        return this;
    }

    /**
     * Getter for <code>ZDB.S_PATH.DM_TYPE</code>. 「dmType」- 分组类型
     */
    @Override
    public String getDmType() {
        return this.dmType;
    }

    /**
     * Setter for <code>ZDB.S_PATH.DM_TYPE</code>. 「dmType」- 分组类型
     */
    @Override
    public SPath setDmType(String dmType) {
        this.dmType = dmType;
        return this;
    }

    /**
     * Getter for <code>ZDB.S_PATH.DM_COMPONENT</code>. 「dmComponent」-
     * 必须绑定组专用Dao组件
     */
    @Override
    public String getDmComponent() {
        return this.dmComponent;
    }

    /**
     * Setter for <code>ZDB.S_PATH.DM_COMPONENT</code>. 「dmComponent」-
     * 必须绑定组专用Dao组件
     */
    @Override
    public SPath setDmComponent(String dmComponent) {
        this.dmComponent = dmComponent;
        return this;
    }

    /**
     * Getter for <code>ZDB.S_PATH.DM_CONDITION</code>. 「dmCondition」- 分组条件
     */
    @Override
    public String getDmCondition() {
        return this.dmCondition;
    }

    /**
     * Setter for <code>ZDB.S_PATH.DM_CONDITION</code>. 「dmCondition」- 分组条件
     */
    @Override
    public SPath setDmCondition(String dmCondition) {
        this.dmCondition = dmCondition;
        return this;
    }

    /**
     * Getter for <code>ZDB.S_PATH.DM_CONFIG</code>. 「dmConfig」- 组配置信息，配置呈现部分
     */
    @Override
    public String getDmConfig() {
        return this.dmConfig;
    }

    /**
     * Setter for <code>ZDB.S_PATH.DM_CONFIG</code>. 「dmConfig」- 组配置信息，配置呈现部分
     */
    @Override
    public SPath setDmConfig(String dmConfig) {
        this.dmConfig = dmConfig;
        return this;
    }

    /**
     * Getter for <code>ZDB.S_PATH.UI_TYPE</code>. 「uiType」- 目标数据源类型
     */
    @Override
    public String getUiType() {
        return this.uiType;
    }

    /**
     * Setter for <code>ZDB.S_PATH.UI_TYPE</code>. 「uiType」- 目标数据源类型
     */
    @Override
    public SPath setUiType(String uiType) {
        this.uiType = uiType;
        return this;
    }

    /**
     * Getter for <code>ZDB.S_PATH.UI_CONFIG</code>. 「uiConfig」- 界面配置
     */
    @Override
    public String getUiConfig() {
        return this.uiConfig;
    }

    /**
     * Setter for <code>ZDB.S_PATH.UI_CONFIG</code>. 「uiConfig」- 界面配置
     */
    @Override
    public SPath setUiConfig(String uiConfig) {
        this.uiConfig = uiConfig;
        return this;
    }

    /**
     * Getter for <code>ZDB.S_PATH.UI_CONDITION</code>. 「uiCondition」- 查询模板
     */
    @Override
    public String getUiCondition() {
        return this.uiCondition;
    }

    /**
     * Setter for <code>ZDB.S_PATH.UI_CONDITION</code>. 「uiCondition」- 查询模板
     */
    @Override
    public SPath setUiCondition(String uiCondition) {
        this.uiCondition = uiCondition;
        return this;
    }

    /**
     * Getter for <code>ZDB.S_PATH.UI_COMPONENT</code>. 「uiComponent」- 特殊组件
     */
    @Override
    public String getUiComponent() {
        return this.uiComponent;
    }

    /**
     * Setter for <code>ZDB.S_PATH.UI_COMPONENT</code>. 「uiComponent」- 特殊组件
     */
    @Override
    public SPath setUiComponent(String uiComponent) {
        this.uiComponent = uiComponent;
        return this;
    }

    /**
     * Getter for <code>ZDB.S_PATH.UI_SURFACE</code>. 「uiSurface」-
     * 界面呈现模式，已经被降维之后（列表、树、其他等相关配置）
     */
    @Override
    public String getUiSurface() {
        return this.uiSurface;
    }

    /**
     * Setter for <code>ZDB.S_PATH.UI_SURFACE</code>. 「uiSurface」-
     * 界面呈现模式，已经被降维之后（列表、树、其他等相关配置）
     */
    @Override
    public SPath setUiSurface(String uiSurface) {
        this.uiSurface = uiSurface;
        return this;
    }

    /**
     * Getter for <code>ZDB.S_PATH.UI_SORT</code>. 「sort」- 该板块的排序（前端）
     */
    @Override
    public Integer getUiSort() {
        return this.uiSort;
    }

    /**
     * Setter for <code>ZDB.S_PATH.UI_SORT</code>. 「sort」- 该板块的排序（前端）
     */
    @Override
    public SPath setUiSort(Integer uiSort) {
        this.uiSort = uiSort;
        return this;
    }

    /**
     * Getter for <code>ZDB.S_PATH.SIGMA</code>. 「sigma」- 统一标识
     */
    @Override
    public String getSigma() {
        return this.sigma;
    }

    /**
     * Setter for <code>ZDB.S_PATH.SIGMA</code>. 「sigma」- 统一标识
     */
    @Override
    public SPath setSigma(String sigma) {
        this.sigma = sigma;
        return this;
    }

    /**
     * Getter for <code>ZDB.S_PATH.LANGUAGE</code>. 「language」- 使用的语言
     */
    @Override
    public String getLanguage() {
        return this.language;
    }

    /**
     * Setter for <code>ZDB.S_PATH.LANGUAGE</code>. 「language」- 使用的语言
     */
    @Override
    public SPath setLanguage(String language) {
        this.language = language;
        return this;
    }

    /**
     * Getter for <code>ZDB.S_PATH.ACTIVE</code>. 「active」- 是否启用
     */
    @Override
    public Boolean getActive() {
        return this.active;
    }

    /**
     * Setter for <code>ZDB.S_PATH.ACTIVE</code>. 「active」- 是否启用
     */
    @Override
    public SPath setActive(Boolean active) {
        this.active = active;
        return this;
    }

    /**
     * Getter for <code>ZDB.S_PATH.METADATA</code>. 「metadata」- 附加配置数据
     */
    @Override
    public String getMetadata() {
        return this.metadata;
    }

    /**
     * Setter for <code>ZDB.S_PATH.METADATA</code>. 「metadata」- 附加配置数据
     */
    @Override
    public SPath setMetadata(String metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * Getter for <code>ZDB.S_PATH.CREATED_AT</code>. 「createdAt」- 创建时间
     */
    @Override
    public LocalDateTime getCreatedAt() {
        return this.createdAt;
    }

    /**
     * Setter for <code>ZDB.S_PATH.CREATED_AT</code>. 「createdAt」- 创建时间
     */
    @Override
    public SPath setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * Getter for <code>ZDB.S_PATH.CREATED_BY</code>. 「createdBy」- 创建人
     */
    @Override
    public String getCreatedBy() {
        return this.createdBy;
    }

    /**
     * Setter for <code>ZDB.S_PATH.CREATED_BY</code>. 「createdBy」- 创建人
     */
    @Override
    public SPath setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    /**
     * Getter for <code>ZDB.S_PATH.UPDATED_AT</code>. 「updatedAt」- 更新时间
     */
    @Override
    public LocalDateTime getUpdatedAt() {
        return this.updatedAt;
    }

    /**
     * Setter for <code>ZDB.S_PATH.UPDATED_AT</code>. 「updatedAt」- 更新时间
     */
    @Override
    public SPath setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * Getter for <code>ZDB.S_PATH.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    @Override
    public String getUpdatedBy() {
        return this.updatedBy;
    }

    /**
     * Setter for <code>ZDB.S_PATH.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    @Override
    public SPath setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
        return this;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final SPath other = (SPath) obj;
        if (this.key == null) {
            if (other.key != null)
                return false;
        }
        else if (!this.key.equals(other.key))
            return false;
        if (this.name == null) {
            if (other.name != null)
                return false;
        }
        else if (!this.name.equals(other.name))
            return false;
        if (this.code == null) {
            if (other.code != null)
                return false;
        }
        else if (!this.code.equals(other.code))
            return false;
        if (this.phase == null) {
            if (other.phase != null)
                return false;
        }
        else if (!this.phase.equals(other.phase))
            return false;
        if (this.mapping == null) {
            if (other.mapping != null)
                return false;
        }
        else if (!this.mapping.equals(other.mapping))
            return false;
        if (this.parentId == null) {
            if (other.parentId != null)
                return false;
        }
        else if (!this.parentId.equals(other.parentId))
            return false;
        if (this.runComponent == null) {
            if (other.runComponent != null)
                return false;
        }
        else if (!this.runComponent.equals(other.runComponent))
            return false;
        if (this.runType == null) {
            if (other.runType != null)
                return false;
        }
        else if (!this.runType.equals(other.runType))
            return false;
        if (this.dmType == null) {
            if (other.dmType != null)
                return false;
        }
        else if (!this.dmType.equals(other.dmType))
            return false;
        if (this.dmComponent == null) {
            if (other.dmComponent != null)
                return false;
        }
        else if (!this.dmComponent.equals(other.dmComponent))
            return false;
        if (this.dmCondition == null) {
            if (other.dmCondition != null)
                return false;
        }
        else if (!this.dmCondition.equals(other.dmCondition))
            return false;
        if (this.dmConfig == null) {
            if (other.dmConfig != null)
                return false;
        }
        else if (!this.dmConfig.equals(other.dmConfig))
            return false;
        if (this.uiType == null) {
            if (other.uiType != null)
                return false;
        }
        else if (!this.uiType.equals(other.uiType))
            return false;
        if (this.uiConfig == null) {
            if (other.uiConfig != null)
                return false;
        }
        else if (!this.uiConfig.equals(other.uiConfig))
            return false;
        if (this.uiCondition == null) {
            if (other.uiCondition != null)
                return false;
        }
        else if (!this.uiCondition.equals(other.uiCondition))
            return false;
        if (this.uiComponent == null) {
            if (other.uiComponent != null)
                return false;
        }
        else if (!this.uiComponent.equals(other.uiComponent))
            return false;
        if (this.uiSurface == null) {
            if (other.uiSurface != null)
                return false;
        }
        else if (!this.uiSurface.equals(other.uiSurface))
            return false;
        if (this.uiSort == null) {
            if (other.uiSort != null)
                return false;
        }
        else if (!this.uiSort.equals(other.uiSort))
            return false;
        if (this.sigma == null) {
            if (other.sigma != null)
                return false;
        }
        else if (!this.sigma.equals(other.sigma))
            return false;
        if (this.language == null) {
            if (other.language != null)
                return false;
        }
        else if (!this.language.equals(other.language))
            return false;
        if (this.active == null) {
            if (other.active != null)
                return false;
        }
        else if (!this.active.equals(other.active))
            return false;
        if (this.metadata == null) {
            if (other.metadata != null)
                return false;
        }
        else if (!this.metadata.equals(other.metadata))
            return false;
        if (this.createdAt == null) {
            if (other.createdAt != null)
                return false;
        }
        else if (!this.createdAt.equals(other.createdAt))
            return false;
        if (this.createdBy == null) {
            if (other.createdBy != null)
                return false;
        }
        else if (!this.createdBy.equals(other.createdBy))
            return false;
        if (this.updatedAt == null) {
            if (other.updatedAt != null)
                return false;
        }
        else if (!this.updatedAt.equals(other.updatedAt))
            return false;
        if (this.updatedBy == null) {
            if (other.updatedBy != null)
                return false;
        }
        else if (!this.updatedBy.equals(other.updatedBy))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.key == null) ? 0 : this.key.hashCode());
        result = prime * result + ((this.name == null) ? 0 : this.name.hashCode());
        result = prime * result + ((this.code == null) ? 0 : this.code.hashCode());
        result = prime * result + ((this.phase == null) ? 0 : this.phase.hashCode());
        result = prime * result + ((this.mapping == null) ? 0 : this.mapping.hashCode());
        result = prime * result + ((this.parentId == null) ? 0 : this.parentId.hashCode());
        result = prime * result + ((this.runComponent == null) ? 0 : this.runComponent.hashCode());
        result = prime * result + ((this.runType == null) ? 0 : this.runType.hashCode());
        result = prime * result + ((this.dmType == null) ? 0 : this.dmType.hashCode());
        result = prime * result + ((this.dmComponent == null) ? 0 : this.dmComponent.hashCode());
        result = prime * result + ((this.dmCondition == null) ? 0 : this.dmCondition.hashCode());
        result = prime * result + ((this.dmConfig == null) ? 0 : this.dmConfig.hashCode());
        result = prime * result + ((this.uiType == null) ? 0 : this.uiType.hashCode());
        result = prime * result + ((this.uiConfig == null) ? 0 : this.uiConfig.hashCode());
        result = prime * result + ((this.uiCondition == null) ? 0 : this.uiCondition.hashCode());
        result = prime * result + ((this.uiComponent == null) ? 0 : this.uiComponent.hashCode());
        result = prime * result + ((this.uiSurface == null) ? 0 : this.uiSurface.hashCode());
        result = prime * result + ((this.uiSort == null) ? 0 : this.uiSort.hashCode());
        result = prime * result + ((this.sigma == null) ? 0 : this.sigma.hashCode());
        result = prime * result + ((this.language == null) ? 0 : this.language.hashCode());
        result = prime * result + ((this.active == null) ? 0 : this.active.hashCode());
        result = prime * result + ((this.metadata == null) ? 0 : this.metadata.hashCode());
        result = prime * result + ((this.createdAt == null) ? 0 : this.createdAt.hashCode());
        result = prime * result + ((this.createdBy == null) ? 0 : this.createdBy.hashCode());
        result = prime * result + ((this.updatedAt == null) ? 0 : this.updatedAt.hashCode());
        result = prime * result + ((this.updatedBy == null) ? 0 : this.updatedBy.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("SPath (");

        sb.append(key);
        sb.append(", ").append(name);
        sb.append(", ").append(code);
        sb.append(", ").append(phase);
        sb.append(", ").append(mapping);
        sb.append(", ").append(parentId);
        sb.append(", ").append(runComponent);
        sb.append(", ").append(runType);
        sb.append(", ").append(dmType);
        sb.append(", ").append(dmComponent);
        sb.append(", ").append(dmCondition);
        sb.append(", ").append(dmConfig);
        sb.append(", ").append(uiType);
        sb.append(", ").append(uiConfig);
        sb.append(", ").append(uiCondition);
        sb.append(", ").append(uiComponent);
        sb.append(", ").append(uiSurface);
        sb.append(", ").append(uiSort);
        sb.append(", ").append(sigma);
        sb.append(", ").append(language);
        sb.append(", ").append(active);
        sb.append(", ").append(metadata);
        sb.append(", ").append(createdAt);
        sb.append(", ").append(createdBy);
        sb.append(", ").append(updatedAt);
        sb.append(", ").append(updatedBy);

        sb.append(")");
        return sb.toString();
    }

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    @Override
    public void from(ISPath from) {
        setKey(from.getKey());
        setName(from.getName());
        setCode(from.getCode());
        setPhase(from.getPhase());
        setMapping(from.getMapping());
        setParentId(from.getParentId());
        setRunComponent(from.getRunComponent());
        setRunType(from.getRunType());
        setDmType(from.getDmType());
        setDmComponent(from.getDmComponent());
        setDmCondition(from.getDmCondition());
        setDmConfig(from.getDmConfig());
        setUiType(from.getUiType());
        setUiConfig(from.getUiConfig());
        setUiCondition(from.getUiCondition());
        setUiComponent(from.getUiComponent());
        setUiSurface(from.getUiSurface());
        setUiSort(from.getUiSort());
        setSigma(from.getSigma());
        setLanguage(from.getLanguage());
        setActive(from.getActive());
        setMetadata(from.getMetadata());
        setCreatedAt(from.getCreatedAt());
        setCreatedBy(from.getCreatedBy());
        setUpdatedAt(from.getUpdatedAt());
        setUpdatedBy(from.getUpdatedBy());
    }

    @Override
    public <E extends ISPath> E into(E into) {
        into.from(this);
        return into;
    }
}
