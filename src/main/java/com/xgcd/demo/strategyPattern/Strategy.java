package com.xgcd.demo.strategyPattern;

import com.xgcd.demo.strategyPattern.enums.StrategyEnum;
import com.xgcd.demo.strategyPattern.strategy.domain.BziResult;
import com.xgcd.demo.strategyPattern.strategy.domain.StrategyParam;

/**
 * 策略接口
 */
public interface Strategy {
    /**
     * 调用策略方法
     * @param strategyParam 执行策略方案参数
     * @return 业务处理返回结果封装实体
     */
    BziResult invokeStrategy(StrategyParam strategyParam);

    /**
     * 获取当前对象对应枚举
     * @return
     */
    StrategyEnum getStrategyEnum();

}
