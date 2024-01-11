package io.vertx.mod.fm.refine;

import cn.vertxup.fm.domain.tables.pojos.FBook;
import cn.vertxup.fm.domain.tables.pojos.FPreAuthorize;
import io.horizon.uca.log.Log;
import io.horizon.uca.log.LogModule;
import io.vertx.core.json.JsonObject;
import io.vertx.up.atom.extension.KNaming;

import java.util.List;

/**
 * @author <a href="http://www.origin-x.cn">Lang</a>
 */
public final class Fm {
    private Fm() {
    }

    /**
     * 直接从 data 中提取 preAuthorize 节点来构造预授权对象
     * {@link FPreAuthorize}
     */
    public static FPreAuthorize toAuthorize(final JsonObject data) {
        return FmPre.toAuthorize(data);
    }

    public static JsonObject qrBook(final KNaming spec) {
        return FmBook.qrBook(spec);
    }

    public static FBook umBook(final KNaming spec) {
        return FmBook.umBook(spec);
    }

    public static List<FBook> umBook(final KNaming spec, final List<FBook> books) {
        return FmBook.umBook(spec, books);
    }

    public interface LOG {
        String MODULE = "χρηματοδότηση";

        LogModule Book = Log.modulat(MODULE).extension("Book");
    }
}
