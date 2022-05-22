package com.yaner.lu.oo.encapsulation;

import java.util.StringJoiner;

public class ThisConstructor {
    public static void main(String[] args) {
        NewBorn newBorn = new NewBorn("Molly", 0, 60, 'f');
        newBorn.printInfo();
    }
}

class NewBorn {
    private String name;
    private int age;
    private double height;
    private char gender;

    public NewBorn(String name) {
        this.name = name;
    }

    public NewBorn(String name, int age) {
//        this.name = name;
        this(name);
        this.age = age;
    }

    public NewBorn(String name, int age, double height) {
//        this.name = name;
//        this.age = age;
        this(name, age);
        this.height = height;
    }

    public NewBorn(String name, int age, double height, char gender) {
//        this.name = name;
//        this.age = age;
//        this.height = height;
        // this 调用构造器
        this(name, age, height);
        this.gender = gender;
    }

    public NewBorn() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public void printInfo() {
        StringJoiner stringJoiner = new StringJoiner(", ");
        stringJoiner.add(name);
        stringJoiner.add(Integer.toString(age));
        stringJoiner.add(Double.toString(height));
        stringJoiner.add(Character.toString(gender));
        System.out.println(stringJoiner);
    }
}
