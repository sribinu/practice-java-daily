package pattern.star;

import java.util.Scanner;

/**
 * ----------------------------------------------------------
 * Program No   : SPT26
 * Question     : Print a K pattern
 * Title        : KPattern.java
 * Author       : Sribinu P
 * Created On   : 07-12-2025
 * Topic        : Star Pattern (K)
 * Difficulty   : Easy
 * Description  : Print a K pattern
 * ----------------------------------------------------------
 */

public class KPattern {

    public static void main(String[] args) {
        // Program SPT26: KPattern
        // Left-aligned hourglass made by decreasing right triangle + increasing right triangle.
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter size N: ");
        int n = scan.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 0; j <= n - i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        for (int i = n - 1; i >= 1; i--) {
            for (int j = 0; j <= n - i; j++) {
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
    * * * *
    * * *
    * *
    *
    * *
    * * *
    * * * *
    * * * * *
 */