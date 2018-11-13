package com.execrise.cn;

/**
 * @author mengyiren
 */
public class Sword implements Weapon {
    private final Enchantment enchantment;

    public Sword(Enchantment enchantment) {
        this.enchantment = enchantment;
    }

    @Override
    public void wield() {
        System.out.println("装备剑");
        enchantment.onActivate();
    }

    @Override
    public void swing() {
        System.out.println("挥舞剑");
        enchantment.apply();
    }

    @Override
    public void unwield() {
        System.out.println("卸下剑");
        enchantment.onDeactivate();
    }

    @Override
    public Enchantment getEnchantment() {
        return enchantment;
    }
}
