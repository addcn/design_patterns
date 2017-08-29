package com.dodo.patterns.behavioral.state;

/**
 * 抽象状态角色
 * 接口或抽象类，负责对象状态定义，并且封装上下文角色以实现状态切换。
 */
public abstract class State {
    protected Context context; // 定义一个上下文角色，提供子类角色

    public void setContext(Context context) {
        this.context = context;
    }

    // 几个行为
    public abstract void handle1();
    public abstract void handle2();
}