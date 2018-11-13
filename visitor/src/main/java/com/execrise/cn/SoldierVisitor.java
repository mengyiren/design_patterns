package com.execrise.cn;

/**
 * @author mengyiren
 */
public class SoldierVisitor implements UnitVisitor {
    @Override
    public void visitSoldier(Soldier soldier) {
        System.out.println("首长好," + soldier);
    }

    @Override
    public void visitCommander(Commander commander) {

    }

    @Override
    public void visitSergeant(Sergeant sergeant) {

    }
}
