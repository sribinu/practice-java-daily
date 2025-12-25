package pattern.advanced;

import java.util.Scanner;

/**
 * ----------------------------------------------------------
 * Program No   : ADPT13
 * Question     : Print a left-aligned zigzag number triangle.
 * Title        : ZigzagNumberTriangle.java
 * Author       : Sribinu P
 * Created On   : 25-12-2025
 * Topic        : Advanced Pattern (Zigzag Number Triangle / Snake Number Triangle)
 * Difficulty   : Medium
 * Description  : Prints a continuous number triangle with alternating row direction (also called a Zigzag / Snake Number Triangle).
 * ----------------------------------------------------------
 */

public class ZigzagNumberTriangle {

    public static void main(String[] args) {
        // Program ADPT13: ZigzagNumberTriangle
        // Odd row → print num++; Even row → print from (num+i-1) backwards
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter size N: ");
        int n = scan.nextInt();

        int num = 1;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 1) {
                for (int j = 1; j <= i; j++) {
                    System.out.printf("%3s", num++ + " ");
                }
            } else {
                int temp = num + i - 1;
                for (int j = 1; j <= i; j++) {
                    System.out.printf("%3s", temp-- + " ");
                    num++;
                }
            }
            System.out.println();
        }
        scan.close();
    }
}

/* Output:
    Enter size N: 5
     1
     3  2
     4  5  6
    10  9  8  7
    11 12 13 14 15
 */