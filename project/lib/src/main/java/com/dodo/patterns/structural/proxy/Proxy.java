package com.dodo.patterns.structural.proxy;


/**
 * 代理类
 * 也叫委托类、代理类。它负责对真实角色的应用，把所有抽象主题类定义的方法限制委托给真实主题角色实现，并且在真实主题角色处理完毕前后做预处理和善后处理工作。
 */

public class Proxy implements Subject {
    // 要代理哪个实现类
    private Subject subject;

    // 默认被代理者
    public Proxy(){
        super();
        this.subject = new Proxy();    // new代理对象
    }

    // 你要代理谁就产生该代理的实例，然后把代理者传递进来
    public Proxy(Subject subject) {
        this.subject = subject;
    }

    // 实现接口中定义的方法
    @Override
    public void request() {
        this.before();
        subject.request();
        this.after();
    }

    private void after() {
        System.out.println("after proxy!");
    }

    private void before() {
        System.out.println("before proxy!");
    }
}
