package com.xgcd.demo.conditionAnnotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class FoodTest {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.getEnvironment().getSystemProperties().put("people", "南方人");
        context.register(JavaConfig.class);
        context.refresh();

        Food food = (Food) context.getBean("food");

        System.out.println(food.showName());
    }
}
