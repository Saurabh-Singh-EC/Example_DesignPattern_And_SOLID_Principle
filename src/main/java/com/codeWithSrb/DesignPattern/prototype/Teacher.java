package com.codeWithSrb.DesignPattern.prototype;

//Concrete class to be used for cloning
public class Teacher extends Person {

    private final String course;

    protected Teacher(String name, String course) {
        super(name);
        this.course = course;
    }

    public String getCourse() {
        return course;
    }


}
