package com.yaner.lu.method;

public class MethodOverload {
    public static void main(String[] args) {

        System.out.println(multiply(2));
        System.out.println(multiply(2,3));
        System.out.println(multiply("2 * 2"));

        System.out.println(max(1, 3));
        System.out.println(max(1.1, 2.2));
        System.out.println(max(1.1, 2.2, 3.3));
    }
     // practice 1
    public static int multiply(int a) {
        return a * a;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static String multiply(String str) {
        return str;
    }

    // practice 2
    public static int max(int a, int b) {
        return Math.max(a, b);
    }

    public static double max(double a, double b) {
        return Math.max(a, b);
    }

    public static double max(double a, double b, double c) {

        /* way one
        if (a > b) {
            if (a > c) {
                return a;
            } else return c;
        } else if (c > b) {
            return c;
        } else return b;
         */

        /*
        way two
         */
        double biggerD = max(a, b);
        double max = max(biggerD, c);
        return max;
    }
}
