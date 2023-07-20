/*
 * This file is generated by jOOQ.
 */
package cn.vertxup.battery.domain.tables.records;


import cn.vertxup.battery.domain.tables.BAuthority;
import cn.vertxup.battery.domain.tables.interfaces.IBAuthority;

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
public class BAuthorityRecord extends UpdatableRecordImpl<BAuthorityRecord> implements VertxPojo, Record12<String, String, String, String, String, String, String, String, Boolean, String, String, String>, IBAuthority {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>ZDB.B_AUTHORITY.KEY</code>. 「key」- 主键
     */
    @Override
    public BAuthorityRecord setKey(String value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.B_AUTHORITY.KEY</code>. 「key」- 主键
     */
    @Override
    public String getKey() {
        return (String) get(0);
    }

    /**
     * Setter for <code>ZDB.B_AUTHORITY.CODE</code>. 「name」- 系统内部编码
     */
    @Override
    public BAuthorityRecord setCode(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.B_AUTHORITY.CODE</code>. 「name」- 系统内部编码
     */
    @Override
    public String getCode() {
        return (String) get(1);
    }

    /**
     * Setter for <code>ZDB.B_AUTHORITY.BLOCK_ID</code>. 「blockId」- 所属模块ID
     */
    @Override
    public BAuthorityRecord setBlockId(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.B_AUTHORITY.BLOCK_ID</code>. 「blockId」- 所属模块ID
     */
    @Override
    public String getBlockId() {
        return (String) get(2);
    }

    /**
     * Setter for <code>ZDB.B_AUTHORITY.TYPE</code>. 「type」- 类型保留，单独区分
     */
    @Override
    public BAuthorityRecord setType(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.B_AUTHORITY.TYPE</code>. 「type」- 类型保留，单独区分
     */
    @Override
    public String getType() {
        return (String) get(3);
    }

    /**
     * Setter for <code>ZDB.B_AUTHORITY.LIC_RESOURCE</code>. 「licResource」- 资源编码
     */
    @Override
    public BAuthorityRecord setLicResource(String value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.B_AUTHORITY.LIC_RESOURCE</code>. 「licResource」- 资源编码
     */
    @Override
    public String getLicResource() {
        return (String) get(4);
    }

    /**
     * Setter for <code>ZDB.B_AUTHORITY.LIC_ACTION</code>. 「licAction」- 操作编码
     */
    @Override
    public BAuthorityRecord setLicAction(String value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.B_AUTHORITY.LIC_ACTION</code>. 「licAction」- 操作编码
     */
    @Override
    public String getLicAction() {
        return (String) get(5);
    }

    /**
     * Setter for <code>ZDB.B_AUTHORITY.LIC_PERMISSION</code>. 「licPermission」-
     * 所需权限集合
     */
    @Override
    public BAuthorityRecord setLicPermission(String value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.B_AUTHORITY.LIC_PERMISSION</code>. 「licPermission」-
     * 所需权限集合
     */
    @Override
    public String getLicPermission() {
        return (String) get(6);
    }

    /**
     * Setter for <code>ZDB.B_AUTHORITY.LIC_VIEW</code>. 「licView」- 视图集合
     */
    @Override
    public BAuthorityRecord setLicView(String value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.B_AUTHORITY.LIC_VIEW</code>. 「licView」- 视图集合
     */
    @Override
    public String getLicView() {
        return (String) get(7);
    }

    /**
     * Setter for <code>ZDB.B_AUTHORITY.ACTIVE</code>. 「active」- 是否启用
     */
    @Override
    public BAuthorityRecord setActive(Boolean value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.B_AUTHORITY.ACTIVE</code>. 「active」- 是否启用
     */
    @Override
    public Boolean getActive() {
        return (Boolean) get(8);
    }

    /**
     * Setter for <code>ZDB.B_AUTHORITY.SIGMA</code>. 「sigma」- 统一标识
     */
    @Override
    public BAuthorityRecord setSigma(String value) {
        set(9, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.B_AUTHORITY.SIGMA</code>. 「sigma」- 统一标识
     */
    @Override
    public String getSigma() {
        return (String) get(9);
    }

    /**
     * Setter for <code>ZDB.B_AUTHORITY.METADATA</code>. 「metadata」- 附加配置
     */
    @Override
    public BAuthorityRecord setMetadata(String value) {
        set(10, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.B_AUTHORITY.METADATA</code>. 「metadata」- 附加配置
     */
    @Override
    public String getMetadata() {
        return (String) get(10);
    }

    /**
     * Setter for <code>ZDB.B_AUTHORITY.LANGUAGE</code>. 「language」- 使用的语言
     */
    @Override
    public BAuthorityRecord setLanguage(String value) {
        set(11, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.B_AUTHORITY.LANGUAGE</code>. 「language」- 使用的语言
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
    public Row12<String, String, String, String, String, String, String, String, Boolean, String, String, String> fieldsRow() {
        return (Row12) super.fieldsRow();
    }

    @Override
    public Row12<String, String, String, String, String, String, String, String, Boolean, String, String, String> valuesRow() {
        return (Row12) super.valuesRow();
    }

    @Override
    public Field<String> field1() {
        return BAuthority.B_AUTHORITY.KEY;
    }

    @Override
    public Field<String> field2() {
        return BAuthority.B_AUTHORITY.CODE;
    }

    @Override
    public Field<String> field3() {
        return BAuthority.B_AUTHORITY.BLOCK_ID;
    }

    @Override
    public Field<String> field4() {
        return BAuthority.B_AUTHORITY.TYPE;
    }

    @Override
    public Field<String> field5() {
        return BAuthority.B_AUTHORITY.LIC_RESOURCE;
    }

    @Override
    public Field<String> field6() {
        return BAuthority.B_AUTHORITY.LIC_ACTION;
    }

    @Override
    public Field<String> field7() {
        return BAuthority.B_AUTHORITY.LIC_PERMISSION;
    }

    @Override
    public Field<String> field8() {
        return BAuthority.B_AUTHORITY.LIC_VIEW;
    }

    @Override
    public Field<Boolean> field9() {
        return BAuthority.B_AUTHORITY.ACTIVE;
    }

    @Override
    public Field<String> field10() {
        return BAuthority.B_AUTHORITY.SIGMA;
    }

    @Override
    public Field<String> field11() {
        return BAuthority.B_AUTHORITY.METADATA;
    }

    @Override
    public Field<String> field12() {
        return BAuthority.B_AUTHORITY.LANGUAGE;
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
        return getBlockId();
    }

    @Override
    public String component4() {
        return getType();
    }

    @Override
    public String component5() {
        return getLicResource();
    }

    @Override
    public String component6() {
        return getLicAction();
    }

    @Override
    public String component7() {
        return getLicPermission();
    }

    @Override
    public String component8() {
        return getLicView();
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
        return getCode();
    }

    @Override
    public String value3() {
        return getBlockId();
    }

    @Override
    public String value4() {
        return getType();
    }

    @Override
    public String value5() {
        return getLicResource();
    }

    @Override
    public String value6() {
        return getLicAction();
    }

    @Override
    public String value7() {
        return getLicPermission();
    }

    @Override
    public String value8() {
        return getLicView();
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
    public BAuthorityRecord value1(String value) {
        setKey(value);
        return this;
    }

    @Override
    public BAuthorityRecord value2(String value) {
        setCode(value);
        return this;
    }

    @Override
    public BAuthorityRecord value3(String value) {
        setBlockId(value);
        return this;
    }

    @Override
    public BAuthorityRecord value4(String value) {
        setType(value);
        return this;
    }

    @Override
    public BAuthorityRecord value5(String value) {
        setLicResource(value);
        return this;
    }

    @Override
    public BAuthorityRecord value6(String value) {
        setLicAction(value);
        return this;
    }

    @Override
    public BAuthorityRecord value7(String value) {
        setLicPermission(value);
        return this;
    }

    @Override
    public BAuthorityRecord value8(String value) {
        setLicView(value);
        return this;
    }

    @Override
    public BAuthorityRecord value9(Boolean value) {
        setActive(value);
        return this;
    }

    @Override
    public BAuthorityRecord value10(String value) {
        setSigma(value);
        return this;
    }

    @Override
    public BAuthorityRecord value11(String value) {
        setMetadata(value);
        return this;
    }

    @Override
    public BAuthorityRecord value12(String value) {
        setLanguage(value);
        return this;
    }

    @Override
    public BAuthorityRecord values(String value1, String value2, String value3, String value4, String value5, String value6, String value7, String value8, Boolean value9, String value10, String value11, String value12) {
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
    public void from(IBAuthority from) {
        setKey(from.getKey());
        setCode(from.getCode());
        setBlockId(from.getBlockId());
        setType(from.getType());
        setLicResource(from.getLicResource());
        setLicAction(from.getLicAction());
        setLicPermission(from.getLicPermission());
        setLicView(from.getLicView());
        setActive(from.getActive());
        setSigma(from.getSigma());
        setMetadata(from.getMetadata());
        setLanguage(from.getLanguage());
        resetChangedOnNotNull();
    }

    @Override
    public <E extends IBAuthority> E into(E into) {
        into.from(this);
        return into;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached BAuthorityRecord
     */
    public BAuthorityRecord() {
        super(BAuthority.B_AUTHORITY);
    }

    /**
     * Create a detached, initialised BAuthorityRecord
     */
    public BAuthorityRecord(String key, String code, String blockId, String type, String licResource, String licAction, String licPermission, String licView, Boolean active, String sigma, String metadata, String language) {
        super(BAuthority.B_AUTHORITY);

        setKey(key);
        setCode(code);
        setBlockId(blockId);
        setType(type);
        setLicResource(licResource);
        setLicAction(licAction);
        setLicPermission(licPermission);
        setLicView(licView);
        setActive(active);
        setSigma(sigma);
        setMetadata(metadata);
        setLanguage(language);
        resetChangedOnNotNull();
    }

    /**
     * Create a detached, initialised BAuthorityRecord
     */
    public BAuthorityRecord(cn.vertxup.battery.domain.tables.pojos.BAuthority value) {
        super(BAuthority.B_AUTHORITY);

        if (value != null) {
            setKey(value.getKey());
            setCode(value.getCode());
            setBlockId(value.getBlockId());
            setType(value.getType());
            setLicResource(value.getLicResource());
            setLicAction(value.getLicAction());
            setLicPermission(value.getLicPermission());
            setLicView(value.getLicView());
            setActive(value.getActive());
            setSigma(value.getSigma());
            setMetadata(value.getMetadata());
            setLanguage(value.getLanguage());
            resetChangedOnNotNull();
        }
    }

        public BAuthorityRecord(io.vertx.core.json.JsonObject json) {
                this();
                fromJson(json);
        }
}
