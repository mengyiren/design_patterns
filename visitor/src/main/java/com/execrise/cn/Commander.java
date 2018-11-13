package com.execrise.cn;

/**
 * @author mengyiren
 */
public class Commander extends Unit {
    public Commander(Unit... children) {
        super(children);
    }

    @Override
    public void accept(UnitVisitor visitor) {
        visitor.visitCommander(this);
        super.accept(visitor);
    }
}
