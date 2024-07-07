package com.codeWithSrb.DesignPattern.Singleton;

public class LazyInitializedSingletonPattern {

    private static LazyInitializedSingletonPattern instance;

    private LazyInitializedSingletonPattern() {
    }

    public static LazyInitializedSingletonPattern getInstance() {
        if(instance == null) {
            instance = new LazyInitializedSingletonPattern();
        }
        return instance;
    }
}
