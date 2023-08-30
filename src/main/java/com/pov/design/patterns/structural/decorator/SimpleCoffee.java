package com.pov.design.patterns.structural.decorator;

// Concrete component
class SimpleCoffee implements Coffee {
    @Override
    public double getCost() {
        return 2.0;
    }

    @Override
    public String getDescription() {
        return "Simple Coffee";
    }
}
