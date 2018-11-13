package com.execrise.cn;

/**
 * @author mengyiren
 */
public abstract class Command {
    /**
     * 撤销
     */
    public abstract void undo();

    /**
     * 重试
     */
    public abstract void redo();

    /**
     * 执行
     *
     * @param target 目标对象
     */
    public abstract void execute(Target target);
}
