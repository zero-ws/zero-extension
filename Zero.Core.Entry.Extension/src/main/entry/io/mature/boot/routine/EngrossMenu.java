package io.mature.boot.routine;

import io.horizon.uca.boot.KLauncher;
import io.mature.boot.argument.ArgMenu;
import io.mature.exploit.atom.QSiteMap;
import io.vertx.boot.supply.Electy;
import io.vertx.core.Vertx;
import io.vertx.up.eon.KName;
import io.vertx.up.util.Ut;
import io.zerows.extension.runtime.skeleton.refine.Ke;

/**
 * 「单应用」目前版本
 *
 * @author lang : 2023-06-12
 */
public class EngrossMenu {
    public static void run(final Class<?> clazz, final String[] args) {

        // 构造启动器（构造命令启动器）
        final KLauncher<Vertx> container = KLauncher.create(clazz, args);
        container.start(Electy.whenInstruction((vertx, config) -> {
            /*
             * 不做任何输入限制，都带有默认值处理
             */
            final ArgMenu input = ArgMenu.of(args);
            final String path = input.value(KName.PATH);
            final String vPath = Ut.ioPath(path, input.environment());
            Ke.LOG.Ke.info(clazz, """
                    信息说明
                    \t环境：{0}
                    \t数据路径：{1}
                    """,
                input.environment(), vPath
            );

            // 路由规划器
            QSiteMap.planOn(vPath).onComplete(res -> {
                if (res.result()) {
                    Ke.LOG.Ke.info(clazz, "「Menu」菜单规划完成！");
                    System.exit(0);
                } else {
                    res.cause().printStackTrace();
                }
            });
        }));
    }
}
