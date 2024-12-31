package io.zerows.extension.runtime.report.refine;

import io.vertx.core.json.JsonObject;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author lang : 2024-11-14
 */
public final class Rp {

    private Rp() {
    }

    /**
     * <pre><code>
     *     mode 取值
     *     TODAY                - 当前日期 {@link java.time.LocalDate}
     *     TOMORROW             - 明天日期 {@link java.time.LocalDate}
     *     NOW                  - 当前时间 {@link java.time.LocalDateTime}
     *     NOW_TOMORROW         - 明天时间 {@link java.time.LocalDateTime}
     *     TIME                 - 时间戳 {@link java.time.Instant}
     * </code></pre>
     *
     * @param mode   模式说明
     * @param params 参数
     *
     * @return 解析之后的值
     */
    public static Object valueFormat(final String mode, final JsonObject params) {
        return RpValue.format(mode, params);
    }

    public static JsonObject valueFormat(final JsonObject paramsTpl, final JsonObject params) {
        final JsonObject output = new JsonObject();
        paramsTpl.fieldNames().forEach(field -> {
            final String mode = paramsTpl.getString(field);
            final Object value = RpValue.format(mode, params);
            output.put(field, value);
        });
        return output;
    }

    public static String calculateFormula(String formula, final ConcurrentHashMap<String, String> total) {
        // 匹配公式中的变量（如 sellRoom, roomTotal）
        final Pattern pattern = Pattern.compile("([a-zA-Z]+\\w*)");
        final Matcher matcher = pattern.matcher(formula);

        // 替换公式中的变量为对应的值
        while (matcher.find()) {
            String variable = matcher.group(1);
            if (total.containsKey(variable)) {
                BigDecimal value = new BigDecimal(total.get(variable));
                formula = formula.replace(variable, value.toString());
            }
        }

        // 执行替换后的公式计算
        BigDecimal result = RpValue.evaluateFormula(formula);

        // 保留两位小数
        result = result.setScale(2, RoundingMode.DOWN);

        return result.toString();
    }
}
