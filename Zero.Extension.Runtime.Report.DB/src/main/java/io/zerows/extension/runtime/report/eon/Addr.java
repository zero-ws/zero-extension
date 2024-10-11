package io.zerows.extension.runtime.report.eon;

import io.zerows.core.web.scheduler.plugins.JobClient;

interface Prefix {

    String _EVENT = "Ἀτλαντὶς νῆσος://Έντυπο αναφοράς/";
}
/**
 * @author lang : 2024-10-08
 */
public interface Addr {

    interface Report{
        String QUERY_ALL = Prefix._EVENT + "KP-REPORT/QUERY-ALL";

        String QUERY_PAGE = Prefix._EVENT + "KP-REPORT/QUERY-PAGE";

        String SINGLE_GENERATE = Prefix._EVENT + "KP-REPORT/SINGLE-GENERATE";

        String SINGLE_EXPORT = Prefix._EVENT + "KP-REPORT/SINGLE-EXPORT";
    }
}
