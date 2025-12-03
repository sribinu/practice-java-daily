package pattern.star;

import java.util.Scanner;

/**
 * ----------------------------------------------------------
 * Program No   : SPT7
 * Question     : Print a left-aligned triangle of '*' (triangle aligned to right).
 * Title        : LeftTriangle.java
 * Author       : Sribinu P
 * Created On   : 03-12-2025
 * Topic        : Pattern Program (Left Triangle)
 * Difficulty   : Easy
 * Description  : Prints a right-aligned right-angled triangle by adding spaces
 *                before stars in each row.
 * ----------------------------------------------------------
 */

public class LeftTriangle {

    public static void main(String[] args) {
        // Program SPT7: LeftTriangle
        // Print spaces first, then stars → shifts triangle to the right.
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter size N: ");
        int n = scan.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i + j > n) // i + j >= n + 1
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
        * * *
      * * * *
    * * * * *
 */