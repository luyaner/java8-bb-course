package com.yaner.lu.array;

import java.util.Scanner;

public class ArrayPractice3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int studentNum = getStudentNum(scanner);
        int[] studentScore = new int[studentNum];
        getStudentScores(scanner, studentScore);
        int highestScore = getHighestScore(studentScore);
        char[] studentGrade = getStudentGrade(studentNum, studentScore, highestScore);
        System.out.println(
                "The highest score is " + highestScore
        );
        printScoreAndGrade(studentNum, studentScore, studentGrade);
    }

    private static void getStudentScores(Scanner scanner, int[] studentScore) {
        System.out.println("Please enter the score of students one by one: ");
        for (int index = 0; index < studentScore.length; index++) {
            studentScore[index] = scanner.nextInt();
        }
    }

    private static int getStudentNum(Scanner scanner) {
        System.out.print("Please enter the number of students: ");
        return scanner.nextInt();
    }

    private static void printScoreAndGrade(int studentNum, int[] studentScore, char[] studentGrade) {
        for (int index = 0; index < studentNum; index++) {
            System.out.println(
            "student "
                    + index
                    + " score is "
                    + studentScore[index]
                    + " grade is "
                    + studentGrade[index]
            );
        }
    }

    private static char[] getStudentGrade(int studentNum, int[] studentScore, int highestScore) {
        char[] studentGrade = new char[studentNum];
        for (int index = 0; index < studentGrade.length; index++) {
            if (studentScore[index] >= (highestScore - 10)) {
                studentGrade[index] = 'A';
            } else if (studentScore[index] >= (highestScore - 20)) {
                studentGrade[index] = 'B';
            } else if (studentScore[index] >= (highestScore - 30)) {
                studentGrade[index] = 'C';
            } else studentGrade[index] = 'D';
        }
        return studentGrade;
    }

    private static int getHighestScore(int[] studentScore) {
        int highestScore = 0;
        for (int element : studentScore) {
            if (element > highestScore) {
                highestScore = element;
            }
        }
        return highestScore;
    }
}
