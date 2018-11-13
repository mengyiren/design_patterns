package com.execrise.cn;

/**
 * @author mengyiren
 */
public class FactoryMaker {
    public enum KingdomType {
        /**
         * 精灵
         */
        ELF,
        /**
         * 兽人
         */
        ORC
    }

    public static KingdomFactory makeFactory(KingdomType type) {
        if (KingdomType.ELF.equals(type)) {
            return new ElfKingdomFactory();
        }
        if (KingdomType.ORC.equals(type)) {
            return new OrcKingdomFactory();
        }
        throw new IllegalArgumentException("枚举类型不支持");
    }
}
