/*
 * This file is generated by jOOQ.
 */
package io.zerows.extension.runtime.workflow.domain.tables.pojos;


import io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo;
import io.zerows.extension.runtime.workflow.domain.tables.interfaces.IWFlow;

import java.time.LocalDateTime;

/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({"all", "unchecked", "rawtypes"})
public class WFlow implements VertxPojo, IWFlow {

    private static final long serialVersionUID = 1L;

    private String key;
    private String name;
    private String code;
    private String type;
    private String definitionKey;
    private String authorizedComponent;
    private String authorizedConfig;
    private String generateComponent;
    private String generateConfig;
    private String runComponent;
    private String runConfig;
    private String startComponent;
    private String startConfig;
    private String endComponent;
    private String endConfig;
    private String uiComponent;
    private String uiConfig;
    private String uiAssist;
    private String uiLinkage;
    private String comment;
    private Boolean active;
    private String sigma;
    private String metadata;
    private String language;
    private LocalDateTime createdAt;
    private String createdBy;
    private LocalDateTime updatedAt;
    private String updatedBy;

    public WFlow() {
    }

    public WFlow(IWFlow value) {
        this.key = value.getKey();
        this.name = value.getName();
        this.code = value.getCode();
        this.type = value.getType();
        this.definitionKey = value.getDefinitionKey();
        this.authorizedComponent = value.getAuthorizedComponent();
        this.authorizedConfig = value.getAuthorizedConfig();
        this.generateComponent = value.getGenerateComponent();
        this.generateConfig = value.getGenerateConfig();
        this.runComponent = value.getRunComponent();
        this.runConfig = value.getRunConfig();
        this.startComponent = value.getStartComponent();
        this.startConfig = value.getStartConfig();
        this.endComponent = value.getEndComponent();
        this.endConfig = value.getEndConfig();
        this.uiComponent = value.getUiComponent();
        this.uiConfig = value.getUiConfig();
        this.uiAssist = value.getUiAssist();
        this.uiLinkage = value.getUiLinkage();
        this.comment = value.getComment();
        this.active = value.getActive();
        this.sigma = value.getSigma();
        this.metadata = value.getMetadata();
        this.language = value.getLanguage();
        this.createdAt = value.getCreatedAt();
        this.createdBy = value.getCreatedBy();
        this.updatedAt = value.getUpdatedAt();
        this.updatedBy = value.getUpdatedBy();
    }

    public WFlow(
        String key,
        String name,
        String code,
        String type,
        String definitionKey,
        String authorizedComponent,
        String authorizedConfig,
        String generateComponent,
        String generateConfig,
        String runComponent,
        String runConfig,
        String startComponent,
        String startConfig,
        String endComponent,
        String endConfig,
        String uiComponent,
        String uiConfig,
        String uiAssist,
        String uiLinkage,
        String comment,
        Boolean active,
        String sigma,
        String metadata,
        String language,
        LocalDateTime createdAt,
        String createdBy,
        LocalDateTime updatedAt,
        String updatedBy
    ) {
        this.key = key;
        this.name = name;
        this.code = code;
        this.type = type;
        this.definitionKey = definitionKey;
        this.authorizedComponent = authorizedComponent;
        this.authorizedConfig = authorizedConfig;
        this.generateComponent = generateComponent;
        this.generateConfig = generateConfig;
        this.runComponent = runComponent;
        this.runConfig = runConfig;
        this.startComponent = startComponent;
        this.startConfig = startConfig;
        this.endComponent = endComponent;
        this.endConfig = endConfig;
        this.uiComponent = uiComponent;
        this.uiConfig = uiConfig;
        this.uiAssist = uiAssist;
        this.uiLinkage = uiLinkage;
        this.comment = comment;
        this.active = active;
        this.sigma = sigma;
        this.metadata = metadata;
        this.language = language;
        this.createdAt = createdAt;
        this.createdBy = createdBy;
        this.updatedAt = updatedAt;
        this.updatedBy = updatedBy;
    }

    public WFlow(io.vertx.core.json.JsonObject json) {
        this();
        fromJson(json);
    }

    /**
     * Getter for <code>ZDB.W_FLOW.KEY</code>. 「key」- 流程定义主键
     */
    @Override
    public String getKey() {
        return this.key;
    }

