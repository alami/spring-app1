package ru.alisher.springcourse;

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
