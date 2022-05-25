package com.yaner.lu.array;

public class ArrayPractice2 {
    public static void main(String[] args) {
        int[] arr1 = new int[20];
        intArray(arr1);

        for (int index = 0; index < arr1.length; index++) {
            System.out.print(arr1[index] + " ");
        }

        System.out.println();
        System.out.println("-----------------");

        for (int elementInArray : arr1) {
            System.out.print(elementInArray + " ");
        }
    }

    public static void intArray(int[] arr) {
        for (int j = 0; j < arr.length; j++) {
            arr[j] = 2 + 2 * j;
        }
    }
}
