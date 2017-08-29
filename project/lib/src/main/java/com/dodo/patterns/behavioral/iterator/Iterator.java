package com.dodo.patterns.behavioral.iterator;

//迭代器角色（Iterator）
interface Iterator {
    Object first();
    Object next();
    boolean hasNext();
    Object currentItem();
}