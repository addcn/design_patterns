package com.dodo.patterns.behavioral.mediator;

/**
 * Colleague抽象同事类
 * 每一个同事角色都知道中介者角色，而且与其他的同事角色通信的时候，一定要通过中介者角色协作。每个同事类的行为分为两种：1.同事本身的行为，如改变对象本身的状态，处理自己的行为等，这种行为叫做自发行为(Self-Method)，与其他的同事类或中介者没有任何的依赖；2.必须依赖中介者才能完成的行为，叫做依赖方法(Dep-Method)
 */

public abstract class Colleague {
    protected Mediator mediator;

    public Colleague(Mediator mediator) {
        this.mediator = mediator;
    }
}
