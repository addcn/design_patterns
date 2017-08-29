package com.dodo.patterns.structural.proxy;


/**
 * 真实主题类
 * 也叫被委托角色、被代理角色。业务逻辑的具体执行者。
 */
public class RealSubject implements Subject{
    @Override
    public void request() {
        // 业务逻辑处理
    }
}
