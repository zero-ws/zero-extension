/*
 * This file is generated by jOOQ.
 */
package io.zerows.extension.runtime.tpl.domain.tables.pojos;


import io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo;
import io.zerows.extension.runtime.tpl.domain.tables.interfaces.ITplModel;

import java.time.LocalDateTime;

/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({"all", "unchecked", "rawtypes"})
public class TplModel implements VertxPojo, ITplModel {

    private static final long serialVersionUID = 1L;

    private String key;
    private String name;
    private String code;
    private String type;
    private String tplCategory;
    private String tplIntegration;
    private String tplAcl;
    private String tplAclVisit;
    private String tplModel;
    private String tplEntity;
    private String tplApi;
    private String tplJob;
    private String tplUi;
    private String tplUiList;
    private String tplUiForm;
    private String sigma;
    private String language;
    private Boolean active;
    private String metadata;
    private LocalDateTime createdAt;
    private String createdBy;
    private LocalDateTime updatedAt;
    private String updatedBy;

    public TplModel() {
    }

    public TplModel(ITplModel value) {
        this.key = value.getKey();
        this.name = value.getName();
        this.code = value.getCode();
        this.type = value.getType();
        this.tplCategory = value.getTplCategory();
        this.tplIntegration = value.getTplIntegration();
        this.tplAcl = value.getTplAcl();
        this.tplAclVisit = value.getTplAclVisit();
        this.tplModel = value.getTplModel();
        this.tplEntity = value.getTplEntity();
        this.tplApi = value.getTplApi();
        this.tplJob = value.getTplJob();
        this.tplUi = value.getTplUi();
        this.tplUiList = value.getTplUiList();
        this.tplUiForm = value.getTplUiForm();
        this.sigma = value.getSigma();
        this.language = value.getLanguage();
        this.active = value.getActive();
        this.metadata = value.getMetadata();
        this.createdAt = value.getCreatedAt();
        this.createdBy = value.getCreatedBy();
        this.updatedAt = value.getUpdatedAt();
        this.updatedBy = value.getUpdatedBy();
    }

    public TplModel(
        String key,
        String name,
        String code,
        String type,
        String tplCategory,
        String tplIntegration,
        String tplAcl,
        String tplAclVisit,
        String tplModel,
        String tplEntity,
        String tplApi,
        String tplJob,
        String tplUi,
        String tplUiList,
        String tplUiForm,
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
        this.type = type;
        this.tplCategory = tplCategory;
        this.tplIntegration = tplIntegration;
        this.tplAcl = tplAcl;
        this.tplAclVisit = tplAclVisit;
        this.tplModel = tplModel;
        this.tplEntity = tplEntity;
        this.tplApi = tplApi;
        this.tplJob = tplJob;
        this.tplUi = tplUi;
        this.tplUiList = tplUiList;
        this.tplUiForm = tplUiForm;
        this.sigma = sigma;
        this.language = language;
        this.active = active;
        this.metadata = metadata;
        this.createdAt = createdAt;
        this.createdBy = createdBy;
        this.updatedAt = updatedAt;
        this.updatedBy = updatedBy;
    }

    public TplModel(io.vertx.core.json.JsonObject json) {
        this();
        fromJson(json);
    }

    /**
     * Getter for <code>ZDB.TPL_MODEL.KEY</code>. 「key」- 模板ID
     */
    @Override
    public String getKey() {
        return this.key;
    }

    /**
     * Setter for <code>ZDB.TPL_MODEL.KEY</code>. 「key」- 模板ID
     */
    @Override
    public TplModel setKey(String key) {
        this.key = key;
        return this;
    }

    /**
     * Getter for <code>ZDB.TPL_MODEL.NAME</code>. 「name」- 模板名称
     */
    @Override
    public String getName() {
        return this.name;
    }

    /**
     * Setter for <code>ZDB.TPL_MODEL.NAME</code>. 「name」- 模板名称
     */
    @Override
    public TplModel setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Getter for <code>ZDB.TPL_MODEL.CODE</code>. 「code」- 模板编码
     */
    @Override
    public String getCode() {
        return this.code;
    }

    /**
     * Setter for <code>ZDB.TPL_MODEL.CODE</code>. 「code」- 模板编码
     */
    @Override
    public TplModel setCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * Getter for <code>ZDB.TPL_MODEL.TYPE</code>. 「type」- 模板类型
     */
    @Override
    public String getType() {
        return this.type;
    }

