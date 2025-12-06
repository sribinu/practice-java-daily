package pattern.star;

import java.util.Scanner;

/**
 * ----------------------------------------------------------
 * Program No   : SPT22
 * Question     : Triangle Print a Right Pascal triangle pattern (ascending right triangle then descending).
 * Title        : RightPascal.java
 * Author       : Sribinu P
 * Created On   : 06-12-2025
 * Topic        : Star Pattern (Right Pascal)
 * Difficulty   : Easy
 * Description  : Print a star pattern where the first part is a normal right triangle (1 to N stars), followed by an inverted right triangle (N-1 to 1 stars).
 * ----------------------------------------------------------
 */

public class RightPascal {

    public static void main(String[] args) {
        // Program SPT22: RightPascal
        // First increasing triangle, then decreasing triangle.
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter size N: ");
        int n = scan.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        for (int i = n - 1; i >= 1; i--) {
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
    *
    * *
    * * *
    * * * *
    * * * * *
    * * * *
    * * *
    * *
    *
 */