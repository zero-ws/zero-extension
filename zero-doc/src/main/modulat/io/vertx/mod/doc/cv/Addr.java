package io.vertx.mod.doc.cv;

import io.vertx.up.uca.job.plugin.JobClient;

/**
 * 申请 ONLYOFFICE 令牌
 * @author lang : 2023-09-14
 */
interface Prefix{

    String _EVENT = "Δομή εγγράφου://περιβάλλων/";
}
public interface Addr {

    String TOKEN_REQUEST = Prefix._EVENT + "DC-TOKEN/REQUEST";

    String DOC_DOWNLOAD = Prefix._EVENT + "DC-PUB/DOWNLOAD";
}
