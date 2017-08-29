package com.dodo.patterns.creational.factory.abstractfactory;


public abstract class AbstractFactory {
    public abstract AbstractProductA createProductA(Class<? extends AbstractProductA> product);
    public abstract AbstractProductB createProductB(Class<? extends AbstractProductB> product);
}