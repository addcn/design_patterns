package com.dodo.patterns.structural.flyweight;


/**
 * 具体享元角色
 * 具体的一个产品类，实现抽象角色定义的业务。该角色中需要注意的是内部状态处理应该与环境无关，不应该出现一个操作改变了内部状态，同时修改了外部状态，这是绝对不允许的。
 */

public class ConcreteFlyweight extends Flyweight {
    // 接受外部状态
    public ConcreteFlyweight(String extrinsic) {
        super(extrinsic);
    }

    // 根据外部状态进行逻辑处理
    @Override
    public void operate() {
    }
}
