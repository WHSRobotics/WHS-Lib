package com.whsrobotics.lib.StateForge;

@FunctionalInterface
public interface SubstateTester<R extends  Enum<R>> {
    boolean test(StateMachine<R> machine);
}
