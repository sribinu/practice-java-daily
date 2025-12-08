package pattern.star;

import java.util.Scanner;

/**
 * ----------------------------------------------------------
 * Program No   : SPT31
 * Question     : Print a hollow double hill pattern
 * Title        : HollowDoubleHill.java
 * Author       : Sribinu P
 * Created On   : 07-12-2025
 * Topic        : Star Pattern (Hollow Double Hill)
 * Difficulty   : Easy
 * Description  : Prints a hollow double hill pattern
 * ----------------------------------------------------------
 */

public class HollowDoubleHill {

    public static void main(String[] args) {
        // Program SPT31: HollowDoubleHill
        // Left hill → gap → right hill; gap = 2×(n − row), stars = row.
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter size N: ");
        int n = scan.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++) {
                if (j == 1 || j == i || i == n)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }

            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++) {
                if (j == 1 || j == i || i == n)
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
        *         *
       * *       * *
      *   *     *   *
     *     *   *     *
    * * * * * * * * * *
 */