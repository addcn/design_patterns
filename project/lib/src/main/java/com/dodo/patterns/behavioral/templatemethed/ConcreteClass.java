package com.dodo.patterns.behavioral.templatemethed;

/**
 * 具体模板类：
 * 它是抽象类的子类，用于实现在父类中声明的抽象基本操作以完成子类特定算法的步骤，也可以覆盖在父类中已经实现的具体基本操作。
 */

public class ConcreteClass extends AbstractClass{
    // 实现基本方法
    @Override
    protected void doSomething() {
        // 业务逻辑处理
        System.out.println("ConcreteClass doSomething");
    }
}
