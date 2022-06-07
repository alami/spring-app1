package ru.alisher.springcourse;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("ru.alisher.springcourse")
@PropertySource("classpath:musicPlayer.properties")
public class SpringConfig {

}
    /*@Bean
    public ClassicalMusic musicBean0 () { return new ClassicalMusic(); }
    @Bean
    public MusicPlayer mp0 () { return new MusicPlayer(musicBean0 ()); }*/
/*  <bean id="musicBean" class="ru.alisher.springcourse.ClassicalMusic"
    init-method="doMyInit" destroy-method="doMyDestroy" ></bean>*/



