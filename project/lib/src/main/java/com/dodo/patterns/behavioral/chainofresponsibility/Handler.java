package com.dodo.patterns.behavioral.chainofresponsibility;

/**
 * Handler（抽象处理者）
 * 定义一个处理请求的接口，一般设计为抽象类，在其中定义了抽象请求处理方法。还定义了一个抽象处理者类型的对象作为其对下家的引用。通过该引用，处理者可以连成一条链。
 */

public abstract class Handler {
    private Handler nextHandler;

    // 这里一个模板方法，用final方法修饰
    public final Response handleMessage(Request request) {
        Response response = null;
        if (this.getHandlerLevel().equals(request.getRequestLevel())) {
            response = this.echo(request);

        } else {  // 不属于自己的处理级别
            // 判断是否有下一个处理者
            if (this.nextHandler != null) {
                response = this.nextHandler.handleMessage(request);
            } else {
                // 没有适当的处理者，业务自行处理
            }
        }

        return response;
    }


    // 2.设置下一个处理者是谁
    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    // 3.每一个处理都有一个处理级别
    protected abstract Level getHandlerLevel();
    // 每个处理者都必须实现处理任务
    protected abstract Response echo(Request request);
}
