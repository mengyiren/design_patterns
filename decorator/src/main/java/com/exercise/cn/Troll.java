package com.exercise.cn;

/**
 * @author mengyiren
 */
public interface Troll {
    /**
     * 袭击
     */
    void attack();

    /**
     * power等级
     *
     * @return power等级
     */
    int getAttackPower();

    /**
     * 脱离战斗
     */
    void fleeBattle();
}
