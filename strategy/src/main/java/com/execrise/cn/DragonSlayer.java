package com.execrise.cn;

import lombok.AllArgsConstructor;

/**
 * @author mengyiren
 */
@AllArgsConstructor
public class DragonSlayer {
    private DragonSlayingStrategy strategy;

    public void changeStrategy(DragonSlayingStrategy strategy) {
        this.strategy = strategy;
    }

    public void goToBattle() {
        strategy.execute();
    }
}
