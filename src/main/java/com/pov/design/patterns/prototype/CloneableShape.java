package com.pov.design.patterns.prototype;

interface CloneableShape {
    CloneableShape clone();
    String getInfo();
}