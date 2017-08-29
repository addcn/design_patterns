package com.dodo.patterns.behavioral.command;

/**
 * ConcreteCommand（具体命令类）
 * 具体命令类是抽象命令类的子类，实现了在抽象命令类中声明的方法，它对应具体的接收者对象，将接收者对象的动作绑定其中。在实现execute()方法时，将调用接收者对象的相关操作(Action)。
 */

public class ConcreteCommand extends Command {
    // 对哪个Receiver类进行命令处理
    private Receiver receiver;

    // 构造函数传递接收者
    public ConcreteCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    // 必须实现一个命令
    @Override
    public void execute() {
        // 业务处理
        this.receiver.doSomething();
    }
}
