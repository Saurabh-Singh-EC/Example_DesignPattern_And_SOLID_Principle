package com.codeWithSrb.DesignPattern.Singleton;

public class StaticBlockSingletonPattern {

    private static StaticBlockSingletonPattern instance;

    private StaticBlockSingletonPattern() {
    }

    static {
        try{
            instance = new StaticBlockSingletonPattern();
        } catch (Exception e) {
            throw new RuntimeException("Exception occurred while creating the object");
        }
    }

    public static StaticBlockSingletonPattern getInstance() {
        return instance;
    }

    public void log(String message) {
        System.out.println(message);
    }
}
