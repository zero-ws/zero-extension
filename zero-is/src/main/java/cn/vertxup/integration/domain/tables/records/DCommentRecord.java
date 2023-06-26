/*
 * This file is generated by jOOQ.
 */
package cn.vertxup.integration.domain.tables.records;


import cn.vertxup.integration.domain.tables.DComment;
import cn.vertxup.integration.domain.tables.interfaces.IDComment;

import io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo;

import java.time.LocalDateTime;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record18;
import org.jooq.Row18;
import org.jooq.impl.UpdatableRecordImpl;


import static io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo.*;
/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class DCommentRecord extends UpdatableRecordImpl<DCommentRecord> implements VertxPojo, Record18<String, String, String, String, Integer, String, String, String, String, String, Boolean, String, String, LocalDateTime, LocalDateTime, String, LocalDateTime, String>, IDComment {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>DB_ETERNAL.D_COMMENT.KEY</code>. 「key」- 解读主键
     */
    @Override
    public DCommentRecord setKey(String value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.D_COMMENT.KEY</code>. 「key」- 解读主键
     */
    @Override
    public String getKey() {
        return (String) get(0);
    }

    /**
     * Setter for <code>DB_ETERNAL.D_COMMENT.CODE</code>. 「code」- 备注编号
     */
    @Override
    public DCommentRecord setCode(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.D_COMMENT.CODE</code>. 「code」- 备注编号
     */
    @Override
    public String getCode() {
        return (String) get(1);
    }

    /**
     * Setter for <code>DB_ETERNAL.D_COMMENT.NAME</code>. 「name」- 备注标题
     */
    @Override
    public DCommentRecord setName(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.D_COMMENT.NAME</code>. 「name」- 备注标题
     */
    @Override
    public String getName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>DB_ETERNAL.D_COMMENT.TYPE</code>. 「type」- 备注类型
     */
    @Override
    public DCommentRecord setType(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.D_COMMENT.TYPE</code>. 「type」- 备注类型
     */
    @Override
    public String getType() {
        return (String) get(3);
    }

    /**
     * Setter for <code>DB_ETERNAL.D_COMMENT.SORT</code>. 「sort」- 备注排序
     */
    @Override
    public DCommentRecord setSort(Integer value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.D_COMMENT.SORT</code>. 「sort」- 备注排序
     */
    @Override
    public Integer getSort() {
        return (Integer) get(4);
    }

    /**
     * Setter for <code>DB_ETERNAL.D_COMMENT.CONTENT</code>. 「content」-
     * 备注内容、解读内容
     */
    @Override
    public DCommentRecord setContent(String value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.D_COMMENT.CONTENT</code>. 「content」-
     * 备注内容、解读内容
     */
    @Override
    public String getContent() {
        return (String) get(5);
    }

    /**
     * Setter for <code>DB_ETERNAL.D_COMMENT.MODEL_ID</code>. 「modelId」-
     * 关联的模型identifier，用于描述
     */
    @Override
    public DCommentRecord setModelId(String value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.D_COMMENT.MODEL_ID</code>. 「modelId」-
     * 关联的模型identifier，用于描述
     */
    @Override
    public String getModelId() {
        return (String) get(6);
    }

    /**
     * Setter for <code>DB_ETERNAL.D_COMMENT.MODEL_KEY</code>. 「modelKey」-
     * 关联的模型记录ID，用于描述哪一个Model中的记录
     */
    @Override
    public DCommentRecord setModelKey(String value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.D_COMMENT.MODEL_KEY</code>. 「modelKey」-
     * 关联的模型记录ID，用于描述哪一个Model中的记录
     */
    @Override
    public String getModelKey() {
        return (String) get(7);
    }

    /**
     * Setter for <code>DB_ETERNAL.D_COMMENT.SIGMA</code>. 「sigma」- 统一标识
     */
    @Override
    public DCommentRecord setSigma(String value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.D_COMMENT.SIGMA</code>. 「sigma」- 统一标识
     */
    @Override
    public String getSigma() {
        return (String) get(8);
    }

    /**
     * Setter for <code>DB_ETERNAL.D_COMMENT.LANGUAGE</code>. 「language」- 使用的语言
     */
    @Override
    public DCommentRecord setLanguage(String value) {
        set(9, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.D_COMMENT.LANGUAGE</code>. 「language」- 使用的语言
     */
    @Override
    public String getLanguage() {
        return (String) get(9);
    }

    /**
     * Setter for <code>DB_ETERNAL.D_COMMENT.ACTIVE</code>. 「active」- 是否启用
     */
    @Override
    public DCommentRecord setActive(Boolean value) {
        set(10, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.D_COMMENT.ACTIVE</code>. 「active」- 是否启用
     */
    @Override
    public Boolean getActive() {
        return (Boolean) get(10);
    }

    /**
     * Setter for <code>DB_ETERNAL.D_COMMENT.METADATA</code>. 「metadata」- 附加配置数据
     */
    @Override
    public DCommentRecord setMetadata(String value) {
        set(11, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.D_COMMENT.METADATA</code>. 「metadata」- 附加配置数据
     */
    @Override
    public String getMetadata() {
        return (String) get(11);
    }

    /**
     * Setter for <code>DB_ETERNAL.D_COMMENT.MADE_NAME</code>. 「madeName」- 备注人姓名
     */
    @Override
    public DCommentRecord setMadeName(String value) {
        set(12, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.D_COMMENT.MADE_NAME</code>. 「madeName」- 备注人姓名
     */
    @Override
    public String getMadeName() {
        return (String) get(12);
    }

    /**
     * Setter for <code>DB_ETERNAL.D_COMMENT.MADE_AT</code>. 「madeAt」- 备注时间
     */
    @Override
    public DCommentRecord setMadeAt(LocalDateTime value) {
        set(13, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.D_COMMENT.MADE_AT</code>. 「madeAt」- 备注时间
     */
    @Override
    public LocalDateTime getMadeAt() {
        return (LocalDateTime) get(13);
    }

    /**
     * Setter for <code>DB_ETERNAL.D_COMMENT.CREATED_AT</code>. 「createdAt」-
     * 创建时间
     */
    @Override
    public DCommentRecord setCreatedAt(LocalDateTime value) {
        set(14, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.D_COMMENT.CREATED_AT</code>. 「createdAt」-
     * 创建时间
     */
    @Override
    public LocalDateTime getCreatedAt() {
        return (LocalDateTime) get(14);
    }

    /**
     * Setter for <code>DB_ETERNAL.D_COMMENT.CREATED_BY</code>. 「createdBy」- 创建人
     */
    @Override
    public DCommentRecord setCreatedBy(String value) {
        set(15, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.D_COMMENT.CREATED_BY</code>. 「createdBy」- 创建人
     */
    @Override
    public String getCreatedBy() {
        return (String) get(15);
    }

    /**
     * Setter for <code>DB_ETERNAL.D_COMMENT.UPDATED_AT</code>. 「updatedAt」-
     * 更新时间
     */
    @Override
    public DCommentRecord setUpdatedAt(LocalDateTime value) {
        set(16, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.D_COMMENT.UPDATED_AT</code>. 「updatedAt」-
     * 更新时间
     */
    @Override
    public LocalDateTime getUpdatedAt() {
        return (LocalDateTime) get(16);
    }

    /**
     * Setter for <code>DB_ETERNAL.D_COMMENT.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    @Override
    public DCommentRecord setUpdatedBy(String value) {
        set(17, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.D_COMMENT.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    @Override
    public String getUpdatedBy() {
        return (String) get(17);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<String> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record18 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row18<String, String, String, String, Integer, String, String, String, String, String, Boolean, String, String, LocalDateTime, LocalDateTime, String, LocalDateTime, String> fieldsRow() {
        return (Row18) super.fieldsRow();
    }

    @Override
    public Row18<String, String, String, String, Integer, String, String, String, String, String, Boolean, String, String, LocalDateTime, LocalDateTime, String, LocalDateTime, String> valuesRow() {
        return (Row18) super.valuesRow();
    }

    @Override
    public Field<String> field1() {
        return DComment.D_COMMENT.KEY;
    }

    @Override
    public Field<String> field2() {
        return DComment.D_COMMENT.CODE;
    }

    @Override
    public Field<String> field3() {
        return DComment.D_COMMENT.NAME;
    }

    @Override
    public Field<String> field4() {
        return DComment.D_COMMENT.TYPE;
    }

    @Override
    public Field<Integer> field5() {
        return DComment.D_COMMENT.SORT;
    }

    @Override
    public Field<String> field6() {
        return DComment.D_COMMENT.CONTENT;
    }

    @Override
    public Field<String> field7() {
        return DComment.D_COMMENT.MODEL_ID;
    }

    @Override
    public Field<String> field8() {
        return DComment.D_COMMENT.MODEL_KEY;
    }

    @Override
    public Field<String> field9() {
        return DComment.D_COMMENT.SIGMA;
    }

    @Override
    public Field<String> field10() {
        return DComment.D_COMMENT.LANGUAGE;
    }

    @Override
    public Field<Boolean> field11() {
        return DComment.D_COMMENT.ACTIVE;
    }

    @Override
    public Field<String> field12() {
        return DComment.D_COMMENT.METADATA;
    }

    @Override
    public Field<String> field13() {
        return DComment.D_COMMENT.MADE_NAME;
    }

    @Override
    public Field<LocalDateTime> field14() {
        return DComment.D_COMMENT.MADE_AT;
    }

    @Override
    public Field<LocalDateTime> field15() {
        return DComment.D_COMMENT.CREATED_AT;
    }

    @Override
    public Field<String> field16() {
        return DComment.D_COMMENT.CREATED_BY;
    }

    @Override
    public Field<LocalDateTime> field17() {
        return DComment.D_COMMENT.UPDATED_AT;
    }

    @Override
    public Field<String> field18() {
        return DComment.D_COMMENT.UPDATED_BY;
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
        return getType();
    }

    @Override
    public Integer component5() {
        return getSort();
    }

    @Override
    public String component6() {
        return getContent();
    }

    @Override
    public String component7() {
        return getModelId();
    }

    @Override
    public String component8() {
        return getModelKey();
    }

    @Override
    public String component9() {
        return getSigma();
    }

    @Override
    public String component10() {
        return getLanguage();
    }

    @Override
    public Boolean component11() {
        return getActive();
    }

    @Override
    public String component12() {
        return getMetadata();
    }

    @Override
    public String component13() {
        return getMadeName();
    }

    @Override
    public LocalDateTime component14() {
        return getMadeAt();
    }

    @Override
    public LocalDateTime component15() {
        return getCreatedAt();
    }

    @Override
    public String component16() {
        return getCreatedBy();
    }

    @Override
    public LocalDateTime component17() {
        return getUpdatedAt();
    }

    @Override
    public String component18() {
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
        return getType();
    }

    @Override
    public Integer value5() {
        return getSort();
    }

    @Override
    public String value6() {
        return getContent();
    }

    @Override
    public String value7() {
        return getModelId();
    }

    @Override
    public String value8() {
        return getModelKey();
    }

    @Override
    public String value9() {
        return getSigma();
    }

    @Override
    public String value10() {
        return getLanguage();
    }

    @Override
    public Boolean value11() {
        return getActive();
    }

    @Override
    public String value12() {
        return getMetadata();
    }

    @Override
    public String value13() {
        return getMadeName();
    }

    @Override
    public LocalDateTime value14() {
        return getMadeAt();
    }

    @Override
    public LocalDateTime value15() {
        return getCreatedAt();
    }

    @Override
    public String value16() {
        return getCreatedBy();
    }

    @Override
    public LocalDateTime value17() {
        return getUpdatedAt();
    }

    @Override
    public String value18() {
        return getUpdatedBy();
    }

    @Override
    public DCommentRecord value1(String value) {
        setKey(value);
        return this;
    }

    @Override
    public DCommentRecord value2(String value) {
        setCode(value);
        return this;
    }

    @Override
    public DCommentRecord value3(String value) {
        setName(value);
        return this;
    }

    @Override
    public DCommentRecord value4(String value) {
        setType(value);
        return this;
    }

    @Override
    public DCommentRecord value5(Integer value) {
        setSort(value);
        return this;
    }

    @Override
    public DCommentRecord value6(String value) {
        setContent(value);
        return this;
    }

    @Override
    public DCommentRecord value7(String value) {
        setModelId(value);
        return this;
    }

    @Override
    public DCommentRecord value8(String value) {
        setModelKey(value);
        return this;
    }

    @Override
    public DCommentRecord value9(String value) {
        setSigma(value);
        return this;
    }

    @Override
    public DCommentRecord value10(String value) {
        setLanguage(value);
        return this;
    }

    @Override
    public DCommentRecord value11(Boolean value) {
        setActive(value);
        return this;
    }

    @Override
    public DCommentRecord value12(String value) {
        setMetadata(value);
        return this;
    }

    @Override
    public DCommentRecord value13(String value) {
        setMadeName(value);
        return this;
    }

    @Override
    public DCommentRecord value14(LocalDateTime value) {
        setMadeAt(value);
        return this;
    }

    @Override
    public DCommentRecord value15(LocalDateTime value) {
        setCreatedAt(value);
        return this;
    }

    @Override
    public DCommentRecord value16(String value) {
        setCreatedBy(value);
        return this;
    }

    @Override
    public DCommentRecord value17(LocalDateTime value) {
        setUpdatedAt(value);
        return this;
    }

    @Override
    public DCommentRecord value18(String value) {
        setUpdatedBy(value);
        return this;
    }

    @Override
    public DCommentRecord values(String value1, String value2, String value3, String value4, Integer value5, String value6, String value7, String value8, String value9, String value10, Boolean value11, String value12, String value13, LocalDateTime value14, LocalDateTime value15, String value16, LocalDateTime value17, String value18) {
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
        return this;
    }

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    @Override
    public void from(IDComment from) {
        setKey(from.getKey());
        setCode(from.getCode());
        setName(from.getName());
        setType(from.getType());
        setSort(from.getSort());
        setContent(from.getContent());
        setModelId(from.getModelId());
        setModelKey(from.getModelKey());
        setSigma(from.getSigma());
        setLanguage(from.getLanguage());
        setActive(from.getActive());
        setMetadata(from.getMetadata());
        setMadeName(from.getMadeName());
        setMadeAt(from.getMadeAt());
        setCreatedAt(from.getCreatedAt());
        setCreatedBy(from.getCreatedBy());
        setUpdatedAt(from.getUpdatedAt());
        setUpdatedBy(from.getUpdatedBy());
        resetChangedOnNotNull();
    }

    @Override
    public <E extends IDComment> E into(E into) {
        into.from(this);
        return into;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached DCommentRecord
     */
    public DCommentRecord() {
        super(DComment.D_COMMENT);
    }

    /**
     * Create a detached, initialised DCommentRecord
     */
    public DCommentRecord(String key, String code, String name, String type, Integer sort, String content, String modelId, String modelKey, String sigma, String language, Boolean active, String metadata, String madeName, LocalDateTime madeAt, LocalDateTime createdAt, String createdBy, LocalDateTime updatedAt, String updatedBy) {
        super(DComment.D_COMMENT);

        setKey(key);
        setCode(code);
        setName(name);
        setType(type);
        setSort(sort);
        setContent(content);
        setModelId(modelId);
        setModelKey(modelKey);
        setSigma(sigma);
        setLanguage(language);
        setActive(active);
        setMetadata(metadata);
        setMadeName(madeName);
        setMadeAt(madeAt);
        setCreatedAt(createdAt);
        setCreatedBy(createdBy);
        setUpdatedAt(updatedAt);
        setUpdatedBy(updatedBy);
        resetChangedOnNotNull();
    }

    /**
     * Create a detached, initialised DCommentRecord
     */
    public DCommentRecord(cn.vertxup.integration.domain.tables.pojos.DComment value) {
        super(DComment.D_COMMENT);

        if (value != null) {
            setKey(value.getKey());
            setCode(value.getCode());
            setName(value.getName());
            setType(value.getType());
            setSort(value.getSort());
            setContent(value.getContent());
            setModelId(value.getModelId());
            setModelKey(value.getModelKey());
            setSigma(value.getSigma());
            setLanguage(value.getLanguage());
            setActive(value.getActive());
            setMetadata(value.getMetadata());
            setMadeName(value.getMadeName());
            setMadeAt(value.getMadeAt());
            setCreatedAt(value.getCreatedAt());
            setCreatedBy(value.getCreatedBy());
            setUpdatedAt(value.getUpdatedAt());
            setUpdatedBy(value.getUpdatedBy());
            resetChangedOnNotNull();
        }
    }

        public DCommentRecord(io.vertx.core.json.JsonObject json) {
                this();
                fromJson(json);
        }
}
