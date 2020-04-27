package com.xgcd.demo.strategyPattern.strategy.domain;

import com.xgcd.demo.strategyPattern.enums.StrategyEnum;

/**
 * 调用策略类参数封装实体
 */
public class StrategyParam {
    // 策略枚举实例
    private StrategyEnum strategyEnum;

    public StrategyEnum getStrategyEnum() {
        return strategyEnum;
    }

    public void setStrategyEnum(StrategyEnum strategyEnum) {
        this.strategyEnum = strategyEnum;
    }
}
