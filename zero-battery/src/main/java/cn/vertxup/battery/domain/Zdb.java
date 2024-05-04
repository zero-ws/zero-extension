/*
 * This file is generated by jOOQ.
 */
package cn.vertxup.battery.domain;


import cn.vertxup.battery.domain.tables.*;
import io.zerows.extension.runtime.refine.Ke;
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
     * The table <code>ZDB.B_AUTHORITY</code>.
     */
    public final BAuthority B_AUTHORITY = BAuthority.B_AUTHORITY;

    /**
     * The table <code>ZDB.B_BAG</code>.
     */
    public final BBag B_BAG = BBag.B_BAG;

    /**
     * The table <code>ZDB.B_BLOCK</code>.
     */
    public final BBlock B_BLOCK = BBlock.B_BLOCK;

    /**
     * The table <code>ZDB.B_COMPONENT</code>.
     */
    public final BComponent B_COMPONENT = BComponent.B_COMPONENT;

    /**
     * The table <code>ZDB.B_WEB</code>.
     */
    public final BWeb B_WEB = BWeb.B_WEB;

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
            BAuthority.B_AUTHORITY,
            BBag.B_BAG,
            BBlock.B_BLOCK,
            BComponent.B_COMPONENT,
            BWeb.B_WEB
        );
    }
}
