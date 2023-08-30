package com.pov.design.patterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class CompositeExample {
    public static void main(String[] args) {
        Employee dev1 = new Developer("John");
        Employee dev2 = new Developer("Alice");
        Employee dev3 = new Developer("Bob");

        Manager manager1 = new Manager("Eve");
        manager1.addSubordinate(dev1);
        manager1.addSubordinate(dev2);

        Manager manager2 = new Manager("Chris");
        manager2.addSubordinate(dev3);

        Manager topLevelManager = new Manager("Oliver");
        topLevelManager.addSubordinate(manager1);
        topLevelManager.addSubordinate(manager2);

        topLevelManager.showDetails();
    }
}
