/*
 * This file is generated by jOOQ.
 */
package cn.vertxup.integration.domain.tables.pojos;


import cn.vertxup.integration.domain.tables.interfaces.IDComment;

import io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo;

import java.time.LocalDateTime;


import static io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo.*;
/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class DComment implements VertxPojo, IDComment {

    private static final long serialVersionUID = 1L;

    private String key;
    private String code;
    private String name;
    private String type;
    private Integer sort;
    private String content;
    private String modelId;
    private String modelKey;
    private String sigma;
    private String language;
    private Boolean active;
    private String metadata;
    private String madeName;
    private LocalDateTime madeAt;
    private LocalDateTime createdAt;
    private String createdBy;
    private LocalDateTime updatedAt;
    private String updatedBy;

    public DComment() {}

    public DComment(IDComment value) {
        this.key = value.getKey();
        this.code = value.getCode();
        this.name = value.getName();
        this.type = value.getType();
        this.sort = value.getSort();
        this.content = value.getContent();
        this.modelId = value.getModelId();
        this.modelKey = value.getModelKey();
        this.sigma = value.getSigma();
        this.language = value.getLanguage();
        this.active = value.getActive();
        this.metadata = value.getMetadata();
        this.madeName = value.getMadeName();
        this.madeAt = value.getMadeAt();
        this.createdAt = value.getCreatedAt();
        this.createdBy = value.getCreatedBy();
        this.updatedAt = value.getUpdatedAt();
        this.updatedBy = value.getUpdatedBy();
    }

    public DComment(
        String key,
        String code,
        String name,
        String type,
        Integer sort,
        String content,
        String modelId,
        String modelKey,
        String sigma,
        String language,
        Boolean active,
        String metadata,
        String madeName,
        LocalDateTime madeAt,
        LocalDateTime createdAt,
        String createdBy,
        LocalDateTime updatedAt,
        String updatedBy
    ) {
        this.key = key;
        this.code = code;
        this.name = name;
        this.type = type;
        this.sort = sort;
        this.content = content;
        this.modelId = modelId;
        this.modelKey = modelKey;
        this.sigma = sigma;
        this.language = language;
        this.active = active;
        this.metadata = metadata;
        this.madeName = madeName;
        this.madeAt = madeAt;
        this.createdAt = createdAt;
        this.createdBy = createdBy;
        this.updatedAt = updatedAt;
        this.updatedBy = updatedBy;
    }

        public DComment(io.vertx.core.json.JsonObject json) {
                this();
                fromJson(json);
        }

    /**
     * Getter for <code>DB_ETERNAL.D_COMMENT.KEY</code>. 「key」- 解读主键
     */
    @Override
    public String getKey() {
        return this.key;
    }

    /**
     * Setter for <code>DB_ETERNAL.D_COMMENT.KEY</code>. 「key」- 解读主键
     */
    @Override
    public DComment setKey(String key) {
        this.key = key;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.D_COMMENT.CODE</code>. 「code」- 备注编号
     */
    @Override
    public String getCode() {
        return this.code;
    }

    /**
     * Setter for <code>DB_ETERNAL.D_COMMENT.CODE</code>. 「code」- 备注编号
     */
    @Override
    public DComment setCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.D_COMMENT.NAME</code>. 「name」- 备注标题
     */
    @Override
    public String getName() {
        return this.name;
    }

    /**
     * Setter for <code>DB_ETERNAL.D_COMMENT.NAME</code>. 「name」- 备注标题
     */
    @Override
    public DComment setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.D_COMMENT.TYPE</code>. 「type」- 备注类型
     */
    @Override
    public String getType() {
        return this.type;
    }

    /**
     * Setter for <code>DB_ETERNAL.D_COMMENT.TYPE</code>. 「type」- 备注类型
     */
    @Override
    public DComment setType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.D_COMMENT.SORT</code>. 「sort」- 备注排序
     */
    @Override
    public Integer getSort() {
        return this.sort;
    }

    /**
     * Setter for <code>DB_ETERNAL.D_COMMENT.SORT</code>. 「sort」- 备注排序
     */
    @Override
    public DComment setSort(Integer sort) {
        this.sort = sort;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.D_COMMENT.CONTENT</code>. 「content」-
     * 备注内容、解读内容
     */
    @Override
    public String getContent() {
        return this.content;
    }

    /**
     * Setter for <code>DB_ETERNAL.D_COMMENT.CONTENT</code>. 「content」-
     * 备注内容、解读内容
     */
    @Override
    public DComment setContent(String content) {
        this.content = content;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.D_COMMENT.MODEL_ID</code>. 「modelId」-
     * 关联的模型identifier，用于描述
     */
    @Override
    public String getModelId() {
        return this.modelId;
    }

    /**
     * Setter for <code>DB_ETERNAL.D_COMMENT.MODEL_ID</code>. 「modelId」-
     * 关联的模型identifier，用于描述
     */
    @Override
    public DComment setModelId(String modelId) {
        this.modelId = modelId;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.D_COMMENT.MODEL_KEY</code>. 「modelKey」-
     * 关联的模型记录ID，用于描述哪一个Model中的记录
     */
    @Override
    public String getModelKey() {
        return this.modelKey;
    }

    /**
     * Setter for <code>DB_ETERNAL.D_COMMENT.MODEL_KEY</code>. 「modelKey」-
     * 关联的模型记录ID，用于描述哪一个Model中的记录
     */
    @Override
    public DComment setModelKey(String modelKey) {
        this.modelKey = modelKey;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.D_COMMENT.SIGMA</code>. 「sigma」- 统一标识
     */
    @Override
    public String getSigma() {
        return this.sigma;
    }

    /**
     * Setter for <code>DB_ETERNAL.D_COMMENT.SIGMA</code>. 「sigma」- 统一标识
     */
    @Override
    public DComment setSigma(String sigma) {
        this.sigma = sigma;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.D_COMMENT.LANGUAGE</code>. 「language」- 使用的语言
     */
    @Override
    public String getLanguage() {
        return this.language;
    }

    /**
     * Setter for <code>DB_ETERNAL.D_COMMENT.LANGUAGE</code>. 「language」- 使用的语言
     */
    @Override
    public DComment setLanguage(String language) {
        this.language = language;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.D_COMMENT.ACTIVE</code>. 「active」- 是否启用
     */
    @Override
    public Boolean getActive() {
        return this.active;
    }

    /**
     * Setter for <code>DB_ETERNAL.D_COMMENT.ACTIVE</code>. 「active」- 是否启用
     */
    @Override
    public DComment setActive(Boolean active) {
        this.active = active;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.D_COMMENT.METADATA</code>. 「metadata」- 附加配置数据
     */
    @Override
    public String getMetadata() {
        return this.metadata;
    }

    /**
     * Setter for <code>DB_ETERNAL.D_COMMENT.METADATA</code>. 「metadata」- 附加配置数据
     */
    @Override
    public DComment setMetadata(String metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.D_COMMENT.MADE_NAME</code>. 「madeName」- 备注人姓名
     */
    @Override
    public String getMadeName() {
        return this.madeName;
    }

    /**
     * Setter for <code>DB_ETERNAL.D_COMMENT.MADE_NAME</code>. 「madeName」- 备注人姓名
     */
    @Override
    public DComment setMadeName(String madeName) {
        this.madeName = madeName;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.D_COMMENT.MADE_AT</code>. 「madeAt」- 备注时间
     */
    @Override
    public LocalDateTime getMadeAt() {
        return this.madeAt;
    }

    /**
     * Setter for <code>DB_ETERNAL.D_COMMENT.MADE_AT</code>. 「madeAt」- 备注时间
     */
    @Override
    public DComment setMadeAt(LocalDateTime madeAt) {
        this.madeAt = madeAt;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.D_COMMENT.CREATED_AT</code>. 「createdAt」-
     * 创建时间
     */
    @Override
    public LocalDateTime getCreatedAt() {
        return this.createdAt;
    }

    /**
     * Setter for <code>DB_ETERNAL.D_COMMENT.CREATED_AT</code>. 「createdAt」-
     * 创建时间
     */
    @Override
    public DComment setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.D_COMMENT.CREATED_BY</code>. 「createdBy」- 创建人
     */
    @Override
    public String getCreatedBy() {
        return this.createdBy;
    }

    /**
     * Setter for <code>DB_ETERNAL.D_COMMENT.CREATED_BY</code>. 「createdBy」- 创建人
     */
    @Override
    public DComment setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.D_COMMENT.UPDATED_AT</code>. 「updatedAt」-
     * 更新时间
     */
    @Override
    public LocalDateTime getUpdatedAt() {
        return this.updatedAt;
    }

    /**
     * Setter for <code>DB_ETERNAL.D_COMMENT.UPDATED_AT</code>. 「updatedAt」-
     * 更新时间
     */
    @Override
    public DComment setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.D_COMMENT.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    @Override
    public String getUpdatedBy() {
        return this.updatedBy;
    }

    /**
     * Setter for <code>DB_ETERNAL.D_COMMENT.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    @Override
    public DComment setUpdatedBy(String updatedBy) {
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
        final DComment other = (DComment) obj;
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
        if (this.name == null) {
            if (other.name != null)
                return false;
        }
        else if (!this.name.equals(other.name))
            return false;
        if (this.type == null) {
            if (other.type != null)
                return false;
        }
        else if (!this.type.equals(other.type))
            return false;
        if (this.sort == null) {
            if (other.sort != null)
                return false;
        }
        else if (!this.sort.equals(other.sort))
            return false;
        if (this.content == null) {
            if (other.content != null)
                return false;
        }
        else if (!this.content.equals(other.content))
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
        if (this.madeName == null) {
            if (other.madeName != null)
                return false;
        }
        else if (!this.madeName.equals(other.madeName))
            return false;
        if (this.madeAt == null) {
            if (other.madeAt != null)
                return false;
        }
        else if (!this.madeAt.equals(other.madeAt))
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
        result = prime * result + ((this.name == null) ? 0 : this.name.hashCode());
        result = prime * result + ((this.type == null) ? 0 : this.type.hashCode());
        result = prime * result + ((this.sort == null) ? 0 : this.sort.hashCode());
        result = prime * result + ((this.content == null) ? 0 : this.content.hashCode());
        result = prime * result + ((this.modelId == null) ? 0 : this.modelId.hashCode());
        result = prime * result + ((this.modelKey == null) ? 0 : this.modelKey.hashCode());
        result = prime * result + ((this.sigma == null) ? 0 : this.sigma.hashCode());
        result = prime * result + ((this.language == null) ? 0 : this.language.hashCode());
        result = prime * result + ((this.active == null) ? 0 : this.active.hashCode());
        result = prime * result + ((this.metadata == null) ? 0 : this.metadata.hashCode());
        result = prime * result + ((this.madeName == null) ? 0 : this.madeName.hashCode());
        result = prime * result + ((this.madeAt == null) ? 0 : this.madeAt.hashCode());
        result = prime * result + ((this.createdAt == null) ? 0 : this.createdAt.hashCode());
        result = prime * result + ((this.createdBy == null) ? 0 : this.createdBy.hashCode());
        result = prime * result + ((this.updatedAt == null) ? 0 : this.updatedAt.hashCode());
        result = prime * result + ((this.updatedBy == null) ? 0 : this.updatedBy.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("DComment (");

        sb.append(key);
        sb.append(", ").append(code);
        sb.append(", ").append(name);
        sb.append(", ").append(type);
        sb.append(", ").append(sort);
        sb.append(", ").append(content);
        sb.append(", ").append(modelId);
        sb.append(", ").append(modelKey);
        sb.append(", ").append(sigma);
        sb.append(", ").append(language);
        sb.append(", ").append(active);
        sb.append(", ").append(metadata);
        sb.append(", ").append(madeName);
        sb.append(", ").append(madeAt);
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
    public void from(IDComment from) {
        setKey(from.getKey());
        setCode(from.getCode());
        setName(from.getName());
        setType(from.getType());
        setSort(from.getSort());
        setContent(from.getContent());
        setModelId(from.getModelId());
        setModelKey(from.getModelKey());
        setSigma(from.getSigma());
        setLanguage(from.getLanguage());
        setActive(from.getActive());
        setMetadata(from.getMetadata());
        setMadeName(from.getMadeName());
        setMadeAt(from.getMadeAt());
        setCreatedAt(from.getCreatedAt());
        setCreatedBy(from.getCreatedBy());
        setUpdatedAt(from.getUpdatedAt());
        setUpdatedBy(from.getUpdatedBy());
    }

    @Override
    public <E extends IDComment> E into(E into) {
        into.from(this);
        return into;
    }
}
