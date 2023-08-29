package com.pov.design.patterns.abstractfactory;

class WindowsButton implements Button {
    public String paint() {
        return "Rendering a Windows style button";
    }
}