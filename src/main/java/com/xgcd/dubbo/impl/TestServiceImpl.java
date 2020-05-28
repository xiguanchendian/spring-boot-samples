package com.xgcd.dubbo.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.xgcd.dubbo.TestService;

@Service(version = "1.0.0", timeout = 3000)
public class TestServiceImpl implements TestService {
    @Override
    public void testDubbo() {

    }
}
