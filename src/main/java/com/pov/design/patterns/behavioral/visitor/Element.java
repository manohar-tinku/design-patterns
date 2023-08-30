package com.pov.design.patterns.behavioral.visitor;

// Element interface
interface Element {
    void accept(Visitor visitor);
}
