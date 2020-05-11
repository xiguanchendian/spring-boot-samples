package com.xgcd.demo.threadLocal;

public class ThreadLoaclDemo {
    //    static ThreadLocal<String> threadLocal = new ThreadLocal<>();
    static InheritableThreadLocal<Object> threadLocal = new InheritableThreadLocal<>();


    public static void main(String[] args) {
        // 设置线程变量
//        threadLocal.set("helloworld");
        // 启动子线程
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("是否是null：" + threadLocal);
                // 子线程输出线程变量
                System.out.println("thread:" + threadLocal.get());
                System.out.println("是否是null：" + threadLocal);
            }
        });

        System.out.println("是否拥有锁：" + thread.holdsLock(ThreadLoaclDemo.class));
        thread.start();

        try {
            Thread.sleep(1000);
            System.out.println("================");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // 主线程输出线程变量
        System.out.println("main:" + threadLocal.get());

//        for (; ; ) {
//
//        }
    }
}
