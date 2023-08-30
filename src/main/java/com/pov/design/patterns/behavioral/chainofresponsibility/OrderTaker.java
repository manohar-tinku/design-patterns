package com.pov.design.patterns.behavioral.chainofresponsibility;

class OrderTaker implements OrderHandler {
    private OrderHandler nextHandler;

    public void setNextHandler(OrderHandler handler) {
        nextHandler = handler;
    }

    @Override
    public void handleOrder(String order) {
        if (order.contains("special toppings") || order.contains("meal")) {
            System.out.println("Order Taker: Your customized order of " + order + " is noted.");
        } else if (nextHandler != null) {
            nextHandler.handleOrder(order);
        } else {
            System.out.println("None of the staff can handle your order.");
        }
    }
}