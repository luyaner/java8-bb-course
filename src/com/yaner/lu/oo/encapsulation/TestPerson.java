package com.yaner.lu.oo.encapsulation;

public class TestPerson {
    public static void main(String[] args) {
        Person person = new Person();
//        person.setAge(-20);
//        person.setAge(190);
//        person.age = 80;
        person.setAge(38);
        System.out.println("This person is " + person.getAge() + " years old.");
    }
}

class Person {
    private int age;

    public void setAge(int age) {
        if (age >= 0 && age < 130) {
            this.age = age;
        }
    }

    public int getAge() {
        return this.age;
    }
}
