package com.xgcd.demo.reflection;

public class ReflectDemo2 {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException {
        // 获取String的Class实例:
        Class cls = String.class;
        // 创建一个String实例:
        String s = (String) cls.newInstance();

        System.out.println(s);
    }
}
