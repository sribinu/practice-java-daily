package pattern.star;

import java.util.Scanner;

/**
 * ----------------------------------------------------------
 * Program No   : SPT14
 * Question     : Print a centered triangle (isosceles) of '*' with height N.
 * Title        : CenteredTriangle.java
 * Author       : Sribinu P
 * Created On   : 04-12-2025
 * Topic        : Star Pattern (Centered Triangle)
 * Difficulty   : Easy
 * Description  : Prints a centered isosceles triangle of '*' using spaces to center each row.
 * ----------------------------------------------------------
 */

public class CenteredTriangle {

    public static void main(String[] args) {
        // Program SPT14: CenteredTriangle
        // Workflow: Print leading spaces then print stars for each row.
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter size N: ");
        int n = scan.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

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