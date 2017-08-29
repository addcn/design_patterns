package com.dodo.patterns.behavioral.iterator;

//容器角色（Container）
interface Container {
    void add(Object obj);
    void remove(Object obj);
    Iterator createIterator();
}