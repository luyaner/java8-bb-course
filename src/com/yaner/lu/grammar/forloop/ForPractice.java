package com.yaner.lu.grammar.forloop;

public class ForPractice {
    public static void main(String[] args) {

        //practice 1
        int sum1 = 0;
        int count1 = 0;
        for (int i = 1; i <= 100; i = i+2) {
            sum1 += i;
            count1++;
        }
        System.out.println(sum1);
        System.out.println(count1);

        //practice 2
        int count2 = 0;
        int sum2 = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 7 == 0) {
                count2++;
                sum2 += i;
            }
        }
        System.out.println(count2);
        System.out.println(sum2);

        //practice 3
        for (int i = 100; i <= 999; i++) {//678
            int j1 = i / 100; //hundred number
            int j2 = (i - j1 * 100) / 10; // ten number
            int j3 = i % 10;
            if (i == (j1*j1*j1 + j2*j2*j2 + j3*j3*j3)) {
                System.out.println(i);
            }
        }
    }
}
