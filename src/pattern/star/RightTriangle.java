package pattern.star;

import java.util.Scanner;

/**
 * ----------------------------------------------------------
 * Program No   : SPT6
 * Question     : Print a right-angled triangle of '*' with height N (left aligned).
 * Title        : RightTriangle.java
 * Author       : Sribinu P
 * Created On   : 03-12-2025
 * Topic        : Pattern Program (Right Triangle)
 * Difficulty   : Easy
 * Description  : Prints a left-aligned right-angled triangle where each row
 *                contains increasing '*' from 1 to N.
 * ----------------------------------------------------------
 */

public class RightTriangle {

    public static void main(String[] args) {
        // Program SPT6: RightTriangle
        // For each row, print row number of stars.
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter size N: ");
        int n = scan.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
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