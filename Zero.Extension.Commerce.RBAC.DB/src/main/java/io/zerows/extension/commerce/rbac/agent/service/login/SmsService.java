package io.zerows.extension.commerce.rbac.agent.service.login;

import io.horizon.eon.VValue;
import io.horizon.exception.WebException;
import io.vertx.core.Future;
import io.vertx.core.json.JsonObject;
import io.vertx.ext.web.Session;
import io.vertx.up.eon.KName;
import io.vertx.up.fn.Fn;
import io.vertx.up.unity.Ux;
import io.vertx.up.util.Ut;
import io.zerows.extension.commerce.rbac.domain.tables.daos.SUserDao;
import io.zerows.extension.commerce.rbac.domain.tables.pojos.SUser;
import io.zerows.extension.commerce.rbac.exception._401SmsCodeExpiredException;
import io.zerows.extension.commerce.rbac.exception._401SmsCodeWrongException;
import io.zerows.extension.commerce.rbac.exception._404MobileNotFoundException;
import io.zerows.extension.commerce.rbac.uca.timer.ClockFactory;
import io.zerows.extension.commerce.rbac.uca.timer.ScClock;
import io.zerows.extension.commerce.rbac.util.Sc;
import io.zerows.plugins.integration.sms.SmsInfix;
import jakarta.inject.Inject;

import java.util.Objects;

/**
 * @author lang : 2024-07-11
 */
public class SmsService implements SmsStub {

    private final ScClock<String> cache;
    @Inject
    private TokenStub tokenStub;

    public SmsService() {
        this.cache = ClockFactory.ofSms();
    }

    @Override
    public Future<Boolean> send(final String sessionId, final JsonObject params) {
        final String mobile = Ut.valueString(params, KName.MOBILE);
        return this.fetchUser(mobile).compose(query -> {
            if (Objects.isNull(query)) {
                final WebException error = Ut.Bnd.failureWeb(_404MobileNotFoundException.class, this.getClass(), mobile);
                return Future.failedFuture(error);
            }
            return Sc.imageVerify(sessionId, params, normalized -> {
                normalized.put("tpl", "MSG_LOGIN");
                return this.sendInternal(sessionId, normalized);
            });
        });
    }

    private Future<SUser> fetchUser(final String mobile) {
        return Ux.Jooq.on(SUserDao.class).<SUser>fetchAsync(KName.MOBILE, mobile).compose(queryList -> {
            if (Objects.isNull(queryList) || queryList.isEmpty()) {
                return Ux.future();
            }
            return Ux.future(queryList.get(VValue.IDX));
        });
    }

    private Future<Boolean> sendInternal(final String sessionId, final JsonObject params) {
        final JsonObject request = new JsonObject();
        final String smsCode = this.cache.generate();
        request.put(KName.CODE, smsCode);
        // 接收短信的人
        final String mobile = Ut.valueString(params, KName.MOBILE);
        final String tplCode = Ut.valueString(params, "tpl");
        // Inject 注入在 Service 中可用，但 Infusion 只在 Actor 中可用
        return SmsInfix.getClient().send(mobile, tplCode, request)
            // 2 分钟过期 = 120 秒
            .compose(nil -> this.cache.put(sessionId, smsCode))
            .compose(nil -> Ux.futureT());
    }

    @Override
    public Future<JsonObject> login(final String sessionId, final JsonObject params,
                                    final Session session) {
        // 此处跳过图片验证码，上一步已经处理过了
        final String code = Ut.valueString(params, "message");
        return this.cache.get(sessionId, true)
            .compose(item -> {
                if (Objects.isNull(item)) {
                    // 401: Authorization Code Expired, The item is null, it means that code is expired
                    return Fn.outWeb(_401SmsCodeExpiredException.class, this.getClass(), sessionId, code);
                }
                if (!code.equals(item)) {
                    // 401: Wrong code provided ( Api Client )
                    return Fn.outWeb(_401SmsCodeWrongException.class, this.getClass(), code);
                }
                final String mobile = Ut.valueString(params, KName.MOBILE);
                return this.fetchUser(mobile);
            })
            .compose(query -> this.tokenStub.execute(query.getKey(), session).compose(response -> {
                /*
                 * 追加 key 和 username
                 */
                response.put(KName.KEY, query.getKey());
                response.put(KName.USERNAME, query.getUsername());
                return Ux.future(response);
            }));
    }
}
