/*
 * This file is generated by jOOQ.
 */
package cn.vertxup.graphic.domain;


import cn.vertxup.graphic.domain.tables.GCluster;
import cn.vertxup.graphic.domain.tables.GEdge;
import cn.vertxup.graphic.domain.tables.GGraphic;
import cn.vertxup.graphic.domain.tables.GNode;
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
     * The table <code>ZDB.G_CLUSTER</code>.
     */
    public final GCluster G_CLUSTER = GCluster.G_CLUSTER;

    /**
     * The table <code>ZDB.G_EDGE</code>.
     */
    public final GEdge G_EDGE = GEdge.G_EDGE;

    /**
     * The table <code>ZDB.G_GRAPHIC</code>.
     */
    public final GGraphic G_GRAPHIC = GGraphic.G_GRAPHIC;

    /**
     * The table <code>ZDB.G_NODE</code>.
     */
    public final GNode G_NODE = GNode.G_NODE;

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
            GCluster.G_CLUSTER,
            GEdge.G_EDGE,
            GGraphic.G_GRAPHIC,
            GNode.G_NODE
        );
    }
}
