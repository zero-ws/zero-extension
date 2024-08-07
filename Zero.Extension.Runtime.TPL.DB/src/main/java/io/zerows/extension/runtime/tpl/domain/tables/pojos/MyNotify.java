/*
 * This file is generated by jOOQ.
 */
package io.zerows.extension.runtime.tpl.domain.tables.pojos;


import io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo;
import io.zerows.extension.runtime.tpl.domain.tables.interfaces.IMyNotify;

import java.time.LocalDateTime;


import static io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo.*;
/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class MyNotify implements VertxPojo, IMyNotify {

    private static final long serialVersionUID = 1L;

    private String key;
    private String ownerType;
    private String ownerId;
    private String configInternal;
    private String configEmail;
    private String configSms;
    private String appId;
    private Boolean active;
    private String sigma;
    private String metadata;
    private String language;
    private LocalDateTime createdAt;
    private String createdBy;
    private LocalDateTime updatedAt;
    private String updatedBy;

    public MyNotify() {}

    public MyNotify(IMyNotify value) {
        this.key = value.getKey();
        this.ownerType = value.getOwnerType();
        this.ownerId = value.getOwnerId();
        this.configInternal = value.getConfigInternal();
        this.configEmail = value.getConfigEmail();
        this.configSms = value.getConfigSms();
        this.appId = value.getAppId();
        this.active = value.getActive();
        this.sigma = value.getSigma();
        this.metadata = value.getMetadata();
        this.language = value.getLanguage();
        this.createdAt = value.getCreatedAt();
        this.createdBy = value.getCreatedBy();
        this.updatedAt = value.getUpdatedAt();
        this.updatedBy = value.getUpdatedBy();
    }

    public MyNotify(
        String key,
        String ownerType,
        String ownerId,
        String configInternal,
        String configEmail,
        String configSms,
        String appId,
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
        this.ownerType = ownerType;
        this.ownerId = ownerId;
        this.configInternal = configInternal;
        this.configEmail = configEmail;
        this.configSms = configSms;
        this.appId = appId;
        this.active = active;
        this.sigma = sigma;
        this.metadata = metadata;
        this.language = language;
        this.createdAt = createdAt;
        this.createdBy = createdBy;
        this.updatedAt = updatedAt;
        this.updatedBy = updatedBy;
    }

        public MyNotify(io.vertx.core.json.JsonObject json) {
                this();
                fromJson(json);
        }

    /**
     * Getter for <code>ZDB.MY_NOTIFY.KEY</code>. 「key」- 设置主键
     */
    @Override
    public String getKey() {
        return this.key;
    }

    /**
     * Setter for <code>ZDB.MY_NOTIFY.KEY</code>. 「key」- 设置主键
     */
    @Override
    public MyNotify setKey(String key) {
        this.key = key;
        return this;
    }

    /**
     * Getter for <code>ZDB.MY_NOTIFY.OWNER_TYPE</code>. 「ownerType」- 拥有者类型
     */
    @Override
    public String getOwnerType() {
        return this.ownerType;
    }

    /**
     * Setter for <code>ZDB.MY_NOTIFY.OWNER_TYPE</code>. 「ownerType」- 拥有者类型
     */
    @Override
    public MyNotify setOwnerType(String ownerType) {
        this.ownerType = ownerType;
        return this;
    }

    /**
     * Getter for <code>ZDB.MY_NOTIFY.OWNER_ID</code>. 「ownerId」- 拥有者ID
     */
    @Override
    public String getOwnerId() {
        return this.ownerId;
    }

    /**
     * Setter for <code>ZDB.MY_NOTIFY.OWNER_ID</code>. 「ownerId」- 拥有者ID
     */
    @Override
    public MyNotify setOwnerId(String ownerId) {
        this.ownerId = ownerId;
        return this;
    }

    /**
     * Getter for <code>ZDB.MY_NOTIFY.CONFIG_INTERNAL</code>. 「configInternal」-
     * 站内信配置
     */
    @Override
    public String getConfigInternal() {
        return this.configInternal;
    }

    /**
     * Setter for <code>ZDB.MY_NOTIFY.CONFIG_INTERNAL</code>. 「configInternal」-
     * 站内信配置
     */
    @Override
    public MyNotify setConfigInternal(String configInternal) {
        this.configInternal = configInternal;
        return this;
    }

    /**
     * Getter for <code>ZDB.MY_NOTIFY.CONFIG_EMAIL</code>. 「configEmail」- 邮件配置
     */
    @Override
    public String getConfigEmail() {
        return this.configEmail;
    }

    /**
     * Setter for <code>ZDB.MY_NOTIFY.CONFIG_EMAIL</code>. 「configEmail」- 邮件配置
     */
    @Override
    public MyNotify setConfigEmail(String configEmail) {
        this.configEmail = configEmail;
        return this;
    }

    /**
     * Getter for <code>ZDB.MY_NOTIFY.CONFIG_SMS</code>. 「configSms」- 短信配置
     */
    @Override
    public String getConfigSms() {
        return this.configSms;
    }

    /**
     * Setter for <code>ZDB.MY_NOTIFY.CONFIG_SMS</code>. 「configSms」- 短信配置
     */
    @Override
    public MyNotify setConfigSms(String configSms) {
        this.configSms = configSms;
        return this;
    }

    /**
     * Getter for <code>ZDB.MY_NOTIFY.APP_ID</code>. 「appId」- 所属应用ID
     */
    @Override
    public String getAppId() {
        return this.appId;
    }

    /**
     * Setter for <code>ZDB.MY_NOTIFY.APP_ID</code>. 「appId」- 所属应用ID
     */
    @Override
    public MyNotify setAppId(String appId) {
        this.appId = appId;
        return this;
    }

    /**
     * Getter for <code>ZDB.MY_NOTIFY.ACTIVE</code>. 「active」- 是否启用
     */
    @Override
    public Boolean getActive() {
        return this.active;
    }

    /**
     * Setter for <code>ZDB.MY_NOTIFY.ACTIVE</code>. 「active」- 是否启用
     */
    @Override
    public MyNotify setActive(Boolean active) {
        this.active = active;
        return this;
    }

    /**
     * Getter for <code>ZDB.MY_NOTIFY.SIGMA</code>. 「sigma」- 统一标识
     */
    @Override
    public String getSigma() {
        return this.sigma;
    }

    /**
     * Setter for <code>ZDB.MY_NOTIFY.SIGMA</code>. 「sigma」- 统一标识
     */
    @Override
    public MyNotify setSigma(String sigma) {
        this.sigma = sigma;
        return this;
    }

    /**
     * Getter for <code>ZDB.MY_NOTIFY.METADATA</code>. 「metadata」- 附加配置
     */
    @Override
    public String getMetadata() {
        return this.metadata;
    }

    /**
     * Setter for <code>ZDB.MY_NOTIFY.METADATA</code>. 「metadata」- 附加配置
     */
    @Override
    public MyNotify setMetadata(String metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * Getter for <code>ZDB.MY_NOTIFY.LANGUAGE</code>. 「language」- 使用的语言
     */
    @Override
    public String getLanguage() {
        return this.language;
    }

    /**
     * Setter for <code>ZDB.MY_NOTIFY.LANGUAGE</code>. 「language」- 使用的语言
     */
    @Override
    public MyNotify setLanguage(String language) {
        this.language = language;
        return this;
    }

    /**
     * Getter for <code>ZDB.MY_NOTIFY.CREATED_AT</code>. 「createdAt」- 创建时间
     */
    @Override
    public LocalDateTime getCreatedAt() {
        return this.createdAt;
    }

    /**
     * Setter for <code>ZDB.MY_NOTIFY.CREATED_AT</code>. 「createdAt」- 创建时间
     */
    @Override
    public MyNotify setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * Getter for <code>ZDB.MY_NOTIFY.CREATED_BY</code>. 「createdBy」- 创建人
     */
    @Override
    public String getCreatedBy() {
        return this.createdBy;
    }

    /**
     * Setter for <code>ZDB.MY_NOTIFY.CREATED_BY</code>. 「createdBy」- 创建人
     */
    @Override
    public MyNotify setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    /**
     * Getter for <code>ZDB.MY_NOTIFY.UPDATED_AT</code>. 「updatedAt」- 更新时间
     */
    @Override
    public LocalDateTime getUpdatedAt() {
        return this.updatedAt;
    }

    /**
     * Setter for <code>ZDB.MY_NOTIFY.UPDATED_AT</code>. 「updatedAt」- 更新时间
     */
    @Override
    public MyNotify setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * Getter for <code>ZDB.MY_NOTIFY.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    @Override
    public String getUpdatedBy() {
        return this.updatedBy;
    }

    /**
     * Setter for <code>ZDB.MY_NOTIFY.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    @Override
    public MyNotify setUpdatedBy(String updatedBy) {
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
        final MyNotify other = (MyNotify) obj;
        if (this.key == null) {
            if (other.key != null)
                return false;
        }
        else if (!this.key.equals(other.key))
            return false;
        if (this.ownerType == null) {
            if (other.ownerType != null)
                return false;
        }
        else if (!this.ownerType.equals(other.ownerType))
            return false;
        if (this.ownerId == null) {
            if (other.ownerId != null)
                return false;
        }
        else if (!this.ownerId.equals(other.ownerId))
            return false;
        if (this.configInternal == null) {
            if (other.configInternal != null)
                return false;
        }
        else if (!this.configInternal.equals(other.configInternal))
            return false;
        if (this.configEmail == null) {
            if (other.configEmail != null)
                return false;
        }
        else if (!this.configEmail.equals(other.configEmail))
            return false;
        if (this.configSms == null) {
            if (other.configSms != null)
                return false;
        }
        else if (!this.configSms.equals(other.configSms))
            return false;
        if (this.appId == null) {
            if (other.appId != null)
                return false;
        }
        else if (!this.appId.equals(other.appId))
            return false;
        if (this.active == null) {
            if (other.active != null)
                return false;
        }
        else if (!this.active.equals(other.active))
            return false;
        if (this.sigma == null) {
            if (other.sigma != null)
                return false;
        }
        else if (!this.sigma.equals(other.sigma))
            return false;
        if (this.metadata == null) {
            if (other.metadata != null)
                return false;
        }
        else if (!this.metadata.equals(other.metadata))
            return false;
        if (this.language == null) {
            if (other.language != null)
                return false;
        }
        else if (!this.language.equals(other.language))
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
        result = prime * result + ((this.ownerType == null) ? 0 : this.ownerType.hashCode());
        result = prime * result + ((this.ownerId == null) ? 0 : this.ownerId.hashCode());
        result = prime * result + ((this.configInternal == null) ? 0 : this.configInternal.hashCode());
        result = prime * result + ((this.configEmail == null) ? 0 : this.configEmail.hashCode());
        result = prime * result + ((this.configSms == null) ? 0 : this.configSms.hashCode());
        result = prime * result + ((this.appId == null) ? 0 : this.appId.hashCode());
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
        StringBuilder sb = new StringBuilder("MyNotify (");

        sb.append(key);
        sb.append(", ").append(ownerType);
        sb.append(", ").append(ownerId);
        sb.append(", ").append(configInternal);
        sb.append(", ").append(configEmail);
        sb.append(", ").append(configSms);
        sb.append(", ").append(appId);
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
    public void from(IMyNotify from) {
        setKey(from.getKey());
        setOwnerType(from.getOwnerType());
        setOwnerId(from.getOwnerId());
        setConfigInternal(from.getConfigInternal());
        setConfigEmail(from.getConfigEmail());
        setConfigSms(from.getConfigSms());
        setAppId(from.getAppId());
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
    public <E extends IMyNotify> E into(E into) {
        into.from(this);
        return into;
    }
}
