package pattern.star;

import java.util.Scanner;

/**
 * ----------------------------------------------------------
 * Program No   : SPT9
 * Question     : Print a left-aligned inverted triangle of '*' (right aligned).
 * Title        : LeftDownwardTriangle.java
 * Author       : Sribinu P
 * Created On   : 03-12-2025
 * Topic        : Pattern Program (Left Downward Triangle)
 * Difficulty   : Easy
 * Description  : Prints an inverted triangle right-aligned by adding leading spaces.
 * ----------------------------------------------------------
 */

public class LeftDownwardTriangle {

    public static void main(String[] args) {
        // Program SPT9: LeftDownwardTriangle
        // Add spaces before stars and reduce stars each row to align the inverted triangle to the right.
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
 */