package io.zerows.extension.commerce.rbac.agent.service.login;

import io.vertx.core.Future;
import io.vertx.core.json.JsonObject;
import io.vertx.up.unity.Ux;
import io.vertx.up.util.Ut;
import io.zerows.core.metadata.uca.logging.OLog;
import io.zerows.extension.commerce.rbac.agent.service.business.UserStub;
import io.zerows.extension.commerce.rbac.atom.ScToken;
import io.zerows.extension.commerce.rbac.domain.tables.daos.SUserDao;
import io.zerows.extension.commerce.rbac.domain.tables.pojos.SUser;
import io.zerows.extension.commerce.rbac.eon.AuthKey;
import io.zerows.extension.commerce.rbac.eon.AuthMsg;
import io.zerows.extension.commerce.rbac.exception._401PasswordWrongException;
import io.zerows.extension.commerce.rbac.exception._423UserDisabledException;
import io.zerows.extension.commerce.rbac.exception._449UserNotFoundException;
import io.zerows.extension.commerce.rbac.uca.logged.ScUser;
import io.zerows.extension.commerce.rbac.uca.timer.ClockFactory;
import io.zerows.extension.commerce.rbac.uca.timer.ScClock;
import io.zerows.extension.commerce.rbac.util.Sc;
import jakarta.inject.Inject;

import java.util.Objects;

public class LoginService implements LoginStub {

    private static final OLog LOGGER = Ut.Log.security(LoginService.class);
    private final ScClock<ScToken> cache;
    @Inject
    private transient UserStub userStub;

    public LoginService() {
        this.cache = ClockFactory.ofToken(getClass());
    }

    @Override
    @SuppressWarnings("all")
    public Future<JsonObject> execute(final String username, final String password) {
        /* Find the user record with username */
        return Sc.lockVerify(username, () -> Ux.Jooq.on(SUserDao.class).<SUser>fetchOneAsync(AuthKey.USER_NAME, username).compose(fetched -> {
            /* Not Found */
            if (Objects.isNull(fetched)) {
                LOGGER.warn(AuthMsg.LOGIN_USER, username);
                return Ut.Bnd.failOut(_449UserNotFoundException.class, this.getClass(), username);
            }
            /* Locked User */
            final Boolean isLock = Objects.isNull(fetched.getActive()) ? Boolean.FALSE : fetched.getActive();
            if (!isLock) {
                LOGGER.warn(AuthMsg.LOGIN_LOCKED, username);
                return Ut.Bnd.failOut(_423UserDisabledException.class, this.getClass(), username);
            }
            /* Password Wrong */
            if (Objects.isNull(password) || !password.equals(fetched.getPassword())) {


                // Lock On when password invalid
                LOGGER.warn(AuthMsg.LOGIN_PWD, username);
                return Sc.lockOn(username)
                    .compose(nil -> Ut.Bnd.failOut(_401PasswordWrongException.class, this.getClass(), username));
            }


            // Lock Off when login successfully
            LOGGER.info(AuthMsg.LOGIN_SUCCESS, username);
            return Sc.lockOff(username).compose(nil -> Ux.future(fetched));
        }).compose(user -> this.userStub.fetchAuthorized(user)));
    }

    @Override
    public Future<Boolean> logout(final String token, final String habitus) {
        /*
         * Delete WebToken from `ACCESS_TOKEN`
         */
        return this.cache.remove(token).compose(removed -> ScUser.logout(habitus));
    }
}
