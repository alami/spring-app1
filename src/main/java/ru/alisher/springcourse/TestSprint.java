package ru.alisher.springcourse;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.swing.plaf.IconUIResource;
import java.util.Arrays;

public class TestSprint {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
                SpringConfig.class);
        /*ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"  );*/

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

//        Music music = context.getBean("rockMusic", Music.class);
//        Music music1 = context.getBean("classicalMusic", Music.class);
        /*System.out.println(music.getSong());
        System.out.println(music1.getSong());*/

        MusicPlayer mp = context.getBean("musicPlayer", MusicPlayer.class);
        mp.playMusic();
        System.out.println(mp.getName());
        System.out.println(mp.getVolume());
        MusicPlayer mp1 = context.getBean("musicPlayer", MusicPlayer.class);

        boolean comparision = mp == mp1;
        System.out.println(comparision);
        System.out.println(mp);
        System.out.println(mp1);

        ClassicalMusic cm = context.getBean("classicalMusic", ClassicalMusic.class);
        System.out.println(cm.getSong());

        context.close();
    }
}
