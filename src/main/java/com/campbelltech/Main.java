package com.campbelltech;

public class Main {
    public static void main(String[] args) {
        Teacher teacher = new Teacher(
                "Sean",
                "Creational Design Patterns in Java Demystified");
        Teacher teacherClone = (Teacher)teacher.clone();
        System.out.println("Teacher was cloned: " + teacherClone);

        Student student = new Student(
                "James",
                teacherClone
        );
        Student studentCopy = student.clone();
        System.out.println("Student was cloned: " + studentCopy);

        // change teacher name
        teacherClone.setName("John");
        System.out.println("Student was cloned: " + studentCopy);
    }
}