package com.yaner.lu.oo.encapsulation;

public class MarryTest {
    public static void main(String[] args) {
        Boy boy = new Boy();
        boy.setName("James");
        Girl girl = new Girl();
        girl.setName("Molly");
        boy.marry(girl);
        boy.shout(girl);
        girl.marry(boy);
    }
}

class Girl {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void marry(Boy boy) {
        System.out.println("I'm " + this.name + ", I wanna marry " + boy.getName() + ".");
    }
}

class Boy {
    private String name;
    private int age;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return this.age;
    }

    public void marry(Girl girl) {
        System.out.println("I'm " + this.name + ", I wanng marry " + girl.getName() + ".");
    }

    public void shout(Girl girl) {
        System.out.println(girl.getName() + ", would you marry me?");
    }
}
