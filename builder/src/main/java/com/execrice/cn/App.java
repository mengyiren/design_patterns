package com.execrice.cn;

/**
 * @author mengyiren
 */
public class App {
    public static void main(String[] args) {
        Hero mage = new HeroBuilder(Profession.MAGE, "法师").buildArmor(Armor.CLOTHHES)
                .buildHairColor(HairColor.BLACK)
                .buildHairType(HairType.CURLY)
                .buildWeapon(Weapon.DAGGER)
                .build();
        System.out.println(mage);

        Hero thief = new HeroBuilder(Profession.THIEF, "盗贼").buildArmor(Armor.LEATHER)
                .buildHairColor(HairColor.BROWN)
                .buildHairType(HairType.SHORT)
                .buildWeapon(Weapon.DAGGER)
                .build();
        System.out.println(thief);
    }
}
