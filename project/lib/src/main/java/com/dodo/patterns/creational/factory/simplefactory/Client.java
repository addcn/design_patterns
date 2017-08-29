package com.dodo.patterns.creational.factory.simplefactory;


/**
 * 简单工厂
 * 定义一个工厂类，它可以根据参数的不同返回不同类的实例，被创建的实例通常都具有共同的父类。
 */
public class Client{

    public static void main(String[] args){
        
        Factory factory = new Factory();
        Product product = factory.createProduct();
        
        System.out.println( product.getPrice() );
    }
}
