package ru.alisher.springcourse;

import org.springframework.stereotype.Component;

@Component
public class ClassicalMusic implements Music {
    private ClassicalMusic(){}
    public static ClassicalMusic getClassicalMusic(){
        System.out.println("hi");
        return new ClassicalMusic();
    }
    public void doMyInit () {
        System.out.println("Doing my initialization");
    }
    public void doMyDestroy () {
        System.out.println("Doing my destrucion" );
    }
    @Override
    public String getSong() {
        return "Hungarian Rhapsody";
    }
}
