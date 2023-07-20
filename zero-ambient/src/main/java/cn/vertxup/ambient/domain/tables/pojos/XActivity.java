/*
 * This file is generated by jOOQ.
 */
package cn.vertxup.ambient.domain.tables.pojos;


import cn.vertxup.ambient.domain.tables.interfaces.IXActivity;

import io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo;

import java.time.LocalDateTime;


import static io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo.*;
/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class XActivity implements VertxPojo, IXActivity {

    private static final long serialVersionUID = 1L;

    private String key;
    private String type;
    private String serial;
    private String description;
    private String modelId;
    private String modelKey;
    private String modelCategory;
    private String taskName;
    private String taskSerial;
    private String recordOld;
    private String recordNew;
    private String sigma;
    private String language;
    private Boolean active;
    private String metadata;
    private LocalDateTime createdAt;
    private String createdBy;
    private LocalDateTime updatedAt;
    private String updatedBy;

    public XActivity() {}

    public XActivity(IXActivity value) {
        this.key = value.getKey();
        this.type = value.getType();
        this.serial = value.getSerial();
        this.description = value.getDescription();
        this.modelId = value.getModelId();
        this.modelKey = value.getModelKey();
        this.modelCategory = value.getModelCategory();
        this.taskName = value.getTaskName();
        this.taskSerial = value.getTaskSerial();
        this.recordOld = value.getRecordOld();
        this.recordNew = value.getRecordNew();
        this.sigma = value.getSigma();
        this.language = value.getLanguage();
        this.active = value.getActive();
        this.metadata = value.getMetadata();
        this.createdAt = value.getCreatedAt();
        this.createdBy = value.getCreatedBy();
        this.updatedAt = value.getUpdatedAt();
        this.updatedBy = value.getUpdatedBy();
    }

    public XActivity(
        String key,
        String type,
        String serial,
        String description,
        String modelId,
        String modelKey,
        String modelCategory,
        String taskName,
        String taskSerial,
        String recordOld,
        String recordNew,
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
        this.type = type;
        this.serial = serial;
        this.description = description;
        this.modelId = modelId;
        this.modelKey = modelKey;
        this.modelCategory = modelCategory;
        this.taskName = taskName;
        this.taskSerial = taskSerial;
        this.recordOld = recordOld;
        this.recordNew = recordNew;
        this.sigma = sigma;
        this.language = language;
        this.active = active;
        this.metadata = metadata;
        this.createdAt = createdAt;
        this.createdBy = createdBy;
        this.updatedAt = updatedAt;
        this.updatedBy = updatedBy;
    }

        public XActivity(io.vertx.core.json.JsonObject json) {
                this();
                fromJson(json);
        }

    /**
     * Getter for <code>ZDB.X_ACTIVITY.KEY</code>. 「key」- 操作行为主键
     */
    @Override
    public String getKey() {
        return this.key;
    }

    /**
     * Setter for <code>ZDB.X_ACTIVITY.KEY</code>. 「key」- 操作行为主键
     */
    @Override
    public XActivity setKey(String key) {
        this.key = key;
        return this;
    }

    /**
     * Getter for <code>ZDB.X_ACTIVITY.TYPE</code>. 「type」- 操作类型
     */
    @Override
    public String getType() {
        return this.type;
    }

    /**
     * Setter for <code>ZDB.X_ACTIVITY.TYPE</code>. 「type」- 操作类型
     */
    @Override
    public XActivity setType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Getter for <code>ZDB.X_ACTIVITY.SERIAL</code>. 「serial」- 变更记录号
     */
    @Override
    public String getSerial() {
        return this.serial;
    }

    /**
     * Setter for <code>ZDB.X_ACTIVITY.SERIAL</code>. 「serial」- 变更记录号
     */
    @Override
    public XActivity setSerial(String serial) {
        this.serial = serial;
        return this;
    }

    /**
     * Getter for <code>ZDB.X_ACTIVITY.DESCRIPTION</code>. 「description」- 操作描述信息
     */
    @Override
    public String getDescription() {
        return this.description;
    }

    /**
     * Setter for <code>ZDB.X_ACTIVITY.DESCRIPTION</code>. 「description」- 操作描述信息
     */
    @Override
    public XActivity setDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Getter for <code>ZDB.X_ACTIVITY.MODEL_ID</code>. 「modelId」-
     * 组所关联的模型identifier，用于描述
     */
    @Override
    public String getModelId() {
        return this.modelId;
    }

    /**
     * Setter for <code>ZDB.X_ACTIVITY.MODEL_ID</code>. 「modelId」-
     * 组所关联的模型identifier，用于描述
     */
    @Override
    public XActivity setModelId(String modelId) {
        this.modelId = modelId;
        return this;
    }

    /**
     * Getter for <code>ZDB.X_ACTIVITY.MODEL_KEY</code>. 「modelKey」-
     * 组所关联的模型记录ID，用于描述哪一个Model中的记录
     */
    @Override
    public String getModelKey() {
        return this.modelKey;
    }

    /**
     * Setter for <code>ZDB.X_ACTIVITY.MODEL_KEY</code>. 「modelKey」-
     * 组所关联的模型记录ID，用于描述哪一个Model中的记录
     */
    @Override
    public XActivity setModelKey(String modelKey) {
        this.modelKey = modelKey;
        return this;
    }

    /**
     * Getter for <code>ZDB.X_ACTIVITY.MODEL_CATEGORY</code>. 「modelCategory」-
     * 关联的category记录，只包含叶节点
     */
    @Override
    public String getModelCategory() {
        return this.modelCategory;
    }

    /**
     * Setter for <code>ZDB.X_ACTIVITY.MODEL_CATEGORY</code>. 「modelCategory」-
     * 关联的category记录，只包含叶节点
     */
    @Override
    public XActivity setModelCategory(String modelCategory) {
        this.modelCategory = modelCategory;
        return this;
    }

    /**
     * Getter for <code>ZDB.X_ACTIVITY.TASK_NAME</code>. 「taskName」- 任务名称
     */
    @Override
    public String getTaskName() {
        return this.taskName;
    }

    /**
     * Setter for <code>ZDB.X_ACTIVITY.TASK_NAME</code>. 「taskName」- 任务名称
     */
    @Override
    public XActivity setTaskName(String taskName) {
        this.taskName = taskName;
        return this;
    }

    /**
     * Getter for <code>ZDB.X_ACTIVITY.TASK_SERIAL</code>. 「taskSerial」- 任务单号
     */
    @Override
    public String getTaskSerial() {
        return this.taskSerial;
    }

    /**
     * Setter for <code>ZDB.X_ACTIVITY.TASK_SERIAL</code>. 「taskSerial」- 任务单号
     */
    @Override
    public XActivity setTaskSerial(String taskSerial) {
        this.taskSerial = taskSerial;
        return this;
    }

    /**
     * Getter for <code>ZDB.X_ACTIVITY.RECORD_OLD</code>. 「recordOld」-
     * 变更之前的数据（用于回滚）
     */
    @Override
    public String getRecordOld() {
        return this.recordOld;
    }

    /**
     * Setter for <code>ZDB.X_ACTIVITY.RECORD_OLD</code>. 「recordOld」-
     * 变更之前的数据（用于回滚）
     */
    @Override
    public XActivity setRecordOld(String recordOld) {
        this.recordOld = recordOld;
        return this;
    }

    /**
     * Getter for <code>ZDB.X_ACTIVITY.RECORD_NEW</code>. 「recordNew」-
     * 变更之后的数据（用于更新）
     */
    @Override
    public String getRecordNew() {
        return this.recordNew;
    }

    /**
     * Setter for <code>ZDB.X_ACTIVITY.RECORD_NEW</code>. 「recordNew」-
     * 变更之后的数据（用于更新）
     */
    @Override
    public XActivity setRecordNew(String recordNew) {
        this.recordNew = recordNew;
        return this;
    }

    /**
     * Getter for <code>ZDB.X_ACTIVITY.SIGMA</code>. 「sigma」- 用户组绑定的统一标识
     */
    @Override
    public String getSigma() {
        return this.sigma;
    }

    /**
     * Setter for <code>ZDB.X_ACTIVITY.SIGMA</code>. 「sigma」- 用户组绑定的统一标识
     */
    @Override
    public XActivity setSigma(String sigma) {
        this.sigma = sigma;
        return this;
    }

    /**
     * Getter for <code>ZDB.X_ACTIVITY.LANGUAGE</code>. 「language」- 使用的语言
     */
    @Override
    public String getLanguage() {
        return this.language;
    }

    /**
     * Setter for <code>ZDB.X_ACTIVITY.LANGUAGE</code>. 「language」- 使用的语言
     */
    @Override
    public XActivity setLanguage(String language) {
        this.language = language;
        return this;
    }

    /**
     * Getter for <code>ZDB.X_ACTIVITY.ACTIVE</code>. 「active」- 是否启用
     */
    @Override
    public Boolean getActive() {
        return this.active;
    }

    /**
     * Setter for <code>ZDB.X_ACTIVITY.ACTIVE</code>. 「active」- 是否启用
     */
    @Override
    public XActivity setActive(Boolean active) {
        this.active = active;
        return this;
    }

    /**
     * Getter for <code>ZDB.X_ACTIVITY.METADATA</code>. 「metadata」- 附加配置数据
     */
    @Override
    public String getMetadata() {
        return this.metadata;
    }

    /**
     * Setter for <code>ZDB.X_ACTIVITY.METADATA</code>. 「metadata」- 附加配置数据
     */
    @Override
    public XActivity setMetadata(String metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * Getter for <code>ZDB.X_ACTIVITY.CREATED_AT</code>. 「createdAt」- 创建时间
     */
    @Override
    public LocalDateTime getCreatedAt() {
        return this.createdAt;
    }

    /**
     * Setter for <code>ZDB.X_ACTIVITY.CREATED_AT</code>. 「createdAt」- 创建时间
     */
    @Override
    public XActivity setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * Getter for <code>ZDB.X_ACTIVITY.CREATED_BY</code>. 「createdBy」- 创建人
     */
    @Override
    public String getCreatedBy() {
        return this.createdBy;
    }

    /**
     * Setter for <code>ZDB.X_ACTIVITY.CREATED_BY</code>. 「createdBy」- 创建人
     */
    @Override
    public XActivity setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    /**
     * Getter for <code>ZDB.X_ACTIVITY.UPDATED_AT</code>. 「updatedAt」- 更新时间
     */
    @Override
    public LocalDateTime getUpdatedAt() {
        return this.updatedAt;
    }

    /**
     * Setter for <code>ZDB.X_ACTIVITY.UPDATED_AT</code>. 「updatedAt」- 更新时间
     */
    @Override
    public XActivity setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * Getter for <code>ZDB.X_ACTIVITY.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    @Override
    public String getUpdatedBy() {
        return this.updatedBy;
    }

    /**
     * Setter for <code>ZDB.X_ACTIVITY.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    @Override
    public XActivity setUpdatedBy(String updatedBy) {
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
        final XActivity other = (XActivity) obj;
        if (this.key == null) {
            if (other.key != null)
                return false;
        }
        else if (!this.key.equals(other.key))
            return false;
        if (this.type == null) {
            if (other.type != null)
                return false;
        }
        else if (!this.type.equals(other.type))
            return false;
        if (this.serial == null) {
            if (other.serial != null)
                return false;
        }
        else if (!this.serial.equals(other.serial))
            return false;
        if (this.description == null) {
            if (other.description != null)
                return false;
        }
        else if (!this.description.equals(other.description))
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
        if (this.modelCategory == null) {
            if (other.modelCategory != null)
                return false;
        }
        else if (!this.modelCategory.equals(other.modelCategory))
            return false;
        if (this.taskName == null) {
            if (other.taskName != null)
                return false;
        }
        else if (!this.taskName.equals(other.taskName))
            return false;
        if (this.taskSerial == null) {
            if (other.taskSerial != null)
                return false;
        }
        else if (!this.taskSerial.equals(other.taskSerial))
            return false;
        if (this.recordOld == null) {
            if (other.recordOld != null)
                return false;
        }
        else if (!this.recordOld.equals(other.recordOld))
            return false;
        if (this.recordNew == null) {
            if (other.recordNew != null)
                return false;
        }
        else if (!this.recordNew.equals(other.recordNew))
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
        result = prime * result + ((this.type == null) ? 0 : this.type.hashCode());
        result = prime * result + ((this.serial == null) ? 0 : this.serial.hashCode());
        result = prime * result + ((this.description == null) ? 0 : this.description.hashCode());
        result = prime * result + ((this.modelId == null) ? 0 : this.modelId.hashCode());
        result = prime * result + ((this.modelKey == null) ? 0 : this.modelKey.hashCode());
        result = prime * result + ((this.modelCategory == null) ? 0 : this.modelCategory.hashCode());
        result = prime * result + ((this.taskName == null) ? 0 : this.taskName.hashCode());
        result = prime * result + ((this.taskSerial == null) ? 0 : this.taskSerial.hashCode());
        result = prime * result + ((this.recordOld == null) ? 0 : this.recordOld.hashCode());
        result = prime * result + ((this.recordNew == null) ? 0 : this.recordNew.hashCode());
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
        StringBuilder sb = new StringBuilder("XActivity (");

        sb.append(key);
        sb.append(", ").append(type);
        sb.append(", ").append(serial);
        sb.append(", ").append(description);
        sb.append(", ").append(modelId);
        sb.append(", ").append(modelKey);
        sb.append(", ").append(modelCategory);
        sb.append(", ").append(taskName);
        sb.append(", ").append(taskSerial);
        sb.append(", ").append(recordOld);
        sb.append(", ").append(recordNew);
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
    public void from(IXActivity from) {
        setKey(from.getKey());
        setType(from.getType());
        setSerial(from.getSerial());
        setDescription(from.getDescription());
        setModelId(from.getModelId());
        setModelKey(from.getModelKey());
        setModelCategory(from.getModelCategory());
        setTaskName(from.getTaskName());
        setTaskSerial(from.getTaskSerial());
        setRecordOld(from.getRecordOld());
        setRecordNew(from.getRecordNew());
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
    public <E extends IXActivity> E into(E into) {
        into.from(this);
        return into;
    }
}
