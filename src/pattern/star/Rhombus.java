package pattern.star;

import java.util.Scanner;

/**
 * ----------------------------------------------------------
 * Program No   : SPT38
 * Question     : Print a filled rhombus pattern of '*' with width N.
 * Title        : Rhombus.java
 * Author       : Sribinu P
 * Created On   : 09-12-2025
 * Topic        : Star Pattern (Rhombus)
 * Difficulty   : Easy
 * Description  : Prints a slanted square (rhombus) where each of N rows
 *                contains N stars, shifted right by decreasing leading spaces.
 * ----------------------------------------------------------
 */

public class Rhombus {

    public static void main(String[] args) {
        // Program SPT38: Rhombus
        // Workflow: For each row print (N-i) leading spaces then N stars.
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter size N: ");
        int n = scan.nextInt();

        for (int i = 1; i <= n; i++) { // for (int i = n; i >= 1; i--) - For a left-shifted rhombus
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        scan.close();
    }
}

/* Output:
    Enter size N: 5
            * * * * *
          * * * * *
        * * * * *
      * * * * *
    * * * * *
 */