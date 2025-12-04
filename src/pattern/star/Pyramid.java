package pattern.star;

import java.util.Scanner;

/**
 * ----------------------------------------------------------
 * Program No   : SPT16
 * Question     : Print a pyramid of '*' (centered) with N rows.
 * Title        : Pyramid.java
 * Author       : Sribinu P
 * Created On   : 04-12-2025
 * Topic        : Star Pattern (Pyramid)
 * Difficulty   : Easy
 * Description  : This program prints a centered pyramid using leading spaces and stars for each row.
 * ----------------------------------------------------------
 */

public class Pyramid {

    public static void main(String[] args) {
        // Program SPT16: Pyramid
        // Workflow: Print leading spaces then print stars for each row.
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter size N: ");
        int n = scan.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i + j > n) // i + j >= n + 1
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            for (int j = 2; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        scan.close();
    }
}

/* Output:
    Enter size N: 5
            *
          * * *
        * * * * *
      * * * * * * *
    * * * * * * * * *
 */