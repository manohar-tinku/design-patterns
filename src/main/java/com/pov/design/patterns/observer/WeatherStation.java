package com.pov.design.patterns.observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements Subject {
    public List<Observer> observers = new ArrayList<>();
    public int temperature;

    public void setTemperature(int temperature) {
        this.temperature = temperature;
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(temperature);
        }
    }
}
