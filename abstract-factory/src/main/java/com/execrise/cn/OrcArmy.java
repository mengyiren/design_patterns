package com.execrise.cn;

/**
 * @author mengyiren
 */
public class OrcArmy implements Army {
    private static final String DESCRIPTION = "这是兽人的军队";

    @Override
    public String getDescription() {
        return DESCRIPTION;
    }
}
