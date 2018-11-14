package com.execrise.cn;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) {
        WizardTowerProxy proxy = new WizardTowerProxy(new IvoryTower());
        proxy.enter(new Wizard("唐伯虎"));
        proxy.enter(new Wizard("祝枝山"));
        proxy.enter(new Wizard("文征明"));
        proxy.enter(new Wizard("徐祯卿"));
    }
}
