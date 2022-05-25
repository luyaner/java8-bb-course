package com.yaner.lu.array;

public class ArrayPractice4 {
    public static void main(String[] args) {
       int[][] arr =  new int[3][5];
       arr[0] = new int[]{0,0,0,11,0};
       arr[1] = new int[]{22,0,0,0,0};
       arr[2] = new int[]{0,0,0,0,33};

       for (int i = 0; i < arr.length; i++) {
           int[] as = arr[i];

           for (int j = 0; j < as.length; j++) {
               System.out.print(as[j] + "\t");
           }
           System.out.println();
       }

        System.out.println("==========================");

       for (int[] as : arr) {
           for (int a : as) {
               System.out.print(a + "\t");
           }
           System.out.println();
       }
    }
}
