package cn.vertxup.fm.service.end;

import cn.vertxup.fm.domain.tables.daos.FTransDao;
import cn.vertxup.fm.domain.tables.daos.FTransItemDao;
import cn.vertxup.fm.domain.tables.daos.FTransOfDao;
import cn.vertxup.fm.domain.tables.pojos.FSettlement;
import cn.vertxup.fm.domain.tables.pojos.FTrans;
import cn.vertxup.fm.domain.tables.pojos.FTransItem;
import cn.vertxup.fm.domain.tables.pojos.FTransOf;
import io.horizon.atom.program.KRef;
import io.vertx.core.Future;
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.JsonObject;
import io.vertx.mod.fm.atom.TranData;
import io.vertx.mod.fm.cv.FmCv;
import io.vertx.mod.fm.cv.em.EmTran;
import io.vertx.mod.fm.uca.replica.IkWay;
import io.vertx.mod.fm.uca.trans.Trade;
import io.vertx.up.eon.KName;
import io.vertx.up.unity.Ux;
import io.vertx.up.util.Ut;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.stream.Collectors;

/**
 * @author lang : 2024-01-24
 */
public class TransService implements TransStub {
    @Override
    public Future<FTrans> createAsync(final JsonObject data, final FSettlement settlement) {
        final JsonObject params = new JsonObject();
        {
            params.put(KName.COMMENT, settlement.getComment());
            params.put(KName.TYPE, EmTran.Type.SETTLEMENT.name());
            params.put(KName.KEYS, new JsonArray().add(settlement.getKey()));
        }
        // 1. 构造 FTrans
        return Trade.step06T().flatter(data, List.of(settlement))
            // 2. 构造 FTransOf
            .compose(trans -> this.createAsync(trans, data, params));
    }

    @Override
    public Future<FTrans> createAsync(final JsonObject data, final List<FSettlement> settlements) {
        final JsonObject params = new JsonObject();
        {
            params.put(KName.COMMENT, Ut.valueString(data, KName.COMMENT));
            params.put(KName.TYPE, EmTran.Type.SETTLEMENT.name());
            final JsonArray keys = Ut.toJArray(Ut.valueSetString(settlements, FSettlement::getKey));
            params.put(KName.KEYS, keys);
        }
        // 1. 构造 FTrans
        return Trade.step06T().flatter(data, settlements)
            // 2. 构造 FTransOf
            .compose(trans -> this.createAsync(trans, data, params));
    }

    private Future<FTrans> createAsync(
        final FTrans trans, final JsonObject data, final JsonObject params) {
        return Trade.step06TO().scatter(params, trans)
            .compose(nil -> {
                final JsonArray paymentJ = Ut.valueJArray(data, FmCv.ID.PAYMENT);
                final List<FTransItem> payments = Ux.fromJson(paymentJ, FTransItem.class);

                IkWay.ofT2TI().transfer(trans, payments);

                return Ux.Jooq.on(FTransItemDao.class).insertAsync(payments);
            })
            .compose(nil -> Ux.future(trans));
    }

    /**
     * 批量查询（只能查询单独类型的数据），查询的最终数据结构如下
     * <pre><code>
     *     [
     *         {
     *             "....": "....",
     *             "items": [],
     *             "of": []
     *         }
     *     ]
     * </code></pre>
     *
     * @param keys    关联主键集合
     * @param typeSet 关联类型
     *
     * @return 关联数据集合
     */
    @Override
    public Future<List<TranData>> fetchAsync(final Set<String> keys,
                                             final Set<EmTran.Type> typeSet) {
        final Set<String> transId = new HashSet<>();
        final KRef itemRef = new KRef();
        final ConcurrentMap<String, List<FTransOf>> tranMap = new ConcurrentHashMap<>();
        // WHERE OBJECT_TYPE = ? AND OBJECT_ID = ?
        final JsonObject condition = Ux.whereAnd();
        condition.put("objectType,i", Ut.toJArray(typeSet.stream()
            .map(EmTran.Type::name).collect(Collectors.toSet())
        ));
        condition.put("objectId,i", Ut.toJArray(keys));
        // WHERE OBJECT_TYPE = ? AND OBJECT_ID = ?
        return Ux.Jooq.on(FTransOfDao.class).<FTransOf>fetchAsync(condition)
            .compose(transOf -> {
                tranMap.putAll(Ut.elementGroup(transOf, FTransOf::getTransId));
                /*
                 * 此处 TransOf 的目的是提取 transIds，最终的数据结构是 JsonArray 的结构，每一个元素都是一个
                 * Trans 对象，然后在对象之下紧跟 items 来表示 transId 对应的所有 items 数据。
                 */
                transId.addAll(Ut.valueSetString(transOf, FTransOf::getTransId));
                // 跳过选择，直接查询 FTransItem
                final JsonObject condTrans = Ux.whereAnd();
                condTrans.put("transactionId,i", Ut.toJArray(transId));
                return Ux.Jooq.on(FTransItemDao.class).<FTransItem>fetchAsync(condTrans);
            })
            .compose(itemRef::future)
            .compose(items -> Ux.Jooq.on(FTransDao.class).<FTrans>fetchInAsync(KName.KEY, Ut.toJArray(transId)))
            .compose(transList -> {
                final List<FTransItem> items = itemRef.get();
                final ConcurrentMap<String, List<FTransItem>> grouped = Ut.elementGroup(items, FTransItem::getTransactionId);
                final List<TranData> response = new ArrayList<>();
                transList.forEach(tran -> {
                    final TranData object = TranData.instance().transaction(tran);
                    final List<FTransItem> itemData = grouped.getOrDefault(tran.getKey(), new ArrayList<>());
                    final List<FTransOf> ofData = tranMap.getOrDefault(tran.getKey(), new ArrayList<>());
                    response.add(object.items(itemData).of(ofData));
                });
                return Ux.future(response);
            });
    }
}
