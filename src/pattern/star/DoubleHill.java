package pattern.star;

import java.util.Scanner;

/**
 * ----------------------------------------------------------
 * Program No   : SPT28
 * Question     : Print a double hill pattern
 * Title        : DoubleHill.java
 * Author       : Sribinu P
 * Created On   : 07-12-2025
 * Topic        : Star Pattern (Double Hill / Double Pyramid)
 * Difficulty   : Easy
 * Description  : Prints a double hill pattern
 * ----------------------------------------------------------
 */

public class DoubleHill {

    public static void main(String[] args) {
        // Program SPT28: DoubleHill
        // Left hill → gap → right hill; gap = 2×(n − row), stars = row.
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter size N: ");
        int n = scan.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            for (int j = 1; j <= 2 * (n - i); j++) {
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
        *         *
       * *       * *
      * * *     * * *
     * * * *   * * * *
    * * * * * * * * * *
 */