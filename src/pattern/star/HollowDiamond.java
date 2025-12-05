package pattern.star;

import java.util.Scanner;

/**
 * ----------------------------------------------------------
 * Program No   : SPT21
 * Question     : Print a hollow diamond of '*' (only borders).
 * Title        : HollowDiamond.java
 * Author       : Sribinu P
 * Created On   : 05-12-2025
 * Topic        : Star Pattern (Hollow Diamond)
 * Difficulty   : Easy
 * Description  : Hollow diamond = outer borders of upper hollow pyramid + lower hollow inverted pyramid.
 * ----------------------------------------------------------
 */

public class HollowDiamond {

    public static void main(String[] args) {
        // Program SPT21: HollowDiamond
        // Hollow upper pyramid + hollow inverted lower pyramid.
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter size N: ");
        int n = scan.nextInt();
        int mid = (n / 2) + 1;

        for (int i = 1; i <= mid; i++) {
            for (int j = 1; j <= mid - i; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                if (j == 1 || j == 2 * i - 1)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }

        for (int i = mid - 1; i >= 1; i--) {
            for (int j = 1; j <= mid - i; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                if (j == 1 || j == 2 * i - 1)
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
    Enter size N: 10
              *
            *   *
          *       *
        *           *
      *               *
    *                   *
      *               *
        *           *
          *       *
            *   *
              *
 */