package io.mature.extension.scaffold.component;

import io.horizon.atom.program.KRef;
import io.mature.extension.refine.Ox;
import io.modello.specification.action.HDao;
import io.modello.specification.atom.HRule;
import io.vertx.core.Future;
import io.vertx.core.Vertx;
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.JsonObject;
import io.vertx.up.annotations.Contract;
import io.vertx.up.eon.KWeb;
import io.vertx.up.unity.Ux;
import io.zerows.core.web.model.commune.Envelop;
import io.zerows.core.web.scheduler.atom.Mission;
import io.zerows.core.web.scheduler.zdk.JobIncome;
import io.zerows.extension.mbse.action.domain.tables.pojos.IService;
import io.zerows.extension.mbse.action.uca.business.AbstractJob;
import io.zerows.extension.mbse.action.util.Jt;
import io.zerows.extension.mbse.basement.atom.builtin.DataAtom;
import io.zerows.extension.mbse.basement.util.Ao;

/**
 * ## 「KIncome」顶层任务前置器
 *
 * ### 1. 基本介绍
 *
 * 任务执行流程`KIncome -> Channel -> Outcome`中的`KIncome`前置对象，在任务通道之前执行。
 *
 * ### 2. 组件功能
 *
 * - 实现了{@link JobIncome}接口。
 * - 从{@link AbstractJob}继承。
 * - 参数执行`$$__BODY__$$`数据封装，包含单记录和多记录两种数据结构。
 *
 * @author <a href="http://www.origin-x.cn">Lang</a>
 */
public abstract class AbstractIncome extends AbstractJob implements JobIncome {
    /**
     * 「合约」Vertx实例引用
     */
    @Contract
    private transient Vertx vertx;
    /**
     * 「合约」{@link Mission}任务配置成员，从`I_JOB`中提取任务配置并执行计算。
     */
    @Contract
    private transient Mission mission;

    /**
     * 返回Vertx实例。
     *
     * @return {@link Vertx}实例
     */
    protected Vertx vertx() {
        return this.vertx;
    }

    /**
     * 返回任务配置实例。
     *
     * @return {@link Mission}任务配置。
     */
    @Override
    protected Mission mission() {
        return this.mission;
    }

    /**
     * 「批量」请求转换器。
     *
     * @param array   {@link JsonArray} 数组数据。
     * @param request {@link Envelop} Zero统一数据请求模型。
     *
     * @return {@link Future}<{@link Envelop}> 复刻后请求
     */
    protected Future<Envelop> output(final JsonArray array, final Envelop request) {
        final JsonObject data = new JsonObject();
        data.put(KWeb.ARGS.PARAM_BODY, array);
        return Ux.future(Envelop.success(data).from(request));
    }

    /**
     * 「批量」请求转换器。
     *
     * @param json    {@link JsonObject} 记录数据。
     * @param request {@link Envelop} Zero统一数据请求模型。
     *
     * @return {@link Future}<{@link Envelop}> 复刻后请求
     */
    protected Future<Envelop> output(final JsonObject json, final Envelop request) {
        final JsonObject data = new JsonObject();
        data.put(KWeb.ARGS.PARAM_BODY, json);
        return Ux.future(Envelop.success(data).from(request));
    }

    /**
     * 成员函数，读取静态模型定义对象{@link DataAtom}。
     *
     * 该组件中的{@link DataAtom}模型定义对象是通过`I_SERVICE`直接构造，非合约提取。
     *
     * @return {@link DataAtom}计算过后的模型定义
     */
    protected DataAtom atom() {
        final IService service = this.service();
        final HRule rule = Jt.toRule(service);
        return Ox.toAtom(service.getSigma(), service.getIdentifier()).rule(rule);
    }

    /**
     * 「Async」异步提取当前组件所使用的数据库访问器。
     *
     * @return {@link Future}<{@link HDao}>
     */
    protected Future<HDao> dao() {
        return Ux.future(Ao.toDao(this.atom(), this.database()));
    }

    /**
     * 「Async」参数专用容器，可在`KIncome -> Channel -> Outcome`中执行参数传递（底层参数传输）。
     *
     * @return {@link Future}引用容器
     */
    @Override
    public Future<KRef> underway() {
        /*
         * Parameters
         */
        final String identifier = this.atom().identifier();
        return super.underway(identifier);
    }
}
