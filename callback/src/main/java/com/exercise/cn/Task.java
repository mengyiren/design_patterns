package com.exercise.cn;

import java.util.Objects;

/**
 * @author mengyiren
 */
public abstract class Task {
    public final void executeWith(CallBack callBack) {
        execute();
        if (Objects.nonNull(callBack)) {
            callBack.call();
        }
    }

    /**
     * 功能扩展
     */
    public abstract void execute();
}
