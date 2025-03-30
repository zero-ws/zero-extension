/*
 * This file is generated by jOOQ.
 */
package io.zerows.extension.commerce.finance.domain.tables.records;


import io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo;
import io.zerows.extension.commerce.finance.domain.tables.FSettlement;
import io.zerows.extension.commerce.finance.domain.tables.interfaces.IFSettlement;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record22;
import org.jooq.Row22;
import org.jooq.impl.UpdatableRecordImpl;


import static io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo.*;
/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class FSettlementRecord extends UpdatableRecordImpl<FSettlementRecord> implements VertxPojo, Record22<String, String, String, BigDecimal, String, Boolean, LocalDateTime, String, String, LocalDateTime, LocalDateTime, String, String, String, String, String, Boolean, String, LocalDateTime, String, LocalDateTime, String>, IFSettlement {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>ZDB.F_SETTLEMENT.KEY</code>. 「key」- 结算单主键
     */
    @Override
    public FSettlementRecord setKey(String value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.F_SETTLEMENT.KEY</code>. 「key」- 结算单主键
     */
    @Override
    public String getKey() {
        return (String) get(0);
    }

    /**
     * Setter for <code>ZDB.F_SETTLEMENT.CODE</code>. 「code」 - 结算单编号
     */
    @Override
    public FSettlementRecord setCode(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.F_SETTLEMENT.CODE</code>. 「code」 - 结算单编号
     */
    @Override
    public String getCode() {
        return (String) get(1);
    }

    /**
     * Setter for <code>ZDB.F_SETTLEMENT.SERIAL</code>. 「serial」 - 结算单据号
     */
    @Override
    public FSettlementRecord setSerial(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.F_SETTLEMENT.SERIAL</code>. 「serial」 - 结算单据号
     */
    @Override
    public String getSerial() {
        return (String) get(2);
    }

    /**
     * Setter for <code>ZDB.F_SETTLEMENT.AMOUNT</code>.
     * 「amount」——价税合计，所有明细对应的实际结算金额
     */
    @Override
    public FSettlementRecord setAmount(BigDecimal value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.F_SETTLEMENT.AMOUNT</code>.
     * 「amount」——价税合计，所有明细对应的实际结算金额
     */
    @Override
    public BigDecimal getAmount() {
        return (BigDecimal) get(3);
    }

    /**
     * Setter for <code>ZDB.F_SETTLEMENT.COMMENT</code>. 「comment」 - 结算单备注
     */
    @Override
    public FSettlementRecord setComment(String value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.F_SETTLEMENT.COMMENT</code>. 「comment」 - 结算单备注
     */
    @Override
    public String getComment() {
        return (String) get(4);
    }

    /**
     * Setter for <code>ZDB.F_SETTLEMENT.FINISHED</code>. 「finished」- 是否完成
     */
    @Override
    public FSettlementRecord setFinished(Boolean value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.F_SETTLEMENT.FINISHED</code>. 「finished」- 是否完成
     */
    @Override
    public Boolean getFinished() {
        return (Boolean) get(5);
    }

    /**
     * Setter for <code>ZDB.F_SETTLEMENT.FINISHED_AT</code>. 「createdAt」- 完成时间
     */
    @Override
    public FSettlementRecord setFinishedAt(LocalDateTime value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.F_SETTLEMENT.FINISHED_AT</code>. 「createdAt」- 完成时间
     */
    @Override
    public LocalDateTime getFinishedAt() {
        return (LocalDateTime) get(6);
    }

    /**
     * Setter for <code>ZDB.F_SETTLEMENT.SIGN_NAME</code>. 「signName」签单人姓名
     */
    @Override
    public FSettlementRecord setSignName(String value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.F_SETTLEMENT.SIGN_NAME</code>. 「signName」签单人姓名
     */
    @Override
    public String getSignName() {
        return (String) get(7);
    }

    /**
     * Setter for <code>ZDB.F_SETTLEMENT.SIGN_MOBILE</code>. 「signMobile」签单人电话
     */
    @Override
    public FSettlementRecord setSignMobile(String value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.F_SETTLEMENT.SIGN_MOBILE</code>. 「signMobile」签单人电话
     */
    @Override
    public String getSignMobile() {
        return (String) get(8);
    }

    /**
     * Setter for <code>ZDB.F_SETTLEMENT.START_AT</code>. 「startAt」- 开始时间
     */
    @Override
    public FSettlementRecord setStartAt(LocalDateTime value) {
        set(9, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.F_SETTLEMENT.START_AT</code>. 「startAt」- 开始时间
     */
    @Override
    public LocalDateTime getStartAt() {
        return (LocalDateTime) get(9);
    }

    /**
     * Setter for <code>ZDB.F_SETTLEMENT.END_AT</code>. 「endAt」- 结束时间
     */
    @Override
    public FSettlementRecord setEndAt(LocalDateTime value) {
        set(10, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.F_SETTLEMENT.END_AT</code>. 「endAt」- 结束时间
     */
    @Override
    public LocalDateTime getEndAt() {
        return (LocalDateTime) get(10);
    }

    /**
     * Setter for <code>ZDB.F_SETTLEMENT.GROUP_BY</code>. 「groupBy」- 分组
     */
    @Override
    public FSettlementRecord setGroupBy(String value) {
        set(11, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.F_SETTLEMENT.GROUP_BY</code>. 「groupBy」- 分组
     */
    @Override
    public String getGroupBy() {
        return (String) get(11);
    }

    /**
     * Setter for <code>ZDB.F_SETTLEMENT.CUSTOMER_ID</code>.
     * 「customerId」结算对象（单位ID）
     */
    @Override
    public FSettlementRecord setCustomerId(String value) {
        set(12, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.F_SETTLEMENT.CUSTOMER_ID</code>.
     * 「customerId」结算对象（单位ID）
     */
    @Override
    public String getCustomerId() {
        return (String) get(12);
    }

    /**
     * Setter for <code>ZDB.F_SETTLEMENT.RELATED_ID</code>.
     * 「relatedId」关联ID（批次、订单、其他）
     */
    @Override
    public FSettlementRecord setRelatedId(String value) {
        set(13, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.F_SETTLEMENT.RELATED_ID</code>.
     * 「relatedId」关联ID（批次、订单、其他）
     */
    @Override
    public String getRelatedId() {
        return (String) get(13);
    }

    /**
     * Setter for <code>ZDB.F_SETTLEMENT.SIGMA</code>. 「sigma」- 统一标识
     */
    @Override
    public FSettlementRecord setSigma(String value) {
        set(14, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.F_SETTLEMENT.SIGMA</code>. 「sigma」- 统一标识
     */
    @Override
    public String getSigma() {
        return (String) get(14);
    }

    /**
     * Setter for <code>ZDB.F_SETTLEMENT.LANGUAGE</code>. 「language」- 使用的语言
     */
    @Override
    public FSettlementRecord setLanguage(String value) {
        set(15, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.F_SETTLEMENT.LANGUAGE</code>. 「language」- 使用的语言
     */
    @Override
    public String getLanguage() {
        return (String) get(15);
    }

    /**
     * Setter for <code>ZDB.F_SETTLEMENT.ACTIVE</code>. 「active」- 是否启用
     */
    @Override
    public FSettlementRecord setActive(Boolean value) {
        set(16, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.F_SETTLEMENT.ACTIVE</code>. 「active」- 是否启用
     */
    @Override
    public Boolean getActive() {
        return (Boolean) get(16);
    }

    /**
     * Setter for <code>ZDB.F_SETTLEMENT.METADATA</code>. 「metadata」- 附加配置数据
     */
    @Override
    public FSettlementRecord setMetadata(String value) {
        set(17, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.F_SETTLEMENT.METADATA</code>. 「metadata」- 附加配置数据
     */
    @Override
    public String getMetadata() {
        return (String) get(17);
    }

    /**
     * Setter for <code>ZDB.F_SETTLEMENT.CREATED_AT</code>. 「createdAt」- 创建时间
     */
    @Override
    public FSettlementRecord setCreatedAt(LocalDateTime value) {
        set(18, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.F_SETTLEMENT.CREATED_AT</code>. 「createdAt」- 创建时间
     */
    @Override
    public LocalDateTime getCreatedAt() {
        return (LocalDateTime) get(18);
    }

    /**
     * Setter for <code>ZDB.F_SETTLEMENT.CREATED_BY</code>. 「createdBy」- 创建人
     */
    @Override
    public FSettlementRecord setCreatedBy(String value) {
        set(19, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.F_SETTLEMENT.CREATED_BY</code>. 「createdBy」- 创建人
     */
    @Override
    public String getCreatedBy() {
        return (String) get(19);
    }

    /**
     * Setter for <code>ZDB.F_SETTLEMENT.UPDATED_AT</code>. 「updatedAt」- 更新时间
     */
    @Override
    public FSettlementRecord setUpdatedAt(LocalDateTime value) {
        set(20, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.F_SETTLEMENT.UPDATED_AT</code>. 「updatedAt」- 更新时间
     */
    @Override
    public LocalDateTime getUpdatedAt() {
        return (LocalDateTime) get(20);
    }

    /**
     * Setter for <code>ZDB.F_SETTLEMENT.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    @Override
    public FSettlementRecord setUpdatedBy(String value) {
        set(21, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.F_SETTLEMENT.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    @Override
    public String getUpdatedBy() {
        return (String) get(21);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<String> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record22 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row22<String, String, String, BigDecimal, String, Boolean, LocalDateTime, String, String, LocalDateTime, LocalDateTime, String, String, String, String, String, Boolean, String, LocalDateTime, String, LocalDateTime, String> fieldsRow() {
        return (Row22) super.fieldsRow();
    }

    @Override
    public Row22<String, String, String, BigDecimal, String, Boolean, LocalDateTime, String, String, LocalDateTime, LocalDateTime, String, String, String, String, String, Boolean, String, LocalDateTime, String, LocalDateTime, String> valuesRow() {
        return (Row22) super.valuesRow();
    }

    @Override
    public Field<String> field1() {
        return FSettlement.F_SETTLEMENT.KEY;
    }

    @Override
    public Field<String> field2() {
        return FSettlement.F_SETTLEMENT.CODE;
    }

    @Override
    public Field<String> field3() {
        return FSettlement.F_SETTLEMENT.SERIAL;
    }

    @Override
    public Field<BigDecimal> field4() {
        return FSettlement.F_SETTLEMENT.AMOUNT;
    }

    @Override
    public Field<String> field5() {
        return FSettlement.F_SETTLEMENT.COMMENT;
    }

    @Override
    public Field<Boolean> field6() {
        return FSettlement.F_SETTLEMENT.FINISHED;
    }

    @Override
    public Field<LocalDateTime> field7() {
        return FSettlement.F_SETTLEMENT.FINISHED_AT;
    }

    @Override
    public Field<String> field8() {
        return FSettlement.F_SETTLEMENT.SIGN_NAME;
    }

    @Override
    public Field<String> field9() {
        return FSettlement.F_SETTLEMENT.SIGN_MOBILE;
    }

    @Override
    public Field<LocalDateTime> field10() {
        return FSettlement.F_SETTLEMENT.START_AT;
    }

    @Override
    public Field<LocalDateTime> field11() {
        return FSettlement.F_SETTLEMENT.END_AT;
    }

    @Override
    public Field<String> field12() {
        return FSettlement.F_SETTLEMENT.GROUP_BY;
    }

    @Override
    public Field<String> field13() {
        return FSettlement.F_SETTLEMENT.CUSTOMER_ID;
    }

    @Override
    public Field<String> field14() {
        return FSettlement.F_SETTLEMENT.RELATED_ID;
    }

    @Override
    public Field<String> field15() {
        return FSettlement.F_SETTLEMENT.SIGMA;
    }

    @Override
    public Field<String> field16() {
        return FSettlement.F_SETTLEMENT.LANGUAGE;
    }

    @Override
    public Field<Boolean> field17() {
        return FSettlement.F_SETTLEMENT.ACTIVE;
    }

    @Override
    public Field<String> field18() {
        return FSettlement.F_SETTLEMENT.METADATA;
    }

    @Override
    public Field<LocalDateTime> field19() {
        return FSettlement.F_SETTLEMENT.CREATED_AT;
    }

    @Override
    public Field<String> field20() {
        return FSettlement.F_SETTLEMENT.CREATED_BY;
    }

    @Override
    public Field<LocalDateTime> field21() {
        return FSettlement.F_SETTLEMENT.UPDATED_AT;
    }

    @Override
    public Field<String> field22() {
        return FSettlement.F_SETTLEMENT.UPDATED_BY;
    }

    @Override
    public String component1() {
        return getKey();
    }

    @Override
    public String component2() {
        return getCode();
    }

    @Override
    public String component3() {
        return getSerial();
    }

    @Override
    public BigDecimal component4() {
        return getAmount();
    }

    @Override
    public String component5() {
        return getComment();
    }

    @Override
    public Boolean component6() {
        return getFinished();
    }

    @Override
    public LocalDateTime component7() {
        return getFinishedAt();
    }

    @Override
    public String component8() {
        return getSignName();
    }

    @Override
    public String component9() {
        return getSignMobile();
    }

    @Override
    public LocalDateTime component10() {
        return getStartAt();
    }

    @Override
    public LocalDateTime component11() {
        return getEndAt();
    }

    @Override
    public String component12() {
        return getGroupBy();
    }

    @Override
    public String component13() {
        return getCustomerId();
    }

    @Override
    public String component14() {
        return getRelatedId();
    }

    @Override
    public String component15() {
        return getSigma();
    }

    @Override
    public String component16() {
        return getLanguage();
    }

    @Override
    public Boolean component17() {
        return getActive();
    }

    @Override
    public String component18() {
        return getMetadata();
    }

    @Override
    public LocalDateTime component19() {
        return getCreatedAt();
    }

    @Override
    public String component20() {
        return getCreatedBy();
    }

    @Override
    public LocalDateTime component21() {
        return getUpdatedAt();
    }

    @Override
    public String component22() {
        return getUpdatedBy();
    }

    @Override
    public String value1() {
        return getKey();
    }

    @Override
    public String value2() {
        return getCode();
    }

    @Override
    public String value3() {
        return getSerial();
    }

    @Override
    public BigDecimal value4() {
        return getAmount();
    }

    @Override
    public String value5() {
        return getComment();
    }

    @Override
    public Boolean value6() {
        return getFinished();
    }

    @Override
    public LocalDateTime value7() {
        return getFinishedAt();
    }

    @Override
    public String value8() {
        return getSignName();
    }

    @Override
    public String value9() {
        return getSignMobile();
    }

    @Override
    public LocalDateTime value10() {
        return getStartAt();
    }

    @Override
    public LocalDateTime value11() {
        return getEndAt();
    }

    @Override
    public String value12() {
        return getGroupBy();
    }

    @Override
    public String value13() {
        return getCustomerId();
    }

    @Override
    public String value14() {
        return getRelatedId();
    }

    @Override
    public String value15() {
        return getSigma();
    }

    @Override
    public String value16() {
        return getLanguage();
    }

    @Override
    public Boolean value17() {
        return getActive();
    }

    @Override
    public String value18() {
        return getMetadata();
    }

    @Override
    public LocalDateTime value19() {
        return getCreatedAt();
    }

    @Override
    public String value20() {
        return getCreatedBy();
    }

    @Override
    public LocalDateTime value21() {
        return getUpdatedAt();
    }

    @Override
    public String value22() {
        return getUpdatedBy();
    }

    @Override
    public FSettlementRecord value1(String value) {
        setKey(value);
        return this;
    }

    @Override
    public FSettlementRecord value2(String value) {
        setCode(value);
        return this;
    }

    @Override
    public FSettlementRecord value3(String value) {
        setSerial(value);
        return this;
    }

    @Override
    public FSettlementRecord value4(BigDecimal value) {
        setAmount(value);
        return this;
    }

    @Override
    public FSettlementRecord value5(String value) {
        setComment(value);
        return this;
    }

    @Override
    public FSettlementRecord value6(Boolean value) {
        setFinished(value);
        return this;
    }

    @Override
    public FSettlementRecord value7(LocalDateTime value) {
        setFinishedAt(value);
        return this;
    }

    @Override
    public FSettlementRecord value8(String value) {
        setSignName(value);
        return this;
    }

    @Override
    public FSettlementRecord value9(String value) {
        setSignMobile(value);
        return this;
    }

    @Override
    public FSettlementRecord value10(LocalDateTime value) {
        setStartAt(value);
        return this;
    }

    @Override
    public FSettlementRecord value11(LocalDateTime value) {
        setEndAt(value);
        return this;
    }

    @Override
    public FSettlementRecord value12(String value) {
        setGroupBy(value);
        return this;
    }

    @Override
    public FSettlementRecord value13(String value) {
        setCustomerId(value);
        return this;
    }

    @Override
    public FSettlementRecord value14(String value) {
        setRelatedId(value);
        return this;
    }

    @Override
    public FSettlementRecord value15(String value) {
        setSigma(value);
        return this;
    }

    @Override
    public FSettlementRecord value16(String value) {
        setLanguage(value);
        return this;
    }

    @Override
    public FSettlementRecord value17(Boolean value) {
        setActive(value);
        return this;
    }

    @Override
    public FSettlementRecord value18(String value) {
        setMetadata(value);
        return this;
    }

    @Override
    public FSettlementRecord value19(LocalDateTime value) {
        setCreatedAt(value);
        return this;
    }

    @Override
    public FSettlementRecord value20(String value) {
        setCreatedBy(value);
        return this;
    }

    @Override
    public FSettlementRecord value21(LocalDateTime value) {
        setUpdatedAt(value);
        return this;
    }

    @Override
    public FSettlementRecord value22(String value) {
        setUpdatedBy(value);
        return this;
    }

    @Override
    public FSettlementRecord values(String value1, String value2, String value3, BigDecimal value4, String value5, Boolean value6, LocalDateTime value7, String value8, String value9, LocalDateTime value10, LocalDateTime value11, String value12, String value13, String value14, String value15, String value16, Boolean value17, String value18, LocalDateTime value19, String value20, LocalDateTime value21, String value22) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        value11(value11);
        value12(value12);
        value13(value13);
        value14(value14);
        value15(value15);
        value16(value16);
        value17(value17);
        value18(value18);
        value19(value19);
        value20(value20);
        value21(value21);
        value22(value22);
        return this;
    }

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    @Override
    public void from(IFSettlement from) {
        setKey(from.getKey());
        setCode(from.getCode());
        setSerial(from.getSerial());
        setAmount(from.getAmount());
        setComment(from.getComment());
        setFinished(from.getFinished());
        setFinishedAt(from.getFinishedAt());
        setSignName(from.getSignName());
        setSignMobile(from.getSignMobile());
        setStartAt(from.getStartAt());
        setEndAt(from.getEndAt());
        setGroupBy(from.getGroupBy());
        setCustomerId(from.getCustomerId());
        setRelatedId(from.getRelatedId());
        setSigma(from.getSigma());
        setLanguage(from.getLanguage());
        setActive(from.getActive());
        setMetadata(from.getMetadata());
        setCreatedAt(from.getCreatedAt());
        setCreatedBy(from.getCreatedBy());
        setUpdatedAt(from.getUpdatedAt());
        setUpdatedBy(from.getUpdatedBy());
        resetChangedOnNotNull();
    }

    @Override
    public <E extends IFSettlement> E into(E into) {
        into.from(this);
        return into;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached FSettlementRecord
     */
    public FSettlementRecord() {
        super(FSettlement.F_SETTLEMENT);
    }

    /**
     * Create a detached, initialised FSettlementRecord
     */
    public FSettlementRecord(String key, String code, String serial, BigDecimal amount, String comment, Boolean finished, LocalDateTime finishedAt, String signName, String signMobile, LocalDateTime startAt, LocalDateTime endAt, String groupBy, String customerId, String relatedId, String sigma, String language, Boolean active, String metadata, LocalDateTime createdAt, String createdBy, LocalDateTime updatedAt, String updatedBy) {
        super(FSettlement.F_SETTLEMENT);

        setKey(key);
        setCode(code);
        setSerial(serial);
        setAmount(amount);
        setComment(comment);
        setFinished(finished);
        setFinishedAt(finishedAt);
        setSignName(signName);
        setSignMobile(signMobile);
        setStartAt(startAt);
        setEndAt(endAt);
        setGroupBy(groupBy);
        setCustomerId(customerId);
        setRelatedId(relatedId);
        setSigma(sigma);
        setLanguage(language);
        setActive(active);
        setMetadata(metadata);
        setCreatedAt(createdAt);
        setCreatedBy(createdBy);
        setUpdatedAt(updatedAt);
        setUpdatedBy(updatedBy);
        resetChangedOnNotNull();
    }

    /**
     * Create a detached, initialised FSettlementRecord
     */
    public FSettlementRecord(io.zerows.extension.commerce.finance.domain.tables.pojos.FSettlement value) {
        super(FSettlement.F_SETTLEMENT);

        if (value != null) {
            setKey(value.getKey());
            setCode(value.getCode());
            setSerial(value.getSerial());
            setAmount(value.getAmount());
            setComment(value.getComment());
            setFinished(value.getFinished());
            setFinishedAt(value.getFinishedAt());
            setSignName(value.getSignName());
            setSignMobile(value.getSignMobile());
            setStartAt(value.getStartAt());
            setEndAt(value.getEndAt());
            setGroupBy(value.getGroupBy());
            setCustomerId(value.getCustomerId());
            setRelatedId(value.getRelatedId());
            setSigma(value.getSigma());
            setLanguage(value.getLanguage());
            setActive(value.getActive());
            setMetadata(value.getMetadata());
            setCreatedAt(value.getCreatedAt());
            setCreatedBy(value.getCreatedBy());
            setUpdatedAt(value.getUpdatedAt());
            setUpdatedBy(value.getUpdatedBy());
            resetChangedOnNotNull();
        }
    }

        public FSettlementRecord(io.vertx.core.json.JsonObject json) {
                this();
                fromJson(json);
        }
}
