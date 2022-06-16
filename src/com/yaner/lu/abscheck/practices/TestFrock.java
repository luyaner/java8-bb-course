package com.yaner.lu.abscheck.practices;

public class TestFrock {
    public static void main(String[] args) {
//        Frock frock = new Frock();
        Shirt shirt = new Shirt();
        System.out.println(shirt.calcArea(1));
        Frock frock = new Shirt();
        System.out.println(frock.calcArea(2));
    }
}
