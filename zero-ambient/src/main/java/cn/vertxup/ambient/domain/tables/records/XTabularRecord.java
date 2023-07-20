/*
 * This file is generated by jOOQ.
 */
package cn.vertxup.ambient.domain.tables.records;


import cn.vertxup.ambient.domain.tables.XTabular;
import cn.vertxup.ambient.domain.tables.interfaces.IXTabular;

import io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo;

import java.time.LocalDateTime;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record17;
import org.jooq.Row17;
import org.jooq.impl.UpdatableRecordImpl;


import static io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo.*;
/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class XTabularRecord extends UpdatableRecordImpl<XTabularRecord> implements VertxPojo, Record17<String, String, String, String, String, Integer, String, String, String, Boolean, String, String, String, LocalDateTime, String, LocalDateTime, String>, IXTabular {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>ZDB.X_TABULAR.KEY</code>. 「key」- 列表主键
     */
    @Override
    public XTabularRecord setKey(String value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.X_TABULAR.KEY</code>. 「key」- 列表主键
     */
    @Override
    public String getKey() {
        return (String) get(0);
    }

    /**
     * Setter for <code>ZDB.X_TABULAR.NAME</code>. 「name」- 列表名称
     */
    @Override
    public XTabularRecord setName(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.X_TABULAR.NAME</code>. 「name」- 列表名称
     */
    @Override
    public String getName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>ZDB.X_TABULAR.CODE</code>. 「code」- 列表编号
     */
    @Override
    public XTabularRecord setCode(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.X_TABULAR.CODE</code>. 「code」- 列表编号
     */
    @Override
    public String getCode() {
        return (String) get(2);
    }

    /**
     * Setter for <code>ZDB.X_TABULAR.TYPE</code>. 「type」- 列表类型
     */
    @Override
    public XTabularRecord setType(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.X_TABULAR.TYPE</code>. 「type」- 列表类型
     */
    @Override
    public String getType() {
        return (String) get(3);
    }

    /**
     * Setter for <code>ZDB.X_TABULAR.ICON</code>. 「icon」- 列表图标
     */
    @Override
    public XTabularRecord setIcon(String value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.X_TABULAR.ICON</code>. 「icon」- 列表图标
     */
    @Override
    public String getIcon() {
        return (String) get(4);
    }

    /**
     * Setter for <code>ZDB.X_TABULAR.SORT</code>. 「sort」- 排序信息
     */
    @Override
    public XTabularRecord setSort(Integer value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.X_TABULAR.SORT</code>. 「sort」- 排序信息
     */
    @Override
    public Integer getSort() {
        return (Integer) get(5);
    }

    /**
     * Setter for <code>ZDB.X_TABULAR.COMMENT</code>. 「comment」- 备注信息
     */
    @Override
    public XTabularRecord setComment(String value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.X_TABULAR.COMMENT</code>. 「comment」- 备注信息
     */
    @Override
    public String getComment() {
        return (String) get(6);
    }

    /**
     * Setter for <code>ZDB.X_TABULAR.APP_ID</code>. 「appId」- 关联的应用程序ID
     */
    @Override
    public XTabularRecord setAppId(String value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.X_TABULAR.APP_ID</code>. 「appId」- 关联的应用程序ID
     */
    @Override
    public String getAppId() {
        return (String) get(7);
    }

    /**
     * Setter for <code>ZDB.X_TABULAR.RUN_COMPONENT</code>. 「runComponent」- 执行组件
     */
    @Override
    public XTabularRecord setRunComponent(String value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.X_TABULAR.RUN_COMPONENT</code>. 「runComponent」- 执行组件
     */
    @Override
    public String getRunComponent() {
        return (String) get(8);
    }

    /**
     * Setter for <code>ZDB.X_TABULAR.ACTIVE</code>. 「active」- 是否启用
     */
    @Override
    public XTabularRecord setActive(Boolean value) {
        set(9, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.X_TABULAR.ACTIVE</code>. 「active」- 是否启用
     */
    @Override
    public Boolean getActive() {
        return (Boolean) get(9);
    }

    /**
     * Setter for <code>ZDB.X_TABULAR.SIGMA</code>. 「sigma」- 统一标识
     */
    @Override
    public XTabularRecord setSigma(String value) {
        set(10, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.X_TABULAR.SIGMA</code>. 「sigma」- 统一标识
     */
    @Override
    public String getSigma() {
        return (String) get(10);
    }

    /**
     * Setter for <code>ZDB.X_TABULAR.METADATA</code>. 「metadata」- 附加配置
     */
    @Override
    public XTabularRecord setMetadata(String value) {
        set(11, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.X_TABULAR.METADATA</code>. 「metadata」- 附加配置
     */
    @Override
    public String getMetadata() {
        return (String) get(11);
    }

    /**
     * Setter for <code>ZDB.X_TABULAR.LANGUAGE</code>. 「language」- 使用的语言
     */
    @Override
    public XTabularRecord setLanguage(String value) {
        set(12, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.X_TABULAR.LANGUAGE</code>. 「language」- 使用的语言
     */
    @Override
    public String getLanguage() {
        return (String) get(12);
    }

    /**
     * Setter for <code>ZDB.X_TABULAR.CREATED_AT</code>. 「createdAt」- 创建时间
     */
    @Override
    public XTabularRecord setCreatedAt(LocalDateTime value) {
        set(13, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.X_TABULAR.CREATED_AT</code>. 「createdAt」- 创建时间
     */
    @Override
    public LocalDateTime getCreatedAt() {
        return (LocalDateTime) get(13);
    }

    /**
     * Setter for <code>ZDB.X_TABULAR.CREATED_BY</code>. 「createdBy」- 创建人
     */
    @Override
    public XTabularRecord setCreatedBy(String value) {
        set(14, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.X_TABULAR.CREATED_BY</code>. 「createdBy」- 创建人
     */
    @Override
    public String getCreatedBy() {
        return (String) get(14);
    }

    /**
     * Setter for <code>ZDB.X_TABULAR.UPDATED_AT</code>. 「updatedAt」- 更新时间
     */
    @Override
    public XTabularRecord setUpdatedAt(LocalDateTime value) {
        set(15, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.X_TABULAR.UPDATED_AT</code>. 「updatedAt」- 更新时间
     */
    @Override
    public LocalDateTime getUpdatedAt() {
        return (LocalDateTime) get(15);
    }

    /**
     * Setter for <code>ZDB.X_TABULAR.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    @Override
    public XTabularRecord setUpdatedBy(String value) {
        set(16, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.X_TABULAR.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    @Override
    public String getUpdatedBy() {
        return (String) get(16);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<String> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record17 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row17<String, String, String, String, String, Integer, String, String, String, Boolean, String, String, String, LocalDateTime, String, LocalDateTime, String> fieldsRow() {
        return (Row17) super.fieldsRow();
    }

    @Override
    public Row17<String, String, String, String, String, Integer, String, String, String, Boolean, String, String, String, LocalDateTime, String, LocalDateTime, String> valuesRow() {
        return (Row17) super.valuesRow();
    }

    @Override
    public Field<String> field1() {
        return XTabular.X_TABULAR.KEY;
    }

    @Override
    public Field<String> field2() {
        return XTabular.X_TABULAR.NAME;
    }

    @Override
    public Field<String> field3() {
        return XTabular.X_TABULAR.CODE;
    }

    @Override
    public Field<String> field4() {
        return XTabular.X_TABULAR.TYPE;
    }

    @Override
    public Field<String> field5() {
        return XTabular.X_TABULAR.ICON;
    }

    @Override
    public Field<Integer> field6() {
        return XTabular.X_TABULAR.SORT;
    }

    @Override
    public Field<String> field7() {
        return XTabular.X_TABULAR.COMMENT;
    }

    @Override
    public Field<String> field8() {
        return XTabular.X_TABULAR.APP_ID;
    }

    @Override
    public Field<String> field9() {
        return XTabular.X_TABULAR.RUN_COMPONENT;
    }

    @Override
    public Field<Boolean> field10() {
        return XTabular.X_TABULAR.ACTIVE;
    }

    @Override
    public Field<String> field11() {
        return XTabular.X_TABULAR.SIGMA;
    }

    @Override
    public Field<String> field12() {
        return XTabular.X_TABULAR.METADATA;
    }

    @Override
    public Field<String> field13() {
        return XTabular.X_TABULAR.LANGUAGE;
    }

    @Override
    public Field<LocalDateTime> field14() {
        return XTabular.X_TABULAR.CREATED_AT;
    }

    @Override
    public Field<String> field15() {
        return XTabular.X_TABULAR.CREATED_BY;
    }

    @Override
    public Field<LocalDateTime> field16() {
        return XTabular.X_TABULAR.UPDATED_AT;
    }

    @Override
    public Field<String> field17() {
        return XTabular.X_TABULAR.UPDATED_BY;
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
        return getType();
    }

    @Override
    public String component5() {
        return getIcon();
    }

    @Override
    public Integer component6() {
        return getSort();
    }

    @Override
    public String component7() {
        return getComment();
    }

    @Override
    public String component8() {
        return getAppId();
    }

    @Override
    public String component9() {
        return getRunComponent();
    }

    @Override
    public Boolean component10() {
        return getActive();
    }

    @Override
    public String component11() {
        return getSigma();
    }

    @Override
    public String component12() {
        return getMetadata();
    }

    @Override
    public String component13() {
        return getLanguage();
    }

    @Override
    public LocalDateTime component14() {
        return getCreatedAt();
    }

    @Override
    public String component15() {
        return getCreatedBy();
    }

    @Override
    public LocalDateTime component16() {
        return getUpdatedAt();
    }

    @Override
    public String component17() {
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
        return getType();
    }

    @Override
    public String value5() {
        return getIcon();
    }

    @Override
    public Integer value6() {
        return getSort();
    }

    @Override
    public String value7() {
        return getComment();
    }

    @Override
    public String value8() {
        return getAppId();
    }

    @Override
    public String value9() {
        return getRunComponent();
    }

    @Override
    public Boolean value10() {
        return getActive();
    }

    @Override
    public String value11() {
        return getSigma();
    }

    @Override
    public String value12() {
        return getMetadata();
    }

    @Override
    public String value13() {
        return getLanguage();
    }

    @Override
    public LocalDateTime value14() {
        return getCreatedAt();
    }

    @Override
    public String value15() {
        return getCreatedBy();
    }

    @Override
    public LocalDateTime value16() {
        return getUpdatedAt();
    }

    @Override
    public String value17() {
        return getUpdatedBy();
    }

    @Override
    public XTabularRecord value1(String value) {
        setKey(value);
        return this;
    }

    @Override
    public XTabularRecord value2(String value) {
        setName(value);
        return this;
    }

    @Override
    public XTabularRecord value3(String value) {
        setCode(value);
        return this;
    }

    @Override
    public XTabularRecord value4(String value) {
        setType(value);
        return this;
    }

    @Override
    public XTabularRecord value5(String value) {
        setIcon(value);
        return this;
    }

    @Override
    public XTabularRecord value6(Integer value) {
        setSort(value);
        return this;
    }

    @Override
    public XTabularRecord value7(String value) {
        setComment(value);
        return this;
    }

    @Override
    public XTabularRecord value8(String value) {
        setAppId(value);
        return this;
    }

    @Override
    public XTabularRecord value9(String value) {
        setRunComponent(value);
        return this;
    }

    @Override
    public XTabularRecord value10(Boolean value) {
        setActive(value);
        return this;
    }

    @Override
    public XTabularRecord value11(String value) {
        setSigma(value);
        return this;
    }

    @Override
    public XTabularRecord value12(String value) {
        setMetadata(value);
        return this;
    }

    @Override
    public XTabularRecord value13(String value) {
        setLanguage(value);
        return this;
    }

    @Override
    public XTabularRecord value14(LocalDateTime value) {
        setCreatedAt(value);
        return this;
    }

    @Override
    public XTabularRecord value15(String value) {
        setCreatedBy(value);
        return this;
    }

    @Override
    public XTabularRecord value16(LocalDateTime value) {
        setUpdatedAt(value);
        return this;
    }

    @Override
    public XTabularRecord value17(String value) {
        setUpdatedBy(value);
        return this;
    }

    @Override
    public XTabularRecord values(String value1, String value2, String value3, String value4, String value5, Integer value6, String value7, String value8, String value9, Boolean value10, String value11, String value12, String value13, LocalDateTime value14, String value15, LocalDateTime value16, String value17) {
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
        return this;
    }

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    @Override
    public void from(IXTabular from) {
        setKey(from.getKey());
        setName(from.getName());
        setCode(from.getCode());
        setType(from.getType());
        setIcon(from.getIcon());
        setSort(from.getSort());
        setComment(from.getComment());
        setAppId(from.getAppId());
        setRunComponent(from.getRunComponent());
        setActive(from.getActive());
        setSigma(from.getSigma());
        setMetadata(from.getMetadata());
        setLanguage(from.getLanguage());
        setCreatedAt(from.getCreatedAt());
        setCreatedBy(from.getCreatedBy());
        setUpdatedAt(from.getUpdatedAt());
        setUpdatedBy(from.getUpdatedBy());
        resetChangedOnNotNull();
    }

    @Override
    public <E extends IXTabular> E into(E into) {
        into.from(this);
        return into;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached XTabularRecord
     */
    public XTabularRecord() {
        super(XTabular.X_TABULAR);
    }

    /**
     * Create a detached, initialised XTabularRecord
     */
    public XTabularRecord(String key, String name, String code, String type, String icon, Integer sort, String comment, String appId, String runComponent, Boolean active, String sigma, String metadata, String language, LocalDateTime createdAt, String createdBy, LocalDateTime updatedAt, String updatedBy) {
        super(XTabular.X_TABULAR);

        setKey(key);
        setName(name);
        setCode(code);
        setType(type);
        setIcon(icon);
        setSort(sort);
        setComment(comment);
        setAppId(appId);
        setRunComponent(runComponent);
        setActive(active);
        setSigma(sigma);
        setMetadata(metadata);
        setLanguage(language);
        setCreatedAt(createdAt);
        setCreatedBy(createdBy);
        setUpdatedAt(updatedAt);
        setUpdatedBy(updatedBy);
        resetChangedOnNotNull();
    }

    /**
     * Create a detached, initialised XTabularRecord
     */
    public XTabularRecord(cn.vertxup.ambient.domain.tables.pojos.XTabular value) {
        super(XTabular.X_TABULAR);

        if (value != null) {
            setKey(value.getKey());
            setName(value.getName());
            setCode(value.getCode());
            setType(value.getType());
            setIcon(value.getIcon());
            setSort(value.getSort());
            setComment(value.getComment());
            setAppId(value.getAppId());
            setRunComponent(value.getRunComponent());
            setActive(value.getActive());
            setSigma(value.getSigma());
            setMetadata(value.getMetadata());
            setLanguage(value.getLanguage());
            setCreatedAt(value.getCreatedAt());
            setCreatedBy(value.getCreatedBy());
            setUpdatedAt(value.getUpdatedAt());
            setUpdatedBy(value.getUpdatedBy());
            resetChangedOnNotNull();
        }
    }

        public XTabularRecord(io.vertx.core.json.JsonObject json) {
                this();
                fromJson(json);
        }
}
