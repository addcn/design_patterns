package com.dodo.patterns.behavioral.strategy;

/**
 * 策略模式
 */

public class Client {

    public static void main(String[] args) {

        // 策略A
        Context context = new Context();
        context.setStrategy(new ConcreteStrategyA());
        context.say();

        // 策略B
        context.setStrategy(new ConcreteStrategyB());
        context.say();
    }
}
