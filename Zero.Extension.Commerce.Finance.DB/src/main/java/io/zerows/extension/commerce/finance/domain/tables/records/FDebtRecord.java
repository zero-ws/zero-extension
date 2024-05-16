/*
 * This file is generated by jOOQ.
 */
package io.zerows.extension.commerce.finance.domain.tables.records;


import io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo;
import io.zerows.extension.commerce.finance.domain.tables.FDebt;
import io.zerows.extension.commerce.finance.domain.tables.interfaces.IFDebt;
import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record21;
import org.jooq.Row21;
import org.jooq.impl.UpdatableRecordImpl;

import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({"all", "unchecked", "rawtypes"})
public class FDebtRecord extends UpdatableRecordImpl<FDebtRecord> implements VertxPojo, Record21<String, String, String, String, String, BigDecimal, BigDecimal, Boolean, LocalDateTime, String, String, String, String, String, String, Boolean, String, LocalDateTime, String, LocalDateTime, String>, IFDebt {

    private static final long serialVersionUID = 1L;

    /**
     * Create a detached FDebtRecord
     */
    public FDebtRecord() {
        super(FDebt.F_DEBT);
    }

    /**
     * Create a detached, initialised FDebtRecord
     */
    public FDebtRecord(String key, String name, String code, String serial, String type, BigDecimal amount, BigDecimal amountBalance, Boolean finished, LocalDateTime finishedAt, String signName, String signMobile, String comment, String customerId, String sigma, String language, Boolean active, String metadata, LocalDateTime createdAt, String createdBy, LocalDateTime updatedAt, String updatedBy) {
        super(FDebt.F_DEBT);

        setKey(key);
        setName(name);
        setCode(code);
        setSerial(serial);
        setType(type);
        setAmount(amount);
        setAmountBalance(amountBalance);
        setFinished(finished);
        setFinishedAt(finishedAt);
        setSignName(signName);
        setSignMobile(signMobile);
        setComment(comment);
        setCustomerId(customerId);
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
     * Create a detached, initialised FDebtRecord
     */
    public FDebtRecord(io.zerows.extension.commerce.finance.domain.tables.pojos.FDebt value) {
        super(FDebt.F_DEBT);

        if (value != null) {
            setKey(value.getKey());
            setName(value.getName());
            setCode(value.getCode());
            setSerial(value.getSerial());
            setType(value.getType());
            setAmount(value.getAmount());
            setAmountBalance(value.getAmountBalance());
            setFinished(value.getFinished());
            setFinishedAt(value.getFinishedAt());
            setSignName(value.getSignName());
            setSignMobile(value.getSignMobile());
            setComment(value.getComment());
            setCustomerId(value.getCustomerId());
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

    public FDebtRecord(io.vertx.core.json.JsonObject json) {
        this();
        fromJson(json);
    }

    /**
     * Getter for <code>ZDB.F_DEBT.KEY</code>. 「key」- 应收账单主键ID
     */
    @Override
    public String getKey() {
        return (String) get(0);
    }

    /**
     * Setter for <code>ZDB.F_DEBT.KEY</code>. 「key」- 应收账单主键ID
     */
    @Override
    public FDebtRecord setKey(String value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.F_DEBT.NAME</code>. 「name」 - 应收单标题
     */
    @Override
    public String getName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>ZDB.F_DEBT.NAME</code>. 「name」 - 应收单标题
     */
    @Override
    public FDebtRecord setName(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.F_DEBT.CODE</code>. 「code」 - 应收单编号
     */
    @Override
    public String getCode() {
        return (String) get(2);
    }

    /**
     * Setter for <code>ZDB.F_DEBT.CODE</code>. 「code」 - 应收单编号
     */
    @Override
    public FDebtRecord setCode(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.F_DEBT.SERIAL</code>. 「serial」 - 应收单据号
     */
    @Override
    public String getSerial() {
        return (String) get(3);
    }

    /**
     * Setter for <code>ZDB.F_DEBT.SERIAL</code>. 「serial」 - 应收单据号
     */
    @Override
    public FDebtRecord setSerial(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.F_DEBT.TYPE</code>. 「type」- 类型
     */
    @Override
    public String getType() {
        return (String) get(4);
    }

    /**
     * Setter for <code>ZDB.F_DEBT.TYPE</code>. 「type」- 类型
     */
    @Override
    public FDebtRecord setType(String value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.F_DEBT.AMOUNT</code>. 「amount」——价税合计，所有明细对应的实际结算金额
     */
    @Override
    public BigDecimal getAmount() {
        return (BigDecimal) get(5);
    }

    /**
     * Setter for <code>ZDB.F_DEBT.AMOUNT</code>. 「amount」——价税合计，所有明细对应的实际结算金额
     */
    @Override
    public FDebtRecord setAmount(BigDecimal value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.F_DEBT.AMOUNT_BALANCE</code>. 「amountBalance」——剩余金额
     */
    @Override
    public BigDecimal getAmountBalance() {
        return (BigDecimal) get(6);
    }

    /**
     * Setter for <code>ZDB.F_DEBT.AMOUNT_BALANCE</code>. 「amountBalance」——剩余金额
     */
    @Override
    public FDebtRecord setAmountBalance(BigDecimal value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.F_DEBT.FINISHED</code>. 「finished」- 是否完成
     */
    @Override
    public Boolean getFinished() {
        return (Boolean) get(7);
    }

    /**
     * Setter for <code>ZDB.F_DEBT.FINISHED</code>. 「finished」- 是否完成
     */
    @Override
    public FDebtRecord setFinished(Boolean value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.F_DEBT.FINISHED_AT</code>. 「createdAt」- 完成时间
     */
    @Override
    public LocalDateTime getFinishedAt() {
        return (LocalDateTime) get(8);
    }

    /**
     * Setter for <code>ZDB.F_DEBT.FINISHED_AT</code>. 「createdAt」- 完成时间
     */
    @Override
    public FDebtRecord setFinishedAt(LocalDateTime value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.F_DEBT.SIGN_NAME</code>. 「signName」签单人姓名
     */
    @Override
    public String getSignName() {
        return (String) get(9);
    }

    /**
     * Setter for <code>ZDB.F_DEBT.SIGN_NAME</code>. 「signName」签单人姓名
     */
    @Override
    public FDebtRecord setSignName(String value) {
        set(9, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.F_DEBT.SIGN_MOBILE</code>. 「signMobile」签单人电话
     */
    @Override
    public String getSignMobile() {
        return (String) get(10);
    }

    /**
     * Setter for <code>ZDB.F_DEBT.SIGN_MOBILE</code>. 「signMobile」签单人电话
     */
    @Override
    public FDebtRecord setSignMobile(String value) {
        set(10, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.F_DEBT.COMMENT</code>. 「comment」 - 备注
     */
    @Override
    public String getComment() {
        return (String) get(11);
    }

    /**
     * Setter for <code>ZDB.F_DEBT.COMMENT</code>. 「comment」 - 备注
     */
    @Override
    public FDebtRecord setComment(String value) {
        set(11, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.F_DEBT.CUSTOMER_ID</code>. 「customerId」结算对象（单位ID）
     */
    @Override
    public String getCustomerId() {
        return (String) get(12);
    }

    /**
     * Setter for <code>ZDB.F_DEBT.CUSTOMER_ID</code>. 「customerId」结算对象（单位ID）
     */
    @Override
    public FDebtRecord setCustomerId(String value) {
        set(12, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.F_DEBT.SIGMA</code>. 「sigma」- 统一标识
     */
    @Override
    public String getSigma() {
        return (String) get(13);
    }

    /**
     * Setter for <code>ZDB.F_DEBT.SIGMA</code>. 「sigma」- 统一标识
     */
    @Override
    public FDebtRecord setSigma(String value) {
        set(13, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.F_DEBT.LANGUAGE</code>. 「language」- 使用的语言
     */
    @Override
    public String getLanguage() {
        return (String) get(14);
    }

    /**
     * Setter for <code>ZDB.F_DEBT.LANGUAGE</code>. 「language」- 使用的语言
     */
    @Override
    public FDebtRecord setLanguage(String value) {
        set(14, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.F_DEBT.ACTIVE</code>. 「active」- 是否启用
     */
    @Override
    public Boolean getActive() {
        return (Boolean) get(15);
    }

    /**
     * Setter for <code>ZDB.F_DEBT.ACTIVE</code>. 「active」- 是否启用
     */
    @Override
    public FDebtRecord setActive(Boolean value) {
        set(15, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.F_DEBT.METADATA</code>. 「metadata」- 附加配置数据
     */
    @Override
    public String getMetadata() {
        return (String) get(16);
    }

    /**
     * Setter for <code>ZDB.F_DEBT.METADATA</code>. 「metadata」- 附加配置数据
     */
    @Override
    public FDebtRecord setMetadata(String value) {
        set(16, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.F_DEBT.CREATED_AT</code>. 「createdAt」- 创建时间
     */
    @Override
    public LocalDateTime getCreatedAt() {
        return (LocalDateTime) get(17);
    }

    /**
     * Setter for <code>ZDB.F_DEBT.CREATED_AT</code>. 「createdAt」- 创建时间
     */
    @Override
    public FDebtRecord setCreatedAt(LocalDateTime value) {
        set(17, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.F_DEBT.CREATED_BY</code>. 「createdBy」- 创建人
     */
    @Override
    public String getCreatedBy() {
        return (String) get(18);
    }

    /**
     * Setter for <code>ZDB.F_DEBT.CREATED_BY</code>. 「createdBy」- 创建人
     */
    @Override
    public FDebtRecord setCreatedBy(String value) {
        set(18, value);
        return this;
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * Getter for <code>ZDB.F_DEBT.UPDATED_AT</code>. 「updatedAt」- 更新时间
     */
    @Override
    public LocalDateTime getUpdatedAt() {
        return (LocalDateTime) get(19);
    }

    // -------------------------------------------------------------------------
    // Record21 type implementation
    // -------------------------------------------------------------------------

    /**
     * Setter for <code>ZDB.F_DEBT.UPDATED_AT</code>. 「updatedAt」- 更新时间
     */
    @Override
    public FDebtRecord setUpdatedAt(LocalDateTime value) {
        set(19, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.F_DEBT.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    @Override
    public String getUpdatedBy() {
        return (String) get(20);
    }

    /**
     * Setter for <code>ZDB.F_DEBT.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    @Override
    public FDebtRecord setUpdatedBy(String value) {
        set(20, value);
        return this;
    }

    @Override
    public Record1<String> key() {
        return (Record1) super.key();
    }

    @Override
    public Row21<String, String, String, String, String, BigDecimal, BigDecimal, Boolean, LocalDateTime, String, String, String, String, String, String, Boolean, String, LocalDateTime, String, LocalDateTime, String> fieldsRow() {
        return (Row21) super.fieldsRow();
    }

    @Override
    public Row21<String, String, String, String, String, BigDecimal, BigDecimal, Boolean, LocalDateTime, String, String, String, String, String, String, Boolean, String, LocalDateTime, String, LocalDateTime, String> valuesRow() {
        return (Row21) super.valuesRow();
    }

    @Override
    public Field<String> field1() {
        return FDebt.F_DEBT.KEY;
    }

    @Override
    public Field<String> field2() {
        return FDebt.F_DEBT.NAME;
    }

    @Override
    public Field<String> field3() {
        return FDebt.F_DEBT.CODE;
    }

    @Override
    public Field<String> field4() {
        return FDebt.F_DEBT.SERIAL;
    }

    @Override
    public Field<String> field5() {
        return FDebt.F_DEBT.TYPE;
    }

    @Override
    public Field<BigDecimal> field6() {
        return FDebt.F_DEBT.AMOUNT;
    }

    @Override
    public Field<BigDecimal> field7() {
        return FDebt.F_DEBT.AMOUNT_BALANCE;
    }

    @Override
    public Field<Boolean> field8() {
        return FDebt.F_DEBT.FINISHED;
    }

    @Override
    public Field<LocalDateTime> field9() {
        return FDebt.F_DEBT.FINISHED_AT;
    }

    @Override
    public Field<String> field10() {
        return FDebt.F_DEBT.SIGN_NAME;
    }

    @Override
    public Field<String> field11() {
        return FDebt.F_DEBT.SIGN_MOBILE;
    }

    @Override
    public Field<String> field12() {
        return FDebt.F_DEBT.COMMENT;
    }

    @Override
    public Field<String> field13() {
        return FDebt.F_DEBT.CUSTOMER_ID;
    }

    @Override
    public Field<String> field14() {
        return FDebt.F_DEBT.SIGMA;
    }

    @Override
    public Field<String> field15() {
        return FDebt.F_DEBT.LANGUAGE;
    }

    @Override
    public Field<Boolean> field16() {
        return FDebt.F_DEBT.ACTIVE;
    }

    @Override
    public Field<String> field17() {
        return FDebt.F_DEBT.METADATA;
    }

    @Override
    public Field<LocalDateTime> field18() {
        return FDebt.F_DEBT.CREATED_AT;
    }

    @Override
    public Field<String> field19() {
        return FDebt.F_DEBT.CREATED_BY;
    }

    @Override
    public Field<LocalDateTime> field20() {
        return FDebt.F_DEBT.UPDATED_AT;
    }

    @Override
    public Field<String> field21() {
        return FDebt.F_DEBT.UPDATED_BY;
    }

    @Override
    public String component1() {
        return getKey();
    }

    @Override
    public String component2() {
        return getName();
    }

    @Override
    public String component3() {
        return getCode();
    }

    @Override
    public String component4() {
        return getSerial();
    }

    @Override
    public String component5() {
        return getType();
    }

    @Override
    public BigDecimal component6() {
        return getAmount();
    }

    @Override
    public BigDecimal component7() {
        return getAmountBalance();
    }

    @Override
    public Boolean component8() {
        return getFinished();
    }

    @Override
    public LocalDateTime component9() {
        return getFinishedAt();
    }

    @Override
    public String component10() {
        return getSignName();
    }

    @Override
    public String component11() {
        return getSignMobile();
    }

    @Override
    public String component12() {
        return getComment();
    }

    @Override
    public String component13() {
        return getCustomerId();
    }

    @Override
    public String component14() {
        return getSigma();
    }

    @Override
    public String component15() {
        return getLanguage();
    }

    @Override
    public Boolean component16() {
        return getActive();
    }

    @Override
    public String component17() {
        return getMetadata();
    }

    @Override
    public LocalDateTime component18() {
        return getCreatedAt();
    }

    @Override
    public String component19() {
        return getCreatedBy();
    }

    @Override
    public LocalDateTime component20() {
        return getUpdatedAt();
    }

    @Override
    public String component21() {
        return getUpdatedBy();
    }

    @Override
    public String value1() {
        return getKey();
    }

    @Override
    public String value2() {
        return getName();
    }

    @Override
    public String value3() {
        return getCode();
    }

    @Override
    public String value4() {
        return getSerial();
    }

    @Override
    public String value5() {
        return getType();
    }

    @Override
    public BigDecimal value6() {
        return getAmount();
    }

    @Override
    public BigDecimal value7() {
        return getAmountBalance();
    }

    @Override
    public Boolean value8() {
        return getFinished();
    }

    @Override
    public LocalDateTime value9() {
        return getFinishedAt();
    }

    @Override
    public String value10() {
        return getSignName();
    }

    @Override
    public String value11() {
        return getSignMobile();
    }

    @Override
    public String value12() {
        return getComment();
    }

    @Override
    public String value13() {
        return getCustomerId();
    }

    @Override
    public String value14() {
        return getSigma();
    }

    @Override
    public String value15() {
        return getLanguage();
    }

    @Override
    public Boolean value16() {
        return getActive();
    }

    @Override
    public String value17() {
        return getMetadata();
    }

    @Override
    public LocalDateTime value18() {
        return getCreatedAt();
    }

    @Override
    public String value19() {
        return getCreatedBy();
    }

    @Override
    public LocalDateTime value20() {
        return getUpdatedAt();
    }

    @Override
    public String value21() {
        return getUpdatedBy();
    }

    @Override
    public FDebtRecord value1(String value) {
        setKey(value);
        return this;
    }

    @Override
    public FDebtRecord value2(String value) {
        setName(value);
        return this;
    }

    @Override
    public FDebtRecord value3(String value) {
        setCode(value);
        return this;
    }

    @Override
    public FDebtRecord value4(String value) {
        setSerial(value);
        return this;
    }

    @Override
    public FDebtRecord value5(String value) {
        setType(value);
        return this;
    }

    @Override
    public FDebtRecord value6(BigDecimal value) {
        setAmount(value);
        return this;
    }

    @Override
    public FDebtRecord value7(BigDecimal value) {
        setAmountBalance(value);
        return this;
    }

    @Override
    public FDebtRecord value8(Boolean value) {
        setFinished(value);
        return this;
    }

    @Override
    public FDebtRecord value9(LocalDateTime value) {
        setFinishedAt(value);
        return this;
    }

    @Override
    public FDebtRecord value10(String value) {
        setSignName(value);
        return this;
    }

    @Override
    public FDebtRecord value11(String value) {
        setSignMobile(value);
        return this;
    }

    @Override
    public FDebtRecord value12(String value) {
        setComment(value);
        return this;
    }

    @Override
    public FDebtRecord value13(String value) {
        setCustomerId(value);
        return this;
    }

    @Override
    public FDebtRecord value14(String value) {
        setSigma(value);
        return this;
    }

    @Override
    public FDebtRecord value15(String value) {
        setLanguage(value);
        return this;
    }

    @Override
    public FDebtRecord value16(Boolean value) {
        setActive(value);
        return this;
    }

    @Override
    public FDebtRecord value17(String value) {
        setMetadata(value);
        return this;
    }

    @Override
    public FDebtRecord value18(LocalDateTime value) {
        setCreatedAt(value);
        return this;
    }

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    @Override
    public FDebtRecord value19(String value) {
        setCreatedBy(value);
        return this;
    }

    @Override
    public FDebtRecord value20(LocalDateTime value) {
        setUpdatedAt(value);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    @Override
    public FDebtRecord value21(String value) {
        setUpdatedBy(value);
        return this;
    }

    @Override
    public FDebtRecord values(String value1, String value2, String value3, String value4, String value5, BigDecimal value6, BigDecimal value7, Boolean value8, LocalDateTime value9, String value10, String value11, String value12, String value13, String value14, String value15, Boolean value16, String value17, LocalDateTime value18, String value19, LocalDateTime value20, String value21) {
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
        return this;
    }

    @Override
    public void from(IFDebt from) {
        setKey(from.getKey());
        setName(from.getName());
        setCode(from.getCode());
        setSerial(from.getSerial());
        setType(from.getType());
        setAmount(from.getAmount());
        setAmountBalance(from.getAmountBalance());
        setFinished(from.getFinished());
        setFinishedAt(from.getFinishedAt());
        setSignName(from.getSignName());
        setSignMobile(from.getSignMobile());
        setComment(from.getComment());
        setCustomerId(from.getCustomerId());
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
    public <E extends IFDebt> E into(E into) {
        into.from(this);
        return into;
    }
}