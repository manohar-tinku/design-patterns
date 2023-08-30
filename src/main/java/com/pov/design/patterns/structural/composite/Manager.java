package com.pov.design.patterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

// Composite class
class Manager implements Employee {
    private String name;
    private List<Employee> subordinates = new ArrayList<>();

    public Manager(String name) {
        this.name = name;
    }

    public void addSubordinate(Employee employee) {
        subordinates.add(employee);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void showDetails() {
        System.out.println("Manager: " + name);
        for (Employee subordinate : subordinates) {
            subordinate.showDetails();
        }
    }
}
