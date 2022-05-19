package com.yaner.lu.grammar.choice;

public class ChoicePractice1 {

    public static void main(String[] args) {

        int num = 2;

        switch (num) {
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                break;
        }

        System.out.println("1st test done!");

        String color = "black";

        switch (color) {
            case "green":
                System.out.println("Green");
                break;
            case "yellow":
                System.out.println("Yellow");
                break;
            case "red":
                System.out.println("Red");
                break;
            default:
                System.out.println("Not in color range");
                break;
        }

        System.out.println("2nd test done!");

        /*
        char ch = '2';

        switch (ch) {
            case "1":
                System.out.println("One");
                break;
            case "2":
                System.out.println("Two");
                break;
            case "3":
                System.out.println("Three");
                break;
        }

        System.out.println("3rd test done!");
         */

        // If a number is between 2 and 5, then print 2-5
        int i = 2;

        switch (i) {
            case 1:
                System.out.println("1");
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("2-5");
                break;
            case 6:
                System.out.println("6");
        }

        System.out.println("4th test done!");

        //capitalize 'a' to 'e', leave others to other
        char ch = 'a';

        switch (ch) {
            case 'a':
                System.out.println("A");
                break;
            case 'b':
                System.out.println("B");
                break;
            case 'c':
                System.out.println("C");
                break;
            case 'd':
                System.out.println("D");
                break;
            case 'e':
                System.out.println("E");
                break;
            default:
                System.out.println("Other");
                break;
        }

        System.out.println("5th test done!");

        //score pass fail
        int score = 20;
        String isOverOrEqual = "false";

        if (score >= 60 && score <= 100) {
            isOverOrEqual = "true";
        } else if (score >= 0 && score < 60) {
            isOverOrEqual = "false";
        }

        switch (isOverOrEqual) {
            case "true":
                System.out.println("Pass");
                break;
            case "false":
                System.out.println("Fail");
                break;
        }

        System.out.println("6th test done!");
    }
}
