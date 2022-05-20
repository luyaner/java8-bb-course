package com.yaner.lu.oo.practices;

import java.util.StringJoiner;

public class Dog {

    String name;
    int age = 1;
    double weight = 10D;

    public String say() {
        StringJoiner properties = new StringJoiner(", ");
        properties.add(this.name);
        properties.add(Integer.toString(this.age));
        properties.add(Double.toString(this.weight));
        return properties.toString();
    }
}
