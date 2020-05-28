package com.xgcd.demo.jdk8;

import java.lang.management.ManagementFactory;
import java.lang.management.MemoryMXBean;
import java.util.List;

public class PrintJVMInfo {
    public static void main(String[] args) {
        for(;;){
            MemoryMXBean memorymbean = ManagementFactory.getMemoryMXBean();
            System.out.println("堆内存信息: " + memorymbean.getHeapMemoryUsage());
            System.out.println("方法区内存信息: " + memorymbean.getNonHeapMemoryUsage());

            List<String> inputArgs = ManagementFactory.getRuntimeMXBean().getInputArguments();
            System.out.println("\n####################运行时设置的JVM参数####################");
            System.out.println(inputArgs);

            System.out.println("\n####################运行时内存情况#######################");
            long totle = Runtime.getRuntime().totalMemory();
            System.out.println("总的内存量 [" + totle + "]");
            long free = Runtime.getRuntime().freeMemory();
            System.out.println("空闲的内存量 [" + free + "]");
            long max = Runtime.getRuntime().maxMemory();
            System.out.println("最大的内存量 [" + max + "]");
        }
    }
}
