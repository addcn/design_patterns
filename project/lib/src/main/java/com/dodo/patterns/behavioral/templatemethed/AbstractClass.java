package com.dodo.patterns.behavioral.templatemethed;

/**
 * 抽象模板类
 * 在抽象类中定义了一系列基本操作(PrimitiveOperations)，这些基本操作可以是具体的，也可以是抽象的，每一个基本操作对应算法的一个步骤，在其子类中可以重定义或实现这些步骤。同时，在抽象类中实现了一个模板方法(Template Method)，用于定义一个算法的框架，模板方法不仅可以调用在抽象类中实现的基本方法，也可以调用在抽象类的子类中实现的基本方法，还可以调用其他对象中的方法。
 */

public abstract class AbstractClass {
    // 基本方法, 尽量设计为protected类型，符合迪米特法则
    protected abstract void doSomething();

    // 模板方法, 为了防止恶意的操作，一般模板方法都加上final，不允许被覆写
    public final void templateMethod() {
        this.doAnything();

        this.doSomething();
    }

    // 共有的逻辑
    private void doAnything() {
        System.out.println("AbstractClass doAnything");
    }
}
