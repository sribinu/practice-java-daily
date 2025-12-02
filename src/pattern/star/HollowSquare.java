package pattern.star;

import java.util.Scanner;

/**
 * ----------------------------------------------------------
 * Program No   : SPT2
 * Question     : Print a hollow square of '*' of size N × N.
 * Title        : HollowSquare.java
 * Author       : Sribinu P
 * Created On   : 02-12-2025
 * Topic        : Pattern Program (Hollow Square)
 * Difficulty   : Easy
 * Description  : This program prints a hollow square pattern where only the border
 *                (first row, last row, first column, last column) contains '*'.
 * ----------------------------------------------------------
 */

public class HollowSquare {

    public static void main(String[] args) {
        // Program SPT2: HollowSquare
        // Workflow: Print '*' only for borders; spaces inside using nested loops.
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter N (size of square): ");
        int n = scan.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == n || j == 1 || j == n)
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
    Enter N (size of square): 5
    * * * * *
    *       *
    *       *
    *       *
    * * * * *
 */