    /**
     * Setter for <code>ZDB.W_FLOW.KEY</code>. 「key」- 流程定义主键
     */
    @Override
    public WFlow setKey(String key) {
        this.key = key;
        return this;
    }

    /**
     * Getter for <code>ZDB.W_FLOW.NAME</code>. 「name」- 流程定义名称
     */
    @Override
    public String getName() {
        return this.name;
    }

    /**
     * Setter for <code>ZDB.W_FLOW.NAME</code>. 「name」- 流程定义名称
     */
    @Override
    public WFlow setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Getter for <code>ZDB.W_FLOW.CODE</code>. 「code」- 流程定义编号（系统可用）
     */
    @Override
    public String getCode() {
        return this.code;
    }

    /**
     * Setter for <code>ZDB.W_FLOW.CODE</code>. 「code」- 流程定义编号（系统可用）
     */
    @Override
    public WFlow setCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * Getter for <code>ZDB.W_FLOW.TYPE</code>. 「type」- 流程类型，对接
     * zero.workflow.cat的X_TABULAR
     */
    @Override
    public String getType() {
        return this.type;
    }

    /**
     * Setter for <code>ZDB.W_FLOW.TYPE</code>. 「type」- 流程类型，对接
     * zero.workflow.cat的X_TABULAR
     */
    @Override
    public WFlow setType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Getter for <code>ZDB.W_FLOW.DEFINITION_KEY</code>. 「definitionKey」-
     * 定义ID（读取流程图所需）, getProcessDefinitionId
     */
    @Override
    public String getDefinitionKey() {
        return this.definitionKey;
    }

    /**
     * Setter for <code>ZDB.W_FLOW.DEFINITION_KEY</code>. 「definitionKey」-
     * 定义ID（读取流程图所需）, getProcessDefinitionId
     */
    @Override
    public WFlow setDefinitionKey(String definitionKey) {
        this.definitionKey = definitionKey;
        return this;
    }

    /**
     * Getter for <code>ZDB.W_FLOW.AUTHORIZED_COMPONENT</code>.
     * 「authorizedComponent」- 流程授权组件
     */
    @Override
    public String getAuthorizedComponent() {
        return this.authorizedComponent;
    }

    /**
     * Setter for <code>ZDB.W_FLOW.AUTHORIZED_COMPONENT</code>.
     * 「authorizedComponent」- 流程授权组件
     */
    @Override
    public WFlow setAuthorizedComponent(String authorizedComponent) {
        this.authorizedComponent = authorizedComponent;
        return this;
    }

    /**
     * Getter for <code>ZDB.W_FLOW.AUTHORIZED_CONFIG</code>. 「authorizedConfig」-
     * 流程授权配置
     */
    @Override
    public String getAuthorizedConfig() {
        return this.authorizedConfig;
    }

    /**
     * Setter for <code>ZDB.W_FLOW.AUTHORIZED_CONFIG</code>. 「authorizedConfig」-
     * 流程授权配置
     */
    @Override
    public WFlow setAuthorizedConfig(String authorizedConfig) {
        this.authorizedConfig = authorizedConfig;
        return this;
    }

    /**
     * Getter for <code>ZDB.W_FLOW.GENERATE_COMPONENT</code>.
     * 「generateComponent」- Todo生成组件
     */
    @Override
    public String getGenerateComponent() {
        return this.generateComponent;
    }

    /**
     * Setter for <code>ZDB.W_FLOW.GENERATE_COMPONENT</code>.
     * 「generateComponent」- Todo生成组件
     */
    @Override
    public WFlow setGenerateComponent(String generateComponent) {
        this.generateComponent = generateComponent;
        return this;
    }

    /**
     * Getter for <code>ZDB.W_FLOW.GENERATE_CONFIG</code>. 「generateConfig」-
     * Todo生成配置
     */
    @Override
    public String getGenerateConfig() {
        return this.generateConfig;
    }

    /**
     * Setter for <code>ZDB.W_FLOW.GENERATE_CONFIG</code>. 「generateConfig」-
     * Todo生成配置
     */
    @Override
    public WFlow setGenerateConfig(String generateConfig) {
        this.generateConfig = generateConfig;
        return this;
    }

    /**
     * Getter for <code>ZDB.W_FLOW.RUN_COMPONENT</code>. 「runComponent」- 执行组件
     */
    @Override
    public String getRunComponent() {
        return this.runComponent;
    }

