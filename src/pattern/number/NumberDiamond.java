package pattern.number;

import java.util.Scanner;

/**
 * ----------------------------------------------------------
 * Program No   : NPT12
 * Question     : Print diamond shaped pattern using numbers (palindromic or sequential).
 * Title        : NumberDiamond.java
 * Author       : Sribinu P
 * Created On   : 12-12-2025
 * Topic        : Number Pattern (Number Diamond - Palindromic)
 * Difficulty   : Intermediate
 * Description  : Print a diamond using increasing & decreasing
 *                numbers to form palindromic rows.
 * ----------------------------------------------------------
 */

public class NumberDiamond {

    public static void main(String[] args) {
        // Program NPT12: NumberDiamond
        // Left: 1..i , Right: i-1..1
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter size N: ");
        int n = scan.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }

            for (int j = i - 1; j >= 1; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        for (int i = n - 1; i >= 1; i--) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }

            for (int j = i - 1; j >= 1; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        scan.close();
    }
}

/* Output:
    Enter size N: 5
            1
          1 2 1
        1 2 3 2 1
      1 2 3 4 3 2 1
    1 2 3 4 5 4 3 2 1
      1 2 3 4 3 2 1
        1 2 3 2 1
          1 2 1
            1
 */