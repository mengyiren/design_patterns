package com.exercise.cn;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        Task task = new SimpleTask();
        CallBack callBack = () -> System.out.println("执行回调");
        task.executeWith(callBack);

        task.executeWith(() -> System.out.println("lambda回调"));
    }
}
