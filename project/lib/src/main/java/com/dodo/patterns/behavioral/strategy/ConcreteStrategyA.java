package com.dodo.patterns.behavioral.strategy;

public class ConcreteStrategyA implements Strategy {
    @Override
    public void say() {
        System.out.println("a");
    }
}