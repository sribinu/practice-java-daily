package pattern.star;

import java.util.Scanner;

/**
 * ----------------------------------------------------------
 * Program No   : SPT20
 * Question     : Print a filled diamond pattern using '*' with N rows (odd height).
 * Title        : Diamond.java
 * Author       : Sribinu P
 * Created On   : 05-12-2025
 * Topic        : Star Pattnrn (Diamond)
 * Difficulty   : Easy
 * Description  : A diamond is just an upright pyramid + inverted pyramid.
 * ----------------------------------------------------------
 */

public class Diamond {

    public static void main(String[] args) {
        // Program SPT20: Diamond
        // Diamond = upper pyramid + lower inverted pyramid.
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter size N: ");
        int n = scan.nextInt();
        int mid = (n / 2) + 1;

        for (int i = 1; i <= mid; i++) {
            for (int j = 1; j <= mid - i; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        for (int i = mid - 1; i >= 1; i--) {
            for (int j = 1; j <= mid - i; j++) {
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

/* Output:
    Enter size N: 10
              *
            * * *
          * * * * *
        * * * * * * *
      * * * * * * * * *
    * * * * * * * * * * *
      * * * * * * * * *
        * * * * * * *
          * * * * *
            * * *
              *
 */