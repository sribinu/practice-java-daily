package pattern.star;

import java.util.Scanner;

/**
 * ----------------------------------------------------------
 * Program No   : SPT25
 * Question     : Print a hollow Left Pascal pattern (outline only).
 * Title        : HollowLeftPascal.java
 * Author       : Sribinu P
 * Created On   : 06-12-2025
 * Topic        : Star Pattern (Hollow Left Pascal)
 * Difficulty   : Easy
 * Description  : Print the outline of a Left Pascal triangle using spaces + stars.
 * ----------------------------------------------------------
 */

public class HollowLeftPascal {

    public static void main(String[] args) {
        // Program SPT25: HollowLeftPascal
        // Logic: right-align rows; print borders only.
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter size N: ");
        int n = scan.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= n; j++) {
                if (j == 1 || j == i)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }

            System.out.println();
        }

        for (int i = n - 1; i >= 1; i--) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= n; j++) {
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