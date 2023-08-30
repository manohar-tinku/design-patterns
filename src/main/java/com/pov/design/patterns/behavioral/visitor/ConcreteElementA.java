package com.pov.design.patterns.behavioral.visitor;

// Concrete elements
class ConcreteElementA implements Element {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
