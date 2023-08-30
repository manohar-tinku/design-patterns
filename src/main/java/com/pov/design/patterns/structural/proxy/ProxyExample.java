package com.pov.design.patterns.structural.proxy;

public class ProxyExample {
    public static void main(String[] args) {
        Image image1 = new ProxyImage("image1.jpg");
        Image image2 = new ProxyImage("image2.jpg");

        // Image 1 will be loaded and displayed
        image1.display();
        // Image 1 will only be displayed (already loaded)
        image1.display();

        // Image 2 will be loaded and displayed
        image2.display();
    }
}
