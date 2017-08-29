package com.dodo.patterns.behavioral.Interpreter;


/**
 * 解释器模式
 * 解释器模式：是一种按照规定语法进行解析的方案，一般主要应用在OOP开发中的编译器的开发中，在现在项目中使用较少，适用面比较窄。
 * 其定义：给定一门语言，定义它的方法的一种表示，并定义一个解释器，该解释器使用该表示来解释语言中的句子。
 *
 */

public class Client {

    public static void main(String[] args) {
        //(a*b)/(a-b+15000)
        Context context = new Context();
        Variable a = new Variable();
        Variable b = new Variable();
        Constant c = new Constant(15000);

        context.addValue(a, 14);
        context.addValue(b, 10000);

        Expression expression = new Div(new Mul(a, b), new Add(new Sub(a, b), c));
        System.out.println("Result = "+expression.interpret(context));
    }
}
