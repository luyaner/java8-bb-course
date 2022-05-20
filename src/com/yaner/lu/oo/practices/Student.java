package com.yaner.lu.oo.practices;

//practice 1

import java.util.StringJoiner;

public class Student {

    String name;
    String gender;
    int age;
    int id;
    double score;

    public String say() {
        StringJoiner properties = new StringJoiner(", ");
        properties.add(this.name);
        properties.add(this.gender);
        properties.add(Integer.toString(this.age));
        properties.add(Integer.toString(this.id));
        properties.add(Double.toString(this.score));
        return properties.toString();
    }
}
