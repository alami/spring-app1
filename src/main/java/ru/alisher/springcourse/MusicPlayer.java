package ru.alisher.springcourse;

public class MusicPlayer {
    private Music music;

    public MusicPlayer(Music music) {
        this.music = music;
    }
    public MusicPlayer() {}
        public void playMusic () {
        System.out.printf("Playing: "+music.getSong());
    }
    public void setMusic (Music music) { this.music = music; }
}
