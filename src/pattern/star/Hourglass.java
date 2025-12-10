package pattern.star;

import java.util.Scanner;

/**
 * ----------------------------------------------------------
 * Program No   : SPT36
 * Question     : Print an hourglass (sandglass) pattern using '*' of height 2N.
 * Title        : Hourglass.java
 * Author       : Sribinu P
 * Created On   : 08-12-2025
 * Topic        : Star Pattern (Hourglass / Sandglass)
 * Difficulty   : Medium
 * Description  : Prints an hourglass (sandglass) pattern using '*' of height 2N.
 * ----------------------------------------------------------
 */

public class Hourglass {

    public static void main(String[] args) {
        // Program SPT36: Hourglass
        // Hourglass = Inverted Pyramid + Normal Pyramid (same N)
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter size N: ");
        int n = scan.nextInt();

        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        for (int i = 2; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        scan.close();
    }
}

/* Logic:
    The real hourglass uses total width = 2N − 1.
   Output:
    Enter size N: 5
    * * * * * * * * *
      * * * * * * *
        * * * * *
          * * *
            *
          * * *
        * * * * *
      * * * * * * *
    * * * * * * * * *
 */