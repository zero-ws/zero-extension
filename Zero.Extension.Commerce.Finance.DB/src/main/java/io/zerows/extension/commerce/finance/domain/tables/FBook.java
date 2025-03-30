/*
 * This file is generated by jOOQ.
 */
package io.zerows.extension.commerce.finance.domain.tables;


import io.zerows.extension.commerce.finance.domain.Indexes;
import io.zerows.extension.commerce.finance.domain.Keys;
import io.zerows.extension.commerce.finance.domain.Zdb;
import io.zerows.extension.commerce.finance.domain.tables.records.FBookRecord;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Index;
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
public class FBook extends TableImpl<FBookRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>ZDB.F_BOOK</code>
     */
    public static final FBook F_BOOK = new FBook();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<FBookRecord> getRecordType() {
        return FBookRecord.class;
    }

    /**
     * The column <code>ZDB.F_BOOK.KEY</code>. 「key」- 账本主键ID
     */
    public final TableField<FBookRecord, String> KEY = createField(DSL.name("KEY"), SQLDataType.VARCHAR(36).nullable(false), this, "「key」- 账本主键ID");

    /**
     * The column <code>ZDB.F_BOOK.NAME</code>. 「name」 - 账本名称
     */
    public final TableField<FBookRecord, String> NAME = createField(DSL.name("NAME"), SQLDataType.VARCHAR(255), this, "「name」 - 账本名称");

    /**
     * The column <code>ZDB.F_BOOK.CODE</code>. 「code」 - 账本的系统编号
     */
    public final TableField<FBookRecord, String> CODE = createField(DSL.name("CODE"), SQLDataType.VARCHAR(255).nullable(false), this, "「code」 - 账本的系统编号");

    /**
     * The column <code>ZDB.F_BOOK.SERIAL</code>. 「serial」 - 财务系统账本编号
     */
    public final TableField<FBookRecord, String> SERIAL = createField(DSL.name("SERIAL"), SQLDataType.VARCHAR(36).nullable(false), this, "「serial」 - 财务系统账本编号");

    /**
     * The column <code>ZDB.F_BOOK.TYPE</code>. 「type」 - 账本类型
     */
    public final TableField<FBookRecord, String> TYPE = createField(DSL.name("TYPE"), SQLDataType.VARCHAR(36).nullable(false), this, "「type」 - 账本类型");

    /**
     * The column <code>ZDB.F_BOOK.STATUS</code>. 「status」 - 账本状态
     */
    public final TableField<FBookRecord, String> STATUS = createField(DSL.name("STATUS"), SQLDataType.VARCHAR(36).nullable(false), this, "「status」 - 账本状态");

    /**
     * The column <code>ZDB.F_BOOK.MAJOR</code>. 「major」- 主账本标识
     */
    public final TableField<FBookRecord, Boolean> MAJOR = createField(DSL.name("MAJOR"), SQLDataType.BIT, this, "「major」- 主账本标识");

    /**
     * The column <code>ZDB.F_BOOK.AMOUNT</code>. 「amount」-
     * 交易金额，正数：应收，负数：应退，最终计算总金额
     */
    public final TableField<FBookRecord, BigDecimal> AMOUNT = createField(DSL.name("AMOUNT"), SQLDataType.DECIMAL(18, 2).nullable(false), this, "「amount」- 交易金额，正数：应收，负数：应退，最终计算总金额");

    /**
     * The column <code>ZDB.F_BOOK.COMMENT</code>. 「comment」 - 账本备注
     */
    public final TableField<FBookRecord, String> COMMENT = createField(DSL.name("COMMENT"), SQLDataType.CLOB, this, "「comment」 - 账本备注");

    /**
     * The column <code>ZDB.F_BOOK.CHECKED</code>. 「checked」- 是否检查
     */
    public final TableField<FBookRecord, Boolean> CHECKED = createField(DSL.name("CHECKED"), SQLDataType.BIT, this, "「checked」- 是否检查");

    /**
     * The column <code>ZDB.F_BOOK.CHECKED_DESC</code>. 「checkedDesc」 - 账本检查描述信息
     */
    public final TableField<FBookRecord, String> CHECKED_DESC = createField(DSL.name("CHECKED_DESC"), SQLDataType.CLOB, this, "「checkedDesc」 - 账本检查描述信息");

    /**
     * The column <code>ZDB.F_BOOK.EXCEED</code>. 「exceed」- 是否加收
     */
    public final TableField<FBookRecord, Boolean> EXCEED = createField(DSL.name("EXCEED"), SQLDataType.BIT, this, "「exceed」- 是否加收");

    /**
     * The column <code>ZDB.F_BOOK.EXCEED_DESC</code>. 「exceedDesc」 - 账本加收描述信息
     */
    public final TableField<FBookRecord, String> EXCEED_DESC = createField(DSL.name("EXCEED_DESC"), SQLDataType.CLOB, this, "「exceedDesc」 - 账本加收描述信息");

    /**
     * The column <code>ZDB.F_BOOK.MODEL_ID</code>. 「modelId」-
     * 关联的模型identifier，用于描述
     */
    public final TableField<FBookRecord, String> MODEL_ID = createField(DSL.name("MODEL_ID"), SQLDataType.VARCHAR(255), this, "「modelId」- 关联的模型identifier，用于描述");

    /**
     * The column <code>ZDB.F_BOOK.MODEL_KEY</code>. 「modelKey」-
     * 关联的模型记录ID，用于描述哪一个Model中的记录
     */
    public final TableField<FBookRecord, String> MODEL_KEY = createField(DSL.name("MODEL_KEY"), SQLDataType.VARCHAR(36), this, "「modelKey」- 关联的模型记录ID，用于描述哪一个Model中的记录");

    /**
     * The column <code>ZDB.F_BOOK.PARENT_ID</code>. 「parentId」- 子账本专用，引用父账本ID
     */
    public final TableField<FBookRecord, String> PARENT_ID = createField(DSL.name("PARENT_ID"), SQLDataType.VARCHAR(36), this, "「parentId」- 子账本专用，引用父账本ID");

    /**
     * The column <code>ZDB.F_BOOK.ORDER_ID</code>. 「orderId」- 订单对应的订单ID
     */
    public final TableField<FBookRecord, String> ORDER_ID = createField(DSL.name("ORDER_ID"), SQLDataType.VARCHAR(36), this, "「orderId」- 订单对应的订单ID");

    /**
     * The column <code>ZDB.F_BOOK.SIGMA</code>. 「sigma」- 统一标识
     */
    public final TableField<FBookRecord, String> SIGMA = createField(DSL.name("SIGMA"), SQLDataType.VARCHAR(32), this, "「sigma」- 统一标识");

    /**
     * The column <code>ZDB.F_BOOK.LANGUAGE</code>. 「language」- 使用的语言
     */
    public final TableField<FBookRecord, String> LANGUAGE = createField(DSL.name("LANGUAGE"), SQLDataType.VARCHAR(10), this, "「language」- 使用的语言");

    /**
     * The column <code>ZDB.F_BOOK.ACTIVE</code>. 「active」- 是否启用
     */
    public final TableField<FBookRecord, Boolean> ACTIVE = createField(DSL.name("ACTIVE"), SQLDataType.BIT, this, "「active」- 是否启用");

    /**
     * The column <code>ZDB.F_BOOK.METADATA</code>. 「metadata」- 附加配置数据
     */
    public final TableField<FBookRecord, String> METADATA = createField(DSL.name("METADATA"), SQLDataType.CLOB, this, "「metadata」- 附加配置数据");

    /**
     * The column <code>ZDB.F_BOOK.CREATED_AT</code>. 「createdAt」- 创建时间
     */
    public final TableField<FBookRecord, LocalDateTime> CREATED_AT = createField(DSL.name("CREATED_AT"), SQLDataType.LOCALDATETIME(0), this, "「createdAt」- 创建时间");

    /**
     * The column <code>ZDB.F_BOOK.CREATED_BY</code>. 「createdBy」- 创建人
     */
    public final TableField<FBookRecord, String> CREATED_BY = createField(DSL.name("CREATED_BY"), SQLDataType.VARCHAR(36), this, "「createdBy」- 创建人");

    /**
     * The column <code>ZDB.F_BOOK.UPDATED_AT</code>. 「updatedAt」- 更新时间
     */
    public final TableField<FBookRecord, LocalDateTime> UPDATED_AT = createField(DSL.name("UPDATED_AT"), SQLDataType.LOCALDATETIME(0), this, "「updatedAt」- 更新时间");

    /**
     * The column <code>ZDB.F_BOOK.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    public final TableField<FBookRecord, String> UPDATED_BY = createField(DSL.name("UPDATED_BY"), SQLDataType.VARCHAR(36), this, "「updatedBy」- 更新人");

    private FBook(Name alias, Table<FBookRecord> aliased) {
        this(alias, aliased, null);
    }

    private FBook(Name alias, Table<FBookRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>ZDB.F_BOOK</code> table reference
     */
    public FBook(String alias) {
        this(DSL.name(alias), F_BOOK);
    }

    /**
     * Create an aliased <code>ZDB.F_BOOK</code> table reference
     */
    public FBook(Name alias) {
        this(alias, F_BOOK);
    }

    /**
     * Create a <code>ZDB.F_BOOK</code> table reference
     */
    public FBook() {
        this(DSL.name("F_BOOK"), null);
    }

    public <O extends Record> FBook(Table<O> child, ForeignKey<O, FBookRecord> key) {
        super(child, key, F_BOOK);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Zdb.ZDB;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.asList(Indexes.F_BOOK_IDX_F_BOOK_ORDER_ID);
    }

    @Override
    public UniqueKey<FBookRecord> getPrimaryKey() {
        return Keys.KEY_F_BOOK_PRIMARY;
    }

    @Override
    public List<UniqueKey<FBookRecord>> getUniqueKeys() {
        return Arrays.asList(Keys.KEY_F_BOOK_CODE, Keys.KEY_F_BOOK_SERIAL);
    }

    @Override
    public FBook as(String alias) {
        return new FBook(DSL.name(alias), this);
    }

    @Override
    public FBook as(Name alias) {
        return new FBook(alias, this);
    }

    @Override
    public FBook as(Table<?> alias) {
        return new FBook(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public FBook rename(String name) {
        return new FBook(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public FBook rename(Name name) {
        return new FBook(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public FBook rename(Table<?> name) {
        return new FBook(name.getQualifiedName(), null);
    }
}
