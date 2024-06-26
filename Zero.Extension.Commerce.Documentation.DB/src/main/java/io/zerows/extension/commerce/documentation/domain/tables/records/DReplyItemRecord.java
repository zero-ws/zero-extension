/*
 * This file is generated by jOOQ.
 */
package io.zerows.extension.commerce.documentation.domain.tables.records;


import io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo;
import io.zerows.extension.commerce.documentation.domain.tables.DReplyItem;
import io.zerows.extension.commerce.documentation.domain.tables.interfaces.IDReplyItem;
import org.jooq.Field;
import org.jooq.Record2;
import org.jooq.Record7;
import org.jooq.Row7;
import org.jooq.impl.UpdatableRecordImpl;

/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({"all", "unchecked", "rawtypes"})
public class DReplyItemRecord extends UpdatableRecordImpl<DReplyItemRecord> implements VertxPojo, Record7<String, String, String, String, String, Integer, String>, IDReplyItem {

    private static final long serialVersionUID = 1L;

    /**
     * Create a detached DReplyItemRecord
     */
    public DReplyItemRecord() {
        super(DReplyItem.D_REPLY_ITEM);
    }

    /**
     * Create a detached, initialised DReplyItemRecord
     */
    public DReplyItemRecord(String replyId, String questionCode, String answerContent, String answerFiles, String answerProof, Integer sort, String answerComponent) {
        super(DReplyItem.D_REPLY_ITEM);

        setReplyId(replyId);
        setQuestionCode(questionCode);
        setAnswerContent(answerContent);
        setAnswerFiles(answerFiles);
        setAnswerProof(answerProof);
        setSort(sort);
        setAnswerComponent(answerComponent);
        resetChangedOnNotNull();
    }

    /**
     * Create a detached, initialised DReplyItemRecord
     */
    public DReplyItemRecord(io.zerows.extension.commerce.documentation.domain.tables.pojos.DReplyItem value) {
        super(DReplyItem.D_REPLY_ITEM);

        if (value != null) {
            setReplyId(value.getReplyId());
            setQuestionCode(value.getQuestionCode());
            setAnswerContent(value.getAnswerContent());
            setAnswerFiles(value.getAnswerFiles());
            setAnswerProof(value.getAnswerProof());
            setSort(value.getSort());
            setAnswerComponent(value.getAnswerComponent());
            resetChangedOnNotNull();
        }
    }

    public DReplyItemRecord(io.vertx.core.json.JsonObject json) {
        this();
        fromJson(json);
    }

    /**
     * Getter for <code>ZDB.D_REPLY_ITEM.REPLY_ID</code>. 「replyId」- 答题卡ID
     */
    @Override
    public String getReplyId() {
        return (String) get(0);
    }