    /**
     * Setter for <code>ZDB.W_FLOW.RUN_COMPONENT</code>. 「runComponent」- 执行组件
     */
    @Override
    public WFlow setRunComponent(String runComponent) {
        this.runComponent = runComponent;
        return this;
    }

    /**
     * Getter for <code>ZDB.W_FLOW.RUN_CONFIG</code>. 「runConfig」- 执行配置
     */
    @Override
    public String getRunConfig() {
        return this.runConfig;
    }

    /**
     * Setter for <code>ZDB.W_FLOW.RUN_CONFIG</code>. 「runConfig」- 执行配置
     */
    @Override
    public WFlow setRunConfig(String runConfig) {
        this.runConfig = runConfig;
        return this;
    }

    /**
     * Getter for <code>ZDB.W_FLOW.START_COMPONENT</code>. 「startComponent」-
     * 启动组件
     */
    @Override
    public String getStartComponent() {
        return this.startComponent;
    }

    /**
     * Setter for <code>ZDB.W_FLOW.START_COMPONENT</code>. 「startComponent」-
     * 启动组件
     */
    @Override
    public WFlow setStartComponent(String startComponent) {
        this.startComponent = startComponent;
        return this;
    }

    /**
     * Getter for <code>ZDB.W_FLOW.START_CONFIG</code>. 「startConfig」- 启动配置
     */
    @Override
    public String getStartConfig() {
        return this.startConfig;
    }

    /**
     * Setter for <code>ZDB.W_FLOW.START_CONFIG</code>. 「startConfig」- 启动配置
     */
    @Override
    public WFlow setStartConfig(String startConfig) {
        this.startConfig = startConfig;
        return this;
    }

    /**
     * Getter for <code>ZDB.W_FLOW.END_COMPONENT</code>. 「endComponent」- 完成组件
     */
    @Override
    public String getEndComponent() {
        return this.endComponent;
    }

    /**
     * Setter for <code>ZDB.W_FLOW.END_COMPONENT</code>. 「endComponent」- 完成组件
     */
    @Override
    public WFlow setEndComponent(String endComponent) {
        this.endComponent = endComponent;
        return this;
    }

    /**
     * Getter for <code>ZDB.W_FLOW.END_CONFIG</code>. 「endConfig」- 完成配置
     */
    @Override
    public String getEndConfig() {
        return this.endConfig;
    }

    /**
     * Setter for <code>ZDB.W_FLOW.END_CONFIG</code>. 「endConfig」- 完成配置
     */
    @Override
    public WFlow setEndConfig(String endConfig) {
        this.endConfig = endConfig;
        return this;
    }

    /**
     * Getter for <code>ZDB.W_FLOW.UI_COMPONENT</code>. 「uiComponent」- 界面组件
     */
    @Override
    public String getUiComponent() {
        return this.uiComponent;
    }

    /**
     * Setter for <code>ZDB.W_FLOW.UI_COMPONENT</code>. 「uiComponent」- 界面组件
     */
    @Override
    public WFlow setUiComponent(String uiComponent) {
        this.uiComponent = uiComponent;
        return this;
    }

    /**
     * Getter for <code>ZDB.W_FLOW.UI_CONFIG</code>. 「uiConfig」- 界面配置
     */
    @Override
    public String getUiConfig() {
        return this.uiConfig;
    }

    /**
     * Setter for <code>ZDB.W_FLOW.UI_CONFIG</code>. 「uiConfig」- 界面配置
     */
    @Override
    public WFlow setUiConfig(String uiConfig) {
        this.uiConfig = uiConfig;
        return this;
    }

    /**
     * Getter for <code>ZDB.W_FLOW.UI_ASSIST</code>. 「uiAssist」- 界面辅助数据专用配置
     */
    @Override
    public String getUiAssist() {
        return this.uiAssist;
    }

    /**
     * Setter for <code>ZDB.W_FLOW.UI_ASSIST</code>. 「uiAssist」- 界面辅助数据专用配置
     */
    @Override
    public WFlow setUiAssist(String uiAssist) {
        this.uiAssist = uiAssist;
        return this;
    }

    /**
     * Getter for <code>ZDB.W_FLOW.UI_LINKAGE</code>. 「uiLinkage」-
     * 关联部分专用配置：关联工单、关联资产、关联附件
     */
    @Override
    public String getUiLinkage() {
        return this.uiLinkage;
    }

