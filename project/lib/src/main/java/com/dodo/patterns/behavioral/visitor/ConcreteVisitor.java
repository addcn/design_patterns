package com.dodo.patterns.behavioral.visitor;


/**
 * 具体访问者
 */
public class ConcreteVisitor implements IVisitor {
    // 访问e1元素
    @Override
    public void visit(ConcreteElement1 concreteElement1) {
        concreteElement1.doSomething();
    }

    @Override
    public void visit(ConcreteElement2 concreteElement2) {
        concreteElement2.doSomething();
    }
}