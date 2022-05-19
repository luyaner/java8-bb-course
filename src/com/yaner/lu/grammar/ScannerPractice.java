package com.yaner.lu.grammar;

import java.util.Scanner;

public class ScannerPractice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Please enter your first name: ");
        String firstName = scan.next();

        System.out.print("Please enter your age: ");
        int age = scan.nextInt();

        System.out.print("Please enter your gender: ");
        char gender = scan.next().charAt(0);

        System.out.println("Hello " + firstName);
        if (age >= 18) {
            System.out.println("Congra! You are an adult now.");
        };
        System.out.println("Gender: " + gender);

    }
}
