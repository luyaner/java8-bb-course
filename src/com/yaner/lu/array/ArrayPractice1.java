package com.yaner.lu.array;

public class ArrayPractice1 {
    public static void main(String[] args) {
        // print 'A'-'Z'
        char[] ch1 = new char[26];
        for (int i = 0; i < ch1.length; i++) {
            ch1[i] = (char)('A' + i);
            System.out.print(ch1[i] + "  ");
        }

        System.out.println("----------------------");

        // print 'A'-'Z' and '0'-'9'
        char[] ch2 = new char[36];
        // better solution:
        for (int j = 0; j < ch2.length; j++) {
            if (j < 26) {
                ch2[j] = (char)('A' + j);
            } else {
                ch2[j] = (char)('0' + j - 26);
            }
        }
        for (int k = 0; k < ch2.length; k++) {
            System.out.print(ch2[k] + " ");
        }
        /*
        for (int j = 0; j < ch2[26]; j++) {
            ch2[j] = (char)('A' + 1);
            System.out.print(ch2[j] + " ");
            }
            for (int k = 0; k < 10; k++) {
                ch2[26 + k] = (char)('0' + k);
                System.out.print(ch2[26 + k] + " ");
        }
         */
    }
}
