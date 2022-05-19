package com.yaner.lu.grammar.forloop;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NestedLoop {

    public static void main(String[] args) {
        // practice 1
            /*
    ----*
    ---* *
    --* * *
    -* * * *
    * * * * *
     */

        // a   b-  c*
        //0    4   1
        //1    3   2
        //2    2   3
        //3    1   4
        //4    0   5

        // b = 4 - a
        // c = a + 1
        // --------------------

    /*
    -* * * *
    --* * *
    ---* *
    ----*
     */

        // i    j" "   k*
        // 0    1   4
        // 1    2   3
        // 2    3   2
        // 3    4   1
        for (int a = 0; a < 5; a++) {
            for (int b = 0; b < 4 - a; b++) {
                System.out.print(" ");
            }
            for (int c = 0; c < a + 1; c++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        for (int i = 0; i < 4; i++){
            for (int j = 0; j < i + 1; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < 4 - i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // practice 2
        /*
        1 * 1 = 1
        1 * 2 = 2  2 * 2 = 4
        1 * 3 = 3  2 * 3 = 6  3 * 3 = 9
        ……
         */
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + "*" + i + "=" + i*j + "\t");
            }
            System.out.println();
        }

        // practice 3
        /*
        print the prime number within 1 to 100
         */
        List<Integer> list = new ArrayList<>();
        for (int i = 2; i <= 100; i++) {
            int count = 2;
            for (int j = 2; j <= i; j++) {
                if (i % j != 0) {
                    count++;
                    continue;
                }
            }
            if (count == i) {
                list.add(i);
            }
        }
        System.out.println(list);

        // practice 4
        /*
        break
        continue
        label
         */
        label: for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 100; j++) {
                if (j == 10) {
                    System.out.println("----------");
//                    continue;
                    break label;
                }
                System.out.println(j);
            }
        }

        // practice 5
        for (int i = 1; i <= 100; i++) {
            if (i % 13 == 0) {
                System.out.println(i);
                continue;
//                break;
            }
        }

        // practice 6
        Scanner scanner = new Scanner(System.in);
        int positiveCount = 0;
        int negativeCount = 0;
        for (;;) {
            System.out.print("Please enter an integer: ");
            int input = scanner.nextInt();
            if (input > 0) {
                positiveCount++;
            } else if (input < 0) {
                negativeCount++;
            } else if (input == 0) {
                break;
            }
        }
        System.out.println("Total positive number input is " + positiveCount + " .");
        System.out.println("Total negative number input is " + negativeCount + " .");
    }
}
