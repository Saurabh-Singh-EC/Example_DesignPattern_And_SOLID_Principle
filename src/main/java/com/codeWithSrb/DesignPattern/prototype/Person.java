package com.codeWithSrb.DesignPattern.prototype;

public abstract class Person implements Cloneable {

    public String name;

    protected Person(String name) {
        this.name = name;
    }

    @Override
    protected Person clone() {
        try {
            return (Person)super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
