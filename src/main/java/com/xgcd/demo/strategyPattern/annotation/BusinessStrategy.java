package com.xgcd.demo.strategyPattern.annotation;

import java.lang.annotation.*;

/**
 * 自定义注解
 * 业务策略注解
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE})
@Documented
@Inherited
public @interface BusinessStrategy {

}
