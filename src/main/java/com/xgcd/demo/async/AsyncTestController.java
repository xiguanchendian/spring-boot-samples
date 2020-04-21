package com.xgcd.demo.async;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.concurrent.Future;

import static java.lang.Thread.sleep;

@Controller
@EnableAsync
@RequestMapping("async")
public class AsyncTestController {

    private final Logger logger = LoggerFactory.getLogger(AsyncTestController.class);

    @Autowired
    private AsyncTestService asyncTestService;

    @RequestMapping(value = "test1", method = RequestMethod.GET)
    @ResponseBody
    public String test1() {
        Future<String> task1 = asyncTestService.getTest1();
        logger.info("============>" + Thread.currentThread().getName());
        // 三个任务都调用完成，退出循环等待
        /*while (!task1.isDone()) {
            try {
                sleep(1000);
                logger.info("========>" + task1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }*/
        return "异步，正在解析...";
    }
}
