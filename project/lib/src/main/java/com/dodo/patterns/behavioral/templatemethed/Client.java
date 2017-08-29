package com.dodo.patterns.behavioral.templatemethed;


/**
 * 模板方法
 */

public class Client {

    public static void main(String[] args) {
        AbstractClass abstractClass = new ConcreteClass();
        abstractClass.templateMethod();
    }
}
