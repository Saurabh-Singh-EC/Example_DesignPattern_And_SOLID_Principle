package com.codeWithSrb.DesignPattern.Singleton;

public class ThreadSafeSingletonPattern {

    private static ThreadSafeSingletonPattern instance;

    private ThreadSafeSingletonPattern() {
    }

    public static synchronized ThreadSafeSingletonPattern getInstance() {
        if(instance == null) {
            instance = new ThreadSafeSingletonPattern();
        }
        return instance;
    }
}
