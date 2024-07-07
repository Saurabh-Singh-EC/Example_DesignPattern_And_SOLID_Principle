package com.codeWithSrb.DesignPattern.prototype;

public class PersonRunner {

    public static void main (String[] args) {
        Teacher teacher = new Teacher("Adam", "design pattern course");
        Teacher clonedTeacher = (Teacher)teacher.clone();

        System.out.println(String.format("Teacher %s, teaching %s%n", clonedTeacher.getName(), clonedTeacher.getCourse()));

        Student student = new Student("John", clonedTeacher);
        Student clonedStudent = student.clone();

        System.out.println(String.format("Student %s, is taught by teacher %s", clonedStudent.getName(), clonedStudent.getTeacher().getName()));


        // changing the name of the teacher on the clone object
        clonedTeacher.setName("Marc");

        //cloned student object did not change even after change in the reference type object as we are not using shallow copy anymore for student
        System.out.println(String.format("Student %s, is taught by teacher %s", clonedStudent.getName(), clonedStudent.getTeacher().getName()));
    }
}