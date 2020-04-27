package com.xgcd.demo.strategyPattern.strategy;

import com.xgcd.demo.strategyPattern.Strategy;
import com.xgcd.demo.strategyPattern.enums.StrategyEnum;
import com.xgcd.demo.strategyPattern.strategy.domain.BziResult;
import com.xgcd.demo.strategyPattern.strategy.domain.StrategyParam;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class StrategyContext {
    public Map<StrategyEnum, Strategy> strategyMap = new HashMap<>(3);

    /**
     * 执行策略上下文
     *
     * @param strategyParam
     * @return
     */
    public BziResult invokeContext(StrategyParam strategyParam) {

        if (strategyParam == null) {
            throw new IllegalArgumentException("执行策略参数不能为空！");
        }

        // 获取策略参数中的枚举实例
        StrategyEnum strategyEnum = strategyParam.getStrategyEnum();
        // 通过枚举实例获取对应策略类
        Strategy strategy = strategyMap.get(strategyEnum);
        // 执行策略方案
        return strategy.invokeStrategy(strategyParam);

    }
}
