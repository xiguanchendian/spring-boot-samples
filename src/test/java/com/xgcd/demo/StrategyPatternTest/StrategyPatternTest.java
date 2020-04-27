package com.xgcd.demo.StrategyPatternTest;

import com.xgcd.demo.strategyPattern.enums.StrategyEnum;
import com.xgcd.demo.strategyPattern.strategy.StrategyContext;
import com.xgcd.demo.strategyPattern.strategy.domain.StrategyParam;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class StrategyPatternTest {

    @Autowired
    private StrategyContext strategyContext;

    // 自定义注解策略模式测试
    @Test
    public void test() {
        StrategyParam strategyParamA = new StrategyParam();
        strategyParamA.setStrategyEnum(StrategyEnum.STRATEGY_A);
        strategyContext.invokeContext(strategyParamA);

        StrategyParam strategyParamB = new StrategyParam();
        strategyParamB.setStrategyEnum(StrategyEnum.STRATEGY_B);
        strategyContext.invokeContext(strategyParamB);

        StrategyParam strategyParamC = new StrategyParam();
        strategyParamC.setStrategyEnum(StrategyEnum.STRATEGY_C);
        strategyContext.invokeContext(strategyParamC);
    }
}
