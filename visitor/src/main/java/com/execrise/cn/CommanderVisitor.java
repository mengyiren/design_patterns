package com.execrise.cn;

/**
 * @author mengyiren
 */
public class CommanderVisitor implements UnitVisitor {
    @Override
    public void visitSoldier(Soldier soldier) {

    }

    @Override
    public void visitCommander(Commander commander) {
        System.out.println("同志们辛苦了:" + commander);
    }

    @Override
    public void visitSergeant(Sergeant sergeant) {

    }
}
