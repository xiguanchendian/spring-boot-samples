package com.xgcd.demo.strategyPattern.manager;

import com.xgcd.demo.strategyPattern.Strategy;
import com.xgcd.demo.strategyPattern.annotation.BusinessStrategy;
import com.xgcd.demo.strategyPattern.strategy.StrategyContext;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

/**
 * 策略管理器（重点）
 */
@Component
public class StrategyManager implements BeanPostProcessor {
    @Autowired
    private StrategyContext strategyContext;

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        // 务必将bean实例返回
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        // 判断bean是否被自定义注解标识
        if (bean instanceof Strategy && bean.getClass().isAnnotationPresent(BusinessStrategy.class)) {
            // 将策略类强转为顶层策略接口
            Strategy strategy = (Strategy) bean;
            // 将策略类添加到策略Map中
            strategyContext.strategyMap.put(strategy.getStrategyEnum(), strategy);
        }
        // 务必将bean实例返回
        return bean;
    }
}
