package com.execrise.cn;

/**
 * 桥接设计模式：将抽象部分与实现部分分离
 */
public class App {
    public static void main(String[] args) {
        Sword sword = new Sword(new SoulEatingEnchantment());
        sword.wield();
        sword.swing();
        sword.unwield();

        Hammer hammer = new Hammer(new FlyingEnchantment());
        hammer.wield();
        hammer.swing();
        hammer.unwield();
    }
}
