package com.dodo.patterns.behavioral.visitor;

/**
 * 抽象访问者
 */
public interface IVisitor {
    // 可以访问哪些对象
    void visit(ConcreteElement1 concreteElement1);

    void visit(ConcreteElement2 concreteElement2);
}