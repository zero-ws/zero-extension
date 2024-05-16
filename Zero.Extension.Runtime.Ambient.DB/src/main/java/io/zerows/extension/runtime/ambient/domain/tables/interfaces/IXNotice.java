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
public interface IXNotice extends VertxPojo, Serializable {

    /**
     * Setter for <code>ZDB.X_NOTICE.KEY</code>. 「key」- 公告主键
     */
    public IXNotice setKey(String value);

    /**
     * Getter for <code>ZDB.X_NOTICE.KEY</code>. 「key」- 公告主键
     */
    public String getKey();

    /**
     * Setter for <code>ZDB.X_NOTICE.NAME</code>. 「name」- 公告标题
     */
    public IXNotice setName(String value);

    /**
     * Getter for <code>ZDB.X_NOTICE.NAME</code>. 「name」- 公告标题
     */
    public String getName();

    /**
     * Setter for <code>ZDB.X_NOTICE.CODE</code>. 「code」- 公告编码
     */
    public IXNotice setCode(String value);

    /**
     * Getter for <code>ZDB.X_NOTICE.CODE</code>. 「code」- 公告编码
     */
    public String getCode();

    /**
     * Setter for <code>ZDB.X_NOTICE.TYPE</code>. 「type」- 公告类型
     */
    public IXNotice setType(String value);

    /**
     * Getter for <code>ZDB.X_NOTICE.TYPE</code>. 「type」- 公告类型
     */
    public String getType();

    /**
     * Setter for <code>ZDB.X_NOTICE.STATUS</code>. 「status」- 公告状态
     */
    public IXNotice setStatus(String value);

    /**
     * Getter for <code>ZDB.X_NOTICE.STATUS</code>. 「status」- 公告状态
     */
    public String getStatus();

    /**
     * Setter for <code>ZDB.X_NOTICE.CONTENT</code>. 「content」- 公告内容
     */
    public IXNotice setContent(String value);

    /**
     * Getter for <code>ZDB.X_NOTICE.CONTENT</code>. 「content」- 公告内容
     */
    public String getContent();

    /**
     * Setter for <code>ZDB.X_NOTICE.EXPIRED_AT</code>. 「createdAt」- 公告到期时间
     */
    public IXNotice setExpiredAt(LocalDateTime value);

    /**
     * Getter for <code>ZDB.X_NOTICE.EXPIRED_AT</code>. 「createdAt」- 公告到期时间
     */
    public LocalDateTime getExpiredAt();

    /**
     * Setter for <code>ZDB.X_NOTICE.APP_ID</code>. 「appId」- 所属应用ID
     */
    public IXNotice setAppId(String value);

    /**
     * Getter for <code>ZDB.X_NOTICE.APP_ID</code>. 「appId」- 所属应用ID
     */
    public String getAppId();

    /**
     * Setter for <code>ZDB.X_NOTICE.ACTIVE</code>. 「active」- 是否启用
     */
    public IXNotice setActive(Boolean value);

    /**
     * Getter for <code>ZDB.X_NOTICE.ACTIVE</code>. 「active」- 是否启用
     */
    public Boolean getActive();

    /**
     * Setter for <code>ZDB.X_NOTICE.SIGMA</code>. 「sigma」- 统一标识
     */
    public IXNotice setSigma(String value);

    /**
     * Getter for <code>ZDB.X_NOTICE.SIGMA</code>. 「sigma」- 统一标识
     */
    public String getSigma();

    /**
     * Setter for <code>ZDB.X_NOTICE.METADATA</code>. 「metadata」- 附加配置
     */
    public IXNotice setMetadata(String value);

    /**
     * Getter for <code>ZDB.X_NOTICE.METADATA</code>. 「metadata」- 附加配置
     */
    public String getMetadata();

    /**
     * Setter for <code>ZDB.X_NOTICE.LANGUAGE</code>. 「language」- 使用的语言
     */
    public IXNotice setLanguage(String value);

    /**
     * Getter for <code>ZDB.X_NOTICE.LANGUAGE</code>. 「language」- 使用的语言
     */
    public String getLanguage();

    /**
     * Setter for <code>ZDB.X_NOTICE.CREATED_AT</code>. 「createdAt」- 创建时间
     */
    public IXNotice setCreatedAt(LocalDateTime value);

    /**
     * Getter for <code>ZDB.X_NOTICE.CREATED_AT</code>. 「createdAt」- 创建时间
     */
    public LocalDateTime getCreatedAt();

    /**
     * Setter for <code>ZDB.X_NOTICE.CREATED_BY</code>. 「createdBy」- 创建人
     */
    public IXNotice setCreatedBy(String value);

    /**
     * Getter for <code>ZDB.X_NOTICE.CREATED_BY</code>. 「createdBy」- 创建人
     */
    public String getCreatedBy();

    /**
     * Setter for <code>ZDB.X_NOTICE.UPDATED_AT</code>. 「updatedAt」- 更新时间
     */
    public IXNotice setUpdatedAt(LocalDateTime value);

    /**
     * Getter for <code>ZDB.X_NOTICE.UPDATED_AT</code>. 「updatedAt」- 更新时间
     */
    public LocalDateTime getUpdatedAt();

    /**
     * Setter for <code>ZDB.X_NOTICE.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    public IXNotice setUpdatedBy(String value);

    /**
     * Getter for <code>ZDB.X_NOTICE.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    public String getUpdatedBy();

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    /**
     * Load data from another generated Record/POJO implementing the common
     * interface IXNotice
     */
    public void from(IXNotice from);

    /**
     * Copy data into another generated Record/POJO implementing the common
     * interface IXNotice
     */
    public <E extends IXNotice> E into(E into);

        @Override
        public default IXNotice fromJson(io.vertx.core.json.JsonObject json) {
                setOrThrow(this::setKey,json::getString,"KEY","java.lang.String");
                setOrThrow(this::setName,json::getString,"NAME","java.lang.String");
                setOrThrow(this::setCode,json::getString,"CODE","java.lang.String");
                setOrThrow(this::setType,json::getString,"TYPE","java.lang.String");
                setOrThrow(this::setStatus,json::getString,"STATUS","java.lang.String");
                setOrThrow(this::setContent,json::getString,"CONTENT","java.lang.String");
                setOrThrow(this::setExpiredAt,key -> {String s = json.getString(key); return s==null?null:java.time.LocalDateTime.parse(s);},"EXPIRED_AT","java.time.LocalDateTime");
                setOrThrow(this::setAppId,json::getString,"APP_ID","java.lang.String");
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
                json.put("NAME",getName());
                json.put("CODE",getCode());
                json.put("TYPE",getType());
                json.put("STATUS",getStatus());
                json.put("CONTENT",getContent());
                json.put("EXPIRED_AT",getExpiredAt()==null?null:getExpiredAt().toString());
                json.put("APP_ID",getAppId());
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