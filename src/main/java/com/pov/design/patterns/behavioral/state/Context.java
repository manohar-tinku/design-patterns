package com.pov.design.patterns.behavioral.state;

// Context class
class Context {
    private State state;

    public void setState(State state) {
        this.state = state;
    }

    public State getState() {
        return state;
    }
}
