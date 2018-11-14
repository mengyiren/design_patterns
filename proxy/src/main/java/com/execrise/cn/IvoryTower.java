package com.execrise.cn;

/**
 * @author mengyiren
 */
public class IvoryTower implements WizardTower {
    @Override
    public void enter(Wizard wizard) {
        System.out.println(wizard + "进入了象牙塔");
    }
}
