/*
 * This file is generated by jOOQ.
 */
package cn.vertxup.integration.domain.tables.interfaces;


import io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo;

import java.io.Serializable;
import java.time.LocalDateTime;

import static io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo.setOrThrow;
/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public interface IIMessage extends VertxPojo, Serializable {

    /**
     * Setter for <code>DB_ETERNAL.I_MESSAGE.KEY</code>. 「key」- 消息主键
     */
    public IIMessage setKey(String value);

    /**
     * Getter for <code>DB_ETERNAL.I_MESSAGE.KEY</code>. 「key」- 消息主键
     */
    public String getKey();

    /**
     * Setter for <code>DB_ETERNAL.I_MESSAGE.NAME</code>. 「name」- 消息名称
     */
    public IIMessage setName(String value);

    /**
     * Getter for <code>DB_ETERNAL.I_MESSAGE.NAME</code>. 「name」- 消息名称
     */
    public String getName();

    /**
     * Setter for <code>DB_ETERNAL.I_MESSAGE.CODE</code>. 「code」- 消息编码
     */
    public IIMessage setCode(String value);

    /**
     * Getter for <code>DB_ETERNAL.I_MESSAGE.CODE</code>. 「code」- 消息编码
     */
    public String getCode();

    /**
     * Setter for <code>DB_ETERNAL.I_MESSAGE.TYPE</code>. 「type」- 消息类型
     */
    public IIMessage setType(String value);

    /**
     * Getter for <code>DB_ETERNAL.I_MESSAGE.TYPE</code>. 「type」- 消息类型
     */
    public String getType();

    /**
     * Setter for <code>DB_ETERNAL.I_MESSAGE.STATUS</code>. 「status」- 消息状态
     */
    public IIMessage setStatus(String value);

    /**
     * Getter for <code>DB_ETERNAL.I_MESSAGE.STATUS</code>. 「status」- 消息状态
     */
    public String getStatus();

    /**
     * Setter for <code>DB_ETERNAL.I_MESSAGE.SUBJECT</code>. 「subject」- 消息标题
     */
    public IIMessage setSubject(String value);

    /**
     * Getter for <code>DB_ETERNAL.I_MESSAGE.SUBJECT</code>. 「subject」- 消息标题
     */
    public String getSubject();

    /**
     * Setter for <code>DB_ETERNAL.I_MESSAGE.CONTENT</code>. 「content」- 消息内容
     */
    public IIMessage setContent(String value);

    /**
     * Getter for <code>DB_ETERNAL.I_MESSAGE.CONTENT</code>. 「content」- 消息内容
     */
    public String getContent();

    /**
     * Setter for <code>DB_ETERNAL.I_MESSAGE.FROM</code>. 「from」- 消息发送方
     */
    public IIMessage setFrom(String value);

    /**
     * Getter for <code>DB_ETERNAL.I_MESSAGE.FROM</code>. 「from」- 消息发送方
     */
    public String getFrom();

    /**
     * Setter for <code>DB_ETERNAL.I_MESSAGE.TO</code>. 「to」- 消息接收方
     */
    public IIMessage setTo(String value);

    /**
     * Getter for <code>DB_ETERNAL.I_MESSAGE.TO</code>. 「to」- 消息接收方
     */
    public String getTo();

    /**
     * Setter for <code>DB_ETERNAL.I_MESSAGE.SEND_BY</code>. 「sendBy」- 发送者
     */
    public IIMessage setSendBy(String value);

    /**
     * Getter for <code>DB_ETERNAL.I_MESSAGE.SEND_BY</code>. 「sendBy」- 发送者
     */
    public String getSendBy();

    /**
     * Setter for <code>DB_ETERNAL.I_MESSAGE.SEND_AT</code>. 「sendAt」- 发送时间
     */
    public IIMessage setSendAt(String value);

    /**
     * Getter for <code>DB_ETERNAL.I_MESSAGE.SEND_AT</code>. 「sendAt」- 发送时间
     */
    public String getSendAt();

    /**
     * Setter for <code>DB_ETERNAL.I_MESSAGE.APP_ID</code>. 「appId」- 所属应用ID
     */
    public IIMessage setAppId(String value);

    /**
     * Getter for <code>DB_ETERNAL.I_MESSAGE.APP_ID</code>. 「appId」- 所属应用ID
     */
    public String getAppId();

    /**
     * Setter for <code>DB_ETERNAL.I_MESSAGE.ACTIVE</code>. 「active」- 是否启用
     */
    public IIMessage setActive(Boolean value);

    /**
     * Getter for <code>DB_ETERNAL.I_MESSAGE.ACTIVE</code>. 「active」- 是否启用
     */
    public Boolean getActive();

    /**
     * Setter for <code>DB_ETERNAL.I_MESSAGE.SIGMA</code>. 「sigma」- 统一标识
     */
    public IIMessage setSigma(String value);

    /**
     * Getter for <code>DB_ETERNAL.I_MESSAGE.SIGMA</code>. 「sigma」- 统一标识
     */
    public String getSigma();

    /**
     * Setter for <code>DB_ETERNAL.I_MESSAGE.METADATA</code>. 「metadata」- 附加配置
     */
    public IIMessage setMetadata(String value);

    /**
     * Getter for <code>DB_ETERNAL.I_MESSAGE.METADATA</code>. 「metadata」- 附加配置
     */
    public String getMetadata();

    /**
     * Setter for <code>DB_ETERNAL.I_MESSAGE.LANGUAGE</code>. 「language」- 使用的语言
     */
    public IIMessage setLanguage(String value);

    /**
     * Getter for <code>DB_ETERNAL.I_MESSAGE.LANGUAGE</code>. 「language」- 使用的语言
     */
    public String getLanguage();

    /**
     * Setter for <code>DB_ETERNAL.I_MESSAGE.CREATED_AT</code>. 「createdAt」-
     * 创建时间
     */
    public IIMessage setCreatedAt(LocalDateTime value);

    /**
     * Getter for <code>DB_ETERNAL.I_MESSAGE.CREATED_AT</code>. 「createdAt」-
     * 创建时间
     */
    public LocalDateTime getCreatedAt();

    /**
     * Setter for <code>DB_ETERNAL.I_MESSAGE.CREATED_BY</code>. 「createdBy」- 创建人
     */
    public IIMessage setCreatedBy(String value);

    /**
     * Getter for <code>DB_ETERNAL.I_MESSAGE.CREATED_BY</code>. 「createdBy」- 创建人
     */
    public String getCreatedBy();

    /**
     * Setter for <code>DB_ETERNAL.I_MESSAGE.UPDATED_AT</code>. 「updatedAt」-
     * 更新时间
     */
    public IIMessage setUpdatedAt(LocalDateTime value);

    /**
     * Getter for <code>DB_ETERNAL.I_MESSAGE.UPDATED_AT</code>. 「updatedAt」-
     * 更新时间
     */
    public LocalDateTime getUpdatedAt();

    /**
     * Setter for <code>DB_ETERNAL.I_MESSAGE.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    public IIMessage setUpdatedBy(String value);

    /**
     * Getter for <code>DB_ETERNAL.I_MESSAGE.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    public String getUpdatedBy();

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    /**
     * Load data from another generated Record/POJO implementing the common
     * interface IIMessage
     */
    public void from(IIMessage from);

    /**
     * Copy data into another generated Record/POJO implementing the common
     * interface IIMessage
     */
    public <E extends IIMessage> E into(E into);

        @Override
        public default IIMessage fromJson(io.vertx.core.json.JsonObject json) {
                setOrThrow(this::setKey,json::getString,"KEY","java.lang.String");
                setOrThrow(this::setName,json::getString,"NAME","java.lang.String");
                setOrThrow(this::setCode,json::getString,"CODE","java.lang.String");
                setOrThrow(this::setType,json::getString,"TYPE","java.lang.String");
                setOrThrow(this::setStatus,json::getString,"STATUS","java.lang.String");
                setOrThrow(this::setSubject,json::getString,"SUBJECT","java.lang.String");
                setOrThrow(this::setContent,json::getString,"CONTENT","java.lang.String");
                setOrThrow(this::setFrom,json::getString,"FROM","java.lang.String");
                setOrThrow(this::setTo,json::getString,"TO","java.lang.String");
                setOrThrow(this::setSendBy,json::getString,"SEND_BY","java.lang.String");
                setOrThrow(this::setSendAt,json::getString,"SEND_AT","java.lang.String");
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
                json.put("SUBJECT",getSubject());
                json.put("CONTENT",getContent());
                json.put("FROM",getFrom());
                json.put("TO",getTo());
                json.put("SEND_BY",getSendBy());
                json.put("SEND_AT",getSendAt());
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
