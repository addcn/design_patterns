package com.dodo.patterns.behavioral.command;

/**
 * Receiver（接收者）
 * 接收者执行与请求相关的操作，它具体实现对请求的业务处理。
 * 之所以是抽象类，是因为接收者可以有多个，有多个就需要定义一个所有特性的抽象集合。
 */

public abstract class Receiver {
    // 抽象接收者，定义每个接收者都必须完成的业务
    public abstract void doSomething();
}
