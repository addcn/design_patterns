package com.dodo.patterns.creational.factory.factorymethod;


public class ConcreteCreator extends Creator {

    @Override
    public <T extends Product> T createProduct(Class<T> c) {
        return null;
    }
}