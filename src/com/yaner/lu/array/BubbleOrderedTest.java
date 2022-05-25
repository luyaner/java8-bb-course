package com.yaner.lu.array;

public class BubbleOrderedTest {
    public static void main(String[] args) {
        int[] array = new int[]{34,-10,90,0,51};
        printArray(array);
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] < array[j + 1]) {
                    int temp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = temp;
                }
            }
        }
        printArray(array);
    }

    private static void printArray(int[] array) {
        for (int i : array) {
            System.out.print(i + "\t");
        }
        System.out.println();
    }
}
