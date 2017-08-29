package com.dodo.patterns.behavioral.chainofresponsibility;


/**
 * 职责链模式
 * 职责链可以是一条直线、一个环或者一个树形结构，最常见的职责链是直线型，即沿着一条单向的链来传递请求。链上的每一个对象都是请求处理者，职责链模式可以将请求的处理者组织成一条链，并让请求沿着链传递，由链上的处理者对请求进行相应的处理，客户端无须关心请求的处理细节以及请求的传递，只需将请求发送到链上即可，实现请求发送者和请求处理者解耦。
 *
 */

public class Client {

    public static void main(String[] args) {
        // 声明所有的处理节点
        Handler handler1 = new ConcreteHandler1();
        Handler handler2 = new ConcreteHandler2();

        // 设置链中的阶段顺序
        handler1.setNextHandler(handler2);

        // 提交请求，返回结果
        Response response = handler1.handleMessage(new Request());
    }
}