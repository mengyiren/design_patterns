package com.execrise.cn;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

/**
 * @author mengyiren
 */
public class FindCustomer implements BusinessOperation {
    private final String customerId;
    private final Deque<BusinessException> errors;

    public FindCustomer(String customerId, BusinessException... errors) {
        this.customerId = customerId;
        this.errors = new ArrayDeque<>(Arrays.asList(errors));
    }

    @Override
    public Object perform() throws BusinessException {
        if (!this.errors.isEmpty()) {
            throw this.errors.pop();
        }
        return this.customerId;
    }
}
