/*
 * This file is generated by jOOQ.
 */
package cn.vertxup.rbac.domain.tables.interfaces;


import io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo;

import java.io.Serializable;
import java.time.LocalDateTime;


import static io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo.*;
/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public interface ISAction extends VertxPojo, Serializable {

    /**
     * Setter for <code>ZDB.S_ACTION.KEY</code>. 「key」- 操作ID
     */
    public ISAction setKey(String value);

    /**
     * Getter for <code>ZDB.S_ACTION.KEY</code>. 「key」- 操作ID
     */
    public String getKey();

    /**
     * Setter for <code>ZDB.S_ACTION.NAME</code>. 「name」- 操作名称
     */
    public ISAction setName(String value);

    /**
     * Getter for <code>ZDB.S_ACTION.NAME</code>. 「name」- 操作名称
     */
    public String getName();

    /**
     * Setter for <code>ZDB.S_ACTION.CODE</code>. 「code」- 操作码
     */
    public ISAction setCode(String value);

    /**
     * Getter for <code>ZDB.S_ACTION.CODE</code>. 「code」- 操作码
     */
    public String getCode();

    /**
     * Setter for <code>ZDB.S_ACTION.RESOURCE_ID</code>. 「resourceId」- 操作关联资源ID
     */
    public ISAction setResourceId(String value);

    /**
     * Getter for <code>ZDB.S_ACTION.RESOURCE_ID</code>. 「resourceId」- 操作关联资源ID
     */
    public String getResourceId();

    /**
     * Setter for <code>ZDB.S_ACTION.PERMISSION_ID</code>. 「permissionId」-
     * 操作所属权限
     */
    public ISAction setPermissionId(String value);

    /**
     * Getter for <code>ZDB.S_ACTION.PERMISSION_ID</code>. 「permissionId」-
     * 操作所属权限
     */
    public String getPermissionId();

    /**
     * Setter for <code>ZDB.S_ACTION.LEVEL</code>. 「level」- 操作级别, ACL控制
     */
    public ISAction setLevel(Integer value);

    /**
     * Getter for <code>ZDB.S_ACTION.LEVEL</code>. 「level」- 操作级别, ACL控制
     */
    public Integer getLevel();

    /**
     * Setter for <code>ZDB.S_ACTION.URI</code>. 「uri」- 资源地址
     */
    public ISAction setUri(String value);

    /**
     * Getter for <code>ZDB.S_ACTION.URI</code>. 「uri」- 资源地址
     */
    public String getUri();

    /**
     * Setter for <code>ZDB.S_ACTION.METHOD</code>. 「method」- 资源方法
     */
    public ISAction setMethod(String value);

    /**
     * Getter for <code>ZDB.S_ACTION.METHOD</code>. 「method」- 资源方法
     */
    public String getMethod();

    /**
     * Setter for <code>ZDB.S_ACTION.SIGMA</code>. 「sigma」- 统一标识
     */
    public ISAction setSigma(String value);

    /**
     * Getter for <code>ZDB.S_ACTION.SIGMA</code>. 「sigma」- 统一标识
     */
    public String getSigma();

    /**
     * Setter for <code>ZDB.S_ACTION.RENEWAL_CREDIT</code>. 「renewalCredit」-
     * 被刷新的凭证
     */
    public ISAction setRenewalCredit(String value);

    /**
     * Getter for <code>ZDB.S_ACTION.RENEWAL_CREDIT</code>. 「renewalCredit」-
     * 被刷新的凭证
     */
    public String getRenewalCredit();

    /**
     * Setter for <code>ZDB.S_ACTION.LANGUAGE</code>. 「language」- 使用的语言
     */
    public ISAction setLanguage(String value);

    /**
     * Getter for <code>ZDB.S_ACTION.LANGUAGE</code>. 「language」- 使用的语言
     */
    public String getLanguage();

    /**
     * Setter for <code>ZDB.S_ACTION.ACTIVE</code>. 「active」- 是否启用
     */
    public ISAction setActive(Boolean value);

    /**
     * Getter for <code>ZDB.S_ACTION.ACTIVE</code>. 「active」- 是否启用
     */
    public Boolean getActive();

    /**
     * Setter for <code>ZDB.S_ACTION.METADATA</code>. 「metadata」- 附加配置数据
     */
    public ISAction setMetadata(String value);

    /**
     * Getter for <code>ZDB.S_ACTION.METADATA</code>. 「metadata」- 附加配置数据
     */
    public String getMetadata();

    /**
     * Setter for <code>ZDB.S_ACTION.COMMENT</code>. 「action」- 操作说明
     */
    public ISAction setComment(String value);

    /**
     * Getter for <code>ZDB.S_ACTION.COMMENT</code>. 「action」- 操作说明
     */
    public String getComment();

    /**
     * Setter for <code>ZDB.S_ACTION.CREATED_AT</code>. 「createdAt」- 创建时间
     */
    public ISAction setCreatedAt(LocalDateTime value);

    /**
     * Getter for <code>ZDB.S_ACTION.CREATED_AT</code>. 「createdAt」- 创建时间
     */
    public LocalDateTime getCreatedAt();

    /**
     * Setter for <code>ZDB.S_ACTION.CREATED_BY</code>. 「createdBy」- 创建人
     */
    public ISAction setCreatedBy(String value);

    /**
     * Getter for <code>ZDB.S_ACTION.CREATED_BY</code>. 「createdBy」- 创建人
     */
    public String getCreatedBy();

    /**
     * Setter for <code>ZDB.S_ACTION.UPDATED_AT</code>. 「updatedAt」- 更新时间
     */
    public ISAction setUpdatedAt(LocalDateTime value);

    /**
     * Getter for <code>ZDB.S_ACTION.UPDATED_AT</code>. 「updatedAt」- 更新时间
     */
    public LocalDateTime getUpdatedAt();

    /**
     * Setter for <code>ZDB.S_ACTION.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    public ISAction setUpdatedBy(String value);

    /**
     * Getter for <code>ZDB.S_ACTION.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    public String getUpdatedBy();

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    /**
     * Load data from another generated Record/POJO implementing the common
     * interface ISAction
     */
    public void from(ISAction from);

    /**
     * Copy data into another generated Record/POJO implementing the common
     * interface ISAction
     */
    public <E extends ISAction> E into(E into);

        @Override
        public default ISAction fromJson(io.vertx.core.json.JsonObject json) {
                setOrThrow(this::setKey,json::getString,"KEY","java.lang.String");
                setOrThrow(this::setName,json::getString,"NAME","java.lang.String");
                setOrThrow(this::setCode,json::getString,"CODE","java.lang.String");
                setOrThrow(this::setResourceId,json::getString,"RESOURCE_ID","java.lang.String");
                setOrThrow(this::setPermissionId,json::getString,"PERMISSION_ID","java.lang.String");
                setOrThrow(this::setLevel,json::getInteger,"LEVEL","java.lang.Integer");
                setOrThrow(this::setUri,json::getString,"URI","java.lang.String");
                setOrThrow(this::setMethod,json::getString,"METHOD","java.lang.String");
                setOrThrow(this::setSigma,json::getString,"SIGMA","java.lang.String");
                setOrThrow(this::setRenewalCredit,json::getString,"RENEWAL_CREDIT","java.lang.String");
                setOrThrow(this::setLanguage,json::getString,"LANGUAGE","java.lang.String");
                setOrThrow(this::setActive,json::getBoolean,"ACTIVE","java.lang.Boolean");
                setOrThrow(this::setMetadata,json::getString,"METADATA","java.lang.String");
                setOrThrow(this::setComment,json::getString,"COMMENT","java.lang.String");
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
                json.put("RESOURCE_ID",getResourceId());
                json.put("PERMISSION_ID",getPermissionId());
                json.put("LEVEL",getLevel());
                json.put("URI",getUri());
                json.put("METHOD",getMethod());
                json.put("SIGMA",getSigma());
                json.put("RENEWAL_CREDIT",getRenewalCredit());
                json.put("LANGUAGE",getLanguage());
                json.put("ACTIVE",getActive());
                json.put("METADATA",getMetadata());
                json.put("COMMENT",getComment());
                json.put("CREATED_AT",getCreatedAt()==null?null:getCreatedAt().toString());
                json.put("CREATED_BY",getCreatedBy());
                json.put("UPDATED_AT",getUpdatedAt()==null?null:getUpdatedAt().toString());
                json.put("UPDATED_BY",getUpdatedBy());
                return json;
        }

}
