package com.dodo.patterns.behavioral.visitor;


/**
 * 具体元素
 */
public class ConcreteElement1 extends Element {
    // 完善业务逻辑
    @Override
    public void doSomething() {
        // 业务处理
    }

    // 允许哪个访问者访问
    @Override
    public void accept(IVisitor iVisitor) {
        iVisitor.visit(this);  // this是当前对象ConcreteElement1
    }
}