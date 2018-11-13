package com.execrise.cn;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @author mengyiren
 */
public class Wizard {
    private Deque<Command> undoStack = new LinkedList<>();
    private Deque<Command> redoStack = new LinkedList<>();

    public void castSpell(Command command, Target target) {
        System.out.println(this + "对" + target + "执行了" + command);
        command.execute(target);
        undoStack.offerLast(command);
    }

    public void undoLastSpell() {
        if (!undoStack.isEmpty()) {
            Command previousSpell = undoStack.pollLast();
            redoStack.offerLast(previousSpell);
            System.out.println(this + "撤销了" + previousSpell);
            previousSpell.undo();
        }
    }

    public void redoLastSpell() {
        if (!redoStack.isEmpty()) {
            Command previousSpell = redoStack.pollLast();
            undoStack.offerLast(previousSpell);
            System.out.println(this + "重新执行了" + previousSpell);
            previousSpell.redo();
        }
    }

    @Override
    public String toString() {
        return "Wizard";
    }
}