    /**
     * Setter for <code>ZDB.D_REPLY_ITEM.REPLY_ID</code>. 「replyId」- 答题卡ID
     */
    @Override
    public DReplyItemRecord setReplyId(String value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.D_REPLY_ITEM.QUESTION_CODE</code>. 「questionCode」-
     * 问题编号
     */
    @Override
    public String getQuestionCode() {
        return (String) get(1);
    }

    /**
     * Setter for <code>ZDB.D_REPLY_ITEM.QUESTION_CODE</code>. 「questionCode」-
     * 问题编号
     */
    @Override
    public DReplyItemRecord setQuestionCode(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.D_REPLY_ITEM.ANSWER_CONTENT</code>. 「answerContent」-
     * 答题内容
     */
    @Override
    public String getAnswerContent() {
        return (String) get(2);
    }

    /**
     * Setter for <code>ZDB.D_REPLY_ITEM.ANSWER_CONTENT</code>. 「answerContent」-
     * 答题内容
     */
    @Override
    public DReplyItemRecord setAnswerContent(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.D_REPLY_ITEM.ANSWER_FILES</code>. 「answerFiles」-
     * 答题文件
     */
    @Override
    public String getAnswerFiles() {
        return (String) get(3);
    }

    /**
     * Setter for <code>ZDB.D_REPLY_ITEM.ANSWER_FILES</code>. 「answerFiles」-
     * 答题文件
     */
    @Override
    public DReplyItemRecord setAnswerFiles(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.D_REPLY_ITEM.ANSWER_PROOF</code>. 「answerProof」-
     * 答题证明
     */
    @Override
    public String getAnswerProof() {
        return (String) get(4);
    }

    /**
     * Setter for <code>ZDB.D_REPLY_ITEM.ANSWER_PROOF</code>. 「answerProof」-
     * 答题证明
     */
    @Override
    public DReplyItemRecord setAnswerProof(String value) {
        set(4, value);
        return this;
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * Getter for <code>ZDB.D_REPLY_ITEM.SORT</code>. 「sort」- 问题排序
     */
    @Override
    public Integer getSort() {
        return (Integer) get(5);
    }

    // -------------------------------------------------------------------------
    // Record7 type implementation
    // -------------------------------------------------------------------------

    /**
     * Setter for <code>ZDB.D_REPLY_ITEM.SORT</code>. 「sort」- 问题排序
     */
    @Override
    public DReplyItemRecord setSort(Integer value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.D_REPLY_ITEM.ANSWER_COMPONENT</code>.
     * 「answerComponent」- 关联执行组件（扩展用）
     */
    @Override
    public String getAnswerComponent() {
        return (String) get(6);
    }

    /**
     * Setter for <code>ZDB.D_REPLY_ITEM.ANSWER_COMPONENT</code>.
     * 「answerComponent」- 关联执行组件（扩展用）
     */
    @Override
    public DReplyItemRecord setAnswerComponent(String value) {
        set(6, value);
        return this;
    }

    @Override
    public Record2<String, String> key() {
        return (Record2) super.key();
    }

    @Override
    public Row7<String, String, String, String, String, Integer, String> fieldsRow() {
        return (Row7) super.fieldsRow();
    }

    @Override
    public Row7<String, String, String, String, String, Integer, String> valuesRow() {
        return (Row7) super.valuesRow();
    }

    @Override
    public Field<String> field1() {
        return DReplyItem.D_REPLY_ITEM.REPLY_ID;
    }

    @Override
    public Field<String> field2() {
        return DReplyItem.D_REPLY_ITEM.QUESTION_CODE;
    }

    @Override
    public Field<String> field3() {
        return DReplyItem.D_REPLY_ITEM.ANSWER_CONTENT;
    }

    @Override
    public Field<String> field4() {
        return DReplyItem.D_REPLY_ITEM.ANSWER_FILES;
    }

    @Override
    public Field<String> field5() {
        return DReplyItem.D_REPLY_ITEM.ANSWER_PROOF;
    }

    @Override
    public Field<Integer> field6() {
        return DReplyItem.D_REPLY_ITEM.SORT;
    }

    @Override
    public Field<String> field7() {
        return DReplyItem.D_REPLY_ITEM.ANSWER_COMPONENT;
    }

    @Override
    public String component1() {
        return getReplyId();
    }

    @Override
    public String component2() {
        return getQuestionCode();
    }

    @Override
    public String component3() {
        return getAnswerContent();
    }

    @Override
    public String component4() {
        return getAnswerFiles();
    }

    @Override
    public String component5() {
        return getAnswerProof();
    }

    @Override
    public Integer component6() {
        return getSort();
    }

    @Override
    public String component7() {
        return getAnswerComponent();
    }

    @Override
    public String value1() {
        return getReplyId();
    }

    @Override
    public String value2() {
        return getQuestionCode();
    }

    @Override
    public String value3() {
        return getAnswerContent();
    }

    @Override
    public String value4() {
        return getAnswerFiles();
    }

    @Override
    public String value5() {
        return getAnswerProof();
    }

    @Override
    public Integer value6() {
        return getSort();
    }

    @Override
    public String value7() {
        return getAnswerComponent();
    }

    @Override
    public DReplyItemRecord value1(String value) {
        setReplyId(value);
        return this;
    }

    @Override
    public DReplyItemRecord value2(String value) {
        setQuestionCode(value);
        return this;
    }

    @Override
    public DReplyItemRecord value3(String value) {
        setAnswerContent(value);
        return this;
    }

    @Override
    public DReplyItemRecord value4(String value) {
        setAnswerFiles(value);
        return this;
    }

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    @Override
    public DReplyItemRecord value5(String value) {
        setAnswerProof(value);
        return this;
    }

    @Override
    public DReplyItemRecord value6(Integer value) {
        setSort(value);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    @Override
    public DReplyItemRecord value7(String value) {
        setAnswerComponent(value);
        return this;
    }

    @Override
    public DReplyItemRecord values(String value1, String value2, String value3, String value4, String value5, Integer value6, String value7) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        return this;
    }

    @Override
    public void from(IDReplyItem from) {
        setReplyId(from.getReplyId());
        setQuestionCode(from.getQuestionCode());
        setAnswerContent(from.getAnswerContent());
        setAnswerFiles(from.getAnswerFiles());
        setAnswerProof(from.getAnswerProof());
        setSort(from.getSort());
        setAnswerComponent(from.getAnswerComponent());
        resetChangedOnNotNull();
    }

    @Override
    public <E extends IDReplyItem> E into(E into) {
        into.from(this);
        return into;
    }
}
