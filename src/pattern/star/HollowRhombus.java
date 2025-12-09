package pattern.star;

import java.util.Scanner;

/**
 * ----------------------------------------------------------
 * Program No   : SPT37
 * Question     : Print a hollow rhombus (tilted square) using '*'.
 * Title        : HollowRhombus.java
 * Author       : Sribinu P
 * Created On   : 09-12-2025
 * Topic        : Star Pattern (Hollow Rhombus)
 * Difficulty   : Easy
 * Description  : Prints a slanted hollow square (rhombus) where each of N rows
 *                contains N stars, shifted right by decreasing leading spaces.
 * ----------------------------------------------------------
 */

public class HollowRhombus {

    public static void main(String[] args) {
        // Program SPT37: HollowRhombus
        // Formula: Print (N-i) spaces → then N columns where stars appear only on borders.
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter size N: ");
        int n = scan.nextInt();

        for (int i = 1; i <= n; i++) { // for (int i = n; i >= 1; i--) - For a left-shifted rhombus
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }
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
Enter size N: 5
        * * * * *
      *       *
    *       *
  *       *
* * * * *
 */