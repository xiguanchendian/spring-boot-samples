package com.xgcd.demo.cglibAOP;

/**
 * 被代理的类，目标对象
 */
public class TargetObject {
    public void business(){
        // 目标方法，目标操作
        System.out.println("business");
    }
}
