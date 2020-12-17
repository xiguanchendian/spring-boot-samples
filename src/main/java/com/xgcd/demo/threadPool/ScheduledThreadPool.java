package com.xgcd.demo.threadPool;

import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * 创建一个定长线程池，支持定时及周期性任务执行
 * 适合使用在执行定时任务和具体固定周期的重复任务。
 */
public class ScheduledThreadPool {
    public static void main(String[] args) {
        ScheduledExecutorService scheduledThreadPool = Executors.newScheduledThreadPool(5);
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.HOUR_OF_DAY, 10); // 时
        calendar.set(Calendar.MINUTE, 53);// 分
        calendar.set(Calendar.SECOND, 00); // 秒
        //计算现在时间和计划任务执行时间差多久，单位毫秒
        Long date = calendar.getTime().getTime() - System.currentTimeMillis();

        //延迟3秒执行
        scheduledThreadPool.schedule(new Runnable() {
            @Override
            public void run() {
                System.out.println("delay 3 seconds--" + new Date().toLocaleString());
            }
        }, 3, TimeUnit.SECONDS);

        //延迟5秒执行，然后每隔2秒执行一次
        scheduledThreadPool.scheduleAtFixedRate(new Runnable() {
            @Override
            public void run() {
                System.out.println("延迟5秒执行，然后每隔2秒执行一次--" + new Date().toLocaleString());
            }
        }, 5, 2, TimeUnit.SECONDS);

//        //定时在某一时刻执行任务，然后间隔执行,如果时间过了会立马执行
//        scheduledThreadPool.scheduleAtFixedRate(new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("定时在某一时刻执行任务，然后间隔执行--" + new Date().toLocaleString());
//            }
//        }, date / 1000, 2, TimeUnit.SECONDS);

    }
}
