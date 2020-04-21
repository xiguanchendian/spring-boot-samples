package com.xgcd.demo.thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class ThreadDemo02 implements Callable<String> {
    @Override
    public String call() throws Exception {
        return "callable...执行成功";
    }

    public static void main(String[] args) {
        ThreadDemo02 threadDemo02 = new ThreadDemo02();
        // 创建异步任务
        FutureTask<String> stringFutureTask = new FutureTask<>(threadDemo02);
        // 创建线程，将实现类作为参数传递给Thread
        Thread thread = new Thread(stringFutureTask);
        // 启动线程
        thread.start();

        try {
            // 等待任务执行完毕，并返回结果
            String result = stringFutureTask.get();
            System.out.println("任务执行 结果：" + result);// 其实就是call()方法的返回值
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }


    }
}
