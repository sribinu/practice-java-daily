package pattern.star;

import java.util.Scanner;

/**
 * ----------------------------------------------------------
 * Program No   : SPT13
 * Question     : Print a hollow inverted left triangle of '*' with height N.
 * Title        : HollowLeftDownwardTriangle.java
 * Author       : Sribinu P
 * Created On   : 03-12-2025
 * Topic        : Pattern Program (Hollow Left Downward Triangle)
 * Difficulty   : Easy
 * Description  : Print a hollow inverted left triangle of * (right aligned)
 * ----------------------------------------------------------
 */

public class HollowLeftDownwardTriangle {

    public static void main(String[] args) {
        // Program SPT13: HollowLeftDownwardTriangle
        // Prints an inverted right-aligned triangle where only the border is made of *.
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter size N: ");
        int n = scan.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == 1 || j == n || i == j)
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