package com.pov.design.patterns.behavioral.chainofresponsibility;

class Cashier implements OrderHandler {
    private OrderHandler nextHandler;

    public void setNextHandler(OrderHandler handler) {
        nextHandler = handler;
    }

    @Override
    public void handleOrder(String order) {
        if (order.contains("burger") || order.contains("fries") || order.contains("drink")) {
            System.out.println("Cashier: Your order of " + order + " is taken.");
        } else if (nextHandler != null) {
            nextHandler.handleOrder(order);
        } else {
            System.out.println("None of the staff can handle your order.");
        }
    }
}