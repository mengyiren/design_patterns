package com.execrise.cn;

/**
 * @author mengyiren
 */
public class FlyingEnchantment implements Enchantment {
    @Override
    public void onActivate() {
        System.out.println("武器开始发光");
    }

    @Override
    public void apply() {
        System.out.println("武器飞了起来，最后回到了英雄的手中");
    }

    @Override
    public void onDeactivate() {
        System.out.println("武器褪色");
    }
}
