package com.yaner.lu.oo.constructor;

// practice 1

public class ConstructorTest {
    public static void main(String[] args) {
        Person person1 = new Person();

        // practice 3
        Person person2 = new Person("Jane");
        System.out.println(person2.getName()
                + " is " + person2.getAge()
                + " years old.");
        Person person3 = new Person("Yu", 10);
        System.out.println(person3.getName()
                + " is " + person3.getAge()
                + " years old.");

        // practice 4
        Person person4 = new Person("Ranran", -9);
        System.out.println(person4.getName()
                + " is " + person4.getAge()
                + " years old.");
    }
}

class Person {
    // 直接显示赋值
    private String name = "James";
    private int age;

    public Person() {
        // final practice 1
        this.age = 18;

        /*
        System.out.println("This is the person constructor.");
        // practice 2
        init();
         */
    }

    // practice 2
    public void init() {
        System.out.println("I am just created.");
    }

    // practice 3
    public Person(String name) {
        this.name = name;
    }

    public Person(String name, int age) {
        this.name = name;
        // practice 4
//        this.age = age;
        setAge(age);
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
//        this.age = age;
        // practice 4
        if (age > 0 && age <= 130) {
            this.age = age;
        }
    }

}
