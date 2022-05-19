package com.yaner.lu.method;

public class AnotherMethodPractice {
    public static void changeValueOf(int a, int b) {
        System.out.println("before changing: a is " + a + ", b is " + b);
        a += 1;
        b += 2;
        System.out.println("after changing: a is " + a + ", b is " + b);
    }
}
