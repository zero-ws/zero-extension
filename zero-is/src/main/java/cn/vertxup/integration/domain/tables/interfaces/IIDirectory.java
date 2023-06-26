/*
 * This file is generated by jOOQ.
 */
package cn.vertxup.integration.domain.tables.interfaces;


import io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo;

import java.io.Serializable;
import java.time.LocalDateTime;


import static io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo.*;
/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public interface IIDirectory extends VertxPojo, Serializable {

    /**
     * Setter for <code>DB_ETERNAL.I_DIRECTORY.KEY</code>. 「key」- 目录主键
     */
    public IIDirectory setKey(String value);

    /**
     * Getter for <code>DB_ETERNAL.I_DIRECTORY.KEY</code>. 「key」- 目录主键
     */
    public String getKey();

    /**
     * Setter for <code>DB_ETERNAL.I_DIRECTORY.NAME</code>. 「name」- 目录名称
     */
    public IIDirectory setName(String value);

    /**
     * Getter for <code>DB_ETERNAL.I_DIRECTORY.NAME</code>. 「name」- 目录名称
     */
    public String getName();

    /**
     * Setter for <code>DB_ETERNAL.I_DIRECTORY.CODE</code>. 「code」- 目录编号
     */
    public IIDirectory setCode(String value);

    /**
     * Getter for <code>DB_ETERNAL.I_DIRECTORY.CODE</code>. 「code」- 目录编号
     */
    public String getCode();

    /**
     * Setter for <code>DB_ETERNAL.I_DIRECTORY.STORE_PATH</code>. 「storePath」-
     * 目录相对路径
     */
    public IIDirectory setStorePath(String value);

    /**
     * Getter for <code>DB_ETERNAL.I_DIRECTORY.STORE_PATH</code>. 「storePath」-
     * 目录相对路径
     */
    public String getStorePath();

    /**
     * Setter for <code>DB_ETERNAL.I_DIRECTORY.LINKED_PATH</code>. 「linkedPath」-
     * 链接路径，type = LINK 时专用
     */
    public IIDirectory setLinkedPath(String value);

    /**
     * Getter for <code>DB_ETERNAL.I_DIRECTORY.LINKED_PATH</code>. 「linkedPath」-
     * 链接路径，type = LINK 时专用
     */
    public String getLinkedPath();

    /**
     * Setter for <code>DB_ETERNAL.I_DIRECTORY.PARENT_ID</code>. 「parentId」-
     * 父目录ID
     */
    public IIDirectory setParentId(String value);

    /**
     * Getter for <code>DB_ETERNAL.I_DIRECTORY.PARENT_ID</code>. 「parentId」-
     * 父目录ID
     */
    public String getParentId();

    /**
     * Setter for <code>DB_ETERNAL.I_DIRECTORY.CATEGORY</code>. 「category」-
     * 目录连接的类型树
     */
    public IIDirectory setCategory(String value);

    /**
     * Getter for <code>DB_ETERNAL.I_DIRECTORY.CATEGORY</code>. 「category」-
     * 目录连接的类型树
     */
    public String getCategory();

    /**
     * Setter for <code>DB_ETERNAL.I_DIRECTORY.TYPE</code>. 「type」-
     * 目录类型：INTEGRATION / STORE / LINK
     */
    public IIDirectory setType(String value);

    /**
     * Getter for <code>DB_ETERNAL.I_DIRECTORY.TYPE</code>. 「type」-
     * 目录类型：INTEGRATION / STORE / LINK
     */
    public String getType();

    /**
     * Setter for <code>DB_ETERNAL.I_DIRECTORY.OWNER</code>. 「owner」- 目录访问人
     */
    public IIDirectory setOwner(String value);

    /**
     * Getter for <code>DB_ETERNAL.I_DIRECTORY.OWNER</code>. 「owner」- 目录访问人
     */
    public String getOwner();

    /**
     * Setter for <code>DB_ETERNAL.I_DIRECTORY.INTEGRATION_ID</code>.
     * 「integrationId」- 该目录关联的 KIntegration，不关联则不转存
     */
    public IIDirectory setIntegrationId(String value);

    /**
     * Getter for <code>DB_ETERNAL.I_DIRECTORY.INTEGRATION_ID</code>.
     * 「integrationId」- 该目录关联的 KIntegration，不关联则不转存
     */
    public String getIntegrationId();

    /**
     * Setter for <code>DB_ETERNAL.I_DIRECTORY.RUN_COMPONENT</code>.
     * 「runComponent」- 目录执行组件，抓文件专用
     */
    public IIDirectory setRunComponent(String value);

    /**
     * Getter for <code>DB_ETERNAL.I_DIRECTORY.RUN_COMPONENT</code>.
     * 「runComponent」- 目录执行组件，抓文件专用
     */
    public String getRunComponent();

    /**
     * Setter for <code>DB_ETERNAL.I_DIRECTORY.VISIT</code>. 「visit」- 公有 / 私有
     */
    public IIDirectory setVisit(Boolean value);

    /**
     * Getter for <code>DB_ETERNAL.I_DIRECTORY.VISIT</code>. 「visit」- 公有 / 私有
     */
    public Boolean getVisit();

    /**
     * Setter for <code>DB_ETERNAL.I_DIRECTORY.VISIT_MODE</code>. 「visitMode」-
     * 目录模式：只读 / 可写，以后扩展为其他
     */
    public IIDirectory setVisitMode(String value);

    /**
     * Getter for <code>DB_ETERNAL.I_DIRECTORY.VISIT_MODE</code>. 「visitMode」-
     * 目录模式：只读 / 可写，以后扩展为其他
     */
    public String getVisitMode();

    /**
     * Setter for <code>DB_ETERNAL.I_DIRECTORY.VISIT_ROLE</code>. 「visitRole」-
     * 目录访问角色
     */
    public IIDirectory setVisitRole(String value);

    /**
     * Getter for <code>DB_ETERNAL.I_DIRECTORY.VISIT_ROLE</code>. 「visitRole」-
     * 目录访问角色
     */
    public String getVisitRole();

    /**
     * Setter for <code>DB_ETERNAL.I_DIRECTORY.VISIT_GROUP</code>. 「visitGroup」-
     * 目录访问组
     */
    public IIDirectory setVisitGroup(String value);

    /**
     * Getter for <code>DB_ETERNAL.I_DIRECTORY.VISIT_GROUP</code>. 「visitGroup」-
     * 目录访问组
     */
    public String getVisitGroup();

    /**
     * Setter for <code>DB_ETERNAL.I_DIRECTORY.VISIT_COMPONENT</code>.
     * 「visitComponent」- 目录访问控制专用组件
     */
    public IIDirectory setVisitComponent(String value);

    /**
     * Getter for <code>DB_ETERNAL.I_DIRECTORY.VISIT_COMPONENT</code>.
     * 「visitComponent」- 目录访问控制专用组件
     */
    public String getVisitComponent();

    /**
     * Setter for <code>DB_ETERNAL.I_DIRECTORY.SIGMA</code>. 「sigma」- 统一标识
     */
    public IIDirectory setSigma(String value);

    /**
     * Getter for <code>DB_ETERNAL.I_DIRECTORY.SIGMA</code>. 「sigma」- 统一标识
     */
    public String getSigma();

    /**
     * Setter for <code>DB_ETERNAL.I_DIRECTORY.LANGUAGE</code>. 「language」-
     * 使用的语言
     */
    public IIDirectory setLanguage(String value);

    /**
     * Getter for <code>DB_ETERNAL.I_DIRECTORY.LANGUAGE</code>. 「language」-
     * 使用的语言
     */
    public String getLanguage();

    /**
     * Setter for <code>DB_ETERNAL.I_DIRECTORY.ACTIVE</code>. 「active」- 是否启用
     */
    public IIDirectory setActive(Boolean value);

    /**
     * Getter for <code>DB_ETERNAL.I_DIRECTORY.ACTIVE</code>. 「active」- 是否启用
     */
    public Boolean getActive();

    /**
     * Setter for <code>DB_ETERNAL.I_DIRECTORY.METADATA</code>. 「metadata」-
     * 附加配置数据
     */
    public IIDirectory setMetadata(String value);

    /**
     * Getter for <code>DB_ETERNAL.I_DIRECTORY.METADATA</code>. 「metadata」-
     * 附加配置数据
     */
    public String getMetadata();

    /**
     * Setter for <code>DB_ETERNAL.I_DIRECTORY.CREATED_AT</code>. 「createdAt」-
     * 创建时间
     */
    public IIDirectory setCreatedAt(LocalDateTime value);

    /**
     * Getter for <code>DB_ETERNAL.I_DIRECTORY.CREATED_AT</code>. 「createdAt」-
     * 创建时间
     */
    public LocalDateTime getCreatedAt();

    /**
     * Setter for <code>DB_ETERNAL.I_DIRECTORY.CREATED_BY</code>. 「createdBy」-
     * 创建人
     */
    public IIDirectory setCreatedBy(String value);

    /**
     * Getter for <code>DB_ETERNAL.I_DIRECTORY.CREATED_BY</code>. 「createdBy」-
     * 创建人
     */
    public String getCreatedBy();

    /**
     * Setter for <code>DB_ETERNAL.I_DIRECTORY.UPDATED_AT</code>. 「updatedAt」-
     * 更新时间
     */
    public IIDirectory setUpdatedAt(LocalDateTime value);

    /**
     * Getter for <code>DB_ETERNAL.I_DIRECTORY.UPDATED_AT</code>. 「updatedAt」-
     * 更新时间
     */
    public LocalDateTime getUpdatedAt();

    /**
     * Setter for <code>DB_ETERNAL.I_DIRECTORY.UPDATED_BY</code>. 「updatedBy」-
     * 更新人
     */
    public IIDirectory setUpdatedBy(String value);

    /**
     * Getter for <code>DB_ETERNAL.I_DIRECTORY.UPDATED_BY</code>. 「updatedBy」-
     * 更新人
     */
    public String getUpdatedBy();

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    /**
     * Load data from another generated Record/POJO implementing the common
     * interface IIDirectory
     */
    public void from(IIDirectory from);

    /**
     * Copy data into another generated Record/POJO implementing the common
     * interface IIDirectory
     */
    public <E extends IIDirectory> E into(E into);

        @Override
        public default IIDirectory fromJson(io.vertx.core.json.JsonObject json) {
                setOrThrow(this::setKey,json::getString,"KEY","java.lang.String");
                setOrThrow(this::setName,json::getString,"NAME","java.lang.String");
                setOrThrow(this::setCode,json::getString,"CODE","java.lang.String");
                setOrThrow(this::setStorePath,json::getString,"STORE_PATH","java.lang.String");
                setOrThrow(this::setLinkedPath,json::getString,"LINKED_PATH","java.lang.String");
                setOrThrow(this::setParentId,json::getString,"PARENT_ID","java.lang.String");
                setOrThrow(this::setCategory,json::getString,"CATEGORY","java.lang.String");
                setOrThrow(this::setType,json::getString,"TYPE","java.lang.String");
                setOrThrow(this::setOwner,json::getString,"OWNER","java.lang.String");
                setOrThrow(this::setIntegrationId,json::getString,"INTEGRATION_ID","java.lang.String");
                setOrThrow(this::setRunComponent,json::getString,"RUN_COMPONENT","java.lang.String");
                setOrThrow(this::setVisit,json::getBoolean,"VISIT","java.lang.Boolean");
                setOrThrow(this::setVisitMode,json::getString,"VISIT_MODE","java.lang.String");
                setOrThrow(this::setVisitRole,json::getString,"VISIT_ROLE","java.lang.String");
                setOrThrow(this::setVisitGroup,json::getString,"VISIT_GROUP","java.lang.String");
                setOrThrow(this::setVisitComponent,json::getString,"VISIT_COMPONENT","java.lang.String");
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
                json.put("CODE",getCode());
                json.put("STORE_PATH",getStorePath());
                json.put("LINKED_PATH",getLinkedPath());
                json.put("PARENT_ID",getParentId());
                json.put("CATEGORY",getCategory());
                json.put("TYPE",getType());
                json.put("OWNER",getOwner());
                json.put("INTEGRATION_ID",getIntegrationId());
                json.put("RUN_COMPONENT",getRunComponent());
                json.put("VISIT",getVisit());
                json.put("VISIT_MODE",getVisitMode());
                json.put("VISIT_ROLE",getVisitRole());
                json.put("VISIT_GROUP",getVisitGroup());
                json.put("VISIT_COMPONENT",getVisitComponent());
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
