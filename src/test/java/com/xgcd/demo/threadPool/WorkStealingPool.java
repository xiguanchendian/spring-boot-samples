package com.xgcd.demo.threadPool;

import org.junit.Test;

import java.util.concurrent.*;

public class WorkStealingPool {
    // 线程数
    private static final int threads = 10;
    // 用于计数线程是否执行完成
    CountDownLatch countDownLatch = new CountDownLatch(threads);

    /**
     * newFixedThreadPool execute
     *
     * @throws ExecutionException
     * @throws InterruptedException
     */
    @Test
    public void test1() throws ExecutionException, InterruptedException {
        System.out.println("---- start ----");
        ExecutorService executorService = Executors.newWorkStealingPool();
        for (int i = 0; i < threads; i++) {
            executorService.execute(() -> {
                try {
                    System.out.println(Thread.currentThread().getName());
                } catch (Exception e) {
                    System.out.println(e);
                } finally {
                    countDownLatch.countDown();
                }
            });
        }
        countDownLatch.await();
        System.out.println("---- end ----");
    }

    /**
     * newFixedThreadPool submit submit
     */
    @Test
    public void test2() throws InterruptedException {
        System.out.println("---- start ----");
        ExecutorService executorService = Executors.newWorkStealingPool();
        for (int i = 0; i < threads; i++) {
//            Callable 带返回值
            executorService.submit(new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        System.out.println(Thread.currentThread().getName());
                    } catch (Exception e) {
                        e.printStackTrace();
                    } finally {
                        countDownLatch.countDown();
                    }
                }
            }));
        }
        countDownLatch.await();
        System.out.println("---- end ----");
    }

    /**
     * newFixedThreadPool submit Callable
     *
     * @throws ExecutionException
     * @throws InterruptedException
     */
    @Test
    public void test3() throws ExecutionException, InterruptedException {
        System.out.println("---- start ----");
        ExecutorService executorService = Executors.newWorkStealingPool();
        for (int i = 0; i < threads; i++) {
//          Runnable 带返回值
            FutureTask<?> futureTask = new FutureTask<>(new Callable<String>() {
                /**
                 * call
                 * @return currentThreadName
                 */
                @Override
                public String call() {
                    return Thread.currentThread().getName();
                }
            });
            executorService.submit(new Thread(futureTask));
            System.out.println(futureTask.get());
        }
        System.out.println("---- end ----");
    }
}
