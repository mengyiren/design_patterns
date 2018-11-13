package com.execrise.cn;

import lombok.AllArgsConstructor;

/**
 * @author mengyiren
 */
@AllArgsConstructor
public enum Size {
    /**
     * 小
     */
    SMALL("small"),
    /**
     * 正常
     */
    NORMAL("normal");
    private String title;
}
