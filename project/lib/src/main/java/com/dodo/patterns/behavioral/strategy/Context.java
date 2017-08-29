package com.dodo.patterns.behavioral.strategy;


public class Context {
    Strategy strategy;

    public Strategy getStrategy() {
        return strategy;
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public void say() {
        if (strategy != null) {
            strategy.say();
        }
    }
}