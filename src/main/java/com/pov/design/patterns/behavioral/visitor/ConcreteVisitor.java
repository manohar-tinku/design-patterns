package com.pov.design.patterns.behavioral.visitor;

// Concrete visitor
class ConcreteVisitor implements Visitor {
    @Override
    public void visit(ConcreteElementA element) {
        System.out.println("Visitor is processing ConcreteElementA");
    }

    @Override
    public void visit(ConcreteElementB element) {
        System.out.println("Visitor is processing ConcreteElementB");
    }
}
