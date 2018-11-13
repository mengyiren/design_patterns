package com.execrise.cn;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) {
        Captain captain = new Captain(new FishingBoatAdapter());
        captain.row();
    }
}
