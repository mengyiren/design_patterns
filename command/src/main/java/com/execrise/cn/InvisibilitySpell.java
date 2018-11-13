package com.execrise.cn;

import java.util.Objects;

/**
 * @author mengyiren
 */
public class InvisibilitySpell extends Command {
    private Target target;

    @Override
    public void undo() {
        if (Objects.nonNull(target)) {
            target.setVisibility(Visibility.VISIBLE);
        }
    }

    @Override
    public void redo() {
        if (Objects.nonNull(target)) {
            target.setVisibility(Visibility.INVISIBLE);
        }
    }

    @Override
    public void execute(Target target) {
        target.setVisibility(Visibility.INVISIBLE);
        this.target = target;
    }

    @Override
    public String toString() {
        return "InvisibilitySpell";
    }
}
