/*
 * This file is generated by jOOQ.
 */
package io.zerows.extension.runtime.ambient.domain.tables.interfaces;


import io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo;

import java.io.Serializable;
import java.time.LocalDateTime;


import static io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo.*;
/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public interface IXLog extends VertxPojo, Serializable {

    /**
     * Setter for <code>ZDB.X_LOG.KEY</code>. 「key」- 日志的主键
     */
    public IXLog setKey(String value);

    /**
     * Getter for <code>ZDB.X_LOG.KEY</code>. 「key」- 日志的主键
     */
    public String getKey();

    /**
     * Setter for <code>ZDB.X_LOG.TYPE</code>. 「type」- 日志的分类
     */
    public IXLog setType(String value);

    /**
     * Getter for <code>ZDB.X_LOG.TYPE</code>. 「type」- 日志的分类
     */
    public String getType();

    /**
     * Setter for <code>ZDB.X_LOG.LEVEL</code>. 「level」- 日志级别：ERROR / WARN /
     * INFO
     */
    public IXLog setLevel(String value);

    /**
     * Getter for <code>ZDB.X_LOG.LEVEL</code>. 「level」- 日志级别：ERROR / WARN /
     * INFO
     */
    public String getLevel();

    /**
     * Setter for <code>ZDB.X_LOG.INFO_STACK</code>. 「infoStack」- 堆栈信息
     */
    public IXLog setInfoStack(String value);

    /**
     * Getter for <code>ZDB.X_LOG.INFO_STACK</code>. 「infoStack」- 堆栈信息
     */
    public String getInfoStack();

    /**
     * Setter for <code>ZDB.X_LOG.INFO_SYSTEM</code>. 「infoSystem」- 日志内容
     */
    public IXLog setInfoSystem(String value);

    /**
     * Getter for <code>ZDB.X_LOG.INFO_SYSTEM</code>. 「infoSystem」- 日志内容
     */
    public String getInfoSystem();

    /**
     * Setter for <code>ZDB.X_LOG.INFO_READABLE</code>. 「infoReadable」- 日志的可读信息
     */
    public IXLog setInfoReadable(String value);

    /**
     * Getter for <code>ZDB.X_LOG.INFO_READABLE</code>. 「infoReadable」- 日志的可读信息
     */
    public String getInfoReadable();

    /**
     * Setter for <code>ZDB.X_LOG.INFO_AT</code>. 「infoAt」- 日志记录时间
     */
    public IXLog setInfoAt(LocalDateTime value);

    /**
     * Getter for <code>ZDB.X_LOG.INFO_AT</code>. 「infoAt」- 日志记录时间
     */
    public LocalDateTime getInfoAt();

    /**
     * Setter for <code>ZDB.X_LOG.LOG_AGENT</code>. 「logAgent」- 记录日志的 agent 信息
     */
    public IXLog setLogAgent(String value);

    /**
     * Getter for <code>ZDB.X_LOG.LOG_AGENT</code>. 「logAgent」- 记录日志的 agent 信息
     */
    public String getLogAgent();

    /**
     * Setter for <code>ZDB.X_LOG.LOG_IP</code>. 「logIp」- 日志扩展组件
     */
    public IXLog setLogIp(String value);

    /**
     * Getter for <code>ZDB.X_LOG.LOG_IP</code>. 「logIp」- 日志扩展组件
     */
    public String getLogIp();

    /**
     * Setter for <code>ZDB.X_LOG.LOG_USER</code>. 「logUser」- 日志记录人
     */
    public IXLog setLogUser(String value);

    /**
     * Getter for <code>ZDB.X_LOG.LOG_USER</code>. 「logUser」- 日志记录人
     */
    public String getLogUser();

    /**
     * Setter for <code>ZDB.X_LOG.ACTIVE</code>. 「active」- 是否启用
     */
    public IXLog setActive(Boolean value);

    /**
     * Getter for <code>ZDB.X_LOG.ACTIVE</code>. 「active」- 是否启用
     */
    public Boolean getActive();

    /**
     * Setter for <code>ZDB.X_LOG.SIGMA</code>. 「sigma」- 统一标识
     */
    public IXLog setSigma(String value);

    /**
     * Getter for <code>ZDB.X_LOG.SIGMA</code>. 「sigma」- 统一标识
     */
    public String getSigma();

    /**
     * Setter for <code>ZDB.X_LOG.METADATA</code>. 「metadata」- 附加配置
     */
    public IXLog setMetadata(String value);

    /**
     * Getter for <code>ZDB.X_LOG.METADATA</code>. 「metadata」- 附加配置
     */
    public String getMetadata();

    /**
     * Setter for <code>ZDB.X_LOG.LANGUAGE</code>. 「language」- 使用的语言
     */
    public IXLog setLanguage(String value);

    /**
     * Getter for <code>ZDB.X_LOG.LANGUAGE</code>. 「language」- 使用的语言
     */
    public String getLanguage();

    /**
     * Setter for <code>ZDB.X_LOG.CREATED_AT</code>. 「createdAt」- 创建时间
     */
    public IXLog setCreatedAt(LocalDateTime value);

    /**
     * Getter for <code>ZDB.X_LOG.CREATED_AT</code>. 「createdAt」- 创建时间
     */
    public LocalDateTime getCreatedAt();

    /**
     * Setter for <code>ZDB.X_LOG.CREATED_BY</code>. 「createdBy」- 创建人
     */
    public IXLog setCreatedBy(String value);

    /**
     * Getter for <code>ZDB.X_LOG.CREATED_BY</code>. 「createdBy」- 创建人
     */
    public String getCreatedBy();

    /**
     * Setter for <code>ZDB.X_LOG.UPDATED_AT</code>. 「updatedAt」- 更新时间
     */
    public IXLog setUpdatedAt(LocalDateTime value);

    /**
     * Getter for <code>ZDB.X_LOG.UPDATED_AT</code>. 「updatedAt」- 更新时间
     */
    public LocalDateTime getUpdatedAt();

    /**
     * Setter for <code>ZDB.X_LOG.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    public IXLog setUpdatedBy(String value);

    /**
     * Getter for <code>ZDB.X_LOG.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    public String getUpdatedBy();

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    /**
     * Load data from another generated Record/POJO implementing the common
     * interface IXLog
     */
    public void from(IXLog from);

    /**
     * Copy data into another generated Record/POJO implementing the common
     * interface IXLog
     */
    public <E extends IXLog> E into(E into);

        @Override
        public default IXLog fromJson(io.vertx.core.json.JsonObject json) {
                setOrThrow(this::setKey,json::getString,"KEY","java.lang.String");
                setOrThrow(this::setType,json::getString,"TYPE","java.lang.String");
                setOrThrow(this::setLevel,json::getString,"LEVEL","java.lang.String");
                setOrThrow(this::setInfoStack,json::getString,"INFO_STACK","java.lang.String");
                setOrThrow(this::setInfoSystem,json::getString,"INFO_SYSTEM","java.lang.String");
                setOrThrow(this::setInfoReadable,json::getString,"INFO_READABLE","java.lang.String");
                setOrThrow(this::setInfoAt,key -> {String s = json.getString(key); return s==null?null:java.time.LocalDateTime.parse(s);},"INFO_AT","java.time.LocalDateTime");
                setOrThrow(this::setLogAgent,json::getString,"LOG_AGENT","java.lang.String");
                setOrThrow(this::setLogIp,json::getString,"LOG_IP","java.lang.String");
                setOrThrow(this::setLogUser,json::getString,"LOG_USER","java.lang.String");
                setOrThrow(this::setActive,json::getBoolean,"ACTIVE","java.lang.Boolean");
                setOrThrow(this::setSigma,json::getString,"SIGMA","java.lang.String");
                setOrThrow(this::setMetadata,json::getString,"METADATA","java.lang.String");
                setOrThrow(this::setLanguage,json::getString,"LANGUAGE","java.lang.String");
                setOrThrow(this::setCreatedAt,key -> {String s = json.getString(key); return s==null?null:java.time.LocalDateTime.parse(s);},"CREATED_AT","java.time.LocalDateTime");
                setOrThrow(this::setCreatedBy,json::getString,"CREATED_BY","java.lang.String");
                setOrThrow(this::setUpdatedAt,key -> {String s = json.getString(key); return s==null?null:java.time.LocalDateTime.parse(s);},"UPDATED_AT","java.time.LocalDateTime");
                setOrThrow(this::setUpdatedBy,json::getString,"UPDATED_BY","java.lang.String");
                return this;
        }


        @Override
        public default io.vertx.core.json.JsonObject toJson() {
                io.vertx.core.json.JsonObject json = new io.vertx.core.json.JsonObject();
                json.put("KEY",getKey());
                json.put("TYPE",getType());
                json.put("LEVEL",getLevel());
                json.put("INFO_STACK",getInfoStack());
                json.put("INFO_SYSTEM",getInfoSystem());
                json.put("INFO_READABLE",getInfoReadable());
                json.put("INFO_AT",getInfoAt()==null?null:getInfoAt().toString());
                json.put("LOG_AGENT",getLogAgent());
                json.put("LOG_IP",getLogIp());
                json.put("LOG_USER",getLogUser());
                json.put("ACTIVE",getActive());
                json.put("SIGMA",getSigma());
                json.put("METADATA",getMetadata());
                json.put("LANGUAGE",getLanguage());
                json.put("CREATED_AT",getCreatedAt()==null?null:getCreatedAt().toString());
                json.put("CREATED_BY",getCreatedBy());
                json.put("UPDATED_AT",getUpdatedAt()==null?null:getUpdatedAt().toString());
                json.put("UPDATED_BY",getUpdatedBy());
                return json;
        }

}
