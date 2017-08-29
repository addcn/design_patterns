package com.dodo.patterns.behavioral.memento;

/**
 * Originator（原发器）
 * 它是一个普通类，可以创建一个备忘录，并存储它的当前内部状态，也可以使用备忘录来恢复其内部状态，一般将需要保存内部状态的类设计为原发器。
 */

public class Originator {
    private String state = "";   // 内部状态

    public String getState() {
        return state;
    }
    public void setState(String state) {
        this.state = state;
    }

    // 创建一个备忘录
    public Memento createMemento() {
        return new Memento(this.getState());
    }

    // 恢复一个备忘录
    public void restoreMemento(Memento memento) {
        this.setState(memento.getState());
    }
}