    /**
     * Setter for <code>ZDB.W_FLOW.UI_LINKAGE</code>. 「uiLinkage」-
     * 关联部分专用配置：关联工单、关联资产、关联附件
     */
    @Override
    public WFlow setUiLinkage(String uiLinkage) {
        this.uiLinkage = uiLinkage;
        return this;
    }

    /**
     * Getter for <code>ZDB.W_FLOW.COMMENT</code>. 「comment」 - 流程定义备注
     */
    @Override
    public String getComment() {
        return this.comment;
    }

    /**
     * Setter for <code>ZDB.W_FLOW.COMMENT</code>. 「comment」 - 流程定义备注
     */
    @Override
    public WFlow setComment(String comment) {
        this.comment = comment;
        return this;
    }

    /**
     * Getter for <code>ZDB.W_FLOW.ACTIVE</code>. 「active」- 是否启用
     */
    @Override
    public Boolean getActive() {
        return this.active;
    }

    /**
     * Setter for <code>ZDB.W_FLOW.ACTIVE</code>. 「active」- 是否启用
     */
    @Override
    public WFlow setActive(Boolean active) {
        this.active = active;
        return this;
    }

    /**
     * Getter for <code>ZDB.W_FLOW.SIGMA</code>. 「sigma」- 统一标识
     */
    @Override
    public String getSigma() {
        return this.sigma;
    }

    /**
     * Setter for <code>ZDB.W_FLOW.SIGMA</code>. 「sigma」- 统一标识
     */
    @Override
    public WFlow setSigma(String sigma) {
        this.sigma = sigma;
        return this;
    }

    /**
     * Getter for <code>ZDB.W_FLOW.METADATA</code>. 「metadata」- 附加配置
     */
    @Override
    public String getMetadata() {
        return this.metadata;
    }

