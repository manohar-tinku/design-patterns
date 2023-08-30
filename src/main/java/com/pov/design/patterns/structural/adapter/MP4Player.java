package com.pov.design.patterns.structural.adapter;

class MP4Player implements AdvancedMediaPlayer {
    @Override
    public void playVLC(String fileName) {
        // MP4 player doesn't support VLC format
    }

    @Override
    public void playMP4(String fileName) {
        System.out.println("Playing MP4 file: " + fileName);
    }
}
