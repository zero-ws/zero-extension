package cn.vertxup.doc.api;

import io.horizon.runtime.Macrocosm;
import io.vertx.core.Future;
import io.vertx.core.json.JsonObject;
import io.vertx.mod.doc.cv.Addr;
import io.vertx.up.annotations.Address;
import io.vertx.up.annotations.Queue;
import io.vertx.up.eon.KName;
import io.vertx.up.unity.Ux;
import io.vertx.up.util.Ut;
import org.primeframework.jwt.Signer;
import org.primeframework.jwt.domain.JWT;
import org.primeframework.jwt.hmac.HMACSigner;

import java.util.Map;

/**
 * @author lang : 2023-09-15
 */
@Queue
public class TokenActor {

    @Address(Addr.TOKEN_REQUEST)
    public Future<JsonObject> tokenRequest(final JsonObject config) {
        final String secret = Ut.envWith(Macrocosm.DOC_SECRET, null);
        if(Ut.isNil(secret)){
            return Ux.futureJ();
        }

        final JsonObject response = new JsonObject();
        /*
         * https://api.onlyoffice.com/editors/signature/
         * 如何使用 Java 对配置进行编码生成 token
         */
        try{
            final Signer signer = HMACSigner.newSHA256Signer(secret);
            final JWT jwt = new JWT();
            final Map<String, Object> map = config.getMap();
            for (String field : map.keySet()) {
                jwt.addClaim(field, map.get(field));
            }
            final String encoded = JWT.getEncoder().encode(jwt, signer);
            response.put(KName.ACCESS_TOKEN, encoded);
        }catch (Throwable ex){
            response.put(KName.ERROR, ex.getMessage());
        }
        return Future.succeededFuture(response);
    }
}
