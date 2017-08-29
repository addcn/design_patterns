package com.dodo.patterns.behavioral.state;

/**
 * 具体状态角色
 * 有两个职责：1.处理本状态必须完成的任务，2决定是否可以过渡到其他状态。通俗地说，就是本状态下要做的事情，以及本状态如何过渡到其他状态。
 */

public class ConcreteState1 extends State {
    @Override
    public void handle1() {
        // 本状态下必须处理的逻辑
    }

    @Override
    public void handle2() {
        // 设置当前状态为state2
        super.context.setCurrentState(Context.STATE2);

        // 过渡到state1状态，由context实现
        super.context.handle2();
    }
}
