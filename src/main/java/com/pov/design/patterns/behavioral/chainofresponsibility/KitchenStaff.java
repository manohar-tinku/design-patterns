package com.pov.design.patterns.behavioral.chainofresponsibility;

class KitchenStaff implements OrderHandler {
    @Override
    public void handleOrder(String order) {
        System.out.println("Kitchen Staff: Your special order of " + order + " is being prepared.");
    }
}
