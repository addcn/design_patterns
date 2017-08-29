package com.dodo.patterns.behavioral.Interpreter;

//抽象表达式(Expression)
interface Expression {
    int interpret(Context context);
}
