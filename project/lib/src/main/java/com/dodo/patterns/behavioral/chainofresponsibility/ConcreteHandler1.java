package com.dodo.patterns.behavioral.chainofresponsibility;

/**
 * ConcreteHandler（具体处理者）
 * 抽象处理者的子类，可以处理用户请求，在具体处理者类中实现了抽象处理者中定义的抽象请求处理方法，在处理请求之前需要进行判断，看是否有相应的处理权限，如果可以处理请求就处理它，否则将请求转发给后继者；在具体处理者中可以访问链中下一个对象，以便请求的转发。
 */

// 具体处理者可以有多个，都要实现Handler
public class ConcreteHandler1 extends Handler{
    // 定义自己的处理逻辑
    @Override
    protected Level getHandlerLevel() {
        // 完成处理逻辑
        return null;
    }

    // 定义自己的处理级别
    @Override
    protected Response echo(Request request) {
        // 设置自己的处理级别
        return null;
    }
}