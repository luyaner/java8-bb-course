package com.yaner.lu.array;

public class ArrayPractice5 {
    public static void main(String[] args) {
        // new a [][]
        int[][] arr = new int[10][];

        // new int[] in [][]
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new int[i + 1];
        }

        for (int i = 0; i < arr.length; i++) {
            // set the 1st element of int[] as 1
            arr[i][0] = 1;
            // set the last element of int[] as 1
            arr[i][i] = 1;
            for (int j = 0; j < arr[i].length; j++) {
                if (i > 1 && j > 0 && j < i) {
                    arr[i][j] = arr[i-1][j] + arr[i-1][j-1];
                }
            }
        }

        // print [][]
        for (int[] as : arr) {
            for (int a : as) {
                System.out.print(a + "\t");
            }
            System.out.println();
        }
    }
}
