/*
 * This file is generated by jOOQ.
 */
package io.zerows.extension.commerce.rbac.domain.tables.interfaces;


import io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo;

import java.io.Serializable;
import java.time.LocalDateTime;


import static io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo.*;
/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public interface ISResource extends VertxPojo, Serializable {

    /**
     * Setter for <code>ZDB.S_RESOURCE.KEY</code>. 「key」- 资源对应的ID
     */
    public ISResource setKey(String value);

    /**
     * Getter for <code>ZDB.S_RESOURCE.KEY</code>. 「key」- 资源对应的ID
     */
    public String getKey();

    /**
     * Setter for <code>ZDB.S_RESOURCE.CODE</code>. 「code」- 资源编号
     */
    public ISResource setCode(String value);

    /**
     * Getter for <code>ZDB.S_RESOURCE.CODE</code>. 「code」- 资源编号
     */
    public String getCode();

    /**
     * Setter for <code>ZDB.S_RESOURCE.NAME</code>. 「name」- 资源名称
     */
    public ISResource setName(String value);

    /**
     * Getter for <code>ZDB.S_RESOURCE.NAME</code>. 「name」- 资源名称
     */
    public String getName();

    /**
     * Setter for <code>ZDB.S_RESOURCE.TYPE</code>. 「type」- 资源分类
     */
    public ISResource setType(String value);

    /**
     * Getter for <code>ZDB.S_RESOURCE.TYPE</code>. 「type」- 资源分类
     */
    public String getType();

    /**
     * Setter for <code>ZDB.S_RESOURCE.IDENTIFIER</code>. 「identifier」-
     * 当前资源所属的Model的标识
     */
    public ISResource setIdentifier(String value);

    /**
     * Getter for <code>ZDB.S_RESOURCE.IDENTIFIER</code>. 「identifier」-
     * 当前资源所属的Model的标识
     */
    public String getIdentifier();

    /**
     * Setter for <code>ZDB.S_RESOURCE.COMMENT</code>. 「comment」- 备注信息
     */
    public ISResource setComment(String value);

    /**
     * Getter for <code>ZDB.S_RESOURCE.COMMENT</code>. 「comment」- 备注信息
     */
    public String getComment();

    /**
     * Setter for <code>ZDB.S_RESOURCE.LEVEL</code>. 「level」- 资源需求级别
     */
    public ISResource setLevel(Integer value);

    /**
     * Getter for <code>ZDB.S_RESOURCE.LEVEL</code>. 「level」- 资源需求级别
     */
    public Integer getLevel();

    /**
     * Setter for <code>ZDB.S_RESOURCE.MODE_ROLE</code>. 「modeRole」- 该资源查找角色的模式
     */
    public ISResource setModeRole(String value);

    /**
     * Getter for <code>ZDB.S_RESOURCE.MODE_ROLE</code>. 「modeRole」- 该资源查找角色的模式
     */
    public String getModeRole();

    /**
     * Setter for <code>ZDB.S_RESOURCE.MODE_GROUP</code>. 「modeGroup」- 该资源查找组的模式
     */
    public ISResource setModeGroup(String value);

    /**
     * Getter for <code>ZDB.S_RESOURCE.MODE_GROUP</code>. 「modeGroup」- 该资源查找组的模式
     */
    public String getModeGroup();

    /**
     * Setter for <code>ZDB.S_RESOURCE.MODE_TREE</code>. 「modeTree」-
     * 该资源处理树（用户组）的模式
     */
    public ISResource setModeTree(String value);

    /**
     * Getter for <code>ZDB.S_RESOURCE.MODE_TREE</code>. 「modeTree」-
     * 该资源处理树（用户组）的模式
     */
    public String getModeTree();

    /**
     * Setter for <code>ZDB.S_RESOURCE.VIRTUAL</code>. 「virtual」- 虚拟资源
     */
    public ISResource setVirtual(Boolean value);

    /**
     * Getter for <code>ZDB.S_RESOURCE.VIRTUAL</code>. 「virtual」- 虚拟资源
     */
    public Boolean getVirtual();

    /**
     * Setter for <code>ZDB.S_RESOURCE.SEEK_SYNTAX</code>. 「seekSyntax」- 访问者语法
     */
    public ISResource setSeekSyntax(String value);

    /**
     * Getter for <code>ZDB.S_RESOURCE.SEEK_SYNTAX</code>. 「seekSyntax」- 访问者语法
     */
    public String getSeekSyntax();

    /**
     * Setter for <code>ZDB.S_RESOURCE.SEEK_CONFIG</code>. 「seekConfig」- 访问者配置
     */
    public ISResource setSeekConfig(String value);

    /**
     * Getter for <code>ZDB.S_RESOURCE.SEEK_CONFIG</code>. 「seekConfig」- 访问者配置
     */
    public String getSeekConfig();

    /**
     * Setter for <code>ZDB.S_RESOURCE.SEEK_COMPONENT</code>. 「seekComponent」-
     * 访问者组件
     */
    public ISResource setSeekComponent(String value);

    /**
     * Getter for <code>ZDB.S_RESOURCE.SEEK_COMPONENT</code>. 「seekComponent」-
     * 访问者组件
     */
    public String getSeekComponent();

    /**
     * Setter for <code>ZDB.S_RESOURCE.SIGMA</code>. 「sigma」- 统一标识
     */
    public ISResource setSigma(String value);

    /**
     * Getter for <code>ZDB.S_RESOURCE.SIGMA</code>. 「sigma」- 统一标识
     */
    public String getSigma();

    /**
     * Setter for <code>ZDB.S_RESOURCE.CATEGORY</code>. 「category」- 资源分类
     */
    public ISResource setCategory(String value);

    /**
     * Getter for <code>ZDB.S_RESOURCE.CATEGORY</code>. 「category」- 资源分类
     */
    public String getCategory();

    /**
     * Setter for <code>ZDB.S_RESOURCE.LANGUAGE</code>. 「language」- 使用的语言
     */
    public ISResource setLanguage(String value);

    /**
     * Getter for <code>ZDB.S_RESOURCE.LANGUAGE</code>. 「language」- 使用的语言
     */
    public String getLanguage();

    /**
     * Setter for <code>ZDB.S_RESOURCE.ACTIVE</code>. 「active」- 是否启用
     */
    public ISResource setActive(Boolean value);

    /**
     * Getter for <code>ZDB.S_RESOURCE.ACTIVE</code>. 「active」- 是否启用
     */
    public Boolean getActive();

    /**
     * Setter for <code>ZDB.S_RESOURCE.METADATA</code>. 「metadata」- 附加配置数据
     */
    public ISResource setMetadata(String value);

    /**
     * Getter for <code>ZDB.S_RESOURCE.METADATA</code>. 「metadata」- 附加配置数据
     */
    public String getMetadata();

    /**
     * Setter for <code>ZDB.S_RESOURCE.CREATED_AT</code>. 「createdAt」- 创建时间
     */
    public ISResource setCreatedAt(LocalDateTime value);

    /**
     * Getter for <code>ZDB.S_RESOURCE.CREATED_AT</code>. 「createdAt」- 创建时间
     */
    public LocalDateTime getCreatedAt();

    /**
     * Setter for <code>ZDB.S_RESOURCE.CREATED_BY</code>. 「createdBy」- 创建人
     */
    public ISResource setCreatedBy(String value);

    /**
     * Getter for <code>ZDB.S_RESOURCE.CREATED_BY</code>. 「createdBy」- 创建人
     */
    public String getCreatedBy();

    /**
     * Setter for <code>ZDB.S_RESOURCE.UPDATED_AT</code>. 「updatedAt」- 更新时间
     */
    public ISResource setUpdatedAt(LocalDateTime value);

    /**
     * Getter for <code>ZDB.S_RESOURCE.UPDATED_AT</code>. 「updatedAt」- 更新时间
     */
    public LocalDateTime getUpdatedAt();

    /**
     * Setter for <code>ZDB.S_RESOURCE.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    public ISResource setUpdatedBy(String value);

    /**
     * Getter for <code>ZDB.S_RESOURCE.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    public String getUpdatedBy();

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    /**
     * Load data from another generated Record/POJO implementing the common
     * interface ISResource
     */
    public void from(ISResource from);

    /**
     * Copy data into another generated Record/POJO implementing the common
     * interface ISResource
     */
    public <E extends ISResource> E into(E into);

        @Override
        public default ISResource fromJson(io.vertx.core.json.JsonObject json) {
                setOrThrow(this::setKey,json::getString,"KEY","java.lang.String");
                setOrThrow(this::setCode,json::getString,"CODE","java.lang.String");
                setOrThrow(this::setName,json::getString,"NAME","java.lang.String");
                setOrThrow(this::setType,json::getString,"TYPE","java.lang.String");
                setOrThrow(this::setIdentifier,json::getString,"IDENTIFIER","java.lang.String");
                setOrThrow(this::setComment,json::getString,"COMMENT","java.lang.String");
                setOrThrow(this::setLevel,json::getInteger,"LEVEL","java.lang.Integer");
                setOrThrow(this::setModeRole,json::getString,"MODE_ROLE","java.lang.String");
                setOrThrow(this::setModeGroup,json::getString,"MODE_GROUP","java.lang.String");
                setOrThrow(this::setModeTree,json::getString,"MODE_TREE","java.lang.String");
                setOrThrow(this::setVirtual,json::getBoolean,"VIRTUAL","java.lang.Boolean");
                setOrThrow(this::setSeekSyntax,json::getString,"SEEK_SYNTAX","java.lang.String");
                setOrThrow(this::setSeekConfig,json::getString,"SEEK_CONFIG","java.lang.String");
                setOrThrow(this::setSeekComponent,json::getString,"SEEK_COMPONENT","java.lang.String");
                setOrThrow(this::setSigma,json::getString,"SIGMA","java.lang.String");
                setOrThrow(this::setCategory,json::getString,"CATEGORY","java.lang.String");
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
                json.put("CODE",getCode());
                json.put("NAME",getName());
                json.put("TYPE",getType());
                json.put("IDENTIFIER",getIdentifier());
                json.put("COMMENT",getComment());
                json.put("LEVEL",getLevel());
                json.put("MODE_ROLE",getModeRole());
                json.put("MODE_GROUP",getModeGroup());
                json.put("MODE_TREE",getModeTree());
                json.put("VIRTUAL",getVirtual());
                json.put("SEEK_SYNTAX",getSeekSyntax());
                json.put("SEEK_CONFIG",getSeekConfig());
                json.put("SEEK_COMPONENT",getSeekComponent());
                json.put("SIGMA",getSigma());
                json.put("CATEGORY",getCategory());
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
