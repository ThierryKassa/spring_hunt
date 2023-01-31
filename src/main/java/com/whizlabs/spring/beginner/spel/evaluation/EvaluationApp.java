package com.whizlabs.spring.beginner.spel.evaluation;

import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class EvaluationApp {
    public static void main(String[] args) {
        ExpressionParser parser = new SpelExpressionParser();

        Expression simpleExpression = parser.parseExpression("'Hello World!'");
        Object simpleResult = simpleExpression.getValue();
        System.out.println(simpleResult);

        Expression instanceMethodExpression = parser.parseExpression("'Hello Canada'.toUpperCase");
        Object instanceMethodResult = instanceMethodExpression.getValue();
        System.out.println(instanceMethodResult);

//        Read object property in field
        Expression propertyExpression = parser.parseExpression("'Hello World'.bytes.length");
        int propertyResult = (int)propertyExpression.getValue();
        System.out.println(propertyResult);

//        Call to a static method
        Expression staticMethodExpression = parser.parseExpression("T(String).join(' ','Welcome', 'to', 'Canada')");
        String staticMethodResult = staticMethodExpression.getValue(String.class);
        System.out.println(staticMethodResult);

//        A common usage of SpeL is to provide an expression string evaluated againt a specific object instance called the root object
        Company company = new Company("Sokat LTD");
        Expression objectRootedExpression = parser.parseExpression("name");
        String objectRootedResult = objectRootedExpression.getValue(company,String.class);
        System.out.println(objectRootedResult);

    }

}