    /**
     * Setter for <code>ZDB.TPL_MODEL.TYPE</code>. 「type」- 模板类型
     */
    @Override
    public TplModel setType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Getter for <code>ZDB.TPL_MODEL.TPL_CATEGORY</code>. 「tplCategory」- 分类配置
     */
    @Override
    public String getTplCategory() {
        return this.tplCategory;
    }

    /**
     * Setter for <code>ZDB.TPL_MODEL.TPL_CATEGORY</code>. 「tplCategory」- 分类配置
     */
    @Override
    public TplModel setTplCategory(String tplCategory) {
        this.tplCategory = tplCategory;
        return this;
    }

    /**
     * Getter for <code>ZDB.TPL_MODEL.TPL_INTEGRATION</code>. 「tplIntegration」-
     * 集成配置
     */
    @Override
    public String getTplIntegration() {
        return this.tplIntegration;
    }

    /**
     * Setter for <code>ZDB.TPL_MODEL.TPL_INTEGRATION</code>. 「tplIntegration」-
     * 集成配置
     */
    @Override
    public TplModel setTplIntegration(String tplIntegration) {
        this.tplIntegration = tplIntegration;
        return this;
    }

    /**
     * Getter for <code>ZDB.TPL_MODEL.TPL_ACL</code>. 「tplAcl」- 安全配置
     */
    @Override
    public String getTplAcl() {
        return this.tplAcl;
    }

    /**
     * Setter for <code>ZDB.TPL_MODEL.TPL_ACL</code>. 「tplAcl」- 安全配置
     */
    @Override
    public TplModel setTplAcl(String tplAcl) {
        this.tplAcl = tplAcl;
        return this;
    }

    /**
     * Getter for <code>ZDB.TPL_MODEL.TPL_ACL_VISIT</code>. 「tplAclVisit」-
     * 资源访问者配置
     */
    @Override
    public String getTplAclVisit() {
        return this.tplAclVisit;
    }

    /**
     * Setter for <code>ZDB.TPL_MODEL.TPL_ACL_VISIT</code>. 「tplAclVisit」-
     * 资源访问者配置
     */
    @Override
    public TplModel setTplAclVisit(String tplAclVisit) {
        this.tplAclVisit = tplAclVisit;
        return this;
    }

    /**
     * Getter for <code>ZDB.TPL_MODEL.TPL_MODEL</code>. 「tplModel」- 模型配置
     */
    @Override
    public String getTplModel() {
        return this.tplModel;
    }

    /**
     * Setter for <code>ZDB.TPL_MODEL.TPL_MODEL</code>. 「tplModel」- 模型配置
     */
    @Override
    public TplModel setTplModel(String tplModel) {
        this.tplModel = tplModel;
        return this;
    }

    /**
     * Getter for <code>ZDB.TPL_MODEL.TPL_ENTITY</code>. 「tplEntity」- 实体配置
     */
    @Override
    public String getTplEntity() {
        return this.tplEntity;
    }

    /**
     * Setter for <code>ZDB.TPL_MODEL.TPL_ENTITY</code>. 「tplEntity」- 实体配置
     */
    @Override
    public TplModel setTplEntity(String tplEntity) {
        this.tplEntity = tplEntity;
        return this;
    }

    /**
     * Getter for <code>ZDB.TPL_MODEL.TPL_API</code>. 「tplApi」- 接口配置
     */
    @Override
    public String getTplApi() {
        return this.tplApi;
    }

    /**
     * Setter for <code>ZDB.TPL_MODEL.TPL_API</code>. 「tplApi」- 接口配置
     */
    @Override
    public TplModel setTplApi(String tplApi) {
        this.tplApi = tplApi;
        return this;
    }

    /**
     * Getter for <code>ZDB.TPL_MODEL.TPL_JOB</code>. 「tplJob」- 任务配置
     */
    @Override
    public String getTplJob() {
        return this.tplJob;
    }

    /**
     * Setter for <code>ZDB.TPL_MODEL.TPL_JOB</code>. 「tplJob」- 任务配置
     */
    @Override
    public TplModel setTplJob(String tplJob) {
        this.tplJob = tplJob;
        return this;
    }

    /**
     * Getter for <code>ZDB.TPL_MODEL.TPL_UI</code>. 「tplUi」- 界面配置
     */
    @Override
    public String getTplUi() {
        return this.tplUi;
    }

    /**
     * Setter for <code>ZDB.TPL_MODEL.TPL_UI</code>. 「tplUi」- 界面配置
     */
    @Override
    public TplModel setTplUi(String tplUi) {
        this.tplUi = tplUi;
        return this;
    }

