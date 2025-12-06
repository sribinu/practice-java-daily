package pattern.star;

import java.util.Scanner;

/**
 * ----------------------------------------------------------
 * Program No   : SPT23
 * Question     : Print a Left Pascal triangle (mirror of Right Pascal).
 * Title        : LeftPascal.java
 * Author       : Sribinu P
 * Created On   : 06-12-2025
 * Topic        : Star Pattern (Left Pascal)
 * Difficulty   : Easy
 * Description  : This program prints a left-aligned (but visually right-shifted) Pascal triangle by printing spaces before the stars.
 *                It first prints the ascending triangle and then the descending triangle.
 * ----------------------------------------------------------
 */

public class LeftPascal {

    public static void main(String[] args) {
        // Program SPT23: LeftPascal
        // Prints right-aligned stars in increasing then decreasing order
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter size N: ");
        int n = scan.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        for (int i = n - 1; i >= 1; i--) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
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
            *
          * *
        * * *
      * * * *
    * * * * *
      * * * *
        * * *
          * *
            *
 */