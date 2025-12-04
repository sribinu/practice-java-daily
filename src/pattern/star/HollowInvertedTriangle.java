package pattern.star;

import java.util.Scanner;

/**
 * ----------------------------------------------------------
 * Program No   : SPT19
 * Question     : Print a hollow inverted triangle of '*' with height N.
 * Title        : HollowInvertedTriangle.java
 * Author       : Sribinu P
 * Created On   : 04-12-2025
 * Topic        : Star Program (Hollow Inverted Triangle)
 * Difficulty   : Easy
 * Description  : Prints a hollow inverted centered triangle where only the border stars are printed and the inside remains hollow.
 * ----------------------------------------------------------
 */

public class HollowInvertedTriangle {

    public static void main(String[] args) {
        // Program SPT19: HollowInvertedTriangle
        // Prints a hollow inverted triangle by displaying stars only on the border (first/last row fully filled, others with stars only at edges).
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter size N: ");
        int n = scan.nextInt();

        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= (2 * i - 1); j++) {
                if (j == 1 || j == (2 * i - 1) || i == n)
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
    * * * * * * * * *
      *           *
        *       *
          *   *
            *
 */