package com.xgcd.demo.strategyPattern.strategy.impl;

import com.xgcd.demo.strategyPattern.Strategy;
import com.xgcd.demo.strategyPattern.annotation.BusinessStrategy;
import com.xgcd.demo.strategyPattern.enums.StrategyEnum;
import com.xgcd.demo.strategyPattern.strategy.domain.BziResult;
import com.xgcd.demo.strategyPattern.strategy.domain.StrategyParam;
import org.springframework.stereotype.Component;

@Component
@BusinessStrategy
public class StrategyC implements Strategy {
    @Override
    public BziResult invokeStrategy(StrategyParam strategyParam) {
        System.out.println("正在执行策略C...");
        return null;
    }

    @Override
    public StrategyEnum getStrategyEnum() {
        return StrategyEnum.STRATEGY_C;
    }
}
