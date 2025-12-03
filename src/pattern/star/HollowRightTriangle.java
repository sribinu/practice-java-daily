package pattern.star;

import java.util.Scanner;

/**
 * ----------------------------------------------------------
 * Program No   : SPT10
 * Question     : Print a hollow right-angled triangle of '*' with height N.
 * Title        : HollowRightTriangle.java
 * Author       : Sribinu P
 * Created On   : 03-12-2025
 * Topic        : Pattern Program (Hollow Right Triangle)
 * Difficulty   : Easy
 * Description  : Prints a right-angled triangle where only the boundary stars are printed.
 * ----------------------------------------------------------
 */

public class HollowRightTriangle {

    public static void main(String[] args) {
        // Program SPT10: HollowRightTriangle
        // Print stars only on left edge, bottom edge, and hypotenuse to form hollow triangle.
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter size N: ");
        int n = scan.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if (i == n || j == 1 || i == j)
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