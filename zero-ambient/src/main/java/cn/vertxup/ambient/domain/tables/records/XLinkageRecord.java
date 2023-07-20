/*
 * This file is generated by jOOQ.
 */
package cn.vertxup.ambient.domain.tables.records;


import cn.vertxup.ambient.domain.tables.XLinkage;
import cn.vertxup.ambient.domain.tables.interfaces.IXLinkage;

import io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo;

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
public class XLinkageRecord extends UpdatableRecordImpl<XLinkageRecord> implements VertxPojo, Record22<String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, Boolean, String, LocalDateTime, String, LocalDateTime, String>, IXLinkage {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>ZDB.X_LINKAGE.KEY</code>. 「key」- 连接主键
     */
    @Override
    public XLinkageRecord setKey(String value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.X_LINKAGE.KEY</code>. 「key」- 连接主键
     */
    @Override
    public String getKey() {
        return (String) get(0);
    }

    /**
     * Setter for <code>ZDB.X_LINKAGE.NAME</code>. 「name」- 名称
     */
    @Override
    public XLinkageRecord setName(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.X_LINKAGE.NAME</code>. 「name」- 名称
     */
    @Override
    public String getName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>ZDB.X_LINKAGE.TYPE</code>. 「type」- 连接类型
     */
    @Override
    public XLinkageRecord setType(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.X_LINKAGE.TYPE</code>. 「type」- 连接类型
     */
    @Override
    public String getType() {
        return (String) get(2);
    }

    /**
     * Setter for <code>ZDB.X_LINKAGE.ALIAS</code>. 「alias」- 别称
     */
    @Override
    public XLinkageRecord setAlias(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.X_LINKAGE.ALIAS</code>. 「alias」- 别称
     */
    @Override
    public String getAlias() {
        return (String) get(3);
    }

    /**
     * Setter for <code>ZDB.X_LINKAGE.REGION</code>. 「region」-
     * 连接区域标识，同一个区域算一个连接（批次）
     */
    @Override
    public XLinkageRecord setRegion(String value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.X_LINKAGE.REGION</code>. 「region」-
     * 连接区域标识，同一个区域算一个连接（批次）
     */
    @Override
    public String getRegion() {
        return (String) get(4);
    }

    /**
     * Setter for <code>ZDB.X_LINKAGE.LINK_KEY</code>. 「linkKey」- 双向Key计算，根据
     * source / target 计算
     */
    @Override
    public XLinkageRecord setLinkKey(String value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.X_LINKAGE.LINK_KEY</code>. 「linkKey」- 双向Key计算，根据
     * source / target 计算
     */
    @Override
    public String getLinkKey() {
        return (String) get(5);
    }

    /**
     * Setter for <code>ZDB.X_LINKAGE.LINK_TYPE</code>. 「linkType」- 关系记录类型
     */
    @Override
    public XLinkageRecord setLinkType(String value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.X_LINKAGE.LINK_TYPE</code>. 「linkType」- 关系记录类型
     */
    @Override
    public String getLinkType() {
        return (String) get(6);
    }

    /**
     * Setter for <code>ZDB.X_LINKAGE.LINK_DATA</code>. 「linkData」- 关联数据Json格式
     */
    @Override
    public XLinkageRecord setLinkData(String value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.X_LINKAGE.LINK_DATA</code>. 「linkData」- 关联数据Json格式
     */
    @Override
    public String getLinkData() {
        return (String) get(7);
    }

    /**
     * Setter for <code>ZDB.X_LINKAGE.SOURCE_KEY</code>. 「sourceKey」- 源实体
     */
    @Override
    public XLinkageRecord setSourceKey(String value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.X_LINKAGE.SOURCE_KEY</code>. 「sourceKey」- 源实体
     */
    @Override
    public String getSourceKey() {
        return (String) get(8);
    }

    /**
     * Setter for <code>ZDB.X_LINKAGE.SOURCE_TYPE</code>. 「sourceType」- 源实体类型
     */
    @Override
    public XLinkageRecord setSourceType(String value) {
        set(9, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.X_LINKAGE.SOURCE_TYPE</code>. 「sourceType」- 源实体类型
     */
    @Override
    public String getSourceType() {
        return (String) get(9);
    }

    /**
     * Setter for <code>ZDB.X_LINKAGE.SOURCE_DATA</code>. 「sourceData」-
     * 源记录Json格式
     */
    @Override
    public XLinkageRecord setSourceData(String value) {
        set(10, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.X_LINKAGE.SOURCE_DATA</code>. 「sourceData」-
     * 源记录Json格式
     */
    @Override
    public String getSourceData() {
        return (String) get(10);
    }

    /**
     * Setter for <code>ZDB.X_LINKAGE.TARGET_KEY</code>. 「targetKey」- 目标实体
     */
    @Override
    public XLinkageRecord setTargetKey(String value) {
        set(11, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.X_LINKAGE.TARGET_KEY</code>. 「targetKey」- 目标实体
     */
    @Override
    public String getTargetKey() {
        return (String) get(11);
    }

    /**
     * Setter for <code>ZDB.X_LINKAGE.TARGET_TYPE</code>. 「targetType」- 目标实体类型
     */
    @Override
    public XLinkageRecord setTargetType(String value) {
        set(12, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.X_LINKAGE.TARGET_TYPE</code>. 「targetType」- 目标实体类型
     */
    @Override
    public String getTargetType() {
        return (String) get(12);
    }

    /**
     * Setter for <code>ZDB.X_LINKAGE.TARGET_DATA</code>. 「targetData」-
     * 目标记录Json格式
     */
    @Override
    public XLinkageRecord setTargetData(String value) {
        set(13, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.X_LINKAGE.TARGET_DATA</code>. 「targetData」-
     * 目标记录Json格式
     */
    @Override
    public String getTargetData() {
        return (String) get(13);
    }

    /**
     * Setter for <code>ZDB.X_LINKAGE.SIGMA</code>. 「sigma」- 统一标识
     */
    @Override
    public XLinkageRecord setSigma(String value) {
        set(14, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.X_LINKAGE.SIGMA</code>. 「sigma」- 统一标识
     */
    @Override
    public String getSigma() {
        return (String) get(14);
    }

    /**
     * Setter for <code>ZDB.X_LINKAGE.LANGUAGE</code>. 「language」- 使用的语言
     */
    @Override
    public XLinkageRecord setLanguage(String value) {
        set(15, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.X_LINKAGE.LANGUAGE</code>. 「language」- 使用的语言
     */
    @Override
    public String getLanguage() {
        return (String) get(15);
    }

    /**
     * Setter for <code>ZDB.X_LINKAGE.ACTIVE</code>. 「active」- 是否启用
     */
    @Override
    public XLinkageRecord setActive(Boolean value) {
        set(16, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.X_LINKAGE.ACTIVE</code>. 「active」- 是否启用
     */
    @Override
    public Boolean getActive() {
        return (Boolean) get(16);
    }

    /**
     * Setter for <code>ZDB.X_LINKAGE.METADATA</code>. 「metadata」- 附加配置数据
     */
    @Override
    public XLinkageRecord setMetadata(String value) {
        set(17, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.X_LINKAGE.METADATA</code>. 「metadata」- 附加配置数据
     */
    @Override
    public String getMetadata() {
        return (String) get(17);
    }

    /**
     * Setter for <code>ZDB.X_LINKAGE.CREATED_AT</code>. 「createdAt」- 创建时间
     */
    @Override
    public XLinkageRecord setCreatedAt(LocalDateTime value) {
        set(18, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.X_LINKAGE.CREATED_AT</code>. 「createdAt」- 创建时间
     */
    @Override
    public LocalDateTime getCreatedAt() {
        return (LocalDateTime) get(18);
    }

    /**
     * Setter for <code>ZDB.X_LINKAGE.CREATED_BY</code>. 「createdBy」- 创建人
     */
    @Override
    public XLinkageRecord setCreatedBy(String value) {
        set(19, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.X_LINKAGE.CREATED_BY</code>. 「createdBy」- 创建人
     */
    @Override
    public String getCreatedBy() {
        return (String) get(19);
    }

    /**
     * Setter for <code>ZDB.X_LINKAGE.UPDATED_AT</code>. 「updatedAt」- 更新时间
     */
    @Override
    public XLinkageRecord setUpdatedAt(LocalDateTime value) {
        set(20, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.X_LINKAGE.UPDATED_AT</code>. 「updatedAt」- 更新时间
     */
    @Override
    public LocalDateTime getUpdatedAt() {
        return (LocalDateTime) get(20);
    }

    /**
     * Setter for <code>ZDB.X_LINKAGE.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    @Override
    public XLinkageRecord setUpdatedBy(String value) {
        set(21, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.X_LINKAGE.UPDATED_BY</code>. 「updatedBy」- 更新人
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
    public Row22<String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, Boolean, String, LocalDateTime, String, LocalDateTime, String> fieldsRow() {
        return (Row22) super.fieldsRow();
    }

    @Override
    public Row22<String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, Boolean, String, LocalDateTime, String, LocalDateTime, String> valuesRow() {
        return (Row22) super.valuesRow();
    }

    @Override
    public Field<String> field1() {
        return XLinkage.X_LINKAGE.KEY;
    }

    @Override
    public Field<String> field2() {
        return XLinkage.X_LINKAGE.NAME;
    }

    @Override
    public Field<String> field3() {
        return XLinkage.X_LINKAGE.TYPE;
    }

    @Override
    public Field<String> field4() {
        return XLinkage.X_LINKAGE.ALIAS;
    }

    @Override
    public Field<String> field5() {
        return XLinkage.X_LINKAGE.REGION;
    }

    @Override
    public Field<String> field6() {
        return XLinkage.X_LINKAGE.LINK_KEY;
    }

    @Override
    public Field<String> field7() {
        return XLinkage.X_LINKAGE.LINK_TYPE;
    }

    @Override
    public Field<String> field8() {
        return XLinkage.X_LINKAGE.LINK_DATA;
    }

    @Override
    public Field<String> field9() {
        return XLinkage.X_LINKAGE.SOURCE_KEY;
    }

    @Override
    public Field<String> field10() {
        return XLinkage.X_LINKAGE.SOURCE_TYPE;
    }

    @Override
    public Field<String> field11() {
        return XLinkage.X_LINKAGE.SOURCE_DATA;
    }

    @Override
    public Field<String> field12() {
        return XLinkage.X_LINKAGE.TARGET_KEY;
    }

    @Override
    public Field<String> field13() {
        return XLinkage.X_LINKAGE.TARGET_TYPE;
    }

    @Override
    public Field<String> field14() {
        return XLinkage.X_LINKAGE.TARGET_DATA;
    }

    @Override
    public Field<String> field15() {
        return XLinkage.X_LINKAGE.SIGMA;
    }

    @Override
    public Field<String> field16() {
        return XLinkage.X_LINKAGE.LANGUAGE;
    }

    @Override
    public Field<Boolean> field17() {
        return XLinkage.X_LINKAGE.ACTIVE;
    }

    @Override
    public Field<String> field18() {
        return XLinkage.X_LINKAGE.METADATA;
    }

    @Override
    public Field<LocalDateTime> field19() {
        return XLinkage.X_LINKAGE.CREATED_AT;
    }

    @Override
    public Field<String> field20() {
        return XLinkage.X_LINKAGE.CREATED_BY;
    }

    @Override
    public Field<LocalDateTime> field21() {
        return XLinkage.X_LINKAGE.UPDATED_AT;
    }

    @Override
    public Field<String> field22() {
        return XLinkage.X_LINKAGE.UPDATED_BY;
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
        return getType();
    }

    @Override
    public String component4() {
        return getAlias();
    }

    @Override
    public String component5() {
        return getRegion();
    }

    @Override
    public String component6() {
        return getLinkKey();
    }

    @Override
    public String component7() {
        return getLinkType();
    }

    @Override
    public String component8() {
        return getLinkData();
    }

    @Override
    public String component9() {
        return getSourceKey();
    }

    @Override
    public String component10() {
        return getSourceType();
    }

    @Override
    public String component11() {
        return getSourceData();
    }

    @Override
    public String component12() {
        return getTargetKey();
    }

    @Override
    public String component13() {
        return getTargetType();
    }

    @Override
    public String component14() {
        return getTargetData();
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
        return getName();
    }

    @Override
    public String value3() {
        return getType();
    }

    @Override
    public String value4() {
        return getAlias();
    }

    @Override
    public String value5() {
        return getRegion();
    }

    @Override
    public String value6() {
        return getLinkKey();
    }

    @Override
    public String value7() {
        return getLinkType();
    }

    @Override
    public String value8() {
        return getLinkData();
    }

    @Override
    public String value9() {
        return getSourceKey();
    }

    @Override
    public String value10() {
        return getSourceType();
    }

    @Override
    public String value11() {
        return getSourceData();
    }

    @Override
    public String value12() {
        return getTargetKey();
    }

    @Override
    public String value13() {
        return getTargetType();
    }

    @Override
    public String value14() {
        return getTargetData();
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
    public XLinkageRecord value1(String value) {
        setKey(value);
        return this;
    }

    @Override
    public XLinkageRecord value2(String value) {
        setName(value);
        return this;
    }

    @Override
    public XLinkageRecord value3(String value) {
        setType(value);
        return this;
    }

    @Override
    public XLinkageRecord value4(String value) {
        setAlias(value);
        return this;
    }

    @Override
    public XLinkageRecord value5(String value) {
        setRegion(value);
        return this;
    }

    @Override
    public XLinkageRecord value6(String value) {
        setLinkKey(value);
        return this;
    }

    @Override
    public XLinkageRecord value7(String value) {
        setLinkType(value);
        return this;
    }

    @Override
    public XLinkageRecord value8(String value) {
        setLinkData(value);
        return this;
    }

    @Override
    public XLinkageRecord value9(String value) {
        setSourceKey(value);
        return this;
    }

    @Override
    public XLinkageRecord value10(String value) {
        setSourceType(value);
        return this;
    }

    @Override
    public XLinkageRecord value11(String value) {
        setSourceData(value);
        return this;
    }

    @Override
    public XLinkageRecord value12(String value) {
        setTargetKey(value);
        return this;
    }

    @Override
    public XLinkageRecord value13(String value) {
        setTargetType(value);
        return this;
    }

    @Override
    public XLinkageRecord value14(String value) {
        setTargetData(value);
        return this;
    }

    @Override
    public XLinkageRecord value15(String value) {
        setSigma(value);
        return this;
    }

    @Override
    public XLinkageRecord value16(String value) {
        setLanguage(value);
        return this;
    }

    @Override
    public XLinkageRecord value17(Boolean value) {
        setActive(value);
        return this;
    }

    @Override
    public XLinkageRecord value18(String value) {
        setMetadata(value);
        return this;
    }

    @Override
    public XLinkageRecord value19(LocalDateTime value) {
        setCreatedAt(value);
        return this;
    }

    @Override
    public XLinkageRecord value20(String value) {
        setCreatedBy(value);
        return this;
    }

    @Override
    public XLinkageRecord value21(LocalDateTime value) {
        setUpdatedAt(value);
        return this;
    }

    @Override
    public XLinkageRecord value22(String value) {
        setUpdatedBy(value);
        return this;
    }

    @Override
    public XLinkageRecord values(String value1, String value2, String value3, String value4, String value5, String value6, String value7, String value8, String value9, String value10, String value11, String value12, String value13, String value14, String value15, String value16, Boolean value17, String value18, LocalDateTime value19, String value20, LocalDateTime value21, String value22) {
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
    public void from(IXLinkage from) {
        setKey(from.getKey());
        setName(from.getName());
        setType(from.getType());
        setAlias(from.getAlias());
        setRegion(from.getRegion());
        setLinkKey(from.getLinkKey());
        setLinkType(from.getLinkType());
        setLinkData(from.getLinkData());
        setSourceKey(from.getSourceKey());
        setSourceType(from.getSourceType());
        setSourceData(from.getSourceData());
        setTargetKey(from.getTargetKey());
        setTargetType(from.getTargetType());
        setTargetData(from.getTargetData());
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
    public <E extends IXLinkage> E into(E into) {
        into.from(this);
        return into;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached XLinkageRecord
     */
    public XLinkageRecord() {
        super(XLinkage.X_LINKAGE);
    }

    /**
     * Create a detached, initialised XLinkageRecord
     */
    public XLinkageRecord(String key, String name, String type, String alias, String region, String linkKey, String linkType, String linkData, String sourceKey, String sourceType, String sourceData, String targetKey, String targetType, String targetData, String sigma, String language, Boolean active, String metadata, LocalDateTime createdAt, String createdBy, LocalDateTime updatedAt, String updatedBy) {
        super(XLinkage.X_LINKAGE);

        setKey(key);
        setName(name);
        setType(type);
        setAlias(alias);
        setRegion(region);
        setLinkKey(linkKey);
        setLinkType(linkType);
        setLinkData(linkData);
        setSourceKey(sourceKey);
        setSourceType(sourceType);
        setSourceData(sourceData);
        setTargetKey(targetKey);
        setTargetType(targetType);
        setTargetData(targetData);
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
     * Create a detached, initialised XLinkageRecord
     */
    public XLinkageRecord(cn.vertxup.ambient.domain.tables.pojos.XLinkage value) {
        super(XLinkage.X_LINKAGE);

        if (value != null) {
            setKey(value.getKey());
            setName(value.getName());
            setType(value.getType());
            setAlias(value.getAlias());
            setRegion(value.getRegion());
            setLinkKey(value.getLinkKey());
            setLinkType(value.getLinkType());
            setLinkData(value.getLinkData());
            setSourceKey(value.getSourceKey());
            setSourceType(value.getSourceType());
            setSourceData(value.getSourceData());
            setTargetKey(value.getTargetKey());
            setTargetType(value.getTargetType());
            setTargetData(value.getTargetData());
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

        public XLinkageRecord(io.vertx.core.json.JsonObject json) {
                this();
                fromJson(json);
        }
}
