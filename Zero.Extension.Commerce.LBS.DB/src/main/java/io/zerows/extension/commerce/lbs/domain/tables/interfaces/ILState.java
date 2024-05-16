/*
 * This file is generated by jOOQ.
 */
package io.zerows.extension.commerce.lbs.domain.tables.interfaces;


import io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo;

import java.io.Serializable;
import java.time.LocalDateTime;


import static io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo.*;
/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public interface ILState extends VertxPojo, Serializable {

    /**
     * Setter for <code>ZDB.L_STATE.KEY</code>. 「key」- 省会主键
     */
    public ILState setKey(String value);

    /**
     * Getter for <code>ZDB.L_STATE.KEY</code>. 「key」- 省会主键
     */
    public String getKey();

    /**
     * Setter for <code>ZDB.L_STATE.NAME</code>. 「name」- 省会名称
     */
    public ILState setName(String value);

    /**
     * Getter for <code>ZDB.L_STATE.NAME</code>. 「name」- 省会名称
     */
    public String getName();

    /**
     * Setter for <code>ZDB.L_STATE.CODE</code>. 「code」- 省会编码
     */
    public ILState setCode(String value);

    /**
     * Getter for <code>ZDB.L_STATE.CODE</code>. 「code」- 省会编码
     */
    public String getCode();

    /**
     * Setter for <code>ZDB.L_STATE.ALIAS</code>. 「alias」- 别名（缩写）
     */
    public ILState setAlias(String value);

    /**
     * Getter for <code>ZDB.L_STATE.ALIAS</code>. 「alias」- 别名（缩写）
     */
    public String getAlias();

    /**
     * Setter for <code>ZDB.L_STATE.METADATA</code>. 「metadata」- 附加配置
     */
    public ILState setMetadata(String value);

    /**
     * Getter for <code>ZDB.L_STATE.METADATA</code>. 「metadata」- 附加配置
     */
    public String getMetadata();

    /**
     * Setter for <code>ZDB.L_STATE.ORDER</code>. 「order」- 排序
     */
    public ILState setOrder(Integer value);

    /**
     * Getter for <code>ZDB.L_STATE.ORDER</code>. 「order」- 排序
     */
    public Integer getOrder();

    /**
     * Setter for <code>ZDB.L_STATE.COUNTRY_ID</code>. 「countryId」- 国家ID
     */
    public ILState setCountryId(String value);

    /**
     * Getter for <code>ZDB.L_STATE.COUNTRY_ID</code>. 「countryId」- 国家ID
     */
    public String getCountryId();

    /**
     * Setter for <code>ZDB.L_STATE.ACTIVE</code>. 「active」- 是否启用
     */
    public ILState setActive(Boolean value);

    /**
     * Getter for <code>ZDB.L_STATE.ACTIVE</code>. 「active」- 是否启用
     */
    public Boolean getActive();

    /**
     * Setter for <code>ZDB.L_STATE.SIGMA</code>. 「sigma」- 统一标识
     */
    public ILState setSigma(String value);

    /**
     * Getter for <code>ZDB.L_STATE.SIGMA</code>. 「sigma」- 统一标识
     */
    public String getSigma();

    /**
     * Setter for <code>ZDB.L_STATE.LANGUAGE</code>. 「language」- 使用的语言
     */
    public ILState setLanguage(String value);

    /**
     * Getter for <code>ZDB.L_STATE.LANGUAGE</code>. 「language」- 使用的语言
     */
    public String getLanguage();

    /**
     * Setter for <code>ZDB.L_STATE.CREATED_AT</code>. 「createdAt」- 创建时间
     */
    public ILState setCreatedAt(LocalDateTime value);

    /**
     * Getter for <code>ZDB.L_STATE.CREATED_AT</code>. 「createdAt」- 创建时间
     */
    public LocalDateTime getCreatedAt();

    /**
     * Setter for <code>ZDB.L_STATE.CREATED_BY</code>. 「createdBy」- 创建人
     */
    public ILState setCreatedBy(String value);

    /**
     * Getter for <code>ZDB.L_STATE.CREATED_BY</code>. 「createdBy」- 创建人
     */
    public String getCreatedBy();

    /**
     * Setter for <code>ZDB.L_STATE.UPDATED_AT</code>. 「updatedAt」- 更新时间
     */
    public ILState setUpdatedAt(LocalDateTime value);

    /**
     * Getter for <code>ZDB.L_STATE.UPDATED_AT</code>. 「updatedAt」- 更新时间
     */
    public LocalDateTime getUpdatedAt();

    /**
     * Setter for <code>ZDB.L_STATE.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    public ILState setUpdatedBy(String value);

    /**
     * Getter for <code>ZDB.L_STATE.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    public String getUpdatedBy();

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    /**
     * Load data from another generated Record/POJO implementing the common
     * interface ILState
     */
    public void from(ILState from);

    /**
     * Copy data into another generated Record/POJO implementing the common
     * interface ILState
     */
    public <E extends ILState> E into(E into);

        @Override
        public default ILState fromJson(io.vertx.core.json.JsonObject json) {
                setOrThrow(this::setKey,json::getString,"KEY","java.lang.String");
                setOrThrow(this::setName,json::getString,"NAME","java.lang.String");
                setOrThrow(this::setCode,json::getString,"CODE","java.lang.String");
                setOrThrow(this::setAlias,json::getString,"ALIAS","java.lang.String");
                setOrThrow(this::setMetadata,json::getString,"METADATA","java.lang.String");
                setOrThrow(this::setOrder,json::getInteger,"ORDER","java.lang.Integer");
                setOrThrow(this::setCountryId,json::getString,"COUNTRY_ID","java.lang.String");
                setOrThrow(this::setActive,json::getBoolean,"ACTIVE","java.lang.Boolean");
                setOrThrow(this::setSigma,json::getString,"SIGMA","java.lang.String");
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
                json.put("ALIAS",getAlias());
                json.put("METADATA",getMetadata());
                json.put("ORDER",getOrder());
                json.put("COUNTRY_ID",getCountryId());
                json.put("ACTIVE",getActive());
                json.put("SIGMA",getSigma());
                json.put("LANGUAGE",getLanguage());
                json.put("CREATED_AT",getCreatedAt()==null?null:getCreatedAt().toString());
                json.put("CREATED_BY",getCreatedBy());
                json.put("UPDATED_AT",getUpdatedAt()==null?null:getUpdatedAt().toString());
                json.put("UPDATED_BY",getUpdatedBy());
                return json;
        }

}