package com.xgcd.demo.sync.SyncTest5;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

public class SyncTest5 {
    public static void main(String[] args) {

        PipedOutputStream pos = new PipedOutputStream();
        PipedInputStream pis = new PipedInputStream();
        try {
            pis.connect(pos);
        } catch (IOException e) {
            e.printStackTrace();
        }

        new Producer(pos).start();
        new Consumer(pis).start();

    }
}
