package com.dodo.patterns.behavioral.state;


/**
 * 状态模式
 */

public class Client {

    public static void main(String[] args) {
        Context context = new Context(); // 定义上下文角色
        context.setCurrentState(new ConcreteState1());  // 初始化状态

        // 行为执行
        context.handle1();
        context.handle2();
    }
}
