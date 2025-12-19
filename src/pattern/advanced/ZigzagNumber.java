package pattern.advanced;

import java.util.Scanner;

/**
 * ----------------------------------------------------------
 * Program No   : ADPT3
 * Question     : Print numbers in zigzag across rows (snake pattern).
 * Title        : ZigzagNumber.java
 * Author       : Sribinu P
 * Created On   : 18-12-2025
 * Topic        : Advanced Pattern (Zigzag/Snake Number Pattern)
 * Difficulty   : Medium
 * Description  : This program prints numbers from 1 to N×N in a snake pattern, where odd rows are printed left-to-right and even rows are printed right-to-left.
 * ----------------------------------------------------------
 */

public class ZigzagNumber {

    public static void main(String[] args) {
        // Program ADPT3: ZigzagNumber
        // Odd rows → left to right, Even rows → right to left
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter size N: ");
        int n = scan.nextInt();

        int num = 1;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 1) {
                for (int j = 1; j <= n; j++) {
                    System.out.printf("%3s", num++ + " ");
                }
            } else {
                int temp = num + n - 1;
                for (int j = 1; j <= n; j++) {
                    System.out.printf("%3s", temp-- + " ");
                }
                num += n;
            }
            System.out.println();
        }
        scan.close();
    }
}

/* Output:
    Enter size N: 5
     1  2  3  4  5
    10  9  8  7  6
    11 12 13 14 15
    20 19 18 17 16
    21 22 23 24 25
 */