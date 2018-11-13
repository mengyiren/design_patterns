package com.execrise.cn;

import lombok.AllArgsConstructor;

/**
 * @author mengyiren
 */
@AllArgsConstructor
public enum Visibility {
    /**
     * 可见
     */
    VISIBLE("visible"),
    /**
     * 不可见
     */
    INVISIBLE("invisible");
    private String title;
}
