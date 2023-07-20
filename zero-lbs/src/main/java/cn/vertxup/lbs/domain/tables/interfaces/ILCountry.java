/*
 * This file is generated by jOOQ.
 */
package cn.vertxup.lbs.domain.tables.interfaces;


import io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo;

import java.io.Serializable;
import java.time.LocalDateTime;


import static io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo.*;
/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public interface ILCountry extends VertxPojo, Serializable {

    /**
     * Setter for <code>ZDB.L_COUNTRY.KEY</code>. 「key」- 国家主键
     */
    public ILCountry setKey(String value);

    /**
     * Getter for <code>ZDB.L_COUNTRY.KEY</code>. 「key」- 国家主键
     */
    public String getKey();

    /**
     * Setter for <code>ZDB.L_COUNTRY.NAME</code>. 「name」- 国家名称
     */
    public ILCountry setName(String value);

    /**
     * Getter for <code>ZDB.L_COUNTRY.NAME</code>. 「name」- 国家名称
     */
    public String getName();

    /**
     * Setter for <code>ZDB.L_COUNTRY.CODE</code>. 「code」- 国家编号
     */
    public ILCountry setCode(String value);

    /**
     * Getter for <code>ZDB.L_COUNTRY.CODE</code>. 「code」- 国家编号
     */
    public String getCode();

    /**
     * Setter for <code>ZDB.L_COUNTRY.FLAG</code>. 「flag」- 国旗
     */
    public ILCountry setFlag(String value);

    /**
     * Getter for <code>ZDB.L_COUNTRY.FLAG</code>. 「flag」- 国旗
     */
    public String getFlag();

    /**
     * Setter for <code>ZDB.L_COUNTRY.PHONE_PREFIX</code>. 「phonePrefix」- 电话前缀
     */
    public ILCountry setPhonePrefix(String value);

    /**
     * Getter for <code>ZDB.L_COUNTRY.PHONE_PREFIX</code>. 「phonePrefix」- 电话前缀
     */
    public String getPhonePrefix();

    /**
     * Setter for <code>ZDB.L_COUNTRY.CURRENCY</code>. 「currency」- 使用货币
     */
    public ILCountry setCurrency(String value);

    /**
     * Getter for <code>ZDB.L_COUNTRY.CURRENCY</code>. 「currency」- 使用货币
     */
    public String getCurrency();

    /**
     * Setter for <code>ZDB.L_COUNTRY.METADATA</code>. 「metadata」- 附加配置
     */
    public ILCountry setMetadata(String value);

    /**
     * Getter for <code>ZDB.L_COUNTRY.METADATA</code>. 「metadata」- 附加配置
     */
    public String getMetadata();

    /**
     * Setter for <code>ZDB.L_COUNTRY.ORDER</code>. 「order」- 排序
     */
    public ILCountry setOrder(Integer value);

    /**
     * Getter for <code>ZDB.L_COUNTRY.ORDER</code>. 「order」- 排序
     */
    public Integer getOrder();

    /**
     * Setter for <code>ZDB.L_COUNTRY.ACTIVE</code>. 「active」- 是否启用
     */
    public ILCountry setActive(Boolean value);

    /**
     * Getter for <code>ZDB.L_COUNTRY.ACTIVE</code>. 「active」- 是否启用
     */
    public Boolean getActive();

    /**
     * Setter for <code>ZDB.L_COUNTRY.SIGMA</code>. 「sigma」- 统一标识
     */
    public ILCountry setSigma(String value);

    /**
     * Getter for <code>ZDB.L_COUNTRY.SIGMA</code>. 「sigma」- 统一标识
     */
    public String getSigma();

    /**
     * Setter for <code>ZDB.L_COUNTRY.LANGUAGE</code>. 「language」- 使用的语言
     */
    public ILCountry setLanguage(String value);

    /**
     * Getter for <code>ZDB.L_COUNTRY.LANGUAGE</code>. 「language」- 使用的语言
     */
    public String getLanguage();

    /**
     * Setter for <code>ZDB.L_COUNTRY.CREATED_AT</code>. 「createdAt」- 创建时间
     */
    public ILCountry setCreatedAt(LocalDateTime value);

    /**
     * Getter for <code>ZDB.L_COUNTRY.CREATED_AT</code>. 「createdAt」- 创建时间
     */
    public LocalDateTime getCreatedAt();

    /**
     * Setter for <code>ZDB.L_COUNTRY.CREATED_BY</code>. 「createdBy」- 创建人
     */
    public ILCountry setCreatedBy(String value);

    /**
     * Getter for <code>ZDB.L_COUNTRY.CREATED_BY</code>. 「createdBy」- 创建人
     */
    public String getCreatedBy();

    /**
     * Setter for <code>ZDB.L_COUNTRY.UPDATED_AT</code>. 「updatedAt」- 更新时间
     */
    public ILCountry setUpdatedAt(LocalDateTime value);

    /**
     * Getter for <code>ZDB.L_COUNTRY.UPDATED_AT</code>. 「updatedAt」- 更新时间
     */
    public LocalDateTime getUpdatedAt();

    /**
     * Setter for <code>ZDB.L_COUNTRY.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    public ILCountry setUpdatedBy(String value);

    /**
     * Getter for <code>ZDB.L_COUNTRY.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    public String getUpdatedBy();

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    /**
     * Load data from another generated Record/POJO implementing the common
     * interface ILCountry
     */
    public void from(ILCountry from);

    /**
     * Copy data into another generated Record/POJO implementing the common
     * interface ILCountry
     */
    public <E extends ILCountry> E into(E into);

        @Override
        public default ILCountry fromJson(io.vertx.core.json.JsonObject json) {
                setOrThrow(this::setKey,json::getString,"KEY","java.lang.String");
                setOrThrow(this::setName,json::getString,"NAME","java.lang.String");
                setOrThrow(this::setCode,json::getString,"CODE","java.lang.String");
                setOrThrow(this::setFlag,json::getString,"FLAG","java.lang.String");
                setOrThrow(this::setPhonePrefix,json::getString,"PHONE_PREFIX","java.lang.String");
                setOrThrow(this::setCurrency,json::getString,"CURRENCY","java.lang.String");
                setOrThrow(this::setMetadata,json::getString,"METADATA","java.lang.String");
                setOrThrow(this::setOrder,json::getInteger,"ORDER","java.lang.Integer");
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
                json.put("FLAG",getFlag());
                json.put("PHONE_PREFIX",getPhonePrefix());
                json.put("CURRENCY",getCurrency());
                json.put("METADATA",getMetadata());
                json.put("ORDER",getOrder());
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
