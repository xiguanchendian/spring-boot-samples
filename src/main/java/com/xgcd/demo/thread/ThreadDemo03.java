package com.xgcd.demo.thread;

public class ThreadDemo03 implements Runnable {
    @Override
    public void run() {
        System.out.println("线程执行。。。");
    }

    public static void main(String[] args) {
        // 创建实现类
        ThreadDemo03 threadDemo03 = new ThreadDemo03();
        // 创建线程，作为参数传递给Thread
        Thread thread = new Thread(threadDemo03);
        // 启动线程
        thread.start();
    }
}
