package io.zerows.extension.runtime.report.refine;

import io.horizon.eon.VValue;
import io.vertx.core.json.JsonObject;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

/**
 * @author lang : 2024-11-14
 */
class RpValue {

    static Object format(final String expression, final JsonObject params) {
        final String[] modes = expression.split(",");
        if (2 > modes.length) {
            return null;
        }
        final String mode = modes[VValue.IDX];
        final String pattern = modes[VValue.ONE];

        if ("TODAY".equals(mode)) {
            return LocalDate.now().atStartOfDay()
                .format(DateTimeFormatter.ofPattern(pattern));
        }

        if ("TOMORROW".equals(mode)) {
            return LocalDate.now().plusDays(1).atStartOfDay()
                .format(DateTimeFormatter.ofPattern(pattern));
        }

        if ("NOW".equals(mode)) {
            return LocalDateTime.now()
                .format(DateTimeFormatter.ofPattern(pattern));
        }

        if ("NOW_TOMORROW".equals(mode)) {
            return LocalDateTime.now().plusDays(1)
                .format(DateTimeFormatter.ofPattern(pattern));
        }

        if ("TIME".equals(mode)) {
            return LocalTime.now()
                .format(DateTimeFormatter.ofPattern(pattern));
        }

        return null;
    }
}
