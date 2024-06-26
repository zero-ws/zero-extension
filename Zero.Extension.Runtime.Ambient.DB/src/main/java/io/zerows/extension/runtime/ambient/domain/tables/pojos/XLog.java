/*
 * This file is generated by jOOQ.
 */
package io.zerows.extension.runtime.ambient.domain.tables.pojos;


import io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo;
import io.zerows.extension.runtime.ambient.domain.tables.interfaces.IXLog;

import java.time.LocalDateTime;


import static io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo.*;
/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class XLog implements VertxPojo, IXLog {

    private static final long serialVersionUID = 1L;

    private String key;
    private String type;
    private String level;
    private String infoStack;
    private String infoSystem;
    private String infoReadable;
    private LocalDateTime infoAt;
    private String logAgent;
    private String logIp;
    private String logUser;
    private Boolean active;
    private String sigma;
    private String metadata;
    private String language;
    private LocalDateTime createdAt;
    private String createdBy;
    private LocalDateTime updatedAt;
    private String updatedBy;

    public XLog() {}

    public XLog(IXLog value) {
        this.key = value.getKey();
        this.type = value.getType();
        this.level = value.getLevel();
        this.infoStack = value.getInfoStack();
        this.infoSystem = value.getInfoSystem();
        this.infoReadable = value.getInfoReadable();
        this.infoAt = value.getInfoAt();
        this.logAgent = value.getLogAgent();
        this.logIp = value.getLogIp();
        this.logUser = value.getLogUser();
        this.active = value.getActive();
        this.sigma = value.getSigma();
        this.metadata = value.getMetadata();
        this.language = value.getLanguage();
        this.createdAt = value.getCreatedAt();
        this.createdBy = value.getCreatedBy();
        this.updatedAt = value.getUpdatedAt();
        this.updatedBy = value.getUpdatedBy();
    }

    public XLog(
        String key,
        String type,
        String level,
        String infoStack,
        String infoSystem,
        String infoReadable,
        LocalDateTime infoAt,
        String logAgent,
        String logIp,
        String logUser,
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
        this.type = type;
        this.level = level;
        this.infoStack = infoStack;
        this.infoSystem = infoSystem;
        this.infoReadable = infoReadable;
        this.infoAt = infoAt;
        this.logAgent = logAgent;
        this.logIp = logIp;
        this.logUser = logUser;
        this.active = active;
        this.sigma = sigma;
        this.metadata = metadata;
        this.language = language;
        this.createdAt = createdAt;
        this.createdBy = createdBy;
        this.updatedAt = updatedAt;
        this.updatedBy = updatedBy;
    }

        public XLog(io.vertx.core.json.JsonObject json) {
                this();
                fromJson(json);
        }

    /**
     * Getter for <code>ZDB.X_LOG.KEY</code>. 「key」- 日志的主键
     */
    @Override
    public String getKey() {
        return this.key;
    }

    /**
     * Setter for <code>ZDB.X_LOG.KEY</code>. 「key」- 日志的主键
     */
    @Override
    public XLog setKey(String key) {
        this.key = key;
        return this;
    }

    /**
     * Getter for <code>ZDB.X_LOG.TYPE</code>. 「type」- 日志的分类
     */
    @Override
    public String getType() {
        return this.type;
    }

    /**
     * Setter for <code>ZDB.X_LOG.TYPE</code>. 「type」- 日志的分类
     */
    @Override
    public XLog setType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Getter for <code>ZDB.X_LOG.LEVEL</code>. 「level」- 日志级别：ERROR / WARN /
     * INFO
     */
    @Override
    public String getLevel() {
        return this.level;
    }

    /**
     * Setter for <code>ZDB.X_LOG.LEVEL</code>. 「level」- 日志级别：ERROR / WARN /
     * INFO
     */
    @Override
    public XLog setLevel(String level) {
        this.level = level;
        return this;
    }

    /**
     * Getter for <code>ZDB.X_LOG.INFO_STACK</code>. 「infoStack」- 堆栈信息
     */
    @Override
    public String getInfoStack() {
        return this.infoStack;
    }

    /**
     * Setter for <code>ZDB.X_LOG.INFO_STACK</code>. 「infoStack」- 堆栈信息
     */
    @Override
    public XLog setInfoStack(String infoStack) {
        this.infoStack = infoStack;
        return this;
    }

    /**
     * Getter for <code>ZDB.X_LOG.INFO_SYSTEM</code>. 「infoSystem」- 日志内容
     */
    @Override
    public String getInfoSystem() {
        return this.infoSystem;
    }

    /**
     * Setter for <code>ZDB.X_LOG.INFO_SYSTEM</code>. 「infoSystem」- 日志内容
     */
    @Override
    public XLog setInfoSystem(String infoSystem) {
        this.infoSystem = infoSystem;
        return this;
    }

    /**
     * Getter for <code>ZDB.X_LOG.INFO_READABLE</code>. 「infoReadable」- 日志的可读信息
     */
    @Override
    public String getInfoReadable() {
        return this.infoReadable;
    }

    /**
     * Setter for <code>ZDB.X_LOG.INFO_READABLE</code>. 「infoReadable」- 日志的可读信息
     */
    @Override
    public XLog setInfoReadable(String infoReadable) {
        this.infoReadable = infoReadable;
        return this;
    }

    /**
     * Getter for <code>ZDB.X_LOG.INFO_AT</code>. 「infoAt」- 日志记录时间
     */
    @Override
    public LocalDateTime getInfoAt() {
        return this.infoAt;
    }

    /**
     * Setter for <code>ZDB.X_LOG.INFO_AT</code>. 「infoAt」- 日志记录时间
     */
    @Override
    public XLog setInfoAt(LocalDateTime infoAt) {
        this.infoAt = infoAt;
        return this;
    }

    /**
     * Getter for <code>ZDB.X_LOG.LOG_AGENT</code>. 「logAgent」- 记录日志的 agent 信息
     */
    @Override
    public String getLogAgent() {
        return this.logAgent;
    }

    /**
     * Setter for <code>ZDB.X_LOG.LOG_AGENT</code>. 「logAgent」- 记录日志的 agent 信息
     */
    @Override
    public XLog setLogAgent(String logAgent) {
        this.logAgent = logAgent;
        return this;
    }

    /**
     * Getter for <code>ZDB.X_LOG.LOG_IP</code>. 「logIp」- 日志扩展组件
     */
    @Override
    public String getLogIp() {
        return this.logIp;
    }

    /**
     * Setter for <code>ZDB.X_LOG.LOG_IP</code>. 「logIp」- 日志扩展组件
     */
    @Override
    public XLog setLogIp(String logIp) {
        this.logIp = logIp;
        return this;
    }

    /**
     * Getter for <code>ZDB.X_LOG.LOG_USER</code>. 「logUser」- 日志记录人
     */
    @Override
    public String getLogUser() {
        return this.logUser;
    }

    /**
     * Setter for <code>ZDB.X_LOG.LOG_USER</code>. 「logUser」- 日志记录人
     */
    @Override
    public XLog setLogUser(String logUser) {
        this.logUser = logUser;
        return this;
    }

    /**
     * Getter for <code>ZDB.X_LOG.ACTIVE</code>. 「active」- 是否启用
     */
    @Override
    public Boolean getActive() {
        return this.active;
    }

    /**
     * Setter for <code>ZDB.X_LOG.ACTIVE</code>. 「active」- 是否启用
     */
    @Override
    public XLog setActive(Boolean active) {
        this.active = active;
        return this;
    }

    /**
     * Getter for <code>ZDB.X_LOG.SIGMA</code>. 「sigma」- 统一标识
     */
    @Override
    public String getSigma() {
        return this.sigma;
    }

    /**
     * Setter for <code>ZDB.X_LOG.SIGMA</code>. 「sigma」- 统一标识
     */
    @Override
    public XLog setSigma(String sigma) {
        this.sigma = sigma;
        return this;
    }

    /**
     * Getter for <code>ZDB.X_LOG.METADATA</code>. 「metadata」- 附加配置
     */
    @Override
    public String getMetadata() {
        return this.metadata;
    }

    /**
     * Setter for <code>ZDB.X_LOG.METADATA</code>. 「metadata」- 附加配置
     */
    @Override
    public XLog setMetadata(String metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * Getter for <code>ZDB.X_LOG.LANGUAGE</code>. 「language」- 使用的语言
     */
    @Override
    public String getLanguage() {
        return this.language;
    }

    /**
     * Setter for <code>ZDB.X_LOG.LANGUAGE</code>. 「language」- 使用的语言
     */
    @Override
    public XLog setLanguage(String language) {
        this.language = language;
        return this;
    }

    /**
     * Getter for <code>ZDB.X_LOG.CREATED_AT</code>. 「createdAt」- 创建时间
     */
    @Override
    public LocalDateTime getCreatedAt() {
        return this.createdAt;
    }

    /**
     * Setter for <code>ZDB.X_LOG.CREATED_AT</code>. 「createdAt」- 创建时间
     */
    @Override
    public XLog setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * Getter for <code>ZDB.X_LOG.CREATED_BY</code>. 「createdBy」- 创建人
     */
    @Override
    public String getCreatedBy() {
        return this.createdBy;
    }

    /**
     * Setter for <code>ZDB.X_LOG.CREATED_BY</code>. 「createdBy」- 创建人
     */
    @Override
    public XLog setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    /**
     * Getter for <code>ZDB.X_LOG.UPDATED_AT</code>. 「updatedAt」- 更新时间
     */
    @Override
    public LocalDateTime getUpdatedAt() {
        return this.updatedAt;
    }

    /**
     * Setter for <code>ZDB.X_LOG.UPDATED_AT</code>. 「updatedAt」- 更新时间
     */
    @Override
    public XLog setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * Getter for <code>ZDB.X_LOG.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    @Override
    public String getUpdatedBy() {
        return this.updatedBy;
    }

    /**
     * Setter for <code>ZDB.X_LOG.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    @Override
    public XLog setUpdatedBy(String updatedBy) {
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
        final XLog other = (XLog) obj;
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
        if (this.level == null) {
            if (other.level != null)
                return false;
        }
        else if (!this.level.equals(other.level))
            return false;
        if (this.infoStack == null) {
            if (other.infoStack != null)
                return false;
        }
        else if (!this.infoStack.equals(other.infoStack))
            return false;
        if (this.infoSystem == null) {
            if (other.infoSystem != null)
                return false;
        }
        else if (!this.infoSystem.equals(other.infoSystem))
            return false;
        if (this.infoReadable == null) {
            if (other.infoReadable != null)
                return false;
        }
        else if (!this.infoReadable.equals(other.infoReadable))
            return false;
        if (this.infoAt == null) {
            if (other.infoAt != null)
                return false;
        }
        else if (!this.infoAt.equals(other.infoAt))
            return false;
        if (this.logAgent == null) {
            if (other.logAgent != null)
                return false;
        }
        else if (!this.logAgent.equals(other.logAgent))
            return false;
        if (this.logIp == null) {
            if (other.logIp != null)
                return false;
        }
        else if (!this.logIp.equals(other.logIp))
            return false;
        if (this.logUser == null) {
            if (other.logUser != null)
                return false;
        }
        else if (!this.logUser.equals(other.logUser))
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
        result = prime * result + ((this.type == null) ? 0 : this.type.hashCode());
        result = prime * result + ((this.level == null) ? 0 : this.level.hashCode());
        result = prime * result + ((this.infoStack == null) ? 0 : this.infoStack.hashCode());
        result = prime * result + ((this.infoSystem == null) ? 0 : this.infoSystem.hashCode());
        result = prime * result + ((this.infoReadable == null) ? 0 : this.infoReadable.hashCode());
        result = prime * result + ((this.infoAt == null) ? 0 : this.infoAt.hashCode());
        result = prime * result + ((this.logAgent == null) ? 0 : this.logAgent.hashCode());
        result = prime * result + ((this.logIp == null) ? 0 : this.logIp.hashCode());
        result = prime * result + ((this.logUser == null) ? 0 : this.logUser.hashCode());
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
        StringBuilder sb = new StringBuilder("XLog (");

        sb.append(key);
        sb.append(", ").append(type);
        sb.append(", ").append(level);
        sb.append(", ").append(infoStack);
        sb.append(", ").append(infoSystem);
        sb.append(", ").append(infoReadable);
        sb.append(", ").append(infoAt);
        sb.append(", ").append(logAgent);
        sb.append(", ").append(logIp);
        sb.append(", ").append(logUser);
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
    public void from(IXLog from) {
        setKey(from.getKey());
        setType(from.getType());
        setLevel(from.getLevel());
        setInfoStack(from.getInfoStack());
        setInfoSystem(from.getInfoSystem());
        setInfoReadable(from.getInfoReadable());
        setInfoAt(from.getInfoAt());
        setLogAgent(from.getLogAgent());
        setLogIp(from.getLogIp());
        setLogUser(from.getLogUser());
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
    public <E extends IXLog> E into(E into) {
        into.from(this);
        return into;
    }
}
