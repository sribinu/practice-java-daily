package pattern.star;

import java.util.Scanner;

/**
 * ----------------------------------------------------------
 * Program No   : SPT28
 * Question     : Print a hollow Right Aligned K pattern.
 * Title        : HollowKPattern.java
 * Author       : Sribinu P
 * Created On   : 08-12-2025
 * Topic        : Star Pattern (Hollow K)
 * Difficulty   : Easy
 * Description  : Prints a hollow Right Aligned K pattern.
 * ----------------------------------------------------------
 */

public class HollowKPattern {

    public static void main(String[] args) {
        // Program : HollowKPattern

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter size N: ");
        int n = scan.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 0; j <= n; j++) {
                if ((i == 1 && j <= n - 1) || j == 0 || j == n - i)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }

        for (int i = n - 1; i >= 1; i--) {
            for (int j = 0; j <= n; j++) {
                if ((i == 1 && j <= n - 1) || j == 0 || j == n - i)
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
    * * * * *
    *     *
    *   *
    * *
    *
    * *
    *   *
    *     *
    * * * * *
 */