package com.yaner.lu.oo.encapsulation;

// practice 5

public class ThisConstructorPractice {
    public static void main(String[] args) {
        Student james = new Student("James", 18);
        System.out.println(james.getName() + james.getAge());
        Student molly = new Student("Molly", 21, "FirstSchool");
        System.out.println(molly.getName() + molly.getAge() + molly.getSchool());
        Student wan = new Student("Wan", 19, "SecondSchool", "Math");
        System.out.println(wan.getName() + wan.getAge() + wan.getSchool() + wan.getMajor());
    }
}

class Student {
    private String name;
    private int age;
    private String school;
    private String major;

    public void printProperties() {
        System.out.println(
                this.name + ", "
                + this.age + ", "
                + this.school + ", "
                + this.major);
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Student(String name, int age, String school) {
        this(name, age);
        this.school = school;
    }

    public Student(String name, int age, String school, String major) {
        this(name, age, school);
        this.major = major;
    }

    public Student() {
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

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }
}
