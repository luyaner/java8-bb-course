package com.yaner.lu.array;

public class SelectionOrderedTest {
    public static void main(String[] args) {
        int[] array = new int[]{20,-3,65,0,85};
        printArray(array);
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i +1; j < array.length; j++) {
                if (array[i] < array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
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
