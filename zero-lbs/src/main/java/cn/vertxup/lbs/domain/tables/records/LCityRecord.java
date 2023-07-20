/*
 * This file is generated by jOOQ.
 */
package cn.vertxup.lbs.domain.tables.records;


import cn.vertxup.lbs.domain.tables.LCity;
import cn.vertxup.lbs.domain.tables.interfaces.ILCity;

import io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo;

import java.time.LocalDateTime;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record13;
import org.jooq.Row13;
import org.jooq.impl.UpdatableRecordImpl;


import static io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo.*;
/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class LCityRecord extends UpdatableRecordImpl<LCityRecord> implements VertxPojo, Record13<String, String, String, String, Integer, String, Boolean, String, String, LocalDateTime, String, LocalDateTime, String>, ILCity {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>ZDB.L_CITY.KEY</code>. 「key」- 主键
     */
    @Override
    public LCityRecord setKey(String value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.L_CITY.KEY</code>. 「key」- 主键
     */
    @Override
    public String getKey() {
        return (String) get(0);
    }

    /**
     * Setter for <code>ZDB.L_CITY.NAME</code>. 「name」- 名称
     */
    @Override
    public LCityRecord setName(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.L_CITY.NAME</code>. 「name」- 名称
     */
    @Override
    public String getName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>ZDB.L_CITY.CODE</code>. 「code」- 编码
     */
    @Override
    public LCityRecord setCode(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.L_CITY.CODE</code>. 「code」- 编码
     */
    @Override
    public String getCode() {
        return (String) get(2);
    }

    /**
     * Setter for <code>ZDB.L_CITY.METADATA</code>. 「metadata」- 附加配置
     */
    @Override
    public LCityRecord setMetadata(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.L_CITY.METADATA</code>. 「metadata」- 附加配置
     */
    @Override
    public String getMetadata() {
        return (String) get(3);
    }

    /**
     * Setter for <code>ZDB.L_CITY.ORDER</code>. 「order」- 排序
     */
    @Override
    public LCityRecord setOrder(Integer value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.L_CITY.ORDER</code>. 「order」- 排序
     */
    @Override
    public Integer getOrder() {
        return (Integer) get(4);
    }

    /**
     * Setter for <code>ZDB.L_CITY.STATE_ID</code>. 「stateId」- 省会ID
     */
    @Override
    public LCityRecord setStateId(String value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.L_CITY.STATE_ID</code>. 「stateId」- 省会ID
     */
    @Override
    public String getStateId() {
        return (String) get(5);
    }

    /**
     * Setter for <code>ZDB.L_CITY.ACTIVE</code>. 「active」- 是否启用
     */
    @Override
    public LCityRecord setActive(Boolean value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.L_CITY.ACTIVE</code>. 「active」- 是否启用
     */
    @Override
    public Boolean getActive() {
        return (Boolean) get(6);
    }

    /**
     * Setter for <code>ZDB.L_CITY.SIGMA</code>. 「sigma」- 统一标识
     */
    @Override
    public LCityRecord setSigma(String value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.L_CITY.SIGMA</code>. 「sigma」- 统一标识
     */
    @Override
    public String getSigma() {
        return (String) get(7);
    }

    /**
     * Setter for <code>ZDB.L_CITY.LANGUAGE</code>. 「language」- 使用的语言
     */
    @Override
    public LCityRecord setLanguage(String value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.L_CITY.LANGUAGE</code>. 「language」- 使用的语言
     */
    @Override
    public String getLanguage() {
        return (String) get(8);
    }

    /**
     * Setter for <code>ZDB.L_CITY.CREATED_AT</code>. 「createdAt」- 创建时间
     */
    @Override
    public LCityRecord setCreatedAt(LocalDateTime value) {
        set(9, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.L_CITY.CREATED_AT</code>. 「createdAt」- 创建时间
     */
    @Override
    public LocalDateTime getCreatedAt() {
        return (LocalDateTime) get(9);
    }

    /**
     * Setter for <code>ZDB.L_CITY.CREATED_BY</code>. 「createdBy」- 创建人
     */
    @Override
    public LCityRecord setCreatedBy(String value) {
        set(10, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.L_CITY.CREATED_BY</code>. 「createdBy」- 创建人
     */
    @Override
    public String getCreatedBy() {
        return (String) get(10);
    }

    /**
     * Setter for <code>ZDB.L_CITY.UPDATED_AT</code>. 「updatedAt」- 更新时间
     */
    @Override
    public LCityRecord setUpdatedAt(LocalDateTime value) {
        set(11, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.L_CITY.UPDATED_AT</code>. 「updatedAt」- 更新时间
     */
    @Override
    public LocalDateTime getUpdatedAt() {
        return (LocalDateTime) get(11);
    }

    /**
     * Setter for <code>ZDB.L_CITY.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    @Override
    public LCityRecord setUpdatedBy(String value) {
        set(12, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.L_CITY.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    @Override
    public String getUpdatedBy() {
        return (String) get(12);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<String> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record13 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row13<String, String, String, String, Integer, String, Boolean, String, String, LocalDateTime, String, LocalDateTime, String> fieldsRow() {
        return (Row13) super.fieldsRow();
    }

    @Override
    public Row13<String, String, String, String, Integer, String, Boolean, String, String, LocalDateTime, String, LocalDateTime, String> valuesRow() {
        return (Row13) super.valuesRow();
    }

    @Override
    public Field<String> field1() {
        return LCity.L_CITY.KEY;
    }

    @Override
    public Field<String> field2() {
        return LCity.L_CITY.NAME;
    }

    @Override
    public Field<String> field3() {
        return LCity.L_CITY.CODE;
    }

    @Override
    public Field<String> field4() {
        return LCity.L_CITY.METADATA;
    }

    @Override
    public Field<Integer> field5() {
        return LCity.L_CITY.ORDER;
    }

    @Override
    public Field<String> field6() {
        return LCity.L_CITY.STATE_ID;
    }

    @Override
    public Field<Boolean> field7() {
        return LCity.L_CITY.ACTIVE;
    }

    @Override
    public Field<String> field8() {
        return LCity.L_CITY.SIGMA;
    }

    @Override
    public Field<String> field9() {
        return LCity.L_CITY.LANGUAGE;
    }

    @Override
    public Field<LocalDateTime> field10() {
        return LCity.L_CITY.CREATED_AT;
    }

    @Override
    public Field<String> field11() {
        return LCity.L_CITY.CREATED_BY;
    }

    @Override
    public Field<LocalDateTime> field12() {
        return LCity.L_CITY.UPDATED_AT;
    }

    @Override
    public Field<String> field13() {
        return LCity.L_CITY.UPDATED_BY;
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
        return getMetadata();
    }

    @Override
    public Integer component5() {
        return getOrder();
    }

    @Override
    public String component6() {
        return getStateId();
    }

    @Override
    public Boolean component7() {
        return getActive();
    }

    @Override
    public String component8() {
        return getSigma();
    }

    @Override
    public String component9() {
        return getLanguage();
    }

    @Override
    public LocalDateTime component10() {
        return getCreatedAt();
    }

    @Override
    public String component11() {
        return getCreatedBy();
    }

    @Override
    public LocalDateTime component12() {
        return getUpdatedAt();
    }

    @Override
    public String component13() {
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
        return getMetadata();
    }

    @Override
    public Integer value5() {
        return getOrder();
    }

    @Override
    public String value6() {
        return getStateId();
    }

    @Override
    public Boolean value7() {
        return getActive();
    }

    @Override
    public String value8() {
        return getSigma();
    }

    @Override
    public String value9() {
        return getLanguage();
    }

    @Override
    public LocalDateTime value10() {
        return getCreatedAt();
    }

    @Override
    public String value11() {
        return getCreatedBy();
    }

    @Override
    public LocalDateTime value12() {
        return getUpdatedAt();
    }

    @Override
    public String value13() {
        return getUpdatedBy();
    }

    @Override
    public LCityRecord value1(String value) {
        setKey(value);
        return this;
    }

    @Override
    public LCityRecord value2(String value) {
        setName(value);
        return this;
    }

    @Override
    public LCityRecord value3(String value) {
        setCode(value);
        return this;
    }

    @Override
    public LCityRecord value4(String value) {
        setMetadata(value);
        return this;
    }

    @Override
    public LCityRecord value5(Integer value) {
        setOrder(value);
        return this;
    }

    @Override
    public LCityRecord value6(String value) {
        setStateId(value);
        return this;
    }

    @Override
    public LCityRecord value7(Boolean value) {
        setActive(value);
        return this;
    }

    @Override
    public LCityRecord value8(String value) {
        setSigma(value);
        return this;
    }

    @Override
    public LCityRecord value9(String value) {
        setLanguage(value);
        return this;
    }

    @Override
    public LCityRecord value10(LocalDateTime value) {
        setCreatedAt(value);
        return this;
    }

    @Override
    public LCityRecord value11(String value) {
        setCreatedBy(value);
        return this;
    }

    @Override
    public LCityRecord value12(LocalDateTime value) {
        setUpdatedAt(value);
        return this;
    }

    @Override
    public LCityRecord value13(String value) {
        setUpdatedBy(value);
        return this;
    }

    @Override
    public LCityRecord values(String value1, String value2, String value3, String value4, Integer value5, String value6, Boolean value7, String value8, String value9, LocalDateTime value10, String value11, LocalDateTime value12, String value13) {
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
        return this;
    }

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    @Override
    public void from(ILCity from) {
        setKey(from.getKey());
        setName(from.getName());
        setCode(from.getCode());
        setMetadata(from.getMetadata());
        setOrder(from.getOrder());
        setStateId(from.getStateId());
        setActive(from.getActive());
        setSigma(from.getSigma());
        setLanguage(from.getLanguage());
        setCreatedAt(from.getCreatedAt());
        setCreatedBy(from.getCreatedBy());
        setUpdatedAt(from.getUpdatedAt());
        setUpdatedBy(from.getUpdatedBy());
        resetChangedOnNotNull();
    }

    @Override
    public <E extends ILCity> E into(E into) {
        into.from(this);
        return into;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached LCityRecord
     */
    public LCityRecord() {
        super(LCity.L_CITY);
    }

    /**
     * Create a detached, initialised LCityRecord
     */
    public LCityRecord(String key, String name, String code, String metadata, Integer order, String stateId, Boolean active, String sigma, String language, LocalDateTime createdAt, String createdBy, LocalDateTime updatedAt, String updatedBy) {
        super(LCity.L_CITY);

        setKey(key);
        setName(name);
        setCode(code);
        setMetadata(metadata);
        setOrder(order);
        setStateId(stateId);
        setActive(active);
        setSigma(sigma);
        setLanguage(language);
        setCreatedAt(createdAt);
        setCreatedBy(createdBy);
        setUpdatedAt(updatedAt);
        setUpdatedBy(updatedBy);
        resetChangedOnNotNull();
    }

    /**
     * Create a detached, initialised LCityRecord
     */
    public LCityRecord(cn.vertxup.lbs.domain.tables.pojos.LCity value) {
        super(LCity.L_CITY);

        if (value != null) {
            setKey(value.getKey());
            setName(value.getName());
            setCode(value.getCode());
            setMetadata(value.getMetadata());
            setOrder(value.getOrder());
            setStateId(value.getStateId());
            setActive(value.getActive());
            setSigma(value.getSigma());
            setLanguage(value.getLanguage());
            setCreatedAt(value.getCreatedAt());
            setCreatedBy(value.getCreatedBy());
            setUpdatedAt(value.getUpdatedAt());
            setUpdatedBy(value.getUpdatedBy());
            resetChangedOnNotNull();
        }
    }

        public LCityRecord(io.vertx.core.json.JsonObject json) {
                this();
                fromJson(json);
        }
}
