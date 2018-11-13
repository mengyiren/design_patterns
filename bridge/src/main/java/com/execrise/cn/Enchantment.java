package com.execrise.cn;

/**
 * @author mengyiren
 */
public interface Enchantment {
    /**
     * 激活
     */
    void onActivate();

    /**
     * 展示
     */
    void apply();

    /**
     * 禁用
     */
    void onDeactivate();
}
