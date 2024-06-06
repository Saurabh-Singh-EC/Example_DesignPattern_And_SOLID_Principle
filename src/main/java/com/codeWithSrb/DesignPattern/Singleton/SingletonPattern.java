package com.codeWithSrb.DesignPattern.Singleton;

import org.springframework.context.annotation.Configuration;

@Configuration
public class SingletonPattern {

    private static SingletonPattern instance;

    public SingletonPattern() {
        System.out.println("constructor method of the singleton pattern");
    }

    public SingletonPattern getInstance() {
        System.out.println("In singletonPattern class getInstance method");
        if(instance == null) {
            instance = new SingletonPattern();
        }
        return instance;
    }
}
