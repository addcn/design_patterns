package com.dodo.patterns.structural.adapter;

/**
 * 适配器模式 Adapter
 */

public class Client {

    public static void main(String[] args) {

        // 1、使用普通功能类
        Target target = new ConcreteTarget();
        target.request();

        // 2.1、使用特殊功能类，即适配类（需要先创建一个被适配类的对象作为参数）
        target = new Adapter(new Adaptee());
        target.request();

        // 2.2、使用增加了适配器角色的业务逻辑
        Target target2 = new Adapter2();
        target2.request();
    }
}
