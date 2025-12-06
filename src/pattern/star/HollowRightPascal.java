package pattern.star;

import java.util.Scanner;

/**
 * ----------------------------------------------------------
 * Program No   : SPT24
 * Question     : Print a hollow Right Pascal pattern (outline only).
 * Title        : HollowRightPascal.java
 * Author       : Sribinu P
 * Created On   : 06-12-2025
 * Topic        : Star Pattern (Hollow Right Pascal)
 * Difficulty   : Easy
 * Description  : This program prints a hollow Right Pascal (increase then decrease).
 * ----------------------------------------------------------
 */

public class HollowRightPascal {

    public static void main(String[] args) {
        // Program SPT24: HollowRightPascal
        // Logic: print borders for both upper and lower triangles.
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter size N: ");
        int n = scan.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if (j == 1 || j == i)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }

        for (int i = n - 1; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                if (j == 1 || j == i)
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
    * *
    *   *
    *     *
    *       *
    *     *
    *   *
    * *
    *
 */