package com.pov.design.patterns.creational.abstractfactory;

class WindowsCheckbox implements Checkbox {
    public String paint() {
        return "Rendering a Windows style checkbox";
    }
}