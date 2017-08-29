package com.dodo.patterns.structural.decorator;

/**
 * ConcreteDecorator（具体装饰类）
 * 它是抽象装饰类的子类，负责向构件添加新的职责。每一个具体装饰类都定义了一些新的行为，它可以调用在抽象装饰类中定义的方法，并可以增加新的方法用以扩充对象的行为。
 */

public class ConcreteDecorator extends Decorator {
    public ConcreteDecorator(Component component) {
        super(component);
    }

    // 定义自己的装饰方法
    public void method1() {
        System.out.println("method1装饰");
    }

    // 重写父类的方法，这里的顺序是固定的，可以通过重载实现多种顺序
    public void operate() {
        this.method1();
        super.operate();
    }
}
