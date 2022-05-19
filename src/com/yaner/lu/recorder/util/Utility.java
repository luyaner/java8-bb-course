package com.yaner.lu.recorder.util;

import java.util.Scanner;

public class Utility {

    private static Scanner scanner = new Scanner(System.in);

    public static int readSelectionNumber() {
        int selection = scanner.nextInt();
        for (;;) {
            if (selection != 1 && selection != 2 && selection != 3 && selection != 4) {
                System.out.println("Invalid Input!");
            } else break;
        }
        return selection;
    }

    public static int readNumber() {
        return scanner.nextInt();
    }

    public static String readString() {
        return scanner.next();
    }
}
