package com.codeWithSrb.DesignPattern.prototype;

public class Student extends Person{

    private Teacher teacher;

    protected Student(String name, Teacher teacher) {
        super(name);
        this.teacher = teacher;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }


    //deep copying of student object as it has a reference type
    @Override
    protected Student clone() {
        Student student = (Student)super.clone();
        student.setTeacher(new Teacher(student.getTeacher().getName(), student.getTeacher().getCourse()));
        return student;
    }
}
