package com.execrise.cn;

/**
 * @author mengyiren
 */
public class MeleeStrategy implements DragonSlayingStrategy {
    @Override
    public void execute() {
        System.out.println("近身杀死了龙");
    }
}
