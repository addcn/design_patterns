package com.dodo.patterns.behavioral.observer;

/**
 * 观察者模式
 *
 * 场景联想图
 * 求职者订阅了某职位发布网站, 当有何时的职位出现时, 他们会收到通知.
 */

public class Client {

    public static void main(String[] args) {
        //创建主题对象
        ConcreteSubject subject = new ConcreteSubject();
        //创建观察者对象
        Observer observer = new ConcreteObserver();
        //将观察者对象登记到主题对象上
        subject.attach(observer);
        //改变主题对象的状态
        subject.change("new state");
    }
}
