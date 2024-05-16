/*
 * This file is generated by jOOQ.
 */
package io.zerows.extension.commerce.documentation.domain.tables.records;


import io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo;
import io.zerows.extension.commerce.documentation.domain.tables.DQanswer;
import io.zerows.extension.commerce.documentation.domain.tables.interfaces.IDQanswer;
import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record14;
import org.jooq.Row14;
import org.jooq.impl.UpdatableRecordImpl;

import java.time.LocalDateTime;

/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({"all", "unchecked", "rawtypes"})
public class DQanswerRecord extends UpdatableRecordImpl<DQanswerRecord> implements VertxPojo, Record14<String, String, String, String, String, String, String, String, Boolean, String, LocalDateTime, String, LocalDateTime, String>, IDQanswer {

    private static final long serialVersionUID = 1L;

    /**
     * Create a detached DQanswerRecord
     */
    public DQanswerRecord() {
        super(DQanswer.D_QANSWER);
    }

    /**
     * Create a detached, initialised DQanswerRecord
     */
    public DQanswerRecord(String key, String code, String name, String brief, String uiConfig, String questionId, String sigma, String language, Boolean active, String metadata, LocalDateTime createdAt, String createdBy, LocalDateTime updatedAt, String updatedBy) {
        super(DQanswer.D_QANSWER);

        setKey(key);
        setCode(code);
        setName(name);
        setBrief(brief);
        setUiConfig(uiConfig);
        setQuestionId(questionId);
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
     * Create a detached, initialised DQanswerRecord
     */
    public DQanswerRecord(io.zerows.extension.commerce.documentation.domain.tables.pojos.DQanswer value) {
        super(DQanswer.D_QANSWER);

        if (value != null) {
            setKey(value.getKey());
            setCode(value.getCode());
            setName(value.getName());
            setBrief(value.getBrief());
            setUiConfig(value.getUiConfig());
            setQuestionId(value.getQuestionId());
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

    public DQanswerRecord(io.vertx.core.json.JsonObject json) {
        this();
        fromJson(json);
    }

    /**
     * Getter for <code>ZDB.D_QANSWER.KEY</code>. 「key」- 答题主键
     */
    @Override
    public String getKey() {
        return (String) get(0);
    }

    /**
     * Setter for <code>ZDB.D_QANSWER.KEY</code>. 「key」- 答题主键
     */
    @Override
    public DQanswerRecord setKey(String value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.D_QANSWER.CODE</code>. 「code」- 答案编号
     */
    @Override
    public String getCode() {
        return (String) get(1);
    }

    /**
     * Setter for <code>ZDB.D_QANSWER.CODE</code>. 「code」- 答案编号
     */
    @Override
    public DQanswerRecord setCode(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.D_QANSWER.NAME</code>. 「name」- 答案内容
     */
    @Override
    public String getName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>ZDB.D_QANSWER.NAME</code>. 「name」- 答案内容
     */
    @Override
    public DQanswerRecord setName(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.D_QANSWER.BRIEF</code>. 「brief」- 答案详细描述
     */
    @Override
    public String getBrief() {
        return (String) get(3);
    }

    /**
     * Setter for <code>ZDB.D_QANSWER.BRIEF</code>. 「brief」- 答案详细描述
     */
    @Override
    public DQanswerRecord setBrief(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.D_QANSWER.UI_CONFIG</code>. 「uiConfig」- 答案呈现模式
     */
    @Override
    public String getUiConfig() {
        return (String) get(4);
    }

    /**
     * Setter for <code>ZDB.D_QANSWER.UI_CONFIG</code>. 「uiConfig」- 答案呈现模式
     */
    @Override
    public DQanswerRecord setUiConfig(String value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.D_QANSWER.QUESTION_ID</code>. 「questionId」- 所属问题
     */
    @Override
    public String getQuestionId() {
        return (String) get(5);
    }

    /**
     * Setter for <code>ZDB.D_QANSWER.QUESTION_ID</code>. 「questionId」- 所属问题
     */
    @Override
    public DQanswerRecord setQuestionId(String value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.D_QANSWER.SIGMA</code>. 「sigma」- 统一标识
     */
    @Override
    public String getSigma() {
        return (String) get(6);
    }

    /**
     * Setter for <code>ZDB.D_QANSWER.SIGMA</code>. 「sigma」- 统一标识
     */
    @Override
    public DQanswerRecord setSigma(String value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.D_QANSWER.LANGUAGE</code>. 「language」- 使用的语言
     */
    @Override
    public String getLanguage() {
        return (String) get(7);
    }

    /**
     * Setter for <code>ZDB.D_QANSWER.LANGUAGE</code>. 「language」- 使用的语言
     */
    @Override
    public DQanswerRecord setLanguage(String value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.D_QANSWER.ACTIVE</code>. 「active」- 是否启用
     */
    @Override
    public Boolean getActive() {
        return (Boolean) get(8);
    }

    /**
     * Setter for <code>ZDB.D_QANSWER.ACTIVE</code>. 「active」- 是否启用
     */
    @Override
    public DQanswerRecord setActive(Boolean value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.D_QANSWER.METADATA</code>. 「metadata」- 附加配置数据
     */
    @Override
    public String getMetadata() {
        return (String) get(9);
    }

    /**
     * Setter for <code>ZDB.D_QANSWER.METADATA</code>. 「metadata」- 附加配置数据
     */
    @Override
    public DQanswerRecord setMetadata(String value) {
        set(9, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.D_QANSWER.CREATED_AT</code>. 「createdAt」- 创建时间
     */
    @Override
    public LocalDateTime getCreatedAt() {
        return (LocalDateTime) get(10);
    }

    /**
     * Setter for <code>ZDB.D_QANSWER.CREATED_AT</code>. 「createdAt」- 创建时间
     */
    @Override
    public DQanswerRecord setCreatedAt(LocalDateTime value) {
        set(10, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.D_QANSWER.CREATED_BY</code>. 「createdBy」- 创建人
     */
    @Override
    public String getCreatedBy() {
        return (String) get(11);
    }

    /**
     * Setter for <code>ZDB.D_QANSWER.CREATED_BY</code>. 「createdBy」- 创建人
     */
    @Override
    public DQanswerRecord setCreatedBy(String value) {
        set(11, value);
        return this;
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * Getter for <code>ZDB.D_QANSWER.UPDATED_AT</code>. 「updatedAt」- 更新时间
     */
    @Override
    public LocalDateTime getUpdatedAt() {
        return (LocalDateTime) get(12);
    }

    // -------------------------------------------------------------------------
    // Record14 type implementation
    // -------------------------------------------------------------------------

    /**
     * Setter for <code>ZDB.D_QANSWER.UPDATED_AT</code>. 「updatedAt」- 更新时间
     */
    @Override
    public DQanswerRecord setUpdatedAt(LocalDateTime value) {
        set(12, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.D_QANSWER.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    @Override
    public String getUpdatedBy() {
        return (String) get(13);
    }

    /**
     * Setter for <code>ZDB.D_QANSWER.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    @Override
    public DQanswerRecord setUpdatedBy(String value) {
        set(13, value);
        return this;
    }

    @Override
    public Record1<String> key() {
        return (Record1) super.key();
    }

    @Override
    public Row14<String, String, String, String, String, String, String, String, Boolean, String, LocalDateTime, String, LocalDateTime, String> fieldsRow() {
        return (Row14) super.fieldsRow();
    }

    @Override
    public Row14<String, String, String, String, String, String, String, String, Boolean, String, LocalDateTime, String, LocalDateTime, String> valuesRow() {
        return (Row14) super.valuesRow();
    }

    @Override
    public Field<String> field1() {
        return DQanswer.D_QANSWER.KEY;
    }

    @Override
    public Field<String> field2() {
        return DQanswer.D_QANSWER.CODE;
    }

    @Override
    public Field<String> field3() {
        return DQanswer.D_QANSWER.NAME;
    }

    @Override
    public Field<String> field4() {
        return DQanswer.D_QANSWER.BRIEF;
    }

    @Override
    public Field<String> field5() {
        return DQanswer.D_QANSWER.UI_CONFIG;
    }

    @Override
    public Field<String> field6() {
        return DQanswer.D_QANSWER.QUESTION_ID;
    }

    @Override
    public Field<String> field7() {
        return DQanswer.D_QANSWER.SIGMA;
    }

    @Override
    public Field<String> field8() {
        return DQanswer.D_QANSWER.LANGUAGE;
    }

    @Override
    public Field<Boolean> field9() {
        return DQanswer.D_QANSWER.ACTIVE;
    }

    @Override
    public Field<String> field10() {
        return DQanswer.D_QANSWER.METADATA;
    }

    @Override
    public Field<LocalDateTime> field11() {
        return DQanswer.D_QANSWER.CREATED_AT;
    }

    @Override
    public Field<String> field12() {
        return DQanswer.D_QANSWER.CREATED_BY;
    }

    @Override
    public Field<LocalDateTime> field13() {
        return DQanswer.D_QANSWER.UPDATED_AT;
    }

    @Override
    public Field<String> field14() {
        return DQanswer.D_QANSWER.UPDATED_BY;
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
        return getName();
    }

    @Override
    public String component4() {
        return getBrief();
    }

    @Override
    public String component5() {
        return getUiConfig();
    }

    @Override
    public String component6() {
        return getQuestionId();
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
        return getCode();
    }

    @Override
    public String value3() {
        return getName();
    }

    @Override
    public String value4() {
        return getBrief();
    }

    @Override
    public String value5() {
        return getUiConfig();
    }

    @Override
    public String value6() {
        return getQuestionId();
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
    public DQanswerRecord value1(String value) {
        setKey(value);
        return this;
    }

    @Override
    public DQanswerRecord value2(String value) {
        setCode(value);
        return this;
    }

    @Override
    public DQanswerRecord value3(String value) {
        setName(value);
        return this;
    }

    @Override
    public DQanswerRecord value4(String value) {
        setBrief(value);
        return this;
    }

    @Override
    public DQanswerRecord value5(String value) {
        setUiConfig(value);
        return this;
    }

    @Override
    public DQanswerRecord value6(String value) {
        setQuestionId(value);
        return this;
    }

    @Override
    public DQanswerRecord value7(String value) {
        setSigma(value);
        return this;
    }

    @Override
    public DQanswerRecord value8(String value) {
        setLanguage(value);
        return this;
    }

    @Override
    public DQanswerRecord value9(Boolean value) {
        setActive(value);
        return this;
    }

    @Override
    public DQanswerRecord value10(String value) {
        setMetadata(value);
        return this;
    }

    @Override
    public DQanswerRecord value11(LocalDateTime value) {
        setCreatedAt(value);
        return this;
    }

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    @Override
    public DQanswerRecord value12(String value) {
        setCreatedBy(value);
        return this;
    }

    @Override
    public DQanswerRecord value13(LocalDateTime value) {
        setUpdatedAt(value);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    @Override
    public DQanswerRecord value14(String value) {
        setUpdatedBy(value);
        return this;
    }

    @Override
    public DQanswerRecord values(String value1, String value2, String value3, String value4, String value5, String value6, String value7, String value8, Boolean value9, String value10, LocalDateTime value11, String value12, LocalDateTime value13, String value14) {
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

    @Override
    public void from(IDQanswer from) {
        setKey(from.getKey());
        setCode(from.getCode());
        setName(from.getName());
        setBrief(from.getBrief());
        setUiConfig(from.getUiConfig());
        setQuestionId(from.getQuestionId());
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
    public <E extends IDQanswer> E into(E into) {
        into.from(this);
        return into;
    }
}