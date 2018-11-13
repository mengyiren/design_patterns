package com.execrice.cn;

import lombok.Data;

/**
 * @author mengyiren
 */
@Data
public class Hero {
    private Armor armor;

    private String name;

    private Profession profession;

    private HairType hairType;

    private HairColor hairColor;

    private Weapon weapon;

    public Hero(HeroBuilder builder) {
        this.armor = builder.getArmor();
        this.name = builder.getName();
        this.profession = builder.getProfession();
        this.hairColor = builder.getHairColor();
        this.hairType = builder.getHairType();
        this.weapon = builder.getWeapon();
    }
}
