package com.yaner.lu.grammar.condition;

import java.util.Scanner;

public class IfPractice1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter your test score: ");
        double score = scanner.nextInt();

        if (score == 100) {
            System.out.println("You are given a BMW as reward!");
        } else if (score >= 80 && score < 100) {
            System.out.println("You are given a Huawei phone as reward!");
        } else if (score >= 60 && score <80) {
            System.out.println("You are given a book as reward!");
        } else {
            System.out.println("Nothing!");
        }
    }
}
