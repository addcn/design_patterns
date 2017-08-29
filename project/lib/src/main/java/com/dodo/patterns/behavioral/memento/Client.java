package com.dodo.patterns.behavioral.memento;


/**
 * 备忘录模式
 * 在不破坏封装的前提下，捕获一个对象的内部状态，并在该对象之外保存这个状态，这样可以在以后将对象恢复到原先保存的状态。它是一种对象行为型模式，其别名为Token。
 *
 */

public class Client {

    public static void main(String[] args) {
        Originator originator = new Originator(); // 定义出发起人
        Caretaker caretaker = new Caretaker();  // 定义出备忘录管理员

        // 创建一个备忘录
        caretaker.setMemento(originator.createMemento());
        // 恢复一个备忘录
        originator.restoreMemento(caretaker.getMemento());
    }
}