package com.execrise.cn;

/**
 * @author mengyiren
 */
public class SoulEatingEnchantment implements Enchantment {
    @Override
    public void onActivate() {
        System.out.println("武器开始流血");
    }

    @Override
    public void apply() {
        System.out.println("武器吞噬了敌人的灵魂");
    }

    @Override
    public void onDeactivate() {
        System.out.println("武器的流血效果消失");
    }
}
