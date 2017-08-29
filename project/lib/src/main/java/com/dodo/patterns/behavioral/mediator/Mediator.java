package com.dodo.patterns.behavioral.mediator;

/**
 * Mediator抽象中介者角色
 * 定义统一的接口，用于各同事角色之间的通信。
 * 在Mediator抽象类中我们只定义了同事类的注入，为什么使用同事实现类注入而不使用抽象类注入呢？那是因为同事类虽然有抽象，但是不有每个同事类必须要完成的业务方法，当然如果每个同事类都有相同的方法，如execute、handler等，那当然注入抽象类，做到依赖倒置。
 */

public abstract class Mediator {
    protected ConcreteColleague concreteColleague;

    public ConcreteColleague getConcreteColleague() {
        return concreteColleague;
    }

    public void setConcreteColleague(ConcreteColleague concreteColleague) {
        this.concreteColleague = concreteColleague;
    }

    // 中介者模式的业务逻辑
    public abstract void doSomething();
}
