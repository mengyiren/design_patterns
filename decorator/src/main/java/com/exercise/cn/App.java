package com.exercise.cn;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        Troll troll = new SimpleTroll();
        troll.attack();
        troll.fleeBattle();
        System.out.println("小恶魔力量:" + troll.getAttackPower());

        ClubbedTroll clubbedTroll = new ClubbedTroll(troll);
        clubbedTroll.attack();
        clubbedTroll.fleeBattle();
        System.out.println("大恶魔力量:" + clubbedTroll.getAttackPower());
    }
}
