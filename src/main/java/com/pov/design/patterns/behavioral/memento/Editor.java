package com.pov.design.patterns.behavioral.memento;

// Originator class
class Editor {
    private String content;

    public void setContent(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public Memento createMemento() {
        return new Memento(content);
    }

    public void restoreMemento(Memento memento) {
        content = memento.getContent();
    }
}
