/*
 * This file is generated by jOOQ.
 */
package io.zerows.extension.runtime.report.domain.tables.pojos;


import io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo;
import io.zerows.extension.runtime.report.domain.tables.interfaces.IKpReportInstance;

import java.time.LocalDateTime;


import static io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo.*;
/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class KpReportInstance implements VertxPojo, IKpReportInstance {

    private static final long serialVersionUID = 1L;

    private String key;
    private String name;
    private String status;
    private String type;
    private String title;
    private String subtitle;
    private String extra;
    private String description;
    private String modeExpr;
    private String reportId;
    private String reportContent;
    private String reportData;
    private String reportBy;
    private LocalDateTime reportAt;
    private String refType;
    private String refId;
    private Boolean active;
    private String sigma;
    private String metadata;
    private String language;
    private LocalDateTime createdAt;
    private String createdBy;
    private LocalDateTime updatedAt;
    private String updatedBy;

    public KpReportInstance() {}

    public KpReportInstance(IKpReportInstance value) {
        this.key = value.getKey();
        this.name = value.getName();
        this.status = value.getStatus();
        this.type = value.getType();
        this.title = value.getTitle();
        this.subtitle = value.getSubtitle();
        this.extra = value.getExtra();
        this.description = value.getDescription();
        this.modeExpr = value.getModeExpr();
        this.reportId = value.getReportId();
        this.reportContent = value.getReportContent();
        this.reportData = value.getReportData();
        this.reportBy = value.getReportBy();
        this.reportAt = value.getReportAt();
        this.refType = value.getRefType();
        this.refId = value.getRefId();
        this.active = value.getActive();
        this.sigma = value.getSigma();
        this.metadata = value.getMetadata();
        this.language = value.getLanguage();
        this.createdAt = value.getCreatedAt();
        this.createdBy = value.getCreatedBy();
        this.updatedAt = value.getUpdatedAt();
        this.updatedBy = value.getUpdatedBy();
    }

    public KpReportInstance(
        String key,
        String name,
        String status,
        String type,
        String title,
        String subtitle,
        String extra,
        String description,
        String modeExpr,
        String reportId,
        String reportContent,
        String reportData,
        String reportBy,
        LocalDateTime reportAt,
        String refType,
        String refId,
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
        this.status = status;
        this.type = type;
        this.title = title;
        this.subtitle = subtitle;
        this.extra = extra;
        this.description = description;
        this.modeExpr = modeExpr;
        this.reportId = reportId;
        this.reportContent = reportContent;
        this.reportData = reportData;
        this.reportBy = reportBy;
        this.reportAt = reportAt;
        this.refType = refType;
        this.refId = refId;
        this.active = active;
        this.sigma = sigma;
        this.metadata = metadata;
        this.language = language;
        this.createdAt = createdAt;
        this.createdBy = createdBy;
        this.updatedAt = updatedAt;
        this.updatedBy = updatedBy;
    }

        public KpReportInstance(io.vertx.core.json.JsonObject json) {
                this();
                fromJson(json);
        }

    /**
     * Getter for <code>ZDB.KP_REPORT_INSTANCE.KEY</code>. 「key」- 报表主键
     */
    @Override
    public String getKey() {
        return this.key;
    }

    /**
     * Setter for <code>ZDB.KP_REPORT_INSTANCE.KEY</code>. 「key」- 报表主键
     */
    @Override
    public KpReportInstance setKey(String key) {
        this.key = key;
        return this;
    }

    /**
     * Getter for <code>ZDB.KP_REPORT_INSTANCE.NAME</code>. 「name」- 表表名称
     */
    @Override
    public String getName() {
        return this.name;
    }

    /**
     * Setter for <code>ZDB.KP_REPORT_INSTANCE.NAME</code>. 「name」- 表表名称
     */
    @Override
    public KpReportInstance setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Getter for <code>ZDB.KP_REPORT_INSTANCE.STATUS</code>. 「status」- 报表状态
     */
    @Override
    public String getStatus() {
        return this.status;
    }

    /**
     * Setter for <code>ZDB.KP_REPORT_INSTANCE.STATUS</code>. 「status」- 报表状态
     */
    @Override
    public KpReportInstance setStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * Getter for <code>ZDB.KP_REPORT_INSTANCE.TYPE</code>. 「type」- 报表类型
     */
    @Override
    public String getType() {
        return this.type;
    }

    /**
     * Setter for <code>ZDB.KP_REPORT_INSTANCE.TYPE</code>. 「type」- 报表类型
     */
    @Override
    public KpReportInstance setType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Getter for <code>ZDB.KP_REPORT_INSTANCE.TITLE</code>. 「title」- 报表标题
     */
    @Override
    public String getTitle() {
        return this.title;
    }

    /**
     * Setter for <code>ZDB.KP_REPORT_INSTANCE.TITLE</code>. 「title」- 报表标题
     */
    @Override
    public KpReportInstance setTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * Getter for <code>ZDB.KP_REPORT_INSTANCE.SUBTITLE</code>. 「subtitle」- 副标题
     */
    @Override
    public String getSubtitle() {
        return this.subtitle;
    }

    /**
     * Setter for <code>ZDB.KP_REPORT_INSTANCE.SUBTITLE</code>. 「subtitle」- 副标题
     */
    @Override
    public KpReportInstance setSubtitle(String subtitle) {
        this.subtitle = subtitle;
        return this;
    }

    /**
     * Getter for <code>ZDB.KP_REPORT_INSTANCE.EXTRA</code>. 「extra」- 额外信息
     */
    @Override
    public String getExtra() {
        return this.extra;
    }

    /**
     * Setter for <code>ZDB.KP_REPORT_INSTANCE.EXTRA</code>. 「extra」- 额外信息
     */
    @Override
    public KpReportInstance setExtra(String extra) {
        this.extra = extra;
        return this;
    }

    /**
     * Getter for <code>ZDB.KP_REPORT_INSTANCE.DESCRIPTION</code>.
     * 「description」- 报表描述
     */
    @Override
    public String getDescription() {
        return this.description;
    }

    /**
     * Setter for <code>ZDB.KP_REPORT_INSTANCE.DESCRIPTION</code>.
     * 「description」- 报表描述
     */
    @Override
    public KpReportInstance setDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Getter for <code>ZDB.KP_REPORT_INSTANCE.MODE_EXPR</code>. 「modeExpr」-
     * 表达式（和 type 绑定）
     */
    @Override
    public String getModeExpr() {
        return this.modeExpr;
    }

    /**
     * Setter for <code>ZDB.KP_REPORT_INSTANCE.MODE_EXPR</code>. 「modeExpr」-
     * 表达式（和 type 绑定）
     */
    @Override
    public KpReportInstance setModeExpr(String modeExpr) {
        this.modeExpr = modeExpr;
        return this;
    }

    /**
     * Getter for <code>ZDB.KP_REPORT_INSTANCE.REPORT_ID</code>. 「reportId」-
     * 关联报表ID
     */
    @Override
    public String getReportId() {
        return this.reportId;
    }

    /**
     * Setter for <code>ZDB.KP_REPORT_INSTANCE.REPORT_ID</code>. 「reportId」-
     * 关联报表ID
     */
    @Override
    public KpReportInstance setReportId(String reportId) {
        this.reportId = reportId;
        return this;
    }

    /**
     * Getter for <code>ZDB.KP_REPORT_INSTANCE.REPORT_CONTENT</code>.
     * 「reportContent」- 报表内容
     */
    @Override
    public String getReportContent() {
        return this.reportContent;
    }

    /**
     * Setter for <code>ZDB.KP_REPORT_INSTANCE.REPORT_CONTENT</code>.
     * 「reportContent」- 报表内容
     */
    @Override
    public KpReportInstance setReportContent(String reportContent) {
        this.reportContent = reportContent;
        return this;
    }

    /**
     * Getter for <code>ZDB.KP_REPORT_INSTANCE.REPORT_DATA</code>. 「reportData」-
     * 报表最终数据
     */
    @Override
    public String getReportData() {
        return this.reportData;
    }

    /**
     * Setter for <code>ZDB.KP_REPORT_INSTANCE.REPORT_DATA</code>. 「reportData」-
     * 报表最终数据
     */
    @Override
    public KpReportInstance setReportData(String reportData) {
        this.reportData = reportData;
        return this;
    }

    /**
     * Getter for <code>ZDB.KP_REPORT_INSTANCE.REPORT_BY</code>. 「reportBy」- 报表人
     */
    @Override
    public String getReportBy() {
        return this.reportBy;
    }

    /**
     * Setter for <code>ZDB.KP_REPORT_INSTANCE.REPORT_BY</code>. 「reportBy」- 报表人
     */
    @Override
    public KpReportInstance setReportBy(String reportBy) {
        this.reportBy = reportBy;
        return this;
    }

    /**
     * Getter for <code>ZDB.KP_REPORT_INSTANCE.REPORT_AT</code>. 「reportAt」-
     * 报表生成时间
     */
    @Override
    public LocalDateTime getReportAt() {
        return this.reportAt;
    }

    /**
     * Setter for <code>ZDB.KP_REPORT_INSTANCE.REPORT_AT</code>. 「reportAt」-
     * 报表生成时间
     */
    @Override
    public KpReportInstance setReportAt(LocalDateTime reportAt) {
        this.reportAt = reportAt;
        return this;
    }

    /**
     * Getter for <code>ZDB.KP_REPORT_INSTANCE.REF_TYPE</code>. 「refType」- 关联类型
     */
    @Override
    public String getRefType() {
        return this.refType;
    }

    /**
     * Setter for <code>ZDB.KP_REPORT_INSTANCE.REF_TYPE</code>. 「refType」- 关联类型
     */
    @Override
    public KpReportInstance setRefType(String refType) {
        this.refType = refType;
        return this;
    }

    /**
     * Getter for <code>ZDB.KP_REPORT_INSTANCE.REF_ID</code>. 「refId」- 关联ID
     */
    @Override
    public String getRefId() {
        return this.refId;
    }

    /**
     * Setter for <code>ZDB.KP_REPORT_INSTANCE.REF_ID</code>. 「refId」- 关联ID
     */
    @Override
    public KpReportInstance setRefId(String refId) {
        this.refId = refId;
        return this;
    }

    /**
     * Getter for <code>ZDB.KP_REPORT_INSTANCE.ACTIVE</code>. 「active」- 是否启用
     */
    @Override
    public Boolean getActive() {
        return this.active;
    }

    /**
     * Setter for <code>ZDB.KP_REPORT_INSTANCE.ACTIVE</code>. 「active」- 是否启用
     */
    @Override
    public KpReportInstance setActive(Boolean active) {
        this.active = active;
        return this;
    }

    /**
     * Getter for <code>ZDB.KP_REPORT_INSTANCE.SIGMA</code>. 「sigma」- 统一标识
     */
    @Override
    public String getSigma() {
        return this.sigma;
    }

    /**
     * Setter for <code>ZDB.KP_REPORT_INSTANCE.SIGMA</code>. 「sigma」- 统一标识
     */
    @Override
    public KpReportInstance setSigma(String sigma) {
        this.sigma = sigma;
        return this;
    }

    /**
     * Getter for <code>ZDB.KP_REPORT_INSTANCE.METADATA</code>. 「metadata」- 附加配置
     */
    @Override
    public String getMetadata() {
        return this.metadata;
    }

    /**
     * Setter for <code>ZDB.KP_REPORT_INSTANCE.METADATA</code>. 「metadata」- 附加配置
     */
    @Override
    public KpReportInstance setMetadata(String metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * Getter for <code>ZDB.KP_REPORT_INSTANCE.LANGUAGE</code>. 「language」-
     * 使用的语言
     */
    @Override
    public String getLanguage() {
        return this.language;
    }

    /**
     * Setter for <code>ZDB.KP_REPORT_INSTANCE.LANGUAGE</code>. 「language」-
     * 使用的语言
     */
    @Override
    public KpReportInstance setLanguage(String language) {
        this.language = language;
        return this;
    }

    /**
     * Getter for <code>ZDB.KP_REPORT_INSTANCE.CREATED_AT</code>. 「createdAt」-
     * 创建时间
     */
    @Override
    public LocalDateTime getCreatedAt() {
        return this.createdAt;
    }

    /**
     * Setter for <code>ZDB.KP_REPORT_INSTANCE.CREATED_AT</code>. 「createdAt」-
     * 创建时间
     */
    @Override
    public KpReportInstance setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * Getter for <code>ZDB.KP_REPORT_INSTANCE.CREATED_BY</code>. 「createdBy」-
     * 创建人
     */
    @Override
    public String getCreatedBy() {
        return this.createdBy;
    }

    /**
     * Setter for <code>ZDB.KP_REPORT_INSTANCE.CREATED_BY</code>. 「createdBy」-
     * 创建人
     */
    @Override
    public KpReportInstance setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    /**
     * Getter for <code>ZDB.KP_REPORT_INSTANCE.UPDATED_AT</code>. 「updatedAt」-
     * 更新时间
     */
    @Override
    public LocalDateTime getUpdatedAt() {
        return this.updatedAt;
    }

    /**
     * Setter for <code>ZDB.KP_REPORT_INSTANCE.UPDATED_AT</code>. 「updatedAt」-
     * 更新时间
     */
    @Override
    public KpReportInstance setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * Getter for <code>ZDB.KP_REPORT_INSTANCE.UPDATED_BY</code>. 「updatedBy」-
     * 更新人
     */
    @Override
    public String getUpdatedBy() {
        return this.updatedBy;
    }

    /**
     * Setter for <code>ZDB.KP_REPORT_INSTANCE.UPDATED_BY</code>. 「updatedBy」-
     * 更新人
     */
    @Override
    public KpReportInstance setUpdatedBy(String updatedBy) {
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
        final KpReportInstance other = (KpReportInstance) obj;
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
        if (this.status == null) {
            if (other.status != null)
                return false;
        }
        else if (!this.status.equals(other.status))
            return false;
        if (this.type == null) {
            if (other.type != null)
                return false;
        }
        else if (!this.type.equals(other.type))
            return false;
        if (this.title == null) {
            if (other.title != null)
                return false;
        }
        else if (!this.title.equals(other.title))
            return false;
        if (this.subtitle == null) {
            if (other.subtitle != null)
                return false;
        }
        else if (!this.subtitle.equals(other.subtitle))
            return false;
        if (this.extra == null) {
            if (other.extra != null)
                return false;
        }
        else if (!this.extra.equals(other.extra))
            return false;
        if (this.description == null) {
            if (other.description != null)
                return false;
        }
        else if (!this.description.equals(other.description))
            return false;
        if (this.modeExpr == null) {
            if (other.modeExpr != null)
                return false;
        }
        else if (!this.modeExpr.equals(other.modeExpr))
            return false;
        if (this.reportId == null) {
            if (other.reportId != null)
                return false;
        }
        else if (!this.reportId.equals(other.reportId))
            return false;
        if (this.reportContent == null) {
            if (other.reportContent != null)
                return false;
        }
        else if (!this.reportContent.equals(other.reportContent))
            return false;
        if (this.reportData == null) {
            if (other.reportData != null)
                return false;
        }
        else if (!this.reportData.equals(other.reportData))
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
        if (this.refType == null) {
            if (other.refType != null)
                return false;
        }
        else if (!this.refType.equals(other.refType))
            return false;
        if (this.refId == null) {
            if (other.refId != null)
                return false;
        }
        else if (!this.refId.equals(other.refId))
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
        result = prime * result + ((this.status == null) ? 0 : this.status.hashCode());
        result = prime * result + ((this.type == null) ? 0 : this.type.hashCode());
        result = prime * result + ((this.title == null) ? 0 : this.title.hashCode());
        result = prime * result + ((this.subtitle == null) ? 0 : this.subtitle.hashCode());
        result = prime * result + ((this.extra == null) ? 0 : this.extra.hashCode());
        result = prime * result + ((this.description == null) ? 0 : this.description.hashCode());
        result = prime * result + ((this.modeExpr == null) ? 0 : this.modeExpr.hashCode());
        result = prime * result + ((this.reportId == null) ? 0 : this.reportId.hashCode());
        result = prime * result + ((this.reportContent == null) ? 0 : this.reportContent.hashCode());
        result = prime * result + ((this.reportData == null) ? 0 : this.reportData.hashCode());
        result = prime * result + ((this.reportBy == null) ? 0 : this.reportBy.hashCode());
        result = prime * result + ((this.reportAt == null) ? 0 : this.reportAt.hashCode());
        result = prime * result + ((this.refType == null) ? 0 : this.refType.hashCode());
        result = prime * result + ((this.refId == null) ? 0 : this.refId.hashCode());
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
        StringBuilder sb = new StringBuilder("KpReportInstance (");

        sb.append(key);
        sb.append(", ").append(name);
        sb.append(", ").append(status);
        sb.append(", ").append(type);
        sb.append(", ").append(title);
        sb.append(", ").append(subtitle);
        sb.append(", ").append(extra);
        sb.append(", ").append(description);
        sb.append(", ").append(modeExpr);
        sb.append(", ").append(reportId);
        sb.append(", ").append(reportContent);
        sb.append(", ").append(reportData);
        sb.append(", ").append(reportBy);
        sb.append(", ").append(reportAt);
        sb.append(", ").append(refType);
        sb.append(", ").append(refId);
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
    public void from(IKpReportInstance from) {
        setKey(from.getKey());
        setName(from.getName());
        setStatus(from.getStatus());
        setType(from.getType());
        setTitle(from.getTitle());
        setSubtitle(from.getSubtitle());
        setExtra(from.getExtra());
        setDescription(from.getDescription());
        setModeExpr(from.getModeExpr());
        setReportId(from.getReportId());
        setReportContent(from.getReportContent());
        setReportData(from.getReportData());
        setReportBy(from.getReportBy());
        setReportAt(from.getReportAt());
        setRefType(from.getRefType());
        setRefId(from.getRefId());
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
    public <E extends IKpReportInstance> E into(E into) {
        into.from(this);
        return into;
    }
}
