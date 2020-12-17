package com.xgcd.demo.jdk8.lambda;

import org.junit.Test;

public class FunctionInterface1Test2 {

    @Test
    public void testLambda() {
        // 使用lambda表达式代替匿名内部类
        func((Integer x) -> System.out.println("hello functionInterface!" + x));

    }

    private void func(FunctionInterface2<Integer> functionInterface2) {
        int x = 1;
        functionInterface2.test(x);
    }

}
