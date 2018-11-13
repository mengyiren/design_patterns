package com.execrice.cn;

import lombok.AllArgsConstructor;

/**
 * @author mengyiren
 */
@AllArgsConstructor
public enum Armor {
    /**
     * 衣服
     */
    CLOTHHES("clothes"),
    /**
     * 皮革
     */
    LEATHER("leather"),
    /**
     * 锁子甲
     */
    CHAIN_MAIL("chain_mail"),
    /**
     * 板甲
     */
    PLATE_MAIL("plate_mail");

    private String title;
}
