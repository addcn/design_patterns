package com.dodo.patterns.behavioral.Interpreter;

class Variable implements Expression {
    @Override
    public int interpret(Context context) {
        return context.LookupValue(this);
    }
}