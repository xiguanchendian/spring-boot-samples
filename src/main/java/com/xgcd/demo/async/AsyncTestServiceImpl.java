package com.xgcd.demo.async;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.AsyncResult;
import org.springframework.stereotype.Service;

import java.util.concurrent.Future;

@Service
public class AsyncTestServiceImpl implements AsyncTestService {

    private final Logger logger = LoggerFactory.getLogger(AsyncTestServiceImpl.class);

    /**
     * 异步方法
     * 有@Async注解的方法，默认就是异步执行的，会在默认的线程池中执行，但是此方法不能在本类调用；启动类需添加直接开启异步执行@EnableAsync。
     *
     * @return
     */
    @Async
    @Override
    public Future<String> getTest1() {

        AsyncTestServiceImpl service = new AsyncTestServiceImpl();
        synchronized (service) {
            try {
                for (int i = 0; i < 100; i++) {
                    logger.info(Thread.currentThread().getName() + "---------异步：>" + i);
                    service.wait(200);
                }
                return new AsyncResult<>("异步解析完成...");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        return new AsyncResult<>(Thread.currentThread().getName() + "执行完毕");
    }
}
