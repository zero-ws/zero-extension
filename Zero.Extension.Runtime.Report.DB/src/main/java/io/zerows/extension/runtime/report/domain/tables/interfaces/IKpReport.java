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
public interface IKpReport extends VertxPojo, Serializable {

    /**
     * Setter for <code>ZDB.KP_REPORT.KEY</code>. 「key」- 报表主键
     */
    public IKpReport setKey(String value);

    /**
     * Getter for <code>ZDB.KP_REPORT.KEY</code>. 「key」- 报表主键
     */
    public String getKey();

    /**
     * Setter for <code>ZDB.KP_REPORT.NAME</code>. 「name」- 表表名称
     */
    public IKpReport setName(String value);

    /**
     * Getter for <code>ZDB.KP_REPORT.NAME</code>. 「name」- 表表名称
     */
    public String getName();

    /**
     * Setter for <code>ZDB.KP_REPORT.CODE</code>. 「code」- 报表编码
     */
    public IKpReport setCode(String value);

    /**
     * Getter for <code>ZDB.KP_REPORT.CODE</code>. 「code」- 报表编码
     */
    public String getCode();

    /**
     * Setter for <code>ZDB.KP_REPORT.STATUS</code>. 「status」- 报表状态
     */
    public IKpReport setStatus(String value);

    /**
     * Getter for <code>ZDB.KP_REPORT.STATUS</code>. 「status」- 报表状态
     */
    public String getStatus();

    /**
     * Setter for <code>ZDB.KP_REPORT.TITLE</code>. 「title」- 报表标题
     */
    public IKpReport setTitle(String value);

    /**
     * Getter for <code>ZDB.KP_REPORT.TITLE</code>. 「title」- 报表标题
     */
    public String getTitle();

    /**
     * Setter for <code>ZDB.KP_REPORT.REPORT_PARAM</code>. 「reportParam」- 报表参数配置
     */
    public IKpReport setReportParam(String value);

    /**
     * Getter for <code>ZDB.KP_REPORT.REPORT_PARAM</code>. 「reportParam」- 报表参数配置
     */
    public String getReportParam();

    /**
     * Setter for <code>ZDB.KP_REPORT.REPORT_CONFIG</code>. 「reportConfig」-
     * 主表基础配置
     */
    public IKpReport setReportConfig(String value);

    /**
     * Getter for <code>ZDB.KP_REPORT.REPORT_CONFIG</code>. 「reportConfig」-
     * 主表基础配置
     */
    public String getReportConfig();

    /**
     * Setter for <code>ZDB.KP_REPORT.REPORT_BY</code>. 「reportBy」- 模板创建人
     */
    public IKpReport setReportBy(String value);

    /**
     * Getter for <code>ZDB.KP_REPORT.REPORT_BY</code>. 「reportBy」- 模板创建人
     */
    public String getReportBy();

    /**
     * Setter for <code>ZDB.KP_REPORT.REPORT_AT</code>. 「reportAt」- 模板创建时间
     */
    public IKpReport setReportAt(LocalDateTime value);

    /**
     * Getter for <code>ZDB.KP_REPORT.REPORT_AT</code>. 「reportAt」- 模板创建时间
     */
    public LocalDateTime getReportAt();

    /**
     * Setter for <code>ZDB.KP_REPORT.DATA_SET_ID</code>. 「dataSetId」- 数据源ID
     */
    public IKpReport setDataSetId(String value);

    /**
     * Getter for <code>ZDB.KP_REPORT.DATA_SET_ID</code>. 「dataSetId」- 数据源ID
     */
    public String getDataSetId();

    /**
     * Setter for <code>ZDB.KP_REPORT.DATA_TPL_ID</code>. 「dataTplId」- 关联报表模板
     */
    public IKpReport setDataTplId(String value);

    /**
     * Getter for <code>ZDB.KP_REPORT.DATA_TPL_ID</code>. 「dataTplId」- 关联报表模板
     */
    public String getDataTplId();

    /**
     * Setter for <code>ZDB.KP_REPORT.APP_ID</code>. 「appId」- 应用数据
     */
    public IKpReport setAppId(String value);

    /**
     * Getter for <code>ZDB.KP_REPORT.APP_ID</code>. 「appId」- 应用数据
     */
    public String getAppId();

    /**
     * Setter for <code>ZDB.KP_REPORT.ACTIVE</code>. 「active」- 是否启用
     */
    public IKpReport setActive(Boolean value);

