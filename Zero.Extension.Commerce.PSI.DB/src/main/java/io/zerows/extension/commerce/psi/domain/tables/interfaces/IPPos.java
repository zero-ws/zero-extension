/*
 * This file is generated by jOOQ.
 */
package io.zerows.extension.commerce.psi.domain.tables.interfaces;


import io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo;

import java.io.Serializable;
import java.time.LocalDateTime;

import static io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo.setOrThrow;

/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({"all", "unchecked", "rawtypes"})
public interface IPPos extends VertxPojo, Serializable {

    /**
     * Getter for <code>ZDB.P_POS.KEY</code>. 「key」- 仓位主键
     */
    public String getKey();

    /**
     * Setter for <code>ZDB.P_POS.KEY</code>. 「key」- 仓位主键
     */
    public IPPos setKey(String value);

    /**
     * Getter for <code>ZDB.P_POS.NAME</code>. 「name」- 仓位名称
     */
    public String getName();

    /**
     * Setter for <code>ZDB.P_POS.NAME</code>. 「name」- 仓位名称
     */
    public IPPos setName(String value);

    /**
     * Getter for <code>ZDB.P_POS.CODE</code>. 「code」- 仓位编号（系统可用）
     */
    public String getCode();

    /**
     * Setter for <code>ZDB.P_POS.CODE</code>. 「code」- 仓位编号（系统可用）
     */
    public IPPos setCode(String value);

    /**
     * Getter for <code>ZDB.P_POS.TYPE</code>. 「type」- 仓位类型
     */
    public String getType();

    /**
     * Setter for <code>ZDB.P_POS.TYPE</code>. 「type」- 仓位类型
     */
    public IPPos setType(String value);

    /**
     * Getter for <code>ZDB.P_POS.STATUS</code>. 「status」- 仓位状态
     */
    public String getStatus();

    /**
     * Setter for <code>ZDB.P_POS.STATUS</code>. 「status」- 仓位状态
     */
    public IPPos setStatus(String value);

    /**
     * Getter for <code>ZDB.P_POS.WH_ID</code>. 「whId」- 所属仓库信息
     */
    public String getWhId();

    /**
     * Setter for <code>ZDB.P_POS.WH_ID</code>. 「whId」- 所属仓库信息
     */
    public IPPos setWhId(String value);

    /**
     * Getter for <code>ZDB.P_POS.DIRECT</code>. 「direct」- 直接仓位，1对1
     */
    public Boolean getDirect();

    /**
     * Setter for <code>ZDB.P_POS.DIRECT</code>. 「direct」- 直接仓位，1对1
     */
    public IPPos setDirect(Boolean value);

    /**
     * Getter for <code>ZDB.P_POS.CAPACITY</code>. 「capacity」- 仓位容量
     */
    public Long getCapacity();

    /**
     * Setter for <code>ZDB.P_POS.CAPACITY</code>. 「capacity」- 仓位容量
     */
    public IPPos setCapacity(Long value);

    /**
     * Getter for <code>ZDB.P_POS.CAPACITY_EXCEED</code>. 「capacityExceed」-
     * 仓位超容部分
     */
    public Long getCapacityExceed();

    /**
     * Setter for <code>ZDB.P_POS.CAPACITY_EXCEED</code>. 「capacityExceed」-
     * 仓位超容部分
     */
    public IPPos setCapacityExceed(Long value);

    /**
     * Getter for <code>ZDB.P_POS.LIMIT_TYPE</code>. 「limitType」- 仓位类型限制
     */
    public String getLimitType();

    /**
     * Setter for <code>ZDB.P_POS.LIMIT_TYPE</code>. 「limitType」- 仓位类型限制
     */
    public IPPos setLimitType(String value);

    /**
     * Getter for <code>ZDB.P_POS.LIMIT_RULE</code>. 「limitRule」- 仓位限制规则
     */
    public String getLimitRule();

    /**
     * Setter for <code>ZDB.P_POS.LIMIT_RULE</code>. 「limitRule」- 仓位限制规则
     */
    public IPPos setLimitRule(String value);

    /**
     * Getter for <code>ZDB.P_POS.POS_ROW</code>. 「posRow」- 行维度
     */
    public Integer getPosRow();

    /**
     * Setter for <code>ZDB.P_POS.POS_ROW</code>. 「posRow」- 行维度
     */
    public IPPos setPosRow(Integer value);

