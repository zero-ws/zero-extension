package io.zerows.extension.runtime.report.uca.util;

import org.apache.commons.jexl3.*;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FormulaEvaluator {


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
        BigDecimal result = evaluateFormula(formula);
        
        // 保留两位小数
        result = result.setScale(2, RoundingMode.DOWN);
        
        return result.toString();
    }

    public static BigDecimal evaluateFormula(final String formula) {
        try {
            final JexlEngine jexl = new JexlBuilder().create();
            final JexlExpression e = jexl.createExpression(formula);
            final JexlContext context = new MapContext();

            // 执行公式计算
            final Object result = e.evaluate(context);
            return new BigDecimal(result.toString()).setScale(2, RoundingMode.DOWN);
        } catch (Exception e) {
            e.printStackTrace();
            return BigDecimal.ZERO;  // 如果计算失败，返回 0
        }
    }
}
