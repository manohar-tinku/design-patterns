package com.pov.design.patterns.builder;

public class BuilderPatternExample {
    public static void main(String[] args) {
        Waiter waiter = new Waiter();

        PizzaBuilder hawaiianPizzaBuilder = new HawaiianPizzaBuilder();
        waiter.setPizzaBuilder(hawaiianPizzaBuilder);

        waiter.constructPizza();
        Pizza pizza = waiter.getPizza();
        System.out.println(pizza.getDescription());
    }
}