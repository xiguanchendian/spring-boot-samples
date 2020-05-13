package com.xgcd.demo.decratorPattern;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ChildrenWrapper implements IChild, IStudent {

    @Autowired
    private Children children;

    public ChildrenWrapper(Children children) {
        this.children = children;
    }

    // 只对eat()进行增强（装饰）
    @Override
    public void eat() {
        System.out.println("自力更生做饭...");
        children.eat();
        System.out.println("自己的碗筷自己洗...");
    }

    @Override
    public void readBook() {
        children.readBook();
    }
}
