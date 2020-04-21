package com.xgcd.demo.sync.SyncTest5;

import java.io.IOException;
import java.io.PipedOutputStream;

/**
 * 我们以数字替代产品 生产者每5秒提供5个产品，放入管道
 */
public class Producer extends Thread {
    private PipedOutputStream outputStream;

    private int index = 0;

    public Producer(PipedOutputStream outputStream) {
        this.outputStream = outputStream;
    }

    @Override
    public void run() {
        while (true) {
            try {
                for (int i = 0; i < 5; i++) {
                    outputStream.write(index++);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
