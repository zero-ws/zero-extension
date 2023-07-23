/*
 * This file is generated by jOOQ.
 */
package cn.vertxup.doc.domain.tables.pojos;


import cn.vertxup.doc.domain.tables.interfaces.IDQstore;

import io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo;

import java.time.LocalDateTime;


import static io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo.*;
/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class DQstore implements VertxPojo, IDQstore {

    private static final long serialVersionUID = 1L;

    private String key;
    private String code;
    private String type;
    private String status;
    private String category;
    private String name;
    private String brief;
    private String version;
    private Integer questions;
    private String modelId;
    private String modelKey;
    private String sigma;
    private String language;
    private Boolean active;
    private String metadata;
    private LocalDateTime createdAt;
    private String createdBy;
    private LocalDateTime updatedAt;
    private String updatedBy;

    public DQstore() {}

    public DQstore(IDQstore value) {
        this.key = value.getKey();
        this.code = value.getCode();
        this.type = value.getType();
        this.status = value.getStatus();
        this.category = value.getCategory();
        this.name = value.getName();
        this.brief = value.getBrief();
        this.version = value.getVersion();
        this.questions = value.getQuestions();
        this.modelId = value.getModelId();
        this.modelKey = value.getModelKey();
        this.sigma = value.getSigma();
        this.language = value.getLanguage();
        this.active = value.getActive();
        this.metadata = value.getMetadata();
        this.createdAt = value.getCreatedAt();
        this.createdBy = value.getCreatedBy();
        this.updatedAt = value.getUpdatedAt();
        this.updatedBy = value.getUpdatedBy();
    }

    public DQstore(
        String key,
        String code,
        String type,
        String status,
        String category,
        String name,
        String brief,
        String version,
        Integer questions,
        String modelId,
        String modelKey,
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
        this.code = code;
        this.type = type;
        this.status = status;
        this.category = category;
        this.name = name;
        this.brief = brief;
        this.version = version;
        this.questions = questions;
        this.modelId = modelId;
        this.modelKey = modelKey;
        this.sigma = sigma;
        this.language = language;
        this.active = active;
        this.metadata = metadata;
        this.createdAt = createdAt;
        this.createdBy = createdBy;
        this.updatedAt = updatedAt;
        this.updatedBy = updatedBy;
    }

        public DQstore(io.vertx.core.json.JsonObject json) {
                this();
                fromJson(json);
        }

    /**
     * Getter for <code>ZDB.D_QSTORE.KEY</code>. 「key」- 题库主键
     */
    @Override
    public String getKey() {
        return this.key;
    }

    /**
     * Setter for <code>ZDB.D_QSTORE.KEY</code>. 「key」- 题库主键
     */
    @Override
    public DQstore setKey(String key) {
        this.key = key;
        return this;
    }

    /**
     * Getter for <code>ZDB.D_QSTORE.CODE</code>. 「code」-  题库编号
     */
    @Override
    public String getCode() {
        return this.code;
    }

    /**
     * Setter for <code>ZDB.D_QSTORE.CODE</code>. 「code」-  题库编号
     */
    @Override
    public DQstore setCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * Getter for <code>ZDB.D_QSTORE.TYPE</code>. 「type」-  题库类型
     */
    @Override
    public String getType() {
        return this.type;
    }

    /**
     * Setter for <code>ZDB.D_QSTORE.TYPE</code>. 「type」-  题库类型
     */
    @Override
    public DQstore setType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Getter for <code>ZDB.D_QSTORE.STATUS</code>. 「status」- 状态
     */
    @Override
    public String getStatus() {
        return this.status;
    }

    /**
     * Setter for <code>ZDB.D_QSTORE.STATUS</code>. 「status」- 状态
     */
    @Override
    public DQstore setStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * Getter for <code>ZDB.D_QSTORE.CATEGORY</code>. 「category」- 题库类型、树型模型
     */
    @Override
    public String getCategory() {
        return this.category;
    }

    /**
     * Setter for <code>ZDB.D_QSTORE.CATEGORY</code>. 「category」- 题库类型、树型模型
     */
    @Override
    public DQstore setCategory(String category) {
        this.category = category;
        return this;
    }

    /**
     * Getter for <code>ZDB.D_QSTORE.NAME</code>. 「name」-  题库标题
     */
    @Override
    public String getName() {
        return this.name;
    }

    /**
     * Setter for <code>ZDB.D_QSTORE.NAME</code>. 「name」-  题库标题
     */
    @Override
    public DQstore setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Getter for <code>ZDB.D_QSTORE.BRIEF</code>. 「brief」- 题库简介
     */
    @Override
    public String getBrief() {
        return this.brief;
    }

    /**
     * Setter for <code>ZDB.D_QSTORE.BRIEF</code>. 「brief」- 题库简介
     */
    @Override
    public DQstore setBrief(String brief) {
        this.brief = brief;
        return this;
    }

    /**
     * Getter for <code>ZDB.D_QSTORE.VERSION</code>. 「version」- 题库版本, N.N
     */
    @Override
    public String getVersion() {
        return this.version;
    }

    /**
     * Setter for <code>ZDB.D_QSTORE.VERSION</code>. 「version」- 题库版本, N.N
     */
    @Override
    public DQstore setVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * Getter for <code>ZDB.D_QSTORE.QUESTIONS</code>. 「questions」- 题目数量
     */
    @Override
    public Integer getQuestions() {
        return this.questions;
    }

    /**
     * Setter for <code>ZDB.D_QSTORE.QUESTIONS</code>. 「questions」- 题目数量
     */
    @Override
    public DQstore setQuestions(Integer questions) {
        this.questions = questions;
        return this;
    }

    /**
     * Getter for <code>ZDB.D_QSTORE.MODEL_ID</code>. 「modelId」-
     * 关联的模型identifier，用于描述
     */
    @Override
    public String getModelId() {
        return this.modelId;
    }

    /**
     * Setter for <code>ZDB.D_QSTORE.MODEL_ID</code>. 「modelId」-
     * 关联的模型identifier，用于描述
     */
    @Override
    public DQstore setModelId(String modelId) {
        this.modelId = modelId;
        return this;
    }

    /**
     * Getter for <code>ZDB.D_QSTORE.MODEL_KEY</code>. 「modelKey」-
     * 关联的模型记录ID，用于描述哪一个Model中的记录
     */
    @Override
    public String getModelKey() {
        return this.modelKey;
    }

    /**
     * Setter for <code>ZDB.D_QSTORE.MODEL_KEY</code>. 「modelKey」-
     * 关联的模型记录ID，用于描述哪一个Model中的记录
     */
    @Override
    public DQstore setModelKey(String modelKey) {
        this.modelKey = modelKey;
        return this;
    }

    /**
     * Getter for <code>ZDB.D_QSTORE.SIGMA</code>. 「sigma」- 统一标识
     */
    @Override
    public String getSigma() {
        return this.sigma;
    }

    /**
     * Setter for <code>ZDB.D_QSTORE.SIGMA</code>. 「sigma」- 统一标识
     */
    @Override
    public DQstore setSigma(String sigma) {
        this.sigma = sigma;
        return this;
    }

    /**
     * Getter for <code>ZDB.D_QSTORE.LANGUAGE</code>. 「language」- 使用的语言
     */
    @Override
    public String getLanguage() {
        return this.language;
    }

    /**
     * Setter for <code>ZDB.D_QSTORE.LANGUAGE</code>. 「language」- 使用的语言
     */
    @Override
    public DQstore setLanguage(String language) {
        this.language = language;
        return this;
    }

    /**
     * Getter for <code>ZDB.D_QSTORE.ACTIVE</code>. 「active」- 是否启用
     */
    @Override
    public Boolean getActive() {
        return this.active;
    }

    /**
     * Setter for <code>ZDB.D_QSTORE.ACTIVE</code>. 「active」- 是否启用
     */
    @Override
    public DQstore setActive(Boolean active) {
        this.active = active;
        return this;
    }

    /**
     * Getter for <code>ZDB.D_QSTORE.METADATA</code>. 「metadata」- 附加配置数据
     */
    @Override
    public String getMetadata() {
        return this.metadata;
    }

    /**
     * Setter for <code>ZDB.D_QSTORE.METADATA</code>. 「metadata」- 附加配置数据
     */
    @Override
    public DQstore setMetadata(String metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * Getter for <code>ZDB.D_QSTORE.CREATED_AT</code>. 「createdAt」- 创建时间
     */
    @Override
    public LocalDateTime getCreatedAt() {
        return this.createdAt;
    }

    /**
     * Setter for <code>ZDB.D_QSTORE.CREATED_AT</code>. 「createdAt」- 创建时间
     */
    @Override
    public DQstore setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * Getter for <code>ZDB.D_QSTORE.CREATED_BY</code>. 「createdBy」- 创建人
     */
    @Override
    public String getCreatedBy() {
        return this.createdBy;
    }

    /**
     * Setter for <code>ZDB.D_QSTORE.CREATED_BY</code>. 「createdBy」- 创建人
     */
    @Override
    public DQstore setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    /**
     * Getter for <code>ZDB.D_QSTORE.UPDATED_AT</code>. 「updatedAt」- 更新时间
     */
    @Override
    public LocalDateTime getUpdatedAt() {
        return this.updatedAt;
    }

    /**
     * Setter for <code>ZDB.D_QSTORE.UPDATED_AT</code>. 「updatedAt」- 更新时间
     */
    @Override
    public DQstore setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * Getter for <code>ZDB.D_QSTORE.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    @Override
    public String getUpdatedBy() {
        return this.updatedBy;
    }

    /**
     * Setter for <code>ZDB.D_QSTORE.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    @Override
    public DQstore setUpdatedBy(String updatedBy) {
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
        final DQstore other = (DQstore) obj;
        if (this.key == null) {
            if (other.key != null)
                return false;
        }
        else if (!this.key.equals(other.key))
            return false;
        if (this.code == null) {
            if (other.code != null)
                return false;
        }
        else if (!this.code.equals(other.code))
            return false;
        if (this.type == null) {
            if (other.type != null)
                return false;
        }
        else if (!this.type.equals(other.type))
            return false;
        if (this.status == null) {
            if (other.status != null)
                return false;
        }
        else if (!this.status.equals(other.status))
            return false;
        if (this.category == null) {
            if (other.category != null)
                return false;
        }
        else if (!this.category.equals(other.category))
            return false;
        if (this.name == null) {
            if (other.name != null)
                return false;
        }
        else if (!this.name.equals(other.name))
            return false;
        if (this.brief == null) {
            if (other.brief != null)
                return false;
        }
        else if (!this.brief.equals(other.brief))
            return false;
        if (this.version == null) {
            if (other.version != null)
                return false;
        }
        else if (!this.version.equals(other.version))
            return false;
        if (this.questions == null) {
            if (other.questions != null)
                return false;
        }
        else if (!this.questions.equals(other.questions))
            return false;
        if (this.modelId == null) {
            if (other.modelId != null)
                return false;
        }
        else if (!this.modelId.equals(other.modelId))
            return false;
        if (this.modelKey == null) {
            if (other.modelKey != null)
                return false;
        }
        else if (!this.modelKey.equals(other.modelKey))
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
        result = prime * result + ((this.code == null) ? 0 : this.code.hashCode());
        result = prime * result + ((this.type == null) ? 0 : this.type.hashCode());
        result = prime * result + ((this.status == null) ? 0 : this.status.hashCode());
        result = prime * result + ((this.category == null) ? 0 : this.category.hashCode());
        result = prime * result + ((this.name == null) ? 0 : this.name.hashCode());
        result = prime * result + ((this.brief == null) ? 0 : this.brief.hashCode());
        result = prime * result + ((this.version == null) ? 0 : this.version.hashCode());
        result = prime * result + ((this.questions == null) ? 0 : this.questions.hashCode());
        result = prime * result + ((this.modelId == null) ? 0 : this.modelId.hashCode());
        result = prime * result + ((this.modelKey == null) ? 0 : this.modelKey.hashCode());
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
        StringBuilder sb = new StringBuilder("DQstore (");

        sb.append(key);
        sb.append(", ").append(code);
        sb.append(", ").append(type);
        sb.append(", ").append(status);
        sb.append(", ").append(category);
        sb.append(", ").append(name);
        sb.append(", ").append(brief);
        sb.append(", ").append(version);
        sb.append(", ").append(questions);
        sb.append(", ").append(modelId);
        sb.append(", ").append(modelKey);
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
    public void from(IDQstore from) {
        setKey(from.getKey());
        setCode(from.getCode());
        setType(from.getType());
        setStatus(from.getStatus());
        setCategory(from.getCategory());
        setName(from.getName());
        setBrief(from.getBrief());
        setVersion(from.getVersion());
        setQuestions(from.getQuestions());
        setModelId(from.getModelId());
        setModelKey(from.getModelKey());
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
    public <E extends IDQstore> E into(E into) {
        into.from(this);
        return into;
    }
}