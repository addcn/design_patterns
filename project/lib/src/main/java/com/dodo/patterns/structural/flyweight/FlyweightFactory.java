package com.dodo.patterns.structural.flyweight;


import java.util.HashMap;

/**
 * 享元工厂
 * 职责非常简单，就是构造一个池容器，同时提供从池中获得对象的方法
 */

public class FlyweightFactory {
    // 定义一个池容器
    private static HashMap<String ,Flyweight> pool = new HashMap<String, Flyweight>();

    // 享元工厂
    public static Flyweight getFlyweight(String extrinsic){
        Flyweight flyweight;  // 需要返回的对象

        if (pool.containsKey(extrinsic)) {
            flyweight = pool.get(extrinsic);
        } else {
            flyweight = new ConcreteFlyweight(extrinsic);
            pool.put(extrinsic, flyweight);
        }

        return flyweight;
    }
}
