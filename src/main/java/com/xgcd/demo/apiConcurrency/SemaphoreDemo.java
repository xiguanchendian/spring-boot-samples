package com.xgcd.demo.apiConcurrency;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.concurrent.Semaphore;

@RequestMapping("/push")
public class SemaphoreDemo {
    private final Semaphore permit = new Semaphore(10, true);

    @PostMapping("/test")
    public String test() {
        try {
            permit.acquire();
            System.out.println("处理请求==========>");
            Thread.sleep(2000);
        } catch (Exception e) {
            System.out.println("error");
        } finally {
            permit.release();
        }
        return "success";
    }
}
