package com.pov.design.patterns.observer;

public class TemperatureDisplay implements Observer {
    public int temperature;

    @Override
    public void update(int temperature) {
        this.temperature = temperature;
        display();
    }

    private void display() {
        System.out.println("Current Temperature: " + temperature + " \u00B0"+"C");
        System.out.println(temperature);
    }
}
