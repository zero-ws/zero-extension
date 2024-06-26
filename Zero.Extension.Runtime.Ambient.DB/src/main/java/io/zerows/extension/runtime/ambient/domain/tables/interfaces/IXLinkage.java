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
public interface IXLinkage extends VertxPojo, Serializable {

    /**
     * Setter for <code>ZDB.X_LINKAGE.KEY</code>. 「key」- 连接主键
     */
    public IXLinkage setKey(String value);

    /**
     * Getter for <code>ZDB.X_LINKAGE.KEY</code>. 「key」- 连接主键
     */
    public String getKey();

    /**
     * Setter for <code>ZDB.X_LINKAGE.NAME</code>. 「name」- 名称
     */
    public IXLinkage setName(String value);

    /**
     * Getter for <code>ZDB.X_LINKAGE.NAME</code>. 「name」- 名称
     */
    public String getName();

    /**
     * Setter for <code>ZDB.X_LINKAGE.TYPE</code>. 「type」- 连接类型
     */
    public IXLinkage setType(String value);

    /**
     * Getter for <code>ZDB.X_LINKAGE.TYPE</code>. 「type」- 连接类型
     */
    public String getType();

    /**
     * Setter for <code>ZDB.X_LINKAGE.ALIAS</code>. 「alias」- 别称
     */
    public IXLinkage setAlias(String value);

    /**
     * Getter for <code>ZDB.X_LINKAGE.ALIAS</code>. 「alias」- 别称
     */
    public String getAlias();

    /**
     * Setter for <code>ZDB.X_LINKAGE.REGION</code>. 「region」-
     * 连接区域标识，同一个区域算一个连接（批次）
     */
    public IXLinkage setRegion(String value);

    /**
     * Getter for <code>ZDB.X_LINKAGE.REGION</code>. 「region」-
     * 连接区域标识，同一个区域算一个连接（批次）
     */
    public String getRegion();

    /**
     * Setter for <code>ZDB.X_LINKAGE.LINK_KEY</code>. 「linkKey」- 双向Key计算，根据
     * source / target 计算
     */
    public IXLinkage setLinkKey(String value);

    /**
     * Getter for <code>ZDB.X_LINKAGE.LINK_KEY</code>. 「linkKey」- 双向Key计算，根据
     * source / target 计算
     */
    public String getLinkKey();

    /**
     * Setter for <code>ZDB.X_LINKAGE.LINK_TYPE</code>. 「linkType」- 关系记录类型
     */
    public IXLinkage setLinkType(String value);

    /**
     * Getter for <code>ZDB.X_LINKAGE.LINK_TYPE</code>. 「linkType」- 关系记录类型
     */
    public String getLinkType();

    /**
     * Setter for <code>ZDB.X_LINKAGE.LINK_DATA</code>. 「linkData」- 关联数据Json格式
     */
    public IXLinkage setLinkData(String value);

    /**
     * Getter for <code>ZDB.X_LINKAGE.LINK_DATA</code>. 「linkData」- 关联数据Json格式
     */
    public String getLinkData();

    /**
     * Setter for <code>ZDB.X_LINKAGE.SOURCE_KEY</code>. 「sourceKey」- 源实体
     */
    public IXLinkage setSourceKey(String value);

    /**
     * Getter for <code>ZDB.X_LINKAGE.SOURCE_KEY</code>. 「sourceKey」- 源实体
     */
    public String getSourceKey();

    /**
     * Setter for <code>ZDB.X_LINKAGE.SOURCE_TYPE</code>. 「sourceType」- 源实体类型
     */
    public IXLinkage setSourceType(String value);

    /**
     * Getter for <code>ZDB.X_LINKAGE.SOURCE_TYPE</code>. 「sourceType」- 源实体类型
     */
    public String getSourceType();

    /**
     * Setter for <code>ZDB.X_LINKAGE.SOURCE_DATA</code>. 「sourceData」-
     * 源记录Json格式
     */
    public IXLinkage setSourceData(String value);

    /**
     * Getter for <code>ZDB.X_LINKAGE.SOURCE_DATA</code>. 「sourceData」-
     * 源记录Json格式
     */
    public String getSourceData();

    /**
     * Setter for <code>ZDB.X_LINKAGE.TARGET_KEY</code>. 「targetKey」- 目标实体
     */
    public IXLinkage setTargetKey(String value);

    /**
     * Getter for <code>ZDB.X_LINKAGE.TARGET_KEY</code>. 「targetKey」- 目标实体
     */
    public String getTargetKey();

    /**
     * Setter for <code>ZDB.X_LINKAGE.TARGET_TYPE</code>. 「targetType」- 目标实体类型
     */
    public IXLinkage setTargetType(String value);

    /**
     * Getter for <code>ZDB.X_LINKAGE.TARGET_TYPE</code>. 「targetType」- 目标实体类型
     */
    public String getTargetType();

    /**
     * Setter for <code>ZDB.X_LINKAGE.TARGET_DATA</code>. 「targetData」-
     * 目标记录Json格式
     */
    public IXLinkage setTargetData(String value);

    /**
     * Getter for <code>ZDB.X_LINKAGE.TARGET_DATA</code>. 「targetData」-
     * 目标记录Json格式
     */
    public String getTargetData();

    /**
     * Setter for <code>ZDB.X_LINKAGE.SIGMA</code>. 「sigma」- 统一标识
     */
    public IXLinkage setSigma(String value);

    /**
     * Getter for <code>ZDB.X_LINKAGE.SIGMA</code>. 「sigma」- 统一标识
     */
    public String getSigma();

