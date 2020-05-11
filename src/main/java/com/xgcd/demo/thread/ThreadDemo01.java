package com.xgcd.demo.thread;

public class ThreadDemo01 extends Thread {
    public void run() {
        System.out.println("通过继承Thread类创建线程……");
    }

    public static void main(String[] args) {
        // 创建线程，Thread子类
        ThreadDemo01 threadDemo01 = new ThreadDemo01();
        // 启动线程
        threadDemo01.start();
    }
}
