package io.mature.extension.scaffold.console;

import io.horizon.eon.em.Environment;
import io.horizon.exception.internal.EmptyIoException;
import io.macrocosm.specification.app.HApp;
import io.macrocosm.specification.program.HArk;
import io.mature.extension.error._501EnvironmentException;
import io.mature.extension.refine.Ox;
import io.mature.stellar.Ok;
import io.mature.stellar.owner.OkA;
import io.mature.stellar.vendor.OkB;
import io.vertx.core.Future;
import io.vertx.core.json.JsonObject;
import io.vertx.up.eon.KName;
import io.vertx.up.fn.Fn;
import io.vertx.up.unity.Ux;
import io.vertx.up.util.Ut;
import io.zerows.extension.runtime.ambient.domain.tables.daos.XCategoryDao;
import io.zerows.extension.runtime.ambient.domain.tables.pojos.XCategory;
import io.zerows.plugins.common.shell.AbstractCommander;
import io.zerows.plugins.common.shell.atom.CommandInput;
import io.zerows.plugins.common.shell.eon.EmCommand;
import io.zerows.plugins.common.shell.refine.Sl;

import java.util.*;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;

/**
 * @author <a href="http://www.origin-x.cn">Lang</a>
 */
public abstract class AbstractInstruction extends AbstractCommander {

    /*
     * 读取路径信息
     */
    protected String path(final String path) {
        return Ox.toRoot(path, this.environment);
    }

    protected Future<EmCommand.TermStatus> executeMigrate(final CommandInput args, final BiFunction<HArk, JsonObject, Future<EmCommand.TermStatus>> executor) {
        final String appName = this.inString(args, "a");
        final String filename = this.inString(args, "f");
        try {
            final JsonObject config = Ut.ioJObject(filename);
            return this.partyB(appName).compose(okB -> {
                final HArk app = okB.configArk();
                return executor.apply(app, config);
            });
        } catch (final EmptyIoException ex) {
            Sl.output("文件不存在：file = {0}, details = {1}", filename, ex.getMessage());
            return Ux.future(EmCommand.TermStatus.FAILURE);
        }
    }

    /*
     * 忽略专用的 identifiers 列表
     * {
     *      "ignores": [
     *          "ci.user.ft"
     *      ]
     * }
     */
    protected Set<String> ignores() {
        final JsonObject config = this.atom.getConfig();
        final Set<String> ignores = new HashSet<>();
        if (config.containsKey("ignores")) {
            ignores.addAll(Ut.toSet(config.getJsonArray("ignores")));
        }
        return ignores;
    }

    /*
     * 从 X_CATEGORY 中读取 identifiers
     * - 带 ignores 版本
     * - 不带 ignores 版本
     */
    protected Future<Set<String>> identifiers(final JsonObject condition) {
        return this.identifiers(condition, null);
    }

    protected Future<Set<String>> identifiers(final JsonObject condition, final Set<String> ignores) {
        final Set<String> ignored = Objects.isNull(ignores) ? new HashSet<>() : ignores;
        return Ux.Jooq.on(XCategoryDao.class).<XCategory>fetchAndAsync(condition)
            /* Calculation for identifiers */
            .compose(categories -> Ux.future(categories.stream()
                .filter(Objects::nonNull).map(XCategory::getIdentifier)
                .filter(Objects::nonNull).filter(identifier -> !ignored.contains(identifier))
                .filter(Ut::isNotNil).collect(Collectors.toSet())
            ));
    }

    /*
     * 特殊函数层
     */
    protected <T> T runDevelopment(final Supplier<T> supplier) {
        if (Environment.Production == this.environment) {
            throw new _501EnvironmentException(this.getClass());
        }
        return supplier.get();
    }

    protected <O> Future<List<O>> runEach(final String appName, final JsonObject attached, final Function<String, Future<O>> consumer) {
        /*
         * 初始化应用，后期可直接调用 this.app
         */
        return this.partyB(appName).compose(okB -> {
            final HArk ark = okB.configArk();
            final JsonObject attachedJson = Objects.isNull(attached) ? new JsonObject() : attached;

            final JsonObject condition = new JsonObject();
            final HApp app = ark.app();
            condition.put(KName.SIGMA, app.option(KName.SIGMA));
            condition.put(KName.TYPE, "ci.type");
            condition.mergeIn(attachedJson, true);
            return this.identifiers(condition)
                /* identifiers 中处理每一个 */
                .compose(identifiers -> Fn.combineT(new ArrayList<>(identifiers), consumer));
        });
    }

    protected Future<OkA> partyA() {
        return Ok.of(this.vertxRef, this.environment);
    }

    protected Future<OkB> partyB(final String name) {
        return Ok.of(this.vertxRef, this.environment).compose(okA -> Ux.future(okA.partyB(name)));
    }

    protected <O> Future<List<O>> runEach(final String appName, final Function<String, Future<O>> consumer) {
        return this.runEach(appName, new JsonObject().put("leaf", Boolean.TRUE), consumer);
    }
}
