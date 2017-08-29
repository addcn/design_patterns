package com.dodo.patterns.structural.adapter;

/**
 * 适配器角色
 * 目标角色的实现类
 *
 * 对象适配器，它不是使用多继承或继承再实现的方式，而是使用直接关联，或者称为委托的方式
 */
public class Adapter implements Target{
    /**
     * 持有需要被适配的接口对象
     */
    private Adaptee adaptee;

    /**
     * 构造方法，传入需要被适配的对象
     *
     * @param adaptee 需要被适配的对象
     */
    public Adapter(Adaptee adaptee){
        this.adaptee = adaptee;
    }
    @Override
    public void request() {
        // 使用委托的方式完成特殊功能
        this.adaptee.specificRequest();
    }

}
