package com.dodo.patterns.structural.facade;


/**
 * 外观角色
 * 客户端可以调用它的方法，在外观角色中可以知道相关子系统的功能和责任；在正常情况下，它将所有从客户端发来的请求委派到相应的子系统去，传递给相应的子系统对象处理。
 */
public class ComputerFacade extends Computer {


	protected Computer computer;

	public ComputerFacade(Computer computer)
	{
		this.computer = computer;
	}

	public void turnOn()
	{
		computer.getElectricShock();
		computer.makeSound();
		computer.showLoadingScreen();
		computer.bam();
	}

	public void turnOff()
	{
		computer.closeEverything();
		computer.pullCurrent();
		computer.sooth();
	}


}