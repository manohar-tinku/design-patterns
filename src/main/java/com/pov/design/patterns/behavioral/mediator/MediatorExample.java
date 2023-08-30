package com.pov.design.patterns.behavioral.mediator;

import java.util.ArrayList;
import java.util.List;

public class MediatorExample {
    public static void main(String[] args) {
        ChatMediatorImpl mediator = new ChatMediatorImpl();

        User user1 = new ChatUser(mediator, "Alice");
        User user2 = new ChatUser(mediator, "Bob");
        User user3 = new ChatUser(mediator, "Charlie");

        mediator.addUser(user1);
        mediator.addUser(user2);
        mediator.addUser(user3);

        user1.sendMessage("Hello, everyone!");
        user2.sendMessage("Hey, Alice!");
    }
}
