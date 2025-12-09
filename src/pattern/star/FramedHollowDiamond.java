package pattern.star;

import java.util.Scanner;

/**
 * ----------------------------------------------------------
 * Program No   : SPT40
 * Question     : Print a framed hollow diamond using '*'. (A rectangle with a hollow diamond inside it)
 * Title        : FramedHollowDiamond.java
 * Author       : Sribinu P
 * Created On   : 09-12-2025
 * Topic        :
 * Difficulty   : Medium
 * Description  :
 * ----------------------------------------------------------
 */

public class FramedHollowDiamond {

    public static void main(String[] args) {
        // Program SPT40: FramedHollowDiamond
        //
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter size N: ");
        int n = scan.nextInt();

        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                    System.out.print("* ");
            }
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            for (int j = 1; j <= 2 * (n - i); j++) {
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
    * * * * * * * * * *
    * * * *     * * * *
    * * *         * * *
    * *             * *
    *                 *
    *                 *
    * *             * *
    * * *         * * *
    * * * *     * * * *
    * * * * * * * * * *
 */