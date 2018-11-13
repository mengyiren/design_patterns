package com.execrise.cn;

/**
 * @author mengyiren
 */
public interface UnitVisitor {
    /**
     * 访问士兵
     *
     * @param soldier 士兵
     */
    void visitSoldier(Soldier soldier);

    /**
     * 访问首长
     *
     * @param commander 首长
     */
    void visitCommander(Commander commander);

    /**
     * 访问中士
     * @param sergeant
     */
    void visitSergeant(Sergeant sergeant);
}
