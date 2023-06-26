/*
 * This file is generated by jOOQ.
 */
package cn.vertxup.integration.domain.tables.pojos;


import cn.vertxup.integration.domain.tables.interfaces.IDDocSegment;

import io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo;

import java.time.LocalDateTime;


import static io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo.*;
/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class DDocSegment implements VertxPojo, IDDocSegment {

    private static final long serialVersionUID = 1L;

    private String key;
    private String code;
    private String name;
    private String type;
    private String prefix;
    private String status;
    private String content;
    private String contentText;
    private String contentStore;
    private Integer sort;
    private Integer level;
    private String docId;
    private String parentId;
    private String sigma;
    private String language;
    private Boolean active;
    private String metadata;
    private LocalDateTime createdAt;
    private String createdBy;
    private LocalDateTime updatedAt;
    private String updatedBy;

    public DDocSegment() {}

    public DDocSegment(IDDocSegment value) {
        this.key = value.getKey();
        this.code = value.getCode();
        this.name = value.getName();
        this.type = value.getType();
        this.prefix = value.getPrefix();
        this.status = value.getStatus();
        this.content = value.getContent();
        this.contentText = value.getContentText();
        this.contentStore = value.getContentStore();
        this.sort = value.getSort();
        this.level = value.getLevel();
        this.docId = value.getDocId();
        this.parentId = value.getParentId();
        this.sigma = value.getSigma();
        this.language = value.getLanguage();
        this.active = value.getActive();
        this.metadata = value.getMetadata();
        this.createdAt = value.getCreatedAt();
        this.createdBy = value.getCreatedBy();
        this.updatedAt = value.getUpdatedAt();
        this.updatedBy = value.getUpdatedBy();
    }

    public DDocSegment(
        String key,
        String code,
        String name,
        String type,
        String prefix,
        String status,
        String content,
        String contentText,
        String contentStore,
        Integer sort,
        Integer level,
        String docId,
        String parentId,
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
        this.name = name;
        this.type = type;
        this.prefix = prefix;
        this.status = status;
        this.content = content;
        this.contentText = contentText;
        this.contentStore = contentStore;
        this.sort = sort;
        this.level = level;
        this.docId = docId;
        this.parentId = parentId;
        this.sigma = sigma;
        this.language = language;
        this.active = active;
        this.metadata = metadata;
        this.createdAt = createdAt;
        this.createdBy = createdBy;
        this.updatedAt = updatedAt;
        this.updatedBy = updatedBy;
    }

        public DDocSegment(io.vertx.core.json.JsonObject json) {
                this();
                fromJson(json);
        }

    /**
     * Getter for <code>DB_ETERNAL.D_DOC_SEGMENT.KEY</code>. 「key」- 文档主键，唯一标识
     */
    @Override
    public String getKey() {
        return this.key;
    }

    /**
     * Setter for <code>DB_ETERNAL.D_DOC_SEGMENT.KEY</code>. 「key」- 文档主键，唯一标识
     */
    @Override
    public DDocSegment setKey(String key) {
        this.key = key;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.D_DOC_SEGMENT.CODE</code>. 「code」- 章节编号
     */
    @Override
    public String getCode() {
        return this.code;
    }

    /**
     * Setter for <code>DB_ETERNAL.D_DOC_SEGMENT.CODE</code>. 「code」- 章节编号
     */
    @Override
    public DDocSegment setCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.D_DOC_SEGMENT.NAME</code>. 「name」- 章节标题
     */
    @Override
    public String getName() {
        return this.name;
    }

    /**
     * Setter for <code>DB_ETERNAL.D_DOC_SEGMENT.NAME</code>. 「name」- 章节标题
     */
    @Override
    public DDocSegment setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.D_DOC_SEGMENT.TYPE</code>. 「type」- 章节类型
     */
    @Override
    public String getType() {
        return this.type;
    }

    /**
     * Setter for <code>DB_ETERNAL.D_DOC_SEGMENT.TYPE</code>. 「type」- 章节类型
     */
    @Override
    public DDocSegment setType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.D_DOC_SEGMENT.PREFIX</code>. 「prefix」- 章节前缀
     */
    @Override
    public String getPrefix() {
        return this.prefix;
    }

    /**
     * Setter for <code>DB_ETERNAL.D_DOC_SEGMENT.PREFIX</code>. 「prefix」- 章节前缀
     */
    @Override
    public DDocSegment setPrefix(String prefix) {
        this.prefix = prefix;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.D_DOC_SEGMENT.STATUS</code>. 「status」- 状态
     */
    @Override
    public String getStatus() {
        return this.status;
    }

    /**
     * Setter for <code>DB_ETERNAL.D_DOC_SEGMENT.STATUS</code>. 「status」- 状态
     */
    @Override
    public DDocSegment setStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.D_DOC_SEGMENT.CONTENT</code>. 「content」-
     * 章节内容（带格式）
     */
    @Override
    public String getContent() {
        return this.content;
    }

    /**
     * Setter for <code>DB_ETERNAL.D_DOC_SEGMENT.CONTENT</code>. 「content」-
     * 章节内容（带格式）
     */
    @Override
    public DDocSegment setContent(String content) {
        this.content = content;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.D_DOC_SEGMENT.CONTENT_TEXT</code>.
     * 「contentText」- 无格式章节内容
     */
    @Override
    public String getContentText() {
        return this.contentText;
    }

    /**
     * Setter for <code>DB_ETERNAL.D_DOC_SEGMENT.CONTENT_TEXT</code>.
     * 「contentText」- 无格式章节内容
     */
    @Override
    public DDocSegment setContentText(String contentText) {
        this.contentText = contentText;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.D_DOC_SEGMENT.CONTENT_STORE</code>.
     * 「contentStore」- 存储格式
     */
    @Override
    public String getContentStore() {
        return this.contentStore;
    }

    /**
     * Setter for <code>DB_ETERNAL.D_DOC_SEGMENT.CONTENT_STORE</code>.
     * 「contentStore」- 存储格式
     */
    @Override
    public DDocSegment setContentStore(String contentStore) {
        this.contentStore = contentStore;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.D_DOC_SEGMENT.SORT</code>. 「sort」- 排序
     */
    @Override
    public Integer getSort() {
        return this.sort;
    }

    /**
     * Setter for <code>DB_ETERNAL.D_DOC_SEGMENT.SORT</code>. 「sort」- 排序
     */
    @Override
    public DDocSegment setSort(Integer sort) {
        this.sort = sort;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.D_DOC_SEGMENT.LEVEL</code>. 「level」- 章节层级
     */
    @Override
    public Integer getLevel() {
        return this.level;
    }

    /**
     * Setter for <code>DB_ETERNAL.D_DOC_SEGMENT.LEVEL</code>. 「level」- 章节层级
     */
    @Override
    public DDocSegment setLevel(Integer level) {
        this.level = level;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.D_DOC_SEGMENT.DOC_ID</code>. 「docId」-
     * 章节所属文档ID
     */
    @Override
    public String getDocId() {
        return this.docId;
    }

    /**
     * Setter for <code>DB_ETERNAL.D_DOC_SEGMENT.DOC_ID</code>. 「docId」-
     * 章节所属文档ID
     */
    @Override
    public DDocSegment setDocId(String docId) {
        this.docId = docId;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.D_DOC_SEGMENT.PARENT_ID</code>. 「parentId」-
     * 父章节ID
     */
    @Override
    public String getParentId() {
        return this.parentId;
    }

    /**
     * Setter for <code>DB_ETERNAL.D_DOC_SEGMENT.PARENT_ID</code>. 「parentId」-
     * 父章节ID
     */
    @Override
    public DDocSegment setParentId(String parentId) {
        this.parentId = parentId;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.D_DOC_SEGMENT.SIGMA</code>. 「sigma」- 统一标识
     */
    @Override
    public String getSigma() {
        return this.sigma;
    }

    /**
     * Setter for <code>DB_ETERNAL.D_DOC_SEGMENT.SIGMA</code>. 「sigma」- 统一标识
     */
    @Override
    public DDocSegment setSigma(String sigma) {
        this.sigma = sigma;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.D_DOC_SEGMENT.LANGUAGE</code>. 「language」-
     * 使用的语言
     */
    @Override
    public String getLanguage() {
        return this.language;
    }

    /**
     * Setter for <code>DB_ETERNAL.D_DOC_SEGMENT.LANGUAGE</code>. 「language」-
     * 使用的语言
     */
    @Override
    public DDocSegment setLanguage(String language) {
        this.language = language;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.D_DOC_SEGMENT.ACTIVE</code>. 「active」- 是否启用
     */
    @Override
    public Boolean getActive() {
        return this.active;
    }

    /**
     * Setter for <code>DB_ETERNAL.D_DOC_SEGMENT.ACTIVE</code>. 「active」- 是否启用
     */
    @Override
    public DDocSegment setActive(Boolean active) {
        this.active = active;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.D_DOC_SEGMENT.METADATA</code>. 「metadata」-
     * 附加配置数据
     */
    @Override
    public String getMetadata() {
        return this.metadata;
    }

    /**
     * Setter for <code>DB_ETERNAL.D_DOC_SEGMENT.METADATA</code>. 「metadata」-
     * 附加配置数据
     */
    @Override
    public DDocSegment setMetadata(String metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.D_DOC_SEGMENT.CREATED_AT</code>. 「createdAt」-
     * 创建时间
     */
    @Override
    public LocalDateTime getCreatedAt() {
        return this.createdAt;
    }

    /**
     * Setter for <code>DB_ETERNAL.D_DOC_SEGMENT.CREATED_AT</code>. 「createdAt」-
     * 创建时间
     */
    @Override
    public DDocSegment setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.D_DOC_SEGMENT.CREATED_BY</code>. 「createdBy」-
     * 创建人
     */
    @Override
    public String getCreatedBy() {
        return this.createdBy;
    }

    /**
     * Setter for <code>DB_ETERNAL.D_DOC_SEGMENT.CREATED_BY</code>. 「createdBy」-
     * 创建人
     */
    @Override
    public DDocSegment setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.D_DOC_SEGMENT.UPDATED_AT</code>. 「updatedAt」-
     * 更新时间
     */
    @Override
    public LocalDateTime getUpdatedAt() {
        return this.updatedAt;
    }

    /**
     * Setter for <code>DB_ETERNAL.D_DOC_SEGMENT.UPDATED_AT</code>. 「updatedAt」-
     * 更新时间
     */
    @Override
    public DDocSegment setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.D_DOC_SEGMENT.UPDATED_BY</code>. 「updatedBy」-
     * 更新人
     */
    @Override
    public String getUpdatedBy() {
        return this.updatedBy;
    }

    /**
     * Setter for <code>DB_ETERNAL.D_DOC_SEGMENT.UPDATED_BY</code>. 「updatedBy」-
     * 更新人
     */
    @Override
    public DDocSegment setUpdatedBy(String updatedBy) {
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
        final DDocSegment other = (DDocSegment) obj;
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
        if (this.prefix == null) {
            if (other.prefix != null)
                return false;
        }
        else if (!this.prefix.equals(other.prefix))
            return false;
        if (this.status == null) {
            if (other.status != null)
                return false;
        }
        else if (!this.status.equals(other.status))
            return false;
        if (this.content == null) {
            if (other.content != null)
                return false;
        }
        else if (!this.content.equals(other.content))
            return false;
        if (this.contentText == null) {
            if (other.contentText != null)
                return false;
        }
        else if (!this.contentText.equals(other.contentText))
            return false;
        if (this.contentStore == null) {
            if (other.contentStore != null)
                return false;
        }
        else if (!this.contentStore.equals(other.contentStore))
            return false;
        if (this.sort == null) {
            if (other.sort != null)
                return false;
        }
        else if (!this.sort.equals(other.sort))
            return false;
        if (this.level == null) {
            if (other.level != null)
                return false;
        }
        else if (!this.level.equals(other.level))
            return false;
        if (this.docId == null) {
            if (other.docId != null)
                return false;
        }
        else if (!this.docId.equals(other.docId))
            return false;
        if (this.parentId == null) {
            if (other.parentId != null)
                return false;
        }
        else if (!this.parentId.equals(other.parentId))
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
        result = prime * result + ((this.name == null) ? 0 : this.name.hashCode());
        result = prime * result + ((this.type == null) ? 0 : this.type.hashCode());
        result = prime * result + ((this.prefix == null) ? 0 : this.prefix.hashCode());
        result = prime * result + ((this.status == null) ? 0 : this.status.hashCode());
        result = prime * result + ((this.content == null) ? 0 : this.content.hashCode());
        result = prime * result + ((this.contentText == null) ? 0 : this.contentText.hashCode());
        result = prime * result + ((this.contentStore == null) ? 0 : this.contentStore.hashCode());
        result = prime * result + ((this.sort == null) ? 0 : this.sort.hashCode());
        result = prime * result + ((this.level == null) ? 0 : this.level.hashCode());
        result = prime * result + ((this.docId == null) ? 0 : this.docId.hashCode());
        result = prime * result + ((this.parentId == null) ? 0 : this.parentId.hashCode());
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
        StringBuilder sb = new StringBuilder("DDocSegment (");

        sb.append(key);
        sb.append(", ").append(code);
        sb.append(", ").append(name);
        sb.append(", ").append(type);
        sb.append(", ").append(prefix);
        sb.append(", ").append(status);
        sb.append(", ").append(content);
        sb.append(", ").append(contentText);
        sb.append(", ").append(contentStore);
        sb.append(", ").append(sort);
        sb.append(", ").append(level);
        sb.append(", ").append(docId);
        sb.append(", ").append(parentId);
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
    public void from(IDDocSegment from) {
        setKey(from.getKey());
        setCode(from.getCode());
        setName(from.getName());
        setType(from.getType());
        setPrefix(from.getPrefix());
        setStatus(from.getStatus());
        setContent(from.getContent());
        setContentText(from.getContentText());
        setContentStore(from.getContentStore());
        setSort(from.getSort());
        setLevel(from.getLevel());
        setDocId(from.getDocId());
        setParentId(from.getParentId());
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
    public <E extends IDDocSegment> E into(E into) {
        into.from(this);
        return into;
    }
}
