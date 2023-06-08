/*
 * This file is generated by jOOQ.
 */
package cn.vertxup.tpl.domain.tables.interfaces;


import io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo;

import java.io.Serializable;
import java.time.LocalDateTime;

import static io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo.setOrThrow;
/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public interface IMyBag extends VertxPojo, Serializable {

    /**
     * Setter for <code>DB_ETERNAL.MY_BAG.KEY</code>. 「key」- 个人应用主键
     */
    public IMyBag setKey(String value);

    /**
     * Getter for <code>DB_ETERNAL.MY_BAG.KEY</code>. 「key」- 个人应用主键
     */
    public String getKey();

    /**
     * Setter for <code>DB_ETERNAL.MY_BAG.BAG_ID</code>. 「bagId」- 个人包主键
     */
    public IMyBag setBagId(String value);

    /**
     * Getter for <code>DB_ETERNAL.MY_BAG.BAG_ID</code>. 「bagId」- 个人包主键
     */
    public String getBagId();

    /**
     * Setter for <code>DB_ETERNAL.MY_BAG.OWNER</code>. 「owner」- 拥有者ID，我的 / 角色级
     */
    public IMyBag setOwner(String value);

    /**
     * Getter for <code>DB_ETERNAL.MY_BAG.OWNER</code>. 「owner」- 拥有者ID，我的 / 角色级
     */
    public String getOwner();

    /**
     * Setter for <code>DB_ETERNAL.MY_BAG.OWNER_TYPE</code>. 「ownerType」- ROLE
     * 角色，USER 用户
     */
    public IMyBag setOwnerType(String value);

    /**
     * Getter for <code>DB_ETERNAL.MY_BAG.OWNER_TYPE</code>. 「ownerType」- ROLE
     * 角色，USER 用户
     */
    public String getOwnerType();

    /**
     * Setter for <code>DB_ETERNAL.MY_BAG.UI_SORT</code>. 「uiSort」- 模块排序
     */
    public IMyBag setUiSort(Long value);

    /**
     * Getter for <code>DB_ETERNAL.MY_BAG.UI_SORT</code>. 「uiSort」- 模块排序
     */
    public Long getUiSort();

    /**
     * Setter for <code>DB_ETERNAL.MY_BAG.TYPE</code>. 「type」- 类型（默认全站）
     */
    public IMyBag setType(String value);

    /**
     * Getter for <code>DB_ETERNAL.MY_BAG.TYPE</code>. 「type」- 类型（默认全站）
     */
    public String getType();

    /**
     * Setter for <code>DB_ETERNAL.MY_BAG.POSITION</code>. 「position」- 位置（默认左上）
     */
    public IMyBag setPosition(String value);

    /**
     * Getter for <code>DB_ETERNAL.MY_BAG.POSITION</code>. 「position」- 位置（默认左上）
     */
    public String getPosition();

    /**
     * Setter for <code>DB_ETERNAL.MY_BAG.ACTIVE</code>. 「active」- 是否启用
     */
    public IMyBag setActive(Boolean value);

    /**
     * Getter for <code>DB_ETERNAL.MY_BAG.ACTIVE</code>. 「active」- 是否启用
     */
    public Boolean getActive();

    /**
     * Setter for <code>DB_ETERNAL.MY_BAG.SIGMA</code>. 「sigma」- 统一标识
     */
    public IMyBag setSigma(String value);

    /**
     * Getter for <code>DB_ETERNAL.MY_BAG.SIGMA</code>. 「sigma」- 统一标识
     */
    public String getSigma();

    /**
     * Setter for <code>DB_ETERNAL.MY_BAG.METADATA</code>. 「metadata」- 附加配置
     */
    public IMyBag setMetadata(String value);

    /**
     * Getter for <code>DB_ETERNAL.MY_BAG.METADATA</code>. 「metadata」- 附加配置
     */
    public String getMetadata();

    /**
     * Setter for <code>DB_ETERNAL.MY_BAG.LANGUAGE</code>. 「language」- 使用的语言
     */
    public IMyBag setLanguage(String value);

    /**
     * Getter for <code>DB_ETERNAL.MY_BAG.LANGUAGE</code>. 「language」- 使用的语言
     */
    public String getLanguage();

    /**
     * Setter for <code>DB_ETERNAL.MY_BAG.CREATED_AT</code>. 「createdAt」- 创建时间
     */
    public IMyBag setCreatedAt(LocalDateTime value);

    /**
     * Getter for <code>DB_ETERNAL.MY_BAG.CREATED_AT</code>. 「createdAt」- 创建时间
     */
    public LocalDateTime getCreatedAt();

    /**
     * Setter for <code>DB_ETERNAL.MY_BAG.CREATED_BY</code>. 「createdBy」- 创建人
     */
    public IMyBag setCreatedBy(String value);

    /**
     * Getter for <code>DB_ETERNAL.MY_BAG.CREATED_BY</code>. 「createdBy」- 创建人
     */
    public String getCreatedBy();

    /**
     * Setter for <code>DB_ETERNAL.MY_BAG.UPDATED_AT</code>. 「updatedAt」- 更新时间
     */
    public IMyBag setUpdatedAt(LocalDateTime value);

    /**
     * Getter for <code>DB_ETERNAL.MY_BAG.UPDATED_AT</code>. 「updatedAt」- 更新时间
     */
    public LocalDateTime getUpdatedAt();

    /**
     * Setter for <code>DB_ETERNAL.MY_BAG.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    public IMyBag setUpdatedBy(String value);

    /**
     * Getter for <code>DB_ETERNAL.MY_BAG.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    public String getUpdatedBy();

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    /**
     * Load data from another generated Record/POJO implementing the common
     * interface IMyBag
     */
    public void from(IMyBag from);

    /**
     * Copy data into another generated Record/POJO implementing the common
     * interface IMyBag
     */
    public <E extends IMyBag> E into(E into);

        @Override
        public default IMyBag fromJson(io.vertx.core.json.JsonObject json) {
                setOrThrow(this::setKey,json::getString,"KEY","java.lang.String");
                setOrThrow(this::setBagId,json::getString,"BAG_ID","java.lang.String");
                setOrThrow(this::setOwner,json::getString,"OWNER","java.lang.String");
                setOrThrow(this::setOwnerType,json::getString,"OWNER_TYPE","java.lang.String");
                setOrThrow(this::setUiSort,json::getLong,"UI_SORT","java.lang.Long");
                setOrThrow(this::setType,json::getString,"TYPE","java.lang.String");
                setOrThrow(this::setPosition,json::getString,"POSITION","java.lang.String");
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
                json.put("OWNER",getOwner());
                json.put("OWNER_TYPE",getOwnerType());
                json.put("UI_SORT",getUiSort());
                json.put("TYPE",getType());
                json.put("POSITION",getPosition());
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
