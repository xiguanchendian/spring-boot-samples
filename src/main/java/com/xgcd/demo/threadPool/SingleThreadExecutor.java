package com.xgcd.demo.threadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

// 适合使用在多个任务顺序执行的场景。
public class SingleThreadExecutor {
    public static void main(String[] args) {
        ExecutorService singleThreadExecutor = Executors.newSingleThreadExecutor();
        for (int i = 0; i < 10; i++) {
            final int index = i;
            singleThreadExecutor.execute(new Runnable() {
                @Override
                public void run() {
                    try {
                        System.out.println(index + "--单线程执行任务--" + Thread.currentThread().getId());
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            });
        }

    }
}
