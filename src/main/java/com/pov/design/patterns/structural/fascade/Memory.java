package com.pov.design.patterns.structural.fascade;

class Memory {
    public void load(long position, byte[] data) {
        System.out.println("Loading data at position: " + position);
    }
}
