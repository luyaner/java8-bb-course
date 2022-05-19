package com.yaner.lu.variable;

public class TernaryOperator {
    public static void main(String[] args) {

        /*
        get the bigger value (two values)
         */
        int num1 = 10;
        int num2 = 20;
        int biggerNum = num1 > num2 ? num1 : num2;
        System.out.println(biggerNum);

        /*
        get the bigger value (three values)
         */
        int num3 = 30;
        /*
        Avoid writing expression like this, too complex to understand.
        biggerNum = num1 > num2 ? (num1 > num3 ? num1 : num3) : (num2 > num3 ? num2 : num3);
         */
        biggerNum = biggerNum > num3 ? biggerNum : num3;
        System.out.println(biggerNum);
    }
}
