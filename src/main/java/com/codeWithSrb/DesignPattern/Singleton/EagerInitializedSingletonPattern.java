package com.codeWithSrb.DesignPattern.Singleton;

public class EagerInitializedSingletonPattern {

    private static final EagerInitializedSingletonPattern instance = new EagerInitializedSingletonPattern();

    //private constructor to make sure that client can not create a new instance
    private EagerInitializedSingletonPattern(){

    }

    public static EagerInitializedSingletonPattern getInstance() {
        return instance;
    }

    public void log(String message) {
        System.out.println(message);
    }
}
