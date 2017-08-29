package com.dodo.patterns.creational.singleton;

public class ClassA {
    private ClassA() {

    }

    public static ClassA getInstance() {
        return new ClassA();
    }
}