package com.xgcd.demo.jdk8.lambda;

import org.junit.Test;

public class FunctionInterfaceTest3 {

    @Test
    public void testLambda() {
        // 使用lambda表达式代替匿名内部类
        func((Integer x) -> {
            System.out.println("hello functionInterface3!");
            return true;
        });
    }

    private void func(FunctionInterface3<Integer> functionInterface3) {
        int x = 1;
        functionInterface3.test(x);
    }
}
