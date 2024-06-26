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
public interface IXMenu extends VertxPojo, Serializable {

    /**
     * Setter for <code>ZDB.X_MENU.KEY</code>. 「key」- 菜单主键
     */
    public IXMenu setKey(String value);

    /**
     * Getter for <code>ZDB.X_MENU.KEY</code>. 「key」- 菜单主键
     */
    public String getKey();

    /**
     * Setter for <code>ZDB.X_MENU.NAME</code>. 「name」- 菜单名称
     */
    public IXMenu setName(String value);

    /**
     * Getter for <code>ZDB.X_MENU.NAME</code>. 「name」- 菜单名称
     */
    public String getName();

    /**
     * Setter for <code>ZDB.X_MENU.ICON</code>. 「icon」- 菜单使用的icon
     */
    public IXMenu setIcon(String value);

    /**
     * Getter for <code>ZDB.X_MENU.ICON</code>. 「icon」- 菜单使用的icon
     */
    public String getIcon();

    /**
     * Setter for <code>ZDB.X_MENU.TEXT</code>. 「text」- 菜单显示文字
     */
    public IXMenu setText(String value);

    /**
     * Getter for <code>ZDB.X_MENU.TEXT</code>. 「text」- 菜单显示文字
     */
    public String getText();

    /**
     * Setter for <code>ZDB.X_MENU.URI</code>. 「uri」- 菜单地址（不包含应用的path）
     */
    public IXMenu setUri(String value);

    /**
     * Getter for <code>ZDB.X_MENU.URI</code>. 「uri」- 菜单地址（不包含应用的path）
     */
    public String getUri();

    /**
     * Setter for <code>ZDB.X_MENU.TYPE</code>. 「type」- 菜单类型
     */
    public IXMenu setType(String value);

    /**
     * Getter for <code>ZDB.X_MENU.TYPE</code>. 「type」- 菜单类型
     */
    public String getType();

    /**
     * Setter for <code>ZDB.X_MENU.ORDER</code>. 「order」- 菜单排序
     */
    public IXMenu setOrder(Long value);

    /**
     * Getter for <code>ZDB.X_MENU.ORDER</code>. 「order」- 菜单排序
     */
    public Long getOrder();

    /**
     * Setter for <code>ZDB.X_MENU.LEVEL</code>. 「level」- 菜单层级
     */
    public IXMenu setLevel(Long value);

    /**
     * Getter for <code>ZDB.X_MENU.LEVEL</code>. 「level」- 菜单层级
     */
    public Long getLevel();

    /**
     * Setter for <code>ZDB.X_MENU.PARENT_ID</code>. 「parentId」- 菜单父ID
     */
    public IXMenu setParentId(String value);

    /**
     * Getter for <code>ZDB.X_MENU.PARENT_ID</code>. 「parentId」- 菜单父ID
     */
    public String getParentId();

    /**
     * Setter for <code>ZDB.X_MENU.APP_ID</code>. 「appId」- 应用程序ID
     */
    public IXMenu setAppId(String value);

    /**
     * Getter for <code>ZDB.X_MENU.APP_ID</code>. 「appId」- 应用程序ID
     */
    public String getAppId();

    /**
     * Setter for <code>ZDB.X_MENU.ACTIVE</code>. 「active」- 是否启用
     */
    public IXMenu setActive(Boolean value);

    /**
     * Getter for <code>ZDB.X_MENU.ACTIVE</code>. 「active」- 是否启用
     */
    public Boolean getActive();

    /**
     * Setter for <code>ZDB.X_MENU.SIGMA</code>. 「sigma」- 统一标识
     */
    public IXMenu setSigma(String value);

    /**
     * Getter for <code>ZDB.X_MENU.SIGMA</code>. 「sigma」- 统一标识
     */
    public String getSigma();

    /**
     * Setter for <code>ZDB.X_MENU.METADATA</code>. 「metadata」- 附加配置
     */
    public IXMenu setMetadata(String value);

    /**
     * Getter for <code>ZDB.X_MENU.METADATA</code>. 「metadata」- 附加配置
     */
    public String getMetadata();

    /**
     * Setter for <code>ZDB.X_MENU.LANGUAGE</code>. 「language」- 使用的语言
     */
    public IXMenu setLanguage(String value);

    /**
     * Getter for <code>ZDB.X_MENU.LANGUAGE</code>. 「language」- 使用的语言
     */
    public String getLanguage();

    /**
     * Setter for <code>ZDB.X_MENU.CREATED_AT</code>. 「createdAt」- 创建时间
     */
    public IXMenu setCreatedAt(LocalDateTime value);

    /**
     * Getter for <code>ZDB.X_MENU.CREATED_AT</code>. 「createdAt」- 创建时间
     */
    public LocalDateTime getCreatedAt();

    /**
     * Setter for <code>ZDB.X_MENU.CREATED_BY</code>. 「createdBy」- 创建人
     */
    public IXMenu setCreatedBy(String value);

    /**
     * Getter for <code>ZDB.X_MENU.CREATED_BY</code>. 「createdBy」- 创建人
     */
    public String getCreatedBy();

    /**
     * Setter for <code>ZDB.X_MENU.UPDATED_AT</code>. 「updatedAt」- 更新时间
     */
    public IXMenu setUpdatedAt(LocalDateTime value);

    /**
     * Getter for <code>ZDB.X_MENU.UPDATED_AT</code>. 「updatedAt」- 更新时间
     */
    public LocalDateTime getUpdatedAt();

    /**
     * Setter for <code>ZDB.X_MENU.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    public IXMenu setUpdatedBy(String value);

    /**
     * Getter for <code>ZDB.X_MENU.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    public String getUpdatedBy();

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    /**
     * Load data from another generated Record/POJO implementing the common
     * interface IXMenu
     */
    public void from(IXMenu from);

    /**
     * Copy data into another generated Record/POJO implementing the common
     * interface IXMenu
     */
    public <E extends IXMenu> E into(E into);

        @Override
        public default IXMenu fromJson(io.vertx.core.json.JsonObject json) {
                setOrThrow(this::setKey,json::getString,"KEY","java.lang.String");
                setOrThrow(this::setName,json::getString,"NAME","java.lang.String");
                setOrThrow(this::setIcon,json::getString,"ICON","java.lang.String");
                setOrThrow(this::setText,json::getString,"TEXT","java.lang.String");
                setOrThrow(this::setUri,json::getString,"URI","java.lang.String");
                setOrThrow(this::setType,json::getString,"TYPE","java.lang.String");
                setOrThrow(this::setOrder,json::getLong,"ORDER","java.lang.Long");
                setOrThrow(this::setLevel,json::getLong,"LEVEL","java.lang.Long");
                setOrThrow(this::setParentId,json::getString,"PARENT_ID","java.lang.String");
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
                json.put("ICON",getIcon());
                json.put("TEXT",getText());
                json.put("URI",getUri());
                json.put("TYPE",getType());
                json.put("ORDER",getOrder());
                json.put("LEVEL",getLevel());
                json.put("PARENT_ID",getParentId());
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
