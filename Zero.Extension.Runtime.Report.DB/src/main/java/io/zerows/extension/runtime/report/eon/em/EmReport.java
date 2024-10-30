package io.zerows.extension.runtime.report.eon.em;

import io.zerows.extension.runtime.report.uca.pull.DataSet;

/**
 * @author lang : 2024-10-29
 */
public final class EmReport {
    private EmReport() {
    }

    /**
     * 数据源类型，用于 {@link DataSet} 分流操作，构造不同实现类
     * <pre><code>
     *     {
     *         "sourceType": "???",
     *         "ds.table": "???",
     *         "ds.view": "???",
     *         "ds.extension": "???",
     *
     *         "ds.active": "???",
     *         "ds.standby": "???"
     *     }
     * </pre></code>
     *
     * @author lang : 2024-10-12
     */
    public enum SourceType {
        TABLE,
        VIEW,
        EXTENSION,
        JOIN_2
    }

    public enum UcaStatus {
        ACTIVE,
        DISABLED,
        ERROR
    }
}
