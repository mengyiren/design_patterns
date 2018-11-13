package com.execrise.cn;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) {
        DragonSlayer dragonSlayer = new DragonSlayer(new MeleeStrategy());
        dragonSlayer.goToBattle();
        dragonSlayer.changeStrategy(new ProjectileStrategy());
        dragonSlayer.goToBattle();

        //java8
        dragonSlayer = new DragonSlayer(() -> System.out.println("近身杀死了龙"));
        dragonSlayer.goToBattle();
        dragonSlayer.changeStrategy(()-> System.out.println("开抢打死了龙"));
        dragonSlayer.goToBattle();
    }
}
