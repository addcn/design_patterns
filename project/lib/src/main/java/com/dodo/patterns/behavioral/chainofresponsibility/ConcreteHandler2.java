package com.dodo.patterns.behavioral.chainofresponsibility;

/**
 * 具体处理者
 */

// 具体处理者可以有多个，都要实现Handler
public class ConcreteHandler2  extends Handler{
    @Override
    protected Level getHandlerLevel() {
        return null;
    }

    @Override
    protected Response echo(Request request) {
        return null;
    }
}
