package ru.alisher.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.swing.plaf.IconUIResource;
import java.util.Arrays;

public class TestSprint {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );
        //TestBean testBean = context.getBean("testBean", TestBean.class);
        //Music music = context.getBean("musicBean", Music.class);
        /*MusicPlayer musicPlayer = context.getBean("musicPlayer",MusicPlayer.class); //new MusicPlayer(music);
        MusicPlayer musicPlayerSecond = context.getBean("musicPlayer",MusicPlayer.class);

        boolean comparision = musicPlayer == musicPlayerSecond;
        System.out.println(comparision);
        System.out.println(musicPlayer);
        System.out.println(musicPlayerSecond);

        musicPlayer.playMusic();
        System.out.println(musicPlayer.getName());
        System.out.println(String.valueOf(musicPlayer.getVolume()));*/

        Music music = context.getBean("rockMusic", Music.class);
        Music music1 = context.getBean("classicalMusic", Music.class);
        /*System.out.println(music.getSong());
        System.out.println(music1.getSong());*/

        MusicPlayer mp = new MusicPlayer(music);
        mp.playMusic();
        MusicPlayer mp1 = new MusicPlayer(music1);
        mp1.playMusic();
        context.close();
    }
}
