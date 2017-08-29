package com.dodo.patterns.behavioral.state;

/**
 * 上下文角色
 * 定义客户端需要的接口，并且负责具体状态的切换
 * 该角色有两个约束：
 * 1).把状态对象声明为静态常量，有几个状态对象就声明几个静态常量。
 * 2).环境角色具有状态抽象角色定义的所有行为，具体执行使用委托方式。
 */

public class Context {
    // 定义状态
    public final static State STATE1 = new ConcreteState1();
    public final static State STATE2 = new ConcreteState2();

    private State currentState;  // 当前状态

    public State getCurrentState() {
        return currentState;
    }

    public void setCurrentState(State currentState) {
        this.currentState = currentState;
        // 切换状态
        this.currentState.setContext(this);
    }

    public void handle1() {
        this.currentState.handle1();
    }
    public void handle2() {
        this.currentState.handle2();
    }
}
