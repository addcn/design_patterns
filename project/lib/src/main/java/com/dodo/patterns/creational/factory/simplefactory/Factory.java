package com.dodo.patterns.creational.factory.simplefactory;


/**
 * 简单工厂模式
 *
 * “简单工厂模式” 又叫做 “静态工厂方法”，它是由一个工厂对象决定创建出哪一种产品类的实例。
 *
 * @author <a href="mailto:huibo@addcn.com">dodo</a> 2017/02/28
 * @version ${Id}
 */

public class Factory {  
    public Product createProduct() {
        return new Product();
    }
}