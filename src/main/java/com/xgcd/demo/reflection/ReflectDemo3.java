package com.xgcd.demo.reflection;

import java.lang.reflect.Field;

public class ReflectDemo3 {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        Person p = new Person("xiao ming");
        Class<? extends Person> pClass = p.getClass();

        // 设置字段的值，但是会破坏对象的封装
        Field f = pClass.getDeclaredField("name");
        f.setAccessible(true);
        f.set(p,"xiao hong");

        System.out.println(p.getName());
    }
}
