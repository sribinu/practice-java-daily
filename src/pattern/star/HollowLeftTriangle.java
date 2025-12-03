package pattern.star;

import java.util.Scanner;

/**
 * ----------------------------------------------------------
 * Program No   : SPT11
 * Question     : Print a hollow left-aligned triangle of '*' (right aligned).
 * Title        : HollowLeftTriangle.java
 * Author       : Sribinu P
 * Created On   : 03-12-2025
 * Topic        : Pattern Program (Hollow Left Triangle)
 * Difficulty   : Easy
 * Description  : Prints a right-aligned hollow triangle using spaces and boundary stars.
 * ----------------------------------------------------------
 */

public class HollowLeftTriangle {

    public static void main(String[] args) {
        // Program SPT11: HollowLeftTriangle
        // Right-align the rows → print boundary stars only → hollow inside.
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter size N: ");
        int n = scan.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == n || j == n || i + j == n + 1)
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
    * * * * *
 */