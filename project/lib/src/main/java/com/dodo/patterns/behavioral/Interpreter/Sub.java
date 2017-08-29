package com.dodo.patterns.behavioral.Interpreter;

class Sub implements Expression {
    private Expression left, right;

    public Sub(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public int interpret(Context context) {
        return left.interpret(context) - right.interpret(context);
    }
}