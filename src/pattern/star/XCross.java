package pattern.star;

import java.util.Scanner;

/**
 * ----------------------------------------------------------
 * Program No   : SPT4
 * Question     : Print an "X" cross pattern using '*' for a given odd N.
 * Title        : XCross.java
 * Author       : Sribinu P
 * Created On   : 02-12-2025
 * Topic        : Pattern Program (X Cross)
 * Difficulty   : Easy
 * Description  : This program prints an 'X' pattern by placing '*' on the left
 *                and right diagonals of the grid.
 * ----------------------------------------------------------
 */

public class XCross {

    public static void main(String[] args) {
        // Program SPT4: XCross
        // Logic: Print '*' when row == col OR row + col == n + 1.
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter an odd number N: ");
        int n = scan.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == j || i + j == n + 1)
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
    Enter an odd number N: 5
    *       *
      *   *
        *
      *   *
    *       *
 */