package com.yaner.lu.grammar.condition;

import java.util.Scanner;

public class IfPractice2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Please enter the second number: ");
        int num2 = scanner.nextInt();

        System.out.print("Please enter the third number: ");
        int num3 = scanner.nextInt();

        if (num1 < num2) {
            if (num3 < num1) {
                System.out.println(num3 + "," + num1 + "," + num2);
            } else if (num3 > num2) {
                System.out.println(num1 + "," + num2 + "," + num3);
            } else {
                System.out.println(num1 + "," + num3 + "," + num2);
            }
        } else {
            if (num3 < num2) {
                System.out.println(num3 + "," + num2 + "," + num1);
            } else if (num3 > num1) {
                System.out.println(num2 + "," + num1 + "," + num3);
            } else {
                System.out.println(num2 + "," + num3 + "," + num1);
            }
        }
    }
}
