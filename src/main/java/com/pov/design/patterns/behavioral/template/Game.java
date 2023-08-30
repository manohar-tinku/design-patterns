package com.pov.design.patterns.behavioral.template;

// Template class
abstract class Game {
    abstract void initialize();

    abstract void startPlay();

    abstract void endPlay();

    // Template method
    public final void play() {
        initialize();
        startPlay();
        endPlay();
    }
}
