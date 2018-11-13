package com.execrice.cn;

import lombok.Getter;

/**
 * @author mengyiren
 */
@Getter
public class HeroBuilder {
    private Armor armor;

    private String name;

    private Profession profession;

    private HairType hairType;

    private HairColor hairColor;

    private Weapon weapon;

    public HeroBuilder(Profession profession, String name) {
        this.profession = profession;
        this.name = name;
    }

    public HeroBuilder buildHairType(HairType hairType) {
        this.hairType = hairType;
        return this;
    }

    public HeroBuilder buildHairColor(HairColor hairColor) {
        this.hairColor = hairColor;
        return this;
    }

    public HeroBuilder buildArmor(Armor armor) {
        this.armor = armor;
        return this;
    }

    public HeroBuilder buildWeapon(Weapon weapon) {
        this.weapon = weapon;
        return this;
    }

    public Hero build() {
        return new Hero(this);
    }
}
