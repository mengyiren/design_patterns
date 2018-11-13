package com.execrise.cn;

/**
 * @author mengyiren
 */
public interface Weapon {
    /**
     * 装备
     */
    void wield();

    /**
     * 挥舞
     */
    void swing();

    /**
     * 卸下装备
     */
    void unwield();

    /**
     * 获取属性值
     *
     * @return 属性值
     */
    Enchantment getEnchantment();
}