    /**
     * Setter for <code>ZDB.W_FLOW.METADATA</code>. 「metadata」- 附加配置
     */
    @Override
    public WFlow setMetadata(String metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * Getter for <code>ZDB.W_FLOW.LANGUAGE</code>. 「language」- 使用的语言
     */
    @Override
    public String getLanguage() {
        return this.language;
    }

    /**
     * Setter for <code>ZDB.W_FLOW.LANGUAGE</code>. 「language」- 使用的语言
     */
    @Override
    public WFlow setLanguage(String language) {
        this.language = language;
        return this;
    }

    /**
     * Getter for <code>ZDB.W_FLOW.CREATED_AT</code>. 「createdAt」- 创建时间
     */
    @Override
    public LocalDateTime getCreatedAt() {
        return this.createdAt;
    }

    /**
     * Setter for <code>ZDB.W_FLOW.CREATED_AT</code>. 「createdAt」- 创建时间
     */
    @Override
    public WFlow setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * Getter for <code>ZDB.W_FLOW.CREATED_BY</code>. 「createdBy」- 创建人
     */
    @Override
    public String getCreatedBy() {
        return this.createdBy;
    }

    /**
     * Setter for <code>ZDB.W_FLOW.CREATED_BY</code>. 「createdBy」- 创建人
     */
    @Override
    public WFlow setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    /**
     * Getter for <code>ZDB.W_FLOW.UPDATED_AT</code>. 「updatedAt」- 更新时间
     */
    @Override
    public LocalDateTime getUpdatedAt() {
        return this.updatedAt;
    }

    /**
     * Setter for <code>ZDB.W_FLOW.UPDATED_AT</code>. 「updatedAt」- 更新时间
     */
    @Override
    public WFlow setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * Getter for <code>ZDB.W_FLOW.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    @Override
    public String getUpdatedBy() {
        return this.updatedBy;
    }

    /**
     * Setter for <code>ZDB.W_FLOW.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    @Override
    public WFlow setUpdatedBy(String updatedBy) {
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
        final WFlow other = (WFlow) obj;
        if (this.key == null) {
            if (other.key != null)
                return false;
        } else if (!this.key.equals(other.key))
            return false;
        if (this.name == null) {
            if (other.name != null)
                return false;
        } else if (!this.name.equals(other.name))
            return false;
        if (this.code == null) {
            if (other.code != null)
                return false;
        } else if (!this.code.equals(other.code))
            return false;
        if (this.type == null) {
            if (other.type != null)
                return false;
        } else if (!this.type.equals(other.type))
            return false;
        if (this.definitionKey == null) {
            if (other.definitionKey != null)
                return false;
        } else if (!this.definitionKey.equals(other.definitionKey))
            return false;
        if (this.authorizedComponent == null) {
            if (other.authorizedComponent != null)
                return false;
        } else if (!this.authorizedComponent.equals(other.authorizedComponent))
            return false;
        if (this.authorizedConfig == null) {
            if (other.authorizedConfig != null)
                return false;
        } else if (!this.authorizedConfig.equals(other.authorizedConfig))
            return false;
        if (this.generateComponent == null) {
            if (other.generateComponent != null)
                return false;
        } else if (!this.generateComponent.equals(other.generateComponent))
            return false;
        if (this.generateConfig == null) {
            if (other.generateConfig != null)
                return false;
        } else if (!this.generateConfig.equals(other.generateConfig))
            return false;
        if (this.runComponent == null) {
            if (other.runComponent != null)
                return false;
        } else if (!this.runComponent.equals(other.runComponent))
            return false;
        if (this.runConfig == null) {
            if (other.runConfig != null)
                return false;
        } else if (!this.runConfig.equals(other.runConfig))
            return false;
        if (this.startComponent == null) {
            if (other.startComponent != null)
                return false;
        } else if (!this.startComponent.equals(other.startComponent))
            return false;
        if (this.startConfig == null) {
            if (other.startConfig != null)
                return false;
        } else if (!this.startConfig.equals(other.startConfig))
            return false;
        if (this.endComponent == null) {
            if (other.endComponent != null)
                return false;
        } else if (!this.endComponent.equals(other.endComponent))
            return false;
        if (this.endConfig == null) {
            if (other.endConfig != null)
                return false;
        } else if (!this.endConfig.equals(other.endConfig))
            return false;
        if (this.uiComponent == null) {
            if (other.uiComponent != null)
                return false;
        } else if (!this.uiComponent.equals(other.uiComponent))
            return false;
        if (this.uiConfig == null) {
            if (other.uiConfig != null)
                return false;
        } else if (!this.uiConfig.equals(other.uiConfig))
            return false;
        if (this.uiAssist == null) {
            if (other.uiAssist != null)
                return false;
        } else if (!this.uiAssist.equals(other.uiAssist))
            return false;
        if (this.uiLinkage == null) {
            if (other.uiLinkage != null)
                return false;
        } else if (!this.uiLinkage.equals(other.uiLinkage))
            return false;
        if (this.comment == null) {
            if (other.comment != null)
                return false;
        } else if (!this.comment.equals(other.comment))
            return false;
        if (this.active == null) {
            if (other.active != null)
                return false;
        } else if (!this.active.equals(other.active))
            return false;
        if (this.sigma == null) {
            if (other.sigma != null)
                return false;
        } else if (!this.sigma.equals(other.sigma))
            return false;
        if (this.metadata == null) {
            if (other.metadata != null)
                return false;
        } else if (!this.metadata.equals(other.metadata))
            return false;
        if (this.language == null) {
            if (other.language != null)
                return false;
        } else if (!this.language.equals(other.language))
            return false;
        if (this.createdAt == null) {
            if (other.createdAt != null)
                return false;
        } else if (!this.createdAt.equals(other.createdAt))
            return false;
        if (this.createdBy == null) {
            if (other.createdBy != null)
                return false;
        } else if (!this.createdBy.equals(other.createdBy))
            return false;
        if (this.updatedAt == null) {
            if (other.updatedAt != null)
                return false;
        } else if (!this.updatedAt.equals(other.updatedAt))
            return false;
        if (this.updatedBy == null) {
            if (other.updatedBy != null)
                return false;
        } else if (!this.updatedBy.equals(other.updatedBy))
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
        result = prime * result + ((this.type == null) ? 0 : this.type.hashCode());
        result = prime * result + ((this.definitionKey == null) ? 0 : this.definitionKey.hashCode());
        result = prime * result + ((this.authorizedComponent == null) ? 0 : this.authorizedComponent.hashCode());
        result = prime * result + ((this.authorizedConfig == null) ? 0 : this.authorizedConfig.hashCode());
        result = prime * result + ((this.generateComponent == null) ? 0 : this.generateComponent.hashCode());
        result = prime * result + ((this.generateConfig == null) ? 0 : this.generateConfig.hashCode());
        result = prime * result + ((this.runComponent == null) ? 0 : this.runComponent.hashCode());
        result = prime * result + ((this.runConfig == null) ? 0 : this.runConfig.hashCode());
        result = prime * result + ((this.startComponent == null) ? 0 : this.startComponent.hashCode());
        result = prime * result + ((this.startConfig == null) ? 0 : this.startConfig.hashCode());
        result = prime * result + ((this.endComponent == null) ? 0 : this.endComponent.hashCode());
        result = prime * result + ((this.endConfig == null) ? 0 : this.endConfig.hashCode());
        result = prime * result + ((this.uiComponent == null) ? 0 : this.uiComponent.hashCode());
        result = prime * result + ((this.uiConfig == null) ? 0 : this.uiConfig.hashCode());
        result = prime * result + ((this.uiAssist == null) ? 0 : this.uiAssist.hashCode());
        result = prime * result + ((this.uiLinkage == null) ? 0 : this.uiLinkage.hashCode());
        result = prime * result + ((this.comment == null) ? 0 : this.comment.hashCode());
        result = prime * result + ((this.active == null) ? 0 : this.active.hashCode());
        result = prime * result + ((this.sigma == null) ? 0 : this.sigma.hashCode());
        result = prime * result + ((this.metadata == null) ? 0 : this.metadata.hashCode());
        result = prime * result + ((this.language == null) ? 0 : this.language.hashCode());
        result = prime * result + ((this.createdAt == null) ? 0 : this.createdAt.hashCode());
        result = prime * result + ((this.createdBy == null) ? 0 : this.createdBy.hashCode());
        result = prime * result + ((this.updatedAt == null) ? 0 : this.updatedAt.hashCode());
        result = prime * result + ((this.updatedBy == null) ? 0 : this.updatedBy.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("WFlow (");

        sb.append(key);
        sb.append(", ").append(name);
        sb.append(", ").append(code);
        sb.append(", ").append(type);
        sb.append(", ").append(definitionKey);
        sb.append(", ").append(authorizedComponent);
        sb.append(", ").append(authorizedConfig);
        sb.append(", ").append(generateComponent);
        sb.append(", ").append(generateConfig);
        sb.append(", ").append(runComponent);
        sb.append(", ").append(runConfig);
        sb.append(", ").append(startComponent);
        sb.append(", ").append(startConfig);
        sb.append(", ").append(endComponent);
        sb.append(", ").append(endConfig);
        sb.append(", ").append(uiComponent);
        sb.append(", ").append(uiConfig);
        sb.append(", ").append(uiAssist);
        sb.append(", ").append(uiLinkage);
        sb.append(", ").append(comment);
        sb.append(", ").append(active);
        sb.append(", ").append(sigma);
        sb.append(", ").append(metadata);
        sb.append(", ").append(language);
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
    public void from(IWFlow from) {
        setKey(from.getKey());
        setName(from.getName());
        setCode(from.getCode());
        setType(from.getType());
        setDefinitionKey(from.getDefinitionKey());
        setAuthorizedComponent(from.getAuthorizedComponent());
        setAuthorizedConfig(from.getAuthorizedConfig());
        setGenerateComponent(from.getGenerateComponent());
        setGenerateConfig(from.getGenerateConfig());
        setRunComponent(from.getRunComponent());
        setRunConfig(from.getRunConfig());
        setStartComponent(from.getStartComponent());
        setStartConfig(from.getStartConfig());
        setEndComponent(from.getEndComponent());
        setEndConfig(from.getEndConfig());
        setUiComponent(from.getUiComponent());
        setUiConfig(from.getUiConfig());
        setUiAssist(from.getUiAssist());
        setUiLinkage(from.getUiLinkage());
        setComment(from.getComment());
        setActive(from.getActive());
        setSigma(from.getSigma());
        setMetadata(from.getMetadata());
        setLanguage(from.getLanguage());
        setCreatedAt(from.getCreatedAt());
        setCreatedBy(from.getCreatedBy());
        setUpdatedAt(from.getUpdatedAt());
        setUpdatedBy(from.getUpdatedBy());
    }

    @Override
    public <E extends IWFlow> E into(E into) {
        into.from(this);
        return into;
    }
}