package com.xgcd.demo.decratorPattern;

public class Children implements IChild, IStudent {
    @Override
    public void eat() {
        System.out.println("孩子吃饭...");
    }

    @Override
    public void readBook() {
        System.out.println("孩子读书...");
    }
}
