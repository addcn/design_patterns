package com.dodo.patterns.behavioral.Interpreter;

//终结符表达式(Terminal Expression)
class Constant implements Expression {
    private int i;

    public Constant(int i) {
        this.i = i;
    }

    @Override
    public int interpret(Context context) {
        return i;
    }
}