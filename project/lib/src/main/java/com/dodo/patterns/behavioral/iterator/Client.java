package com.dodo.patterns.behavioral.iterator;


import java.util.ArrayList;
import java.util.List;

/**
 * 迭代器模式
 * 迭代器模式(Iterator Pattern): 提供一种方法访问一个容器对象中各个元素，而又不需暴露该对象的内部细节。
 * 目前已经是一个没落的模式，基本上没有会单独写一个，除非是产品性质的开发。如果是Java开发，尽量不要自己写迭代，java提供的Iterator一般就能满足我们的要求了。
 *
 */

public class Client {

    public static void main(String[] args) {
        List<Object> list = new ArrayList<Object>();
        list.add("Android");
        list.add("PHP");
        list.add("C Language");

        Container container = new ConcreteContainer(list);
        container.add("HardWare");

        Iterator iterator = container.createIterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
