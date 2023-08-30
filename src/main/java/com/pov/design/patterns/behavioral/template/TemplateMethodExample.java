package com.pov.design.patterns.behavioral.template;

public class TemplateMethodExample {
    public static void main(String[] args) {
        Game cricket = new Cricket();
        cricket.play();

        System.out.println();

        Game football = new Football();
        football.play();
    }
}
