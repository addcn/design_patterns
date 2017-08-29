package com.dodo.patterns.behavioral.strategy;


public class ConcreteStrategyB implements Strategy {
    @Override
    public void say() {
        System.out.println("b");
    }
}