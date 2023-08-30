package com.pov.design.patterns.structural.composite;

// Leaf class
class Developer implements Employee {
    private String name;

    public Developer(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void showDetails() {
        System.out.println("Developer: " + name);
    }
}
