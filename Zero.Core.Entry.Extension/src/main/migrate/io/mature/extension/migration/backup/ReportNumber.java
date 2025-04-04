package io.mature.extension.migration.backup;

import io.horizon.eon.VValue;
import io.horizon.eon.em.Environment;
import io.macrocosm.specification.app.HApp;
import io.mature.extension.migration.AbstractStep;
import io.mature.extension.refine.Ox;
import io.modello.specification.action.HDao;
import io.vertx.core.Future;
import io.vertx.core.json.JsonObject;
import io.vertx.up.eon.KName;
import io.vertx.up.fn.Fn;
import io.vertx.up.unity.Ux;
import io.vertx.up.util.Ut;
import io.zerows.extension.runtime.ambient.domain.tables.daos.XNumberDao;
import io.zerows.extension.runtime.ambient.domain.tables.pojos.XNumber;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class ReportNumber extends AbstractStep {
    public ReportNumber(final Environment environment) {
        super(environment);
    }

    @Override
    public Future<JsonObject> procAsync(final JsonObject config) {
        /*
         * 读取系统中所有的 Numbers
         */
        this.banner("002.1. 执行 Number 报表");
        if (Objects.isNull(this.ark)) {
            Ox.LOG.Shell.info(this.getClass(), "无法读取应用信息！");
            return Ux.future(config);
        } else {
            final HApp app = this.ark.app();
            return Ux.Jooq.on(XNumberDao.class).<XNumber>fetchAsync(KName.SIGMA, app.option(KName.SIGMA))
                .compose(numbers -> {
                    /*
                     * numbers 的使用场景
                     */
                    final List<XNumber> numberList = numbers.stream()
                        .filter(number -> Objects.nonNull(number.getIdentifier()))
                        .filter(number -> number.getIdentifier().startsWith("ci"))
                        .collect(Collectors.toList());
                    return Ux.future(numberList);
                })
                .compose(normalized -> {
                    final List<Future<JsonObject>> futures = new ArrayList<>();
                    normalized.stream().map(this::procAsync).forEach(futures::add);
                    return Fn.combineA(futures);
                })
                .compose(combined -> {
                    /* 元素结构：JsonArray
                      [{
                          "current" : 100001,
                          "identifier" : "ci.middleware.tuxedo",
                          "code" : 100009,
                          "adjust" : 100010
                      }]
                     * - current：当前 XNumber 存储值
                     * - identifier：标识符
                     * - code：消费编号最大值
                     * - adjust：-1 不需要修正，否则会有修正值
                     */
                    final String folder = this.ioRoot(config);
                    final String file = folder + "report/numbers/data.json";
                    return this.writeAsync(combined, file).compose(nil -> Ux.future(config));
                });
        }
    }

    private Future<JsonObject> procAsync(final XNumber number) {
        final String identifier = number.getIdentifier();
        Ox.LOG.Shell.info(this.getClass(), "读取该标识下所有序号：identifier = {0}", identifier);
        final HDao dao = this.ioDao(identifier);

        return dao.fetchAllAsync().compose(Ux::futureA).compose(records -> {
            /*
             * 计算最大的 code
             */
            final TreeSet<String> codeSet = new TreeSet<>();
            Ut.itJArray(records)
                .filter(json -> Objects.nonNull(json.getValue(KName.CODE)))
                .forEach(json -> codeSet.add(json.getString(KName.CODE)));
            return Ux.future(codeSet);
        }).compose(sorted -> {
            if (sorted.isEmpty()) {
                return Ux.future(null);
            } else {
                final String code = sorted.last();
                /*
                 * 处理格式：XX-XX-XX-XXXXXX
                 */
                final String[] codes = code.split("-");
                final Integer codeNum = Integer.parseInt(codes[codes.length - 1]);
                Ox.LOG.Shell.info(this.getClass(), "序号标识：{0}，当前值：{1}, 实际值：{2}",
                    number.getIdentifier(), String.valueOf(number.getCurrent()), String.valueOf(codeNum));
                /*
                 * 结果
                 */
                final JsonObject report = new JsonObject();
                report.put("current", number.getCurrent());
                report.put(KName.IDENTIFIER, number.getIdentifier());
                report.put("code", codeNum);
                /*
                 * 是否修正
                 */
                if (codeNum > number.getCurrent()) {
                    report.put("adjust", codeNum + 1);
                } else {
                    report.put("adjust", VValue.RANGE);
                }
                return Ux.future(report);
            }
        }).otherwise(Ux.otherwise(() -> null));
    }
}
