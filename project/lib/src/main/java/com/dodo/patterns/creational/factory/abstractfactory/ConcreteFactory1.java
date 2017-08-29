package com.dodo.patterns.creational.factory.abstractfactory;

/**
 * 实现不同的产品家族
 */
public class ConcreteFactory1 extends AbstractFactory {

    /**
     * 产品家族A
     *
     * @param product
     * @return
     */
    @Override
    public AbstractProductA createProductA(Class<? extends AbstractProductA> product) {
        return null;
    }

    /**
     * 产品家族B
     *
     * @param product
     * @return
     */
    @Override
    public AbstractProductB createProductB(Class<? extends AbstractProductB> product) {
        return null;
    }
}