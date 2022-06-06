package ru.alisher.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;

public class TestSprint {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );
        //TestBean testBean = context.getBean("testBean", TestBean.class);
        Music music = context.getBean("musicBean", Music.class);
        MusicPlayer musicPlayer = new MusicPlayer(music);
        musicPlayer.playMusic();
        context.close();
    }
}
