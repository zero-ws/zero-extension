package io.zerows.extension.runtime.report.exception;

import io.horizon.exception.WebException;

/**
 * @author lang : 2024-10-12
 */
public class _400ReportDataSetException extends WebException {

    public _400ReportDataSetException(final Class<?> target, final String reportId) {
        super(target, reportId);
    }

    @Override
    public int getCode() {
        return -80702;
    }
}
