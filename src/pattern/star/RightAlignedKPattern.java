package pattern.star;

import java.util.Scanner;

/**
 * ----------------------------------------------------------
 * Program No   : SPT27
 * Question     : Print a Right Aligned K Pattern
 * Title        : RightAlignedKPattern.java
 * Author       : Sribinu P
 * Created On   : 07-12-2025
 * Topic        : Star Pattern (Right Aligned K)
 * Difficulty   : Easy
 * Description  : Print a Right Aligned K pattern (Mirrored K)
 * ----------------------------------------------------------
 */

public class RightAlignedKPattern {

    public static void main(String[] args) {
        // Program SPT27: RightAlignedKPattern
        // Left Downward Triangle and Inverse of it
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter size N: ");
        int n = scan.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i <= j)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }

        for (int i = n - 1; i >= 1; i--) {
            for (int j = 1; j <= n; j++) {
                if (i <= j)
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
      * * * *
        * * *
          * *
            *
          * *
        * * *
      * * * *
    * * * * *
 */