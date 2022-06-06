package ru.alisher.springcourse;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class ClassicalMusic implements Music {
    private ClassicalMusic(){}
    public static ClassicalMusic getClassicalMusic(){
        System.out.println("hi");
        return new ClassicalMusic();
    }
    @PostConstruct
    public void doMyInit () {
        System.out.println("Doing my initialization");
    }
    @PreDestroy
    public void doMyDestroy () {
        System.out.println("Doing my destrucion" );
    }
    @Override
    public String getSong() {
        return "Hungarian Rhapsody";
    }
}
