package com.dodo.patterns.behavioral.visitor;

/**
 * 访问者模式
 * 访问者模式就是一种分离对象数据结构与行为的方法，通过这种分离，可达到为一个被访问者动态添加新的操作而无需做其它的修改的效果。
 */

public class Client {

    public static void main(String[] args) {
        for (int i=0; i<10; i++) {
            // 获得元素对象
            Element element1 = ObjectStruture.createElement();
            // 接受访问者访问
            element1.accept(new ConcreteVisitor());
        }
    }
}
