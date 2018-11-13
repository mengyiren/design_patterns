package com.execrise.cn;

import java.util.Objects;

/**
 * @author mengyiren
 */
public class ShrinkSpell extends Command {
    private Target target;

    private Size oldSize;

    @Override
    public void undo() {
        if (Objects.nonNull(target) && Objects.nonNull(oldSize)) {
            Size temp = target.getSize();
            target.setSize(oldSize);
            oldSize = temp;
        }
    }

    @Override
    public void redo() {
        undo();
    }

    @Override
    public void execute(Target target) {
        oldSize = target.getSize();
        target.setSize(Size.SMALL);
        this.target = target;
    }

    @Override
    public String toString() {
        return "ShrinkSpell";
    }
}
