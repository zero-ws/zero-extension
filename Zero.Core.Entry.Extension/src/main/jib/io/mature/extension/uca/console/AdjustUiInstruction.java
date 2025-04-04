package io.mature.extension.uca.console;

import io.horizon.atom.program.KRef;
import io.macrocosm.specification.app.HApp;
import io.macrocosm.specification.program.HArk;
import io.mature.extension.refine.Ox;
import io.mature.extension.scaffold.console.AbstractInstruction;
import io.mature.extension.uca.ui.FieldStatus;
import io.vertx.core.Future;
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.JsonObject;
import io.vertx.up.eon.KName;
import io.vertx.up.fn.Fn;
import io.vertx.up.unity.Ux;
import io.vertx.up.util.Ut;
import io.zerows.extension.mbse.basement.atom.builtin.DataAtom;
import io.zerows.extension.mbse.basement.util.Ao;
import io.zerows.extension.mbse.ui.domain.tables.daos.UiColumnDao;
import io.zerows.extension.mbse.ui.domain.tables.daos.UiFieldDao;
import io.zerows.extension.mbse.ui.domain.tables.daos.UiFormDao;
import io.zerows.extension.mbse.ui.domain.tables.daos.UiListDao;
import io.zerows.extension.mbse.ui.domain.tables.pojos.UiColumn;
import io.zerows.extension.mbse.ui.domain.tables.pojos.UiField;
import io.zerows.extension.mbse.ui.domain.tables.pojos.UiForm;
import io.zerows.extension.mbse.ui.domain.tables.pojos.UiList;
import io.zerows.plugins.common.shell.atom.CommandInput;
import io.zerows.plugins.common.shell.eon.EmCommand;
import io.zerows.plugins.common.shell.refine.Sl;

import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicBoolean;

/**
 * @author <a href="http://www.origin-x.cn">Lang</a>
 */
public class AdjustUiInstruction extends AbstractInstruction {

    @Override
    public Future<EmCommand.TermStatus> executeAsync(final CommandInput args) {
        final String appName = this.inString(args, "a");
        /*
         * 读取标识符
         */
        return this.runEach(appName, null, this::executeAsync).compose(done -> {
            final JsonArray normalized = new JsonArray();
            done.forEach(normalized::addAll);
            /*
             * 生成报表
             */
            this.printReport(normalized);
            return Ux.future(EmCommand.TermStatus.SUCCESS);
        });
    }

    private void printHeader(final StringBuilder content, final String identifier) {
        final JsonObject config = Ut.valueJObject(this.atom.getConfig().getJsonObject("header"));

        /* Format Table */
        content.append(this.atom.getConfig().getString("identifier")).append(" : ");
        content.append(Ut.rgbCyanB(identifier));
        content.append("--------------------------------------------------");
        content.append("----------------------------------------------------------\n");
        content.append(Ut.rgbBlankB("%-40s", config.getString("control")));
        content.append(Ut.rgbBlankB("%-26s", config.getString("status")));
        content.append(Ut.rgbBlankB("%-32s", config.getString("expected")));
        content.append(Ut.rgbBlankB("%-32s", config.getString("actual"))).append("\n");
        content.append("--------------------------------------------------");
        content.append("----------------------------------------------------------\n");
    }

    private void printRow(final StringBuilder content, final JsonObject item) {
        final String status = item.getString(KName.STATUS);
        content.append(String.format("%-32s", item.getString("control")));
        if ("INVALID".equals(status)) {
            content.append(Ut.rgbRedB("%-28s", status));
        } else {
            content.append(Ut.rgbYellowB("%-28s", status));
        }
        content.append(String.format("%-24s", item.getString("attribute")));
        content.append(String.format("%-32s", item.getString("uiField")));
        content.append("\n");
    }

