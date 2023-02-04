package com.alipay.spring.test.spel;

import java.util.HashMap;
import java.util.Map;

import org.springframework.expression.EvaluationContext;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.expression.spel.support.StandardEvaluationContext;

/**
 * @author yi.xia
 * @date Create At 2020/10/20
 * @link <a href=mailto:yixia.wt@alibaba-inc.com></a>
 */
public class SpElTest {

    private static void testMap() {
        ExpressionParser expressionParser = new SpelExpressionParser();

        SpElEntity spElEntity = SpElEntity.of("1");

        Map<String, Object> vars = new HashMap<>(4);
        vars.put("spElEntity", spElEntity);

        EvaluationContext context = new StandardEvaluationContext(vars);
        Object value1 = expressionParser.parseExpression("[spElEntity].id").getValue(context);
        print(value1);

        Object value2 = expressionParser.parseExpression("['spElEntity'].id").getValue(context);
        print(value2);

        Object value3 = expressionParser.parseExpression("#root[spElEntity].id").getValue(context);
        print(value3);
    }

    private static void testObj() {
        ExpressionParser expressionParser = new SpelExpressionParser();

        SpElEntity spElEntity = SpElEntity.of("1");

        EvaluationContext context = new StandardEvaluationContext(spElEntity);
        Object value1 = expressionParser.parseExpression("id").getValue(context);
        print(value1);

        Object value2 = expressionParser.parseExpression("#root.id").getValue(context);
        print(value2);

        Object value3 = expressionParser.parseExpression("#this.id").getValue(context);
        print(value3);
    }

    /**
     * The variable #this is always defined and refers to the current evaluation object (against which unqualified
     * references are resolved).
     * The variable #root is always defined and refers to the root context object.
     * Although #this may vary as components of an expression are evaluated, #root always refers to the root.
     *
     * <a href="https://docs.spring.io/spring-framework/docs/5.0.19.RELEASE/spring-framework-reference/core.html#expressions"></a>
     */
    public static void main(String[] args) {
        //testMap();
        testObj();
    }

    private static void print(Object o) {
        System.out.println(o);
    }
}
