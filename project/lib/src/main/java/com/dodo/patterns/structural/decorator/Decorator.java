package com.dodo.patterns.structural.decorator;

/**
 * Decorator（抽象装饰类）
 * 它也是抽象构件类的子类，用于给具体构件增加职责，但是具体职责在其子类中实现。它维护一个指向抽象构件对象的引用，通过该引用可以调用装饰之前构件对象的方法，并通过其子类扩展该方法，以达到装饰的目的。
 */
public abstract class Decorator extends Component {
    private Component component = null;

    // 通过构造函数传递被修饰者
    public Decorator(Component component) {
        this.component = component;
    }

    // 委托给被修改者执行
    @Override
    public void operate() {
        this.component.operate();
    }
}
