package com.pov.design.patterns.abstractfactory;

interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
}