    private void printReport(final JsonArray normalized) {
        /*
         * 先过滤，只包含 INVALID, REMAIN，滤掉 MATCH
         * 1. 条件1：过滤掉 MATCH 的，匹配的不呈现
         * 2. 条件2：$button 字段滤掉
         * 3. 条件3：根据配置过滤 ignores
         * 4. 条件4：表单命名规则中是否指定 suffix
         */
        final JsonArray processed = new JsonArray();
        Ut.itJArray(normalized)
            .filter(item -> !FieldStatus.MATCH.name().equals(item.getString(KName.STATUS)))
            .filter(item -> !"$button".equals(item.getString("uiField")))
            .filter(item -> !"connector".equals(item.getString("uiField")))
            .filter(item -> !this.ignores().contains(item.getString("attribute")))
            .filter(item -> {
                final String control = item.getString("control");
                final String type = item.getString("type");
                if ("FORM".equals(type)) {
                    /*
                     * 表单类
                     */
                    if (control.endsWith("save")) {
                        /*
                         * save 类 -> REMAIN / INVALID 都输出
                         */
                        return true;
                    } else {
                        /*
                         * filter, view, batch 只输出 REMAIN
                         */
                        return "REMAIN".equals(item.getString("status"));
                    }
                } else {
                    /*
                     * 列表类，只输出 REMAIN
                     */
                    return "REMAIN".equals(item.getString("status"));
                }
            }).forEach(processed::add);
        /* Format Table */
        final ConcurrentMap<String, JsonArray> formatted = Ut.elementGroup(processed, KName.IDENTIFIER);
        /* 排序 identifier */
        final Set<String> treeSet = new TreeSet<>(formatted.keySet());
        final StringBuilder content = new StringBuilder();

        /* 成功 */
        final AtomicBoolean noError = new AtomicBoolean(Boolean.TRUE);
        treeSet.forEach(identifier -> {
            /*
             * Row print here
             */
            final JsonArray dataTable = formatted.get(identifier);
            if (!dataTable.isEmpty()) {
                noError.set(Boolean.FALSE);
                this.printHeader(content, identifier);
                Ut.itJArray(dataTable).forEach(item -> this.printRow(content, item));
            }
        });
        if (noError.get()) {
            Sl.output("所有的表单和列表配置都正确！Form / List，--> {0}",
                Ut.rgbGreenB("Successfully"));
        }
        System.out.println(content.toString());
    }

    private Future<JsonArray> executeAsync(final String identifier) {
        /*
         * 生成记录报表
         */
        return this.partyA().compose(okA -> {
            final HArk ark = okA.configArk();
            final HApp app = ark.app();
            final DataAtom atom = Ao.toAtom(app.name(), identifier);
            /*
             * Form -> 表单数据处理
             * List -> 列配置数据处理
             */
            final KRef formRefer = new KRef();
            final KRef listRefer = new KRef();
            final String sigma = app.option(KName.SIGMA);
            return this.uiForm(identifier, sigma)
                .compose(formRefer::future)
                .compose(nil -> this.uiList(identifier, sigma))
                .compose(listRefer::future)
                .compose(nil -> Ux.future(Ox.compareUi(atom, formRefer.get(), listRefer.get())));
        });
    }

    private Future<JsonArray> uiList(final String identifier, final String sigma) {
        final JsonObject condition = this.uiCond(identifier, sigma);
        return Ux.Jooq.on(UiListDao.class).<UiList>fetchAndAsync(condition)
            .compose(lists -> Fn.combineT(lists, this::uiListField))
            .compose(Ux::futureA);
    }

    private Future<JsonObject> uiListField(final UiList list) {
        final JsonObject condition = new JsonObject();
        final String controlId = "DEFAULT-" + list.getIdentifier();
        condition.put(KName.SIGMA, list.getSigma());
        condition.put("controlId", controlId);
        final JsonObject listJson = Ux.toJson(list);
        return Ux.Jooq.on(UiColumnDao.class).<UiColumn>fetchAndAsync(condition)
            .compose(fields -> {
                listJson.put(KName.Ui.COLUMNS, Ux.toJson(fields));
                return Ux.future(listJson);
            });
    }

    private Future<JsonArray> uiForm(final String identifier, final String sigma) {
        final JsonObject condition = this.uiCond(identifier, sigma);
        return Ux.Jooq.on(UiFormDao.class).<UiForm>fetchAndAsync(condition)
            .compose(forms -> Fn.combineT(forms, this::uiFormField))
            .compose(Ux::futureA);
    }

    private Future<JsonObject> uiFormField(final UiForm form) {
        final JsonObject condition = new JsonObject();
        condition.put(KName.SIGMA, form.getSigma());
        condition.put("controlId", form.getKey());
        final JsonObject formJson = Ux.toJson(form);
        return Ux.Jooq.on(UiFieldDao.class).<UiField>fetchAndAsync(condition)
            .compose(fields -> {
                formJson.put(KName.Modeling.FIELDS, Ux.toJson(fields));
                return Ux.future(formJson);
            });
    }

    private JsonObject uiCond(final String identifier, final String sigma) {
        final JsonObject condition = new JsonObject();
        condition.put(KName.IDENTIFIER, identifier);
        condition.put(KName.SIGMA, sigma);
        return condition;
    }
}
