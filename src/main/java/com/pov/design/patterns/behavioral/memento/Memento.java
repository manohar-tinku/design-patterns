package com.pov.design.patterns.behavioral.memento;

// Memento class
class Memento {
    private final String content;

    public Memento(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }
}
