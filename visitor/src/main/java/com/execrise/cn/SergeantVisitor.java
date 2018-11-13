package com.execrise.cn;

/**
 * @author mengyiren
 */
public class SergeantVisitor implements UnitVisitor {
    @Override
    public void visitSoldier(Soldier soldier) {

    }

    @Override
    public void visitCommander(Commander commander) {

    }

    @Override
    public void visitSergeant(Sergeant sergeant) {
        System.out.println("为人民服务" + sergeant);
    }
}
