package com.exercise.cn;

/**
 * @author mengyiren
 */
public class SimpleTroll implements Troll {
    @Override
    public void attack() {
        System.out.println("恶魔试图袭击你");
    }

    @Override
    public int getAttackPower() {
        return 10;
    }

    @Override
    public void fleeBattle() {
        System.out.println("恶魔逃走了");
    }
}
