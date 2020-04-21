package com.xgcd.demo.reflection;

public class ReflectDemo5 {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        Class c1 = Class.forName("com.xgcd.demo.reflection.bean.Employee");
        Object o = c1.newInstance();
        System.out.println(o);
    }
}
