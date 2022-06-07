package ru.alisher.springcourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
/*
@Scope("prototype")
*/
public class MusicPlayer {
    @Autowired
    @Qualifier("rockMusic")
    private Music music;
    @Value("${musicPlayer.name}")
    private String name;
    @Value("${musicPlayer.volume}")
    private int volume;

    public String getName() {        return name;    }
    public void setName(String name) { this.name = name;    }
    public int getVolume() {        return volume;    }
    public void setVolume(int volume) { this.volume = volume;    }
    public MusicPlayer(Music music) {
        this.music = music;
    }
    public MusicPlayer() {}
    public void playMusic () {
        System.out.println("Playing: "+music.getSong());
    }
    public void setMusic (Music music) { this.music = music; }
}
