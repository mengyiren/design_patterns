package com.execrise.cn;

/**
 * @author mengyiren
 */
public interface KingdomFactory {
    /**
     * 创建城堡
     *
     * @return 城堡
     */
    Castle createCastle();

    /**
     * 创建军队
     *
     * @return 军队
     */
    Army createArmy();

    /**
     * 创建国王
     *
     * @return 国王
     */
    King createKing();
}
