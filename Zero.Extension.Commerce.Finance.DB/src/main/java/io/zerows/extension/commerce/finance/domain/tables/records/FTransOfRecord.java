/*
 * This file is generated by jOOQ.
 */
package io.zerows.extension.commerce.finance.domain.tables.records;


import io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo;
import io.zerows.extension.commerce.finance.domain.tables.FTransOf;
import io.zerows.extension.commerce.finance.domain.tables.interfaces.IFTransOf;

import org.jooq.Field;
import org.jooq.Record3;
import org.jooq.Record4;
import org.jooq.Row4;
import org.jooq.impl.UpdatableRecordImpl;


import static io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo.*;
/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class FTransOfRecord extends UpdatableRecordImpl<FTransOfRecord> implements VertxPojo, Record4<String, String, String, String>, IFTransOf {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>ZDB.F_TRANS_OF.TRANS_ID</code>. 「transId」- 关联交易ID
     */
    @Override
    public FTransOfRecord setTransId(String value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.F_TRANS_OF.TRANS_ID</code>. 「transId」- 关联交易ID
     */
    @Override
    public String getTransId() {
        return (String) get(0);
    }

    /**
     * Setter for <code>ZDB.F_TRANS_OF.OBJECT_TYPE</code>. 「objectType」- 交易目标类型
     */
    @Override
    public FTransOfRecord setObjectType(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.F_TRANS_OF.OBJECT_TYPE</code>. 「objectType」- 交易目标类型
     */
    @Override
    public String getObjectType() {
        return (String) get(1);
    }

    /**
     * Setter for <code>ZDB.F_TRANS_OF.OBJECT_ID</code>. 「objectId」- 关联目标ID
     */
    @Override
    public FTransOfRecord setObjectId(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.F_TRANS_OF.OBJECT_ID</code>. 「objectId」- 关联目标ID
     */
    @Override
    public String getObjectId() {
        return (String) get(2);
    }

    /**
     * Setter for <code>ZDB.F_TRANS_OF.COMMENT</code>. 「comment」 - 关联备注
     */
    @Override
    public FTransOfRecord setComment(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>ZDB.F_TRANS_OF.COMMENT</code>. 「comment」 - 关联备注
     */
    @Override
    public String getComment() {
        return (String) get(3);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record3<String, String, String> key() {
        return (Record3) super.key();
    }

    // -------------------------------------------------------------------------
    // Record4 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row4<String, String, String, String> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    @Override
    public Row4<String, String, String, String> valuesRow() {
        return (Row4) super.valuesRow();
    }

    @Override
    public Field<String> field1() {
        return FTransOf.F_TRANS_OF.TRANS_ID;
    }

    @Override
    public Field<String> field2() {
        return FTransOf.F_TRANS_OF.OBJECT_TYPE;
    }

    @Override
    public Field<String> field3() {
        return FTransOf.F_TRANS_OF.OBJECT_ID;
    }

    @Override
    public Field<String> field4() {
        return FTransOf.F_TRANS_OF.COMMENT;
    }

    @Override
    public String component1() {
        return getTransId();
    }

    @Override
    public String component2() {
        return getObjectType();
    }

    @Override
    public String component3() {
        return getObjectId();
    }

    @Override
    public String component4() {
        return getComment();
    }

    @Override
    public String value1() {
        return getTransId();
    }

    @Override
    public String value2() {
        return getObjectType();
    }

    @Override
    public String value3() {
        return getObjectId();
    }

    @Override
    public String value4() {
        return getComment();
    }

    @Override
    public FTransOfRecord value1(String value) {
        setTransId(value);
        return this;
    }

    @Override
    public FTransOfRecord value2(String value) {
        setObjectType(value);
        return this;
    }

    @Override
    public FTransOfRecord value3(String value) {
        setObjectId(value);
        return this;
    }

    @Override
    public FTransOfRecord value4(String value) {
        setComment(value);
        return this;
    }

    @Override
    public FTransOfRecord values(String value1, String value2, String value3, String value4) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        return this;
    }

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    @Override
    public void from(IFTransOf from) {
        setTransId(from.getTransId());
        setObjectType(from.getObjectType());
        setObjectId(from.getObjectId());
        setComment(from.getComment());
        resetChangedOnNotNull();
    }

    @Override
    public <E extends IFTransOf> E into(E into) {
        into.from(this);
        return into;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached FTransOfRecord
     */
    public FTransOfRecord() {
        super(FTransOf.F_TRANS_OF);
    }

    /**
     * Create a detached, initialised FTransOfRecord
     */
    public FTransOfRecord(String transId, String objectType, String objectId, String comment) {
        super(FTransOf.F_TRANS_OF);

        setTransId(transId);
        setObjectType(objectType);
        setObjectId(objectId);
        setComment(comment);
        resetChangedOnNotNull();
    }

    /**
     * Create a detached, initialised FTransOfRecord
     */
    public FTransOfRecord(io.zerows.extension.commerce.finance.domain.tables.pojos.FTransOf value) {
        super(FTransOf.F_TRANS_OF);

        if (value != null) {
            setTransId(value.getTransId());
            setObjectType(value.getObjectType());
            setObjectId(value.getObjectId());
            setComment(value.getComment());
            resetChangedOnNotNull();
        }
    }

        public FTransOfRecord(io.vertx.core.json.JsonObject json) {
                this();
                fromJson(json);
        }
}
