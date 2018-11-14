package com.exercise.cn;

/**
 * @author mengyiren
 */
public class SimpleTask extends Task {
    @Override
    public void execute() {
        System.out.println("回调函数切面");
    }
}
