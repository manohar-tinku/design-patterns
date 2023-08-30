package com.pov.design.patterns.creational.abstractfactory;

interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
}