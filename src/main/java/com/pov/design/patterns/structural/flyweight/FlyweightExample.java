package com.pov.design.patterns.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class FlyweightExample {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        Circle redCircle = (Circle) shapeFactory.getCircle("Red");
        redCircle.setX(10);
        redCircle.setY(20);
        redCircle.setRadius(30);
        redCircle.draw();

        Circle blueCircle = (Circle) shapeFactory.getCircle("Blue");
        blueCircle.setX(50);
        blueCircle.setY(60);
        blueCircle.setRadius(70);
        blueCircle.draw();

        Circle redCircleAgain = (Circle) shapeFactory.getCircle("Red");
        redCircleAgain.setX(100);
        redCircleAgain.setY(200);
        redCircleAgain.setRadius(300);
        redCircleAgain.draw();
    }
}
