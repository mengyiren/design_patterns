package com.execrise.cn;

import lombok.Data;

/**
 * @author mengyiren
 */
@Data
public class App {
    private King king;

    private Castle castle;

    private Army army;

    public void createKingdom(KingdomFactory factory) {
        setKing(factory.createKing());
        setArmy(factory.createArmy());
        setCastle(factory.createCastle());
    }

    public static void main(String[] args) {
        App app = new App();
        //精灵王
        app.createKingdom(FactoryMaker.makeFactory(FactoryMaker.KingdomType.ELF));
        System.out.println(app.getArmy().getDescription());
        System.out.println(app.getCastle().getDescription());
        System.out.println(app.getKing().getDescription());

        //兽人王
        app.createKingdom(FactoryMaker.makeFactory(FactoryMaker.KingdomType.ORC));
        System.out.println(app.getArmy().getDescription());
        System.out.println(app.getCastle().getDescription());
        System.out.println(app.getKing().getDescription());

    }
}
