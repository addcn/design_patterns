package com.dodo.patterns.behavioral.visitor;

/**
 * 抽象元素
 */
public abstract class Element {
    public abstract void doSomething();

    public abstract void accept(IVisitor iVisitor);
}