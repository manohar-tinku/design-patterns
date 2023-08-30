package com.pov.design.patterns.behavioral.chainofresponsibility;

public class FastFoodChainDemo {
    public static void main(String[] args) {
        Cashier cashier = new Cashier();
        OrderTaker orderTaker = new OrderTaker();
        KitchenStaff kitchenStaff = new KitchenStaff();

        cashier.setNextHandler(orderTaker);
        orderTaker.setNextHandler(kitchenStaff);

        // Initiating orders
        cashier.handleOrder("burger and fries");
        cashier.handleOrder("burger with no onions");
        cashier.handleOrder("special burger with unique toppings");
        cashier.handleOrder("large meal with extra cheese");
        cashier.handleOrder("salad");

        // Note: In a real program, staff behaviors and orders would be more detailed.
    }
}