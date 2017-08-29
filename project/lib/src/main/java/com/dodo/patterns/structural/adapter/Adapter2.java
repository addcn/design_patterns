package com.dodo.patterns.structural.adapter;


/**
 * 适配器类
 * 继承了被适配类，同时实现标准接口
 *
 * 类适配器，因为 Adapter 类既继承了 Adaptee （被适配类），也实现了 Target 接口（因为 Java 不支持多继承，所以这样来实现）
 */
public class Adapter2 extends Adaptee implements Target{

    public void request() {
        super.specificRequest();
    }
}
