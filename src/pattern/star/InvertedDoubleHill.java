package pattern.star;

import java.util.Scanner;

/**
 * ----------------------------------------------------------
 * Program No   : SPT38
 * Question     :
 * Title        : InvertedDoubleHill.java
 * Author       : Sribinu P
 * Created On   : 09-12-2025
 * Topic        : Star Pattern (Inverted Double HIll)
 * Difficulty   : Easy
 * Description  :
 * ----------------------------------------------------------
 */

public class InvertedDoubleHill {

    public static void main(String[] args) {
        // Program SPT38: InvertedDoubleHill
        // Formula: spaces=(n-i), stars=i, middle spaces=2*(n-i)
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter size N: ");
        int n = scan.nextInt();

        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            for (int j = 1; j <= 2 * (n - i); j++) {
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
* * * * * * * * * *
 * * * *   * * * *
  * * *     * * *
   * *       * *
    *         *
 */