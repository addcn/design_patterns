package com.dodo.patterns.creational.factory.factorymethod;


/**
 * 工厂方法
 * 定义一个用于创建对象的接口，让子类决定将哪一个类实例化。工厂方法模式让一个类的实例化延迟到其子类。
 */

public class Client{

    public static void main(String[] args){
        
        ConcreteCreator concreteCreator = new ConcreteCreator();
        Product concreteProduct = concreteCreator.createProduct(ConcreteProduct.class); // 客户需要先指定委托对象。委托给ConcreteCreator，输出"各种产品"

    }
}
