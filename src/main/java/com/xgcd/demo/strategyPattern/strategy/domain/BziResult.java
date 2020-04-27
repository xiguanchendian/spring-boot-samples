package com.xgcd.demo.strategyPattern.strategy.domain;

/**
 * 业务处理结果返回实体对象
 * @param <T>
 */
public class BziResult<T> {
    // 默认执行结果为成功
    private boolean isSuccess = true;

    // 返回执行结果
    private T result;

    public BziResult() {
    }

    public BziResult(boolean isSuccess) {
        this.isSuccess = isSuccess;
    }

    public BziResult(T result) {
        this.result = result;
    }

    public BziResult(boolean isSuccess, T result) {
        this.isSuccess = isSuccess;
        this.result = result;
    }

    public boolean isSuccess() {
        return isSuccess;
    }

    public T getResult() {
        return result;
    }

    public void setSuccess(boolean success) {
        isSuccess = success;
    }

    public void setResult(T result) {
        this.result = result;
    }

    @Override
    public String toString() {
        return "BziResult{" +
                "isSuccess=" + isSuccess +
                ", result=" + result +
                '}';
    }
}
