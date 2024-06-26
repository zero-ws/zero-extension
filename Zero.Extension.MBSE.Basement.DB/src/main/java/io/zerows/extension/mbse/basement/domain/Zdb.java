/*
 * This file is generated by jOOQ.
 */
package io.zerows.extension.mbse.basement.domain;


import io.zerows.extension.mbse.basement.domain.tables.*;
import io.zerows.extension.runtime.skeleton.refine.Ke;
import org.jooq.Catalog;
import org.jooq.Table;
import org.jooq.impl.SchemaImpl;

import java.util.Arrays;
import java.util.List;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({"all", "unchecked", "rawtypes"})
public class Zdb extends SchemaImpl {

    /**
     * The reference instance of <code>ZDB</code>
     */
    public static final Zdb ZDB = new Zdb();
    private static final long serialVersionUID = 1L;
    /**
     * The table <code>ZDB.M_ACC</code>.
     */
    public final MAcc M_ACC = MAcc.M_ACC;

    /**
     * The table <code>ZDB.M_ATTRIBUTE</code>.
     */
    public final MAttribute M_ATTRIBUTE = MAttribute.M_ATTRIBUTE;

    /**
     * The table <code>ZDB.M_ENTITY</code>.
     */
    public final MEntity M_ENTITY = MEntity.M_ENTITY;

    /**
     * The table <code>ZDB.M_FIELD</code>.
     */
    public final MField M_FIELD = MField.M_FIELD;

    /**
     * The table <code>ZDB.M_INDEX</code>.
     */
    public final MIndex M_INDEX = MIndex.M_INDEX;

    /**
     * The table <code>ZDB.M_JOIN</code>.
     */
    public final MJoin M_JOIN = MJoin.M_JOIN;

    /**
     * The table <code>ZDB.M_KEY</code>.
     */
    public final MKey M_KEY = MKey.M_KEY;

    /**
     * The table <code>ZDB.M_MODEL</code>.
     */
    public final MModel M_MODEL = MModel.M_MODEL;

    /**
     * The table <code>ZDB.M_RELATION</code>.
     */
    public final MRelation M_RELATION = MRelation.M_RELATION;

    /**
     * No further instances allowed
     */
    private Zdb() {
        super(Ke.getDatabase(), null);
    }


    @Override
    public Catalog getCatalog() {
        return DefaultCatalog.DEFAULT_CATALOG;
    }

    @Override
    public final List<Table<?>> getTables() {
        return Arrays.asList(
            MAcc.M_ACC,
            MAttribute.M_ATTRIBUTE,
            MEntity.M_ENTITY,
            MField.M_FIELD,
            MIndex.M_INDEX,
            MJoin.M_JOIN,
            MKey.M_KEY,
            MModel.M_MODEL,
            MRelation.M_RELATION
        );
    }
}
