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

        // practice 3
        Circle c = new Circle();
        c.radius = 10;
        PassObject object = new PassObject();
        object.printArea(c, 1);

    }

    //practice 3
    static class Circle {
        double radius;

        public double findArea(double radius) {
            return 3.14 * radius * radius;
        }
    }

    static class PassObject {
        public void printArea(Circle c, int times) {
            for (int i = 1; i <= times; i++) {
                System.out.println("radius: " + c.radius  + ", area: " + c.findArea(c.radius ));
            }
        }
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
