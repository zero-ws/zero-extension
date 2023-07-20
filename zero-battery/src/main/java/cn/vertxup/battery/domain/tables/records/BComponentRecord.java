/*
 * This file is generated by jOOQ.
 */
package cn.vertxup.battery.domain.tables.records;


import cn.vertxup.battery.domain.tables.BComponent;
import cn.vertxup.battery.domain.tables.interfaces.IBComponent;

import io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record12;
import org.jooq.Row12;
import org.jooq.impl.UpdatableRecordImpl;


import static io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo.*;
/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class BComponentRecord extends UpdatableRecordImpl<BComponentRecord> implements VertxPojo, Record12<String, String, String, String, String, String, String, Boolean, Boolean, String, String, String>, IBComponent {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>ZDB.B_COMPONENT.KEY</code>. 「key」- 主键
     */
    @Override
    public BComponentRecord setKey(String value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.B_COMPONENT.KEY</code>. 「key」- 主键
     */
    @Override
    public String getKey() {
        return (String) get(0);
    }

    /**
     * Setter for <code>ZDB.B_COMPONENT.BLOCK_ID</code>. 「blockId」- 所属模块ID
     */
    @Override
    public BComponentRecord setBlockId(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.B_COMPONENT.BLOCK_ID</code>. 「blockId」- 所属模块ID
     */
    @Override
    public String getBlockId() {
        return (String) get(1);
    }

    /**
     * Setter for <code>ZDB.B_COMPONENT.TYPE</code>. 「type」- 类型保留，单独区分
     */
    @Override
    public BComponentRecord setType(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.B_COMPONENT.TYPE</code>. 「type」- 类型保留，单独区分
     */
    @Override
    public String getType() {
        return (String) get(2);
    }

    /**
     * Setter for <code>ZDB.B_COMPONENT.MAVEN_AID</code>. 「mavenAid」- 所在项目ID
     */
    @Override
    public BComponentRecord setMavenAid(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.B_COMPONENT.MAVEN_AID</code>. 「mavenAid」- 所在项目ID
     */
    @Override
    public String getMavenAid() {
        return (String) get(3);
    }

    /**
     * Setter for <code>ZDB.B_COMPONENT.MAVEN_GID</code>. 「mavenGid」- 所在Group的ID
     */
    @Override
    public BComponentRecord setMavenGid(String value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.B_COMPONENT.MAVEN_GID</code>. 「mavenGid」- 所在Group的ID
     */
    @Override
    public String getMavenGid() {
        return (String) get(4);
    }

    /**
     * Setter for <code>ZDB.B_COMPONENT.SPEC_INTERFACE</code>. 「specInterface」-
     * 接口名称
     */
    @Override
    public BComponentRecord setSpecInterface(String value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.B_COMPONENT.SPEC_INTERFACE</code>. 「specInterface」-
     * 接口名称
     */
    @Override
    public String getSpecInterface() {
        return (String) get(5);
    }

    /**
     * Setter for <code>ZDB.B_COMPONENT.SPEC_IMPL</code>. 「specImpl」- 实现组件
     */
    @Override
    public BComponentRecord setSpecImpl(String value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.B_COMPONENT.SPEC_IMPL</code>. 「specImpl」- 实现组件
     */
    @Override
    public String getSpecImpl() {
        return (String) get(6);
    }

    /**
     * Setter for <code>ZDB.B_COMPONENT.INTEGRATED</code>. 「integrated」-
     * 是否用于外部集成
     */
    @Override
    public BComponentRecord setIntegrated(Boolean value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.B_COMPONENT.INTEGRATED</code>. 「integrated」-
     * 是否用于外部集成
     */
    @Override
    public Boolean getIntegrated() {
        return (Boolean) get(7);
    }

    /**
     * Setter for <code>ZDB.B_COMPONENT.ACTIVE</code>. 「active」- 是否启用
     */
    @Override
    public BComponentRecord setActive(Boolean value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.B_COMPONENT.ACTIVE</code>. 「active」- 是否启用
     */
    @Override
    public Boolean getActive() {
        return (Boolean) get(8);
    }

    /**
     * Setter for <code>ZDB.B_COMPONENT.SIGMA</code>. 「sigma」- 统一标识
     */
    @Override
    public BComponentRecord setSigma(String value) {
        set(9, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.B_COMPONENT.SIGMA</code>. 「sigma」- 统一标识
     */
    @Override
    public String getSigma() {
        return (String) get(9);
    }

    /**
     * Setter for <code>ZDB.B_COMPONENT.METADATA</code>. 「metadata」- 附加配置
     */
    @Override
    public BComponentRecord setMetadata(String value) {
        set(10, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.B_COMPONENT.METADATA</code>. 「metadata」- 附加配置
     */
    @Override
    public String getMetadata() {
        return (String) get(10);
    }

    /**
     * Setter for <code>ZDB.B_COMPONENT.LANGUAGE</code>. 「language」- 使用的语言
     */
    @Override
    public BComponentRecord setLanguage(String value) {
        set(11, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.B_COMPONENT.LANGUAGE</code>. 「language」- 使用的语言
     */
    @Override
    public String getLanguage() {
        return (String) get(11);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<String> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record12 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row12<String, String, String, String, String, String, String, Boolean, Boolean, String, String, String> fieldsRow() {
        return (Row12) super.fieldsRow();
    }

    @Override
    public Row12<String, String, String, String, String, String, String, Boolean, Boolean, String, String, String> valuesRow() {
        return (Row12) super.valuesRow();
    }

    @Override
    public Field<String> field1() {
        return BComponent.B_COMPONENT.KEY;
    }

    @Override
    public Field<String> field2() {
        return BComponent.B_COMPONENT.BLOCK_ID;
    }

    @Override
    public Field<String> field3() {
        return BComponent.B_COMPONENT.TYPE;
    }

    @Override
    public Field<String> field4() {
        return BComponent.B_COMPONENT.MAVEN_AID;
    }

    @Override
    public Field<String> field5() {
        return BComponent.B_COMPONENT.MAVEN_GID;
    }

    @Override
    public Field<String> field6() {
        return BComponent.B_COMPONENT.SPEC_INTERFACE;
    }

    @Override
    public Field<String> field7() {
        return BComponent.B_COMPONENT.SPEC_IMPL;
    }

    @Override
    public Field<Boolean> field8() {
        return BComponent.B_COMPONENT.INTEGRATED;
    }

    @Override
    public Field<Boolean> field9() {
        return BComponent.B_COMPONENT.ACTIVE;
    }

    @Override
    public Field<String> field10() {
        return BComponent.B_COMPONENT.SIGMA;
    }

    @Override
    public Field<String> field11() {
        return BComponent.B_COMPONENT.METADATA;
    }

    @Override
    public Field<String> field12() {
        return BComponent.B_COMPONENT.LANGUAGE;
    }

    @Override
    public String component1() {
        return getKey();
    }

    @Override
    public String component2() {
        return getBlockId();
    }

    @Override
    public String component3() {
        return getType();
    }

    @Override
    public String component4() {
        return getMavenAid();
    }

    @Override
    public String component5() {
        return getMavenGid();
    }

    @Override
    public String component6() {
        return getSpecInterface();
    }

    @Override
    public String component7() {
        return getSpecImpl();
    }

    @Override
    public Boolean component8() {
        return getIntegrated();
    }

    @Override
    public Boolean component9() {
        return getActive();
    }

    @Override
    public String component10() {
        return getSigma();
    }

    @Override
    public String component11() {
        return getMetadata();
    }

    @Override
    public String component12() {
        return getLanguage();
    }

    @Override
    public String value1() {
        return getKey();
    }

    @Override
    public String value2() {
        return getBlockId();
    }

    @Override
    public String value3() {
        return getType();
    }

    @Override
    public String value4() {
        return getMavenAid();
    }

    @Override
    public String value5() {
        return getMavenGid();
    }

    @Override
    public String value6() {
        return getSpecInterface();
    }

    @Override
    public String value7() {
        return getSpecImpl();
    }

    @Override
    public Boolean value8() {
        return getIntegrated();
    }

    @Override
    public Boolean value9() {
        return getActive();
    }

    @Override
    public String value10() {
        return getSigma();
    }

    @Override
    public String value11() {
        return getMetadata();
    }

    @Override
    public String value12() {
        return getLanguage();
    }

    @Override
    public BComponentRecord value1(String value) {
        setKey(value);
        return this;
    }

    @Override
    public BComponentRecord value2(String value) {
        setBlockId(value);
        return this;
    }

    @Override
    public BComponentRecord value3(String value) {
        setType(value);
        return this;
    }

    @Override
    public BComponentRecord value4(String value) {
        setMavenAid(value);
        return this;
    }

    @Override
    public BComponentRecord value5(String value) {
        setMavenGid(value);
        return this;
    }

    @Override
    public BComponentRecord value6(String value) {
        setSpecInterface(value);
        return this;
    }

    @Override
    public BComponentRecord value7(String value) {
        setSpecImpl(value);
        return this;
    }

    @Override
    public BComponentRecord value8(Boolean value) {
        setIntegrated(value);
        return this;
    }

    @Override
    public BComponentRecord value9(Boolean value) {
        setActive(value);
        return this;
    }

    @Override
    public BComponentRecord value10(String value) {
        setSigma(value);
        return this;
    }

    @Override
    public BComponentRecord value11(String value) {
        setMetadata(value);
        return this;
    }

    @Override
    public BComponentRecord value12(String value) {
        setLanguage(value);
        return this;
    }

    @Override
    public BComponentRecord values(String value1, String value2, String value3, String value4, String value5, String value6, String value7, Boolean value8, Boolean value9, String value10, String value11, String value12) {
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
        return this;
    }

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    @Override
    public void from(IBComponent from) {
        setKey(from.getKey());
        setBlockId(from.getBlockId());
        setType(from.getType());
        setMavenAid(from.getMavenAid());
        setMavenGid(from.getMavenGid());
        setSpecInterface(from.getSpecInterface());
        setSpecImpl(from.getSpecImpl());
        setIntegrated(from.getIntegrated());
        setActive(from.getActive());
        setSigma(from.getSigma());
        setMetadata(from.getMetadata());
        setLanguage(from.getLanguage());
        resetChangedOnNotNull();
    }

    @Override
    public <E extends IBComponent> E into(E into) {
        into.from(this);
        return into;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached BComponentRecord
     */
    public BComponentRecord() {
        super(BComponent.B_COMPONENT);
    }

    /**
     * Create a detached, initialised BComponentRecord
     */
    public BComponentRecord(String key, String blockId, String type, String mavenAid, String mavenGid, String specInterface, String specImpl, Boolean integrated, Boolean active, String sigma, String metadata, String language) {
        super(BComponent.B_COMPONENT);

        setKey(key);
        setBlockId(blockId);
        setType(type);
        setMavenAid(mavenAid);
        setMavenGid(mavenGid);
        setSpecInterface(specInterface);
        setSpecImpl(specImpl);
        setIntegrated(integrated);
        setActive(active);
        setSigma(sigma);
        setMetadata(metadata);
        setLanguage(language);
        resetChangedOnNotNull();
    }

    /**
     * Create a detached, initialised BComponentRecord
     */
    public BComponentRecord(cn.vertxup.battery.domain.tables.pojos.BComponent value) {
        super(BComponent.B_COMPONENT);

        if (value != null) {
            setKey(value.getKey());
            setBlockId(value.getBlockId());
            setType(value.getType());
            setMavenAid(value.getMavenAid());
            setMavenGid(value.getMavenGid());
            setSpecInterface(value.getSpecInterface());
            setSpecImpl(value.getSpecImpl());
            setIntegrated(value.getIntegrated());
            setActive(value.getActive());
            setSigma(value.getSigma());
            setMetadata(value.getMetadata());
            setLanguage(value.getLanguage());
            resetChangedOnNotNull();
        }
    }

        public BComponentRecord(io.vertx.core.json.JsonObject json) {
                this();
                fromJson(json);
        }
}
