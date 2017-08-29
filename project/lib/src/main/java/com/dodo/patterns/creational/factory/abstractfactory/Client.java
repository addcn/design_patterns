package com.dodo.patterns.creational.factory.abstractfactory;

/**
 * 抽象工厂
 * 提供一个创建一系列相关或相互依赖对象的接口，而无须指定它们具体的类。
 */
public class Client{

    public static void main(String[] args){

        // 工厂1
        ConcreteFactory1 concreteFactory1 = new ConcreteFactory1(); // 工厂1
        AbstractProductA productA1 = concreteFactory1.createProductA(ProductA1.class); // 委托工厂1，生产产品A1
        AbstractProductA productA2 = concreteFactory1.createProductA(ProductA2.class); // 委托工厂1，生产产品A2
        AbstractProductB productB1 = concreteFactory1.createProductB(ProductB1.class); // 委托工厂1，生产产品B1

    }
}
