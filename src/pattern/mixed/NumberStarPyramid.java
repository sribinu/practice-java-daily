package pattern.mixed;

import java.util.Scanner;

/**
 * ----------------------------------------------------------
 * Program No   : MPT1
 * Question     : Print a pyramid where number and '*' alternate or mix in rows.
 * Title        : NumberStarPyramid.java
 * Author       : Sribinu P
 * Created On   : 18-12-2025
 * Topic        : Mixed Pattern (Number-Star Combined Pyramid)
 * Difficulty   : Easy
 * Description  : This program prints a centered pyramid pattern using nested loops.
 *                Odd-numbered rows display the row number, while even-numbered rows display *.
 * ----------------------------------------------------------
 */

public class NumberStarPyramid {

    public static void main(String[] args) {
        // Program MPT1: NumberStarPyramid
        // Odd rows → numbers | Even rows → stars
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter size N: ");
        int n = scan.nextInt();

        int num = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                if (i % 2 == 1)
                    System.out.print(num + " ");
                else
                    System.out.print("* ");
            }
            num++;
            System.out.println();
        }
        scan.close();
    }
}

/* Output:
    Enter size N: 5
        1
       * *
      3 3 3
     * * * *
    5 5 5 5 5
 */