    /**
     * Getter for <code>ZDB.P_POS.POS_COLUMN</code>. 「posColumn」- 列维度
     */
    public Integer getPosColumn();

    /**
     * Setter for <code>ZDB.P_POS.POS_COLUMN</code>. 「posColumn」- 列维度
     */
    public IPPos setPosColumn(Integer value);

    /**
     * Getter for <code>ZDB.P_POS.POS_HEIGHT</code>. 「posHeight」- 高维度
     */
    public Integer getPosHeight();

    /**
     * Setter for <code>ZDB.P_POS.POS_HEIGHT</code>. 「posHeight」- 高维度
     */
    public IPPos setPosHeight(Integer value);

    /**
     * Getter for <code>ZDB.P_POS.POS_TAGS</code>. 「posTags」- 标签，横切维度位置管理
     */
    public String getPosTags();

    /**
     * Setter for <code>ZDB.P_POS.POS_TAGS</code>. 「posTags」- 标签，横切维度位置管理
     */
    public IPPos setPosTags(String value);

    /**
     * Getter for <code>ZDB.P_POS.POS_TRACE</code>. 「posTrace」- 空间位置描述
     */
    public String getPosTrace();

    /**
     * Setter for <code>ZDB.P_POS.POS_TRACE</code>. 「posTrace」- 空间位置描述
     */
    public IPPos setPosTrace(String value);

    /**
     * Getter for <code>ZDB.P_POS.COMMENT</code>. 「comment」- 仓库备注
     */
    public String getComment();

    /**
     * Setter for <code>ZDB.P_POS.COMMENT</code>. 「comment」- 仓库备注
     */
    public IPPos setComment(String value);

    /**
     * Getter for <code>ZDB.P_POS.ACTIVE</code>. 「active」- 是否启用
     */
    public Boolean getActive();

    /**
     * Setter for <code>ZDB.P_POS.ACTIVE</code>. 「active」- 是否启用
     */
    public IPPos setActive(Boolean value);

    /**
     * Getter for <code>ZDB.P_POS.SIGMA</code>. 「sigma」- 统一标识
     */
    public String getSigma();

    /**
     * Setter for <code>ZDB.P_POS.SIGMA</code>. 「sigma」- 统一标识
     */
    public IPPos setSigma(String value);

    /**
     * Getter for <code>ZDB.P_POS.METADATA</code>. 「metadata」- 附加配置
     */
    public String getMetadata();

    /**
     * Setter for <code>ZDB.P_POS.METADATA</code>. 「metadata」- 附加配置
     */
    public IPPos setMetadata(String value);

    /**
     * Getter for <code>ZDB.P_POS.LANGUAGE</code>. 「language」- 使用的语言
     */
    public String getLanguage();

    /**
     * Setter for <code>ZDB.P_POS.LANGUAGE</code>. 「language」- 使用的语言
     */
    public IPPos setLanguage(String value);

    /**
     * Getter for <code>ZDB.P_POS.CREATED_AT</code>. 「createdAt」- 创建时间
     */
    public LocalDateTime getCreatedAt();

    /**
     * Setter for <code>ZDB.P_POS.CREATED_AT</code>. 「createdAt」- 创建时间
     */
    public IPPos setCreatedAt(LocalDateTime value);

    /**
     * Getter for <code>ZDB.P_POS.CREATED_BY</code>. 「createdBy」- 创建人
     */
    public String getCreatedBy();

    /**
     * Setter for <code>ZDB.P_POS.CREATED_BY</code>. 「createdBy」- 创建人
     */
    public IPPos setCreatedBy(String value);

    /**
     * Getter for <code>ZDB.P_POS.UPDATED_AT</code>. 「updatedAt」- 更新时间
     */
    public LocalDateTime getUpdatedAt();

    /**
     * Setter for <code>ZDB.P_POS.UPDATED_AT</code>. 「updatedAt」- 更新时间
     */
    public IPPos setUpdatedAt(LocalDateTime value);

    /**
     * Getter for <code>ZDB.P_POS.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    public String getUpdatedBy();

    /**
     * Setter for <code>ZDB.P_POS.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    public IPPos setUpdatedBy(String value);

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    /**
     * Load data from another generated Record/POJO implementing the common
     * interface IPPos
     */
    public void from(IPPos from);

    /**
     * Copy data into another generated Record/POJO implementing the common
     * interface IPPos
     */
    public <E extends IPPos> E into(E into);

