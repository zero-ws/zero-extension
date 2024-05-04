package cn.vertxup.doc.api;

import io.zerows.extension.runtime.osgi.spi.environment.Permit;
import io.zerows.extension.runtime.osgi.spi.feature.Attachment;
import io.vertx.core.Future;
import io.vertx.core.buffer.Buffer;
import io.vertx.core.json.JsonObject;
import io.vertx.mod.doc.cv.Addr;
import io.vertx.up.annotations.Address;
import io.vertx.up.annotations.Queue;
import io.vertx.up.eon.KName;
import io.vertx.up.unity.Ux;
import io.vertx.up.util.Ut;

/**
 * @author lang : 2023-09-15
 */
@Queue
public class PullActor {

    @Address(Addr.DOC_DOWNLOAD)
    public Future<Buffer> download(final JsonObject data) {
        final String fileKey = Ut.valueString(data, KName.KEY);
        final String token = Ut.valueString(data, KName.TOKEN);
        return this.verifyAsync(token).compose(verified -> {
            if (!verified) {
                /*
                 * 验证没通过，直接返回空，此处的验证包括：
                 * 1. token 必须存在（有值）
                 * 2. 数据库中存储的 token 必须是合法的，401/403
                 */
                return Ux.future(Buffer.buffer());
            }
            /*
             * 验证通过，返回文件内容（调用下载接口）
             */
            return Ux.channel(Attachment.class, Buffer::buffer,
                attachment -> attachment.downloadAsync(fileKey));
        });
    }

    // 验证 token
    private Future<Boolean> verifyAsync(final String token) {
        return Ux.channel(Permit.class, () -> Boolean.FALSE, permit -> permit.token(token));
    }
}
