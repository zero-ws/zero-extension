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
public interface IXTenant extends VertxPojo, Serializable {

    /**
     * Setter for <code>ZDB.X_TENANT.KEY</code>. 「key」- 租户主键
     */
    public IXTenant setKey(String value);

    /**
     * Getter for <code>ZDB.X_TENANT.KEY</code>. 「key」- 租户主键
     */
    public String getKey();

    /**
     * Setter for <code>ZDB.X_TENANT.NAME</code>. 「name」- 租户名称
     */
    public IXTenant setName(String value);

    /**
     * Getter for <code>ZDB.X_TENANT.NAME</code>. 「name」- 租户名称
     */
    public String getName();

    /**
     * Setter for <code>ZDB.X_TENANT.CODE</code>. 「code」- 租户编码
     */
    public IXTenant setCode(String value);

    /**
     * Getter for <code>ZDB.X_TENANT.CODE</code>. 「code」- 租户编码
     */
    public String getCode();

    /**
     * Setter for <code>ZDB.X_TENANT.STATUS</code>. 「status」- 租户状态
     */
    public IXTenant setStatus(String value);

    /**
     * Getter for <code>ZDB.X_TENANT.STATUS</code>. 「status」- 租户状态
     */
    public String getStatus();

    /**
     * Setter for <code>ZDB.X_TENANT.TYPE</code>. 「type」- 租户类型
     */
    public IXTenant setType(String value);

    /**
     * Getter for <code>ZDB.X_TENANT.TYPE</code>. 「type」- 租户类型
     */
    public String getType();

    /**
     * Setter for <code>ZDB.X_TENANT.ID_NUMBER</code>. 「idNumber」- 身份证号
     */
    public IXTenant setIdNumber(String value);

    /**
     * Getter for <code>ZDB.X_TENANT.ID_NUMBER</code>. 「idNumber」- 身份证号
     */
    public String getIdNumber();

    /**
     * Setter for <code>ZDB.X_TENANT.ID_FRONT</code>. 「idFront」- 身份证正面
     */
    public IXTenant setIdFront(String value);

    /**
     * Getter for <code>ZDB.X_TENANT.ID_FRONT</code>. 「idFront」- 身份证正面
     */
    public String getIdFront();

    /**
     * Setter for <code>ZDB.X_TENANT.ID_BACK</code>. 「idBack」- 身份证反面
     */
    public IXTenant setIdBack(String value);

    /**
     * Getter for <code>ZDB.X_TENANT.ID_BACK</code>. 「idBack」- 身份证反面
     */
    public String getIdBack();

    /**
     * Setter for <code>ZDB.X_TENANT.BANK_ID</code>. 「bankId」- 开户行
     */
    public IXTenant setBankId(String value);

    /**
     * Getter for <code>ZDB.X_TENANT.BANK_ID</code>. 「bankId」- 开户行
     */
    public String getBankId();

    /**
     * Setter for <code>ZDB.X_TENANT.BANK_CARD</code>. 「bankCard」- 开户行账号
     */
    public IXTenant setBankCard(String value);

    /**
     * Getter for <code>ZDB.X_TENANT.BANK_CARD</code>. 「bankCard」- 开户行账号
     */
    public String getBankCard();

    /**
     * Setter for <code>ZDB.X_TENANT.ACTIVE</code>. 「active」- 是否启用
     */
    public IXTenant setActive(Boolean value);

    /**
     * Getter for <code>ZDB.X_TENANT.ACTIVE</code>. 「active」- 是否启用
     */
    public Boolean getActive();

    /**
     * Setter for <code>ZDB.X_TENANT.SIGMA</code>. 「sigma」- 统一标识
     */
    public IXTenant setSigma(String value);

    /**
     * Getter for <code>ZDB.X_TENANT.SIGMA</code>. 「sigma」- 统一标识
     */
    public String getSigma();

    /**
     * Setter for <code>ZDB.X_TENANT.METADATA</code>. 「metadata」- 附加配置
     */
    public IXTenant setMetadata(String value);

    /**
     * Getter for <code>ZDB.X_TENANT.METADATA</code>. 「metadata」- 附加配置
     */
    public String getMetadata();

    /**
     * Setter for <code>ZDB.X_TENANT.LANGUAGE</code>. 「language」- 使用的语言
     */
    public IXTenant setLanguage(String value);

    /**
     * Getter for <code>ZDB.X_TENANT.LANGUAGE</code>. 「language」- 使用的语言
     */
    public String getLanguage();

    /**
     * Setter for <code>ZDB.X_TENANT.CREATED_AT</code>. 「createdAt」- 创建时间
     */
    public IXTenant setCreatedAt(LocalDateTime value);

    /**
     * Getter for <code>ZDB.X_TENANT.CREATED_AT</code>. 「createdAt」- 创建时间
     */
    public LocalDateTime getCreatedAt();

    /**
     * Setter for <code>ZDB.X_TENANT.CREATED_BY</code>. 「createdBy」- 创建人
     */
    public IXTenant setCreatedBy(String value);

    /**
     * Getter for <code>ZDB.X_TENANT.CREATED_BY</code>. 「createdBy」- 创建人
     */
    public String getCreatedBy();

    /**
     * Setter for <code>ZDB.X_TENANT.UPDATED_AT</code>. 「updatedAt」- 更新时间
     */
    public IXTenant setUpdatedAt(LocalDateTime value);

    /**
     * Getter for <code>ZDB.X_TENANT.UPDATED_AT</code>. 「updatedAt」- 更新时间
     */
    public LocalDateTime getUpdatedAt();

    /**
     * Setter for <code>ZDB.X_TENANT.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    public IXTenant setUpdatedBy(String value);

    /**
     * Getter for <code>ZDB.X_TENANT.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    public String getUpdatedBy();

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    /**
     * Load data from another generated Record/POJO implementing the common
     * interface IXTenant
     */
    public void from(IXTenant from);

    /**
     * Copy data into another generated Record/POJO implementing the common
     * interface IXTenant
     */
    public <E extends IXTenant> E into(E into);

        @Override
        public default IXTenant fromJson(io.vertx.core.json.JsonObject json) {
                setOrThrow(this::setKey,json::getString,"KEY","java.lang.String");
                setOrThrow(this::setName,json::getString,"NAME","java.lang.String");
                setOrThrow(this::setCode,json::getString,"CODE","java.lang.String");
                setOrThrow(this::setStatus,json::getString,"STATUS","java.lang.String");
                setOrThrow(this::setType,json::getString,"TYPE","java.lang.String");
                setOrThrow(this::setIdNumber,json::getString,"ID_NUMBER","java.lang.String");
                setOrThrow(this::setIdFront,json::getString,"ID_FRONT","java.lang.String");
                setOrThrow(this::setIdBack,json::getString,"ID_BACK","java.lang.String");
                setOrThrow(this::setBankId,json::getString,"BANK_ID","java.lang.String");
                setOrThrow(this::setBankCard,json::getString,"BANK_CARD","java.lang.String");
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
                json.put("STATUS",getStatus());
                json.put("TYPE",getType());
                json.put("ID_NUMBER",getIdNumber());
                json.put("ID_FRONT",getIdFront());
                json.put("ID_BACK",getIdBack());
                json.put("BANK_ID",getBankId());
                json.put("BANK_CARD",getBankCard());
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