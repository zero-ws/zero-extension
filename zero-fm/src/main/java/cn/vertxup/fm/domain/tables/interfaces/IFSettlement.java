/*
 * This file is generated by jOOQ.
 */
package cn.vertxup.fm.domain.tables.interfaces;


import io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

import static io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo.setOrThrow;
/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public interface IFSettlement extends VertxPojo, Serializable {

    /**
     * Setter for <code>DB_ETERNAL.F_SETTLEMENT.KEY</code>. 「key」- 结算单主键
     */
    public IFSettlement setKey(String value);

    /**
     * Getter for <code>DB_ETERNAL.F_SETTLEMENT.KEY</code>. 「key」- 结算单主键
     */
    public String getKey();

    /**
     * Setter for <code>DB_ETERNAL.F_SETTLEMENT.CODE</code>. 「code」 - 结算单编号
     */
    public IFSettlement setCode(String value);

    /**
     * Getter for <code>DB_ETERNAL.F_SETTLEMENT.CODE</code>. 「code」 - 结算单编号
     */
    public String getCode();

    /**
     * Setter for <code>DB_ETERNAL.F_SETTLEMENT.SERIAL</code>. 「serial」 - 结算单据号
     */
    public IFSettlement setSerial(String value);

    /**
     * Getter for <code>DB_ETERNAL.F_SETTLEMENT.SERIAL</code>. 「serial」 - 结算单据号
     */
    public String getSerial();

    /**
     * Setter for <code>DB_ETERNAL.F_SETTLEMENT.AMOUNT</code>.
     * 「amount」——价税合计，所有明细对应的实际结算金额
     */
    public IFSettlement setAmount(BigDecimal value);

    /**
     * Getter for <code>DB_ETERNAL.F_SETTLEMENT.AMOUNT</code>.
     * 「amount」——价税合计，所有明细对应的实际结算金额
     */
    public BigDecimal getAmount();

    /**
     * Setter for <code>DB_ETERNAL.F_SETTLEMENT.COMMENT</code>. 「comment」 -
     * 结算单备注
     */
    public IFSettlement setComment(String value);

    /**
     * Getter for <code>DB_ETERNAL.F_SETTLEMENT.COMMENT</code>. 「comment」 -
     * 结算单备注
     */
    public String getComment();

    /**
     * Setter for <code>DB_ETERNAL.F_SETTLEMENT.ROUNDED</code>.
     * 「rounded」抹零方式：四舍五入, HALF：零头舍掉, FLOOR, 零头入进, CEIL
     */
    public IFSettlement setRounded(String value);

    /**
     * Getter for <code>DB_ETERNAL.F_SETTLEMENT.ROUNDED</code>.
     * 「rounded」抹零方式：四舍五入, HALF：零头舍掉, FLOOR, 零头入进, CEIL
     */
    public String getRounded();

    /**
     * Setter for <code>DB_ETERNAL.F_SETTLEMENT.FINISHED</code>. 「finished」-
     * 是否完成
     */
    public IFSettlement setFinished(Boolean value);

    /**
     * Getter for <code>DB_ETERNAL.F_SETTLEMENT.FINISHED</code>. 「finished」-
     * 是否完成
     */
    public Boolean getFinished();

    /**
     * Setter for <code>DB_ETERNAL.F_SETTLEMENT.FINISHED_AT</code>. 「createdAt」-
     * 完成时间
     */
    public IFSettlement setFinishedAt(LocalDateTime value);

    /**
     * Getter for <code>DB_ETERNAL.F_SETTLEMENT.FINISHED_AT</code>. 「createdAt」-
     * 完成时间
     */
    public LocalDateTime getFinishedAt();

    /**
     * Setter for <code>DB_ETERNAL.F_SETTLEMENT.SIGN_NAME</code>.
     * 「signName」签单人姓名
     */
    public IFSettlement setSignName(String value);

    /**
     * Getter for <code>DB_ETERNAL.F_SETTLEMENT.SIGN_NAME</code>.
     * 「signName」签单人姓名
     */
    public String getSignName();

    /**
     * Setter for <code>DB_ETERNAL.F_SETTLEMENT.SIGN_MOBILE</code>.
     * 「signMobile」签单人电话
     */
    public IFSettlement setSignMobile(String value);

    /**
     * Getter for <code>DB_ETERNAL.F_SETTLEMENT.SIGN_MOBILE</code>.
     * 「signMobile」签单人电话
     */
    public String getSignMobile();

    /**
     * Setter for <code>DB_ETERNAL.F_SETTLEMENT.CUSTOMER_ID</code>.
     * 「customerId」结算对象（单位ID）
     */
    public IFSettlement setCustomerId(String value);

    /**
     * Getter for <code>DB_ETERNAL.F_SETTLEMENT.CUSTOMER_ID</code>.
     * 「customerId」结算对象（单位ID）
     */
    public String getCustomerId();

    /**
     * Setter for <code>DB_ETERNAL.F_SETTLEMENT.RELATED_ID</code>.
     * 「relatedId」关联ID（批次、订单、其他）
     */
    public IFSettlement setRelatedId(String value);

    /**
     * Getter for <code>DB_ETERNAL.F_SETTLEMENT.RELATED_ID</code>.
     * 「relatedId」关联ID（批次、订单、其他）
     */
    public String getRelatedId();

    /**
     * Setter for <code>DB_ETERNAL.F_SETTLEMENT.SIGMA</code>. 「sigma」- 统一标识
     */
    public IFSettlement setSigma(String value);

    /**
     * Getter for <code>DB_ETERNAL.F_SETTLEMENT.SIGMA</code>. 「sigma」- 统一标识
     */
    public String getSigma();

    /**
     * Setter for <code>DB_ETERNAL.F_SETTLEMENT.LANGUAGE</code>. 「language」-
     * 使用的语言
     */
    public IFSettlement setLanguage(String value);

    /**
     * Getter for <code>DB_ETERNAL.F_SETTLEMENT.LANGUAGE</code>. 「language」-
     * 使用的语言
     */
    public String getLanguage();

    /**
     * Setter for <code>DB_ETERNAL.F_SETTLEMENT.ACTIVE</code>. 「active」- 是否启用
     */
    public IFSettlement setActive(Boolean value);

    /**
     * Getter for <code>DB_ETERNAL.F_SETTLEMENT.ACTIVE</code>. 「active」- 是否启用
     */
    public Boolean getActive();

    /**
     * Setter for <code>DB_ETERNAL.F_SETTLEMENT.METADATA</code>. 「metadata」-
     * 附加配置数据
     */
    public IFSettlement setMetadata(String value);

    /**
     * Getter for <code>DB_ETERNAL.F_SETTLEMENT.METADATA</code>. 「metadata」-
     * 附加配置数据
     */
    public String getMetadata();

    /**
     * Setter for <code>DB_ETERNAL.F_SETTLEMENT.CREATED_AT</code>. 「createdAt」-
     * 创建时间
     */
    public IFSettlement setCreatedAt(LocalDateTime value);

    /**
     * Getter for <code>DB_ETERNAL.F_SETTLEMENT.CREATED_AT</code>. 「createdAt」-
     * 创建时间
     */
    public LocalDateTime getCreatedAt();

    /**
     * Setter for <code>DB_ETERNAL.F_SETTLEMENT.CREATED_BY</code>. 「createdBy」-
     * 创建人
     */
    public IFSettlement setCreatedBy(String value);

    /**
     * Getter for <code>DB_ETERNAL.F_SETTLEMENT.CREATED_BY</code>. 「createdBy」-
     * 创建人
     */
    public String getCreatedBy();

    /**
     * Setter for <code>DB_ETERNAL.F_SETTLEMENT.UPDATED_AT</code>. 「updatedAt」-
     * 更新时间
     */
    public IFSettlement setUpdatedAt(LocalDateTime value);

    /**
     * Getter for <code>DB_ETERNAL.F_SETTLEMENT.UPDATED_AT</code>. 「updatedAt」-
     * 更新时间
     */
    public LocalDateTime getUpdatedAt();

    /**
     * Setter for <code>DB_ETERNAL.F_SETTLEMENT.UPDATED_BY</code>. 「updatedBy」-
     * 更新人
     */
    public IFSettlement setUpdatedBy(String value);

    /**
     * Getter for <code>DB_ETERNAL.F_SETTLEMENT.UPDATED_BY</code>. 「updatedBy」-
     * 更新人
     */
    public String getUpdatedBy();

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    /**
     * Load data from another generated Record/POJO implementing the common
     * interface IFSettlement
     */
    public void from(IFSettlement from);

    /**
     * Copy data into another generated Record/POJO implementing the common
     * interface IFSettlement
     */
    public <E extends IFSettlement> E into(E into);

        @Override
        public default IFSettlement fromJson(io.vertx.core.json.JsonObject json) {
                setOrThrow(this::setKey,json::getString,"KEY","java.lang.String");
                setOrThrow(this::setCode,json::getString,"CODE","java.lang.String");
                setOrThrow(this::setSerial,json::getString,"SERIAL","java.lang.String");
                setOrThrow(this::setAmount,key -> {String s = json.getString(key); return s==null?null:new java.math.BigDecimal(s);},"AMOUNT","java.math.BigDecimal");
                setOrThrow(this::setComment,json::getString,"COMMENT","java.lang.String");
                setOrThrow(this::setRounded,json::getString,"ROUNDED","java.lang.String");
                setOrThrow(this::setFinished,json::getBoolean,"FINISHED","java.lang.Boolean");
                setOrThrow(this::setFinishedAt,key -> {String s = json.getString(key); return s==null?null:java.time.LocalDateTime.parse(s);},"FINISHED_AT","java.time.LocalDateTime");
                setOrThrow(this::setSignName,json::getString,"SIGN_NAME","java.lang.String");
                setOrThrow(this::setSignMobile,json::getString,"SIGN_MOBILE","java.lang.String");
                setOrThrow(this::setCustomerId,json::getString,"CUSTOMER_ID","java.lang.String");
                setOrThrow(this::setRelatedId,json::getString,"RELATED_ID","java.lang.String");
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
                json.put("CODE",getCode());
                json.put("SERIAL",getSerial());
                json.put("AMOUNT",getAmount()==null?null:getAmount().toString());
                json.put("COMMENT",getComment());
                json.put("ROUNDED",getRounded());
                json.put("FINISHED",getFinished());
                json.put("FINISHED_AT",getFinishedAt()==null?null:getFinishedAt().toString());
                json.put("SIGN_NAME",getSignName());
                json.put("SIGN_MOBILE",getSignMobile());
                json.put("CUSTOMER_ID",getCustomerId());
                json.put("RELATED_ID",getRelatedId());
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
