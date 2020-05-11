package com.xgcd.demo.threadPool;

public class SingleThreadExecutor {

    public static void main(String[] args) {
        System.out.println(Integer.MAX_VALUE);// 2147483647

        final String aaa = "12345";// 被final修饰的字符串变量不能被重新赋值
        System.out.println(aaa);

    }
}
