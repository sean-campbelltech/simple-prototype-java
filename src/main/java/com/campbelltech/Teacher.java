package com.campbelltech;

// ConcretePrototype1
public class Teacher extends Person {
    private final String course;

    public Teacher(String firstname, String course) {
        super(firstname);
        this.course = course;
    }

    public String getCourse() {
        return course;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                "course='" + course + '\'' +
               '}';
    }
}
