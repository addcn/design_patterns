package com.dodo.patterns.structural.bridge;

/**
 * Abstraction（抽象类）
 * 定义抽象类的接口，它一般是抽象类而不是接口，其中定义了一个Implementor（实现类接口）类型的对象并可以维护该对象，它与Implementor之间具有关联关系，它既可以包含抽象业务方法，也可以包含具体业务方法。
 */
public abstract class Abstraction {

	public Implementor mImplementor;

	public Abstraction(Implementor implementor){
        this.mImplementor = implementor;
	}

	public abstract void Operation();//imp->Operation();

}