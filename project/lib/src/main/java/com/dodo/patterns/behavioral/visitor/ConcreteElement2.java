package com.dodo.patterns.behavioral.visitor;

/**
 * 具体元素
 */
public class ConcreteElement2 extends Element {
    @Override
    public void doSomething() {
    }

    @Override
    public void accept(IVisitor iVisitor) {
        iVisitor.visit(this);
    }
}