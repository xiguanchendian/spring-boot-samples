package com.xgcd.demo.async;

import java.util.concurrent.Future;

public interface AsyncTestService {
    Future<String> getTest1();
}
