package com.yaner.lu.oo.practices;

//practice 1

public class TestStudent {
    public static void main(String[] args) {
        Student student = new Student();
        student.name = "Jane Wang";
        student.gender = "Female";
        student.age = 40;
        student.id = 1;
        student.score = 100.5;

        System.out.println(student.say());
    }
}
