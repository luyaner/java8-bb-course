package com.yaner.lu.method;

public class MethodPractice {
    public static void main(String[] args) {
        int area = printSquare(5, 5);
        System.out.println(area);

        // practice 2
        int a = 10;
        int b = 20;
        System.out.println("before calling the method: a is " + a + ", b is " + b);
        AnotherMethodPractice.changeValueOf(a, b);
        System.out.println("after calling the method: a is " + a + ", b is " + b);

    }

    // practice 1
    public static int printSquare(int length, int width) {
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        return length * width;
    }
}
