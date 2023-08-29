package com.pov.design.patterns.abstractfactory;

class Client {
    public static void createGUI(GUIFactory factory) {
        Button button = factory.createButton();
        Checkbox checkbox = factory.createCheckbox();
        System.out.println(button.paint());
        System.out.println(checkbox.paint());
    }

    public static void main(String[] args) {
        GUIFactory windowsFactory = new WindowsFactory();
        GUIFactory macosFactory = new MacOSFactory();

        createGUI(windowsFactory);
        createGUI(macosFactory);
    }
}