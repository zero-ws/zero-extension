/*
 * This file is generated by jOOQ.
 */
package io.zerows.extension.runtime.report.domain.tables.pojos;


import io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo;
import io.zerows.extension.runtime.report.domain.tables.interfaces.IKpReport;

import java.time.LocalDateTime;


import static io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo.*;
/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class KpReport implements VertxPojo, IKpReport {

    private static final long serialVersionUID = 1L;

    private String key;
    private String name;
    private String code;
    private String status;
    private String title;
    private String reportParam;
    private String reportConfig;
    private String reportBy;
    private LocalDateTime reportAt;
    private String dataSetId;
    private String dataTplId;
    private String appId;
    private Boolean active;
    private String sigma;
    private String metadata;
    private String language;
    private LocalDateTime createdAt;
    private String createdBy;
    private LocalDateTime updatedAt;
    private String updatedBy;

    public KpReport() {}

    public KpReport(IKpReport value) {
        this.key = value.getKey();
        this.name = value.getName();
        this.code = value.getCode();
        this.status = value.getStatus();
        this.title = value.getTitle();
        this.reportParam = value.getReportParam();
        this.reportConfig = value.getReportConfig();
        this.reportBy = value.getReportBy();
        this.reportAt = value.getReportAt();
        this.dataSetId = value.getDataSetId();
        this.dataTplId = value.getDataTplId();
        this.appId = value.getAppId();
        this.active = value.getActive();
        this.sigma = value.getSigma();
        this.metadata = value.getMetadata();
        this.language = value.getLanguage();
        this.createdAt = value.getCreatedAt();
        this.createdBy = value.getCreatedBy();
        this.updatedAt = value.getUpdatedAt();
        this.updatedBy = value.getUpdatedBy();
    }

    public KpReport(
        String key,
        String name,
        String code,
        String status,
        String title,
        String reportParam,
        String reportConfig,
        String reportBy,
        LocalDateTime reportAt,
        String dataSetId,
        String dataTplId,
        String appId,
        Boolean active,
        String sigma,
        String metadata,
        String language,
        LocalDateTime createdAt,
        String createdBy,
        LocalDateTime updatedAt,
        String updatedBy
    ) {
        this.key = key;
        this.name = name;
        this.code = code;
        this.status = status;
        this.title = title;
        this.reportParam = reportParam;
        this.reportConfig = reportConfig;
        this.reportBy = reportBy;
        this.reportAt = reportAt;
        this.dataSetId = dataSetId;
        this.dataTplId = dataTplId;
        this.appId = appId;
        this.active = active;
        this.sigma = sigma;
        this.metadata = metadata;
        this.language = language;
        this.createdAt = createdAt;
        this.createdBy = createdBy;
        this.updatedAt = updatedAt;
        this.updatedBy = updatedBy;
    }

        public KpReport(io.vertx.core.json.JsonObject json) {
                this();
                fromJson(json);
        }

    /**
     * Getter for <code>ZDB.KP_REPORT.KEY</code>. 「key」- 报表主键
     */
    @Override
    public String getKey() {
        return this.key;
    }

    /**
     * Setter for <code>ZDB.KP_REPORT.KEY</code>. 「key」- 报表主键
     */
    @Override
    public KpReport setKey(String key) {
        this.key = key;
        return this;
    }

    /**
     * Getter for <code>ZDB.KP_REPORT.NAME</code>. 「name」- 表表名称
     */
    @Override
    public String getName() {
        return this.name;
    }

    /**
     * Setter for <code>ZDB.KP_REPORT.NAME</code>. 「name」- 表表名称
     */
    @Override
    public KpReport setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Getter for <code>ZDB.KP_REPORT.CODE</code>. 「code」- 报表编码
     */
    @Override
    public String getCode() {
        return this.code;
    }

    /**
     * Setter for <code>ZDB.KP_REPORT.CODE</code>. 「code」- 报表编码
     */
    @Override
    public KpReport setCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * Getter for <code>ZDB.KP_REPORT.STATUS</code>. 「status」- 报表状态
     */
    @Override
    public String getStatus() {
        return this.status;
    }

    /**
     * Setter for <code>ZDB.KP_REPORT.STATUS</code>. 「status」- 报表状态
     */
    @Override
    public KpReport setStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * Getter for <code>ZDB.KP_REPORT.TITLE</code>. 「title」- 报表标题
     */
    @Override
    public String getTitle() {
        return this.title;
    }

    /**
     * Setter for <code>ZDB.KP_REPORT.TITLE</code>. 「title」- 报表标题
     */
    @Override
    public KpReport setTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * Getter for <code>ZDB.KP_REPORT.REPORT_PARAM</code>. 「reportParam」- 报表参数配置
     */
    @Override
    public String getReportParam() {
        return this.reportParam;
    }

    /**
     * Setter for <code>ZDB.KP_REPORT.REPORT_PARAM</code>. 「reportParam」- 报表参数配置
     */
    @Override
    public KpReport setReportParam(String reportParam) {
        this.reportParam = reportParam;
        return this;
    }

    /**
     * Getter for <code>ZDB.KP_REPORT.REPORT_CONFIG</code>. 「reportConfig」-
     * 主表基础配置
     */
    @Override
    public String getReportConfig() {
        return this.reportConfig;
    }

    /**
     * Setter for <code>ZDB.KP_REPORT.REPORT_CONFIG</code>. 「reportConfig」-
     * 主表基础配置
     */
    @Override
    public KpReport setReportConfig(String reportConfig) {
        this.reportConfig = reportConfig;
        return this;
    }

    /**
     * Getter for <code>ZDB.KP_REPORT.REPORT_BY</code>. 「reportBy」- 模板创建人
     */
    @Override
    public String getReportBy() {
        return this.reportBy;
    }

    /**
     * Setter for <code>ZDB.KP_REPORT.REPORT_BY</code>. 「reportBy」- 模板创建人
     */
    @Override
    public KpReport setReportBy(String reportBy) {
        this.reportBy = reportBy;
        return this;
    }

    /**
     * Getter for <code>ZDB.KP_REPORT.REPORT_AT</code>. 「reportAt」- 模板创建时间
     */
    @Override
    public LocalDateTime getReportAt() {
        return this.reportAt;
    }

    /**
     * Setter for <code>ZDB.KP_REPORT.REPORT_AT</code>. 「reportAt」- 模板创建时间
     */
    @Override
    public KpReport setReportAt(LocalDateTime reportAt) {
        this.reportAt = reportAt;
        return this;
    }

    /**
     * Getter for <code>ZDB.KP_REPORT.DATA_SET_ID</code>. 「dataSetId」- 数据源ID
     */
    @Override
    public String getDataSetId() {
        return this.dataSetId;
    }

    /**
     * Setter for <code>ZDB.KP_REPORT.DATA_SET_ID</code>. 「dataSetId」- 数据源ID
     */
    @Override
    public KpReport setDataSetId(String dataSetId) {
        this.dataSetId = dataSetId;
        return this;
    }

    /**
     * Getter for <code>ZDB.KP_REPORT.DATA_TPL_ID</code>. 「dataTplId」- 关联报表模板
     */
    @Override
    public String getDataTplId() {
        return this.dataTplId;
    }

    /**
     * Setter for <code>ZDB.KP_REPORT.DATA_TPL_ID</code>. 「dataTplId」- 关联报表模板
     */
    @Override
    public KpReport setDataTplId(String dataTplId) {
        this.dataTplId = dataTplId;
        return this;
    }

    /**
     * Getter for <code>ZDB.KP_REPORT.APP_ID</code>. 「appId」- 应用数据
     */
    @Override
    public String getAppId() {
        return this.appId;
    }

    /**
     * Setter for <code>ZDB.KP_REPORT.APP_ID</code>. 「appId」- 应用数据
     */
    @Override
    public KpReport setAppId(String appId) {
        this.appId = appId;
        return this;
    }

    /**
     * Getter for <code>ZDB.KP_REPORT.ACTIVE</code>. 「active」- 是否启用
     */
    @Override
    public Boolean getActive() {
        return this.active;
    }

    /**
     * Setter for <code>ZDB.KP_REPORT.ACTIVE</code>. 「active」- 是否启用
     */
    @Override
    public KpReport setActive(Boolean active) {
        this.active = active;
        return this;
    }

    /**
     * Getter for <code>ZDB.KP_REPORT.SIGMA</code>. 「sigma」- 统一标识
     */
    @Override
    public String getSigma() {
        return this.sigma;
    }

    /**
     * Setter for <code>ZDB.KP_REPORT.SIGMA</code>. 「sigma」- 统一标识
     */
    @Override
    public KpReport setSigma(String sigma) {
        this.sigma = sigma;
        return this;
    }

    /**
     * Getter for <code>ZDB.KP_REPORT.METADATA</code>. 「metadata」- 附加配置
     */
    @Override
    public String getMetadata() {
        return this.metadata;
    }

    /**
     * Setter for <code>ZDB.KP_REPORT.METADATA</code>. 「metadata」- 附加配置
     */
    @Override
    public KpReport setMetadata(String metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * Getter for <code>ZDB.KP_REPORT.LANGUAGE</code>. 「language」- 使用的语言
     */
    @Override
    public String getLanguage() {
        return this.language;
    }

    /**
     * Setter for <code>ZDB.KP_REPORT.LANGUAGE</code>. 「language」- 使用的语言
     */
    @Override
    public KpReport setLanguage(String language) {
        this.language = language;
        return this;
    }

    /**
     * Getter for <code>ZDB.KP_REPORT.CREATED_AT</code>. 「createdAt」- 创建时间
     */
    @Override
    public LocalDateTime getCreatedAt() {
        return this.createdAt;
    }

    /**
     * Setter for <code>ZDB.KP_REPORT.CREATED_AT</code>. 「createdAt」- 创建时间
     */
    @Override
    public KpReport setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * Getter for <code>ZDB.KP_REPORT.CREATED_BY</code>. 「createdBy」- 创建人
     */
    @Override
    public String getCreatedBy() {
        return this.createdBy;
    }

    /**
     * Setter for <code>ZDB.KP_REPORT.CREATED_BY</code>. 「createdBy」- 创建人
     */
    @Override
    public KpReport setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    /**
     * Getter for <code>ZDB.KP_REPORT.UPDATED_AT</code>. 「updatedAt」- 更新时间
     */
    @Override
    public LocalDateTime getUpdatedAt() {
        return this.updatedAt;
    }

    /**
     * Setter for <code>ZDB.KP_REPORT.UPDATED_AT</code>. 「updatedAt」- 更新时间
     */
    @Override
    public KpReport setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * Getter for <code>ZDB.KP_REPORT.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    @Override
    public String getUpdatedBy() {
        return this.updatedBy;
    }

    /**
     * Setter for <code>ZDB.KP_REPORT.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    @Override
    public KpReport setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
        return this;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final KpReport other = (KpReport) obj;
        if (this.key == null) {
            if (other.key != null)
                return false;
        }
        else if (!this.key.equals(other.key))
            return false;
        if (this.name == null) {
            if (other.name != null)
                return false;
        }
        else if (!this.name.equals(other.name))
            return false;
        if (this.code == null) {
            if (other.code != null)
                return false;
        }
        else if (!this.code.equals(other.code))
            return false;
        if (this.status == null) {
            if (other.status != null)
                return false;
        }
        else if (!this.status.equals(other.status))
            return false;
        if (this.title == null) {
            if (other.title != null)
                return false;
        }
        else if (!this.title.equals(other.title))
            return false;
        if (this.reportParam == null) {
            if (other.reportParam != null)
                return false;
        }
        else if (!this.reportParam.equals(other.reportParam))
            return false;
        if (this.reportConfig == null) {
            if (other.reportConfig != null)
                return false;
        }
        else if (!this.reportConfig.equals(other.reportConfig))
            return false;
        if (this.reportBy == null) {
            if (other.reportBy != null)
                return false;
        }
        else if (!this.reportBy.equals(other.reportBy))
            return false;
        if (this.reportAt == null) {
            if (other.reportAt != null)
                return false;
        }
        else if (!this.reportAt.equals(other.reportAt))
            return false;
        if (this.dataSetId == null) {
            if (other.dataSetId != null)
                return false;
        }
        else if (!this.dataSetId.equals(other.dataSetId))
            return false;
        if (this.dataTplId == null) {
            if (other.dataTplId != null)
                return false;
        }
        else if (!this.dataTplId.equals(other.dataTplId))
            return false;
        if (this.appId == null) {
            if (other.appId != null)
                return false;
        }
        else if (!this.appId.equals(other.appId))
            return false;
        if (this.active == null) {
            if (other.active != null)
                return false;
        }
        else if (!this.active.equals(other.active))
            return false;
        if (this.sigma == null) {
            if (other.sigma != null)
                return false;
        }
        else if (!this.sigma.equals(other.sigma))
            return false;
        if (this.metadata == null) {
            if (other.metadata != null)
                return false;
        }
        else if (!this.metadata.equals(other.metadata))
            return false;
        if (this.language == null) {
            if (other.language != null)
                return false;
        }
        else if (!this.language.equals(other.language))
            return false;
        if (this.createdAt == null) {
            if (other.createdAt != null)
                return false;
        }
        else if (!this.createdAt.equals(other.createdAt))
            return false;
        if (this.createdBy == null) {
            if (other.createdBy != null)
                return false;
        }
        else if (!this.createdBy.equals(other.createdBy))
            return false;
        if (this.updatedAt == null) {
            if (other.updatedAt != null)
                return false;
        }
        else if (!this.updatedAt.equals(other.updatedAt))
            return false;
        if (this.updatedBy == null) {
            if (other.updatedBy != null)
                return false;
        }
        else if (!this.updatedBy.equals(other.updatedBy))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.key == null) ? 0 : this.key.hashCode());
        result = prime * result + ((this.name == null) ? 0 : this.name.hashCode());
        result = prime * result + ((this.code == null) ? 0 : this.code.hashCode());
        result = prime * result + ((this.status == null) ? 0 : this.status.hashCode());
        result = prime * result + ((this.title == null) ? 0 : this.title.hashCode());
        result = prime * result + ((this.reportParam == null) ? 0 : this.reportParam.hashCode());
        result = prime * result + ((this.reportConfig == null) ? 0 : this.reportConfig.hashCode());
        result = prime * result + ((this.reportBy == null) ? 0 : this.reportBy.hashCode());
        result = prime * result + ((this.reportAt == null) ? 0 : this.reportAt.hashCode());
        result = prime * result + ((this.dataSetId == null) ? 0 : this.dataSetId.hashCode());
        result = prime * result + ((this.dataTplId == null) ? 0 : this.dataTplId.hashCode());
        result = prime * result + ((this.appId == null) ? 0 : this.appId.hashCode());
        result = prime * result + ((this.active == null) ? 0 : this.active.hashCode());
        result = prime * result + ((this.sigma == null) ? 0 : this.sigma.hashCode());
        result = prime * result + ((this.metadata == null) ? 0 : this.metadata.hashCode());
        result = prime * result + ((this.language == null) ? 0 : this.language.hashCode());
        result = prime * result + ((this.createdAt == null) ? 0 : this.createdAt.hashCode());
        result = prime * result + ((this.createdBy == null) ? 0 : this.createdBy.hashCode());
        result = prime * result + ((this.updatedAt == null) ? 0 : this.updatedAt.hashCode());
        result = prime * result + ((this.updatedBy == null) ? 0 : this.updatedBy.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("KpReport (");

        sb.append(key);
        sb.append(", ").append(name);
        sb.append(", ").append(code);
        sb.append(", ").append(status);
        sb.append(", ").append(title);
        sb.append(", ").append(reportParam);
        sb.append(", ").append(reportConfig);
        sb.append(", ").append(reportBy);
        sb.append(", ").append(reportAt);
        sb.append(", ").append(dataSetId);
        sb.append(", ").append(dataTplId);
        sb.append(", ").append(appId);
        sb.append(", ").append(active);
        sb.append(", ").append(sigma);
        sb.append(", ").append(metadata);
        sb.append(", ").append(language);
        sb.append(", ").append(createdAt);
        sb.append(", ").append(createdBy);
        sb.append(", ").append(updatedAt);
        sb.append(", ").append(updatedBy);

        sb.append(")");
        return sb.toString();
    }

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    @Override
    public void from(IKpReport from) {
        setKey(from.getKey());
        setName(from.getName());
        setCode(from.getCode());
        setStatus(from.getStatus());
        setTitle(from.getTitle());
        setReportParam(from.getReportParam());
        setReportConfig(from.getReportConfig());
        setReportBy(from.getReportBy());
        setReportAt(from.getReportAt());
        setDataSetId(from.getDataSetId());
        setDataTplId(from.getDataTplId());
        setAppId(from.getAppId());
        setActive(from.getActive());
        setSigma(from.getSigma());
        setMetadata(from.getMetadata());
        setLanguage(from.getLanguage());
        setCreatedAt(from.getCreatedAt());
        setCreatedBy(from.getCreatedBy());
        setUpdatedAt(from.getUpdatedAt());
        setUpdatedBy(from.getUpdatedBy());
    }

    @Override
    public <E extends IKpReport> E into(E into) {
        into.from(this);
        return into;
    }
}
