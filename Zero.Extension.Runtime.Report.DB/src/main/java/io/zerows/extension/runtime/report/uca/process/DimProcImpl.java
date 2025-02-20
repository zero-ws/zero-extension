package io.zerows.extension.runtime.report.uca.process;

import io.horizon.uca.cache.Cc;
import io.vertx.core.Future;
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.JsonObject;
import io.vertx.up.eon.KName;
import io.vertx.up.fn.Fn;
import io.vertx.up.unity.Ux;
import io.vertx.up.util.Ut;
import io.zerows.extension.runtime.report.atom.RDimension;
import io.zerows.extension.runtime.report.domain.tables.daos.KpDataSetDao;
import io.zerows.extension.runtime.report.domain.tables.pojos.KpDataSet;
import io.zerows.extension.runtime.report.domain.tables.pojos.KpDimension;
import io.zerows.extension.runtime.report.eon.em.EmDim;
import io.zerows.extension.runtime.report.eon.em.EmReport;
import io.zerows.extension.runtime.report.exception._400ReportDimTypeException;
import io.zerows.extension.runtime.report.uca.feature.RQueryComponent;
import io.zerows.extension.runtime.report.uca.pull.DataSet;
import org.osgi.framework.Bundle;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * @author lang : 2024-10-29
 */
class DimProcImpl extends AbstractDimProc {

    private static final Cc<String, RQueryComponent> CC_OUT = Cc.openThread();

    private static final ConcurrentMap<EmDim.Type, Function<Bundle, DimProc>> SUPPLIER = new ConcurrentHashMap<>() {
        {
            this.put(EmDim.Type.TREE, (owner) -> AbstractDimProc.of(owner, DimProcTree.class));
            this.put(EmDim.Type.LINE, (owner) -> AbstractDimProc.of(owner, DimProcLine.class));
        }
    };

    DimProcImpl(final Bundle owner) {
        super(owner);
    }

    @Override
    public Future<List<RDimension>> dimAsync(final JsonObject params, final List<KpDimension> dimensions) {
        // 归并数据源提取
        return this.dimSource(params, dimensions).compose(sources -> {
            // 提取对应数据来构造 Future<RDimension>
            final List<Future<RDimension>> futureList = new ArrayList<>();
            dimensions.forEach(dimension -> {
                final JsonArray source = sources.getOrDefault(dimension.getDataSetId(), new JsonArray());
                if (Ut.isNotNil(source)) {
                    futureList.add(this.dimAsync(params, source, dimension));
                }
            });
            return Fn.combineT(futureList);
        });
    }

    private Future<ConcurrentMap<String, JsonArray>> dimSource(final JsonObject params, final List<KpDimension> dimensions) {
        // 归并数据源提取
        final Set<String> dataSet = dimensions.stream().map(KpDimension::getDataSetId).collect(Collectors.toSet());
        return Ux.Jooq.on(KpDataSetDao.class).<KpDataSet, String>fetchInAsync(KName.KEY, dataSet).compose(dataSets -> {
            final ConcurrentMap<String, Future<JsonArray>> resultMap = new ConcurrentHashMap<>();
            if(dataSets.size() > 0){
                KpDataSet kpDataSet = dataSets.get(0);
                final JsonObject sourceJ = Ut.toJObject(kpDataSet.getDataSource());
                final DataSet executor = DataSet.of(sourceJ);
                final JsonObject queryDef = Ut.toJObject(kpDataSet.getDataQuery());
               return executor.loadAsync(params, queryDef).compose(dataSouce->{
                   if(kpDataSet.getDataComponent()!=null){
                       String dataComponent =kpDataSet.getDataComponent();
                       RQueryComponent queryComponent = CC_OUT.pick(() -> Ut.instance(dataComponent), dataComponent);
                       final JsonObject parameters = new JsonObject();
                       parameters.put(KName.INPUT, params);
                       Future<JsonArray> compose = queryComponent.dataAsync(dataSouce, parameters).compose(result -> {
                           if (Objects.isNull(result)) {
                               return Ut.future(dataSouce);
                           }
                           return Ut.future(result);
                       });
                       resultMap.put(kpDataSet.getKey(), compose);
                   }else {
                       dataSets.forEach(dataSetItem -> {
                           final Future<JsonArray> result = DataSet.Tool.outputArray(params, dataSetItem);
                           resultMap.put(dataSetItem.getKey(), result);
                       });
                   }
                   return Fn.combineM(resultMap);

               });
            }else {
                return Fn.combineM(resultMap);
            }
        });
    }

    @Override
    public Future<RDimension> dimAsync(final JsonObject params, final JsonArray source, final KpDimension dimension) {
        // 类型判断
        final EmDim.Type typeOf = Ut.toEnum(dimension.getType(), EmDim.Type.class, null);
        if (Objects.isNull(typeOf)) {
            // ERR-80703
            return Ut.Bnd.failOut(_400ReportDimTypeException.class, this.getClass(), dimension.getReportId(), dimension.getKey());
        }
        // 状态处理
        final EmReport.UcaStatus statusOf = Ut.toEnum(dimension.getStatus(), EmReport.UcaStatus.class, EmReport.UcaStatus.ACTIVE);
        if (EmReport.UcaStatus.ACTIVE != statusOf) {
            return Ut.future();
        }
        // 选择处理器
        final DimProc processor = Objects.requireNonNull(SUPPLIER.get(typeOf)).apply(this.owner());
        return processor.dimAsync(params, source, dimension);
    }
}
