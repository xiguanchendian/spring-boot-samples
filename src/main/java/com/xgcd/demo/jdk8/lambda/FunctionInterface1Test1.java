package com.xgcd.demo.jdk8.lambda;

import org.junit.Test;

public class FunctionInterface1Test1 {
    @Test
    public void testLambda() {

        func(new FunctionInterface1() {
            @Override
            public void test() {
                System.out.println("hello functionInterface!");
            }
        });

        // 使用lambda表达式代替匿名内部类
        func(() -> System.out.println("hello functionInterface2!"));// ()代表参数 后面代表函数主体
    }

    private void func(FunctionInterface1 functionInterface1) {
        functionInterface1.test();
    }
}
