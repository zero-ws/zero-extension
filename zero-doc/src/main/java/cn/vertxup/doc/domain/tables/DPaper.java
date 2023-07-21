/*
 * This file is generated by jOOQ.
 */
package cn.vertxup.doc.domain.tables;


import cn.vertxup.doc.domain.Keys;
import cn.vertxup.doc.domain.Zdb;
import cn.vertxup.doc.domain.tables.records.DPaperRecord;

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
public class DPaper extends TableImpl<DPaperRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>ZDB.D_PAPER</code>
     */
    public static final DPaper D_PAPER = new DPaper();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<DPaperRecord> getRecordType() {
        return DPaperRecord.class;
    }

    /**
     * The column <code>ZDB.D_PAPER.KEY</code>. 「key」- 问卷主键
     */
    public final TableField<DPaperRecord, String> KEY = createField(DSL.name("KEY"), SQLDataType.VARCHAR(36).nullable(false), this, "「key」- 问卷主键");

    /**
     * The column <code>ZDB.D_PAPER.CODE</code>. 「code」- 问卷编号
     */
    public final TableField<DPaperRecord, String> CODE = createField(DSL.name("CODE"), SQLDataType.VARCHAR(255), this, "「code」- 问卷编号");

    /**
     * The column <code>ZDB.D_PAPER.NAME</code>. 「name」- 问卷标题
     */
    public final TableField<DPaperRecord, String> NAME = createField(DSL.name("NAME"), SQLDataType.VARCHAR(255), this, "「name」- 问卷标题");

    /**
     * The column <code>ZDB.D_PAPER.TYPE</code>. 「type」- 问卷类型
     */
    public final TableField<DPaperRecord, String> TYPE = createField(DSL.name("TYPE"), SQLDataType.VARCHAR(128), this, "「type」- 问卷类型");

    /**
     * The column <code>ZDB.D_PAPER.STATUS</code>. 「status」- 状态
     */
    public final TableField<DPaperRecord, String> STATUS = createField(DSL.name("STATUS"), SQLDataType.VARCHAR(12), this, "「status」- 状态");

    /**
     * The column <code>ZDB.D_PAPER.BRIEF</code>. 「brief」- 问卷简介
     */
    public final TableField<DPaperRecord, String> BRIEF = createField(DSL.name("BRIEF"), SQLDataType.CLOB, this, "「brief」- 问卷简介");

    /**
     * The column <code>ZDB.D_PAPER.VERSION</code>. 「version」- 问卷版本, N.N
     */
    public final TableField<DPaperRecord, String> VERSION = createField(DSL.name("VERSION"), SQLDataType.VARCHAR(32), this, "「version」- 问卷版本, N.N");

    /**
     * The column <code>ZDB.D_PAPER.SIMULATE</code>. 「simulate」- 是否模拟卷
     */
    public final TableField<DPaperRecord, Boolean> SIMULATE = createField(DSL.name("SIMULATE"), SQLDataType.BIT, this, "「simulate」- 是否模拟卷");

    /**
     * The column <code>ZDB.D_PAPER.SCORE</code>. 「score」- 当前考卷总体分数
     */
    public final TableField<DPaperRecord, BigDecimal> SCORE = createField(DSL.name("SCORE"), SQLDataType.DECIMAL(18, 4), this, "「score」- 当前考卷总体分数");

    /**
     * The column <code>ZDB.D_PAPER.UI_COVER</code>. 「uiCover」- 封面图片
     */
    public final TableField<DPaperRecord, String> UI_COVER = createField(DSL.name("UI_COVER"), SQLDataType.CLOB, this, "「uiCover」- 封面图片");

    /**
     * The column <code>ZDB.D_PAPER.UI_BG</code>. 「uiBg」- 问卷背景图
     */
    public final TableField<DPaperRecord, String> UI_BG = createField(DSL.name("UI_BG"), SQLDataType.CLOB, this, "「uiBg」- 问卷背景图");

    /**
     * The column <code>ZDB.D_PAPER.UI_CONFIG</code>. 「uiConfig」- 问卷配置
     */
    public final TableField<DPaperRecord, String> UI_CONFIG = createField(DSL.name("UI_CONFIG"), SQLDataType.CLOB, this, "「uiConfig」- 问卷配置");

    /**
     * The column <code>ZDB.D_PAPER.UI_COMPONENT</code>. 「uiComponent」-
     * 问卷呈现专用配置（扩展用）
     */
    public final TableField<DPaperRecord, String> UI_COMPONENT = createField(DSL.name("UI_COMPONENT"), SQLDataType.VARCHAR(255), this, "「uiComponent」- 问卷呈现专用配置（扩展用）");

    /**
     * The column <code>ZDB.D_PAPER.EXAM_ID</code>. 「examId」- 关联的考试ID
     */
    public final TableField<DPaperRecord, String> EXAM_ID = createField(DSL.name("EXAM_ID"), SQLDataType.VARCHAR(36), this, "「examId」- 关联的考试ID");

    /**
     * The column <code>ZDB.D_PAPER.MODEL_ID</code>. 「modelId」-
     * 关联的模型identifier，用于描述
     */
    public final TableField<DPaperRecord, String> MODEL_ID = createField(DSL.name("MODEL_ID"), SQLDataType.VARCHAR(255), this, "「modelId」- 关联的模型identifier，用于描述");

    /**
     * The column <code>ZDB.D_PAPER.MODEL_KEY</code>. 「modelKey」-
     * 关联的模型记录ID，用于描述哪一个Model中的记录
     */
    public final TableField<DPaperRecord, String> MODEL_KEY = createField(DSL.name("MODEL_KEY"), SQLDataType.VARCHAR(36), this, "「modelKey」- 关联的模型记录ID，用于描述哪一个Model中的记录");

    /**
     * The column <code>ZDB.D_PAPER.COPY</code>. 「copy」- 是否副本
     */
    public final TableField<DPaperRecord, Boolean> COPY = createField(DSL.name("COPY"), SQLDataType.BIT, this, "「copy」- 是否副本");

    /**
     * The column <code>ZDB.D_PAPER.COPY_TO</code>. 「copy」- 若是副本，则标注是哪份文档的副本
     */
    public final TableField<DPaperRecord, String> COPY_TO = createField(DSL.name("COPY_TO"), SQLDataType.VARCHAR(36), this, "「copy」- 若是副本，则标注是哪份文档的副本");

    /**
     * The column <code>ZDB.D_PAPER.SIGMA</code>. 「sigma」- 统一标识
     */
    public final TableField<DPaperRecord, String> SIGMA = createField(DSL.name("SIGMA"), SQLDataType.VARCHAR(32), this, "「sigma」- 统一标识");

    /**
     * The column <code>ZDB.D_PAPER.LANGUAGE</code>. 「language」- 使用的语言
     */
    public final TableField<DPaperRecord, String> LANGUAGE = createField(DSL.name("LANGUAGE"), SQLDataType.VARCHAR(10), this, "「language」- 使用的语言");

    /**
     * The column <code>ZDB.D_PAPER.ACTIVE</code>. 「active」- 是否启用
     */
    public final TableField<DPaperRecord, Boolean> ACTIVE = createField(DSL.name("ACTIVE"), SQLDataType.BIT, this, "「active」- 是否启用");

    /**
     * The column <code>ZDB.D_PAPER.METADATA</code>. 「metadata」- 附加配置数据
     */
    public final TableField<DPaperRecord, String> METADATA = createField(DSL.name("METADATA"), SQLDataType.CLOB, this, "「metadata」- 附加配置数据");

    /**
     * The column <code>ZDB.D_PAPER.CREATED_AT</code>. 「createdAt」- 创建时间
     */
    public final TableField<DPaperRecord, LocalDateTime> CREATED_AT = createField(DSL.name("CREATED_AT"), SQLDataType.LOCALDATETIME(0), this, "「createdAt」- 创建时间");

    /**
     * The column <code>ZDB.D_PAPER.CREATED_BY</code>. 「createdBy」- 创建人
     */
    public final TableField<DPaperRecord, String> CREATED_BY = createField(DSL.name("CREATED_BY"), SQLDataType.VARCHAR(36), this, "「createdBy」- 创建人");

    /**
     * The column <code>ZDB.D_PAPER.UPDATED_AT</code>. 「updatedAt」- 更新时间
     */
    public final TableField<DPaperRecord, LocalDateTime> UPDATED_AT = createField(DSL.name("UPDATED_AT"), SQLDataType.LOCALDATETIME(0), this, "「updatedAt」- 更新时间");

    /**
     * The column <code>ZDB.D_PAPER.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    public final TableField<DPaperRecord, String> UPDATED_BY = createField(DSL.name("UPDATED_BY"), SQLDataType.VARCHAR(36), this, "「updatedBy」- 更新人");

    private DPaper(Name alias, Table<DPaperRecord> aliased) {
        this(alias, aliased, null);
    }

    private DPaper(Name alias, Table<DPaperRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>ZDB.D_PAPER</code> table reference
     */
    public DPaper(String alias) {
        this(DSL.name(alias), D_PAPER);
    }

    /**
     * Create an aliased <code>ZDB.D_PAPER</code> table reference
     */
    public DPaper(Name alias) {
        this(alias, D_PAPER);
    }

    /**
     * Create a <code>ZDB.D_PAPER</code> table reference
     */
    public DPaper() {
        this(DSL.name("D_PAPER"), null);
    }

    public <O extends Record> DPaper(Table<O> child, ForeignKey<O, DPaperRecord> key) {
        super(child, key, D_PAPER);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Zdb.ZDB;
    }

    @Override
    public UniqueKey<DPaperRecord> getPrimaryKey() {
        return Keys.KEY_D_PAPER_PRIMARY;
    }

    @Override
    public List<UniqueKey<DPaperRecord>> getUniqueKeys() {
        return Arrays.asList(Keys.KEY_D_PAPER_CODE, Keys.KEY_D_PAPER_NAME);
    }

    @Override
    public DPaper as(String alias) {
        return new DPaper(DSL.name(alias), this);
    }

    @Override
    public DPaper as(Name alias) {
        return new DPaper(alias, this);
    }

    @Override
    public DPaper as(Table<?> alias) {
        return new DPaper(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public DPaper rename(String name) {
        return new DPaper(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public DPaper rename(Name name) {
        return new DPaper(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public DPaper rename(Table<?> name) {
        return new DPaper(name.getQualifiedName(), null);
    }
}
