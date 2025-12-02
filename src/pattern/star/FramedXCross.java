package pattern.star;

import java.util.Scanner;

/**
 * ----------------------------------------------------------
 * Program No   : SPT5
 * Question     : Print an "X" cross inside a border (frame) of '*' for size N.
 * Title        : FramedXCross.java
 * Author       : Sribinu P
 * Created On   : 02-12-2025
 * Topic        : Pattern Program (Framed X Cross)
 * Difficulty   : Easy
 * Description  : This program prints a square border of '*' and draws an X-cross
 *                inside it using the two diagonals.
 * ----------------------------------------------------------
 */

public class FramedXCross {

    public static void main(String[] args) {
        // Program SPT5: FramedXCross
        // Border → print '*' on edges; Inner X → print '*' on diagonals.
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter size N: ");
        int n = scan.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == n || j == 1 || j == n || i == j || i + j == n +1)
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
    Enter size N: 7
    * * * * * * *
    * *       * *
    *   *   *   *
    *     *     *
    *   *   *   *
    * *       * *
    * * * * * * *
 */