package pattern.star;

import java.util.Scanner;

/**
 * ----------------------------------------------------------
 * Program No   : SPT15
 * Question     : Print a centered inverted triangle of '*' with height N.
 * Title        : InvertedCenteredTriangle.java
 * Author       : Sribinu P
 * Created On   : 04-12-2025
 * Topic        : Star Pattern (Centered Inverted Triangle)
 * Difficulty   : Easy
 * Description  : This program prints an inverted centered triangle (isosceles shape upside down) using *.
 *                The first row contains 2*N − 1 stars, and each next row reduces by 2 stars while increasing spaces.
 * ----------------------------------------------------------
 */

public class InvertedCenteredTriangle {

    public static void main(String[] args) {
        // Program SPT15: InvertedCenteredTriangle
        // Prints decreasing stars with increasing leading spaces.
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter size N: ");
        int n = scan.nextInt();

        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }

        scan.close();
    }
}

/* Output:
    Enter size N: 5
    * * * * *
     * * * *
      * * *
       * *
        *
 */