package com.execrise.cn;

/**
 * @author mengyiren
 */
@FunctionalInterface
public interface BusinessOperation<T> {
    /**
     * 执行业务方法
     *
     * @return 结果
     * @throws BusinessException 业务异常
     */
    T perform() throws BusinessException;
}
