package com.xgcd.demo.decratorPattern;

public class Parent implements IChild {
    private Children children;

    public Parent(Children children) {
        this.children = children;
    }

    @Override
    public void eat() {
        System.out.println("父母做饭...");
        children.eat();
        System.out.println("父母收拾餐具...");
    }
}
