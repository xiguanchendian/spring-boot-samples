package com.xgcd.demo.conditionAnnotation;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

public class NoodlesCondition implements Condition {
    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
//        return context.getEnvironment().getProperty("people").equals("北方人");
        return false;
    }
}
