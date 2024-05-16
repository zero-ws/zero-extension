/*
 * This file is generated by jOOQ.
 */
package io.zerows.extension.mbse.ui.domain.tables.records;


import io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo;
import io.zerows.extension.mbse.ui.domain.tables.VFragment;
import io.zerows.extension.mbse.ui.domain.tables.interfaces.IVFragment;
import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record8;
import org.jooq.Row8;
import org.jooq.impl.UpdatableRecordImpl;

/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({"all", "unchecked", "rawtypes"})
public class VFragmentRecord extends UpdatableRecordImpl<VFragmentRecord> implements VertxPojo, Record8<String, String, String, String, String, String, Integer, String>, IVFragment {

    private static final long serialVersionUID = 1L;

    /**
     * Create a detached VFragmentRecord
     */
    public VFragmentRecord() {
        super(VFragment.V_FRAGMENT);
    }

    /**
     * Create a detached, initialised VFragmentRecord
     */
    public VFragmentRecord(String key, String container, String notice, String buttonConnect, String buttonGroup, String modal, Integer grid, String config) {
        super(VFragment.V_FRAGMENT);

        setKey(key);
        setContainer(container);
        setNotice(notice);
        setButtonConnect(buttonConnect);
        setButtonGroup(buttonGroup);
        setModal(modal);
        setGrid(grid);
        setConfig(config);
        resetChangedOnNotNull();
    }

    /**
     * Create a detached, initialised VFragmentRecord
     */
    public VFragmentRecord(io.zerows.extension.mbse.ui.domain.tables.pojos.VFragment value) {
        super(VFragment.V_FRAGMENT);

        if (value != null) {
            setKey(value.getKey());
            setContainer(value.getContainer());
            setNotice(value.getNotice());
            setButtonConnect(value.getButtonConnect());
            setButtonGroup(value.getButtonGroup());
            setModal(value.getModal());
            setGrid(value.getGrid());
            setConfig(value.getConfig());
            resetChangedOnNotNull();
        }
    }

    public VFragmentRecord(io.vertx.core.json.JsonObject json) {
        this();
        fromJson(json);
    }

    /**
     * Getter for <code>ZDB.V_FRAGMENT.KEY</code>. 「key」- 选项主键
     */
    @Override
    public String getKey() {
        return (String) get(0);
    }

