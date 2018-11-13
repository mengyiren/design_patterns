package com.execrise.cn;

/**
 * @author mengyiren
 */
public class Hammer implements Weapon {
    private final Enchantment enchantment;

    public Hammer(Enchantment enchantment) {
        this.enchantment = enchantment;
    }

    @Override
    public void wield() {
        System.out.println("装备锤子");
        enchantment.onActivate();
    }

    @Override
    public void swing() {
        System.out.println("挥舞锤子");
        enchantment.apply();
    }

    @Override
    public void unwield() {
        System.out.println("卸下锤子");
        enchantment.onDeactivate();
    }

    @Override
    public Enchantment getEnchantment() {
        return enchantment;
    }
}