    /**
     * Getter for <code>ZDB.TPL_MODEL.TPL_UI_LIST</code>. 「tplUiList」- 界面列表配置
     */
    @Override
    public String getTplUiList() {
        return this.tplUiList;
    }

    /**
     * Setter for <code>ZDB.TPL_MODEL.TPL_UI_LIST</code>. 「tplUiList」- 界面列表配置
     */
    @Override
    public TplModel setTplUiList(String tplUiList) {
        this.tplUiList = tplUiList;
        return this;
    }

    /**
     * Getter for <code>ZDB.TPL_MODEL.TPL_UI_FORM</code>. 「tplUiForm」- 界面表单配置
     */
    @Override
    public String getTplUiForm() {
        return this.tplUiForm;
    }

    /**
     * Setter for <code>ZDB.TPL_MODEL.TPL_UI_FORM</code>. 「tplUiForm」- 界面表单配置
     */
    @Override
    public TplModel setTplUiForm(String tplUiForm) {
        this.tplUiForm = tplUiForm;
        return this;
    }

    /**
     * Getter for <code>ZDB.TPL_MODEL.SIGMA</code>. 「sigma」- 统一标识
     */
    @Override
    public String getSigma() {
        return this.sigma;
    }

    /**
     * Setter for <code>ZDB.TPL_MODEL.SIGMA</code>. 「sigma」- 统一标识
     */
    @Override
    public TplModel setSigma(String sigma) {
        this.sigma = sigma;
        return this;
    }

    /**
     * Getter for <code>ZDB.TPL_MODEL.LANGUAGE</code>. 「language」- 使用的语言
     */
    @Override
    public String getLanguage() {
        return this.language;
    }

    /**
     * Setter for <code>ZDB.TPL_MODEL.LANGUAGE</code>. 「language」- 使用的语言
     */
    @Override
    public TplModel setLanguage(String language) {
        this.language = language;
        return this;
    }

    /**
     * Getter for <code>ZDB.TPL_MODEL.ACTIVE</code>. 「active」- 是否启用
     */
    @Override
    public Boolean getActive() {
        return this.active;
    }

    /**
     * Setter for <code>ZDB.TPL_MODEL.ACTIVE</code>. 「active」- 是否启用
     */
    @Override
    public TplModel setActive(Boolean active) {
        this.active = active;
        return this;
    }

    /**
     * Getter for <code>ZDB.TPL_MODEL.METADATA</code>. 「metadata」- 附加配置数据
     */
    @Override
    public String getMetadata() {
        return this.metadata;
    }

