package com.pov.design.patterns.creational.prototype;

class Square implements CloneableShape {
    private int sideLength;

    public Square(int sideLength) {
        this.sideLength = sideLength;
    }

    public CloneableShape clone() {
        return new Square(this.sideLength);
    }

    public String getInfo() {
        return "Square with side length " + sideLength;
    }
}