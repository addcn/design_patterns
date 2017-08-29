package com.dodo.patterns.creational.factory.abstractfactory;


public class ConcreteFactory2 extends AbstractFactory {


    @Override
    public AbstractProductA createProductA(Class<? extends AbstractProductA> product) {
        return null;
    }

    @Override
    public AbstractProductB createProductB(Class<? extends AbstractProductB> product) {
        return null;
    }
}