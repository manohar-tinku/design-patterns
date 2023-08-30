package com.pov.design.patterns.structural.adapter;

// Concrete adaptee classes
class VLCPlayer implements AdvancedMediaPlayer {
    @Override
    public void playVLC(String fileName) {
        System.out.println("Playing VLC file: " + fileName);
    }

    @Override
    public void playMP4(String fileName) {
        // VLC player doesn't support MP4 format
    }
}
