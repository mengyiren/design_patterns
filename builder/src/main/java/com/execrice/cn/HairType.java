package com.execrice.cn;

import lombok.AllArgsConstructor;

/**
 * @author mengyiren
 */
@AllArgsConstructor
public enum HairType {
    /**
     * 秃头
     */
    BALD("bald"),
    /**
     * 短发
     */
    SHORT("short"),
    /**
     * 卷发
     */
    CURLY("curly"),
    /**
     * 长直
     */
    LONG_STRAIGHT("long_straight"),
    /**
     * 长卷
     */
    LONG_CURLY("long_curly");

    private String title;
}