    /**
     * Getter for <code>ZDB.KP_REPORT.ACTIVE</code>. 「active」- 是否启用
     */
    public Boolean getActive();

    /**
     * Setter for <code>ZDB.KP_REPORT.SIGMA</code>. 「sigma」- 统一标识
     */
    public IKpReport setSigma(String value);

    /**
     * Getter for <code>ZDB.KP_REPORT.SIGMA</code>. 「sigma」- 统一标识
     */
    public String getSigma();

    /**
     * Setter for <code>ZDB.KP_REPORT.METADATA</code>. 「metadata」- 附加配置
     */
    public IKpReport setMetadata(String value);

    /**
     * Getter for <code>ZDB.KP_REPORT.METADATA</code>. 「metadata」- 附加配置
     */
    public String getMetadata();

    /**
     * Setter for <code>ZDB.KP_REPORT.LANGUAGE</code>. 「language」- 使用的语言
     */
    public IKpReport setLanguage(String value);

    /**
     * Getter for <code>ZDB.KP_REPORT.LANGUAGE</code>. 「language」- 使用的语言
     */
    public String getLanguage();

    /**
     * Setter for <code>ZDB.KP_REPORT.CREATED_AT</code>. 「createdAt」- 创建时间
     */
    public IKpReport setCreatedAt(LocalDateTime value);

    /**
     * Getter for <code>ZDB.KP_REPORT.CREATED_AT</code>. 「createdAt」- 创建时间
     */
    public LocalDateTime getCreatedAt();

    /**
     * Setter for <code>ZDB.KP_REPORT.CREATED_BY</code>. 「createdBy」- 创建人
     */
    public IKpReport setCreatedBy(String value);

    /**
     * Getter for <code>ZDB.KP_REPORT.CREATED_BY</code>. 「createdBy」- 创建人
     */
    public String getCreatedBy();

    /**
     * Setter for <code>ZDB.KP_REPORT.UPDATED_AT</code>. 「updatedAt」- 更新时间
     */
    public IKpReport setUpdatedAt(LocalDateTime value);

    /**
     * Getter for <code>ZDB.KP_REPORT.UPDATED_AT</code>. 「updatedAt」- 更新时间
     */
    public LocalDateTime getUpdatedAt();

    /**
     * Setter for <code>ZDB.KP_REPORT.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    public IKpReport setUpdatedBy(String value);

    /**
     * Getter for <code>ZDB.KP_REPORT.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    public String getUpdatedBy();

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    /**
     * Load data from another generated Record/POJO implementing the common
     * interface IKpReport
     */
    public void from(IKpReport from);

    /**
     * Copy data into another generated Record/POJO implementing the common
     * interface IKpReport
     */
    public <E extends IKpReport> E into(E into);

        @Override
        public default IKpReport fromJson(io.vertx.core.json.JsonObject json) {
                setOrThrow(this::setKey,json::getString,"KEY","java.lang.String");
                setOrThrow(this::setName,json::getString,"NAME","java.lang.String");
                setOrThrow(this::setCode,json::getString,"CODE","java.lang.String");
                setOrThrow(this::setStatus,json::getString,"STATUS","java.lang.String");
                setOrThrow(this::setTitle,json::getString,"TITLE","java.lang.String");
                setOrThrow(this::setReportParam,json::getString,"REPORT_PARAM","java.lang.String");
                setOrThrow(this::setReportConfig,json::getString,"REPORT_CONFIG","java.lang.String");
                setOrThrow(this::setReportBy,json::getString,"REPORT_BY","java.lang.String");
                setOrThrow(this::setReportAt,key -> {String s = json.getString(key); return s==null?null:java.time.LocalDateTime.parse(s);},"REPORT_AT","java.time.LocalDateTime");
                setOrThrow(this::setDataSetId,json::getString,"DATA_SET_ID","java.lang.String");
                setOrThrow(this::setDataTplId,json::getString,"DATA_TPL_ID","java.lang.String");
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
                json.put("CODE",getCode());
                json.put("STATUS",getStatus());
                json.put("TITLE",getTitle());
                json.put("REPORT_PARAM",getReportParam());
                json.put("REPORT_CONFIG",getReportConfig());
                json.put("REPORT_BY",getReportBy());
                json.put("REPORT_AT",getReportAt()==null?null:getReportAt().toString());
                json.put("DATA_SET_ID",getDataSetId());
                json.put("DATA_TPL_ID",getDataTplId());
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
