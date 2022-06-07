package ru.alisher.springcourse;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class test0113main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
                test0113Context.class);

        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        System.out.println(musicPlayer.getName());
        System.out.println(musicPlayer.getVolume());

        Computer computer = context.getBean("computer", Computer.class);

        context.close();
    }
}
