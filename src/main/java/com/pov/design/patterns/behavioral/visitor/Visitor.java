package com.pov.design.patterns.behavioral.visitor;

// Visitor interface
interface Visitor {
    void visit(ConcreteElementA element);
    void visit(ConcreteElementB element);
}
