package com.xgcd.demo.jdk8.lambda;

public class TestLambda {
    public static void main(String[] args) {

        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("hello lambda!");
            }
        });
    }
}
