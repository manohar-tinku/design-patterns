package com.pov.design.patterns.prototype;

class Circle implements CloneableShape {
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public CloneableShape clone() {
        return new Circle(this.radius);
    }

    public String getInfo() {
        return "Circle with radius " + radius;
    }
}