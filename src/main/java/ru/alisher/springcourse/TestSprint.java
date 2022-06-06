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

        ClassicalMusic classicalMusic = context.getBean("musicBean", ClassicalMusic.class);
        System.out.println(classicalMusic.getSong());
        context.close();
    }
}
