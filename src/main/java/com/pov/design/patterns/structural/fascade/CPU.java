package com.pov.design.patterns.structural.fascade;

// Subsystem classes
class CPU {
    public void freeze() {
        System.out.println("CPU is frozen");
    }

    public void jump(long position) {
        System.out.println("Jumping to position: " + position);
    }

    public void execute() {
        System.out.println("CPU is executing commands");
    }
}