    /**
     * Setter for <code>ZDB.TPL_MODEL.METADATA</code>. 「metadata」- 附加配置数据
     */
    @Override
    public TplModel setMetadata(String metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * Getter for <code>ZDB.TPL_MODEL.CREATED_AT</code>. 「createdAt」- 创建时间
     */
    @Override
    public LocalDateTime getCreatedAt() {
        return this.createdAt;
    }

    /**
     * Setter for <code>ZDB.TPL_MODEL.CREATED_AT</code>. 「createdAt」- 创建时间
     */
    @Override
    public TplModel setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * Getter for <code>ZDB.TPL_MODEL.CREATED_BY</code>. 「createdBy」- 创建人
     */
    @Override
    public String getCreatedBy() {
        return this.createdBy;
    }

    /**
     * Setter for <code>ZDB.TPL_MODEL.CREATED_BY</code>. 「createdBy」- 创建人
     */
    @Override
    public TplModel setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    /**
     * Getter for <code>ZDB.TPL_MODEL.UPDATED_AT</code>. 「updatedAt」- 更新时间
     */
    @Override
    public LocalDateTime getUpdatedAt() {
        return this.updatedAt;
    }

    /**
     * Setter for <code>ZDB.TPL_MODEL.UPDATED_AT</code>. 「updatedAt」- 更新时间
     */
    @Override
    public TplModel setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * Getter for <code>ZDB.TPL_MODEL.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    @Override
    public String getUpdatedBy() {
        return this.updatedBy;
    }

    /**
     * Setter for <code>ZDB.TPL_MODEL.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    @Override
    public TplModel setUpdatedBy(String updatedBy) {
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
        final TplModel other = (TplModel) obj;
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
        if (this.tplCategory == null) {
            if (other.tplCategory != null)
                return false;
        } else if (!this.tplCategory.equals(other.tplCategory))
            return false;
        if (this.tplIntegration == null) {
            if (other.tplIntegration != null)
                return false;
        } else if (!this.tplIntegration.equals(other.tplIntegration))
            return false;
        if (this.tplAcl == null) {
            if (other.tplAcl != null)
                return false;
        } else if (!this.tplAcl.equals(other.tplAcl))
            return false;
        if (this.tplAclVisit == null) {
            if (other.tplAclVisit != null)
                return false;
        } else if (!this.tplAclVisit.equals(other.tplAclVisit))
            return false;
        if (this.tplModel == null) {
            if (other.tplModel != null)
                return false;
        } else if (!this.tplModel.equals(other.tplModel))
            return false;
        if (this.tplEntity == null) {
            if (other.tplEntity != null)
                return false;
        } else if (!this.tplEntity.equals(other.tplEntity))
            return false;
        if (this.tplApi == null) {
            if (other.tplApi != null)
                return false;
        } else if (!this.tplApi.equals(other.tplApi))
            return false;
        if (this.tplJob == null) {
            if (other.tplJob != null)
                return false;
        } else if (!this.tplJob.equals(other.tplJob))
            return false;
        if (this.tplUi == null) {
            if (other.tplUi != null)
                return false;
        } else if (!this.tplUi.equals(other.tplUi))
            return false;
        if (this.tplUiList == null) {
            if (other.tplUiList != null)
                return false;
        } else if (!this.tplUiList.equals(other.tplUiList))
            return false;
        if (this.tplUiForm == null) {
            if (other.tplUiForm != null)
                return false;
        } else if (!this.tplUiForm.equals(other.tplUiForm))
            return false;
        if (this.sigma == null) {
            if (other.sigma != null)
                return false;
        } else if (!this.sigma.equals(other.sigma))
            return false;
        if (this.language == null) {
            if (other.language != null)
                return false;
        } else if (!this.language.equals(other.language))
            return false;
        if (this.active == null) {
            if (other.active != null)
                return false;
        } else if (!this.active.equals(other.active))
            return false;
        if (this.metadata == null) {
            if (other.metadata != null)
                return false;
        } else if (!this.metadata.equals(other.metadata))
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
        result = prime * result + ((this.tplCategory == null) ? 0 : this.tplCategory.hashCode());
        result = prime * result + ((this.tplIntegration == null) ? 0 : this.tplIntegration.hashCode());
        result = prime * result + ((this.tplAcl == null) ? 0 : this.tplAcl.hashCode());
        result = prime * result + ((this.tplAclVisit == null) ? 0 : this.tplAclVisit.hashCode());
        result = prime * result + ((this.tplModel == null) ? 0 : this.tplModel.hashCode());
        result = prime * result + ((this.tplEntity == null) ? 0 : this.tplEntity.hashCode());
        result = prime * result + ((this.tplApi == null) ? 0 : this.tplApi.hashCode());
        result = prime * result + ((this.tplJob == null) ? 0 : this.tplJob.hashCode());
        result = prime * result + ((this.tplUi == null) ? 0 : this.tplUi.hashCode());
        result = prime * result + ((this.tplUiList == null) ? 0 : this.tplUiList.hashCode());
        result = prime * result + ((this.tplUiForm == null) ? 0 : this.tplUiForm.hashCode());
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
        StringBuilder sb = new StringBuilder("TplModel (");

        sb.append(key);
        sb.append(", ").append(name);
        sb.append(", ").append(code);
        sb.append(", ").append(type);
        sb.append(", ").append(tplCategory);
        sb.append(", ").append(tplIntegration);
        sb.append(", ").append(tplAcl);
        sb.append(", ").append(tplAclVisit);
        sb.append(", ").append(tplModel);
        sb.append(", ").append(tplEntity);
        sb.append(", ").append(tplApi);
        sb.append(", ").append(tplJob);
        sb.append(", ").append(tplUi);
        sb.append(", ").append(tplUiList);
        sb.append(", ").append(tplUiForm);
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
    public void from(ITplModel from) {
        setKey(from.getKey());
        setName(from.getName());
        setCode(from.getCode());
        setType(from.getType());
        setTplCategory(from.getTplCategory());
        setTplIntegration(from.getTplIntegration());
        setTplAcl(from.getTplAcl());
        setTplAclVisit(from.getTplAclVisit());
        setTplModel(from.getTplModel());
        setTplEntity(from.getTplEntity());
        setTplApi(from.getTplApi());
        setTplJob(from.getTplJob());
        setTplUi(from.getTplUi());
        setTplUiList(from.getTplUiList());
        setTplUiForm(from.getTplUiForm());
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
    public <E extends ITplModel> E into(E into) {
        into.from(this);
        return into;
    }
}