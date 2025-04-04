/*
 * This file is generated by jOOQ.
 */
package io.zerows.extension.runtime.report.domain.tables.interfaces;


import io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo;

import java.io.Serializable;
import java.time.LocalDateTime;


import static io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo.*;
/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public interface IKpFeature extends VertxPojo, Serializable {

    /**
     * Setter for <code>ZDB.KP_FEATURE.KEY</code>. 「key」- 特征主键
     */
    public IKpFeature setKey(String value);

    /**
     * Getter for <code>ZDB.KP_FEATURE.KEY</code>. 「key」- 特征主键
     */
    public String getKey();

    /**
     * Setter for <code>ZDB.KP_FEATURE.NAME</code>. 「name」- 特征名称
     */
    public IKpFeature setName(String value);

    /**
     * Getter for <code>ZDB.KP_FEATURE.NAME</code>. 「name」- 特征名称
     */
    public String getName();

    /**
     * Setter for <code>ZDB.KP_FEATURE.TYPE</code>. 「type」- 特征类型
     */
    public IKpFeature setType(String value);

    /**
     * Getter for <code>ZDB.KP_FEATURE.TYPE</code>. 「type」- 特征类型
     */
    public String getType();

    /**
     * Setter for <code>ZDB.KP_FEATURE.STATUS</code>. 「status」- 特征状态
     */
    public IKpFeature setStatus(String value);

    /**
     * Getter for <code>ZDB.KP_FEATURE.STATUS</code>. 「status」- 特征状态
     */
    public String getStatus();

    /**
     * Setter for <code>ZDB.KP_FEATURE.VALUE_PATH</code>. 「valuePath」- 特征名称
     */
    public IKpFeature setValuePath(String value);

    /**
     * Getter for <code>ZDB.KP_FEATURE.VALUE_PATH</code>. 「valuePath」- 特征名称
     */
    public String getValuePath();

    /**
     * Setter for <code>ZDB.KP_FEATURE.VALUE_CONFIG</code>. 「valueConfig」- 特征配置
     */
    public IKpFeature setValueConfig(String value);

    /**
     * Getter for <code>ZDB.KP_FEATURE.VALUE_CONFIG</code>. 「valueConfig」- 特征配置
     */
    public String getValueConfig();

    /**
     * Setter for <code>ZDB.KP_FEATURE.VALUE_DISPLAY</code>. 「valueDisplay」-
     * 特征显示名称
     */
    public IKpFeature setValueDisplay(String value);

    /**
     * Getter for <code>ZDB.KP_FEATURE.VALUE_DISPLAY</code>. 「valueDisplay」-
     * 特征显示名称
     */
    public String getValueDisplay();

    /**
     * Setter for <code>ZDB.KP_FEATURE.IN_CONFIG</code>. 「inConfig」- 特殊输出配置
     */
    public IKpFeature setInConfig(String value);

    /**
     * Getter for <code>ZDB.KP_FEATURE.IN_CONFIG</code>. 「inConfig」- 特殊输出配置
     */
    public String getInConfig();

    /**
     * Setter for <code>ZDB.KP_FEATURE.IN_COMPONENT</code>. 「inComponent」-
     * 特殊输出组件
     */
    public IKpFeature setInComponent(String value);

    /**
     * Getter for <code>ZDB.KP_FEATURE.IN_COMPONENT</code>. 「inComponent」-
     * 特殊输出组件
     */
    public String getInComponent();

    /**
     * Setter for <code>ZDB.KP_FEATURE.OUT_CONFIG</code>. 「outConfig」- 特殊输出配置
     */
    public IKpFeature setOutConfig(String value);

    /**
     * Getter for <code>ZDB.KP_FEATURE.OUT_CONFIG</code>. 「outConfig」- 特殊输出配置
     */
    public String getOutConfig();

    /**
     * Setter for <code>ZDB.KP_FEATURE.OUT_COMPONENT</code>. 「outComponent」-
     * 特殊输出组件
     */
    public IKpFeature setOutComponent(String value);

    /**
     * Getter for <code>ZDB.KP_FEATURE.OUT_COMPONENT</code>. 「outComponent」-
     * 特殊输出组件
     */
    public String getOutComponent();

    /**
     * Setter for <code>ZDB.KP_FEATURE.REPORT_ID</code>. 「reportId」- 关联报表ID
     */
    public IKpFeature setReportId(String value);

    /**
     * Getter for <code>ZDB.KP_FEATURE.REPORT_ID</code>. 「reportId」- 关联报表ID
     */
    public String getReportId();

    /**
     * Setter for <code>ZDB.KP_FEATURE.ACTIVE</code>. 「active」- 是否启用
     */
    public IKpFeature setActive(Boolean value);

    /**
     * Getter for <code>ZDB.KP_FEATURE.ACTIVE</code>. 「active」- 是否启用
     */
    public Boolean getActive();

    /**
     * Setter for <code>ZDB.KP_FEATURE.SIGMA</code>. 「sigma」- 统一标识
     */
    public IKpFeature setSigma(String value);

    /**
     * Getter for <code>ZDB.KP_FEATURE.SIGMA</code>. 「sigma」- 统一标识
     */
    public String getSigma();

    /**
     * Setter for <code>ZDB.KP_FEATURE.METADATA</code>. 「metadata」- 附加配置
     */
    public IKpFeature setMetadata(String value);

    /**
     * Getter for <code>ZDB.KP_FEATURE.METADATA</code>. 「metadata」- 附加配置
     */
    public String getMetadata();

    /**
     * Setter for <code>ZDB.KP_FEATURE.LANGUAGE</code>. 「language」- 使用的语言
     */
    public IKpFeature setLanguage(String value);

    /**
     * Getter for <code>ZDB.KP_FEATURE.LANGUAGE</code>. 「language」- 使用的语言
     */
    public String getLanguage();

    /**
     * Setter for <code>ZDB.KP_FEATURE.CREATED_AT</code>. 「createdAt」- 创建时间
     */
    public IKpFeature setCreatedAt(LocalDateTime value);

    /**
     * Getter for <code>ZDB.KP_FEATURE.CREATED_AT</code>. 「createdAt」- 创建时间
     */
    public LocalDateTime getCreatedAt();

    /**
     * Setter for <code>ZDB.KP_FEATURE.CREATED_BY</code>. 「createdBy」- 创建人
     */
    public IKpFeature setCreatedBy(String value);

    /**
     * Getter for <code>ZDB.KP_FEATURE.CREATED_BY</code>. 「createdBy」- 创建人
     */
    public String getCreatedBy();

    /**
     * Setter for <code>ZDB.KP_FEATURE.UPDATED_AT</code>. 「updatedAt」- 更新时间
     */
    public IKpFeature setUpdatedAt(LocalDateTime value);

    /**
     * Getter for <code>ZDB.KP_FEATURE.UPDATED_AT</code>. 「updatedAt」- 更新时间
     */
    public LocalDateTime getUpdatedAt();

    /**
     * Setter for <code>ZDB.KP_FEATURE.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    public IKpFeature setUpdatedBy(String value);

    /**
     * Getter for <code>ZDB.KP_FEATURE.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    public String getUpdatedBy();

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    /**
     * Load data from another generated Record/POJO implementing the common
     * interface IKpFeature
     */
    public void from(IKpFeature from);

    /**
     * Copy data into another generated Record/POJO implementing the common
     * interface IKpFeature
     */
    public <E extends IKpFeature> E into(E into);

        @Override
        public default IKpFeature fromJson(io.vertx.core.json.JsonObject json) {
                setOrThrow(this::setKey,json::getString,"KEY","java.lang.String");
                setOrThrow(this::setName,json::getString,"NAME","java.lang.String");
                setOrThrow(this::setType,json::getString,"TYPE","java.lang.String");
                setOrThrow(this::setStatus,json::getString,"STATUS","java.lang.String");
                setOrThrow(this::setValuePath,json::getString,"VALUE_PATH","java.lang.String");
                setOrThrow(this::setValueConfig,json::getString,"VALUE_CONFIG","java.lang.String");
                setOrThrow(this::setValueDisplay,json::getString,"VALUE_DISPLAY","java.lang.String");
                setOrThrow(this::setInConfig,json::getString,"IN_CONFIG","java.lang.String");
                setOrThrow(this::setInComponent,json::getString,"IN_COMPONENT","java.lang.String");
                setOrThrow(this::setOutConfig,json::getString,"OUT_CONFIG","java.lang.String");
                setOrThrow(this::setOutComponent,json::getString,"OUT_COMPONENT","java.lang.String");
                setOrThrow(this::setReportId,json::getString,"REPORT_ID","java.lang.String");
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
                json.put("TYPE",getType());
                json.put("STATUS",getStatus());
                json.put("VALUE_PATH",getValuePath());
                json.put("VALUE_CONFIG",getValueConfig());
                json.put("VALUE_DISPLAY",getValueDisplay());
                json.put("IN_CONFIG",getInConfig());
                json.put("IN_COMPONENT",getInComponent());
                json.put("OUT_CONFIG",getOutConfig());
                json.put("OUT_COMPONENT",getOutComponent());
                json.put("REPORT_ID",getReportId());
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
