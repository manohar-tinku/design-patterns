package com.pov.design.patterns.structural.adapter;

// Adapter class
class MediaAdapter implements MediaPlayer {
    private AdvancedMediaPlayer player;

    public MediaAdapter(String audioType) {
        if (audioType.equalsIgnoreCase("vlc")) {
            player = new VLCPlayer();
        } else if (audioType.equalsIgnoreCase("mp4")) {
            player = new MP4Player();
        }
    }

    @Override
    public void play(String audioType, String fileName) {
        if (audioType.equalsIgnoreCase("vlc")) {
            player.playVLC(fileName);
        } else if (audioType.equalsIgnoreCase("mp4")) {
            player.playMP4(fileName);
        }
    }
}
