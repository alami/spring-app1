package ru.alisher.springcourse;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
//@ComponentScan("ru.alisher.springcourse")
@PropertySource("classpath:musicPlayer.properties")

public class test0113Context {
    @Bean
    public ClassicalMusic classicalMusic () { return new ClassicalMusic(); }
    @Bean
    public RockMusic rockMusic () { return new RockMusic(); }
    @Bean
    public MusicPlayer musicPlayer () {
        return new MusicPlayer(rockMusic());
    }
    @Bean
    public Computer computer () {
        return new Computer(musicPlayer());
    }

}
