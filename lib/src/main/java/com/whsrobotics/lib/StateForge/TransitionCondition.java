package com.whsrobotics.lib.StateForge;
@FunctionalInterface
public interface TransitionCondition {
    boolean shouldTransition();
}
