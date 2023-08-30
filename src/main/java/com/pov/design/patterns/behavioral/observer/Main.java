package com.pov.design.patterns.behavioral.observer;

public class Main {
    public  static  WeatherStation weatherStation=new WeatherStation();
    public static void main(String[] args) {
        weatherStation.registerObserver(new TemperatureDisplay());
        weatherStation.setTemperature(100);
    }
}
