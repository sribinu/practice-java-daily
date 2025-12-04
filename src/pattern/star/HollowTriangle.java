package pattern.star;

import java.util.Scanner;

/**
 * ----------------------------------------------------------
 * Program No   : SPT18
 * Question     : Print a hollow triangle of '*' with height N.
 * Title        : HollowTriangle.java
 * Author       : Sribinu P
 * Created On   : 04-12-2025
 * Topic        : Star Pattern (Hollow Triangle / Hollow Pyramid)
 * Difficulty   : Easy
 * Description  : Prints a hollow centered triangle where only the border stars are printed and the inside remains hollow.
 * ----------------------------------------------------------
 */

public class HollowTriangle {

    public static void main(String[] args) {
        // Program SPT18: HollowTriangle
        // Row i has exactly 2*i - 1 positions → print * only at the first and last position (the two slanted borders), except the bottom row where all are *.
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter size N: ");
        int n = scan.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= (2 * i - 1); j++) {
                if (j == 1 || j == (2 * i - 1) || i == n)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }

        scan.close();
    }
}

/* Output:
    Enter size N: 5
            *
          *   *
        *       *
      *           *
    * * * * * * * * *
 */