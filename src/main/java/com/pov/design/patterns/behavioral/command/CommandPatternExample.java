package com.pov.design.patterns.behavioral.command;

public class CommandPatternExample {
    public static void main(String[] args) {
        // Create receiver
        Light light = new Light();

        // Create command objects
        LightOnCommand lightOnCommand = new LightOnCommand(light);
        LightOffCommand lightOffCommand = new LightOffCommand(light);

        // Create invoker
        RemoteControl remote = new RemoteControl();

        // Set and execute commands
        remote.setCommand(lightOnCommand);
        remote.pressButton();

        remote.setCommand(lightOffCommand);
        remote.pressButton();
    }
}