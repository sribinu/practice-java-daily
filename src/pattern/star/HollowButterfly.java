package pattern.star;

import java.util.Scanner;

/**
 * ----------------------------------------------------------
 * Program No   : SPT31
 * Question     : Print a hollow butterfly pattern (wing outlines only).
 * Title        : HollowButterfly.java
 * Author       : Sribinu P
 * Created On   : 07-12-2025
 * Topic        : Star Pattern (Hollow Butterfly)
 * Difficulty   : Medium
 * Description  : Prints a butterfly whose wings are outlines only.
 * ----------------------------------------------------------
 */

public class HollowButterfly {

    public static void main(String[] args) {
        // Program SPT31: HollowButterfly
        // For each row print left-wing outline, middle gap, right-wing outline. Mirror for lower half.
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter size N: ");
        int n = scan.nextInt();

        // Upper wings
        for (int i = 1; i <= n; i++) {
            // Left wing stars and spaces
            for (int j = 1; j <= n; j++) {
                if (j == i || j == 1)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }

            // Spaces between wings
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }

            // Right wing stars and spaces
            for (int j = 1; j <= n; j++) {
                if (j == i || j == 1)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }

        // Lower wings
        for (int i = n; i >= 1; i--) {
            // Left wing stars and spaces
            for (int j = 1; j <= n; j++) {
                if (j == i || j == 1)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }

            // Spaces between wings
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }

            // Right wing stars and spaces
            for (int j = 1; j <= n; j++) {
                if (j == i || j == 1)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
}

/* Output:
    Enter size N: 5
    *                 *
    * *             * *
    *   *         *   *
    *     *     *     *
    *       * *       *
    *       * *       *
    *     *     *     *
    *   *         *   *
    * *             * *
    *                 *
 */