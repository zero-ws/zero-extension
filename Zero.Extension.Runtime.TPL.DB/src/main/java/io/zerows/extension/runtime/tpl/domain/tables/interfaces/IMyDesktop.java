/*
 * This file is generated by jOOQ.
 */
package io.zerows.extension.runtime.tpl.domain.tables.interfaces;


import io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo;

import java.io.Serializable;
import java.time.LocalDateTime;


import static io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo.*;
/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public interface IMyDesktop extends VertxPojo, Serializable {

    /**
     * Setter for <code>ZDB.MY_DESKTOP.KEY</code>. 「key」- 个人工作台
     */
    public IMyDesktop setKey(String value);

    /**
     * Getter for <code>ZDB.MY_DESKTOP.KEY</code>. 「key」- 个人工作台
     */
    public String getKey();

    /**
     * Setter for <code>ZDB.MY_DESKTOP.BAG_ID</code>. 「bagId」- 所属个人应用
     */
    public IMyDesktop setBagId(String value);

    /**
     * Getter for <code>ZDB.MY_DESKTOP.BAG_ID</code>. 「bagId」- 所属个人应用
     */
    public String getBagId();

    /**
     * Setter for <code>ZDB.MY_DESKTOP.UI_CONFIG</code>. 「uiConfig」- 看板专用配置
     */
    public IMyDesktop setUiConfig(String value);

    /**
     * Getter for <code>ZDB.MY_DESKTOP.UI_CONFIG</code>. 「uiConfig」- 看板专用配置
     */
    public String getUiConfig();

    /**
     * Setter for <code>ZDB.MY_DESKTOP.UI_GRID</code>. 「uiGrid」- 看板布局配置
     */
    public IMyDesktop setUiGrid(String value);

    /**
     * Getter for <code>ZDB.MY_DESKTOP.UI_GRID</code>. 「uiGrid」- 看板布局配置
     */
    public String getUiGrid();

    /**
     * Setter for <code>ZDB.MY_DESKTOP.OWNER</code>. 「owner」- 拥有者ID，我的 / 角色级
     */
    public IMyDesktop setOwner(String value);

    /**
     * Getter for <code>ZDB.MY_DESKTOP.OWNER</code>. 「owner」- 拥有者ID，我的 / 角色级
     */
    public String getOwner();

    /**
     * Setter for <code>ZDB.MY_DESKTOP.OWNER_TYPE</code>. 「ownerType」- ROLE
     * 角色，USER 用户
     */
    public IMyDesktop setOwnerType(String value);

    /**
     * Getter for <code>ZDB.MY_DESKTOP.OWNER_TYPE</code>. 「ownerType」- ROLE
     * 角色，USER 用户
     */
    public String getOwnerType();

    /**
     * Setter for <code>ZDB.MY_DESKTOP.ACTIVE</code>. 「active」- 是否启用
     */
    public IMyDesktop setActive(Boolean value);

    /**
     * Getter for <code>ZDB.MY_DESKTOP.ACTIVE</code>. 「active」- 是否启用
     */
    public Boolean getActive();

    /**
     * Setter for <code>ZDB.MY_DESKTOP.SIGMA</code>. 「sigma」- 统一标识
     */
    public IMyDesktop setSigma(String value);

    /**
     * Getter for <code>ZDB.MY_DESKTOP.SIGMA</code>. 「sigma」- 统一标识
     */
    public String getSigma();

    /**
     * Setter for <code>ZDB.MY_DESKTOP.METADATA</code>. 「metadata」- 附加配置
     */
    public IMyDesktop setMetadata(String value);

    /**
     * Getter for <code>ZDB.MY_DESKTOP.METADATA</code>. 「metadata」- 附加配置
     */
    public String getMetadata();

    /**
     * Setter for <code>ZDB.MY_DESKTOP.LANGUAGE</code>. 「language」- 使用的语言
     */
    public IMyDesktop setLanguage(String value);

    /**
     * Getter for <code>ZDB.MY_DESKTOP.LANGUAGE</code>. 「language」- 使用的语言
     */
    public String getLanguage();

    /**
     * Setter for <code>ZDB.MY_DESKTOP.CREATED_AT</code>. 「createdAt」- 创建时间
     */
    public IMyDesktop setCreatedAt(LocalDateTime value);

    /**
     * Getter for <code>ZDB.MY_DESKTOP.CREATED_AT</code>. 「createdAt」- 创建时间
     */
    public LocalDateTime getCreatedAt();

    /**
     * Setter for <code>ZDB.MY_DESKTOP.CREATED_BY</code>. 「createdBy」- 创建人
     */
    public IMyDesktop setCreatedBy(String value);

    /**
     * Getter for <code>ZDB.MY_DESKTOP.CREATED_BY</code>. 「createdBy」- 创建人
     */
    public String getCreatedBy();

    /**
     * Setter for <code>ZDB.MY_DESKTOP.UPDATED_AT</code>. 「updatedAt」- 更新时间
     */
    public IMyDesktop setUpdatedAt(LocalDateTime value);

    /**
     * Getter for <code>ZDB.MY_DESKTOP.UPDATED_AT</code>. 「updatedAt」- 更新时间
     */
    public LocalDateTime getUpdatedAt();

    /**
     * Setter for <code>ZDB.MY_DESKTOP.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    public IMyDesktop setUpdatedBy(String value);

    /**
     * Getter for <code>ZDB.MY_DESKTOP.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    public String getUpdatedBy();

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    /**
     * Load data from another generated Record/POJO implementing the common
     * interface IMyDesktop
     */
    public void from(IMyDesktop from);

    /**
     * Copy data into another generated Record/POJO implementing the common
     * interface IMyDesktop
     */
    public <E extends IMyDesktop> E into(E into);

        @Override
        public default IMyDesktop fromJson(io.vertx.core.json.JsonObject json) {
                setOrThrow(this::setKey,json::getString,"KEY","java.lang.String");
                setOrThrow(this::setBagId,json::getString,"BAG_ID","java.lang.String");
                setOrThrow(this::setUiConfig,json::getString,"UI_CONFIG","java.lang.String");
                setOrThrow(this::setUiGrid,json::getString,"UI_GRID","java.lang.String");
                setOrThrow(this::setOwner,json::getString,"OWNER","java.lang.String");
                setOrThrow(this::setOwnerType,json::getString,"OWNER_TYPE","java.lang.String");
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
                json.put("BAG_ID",getBagId());
                json.put("UI_CONFIG",getUiConfig());
                json.put("UI_GRID",getUiGrid());
                json.put("OWNER",getOwner());
                json.put("OWNER_TYPE",getOwnerType());
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
