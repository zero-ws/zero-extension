/*
 * This file is generated by jOOQ.
 */
package cn.vertxup.rbac.domain.tables.pojos;


import cn.vertxup.rbac.domain.tables.interfaces.ISResource;

import io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo;

import java.time.LocalDateTime;


import static io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo.*;
/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class SResource implements VertxPojo, ISResource {

    private static final long serialVersionUID = 1L;

    private String key;
    private String code;
    private String name;
    private String type;
    private String identifier;
    private String comment;
    private Integer level;
    private String modeRole;
    private String modeGroup;
    private String modeTree;
    private Boolean virtual;
    private String seekSyntax;
    private String seekConfig;
    private String seekComponent;
    private String sigma;
    private String category;
    private String language;
    private Boolean active;
    private String metadata;
    private LocalDateTime createdAt;
    private String createdBy;
    private LocalDateTime updatedAt;
    private String updatedBy;

    public SResource() {}

    public SResource(ISResource value) {
        this.key = value.getKey();
        this.code = value.getCode();
        this.name = value.getName();
        this.type = value.getType();
        this.identifier = value.getIdentifier();
        this.comment = value.getComment();
        this.level = value.getLevel();
        this.modeRole = value.getModeRole();
        this.modeGroup = value.getModeGroup();
        this.modeTree = value.getModeTree();
        this.virtual = value.getVirtual();
        this.seekSyntax = value.getSeekSyntax();
        this.seekConfig = value.getSeekConfig();
        this.seekComponent = value.getSeekComponent();
        this.sigma = value.getSigma();
        this.category = value.getCategory();
        this.language = value.getLanguage();
        this.active = value.getActive();
        this.metadata = value.getMetadata();
        this.createdAt = value.getCreatedAt();
        this.createdBy = value.getCreatedBy();
        this.updatedAt = value.getUpdatedAt();
        this.updatedBy = value.getUpdatedBy();
    }

    public SResource(
        String key,
        String code,
        String name,
        String type,
        String identifier,
        String comment,
        Integer level,
        String modeRole,
        String modeGroup,
        String modeTree,
        Boolean virtual,
        String seekSyntax,
        String seekConfig,
        String seekComponent,
        String sigma,
        String category,
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
        this.name = name;
        this.type = type;
        this.identifier = identifier;
        this.comment = comment;
        this.level = level;
        this.modeRole = modeRole;
        this.modeGroup = modeGroup;
        this.modeTree = modeTree;
        this.virtual = virtual;
        this.seekSyntax = seekSyntax;
        this.seekConfig = seekConfig;
        this.seekComponent = seekComponent;
        this.sigma = sigma;
        this.category = category;
        this.language = language;
        this.active = active;
        this.metadata = metadata;
        this.createdAt = createdAt;
        this.createdBy = createdBy;
        this.updatedAt = updatedAt;
        this.updatedBy = updatedBy;
    }

        public SResource(io.vertx.core.json.JsonObject json) {
                this();
                fromJson(json);
        }

    /**
     * Getter for <code>ZDB.S_RESOURCE.KEY</code>. 「key」- 资源对应的ID
     */
    @Override
    public String getKey() {
        return this.key;
    }

    /**
     * Setter for <code>ZDB.S_RESOURCE.KEY</code>. 「key」- 资源对应的ID
     */
    @Override
    public SResource setKey(String key) {
        this.key = key;
        return this;
    }

    /**
     * Getter for <code>ZDB.S_RESOURCE.CODE</code>. 「code」- 资源编号
     */
    @Override
    public String getCode() {
        return this.code;
    }

    /**
     * Setter for <code>ZDB.S_RESOURCE.CODE</code>. 「code」- 资源编号
     */
    @Override
    public SResource setCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * Getter for <code>ZDB.S_RESOURCE.NAME</code>. 「name」- 资源名称
     */
    @Override
    public String getName() {
        return this.name;
    }

    /**
     * Setter for <code>ZDB.S_RESOURCE.NAME</code>. 「name」- 资源名称
     */
    @Override
    public SResource setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Getter for <code>ZDB.S_RESOURCE.TYPE</code>. 「type」- 资源分类
     */
    @Override
    public String getType() {
        return this.type;
    }

    /**
     * Setter for <code>ZDB.S_RESOURCE.TYPE</code>. 「type」- 资源分类
     */
    @Override
    public SResource setType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Getter for <code>ZDB.S_RESOURCE.IDENTIFIER</code>. 「identifier」-
     * 当前资源所属的Model的标识
     */
    @Override
    public String getIdentifier() {
        return this.identifier;
    }

    /**
     * Setter for <code>ZDB.S_RESOURCE.IDENTIFIER</code>. 「identifier」-
     * 当前资源所属的Model的标识
     */
    @Override
    public SResource setIdentifier(String identifier) {
        this.identifier = identifier;
        return this;
    }

    /**
     * Getter for <code>ZDB.S_RESOURCE.COMMENT</code>. 「comment」- 备注信息
     */
    @Override
    public String getComment() {
        return this.comment;
    }

    /**
     * Setter for <code>ZDB.S_RESOURCE.COMMENT</code>. 「comment」- 备注信息
     */
    @Override
    public SResource setComment(String comment) {
        this.comment = comment;
        return this;
    }

    /**
     * Getter for <code>ZDB.S_RESOURCE.LEVEL</code>. 「level」- 资源需求级别
     */
    @Override
    public Integer getLevel() {
        return this.level;
    }

    /**
     * Setter for <code>ZDB.S_RESOURCE.LEVEL</code>. 「level」- 资源需求级别
     */
    @Override
    public SResource setLevel(Integer level) {
        this.level = level;
        return this;
    }

    /**
     * Getter for <code>ZDB.S_RESOURCE.MODE_ROLE</code>. 「modeRole」- 该资源查找角色的模式
     */
    @Override
    public String getModeRole() {
        return this.modeRole;
    }

    /**
     * Setter for <code>ZDB.S_RESOURCE.MODE_ROLE</code>. 「modeRole」- 该资源查找角色的模式
     */
    @Override
    public SResource setModeRole(String modeRole) {
        this.modeRole = modeRole;
        return this;
    }

    /**
     * Getter for <code>ZDB.S_RESOURCE.MODE_GROUP</code>. 「modeGroup」- 该资源查找组的模式
     */
    @Override
    public String getModeGroup() {
        return this.modeGroup;
    }

    /**
     * Setter for <code>ZDB.S_RESOURCE.MODE_GROUP</code>. 「modeGroup」- 该资源查找组的模式
     */
    @Override
    public SResource setModeGroup(String modeGroup) {
        this.modeGroup = modeGroup;
        return this;
    }

    /**
     * Getter for <code>ZDB.S_RESOURCE.MODE_TREE</code>. 「modeTree」-
     * 该资源处理树（用户组）的模式
     */
    @Override
    public String getModeTree() {
        return this.modeTree;
    }

    /**
     * Setter for <code>ZDB.S_RESOURCE.MODE_TREE</code>. 「modeTree」-
     * 该资源处理树（用户组）的模式
     */
    @Override
    public SResource setModeTree(String modeTree) {
        this.modeTree = modeTree;
        return this;
    }

    /**
     * Getter for <code>ZDB.S_RESOURCE.VIRTUAL</code>. 「virtual」- 虚拟资源
     */
    @Override
    public Boolean getVirtual() {
        return this.virtual;
    }

    /**
     * Setter for <code>ZDB.S_RESOURCE.VIRTUAL</code>. 「virtual」- 虚拟资源
     */
    @Override
    public SResource setVirtual(Boolean virtual) {
        this.virtual = virtual;
        return this;
    }

    /**
     * Getter for <code>ZDB.S_RESOURCE.SEEK_SYNTAX</code>. 「seekSyntax」- 访问者语法
     */
    @Override
    public String getSeekSyntax() {
        return this.seekSyntax;
    }

    /**
     * Setter for <code>ZDB.S_RESOURCE.SEEK_SYNTAX</code>. 「seekSyntax」- 访问者语法
     */
    @Override
    public SResource setSeekSyntax(String seekSyntax) {
        this.seekSyntax = seekSyntax;
        return this;
    }

    /**
     * Getter for <code>ZDB.S_RESOURCE.SEEK_CONFIG</code>. 「seekConfig」- 访问者配置
     */
    @Override
    public String getSeekConfig() {
        return this.seekConfig;
    }

    /**
     * Setter for <code>ZDB.S_RESOURCE.SEEK_CONFIG</code>. 「seekConfig」- 访问者配置
     */
    @Override
    public SResource setSeekConfig(String seekConfig) {
        this.seekConfig = seekConfig;
        return this;
    }

    /**
     * Getter for <code>ZDB.S_RESOURCE.SEEK_COMPONENT</code>. 「seekComponent」-
     * 访问者组件
     */
    @Override
    public String getSeekComponent() {
        return this.seekComponent;
    }

    /**
     * Setter for <code>ZDB.S_RESOURCE.SEEK_COMPONENT</code>. 「seekComponent」-
     * 访问者组件
     */
    @Override
    public SResource setSeekComponent(String seekComponent) {
        this.seekComponent = seekComponent;
        return this;
    }

    /**
     * Getter for <code>ZDB.S_RESOURCE.SIGMA</code>. 「sigma」- 统一标识
     */
    @Override
    public String getSigma() {
        return this.sigma;
    }

    /**
     * Setter for <code>ZDB.S_RESOURCE.SIGMA</code>. 「sigma」- 统一标识
     */
    @Override
    public SResource setSigma(String sigma) {
        this.sigma = sigma;
        return this;
    }

    /**
     * Getter for <code>ZDB.S_RESOURCE.CATEGORY</code>. 「category」- 资源分类
     */
    @Override
    public String getCategory() {
        return this.category;
    }

    /**
     * Setter for <code>ZDB.S_RESOURCE.CATEGORY</code>. 「category」- 资源分类
     */
    @Override
    public SResource setCategory(String category) {
        this.category = category;
        return this;
    }

    /**
     * Getter for <code>ZDB.S_RESOURCE.LANGUAGE</code>. 「language」- 使用的语言
     */
    @Override
    public String getLanguage() {
        return this.language;
    }

    /**
     * Setter for <code>ZDB.S_RESOURCE.LANGUAGE</code>. 「language」- 使用的语言
     */
    @Override
    public SResource setLanguage(String language) {
        this.language = language;
        return this;
    }

    /**
     * Getter for <code>ZDB.S_RESOURCE.ACTIVE</code>. 「active」- 是否启用
     */
    @Override
    public Boolean getActive() {
        return this.active;
    }

    /**
     * Setter for <code>ZDB.S_RESOURCE.ACTIVE</code>. 「active」- 是否启用
     */
    @Override
    public SResource setActive(Boolean active) {
        this.active = active;
        return this;
    }

    /**
     * Getter for <code>ZDB.S_RESOURCE.METADATA</code>. 「metadata」- 附加配置数据
     */
    @Override
    public String getMetadata() {
        return this.metadata;
    }

    /**
     * Setter for <code>ZDB.S_RESOURCE.METADATA</code>. 「metadata」- 附加配置数据
     */
    @Override
    public SResource setMetadata(String metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * Getter for <code>ZDB.S_RESOURCE.CREATED_AT</code>. 「createdAt」- 创建时间
     */
    @Override
    public LocalDateTime getCreatedAt() {
        return this.createdAt;
    }

    /**
     * Setter for <code>ZDB.S_RESOURCE.CREATED_AT</code>. 「createdAt」- 创建时间
     */
    @Override
    public SResource setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * Getter for <code>ZDB.S_RESOURCE.CREATED_BY</code>. 「createdBy」- 创建人
     */
    @Override
    public String getCreatedBy() {
        return this.createdBy;
    }

    /**
     * Setter for <code>ZDB.S_RESOURCE.CREATED_BY</code>. 「createdBy」- 创建人
     */
    @Override
    public SResource setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    /**
     * Getter for <code>ZDB.S_RESOURCE.UPDATED_AT</code>. 「updatedAt」- 更新时间
     */
    @Override
    public LocalDateTime getUpdatedAt() {
        return this.updatedAt;
    }

    /**
     * Setter for <code>ZDB.S_RESOURCE.UPDATED_AT</code>. 「updatedAt」- 更新时间
     */
    @Override
    public SResource setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * Getter for <code>ZDB.S_RESOURCE.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    @Override
    public String getUpdatedBy() {
        return this.updatedBy;
    }

    /**
     * Setter for <code>ZDB.S_RESOURCE.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    @Override
    public SResource setUpdatedBy(String updatedBy) {
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
        final SResource other = (SResource) obj;
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
        if (this.identifier == null) {
            if (other.identifier != null)
                return false;
        }
        else if (!this.identifier.equals(other.identifier))
            return false;
        if (this.comment == null) {
            if (other.comment != null)
                return false;
        }
        else if (!this.comment.equals(other.comment))
            return false;
        if (this.level == null) {
            if (other.level != null)
                return false;
        }
        else if (!this.level.equals(other.level))
            return false;
        if (this.modeRole == null) {
            if (other.modeRole != null)
                return false;
        }
        else if (!this.modeRole.equals(other.modeRole))
            return false;
        if (this.modeGroup == null) {
            if (other.modeGroup != null)
                return false;
        }
        else if (!this.modeGroup.equals(other.modeGroup))
            return false;
        if (this.modeTree == null) {
            if (other.modeTree != null)
                return false;
        }
        else if (!this.modeTree.equals(other.modeTree))
            return false;
        if (this.virtual == null) {
            if (other.virtual != null)
                return false;
        }
        else if (!this.virtual.equals(other.virtual))
            return false;
        if (this.seekSyntax == null) {
            if (other.seekSyntax != null)
                return false;
        }
        else if (!this.seekSyntax.equals(other.seekSyntax))
            return false;
        if (this.seekConfig == null) {
            if (other.seekConfig != null)
                return false;
        }
        else if (!this.seekConfig.equals(other.seekConfig))
            return false;
        if (this.seekComponent == null) {
            if (other.seekComponent != null)
                return false;
        }
        else if (!this.seekComponent.equals(other.seekComponent))
            return false;
        if (this.sigma == null) {
            if (other.sigma != null)
                return false;
        }
        else if (!this.sigma.equals(other.sigma))
            return false;
        if (this.category == null) {
            if (other.category != null)
                return false;
        }
        else if (!this.category.equals(other.category))
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
        result = prime * result + ((this.name == null) ? 0 : this.name.hashCode());
        result = prime * result + ((this.type == null) ? 0 : this.type.hashCode());
        result = prime * result + ((this.identifier == null) ? 0 : this.identifier.hashCode());
        result = prime * result + ((this.comment == null) ? 0 : this.comment.hashCode());
        result = prime * result + ((this.level == null) ? 0 : this.level.hashCode());
        result = prime * result + ((this.modeRole == null) ? 0 : this.modeRole.hashCode());
        result = prime * result + ((this.modeGroup == null) ? 0 : this.modeGroup.hashCode());
        result = prime * result + ((this.modeTree == null) ? 0 : this.modeTree.hashCode());
        result = prime * result + ((this.virtual == null) ? 0 : this.virtual.hashCode());
        result = prime * result + ((this.seekSyntax == null) ? 0 : this.seekSyntax.hashCode());
        result = prime * result + ((this.seekConfig == null) ? 0 : this.seekConfig.hashCode());
        result = prime * result + ((this.seekComponent == null) ? 0 : this.seekComponent.hashCode());
        result = prime * result + ((this.sigma == null) ? 0 : this.sigma.hashCode());
        result = prime * result + ((this.category == null) ? 0 : this.category.hashCode());
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
        StringBuilder sb = new StringBuilder("SResource (");

        sb.append(key);
        sb.append(", ").append(code);
        sb.append(", ").append(name);
        sb.append(", ").append(type);
        sb.append(", ").append(identifier);
        sb.append(", ").append(comment);
        sb.append(", ").append(level);
        sb.append(", ").append(modeRole);
        sb.append(", ").append(modeGroup);
        sb.append(", ").append(modeTree);
        sb.append(", ").append(virtual);
        sb.append(", ").append(seekSyntax);
        sb.append(", ").append(seekConfig);
        sb.append(", ").append(seekComponent);
        sb.append(", ").append(sigma);
        sb.append(", ").append(category);
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
    public void from(ISResource from) {
        setKey(from.getKey());
        setCode(from.getCode());
        setName(from.getName());
        setType(from.getType());
        setIdentifier(from.getIdentifier());
        setComment(from.getComment());
        setLevel(from.getLevel());
        setModeRole(from.getModeRole());
        setModeGroup(from.getModeGroup());
        setModeTree(from.getModeTree());
        setVirtual(from.getVirtual());
        setSeekSyntax(from.getSeekSyntax());
        setSeekConfig(from.getSeekConfig());
        setSeekComponent(from.getSeekComponent());
        setSigma(from.getSigma());
        setCategory(from.getCategory());
        setLanguage(from.getLanguage());
        setActive(from.getActive());
        setMetadata(from.getMetadata());
        setCreatedAt(from.getCreatedAt());
        setCreatedBy(from.getCreatedBy());
        setUpdatedAt(from.getUpdatedAt());
        setUpdatedBy(from.getUpdatedBy());
    }

    @Override
    public <E extends ISResource> E into(E into) {
        into.from(this);
        return into;
    }
}
