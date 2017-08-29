package com.dodo.patterns.structural.bridge;

/**
 * RefinedAbstraction（扩充抽象类）
 * 扩充由Abstraction定义的接口，通常情况下它不再是抽象类而是具体类，它实现了在Abstraction中声明的抽象业务方法，在RefinedAbstraction中可以调用在Implementor中定义的业务方法。
 */
public class RefinedAbstraction extends Abstraction {


	public RefinedAbstraction(Implementor implementor) {
		super(implementor);
	}

	@Override
	public void Operation() {

		System.out.print("RefinedAbstraction" + "\n");

		mImplementor.OperationImp(); //可以调用在Implementor中定义的业务方法
	}


}