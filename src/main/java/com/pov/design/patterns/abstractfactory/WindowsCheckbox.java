package com.pov.design.patterns.abstractfactory;

class WindowsCheckbox implements Checkbox {
    public String paint() {
        return "Rendering a Windows style checkbox";
    }
}