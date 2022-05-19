package com.yaner.lu.grammar.condition;

import java.util.Scanner;

public class IfPractice3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Please tell me how tall you are in cm: ");
        int height = scanner.nextInt();
        System.out.print("Please tell me how many cash you have: ");
        double cash = scanner.nextDouble();
        System.out.print("Please tell me are you handsome. True or False? ");
        boolean isHandsome = scanner.nextBoolean();

        boolean isTall = height > 180;
        boolean isRich = cash > 10000000;
        if (isTall && isRich && isHandsome) {
            System.out.println("Marry him!");
        } else if (isTall || isRich || isHandsome) {
            System.out.println("He is average, but not a bad choice. If don't have any other options, just marry him.");
        } else if (!isTall && !isRich && !isHandsome) {
            System.out.println("No way!");
        }
    }
}
