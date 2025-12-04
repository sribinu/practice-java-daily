package pattern.star;

import java.util.Scanner;

/**
 * ----------------------------------------------------------
 * Program No   : SPT17
 * Question     : Print an inverted centered pyramid of '*' with N rows.
 * Title        : InvertedPyramid.java
 * Author       : Sribinu P
 * Created On   : 04-12-2025
 * Topic        : Star Pattern (Inverted Pyramid)
 * Difficulty   : Easy
 * Description  : This program prints a centered inverted pyramid using leading spaces and stars for each row.
 * ----------------------------------------------------------
 */

public class InvertedPyramid {

    public static void main(String[] args) {
        // Program SPT17: InvertedPyramid
        // Prints decreasing stars with increasing leading spaces.
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter size N: ");
        int n = scan.nextInt();

        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= n - i; j++) {
                    System.out.print("  ");
            }
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        scan.close();
    }
}

/* Output:
    Enter size N: 5
    * * * * * * * * *
      * * * * * * *
        * * * * *
          * * *
            *
 */