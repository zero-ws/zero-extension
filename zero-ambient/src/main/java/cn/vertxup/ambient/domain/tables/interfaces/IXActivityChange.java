/*
 * This file is generated by jOOQ.
 */
package cn.vertxup.ambient.domain.tables.interfaces;


import io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo;

import java.io.Serializable;
import java.time.LocalDateTime;


import static io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo.*;
/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public interface IXActivityChange extends VertxPojo, Serializable {

    /**
     * Setter for <code>ZDB.X_ACTIVITY_CHANGE.KEY</code>. 「key」- 操作行为主键
     */
    public IXActivityChange setKey(String value);

    /**
     * Getter for <code>ZDB.X_ACTIVITY_CHANGE.KEY</code>. 「key」- 操作行为主键
     */
    public String getKey();

    /**
     * Setter for <code>ZDB.X_ACTIVITY_CHANGE.ACTIVITY_ID</code>. 「activityId」-
     * 关联的操作ID
     */
    public IXActivityChange setActivityId(String value);

    /**
     * Getter for <code>ZDB.X_ACTIVITY_CHANGE.ACTIVITY_ID</code>. 「activityId」-
     * 关联的操作ID
     */
    public String getActivityId();

    /**
     * Setter for <code>ZDB.X_ACTIVITY_CHANGE.TYPE</code>. 「type」- 字段变更类型：ADD |
     * DELETE | UPDATE 三种
     */
    public IXActivityChange setType(String value);

    /**
     * Getter for <code>ZDB.X_ACTIVITY_CHANGE.TYPE</code>. 「type」- 字段变更类型：ADD |
     * DELETE | UPDATE 三种
     */
    public String getType();

    /**
     * Setter for <code>ZDB.X_ACTIVITY_CHANGE.STATUS</code>. 「status」-
     * 待确认变更状态：CONFIRMED | PENDING
     */
    public IXActivityChange setStatus(String value);

    /**
     * Getter for <code>ZDB.X_ACTIVITY_CHANGE.STATUS</code>. 「status」-
     * 待确认变更状态：CONFIRMED | PENDING
     */
    public String getStatus();

    /**
     * Setter for <code>ZDB.X_ACTIVITY_CHANGE.FIELD_NAME</code>. 「fieldName」-
     * 如果是变更记录则需要生成变更日志
     */
    public IXActivityChange setFieldName(String value);

    /**
     * Getter for <code>ZDB.X_ACTIVITY_CHANGE.FIELD_NAME</code>. 「fieldName」-
     * 如果是变更记录则需要生成变更日志
     */
    public String getFieldName();

    /**
     * Setter for <code>ZDB.X_ACTIVITY_CHANGE.FIELD_ALIAS</code>. 「fieldAlias」-
     * 字段对应的别名
     */
    public IXActivityChange setFieldAlias(String value);

    /**
     * Getter for <code>ZDB.X_ACTIVITY_CHANGE.FIELD_ALIAS</code>. 「fieldAlias」-
     * 字段对应的别名
     */
    public String getFieldAlias();

    /**
     * Setter for <code>ZDB.X_ACTIVITY_CHANGE.FIELD_TYPE</code>. 「fieldType」-
     * 变更字段的数据类型，直接从模型定义中读取
     */
    public IXActivityChange setFieldType(String value);

    /**
     * Getter for <code>ZDB.X_ACTIVITY_CHANGE.FIELD_TYPE</code>. 「fieldType」-
     * 变更字段的数据类型，直接从模型定义中读取
     */
    public String getFieldType();

    /**
     * Setter for <code>ZDB.X_ACTIVITY_CHANGE.VALUE_OLD</code>. 「valueOld」- 旧值
     */
    public IXActivityChange setValueOld(String value);

    /**
     * Getter for <code>ZDB.X_ACTIVITY_CHANGE.VALUE_OLD</code>. 「valueOld」- 旧值
     */
    public String getValueOld();

    /**
     * Setter for <code>ZDB.X_ACTIVITY_CHANGE.VALUE_NEW</code>. 「valueNew」- 新值
     */
    public IXActivityChange setValueNew(String value);

    /**
     * Getter for <code>ZDB.X_ACTIVITY_CHANGE.VALUE_NEW</code>. 「valueNew」- 新值
     */
    public String getValueNew();

    /**
     * Setter for <code>ZDB.X_ACTIVITY_CHANGE.SIGMA</code>. 「sigma」- 用户组绑定的统一标识
     */
    public IXActivityChange setSigma(String value);

    /**
     * Getter for <code>ZDB.X_ACTIVITY_CHANGE.SIGMA</code>. 「sigma」- 用户组绑定的统一标识
     */
    public String getSigma();

    /**
     * Setter for <code>ZDB.X_ACTIVITY_CHANGE.LANGUAGE</code>. 「language」- 使用的语言
     */
    public IXActivityChange setLanguage(String value);

    /**
     * Getter for <code>ZDB.X_ACTIVITY_CHANGE.LANGUAGE</code>. 「language」- 使用的语言
     */
    public String getLanguage();

    /**
     * Setter for <code>ZDB.X_ACTIVITY_CHANGE.ACTIVE</code>. 「active」- 是否启用
     */
    public IXActivityChange setActive(Boolean value);

    /**
     * Getter for <code>ZDB.X_ACTIVITY_CHANGE.ACTIVE</code>. 「active」- 是否启用
     */
    public Boolean getActive();

    /**
     * Setter for <code>ZDB.X_ACTIVITY_CHANGE.METADATA</code>. 「metadata」-
     * 附加配置数据
     */
    public IXActivityChange setMetadata(String value);

    /**
     * Getter for <code>ZDB.X_ACTIVITY_CHANGE.METADATA</code>. 「metadata」-
     * 附加配置数据
     */
    public String getMetadata();

    /**
     * Setter for <code>ZDB.X_ACTIVITY_CHANGE.CREATED_AT</code>. 「createdAt」-
     * 创建时间
     */
    public IXActivityChange setCreatedAt(LocalDateTime value);

    /**
     * Getter for <code>ZDB.X_ACTIVITY_CHANGE.CREATED_AT</code>. 「createdAt」-
     * 创建时间
     */
    public LocalDateTime getCreatedAt();

    /**
     * Setter for <code>ZDB.X_ACTIVITY_CHANGE.CREATED_BY</code>. 「createdBy」-
     * 创建人
     */
    public IXActivityChange setCreatedBy(String value);

    /**
     * Getter for <code>ZDB.X_ACTIVITY_CHANGE.CREATED_BY</code>. 「createdBy」-
     * 创建人
     */
    public String getCreatedBy();

    /**
     * Setter for <code>ZDB.X_ACTIVITY_CHANGE.UPDATED_AT</code>. 「updatedAt」-
     * 更新时间
     */
    public IXActivityChange setUpdatedAt(LocalDateTime value);

    /**
     * Getter for <code>ZDB.X_ACTIVITY_CHANGE.UPDATED_AT</code>. 「updatedAt」-
     * 更新时间
     */
    public LocalDateTime getUpdatedAt();

    /**
     * Setter for <code>ZDB.X_ACTIVITY_CHANGE.UPDATED_BY</code>. 「updatedBy」-
     * 更新人
     */
    public IXActivityChange setUpdatedBy(String value);

    /**
     * Getter for <code>ZDB.X_ACTIVITY_CHANGE.UPDATED_BY</code>. 「updatedBy」-
     * 更新人
     */
    public String getUpdatedBy();

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    /**
     * Load data from another generated Record/POJO implementing the common
     * interface IXActivityChange
     */
    public void from(IXActivityChange from);

    /**
     * Copy data into another generated Record/POJO implementing the common
     * interface IXActivityChange
     */
    public <E extends IXActivityChange> E into(E into);

        @Override
        public default IXActivityChange fromJson(io.vertx.core.json.JsonObject json) {
                setOrThrow(this::setKey,json::getString,"KEY","java.lang.String");
                setOrThrow(this::setActivityId,json::getString,"ACTIVITY_ID","java.lang.String");
                setOrThrow(this::setType,json::getString,"TYPE","java.lang.String");
                setOrThrow(this::setStatus,json::getString,"STATUS","java.lang.String");
                setOrThrow(this::setFieldName,json::getString,"FIELD_NAME","java.lang.String");
                setOrThrow(this::setFieldAlias,json::getString,"FIELD_ALIAS","java.lang.String");
                setOrThrow(this::setFieldType,json::getString,"FIELD_TYPE","java.lang.String");
                setOrThrow(this::setValueOld,json::getString,"VALUE_OLD","java.lang.String");
                setOrThrow(this::setValueNew,json::getString,"VALUE_NEW","java.lang.String");
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
                json.put("ACTIVITY_ID",getActivityId());
                json.put("TYPE",getType());
                json.put("STATUS",getStatus());
                json.put("FIELD_NAME",getFieldName());
                json.put("FIELD_ALIAS",getFieldAlias());
                json.put("FIELD_TYPE",getFieldType());
                json.put("VALUE_OLD",getValueOld());
                json.put("VALUE_NEW",getValueNew());
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
