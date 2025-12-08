package pattern.star;

import java.util.Scanner;

/**
 * ----------------------------------------------------------
 * Program No   : SPT35
 * Question     : Print a hollow hourglass pattern (only edges).
 * Title        : HollowHourglass.java
 * Author       : Sribinu P
 * Created On   : 08-12-2025
 * Topic        : Star Pattern (Hollow Hourglass)
 * Difficulty   : Medium
 * Description  : Prints a hollow hourglass pattern (only edges).
 * ----------------------------------------------------------
 */

public class HollowHourglass {

    public static void main(String[] args) {
        // Program SPT35: HollowHourglass
        // Hollow hourglass = decreasing width edges with increasing spaces, then reverse.
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter size N: ");
        int n = scan.nextInt();

        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i * 2 - 1; j++) {
                if (i == n || j == 1 || j == i * 2 - 1)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }

        for (int i = 2; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i * 2 - 1; j++) {
                if (i == n || j == 1 || j == i * 2 - 1)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
        scan.close();
    }
}

/* Logic:
    The real hourglass uses total width = 2N − 1, not i stars.
   Output:
    Enter size N: 5
    * * * * * * * * *
      *           *
        *       *
          *   *
            *
          *   *
        *       *
      *           *
    * * * * * * * * *
 */