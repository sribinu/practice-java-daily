package pattern.star;

import java.util.Scanner;

/**
 * ----------------------------------------------------------
 * Program No   : SPT32
 * Question     : Print a butterfly pattern made of '*' with wings expanding and contracting.
 * Title        : Butterfly.java
 * Author       : Sribinu P
 * Created On   : 07-12-2025
 * Topic        : Star Pattern (Butterfly)
 * Difficulty   : Medium
 * Description  : Prints a butterfly pattern
 * ----------------------------------------------------------
 */

public class Butterfly {

    public static void main(String[] args) {
        // Program SPT32: Butterfly
        // Left wing = increasing stars, Right wing = same, Middle gap = 2(N-i) spaces
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter size N: ");
        int n = scan.nextInt();

        // Upper wings
        for (int i = 1; i <= n; i++) {
            // Left wing stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            // Spaces between wings
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }

            // Right wing stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Lower wings
        for (int i = n - 1; i >= 1; i--) {
            // Left wing stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            // Spaces between wings
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }

            // Right wing stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

/* Output:
    Enter size N: 5
    *        *
    **      **
    ***    ***
    ****  ****
    **********
    ****  ****
    ***    ***
    **      **
    *        *
 */