package com.pov.design.patterns.prototype;

public class PrototypePatternExample {
    public static void main(String[] args) {
        Circle originalCircle = new Circle(5);
        Circle clonedCircle = (Circle) originalCircle.clone();

        Square originalSquare = new Square(10);
        Square clonedSquare = (Square) originalSquare.clone();

        System.out.println(originalCircle.getInfo());
        System.out.println(clonedCircle.getInfo());

        System.out.println(originalSquare.getInfo());
        System.out.println(clonedSquare.getInfo());
    }
}