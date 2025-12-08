package pattern.star;

import java.util.Scanner;

/**
 * ----------------------------------------------------------
 * Program No   : SPT29
 * Question     : Print a hollow Right Aligned K pattern.
 * Title        : HollowRightAlignedK.java
 * Author       : Sribinu P
 * Created On   : 08-12-2025
 * Topic        : Star Pattern (Hollow Right Aligned K)
 * Difficulty   : Easy
 * Description  : Prints a hollow Right Aligned K pattern.
 * ----------------------------------------------------------
 */

public class HollowRightAlignedK {

    public static void main(String[] args) {
        // Program SPT29: HollowRightAlignedK

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter size N: ");
        int n = scan.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == j || j == n)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }

        for (int i = n - 1; i >= 1; i--) {
            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == j || j == n)
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