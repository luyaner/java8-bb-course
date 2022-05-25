package com.yaner.lu.array;

import java.util.Arrays;

public class TestArray {
    public static void main(String[] args) {
     int[] array1 = new int[]{2,3,5,7,11,13,17,19};
     int length = array1.length;
     int[] array2 = new int[length];
        printArray(array1);
        // array2 = array1; // you couldnt copy array element values like this
        System.arraycopy(array1, 0, array2, 0, array1.length);
     for (int i = 0; i < array2.length; i++){
         if (i % 2 == 0){
             array2[i] = i;
         }
     }
        System.out.print("\nArray 1: ");
        printArray(array1);
        System.out.print("\nArray 2: ");
        printArray(array2);

        int[] array3 = new int[]{1,5,60,34,-31,0};
        Arrays.sort(array3);
        System.out.print("\nArray 3: ");
        printArray(array3);
    }

    private static void printArray(int[] array1) {
        for (int j : array1) {
            System.out.print(j + " ");
        }
    }
}
