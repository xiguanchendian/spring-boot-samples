package com.xgcd.demo.decratorPattern;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DecoratorPatternDemo {

    public static void main(String[] args) {
        // 方式1
        // 父母代理孩子吃饭
//        Children children = new Children();
//        Parent parent = new Parent(children);
//        parent.eat();
//
//        // 孩子自己丰富吃饭的过程
//        ChildrenWrapper childrenWrapper = new ChildrenWrapper(children);
//        childrenWrapper.eat();

        // 方式2
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.scan("com.xgcd.demo.decratorPattern");
        context.refresh();
        Object object = context.getBean("childrenWrapper");
        ((IChild) object).eat();

        // school
        Children children = new Children();
        ChildrenWrapper childrenWrapper = new ChildrenWrapper(children);
        School school = new School();
        school.addStudent(childrenWrapper);
        school.readBook();

    }
}
