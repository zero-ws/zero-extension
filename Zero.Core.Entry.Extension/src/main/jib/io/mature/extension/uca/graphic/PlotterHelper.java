package io.mature.extension.uca.graphic;

import io.mature.extension.refine.Ox;
import io.vertx.core.Future;
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.JsonObject;
import io.vertx.up.eon.KName;
import io.vertx.up.eon.KWeb;
import io.vertx.up.fn.Fn;
import io.vertx.up.unity.Ux;
import io.zerows.plugins.store.neo4j.Neo4jClient;
import io.zerows.plugins.store.neo4j.Neo4jInfix;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

import static io.mature.extension.refine.Ox.LOG;

class PlotterHelper {
    static Future<JsonObject> drawAsync(final JsonArray nodes, final JsonArray edges) {
        LOG.Uca.info(PlotterHelper.class, "节点数量：{0}, 关系数量：{1}",
            String.valueOf(nodes.size()), String.valueOf(edges.size()));
        /* 默认分组：__VERTX_ZERO__ */
        final Neo4jClient client = Neo4jInfix.getClient().connect(KWeb.DEPLOY.VERTX_GROUP);
        /* 图库推送 */
        final JsonArray nodeArray = Ox.toNode(nodes);
        final JsonArray edgeArray = Ox.toEdge(edges);
        final JsonObject response = new JsonObject();
        response.put(KName.Graphic.NODES, nodeArray);
        response.put(KName.Graphic.EDGES, edgeArray);

        /* 节点创建 */
        return drawEach(nodeArray, client::nodeCreate)
            /* 边创建 */
            .compose(created -> drawEach(edgeArray, client::edgeCreate))
            .compose(created -> Ux.future(response));
    }

    private static Future<JsonArray> drawEach(final JsonArray nodes, final Function<JsonArray, Future<JsonArray>> consumer) {
        final int batch = 2000; // 每一批推送3000节点
        final JsonArray pushNodes = new JsonArray();

        final List<Future<JsonArray>> futures = new ArrayList<>();

        final int nodeCount = nodes.size();
        for (int idx = 0; idx < nodeCount; idx++) {
            final JsonObject each = nodes.getJsonObject(idx);
            pushNodes.add(each);
            if (0 == (idx + 1) % batch) {
                LOG.Uca.info(PlotterHelper.class, "处理记录数：{0}", String.valueOf(pushNodes.size()));
                futures.add(consumer.apply(pushNodes.copy()));
                pushNodes.clear();
            }
        }
        if (!pushNodes.isEmpty()) {
            LOG.Uca.info(PlotterHelper.class, "处理记录数：{0}", String.valueOf(pushNodes.size()));
            futures.add(consumer.apply(pushNodes.copy()));
            pushNodes.clear();
        }
        return Fn.compressA(futures);
    }
}
