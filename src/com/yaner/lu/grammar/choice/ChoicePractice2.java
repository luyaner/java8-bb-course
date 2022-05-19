package com.yaner.lu.grammar.choice;

import java.util.Scanner;

public class ChoicePractice2 {

    public static void main(String[] args) {

        // month to season
        String str = "May";

        switch (str) {
            case "March":
            case "April":
            case "May":
                System.out.println("Spring");
                break;
            case "June":
            case "July":
            case "August":
                System.out.println("Summer");
                break;
            case "September":
            case "October":
            case "December":
                System.out.println("Fall");
                break;
            case "November":
            case "January":
            case "February":
                System.out.println("Winter");
                break;
        }

        System.out.println("1st test done!");

        Scanner scanner = new Scanner(System.in);

        // number to day
        System.out.print("Please enter an integer: ");
        int input = scanner.nextInt();

        switch (input) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid number!");
                break;
        }

        System.out.println("2nd task done!");

        // score to grade
        System.out.print("Please enter your score: ");
        int score = scanner.nextInt();

        if (score >= 90 && score <= 100) {
            System.out.println("A");
        } else if (score >= 70 && score < 90) {
            System.out.println("B");
        } else if (score >= 60 && score < 70) {
            System.out.println("C");
        } else if (score >= 0 && score < 60) {
            System.out.println("D");
        } else System.out.println("Invalid number!");

        System.out.println("3rd task done!");

        //number to date
        // TODO: dont get the point...
        System.out.print("Please enter the number of year: ");
        int year = scanner.nextInt();
        System.out.print("Please enter the number of month: ");
        int month = scanner.nextInt();
        System.out.print("Please enter the number of day: ");
        int day = scanner.nextInt();

        int sum = 0;

        switch (month) {
            case 12:
                sum += 30;
            case 11:
                sum += 31;
            case 10:
                sum += 30;
            case 9:
                sum += 31;
            case 8:
                sum += 30;
            case 7:
                sum += 30;
            case 6:
                sum += 31;
            case 5:
                sum += 30;
            case 4:
                sum += 31;
            case 3:
                if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
                    sum += 29;
                } else {
                    sum += 28;
                }
            case 2:
                sum += 31;
            case 1:
                sum += day;
                break;
        }
        String result = year + "-" + month + "-" + day + " is the " + sum + " day of the year.";

        System.out.println(result);
    }
}
