package com.xgcd.demo.strategyPattern.enums;

/**
 * 自定义策略枚举
 */
public enum StrategyEnum {
    STRATEGY_A(1, "策略A"),
    STRATEGY_B(2, "策略B"),
    STRATEGY_C(3, "策略C");

    private int strategyType;

    private String strategyDescription;

    StrategyEnum(int strategyType, String strategyDescription) {
        this.strategyType = strategyType;
        this.strategyDescription = strategyDescription;
    }

    public int getStrategyType() {
        return strategyType;
    }

    public String getStrategyDescription() {
        return strategyDescription;
    }
}