    @Override
    public default IPPos fromJson(io.vertx.core.json.JsonObject json) {
        setOrThrow(this::setKey, json::getString, "KEY", "java.lang.String");
        setOrThrow(this::setName, json::getString, "NAME", "java.lang.String");
        setOrThrow(this::setCode, json::getString, "CODE", "java.lang.String");
        setOrThrow(this::setType, json::getString, "TYPE", "java.lang.String");
        setOrThrow(this::setStatus, json::getString, "STATUS", "java.lang.String");
        setOrThrow(this::setWhId, json::getString, "WH_ID", "java.lang.String");
        setOrThrow(this::setDirect, json::getBoolean, "DIRECT", "java.lang.Boolean");
        setOrThrow(this::setCapacity, json::getLong, "CAPACITY", "java.lang.Long");
        setOrThrow(this::setCapacityExceed, json::getLong, "CAPACITY_EXCEED", "java.lang.Long");
        setOrThrow(this::setLimitType, json::getString, "LIMIT_TYPE", "java.lang.String");
        setOrThrow(this::setLimitRule, json::getString, "LIMIT_RULE", "java.lang.String");
        setOrThrow(this::setPosRow, json::getInteger, "POS_ROW", "java.lang.Integer");
        setOrThrow(this::setPosColumn, json::getInteger, "POS_COLUMN", "java.lang.Integer");
        setOrThrow(this::setPosHeight, json::getInteger, "POS_HEIGHT", "java.lang.Integer");
        setOrThrow(this::setPosTags, json::getString, "POS_TAGS", "java.lang.String");
        setOrThrow(this::setPosTrace, json::getString, "POS_TRACE", "java.lang.String");
        setOrThrow(this::setComment, json::getString, "COMMENT", "java.lang.String");
        setOrThrow(this::setActive, json::getBoolean, "ACTIVE", "java.lang.Boolean");
        setOrThrow(this::setSigma, json::getString, "SIGMA", "java.lang.String");
        setOrThrow(this::setMetadata, json::getString, "METADATA", "java.lang.String");
        setOrThrow(this::setLanguage, json::getString, "LANGUAGE", "java.lang.String");
        setOrThrow(this::setCreatedAt, key -> {
            String s = json.getString(key);
            return s == null ? null : java.time.LocalDateTime.parse(s);
        }, "CREATED_AT", "java.time.LocalDateTime");
        setOrThrow(this::setCreatedBy, json::getString, "CREATED_BY", "java.lang.String");
        setOrThrow(this::setUpdatedAt, key -> {
            String s = json.getString(key);
            return s == null ? null : java.time.LocalDateTime.parse(s);
        }, "UPDATED_AT", "java.time.LocalDateTime");
        setOrThrow(this::setUpdatedBy, json::getString, "UPDATED_BY", "java.lang.String");
        return this;
    }


    @Override
    public default io.vertx.core.json.JsonObject toJson() {
        io.vertx.core.json.JsonObject json = new io.vertx.core.json.JsonObject();
        json.put("KEY", getKey());
        json.put("NAME", getName());
        json.put("CODE", getCode());
        json.put("TYPE", getType());
        json.put("STATUS", getStatus());
        json.put("WH_ID", getWhId());
        json.put("DIRECT", getDirect());
        json.put("CAPACITY", getCapacity());
        json.put("CAPACITY_EXCEED", getCapacityExceed());
        json.put("LIMIT_TYPE", getLimitType());
        json.put("LIMIT_RULE", getLimitRule());
        json.put("POS_ROW", getPosRow());
        json.put("POS_COLUMN", getPosColumn());
        json.put("POS_HEIGHT", getPosHeight());
        json.put("POS_TAGS", getPosTags());
        json.put("POS_TRACE", getPosTrace());
        json.put("COMMENT", getComment());
        json.put("ACTIVE", getActive());
        json.put("SIGMA", getSigma());
        json.put("METADATA", getMetadata());
        json.put("LANGUAGE", getLanguage());
        json.put("CREATED_AT", getCreatedAt() == null ? null : getCreatedAt().toString());
        json.put("CREATED_BY", getCreatedBy());
        json.put("UPDATED_AT", getUpdatedAt() == null ? null : getUpdatedAt().toString());
        json.put("UPDATED_BY", getUpdatedBy());
        return json;
    }

}