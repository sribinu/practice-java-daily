package pattern.star;

import java.util.Scanner;

/**
 * ----------------------------------------------------------
 * Program No   : SPT33
 * Question     : Print a hollow inverted double hill pattern
 * Title        : HollowInvertedDoubleHIll.java
 * Author       : Sribinu P
 * Created On   : 09-12-2025
 * Topic        : Star Pattern (Hollow Double Hill)
 * Difficulty   : Easy
 * Description  : Prints a hollow inverted double hill pattern
 * ----------------------------------------------------------
 */

public class HollowInvertedDoubleHIll {

    public static void main(String[] args) {
        // Program SPT33: HollowInvertedDoubleHIll
        // Formula: spaces=(n-i), stars= (j == 1 || i == n || j == i), middle spaces=2*(n-i)
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter size N: ");
        int n = scan.nextInt();

        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                if (j == 1 || i == n || j == i)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                if (j == 1 || i == n || j == i)
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
    * * * * * * * * * *
     *     *   *     *
      *   *     *   *
       * *       * *
        *         *
 */