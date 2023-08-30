package com.pov.design.patterns.behavioral.memento;

public class MementoExample {
    public static void main(String[] args) {
        Editor editor = new Editor();
        History history = new History();

        // Editing and saving content
        editor.setContent("Hello, world!");
        history.setMemento(editor.createMemento());

        // Editing and saving content again
        editor.setContent("Hello, Memento!");
        // Oops! Let's restore the previous state
        editor.restoreMemento(history.getMemento());

        System.out.println(editor.getContent()); // Output: Hello, world!
    }
}
