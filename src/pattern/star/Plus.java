package pattern.star;

import java.util.Scanner;

/**
 * ----------------------------------------------------------
 * Program No   : SPT3
 * Question     : Print a plus (+) pattern using '*' of size N (odd N).
 * Title        : Plus.java
 * Author       : Sribinu P
 * Created On   : 02-12-2025
 * Topic        : Pattern Program (Plus)
 * Difficulty   : Easy
 * Description  : This program prints a plus (+) shaped pattern where the middle
 *                row and the middle column contain '*', using an odd-sized grid.
 * ----------------------------------------------------------
 */

public class Plus {

    public static void main(String[] args) {
        // Program SPT3: Plus
        // Logic: Print '*' when row == mid or col == mid; otherwise print space.
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter an odd number N: ");
        int n = scan.nextInt();
        int mid = n / 2 + 1;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == mid || j == mid)
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
        *
        *
    * * * * *
        *
        *
 */