/*
 * This file is generated by jOOQ.
 */
package io.zerows.extension.commerce.finance.domain.tables.records;


import io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo;
import io.zerows.extension.commerce.finance.domain.tables.FCurrency;
import io.zerows.extension.commerce.finance.domain.tables.interfaces.IFCurrency;

import java.time.LocalDateTime;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record14;
import org.jooq.Row14;
import org.jooq.impl.UpdatableRecordImpl;


import static io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo.*;
/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class FCurrencyRecord extends UpdatableRecordImpl<FCurrencyRecord> implements VertxPojo, Record14<String, String, String, String, Integer, Integer, String, String, Boolean, String, LocalDateTime, String, LocalDateTime, String>, IFCurrency {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>ZDB.F_CURRENCY.KEY</code>. 「key」- 币种主键
     */
    @Override
    public FCurrencyRecord setKey(String value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.F_CURRENCY.KEY</code>. 「key」- 币种主键
     */
    @Override
    public String getKey() {
        return (String) get(0);
    }

    /**
     * Setter for <code>ZDB.F_CURRENCY.NAME</code>. 「name」- 币种名称
     */
    @Override
    public FCurrencyRecord setName(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.F_CURRENCY.NAME</code>. 「name」- 币种名称
     */
    @Override
    public String getName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>ZDB.F_CURRENCY.CODE</code>. 「code」- 币种编码
     */
    @Override
    public FCurrencyRecord setCode(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.F_CURRENCY.CODE</code>. 「code」- 币种编码
     */
    @Override
    public String getCode() {
        return (String) get(2);
    }

    /**
     * Setter for <code>ZDB.F_CURRENCY.COMMENT</code>. 「comment」 - 币种备注
     */
    @Override
    public FCurrencyRecord setComment(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.F_CURRENCY.COMMENT</code>. 「comment」 - 币种备注
     */
    @Override
    public String getComment() {
        return (String) get(3);
    }

    /**
     * Setter for <code>ZDB.F_CURRENCY.DIGIT_AMOUNT</code>. 「digitAmount」-
     * 金额小数位数
     */
    @Override
    public FCurrencyRecord setDigitAmount(Integer value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.F_CURRENCY.DIGIT_AMOUNT</code>. 「digitAmount」-
     * 金额小数位数
     */
    @Override
    public Integer getDigitAmount() {
        return (Integer) get(4);
    }

    /**
     * Setter for <code>ZDB.F_CURRENCY.DIGIT_PRICE</code>. 「digitPrice」- 单价小数位数
     */
    @Override
    public FCurrencyRecord setDigitPrice(Integer value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.F_CURRENCY.DIGIT_PRICE</code>. 「digitPrice」- 单价小数位数
     */
    @Override
    public Integer getDigitPrice() {
        return (Integer) get(5);
    }

    /**
     * Setter for <code>ZDB.F_CURRENCY.SIGMA</code>. 「sigma」- 统一标识
     */
    @Override
    public FCurrencyRecord setSigma(String value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.F_CURRENCY.SIGMA</code>. 「sigma」- 统一标识
     */
    @Override
    public String getSigma() {
        return (String) get(6);
    }

    /**
     * Setter for <code>ZDB.F_CURRENCY.LANGUAGE</code>. 「language」- 使用的语言
     */
    @Override
    public FCurrencyRecord setLanguage(String value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.F_CURRENCY.LANGUAGE</code>. 「language」- 使用的语言
     */
    @Override
    public String getLanguage() {
        return (String) get(7);
    }

    /**
     * Setter for <code>ZDB.F_CURRENCY.ACTIVE</code>. 「active」- 是否启用
     */
    @Override
    public FCurrencyRecord setActive(Boolean value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.F_CURRENCY.ACTIVE</code>. 「active」- 是否启用
     */
    @Override
    public Boolean getActive() {
        return (Boolean) get(8);
    }

    /**
     * Setter for <code>ZDB.F_CURRENCY.METADATA</code>. 「metadata」- 附加配置数据
     */
    @Override
    public FCurrencyRecord setMetadata(String value) {
        set(9, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.F_CURRENCY.METADATA</code>. 「metadata」- 附加配置数据
     */
    @Override
    public String getMetadata() {
        return (String) get(9);
    }

    /**
     * Setter for <code>ZDB.F_CURRENCY.CREATED_AT</code>. 「createdAt」- 创建时间
     */
    @Override
    public FCurrencyRecord setCreatedAt(LocalDateTime value) {
        set(10, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.F_CURRENCY.CREATED_AT</code>. 「createdAt」- 创建时间
     */
    @Override
    public LocalDateTime getCreatedAt() {
        return (LocalDateTime) get(10);
    }

    /**
     * Setter for <code>ZDB.F_CURRENCY.CREATED_BY</code>. 「createdBy」- 创建人
     */
    @Override
    public FCurrencyRecord setCreatedBy(String value) {
        set(11, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.F_CURRENCY.CREATED_BY</code>. 「createdBy」- 创建人
     */
    @Override
    public String getCreatedBy() {
        return (String) get(11);
    }

    /**
     * Setter for <code>ZDB.F_CURRENCY.UPDATED_AT</code>. 「updatedAt」- 更新时间
     */
    @Override
    public FCurrencyRecord setUpdatedAt(LocalDateTime value) {
        set(12, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.F_CURRENCY.UPDATED_AT</code>. 「updatedAt」- 更新时间
     */
    @Override
    public LocalDateTime getUpdatedAt() {
        return (LocalDateTime) get(12);
    }

    /**
     * Setter for <code>ZDB.F_CURRENCY.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    @Override
    public FCurrencyRecord setUpdatedBy(String value) {
        set(13, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.F_CURRENCY.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    @Override
    public String getUpdatedBy() {
        return (String) get(13);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<String> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record14 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row14<String, String, String, String, Integer, Integer, String, String, Boolean, String, LocalDateTime, String, LocalDateTime, String> fieldsRow() {
        return (Row14) super.fieldsRow();
    }

    @Override
    public Row14<String, String, String, String, Integer, Integer, String, String, Boolean, String, LocalDateTime, String, LocalDateTime, String> valuesRow() {
        return (Row14) super.valuesRow();
    }

    @Override
    public Field<String> field1() {
        return FCurrency.F_CURRENCY.KEY;
    }

    @Override
    public Field<String> field2() {
        return FCurrency.F_CURRENCY.NAME;
    }

    @Override
    public Field<String> field3() {
        return FCurrency.F_CURRENCY.CODE;
    }

    @Override
    public Field<String> field4() {
        return FCurrency.F_CURRENCY.COMMENT;
    }

    @Override
    public Field<Integer> field5() {
        return FCurrency.F_CURRENCY.DIGIT_AMOUNT;
    }

    @Override
    public Field<Integer> field6() {
        return FCurrency.F_CURRENCY.DIGIT_PRICE;
    }

    @Override
    public Field<String> field7() {
        return FCurrency.F_CURRENCY.SIGMA;
    }

    @Override
    public Field<String> field8() {
        return FCurrency.F_CURRENCY.LANGUAGE;
    }

    @Override
    public Field<Boolean> field9() {
        return FCurrency.F_CURRENCY.ACTIVE;
    }

    @Override
    public Field<String> field10() {
        return FCurrency.F_CURRENCY.METADATA;
    }

    @Override
    public Field<LocalDateTime> field11() {
        return FCurrency.F_CURRENCY.CREATED_AT;
    }

    @Override
    public Field<String> field12() {
        return FCurrency.F_CURRENCY.CREATED_BY;
    }

    @Override
    public Field<LocalDateTime> field13() {
        return FCurrency.F_CURRENCY.UPDATED_AT;
    }

    @Override
    public Field<String> field14() {
        return FCurrency.F_CURRENCY.UPDATED_BY;
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
        return getComment();
    }

    @Override
    public Integer component5() {
        return getDigitAmount();
    }

    @Override
    public Integer component6() {
        return getDigitPrice();
    }

    @Override
    public String component7() {
        return getSigma();
    }

    @Override
    public String component8() {
        return getLanguage();
    }

    @Override
    public Boolean component9() {
        return getActive();
    }

    @Override
    public String component10() {
        return getMetadata();
    }

    @Override
    public LocalDateTime component11() {
        return getCreatedAt();
    }

    @Override
    public String component12() {
        return getCreatedBy();
    }

    @Override
    public LocalDateTime component13() {
        return getUpdatedAt();
    }

    @Override
    public String component14() {
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
        return getComment();
    }

    @Override
    public Integer value5() {
        return getDigitAmount();
    }

    @Override
    public Integer value6() {
        return getDigitPrice();
    }

    @Override
    public String value7() {
        return getSigma();
    }

    @Override
    public String value8() {
        return getLanguage();
    }

    @Override
    public Boolean value9() {
        return getActive();
    }

    @Override
    public String value10() {
        return getMetadata();
    }

    @Override
    public LocalDateTime value11() {
        return getCreatedAt();
    }

    @Override
    public String value12() {
        return getCreatedBy();
    }

    @Override
    public LocalDateTime value13() {
        return getUpdatedAt();
    }

    @Override
    public String value14() {
        return getUpdatedBy();
    }

    @Override
    public FCurrencyRecord value1(String value) {
        setKey(value);
        return this;
    }

    @Override
    public FCurrencyRecord value2(String value) {
        setName(value);
        return this;
    }

    @Override
    public FCurrencyRecord value3(String value) {
        setCode(value);
        return this;
    }

    @Override
    public FCurrencyRecord value4(String value) {
        setComment(value);
        return this;
    }

    @Override
    public FCurrencyRecord value5(Integer value) {
        setDigitAmount(value);
        return this;
    }

    @Override
    public FCurrencyRecord value6(Integer value) {
        setDigitPrice(value);
        return this;
    }

    @Override
    public FCurrencyRecord value7(String value) {
        setSigma(value);
        return this;
    }

    @Override
    public FCurrencyRecord value8(String value) {
        setLanguage(value);
        return this;
    }

    @Override
    public FCurrencyRecord value9(Boolean value) {
        setActive(value);
        return this;
    }

    @Override
    public FCurrencyRecord value10(String value) {
        setMetadata(value);
        return this;
    }

    @Override
    public FCurrencyRecord value11(LocalDateTime value) {
        setCreatedAt(value);
        return this;
    }

    @Override
    public FCurrencyRecord value12(String value) {
        setCreatedBy(value);
        return this;
    }

    @Override
    public FCurrencyRecord value13(LocalDateTime value) {
        setUpdatedAt(value);
        return this;
    }

    @Override
    public FCurrencyRecord value14(String value) {
        setUpdatedBy(value);
        return this;
    }

    @Override
    public FCurrencyRecord values(String value1, String value2, String value3, String value4, Integer value5, Integer value6, String value7, String value8, Boolean value9, String value10, LocalDateTime value11, String value12, LocalDateTime value13, String value14) {
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
        return this;
    }

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    @Override
    public void from(IFCurrency from) {
        setKey(from.getKey());
        setName(from.getName());
        setCode(from.getCode());
        setComment(from.getComment());
        setDigitAmount(from.getDigitAmount());
        setDigitPrice(from.getDigitPrice());
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
    public <E extends IFCurrency> E into(E into) {
        into.from(this);
        return into;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached FCurrencyRecord
     */
    public FCurrencyRecord() {
        super(FCurrency.F_CURRENCY);
    }

    /**
     * Create a detached, initialised FCurrencyRecord
     */
    public FCurrencyRecord(String key, String name, String code, String comment, Integer digitAmount, Integer digitPrice, String sigma, String language, Boolean active, String metadata, LocalDateTime createdAt, String createdBy, LocalDateTime updatedAt, String updatedBy) {
        super(FCurrency.F_CURRENCY);

        setKey(key);
        setName(name);
        setCode(code);
        setComment(comment);
        setDigitAmount(digitAmount);
        setDigitPrice(digitPrice);
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
     * Create a detached, initialised FCurrencyRecord
     */
    public FCurrencyRecord(io.zerows.extension.commerce.finance.domain.tables.pojos.FCurrency value) {
        super(FCurrency.F_CURRENCY);

        if (value != null) {
            setKey(value.getKey());
            setName(value.getName());
            setCode(value.getCode());
            setComment(value.getComment());
            setDigitAmount(value.getDigitAmount());
            setDigitPrice(value.getDigitPrice());
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

        public FCurrencyRecord(io.vertx.core.json.JsonObject json) {
                this();
                fromJson(json);
        }
}
