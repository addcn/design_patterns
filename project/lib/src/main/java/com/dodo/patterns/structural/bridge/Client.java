package com.dodo.patterns.structural.bridge;

/**
 * 桥接模式
 * 桥接模式(Bridge Pattern)：将抽象部分与它的实现部分分离，使它们都可以独立地变化。
 */

public class Client {

    public static void main(String[] args) {

        // 页面风格（可增加）
        ConcreteImplementorA concreteImplementorA = new ConcreteImplementorA();
        ConcreteImplementorB concreteImplementorB = new ConcreteImplementorB();
        // 具体页面
        RefinedAbstraction refinedAbstraction = new RefinedAbstraction(concreteImplementorA);// A风格
        refinedAbstraction.Operation();

        refinedAbstraction = new RefinedAbstraction(concreteImplementorB);// B风格
        refinedAbstraction.Operation();
    }
}
