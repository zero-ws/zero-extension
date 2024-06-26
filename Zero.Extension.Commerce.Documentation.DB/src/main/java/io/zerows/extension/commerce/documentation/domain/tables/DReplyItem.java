/*
 * This file is generated by jOOQ.
 */
package io.zerows.extension.commerce.documentation.domain.tables;


import io.zerows.extension.commerce.documentation.domain.Keys;
import io.zerows.extension.commerce.documentation.domain.Zdb;
import io.zerows.extension.commerce.documentation.domain.tables.records.DReplyItemRecord;
import org.jooq.Record;
import org.jooq.*;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;

import java.util.function.Function;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({"all", "unchecked", "rawtypes"})
public class DReplyItem extends TableImpl<DReplyItemRecord> {

    /**
     * The reference instance of <code>ZDB.D_REPLY_ITEM</code>
     */
    public static final DReplyItem D_REPLY_ITEM = new DReplyItem();
    private static final long serialVersionUID = 1L;
    /**
     * The column <code>ZDB.D_REPLY_ITEM.REPLY_ID</code>. 「replyId」- 答题卡ID
     */
    public final TableField<DReplyItemRecord, String> REPLY_ID = createField(DSL.name("REPLY_ID"), SQLDataType.VARCHAR(36).nullable(false), this, "「replyId」- 答题卡ID");
    /**
     * The column <code>ZDB.D_REPLY_ITEM.QUESTION_CODE</code>. 「questionCode」-
     * 问题编号
     */
    public final TableField<DReplyItemRecord, String> QUESTION_CODE = createField(DSL.name("QUESTION_CODE"), SQLDataType.VARCHAR(255).nullable(false), this, "「questionCode」- 问题编号");
    /**
     * The column <code>ZDB.D_REPLY_ITEM.ANSWER_CONTENT</code>. 「answerContent」-
     * 答题内容
     */
    public final TableField<DReplyItemRecord, String> ANSWER_CONTENT = createField(DSL.name("ANSWER_CONTENT"), SQLDataType.CLOB, this, "「answerContent」- 答题内容");
    /**
     * The column <code>ZDB.D_REPLY_ITEM.ANSWER_FILES</code>. 「answerFiles」-
     * 答题文件
     */
    public final TableField<DReplyItemRecord, String> ANSWER_FILES = createField(DSL.name("ANSWER_FILES"), SQLDataType.CLOB, this, "「answerFiles」- 答题文件");
    /**
     * The column <code>ZDB.D_REPLY_ITEM.ANSWER_PROOF</code>. 「answerProof」-
     * 答题证明
     */
    public final TableField<DReplyItemRecord, String> ANSWER_PROOF = createField(DSL.name("ANSWER_PROOF"), SQLDataType.CLOB, this, "「answerProof」- 答题证明");
    /**
     * The column <code>ZDB.D_REPLY_ITEM.SORT</code>. 「sort」- 问题排序
     */
    public final TableField<DReplyItemRecord, Integer> SORT = createField(DSL.name("SORT"), SQLDataType.INTEGER, this, "「sort」- 问题排序");
    /**
     * The column <code>ZDB.D_REPLY_ITEM.ANSWER_COMPONENT</code>.
     * 「answerComponent」- 关联执行组件（扩展用）
     */
    public final TableField<DReplyItemRecord, String> ANSWER_COMPONENT = createField(DSL.name("ANSWER_COMPONENT"), SQLDataType.VARCHAR(255), this, "「answerComponent」- 关联执行组件（扩展用）");

    private DReplyItem(Name alias, Table<DReplyItemRecord> aliased) {
        this(alias, aliased, null);
    }

    private DReplyItem(Name alias, Table<DReplyItemRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>ZDB.D_REPLY_ITEM</code> table reference
     */
    public DReplyItem(String alias) {
        this(DSL.name(alias), D_REPLY_ITEM);
    }

    /**
     * Create an aliased <code>ZDB.D_REPLY_ITEM</code> table reference
     */
    public DReplyItem(Name alias) {
        this(alias, D_REPLY_ITEM);
    }

    /**
     * Create a <code>ZDB.D_REPLY_ITEM</code> table reference
     */
    public DReplyItem() {
        this(DSL.name("D_REPLY_ITEM"), null);
    }

    public <O extends Record> DReplyItem(Table<O> child, ForeignKey<O, DReplyItemRecord> key) {
        super(child, key, D_REPLY_ITEM);
    }

    /**
     * The class holding records for this type
     */
    @Override
    public Class<DReplyItemRecord> getRecordType() {
        return DReplyItemRecord.class;
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Zdb.ZDB;
    }

    @Override
    public UniqueKey<DReplyItemRecord> getPrimaryKey() {
        return Keys.KEY_D_REPLY_ITEM_PRIMARY;
    }

    @Override
    public DReplyItem as(String alias) {
        return new DReplyItem(DSL.name(alias), this);
    }

    @Override
    public DReplyItem as(Name alias) {
        return new DReplyItem(alias, this);
    }

    @Override
    public DReplyItem as(Table<?> alias) {
        return new DReplyItem(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public DReplyItem rename(String name) {
        return new DReplyItem(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public DReplyItem rename(Name name) {
        return new DReplyItem(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public DReplyItem rename(Table<?> name) {
        return new DReplyItem(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row7 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row7<String, String, String, String, String, Integer, String> fieldsRow() {
        return (Row7) super.fieldsRow();
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function7<? super String, ? super String, ? super String, ? super String, ? super String, ? super Integer, ? super String, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function7<? super String, ? super String, ? super String, ? super String, ? super String, ? super Integer, ? super String, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}
