package com.dodo.patterns.structural.adapter;

/**
 * 源角色
 * 已存在的、具有特殊功能、但不符合我们既有的标准接口的类
 */
public class Adaptee {
    /**
     * 原本存在的方法
     */
    public void specificRequest() {
        //特殊接口
    }
}