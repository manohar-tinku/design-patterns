package com.pov.design.patterns.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

// Flyweight factory
class ShapeFactory {
    private Map<String, Shape> shapeMap = new HashMap<>();

    public Shape getCircle(String color) {
        Shape circle = shapeMap.get(color);

        if (circle == null) {
            circle = new Circle(color);
            shapeMap.put(color, circle);
        }

        return circle;
    }
}