    /**
     * Setter for <code>ZDB.X_LINKAGE.LANGUAGE</code>. 「language」- 使用的语言
     */
    public IXLinkage setLanguage(String value);

    /**
     * Getter for <code>ZDB.X_LINKAGE.LANGUAGE</code>. 「language」- 使用的语言
     */
    public String getLanguage();

    /**
     * Setter for <code>ZDB.X_LINKAGE.ACTIVE</code>. 「active」- 是否启用
     */
    public IXLinkage setActive(Boolean value);

    /**
     * Getter for <code>ZDB.X_LINKAGE.ACTIVE</code>. 「active」- 是否启用
     */
    public Boolean getActive();

    /**
     * Setter for <code>ZDB.X_LINKAGE.METADATA</code>. 「metadata」- 附加配置数据
     */
    public IXLinkage setMetadata(String value);

    /**
     * Getter for <code>ZDB.X_LINKAGE.METADATA</code>. 「metadata」- 附加配置数据
     */
    public String getMetadata();

    /**
     * Setter for <code>ZDB.X_LINKAGE.CREATED_AT</code>. 「createdAt」- 创建时间
     */
    public IXLinkage setCreatedAt(LocalDateTime value);

    /**
     * Getter for <code>ZDB.X_LINKAGE.CREATED_AT</code>. 「createdAt」- 创建时间
     */
    public LocalDateTime getCreatedAt();

    /**
     * Setter for <code>ZDB.X_LINKAGE.CREATED_BY</code>. 「createdBy」- 创建人
     */
    public IXLinkage setCreatedBy(String value);

    /**
     * Getter for <code>ZDB.X_LINKAGE.CREATED_BY</code>. 「createdBy」- 创建人
     */
    public String getCreatedBy();

    /**
     * Setter for <code>ZDB.X_LINKAGE.UPDATED_AT</code>. 「updatedAt」- 更新时间
     */
    public IXLinkage setUpdatedAt(LocalDateTime value);

    /**
     * Getter for <code>ZDB.X_LINKAGE.UPDATED_AT</code>. 「updatedAt」- 更新时间
     */
    public LocalDateTime getUpdatedAt();

    /**
     * Setter for <code>ZDB.X_LINKAGE.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    public IXLinkage setUpdatedBy(String value);

    /**
     * Getter for <code>ZDB.X_LINKAGE.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    public String getUpdatedBy();

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    /**
     * Load data from another generated Record/POJO implementing the common
     * interface IXLinkage
     */
    public void from(IXLinkage from);

    /**
     * Copy data into another generated Record/POJO implementing the common
     * interface IXLinkage
     */
    public <E extends IXLinkage> E into(E into);

        @Override
        public default IXLinkage fromJson(io.vertx.core.json.JsonObject json) {
                setOrThrow(this::setKey,json::getString,"KEY","java.lang.String");
                setOrThrow(this::setName,json::getString,"NAME","java.lang.String");
                setOrThrow(this::setType,json::getString,"TYPE","java.lang.String");
                setOrThrow(this::setAlias,json::getString,"ALIAS","java.lang.String");
                setOrThrow(this::setRegion,json::getString,"REGION","java.lang.String");
                setOrThrow(this::setLinkKey,json::getString,"LINK_KEY","java.lang.String");
                setOrThrow(this::setLinkType,json::getString,"LINK_TYPE","java.lang.String");
                setOrThrow(this::setLinkData,json::getString,"LINK_DATA","java.lang.String");
                setOrThrow(this::setSourceKey,json::getString,"SOURCE_KEY","java.lang.String");
                setOrThrow(this::setSourceType,json::getString,"SOURCE_TYPE","java.lang.String");
                setOrThrow(this::setSourceData,json::getString,"SOURCE_DATA","java.lang.String");
                setOrThrow(this::setTargetKey,json::getString,"TARGET_KEY","java.lang.String");
                setOrThrow(this::setTargetType,json::getString,"TARGET_TYPE","java.lang.String");
                setOrThrow(this::setTargetData,json::getString,"TARGET_DATA","java.lang.String");
                setOrThrow(this::setSigma,json::getString,"SIGMA","java.lang.String");
                setOrThrow(this::setLanguage,json::getString,"LANGUAGE","java.lang.String");
                setOrThrow(this::setActive,json::getBoolean,"ACTIVE","java.lang.Boolean");
                setOrThrow(this::setMetadata,json::getString,"METADATA","java.lang.String");
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
                json.put("TYPE",getType());
                json.put("ALIAS",getAlias());
                json.put("REGION",getRegion());
                json.put("LINK_KEY",getLinkKey());
                json.put("LINK_TYPE",getLinkType());
                json.put("LINK_DATA",getLinkData());
                json.put("SOURCE_KEY",getSourceKey());
                json.put("SOURCE_TYPE",getSourceType());
                json.put("SOURCE_DATA",getSourceData());
                json.put("TARGET_KEY",getTargetKey());
                json.put("TARGET_TYPE",getTargetType());
                json.put("TARGET_DATA",getTargetData());
                json.put("SIGMA",getSigma());
                json.put("LANGUAGE",getLanguage());
                json.put("ACTIVE",getActive());
                json.put("METADATA",getMetadata());
                json.put("CREATED_AT",getCreatedAt()==null?null:getCreatedAt().toString());
                json.put("CREATED_BY",getCreatedBy());
                json.put("UPDATED_AT",getUpdatedAt()==null?null:getUpdatedAt().toString());
                json.put("UPDATED_BY",getUpdatedBy());
                return json;
        }

}