    /**
     * Setter for <code>ZDB.V_FRAGMENT.KEY</code>. 「key」- 选项主键
     */
    @Override
    public VFragmentRecord setKey(String value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.V_FRAGMENT.CONTAINER</code>. 「container」- 容器专用格式
     */
    @Override
    public String getContainer() {
        return (String) get(1);
    }

    /**
     * Setter for <code>ZDB.V_FRAGMENT.CONTAINER</code>. 「container」- 容器专用格式
     */
    @Override
    public VFragmentRecord setContainer(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.V_FRAGMENT.NOTICE</code>. 「notice」- notice选项，Alert结构
     */
    @Override
    public String getNotice() {
        return (String) get(2);
    }

    /**
     * Setter for <code>ZDB.V_FRAGMENT.NOTICE</code>. 「notice」- notice选项，Alert结构
     */
    @Override
    public VFragmentRecord setNotice(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.V_FRAGMENT.BUTTON_CONNECT</code>. 「buttonConnect」-
     * 按钮的ID（单按钮）
     */
    @Override
    public String getButtonConnect() {
        return (String) get(3);
    }

    /**
     * Setter for <code>ZDB.V_FRAGMENT.BUTTON_CONNECT</code>. 「buttonConnect」-
     * 按钮的ID（单按钮）
     */
    @Override
    public VFragmentRecord setButtonConnect(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.V_FRAGMENT.BUTTON_GROUP</code>. 「buttonGroup」-
     * 一组按钮配置
     */
    @Override
    public String getButtonGroup() {
        return (String) get(4);
    }

    /**
     * Setter for <code>ZDB.V_FRAGMENT.BUTTON_GROUP</code>. 「buttonGroup」-
     * 一组按钮配置
     */
    @Override
    public VFragmentRecord setButtonGroup(String value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.V_FRAGMENT.MODAL</code>. 「modal」- modal选项，Model专用结构
     */
    @Override
    public String getModal() {
        return (String) get(5);
    }

    /**
     * Setter for <code>ZDB.V_FRAGMENT.MODAL</code>. 「modal」- modal选项，Model专用结构
     */
    @Override
    public VFragmentRecord setModal(String value) {
        set(5, value);
        return this;
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * Getter for <code>ZDB.V_FRAGMENT.GRID</code>. 「grid」- grid选项（分区面板专用）
     */
    @Override
    public Integer getGrid() {
        return (Integer) get(6);
    }

    // -------------------------------------------------------------------------
    // Record8 type implementation
    // -------------------------------------------------------------------------

    /**
     * Setter for <code>ZDB.V_FRAGMENT.GRID</code>. 「grid」- grid选项（分区面板专用）
     */
    @Override
    public VFragmentRecord setGrid(Integer value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.V_FRAGMENT.CONFIG</code>. 「config」- 根目录开始的基本配置
     */
    @Override
    public String getConfig() {
        return (String) get(7);
    }

    /**
     * Setter for <code>ZDB.V_FRAGMENT.CONFIG</code>. 「config」- 根目录开始的基本配置
     */
    @Override
    public VFragmentRecord setConfig(String value) {
        set(7, value);
        return this;
    }

    @Override
    public Record1<String> key() {
        return (Record1) super.key();
    }

    @Override
    public Row8<String, String, String, String, String, String, Integer, String> fieldsRow() {
        return (Row8) super.fieldsRow();
    }

    @Override
    public Row8<String, String, String, String, String, String, Integer, String> valuesRow() {
        return (Row8) super.valuesRow();
    }

    @Override
    public Field<String> field1() {
        return VFragment.V_FRAGMENT.KEY;
    }

    @Override
    public Field<String> field2() {
        return VFragment.V_FRAGMENT.CONTAINER;
    }

    @Override
    public Field<String> field3() {
        return VFragment.V_FRAGMENT.NOTICE;
    }

    @Override
    public Field<String> field4() {
        return VFragment.V_FRAGMENT.BUTTON_CONNECT;
    }

    @Override
    public Field<String> field5() {
        return VFragment.V_FRAGMENT.BUTTON_GROUP;
    }

    @Override
    public Field<String> field6() {
        return VFragment.V_FRAGMENT.MODAL;
    }

    @Override
    public Field<Integer> field7() {
        return VFragment.V_FRAGMENT.GRID;
    }

    @Override
    public Field<String> field8() {
        return VFragment.V_FRAGMENT.CONFIG;
    }

    @Override
    public String component1() {
        return getKey();
    }

    @Override
    public String component2() {
        return getContainer();
    }

    @Override
    public String component3() {
        return getNotice();
    }

    @Override
    public String component4() {
        return getButtonConnect();
    }

    @Override
    public String component5() {
        return getButtonGroup();
    }

    @Override
    public String component6() {
        return getModal();
    }

    @Override
    public Integer component7() {
        return getGrid();
    }

    @Override
    public String component8() {
        return getConfig();
    }

    @Override
    public String value1() {
        return getKey();
    }

    @Override
    public String value2() {
        return getContainer();
    }

    @Override
    public String value3() {
        return getNotice();
    }

    @Override
    public String value4() {
        return getButtonConnect();
    }

    @Override
    public String value5() {
        return getButtonGroup();
    }

    @Override
    public String value6() {
        return getModal();
    }

    @Override
    public Integer value7() {
        return getGrid();
    }

    @Override
    public String value8() {
        return getConfig();
    }

    @Override
    public VFragmentRecord value1(String value) {
        setKey(value);
        return this;
    }

    @Override
    public VFragmentRecord value2(String value) {
        setContainer(value);
        return this;
    }

    @Override
    public VFragmentRecord value3(String value) {
        setNotice(value);
        return this;
    }

    @Override
    public VFragmentRecord value4(String value) {
        setButtonConnect(value);
        return this;
    }

    @Override
    public VFragmentRecord value5(String value) {
        setButtonGroup(value);
        return this;
    }

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    @Override
    public VFragmentRecord value6(String value) {
        setModal(value);
        return this;
    }

    @Override
    public VFragmentRecord value7(Integer value) {
        setGrid(value);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    @Override
    public VFragmentRecord value8(String value) {
        setConfig(value);
        return this;
    }

    @Override
    public VFragmentRecord values(String value1, String value2, String value3, String value4, String value5, String value6, Integer value7, String value8) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        return this;
    }

    @Override
    public void from(IVFragment from) {
        setKey(from.getKey());
        setContainer(from.getContainer());
        setNotice(from.getNotice());
        setButtonConnect(from.getButtonConnect());
        setButtonGroup(from.getButtonGroup());
        setModal(from.getModal());
        setGrid(from.getGrid());
        setConfig(from.getConfig());
        resetChangedOnNotNull();
    }

    @Override
    public <E extends IVFragment> E into(E into) {
        into.from(this);
        return into;
    }
}