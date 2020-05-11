package com.xgcd.demo.thread;

public class ThreadDemo04 {
    public static void main(String[] args) {
        Thread thread = new Thread();
        thread.run();
        System.out.println("thread.run();" + Thread.currentThread().getName());
        thread.start();
        System.out.println("thread.start();" + Thread.currentThread().getName());
        thread.start();//Exception in thread "main" java.lang.IllegalThreadStateException
//        thread.run();
        System.out.println("thread.start();" + Thread.currentThread().getName());
    }
}
