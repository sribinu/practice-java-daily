package pattern.star;

import java.util.Scanner;

/**
 * ----------------------------------------------------------
 * Program No   : SPT12
 * Question     : Print a hollow inverted right triangle of '*' with height N.
 * Title        : HollowRightDownwardTriangle.java
 * Author       : Sribinu P
 * Created On   : 03-12-2025
 * Topic        : Pattern Program (Hollow Right Downward Triangle)
 * Difficulty   : Easy
 * Description  : Prints a hollow inverted right-angled triangle by reducing stars row-by-row and keeping only boundary stars.
 * ----------------------------------------------------------
 */

public class HollowRightDownwardTriangle {

    public static void main(String[] args) {
        // Program SPT12: HollowRightDownwardTriangle
        // Print full top row → print boundary stars only → reduce row width each step.
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter size N: ");
        int n = scan.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == 1 || j == 1 || i + j == n + 1)
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
 */