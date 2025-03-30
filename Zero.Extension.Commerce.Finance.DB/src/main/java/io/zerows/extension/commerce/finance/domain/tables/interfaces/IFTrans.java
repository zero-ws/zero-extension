/*
 * This file is generated by jOOQ.
 */
package io.zerows.extension.commerce.finance.domain.tables.interfaces;


import io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;


import static io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo.*;
/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public interface IFTrans extends VertxPojo, Serializable {

    /**
     * Setter for <code>ZDB.F_TRANS.KEY</code>. 「key」- 交易单主键ID
     */
    public IFTrans setKey(String value);

    /**
     * Getter for <code>ZDB.F_TRANS.KEY</code>. 「key」- 交易单主键ID
     */
    public String getKey();

    /**
     * Setter for <code>ZDB.F_TRANS.NAME</code>. 「name」 - 交易单标题
     */
    public IFTrans setName(String value);

    /**
     * Getter for <code>ZDB.F_TRANS.NAME</code>. 「name」 - 交易单标题
     */
    public String getName();

    /**
     * Setter for <code>ZDB.F_TRANS.CODE</code>. 「code」 - 交易单编号
     */
    public IFTrans setCode(String value);

    /**
     * Getter for <code>ZDB.F_TRANS.CODE</code>. 「code」 - 交易单编号
     */
    public String getCode();

    /**
     * Setter for <code>ZDB.F_TRANS.SERIAL</code>. 「serial」 - 交易单据号
     */
    public IFTrans setSerial(String value);

    /**
     * Getter for <code>ZDB.F_TRANS.SERIAL</code>. 「serial」 - 交易单据号
     */
    public String getSerial();

    /**
     * Setter for <code>ZDB.F_TRANS.TYPE</code>. 「type」 - 交易单类型
     */
    public IFTrans setType(String value);

    /**
     * Getter for <code>ZDB.F_TRANS.TYPE</code>. 「type」 - 交易单类型
     */
    public String getType();

    /**
     * Setter for <code>ZDB.F_TRANS.STATUS</code>. 「status」 - 交易状态
     */
    public IFTrans setStatus(String value);

    /**
     * Getter for <code>ZDB.F_TRANS.STATUS</code>. 「status」 - 交易状态
     */
    public String getStatus();

    /**
     * Setter for <code>ZDB.F_TRANS.AMOUNT</code>. 「amount」——价税合计，所有明细对应的实际结算金额
     */
    public IFTrans setAmount(BigDecimal value);

    /**
     * Getter for <code>ZDB.F_TRANS.AMOUNT</code>. 「amount」——价税合计，所有明细对应的实际结算金额
     */
    public BigDecimal getAmount();

    /**
     * Setter for <code>ZDB.F_TRANS.AMOUNT_PRE</code>. 「amountPre」预付金额
     */
    public IFTrans setAmountPre(BigDecimal value);

    /**
     * Getter for <code>ZDB.F_TRANS.AMOUNT_PRE</code>. 「amountPre」预付金额
     */
    public BigDecimal getAmountPre();

    /**
     * Setter for <code>ZDB.F_TRANS.AMOUNT_GAP</code>. 「amountGap」——差价，根据
     * rounded 计算差价
     */
    public IFTrans setAmountGap(BigDecimal value);

    /**
     * Getter for <code>ZDB.F_TRANS.AMOUNT_GAP</code>. 「amountGap」——差价，根据
     * rounded 计算差价
     */
    public BigDecimal getAmountGap();

    /**
     * Setter for <code>ZDB.F_TRANS.ROUNDED</code>. 「rounded」抹零方式，不同抹零方式会影响验证规则
     */
    public IFTrans setRounded(String value);

    /**
     * Getter for <code>ZDB.F_TRANS.ROUNDED</code>. 「rounded」抹零方式，不同抹零方式会影响验证规则
     */
    public String getRounded();

    /**
     * Setter for <code>ZDB.F_TRANS.PREPAY</code>. 「prepay」- 是否预付
     */
    public IFTrans setPrepay(Boolean value);

    /**
     * Getter for <code>ZDB.F_TRANS.PREPAY</code>. 「prepay」- 是否预付
     */
    public Boolean getPrepay();

    /**
     * Setter for <code>ZDB.F_TRANS.COMMENT</code>. 「comment」 - 备注
     */
    public IFTrans setComment(String value);

    /**
     * Getter for <code>ZDB.F_TRANS.COMMENT</code>. 「comment」 - 备注
     */
    public String getComment();

    /**
     * Setter for <code>ZDB.F_TRANS.START_AT</code>. 「startAt」- 开始时间
     */
    public IFTrans setStartAt(LocalDateTime value);

    /**
     * Getter for <code>ZDB.F_TRANS.START_AT</code>. 「startAt」- 开始时间
     */
    public LocalDateTime getStartAt();

    /**
     * Setter for <code>ZDB.F_TRANS.END_AT</code>. 「endAt」- 结束时间
     */
    public IFTrans setEndAt(LocalDateTime value);

    /**
     * Getter for <code>ZDB.F_TRANS.END_AT</code>. 「endAt」- 结束时间
     */
    public LocalDateTime getEndAt();

    /**
     * Setter for <code>ZDB.F_TRANS.GROUP_BY</code>. 「groupBy」- 分组
     */
    public IFTrans setGroupBy(String value);

    /**
     * Getter for <code>ZDB.F_TRANS.GROUP_BY</code>. 「groupBy」- 分组
     */
    public String getGroupBy();

    /**
     * Setter for <code>ZDB.F_TRANS.SIGMA</code>. 「sigma」- 统一标识
     */
    public IFTrans setSigma(String value);

    /**
     * Getter for <code>ZDB.F_TRANS.SIGMA</code>. 「sigma」- 统一标识
     */
    public String getSigma();

    /**
     * Setter for <code>ZDB.F_TRANS.LANGUAGE</code>. 「language」- 使用的语言
     */
    public IFTrans setLanguage(String value);

    /**
     * Getter for <code>ZDB.F_TRANS.LANGUAGE</code>. 「language」- 使用的语言
     */
    public String getLanguage();

    /**
     * Setter for <code>ZDB.F_TRANS.ACTIVE</code>. 「active」- 是否启用
     */
    public IFTrans setActive(Boolean value);

    /**
     * Getter for <code>ZDB.F_TRANS.ACTIVE</code>. 「active」- 是否启用
     */
    public Boolean getActive();

    /**
     * Setter for <code>ZDB.F_TRANS.METADATA</code>. 「metadata」- 附加配置数据
     */
    public IFTrans setMetadata(String value);

    /**
     * Getter for <code>ZDB.F_TRANS.METADATA</code>. 「metadata」- 附加配置数据
     */
    public String getMetadata();

    /**
     * Setter for <code>ZDB.F_TRANS.CREATED_AT</code>. 「createdAt」- 创建时间
     */
    public IFTrans setCreatedAt(LocalDateTime value);

    /**
     * Getter for <code>ZDB.F_TRANS.CREATED_AT</code>. 「createdAt」- 创建时间
     */
    public LocalDateTime getCreatedAt();

    /**
     * Setter for <code>ZDB.F_TRANS.CREATED_BY</code>. 「createdBy」- 创建人
     */
    public IFTrans setCreatedBy(String value);

    /**
     * Getter for <code>ZDB.F_TRANS.CREATED_BY</code>. 「createdBy」- 创建人
     */
    public String getCreatedBy();

    /**
     * Setter for <code>ZDB.F_TRANS.UPDATED_AT</code>. 「updatedAt」- 更新时间
     */
    public IFTrans setUpdatedAt(LocalDateTime value);

    /**
     * Getter for <code>ZDB.F_TRANS.UPDATED_AT</code>. 「updatedAt」- 更新时间
     */
    public LocalDateTime getUpdatedAt();

    /**
     * Setter for <code>ZDB.F_TRANS.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    public IFTrans setUpdatedBy(String value);

    /**
     * Getter for <code>ZDB.F_TRANS.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    public String getUpdatedBy();

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    /**
     * Load data from another generated Record/POJO implementing the common
     * interface IFTrans
     */
    public void from(IFTrans from);

    /**
     * Copy data into another generated Record/POJO implementing the common
     * interface IFTrans
     */
    public <E extends IFTrans> E into(E into);

        @Override
        public default IFTrans fromJson(io.vertx.core.json.JsonObject json) {
                setOrThrow(this::setKey,json::getString,"KEY","java.lang.String");
                setOrThrow(this::setName,json::getString,"NAME","java.lang.String");
                setOrThrow(this::setCode,json::getString,"CODE","java.lang.String");
                setOrThrow(this::setSerial,json::getString,"SERIAL","java.lang.String");
                setOrThrow(this::setType,json::getString,"TYPE","java.lang.String");
                setOrThrow(this::setStatus,json::getString,"STATUS","java.lang.String");
                setOrThrow(this::setAmount,key -> {String s = json.getString(key); return s==null?null:new java.math.BigDecimal(s);},"AMOUNT","java.math.BigDecimal");
                setOrThrow(this::setAmountPre,key -> {String s = json.getString(key); return s==null?null:new java.math.BigDecimal(s);},"AMOUNT_PRE","java.math.BigDecimal");
                setOrThrow(this::setAmountGap,key -> {String s = json.getString(key); return s==null?null:new java.math.BigDecimal(s);},"AMOUNT_GAP","java.math.BigDecimal");
                setOrThrow(this::setRounded,json::getString,"ROUNDED","java.lang.String");
                setOrThrow(this::setPrepay,json::getBoolean,"PREPAY","java.lang.Boolean");
                setOrThrow(this::setComment,json::getString,"COMMENT","java.lang.String");
                setOrThrow(this::setStartAt,key -> {String s = json.getString(key); return s==null?null:java.time.LocalDateTime.parse(s);},"START_AT","java.time.LocalDateTime");
                setOrThrow(this::setEndAt,key -> {String s = json.getString(key); return s==null?null:java.time.LocalDateTime.parse(s);},"END_AT","java.time.LocalDateTime");
                setOrThrow(this::setGroupBy,json::getString,"GROUP_BY","java.lang.String");
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
                json.put("SERIAL",getSerial());
                json.put("TYPE",getType());
                json.put("STATUS",getStatus());
                json.put("AMOUNT",getAmount()==null?null:getAmount().toString());
                json.put("AMOUNT_PRE",getAmountPre()==null?null:getAmountPre().toString());
                json.put("AMOUNT_GAP",getAmountGap()==null?null:getAmountGap().toString());
                json.put("ROUNDED",getRounded());
                json.put("PREPAY",getPrepay());
                json.put("COMMENT",getComment());
                json.put("START_AT",getStartAt()==null?null:getStartAt().toString());
                json.put("END_AT",getEndAt()==null?null:getEndAt().toString());
                json.put("GROUP_BY",getGroupBy());
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
