/*
 * This file is generated by jOOQ.
 */
package cn.vertxup.atom.domain.tables.pojos;


import cn.vertxup.atom.domain.tables.interfaces.IMEntity;

import io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo;

import java.time.LocalDateTime;


import static io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo.*;
/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class MEntity implements VertxPojo, IMEntity {

    private static final long serialVersionUID = 1L;

    private String key;
    private String identifier;
    private String namespace;
    private String name;
    private String type;
    private String tableName;
    private String comments;
    private String sigma;
    private String language;
    private Boolean active;
    private String metadata;
    private LocalDateTime createdAt;
    private String createdBy;
    private LocalDateTime updatedAt;
    private String updatedBy;

    public MEntity() {}

    public MEntity(IMEntity value) {
        this.key = value.getKey();
        this.identifier = value.getIdentifier();
        this.namespace = value.getNamespace();
        this.name = value.getName();
        this.type = value.getType();
        this.tableName = value.getTableName();
        this.comments = value.getComments();
        this.sigma = value.getSigma();
        this.language = value.getLanguage();
        this.active = value.getActive();
        this.metadata = value.getMetadata();
        this.createdAt = value.getCreatedAt();
        this.createdBy = value.getCreatedBy();
        this.updatedAt = value.getUpdatedAt();
        this.updatedBy = value.getUpdatedBy();
    }

    public MEntity(
        String key,
        String identifier,
        String namespace,
        String name,
        String type,
        String tableName,
        String comments,
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
        this.identifier = identifier;
        this.namespace = namespace;
        this.name = name;
        this.type = type;
        this.tableName = tableName;
        this.comments = comments;
        this.sigma = sigma;
        this.language = language;
        this.active = active;
        this.metadata = metadata;
        this.createdAt = createdAt;
        this.createdBy = createdBy;
        this.updatedAt = updatedAt;
        this.updatedBy = updatedBy;
    }

        public MEntity(io.vertx.core.json.JsonObject json) {
                this();
                fromJson(json);
        }

    /**
     * Getter for <code>ZDB.M_ENTITY.KEY</code>. 「key」- 实体ID
     */
    @Override
    public String getKey() {
        return this.key;
    }

    /**
     * Setter for <code>ZDB.M_ENTITY.KEY</code>. 「key」- 实体ID
     */
    @Override
    public MEntity setKey(String key) {
        this.key = key;
        return this;
    }

    /**
     * Getter for <code>ZDB.M_ENTITY.IDENTIFIER</code>. 「identifier」- 当前实体全局唯一ID
     */
    @Override
    public String getIdentifier() {
        return this.identifier;
    }

    /**
     * Setter for <code>ZDB.M_ENTITY.IDENTIFIER</code>. 「identifier」- 当前实体全局唯一ID
     */
    @Override
    public MEntity setIdentifier(String identifier) {
        this.identifier = identifier;
        return this;
    }

    /**
     * Getter for <code>ZDB.M_ENTITY.NAMESPACE</code>. 「namespace」- 当前实体使用的名空间
     */
    @Override
    public String getNamespace() {
        return this.namespace;
    }

    /**
     * Setter for <code>ZDB.M_ENTITY.NAMESPACE</code>. 「namespace」- 当前实体使用的名空间
     */
    @Override
    public MEntity setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    /**
     * Getter for <code>ZDB.M_ENTITY.NAME</code>. 「name」- 当前实体的名称
     */
    @Override
    public String getName() {
        return this.name;
    }

    /**
     * Setter for <code>ZDB.M_ENTITY.NAME</code>. 「name」- 当前实体的名称
     */
    @Override
    public MEntity setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Getter for <code>ZDB.M_ENTITY.TYPE</code>. 「type」- 实体类型：ENTITY/RELATION
     */
    @Override
    public String getType() {
        return this.type;
    }

    /**
     * Setter for <code>ZDB.M_ENTITY.TYPE</code>. 「type」- 实体类型：ENTITY/RELATION
     */
    @Override
    public MEntity setType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Getter for <code>ZDB.M_ENTITY.TABLE_NAME</code>. 「tableName」- 实体对应的数据库表
     */
    @Override
    public String getTableName() {
        return this.tableName;
    }

    /**
     * Setter for <code>ZDB.M_ENTITY.TABLE_NAME</code>. 「tableName」- 实体对应的数据库表
     */
    @Override
    public MEntity setTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }

    /**
     * Getter for <code>ZDB.M_ENTITY.COMMENTS</code>. 「comments」- 数据库表备注
     */
    @Override
    public String getComments() {
        return this.comments;
    }

    /**
     * Setter for <code>ZDB.M_ENTITY.COMMENTS</code>. 「comments」- 数据库表备注
     */
    @Override
    public MEntity setComments(String comments) {
        this.comments = comments;
        return this;
    }

    /**
     * Getter for <code>ZDB.M_ENTITY.SIGMA</code>. 「sigma」- 统一标识
     */
    @Override
    public String getSigma() {
        return this.sigma;
    }

    /**
     * Setter for <code>ZDB.M_ENTITY.SIGMA</code>. 「sigma」- 统一标识
     */
    @Override
    public MEntity setSigma(String sigma) {
        this.sigma = sigma;
        return this;
    }

    /**
     * Getter for <code>ZDB.M_ENTITY.LANGUAGE</code>. 「language」- 使用的语言
     */
    @Override
    public String getLanguage() {
        return this.language;
    }

    /**
     * Setter for <code>ZDB.M_ENTITY.LANGUAGE</code>. 「language」- 使用的语言
     */
    @Override
    public MEntity setLanguage(String language) {
        this.language = language;
        return this;
    }

    /**
     * Getter for <code>ZDB.M_ENTITY.ACTIVE</code>. 「active」- 是否启用
     */
    @Override
    public Boolean getActive() {
        return this.active;
    }

    /**
     * Setter for <code>ZDB.M_ENTITY.ACTIVE</code>. 「active」- 是否启用
     */
    @Override
    public MEntity setActive(Boolean active) {
        this.active = active;
        return this;
    }

    /**
     * Getter for <code>ZDB.M_ENTITY.METADATA</code>. 「metadata」- 附加配置数据
     */
    @Override
    public String getMetadata() {
        return this.metadata;
    }

    /**
     * Setter for <code>ZDB.M_ENTITY.METADATA</code>. 「metadata」- 附加配置数据
     */
    @Override
    public MEntity setMetadata(String metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * Getter for <code>ZDB.M_ENTITY.CREATED_AT</code>. 「createdAt」- 创建时间
     */
    @Override
    public LocalDateTime getCreatedAt() {
        return this.createdAt;
    }

    /**
     * Setter for <code>ZDB.M_ENTITY.CREATED_AT</code>. 「createdAt」- 创建时间
     */
    @Override
    public MEntity setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * Getter for <code>ZDB.M_ENTITY.CREATED_BY</code>. 「createdBy」- 创建人
     */
    @Override
    public String getCreatedBy() {
        return this.createdBy;
    }

    /**
     * Setter for <code>ZDB.M_ENTITY.CREATED_BY</code>. 「createdBy」- 创建人
     */
    @Override
    public MEntity setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    /**
     * Getter for <code>ZDB.M_ENTITY.UPDATED_AT</code>. 「updatedAt」- 更新时间
     */
    @Override
    public LocalDateTime getUpdatedAt() {
        return this.updatedAt;
    }

    /**
     * Setter for <code>ZDB.M_ENTITY.UPDATED_AT</code>. 「updatedAt」- 更新时间
     */
    @Override
    public MEntity setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * Getter for <code>ZDB.M_ENTITY.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    @Override
    public String getUpdatedBy() {
        return this.updatedBy;
    }

    /**
     * Setter for <code>ZDB.M_ENTITY.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    @Override
    public MEntity setUpdatedBy(String updatedBy) {
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
        final MEntity other = (MEntity) obj;
        if (this.key == null) {
            if (other.key != null)
                return false;
        }
        else if (!this.key.equals(other.key))
            return false;
        if (this.identifier == null) {
            if (other.identifier != null)
                return false;
        }
        else if (!this.identifier.equals(other.identifier))
            return false;
        if (this.namespace == null) {
            if (other.namespace != null)
                return false;
        }
        else if (!this.namespace.equals(other.namespace))
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
        if (this.tableName == null) {
            if (other.tableName != null)
                return false;
        }
        else if (!this.tableName.equals(other.tableName))
            return false;
        if (this.comments == null) {
            if (other.comments != null)
                return false;
        }
        else if (!this.comments.equals(other.comments))
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
        result = prime * result + ((this.identifier == null) ? 0 : this.identifier.hashCode());
        result = prime * result + ((this.namespace == null) ? 0 : this.namespace.hashCode());
        result = prime * result + ((this.name == null) ? 0 : this.name.hashCode());
        result = prime * result + ((this.type == null) ? 0 : this.type.hashCode());
        result = prime * result + ((this.tableName == null) ? 0 : this.tableName.hashCode());
        result = prime * result + ((this.comments == null) ? 0 : this.comments.hashCode());
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
        StringBuilder sb = new StringBuilder("MEntity (");

        sb.append(key);
        sb.append(", ").append(identifier);
        sb.append(", ").append(namespace);
        sb.append(", ").append(name);
        sb.append(", ").append(type);
        sb.append(", ").append(tableName);
        sb.append(", ").append(comments);
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
    public void from(IMEntity from) {
        setKey(from.getKey());
        setIdentifier(from.getIdentifier());
        setNamespace(from.getNamespace());
        setName(from.getName());
        setType(from.getType());
        setTableName(from.getTableName());
        setComments(from.getComments());
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
    public <E extends IMEntity> E into(E into) {
        into.from(this);
        return into;
    }
}
