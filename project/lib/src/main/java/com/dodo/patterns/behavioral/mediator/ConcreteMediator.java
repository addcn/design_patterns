package com.dodo.patterns.behavioral.mediator;

/**
 * 具体中介者
 * 一般只有一个，即通用中介者。具体中介者通过协调各同事角色实现协作行为，因此它必须依赖于各个同事角色。
 */

public class ConcreteMediator extends Mediator {
    @Override
    public void doSomething() {
        // 调用同事类的方法，只要是public方法都可以调用
        super.concreteColleague.selfMethod1();
    }
}
