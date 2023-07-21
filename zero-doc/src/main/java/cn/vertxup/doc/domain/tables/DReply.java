/*
 * This file is generated by jOOQ.
 */
package cn.vertxup.doc.domain.tables;


import cn.vertxup.doc.domain.Keys;
import cn.vertxup.doc.domain.Zdb;
import cn.vertxup.doc.domain.tables.records.DReplyRecord;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class DReply extends TableImpl<DReplyRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>ZDB.D_REPLY</code>
     */
    public static final DReply D_REPLY = new DReply();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<DReplyRecord> getRecordType() {
        return DReplyRecord.class;
    }

    /**
     * The column <code>ZDB.D_REPLY.KEY</code>. 「key」- 答题卡主键
     */
    public final TableField<DReplyRecord, String> KEY = createField(DSL.name("KEY"), SQLDataType.VARCHAR(36).nullable(false), this, "「key」- 答题卡主键");

    /**
     * The column <code>ZDB.D_REPLY.CODE</code>. 「code」- 答题卡编号
     */
    public final TableField<DReplyRecord, String> CODE = createField(DSL.name("CODE"), SQLDataType.VARCHAR(255), this, "「code」- 答题卡编号");

    /**
     * The column <code>ZDB.D_REPLY.USER_ID</code>. 「userId」- 考生ID
     */
    public final TableField<DReplyRecord, String> USER_ID = createField(DSL.name("USER_ID"), SQLDataType.VARCHAR(36), this, "「userId」- 考生ID");

    /**
     * The column <code>ZDB.D_REPLY.USER_NAME</code>. 「userName」- 考生姓名
     */
    public final TableField<DReplyRecord, String> USER_NAME = createField(DSL.name("USER_NAME"), SQLDataType.VARCHAR(255), this, "「userName」- 考生姓名");

    /**
     * The column <code>ZDB.D_REPLY.USER_NO</code>. 「userNo」- 准考证号
     */
    public final TableField<DReplyRecord, String> USER_NO = createField(DSL.name("USER_NO"), SQLDataType.VARCHAR(255), this, "「userNo」- 准考证号");

    /**
     * The column <code>ZDB.D_REPLY.IDENTITY_IDC</code>. 「identityIdc」- 证件号
     */
    public final TableField<DReplyRecord, String> IDENTITY_IDC = createField(DSL.name("IDENTITY_IDC"), SQLDataType.VARCHAR(255), this, "「identityIdc」- 证件号");

    /**
     * The column <code>ZDB.D_REPLY.IDENTITY_ID</code>. 「identityId」-
     * 关联档案时考生档案ID
     */
    public final TableField<DReplyRecord, String> IDENTITY_ID = createField(DSL.name("IDENTITY_ID"), SQLDataType.VARCHAR(36), this, "「identityId」- 关联档案时考生档案ID");

    /**
     * The column <code>ZDB.D_REPLY.EXAM_ID</code>. 「examId」- 哪场考试答题卡
     */
    public final TableField<DReplyRecord, String> EXAM_ID = createField(DSL.name("EXAM_ID"), SQLDataType.VARCHAR(36), this, "「examId」- 哪场考试答题卡");

    /**
     * The column <code>ZDB.D_REPLY.PAPER_ID</code>. 「paperId」- 哪张试卷答题卡
     */
    public final TableField<DReplyRecord, String> PAPER_ID = createField(DSL.name("PAPER_ID"), SQLDataType.VARCHAR(36), this, "「paperId」- 哪张试卷答题卡");

    /**
     * The column <code>ZDB.D_REPLY.MODEL_ID</code>. 「modelId」-
     * 关联的模型identifier，用于描述
     */
    public final TableField<DReplyRecord, String> MODEL_ID = createField(DSL.name("MODEL_ID"), SQLDataType.VARCHAR(255), this, "「modelId」- 关联的模型identifier，用于描述");

    /**
     * The column <code>ZDB.D_REPLY.MODEL_KEY</code>. 「modelKey」-
     * 关联的模型记录ID，用于描述哪一个Model中的记录
     */
    public final TableField<DReplyRecord, String> MODEL_KEY = createField(DSL.name("MODEL_KEY"), SQLDataType.VARCHAR(36), this, "「modelKey」- 关联的模型记录ID，用于描述哪一个Model中的记录");

    /**
     * The column <code>ZDB.D_REPLY.SCORE</code>. 「score」- 得分
     */
    public final TableField<DReplyRecord, BigDecimal> SCORE = createField(DSL.name("SCORE"), SQLDataType.DECIMAL(10, 2), this, "「score」- 得分");

    /**
     * The column <code>ZDB.D_REPLY.GRADE</code>. 「grade」- 最终评级 S/A/B/C/D/E
     */
    public final TableField<DReplyRecord, String> GRADE = createField(DSL.name("GRADE"), SQLDataType.VARCHAR(32), this, "「grade」- 最终评级 S/A/B/C/D/E");

    /**
     * The column <code>ZDB.D_REPLY.PASSED</code>. 「passed」- 是否及格，及格 passed =
     * true，否则 passed = false
     */
    public final TableField<DReplyRecord, Boolean> PASSED = createField(DSL.name("PASSED"), SQLDataType.BIT, this, "「passed」- 是否及格，及格 passed = true，否则 passed = false");

    /**
     * The column <code>ZDB.D_REPLY.Q_TOTAL</code>. 「qTotal」- 试题总量
     */
    public final TableField<DReplyRecord, Integer> Q_TOTAL = createField(DSL.name("Q_TOTAL"), SQLDataType.INTEGER, this, "「qTotal」- 试题总量");

    /**
     * The column <code>ZDB.D_REPLY.Q_REPLY</code>. 「qReply」- 已答试题数量
     */
    public final TableField<DReplyRecord, Integer> Q_REPLY = createField(DSL.name("Q_REPLY"), SQLDataType.INTEGER, this, "「qReply」- 已答试题数量");

    /**
     * The column <code>ZDB.D_REPLY.Q_OK</code>. 「qOk」- 正确试题数量
     */
    public final TableField<DReplyRecord, Integer> Q_OK = createField(DSL.name("Q_OK"), SQLDataType.INTEGER, this, "「qOk」- 正确试题数量");

    /**
     * The column <code>ZDB.D_REPLY.SIGMA</code>. 「sigma」- 统一标识
     */
    public final TableField<DReplyRecord, String> SIGMA = createField(DSL.name("SIGMA"), SQLDataType.VARCHAR(32), this, "「sigma」- 统一标识");

    /**
     * The column <code>ZDB.D_REPLY.LANGUAGE</code>. 「language」- 使用的语言
     */
    public final TableField<DReplyRecord, String> LANGUAGE = createField(DSL.name("LANGUAGE"), SQLDataType.VARCHAR(10), this, "「language」- 使用的语言");

    /**
     * The column <code>ZDB.D_REPLY.ACTIVE</code>. 「active」- 是否启用
     */
    public final TableField<DReplyRecord, Boolean> ACTIVE = createField(DSL.name("ACTIVE"), SQLDataType.BIT, this, "「active」- 是否启用");

    /**
     * The column <code>ZDB.D_REPLY.METADATA</code>. 「metadata」- 附加配置数据
     */
    public final TableField<DReplyRecord, String> METADATA = createField(DSL.name("METADATA"), SQLDataType.CLOB, this, "「metadata」- 附加配置数据");

    /**
     * The column <code>ZDB.D_REPLY.CREATED_AT</code>. 「createdAt」- 创建时间
     */
    public final TableField<DReplyRecord, LocalDateTime> CREATED_AT = createField(DSL.name("CREATED_AT"), SQLDataType.LOCALDATETIME(0), this, "「createdAt」- 创建时间");

    /**
     * The column <code>ZDB.D_REPLY.CREATED_BY</code>. 「createdBy」- 创建人
     */
    public final TableField<DReplyRecord, String> CREATED_BY = createField(DSL.name("CREATED_BY"), SQLDataType.VARCHAR(36), this, "「createdBy」- 创建人");

    /**
     * The column <code>ZDB.D_REPLY.UPDATED_AT</code>. 「updatedAt」- 更新时间
     */
    public final TableField<DReplyRecord, LocalDateTime> UPDATED_AT = createField(DSL.name("UPDATED_AT"), SQLDataType.LOCALDATETIME(0), this, "「updatedAt」- 更新时间");

    /**
     * The column <code>ZDB.D_REPLY.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    public final TableField<DReplyRecord, String> UPDATED_BY = createField(DSL.name("UPDATED_BY"), SQLDataType.VARCHAR(36), this, "「updatedBy」- 更新人");

    private DReply(Name alias, Table<DReplyRecord> aliased) {
        this(alias, aliased, null);
    }

    private DReply(Name alias, Table<DReplyRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>ZDB.D_REPLY</code> table reference
     */
    public DReply(String alias) {
        this(DSL.name(alias), D_REPLY);
    }

    /**
     * Create an aliased <code>ZDB.D_REPLY</code> table reference
     */
    public DReply(Name alias) {
        this(alias, D_REPLY);
    }

    /**
     * Create a <code>ZDB.D_REPLY</code> table reference
     */
    public DReply() {
        this(DSL.name("D_REPLY"), null);
    }

    public <O extends Record> DReply(Table<O> child, ForeignKey<O, DReplyRecord> key) {
        super(child, key, D_REPLY);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Zdb.ZDB;
    }

    @Override
    public UniqueKey<DReplyRecord> getPrimaryKey() {
        return Keys.KEY_D_REPLY_PRIMARY;
    }

    @Override
    public List<UniqueKey<DReplyRecord>> getUniqueKeys() {
        return Arrays.asList(Keys.KEY_D_REPLY_CODE);
    }

    @Override
    public DReply as(String alias) {
        return new DReply(DSL.name(alias), this);
    }

    @Override
    public DReply as(Name alias) {
        return new DReply(alias, this);
    }

    @Override
    public DReply as(Table<?> alias) {
        return new DReply(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public DReply rename(String name) {
        return new DReply(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public DReply rename(Name name) {
        return new DReply(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public DReply rename(Table<?> name) {
        return new DReply(name.getQualifiedName(), null);
    }
}
