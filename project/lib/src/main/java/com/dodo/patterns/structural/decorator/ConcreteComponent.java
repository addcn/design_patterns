package com.dodo.patterns.structural.decorator;

/**
 * ConcreteComponent（具体构件）
 * 它是抽象构件类的子类，用于定义具体的构件对象，实现了在抽象构件中声明的方法，装饰器可以给它增加额外的职责（方法）。
 */
public class ConcreteComponent extends Component {
    // 具体实现
    @Override
    public void operate() {
    }
}
