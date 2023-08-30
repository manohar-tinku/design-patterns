package com.pov.design.patterns.creational.builder;

class HawaiianPizzaBuilder implements PizzaBuilder {
    private Pizza pizza = new Pizza();

    public void buildDough() {
        pizza.setDough("thin");
    }

    public void buildSauce() {
        pizza.setSauce("tomato");
    }

    public void buildTopping() {
        pizza.setTopping("ham and pineapple");
    }

    public Pizza getPizza() {
        return pizza;
    }
}