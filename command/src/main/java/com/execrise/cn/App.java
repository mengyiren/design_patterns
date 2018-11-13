package com.execrise.cn;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        Wizard wizard = new Wizard();
        Goblin goblin = new Goblin();

        System.out.println(goblin);

        wizard.castSpell(new ShrinkSpell(), goblin);
        System.out.println(goblin);

        wizard.castSpell(new InvisibilitySpell(), goblin);
        System.out.println(goblin);

        wizard.undoLastSpell();
        System.out.println(goblin);

        wizard.undoLastSpell();
        System.out.println(goblin);

        wizard.redoLastSpell();
        System.out.println(goblin);

        wizard.redoLastSpell();
        System.out.println(goblin);
    }
}
